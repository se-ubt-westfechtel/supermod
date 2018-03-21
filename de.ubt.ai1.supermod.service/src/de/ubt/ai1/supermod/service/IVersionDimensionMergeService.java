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
import de.ubt.ai1.supermod.mm.core.VersionDimension;

/**
 * Service interface for merging another version of a version dimension into the
 * base dimension in an out-place way.
 * 
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	20.10.2015
 */
public interface IVersionDimensionMergeService {
	
	/**
	 * To be implemented in order to perform the merge operation. All elements
	 * that have no correspondence in the base version should be copied into
	 * the base. No base element should ever be deleted.
	 *
	 * @param base
	 * @param other
	 * @param dependingMap a map containing results of depending dimensions.
	 * @param a map assigning all "base" options under their rule base IDs
	 */
	public Map<String, Option>
			merge(VersionDimension base, VersionDimension other,
					Map<String, Option> dependingMap);

}
