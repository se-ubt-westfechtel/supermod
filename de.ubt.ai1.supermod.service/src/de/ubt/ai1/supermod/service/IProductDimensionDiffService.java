/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/

package de.ubt.ai1.supermod.service;

import de.ubt.ai1.supermod.mm.diff.MatchingRole;
import de.ubt.ai1.supermod.mm.diff.ProductDimensionDelta;
import de.ubt.ai1.supermod.mm.diff.ProductDimensionMatching;

/**
 * Service interface for the calculation of a delta which describes the 
 * difference* between two states of the same product dimension, an 'old' and a
 * 'new' state. Differences refer to a third copy of the product space, the
 * 'master', which  may be equal to the old or the new state. The calculation 
 * is performed on the basis of a <em>matching</em>, the result of a comparison
 * of the different product dimension versions.
 * 
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	29.07.2014
 */
public interface IProductDimensionDiffService {
	
	/**
	 * Performs differencing utilizing a specified product dimension matching
	 * where all of the three roles specified below must be defined. The
	 * resulting delta refers to the 'master' role.
	 *
	 * @param matching the matching based on which the difference is 
	 * 			calculated.
	 * @param master the product dimension in which the delta will be 
	 * 			described.
	 * @param oldState initial state of the product dimension to calculate the
	 * 			difference with.
	 * @param newState final state of the product dimension.
	 * @return a product dimension delta which describes the difference
	 * 			between the old and the new state by means of inserted and
	 * 			deleted elements.
	 */
	public ProductDimensionDelta diff(ProductDimensionMatching matching, 
			MatchingRole master, MatchingRole oldState, MatchingRole newState);

}
