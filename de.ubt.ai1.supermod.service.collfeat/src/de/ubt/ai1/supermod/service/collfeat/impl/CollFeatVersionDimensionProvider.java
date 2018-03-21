/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.service.collfeat.impl;

import de.ubt.ai1.supermod.mm.change.ChangeDimension;
import de.ubt.ai1.supermod.mm.collab.CollaborativeRevisionDimension;
import de.ubt.ai1.supermod.mm.core.VersionSpace;
import de.ubt.ai1.supermod.mm.feature.FeatureModel;
import de.ubt.ai1.supermod.service.change.IChangeDimensionProvider;
import de.ubt.ai1.supermod.service.collab.ICollabDimensionProvider;
import de.ubt.ai1.supermod.service.feature.IFeatureVersionDimensionProvider;

/**
 * A hybrid implementation of the providers for the dimensions 'feature',
 * 'collab' and 'change' specific to the hybrid version space which contains
 * the respective dimensions in the following order:
 * <ol>
 * 	<li>collab dimension.</li>
 *  <li>feature dimension.</li>
 *  <li>change dimension.</li>
 * </ol>
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	28.10.2015
 */
public class CollFeatVersionDimensionProvider
implements ICollabDimensionProvider, IFeatureVersionDimensionProvider,
IChangeDimensionProvider {

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.change.IChangeDimensionProvider
	 * #getChangeDimension(de.ubt.ai1.supermod.service.change.VersionSpace)
	 */
	@Override
	public ChangeDimension getChangeDimension(VersionSpace vs) {
		if (vs.getDimensions().size() > 0 && vs.getDimensions().get(2)
				instanceof ChangeDimension) {
			return (ChangeDimension) vs.getDimensions().get(2);
		}
		return null;
	}

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.feature.IFeatureVersionDimensionProvider
	 * #getFeatureDimension(de.ubt.ai1.supermod.service.feature.VersionSpace)
	 */
	@Override
	public FeatureModel getFeatureDimension(VersionSpace vs) {
		if (vs.getDimensions().size() > 0 && vs.getDimensions().get(1)
				instanceof FeatureModel) {
			return (FeatureModel) vs.getDimensions().get(1);
		}
		return null;
	}

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.collab.ICollabDimensionProvider
	 * #getCollabDimension(de.ubt.ai1.supermod.service.collab.VersionSpace)
	 */
	@Override
	public CollaborativeRevisionDimension getCollabDimension(VersionSpace vs) {
		if (vs.getDimensions().size() > 0 && vs.getDimensions().get(0)
				instanceof CollaborativeRevisionDimension) {
			return (CollaborativeRevisionDimension) vs.getDimensions().get(0);
		}
		return null;
	}

}
