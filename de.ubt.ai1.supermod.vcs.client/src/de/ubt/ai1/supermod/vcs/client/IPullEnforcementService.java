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
import de.ubt.ai1.supermod.vcs.client.impl.PullEnforcementService;

/**
 * Interface for the VCS operation "Enforce Pull". This operation is invoked
 * whenever a push operation is executed, and supposed to check whether the
 * remote repository contains pending changes which must be pulled first.
 * The user is asked whether to pull; otherwise, the push operation must be
 * cancelled.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	08.02.2016
 */
@ImplementedBy(PullEnforcementService.class)
public interface IPullEnforcementService {

	/**
	 * To be implemented in order to decide whether a pull is necessary.
	 * This is the case when the current read transaction does not correspond
	 * to the latest read transaction on the server.
	 *
	 * @param repo
	 * @return whether a pull must be enforced.
	 * @throws SuperModClientException in case an error occurs during the check.
	 */
	public boolean isPullNecessary(LocalRepository repo)
			throws SuperModClientException;

	/**
	 * Asks the user whether he wants to pull incoming changes.
	 *
	 * @return <code>true</code> if a pull is enforced, <code>false</code> in
	 * 			case the user cancels the action.
	 */
	public boolean proposePull();

	/**
	 * To be implemented in order to enforce the pull operation.
	 *
	 * @param repo
	 * @param rs to be passed to the pull service.
	 * @throws SuperModException
	 */
	public void enforcePull(LocalRepository repo, ResourceSet rs)
			throws SuperModException;
	
}
