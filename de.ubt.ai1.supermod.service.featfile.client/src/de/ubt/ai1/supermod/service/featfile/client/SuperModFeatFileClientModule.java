/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.service.featfile.client;

import com.google.inject.AbstractModule;

import de.ubt.ai1.supermod.service.client.IProductSpaceExportPostProcessor;
import de.ubt.ai1.supermod.service.client.IProductSpaceExportService;
import de.ubt.ai1.supermod.service.client.IProductSpaceImportPostProcessor;
import de.ubt.ai1.supermod.service.client.IProductSpaceImportService;
import de.ubt.ai1.supermod.service.client.IProductSpaceInitializationService;
import de.ubt.ai1.supermod.service.client.IProductSpaceValidationService;
import de.ubt.ai1.supermod.service.client.ISingleVersionProductSpaceDescriptorInitializationService;
import de.ubt.ai1.supermod.service.client.ISingleVersionProductSpaceDescriptorSelectionService;
import de.ubt.ai1.supermod.service.featfile.client.impl.FeatFileProductSpaceExportPostProcessor;
import de.ubt.ai1.supermod.service.featfile.client.impl.FeatFileProductSpaceExportService;
import de.ubt.ai1.supermod.service.featfile.client.impl.FeatFileProductSpaceImportPostProcessor;
import de.ubt.ai1.supermod.service.featfile.client.impl.FeatFileProductSpaceImportService;
import de.ubt.ai1.supermod.service.featfile.client.impl.FeatFileProductSpaceInitializationService;
import de.ubt.ai1.supermod.service.featfile.client.impl.FeatFileProductSpaceValidationService;
import de.ubt.ai1.supermod.service.featfile.client.impl.FeatFileSingleVersionDimensionDescriptorProvider;
import de.ubt.ai1.supermod.service.featfile.client.impl.FeatFileSingleVersionProductSpaceDescriptorInitializationService;
import de.ubt.ai1.supermod.service.featfile.client.impl.FeatFileSingleVersionProductSpaceDescriptorSelectionService;
import de.ubt.ai1.supermod.service.feature.client.ISingleVersionFeatureModelDescriptorProvider;
import de.ubt.ai1.supermod.service.file.client.ISingleVersionFileSystemDescriptorProvider;

/**
 * Guice client module bindings for the 'feat-file' product
 * space, which consists of one product dimension, a versioned file system.
 * 
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	02.03.2015
 */
public class SuperModFeatFileClientModule extends AbstractModule {

	/* (non-Javadoc)
	 * @see com.google.inject.AbstractModule#configure()
	 */
	@Override
	protected void configure() {
		bind(IProductSpaceExportPostProcessor.class).to(
				FeatFileProductSpaceExportPostProcessor.class);
		bind(IProductSpaceExportService.class).to(
				FeatFileProductSpaceExportService.class);
		bind(IProductSpaceImportPostProcessor.class).to(
				FeatFileProductSpaceImportPostProcessor.class);
		bind(IProductSpaceImportService.class).to(
				FeatFileProductSpaceImportService.class);
		bind(IProductSpaceInitializationService.class).to(
				FeatFileProductSpaceInitializationService.class);
		bind(IProductSpaceValidationService.class).to(
				FeatFileProductSpaceValidationService.class);
		bind(ISingleVersionProductSpaceDescriptorSelectionService.class)
				.to(FeatFileSingleVersionProductSpaceDescriptorSelectionService.class);
		bind(ISingleVersionProductSpaceDescriptorInitializationService.class)
				.to(FeatFileSingleVersionProductSpaceDescriptorInitializationService.class);
		bind(ISingleVersionFileSystemDescriptorProvider.class).to(
				FeatFileSingleVersionDimensionDescriptorProvider.class);
		bind(ISingleVersionFeatureModelDescriptorProvider.class).to(
				FeatFileSingleVersionDimensionDescriptorProvider.class);
	}

}
