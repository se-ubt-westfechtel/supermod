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
import de.ubt.ai1.supermod.vcs.client.impl.AmendService;

/**
 * Interface for the VCS operation "Amend Previous Commit". It retrospectively
 * changes the <em>ambition</em> specified for the previous commit. It may only
 * be realized for version space models which keep track of the ambitions, e.g.
 * using the change dimension.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	29.09.2015
 */
@ImplementedBy(AmendService.class)
public interface IAmendService {
	
	/**
	 * To be implemented in order to check whether an amend operation is
	 * generally allowed by the version space model and currently possible.
	 * An amend is not possible in case there are pending changes.
	 *
	 * @param repo
	 * @return whether a commit is currently possible.
	 * @throws SuperModClientException in case an error occurs during this
	 * 			check.
	 */
	public boolean canAmend(LocalRepository repo)
			throws SuperModClientException;
	
	/**
	 * Performs the amend operation. The user is asked to revise the previously
	 * specified ambition. The revised ambition is then linked to the previous
	 * change transparently.
	 *
	 * @param repo
	 * @param rs
	 * @return whether the amend has been realized. false if cancelled by the
	 * 			user.
	 * @throws SuperModException in case the amend operation fails.
	 */
	public boolean amend(LocalRepository repo, ResourceSet rs) 
			throws SuperModException;

}
