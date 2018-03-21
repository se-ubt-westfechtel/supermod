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
import de.ubt.ai1.supermod.vcs.client.impl.UpdateEnforcementService;

/**
 * Interface for the VCS operation "Enforce Update". This operation is invoked
 * after the user has fetched incoming changes using the "Pull" operation.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	01.08.2014
 */
@ImplementedBy(UpdateEnforcementService.class)
public interface IUpdateEnforcementService {

	/**
	 * Asks the user whether he wants to update to include fetched remote
	 * changes into the local workspace.
	 *
	 * @return <code>true</code> if an update is enforced, <code>false</code> in
	 * 			case a new branch shall be created for the local changes.
	 */
	public boolean proposeUpdate()
			throws SuperModClientException;

	/**
	 * To be implemented in order to enforce the update operation.
	 *
	 * @param repo
	 * @param rs to be passed to the update service.
	 * @throws SuperModException
	 */
	public void enforceUpdate(LocalRepository repo, ResourceSet rs)
			throws SuperModException;

}
