/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.service.revision.pure;

import com.google.inject.AbstractModule;

import de.ubt.ai1.supermod.service.IVersionSpaceMergeService;
import de.ubt.ai1.supermod.service.IVersionSpaceReconciliationService;
import de.ubt.ai1.supermod.service.revision.IRevisionDimensionProvider;
import de.ubt.ai1.supermod.service.revision.pure.impl.PureRevVersionSpaceReconciliationService;
import de.ubt.ai1.supermod.service.revision.pure.impl.PureRevisionDimensionProvider;
import de.ubt.ai1.supermod.service.revision.pure.impl.PureRevisionVersionSpaceMergeService;

/**
 * This module defines bindings for a pure revision version space.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	11.08.2014
 */
public class SuperModPureRevModule extends AbstractModule {

	/* (non-Javadoc)
	 * @see com.google.inject.AbstractModule#configure()
	 */
	@Override
	protected void configure() {
		bind(IRevisionDimensionProvider.class)
				.to(PureRevisionDimensionProvider.class);
		bind(IVersionSpaceMergeService.class)
				.to(PureRevisionVersionSpaceMergeService.class);
		bind(IVersionSpaceReconciliationService.class)
				.to(PureRevVersionSpaceReconciliationService.class);
	}

}
