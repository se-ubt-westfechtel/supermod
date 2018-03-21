/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.service.revlog;

import com.google.inject.AbstractModule;

import de.ubt.ai1.supermod.service.IVersionSpaceMergeService;
import de.ubt.ai1.supermod.service.IVersionSpaceReconciliationService;
import de.ubt.ai1.supermod.service.change.IChangeDimensionProvider;
import de.ubt.ai1.supermod.service.logical.ILogicalDimensionProvider;
import de.ubt.ai1.supermod.service.revision.IRevisionDimensionProvider;
import de.ubt.ai1.supermod.service.revlog.impl.RevLogDimensionProvider;
import de.ubt.ai1.supermod.service.revlog.impl.RevLogVersionSpaceMergeService;
import de.ubt.ai1.supermod.service.revlog.impl.RevLogVersionSpaceReconciliationService;

/**
 * Guice module bindings for the rev-log version space, which uses the change
 * space in order to connect a revision space and a low-level logical version
 * space.
 * 
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	11.08.2014
 */
public class SuperModRevLogModule extends AbstractModule {

	/* (non-Javadoc)
	 * @see com.google.inject.AbstractModule#configure()
	 */
	@Override
	protected void configure() {
		bind(ILogicalDimensionProvider.class)
				.to(RevLogDimensionProvider.class);
		bind(IRevisionDimensionProvider.class)
				.to(RevLogDimensionProvider.class);
		bind(IChangeDimensionProvider.class)
				.to(RevLogDimensionProvider.class);
		bind(IVersionSpaceMergeService.class)
				.to(RevLogVersionSpaceMergeService.class);
		bind(IVersionSpaceReconciliationService.class)
				.to(RevLogVersionSpaceReconciliationService.class);
	}

}
