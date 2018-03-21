/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.service;

import de.ubt.ai1.supermod.mm.core.VersionSpace;

/**
 * Service interface for the operation of version space reconciliation. After
 * a reconciliation has taken place, the high-level version space concepts must
 * be mapped by low-level rule base elements in a consistent and reproducible
 * way. Typically, version space reconciliation is performed before validation.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	28.10.2014
 */
public interface IVersionSpaceReconciliationService {
	
	/**
	 * To be implemented in order to reconcile the specified version space.
	 * Typically, reconciliation is passed to separate dimensions using specific
	 * implementations of {@link IVersionDimensionReconciliationService}.
	 *
	 * @param vs
	 */
	public void reconcileVersionSpace(VersionSpace vs);

}
