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
import de.ubt.ai1.supermod.service.client.IAmbitionCorrectionService;
import de.ubt.ai1.supermod.service.client.exceptions.SuperModClientException;
import de.ubt.ai1.supermod.service.exceptions.SuperModException;
import de.ubt.ai1.supermod.vcs.client.IAmendService;

/**
 * Default implementation of the amend service.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	29.09.2015
 */
public class AmendService implements IAmendService {
	
	@Inject
	private IAmbitionCorrectionService ambitionCorrectionService;

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.vcs.IAmendService
	 * #canAmend(de.ubt.ai1.supermod.mm.client.LocalRepository)
	 */
	@Override
	public boolean canAmend(LocalRepository repo)
			throws SuperModClientException {
		return ambitionCorrectionService.canCorrect(repo);
	}

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.vcs.IAmendService
	 * #amend(de.ubt.ai1.supermod.mm.client.LocalRepository,
	 * org.eclipse.emf.ecore.resource.ResourceSet)
	 */
	@Override
	public boolean amend(LocalRepository repo, ResourceSet rs)
			throws SuperModException {
		OptionBinding ambToCorrect = ambitionCorrectionService
				.getAmbitionToCorrect(repo);
		OptionBinding correctedAmbition = ambitionCorrectionService.
				specifyCorrectingAmbition(repo, repo.getLocalChoice(),
						ambToCorrect);
		if (correctedAmbition == null) {
			return false;
		}
		else {
			ambitionCorrectionService.correct(repo, correctedAmbition);
			return true;
		}
	}

}
