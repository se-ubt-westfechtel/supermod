/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.service.featfile.client.impl;

import org.eclipse.emf.ecore.resource.ResourceSet;

import com.google.inject.Inject;

import de.ubt.ai1.supermod.mm.client.LocalRepository;
import de.ubt.ai1.supermod.mm.core.ProductSpace;
import de.ubt.ai1.supermod.mm.feature.FeatureModel;
import de.ubt.ai1.supermod.service.client.IProductDimensionImportPostProcessor;
import de.ubt.ai1.supermod.service.client.IProductSpaceImportPostProcessor;
import de.ubt.ai1.supermod.service.client.exceptions.SuperModClientException;
import de.ubt.ai1.supermod.service.feature.Feature;
import de.ubt.ai1.supermod.service.feature.IFeatureProductDimensionProvider;
import de.ubt.ai1.supermod.service.file.pure.client.impl.PurefileProductSpaceImportPostProcessor;

/**
 * Implementation of the product space import post-processor client service
 * interface specific to a product space which consists of a feature model and
 * a versioned file system.
 * 
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	02.03.2015
 */
public class FeatFileProductSpaceImportPostProcessor
extends PurefileProductSpaceImportPostProcessor
implements IProductSpaceImportPostProcessor {
	
	@Inject
	@Feature
	private IProductDimensionImportPostProcessor featureModelPostProcessor;
	
	@Inject
	private IFeatureProductDimensionProvider featureModelProvider;
	
	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.file.pure.client.impl.
	 * PurefileProductSpaceImportPostProcessor#postProcess(
	 * de.ubt.ai1.supermod.mm.client.LocalRepository, 
	 * org.eclipse.emf.ecore.resource.ResourceSet, 
	 * de.ubt.ai1.supermod.mm.core.ProductSpace, 
	 * de.ubt.ai1.supermod.mm.core.ProductSpace)
	 */
	@Override
	public void postProcess(LocalRepository repo, ResourceSet rs,
			ProductSpace oldPs, ProductSpace newPs)
			throws SuperModClientException {
		super.postProcess(repo, rs, oldPs, newPs);
		FeatureModel oldFeatureModel = featureModelProvider
				.getFeatureDimension(oldPs);
		FeatureModel newFeatureModel = featureModelProvider
				.getFeatureDimension(newPs);
		featureModelPostProcessor.postProcess(repo, rs, oldFeatureModel, 
				newFeatureModel);
	}

}
