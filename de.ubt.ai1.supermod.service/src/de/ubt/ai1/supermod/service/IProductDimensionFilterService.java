/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/

package de.ubt.ai1.supermod.service;

import de.ubt.ai1.supermod.mm.core.OptionBinding;
import de.ubt.ai1.supermod.mm.core.ProductDimension;
import de.ubt.ai1.supermod.service.exceptions.UnderspecifiedVisibilityException;

/**
 * Service interface for filtering a product dimension of a SuperMod repository
 * with respect to an option binding that describes a specific version of the
 * product.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	29.07.2014
 */
public interface IProductDimensionFilterService {
	
	/**
	 * Filters the specified product space dimension by the specified filter,
	 * an option binding. The result will contain the same elements as the base
	 * version, without elements whose hierarchical visibility does not satisfy
	 * the filter.
	 *
	 * @param base the product dimension to filter.
	 * @param filter an option binding that describes the version of the
	 * 			result of the filtering operation. It must bind any option
	 * 			which occurs in the visibilities of the filtered dimension.
	 * @return a copy of the base product dimension, which is restricted to
	 * 			elements whose visibility satisfies the specified filter.
	 * @throws UnderspecifiedVisibilityException in case the options bound
	 * 			within the filter are not sufficient in order to evaluate the
	 * 			visibility of at least one element of the dimension.
	 */
	public ProductDimension filter(ProductDimension base, OptionBinding filter) 
			throws UnderspecifiedVisibilityException;

}
