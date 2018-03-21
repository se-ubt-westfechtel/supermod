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
import de.ubt.ai1.supermod.mm.client.SingleVersionProductSpaceDescriptor;
import de.ubt.ai1.supermod.mm.core.OptionBinding;
import de.ubt.ai1.supermod.mm.core.ProductSpace;
import de.ubt.ai1.supermod.mm.core.VersionSpace;
import de.ubt.ai1.supermod.mm.core.VisibilityForest;
import de.ubt.ai1.supermod.service.client.exceptions.SuperModClientException;

/**
 * SuperMod service interface for the initialization of a local repository. It
 * is assumed that all components of a local repository have already been
 * initialized by corresponding client services, being the product space, the 
 * version space, the visibility forest, a local choice that describes the 
 * currently represented product space version, a local descriptor that 
 * describes the single-version product space, and optionally a handle to the 
 * master repository.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	30.07.2014
 */
public interface ILocalRepositoryInitializationService {

	/**
	 * Initializes a local repository and all of its mandatory components,
	 * which are distributed within multiple EMF resources.
	 *
	 * @param vs the version space of the repository to create.
	 * @param ps the product space of the repository to create.
	 * @param vf the visibility forest to connect version and product space.
	 * @param localDescriptor a local descriptor for the product space of the
	 * 			repository to create.
	 * @param localChoice a local choice for the workspace of the repository
	 * 			to create.
	 * @param localAmbition a local ambition for the created repository.
	 * @param rs a resource set which will contain the repository resource.
	 * @param repoUri an absolute URI for the resource where the created
	 * 			repository shall be contained in.
	 * @return the initialized local SuperMod repository.
	 * @throws SuperModClientException in case the initialization failed.
	 */
	public LocalRepository initializeLocalRepository(
			VersionSpace vs, ProductSpace ps, VisibilityForest vf, 
			SingleVersionProductSpaceDescriptor localDescriptor,
			OptionBinding localChoice, OptionBinding localAmbition,
			ResourceSet rs, String repoUri)
					throws SuperModClientException;

}
