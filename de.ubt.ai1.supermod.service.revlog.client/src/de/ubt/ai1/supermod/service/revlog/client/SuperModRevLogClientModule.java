/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/

package de.ubt.ai1.supermod.service.revlog.client;

import com.google.inject.AbstractModule;

import de.ubt.ai1.supermod.service.client.IAmbitionCorrectionService;
import de.ubt.ai1.supermod.service.client.IAmbitionReservationService;
import de.ubt.ai1.supermod.service.client.ICompositeAmbitionSpecificationService;
import de.ubt.ai1.supermod.service.client.ICompositeChoiceMigrationService;
import de.ubt.ai1.supermod.service.client.ICompositeChoiceSpecificationService;
import de.ubt.ai1.supermod.service.client.ICompositeChoiceUpdatingService;
import de.ubt.ai1.supermod.service.client.IVersionLabellingService;
import de.ubt.ai1.supermod.service.client.IVersionSpaceEditingService;
import de.ubt.ai1.supermod.service.client.IVersionSpaceInitializationService;
import de.ubt.ai1.supermod.service.revlog.client.impl.RevLogAmbitionCorrectionService;
import de.ubt.ai1.supermod.service.revlog.client.impl.RevLogAmbitionReservationService;
import de.ubt.ai1.supermod.service.revlog.client.impl.RevLogCompositeAmbitionSpecificationService;
import de.ubt.ai1.supermod.service.revlog.client.impl.RevLogCompositeChoiceMigrationService;
import de.ubt.ai1.supermod.service.revlog.client.impl.RevLogCompositeChoiceSpecificationService;
import de.ubt.ai1.supermod.service.revlog.client.impl.RevLogCompositeChoiceUpdatingService;
import de.ubt.ai1.supermod.service.revlog.client.impl.RevLogVersionLabellingService;
import de.ubt.ai1.supermod.service.revlog.client.impl.RevLogVersionSpaceEditingService;
import de.ubt.ai1.supermod.service.revlog.client.impl.RevLogVersionSpaceInitializationService;

/**
 * Guice module bindings for the rev-log version space, which uses the change
 * space in order to connect a revision space and a low-level logical version
 * space. Adds dependencies relevant to client applications.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	01.08.2014
 */
public class SuperModRevLogClientModule extends AbstractModule {

	@Override
	protected void configure() {
		bind(IAmbitionCorrectionService.class)
				.to(RevLogAmbitionCorrectionService.class);
		bind(IAmbitionReservationService.class)
				.to(RevLogAmbitionReservationService.class);
		bind(ICompositeAmbitionSpecificationService.class)
				.to(RevLogCompositeAmbitionSpecificationService.class);
		bind(ICompositeChoiceMigrationService.class)
				.to(RevLogCompositeChoiceMigrationService.class);
		bind(ICompositeChoiceSpecificationService.class)
				.to(RevLogCompositeChoiceSpecificationService.class);
		bind(ICompositeChoiceUpdatingService.class)
				.to(RevLogCompositeChoiceUpdatingService.class);
		bind(IVersionSpaceEditingService.class)
				.to(RevLogVersionSpaceEditingService.class);
		bind(IVersionSpaceInitializationService.class)
				.to(RevLogVersionSpaceInitializationService.class);
		bind(IVersionLabellingService.class)
				.to(RevLogVersionLabellingService.class);
	}

}
