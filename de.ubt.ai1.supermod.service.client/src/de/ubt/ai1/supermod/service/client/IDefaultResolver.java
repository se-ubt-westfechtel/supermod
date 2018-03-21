/******************************************************************************
 * Copyright (c) 2018 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.service.client;


import org.eclipse.core.resources.IProject;
import org.eclipse.emf.common.util.EList;

import de.ubt.ai1.supermod.mm.core.ProductSpaceElement;

/**
 * Service interface for the non-interactive selection of one of the suggested candidates
 * for conflict resolution during the export of the preliminary workspace contents.
 * 
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>,
 * 			Johannes Schroepfer <Johannes.M.Schroepfer(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	2018-01-28
 */
public interface IDefaultResolver {
	
	/**
	 * Applies a selected default resolution strategy in order to choose one item among the set
	 * of candidates to prioritize for selection.
	 *
	 * @param candidates   the set of candidates, possible <code>null</code> or empty
	 * @param conflict     the conflict type (identified by the preference key)
	 * @param project      the current project (sparking the conflict)
	 * @return             the selected candidate, possibly <code>null</code>
	 */
	 public <E extends ProductSpaceElement> E selectCandidate(
			 EList<? extends E> candidates, String conflict, IProject project);
	 
	 /**
	 * Enumerates the available default resolution strategies.
	 */
	 public enum Strategy {
		 
		 RANDOM,
		 MOST_RECENT,
		 LEAST_RECENT,
		 MINE,
		 THEIR,
		 MOST_SPECIFIC,
		 LEAST_SPECIFIC
	 }
}
