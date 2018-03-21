/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.service.featfile.impl;

import de.ubt.ai1.supermod.mm.core.ProductSpace;
import de.ubt.ai1.supermod.mm.feature.FeatureModel;
import de.ubt.ai1.supermod.mm.file.VersionedFileSystem;
import de.ubt.ai1.supermod.service.feature.IFeatureProductDimensionProvider;
import de.ubt.ai1.supermod.service.file.IVersionedFileSystemProvider;

/**
 * Implementation of the versioned file system provider interface specific to
 * the "feature-file" version space, which contains the following product
 * dimensions in the specified order:
 * <ol>
 *  <li>feature dimension.</li>
 *  <li>versioned file system dimension.</li>
 * </ol>
 * 
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	02.03.2015
 */
public class FeatFileProductDimensionProvider
implements IFeatureProductDimensionProvider, IVersionedFileSystemProvider {

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.file.IVersionedFileSystemProvider
	 * #getVersionedFileSystem(de.ubt.ai1.supermod.service.file.ProductSpace)
	 */
	@Override
	public VersionedFileSystem getVersionedFileSystem(ProductSpace ps) {
		if (ps.getDimensions().size() > 1 && ps.getDimensions().get(1)
				instanceof VersionedFileSystem) {
			return (VersionedFileSystem) ps.getDimensions().get(1);
		}
		return null;
	}

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.feature.IFeatureProductDimensionProvider
	 * #getFeatureDimension(de.ubt.ai1.supermod.service.feature.ProductSpace)
	 */
	@Override
	public FeatureModel getFeatureDimension(ProductSpace ps) {
		if (ps.getDimensions().size() > 0 && ps.getDimensions().get(0)
				instanceof FeatureModel) {
			return (FeatureModel) ps.getDimensions().get(0);
		}
		return null;
	}

}
