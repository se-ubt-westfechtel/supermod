/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.service.collab.client.pure.impl;

import com.google.inject.Inject;

import de.ubt.ai1.supermod.mm.core.OptionBinding;
import de.ubt.ai1.supermod.mm.core.VersionSpace;
import de.ubt.ai1.supermod.service.client.IChoiceSpecificationService;
import de.ubt.ai1.supermod.service.client.ICompositeChoiceSpecificationService;
import de.ubt.ai1.supermod.service.collab.Collab;
import de.ubt.ai1.supermod.service.collab.ICollabDimensionProvider;

/**
 * An implementation of the composite choice specification service, which
 * accesses an ambition specification service for the collab dimension.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	28.10.2015
 */
public class PureCollabCompositeChoiceSpecificationService
implements ICompositeChoiceSpecificationService {

	@Inject
	private ICollabDimensionProvider collDimProvider;
	
	@Inject
	@Collab
	private IChoiceSpecificationService collChoiceSpecificationService;

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.client.
	 * ICompositeChoiceSpecificationService#specifyCompositeChoice(
	 * de.ubt.ai1.supermod.mm.core.VersionSpace, 
	 * de.ubt.ai1.supermod.mm.core.OptionBinding)
	 */
	@Override
	public OptionBinding specifyCompositeChoice(VersionSpace vs,
			OptionBinding proposedCompositeChoice,
			OptionBinding representedCompositeAmbition) {
		return collChoiceSpecificationService.specifyChoice(
				collDimProvider.getCollabDimension(vs),
				proposedCompositeChoice, representedCompositeAmbition);
	}
	
}
