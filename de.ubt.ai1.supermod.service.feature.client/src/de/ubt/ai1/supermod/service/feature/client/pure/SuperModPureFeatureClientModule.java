/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.service.feature.client.pure;

import com.google.inject.AbstractModule;

import de.ubt.ai1.supermod.service.client.IAmbitionReservationService;
import de.ubt.ai1.supermod.service.client.ICompositeAmbitionSpecificationService;
import de.ubt.ai1.supermod.service.client.ICompositeChoiceMigrationService;
import de.ubt.ai1.supermod.service.client.ICompositeChoiceSpecificationService;
import de.ubt.ai1.supermod.service.client.ICompositeChoiceUpdatingService;
import de.ubt.ai1.supermod.service.client.IVersionLabellingService;
import de.ubt.ai1.supermod.service.client.IVersionSpaceEditingService;
import de.ubt.ai1.supermod.service.client.IVersionSpaceInitializationService;
import de.ubt.ai1.supermod.service.feature.client.impl.FeatureConfigurationLabellingService;
import de.ubt.ai1.supermod.service.feature.client.pure.impl.PureFeatureAmbitionReservationService;
import de.ubt.ai1.supermod.service.feature.client.pure.impl.PureFeatureCompositeAmbitionSpecificationService;
import de.ubt.ai1.supermod.service.feature.client.pure.impl.PureFeatureCompositeChoiceMigrationService;
import de.ubt.ai1.supermod.service.feature.client.pure.impl.PureFeatureCompositeChoiceSpecificationService;
import de.ubt.ai1.supermod.service.feature.client.pure.impl.PureFeatureCompositeChoiceUpdatingService;
import de.ubt.ai1.supermod.service.feature.client.pure.impl.PureFeatureVersionSpaceEditingService;
import de.ubt.ai1.supermod.service.feature.client.pure.impl.PureFeatureVersionSpaceInitializationService;

/**
 * Guice module bindings for the pure logical version space, which consists of
 * only a feature model version dimension.
 *
 * @author Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version 0.1.0
 * @since 0.1.0
 * @date 28.10.2014
 */
public class SuperModPureFeatureClientModule extends AbstractModule {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.google.inject.AbstractModule#configure()
	 */
	@Override
	protected void configure() {
		bind(IAmbitionReservationService.class)
				.to(PureFeatureAmbitionReservationService.class);
		bind(ICompositeAmbitionSpecificationService.class)
				.to(PureFeatureCompositeAmbitionSpecificationService.class);
		bind(ICompositeChoiceMigrationService.class)
				.to(PureFeatureCompositeChoiceMigrationService.class);
		bind(ICompositeChoiceSpecificationService.class)
				.to(PureFeatureCompositeChoiceSpecificationService.class);
		bind(ICompositeChoiceUpdatingService.class)
				.to(PureFeatureCompositeChoiceUpdatingService.class);
		bind(IVersionSpaceEditingService.class)
				.to(PureFeatureVersionSpaceEditingService.class);
		bind(IVersionSpaceInitializationService.class)
				.to(PureFeatureVersionSpaceInitializationService.class);
		bind(IVersionLabellingService.class)
				.to(FeatureConfigurationLabellingService.class);
	}

}
