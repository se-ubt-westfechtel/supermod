/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.service.feature.pure.impl;

import java.util.HashMap;
import java.util.Map;

import com.google.inject.Inject;

import de.ubt.ai1.supermod.mm.core.Option;
import de.ubt.ai1.supermod.mm.core.VersionDimension;
import de.ubt.ai1.supermod.mm.core.VersionSpace;
import de.ubt.ai1.supermod.service.IVersionDimensionMergeService;
import de.ubt.ai1.supermod.service.IVersionSpaceMergeService;
import de.ubt.ai1.supermod.service.feature.Feature;
import de.ubt.ai1.supermod.service.feature.IFeatureVersionDimensionProvider;

/**
 * An implementation of the version space merge service interface specific to
 * the 'pure feature' version model.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	21.10.2015
 */
public class PureFeatureVersionSpaceMergeService
implements IVersionSpaceMergeService {
	
	@Inject
	private IFeatureVersionDimensionProvider featDimProvider;
	
	@Inject
	@Feature
	private IVersionDimensionMergeService featDimMergeService;

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.IVersionSpaceMergeService
	 * #merge(de.ubt.ai1.supermod.mm.core.VersionSpace,
	 * de.ubt.ai1.supermod.mm.core.VersionSpace)
	 */
	@Override
	public Map<String, Option> merge(VersionSpace base, VersionSpace other) {
		VersionDimension baseFeatDim = featDimProvider
				.getFeatureDimension(base);
		VersionDimension otherFeatDim = featDimProvider
				.getFeatureDimension(other);
		return featDimMergeService.merge(baseFeatDim, otherFeatDim, 
				new HashMap<String, Option>());
	}

}
