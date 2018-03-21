/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.service.client;

import de.ubt.ai1.supermod.mm.core.OptionBinding;
import de.ubt.ai1.supermod.mm.core.VersionSpace;
import de.ubt.ai1.supermod.mm.diff.WriteSet;

/**
 * This client service interface notifies the user of a write set that contains
 * non-representative changes. The user may decide whether or not he/she
 * considers the presented conflicts as harmful for product consistency.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	25.06.2015
 */
public interface IWriteSetConflictReporter {
	
	/**
	 * Reports the detected conflicts to the user, who may decide whether or not
	 * to commit the local changes to the repository anyway.
	 *
	 * @param conflicts
	 * @return true if the user accepts the presented conflicts and decides to
	 * 			commit anyway, false if commit shall be cancelled.
	 */
	boolean report(WriteSet writeSet, OptionBinding choice, VersionSpace vs);

}
