/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.service.client;

import de.ubt.ai1.supermod.mm.client.ConflictSet;

/**
 * This client service interface describes a procedure that displays a given
 * conflict set to the user, who may decide whether or not he/she considers the
 * presented conflicts as harmful for product space consistency.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	27.04.2015
 */
public interface IProductConflictReporter {

	/**
	 * Reports the detected conflicts to the user, who may decide whether or not
	 * to export the conflicting product space to the local workspace anyway.
	 *
	 * @param conflicts
	 * @return true if the user accepts the presented conflicts and decides to
	 * 			export anyway, false if export shall be cancelled.
	 */
	boolean report(ConflictSet conflicts);

}
