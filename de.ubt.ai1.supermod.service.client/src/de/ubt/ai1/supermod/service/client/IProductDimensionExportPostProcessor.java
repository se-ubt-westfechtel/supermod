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
 * after it has been exported. Clients may implement this interface in order to
 * provide dimension-specific clean-up operations, e.g., in order to create or
 * delete new resources for the exported or deleted elements in the local
 * workspace.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	30.07.2014
 */
public interface IProductDimensionExportPostProcessor {

	/**
	 * To be implemented by concrete export processors in order to realize
	 * dimension-specific post processing steps after a given product dimension
	 * has been exported. For tracing purposes, an old and a new version of the
	 * product space are provided.
	 *
	 * @param repo the local repository whose product space has been exported.
	 * @param rs the resource set that contains both the old and the new version
	 * 			of the product space.
	 * @param oldPd the old version of the product dimension, which represents 
	 * 			the	workspace before the export operation.
	 * @param newPd the current version of the product dimension.
	 * @param dimensionName the name of the dimension to be post-processed.
	 * @throws SuperModClientException in case post-processing fails.
	 */
	public void postProcess(LocalRepository repo, ResourceSet rs, 
			ProductDimension oldPd, ProductDimension newPd, 
			String dimensionName) throws SuperModClientException;

}
