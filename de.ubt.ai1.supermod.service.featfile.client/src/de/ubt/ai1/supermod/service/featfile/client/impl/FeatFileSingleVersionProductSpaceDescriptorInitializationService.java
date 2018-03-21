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

import de.ubt.ai1.supermod.mm.client.SingleVersionProductDimensionDescriptor;
import de.ubt.ai1.supermod.mm.client.SingleVersionProductSpaceDescriptor;
import de.ubt.ai1.supermod.mm.client.SuperModClientFactory;
import de.ubt.ai1.supermod.service.client.ISingleVersionProductDimensionDescriptorInitializationService;
import de.ubt.ai1.supermod.service.client.ISingleVersionProductSpaceDescriptorInitializationService;
import de.ubt.ai1.supermod.service.client.exceptions.SuperModClientException;
import de.ubt.ai1.supermod.service.feature.Feature;
import de.ubt.ai1.supermod.service.file.File;

/**
 * Implementation of the product space descriptor initialization service 
 * specific to the "feat-file" product space.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	02.03.2015
 */
public class FeatFileSingleVersionProductSpaceDescriptorInitializationService
implements ISingleVersionProductSpaceDescriptorInitializationService {
	
	@Inject
	@Feature
	ISingleVersionProductDimensionDescriptorInitializationService 
	featureModelDescInitService;
	
	@Inject
	@File
	ISingleVersionProductDimensionDescriptorInitializationService 
	fileSystemDescInitService;


	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.client.
	 * ISingleVersionProductSpaceDescriptorInitializationService
	 * #initializeSingleVersionProductSpaceDescriptor(
	 * de.ubt.ai1.supermod.mm.client.SingleVersionProductSpaceDescriptor, 
	 * org.eclipse.emf.ecore.resource.ResourceSet, java.lang.String)
	 */
	@Override
	public SingleVersionProductSpaceDescriptor 
	initializeSingleVersionProductSpaceDescriptor(String rootUri,
			ResourceSet rs, boolean interactive)
					throws SuperModClientException {
		SingleVersionProductSpaceDescriptor psDesc = SuperModClientFactory
				.eINSTANCE.createSingleVersionProductSpaceDescriptor();
		SingleVersionProductDimensionDescriptor fmDesc = 
				featureModelDescInitService
				.initializeSingleVersionProductDimensionDescriptor(
						rootUri, rs, interactive);
		psDesc.getDimensionDescriptors().add(fmDesc);
		SingleVersionProductDimensionDescriptor fsDesc = 
				fileSystemDescInitService
				.initializeSingleVersionProductDimensionDescriptor(
						rootUri, rs, interactive);
		psDesc.getDimensionDescriptors().add(fsDesc);
		return psDesc;
	}

}
