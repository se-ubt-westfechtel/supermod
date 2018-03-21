/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.service.collfeat.client.impl;

import org.eclipse.emf.ecore.resource.ResourceSet;

import com.google.inject.Inject;

import de.ubt.ai1.supermod.mm.core.SuperModCoreFactory;
import de.ubt.ai1.supermod.mm.core.VersionSpace;
import de.ubt.ai1.supermod.service.change.Change;
import de.ubt.ai1.supermod.service.client.IVersionDimensionInitializationService;
import de.ubt.ai1.supermod.service.client.IVersionSpaceInitializationService;
import de.ubt.ai1.supermod.service.client.exceptions.SuperModClientException;
import de.ubt.ai1.supermod.service.collab.Collab;
import de.ubt.ai1.supermod.service.feature.Feature;

/**
 * An implementation of the version space initialization interface which
 * uses a collab, a feature, and a change dimension initialization service
 * in order to compose the three-dimensional version space.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	28.10.2015
 */
public class CollFeatVersionSpaceInitializationService
implements IVersionSpaceInitializationService {

	@Inject
	@Collab
	private IVersionDimensionInitializationService collInitializationService;
	
	@Inject
	@Feature
	private IVersionDimensionInitializationService featInitializationService;
	
	@Inject
	@Change
	private IVersionDimensionInitializationService changeInitializationService;

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.client.
	 * IVersionSpaceInitializationService#initializeVersionSpace(
	 * org.eclipse.emf.ecore.resource.ResourceSet, java.lang.String)
	 */
	@Override
	public VersionSpace initializeVersionSpace(ResourceSet rs, String repoUri) 
			throws SuperModClientException {
		VersionSpace vs = SuperModCoreFactory.eINSTANCE.createVersionSpace();
		vs.getDimensions().add(collInitializationService
				.initializeVersionDimension(rs, repoUri));
		vs.getDimensions().add(featInitializationService
				.initializeVersionDimension(rs, repoUri));
		vs.getDimensions().add(changeInitializationService
				.initializeVersionDimension(rs, repoUri));
		return vs;
	}
	
}
