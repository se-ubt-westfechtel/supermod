/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.service.feature;

import com.google.inject.AbstractModule;

import de.ubt.ai1.supermod.service.IProductDimensionCloneService;
import de.ubt.ai1.supermod.service.IProductDimensionFilterService;
import de.ubt.ai1.supermod.service.IProductDimensionMatchService;
import de.ubt.ai1.supermod.service.IProductDimensionMergeService;
import de.ubt.ai1.supermod.service.IVersionDimensionMergeService;
import de.ubt.ai1.supermod.service.IVersionDimensionReconciliationService;
import de.ubt.ai1.supermod.service.feature.impl.FeatureModelCloneService;
import de.ubt.ai1.supermod.service.feature.impl.FeatureModelFilterService;
import de.ubt.ai1.supermod.service.feature.impl.FeatureModelMatchService;
import de.ubt.ai1.supermod.service.feature.impl.FeatureModelMergeService;
import de.ubt.ai1.supermod.service.feature.impl.FeatureModelReconciliationService;

/**
 * Guice module which defines bindings for version space services specific to
 * the SuperMod feature model hybrid dimension.
 * 
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	27.10.2014
 */
public class SuperModFeatureModule extends AbstractModule {

	/* (non-Javadoc)
	 * @see com.google.inject.AbstractModule#configure()
	 */
	@Override
	protected void configure() {
		bind(IProductDimensionCloneService.class)
			.annotatedWith(Feature.class)
			.to(FeatureModelCloneService.class);
		bind(IProductDimensionFilterService.class)
			.annotatedWith(Feature.class)
			.to(FeatureModelFilterService.class);
		bind(IProductDimensionMatchService.class)
			.annotatedWith(Feature.class)
			.to(FeatureModelMatchService.class);
		bind(IProductDimensionMergeService.class)
			.annotatedWith(Feature.class)
			.to(FeatureModelMergeService.class);
		bind(IVersionDimensionMergeService.class)
			.annotatedWith(Feature.class)
			.to(FeatureModelMergeService.class);
		bind(IVersionDimensionReconciliationService.class)
			.annotatedWith(Feature.class)
			.to(FeatureModelReconciliationService.class);
	}

}
