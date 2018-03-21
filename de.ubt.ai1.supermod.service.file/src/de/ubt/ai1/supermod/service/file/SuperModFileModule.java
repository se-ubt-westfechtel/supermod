/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/

package de.ubt.ai1.supermod.service.file;

import com.google.inject.AbstractModule;

import de.ubt.ai1.supermod.service.IProductDimensionCloneService;
import de.ubt.ai1.supermod.service.IProductDimensionFilterService;
import de.ubt.ai1.supermod.service.IProductDimensionMatchService;
import de.ubt.ai1.supermod.service.IProductDimensionMergeService;
import de.ubt.ai1.supermod.service.file.impl.VersionedFileSystemCloneService;
import de.ubt.ai1.supermod.service.file.impl.VersionedFileSystemFilterService;
import de.ubt.ai1.supermod.service.file.impl.VersionedFileSystemMatchService;
import de.ubt.ai1.supermod.service.file.impl.VersionedFileSystemMergeService;

/**
 * Binds a sub-set of product space related interface defined in the SuperMod
 * service module package {@link de.ubt.ai1.supermod.service} to
 * implementations specific to the product dimension type {@link File}, which
 * can be found in the package {@link de.ubt.ai1.supermod.service.file.impl}.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	30.07.2014
 */
public class SuperModFileModule extends AbstractModule {

	/* (non-Javadoc)
	 * @see com.google.inject.AbstractModule#configure()
	 */
	@Override
	protected void configure() {
		bind(IProductDimensionCloneService.class)
				.annotatedWith(File.class)
				.to(VersionedFileSystemCloneService.class);
		bind(IProductDimensionFilterService.class)
				.annotatedWith(File.class)
				.to(VersionedFileSystemFilterService.class);
		bind(IProductDimensionMatchService.class)
				.annotatedWith(File.class)
				.to(VersionedFileSystemMatchService.class);
		bind(IProductDimensionMergeService.class)
				.annotatedWith(File.class)
				.to(VersionedFileSystemMergeService.class);
	}

}
