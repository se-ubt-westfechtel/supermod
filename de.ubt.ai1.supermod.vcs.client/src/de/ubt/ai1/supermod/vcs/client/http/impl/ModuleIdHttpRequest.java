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
import java.util.HashMap;
import java.util.Map;

import de.ubt.ai1.supermod.service.client.exceptions.SuperModClientException;
import de.ubt.ai1.supermod.service.client.exceptions.SuperModClientWrappedException;
import de.ubt.ai1.supermod.vcs.client.http.IModuleIdHttpRequest;
import de.ubt.ai1.supermod.vcs.client.http.exceptions.SuperModClientResponseCodeException;

/**
 * Default implementation of the MODULE ID request service interface.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	10.11.2015
 */
public class ModuleIdHttpRequest
extends BasicHttpRequest
implements IModuleIdHttpRequest {

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.vcs.client.http.IModuleIdHttpRequest
	 * #getModuleId(java.lang.String, java.lang.String)
	 */
	@Override
	public String getModuleId(String repoUrl, String user)
			throws SuperModClientException {
		Map<String, String> queryParams = new HashMap<>();
		queryParams.put("user", user);
		HttpURLConnection conn;
		try {
			conn = createHttpConnection(repoUrl + "/moduleId", 
					GET, getPort(), queryParams, null);
			int responseCode = conn.getResponseCode();
			if (responseCode == HttpURLConnection.HTTP_OK) {
				return getResponse(conn).trim();
			}
			else {
				throw new SuperModClientResponseCodeException(responseCode,
						conn.getResponseMessage());
			}
		} catch (IOException e) {
			throw new SuperModClientWrappedException(e);
		}		
	}

}
