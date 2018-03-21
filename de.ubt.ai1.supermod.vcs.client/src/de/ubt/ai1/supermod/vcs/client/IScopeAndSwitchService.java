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
import de.ubt.ai1.supermod.vcs.client.impl.ScopeAndSwitchService;

/**
 * VCS interface for the combination of scope and switch, which is used to
 * simulate the original UVM workflow (specify an ambition first, then
 * specify the choice as a representative of the ambition).
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	30.09.2015
 */
@ImplementedBy(ScopeAndSwitchService.class)
public interface IScopeAndSwitchService {
	
	/**
	 * To be implemented in order to check whether a combination of scope and
	 * switch is currently possible.
	 *
	 * @param repo
	 * @return whether a combination of scope and switch is currently possible.
	 * @throws SuperModClientException in case an error occurs during this
	 * 			check.
	 */
	public boolean canScopeAndSwitch(LocalRepository repo)
			throws SuperModClientException;
	
	/**
	 * Performs the scope operation by requesting an ambition from the user,
	 * and a switch operation by requesting a choice inside the ambition.
	 * 
	 * @param repo
	 * @param rs where to allocate new product space resources.
	 * @return whether the operation has been realized. false if cancelled by
	 * 			the user.
	 * @throws SuperModException in case scope or switch fails.
	 */
	public boolean scopeAndSwitch(LocalRepository repo, ResourceSet rs) 
			throws SuperModException;


}
