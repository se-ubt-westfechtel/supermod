/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.vcs.client.http.impl;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import de.ubt.ai1.supermod.service.client.exceptions.SuperModClientException;
import de.ubt.ai1.supermod.service.client.exceptions.SuperModClientWrappedException;
import de.ubt.ai1.supermod.vcs.client.http.IBrowseHttpRequest;
import de.ubt.ai1.supermod.vcs.client.http.exceptions.SuperModClientResponseCodeException;

/**
 * Default implementation of the BROWSE request service interface.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	10.11.2015
 */
public class BrowseHttpRequest
extends BasicHttpRequest
implements IBrowseHttpRequest {

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.vcs.client.http.IBrowseHttpRequest
	 * #existsRepo(java.lang.String, java.lang.String)
	 */
	@Override
	public boolean existsRepo(String repoUrl, String user)
			throws SuperModClientException {
		Map<String, String> queryParams = new HashMap<>();
		queryParams.put("user", user);
		HttpURLConnection conn;
		try {
			conn = createHttpConnection(repoUrl + "/browse", 
					GET, getPort(), queryParams, null);
			int responseCode = conn.getResponseCode();
			switch (responseCode) {
			case HttpURLConnection.HTTP_OK:
				return true;
			case HttpURLConnection.HTTP_NO_CONTENT:
				return false;
			default:
				throw new SuperModClientResponseCodeException(responseCode,
						conn.getResponseMessage());
			}
		} catch (IOException e) {
			throw new SuperModClientWrappedException(e);
		}		
	}
	
	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.vcs.client.http.IBrowseHttpRequest
	 * #existsRepo(java.lang.String, java.lang.String)
	 */
	@Override
	public boolean canCreateRepo(String repoUrl, String user)
			throws SuperModClientException {
		Map<String, String> queryParams = new HashMap<>();
		queryParams.put("user", user);
		HttpURLConnection conn;
		try {
			conn = createHttpConnection(repoUrl + "/browse", 
					GET, getPort(), queryParams, null);
			int responseCode = conn.getResponseCode();
			switch (responseCode) {
			case HttpURLConnection.HTTP_OK:
				return false;
			case HttpURLConnection.HTTP_NO_CONTENT:
				return true;
			default:
				throw new SuperModClientResponseCodeException(
						responseCode, conn.getResponseMessage());
			}
		} catch (IOException e) {
			throw new SuperModClientWrappedException(e);
		}		
	}

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.vcs.client.http.IBrowseHttpRequest
	 * #browseRepos(java.lang.String, java.lang.String)
	 */
	@Override
	public List<String> browseRepos(String baseUrl, String user)
			throws SuperModClientException {
		Map<String, String> queryParams = new HashMap<>();
		queryParams.put("user", user);
		HttpURLConnection conn;
		try {
			conn = createHttpConnection(baseUrl + "/browseAll", 
					GET, getPort(), queryParams, null);
			if (conn.getResponseCode() == HttpURLConnection.HTTP_OK) {
				String response = getResponse(conn);
				return Arrays.asList(response.split("\n"));
			}
			else {
				throw new SuperModClientResponseCodeException(
						conn.getResponseCode(), conn.getResponseMessage());
			}
		} catch (IOException e) {
			throw new SuperModClientWrappedException(e);
		}		
	}

}
