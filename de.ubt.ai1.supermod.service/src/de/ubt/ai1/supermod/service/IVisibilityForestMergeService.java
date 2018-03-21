/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.service;

import java.util.Map;

import de.ubt.ai1.supermod.mm.core.Option;
import de.ubt.ai1.supermod.mm.core.Visibility;
import de.ubt.ai1.supermod.mm.core.VisibilityForest;

/**
 * Service interface for merging another version of a visibility forest into a
 * base version of the visibility forest.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	20.10.2015
 */
public interface IVisibilityForestMergeService {
	
	/**
	 * To be implemented in order to perform the merge operation. All elements
	 * that have no correspondence in the base version should be copied into
	 * the base. No base element should ever be deleted.
	 *
	 * @param base
	 * @param other
	 * @param the map returned by the previously applied version space merge
	 * 			service, which associates options under their rule base IDs
	 * @param a map assigning all visibilities of the "base" forest under their
	 * 			UUIDs
	 */
	public Map<String, Visibility>merge(VisibilityForest base,
			VisibilityForest other,	Map<String, Option> optionMap);

}
