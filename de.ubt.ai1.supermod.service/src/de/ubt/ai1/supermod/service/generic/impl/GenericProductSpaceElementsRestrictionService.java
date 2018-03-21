/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/

package de.ubt.ai1.supermod.service.generic.impl;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import com.google.inject.Inject;

import de.ubt.ai1.supermod.mm.core.OptionBinding;
import de.ubt.ai1.supermod.mm.core.ProductSpaceElement;
import de.ubt.ai1.supermod.mm.core.SuperModCoreFactory;
import de.ubt.ai1.supermod.mm.core.Tristate;
import de.ubt.ai1.supermod.mm.core.VisibilityEvaluationCache;
import de.ubt.ai1.supermod.service.IElementDeletionService;
import de.ubt.ai1.supermod.service.IProductSpaceElementsRestrictionService;
import de.ubt.ai1.supermod.service.exceptions.UnderspecifiedVisibilityException;

/**
 * Generic implementation of the product space element restriction service,
 * which makes use of an injected implementation of 
 * {@link IElementDeletionService} in order to delete elements 
 * whose hierarchical visibility does not satisfy the specified filter.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	29.07.2014
 */
public class GenericProductSpaceElementsRestrictionService 
implements IProductSpaceElementsRestrictionService {
	
	@Inject
	private IElementDeletionService deletor;

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.IProductSpaceElementsRestrictionService
	 * #deleteRestricted(org.eclipse.emf.common.util.EList, 
	 * de.ubt.ai1.supermod.mm.core.OptionBinding)
	 */
	@Override
	public void deleteRestricted(EList<ProductSpaceElement> elements,
			OptionBinding filter) throws UnderspecifiedVisibilityException {
		deleteRestricted(elements, filter, SuperModCoreFactory.eINSTANCE
				.createVisibilityEvaluationCache());		
	}
	
	/**
	 * Helper method that performs a recursive decent, sharing a global
	 * visibility evaluation cache.
	 *
	 * @param elements
	 * @param filter
	 * @param cache
	 * @throws UnderspecifiedVisibilityException
	 */
	protected void deleteRestricted(EList<ProductSpaceElement> elements,
			OptionBinding filter, VisibilityEvaluationCache cache)
					throws UnderspecifiedVisibilityException {
		for (ProductSpaceElement pse : new BasicEList<>(elements)) {
			Tristate state = pse.isVisibleHierarchically(filter, cache);
			switch (state) {
			case TRUE:
				deleteRestricted(pse.getSubProductSpaceElements(), filter, 
						cache);
				break;
			case FALSE:
				deleteRestricted(pse.getSubProductSpaceElements(), filter, 
						cache);
				deletor.delete(pse);		
				break;
			case UNKNOWN:
				throw new UnderspecifiedVisibilityException(pse, filter);
			}
		}		
	}
	
}
