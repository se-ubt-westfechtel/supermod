/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.vcs.client.impl;

import org.eclipse.emf.ecore.resource.Resource;

import com.google.inject.Inject;

import de.ubt.ai1.supermod.mm.client.LocalRepository;
import de.ubt.ai1.supermod.mm.file.client.SingleVersionFileSystemDescriptor;
import de.ubt.ai1.supermod.service.IProductSpaceDiffService;
import de.ubt.ai1.supermod.service.IProductSpaceFilterService;
import de.ubt.ai1.supermod.service.IProductSpaceMatchService;
import de.ubt.ai1.supermod.service.IProductSpaceMergeService;
import de.ubt.ai1.supermod.service.IProductSpaceProxyResolutionService;
import de.ubt.ai1.supermod.service.IVersionSpaceReconciliationService;
import de.ubt.ai1.supermod.service.IVisibilityUpdateService;
import de.ubt.ai1.supermod.service.client.IAmbitionReservationService;
import de.ubt.ai1.supermod.service.client.ICompositeChoiceMigrationService;
import de.ubt.ai1.supermod.service.client.IProductSpaceImportPostProcessor;
import de.ubt.ai1.supermod.service.client.IProductSpaceImportService;
import de.ubt.ai1.supermod.service.client.IWorkspaceConflictMarker;
import de.ubt.ai1.supermod.service.client.IWriteSetAssignmentService;
import de.ubt.ai1.supermod.service.client.IWriteSetPostProcessor;
import de.ubt.ai1.supermod.service.file.client.ISingleVersionFileSystemDescriptorProvider;
import de.ubt.ai1.supermod.vcs.client.IAddProposalService;
import de.ubt.ai1.supermod.vcs.client.ICommitService;
import de.ubt.ai1.supermod.vcs.client.IStateService;
import de.ubt.ai1.supermod.vcs.client.IStateService.State;
import de.ubt.ai1.supermod.vcs.client.IUpdateEnforcementService;

/**
 * Abstract base class for different implementations of the commit service.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	16.09.2015
 */
public abstract class AbstractCommitService implements ICommitService {
	
	public static final String OLD_ROLE = "OLD";
	public static final String NEW_ROLE = "NEW";
	
	@Inject
	protected ISingleVersionFileSystemDescriptorProvider svsProvider;
	
	@Inject
	protected IStateService stateService;
	
	@Inject
	protected IUpdateEnforcementService updateEnforcementService;

	@Inject
	protected IAddProposalService addProposalService;
	
	@Inject
	protected IVersionSpaceReconciliationService 
	versionSpaceReconciliationService;
	
	@Inject
	protected IProductSpaceImportService importService;
	
	@Inject
	protected IProductSpaceMatchService matchService;
	
	@Inject
	protected IProductSpaceMergeService mergeService;
	
	@Inject
	protected IProductSpaceFilterService filterService;
	
	@Inject
	protected IProductSpaceDiffService diffService;
	
	@Inject
	protected IWriteSetAssignmentService writeSetAssignmentService;
	
	@Inject
	protected IVisibilityUpdateService visibilityUpdateService;
	
	@Inject
	protected IWriteSetPostProcessor writeSetPostProcessor;
	
	@Inject
	protected IProductSpaceImportPostProcessor importPostProcessor;
	
	@Inject
	protected IProductSpaceProxyResolutionService proxyResolver;
	
	@Inject
	protected IAmbitionReservationService ambitionReservationService;
	
	@Inject
	protected ICompositeChoiceMigrationService choiceMigrationService;
	
	@Inject
	protected IWorkspaceConflictMarker workspaceConflictMarker;
	
	@Inject
	protected ISingleVersionFileSystemDescriptorProvider svfsProvider;

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.vcs.ICommitService
	 * #canCommit(de.ubt.ai1.supermod.mm.client.LocalRepository)
	 */
	@Override
	public boolean canCommit(LocalRepository repo, boolean propose) {
		try {
			SingleVersionFileSystemDescriptor svfs =
					svsProvider.getSingleVersionFileSystemDescriptor(
							repo.getLocalDescriptor());
			if (propose) {
				if (!addProposalService.propose(repo)) {
					propose = false;
				}
			}
			State state = stateService.getState(repo, svfs.getRootUri());
			boolean modified = repo.getLocalDescriptor().isModified() ||
					(state == State.CHANGED || state == State.CONFLICTING);
			if (propose && modified) {
				for (Resource r : repo.eResource().getResourceSet()
						.getResources()) {
					r.save(null);
				}
			}
			return modified;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

}
