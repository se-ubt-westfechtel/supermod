/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/

package de.ubt.ai1.supermod.service.generic.client.impl;

import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

import de.ubt.ai1.supermod.mm.core.SuperModCoreFactory;
import de.ubt.ai1.supermod.mm.core.VisibilityForest;
import de.ubt.ai1.supermod.service.client.IVisibilityForestInitializationService;
import de.ubt.ai1.supermod.service.client.exceptions.SuperModClientException;
import de.ubt.ai1.supermod.service.client.exceptions.SuperModClientWrappedException;

/**
 * Generic implementation of the visibility forest initialization service
 * interface, which allocates a resource 
 * <code>.supermod/main/main.vforest</code>, which contains an empty visibility 
 * forest.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	31.07.2014
 */
public class GenericVisibilityForestInitializationService 
implements IVisibilityForestInitializationService {

	@Override
	public VisibilityForest initializeVisibilityForest(ResourceSet rs,
			String repoUri) throws SuperModClientException {
		URI vfUri = URI.createPlatformResourceURI(repoUri, true)
				.trimFileExtension().appendFileExtension("vforest");
		Resource vfRes = rs.createResource(vfUri);
		VisibilityForest vForest = SuperModCoreFactory.eINSTANCE
				.createVisibilityForest();
		vfRes.getContents().add(vForest);
		try {
			vfRes.save(null);
		} catch (IOException e) {
			throw new SuperModClientWrappedException(e);
		}
		return vForest;
	}

}
