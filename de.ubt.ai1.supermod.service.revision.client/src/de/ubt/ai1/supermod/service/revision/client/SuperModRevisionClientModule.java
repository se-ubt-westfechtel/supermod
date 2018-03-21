/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/

package de.ubt.ai1.supermod.service.revision.client;

import com.google.inject.AbstractModule;

import de.ubt.ai1.supermod.service.client.IAmbitionSpecificationService;
import de.ubt.ai1.supermod.service.client.IChoiceMigrationService;
import de.ubt.ai1.supermod.service.client.IChoiceSpecificationService;
import de.ubt.ai1.supermod.service.client.IChoiceUpdatingService;
import de.ubt.ai1.supermod.service.client.IDefaultResolver;
import de.ubt.ai1.supermod.service.client.IVersionDimensionInitializationService;
import de.ubt.ai1.supermod.service.client.IVersionLabellingService;
import de.ubt.ai1.supermod.service.revision.Revision;
import de.ubt.ai1.supermod.service.revision.client.impl.RevisionAmbitionSpecificationService;
import de.ubt.ai1.supermod.service.revision.client.impl.RevisionChoiceMigrationService;
import de.ubt.ai1.supermod.service.revision.client.impl.RevisionChoiceSpecificationService;
import de.ubt.ai1.supermod.service.revision.client.impl.RevisionChoiceUpdatingService;
import de.ubt.ai1.supermod.service.revision.client.impl.RevisionDefaultResolver;
import de.ubt.ai1.supermod.service.revision.client.impl.RevisionDimensionInitializationService;
import de.ubt.ai1.supermod.service.revision.client.impl.RevisionLabellingService;

/**
 * Guice module bindings for client service implementations specific to the
 * revision version dimension of SuperMod.
 * 
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	01.08.2014
 */
public class SuperModRevisionClientModule extends AbstractModule {

	/* (non-Javadoc)
	 * @see com.google.inject.AbstractModule#configure()
	 */
	@Override
	protected void configure() {
		bind(IAmbitionSpecificationService.class)
				.annotatedWith(Revision.class)
				.to(RevisionAmbitionSpecificationService.class);
		bind(IChoiceMigrationService.class)
				.annotatedWith(Revision.class)
				.to(RevisionChoiceMigrationService.class);
		bind(IChoiceSpecificationService.class)
				.annotatedWith(Revision.class)
				.to(RevisionChoiceSpecificationService.class);
		bind(IChoiceUpdatingService.class)
				.annotatedWith(Revision.class)
				.to(RevisionChoiceUpdatingService.class);
		bind(IVersionDimensionInitializationService.class)
				.annotatedWith(Revision.class)
				.to(RevisionDimensionInitializationService.class);
		bind(IVersionLabellingService.class)
				.annotatedWith(Revision.class)
				.to(RevisionLabellingService.class);
		bind(IDefaultResolver.class)
				.to(RevisionDefaultResolver.class);
	}

}
