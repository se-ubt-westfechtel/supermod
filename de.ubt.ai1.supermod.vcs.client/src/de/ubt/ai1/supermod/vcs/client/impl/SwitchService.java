/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.vcs.client.impl;

import org.eclipse.emf.ecore.resource.ResourceSet;

import com.google.inject.Inject;

import de.ubt.ai1.supermod.mm.client.LocalRepository;
import de.ubt.ai1.supermod.mm.core.OptionBinding;
import de.ubt.ai1.supermod.service.client.ICompositeChoiceSpecificationService;
import de.ubt.ai1.supermod.service.exceptions.SuperModException;
import de.ubt.ai1.supermod.vcs.client.ISwitchService;

/**
 * Default implementation of the VCS service "Switch". First, it checks whether
 * there are pending changes in the workspace and proposes a commit in case.
 * Next, it filters the repository product space by a user-specified option 
 * binding and exports the result in order to replace workspace contents. In
 * case the export operation fails due to product space conflicts, the stashing
 * area is filled with the conflicting product space and the detected conflicts.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	04.08.2014
 */
public class SwitchService extends AbstractCheckOutService
implements ISwitchService {
	
	@Inject
	private ICompositeChoiceSpecificationService 
	compositeChoiceSpecificationService;

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.vcs.ISwitchService#canSwitch(
	 * de.ubt.ai1.supermod.mm.client.LocalRepository)
	 */
	@Override
	public boolean canSwitch(LocalRepository repo) {
		return repo != null && repo.getLocalChoice() != null;
	}

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.vcs.ISwitchService#doSwitch(
	 * de.ubt.ai1.supermod.mm.client.LocalRepository, 
	 * org.eclipse.emf.ecore.resource.ResourceSet)
	 */
	@Override
	public boolean doSwitch(LocalRepository repo, ResourceSet rs) 
			throws SuperModException {
		// let the user specify a choice.
		OptionBinding choice = compositeChoiceSpecificationService
				.specifyCompositeChoice(repo.getVersionSpace(), 
						repo.getLocalChoice(),
						repo.getLocalAmbition());
		if (choice != null) {
			checkOut(repo, choice, rs);
			return true;
		}
		return false;
	}

}
