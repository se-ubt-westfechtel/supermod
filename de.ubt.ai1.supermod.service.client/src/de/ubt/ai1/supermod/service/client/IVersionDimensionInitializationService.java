/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/

package de.ubt.ai1.supermod.service.client;

import org.eclipse.emf.ecore.resource.ResourceSet;

import de.ubt.ai1.supermod.mm.core.VersionDimension;
import de.ubt.ai1.supermod.service.client.exceptions.SuperModClientException;

/**
 * Service interface for the initialization of a specific version dimension
 * within the version space of a SuperMod repository. Creates an initial
 * representation of the respective dimension in a dimension-specific way.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	31.07.2014
 */
public interface IVersionDimensionInitializationService {
	
	/**
	 * To be implemented in order to initialize a specific version dimension
	 * within a given resource set.
	 *
	 * @param rs the resource set where a new EMF resource for the version
	 * 			dimension shall be created.
	 * @param repoUri the URI of the SuperMod repository whose version space
	 * 			will contain the created dimension.
	 * @return the initialized version dimension.
	 * @throws SuperModClientException in case initialization fails.
	 */
	public VersionDimension initializeVersionDimension(ResourceSet rs, 
			String repoUri) throws SuperModClientException;


}
