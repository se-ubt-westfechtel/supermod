/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.service.feature;

import de.ubt.ai1.supermod.mm.core.VersionSpace;
import de.ubt.ai1.supermod.mm.feature.FeatureModel;

/**
 * Provider interface for feature dimensions within a given version space.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	11.08.2014
 */
public interface IFeatureVersionDimensionProvider {
	
	/**
	 * To be implemented in order to return the feature dimension in its role
	 * as a product space.
	 *
	 * @param vs version space where the dimension is located.
	 * @return the feature dimension.
	 */
	public FeatureModel getFeatureDimension(VersionSpace vs);

}
