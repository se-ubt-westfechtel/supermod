/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/

package de.ubt.ai1.supermod.service.client;

import org.eclipse.emf.ecore.resource.ResourceSet;

import de.ubt.ai1.supermod.mm.core.VisibilityForest;
import de.ubt.ai1.supermod.service.client.exceptions.SuperModClientException;

/**
 * Service interface for the initialization of the visibility forest within a
 * local SuperMod repository. The visibility forest contains all visibilities
 * product space elements refer to. Visibilities in turn refer to the version
 * space of the repository. During initialization, a separate EMF resource
 * should be allocated for the visibility forest.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	31.07.2014
 */
public interface IVisibilityForestInitializationService {

	/**
	 * Creates and returns an empty visibility forest, which is located within
	 * a separate EMF resource <code>./supermod/main/main.vf</code>.
	 *
	 * @param rs the resource set where a new resource containing the visibility
	 * 			forest shall be created.
	 * @param repoUriStr the absolute URI of the SuperMod repository which will
	 * 			contain the created visibility forest.
	 * @return an empty visibility forest within a separate resource.
	 * @throws SuperModClientException in case initialization fails.
	 */
	public VisibilityForest initializeVisibilityForest(ResourceSet rs,
			String repoUriStr) throws SuperModClientException;

}
