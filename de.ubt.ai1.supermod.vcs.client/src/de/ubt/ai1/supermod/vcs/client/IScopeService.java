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
import de.ubt.ai1.supermod.vcs.client.impl.ScopeService;

/**
 * Interface for the VCS operation "Scope". It fixes the scope of the current
 * workspace change by having an <em>ambition</em> specified by the user.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	28.09.2015
 */
@ImplementedBy(ScopeService.class)
public interface IScopeService {
	
	/**
	 * To be implemented in order to check whether a scope change is currently 
	 * possible. A scope change is not possible in case the local repository is
	 * obstructed.
	 *
	 * @param repo
	 * @return whether a scope change is currently possible.
	 * @throws SuperModClientException in case an error occurs during this
	 * 			check.
	 */
	public boolean canScope(LocalRepository repo)
			throws SuperModClientException;
	
	/**
	 * Performs the scope operation by requesting an ambition from the user.
	 * The ambition will be saved in the meta-data section. 
	 * 
	 * @param repo
	 * @param rs where to allocate new product space resources.
	 * @return whether the scope has been realized. false if cancelled by the
	 * 			user.
	 * @throws SuperModException in case the scope change fails.
	 */
	public boolean scope(LocalRepository repo, ResourceSet rs) 
			throws SuperModException;

}
