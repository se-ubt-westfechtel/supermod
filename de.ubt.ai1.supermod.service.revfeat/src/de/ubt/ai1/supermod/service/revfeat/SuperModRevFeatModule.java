/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.service.revfeat;

import com.google.inject.AbstractModule;

import de.ubt.ai1.supermod.service.IVersionSpaceMergeService;
import de.ubt.ai1.supermod.service.IVersionSpaceReconciliationService;
import de.ubt.ai1.supermod.service.change.IChangeDimensionProvider;
import de.ubt.ai1.supermod.service.feature.IFeatureVersionDimensionProvider;
import de.ubt.ai1.supermod.service.revfeat.impl.RevFeatVersionDimensionProvider;
import de.ubt.ai1.supermod.service.revfeat.impl.RevFeatVersionSpaceMergeService;
import de.ubt.ai1.supermod.service.revfeat.impl.RevFeatVersionSpaceReconciliationService;
import de.ubt.ai1.supermod.service.revision.IRevisionDimensionProvider;

/**
 * Guice module bindings for the for SuperMod's rev-feat version space, which
 * consists of three version dimensions, being a revision dimension, a
 * time-variant feature dimension, and a change dimension, which is used to
 * interconnect the other two.
 *
 * @author Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version 0.1.0
 * @since 0.1.0
 * @date 02.03.2015
 */
public class SuperModRevFeatModule extends AbstractModule {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.google.inject.AbstractModule#configure()
	 */
	@Override
	protected void configure() {
		bind(IFeatureVersionDimensionProvider.class)
				.to(RevFeatVersionDimensionProvider.class);
		bind(IRevisionDimensionProvider.class)
				.to(RevFeatVersionDimensionProvider.class);
		bind(IChangeDimensionProvider.class)
				.to(RevFeatVersionDimensionProvider.class);
		bind(IVersionSpaceMergeService.class)
				.to(RevFeatVersionSpaceMergeService.class);
		bind(IVersionSpaceReconciliationService.class)
				.to(RevFeatVersionSpaceReconciliationService.class);
	}

}
