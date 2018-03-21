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
import de.ubt.ai1.supermod.vcs.client.impl.RemotePropertiesService;

/**
 * Service interface for the VCS operation "show remote properties". It displays
 * connection details and status information concerning the remote repository
 * to the user.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	09.11.2015
 */
@ImplementedBy(RemotePropertiesService.class)
public interface IRemotePropertiesService {
	
	/**
	 * To be implemented to check whether the server is accessible.
	 *
	 * @param repo
	 * @return
	 */
	boolean canShowRemoteProperties(LocalRepository repo);

	/**
	 * To be implemented to show properties of the remote repository belonging
	 * to the specified local repository.
	 * 
	 * @param repo
	 * @throws SuperModClientException 
	 */
	void showRemoteProperties(LocalRepository repo)
			throws SuperModClientException;

}
