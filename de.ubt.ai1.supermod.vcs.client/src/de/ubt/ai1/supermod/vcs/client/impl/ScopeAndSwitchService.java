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
import de.ubt.ai1.supermod.service.client.ICompositeAmbitionAndChoiceSpecificationService;
import de.ubt.ai1.supermod.service.client.exceptions.SuperModClientException;
import de.ubt.ai1.supermod.service.exceptions.SuperModException;
import de.ubt.ai1.supermod.vcs.client.IScopeAndSwitchService;

/**
 * Default implementation of the "scope and switch" service which delegates
 * to existing scope and switch service.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	30.09.2015
 */
public class ScopeAndSwitchService extends AbstractCheckOutService
implements IScopeAndSwitchService {
	
	@Inject
	private ICompositeAmbitionAndChoiceSpecificationService	ambChoiceSpecService;

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.vcs.IScopeAndSwitchService
	 * #canScopeAndSwitch(de.ubt.ai1.supermod.mm.client.LocalRepository)
	 */
	@Override
	public boolean canScopeAndSwitch(LocalRepository repo) 
			throws SuperModClientException {
		return repo != null;
	}

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.vcs.IScopeAndSwitchService
	 * #scopeAndSwitch(de.ubt.ai1.supermod.mm.client.LocalRepository,
	 * org.eclipse.emf.ecore.resource.ResourceSet)
	 */
	@Override
	public boolean scopeAndSwitch(LocalRepository repo, ResourceSet rs) 
			throws SuperModException {
		
		OptionBinding[] ca = ambChoiceSpecService
				.specifyCompositeChoiceAndAmbition(repo, 
						repo.getLocalAmbition(), repo.getLocalChoice());
		if (ca == null || ca.length < 2) return false;
		OptionBinding ambition = ca[0];
		OptionBinding choice = ca[1];
		
		if (choice != null && ambition != null) {
			Resource choiceRes = rs.getResource(
					repo.eResource().getURI().trimFileExtension()
					.appendFileExtension("lchoice"), true);
			choiceRes.getContents().clear();
			choiceRes.getContents().add(choice);
			repo.setLocalChoice(choice);
			
			Resource ambRes = rs.getResource(
					repo.eResource().getURI().trimFileExtension()
					.appendFileExtension("lamb"), true);
			ambRes.getContents().clear();
			ambRes.getContents().add(ambition);
			repo.setLocalAmbition(ambition);
			
			checkOut(repo, choice, rs);
			return true;
		}
		return false;
	}

}
