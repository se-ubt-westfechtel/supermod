/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.service;

import java.util.Set;

import de.ubt.ai1.supermod.mm.core.Repository;

/**
 * Service interface for the projection service, which reduces a copy of the
 * entire repository to elements modified during a set of specified transactions.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	20.10.2015
 */
public interface IRepositoryProjectionService {
	
	/**
	 * Projects the specified copy of the repository. All elements whose
	 * transaction id is not contained in the specified set are deleted.
	 * Referenced elements are maintained (1-context representation).
	 *
	 * @param repo
	 * @param transactionId the set of transaction ids to project
	 */
	public void projectRepository(Repository repo, Set<Integer> transactionIds);

}
