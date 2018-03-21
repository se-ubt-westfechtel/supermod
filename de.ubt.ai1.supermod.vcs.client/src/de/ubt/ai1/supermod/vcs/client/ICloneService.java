/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.vcs.client;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.resource.ResourceSet;

import com.google.inject.ImplementedBy;

import de.ubt.ai1.supermod.mm.client.LocalRepository;
import de.ubt.ai1.supermod.service.client.exceptions.SuperModClientException;
import de.ubt.ai1.supermod.service.exceptions.SuperModException;
import de.ubt.ai1.supermod.vcs.client.impl.CloneService;

/**
 * Client service interface for the VCS operation "Clone", which creates a
 * new SuperMod project containing a local copy of the remote repository.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	10.11.2015
 */
@ImplementedBy(CloneService.class)
public interface ICloneService {

	/**
	 * Checks whether there exists a remote server with specified URI where the
	 * specified user is allowed to clone the repository encoded in the URI.
	 * 
	 * @param repoUri
	 * @param user 
	 * @return true in case the clone operation can be safely executed
	 */
	boolean canClone(String repoUri, String user);

	/**
	 * Performs the clone operation by starting a clone request and
	 * processing the result, creating a local copy of the repository.
	 * The clone post-processor methods are called and local synchronization
	 * information is attached.
	 * 
	 * @param repoUri
	 * @param user 
	 * @param rs where the repository clone will be stored
	 * @param projectName the name of the Eclipse project to be created
	 * @param monitor 
	 * @return the created repository
	 * @throws SuperModException 
	 */
	LocalRepository doClone(String repoUri, String user, ResourceSet rs, 
			String projectName, IProgressMonitor monitor)
			throws SuperModClientException, SuperModException;
	
}
