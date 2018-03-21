/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/

package de.ubt.ai1.supermod.service;

import java.util.Collection;

import de.ubt.ai1.supermod.mm.diff.MatchingRole;
import de.ubt.ai1.supermod.mm.diff.ProductSpaceMatching;

/**
 * Service interface for the comparison operation on complete product spaces of
 * a SuperMod repository. The result of a product space comparison is stored
 * within a product space delta.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	29.07.2014
 */
public interface IProductSpaceMatchService {
	
	/**
	 * Performs the product space comparison by comparing corresponding
	 * product dimensions within the product spaces referenced by the
	 * specified matching roles. For this purpose, product dimension specific
	 * implementations of {@link IProductDimensionMatchService} may be used by
	 * clients.
	 *
	 * @param roles a collection of matching roles, which describes the set of
	 * 			different copies of a product space for which the difference
	 * 			shall be calculated. Furthermore, to each product space, a role
	 * 			name is assigned.
	 * @return a product space matching which describes the outcome of the
	 * 			performed comparison.
	 */
	public ProductSpaceMatching match(Collection<MatchingRole> roles);

}
