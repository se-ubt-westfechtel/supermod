/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.service.collab.client.pure;

import com.google.inject.AbstractModule;

import de.ubt.ai1.supermod.service.client.IAmbitionReservationService;
import de.ubt.ai1.supermod.service.client.ICompositeAmbitionSpecificationService;
import de.ubt.ai1.supermod.service.client.ICompositeChoiceMigrationService;
import de.ubt.ai1.supermod.service.client.ICompositeChoiceSpecificationService;
import de.ubt.ai1.supermod.service.client.ICompositeChoiceUpdatingService;
import de.ubt.ai1.supermod.service.client.IVersionLabellingService;
import de.ubt.ai1.supermod.service.client.IVersionSpaceEditingService;
import de.ubt.ai1.supermod.service.client.IVersionSpaceInitializationService;
import de.ubt.ai1.supermod.service.collab.client.impl.CollabVersionLabellingService;
import de.ubt.ai1.supermod.service.collab.client.pure.impl.PureCollabAmbitionReservationService;
import de.ubt.ai1.supermod.service.collab.client.pure.impl.PureCollabCompositeAmbitionSpecificationService;
import de.ubt.ai1.supermod.service.collab.client.pure.impl.PureCollabCompositeChoiceMigrationService;
import de.ubt.ai1.supermod.service.collab.client.pure.impl.PureCollabCompositeChoiceSpecificationService;
import de.ubt.ai1.supermod.service.collab.client.pure.impl.PureCollabCompositeChoiceUpdatingService;
import de.ubt.ai1.supermod.service.collab.client.pure.impl.PureCollabVersionSpaceEditingService;
import de.ubt.ai1.supermod.service.collab.client.pure.impl.PureCollabVersionSpaceInitializationService;

/**
 * Guice module bindings for service implementations specific to a pure collab
 * version space, which realizes cooperative temporal versioning without
 * logical variants.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	28.10.2015
 */
public class SuperModPureCollabClientModule extends AbstractModule {

	/* (non-Javadoc)
	 * @see com.google.inject.AbstractModule#configure()
	 */
	@Override
	protected void configure() {
		bind(IAmbitionReservationService.class)
				.to(PureCollabAmbitionReservationService.class);
		bind(ICompositeAmbitionSpecificationService.class)
				.to(PureCollabCompositeAmbitionSpecificationService.class);
		bind(ICompositeChoiceMigrationService.class)
				.to(PureCollabCompositeChoiceMigrationService.class);
		bind(ICompositeChoiceSpecificationService.class)
				.to(PureCollabCompositeChoiceSpecificationService.class);
		bind(ICompositeChoiceUpdatingService.class)
				.to(PureCollabCompositeChoiceUpdatingService.class);
		bind(IVersionSpaceEditingService.class)
				.to(PureCollabVersionSpaceEditingService.class);
		bind(IVersionSpaceInitializationService.class)
				.to(PureCollabVersionSpaceInitializationService.class);
		bind(IVersionLabellingService.class)
				.to(CollabVersionLabellingService.class);
	}

}
