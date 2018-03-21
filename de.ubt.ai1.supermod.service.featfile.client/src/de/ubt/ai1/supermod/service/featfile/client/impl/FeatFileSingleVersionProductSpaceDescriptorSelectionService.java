/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.service.featfile.client.impl;

import com.google.inject.Inject;

import de.ubt.ai1.supermod.mm.client.SingleVersionProductDimensionDescriptor;
import de.ubt.ai1.supermod.mm.client.SingleVersionProductSpaceDescriptor;
import de.ubt.ai1.supermod.mm.client.SuperModClientFactory;
import de.ubt.ai1.supermod.service.client.ISingleVersionProductDimensionDescriptorSelectionService;
import de.ubt.ai1.supermod.service.client.ISingleVersionProductSpaceDescriptorSelectionService;
import de.ubt.ai1.supermod.service.client.exceptions.SuperModClientException;
import de.ubt.ai1.supermod.service.file.File;

/**
 * Implementation of the product space descriptor selection service 
 * specific to the "feat-file" product space.
 * 
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	02.03.2015
 */
public class FeatFileSingleVersionProductSpaceDescriptorSelectionService
implements ISingleVersionProductSpaceDescriptorSelectionService {
	
	@Inject
	@File
	private ISingleVersionProductDimensionDescriptorSelectionService 
	featureModelDescSelectionService;
	
	@Inject
	@File
	private ISingleVersionProductDimensionDescriptorSelectionService 
	fileSystemDescSelectionService;

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.client.
	 * ISingleVersionProductSpaceDescriptorSelectionService
	 * #selectSingleVersion(
	 * de.ubt.ai1.supermod.mm.client.SingleVersionProductSpaceDescriptor)
	 */
	@Override
	public SingleVersionProductSpaceDescriptor selectSingleVersion(
			String rootUri)	throws SuperModClientException {
		SingleVersionProductSpaceDescriptor psDesc = SuperModClientFactory
				.eINSTANCE.createSingleVersionProductSpaceDescriptor();
		SingleVersionProductDimensionDescriptor featureModelDesc = 
				featureModelDescSelectionService
				.selectSingleVersionProductDimension(rootUri);
		psDesc.getDimensionDescriptors().add(featureModelDesc);
		SingleVersionProductDimensionDescriptor fileSystemDesc = 
				fileSystemDescSelectionService
				.selectSingleVersionProductDimension(rootUri);
		psDesc.getDimensionDescriptors().add(fileSystemDesc);
		return psDesc;
	}	

}
