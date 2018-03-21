/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.service.featfile.client.impl;

import com.google.inject.Inject;

import de.ubt.ai1.supermod.mm.client.ConflictSet;
import de.ubt.ai1.supermod.mm.client.SuperModClientFactory;
import de.ubt.ai1.supermod.mm.core.ProductSpace;
import de.ubt.ai1.supermod.service.client.IProductDimensionValidationService;
import de.ubt.ai1.supermod.service.client.IProductSpaceValidationService;
import de.ubt.ai1.supermod.service.feature.Feature;
import de.ubt.ai1.supermod.service.feature.IFeatureProductDimensionProvider;
import de.ubt.ai1.supermod.service.file.File;
import de.ubt.ai1.supermod.service.file.IVersionedFileSystemProvider;

/**
 * Implementation of the product space validation client service interface 
 * specific to a product space which consists of two dimensions, a feature model
 * and a versioned file system. It invokes the corresponding 
 * {@link IProductDimensionValidationService}s for the product dimensions.
 * 
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	02.03.2015
 */
public class FeatFileProductSpaceValidationService
implements IProductSpaceValidationService {
	
	@Inject
	private IFeatureProductDimensionProvider featureModelProvider;
	
	@Inject
	@Feature
	private IProductDimensionValidationService featureModelValidationService;
	
	@Inject
	private IVersionedFileSystemProvider fileSystemProvider;

	@Inject
	@File
	private IProductDimensionValidationService fileSystemValidationService;
	
	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.client.IProductSpaceValidationService
	 * #validate(de.ubt.ai1.supermod.mm.core.ProductSpace)
	 */
	@Override
	public ConflictSet validate(ProductSpace productSpace) {
		ConflictSet cs = SuperModClientFactory.eINSTANCE.createConflictSet();
		cs.getConflicts().addAll(featureModelValidationService.validate(
				featureModelProvider.getFeatureDimension(productSpace))
				.getConflicts());
		cs.getConflicts().addAll(fileSystemValidationService.validate(
				fileSystemProvider.getVersionedFileSystem(productSpace))
				.getConflicts());
		return cs;
	}

}
