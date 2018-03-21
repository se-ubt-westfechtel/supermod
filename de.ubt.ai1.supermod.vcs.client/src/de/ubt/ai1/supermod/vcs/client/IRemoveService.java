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
import de.ubt.ai1.supermod.vcs.client.impl.RemoveService;

/**
 * Interface for the VCS operation "Remove", which is used to remove a specified
 * resource from version control with SuperMod.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	01.08.2014
 */
@ImplementedBy(RemoveService.class)
public interface IRemoveService {
	
	/**
	 * Checks whether a specified workspace resource can be removed from version
	 * control within a given SuperMod repository.
	 *
	 * @param repo
	 * @param fileUri absolute URI of the file to remove.
	 * @return whether the resource can be removed from version control.
	 */
	public boolean canRemove(LocalRepository repo, String fileUri);
	
	/**
	 * To be implemented in order to perform the remove operation. Within the
	 * meta-data of the specified local repository, the resource should be
	 * marked as unversioned as long as it is not re-added manually.
	 * 
	 * @param repo
	 * @param fileUri
	 */
	public void remove(LocalRepository repo, String fileUri);

}
