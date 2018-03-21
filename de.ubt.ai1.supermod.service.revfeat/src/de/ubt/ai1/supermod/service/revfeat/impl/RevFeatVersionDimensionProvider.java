/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.service.revfeat.impl;

import de.ubt.ai1.supermod.mm.change.ChangeDimension;
import de.ubt.ai1.supermod.mm.core.VersionSpace;
import de.ubt.ai1.supermod.mm.feature.FeatureModel;
import de.ubt.ai1.supermod.mm.revision.RevisionDimension;
import de.ubt.ai1.supermod.service.change.IChangeDimensionProvider;
import de.ubt.ai1.supermod.service.feature.IFeatureVersionDimensionProvider;
import de.ubt.ai1.supermod.service.revision.IRevisionDimensionProvider;

/**
 * A hybrid implementation of the providers for the dimensions 'feature',
 * 'revision' and 'change' specific to the hybrid version space which contains
 * the respective dimensions in the following order:
 * <ol>
 * 	<li>revision dimension.</li>
 *  <li>feature dimension.</li>
 *  <li>change dimension.</li>
 * </ol>
 * 
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	02.03.2015
 */
public class RevFeatVersionDimensionProvider
implements IRevisionDimensionProvider, IFeatureVersionDimensionProvider,
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
	 * @see de.ubt.ai1.supermod.service.feature.IFeatureDimensionProvider
	 * #getFeatureDimension(de.ubt.ai1.supermod.service.feature.VersionSpace)
	 */
	@Override
	public FeatureModel getFeatureDimension(
			VersionSpace vs) {
		if (vs.getDimensions().size() > 0 && vs.getDimensions().get(1)
				instanceof FeatureModel) {
			return (FeatureModel) vs.getDimensions().get(1);
		}
		return null;
	}

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.revision.IRevisionDimensionProvider
	 * #getRevisionDimension(de.ubt.ai1.supermod.service.revision.VersionSpace)
	 */
	@Override
	public RevisionDimension getRevisionDimension(
			VersionSpace vs) {
		if (vs.getDimensions().size() > 0 && vs.getDimensions().get(0)
				instanceof RevisionDimension) {
			return (RevisionDimension) vs.getDimensions().get(0);
		}
		return null;
	}

}
