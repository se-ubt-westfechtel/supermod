/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/

package de.ubt.ai1.supermod.service.client;

import org.eclipse.emf.ecore.resource.ResourceSet;

import de.ubt.ai1.supermod.mm.core.ProductSpace;
import de.ubt.ai1.supermod.service.client.exceptions.SuperModClientException;

/**
 * Service interface for the initialization of entire product spaces. Clients
 * should use specific instances of {@link 
 * ProductDimensionInitializationService} in order to initialize separate
 * product dimension the entire product space will consist of.
 * 
 * @see ProductDimensionInitializationService 
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	30.07.2014
 */
public interface IProductSpaceInitializationService {

	/**
	 * Initializes the product space by initializing a fixed set of product
	 * dimensions by using appropriate dimension initialization services.
	 *
	 * @param rs the resource set to be passed to dimensions' resources.
	 * @param repoUri an absolute URI of the SuperMod repository, where the
	 * 			initialized product space will be located.
	 * @return the initialized product space.
	 * @throws SuperModClientException in case initialization fails.
	 */
	public ProductSpace initializeProductSpace(ResourceSet rs,
			String repoUri) throws SuperModClientException;

}
