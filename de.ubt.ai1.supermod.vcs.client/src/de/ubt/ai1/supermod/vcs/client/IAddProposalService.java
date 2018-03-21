/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.vcs.client;

import com.google.inject.ImplementedBy;

import de.ubt.ai1.supermod.mm.client.LocalRepository;
import de.ubt.ai1.supermod.service.client.exceptions.SuperModClientException;
import de.ubt.ai1.supermod.vcs.client.impl.AddProposalService;

/**
 * Interface for the VCS operation "add proposal", which may be invoked during
 * a commit of a resource which is currently unversioned.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	01.08.2014
 */
@ImplementedBy(AddProposalService.class)
public interface IAddProposalService {

	/**
	 * To be implemented in order to match the resources visible in the local
	 * workspace with the versioned resources in the specified local repository.
	 * In case the workspace contains a resource which is not explicitly
	 * declared as versioned or unversioned within the repository, the user
	 * must be asked for a decision and the corresponding operation (add
	 * or remove) must be performed.
	 *
	 * @param repo
	 * @return whether the user has made any decision
	 * @throws SuperModClientException
	 */
	public boolean propose(LocalRepository repo) throws SuperModClientException;

}
