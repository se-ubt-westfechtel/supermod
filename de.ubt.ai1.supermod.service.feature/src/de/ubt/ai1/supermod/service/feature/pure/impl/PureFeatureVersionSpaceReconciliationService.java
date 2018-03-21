/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.service.feature.pure.impl;

import com.google.inject.Inject;

import de.ubt.ai1.supermod.mm.core.VersionSpace;
import de.ubt.ai1.supermod.mm.feature.FeatureModel;
import de.ubt.ai1.supermod.service.IVersionDimensionReconciliationService;
import de.ubt.ai1.supermod.service.IVersionSpaceReconciliationService;
import de.ubt.ai1.supermod.service.feature.Feature;
import de.ubt.ai1.supermod.service.feature.IFeatureVersionDimensionProvider;

/**
 * An implementation of the version space reconciliation service interface which
 * involves the feature model version dimension reconciliation service.
 * 
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	28.10.2014
 */
public class PureFeatureVersionSpaceReconciliationService
implements IVersionSpaceReconciliationService {
	
	@Inject
	private IFeatureVersionDimensionProvider featureDimensionProvider;
	
	@Inject
	@Feature
	private IVersionDimensionReconciliationService featDimReconService;

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.client.
	 * IVersionSpaceReconciliationService#reconcileVersionSpace(
	 * de.ubt.ai1.supermod.mm.core.VersionSpace)
	 */
	@Override
	public void reconcileVersionSpace(VersionSpace vs) {
		FeatureModel featDim = featureDimensionProvider.getFeatureDimension(vs);
		featDimReconService.reconcileVersionDimension(featDim);
	}

}
