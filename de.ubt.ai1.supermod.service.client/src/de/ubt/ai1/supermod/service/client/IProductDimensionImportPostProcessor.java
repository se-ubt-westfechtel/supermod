/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/

package de.ubt.ai1.supermod.service.client;

import org.eclipse.emf.ecore.resource.ResourceSet;

import de.ubt.ai1.supermod.mm.client.LocalRepository;
import de.ubt.ai1.supermod.mm.core.ProductDimension;
import de.ubt.ai1.supermod.service.client.exceptions.SuperModClientException;

/**
 * Service interface for the post-processing of a specific product dimension
 * after it has been imported. Clients may implement this interface in order to
 * provide dimension-specific clean-up operations, e.g., in order to create or
 * delete new resources for the imported elements in the local repository's
 * product space.
 * 
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	30.07.2014
 */
public interface IProductDimensionImportPostProcessor {

	/**
	 * To be implemented in order to perform all necessary post-processing
	 * operations after a product dimension has been imported.
	 *
	 * @param repo the repository which contains the new product space.
	 * @param rs the resource set to use for all post-processing tasks.
	 * @param oldPd the old version of the product dimension
	 * @param newPd the new version, which comprises or is equal to the
	 * 			imported version of the product dimension.
	 * @throws SuperModClientException in case post-processing fails.
	 */
	public void postProcess(LocalRepository repo, ResourceSet rs, 
			ProductDimension oldPd, ProductDimension newPd) 
					throws SuperModClientException;

}
