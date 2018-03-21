/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.vcs.client.impl;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

import de.ubt.ai1.supermod.mm.client.LocalRepository;
import de.ubt.ai1.supermod.mm.core.OptionBinding;
import de.ubt.ai1.supermod.mm.core.ProductSpace;
import de.ubt.ai1.supermod.mm.diff.MatchingRole;
import de.ubt.ai1.supermod.mm.diff.ProductSpaceDelta;
import de.ubt.ai1.supermod.mm.diff.ProductSpaceMatching;
import de.ubt.ai1.supermod.mm.diff.SuperModDiffFactory;
import de.ubt.ai1.supermod.mm.diff.WriteSet;
import de.ubt.ai1.supermod.service.exceptions.SuperModException;
import de.ubt.ai1.supermod.vcs.client.ICommitService;

/**
 * Default implementation of the "Commit" VCS service, using an in-place merge
 * procedure to integrate changes into the product space. An in-place commit in
 * SuperMod comprises the following steps:
 * <ol>
 * 	<li>If necessary, new resources are proposed to be added.</li>
 * 	<li>If necessary, an update is enforced.</li>
 *  <li>The current workspace content is imported to its SuperMod internal
 *  	representation as the new product space.</li>
 *  <li>The old workspace content is reconstructed by the cached choice.</li>
 *  <li>The current product space (master) is merged in-place with the new
 *  	repository product space.</li>
 *  <li>Insertions and deletions of elements are derived using a matching
 *  	between the old and new product space. A corresponding delta is 
 *  	created.</li>
 *  <li>The delta is divided up into several, product dimension specific write
 *  	sets. For each write set, the user may specify a separate ambition.</li>
 *  <li>The write sets are applied to the master product space, resulting in
 *  	modified visibilities for inserted/deleted elements.</li>
 *  <li>If necessary, an import post processor is applied.</li>
 *  <li>The reserved ambition is cleared.</li>
 *  <li>The local choice is migrated in order to be consistent with all
 *  	specified ambitions.</li>
 * </ol>
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	05.03.2015
 */
public class InPlaceCommitService
extends AbstractCommitService
implements ICommitService {
	
	public static final String MASTER_ROLE = "MASTER";
	
	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.vcs.ICommitService#commit(
	 * de.ubt.ai1.supermod.mm.client.LocalRepository, 
	 * org.eclipse.emf.ecore.resource.ResourceSet)
	 */
	@Override
	public boolean commit(LocalRepository repo, ResourceSet rs) 
			throws SuperModException {
				
		ProductSpace masterPs = repo.getProductSpace();
		
		// reconcile the version space.
		versionSpaceReconciliationService.reconcileVersionSpace(
				repo.getVersionSpace());

		// import the local workspace contents as the new product space.
		ProductSpace newPs = importService.doImport(repo.getLocalDescriptor());
		
		// reconstruct the old product space using the cached choice.
		OptionBinding oldLc = repo.getLocalChoice();
		OptionBinding completeLc = repo.getVersionSpace()
				.applyAllCompletions(oldLc);
		ProductSpace oldPs = filterService.filter(masterPs, completeLc);
		
		// create required matching roles.
		Collection<MatchingRole> mergeRoles = new ArrayList<>();
		MatchingRole masterRole = SuperModDiffFactory.eINSTANCE
				.createMatchingRole();
		masterRole.setMatchedProductSpace(masterPs);
		masterRole.setRoleName(MASTER_ROLE);
		mergeRoles.add(masterRole);
		MatchingRole oldRole = SuperModDiffFactory.eINSTANCE
				.createMatchingRole();
		oldRole.setMatchedProductSpace(oldPs);
		oldRole.setRoleName(OLD_ROLE);
		mergeRoles.add(oldRole);
		MatchingRole newRole = SuperModDiffFactory.eINSTANCE
				.createMatchingRole();
		newRole.setMatchedProductSpace(newPs);
		newRole.setRoleName(NEW_ROLE);
		mergeRoles.add(newRole);
		
		// match and merge the old and the new product space.
		ProductSpaceMatching matching = matchService.match(mergeRoles);	
		mergeService.mergeInPlace(matching, 
				masterRole,	repo.getVisibilityForest());
		
		// detect modifications.
		ProductSpaceDelta delta = diffService.diff(matching, masterRole, 
				oldRole, newRole);
		
		// assign write sets.
		Collection<WriteSet> writeSets = writeSetAssignmentService
				.assignWriteSets(delta, repo, oldLc);
		if (writeSets == null || writeSets.isEmpty()) {
			return false;
		}
		ArrayList<OptionBinding> ambitions = new ArrayList<>();
		for (WriteSet writeSet : writeSets) {
			visibilityUpdateService.updateVisibilities(writeSet, 
					repo.getVisibilityForest(), repo.getWriteTransactionId());
			writeSetPostProcessor.postProcess(repo, writeSet);
			ambitions.add(writeSet.getAmbition());
		}
		
		// post-processing.
		importPostProcessor.postProcess(repo, rs, oldPs, masterPs);	
		proxyResolver.resolveProxies(masterPs);
		
		// migrate the choice.
		OptionBinding migratedChoice = choiceMigrationService
				.migrateCompositeChoice(repo.getVersionSpace(),	oldLc, 
						ambitions);
		if (migratedChoice != null) {
			Resource lcResource = oldLc.eResource();
			lcResource.getContents().clear();
			lcResource.getContents().add(migratedChoice);
			repo.setLocalChoice(migratedChoice);
		}
		else {
			return false;
		}
		ambitionReservationService.cancelAmbitionReservation(repo);
		
		// remove conflict markers, assuming all conflicts have been resolved.
		String projectName = svfsProvider.getSingleVersionFileSystemDescriptor(
				repo.getLocalDescriptor()).getRootUri().replace("/", "");
		workspaceConflictMarker.removeAllConflictMarkers(projectName);
		
		repo.getLocalDescriptor().setModified(false);
		repo.setLocallyModified(true);
		return true;
	}

}
