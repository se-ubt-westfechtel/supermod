/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/

package de.ubt.ai1.supermod.service;

import java.util.Collection;

import de.ubt.ai1.supermod.mm.core.ProductDimension;
import de.ubt.ai1.supermod.mm.diff.MatchingRole;
import de.ubt.ai1.supermod.mm.diff.ProductDimensionMatching;

/**
 * Service interface for the calculation of a matching between several copies
 * of the same product dimension, each playing a different role within the
 * matching. The result may be calculated by a specific comparison algorithm,
 * which depends on the specific product space representation.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	29.07.2014
 */
public interface IProductDimensionMatchService {
	
	/**
	 * Calculates and returns the matching with respect to a set of specified
	 * product dimensions.
	 *
	 * @param roles assigns a specific meaning to each of the product space,
	 * 			whose dimensions are compared.
	 * @param dimensions the corresponding dimensions of several copies of a
	 * 			product space to be compared
	 * @return a comparison result that defines which elements of the different
	 * 			copies of the product dimension correspond.
	 */
	public ProductDimensionMatching match(Collection<MatchingRole> roles, 
			Collection<ProductDimension> dimensions);

}
