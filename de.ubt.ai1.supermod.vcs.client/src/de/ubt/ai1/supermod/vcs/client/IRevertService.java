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
import de.ubt.ai1.supermod.vcs.client.impl.RevertService;

/**
 * Interface for the VCS operation "Revert". This operation discards all
 * modifications that have been applied within the local workspace, and
 * replaces the workspace contents by the contents of the last checked-out
 * or committed version of the repository's product space.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	01.08.2014
 */
@ImplementedBy(RevertService.class)
public interface IRevertService {
	
	/**
	 * Checks whether the workspace mapped by a specified repository may be
	 * reverted.
	 *
	 * @param repo
	 * @return whether a revert operation may be applied. The operation cannot
	 * 			be applied in case the repository is obstructed or no changes
	 * 			are pending in the workspace.
	 * @throws SuperModClientException in case an error occurs during the check.
	 */
	public boolean canRevert(LocalRepository repo) 
			throws SuperModClientException;
	
	/**
	 * Performs the revert operation, replacing the workspace contents by the
	 * current version of the repository's product space contents.
	 *
	 * @param repo
	 * @param rs where to allocate new workspace resources.
	 * @throws SuperModException in case the revert operation fails.
	 */
	public void revert(LocalRepository repo, ResourceSet rs) 
			throws SuperModException;

}
