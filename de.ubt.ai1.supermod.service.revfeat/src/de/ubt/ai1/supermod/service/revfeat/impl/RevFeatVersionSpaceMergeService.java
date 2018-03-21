/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.service.revfeat.impl;

import java.util.HashMap;
import java.util.Map;

import com.google.inject.Inject;

import de.ubt.ai1.supermod.mm.core.Option;
import de.ubt.ai1.supermod.mm.core.VersionDimension;
import de.ubt.ai1.supermod.mm.core.VersionSpace;
import de.ubt.ai1.supermod.service.IVersionDimensionMergeService;
import de.ubt.ai1.supermod.service.IVersionSpaceMergeService;
import de.ubt.ai1.supermod.service.change.Change;
import de.ubt.ai1.supermod.service.change.IChangeDimensionProvider;
import de.ubt.ai1.supermod.service.feature.Feature;
import de.ubt.ai1.supermod.service.feature.IFeatureVersionDimensionProvider;
import de.ubt.ai1.supermod.service.revision.IRevisionDimensionProvider;
import de.ubt.ai1.supermod.service.revision.Revision;

/**
 * An implementation of the version space merge service interface specific to
 * the 'revision+feature' version space model.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	21.10.2015
 */
public class RevFeatVersionSpaceMergeService
implements IVersionSpaceMergeService {
	
	@Inject
	private IRevisionDimensionProvider revDimProvider;
	
	@Inject
	@Revision
	private IVersionDimensionMergeService revDimMergeService;
	
	@Inject
	private IFeatureVersionDimensionProvider featDimProvider;
	
	@Inject
	@Feature
	private IVersionDimensionMergeService featDimMergeService;
	
	@Inject
	private IChangeDimensionProvider changeDimProvider;
	
	@Inject
	@Change
	private IVersionDimensionMergeService changeDimMergeService;

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.IVersionSpaceMergeService
	 * #merge(de.ubt.ai1.supermod.mm.core.VersionSpace,
	 * de.ubt.ai1.supermod.mm.core.VersionSpace)
	 */
	@Override
	public Map<String, Option> merge(
			VersionSpace base, VersionSpace other) {
		Map<String, Option> result = new HashMap<>();
		
		VersionDimension baseRevDim = revDimProvider
				.getRevisionDimension(base);
		VersionDimension otherRevDim = revDimProvider
				.getRevisionDimension(other);
		result.putAll(revDimMergeService.merge(baseRevDim, otherRevDim, result));
		
		VersionDimension baseFeatDim = featDimProvider
				.getFeatureDimension(base);
		VersionDimension otherFeatDim = featDimProvider
				.getFeatureDimension(other);
		result.putAll(featDimMergeService.merge(baseFeatDim, otherFeatDim,
				result));
		
		VersionDimension baseChangeDim = changeDimProvider
				.getChangeDimension(base);
		VersionDimension otherChangeDim = changeDimProvider
				.getChangeDimension(other);
		result.putAll(changeDimMergeService.merge(baseChangeDim,
				otherChangeDim, result));
		
		return result;
	}

}
