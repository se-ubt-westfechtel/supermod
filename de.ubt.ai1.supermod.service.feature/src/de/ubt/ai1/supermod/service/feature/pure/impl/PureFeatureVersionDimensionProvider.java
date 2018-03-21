/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.service.feature.pure.impl;

import de.ubt.ai1.supermod.mm.core.VersionSpace;
import de.ubt.ai1.supermod.mm.feature.FeatureModel;
import de.ubt.ai1.supermod.service.feature.IFeatureVersionDimensionProvider;

/**
 * Implementation of the feature dimension provider service specific to the
 * pure feature version space, which assumes that the feature model is not a
 * part of the product space.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	27.10.2014
 */
public class PureFeatureVersionDimensionProvider 
implements IFeatureVersionDimensionProvider {

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.feature.IFeatureDimensionProvider
	 * #getFeatureDimension(de.ubt.ai1.supermod.mm.core.VersionSpace)
	 */
	@Override
	public FeatureModel getFeatureDimension(VersionSpace vs) {
		return (FeatureModel) vs.getDimensions().get(0);
	}

}
