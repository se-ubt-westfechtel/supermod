/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/

package de.ubt.ai1.supermod.service;

import de.ubt.ai1.supermod.mm.core.VisibilityForest;
import de.ubt.ai1.supermod.mm.diff.WriteSet;

/**
 * Service interface for updating the visibilities of product space elements in
 * order to realize the changes described by a specified change set. Within
 * the change set, a change is described by listing added and deleted elements.
 * Furthermore, an <em>ambition</em> is specified which describes the scope of
 * the change, i.e., all versions where the insertions and deletions should
 * be visible. Clients should implement a specific strategy to modify the
 * visibilities of inserted and deleted elements in order to make the write
 * set effective.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	31.07.2014
 */
public interface IVisibilityUpdateService {
	
	/**
	 * To be implemented by clients in order to realize a specific visibility
	 * updating strategy. Elements which appear in the write set should be
	 * modified in a way that insertions and deletions should be visible in
	 * all versions that match the <em>ambition</em> specified in the write
	 * set.
	 *
	 * @param writeSet describes the change to apply.
	 * @param forest where new visibilities should be inserted, and existing
	 * 			visibilities should be reused.
	 * @param transactionId the transaction id to set for inserted visibilities.
	 */
	public void updateVisibilities(WriteSet writeSet, VisibilityForest forest,
			int transactionId);

}
