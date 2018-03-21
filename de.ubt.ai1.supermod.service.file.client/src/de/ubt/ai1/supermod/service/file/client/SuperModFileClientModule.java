/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/

package de.ubt.ai1.supermod.service.file.client;

import com.google.inject.AbstractModule;

import de.ubt.ai1.supermod.service.client.IProductDimensionExportPostProcessor;
import de.ubt.ai1.supermod.service.client.IProductDimensionExportService;
import de.ubt.ai1.supermod.service.client.IProductDimensionImportPostProcessor;
import de.ubt.ai1.supermod.service.client.IProductDimensionImportService;
import de.ubt.ai1.supermod.service.client.IProductDimensionInitializationService;
import de.ubt.ai1.supermod.service.client.IProductDimensionValidationService;
import de.ubt.ai1.supermod.service.client.ISingleVersionProductDimensionDescriptorInitializationService;
import de.ubt.ai1.supermod.service.client.ISingleVersionProductDimensionDescriptorSelectionService;
import de.ubt.ai1.supermod.service.client.IWorkspaceConflictMarker;
import de.ubt.ai1.supermod.service.file.File;
import de.ubt.ai1.supermod.service.file.client.impl.SHA1FileHasher;
import de.ubt.ai1.supermod.service.file.client.impl.VersionedFileSystemExportPostProcessor;
import de.ubt.ai1.supermod.service.file.client.impl.VersionedFileSystemExportService;
import de.ubt.ai1.supermod.service.file.client.impl.VersionedFileSystemFileVersioningHandler;
import de.ubt.ai1.supermod.service.file.client.impl.VersionedFileSystemImportPostProcessor;
import de.ubt.ai1.supermod.service.file.client.impl.VersionedFileSystemImportService;
import de.ubt.ai1.supermod.service.file.client.impl.VersionedFileSystemInitializationService;
import de.ubt.ai1.supermod.service.file.client.impl.VersionedFileSystemSingleVersionProductDimensionDescriptorInitializationService;
import de.ubt.ai1.supermod.service.file.client.impl.VersionedFileSystemSingleVersionProductDimensionDescriptorSelectionService;
import de.ubt.ai1.supermod.service.file.client.impl.VersionedFileSystemValidationService;
import de.ubt.ai1.supermod.service.file.client.impl.VersionedFileSystemWorkspaceConflictMarker;

/**
 * Provides a set of Guice bindings of interfaces defined in the packages
 * {@link de.ubt.ai1.supermod.service.client} and {@link
 * de.ubt.ai1.supermod.service.file.client} to implementations specific to the
 * product dimension type {@link de.ubt.ai1.supermod.service.file.File}. All
 * bindings are relevant to SuperMod client applications only.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	31.07.2014
 */
public class SuperModFileClientModule extends AbstractModule {

	/* (non-Javadoc)
	 * @see com.google.inject.AbstractModule#configure()
	 */
	@Override
	protected void configure() {		
		bind(IProductDimensionExportPostProcessor.class)
				.annotatedWith(File.class)
				.to(VersionedFileSystemExportPostProcessor.class);
		bind(IProductDimensionExportService.class)
				.annotatedWith(File.class)
				.to(VersionedFileSystemExportService.class);
		bind(IProductDimensionImportPostProcessor.class)
				.annotatedWith(File.class)
				.to(VersionedFileSystemImportPostProcessor.class);
		bind(IProductDimensionImportService.class)
				.annotatedWith(File.class)
				.to(VersionedFileSystemImportService.class);
		bind(IProductDimensionInitializationService.class)
				.annotatedWith(File.class)
				.to(VersionedFileSystemInitializationService.class);
		bind(IProductDimensionValidationService.class)
				.annotatedWith(File.class)
				.to(VersionedFileSystemValidationService.class);
		bind(ISingleVersionProductDimensionDescriptorSelectionService.class)
				.annotatedWith(File.class)
				.to(VersionedFileSystemSingleVersionProductDimensionDescriptorSelectionService.class);
		bind(ISingleVersionProductDimensionDescriptorInitializationService.class)
				.annotatedWith(File.class)
				.to(VersionedFileSystemSingleVersionProductDimensionDescriptorInitializationService.class);
		bind(IFileHasher.class)
				.to(SHA1FileHasher.class);
		bind(IFileVersioningHandler.class)
				.to(VersionedFileSystemFileVersioningHandler.class);
		bind(IWorkspaceConflictMarker.class)
				.to(VersionedFileSystemWorkspaceConflictMarker.class);
	}

}
