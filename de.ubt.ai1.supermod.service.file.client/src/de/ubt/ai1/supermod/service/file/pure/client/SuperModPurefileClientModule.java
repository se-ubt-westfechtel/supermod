/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/

package de.ubt.ai1.supermod.service.file.pure.client;

import com.google.inject.AbstractModule;

import de.ubt.ai1.supermod.service.client.IProductSpaceExportPostProcessor;
import de.ubt.ai1.supermod.service.client.IProductSpaceExportService;
import de.ubt.ai1.supermod.service.client.IProductSpaceImportPostProcessor;
import de.ubt.ai1.supermod.service.client.IProductSpaceImportService;
import de.ubt.ai1.supermod.service.client.IProductSpaceInitializationService;
import de.ubt.ai1.supermod.service.client.IProductSpaceValidationService;
import de.ubt.ai1.supermod.service.client.ISingleVersionProductSpaceDescriptorInitializationService;
import de.ubt.ai1.supermod.service.client.ISingleVersionProductSpaceDescriptorSelectionService;
import de.ubt.ai1.supermod.service.file.client.ISingleVersionFileSystemDescriptorProvider;
import de.ubt.ai1.supermod.service.file.pure.client.impl.PurefileProductSpaceExportPostProcessor;
import de.ubt.ai1.supermod.service.file.pure.client.impl.PurefileProductSpaceExportService;
import de.ubt.ai1.supermod.service.file.pure.client.impl.PurefileProductSpaceImportPostProcessor;
import de.ubt.ai1.supermod.service.file.pure.client.impl.PurefileProductSpaceImportService;
import de.ubt.ai1.supermod.service.file.pure.client.impl.PurefileProductSpaceInitializationService;
import de.ubt.ai1.supermod.service.file.pure.client.impl.PurefileProductSpaceValidationService;
import de.ubt.ai1.supermod.service.file.pure.client.impl.PurefileSingleVersionFileSystemDescriptorProvider;
import de.ubt.ai1.supermod.service.file.pure.client.impl.PurefileSingleVersionProductSpaceDescriptorInitializationService;
import de.ubt.ai1.supermod.service.file.pure.client.impl.PurefileSingleVersionProductSpaceDescriptorSelectionService;

/**
 * Guice bindings which defines module bindings for the 'purefile' product
 * space, which consists of one product dimension, a versioned file system.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	31.07.2014
 */
public class SuperModPurefileClientModule extends AbstractModule {

	/* (non-Javadoc)
	 * @see com.google.inject.AbstractModule#configure()
	 */
	@Override
	protected void configure() {
		bind(IProductSpaceExportPostProcessor.class)
				.to(PurefileProductSpaceExportPostProcessor.class);
		bind(IProductSpaceExportService.class)
				.to(PurefileProductSpaceExportService.class);
		bind(IProductSpaceImportPostProcessor.class)
				.to(PurefileProductSpaceImportPostProcessor.class);
		bind(IProductSpaceImportService.class)
				.to(PurefileProductSpaceImportService.class);
		bind(IProductSpaceInitializationService.class)
				.to(PurefileProductSpaceInitializationService.class);
		bind(IProductSpaceValidationService.class)
				.to(PurefileProductSpaceValidationService.class);
		bind(ISingleVersionProductSpaceDescriptorSelectionService.class)
				.to(PurefileSingleVersionProductSpaceDescriptorSelectionService.class);
		bind(ISingleVersionProductSpaceDescriptorInitializationService.class)
				.to(PurefileSingleVersionProductSpaceDescriptorInitializationService.class);
		bind(ISingleVersionFileSystemDescriptorProvider.class)
				.to(PurefileSingleVersionFileSystemDescriptorProvider.class);
	}

}
