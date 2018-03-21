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
import de.ubt.ai1.supermod.service.IProductDimensionCloneService;
import de.ubt.ai1.supermod.service.IProductDimensionFilterService;
import de.ubt.ai1.supermod.service.IProductSpaceElementsRestrictionService;
import de.ubt.ai1.supermod.service.exceptions.UnderspecifiedVisibilityException;

/**
 * Generic implementation of the product dimension filter service interface.
 * It creates a clone of the specified product dimension and restricts it with
 * respect to the specified option binding.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	29.07.2014
 */
public class GenericProductDimensionFilterService 
implements IProductDimensionFilterService {
	
	@Inject
	private IProductDimensionCloneService cloneService;
	
	@Inject
	private IProductSpaceElementsRestrictionService restrictionService;
	
	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.IProductDimensionFilterService#filter
	 * (de.ubt.ai1.supermod.mm.core.ProductDimension, 
	 * de.ubt.ai1.supermod.mm.core.OptionBinding)
	 */
	@Override
	public ProductDimension filter(ProductDimension base, OptionBinding filter) 
			throws UnderspecifiedVisibilityException {
		ProductDimension projection = cloneService.clone(base);
		restrictionService.deleteRestricted(
				projection.getRootProductSpaceElements(), filter);
		return projection;
	}

}
