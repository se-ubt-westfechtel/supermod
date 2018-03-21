/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/

package de.ubt.ai1.supermod.service.revision.client.pure.impl;

import com.google.inject.Inject;

import de.ubt.ai1.supermod.mm.core.OptionBinding;
import de.ubt.ai1.supermod.mm.core.VersionSpace;
import de.ubt.ai1.supermod.service.client.IChoiceSpecificationService;
import de.ubt.ai1.supermod.service.client.ICompositeChoiceSpecificationService;
import de.ubt.ai1.supermod.service.revision.IRevisionDimensionProvider;
import de.ubt.ai1.supermod.service.revision.Revision;

/**
 * An implementation of the composite choice specification service, which
 * accesses an ambition specification service for the revision dimension.
 * 
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	01.08.2014
 */
public class PureRevCompositeChoiceSpecificationService 
implements ICompositeChoiceSpecificationService {
	
	@Inject
	private IRevisionDimensionProvider revDimProvider;
	
	@Inject
	@Revision
	private IChoiceSpecificationService revisionChoiceSpecificationService;

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
		return revisionChoiceSpecificationService.specifyChoice(
				revDimProvider.getRevisionDimension(vs),
				proposedCompositeChoice, representedCompositeAmbition);
	}

}
