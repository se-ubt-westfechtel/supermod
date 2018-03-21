/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/

package de.ubt.ai1.supermod.service.revision.client.pure;

import com.google.inject.AbstractModule;

import de.ubt.ai1.supermod.service.client.IAmbitionReservationService;
import de.ubt.ai1.supermod.service.client.ICompositeAmbitionSpecificationService;
import de.ubt.ai1.supermod.service.client.ICompositeChoiceMigrationService;
import de.ubt.ai1.supermod.service.client.ICompositeChoiceSpecificationService;
import de.ubt.ai1.supermod.service.client.ICompositeChoiceUpdatingService;
import de.ubt.ai1.supermod.service.client.IVersionLabellingService;
import de.ubt.ai1.supermod.service.client.IVersionSpaceEditingService;
import de.ubt.ai1.supermod.service.client.IVersionSpaceInitializationService;
import de.ubt.ai1.supermod.service.revision.client.impl.RevisionLabellingService;
import de.ubt.ai1.supermod.service.revision.client.pure.impl.PureRevAmbitionReservationService;
import de.ubt.ai1.supermod.service.revision.client.pure.impl.PureRevCompositeAmbitionSpecificationService;
import de.ubt.ai1.supermod.service.revision.client.pure.impl.PureRevCompositeChoiceMigrationService;
import de.ubt.ai1.supermod.service.revision.client.pure.impl.PureRevCompositeChoiceSpecificationService;
import de.ubt.ai1.supermod.service.revision.client.pure.impl.PureRevCompositeChoiceUpdatingService;
import de.ubt.ai1.supermod.service.revision.client.pure.impl.PureRevVersionSpaceEditingService;
import de.ubt.ai1.supermod.service.revision.client.pure.impl.PureRevVersionSpaceInitializationService;

/**
 * Guice module bindings for service implementations specific to a pure revision
 * version space, which realizes temporal versioning without logical variants.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	01.08.2014
 */
public class SuperModPureRevClientModule extends AbstractModule {

	/* (non-Javadoc)
	 * @see com.google.inject.AbstractModule#configure()
	 */
	@Override
	protected void configure() {
		bind(IAmbitionReservationService.class)
				.to(PureRevAmbitionReservationService.class);
		bind(ICompositeAmbitionSpecificationService.class)
				.to(PureRevCompositeAmbitionSpecificationService.class);
		bind(ICompositeChoiceMigrationService.class)
				.to(PureRevCompositeChoiceMigrationService.class);
		bind(ICompositeChoiceSpecificationService.class)
				.to(PureRevCompositeChoiceSpecificationService.class);
		bind(ICompositeChoiceUpdatingService.class)
				.to(PureRevCompositeChoiceUpdatingService.class);
		bind(IVersionSpaceEditingService.class)
				.to(PureRevVersionSpaceEditingService.class);
		bind(IVersionSpaceInitializationService.class)
				.to(PureRevVersionSpaceInitializationService.class);
		bind(IVersionLabellingService.class)
				.to(RevisionLabellingService.class);
	}

}
