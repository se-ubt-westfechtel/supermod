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
import de.ubt.ai1.supermod.mm.core.VersionSpace;

/**
 * Service interface for merging another version of a version space into the
 * version space in an out-place way. Typically, an implementation would refer
 * back to suitable version dimension merge services for specific dimensions.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	20.10.2015
 */
public interface IVersionSpaceMergeService {
	
	/**
	 * To be implemented in order to perform the merge operation. All elements
	 * that have no correspondence in the base version should be copied into
	 * the base. No base element should ever be deleted.
	 *
	 * @param base
	 * @param other
 	 * @param a map referencing all options of the merged version space under
 	 * 			their rule base ID
	 */
	public Map<String, Option>
			merge(VersionSpace base, VersionSpace other);

}
