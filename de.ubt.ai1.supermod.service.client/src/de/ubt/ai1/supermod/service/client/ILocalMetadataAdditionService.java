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
 * Service interface to convert instances of {@code Repository} to
 * {@code LocalRepository}.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	11.11.2015
 */
public interface ILocalMetadataAdditionService {

	/**
	 * Converts a non-local to a local repository, setting all details and the
	 * contained EMF resource accordingly.
	 *
	 * @param repo
	 * @return a corresponding local repository
	 * @throws SuperModClientWrappedException 
	 */
	LocalRepository convertRepositoryToLocalRepository(Repository repo)
			throws SuperModClientWrappedException;

}
