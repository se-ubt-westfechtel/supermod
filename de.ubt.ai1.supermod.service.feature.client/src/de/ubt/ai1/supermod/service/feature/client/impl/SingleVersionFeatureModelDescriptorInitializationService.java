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

import com.google.inject.Inject;

import de.ubt.ai1.supermod.mm.client.SingleVersionProductDimensionDescriptor;
import de.ubt.ai1.supermod.mm.feature.FeatureModel;
import de.ubt.ai1.supermod.mm.feature.SuperModFeatureFactory;
import de.ubt.ai1.supermod.mm.feature.client.SingleVersionFeatureModelDescriptor;
import de.ubt.ai1.supermod.mm.feature.client.SuperModFeatureClientFactory;
import de.ubt.ai1.supermod.service.client.IMetadataResourceHandler;
import de.ubt.ai1.supermod.service.client.ISingleVersionProductDimensionDescriptorInitializationService;
import de.ubt.ai1.supermod.service.client.exceptions.SuperModClientException;
import de.ubt.ai1.supermod.service.client.exceptions.SuperModClientWrappedException;

/**
 * Implementation of the single version product dimension descriptor
 * initialization service specific to the product dimension of feature models.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	03.03.2015
 */
public class SingleVersionFeatureModelDescriptorInitializationService
implements ISingleVersionProductDimensionDescriptorInitializationService {
	
	@Inject
	private IMetadataResourceHandler metadataResourceHandler;

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.client.
	 * ISingleVersionProductDimensionDescriptorInitializationService
	 * #initializeSingleVersionProductDimensionDescriptor(
	 * de.ubt.ai1.supermod.mm.client.SingleVersionProductDimensionDescriptor, 
	 * org.eclipse.emf.ecore.resource.ResourceSet, java.lang.String)
	 */
	@Override
	public SingleVersionProductDimensionDescriptor 
	initializeSingleVersionProductDimensionDescriptor(
			String rootUri, ResourceSet rs, boolean interactive)
					throws SuperModClientException {
		String repoUriStr = metadataResourceHandler.createRepositoryUri(rootUri);
		URI svfmUri = URI.createPlatformResourceURI(repoUriStr, true)
				.trimFileExtension().appendFileExtension("svfm");
		Resource svfmRes = rs.createResource(svfmUri);
		SingleVersionFeatureModelDescriptor svfm = 
				SuperModFeatureClientFactory.eINSTANCE
				.createSingleVersionFeatureModelDescriptor();
		FeatureModel localFeatureModel = SuperModFeatureFactory.eINSTANCE
				.createFeatureModel();
		localFeatureModel.setDimensionName("feature");
		svfm.setFeatureModel(localFeatureModel);
		svfm.setDimensionName("feature");
		svfmRes.getContents().add(svfm);
		try {
			svfmRes.save(null);
		} catch (IOException e) {
			throw new SuperModClientWrappedException(e);
		}
		return svfm;
	}

}
