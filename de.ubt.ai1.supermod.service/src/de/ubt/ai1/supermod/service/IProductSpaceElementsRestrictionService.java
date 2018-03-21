/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/

package de.ubt.ai1.supermod.service;

import org.eclipse.emf.common.util.EList;

import de.ubt.ai1.supermod.mm.core.OptionBinding;
import de.ubt.ai1.supermod.mm.core.ProductSpaceElement;
import de.ubt.ai1.supermod.service.exceptions.UnderspecifiedVisibilityException;

/**
 * Service interface for the low-level product space element restriction
 * operation, which is defined on a set of elements. From this set, all
 * elements whose hierarchical visibility does not satisfy the specified
 * filter, will be deleted from the repository.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	29.07.2014
 */
public interface IProductSpaceElementsRestrictionService {

	/**
	 * Performs the restriction by deleting all elements of the specified
	 * collection, whose hierarchical visibility does not satisfy the specified
	 * option binding filter, is deleted from the SuperMod repository. For this
	 * purpose, clients may utilize a specific implementation of {@link
	 * IElementDeletionService}. Deletion is applied transitively
	 * to all subordinate product space elements.
	 *
	 * @param allElements the set of elements to restrict.
	 * @param filter an option binding which describes a version to restrict
	 * 			the element set to.
	 * @throws UnderspecifiedVisibilityException in case one of the elements
	 * 			to restrict defines a hierarchical visibility in which an
	 * 			option occurs that is unbound in the specified filter.
	 */
	public void deleteRestricted(EList<ProductSpaceElement> elementsToRestrict,
			OptionBinding filter) throws UnderspecifiedVisibilityException;

}
