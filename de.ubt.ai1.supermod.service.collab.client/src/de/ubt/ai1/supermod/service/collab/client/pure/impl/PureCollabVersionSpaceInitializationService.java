/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.service.collab.client.pure.impl;

import org.eclipse.emf.ecore.resource.ResourceSet;

import com.google.inject.Inject;

import de.ubt.ai1.supermod.mm.core.SuperModCoreFactory;
import de.ubt.ai1.supermod.mm.core.VersionSpace;
import de.ubt.ai1.supermod.service.client.IVersionDimensionInitializationService;
import de.ubt.ai1.supermod.service.client.IVersionSpaceInitializationService;
import de.ubt.ai1.supermod.service.client.exceptions.SuperModClientException;
import de.ubt.ai1.supermod.service.collab.Collab;

/**
 * An implementation of the version space initialization service specific
 * to a version space consisting only of the the collab dimension. It calls
 * the corresponding dimension initialization service.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	28.10.2015
 */
public class PureCollabVersionSpaceInitializationService
implements IVersionSpaceInitializationService {

	@Inject
	@Collab
	private IVersionDimensionInitializationService collDimInitService;

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.client.
	 * IVersionSpaceInitializationService#initializeVersionSpace(
	 * org.eclipse.emf.ecore.resource.ResourceSet, java.lang.String)
	 */
	@Override
	public VersionSpace initializeVersionSpace(ResourceSet rs, String repoUri)
			throws SuperModClientException {
		VersionSpace vs = SuperModCoreFactory.eINSTANCE.createVersionSpace();
		vs.getDimensions().add(collDimInitService
				.initializeVersionDimension(rs, repoUri));
		return vs;
	}

	
}
