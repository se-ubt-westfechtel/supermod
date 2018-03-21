/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.service.collab.client;

import com.google.inject.AbstractModule;

import de.ubt.ai1.supermod.service.client.IAmbitionSpecificationService;
import de.ubt.ai1.supermod.service.client.IChoiceMigrationService;
import de.ubt.ai1.supermod.service.client.IChoiceSpecificationService;
import de.ubt.ai1.supermod.service.client.IChoiceUpdatingService;
import de.ubt.ai1.supermod.service.client.IClonePostProcessor;
import de.ubt.ai1.supermod.service.client.IDefaultResolver;
import de.ubt.ai1.supermod.service.client.IPullPostProcessor;
import de.ubt.ai1.supermod.service.client.IPushPostProcessor;
import de.ubt.ai1.supermod.service.client.IPushPreProcessor;
import de.ubt.ai1.supermod.service.client.ISharePostProcessor;
import de.ubt.ai1.supermod.service.client.IVersionDimensionInitializationService;
import de.ubt.ai1.supermod.service.client.IVersionLabellingService;
import de.ubt.ai1.supermod.service.collab.Collab;
import de.ubt.ai1.supermod.service.collab.client.impl.CollabAmbitionSpecificationService;
import de.ubt.ai1.supermod.service.collab.client.impl.CollabChoiceMigrationService;
import de.ubt.ai1.supermod.service.collab.client.impl.CollabChoiceSpecificationService;
import de.ubt.ai1.supermod.service.collab.client.impl.CollabChoiceUpdatingService;
import de.ubt.ai1.supermod.service.collab.client.impl.CollabDefaultResolver;
import de.ubt.ai1.supermod.service.collab.client.impl.CollabDimensionInitializationService;
import de.ubt.ai1.supermod.service.collab.client.impl.CollabPullPostProcessor;
import de.ubt.ai1.supermod.service.collab.client.impl.CollabPushPreProcessor;
import de.ubt.ai1.supermod.service.collab.client.impl.CollabPushShareClonePostProcessor;
import de.ubt.ai1.supermod.service.collab.client.impl.CollabVersionLabellingService;

/**
 * Guice module bindings for client service implementations specific to the
 * collaborative version dimension of SuperMod.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	23.10.2015
 */
public class SuperModCollabClientModule extends AbstractModule {

	/* (non-Javadoc)
	 * @see com.google.inject.AbstractModule#configure()
	 */
	@Override
	protected void configure() {
		bind(IAmbitionSpecificationService.class)
				.annotatedWith(Collab.class)
				.to(CollabAmbitionSpecificationService.class);
		bind(IChoiceMigrationService.class)
				.annotatedWith(Collab.class)
				.to(CollabChoiceMigrationService.class);
		bind(IChoiceSpecificationService.class)
				.annotatedWith(Collab.class)
				.to(CollabChoiceSpecificationService.class);
		bind(IChoiceUpdatingService.class)
				.annotatedWith(Collab.class)
				.to(CollabChoiceUpdatingService.class);
		bind(IVersionDimensionInitializationService.class)
				.annotatedWith(Collab.class)
				.to(CollabDimensionInitializationService.class);
		bind(IVersionLabellingService.class)
				.annotatedWith(Collab.class)
				.to(CollabVersionLabellingService.class);
		bind(IClonePostProcessor.class)
				.to(CollabPushShareClonePostProcessor.class);
		bind(ISharePostProcessor.class)
				.to(CollabPushShareClonePostProcessor.class);
		bind(IPushPreProcessor.class)
				.to(CollabPushPreProcessor.class);
		bind(IPushPostProcessor.class)
				.to(CollabPushShareClonePostProcessor.class);
		bind(IPullPostProcessor.class)
				.to(CollabPullPostProcessor.class);
		bind(IDefaultResolver.class)
				.to(CollabDefaultResolver.class);
	}

}
