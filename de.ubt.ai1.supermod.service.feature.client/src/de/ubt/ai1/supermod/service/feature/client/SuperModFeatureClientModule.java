/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.service.feature.client;

import com.google.inject.AbstractModule;

import de.ubt.ai1.supermod.service.client.IAmbitionSpecificationService;
import de.ubt.ai1.supermod.service.client.IChoiceMigrationService;
import de.ubt.ai1.supermod.service.client.IChoiceSpecificationService;
import de.ubt.ai1.supermod.service.client.IProductDimensionExportService;
import de.ubt.ai1.supermod.service.client.IProductDimensionImportPostProcessor;
import de.ubt.ai1.supermod.service.client.IProductDimensionImportService;
import de.ubt.ai1.supermod.service.client.IProductDimensionInitializationService;
import de.ubt.ai1.supermod.service.client.IProductDimensionValidationService;
import de.ubt.ai1.supermod.service.client.ISingleVersionProductDimensionDescriptorInitializationService;
import de.ubt.ai1.supermod.service.client.IVersionDimensionEditingService;
import de.ubt.ai1.supermod.service.client.IVersionDimensionInitializationService;
import de.ubt.ai1.supermod.service.client.IVersionLabellingService;
import de.ubt.ai1.supermod.service.feature.Feature;
import de.ubt.ai1.supermod.service.feature.client.impl.FeatureAmbitionSpecificationService;
import de.ubt.ai1.supermod.service.feature.client.impl.FeatureChoiceMigrationService;
import de.ubt.ai1.supermod.service.feature.client.impl.FeatureChoiceSpecificationService;
import de.ubt.ai1.supermod.service.feature.client.impl.FeatureConfigurationLabellingService;
import de.ubt.ai1.supermod.service.feature.client.impl.FeatureModelEditingService;
import de.ubt.ai1.supermod.service.feature.client.impl.FeatureModelExportService;
import de.ubt.ai1.supermod.service.feature.client.impl.FeatureModelImportPostProcessor;
import de.ubt.ai1.supermod.service.feature.client.impl.FeatureModelImportService;
import de.ubt.ai1.supermod.service.feature.client.impl.FeatureModelInitializationService;
import de.ubt.ai1.supermod.service.feature.client.impl.FeatureModelValidationService;
import de.ubt.ai1.supermod.service.feature.client.impl.SingleVersionFeatureModelDescriptorInitializationService;

/**
 * Provides a set of Guice bindings of interfaces defined in the package
 * {@link de.ubt.ai1.supermod.service.client} to implementations specific to the
 * hybrid dimension type {@link de.ubt.ai1.supermod.service.feature.Feature}.
 * All bindings are relevant to SuperMod client applications only.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	27.10.2014
 */
public class SuperModFeatureClientModule extends AbstractModule {

	/* (non-Javadoc)
	 * @see com.google.inject.AbstractModule#configure()
	 */
	@Override
	protected void configure() {
		bind(IAmbitionSpecificationService.class)
				.annotatedWith(Feature.class)
				.to(FeatureAmbitionSpecificationService.class);
		bind(IChoiceMigrationService.class)
				.annotatedWith(Feature.class)
				.to(FeatureChoiceMigrationService.class);
		bind(IChoiceSpecificationService.class)
				.annotatedWith(Feature.class)
				.to(FeatureChoiceSpecificationService.class);
		bind(IVersionDimensionEditingService.class)
				.annotatedWith(Feature.class)
				.to(FeatureModelEditingService.class);
		bind(IProductDimensionExportService.class)
				.annotatedWith(Feature.class)
				.to(FeatureModelExportService.class);
		bind(IProductDimensionImportPostProcessor.class)
				.annotatedWith(Feature.class)
				.to(FeatureModelImportPostProcessor.class);
		bind(IProductDimensionImportService.class)
				.annotatedWith(Feature.class)
				.to(FeatureModelImportService.class);
		bind(IProductDimensionInitializationService.class)
				.annotatedWith(Feature.class)
				.to(FeatureModelInitializationService.class);
		bind(IVersionDimensionInitializationService.class)
				.annotatedWith(Feature.class)
				.to(FeatureModelInitializationService.class);
		bind(IProductDimensionValidationService.class)
				.annotatedWith(Feature.class)
				.to(FeatureModelValidationService.class);		
		bind(IVersionLabellingService.class)
				.annotatedWith(Feature.class)
				.to(FeatureConfigurationLabellingService.class);
		bind(ISingleVersionProductDimensionDescriptorInitializationService.class)
				.annotatedWith(Feature.class)
				.to(SingleVersionFeatureModelDescriptorInitializationService.class);
	}

}
