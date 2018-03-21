/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.vcs.client.impl;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.resource.ResourceSet;

import com.google.inject.Inject;

import de.ubt.ai1.supermod.mm.client.ConflictSet;
import de.ubt.ai1.supermod.mm.client.LocalRepository;
import de.ubt.ai1.supermod.mm.client.ProductSpaceExportTrace;
import de.ubt.ai1.supermod.mm.client.Severity;
import de.ubt.ai1.supermod.mm.client.SingleVersionProductSpaceDescriptor;
import de.ubt.ai1.supermod.mm.core.OptionBinding;
import de.ubt.ai1.supermod.mm.core.ProductSpace;
import de.ubt.ai1.supermod.mm.file.client.SingleVersionFileSystemDescriptor;
import de.ubt.ai1.supermod.service.IProductSpaceFilterService;
import de.ubt.ai1.supermod.service.client.ICompositeChoiceSpecificationService;
import de.ubt.ai1.supermod.service.client.IProductSpaceExportService;
import de.ubt.ai1.supermod.service.client.IProductSpaceValidationService;
import de.ubt.ai1.supermod.service.client.ISingleVersionProductSpaceDescriptorInitializationService;
import de.ubt.ai1.supermod.service.client.IWorkspaceConflictMarker;
import de.ubt.ai1.supermod.service.client.exceptions.SuperModClientWrappedException;
import de.ubt.ai1.supermod.service.exceptions.SuperModException;
import de.ubt.ai1.supermod.service.file.client.ISingleVersionFileSystemDescriptorProvider;
import de.ubt.ai1.supermod.vcs.client.IExportService;

/**
 * Default implementation of the export service.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	13.06.2016
 */
public class ExportService implements IExportService {
	
	@Inject
	private ICompositeChoiceSpecificationService 
	compositeChoiceSpecificationService;
	
	@Inject
	private ISingleVersionProductSpaceDescriptorInitializationService
	psDescInitService;
	
	@Inject
	private IProductSpaceFilterService filterService;
	
	@Inject
	private IProductSpaceValidationService validationService;
	
	@Inject
	private IProductSpaceExportService exportService;
	
	@Inject
	private IWorkspaceConflictMarker workspaceConflictMarker;
	
	@Inject
	private ISingleVersionFileSystemDescriptorProvider svfsProvider;

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.vcs.client.IExportService
	 * #canExport(de.ubt.ai1.supermod.mm.client.LocalRepository)
	 */
	@Override
	public boolean canExport(LocalRepository repo) {
		return repo != null;
	}

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.vcs.client.IExportService
	 * #export(de.ubt.ai1.supermod.mm.client.LocalRepository,
	 * org.eclipse.emf.ecore.resource.ResourceSet)
	 */
	@Override
	public boolean export(LocalRepository repo, ResourceSet rs,
			IProgressMonitor monitor) throws SuperModException {
		
		// obtain a choice from the user
		OptionBinding choice = compositeChoiceSpecificationService
				.specifyCompositeChoice(repo.getVersionSpace(),
						repo.getLocalChoice(), null);
		choice = repo.getVersionSpace().applyAllCompletions(choice);

		// fetch metadata for the contents to be exported
		SingleVersionFileSystemDescriptor oldSvfs =
				svfsProvider.getSingleVersionFileSystemDescriptor(
						repo.getLocalDescriptor());
		String oldProjectName = oldSvfs.getRootUri().replace("/", "");
		
		// ask the user and create project
		String projectName;
		try {
			projectName = ServiceUtil.createProject(oldProjectName, monitor);
		}		
		catch (Exception e) {
			throw new SuperModClientWrappedException(e);
		} 
		
		// create a modified metadata descriptor that matches the exported project's name
		SingleVersionProductSpaceDescriptor psDescriptor = 
				psDescInitService.initializeSingleVersionProductSpaceDescriptor(
						projectName, rs, false);
		SingleVersionFileSystemDescriptor svfs =
				svfsProvider.getSingleVersionFileSystemDescriptor(psDescriptor);
		svfs.setRootUri("/" + projectName);
		
		// filter the product space
		ProductSpace filteredPs = filterService.filter(
				repo.getProductSpace(),	choice);
		
		// detect conflicts
		ConflictSet conflicts = validationService.validate(filteredPs);
		
		// export and mark conflicts, if any
		ProductSpaceExportTrace exportTrace =
				exportService.export(filteredPs, psDescriptor);
		if (conflicts.getSeverity().getValue() > Severity.INFO.getValue()) {
			workspaceConflictMarker.markConflicts(projectName, 
					conflicts, exportTrace);
		}
		
		return true;
	}


	
	

}
