/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/

package de.ubt.ai1.supermod.service.list;

import com.google.inject.AbstractModule;

import de.ubt.ai1.supermod.service.IElementDeletionService;
import de.ubt.ai1.supermod.service.IProductSpaceElementsRestrictionService;
import de.ubt.ai1.supermod.service.list.impl.ListTransitiveElementDeletionService;
import de.ubt.ai1.supermod.service.list.impl.ListTransitiveElementsRestrictionService;

/**
 * A Guice module that defines the bindings for all services that have been
 * implemented in the package {@link de.ubt.ai.1supermod.service.list.impl}.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	30.07.2014
 */
public class SuperModListModule extends AbstractModule {

	/* (non-Javadoc)
	 * @see com.google.inject.AbstractModule#configure()
	 */
	@Override
	protected void configure() {
		bind(IElementDeletionService.class)
				.to(ListTransitiveElementDeletionService.class);
		bind(IProductSpaceElementsRestrictionService.class)
				.to(ListTransitiveElementsRestrictionService.class);
	}

}
