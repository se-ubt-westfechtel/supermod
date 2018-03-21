/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/

package de.ubt.ai1.supermod.service.client;

import de.ubt.ai1.supermod.mm.client.ConflictSet;
import de.ubt.ai1.supermod.mm.core.ProductDimension;

/**
 * Service interface for the validation operation defined on a specific product
 * dimension. It analyzes a specified instance of the product dimension and
 * returns a set of conflicts, in case there are any.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	30.07.2014
 */
public interface IProductDimensionValidationService {
	
	/**
	 * Detects conflicts within the specified product dimension by the 
	 * application of dimension specific validation rules.
	 *
	 * @param productDimension the product dimension to validate.
	 * @return a conflict set that contains all conflicts detected, or
	 * 			<code>null</code> if the specified product dimension is
	 * 			conflict-free.
	 */
	public ConflictSet validate(ProductDimension productDimension);

}
