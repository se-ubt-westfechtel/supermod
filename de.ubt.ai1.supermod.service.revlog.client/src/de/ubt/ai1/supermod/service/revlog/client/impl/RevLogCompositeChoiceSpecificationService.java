/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/

package de.ubt.ai1.supermod.service.revlog.client.impl;

import com.google.inject.Inject;

import de.ubt.ai1.supermod.mm.change.util.ChangeSpaceUtil;
import de.ubt.ai1.supermod.mm.core.OptionBinding;
import de.ubt.ai1.supermod.mm.core.SuperModCoreFactory;
import de.ubt.ai1.supermod.mm.core.VersionSpace;
import de.ubt.ai1.supermod.mm.logical.LogicalDimension;
import de.ubt.ai1.supermod.mm.revision.RevisionDimension;
import de.ubt.ai1.supermod.service.client.IChoiceSpecificationService;
import de.ubt.ai1.supermod.service.client.ICompositeChoiceSpecificationService;
import de.ubt.ai1.supermod.service.logical.ILogicalDimensionProvider;
import de.ubt.ai1.supermod.service.logical.Logical;
import de.ubt.ai1.supermod.service.revision.IRevisionDimensionProvider;
import de.ubt.ai1.supermod.service.revision.Revision;

/**
 * An implementation of the composite choice specification interface which
 * uses a revision and a logical choice specification service in order to
 * specify a hybrid, composite choice.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	01.08.2014
 */
public class RevLogCompositeChoiceSpecificationService 
implements ICompositeChoiceSpecificationService {
	
	@Inject
	private IRevisionDimensionProvider revDimProvider;
	
	@Inject
	private ILogicalDimensionProvider logDimProvider;
	
	@Inject
	@Revision
	private IChoiceSpecificationService revisionSpecificationService;
	
	@Inject
	@Logical
	private IChoiceSpecificationService logicalSpecificationService;

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
		RevisionDimension revDim = revDimProvider.getRevisionDimension(vs);
		LogicalDimension logDim = logDimProvider.getLogicalDimension(vs);
		
		OptionBinding revisionChoice = revisionSpecificationService.
				specifyChoice(revDim, 
						ChangeSpaceUtil.filterBinding(
								proposedCompositeChoice, revDim),
						ChangeSpaceUtil.filterBinding(
								representedCompositeAmbition, revDim));
		if (revisionChoice == null) return null;
		OptionBinding logicalChoice = logicalSpecificationService.
				specifyChoice(logDim,
						ChangeSpaceUtil.filterBinding(
								proposedCompositeChoice, logDim),
						ChangeSpaceUtil.filterBinding(
								representedCompositeAmbition, logDim));
		if (logicalChoice == null) return null;
		OptionBinding compositeChoice = SuperModCoreFactory.eINSTANCE
				.createOptionBinding();
		compositeChoice.getBoundOptions().putAll(
				revisionChoice.getBoundOptions());
		compositeChoice.getBoundOptions().putAll(
				logicalChoice.getBoundOptions());
		return compositeChoice;
	}

}
