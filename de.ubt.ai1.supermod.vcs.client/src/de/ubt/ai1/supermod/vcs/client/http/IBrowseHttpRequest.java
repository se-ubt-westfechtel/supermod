/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.vcs.client.http;

import java.util.List;

import com.google.inject.ImplementedBy;

import de.ubt.ai1.supermod.service.client.exceptions.SuperModClientException;
import de.ubt.ai1.supermod.vcs.client.http.impl.BrowseHttpRequest;

/**
 * Service interface to access the BROWSE resource as defined by the SuperMod
 * server side web service.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	10.11.2015
 */
@ImplementedBy(BrowseHttpRequest.class)
public interface IBrowseHttpRequest {
	
	/**
	 * Checks whether a repository exists at the specified URL.
	 *
	 * @param repoUrl
	 * @param user
	 * @return whether the repository exists
	 */
	public boolean existsRepo(String repoUrl, String user)
			throws SuperModClientException;
	
	/**
	 * Checks whether a repository can be created at the specified location.
	 *
	 * @param repoUrl
	 * @param user
	 * @return true if no such repository exists, but it may be created by
	 * 			the user.
	 * @throws SuperModClientException
	 */
	boolean canCreateRepo(String repoUrl, String user)
			throws SuperModClientException;

	
	/**
	 * Lists all repositories belonging to a specified base URL referring to
	 * a SuperMod server.
	 *
	 * @param repoUrl
	 * @param user
	 * @return a list of absolute URLs referring to repositories found under
	 * the specified base URL. If the base URL is invalid, <code>null</code>
	 * is returned.
	 */
	public List<String> browseRepos(String baseUrl, String user) 
			throws SuperModClientException;


}
