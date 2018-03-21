/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/

package de.ubt.ai1.supermod.service.generic.impl;

import com.google.inject.Inject;

import de.ubt.ai1.supermod.mm.diff.MatchingRole;
import de.ubt.ai1.supermod.mm.diff.ProductDimensionMatching;
import de.ubt.ai1.supermod.mm.diff.ProductSpaceDelta;
import de.ubt.ai1.supermod.mm.diff.ProductSpaceMatching;
import de.ubt.ai1.supermod.mm.diff.SuperModDiffFactory;
import de.ubt.ai1.supermod.service.IProductDimensionDiffService;
import de.ubt.ai1.supermod.service.IProductSpaceDiffService;

/**
 * Generic implementation of the product space diff service, which calculates
 * the difference using an injected product dimension diff service, which
 * is used for all product dimensions.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	29.07.2014
 */
public class GenericProductSpaceDiffService 
implements IProductSpaceDiffService {

	@Inject
	private IProductDimensionDiffService dimensionDiffService;
	
	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.IProductSpaceDiffService
	 * #diff(de.ubt.ai1.supermod.mm.diff.ProductSpaceMatching, 
	 * de.ubt.ai1.supermod.mm.diff.MatchingRole, 
	 * de.ubt.ai1.supermod.mm.diff.MatchingRole, 
	 * de.ubt.ai1.supermod.mm.diff.MatchingRole)
	 */
	@Override
	public ProductSpaceDelta diff(ProductSpaceMatching matching,
			MatchingRole master, MatchingRole oldState, 
			MatchingRole newState) {
		ProductSpaceDelta psDelta = SuperModDiffFactory.eINSTANCE
				.createProductSpaceDelta();
		for (ProductDimensionMatching pdMatching : 
			matching.getDimensionMatchings()) {
			psDelta.getProductDimensionDeltas().add(
					dimensionDiffService.diff(pdMatching, master, 
							oldState, newState));
		}
		return psDelta;
	}

}
