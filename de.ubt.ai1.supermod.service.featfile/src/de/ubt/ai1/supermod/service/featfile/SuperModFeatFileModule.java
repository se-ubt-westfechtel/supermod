/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.service.featfile;

import com.google.inject.AbstractModule;

import de.ubt.ai1.supermod.service.IProductSpaceCloneService;
import de.ubt.ai1.supermod.service.IProductSpaceFilterService;
import de.ubt.ai1.supermod.service.IProductSpaceMatchService;
import de.ubt.ai1.supermod.service.IProductSpaceMergeService;
import de.ubt.ai1.supermod.service.featfile.impl.FeatFileProductDimensionProvider;
import de.ubt.ai1.supermod.service.featfile.impl.FeatFileProductSpaceCloneService;
import de.ubt.ai1.supermod.service.featfile.impl.FeatFileProductSpaceFilterService;
import de.ubt.ai1.supermod.service.featfile.impl.FeatFileProductSpaceMatchService;
import de.ubt.ai1.supermod.service.featfile.impl.FeatFileProductSpaceMergeService;
import de.ubt.ai1.supermod.service.feature.IFeatureProductDimensionProvider;
import de.ubt.ai1.supermod.service.file.IVersionedFileSystemProvider;

/**
 * This module provides service bindings for a product space which consists of
 * two product dimensions, being a feature model and a versioned file system.
 * The bindings refer to a subset of interfaces defined in the SuperMod service
 * package* {@link de.ubt.ai1.supermod.service} and binds implementations from
 * {@link de.ubt.ai1.supermod.service.featfile.impl} to them.
 * 
 * @author Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version 0.1.0
 * @since 0.1.0
 * @date 02.03.2015
 */
public class SuperModFeatFileModule extends AbstractModule {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.google.inject.AbstractModule#configure()
	 */
	@Override
	protected void configure() {
		bind(IProductSpaceCloneService.class).to(
				FeatFileProductSpaceCloneService.class);
		bind(IProductSpaceFilterService.class).to(
				FeatFileProductSpaceFilterService.class);
		bind(IProductSpaceMatchService.class).to(
				FeatFileProductSpaceMatchService.class);
		bind(IProductSpaceMergeService.class).to(
				FeatFileProductSpaceMergeService.class);
		bind(IVersionedFileSystemProvider.class).to(
				FeatFileProductDimensionProvider.class);
		bind(IFeatureProductDimensionProvider.class).to(
				FeatFileProductDimensionProvider.class);
	}

}
