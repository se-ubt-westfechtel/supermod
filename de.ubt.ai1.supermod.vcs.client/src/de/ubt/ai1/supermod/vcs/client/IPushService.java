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
import de.ubt.ai1.supermod.vcs.client.impl.PushService;

/**
 * Service interface for the synchronizing VCS operation "Push", which 
 * propagates outgoing changes from the client side repository to the remote.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	09.11.2015
 */
@ImplementedBy(PushService.class)
public interface IPushService {

	/**
	 * Checks whether the specified local repository is ready to push changes
	 * to the server side.
	 *
	 * @param repo
	 * @return
	 */
	boolean canPush(LocalRepository repo);

	/**
	 * Performs the push operation.
	 *
	 * @param repo
	 * @param rs
	 * @throws SuperModClientException 
	 */
	void push(LocalRepository repo, ResourceSet rs) 
			throws SuperModException;

}
