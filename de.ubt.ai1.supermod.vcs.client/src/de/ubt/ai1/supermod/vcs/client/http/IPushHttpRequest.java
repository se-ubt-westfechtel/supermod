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
import de.ubt.ai1.supermod.vcs.client.http.impl.PushHttpRequest;

/**
 * Service interface to access the PUSH resource as defined by the SuperMod
 * server side web service.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	10.11.2015
 */
@ImplementedBy(PushHttpRequest.class)
public interface IPushHttpRequest {

	/**
	 * Performs the push request, forwarding a delta from the client to the
	 * server.
	 *
	 * @param repoUrl
	 * @param user
	 * @param localTransaction the current local transaction number
	 * @param repoContents a string serialization of the repository delta to 
	 * push
	 */
	public String push(String repoUrl, String user, int localTransaction,
			String repoContents) throws SuperModClientException;
	
}
