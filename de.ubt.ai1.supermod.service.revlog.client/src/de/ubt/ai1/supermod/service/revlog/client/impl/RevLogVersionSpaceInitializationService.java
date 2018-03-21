/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/

package de.ubt.ai1.supermod.service.revlog.client.impl;

import org.eclipse.emf.ecore.resource.ResourceSet;

import com.google.inject.Inject;

import de.ubt.ai1.supermod.mm.core.SuperModCoreFactory;
import de.ubt.ai1.supermod.mm.core.VersionSpace;
import de.ubt.ai1.supermod.service.change.Change;
import de.ubt.ai1.supermod.service.client.IVersionDimensionInitializationService;
import de.ubt.ai1.supermod.service.client.IVersionSpaceInitializationService;
import de.ubt.ai1.supermod.service.client.exceptions.SuperModClientException;
import de.ubt.ai1.supermod.service.logical.Logical;
import de.ubt.ai1.supermod.service.revision.Revision;

/**
 * An implementation of the version space initialization interface which
 * uses a revision, a logical, and a change dimension initialization service
 * in order to compose the three-dimensional version space.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	01.08.2014
 */
public class RevLogVersionSpaceInitializationService
implements IVersionSpaceInitializationService {
	
	@Inject
	@Revision
	private IVersionDimensionInitializationService revInitializationService;
	
	@Inject
	@Logical
	private IVersionDimensionInitializationService logInitializationService;
	
	@Inject
	@Change
	private IVersionDimensionInitializationService changeInitializationService;

	@Override
	public VersionSpace initializeVersionSpace(ResourceSet rs, String repoUri)
			throws SuperModClientException {
		VersionSpace vs = SuperModCoreFactory.eINSTANCE.createVersionSpace();
		vs.getDimensions().add(revInitializationService
				.initializeVersionDimension(rs, repoUri));
		vs.getDimensions().add(logInitializationService
				.initializeVersionDimension(rs, repoUri));
		vs.getDimensions().add(changeInitializationService
				.initializeVersionDimension(rs, repoUri));
		return vs;
	}

}
