/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.service.feature.pure;

import com.google.inject.AbstractModule;

import de.ubt.ai1.supermod.service.IVersionSpaceMergeService;
import de.ubt.ai1.supermod.service.IVersionSpaceReconciliationService;
import de.ubt.ai1.supermod.service.feature.IFeatureVersionDimensionProvider;
import de.ubt.ai1.supermod.service.feature.pure.impl.PureFeatureVersionDimensionProvider;
import de.ubt.ai1.supermod.service.feature.pure.impl.PureFeatureVersionSpaceMergeService;
import de.ubt.ai1.supermod.service.feature.pure.impl.PureFeatureVersionSpaceReconciliationService;

/**
 * This module defines bindings for a pure feature model version space.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	27.10.2014
 */
public class SuperModPureFeatureModule extends AbstractModule {

	/* (non-Javadoc)
	 * @see com.google.inject.AbstractModule#configure()
	 */
	@Override
	protected void configure() {
		bind(IFeatureVersionDimensionProvider.class)
			.to(PureFeatureVersionDimensionProvider.class);
		bind(IVersionSpaceMergeService.class)
			.to(PureFeatureVersionSpaceMergeService.class);
		bind(IVersionSpaceReconciliationService.class)
			.to(PureFeatureVersionSpaceReconciliationService.class);
	}

}
