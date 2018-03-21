/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/

package de.ubt.ai1.supermod.service.emffile;

import com.google.inject.AbstractModule;

import de.ubt.ai1.supermod.service.IProductDimensionProxyResolutionService;
import de.ubt.ai1.supermod.service.emffile.impl.EMFFileContentMergeService;
import de.ubt.ai1.supermod.service.emffile.impl.EMFFileProxyResolutionService;
import de.ubt.ai1.supermod.service.emffile.impl.UUIDBasedEMFFileContentMatchService;
import de.ubt.ai1.supermod.service.file.IVersionedFileContentMatchService;
import de.ubt.ai1.supermod.service.file.IVersionedFileContentMergeService;

/**
 * Guice module which provides bindings specific to the EMF file content type.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	30.07.2014
 */
public class SuperModEMFFileModule extends AbstractModule {

	/* (non-Javadoc)
	 * @see com.google.inject.AbstractModule#configure()
	 */
	@Override
	protected void configure() {
		bind(IVersionedFileContentMergeService.class)
				.annotatedWith(EMFFile.class)
				.to(EMFFileContentMergeService.class);
		bind(IVersionedFileContentMatchService.class)
				.annotatedWith(EMFFile.class)
				.to(UUIDBasedEMFFileContentMatchService.class);
		bind(IProductDimensionProxyResolutionService.class)
				.annotatedWith(EMFFile.class)
				.to(EMFFileProxyResolutionService.class);
	}

}
