/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/

package de.ubt.ai1.supermod.service.file.pure;

import com.google.inject.AbstractModule;

import de.ubt.ai1.supermod.service.IProductSpaceCloneService;
import de.ubt.ai1.supermod.service.IProductSpaceFilterService;
import de.ubt.ai1.supermod.service.IProductSpaceMatchService;
import de.ubt.ai1.supermod.service.IProductSpaceMergeService;
import de.ubt.ai1.supermod.service.file.IVersionedFileSystemProvider;
import de.ubt.ai1.supermod.service.file.pure.impl.PurefileProductSpaceCloneService;
import de.ubt.ai1.supermod.service.file.pure.impl.PurefileProductSpaceFilterService;
import de.ubt.ai1.supermod.service.file.pure.impl.PurefileProductSpaceMatchService;
import de.ubt.ai1.supermod.service.file.pure.impl.PurefileProductSpaceMergeService;
import de.ubt.ai1.supermod.service.file.pure.impl.PurefileVersionedFileSystemProvider;

/**
 * This module provides service bindings for a product space which consists of
 * only one product dimension, being a versioned file systems. The bindings
 * refer to a subset of interfaces defined in the SuperMod service package
 * {@link de.ubt.ai1.supermod.service} and binds implementations from {@link
 * de.ubt.ai1.supermod.service.file.pure.impl} to them.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	30.07.2014
 */
public class SuperModPurefileModule extends AbstractModule {

	/* (non-Javadoc)
	 * @see com.google.inject.AbstractModule#configure()
	 */
	@Override
	protected void configure() {
		bind(IProductSpaceCloneService.class)
				.to(PurefileProductSpaceCloneService.class);
		bind(IProductSpaceFilterService.class)
				.to(PurefileProductSpaceFilterService.class);
		bind(IProductSpaceMatchService.class)
				.to(PurefileProductSpaceMatchService.class);
		bind(IProductSpaceMergeService.class)
				.to(PurefileProductSpaceMergeService.class);
		bind(IVersionedFileSystemProvider.class)
				.to(PurefileVersionedFileSystemProvider.class);
	}

}
