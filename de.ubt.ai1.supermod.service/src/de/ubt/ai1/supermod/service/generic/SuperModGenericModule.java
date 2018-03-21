/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/

package de.ubt.ai1.supermod.service.generic;

import com.google.inject.AbstractModule;

import de.ubt.ai1.supermod.service.IElementDeletionService;
import de.ubt.ai1.supermod.service.IOptionResolver;
import de.ubt.ai1.supermod.service.IProductDimensionCloneService;
import de.ubt.ai1.supermod.service.IProductDimensionDiffService;
import de.ubt.ai1.supermod.service.IProductDimensionFilterService;
import de.ubt.ai1.supermod.service.IProductSpaceCloneService;
import de.ubt.ai1.supermod.service.IProductSpaceDiffService;
import de.ubt.ai1.supermod.service.IProductSpaceElementsRestrictionService;
import de.ubt.ai1.supermod.service.IProductSpaceFilterService;
import de.ubt.ai1.supermod.service.IRepositoryCloneService;
import de.ubt.ai1.supermod.service.IRepositoryMergeService;
import de.ubt.ai1.supermod.service.IRepositoryProjectionService;
import de.ubt.ai1.supermod.service.IRevisionGraphProvider;
import de.ubt.ai1.supermod.service.IVisibilityForestMergeService;
import de.ubt.ai1.supermod.service.IVisibilityMergeService;
import de.ubt.ai1.supermod.service.IVisibilityUpdateService;
import de.ubt.ai1.supermod.service.generic.impl.GenericCachedVisibilityUpdateService;
import de.ubt.ai1.supermod.service.generic.impl.GenericElementDeletionService;
import de.ubt.ai1.supermod.service.generic.impl.GenericOptionResolver;
import de.ubt.ai1.supermod.service.generic.impl.GenericProductDimensionCloneService;
import de.ubt.ai1.supermod.service.generic.impl.GenericProductDimensionDiffService;
import de.ubt.ai1.supermod.service.generic.impl.GenericProductDimensionFilterService;
import de.ubt.ai1.supermod.service.generic.impl.GenericProductSpaceCloneService;
import de.ubt.ai1.supermod.service.generic.impl.GenericProductSpaceDiffService;
import de.ubt.ai1.supermod.service.generic.impl.GenericProductSpaceElementsRestrictionService;
import de.ubt.ai1.supermod.service.generic.impl.GenericProductSpaceFilterService;
import de.ubt.ai1.supermod.service.generic.impl.GenericRepositoryCloneService;
import de.ubt.ai1.supermod.service.generic.impl.GenericRepositoryMergeService;
import de.ubt.ai1.supermod.service.generic.impl.GenericRepositoryProjectionService;
import de.ubt.ai1.supermod.service.generic.impl.GenericRevisionGraphProvider;
import de.ubt.ai1.supermod.service.generic.impl.GenericVisibilityForestMergeService;
import de.ubt.ai1.supermod.service.generic.impl.GenericVisibilityMergeService;

/**
 * This Guice module defines a set of module bindings of the interfaces 
 * declared in the package {@link de.ubt.ai1.supermod.service} to generic
 * implementations in {@link de.ubt.ai1.supermod.service.generic.impl}.
 * Clients should integrate this modules in a Guice injector if they want to
 * make use of the generic implementations. Implementations may refer to other
 * service interfaces by means of dependency injection.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	29.07.2014
 */
public class SuperModGenericModule extends AbstractModule {

	/* (non-Javadoc)
	 * @see com.google.inject.AbstractModule#configure()
	 */
	@Override
	protected void configure() {
		bind(IVisibilityMergeService.class)
				.to(GenericVisibilityMergeService.class);
		bind(IProductDimensionCloneService.class)
				.to(GenericProductDimensionCloneService.class);
		bind(IProductDimensionDiffService.class)
				.to(GenericProductDimensionDiffService.class);
		bind(IProductDimensionFilterService.class)
				.to(GenericProductDimensionFilterService.class);
		bind(IProductSpaceCloneService.class)
				.to(GenericProductSpaceCloneService.class);
		bind(IProductSpaceDiffService.class)
				.to(GenericProductSpaceDiffService.class);
		bind(IElementDeletionService.class)
				.to(GenericElementDeletionService.class);
		bind(IProductSpaceFilterService.class)
				.to(GenericProductSpaceFilterService.class);
		bind(IProductSpaceElementsRestrictionService.class)
				.to(GenericProductSpaceElementsRestrictionService.class);
		bind(IVisibilityUpdateService.class)
				.to(GenericCachedVisibilityUpdateService.class);
		bind(IVisibilityForestMergeService.class)
				.to(GenericVisibilityForestMergeService.class);
		bind(IRepositoryProjectionService.class)
				.to(GenericRepositoryProjectionService.class);
		bind(IRepositoryCloneService.class)
				.to(GenericRepositoryCloneService.class);
		bind(IRepositoryMergeService.class)
				.to(GenericRepositoryMergeService.class);
		bind(IRevisionGraphProvider.class)
				.to(GenericRevisionGraphProvider.class);
		bind(IOptionResolver.class)
				.to(GenericOptionResolver.class);
	}

}
