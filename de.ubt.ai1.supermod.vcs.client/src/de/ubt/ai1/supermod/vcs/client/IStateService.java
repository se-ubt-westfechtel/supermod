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
import de.ubt.ai1.supermod.service.client.exceptions.SuperModClientException;
import de.ubt.ai1.supermod.vcs.client.impl.StateService;

/**
 * Interface for the VCS operation "State", which determines the versioning
 * state for a given workspace resource.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	01.08.2014
 */
@ImplementedBy(StateService.class)
public interface IStateService {
	
	/**
	 * Enumeration type for the different possible versioning states.
	 */
	public enum State {
		
		/**
		 * The resource is not versioned within the specified repository, and
		 * not selected for addition during the next commit.
		 */
		UNVERSIONED,
		
		/**
		 * The resource is versioned within the specified repository, and has
		 * the same contents as the workspace version.
		 */
		UNCHANGED,
		
		/**
		 * The resource is versioned within the specified repository, and has
		 * a different content as the workspace version.
		 */
		CHANGED,
		
		/**
		 * The resource is currently included in the workspace but not in the
		 * repository. It will be added during the next commit operation.
		 */
		ADDED,
		
		/**
		 * The resource is currently included in the workspace and marked for
		 * deletion from the repository during the next commit. After that,
		 * it will be unversioned.
		 */
		REMOVED,
		
		/**
		 * The resource is missing in the repository, but included in the
		 * repository version described by the current choice.
		 */
		MISSING,
		
		/**
		 * The state cannot be determined for the specified resource within
		 * the repository. This applies e.g. for meta-data.
		 */
		UNKNOWN,
		
		/**
		 * The resource is part of the SuperMod meta-data section within the
		 * workspace file tree.
		 */
		METADATA,
		
		/**
		 * The resource is versioned within the specified repository and could
		 * not be exported to the local workspace during the last check-out
		 * operation since it contains product conflicts. A corresponding
		 * multi-variant resource exists in the stashing area.
		 */
		CONFLICTING
	}
	
	/**
	 * To be implemented in order to calculate the versioning state for a given
	 * workspace resource within a specified SuperMod repository.
	 *
	 * @param repo the repository to determine the versioning state in.
	 * @param resourceUri absolute URI of the URI to calculate the state for.
	 * @return the versioning state of the resource in the repository.
	 * @throws SuperModClientException in case the state operation fails.
	 */
	public State getState(LocalRepository repo, String resourceUri) 
			throws SuperModClientException;

}
