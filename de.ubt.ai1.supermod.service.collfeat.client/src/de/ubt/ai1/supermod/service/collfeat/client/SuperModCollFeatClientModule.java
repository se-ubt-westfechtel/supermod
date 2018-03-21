/******************************************************************************
 * Copyright (c) 2018 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.service.collfeat.client;

import com.google.inject.AbstractModule;

import de.ubt.ai1.supermod.service.client.IAmbitionCorrectionService;
import de.ubt.ai1.supermod.service.client.IAmbitionReservationService;
import de.ubt.ai1.supermod.service.client.IChoiceSpecificationService;
import de.ubt.ai1.supermod.service.client.ICompositeAmbitionAndChoiceSpecificationService;
import de.ubt.ai1.supermod.service.client.ICompositeAmbitionSpecificationService;
import de.ubt.ai1.supermod.service.client.ICompositeChoiceMigrationService;
import de.ubt.ai1.supermod.service.client.ICompositeChoiceSpecificationService;
import de.ubt.ai1.supermod.service.client.ICompositeChoiceUpdatingService;
import de.ubt.ai1.supermod.service.client.IDefaultResolver;
import de.ubt.ai1.supermod.service.client.IVersionLabellingService;
import de.ubt.ai1.supermod.service.client.IVersionSpaceEditingService;
import de.ubt.ai1.supermod.service.client.IVersionSpaceInitializationService;
import de.ubt.ai1.supermod.service.client.IWriteSetAssignmentService;
import de.ubt.ai1.supermod.service.collab.Collab;
import de.ubt.ai1.supermod.service.collfeat.client.impl.CollFeatAmbitionCorrectionService;
import de.ubt.ai1.supermod.service.collfeat.client.impl.CollFeatAmbitionReservationService;
import de.ubt.ai1.supermod.service.collfeat.client.impl.CollFeatCompositeAmbitionAndChoiceSpecificationService;
import de.ubt.ai1.supermod.service.collfeat.client.impl.CollFeatCompositeAmbitionSpecificationService;
import de.ubt.ai1.supermod.service.collfeat.client.impl.CollFeatCompositeChoiceMigrationService;
import de.ubt.ai1.supermod.service.collfeat.client.impl.CollFeatCompositeChoiceSpecificationService;
import de.ubt.ai1.supermod.service.collfeat.client.impl.CollFeatCompositeChoiceUpdatingService;
import de.ubt.ai1.supermod.service.collfeat.client.impl.CollFeatDefaultResolver;
import de.ubt.ai1.supermod.service.collfeat.client.impl.CollFeatRevisionChoiceSpecificationService;
import de.ubt.ai1.supermod.service.collfeat.client.impl.CollFeatSingleWriteSetAssignmentService;
import de.ubt.ai1.supermod.service.collfeat.client.impl.CollFeatVersionLabellingService;
import de.ubt.ai1.supermod.service.collfeat.client.impl.CollFeatVersionSpaceEditingService;
import de.ubt.ai1.supermod.service.collfeat.client.impl.CollFeatVersionSpaceInitializationService;

/**
 * Guice module bindings for the coll-feat version space, which uses the change
 * space in order to connect a collab space and a feature model. Adds 
 * dependencies relevant to client applications.
 * 
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>,
 * 			Johannes Schroepfer <Johannes.M.Schroepfer(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	2018-01-09
 */
public class SuperModCollFeatClientModule extends AbstractModule {

	/* (non-Javadoc)
	 * @see com.google.inject.AbstractModule#configure()
	 */
	@Override
	protected void configure() {
		bind(IAmbitionCorrectionService.class)
				.to(CollFeatAmbitionCorrectionService.class);
		bind(IAmbitionReservationService.class)
				.to(CollFeatAmbitionReservationService.class);
		bind(ICompositeAmbitionSpecificationService.class)
				.to(CollFeatCompositeAmbitionSpecificationService.class);
		bind(ICompositeChoiceMigrationService.class)
				.to(CollFeatCompositeChoiceMigrationService.class);
		bind(ICompositeChoiceSpecificationService.class)
				.to(CollFeatCompositeChoiceSpecificationService.class);
		bind(ICompositeChoiceUpdatingService.class)
				.to(CollFeatCompositeChoiceUpdatingService.class);
		bind(IVersionSpaceEditingService.class)
				.to(CollFeatVersionSpaceEditingService.class);
		bind(IVersionSpaceInitializationService.class)
				.to(CollFeatVersionSpaceInitializationService.class);
		bind(IVersionLabellingService.class)
				.to(CollFeatVersionLabellingService.class);
		bind(IWriteSetAssignmentService.class)
				.to(CollFeatSingleWriteSetAssignmentService.class);
		bind(IChoiceSpecificationService.class)
				.annotatedWith(Collab.class)
				.to(CollFeatRevisionChoiceSpecificationService.class);
		bind(ICompositeAmbitionAndChoiceSpecificationService.class)
				.to(CollFeatCompositeAmbitionAndChoiceSpecificationService.class);
		bind(IDefaultResolver.class)
				.to(CollFeatDefaultResolver.class);
	}

}
