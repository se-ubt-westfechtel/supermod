/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/

package de.ubt.ai1.supermod.service.file.client;

import de.ubt.ai1.supermod.mm.client.LocalRepository;

/**
 * Service interface which provides basic support for the interaction with the
 * local workspace, which is mapped by a specific product space dimension.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	31.07.2014
 */
public interface IFileVersioningHandler {

	/**
	 * Checks whether the resource represented by a given relative URI is
	 * explicitly marked as versioned within a local SuperMod repository.
	 *
	 * @param resourceUri the relative URI of a resource within the local
	 * 			workspace.
	 * @param repo the repository to compare with the local workspace.
	 * @return whether the resource is explicitly versioned.
	 */
	public boolean isVersioned(String resourceUri, LocalRepository repo);
	
	/**
	 * Checks whether the resource represented by a given relative URI is
	 * explicitly marked as unversioned within a local SuperMod repository.
	 *
	 * @param resourceUri the relative URI of a resource within the local
	 * 			workspace.
	 * @param repo the repository to compare with the local workspace.
	 * @return whether the resource is explicitly unversioned.
	 */
	public boolean isUnversioned(String resourceUri, LocalRepository repo);

	/**
	 * Adds a resource represented by a given relative URI to the set of
	 * explicitly versioned resources within a local SuperMod repository.
	 *
	 * @param resourceUri the relative URI of a resource to add to version
	 * 			control.
	 * @param repo the repository where the resource will be versioned.
	 * @return <code>true</code> if the resource has been added,
	 * 			<code>false</code> in case it was already versioned before.
	 */
	public boolean addToVersionControl(String resourceUri, 
			LocalRepository repo);

	/**
	 * Adds a resource represented by a given relative URI to the set of
	 * explicitly unversioned resources within a local SuperMod repository.
	 *
	 * @param resourceUri the relative URI of a resource to remove from version
	 * 			control.
	 * @param repo the repository where the resource will no longer be
	 * 			versioned.
	 * @return <code>true</code> if the resource has been removed,
	 * 			<code>false</code> in case it was already unversioned before.
	 */
	public boolean removeFromVersionControl(String resourceUri, 
			LocalRepository repo);

	/**
	 * Checks whether the specified resourceUri lies within the specified
	 * repository's responsibility.
	 *
	 * @param resourceUri
	 * @param repo
	 * @return whether repo is responsible for resourceUri.
	 */
	public boolean isResponsibleFor(String resourceUri, LocalRepository repo);

}
