/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.service.client;

import de.ubt.ai1.supermod.mm.client.LocalRepository;
import de.ubt.ai1.supermod.mm.diff.WriteSet;

/**
 * Service interface for post-processing the write set after visibilities have
 * been updated. Typically, post-processing is concerned with updating local
 * information relevant for the repository's synchronization with multiple
 * copies, e.g., the transaction ID.
 * 
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	20.10.2015
 */
public interface IWriteSetPostProcessor {
	
	/**
	 * To be implemented in order to post-process the write set according
	 * to the employed synchronization strategy
	 *
	 * @param repo the local repository to which the write set has been applied.
	 * @param writeSet the write set that has been applied.
	 * @return whether post-processing has actually taken place.
	 */
	public boolean postProcess(LocalRepository repo, WriteSet writeSet);

}
