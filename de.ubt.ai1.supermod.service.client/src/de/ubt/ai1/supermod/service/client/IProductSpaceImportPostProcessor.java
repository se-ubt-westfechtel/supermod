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
import de.ubt.ai1.supermod.mm.core.ProductSpace;
import de.ubt.ai1.supermod.service.client.exceptions.SuperModClientException;

/**
 * Service interface for post-processing operations on complete product
 * dimensions after they have been imported. Clients should use specific
 * product dimension import post-processing services for each exported dimension
 * separately.
 * 
 * @see IProductDimensionImportPostProcessor
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	30.07.2014
 */
public interface IProductSpaceImportPostProcessor {

	/**
	 * Performs the necessary post-processing operations after a specified
	 * product space has been imported.
	 *
	 * @param repo the repository where it all happens.
	 * @param rs the resource set all new resources should be handled with.
	 * @param oldPs the old version of the product space before importing.
	 * @param newPs the version of the product space that had been imported,
	 * 			or another product space which contains it.
	 * @throws SuperModClientException in case post-processing fails.
	 */
	public void postProcess(LocalRepository repo, ResourceSet rs, 
			ProductSpace oldPs, ProductSpace newPs) 
					throws SuperModClientException;

}
