/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.vcs.client.http.impl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Map;

/**
 * Abstract base class for requests connected to SuperMod's REST server
 * interface.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	10.11.2015
 */
public abstract class BasicHttpRequest {
	
	protected static final String CHARSET = StandardCharsets.UTF_8.name();
	
	protected static final int UNDEFINED_PORT = -1;
	
	protected static final int CONNECT_TIMEOUT = 30000;
	protected static final int READ_TIMEOUT = 60000;

	protected static final String GET = "GET";
	protected static final String PUT = "PUT";
	protected static final String POST = "POST";
	protected static final String DELETE = "DELETE";
	
	/**
	 * Creates a HTTP connection with the specified parameters
	 *
	 * @param uri the URI (not including port or query parameters)
	 * @param method one of GET/POST/PUT/DELETE
	 * @param port the port to use. If negative, default port will be used.
	 * @param queryParams query parameters to be attached to the request
	 * @param entity the contents of the query, or <code>null</code> in the
	 * 			case of a GET or DELETE query.
	 * @return the established connection
	 * @throws IOException
	 */
	protected HttpURLConnection createHttpConnection(String uri, String method, 
			int port, Map<String, String> queryParams, String entity) 
			throws IOException {
		if (port > 0) {
			uri += ":" + port;
		}
		if (queryParams != null && !queryParams.isEmpty()) {
			uri += "?";
			for (Map.Entry<String, String> qp : queryParams.entrySet()) {
				if (qp.getValue() != null) {
					uri += qp.getKey() + "=" + 
							URLEncoder.encode(qp.getValue(), CHARSET) + "&";
				}
			}
			uri = uri.substring(0, uri.length() - 1);
		}
		URL url = new URL(uri);
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setRequestMethod(method);
		conn.setUseCaches(false);
		conn.setConnectTimeout(CONNECT_TIMEOUT);
		conn.setReadTimeout(READ_TIMEOUT);
		conn.setDoInput(true);
		if (entity != null) {
			conn.setDoOutput(true);
			OutputStream os = conn.getOutputStream();
			os.write(entity.getBytes());
			os.flush();
			os.close();
		}
		return conn;
	}
	
	/**
	 * Executes the request on demand and returns the response as string, if any.
	 *
	 * @param conn
	 * @return the response as string
	 */
	protected String getResponse(HttpURLConnection conn) throws IOException {
		InputStream response = conn.getInputStream();
		StringBuilder result = new StringBuilder();
		BufferedReader reader = new BufferedReader(
				new InputStreamReader(response));
		String line = null;
		while ((line = reader.readLine()) != null) {
			result.append(line + System.lineSeparator());
		}
		while (line != null);
		return result.toString();
	}
	
	/**
	 * Returns the user-defined port to use for requests.
	 *
	 * @return
	 */
	protected int getPort() {
		return UNDEFINED_PORT;
	}
	
}
