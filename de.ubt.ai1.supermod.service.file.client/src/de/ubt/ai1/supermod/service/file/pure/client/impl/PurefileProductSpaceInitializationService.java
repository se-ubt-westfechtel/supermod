/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/

package de.ubt.ai1.supermod.service.file.pure.client.impl;

import org.eclipse.emf.ecore.resource.ResourceSet;

import com.google.inject.Inject;

import de.ubt.ai1.supermod.mm.core.ProductSpace;
import de.ubt.ai1.supermod.mm.core.SuperModCoreFactory;
import de.ubt.ai1.supermod.service.client.IProductDimensionInitializationService;
import de.ubt.ai1.supermod.service.client.IProductSpaceInitializationService;
import de.ubt.ai1.supermod.service.client.exceptions.SuperModClientException;
import de.ubt.ai1.supermod.service.file.File;

/**
 * Implementation of the product space initialization client service interface 
 * specific to a product space which consists of only a versioned file system. 
 * It invokes the corresponding {@link IProductDimensionInitializationService}
 * for the product dimension type {@link de.ubt.ai1.supermod.service.file.File}.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	31.07.2014
 */
public class PurefileProductSpaceInitializationService 
implements IProductSpaceInitializationService {
	
	@Inject
	@File
	private IProductDimensionInitializationService 
	fileSystemInitializationService;

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.client.
	 * IProductSpaceInitializationService#initializeProductSpace(
	 * org.eclipse.emf.ecore.resource.ResourceSet, 
	 * de.ubt.ai1.supermod.mm.core.VersionSpace, 
	 * de.ubt.ai1.supermod.mm.core.VisibilityForest, java.lang.String)
	 */
	@Override
	public ProductSpace initializeProductSpace(ResourceSet rs,
				String repoUri) 
					throws SuperModClientException {
		ProductSpace ps = SuperModCoreFactory.eINSTANCE.createProductSpace();
		ps.getDimensions().add(fileSystemInitializationService
				.initializeProductDimension(rs, repoUri));
		return ps;
	}

}
