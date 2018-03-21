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
import de.ubt.ai1.supermod.vcs.client.impl.RemoteShareService;

/**
 * Client service interface for the VCS operation "Share with Remote", which
 * extends the "Share" operation in case the repository type supports remote
 * operations (push/pull).
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	11.11.2015
 */
@ImplementedBy(RemoteShareService.class)
public interface IRemoteShareService {

	/**
	 * Prompts the user for specification of a remote repository, with which
	 * the created local repository will be shared.
	 *
	 * @param repo the local repository to share
	 * @param rs
	 * @return whether remote sharing was successful
	 * @throws SuperModClientException 
	 */
	boolean shareWithRemote(LocalRepository repo, ResourceSet rs) throws SuperModClientException;

}
