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
import de.ubt.ai1.supermod.mm.core.OptionBinding;
import de.ubt.ai1.supermod.service.exceptions.SuperModException;
import de.ubt.ai1.supermod.vcs.client.impl.SwitchService;

/**
 * Interface for the VCS operation "Switch", which replaces the product version
 * visible in the current workspace by another version which is selected by
 * the user by specification of a <em>choice</em>.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	01.08.2014
 */
@ImplementedBy(SwitchService.class)
public interface ISwitchService {

	/**
	 * Checks whether the switch operation may be applied to the local
	 * workspace using the specified local repository.
	 *
	 * @param repo
	 * @return whether the switch operation can be applied. The operation cannot
	 * 			be applied in case the repository is obstructed.
	 */
	public boolean canSwitch(LocalRepository repo);

	/**
	 * To be implemented in order to perform the switch operation with an
	 * unspecified choice. The user should be asked for a choice and the
	 * generalized operation should be applied.
	 * 
	 * @see #doSwitch(LocalRepository, OptionBinding, ResourceSet)
	 *
	 * @param repo
	 * @param rs
	 * @return false if the user has canceled.
	 * @throws SuperModException
	 */
	public boolean doSwitch(LocalRepository repo, ResourceSet rs) 
			throws SuperModException;

}
