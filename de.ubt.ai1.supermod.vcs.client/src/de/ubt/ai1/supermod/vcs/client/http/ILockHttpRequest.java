/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.vcs.client.http;

import com.google.inject.ImplementedBy;

import de.ubt.ai1.supermod.service.client.exceptions.SuperModClientException;
import de.ubt.ai1.supermod.vcs.client.http.impl.LockHttpRequest;

/**
 * Service interface to access the LOCK resource as defined by the SuperMod
 * server side web service.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	10.11.2015
 */
@ImplementedBy(LockHttpRequest.class)
public interface ILockHttpRequest {
	
	/**
	 * Checks whether the repository at the specified URL is locked
	 *
	 * @param repoUrl
	 * @param user
	 * @return whether the repository is locked
	 * @throws SuperModClientException 
	 */
	public boolean isLocked(String repoUrl, String user)
			throws SuperModClientException;
	
	/**
	 * Checks whether the repository at the specified URL is locked
	 *
	 * @param repoUrl
	 * @param user
	 * @return whether the repository is locked
	 * @throws SuperModClientException 
	 */
	public String getLockUser(String repoUrl, String user)
			throws SuperModClientException;
	
	/**
	 * Retrieves the user who is currently locking the repository.
	 *
	 * @param repoUrl
	 * @param user
	 * @return user who is locking the repository
	 * @throws SuperModClientException 
	 */
	public String getLockDate(String repoUrl, String user)
			throws SuperModClientException;

	/**
	 * Retrieves the date when the repository has been locked.
	 *
	 * @param repoUrl
	 * @param user
	 * @return date when repository has been locked
	 * @throws SuperModClientException
	 */
	public boolean lock(String repoUrl, String user) 
			throws SuperModClientException;
	
	/**
	 * Unlocks the repository at the specified URL
	 *
	 * @param repoUrl
	 * @param user
	 * @return whether unlocking was successful
	 */
	public boolean unlock(String repoUrl, String user)
			throws SuperModClientException;
	
	/**
	 * Forces unlocking the repository at the specified URL. This operation
	 * should be called only as the last resort. It may lead to inconsistencies
	 * on the server and other clients.
	 *
	 * @param repoUrl
	 * @param user
	 * @return whether forced unlocking was successful
	 */
	public boolean forceUnlock(String repoUrl, String user)
			throws SuperModClientException;
	
}
