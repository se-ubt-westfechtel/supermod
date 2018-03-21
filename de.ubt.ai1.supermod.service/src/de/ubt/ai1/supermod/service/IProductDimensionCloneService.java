/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/

package de.ubt.ai1.supermod.service;

import de.ubt.ai1.supermod.mm.core.ProductDimension;

/**
 * Service interface for the creation of a self-contained copy of a product
 * dimension of a SuperMod repository.
 * 
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	29.07.2014
 */
public interface IProductDimensionCloneService {
	
	/**
	 * Creates and returns a copy of the given product space, which contains
	 * the same elements and visibilities. For links to the rule base and
	 * the visibility forest, references are adopted from the original.
	 * 
	 * @param original the product dimension to clone.
	 * @return a copy of the specified original, without any references to
	 *			the original.
	 */
	public ProductDimension clone(ProductDimension original);

}
