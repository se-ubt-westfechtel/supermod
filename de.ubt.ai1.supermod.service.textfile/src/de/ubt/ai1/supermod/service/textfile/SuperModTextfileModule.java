/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/

package de.ubt.ai1.supermod.service.textfile;

import com.google.inject.AbstractModule;

import de.ubt.ai1.supermod.service.file.IVersionedFileContentMatchService;
import de.ubt.ai1.supermod.service.file.IVersionedFileContentMergeService;
import de.ubt.ai1.supermod.service.textfile.impl.TextFileContentMatchService;
import de.ubt.ai1.supermod.service.textfile.impl.TextFileContentMergeService;

/**
 * Provides Guice module bindings of a subset of interfaces defined in the
 * module {@link de.ubt.ai1.supermod.service.file} to implementations which can
 * be found in {@link de.ubt.ai1.supermod.service.textfile.impl}. It provides
 * core functionality for handling plain text files within a versioned file
 * system product dimension.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	30.07.2014
 */
public class SuperModTextfileModule extends AbstractModule {

	/* (non-Javadoc)
	 * @see com.google.inject.AbstractModule#configure()
	 */
	@Override
	protected void configure() {
		bind(IVersionedFileContentMatchService.class)
				.annotatedWith(Textfile.class)
				.to(TextFileContentMatchService.class);
		bind(IVersionedFileContentMergeService.class)
				.annotatedWith(Textfile.class)
				.to(TextFileContentMergeService.class);
	}

}
