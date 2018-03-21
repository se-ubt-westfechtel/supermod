/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.vcs.client;

import com.google.inject.ImplementedBy;

import de.ubt.ai1.supermod.mm.client.LocalRepository;
import de.ubt.ai1.supermod.vcs.client.impl.AddService;

/**
 * Interface for the VCS operation "Add", which is used to put a currently
 * unversioned resource in the local workspace under version control.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	01.08.2014
 */
@ImplementedBy(AddService.class)
public interface IAddService {
	
	/**
	 * To be implemented in order to check whether a specified resource might
	 * be added to version control in a specified local repository.
	 *
	 * @param repo
	 * @param resourceUri an absolute URI of a resource to add.
	 * @return whether the add operation can be performed.
	 */
	public boolean canAdd(LocalRepository repo, String resourceUri);
	
	/**
	 * To be implemented in order to perform the add operation. Within the
	 * meta-data of the specified local repository, the resource should be
	 * tracked from now on.
	 *
	 * @param repo
	 * @param resourceUri an absolute URI of a resource to add.
	 */
	public void add(LocalRepository repo, String resourceUri);

}
