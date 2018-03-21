/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.service.feature.client.impl;

import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

import de.ubt.ai1.supermod.mm.core.ProductDimension;
import de.ubt.ai1.supermod.mm.core.VersionDimension;
import de.ubt.ai1.supermod.mm.feature.FeatureModel;
import de.ubt.ai1.supermod.mm.feature.SuperModFeatureFactory;
import de.ubt.ai1.supermod.service.client.IProductDimensionInitializationService;
import de.ubt.ai1.supermod.service.client.IVersionDimensionInitializationService;
import de.ubt.ai1.supermod.service.client.exceptions.SuperModClientException;
import de.ubt.ai1.supermod.service.client.exceptions.SuperModClientWrappedException;

/**
 * An implementation of the version dimension initialization service specific
 * to the feature model dimension.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	27.10.2014
 */
public class FeatureModelInitializationService 
implements IVersionDimensionInitializationService, 
		IProductDimensionInitializationService {

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.client.
	 * IVersionDimensionInitializationService#initializeVersionDimension(
	 * org.eclipse.emf.ecore.resource.ResourceSet, java.lang.String)
	 */
	@Override
	public VersionDimension initializeVersionDimension(ResourceSet rs,
			String repoUri) throws SuperModClientException {
		return initializeFeatureModel(rs, repoUri);
	}

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.client.
	 * IProductDimensionInitializationService#initializeProductDimension(
	 * org.eclipse.emf.ecore.resource.ResourceSet, 
	 * de.ubt.ai1.supermod.mm.core.VersionSpace, java.lang.String)
	 */
	@Override
	public ProductDimension initializeProductDimension(ResourceSet rs,
			String repoUri) throws SuperModClientException {
		return initializeFeatureModel(rs, repoUri);
	}
	
	/**
	 * Creates on demand and returns a feature model which may act as a product
	 * space or a version space dimension.
	 *
	 * @param rs
	 * @param repoUri
	 * @return
	 * @throws SuperModClientException 
	 */
	private FeatureModel initializeFeatureModel(ResourceSet rs, 
			String repoUri) throws SuperModClientException {
		URI featDimUri = URI.createPlatformResourceURI(repoUri, true)
				.trimFileExtension().appendFileExtension("feature");
		Resource featDimRes = rs.getResource(featDimUri, false);
		if (featDimRes == null) {
			featDimRes = rs.createResource(featDimUri);
		}
		else {
			try {
				featDimRes.load(null);
			} catch (IOException e) {
				throw new SuperModClientWrappedException(e);
			}
		}
		FeatureModel featDim = null;
		if (featDimRes.getContents().isEmpty()) {
			featDim = SuperModFeatureFactory.eINSTANCE
					.createFeatureModel();
			featDim.setDimensionName("feature");
			featDimRes.getContents().add(featDim);
			try {
				featDimRes.save(null);
			} catch (IOException e) {
				throw new SuperModClientWrappedException(e);
			}
		}
		else {
			featDim = (FeatureModel) featDimRes.getContents().get(0);
		}		
		return featDim;
	}

}
