/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.service.collab.pure.impl;

import java.util.HashMap;
import java.util.Map;

import com.google.inject.Inject;

import de.ubt.ai1.supermod.mm.core.Option;
import de.ubt.ai1.supermod.mm.core.VersionDimension;
import de.ubt.ai1.supermod.mm.core.VersionSpace;
import de.ubt.ai1.supermod.service.IVersionDimensionMergeService;
import de.ubt.ai1.supermod.service.IVersionSpaceMergeService;
import de.ubt.ai1.supermod.service.collab.Collab;
import de.ubt.ai1.supermod.service.collab.ICollabDimensionProvider;

/**
 * An implementation of the version space merge service interface specific to
 * the 'pure collab' version model.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	23.10.2015
 */
public class PureCollabVersionSpaceMergeService
implements IVersionSpaceMergeService {

	@Inject
	private ICollabDimensionProvider collabDimProvider;
	
	@Inject
	@Collab
	private IVersionDimensionMergeService collabDimMergeService;

	
	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.IVersionSpaceMergeService
	 * #merge(de.ubt.ai1.supermod.mm.core.VersionSpace,
	 * de.ubt.ai1.supermod.mm.core.VersionSpace)
	 */
	@Override
	public Map<String, Option> merge(
			VersionSpace base, VersionSpace other) {
		VersionDimension baseCollabDim = collabDimProvider
				.getCollabDimension(base);
		VersionDimension otherCollabDim = collabDimProvider
				.getCollabDimension(other);
		return collabDimMergeService.merge(baseCollabDim, otherCollabDim, 
				new HashMap<String, Option>());
	}

}
