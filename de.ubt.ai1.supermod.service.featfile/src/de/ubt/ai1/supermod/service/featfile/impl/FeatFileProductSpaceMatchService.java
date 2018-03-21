/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.service.featfile.impl;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import com.google.inject.Inject;

import de.ubt.ai1.supermod.mm.core.ProductDimension;
import de.ubt.ai1.supermod.mm.diff.MatchingRole;
import de.ubt.ai1.supermod.mm.diff.ProductSpaceMatching;
import de.ubt.ai1.supermod.mm.diff.SuperModDiffFactory;
import de.ubt.ai1.supermod.service.IProductDimensionMatchService;
import de.ubt.ai1.supermod.service.IProductSpaceMatchService;
import de.ubt.ai1.supermod.service.feature.Feature;
import de.ubt.ai1.supermod.service.feature.IFeatureProductDimensionProvider;
import de.ubt.ai1.supermod.service.file.File;
import de.ubt.ai1.supermod.service.file.IVersionedFileSystemProvider;

/**
 * Implementation of the product space match service interface specific to
 * SuperMod's feat-file product space type.
 * 
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	02.03.2015
 */
public class FeatFileProductSpaceMatchService
implements IProductSpaceMatchService {
	
	@Inject
	private IVersionedFileSystemProvider fileSystemProvider;
	
	@Inject
	private IFeatureProductDimensionProvider featureModelProvider;
	
	@Inject
	@Feature
	private IProductDimensionMatchService featureModelMatchService;
	
	@Inject
	@File
	private IProductDimensionMatchService fileSystemMatchService;

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.IProductSpaceMatchService
	 * #match(java.util.Collection)
	 */
	@Override
	public ProductSpaceMatching match(Collection<MatchingRole> roles) {
		ProductSpaceMatching matching = SuperModDiffFactory.eINSTANCE
				.createProductSpaceMatching();
		matching.getMatchingRoles().addAll(roles);
		
		List<ProductDimension> featureDims = new LinkedList<>();
		for (MatchingRole role : roles) {
			featureDims.add(featureModelProvider.getFeatureDimension(
					role.getMatchedProductSpace()));
		}
		matching.getDimensionMatchings().add(
				featureModelMatchService.match(roles, featureDims));
		
		List<ProductDimension> fileDims = new LinkedList<>();
		for (MatchingRole role : roles) {
			fileDims.add(fileSystemProvider.getVersionedFileSystem(
					role.getMatchedProductSpace()));
		}		
		matching.getDimensionMatchings().add(
				fileSystemMatchService.match(roles, fileDims));
		
		return matching;
	}

}
