/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/

package de.ubt.ai1.supermod.service;

import de.ubt.ai1.supermod.mm.diff.MatchingRole;
import de.ubt.ai1.supermod.mm.diff.ProductSpaceDelta;
import de.ubt.ai1.supermod.mm.diff.ProductSpaceMatching;

/**
 * Service interface for the differencing operation on product spaces. Clients
 * are intended to invoke product space specific dimension diff services in
 * order to compose a global difference for the product space, which is
 * represented as a product space delta.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	29.07.2014
 */
public interface IProductSpaceDiffService {
	
	/**
	 * Performs differencing utilizing a pre-defined set of product dimension
	 * specific diff services. For the matching which provides the basis of 
	 * difference calculation, all of the three roles specified below must be
	 * defined. The resulting delta refers to the 'master' role. Clients may
	 * use specific implementations of {@link IProductDimensionDiffService} in
	 * order to calculate deltas for contained produt dimensions.
	 *
	 * @param matching the matching based on which the difference is 
	 * 			calculated.
	 * @param master the product space in which the delta will be described.
	 * @param oldState initial state of the product state to calculate the
	 * 			difference with.
	 * @param newState final state of the product state.
	 * @return a product state delta which describes the difference
	 * 			between the old and the new state by means of a set of
	 * 			product dimension deltas.
	 * @return
	 */
	public ProductSpaceDelta diff(ProductSpaceMatching matching, 
			MatchingRole master, MatchingRole oldState, MatchingRole newState);

}
