/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.vcs.client.impl;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

import com.google.inject.Inject;

import de.ubt.ai1.supermod.mm.client.ConflictSet;
import de.ubt.ai1.supermod.mm.client.LocalRepository;
import de.ubt.ai1.supermod.mm.client.ProductSpaceExportTrace;
import de.ubt.ai1.supermod.mm.client.Severity;
import de.ubt.ai1.supermod.mm.core.OptionBinding;
import de.ubt.ai1.supermod.mm.core.ProductSpace;
import de.ubt.ai1.supermod.service.IProductSpaceFilterService;
import de.ubt.ai1.supermod.service.IVersionSpaceReconciliationService;
import de.ubt.ai1.supermod.service.client.ICompositeChoiceUpdatingService;
import de.ubt.ai1.supermod.service.client.IProductConflictReporter;
import de.ubt.ai1.supermod.service.client.IProductSpaceExportPostProcessor;
import de.ubt.ai1.supermod.service.client.IProductSpaceExportService;
import de.ubt.ai1.supermod.service.client.IProductSpaceValidationService;
import de.ubt.ai1.supermod.service.client.IWorkspaceConflictMarker;
import de.ubt.ai1.supermod.service.exceptions.SuperModException;
import de.ubt.ai1.supermod.service.file.client.ISingleVersionFileSystemDescriptorProvider;
import de.ubt.ai1.supermod.vcs.client.ICommitEnforcementService;

/**
 * Abstract base class for the implementation of the services for the "Update"
 * and "Switch" commands.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	06.05.2015
 */
public abstract class AbstractCheckOutService {
	
	public static final String MAIN_PS = "main";
	
	@Inject
	private ICommitEnforcementService commitEnforcementService;
	
	@Inject
	private IVersionSpaceReconciliationService 
	versionSpaceReconciliationService;
	
	@Inject
	private ICompositeChoiceUpdatingService compositeChoiceUpdatingService;
	
	@Inject
	private IProductSpaceFilterService filterService;
	
	@Inject
	private IProductSpaceValidationService validationService;
	
	@Inject
	private IProductConflictReporter conflictReporter;
	
	@Inject
	private IProductSpaceExportService exportService;
	
	@Inject
	private IWorkspaceConflictMarker workspaceConflictMarker;
	
	@Inject
	private IProductSpaceExportPostProcessor exportPostProcessor;
	
	@Inject
	private ISingleVersionFileSystemDescriptorProvider svfsProvider;
	
	/**
	 * Replaces workspace contents by a version which is specified as a filter
	 * on a given local repository
	 *
	 * @param repo the repository whose product space to filter
	 * @param choice the version to filter with
	 * @param rs the resource set where all resources are managed
	 * @throws SuperModException in case an error occurs during check-out.
	 */
	protected void checkOut(LocalRepository repo, OptionBinding choice, 
			ResourceSet rs) throws SuperModException {
		
		// enforce commit in case changes are pending.
		if (commitEnforcementService.isCommitNecessary(repo)) {
			if (commitEnforcementService.proposeCommit()) {
				commitEnforcementService.enforceCommit(repo, rs);
				choice = compositeChoiceUpdatingService.updateCompositeChoice(
						repo.getVersionSpace(), choice);
			}
		}
		
		// filter by the option binding, which is saved as the new local choice.
		Resource localChoiceRes = repo.getLocalChoice().eResource();
		localChoiceRes.getContents().clear();
		localChoiceRes.getContents().add(choice);
		repo.setLocalChoice(choice);
		OptionBinding completeChoice = repo.getVersionSpace()
				.applyAllCompletions(choice);
		
		// reconcile the version space.
		versionSpaceReconciliationService.reconcileVersionSpace(
				repo.getVersionSpace());
		
		// calculate imported and filtered product spaces
		ProductSpace oldPs = repo.getProductSpace();
		ProductSpace newPs = filterService.filter(oldPs, completeChoice);
		
		// detect conflicts
		ConflictSet conflicts = validationService.validate(newPs);
		Severity severity = conflicts.getSeverity();
		if (severity.getValue() > Severity.INFO.getValue()) {
			if (!conflictReporter.report(conflicts)) {
				return;
			}
		}
		
		// export
		ProductSpaceExportTrace exportTrace =
				exportService.export(newPs, repo.getLocalDescriptor());
		
		// general post-processing
		exportPostProcessor.postProcess(repo, rs, oldPs, newPs, MAIN_PS);		
		
		// mark conflicts, if any
		String projectName = svfsProvider.getSingleVersionFileSystemDescriptor(
				repo.getLocalDescriptor()).getRootUri().replace("/", "");
		workspaceConflictMarker.removeAllConflictMarkers(projectName);
		if (severity.getValue() > Severity.INFO.getValue()) {
			workspaceConflictMarker.markConflicts(projectName,
					conflicts, exportTrace);
		}
	}

}
