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
import de.ubt.ai1.supermod.vcs.client.impl.VersionService;

/**
 * Interface for the VCS operation "Version", which creates a human readable
 * String that represents the current version of a resource.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	01.08.2014
 */
@ImplementedBy(VersionService.class)
public interface IVersionService {

	/**
	 * To be implemented in order to show the version of the specified resource
	 * within the local repository.
	 *
	 * @param repo
	 * @param resourceUri absolute URI of the resource whose version to show.
	 * @return a String that represents the current version of the resource.
	 */
	public String getVersion(LocalRepository repo, String resourceUri);

}
