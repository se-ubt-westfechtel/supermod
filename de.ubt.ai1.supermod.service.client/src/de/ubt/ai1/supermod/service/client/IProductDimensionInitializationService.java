/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/

package de.ubt.ai1.supermod.service.client;

import org.eclipse.emf.ecore.resource.ResourceSet;

import de.ubt.ai1.supermod.mm.core.ProductDimension;
import de.ubt.ai1.supermod.service.client.exceptions.SuperModClientException;

/**
 * Service interface for the initialization of a specific product dimension
 * within a SuperMod product space. Each product dimension is stored in a
 * separate EMF resource. This service initializes the resource and inserts
 * a product dimension representing an empty workspace.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	30.07.2014
 */
public interface IProductDimensionInitializationService {

	/**
	 * Performs the initialization of the specific product dimension by creating
	 * a new EMF resource, where an instance of the specific product space
	 * dimension is inserted with no contents.
	 *
	 * @param rs the resource set where the new resource shall be allocated.
	 * @param repoUri the absolute URI of the SuperMod repository, whose product
	 * 			space will contain the initialized dimension.
	 * @return the initialized dimension.
	 * @throws SuperModClientException in cased initialization fails.
	 */
	public ProductDimension initializeProductDimension(ResourceSet rs,
			String repoUri)
					throws SuperModClientException;

}
