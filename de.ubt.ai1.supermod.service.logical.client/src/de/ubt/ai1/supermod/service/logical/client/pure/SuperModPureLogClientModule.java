/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/

package de.ubt.ai1.supermod.service.logical.client.pure;

import com.google.inject.AbstractModule;

import de.ubt.ai1.supermod.service.client.IAmbitionReservationService;
import de.ubt.ai1.supermod.service.client.ICompositeAmbitionSpecificationService;
import de.ubt.ai1.supermod.service.client.ICompositeChoiceMigrationService;
import de.ubt.ai1.supermod.service.client.ICompositeChoiceSpecificationService;
import de.ubt.ai1.supermod.service.client.ICompositeChoiceUpdatingService;
import de.ubt.ai1.supermod.service.client.IVersionSpaceEditingService;
import de.ubt.ai1.supermod.service.client.IVersionSpaceInitializationService;
import de.ubt.ai1.supermod.service.logical.client.pure.impl.PureLogAmbitionReservationService;
import de.ubt.ai1.supermod.service.logical.client.pure.impl.PureLogCompositeAmbitionSpecificationService;
import de.ubt.ai1.supermod.service.logical.client.pure.impl.PureLogCompositeChoiceMigrationService;
import de.ubt.ai1.supermod.service.logical.client.pure.impl.PureLogCompositeChoiceSpecificationService;
import de.ubt.ai1.supermod.service.logical.client.pure.impl.PureLogCompositeChoiceUpdatingService;
import de.ubt.ai1.supermod.service.logical.client.pure.impl.PureLogVersionSpaceEditingService;
import de.ubt.ai1.supermod.service.logical.client.pure.impl.PureLogVersionSpaceInitializationService;

/**
 * Guice module bindings for the pure logical version space, which consists of
 * only a low-level logical version dimension.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	01.08.2014
 */
public class SuperModPureLogClientModule extends AbstractModule {

	/* (non-Javadoc)
	 * @see com.google.inject.AbstractModule#configure()
	 */
	@Override
	protected void configure() {
		bind(IAmbitionReservationService.class)
				.to(PureLogAmbitionReservationService.class);
		bind(ICompositeAmbitionSpecificationService.class)
				.to(PureLogCompositeAmbitionSpecificationService.class);
		bind(ICompositeChoiceMigrationService.class)
				.to(PureLogCompositeChoiceMigrationService.class);
		bind(ICompositeChoiceSpecificationService.class)
				.to(PureLogCompositeChoiceSpecificationService.class);
		bind(ICompositeChoiceUpdatingService.class)
				.to(PureLogCompositeChoiceUpdatingService.class);
		bind(IVersionSpaceEditingService.class)
				.to(PureLogVersionSpaceEditingService.class);
		bind(IVersionSpaceInitializationService.class)
				.to(PureLogVersionSpaceInitializationService.class);
	}

}
