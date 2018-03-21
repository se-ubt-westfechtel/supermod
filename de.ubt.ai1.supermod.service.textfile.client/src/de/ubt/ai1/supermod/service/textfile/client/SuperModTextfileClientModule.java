/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/

package de.ubt.ai1.supermod.service.textfile.client;

import com.google.inject.AbstractModule;

import de.ubt.ai1.supermod.service.file.client.IVersionedFileContentConflictMarkerGenerator;
import de.ubt.ai1.supermod.service.file.client.IVersionedFileContentExportService;
import de.ubt.ai1.supermod.service.file.client.IVersionedFileContentImportService;
import de.ubt.ai1.supermod.service.file.client.IVersionedFileContentValidationService;
import de.ubt.ai1.supermod.service.textfile.Textfile;
import de.ubt.ai1.supermod.service.textfile.client.impl.TextFileContentConflictMarkerGenerator;
import de.ubt.ai1.supermod.service.textfile.client.impl.TextFileContentExportService;
import de.ubt.ai1.supermod.service.textfile.client.impl.TextFileContentImportService;
import de.ubt.ai1.supermod.service.textfile.client.impl.TextFileContentValidationService;

/**
 * This Guice module defines bindings for the implementation of client service
 * interfaces specific to the versioned file content type 'plain text file'.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	31.07.2014
 */
public class SuperModTextfileClientModule extends AbstractModule {

	/* (non-Javadoc)
	 * @see com.google.inject.AbstractModule#configure()
	 */
	@Override
	protected void configure() {
		bind(IVersionedFileContentExportService.class)
				.annotatedWith(Textfile.class)
				.to(TextFileContentExportService.class);
		bind(IVersionedFileContentImportService.class)
				.annotatedWith(Textfile.class)
				.to(TextFileContentImportService.class);
		bind(IVersionedFileContentValidationService.class)
				.annotatedWith(Textfile.class)
				.to(TextFileContentValidationService.class);
		bind(IVersionedFileContentConflictMarkerGenerator.class)
				.annotatedWith(Textfile.class)
				.to(TextFileContentConflictMarkerGenerator.class);
	}

}
