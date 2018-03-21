/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.service.revlog.client.impl;

import org.eclipse.emf.ecore.resource.Resource;

import com.google.inject.Inject;

import de.ubt.ai1.supermod.mm.client.LocalRepository;
import de.ubt.ai1.supermod.mm.core.OptionBinding;
import de.ubt.ai1.supermod.service.client.IAmbitionReservationService;
import de.ubt.ai1.supermod.service.client.IAmbitionSpecificationService;
import de.ubt.ai1.supermod.service.logical.ILogicalDimensionProvider;
import de.ubt.ai1.supermod.service.logical.Logical;

/**
 * An implementation of the ambition reservation service, which
 * accesses an ambition specification service for the logical dimension.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	28.09.2015
 */
public class RevLogAmbitionReservationService 
implements IAmbitionReservationService {
	
	@Inject
	@Logical
	private IAmbitionSpecificationService logSpecService;
	
	@Inject
	private ILogicalDimensionProvider logDimProvider;

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.client.IAmbitionReservationService
	 * #reserveAmbition(de.ubt.ai1.supermod.service.client.LocalRepository)
	 */
	@Override
	public OptionBinding reserveAmbition(LocalRepository repo) {
		OptionBinding amb = logSpecService.specifyAmbition(
				logDimProvider.getLogicalDimension(repo.getVersionSpace()), 
				repo.getLocalChoice(), null, repo.getLocalAmbition());
		Resource ambRes = repo.getLocalAmbition().eResource();
		ambRes.getContents().clear();
		repo.setLocalAmbition(amb);
		ambRes.getContents().add(amb);
		return amb;
	}

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.client.IAmbitionReservationService
	 * #cancelAmbitionReservation(
	 * de.ubt.ai1.supermod.service.client.LocalRepository)
	 */
	@Override
	public void cancelAmbitionReservation(LocalRepository repo) {
		if (repo.getLocalAmbition() != null) {
			repo.getLocalAmbition().clear();
		}
		repo.setLocalAmbition(null);
	}

}
