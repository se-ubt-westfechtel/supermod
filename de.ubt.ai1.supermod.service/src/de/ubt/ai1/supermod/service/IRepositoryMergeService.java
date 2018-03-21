/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.service;

import de.ubt.ai1.supermod.mm.core.Repository;

/**
 * Service interface for merging another version of a SuperMod repository into
 * the base repository in an out-place way.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	20.10.2015
 */
public interface IRepositoryMergeService {
	
	/**
	 * To be implemented in order to perform the merge operation. All elements
	 * that have no correspondence in the base version should be copied into
	 * the base. No base element should ever be deleted. After merging, the
	 * base version must not reference any element of the other dimension, i.e.,
	 * it must be safe to completely delete the "other" repository.
	 *
	 * @param base
	 * @param other
	 * @param a map assigning newly inserted elements of "other" to "base"
	 */
	public void	merge(Repository base, Repository other);

}
