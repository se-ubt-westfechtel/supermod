/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/

package de.ubt.ai1.supermod.service;

import java.util.Collection;

import de.ubt.ai1.supermod.mm.core.OptionExpr;
import de.ubt.ai1.supermod.mm.core.ProductSpaceElement;
import de.ubt.ai1.supermod.mm.core.VisibilityForest;

/**
 * Service interface for the merge operation defined on different visibilities
 * of equivalent product space elements, which refer to a common visibility
 * forest. Each element may define at most one visibility. In case elements
 * with different visibilities are merged, changes implied by both visibilities
 * must be considere.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	29.07.2014
 */
public interface IVisibilityMergeService {

	/**
	 * Performs the visibility merge operation. It takes under consideration
	 * the visibilities of all specified product space elements.
	 * The resulting visibility will imply all  
	 * visibilities of all specified elements.
	 *
	 * @param elements the elements whose visibilities shall be
	 * 			merged.
	 * @param forest the visibility forest which will contain the new,
	 * 			merged visibility.
	 * @return a new visibility that implies the visibilities of
	 * 			all specified elements, or <code>null</code> if none of the
	 * 			elements has a visibility assigned.
	 */
	public OptionExpr mergeVisibility(
			Collection<? extends ProductSpaceElement> elements, 
			VisibilityForest forest);

}
