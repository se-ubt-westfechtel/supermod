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
 * Default implementation of the "Commit" VCS service, using an out-place merge
 * procedure to create a new product space where all changes are integrated. An
 * out-place commit in SuperMod comprises the following steps:
 * <ol>
 * 	<li>If necessary, new resources are proposed to be added.</li>
 * 	<li>If necessary, an update is enforced.</li>
 *  <li>The current workspace content is imported to its SuperMod internal
 *  	representation.</li>
 *  <li>The imported product space is merged out place with the current
 *  	repository product space.</li>
 *  <li>Insertions and deletions of elements are derived using a matching
 *  	between the imported product space, and a corresponding old version
 *  	which is derived by applying the local option binding as a filter to
 *  	the repository product space. A corresponding delta is created.</li>
 *  <li>The delta is divided up into several, product dimension specific write
 *  	sets. For each write set, the user may specify a separate ambition.</li>
 *  <li>The write sets are applied to the merged product space, resulting in
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
 * @date	01.08.2014
 */
public class OutPlaceCommitService 
extends AbstractCommitService
implements ICommitService {
	
	public static final String MERGED_ROLE = "MERGED";
	public static final String FILTERED_ROLE = "FILTERED";
	
	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.vcs.ICommitService#commit(
	 * de.ubt.ai1.supermod.mm.client.LocalRepository, 
	 * org.eclipse.emf.ecore.resource.ResourceSet)
	 */
	@Override
	public boolean commit(LocalRepository repo, ResourceSet rs) 
			throws SuperModException {
				
		ProductSpace oldPs = repo.getProductSpace();
		OptionBinding oldLc = repo.getLocalChoice();
		OptionBinding completeLc = repo.getVersionSpace()
				.applyAllCompletions(oldLc);
		
		// reconcile the version space.
		versionSpaceReconciliationService.reconcileVersionSpace(
				repo.getVersionSpace());

		// import the local workspace contents.
		ProductSpace newPs = importService.doImport(repo.getLocalDescriptor());
		
		// match and merge the imported and the filtered product space.
		Collection<MatchingRole> mergeRoles = new ArrayList<>();
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
		
		ProductSpaceMatching mergeMatching = matchService.match(mergeRoles);
		
		MatchingRole mergedRole = SuperModDiffFactory.eINSTANCE
				.createMatchingRole();
		mergedRole.setRoleName(MERGED_ROLE);
		mergeMatching.getMatchingRoles().add(mergedRole);
		
		ProductSpace mergedPs = mergeService.mergeOutPlace(mergeMatching, mergedRole,
				repo.getVisibilityForest());
		mergedRole.setMatchedProductSpace(mergedPs);
		
		ProductSpace filteredPs = filterService.filter(oldPs, completeLc);

		// a new matching is required to detect modifications
		Collection<MatchingRole> visRoles = new ArrayList<>();
		MatchingRole filteredRole = SuperModDiffFactory.eINSTANCE
				.createMatchingRole();
		filteredRole.setMatchedProductSpace(filteredPs);
		filteredRole.setRoleName(FILTERED_ROLE);
		visRoles.add(filteredRole);
		visRoles.add(newRole);
		visRoles.add(mergedRole);
		
		ProductSpaceMatching visMatching = matchService.match(visRoles);		
		ProductSpaceDelta delta = diffService.diff(visMatching, mergedRole, 
				filteredRole, newRole);
		
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
		importPostProcessor.postProcess(repo, rs, oldPs, mergedPs);
		proxyResolver.resolveProxies(mergedPs);
		
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
		
		// set the new product space.
		repo.setProductSpace(mergedPs);
		repo.getLocalDescriptor().setModified(false);
		repo.setLocallyModified(true);
		return true;
	}

}
