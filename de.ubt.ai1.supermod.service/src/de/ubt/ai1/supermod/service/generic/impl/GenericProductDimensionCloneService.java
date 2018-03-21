/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/

package de.ubt.ai1.supermod.service.generic.impl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import de.ubt.ai1.supermod.mm.core.ProductDimension;
import de.ubt.ai1.supermod.service.IProductDimensionCloneService;

/**
 * Generic implementation of the product dimension clone service, which uses
 * the Ecore copier in order to create a self-contained copy.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	29.07.2014
 */
public class GenericProductDimensionCloneService 
implements IProductDimensionCloneService {

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.IProductDimensionCloneService#clone
	 * (de.ubt.ai1.supermod.mm.core.ProductDimension)
	 */
	@Override
	public ProductDimension clone(ProductDimension dim) {
		return EcoreUtil.copy(dim);
	}
	
}
