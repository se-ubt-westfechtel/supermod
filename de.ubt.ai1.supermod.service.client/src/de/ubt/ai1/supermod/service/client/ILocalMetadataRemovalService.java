/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.service.client;

import de.ubt.ai1.supermod.mm.client.LocalRepository;
import de.ubt.ai1.supermod.mm.core.Repository;
import de.ubt.ai1.supermod.service.client.exceptions.SuperModClientWrappedException;

/**
 * Client service interface for transforming a local repository into a regular,
 * server-side compatible repository. It removes all local meta-data from the
 * specified local repository.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	20.10.2015
 */
public interface ILocalMetadataRemovalService {
	
	/**
	 * To be implemented in order to perform meta-data removal. This may
	 * include the deletion of local descriptor files.
	 *
	 * @param repo the local repository to strip from meta-data
	 * @return a regular repository containing no local meta-data
	 * @throws SuperModClientWrappedException 
	 */
	public Repository removeMetadata(LocalRepository repo)
			throws SuperModClientWrappedException;

}
