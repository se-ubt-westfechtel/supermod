/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/

package de.ubt.ai1.supermod.service.generic.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import de.ubt.ai1.supermod.mm.diff.MatchingRole;
import de.ubt.ai1.supermod.mm.diff.ProductDimensionDelta;
import de.ubt.ai1.supermod.mm.diff.ProductDimensionMatching;
import de.ubt.ai1.supermod.mm.diff.ProductSpaceElementDelta;
import de.ubt.ai1.supermod.mm.diff.ProductSpaceElementMatching;
import de.ubt.ai1.supermod.mm.diff.SuperModDiffFactory;
import de.ubt.ai1.supermod.service.IProductDimensionDiffService;

/**
 * A generic implementation of the product dimension delta service interface,
 * which takes a product dimension matching as its input and calculates the set
 * of inserted and deleted elements by using reflective SuperMod methods.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	29.07.2014
 */
public class GenericProductDimensionDiffService 
implements IProductDimensionDiffService {

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.IProductDimensionDiffService#diff
	 * (de.ubt.ai1.supermod.mm.diff.ProductDimensionMatching, 
	 * de.ubt.ai1.supermod.mm.diff.MatchingRole, 
	 * de.ubt.ai1.supermod.mm.diff.MatchingRole, 
	 * de.ubt.ai1.supermod.mm.diff.MatchingRole)
	 */
	@Override
	public ProductDimensionDelta diff(ProductDimensionMatching matching,
			MatchingRole master, MatchingRole oldState, 
			MatchingRole newState) {
		ProductDimensionDelta delta = SuperModDiffFactory.eINSTANCE
				.createProductDimensionDelta();
		delta.setDimensionName(matching.getDimensionName());
		// inserted elements are contained in the new version of the product
		// space, but not in the old one.
		for (ProductSpaceElementMatching rootMatching : 
			matching.getRootElementMatchings()) {
			List<ProductSpaceElementDelta> insertedElements = 
					findDifferringElements(rootMatching, master, 
							newState, oldState);
			delta.getInsertedElements().addAll(insertedElements);
		}
		// deleted elements are contained in the old version of the product
		// space, but not in the new one.
		for (ProductSpaceElementMatching rootMatching : 
			matching.getRootElementMatchings()) {
			List<ProductSpaceElementDelta> deletedElements = 
					findDifferringElements(rootMatching, master, 
							oldState, newState);
			delta.getDeletedElements().addAll(deletedElements);
		}
		return delta;
	}

	/**
	 * Finds all elements which are included in one, but not included in
	 * another product space on the basis of a matching. The resulting deltas
	 * will refer to a specified master product space. This auxiliary method
	 * proceeds recursively, by walking down the sub-matchings of the specified
	 * matching.
	 *
	 * @param matching
	 * @param master
	 * @param included
	 * @param notIncluded
	 * @return deltas which describe the difference between both versions.
	 */
	private List<ProductSpaceElementDelta> findDifferringElements(
			ProductSpaceElementMatching matching, 
			MatchingRole master, MatchingRole included, 
			MatchingRole notIncluded) {
		ProductSpaceElementDelta delta = null;
		// in case an element is included in 'included' but not included in
		// 'notIncluded', report a difference.
		if (matching.getMatchedElement(master) != null 
				&& matching.getMatchedElement(included) != null 
				&& matching.getMatchedElement(notIncluded) == null) {
			delta = SuperModDiffFactory.eINSTANCE
					.createProductSpaceElementDelta();
			delta.getRootElements().add(
					matching.getMatchedElement(master).getElement());
		}
		if (delta != null) {
			return Collections.singletonList(delta);
		}
		else {
			// recursive decent.
			List<ProductSpaceElementDelta> subDeltas = new ArrayList<>();
			for (ProductSpaceElementMatching subMatching : 
				matching.getSubMatchings()) {
				subDeltas.addAll(findDifferringElements(subMatching, master, 
						included, notIncluded));
			}
			return subDeltas;
		}
	}
	
	

}
