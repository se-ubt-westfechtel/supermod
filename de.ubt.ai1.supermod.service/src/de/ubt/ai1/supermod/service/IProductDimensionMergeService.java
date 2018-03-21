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
import de.ubt.ai1.supermod.mm.core.VisibilityForest;
import de.ubt.ai1.supermod.mm.diff.MatchingRole;
import de.ubt.ai1.supermod.mm.diff.ProductDimensionMatching;

/**
 * Service interface to produce a merged version of a product dimension on
 * the basis of a matching which includes at least the copies of the product
 * dimension to merge. There are two kinds of merging, out-place
 * and in-place merging. The outcome of an out-place merge is a product 
 * dimension which contains all elements from all merge inputs. An in-place
 * merge adds new elements to a master product space as a side effect.
 * Elements' visibilities are merged according to the application specific 
 * requirements.
 * 
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	29.07.2014
 */
public interface IProductDimensionMergeService {

	/**
	 * Performs the out-place merge operation and returns the resulting merged
	 * product dimension. The merge result contains all elements which are 
	 * contained by one of the input matching roles. Additionally to returning 
	 * the result, implementations must reference merged elements by a specific
	 * matching role, the <em>merge role</em>. All visibilities of the merged
	 * dimension will refer to a specified visibility forest.
	 *
	 * @param pdMatching the matching that describes the comparison result of
	 * 			at least the product space dimensions to be matched.
	 * @param inputRoles product dimensions which correspond to matching roles
	 * 			defined here will be included in the merge result.
	 * @param mergeRole an additional matching role, which will be associated
	 * 			to all elements of the merged version
	 * @param visibilityForest the visibility forest where existing
	 * 			option expressions are stored in, and where new, merged
	 * 			visibilities shall be appended.
	 * @return the merged product dimension, which represents the 
	 * 			superimposition of all input dimensions.
	 */
	public ProductDimension mergeOutPlace(ProductDimensionMatching pdMatching, 
			Collection<MatchingRole> inputRoles, MatchingRole mergeRole, 
			VisibilityForest visibilityForest);
	
	/**
	 * Performs the in-place merge operation by modifying a designated master
	 * product dimension. As a result, it must contain all elements which are 
	 * contained by one of the input matching roles. Additionally to returning 
	 * the result, implementations must reference merged elements by a specific
	 * matching role, the <em>merge role</em>. All visibilities of the merged
	 * dimension will refer to a specified visibility forest.
	 *
	 * @param pdMatching the matching that describes the comparison result of
	 * 			at least the product space dimensions to be matched.
	 * @param inputRoles product dimensions which correspond to matching roles
	 * 			defined here will be included in the master version. Must
	 * 			include the master role.
	 * @param masterRole an additional matching role, which describes the
	 * 			product dimension which will be modified.
	 * @param visibilityForest the visibility forest where existing
	 * 			option expressions are stored in, and where new, merged
	 * 			visibilities shall be appended.
	 * @return the merged product dimension, which represents the 
	 * 			superimposition of all input dimensions.
	 */
	public void mergeInPlace(ProductDimensionMatching pdMatching,
			Collection<MatchingRole> inputRoles, MatchingRole masterRole,
			VisibilityForest visibilityForest);
	
}
