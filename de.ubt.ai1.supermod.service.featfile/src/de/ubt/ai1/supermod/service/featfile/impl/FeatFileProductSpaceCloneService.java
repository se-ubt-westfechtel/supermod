/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.service.featfile.impl;

import com.google.inject.Inject;

import de.ubt.ai1.supermod.mm.core.ProductSpace;
import de.ubt.ai1.supermod.mm.core.SuperModCoreFactory;
import de.ubt.ai1.supermod.service.IProductDimensionCloneService;
import de.ubt.ai1.supermod.service.IProductSpaceCloneService;
import de.ubt.ai1.supermod.service.feature.Feature;
import de.ubt.ai1.supermod.service.feature.IFeatureProductDimensionProvider;
import de.ubt.ai1.supermod.service.file.File;
import de.ubt.ai1.supermod.service.file.IVersionedFileSystemProvider;

/**
 * Implementation of the product space clone service interface specific to
 * SuperMod's feat-file product space type.
 * 
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	02.03.2015
 */
public class FeatFileProductSpaceCloneService 
implements IProductSpaceCloneService {
	
	@Inject
	private IVersionedFileSystemProvider fileSystemProvider;
	
	@Inject
	private IFeatureProductDimensionProvider featureModelProvider;
	
	@Inject
	@Feature
	private IProductDimensionCloneService featureModelCloneService;
	
	@Inject
	@File
	private IProductDimensionCloneService fileSystemCloneService;

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.IProductSpaceCloneService
	 * #clone(de.ubt.ai1.supermod.service.ProductSpace)
	 */
	@Override
	public ProductSpace clone(ProductSpace original) {
		ProductSpace clone = SuperModCoreFactory.eINSTANCE
				.createProductSpace();
		clone.getDimensions().add(featureModelCloneService.clone(
				featureModelProvider.getFeatureDimension(original)));
		clone.getDimensions().add(fileSystemCloneService.clone(
				fileSystemProvider.getVersionedFileSystem(original)));
		return clone;
	}

}
