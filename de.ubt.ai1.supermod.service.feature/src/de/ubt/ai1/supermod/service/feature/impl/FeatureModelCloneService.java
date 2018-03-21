/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.service.feature.impl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import de.ubt.ai1.supermod.mm.core.ProductDimension;
import de.ubt.ai1.supermod.service.IProductDimensionCloneService;

/**
 * An implementation of the product dimension clone service interface specific
 * to feature models. It uses the Ecore copier.
 * 
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	27.10.2014
 */
public class FeatureModelCloneService implements IProductDimensionCloneService {

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.IProductDimensionCloneService
	 * #clone(de.ubt.ai1.supermod.mm.core.ProductDimension)
	 */
	@Override
	public ProductDimension clone(ProductDimension original) {
		return EcoreUtil.copy(original);
	}

}
