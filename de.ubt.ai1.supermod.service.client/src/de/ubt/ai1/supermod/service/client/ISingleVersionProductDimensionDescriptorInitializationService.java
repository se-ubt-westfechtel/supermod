/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/

package de.ubt.ai1.supermod.service.client;

import org.eclipse.emf.ecore.resource.ResourceSet;

import de.ubt.ai1.supermod.mm.client.SingleVersionProductDimensionDescriptor;
import de.ubt.ai1.supermod.service.client.exceptions.SuperModClientException;

/**
 * Service interface for the initialization of a specific single version
 * product dimension descriptor. Each local SuperMod repository consists of
 * a product space descriptor which is decomposed into several product dimension
 * descriptors, one per dimension. For each concrete dimension, a specific
 * implementation of this service interface should be provided.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	31.07.2014
 */
public interface ISingleVersionProductDimensionDescriptorInitializationService {

	/**
	 * Initializes the dimension descriptor for a specific product dimension.
	 * It is assumed to be stored within a separate EMF resource inside the
	 * <code>.supermod/main</code> directory.
	 *
	 * @param rootUri the location where a workspace selection shall be
	 * 			performed.
	 * @param rs the resource set which should contain the created dimension
	 * 			descriptor.
	 * @param interactive whether the user should be involved for an initial
	 * 			selection.
	 * @return a single version dimension descriptor located within a single
	 * 			resource; occasionally a copy of <code>descriptor</code>
	 * @throws SuperModClientException in case initialization fails.
	 */
	public SingleVersionProductDimensionDescriptor 
	initializeSingleVersionProductDimensionDescriptor(
			String rootUri, ResourceSet rs, boolean interactive)
					throws SuperModClientException;

}
