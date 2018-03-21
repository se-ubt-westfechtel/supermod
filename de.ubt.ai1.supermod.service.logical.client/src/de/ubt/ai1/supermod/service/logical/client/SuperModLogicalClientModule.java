/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/

package de.ubt.ai1.supermod.service.logical.client;

import com.google.inject.AbstractModule;

import de.ubt.ai1.supermod.service.client.IAmbitionSpecificationService;
import de.ubt.ai1.supermod.service.client.IChoiceMigrationService;
import de.ubt.ai1.supermod.service.client.IChoiceSpecificationService;
import de.ubt.ai1.supermod.service.client.IVersionDimensionEditingService;
import de.ubt.ai1.supermod.service.client.IVersionDimensionInitializationService;
import de.ubt.ai1.supermod.service.client.IVersionLabellingService;
import de.ubt.ai1.supermod.service.generic.client.impl.GenericVersionLabellingService;
import de.ubt.ai1.supermod.service.logical.Logical;
import de.ubt.ai1.supermod.service.logical.client.impl.LogicalAmbitionSpecificationService;
import de.ubt.ai1.supermod.service.logical.client.impl.LogicalChoiceMigrationService;
import de.ubt.ai1.supermod.service.logical.client.impl.LogicalChoiceSpecificationService;
import de.ubt.ai1.supermod.service.logical.client.impl.LogicalDimensionEditingService;
import de.ubt.ai1.supermod.service.logical.client.impl.LogicalDimensionInitializationService;

/**
 * Guice module bindings for client service implementations specific to the
 * low-level logical version dimension of SuperMod.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	01.08.2014
 */
public class SuperModLogicalClientModule extends AbstractModule {

	/* (non-Javadoc)
	 * @see com.google.inject.AbstractModule#configure()
	 */
	@Override
	protected void configure() {
		bind(IAmbitionSpecificationService.class)
				.annotatedWith(Logical.class)
				.to(LogicalAmbitionSpecificationService.class);
		bind(IChoiceMigrationService.class)
				.annotatedWith(Logical.class)
				.to(LogicalChoiceMigrationService.class);
		bind(IChoiceSpecificationService.class)
				.annotatedWith(Logical.class)
				.to(LogicalChoiceSpecificationService.class);
		bind(IVersionDimensionEditingService.class)
				.annotatedWith(Logical.class)
				.to(LogicalDimensionEditingService.class);
		bind(IVersionDimensionInitializationService.class)
				.annotatedWith(Logical.class)
				.to(LogicalDimensionInitializationService.class);
		bind(IVersionLabellingService.class)
				.annotatedWith(Logical.class)
				.to(GenericVersionLabellingService.class);
	}

}
