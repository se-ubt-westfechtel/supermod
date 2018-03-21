/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.vcs.client;

import org.eclipse.emf.ecore.resource.ResourceSet;

import com.google.inject.ImplementedBy;

import de.ubt.ai1.supermod.mm.client.LocalRepository;
import de.ubt.ai1.supermod.service.client.exceptions.SuperModClientException;
import de.ubt.ai1.supermod.service.exceptions.SuperModException;
import de.ubt.ai1.supermod.vcs.client.impl.InPlaceCommitService;

/**
 * Interface for the VCS operation "Commit". It transfers changes that have
 * been performed within the local repository since the last check-out to the
 * repository. The set of versions where the change is visible must be specified
 * by the user as an <em>ambition</em>.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	01.08.2014
 */
@ImplementedBy(InPlaceCommitService.class)
public interface ICommitService {
	
	/**
	 * To be implemented in order to check whether a commit is currently 
	 * possible. A commit is not possible in case the local repository is
	 * obstructed or there are no pending changes to commit.
	 *
	 * @param repo
	 * @param propose whether to propose resource selection to the user, if
	 * 			necessary, already here.
	 * @return whether a commit is currently possible.
	 * @throws SuperModClientException in case an error occurs during this
	 * 			check.
	 */
	public boolean canCommit(LocalRepository repo, boolean propose)
			throws SuperModClientException;
	
	/**
	 * Performs the commit operation. Elements of the product workspace have
	 * been inserted or deleted have to be detected. Next, corresponding
	 * elements of the product space need to be added and/or their visibility
	 * needs to be modified.
	 *
	 * @param repo
	 * @param rs where to allocate new product space resources.
	 * @return whether the commit has been realized. false if cancelled by the
	 * 			user.
	 * @throws SuperModException in case the commit fails.
	 */
	public boolean commit(LocalRepository repo, ResourceSet rs) 
			throws SuperModException;

}
