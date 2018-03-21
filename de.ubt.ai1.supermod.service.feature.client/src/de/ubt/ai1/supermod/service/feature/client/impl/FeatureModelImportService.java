/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.service.feature.client.impl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import de.ubt.ai1.supermod.mm.client.SingleVersionProductDimensionDescriptor;
import de.ubt.ai1.supermod.mm.core.ProductDimension;
import de.ubt.ai1.supermod.mm.feature.client.SingleVersionFeatureModelDescriptor;
import de.ubt.ai1.supermod.service.client.IProductDimensionImportService;

/**
 * Implementation of the product dimension import interface specific for the
 * feature dimension. It returns a copy of the feature model referenced by the
 * specified descriptor.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	27.10.2014
 */
public class FeatureModelImportService 
implements IProductDimensionImportService {

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.client.IProductDimensionImportService
	 * #doImport(de.ubt.ai1.supermod.mm.client.
	 * SingleVersionProductDimensionDescriptor)
	 */
	@Override
	public ProductDimension doImport(
			SingleVersionProductDimensionDescriptor descriptor) {
		if (descriptor instanceof SingleVersionFeatureModelDescriptor) {
			return EcoreUtil.copy(((SingleVersionFeatureModelDescriptor) 
					descriptor).getFeatureModel());
		}
		return null;
	}

}
