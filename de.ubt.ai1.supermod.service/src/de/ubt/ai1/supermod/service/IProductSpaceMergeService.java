/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/

package de.ubt.ai1.supermod.service;

import de.ubt.ai1.supermod.mm.core.ProductSpace;
import de.ubt.ai1.supermod.mm.core.VisibilityForest;
import de.ubt.ai1.supermod.mm.diff.MatchingRole;
import de.ubt.ai1.supermod.mm.diff.ProductSpaceMatching;

/**
 * Service interface for the merge operation defined on a set of product
 * spaces, utilizing a previously calculated matching that contains exactly
 * the product spaces to be matched. There are two kinds of merging, out-place
 * and in-place merging. The outcome of an out-place merge is a new product
 * space which contains all dimensions and elements which occur in the input
 * spaces. An in-place merge adds new elements to a master product space as
 * a side effect.
 * 
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	29.07.2014
 */
public interface IProductSpaceMergeService {

	/**
	 * Performs the out-place merge operation by creating a new merged element
	 * for each correspondence found in the matching, where at least one of the
	 * input product spaces take place. Clients must ensure that each merged
	 * element is inserted into the matching under the merge role, which is 
	 * specified as an additional parameter. New visibilities must be contained 
	 * within the specified visibility forest. Merging a product space is
	 * realized by applying dimension-specific merge procedures to corresponding
	 * product dimensions. For this purpose, clients may use specific
	 * implementations of {@link IProductDimensionMergeService}.
	 *
	 * @param psMatching the product space matching which provides the basis
	 * 			for merging since it specifies corresponding elements of
	 * 			different product spaces.
	 * @param mergeRolethis role must be assigned to all elements created during
	 * 			the merge procedure, and linked to the product space matching.
	 * @param visibilityForest the visibility forest where existing option 
	 * 			expressions are stored in, and where new, merged visibilities
	 * 			shall be appended.
	 * @return the merged product space, which represents the superimposition
	 * 			of all product spaces part of the input matching.
	 */
	public ProductSpace mergeOutPlace(ProductSpaceMatching psMatching, 
			MatchingRole mergeRole, VisibilityForest visibilityForest);
	
	/**
	 * Performs the in-place merge operation by adding elements which do not
	 * occur in the master product space but in any other role to the master
	 * product space as a side effect. Merging a product space is
	 * realized by applying dimension-specific merge procedures to corresponding
	 * product dimensions. For this purpose, clients may use specific
	 * implementations of {@link IProductDimensionMergeService}.
	 *
	 * @param psMatching the product space matching which provides the basis
	 * 			for merging since it specifies corresponding elements of
	 * 			different product spaces.
	 * @param masterRole this role designates the master product space, which
	 * 			will be extended by this operation as a side effect.
	 * @param visibilityForest the visibility forest where existing option 
	 * 			expressions are stored in, and where new, merged visibilities
	 * 			shall be appended.
	 */
	public void mergeInPlace(ProductSpaceMatching psMatching, 
			MatchingRole masterRole, VisibilityForest visibilityForest);
	
}
