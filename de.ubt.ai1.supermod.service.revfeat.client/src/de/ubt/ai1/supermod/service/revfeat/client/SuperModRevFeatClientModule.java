/******************************************************************************
 * Copyright (c) 2018 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.service.revfeat.client;

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
import de.ubt.ai1.supermod.service.revfeat.client.impl.RevFeatAmbitionCorrectionService;
import de.ubt.ai1.supermod.service.revfeat.client.impl.RevFeatAmbitionReservationService;
import de.ubt.ai1.supermod.service.revfeat.client.impl.RevFeatCompositeAmbitionAndChoiceSpecificationService;
import de.ubt.ai1.supermod.service.revfeat.client.impl.RevFeatCompositeAmbitionSpecificationService;
import de.ubt.ai1.supermod.service.revfeat.client.impl.RevFeatCompositeChoiceMigrationService;
import de.ubt.ai1.supermod.service.revfeat.client.impl.RevFeatCompositeChoiceSpecificationService;
import de.ubt.ai1.supermod.service.revfeat.client.impl.RevFeatCompositeChoiceUpdatingService;
import de.ubt.ai1.supermod.service.revfeat.client.impl.RevFeatDefaultResolver;
import de.ubt.ai1.supermod.service.revfeat.client.impl.RevFeatRevisionChoiceSpecificationService;
import de.ubt.ai1.supermod.service.revfeat.client.impl.RevFeatSingleWriteSetAssignmentService;
import de.ubt.ai1.supermod.service.revfeat.client.impl.RevFeatVersionLabellingService;
import de.ubt.ai1.supermod.service.revfeat.client.impl.RevFeatVersionSpaceEditingService;
import de.ubt.ai1.supermod.service.revfeat.client.impl.RevFeatVersionSpaceInitializationService;
import de.ubt.ai1.supermod.service.revision.Revision;

/**
 * Guice module bindings for the rev-feat version space, which uses the change
 * space in order to connect a revision space and a feature model. Adds 
 * dependencies relevant to client applications.
 * 
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>,
 * 			Johannes Schroepfer <Johannes.M.Schroepfer(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	2018-01-09
 */
public class SuperModRevFeatClientModule extends AbstractModule {

	/* (non-Javadoc)
	 * @see com.google.inject.AbstractModule#configure()
	 */
	@Override
	protected void configure() {
		bind(IAmbitionCorrectionService.class)
				.to(RevFeatAmbitionCorrectionService.class);
		bind(IAmbitionReservationService.class)
				.to(RevFeatAmbitionReservationService.class);
		bind(ICompositeAmbitionSpecificationService.class)
				.to(RevFeatCompositeAmbitionSpecificationService.class);
		bind(ICompositeChoiceMigrationService.class)
				.to(RevFeatCompositeChoiceMigrationService.class);
		bind(ICompositeChoiceSpecificationService.class)
				.to(RevFeatCompositeChoiceSpecificationService.class);
		bind(ICompositeChoiceUpdatingService.class)
				.to(RevFeatCompositeChoiceUpdatingService.class);
		bind(IVersionSpaceEditingService.class)
				.to(RevFeatVersionSpaceEditingService.class);
		bind(IVersionSpaceInitializationService.class)
				.to(RevFeatVersionSpaceInitializationService.class);
		bind(IVersionLabellingService.class)
				.to(RevFeatVersionLabellingService.class);
		bind(IWriteSetAssignmentService.class)
				.to(RevFeatSingleWriteSetAssignmentService.class);
		bind(IChoiceSpecificationService.class)
				.annotatedWith(Revision.class)
				.to(RevFeatRevisionChoiceSpecificationService.class);
		bind(ICompositeAmbitionAndChoiceSpecificationService.class)
				.to(RevFeatCompositeAmbitionAndChoiceSpecificationService.class);
		bind(IDefaultResolver.class)
				.to(RevFeatDefaultResolver.class);
	}

}
