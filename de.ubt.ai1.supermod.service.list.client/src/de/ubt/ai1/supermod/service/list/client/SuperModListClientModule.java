/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/

package de.ubt.ai1.supermod.service.list.client;

import com.google.inject.AbstractModule;

import de.ubt.ai1.supermod.service.client.IWriteSetAffectedElementsCalculator;
import de.ubt.ai1.supermod.service.list.client.impl.ListWriteSetAffectedElementsCalculator;

/**
 * Guice module defining bindings for the SuperMod list client module.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	31.07.2014
 */
public class SuperModListClientModule extends AbstractModule {

	/* (non-Javadoc)
	 * @see com.google.inject.AbstractModule#configure()
	 */
	@Override
	protected void configure() {
		bind(IWriteSetAffectedElementsCalculator.class)
				.to(ListWriteSetAffectedElementsCalculator.class);
	}

}
