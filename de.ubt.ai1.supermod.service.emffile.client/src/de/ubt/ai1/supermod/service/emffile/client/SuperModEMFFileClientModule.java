/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/

package de.ubt.ai1.supermod.service.emffile.client;

import com.google.inject.AbstractModule;

import de.ubt.ai1.supermod.service.emffile.EMFFile;
import de.ubt.ai1.supermod.service.emffile.client.impl.EMFFileContentConflictMarkerGenerator;
import de.ubt.ai1.supermod.service.emffile.client.impl.EMFFileContentExportService;
import de.ubt.ai1.supermod.service.emffile.client.impl.EMFFileContentImportService;
import de.ubt.ai1.supermod.service.emffile.client.impl.EMFFileContentValidationService;
import de.ubt.ai1.supermod.service.emffile.client.impl.ReverseBracketingUUIDConverter;
import de.ubt.ai1.supermod.service.file.client.IVersionedFileContentConflictMarkerGenerator;
import de.ubt.ai1.supermod.service.file.client.IVersionedFileContentExportService;
import de.ubt.ai1.supermod.service.file.client.IVersionedFileContentImportService;
import de.ubt.ai1.supermod.service.file.client.IVersionedFileContentValidationService;

/**
 * Guice module defining a set of bindings of interfaces of client service
 * interfaces to implementations specific to the EMF file content type.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	31.07.2014
 */
public class SuperModEMFFileClientModule extends AbstractModule {

	/* (non-Javadoc)
	 * @see com.google.inject.AbstractModule#configure()
	 */
	@Override
	protected void configure() {
		bind(IVersionedFileContentExportService.class)
				.annotatedWith(EMFFile.class)
				.to(EMFFileContentExportService.class);
		bind(IVersionedFileContentImportService.class)
				.annotatedWith(EMFFile.class)
				.to(EMFFileContentImportService.class);
		bind(IVersionedFileContentValidationService.class)
				.annotatedWith(EMFFile.class)
				.to(EMFFileContentValidationService.class);
		bind(IVersionedFileContentConflictMarkerGenerator.class)
				.annotatedWith(EMFFile.class)
				.to(EMFFileContentConflictMarkerGenerator.class);
		bind(IUUIDConverter.class)
				.to(ReverseBracketingUUIDConverter.class);
	}

}
