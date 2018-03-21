/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.service.collab.pure;

import com.google.inject.AbstractModule;

import de.ubt.ai1.supermod.service.IVersionSpaceMergeService;
import de.ubt.ai1.supermod.service.IVersionSpaceReconciliationService;
import de.ubt.ai1.supermod.service.collab.ICollabDimensionProvider;
import de.ubt.ai1.supermod.service.collab.pure.impl.PureCollabDimensionProvider;
import de.ubt.ai1.supermod.service.collab.pure.impl.PureCollabVersionSpaceMergeService;
import de.ubt.ai1.supermod.service.collab.pure.impl.PureCollabVersionSpaceReconciliationService;

/**
 * This module defines bindings for a pure collaborative version space.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	23.10.2015
 */
public class SuperModPureCollabModule extends AbstractModule {

	/* (non-Javadoc)
	 * @see com.google.inject.AbstractModule#configure()
	 */
	@Override
	protected void configure() {
		bind(ICollabDimensionProvider.class)
				.to(PureCollabDimensionProvider.class);
		bind(IVersionSpaceMergeService.class)
				.to(PureCollabVersionSpaceMergeService.class);
		bind(IVersionSpaceReconciliationService.class)
				.to(PureCollabVersionSpaceReconciliationService.class);
	}

}
