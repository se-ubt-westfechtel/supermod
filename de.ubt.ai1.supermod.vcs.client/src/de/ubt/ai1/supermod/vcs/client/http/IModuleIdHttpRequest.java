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
import de.ubt.ai1.supermod.vcs.client.http.impl.ModuleIdHttpRequest;

/**
 * Service interface to access the MODULE ID resource as defined by the SuperMod
 * server side web service.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	10.11.2015
 */
@ImplementedBy(ModuleIdHttpRequest.class)
public interface IModuleIdHttpRequest {
	
	/**
	 * Retrieves the module id of the repository found at the specified URL.
	 *
	 * @param repoUrl
	 * @param user
	 * @return the module id, or <code>null</code> if no such repository.
	 */
	public String getModuleId(String repoUrl, String user)
			throws SuperModClientException;

}
