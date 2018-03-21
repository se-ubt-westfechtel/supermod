/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/

package de.ubt.ai1.supermod.service.change.client;

import com.google.inject.AbstractModule;

import de.ubt.ai1.supermod.service.change.Change;
import de.ubt.ai1.supermod.service.change.client.impl.ChangeAmbitionSpecificationService;
import de.ubt.ai1.supermod.service.change.client.impl.ChangeDimensionInitializationService;
import de.ubt.ai1.supermod.service.change.client.impl.ChangeWriteSetAnalysisService;
import de.ubt.ai1.supermod.service.client.IAmbitionSpecificationService;
import de.ubt.ai1.supermod.service.client.IVersionDimensionInitializationService;
import de.ubt.ai1.supermod.service.client.IWriteSetAnalysisService;

/**
 * Guice module binding for client implementations specific to the change 
 * dimension.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	01.08.2014
 */
public class SuperModChangeClientModule extends AbstractModule {

	/* (non-Javadoc)
	 * @see com.google.inject.AbstractModule#configure()
	 */
	@Override
	protected void configure() {
		bind(IVersionDimensionInitializationService.class)
				.annotatedWith(Change.class)
				.to(ChangeDimensionInitializationService.class);
		bind(IAmbitionSpecificationService.class)
				.annotatedWith(Change.class)
				.to(ChangeAmbitionSpecificationService.class);
		bind(IWriteSetAnalysisService.class)
				.to(ChangeWriteSetAnalysisService.class);
	}

}
