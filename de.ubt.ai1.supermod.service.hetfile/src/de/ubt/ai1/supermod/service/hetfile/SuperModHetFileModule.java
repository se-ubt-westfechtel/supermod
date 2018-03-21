/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/

package de.ubt.ai1.supermod.service.hetfile;

import com.google.inject.AbstractModule;

import de.ubt.ai1.supermod.service.IProductSpaceProxyResolutionService;
import de.ubt.ai1.supermod.service.file.IVersionedFileContentMatchService;
import de.ubt.ai1.supermod.service.file.IVersionedFileContentMergeService;
import de.ubt.ai1.supermod.service.hetfile.impl.HetFileMatchServiceRegistry;
import de.ubt.ai1.supermod.service.hetfile.impl.HetFileMergeServiceRegistry;
import de.ubt.ai1.supermod.service.hetfile.impl.HetFileProductSpaceProxyResolutionService;

/**
 * Guice module bindings for heterogeneous file contents within a versioned
 * file system product dimension.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	01.08.2014
 */
public class SuperModHetFileModule extends AbstractModule {

	/* (non-Javadoc)
	 * @see com.google.inject.AbstractModule#configure()
	 */
	@Override
	protected void configure() {
		bind(IVersionedFileContentMatchService.Registry.class)
				.to(HetFileMatchServiceRegistry.class);
		bind(IVersionedFileContentMergeService.Registry.class)
				.to(HetFileMergeServiceRegistry.class);
		bind(IProductSpaceProxyResolutionService.class)
				.to(HetFileProductSpaceProxyResolutionService.class);
	}

}
