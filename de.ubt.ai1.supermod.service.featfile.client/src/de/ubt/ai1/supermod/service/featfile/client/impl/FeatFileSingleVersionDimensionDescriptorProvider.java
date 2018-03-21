/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.service.featfile.client.impl;

import de.ubt.ai1.supermod.mm.client.SingleVersionProductSpaceDescriptor;
import de.ubt.ai1.supermod.mm.feature.client.SingleVersionFeatureModelDescriptor;
import de.ubt.ai1.supermod.mm.file.client.SingleVersionFileSystemDescriptor;
import de.ubt.ai1.supermod.service.feature.client.ISingleVersionFeatureModelDescriptorProvider;
import de.ubt.ai1.supermod.service.file.client.ISingleVersionFileSystemDescriptorProvider;

/**
 * Implementation of the single version file system descriptor provider
 * interface specific to the "feat-file" product space.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	02.03.2015
 */
public class FeatFileSingleVersionDimensionDescriptorProvider
implements ISingleVersionFileSystemDescriptorProvider,
ISingleVersionFeatureModelDescriptorProvider {

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.feature.client.
	 * ISingleVersionFeatureModelDescriptorProvider
	 * #getSingleVersionFeatureModelDescriptor(
	 * de.ubt.ai1.supermod.mm.client.SingleVersionProductSpaceDescriptor)
	 */
	@Override
	public SingleVersionFeatureModelDescriptor 
	getSingleVersionFeatureModelDescriptor(
			SingleVersionProductSpaceDescriptor desc) {
		if (desc.getDimensionDescriptors().size() > 0 && 
				desc.getDimensionDescriptors().get(0) instanceof 
				SingleVersionFeatureModelDescriptor) {
			return (SingleVersionFeatureModelDescriptor) 
					desc.getDimensionDescriptors().get(0);
		}
		return null;
	}

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.file.client.
	 * ISingleVersionFileSystemDescriptorProvider
	 * #getSingleVersionFileSystemDescriptor(
	 * de.ubt.ai1.supermod.mm.client.SingleVersionProductSpaceDescriptor)
	 */
	@Override
	public SingleVersionFileSystemDescriptor 
	getSingleVersionFileSystemDescriptor(
			SingleVersionProductSpaceDescriptor desc) {
		if (desc.getDimensionDescriptors().size() > 1 && 
				desc.getDimensionDescriptors().get(1) instanceof 
				SingleVersionFileSystemDescriptor) {
			return (SingleVersionFileSystemDescriptor) 
					desc.getDimensionDescriptors().get(1);
		}
		return null;
	}

}
