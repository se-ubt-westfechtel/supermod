/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/

package de.ubt.ai1.supermod.service.client;

import org.eclipse.emf.ecore.resource.ResourceSet;

import de.ubt.ai1.supermod.mm.core.OptionBinding;
import de.ubt.ai1.supermod.mm.core.VersionSpace;
import de.ubt.ai1.supermod.service.client.exceptions.SuperModClientException;

/**
 * Service interface for the initialization of a local ambition. The local 
 * ambition within a local repository refers to the set of versions modified
 * by the current change. During repository initialization, a
 * dedicated EMF resource is created for the local choice under the path
 * <code>.supermod/main/main.lamb</code>.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	28.09.2015
 */
public interface ILocalAmbitionInitializationService {

	/**
	 * Initializes an EMF resource for the choice and inserts an empty option
	 * binding.
	 *
	 * @param vs the version space the initial option binding shall refer to.
	 * @param rs a resource set in which the created resource for the local
	 * 			ambition will be contained.
	 * @param repoUri the absolute URI of the repository to initialize the
	 * 			local ambition for.
	 * @return the option binding that lies within the local ambition resource
	 * 			and corresponds to the (initially empty) local ambition.
	 * @throws SuperModClientException in case the initialization failed.
	 */
	public OptionBinding initializeLocalAmbition(VersionSpace vs, 
			ResourceSet rs, String repoUri) throws SuperModClientException;

}
