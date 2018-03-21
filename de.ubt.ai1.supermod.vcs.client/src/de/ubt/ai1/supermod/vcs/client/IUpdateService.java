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
import de.ubt.ai1.supermod.vcs.client.impl.UpdateService;

/**
 * Interface for the VCS operation "Update". This operation scans the
 * repository for recently pulled remote changes, which need to be integrated
 * into the local
 * workspace. The updated contents are merged into the local workspace, possibly
 * losing pending local modifications.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	01.08.2014
 */
@ImplementedBy(UpdateService.class)
public interface IUpdateService {
	
	/**
	 * Checks whether the update operation may be applied to the local
	 * workspace using the specified local repository.
	 *
	 * @param repo
	 * @return whether the update operation can be applied. The operation cannot
	 * 			be applied in case the repository is obstructed.
	 */
	public boolean canUpdate(LocalRepository repo);

	/**
	 * To be implemented in order to perform the switch operation with an
	 * unspecified choice. The choice must be calculated automatically by
	 * updating the local choice.
	 * 
	 * @see #update(LocalRepository, OptionBinding, ResourceSet)
	 *
	 * @param repo
	 * @param rs
	 * @throws SuperModException
	 */
	public void update(LocalRepository repo, ResourceSet rs) 
			throws SuperModException;
	
	/**
	 * To be implemented in order to replace the contents of the versioned
	 * part of the local workspace by a more recent revision which is
	 * represented within the specified <em>choice</em>.
	 *
	 * @param repo
	 * @param choice
	 * @param rs where to allocate new workspace resources.
	 * @throws SuperModException in case the update operation fails.
	 */
	public void update(LocalRepository repo, ResourceSet rs, 
			OptionBinding choice) throws SuperModException;

}
