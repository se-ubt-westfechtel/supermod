/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/

package de.ubt.ai1.supermod.service.client;

import org.eclipse.emf.ecore.resource.ResourceSet;

import de.ubt.ai1.supermod.mm.client.SingleVersionProductSpaceDescriptor;
import de.ubt.ai1.supermod.service.client.exceptions.SuperModClientException;

/**
 * Service interface for the initialization of the single-version representation
 * of a complete product space within a local SuperMod repository. Clients
 * should use specific implementations of the service interface {@link
 * ISingleVersionProductDimensionDescriptorInitializationService} in order to
 * initialize dimension descriptors separately for each product dimension.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	31.07.2014
 */
public interface ISingleVersionProductSpaceDescriptorInitializationService {

	/**
	 * Performs the initialization of the single version descriptor.
	 *
	 * @param rootUri the location where a workspace selection shall be
	 * 			performed.
	 * @param rs to be passed to dimension descriptor initialization services.
	 * @param interactive whether the user should be involved for an initial
	 * 			selection.
	 * @return a single version product space descriptor that represents the
	 * 			contents of the versioned sub-set of the workspace.
	 * @throws SuperModClientException in case initialization fails.
	 */
	public SingleVersionProductSpaceDescriptor 
	initializeSingleVersionProductSpaceDescriptor(
			String rootUri, ResourceSet rs, boolean interactive)
					throws SuperModClientException;

}
