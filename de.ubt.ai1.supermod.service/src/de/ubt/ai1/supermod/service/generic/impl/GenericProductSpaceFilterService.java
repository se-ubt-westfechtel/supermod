/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/

package de.ubt.ai1.supermod.service.generic.impl;

import com.google.inject.Inject;

import de.ubt.ai1.supermod.mm.core.OptionBinding;
import de.ubt.ai1.supermod.mm.core.ProductDimension;
import de.ubt.ai1.supermod.mm.core.ProductSpace;
import de.ubt.ai1.supermod.mm.core.SuperModCoreFactory;
import de.ubt.ai1.supermod.service.IProductDimensionFilterService;
import de.ubt.ai1.supermod.service.IProductSpaceFilterService;
import de.ubt.ai1.supermod.service.exceptions.UnderspecifiedVisibilityException;

/**
 * Generic implementation of the product space filter service interfaces,
 * which uses an injected product dimension filter service to filter each
 * dimension separately.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	29.07.2014
 */
public class GenericProductSpaceFilterService 
implements IProductSpaceFilterService {

	@Inject
	private IProductDimensionFilterService dimFilterService;
	
	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.IProductSpaceFilterService
	 * #filter(de.ubt.ai1.supermod.mm.core.ProductSpace, 
	 * de.ubt.ai1.supermod.mm.core.OptionBinding)
	 */
	@Override
	public ProductSpace filter(ProductSpace base, OptionBinding filter) 
			throws UnderspecifiedVisibilityException {
		ProductSpace filteredPs = SuperModCoreFactory.eINSTANCE
				.createProductSpace();
		for (ProductDimension baseDim : base.getDimensions()) {
			filteredPs.getDimensions().add(
					dimFilterService.filter(baseDim, filter));
		}
		return filteredPs;
	}

}
