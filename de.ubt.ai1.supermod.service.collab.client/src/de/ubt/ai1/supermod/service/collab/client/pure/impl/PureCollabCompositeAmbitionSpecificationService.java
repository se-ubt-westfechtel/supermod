/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.service.collab.client.pure.impl;

import com.google.inject.Inject;

import de.ubt.ai1.supermod.mm.client.LocalRepository;
import de.ubt.ai1.supermod.mm.core.OptionBinding;
import de.ubt.ai1.supermod.service.client.IAmbitionSpecificationService;
import de.ubt.ai1.supermod.service.client.ICompositeAmbitionSpecificationService;
import de.ubt.ai1.supermod.service.collab.Collab;
import de.ubt.ai1.supermod.service.collab.ICollabDimensionProvider;

/**
 * An implementation of the composite ambition specification service, which
 * accesses an ambition specification service for the collab dimension.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	28.10.2015
 */
public class PureCollabCompositeAmbitionSpecificationService
implements ICompositeAmbitionSpecificationService {

	@Inject
	private ICollabDimensionProvider collDimProvider;

	@Inject
	@Collab
	private IAmbitionSpecificationService collAmbitionSpecificationService;
	
	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.client.
	 * ICompositeAmbitionSpecificationService#specifyCompositeAmbition(
	 * de.ubt.ai1.supermod.mm.core.VersionSpace, 
	 * de.ubt.ai1.supermod.mm.core.OptionBinding, 
	 * de.ubt.ai1.supermod.mm.core.OptionBinding)
	 */
	@Override
	public OptionBinding specifyCompositeAmbition(LocalRepository repo,
			OptionBinding compositeChoice, OptionBinding recordedAmbition,
			OptionBinding proposedCompositeAmbition) {
		return collAmbitionSpecificationService.specifyAmbition(
				collDimProvider.getCollabDimension(repo.getVersionSpace()),
				compositeChoice, recordedAmbition, proposedCompositeAmbition);
	}

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.client.
	 * ICompositeAmbitionSpecificationService#undoCompositeAmbitionSpecification
	 * (de.ubt.ai1.supermod.mm.core.VersionSpace, 
	 * de.ubt.ai1.supermod.mm.core.OptionBinding)
	 */
	@Override
	public void undoCompositeAmbitionSpecification(LocalRepository repo,
			OptionBinding specifiedAmbition) {
		collAmbitionSpecificationService.undoAmbitionSpecification(
				collDimProvider.getCollabDimension(repo.getVersionSpace()),
				specifiedAmbition);		
	}	
}
