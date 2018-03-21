/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.service.generic.impl;

import com.google.inject.Inject;

import de.ubt.ai1.supermod.mm.core.ProductDimension;
import de.ubt.ai1.supermod.mm.core.ProductSpace;
import de.ubt.ai1.supermod.mm.core.SuperModCoreFactory;
import de.ubt.ai1.supermod.service.IProductDimensionCloneService;
import de.ubt.ai1.supermod.service.IProductSpaceCloneService;

/**
 * Generic implementation of the product space filter service interfaces,
 * which uses an injected product dimension clone service to clone each
 * dimension separately
 * 
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	09.09.2014
 */
public class GenericProductSpaceCloneService implements
		IProductSpaceCloneService {
	
	@Inject
	private IProductDimensionCloneService pdCloneService;

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.IProductSpaceCloneService
	 * #clone(de.ubt.ai1.supermod.mm.core.ProductSpace)
	 */
	@Override
	public ProductSpace clone(ProductSpace original) {
		ProductSpace clone = SuperModCoreFactory.eINSTANCE.createProductSpace();
		for (ProductDimension pd : original.getDimensions()) {
			clone.getDimensions().add(pdCloneService.clone(pd));
		}
		return clone;
	}

}
