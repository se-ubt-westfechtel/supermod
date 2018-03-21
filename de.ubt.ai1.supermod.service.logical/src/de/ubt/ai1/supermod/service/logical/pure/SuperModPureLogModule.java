/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.service.logical.pure;

import com.google.inject.AbstractModule;

import de.ubt.ai1.supermod.service.IVersionSpaceMergeService;
import de.ubt.ai1.supermod.service.IVersionSpaceReconciliationService;
import de.ubt.ai1.supermod.service.logical.ILogicalDimensionProvider;
import de.ubt.ai1.supermod.service.logical.pure.impl.PureLogVersionSpaceReconciliationService;
import de.ubt.ai1.supermod.service.logical.pure.impl.PureLogicalDimensionProvider;
import de.ubt.ai1.supermod.service.logical.pure.impl.PureLogicalVersionSpaceMergeService;

/**
 * This module defines bindings for a pure logical version space.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	11.08.2014
 */
public class SuperModPureLogModule extends AbstractModule {

	/* (non-Javadoc)
	 * @see com.google.inject.AbstractModule#configure()
	 */
	@Override
	protected void configure() {
		bind(ILogicalDimensionProvider.class)
				.to(PureLogicalDimensionProvider.class);
		bind(IVersionSpaceMergeService.class)
				.to(PureLogicalVersionSpaceMergeService.class);
		bind(IVersionSpaceReconciliationService.class)
				.to(PureLogVersionSpaceReconciliationService.class);
	}

}
