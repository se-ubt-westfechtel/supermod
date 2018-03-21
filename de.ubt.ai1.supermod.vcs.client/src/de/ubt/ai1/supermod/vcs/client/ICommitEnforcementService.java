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
import de.ubt.ai1.supermod.vcs.client.impl.CommitEnforcementService;

/**
 * Interface for the VCS operation "Enforce Commit". This operation is invoked
 * whenever a switch operation is executed, which would result in lost changes
 * within the local repository. The user is asked whether to commit his current
 * changes in order to prevent this loss.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	01.08.2014
 */
@ImplementedBy(CommitEnforcementService.class)
public interface ICommitEnforcementService {

	/**
	 * To be implemented in order to decide whether a commit is necessary in
	 * order to save pending changes.
	 *
	 * @param repo
	 * @return whether the user should be recommended to commit his changes.
	 * @throws SuperModClientException in case an error occurs during the check
	 * 			for local modifications.
	 */
	public boolean isCommitNecessary(LocalRepository repo)
			throws SuperModClientException;

	/**
	 * Asks the user whether he wants to commit his pending changes.
	 *
	 * @return <code>true</code> if a commit is enforced, <code>false</code> in
	 * 			case pending changes are ignored.
	 */
	public boolean proposeCommit();

	/**
	 * To be implemented in order to enforce the commit operation.
	 *
	 * @param repo
	 * @param rs to be passed to the commit service.
	 * @throws SuperModException
	 */
	public void enforceCommit(LocalRepository repo, ResourceSet rs)
			throws SuperModException;

}
