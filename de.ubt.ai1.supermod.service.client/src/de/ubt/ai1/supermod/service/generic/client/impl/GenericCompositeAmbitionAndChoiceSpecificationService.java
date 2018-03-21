/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.service.generic.client.impl;

import com.google.inject.Inject;

import de.ubt.ai1.supermod.mm.client.LocalRepository;
import de.ubt.ai1.supermod.mm.core.OptionBinding;
import de.ubt.ai1.supermod.service.client.ICompositeAmbitionAndChoiceSpecificationService;
import de.ubt.ai1.supermod.service.client.ICompositeAmbitionSpecificationService;
import de.ubt.ai1.supermod.service.client.ICompositeChoiceSpecificationService;
import de.ubt.ai1.supermod.service.exceptions.SuperModException;

/**
 * A generic implementation of the ambition and choice specification service,
 * which composes the default composite ambition and choice specification
 * services without intertwining dimension selection.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	15.01.2016
 */
public class GenericCompositeAmbitionAndChoiceSpecificationService
		implements ICompositeAmbitionAndChoiceSpecificationService {
	
	@Inject
	private ICompositeAmbitionSpecificationService ambSpecService;
	
	@Inject
	private ICompositeChoiceSpecificationService choiceSpecService;

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.client.
	 * ICompositeAmbitionAndChoiceSpecificationService
	 * #specifyCompositeChoiceAndAmbition()
	 */
	@Override
	public OptionBinding[] specifyCompositeChoiceAndAmbition(
			LocalRepository repo, OptionBinding proposedCompositeAmbition,
			OptionBinding proposedCompositeChoice) throws SuperModException {
		OptionBinding ambition = ambSpecService.specifyCompositeAmbition(
				repo, null, null, proposedCompositeAmbition);
		OptionBinding choice = choiceSpecService.specifyCompositeChoice(
				repo.getVersionSpace(), proposedCompositeChoice, ambition);
		return new OptionBinding[]{ambition, choice};
	}

}
