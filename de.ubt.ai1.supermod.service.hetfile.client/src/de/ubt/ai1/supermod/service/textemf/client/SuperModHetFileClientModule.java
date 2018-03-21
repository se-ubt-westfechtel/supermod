/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/

package de.ubt.ai1.supermod.service.textemf.client;

import com.google.inject.AbstractModule;

import de.ubt.ai1.supermod.service.file.client.IFileSorter;
import de.ubt.ai1.supermod.service.file.client.IVersionedFileContentConflictMarkerGenerator;
import de.ubt.ai1.supermod.service.file.client.IVersionedFileContentExportService;
import de.ubt.ai1.supermod.service.file.client.IVersionedFileContentImportService;
import de.ubt.ai1.supermod.service.file.client.IVersionedFileContentValidationService;
import de.ubt.ai1.supermod.service.textemf.client.impl.HetFileConflictMarkerGeneratorRegistry;
import de.ubt.ai1.supermod.service.textemf.client.impl.HetFileContentExportServiceRegistry;
import de.ubt.ai1.supermod.service.textemf.client.impl.HetFileContentImportServiceRegistry;
import de.ubt.ai1.supermod.service.textemf.client.impl.HetFileContentValidationServiceRegistry;
import de.ubt.ai1.supermod.service.textemf.client.impl.HetFileSorter;

/**
 * Guice module bindings for SuperMod client applications with heterogeneous
 * file contents within a versioned file system product dimension.
 * 
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	01.08.2014
 */
public class SuperModHetFileClientModule extends AbstractModule {

	/* (non-Javadoc)
	 * @see com.google.inject.AbstractModule#configure()
	 */
	@Override
	protected void configure() {
		bind(IVersionedFileContentImportService.Registry.class)
				.to(HetFileContentImportServiceRegistry.class);
		bind(IVersionedFileContentExportService.Registry.class)
				.to(HetFileContentExportServiceRegistry.class);
		bind(IVersionedFileContentValidationService.Registry.class)
				.to(HetFileContentValidationServiceRegistry.class);
		bind(IVersionedFileContentConflictMarkerGenerator.Registry.class)
				.to(HetFileConflictMarkerGeneratorRegistry.class);
		bind(IFileSorter.class)
				.to(HetFileSorter.class);
	}

}
