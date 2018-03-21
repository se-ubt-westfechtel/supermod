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

import de.ubt.ai1.supermod.mm.client.LocalRepository;
import de.ubt.ai1.supermod.mm.core.OptionBinding;
import de.ubt.ai1.supermod.service.client.ICompositeChoiceUpdatingService;
import de.ubt.ai1.supermod.service.exceptions.SuperModException;
import de.ubt.ai1.supermod.vcs.client.IUpdateService;

/**
 * Default implementation of the VCS service "Update". It proceeds as follows:
 * <ol>
 *  <li>Update the local choice by replacing its temporal component with the
 *  	latest available revision.</li>
 *  <li>Import the workspace content.</li>
 *  <li>Filter the current repository product space content by the new local
 *  	choice, which has been updated.</li>
 *  <li>Merge the imported and the filtered product space.</li>
 *  <li>Filter the merged product space, in order to calculate the new product
 *  	space to be exported.</li>
 *  <li>Check for product space conflicts. If there are any, the stashing area
 *  	is filled with the conflicting product space and the detected conflicts.
 *  	Otherwise, the new filtered product space is exported directly.</li>
 * </ol>
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	04.08.2014
 */
public class UpdateService extends AbstractCheckOutService
implements IUpdateService {	

	@Inject
	private ICompositeChoiceUpdatingService compositeChoiceUpdatingService;	
	
	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.vcs.IUpdateService#canUpdate(
	 * de.ubt.ai1.supermod.mm.client.LocalRepository)
	 */
	@Override
	public boolean canUpdate(LocalRepository repo) {
		return repo != null && repo.getLocalChoice() != null;
	}

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.vcs.IUpdateService#update(
	 * de.ubt.ai1.supermod.mm.client.LocalRepository, 
	 * org.eclipse.emf.ecore.resource.ResourceSet)
	 */
	@Override
	public void update(LocalRepository repo, ResourceSet rs) 
			throws SuperModException {
		// calculate an updated choice
		OptionBinding choice = compositeChoiceUpdatingService
				.updateCompositeChoice(
				repo.getVersionSpace(), repo.getLocalChoice());
		if (choice != null) {
			update(repo, rs, choice);		
		}
	}

	@Override
	public void update(LocalRepository repo, ResourceSet rs,
			OptionBinding choice) throws SuperModException {
		checkOut(repo, choice, rs);
		OptionBinding oldLc = repo.getLocalChoice();
		OptionBinding newLc = compositeChoiceUpdatingService
				.updateCompositeChoice(repo.getVersionSpace(), oldLc);
		if (newLc != null) {
			Resource lcResource = oldLc.eResource();
			lcResource.getContents().clear();
			lcResource.getContents().add(newLc);
			repo.setLocalChoice(newLc);
		}
	}

}
