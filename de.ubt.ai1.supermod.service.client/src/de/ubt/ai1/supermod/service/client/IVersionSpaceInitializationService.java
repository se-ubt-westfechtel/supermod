/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/

package de.ubt.ai1.supermod.service.client;

import org.eclipse.emf.ecore.resource.ResourceSet;

import de.ubt.ai1.supermod.mm.core.VersionSpace;
import de.ubt.ai1.supermod.service.client.exceptions.SuperModClientException;

/**
 * Service interface for the initialization of an entire version space within
 * a new local SuperMod repository. Clients should involve specific 
 * implementations of {@link IVersionDimensionInitializationService} in order
 * to initialize all dimensions of the new product space separately, and
 * if necessary, perform some additional global initialization.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	31.07.2014
 */
public interface IVersionSpaceInitializationService {
	
	/**
	 * Initializes the entire version space by initializing and connecting
	 * specific version dimensions.
	 *
	 * @param rs to be passed to dimension initialization services.
	 * @param repoUri the absolute URI of the SuperMod repository whose version
	 * 			space shall be initialized.
	 * @return the initialized version space.
	 * @throws SuperModClientException in case initialization fails.
	 */
	public VersionSpace initializeVersionSpace(ResourceSet rs, 
			String repoUri) throws SuperModClientException;

}
