/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.service;

import java.io.IOException;

import org.eclipse.emf.ecore.resource.ResourceSet;

import de.ubt.ai1.supermod.mm.core.Repository;

/**
 * Service interface for cloning an entire SuperMod repository by copying the
 * folder (e.g., main) into a different folder relative to the specified
 * repository's container folder.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	20.10.2015
 */
public interface IRepositoryCloneService {
	
	/**
	 * Clones the repository and all of its content files by copying the
	 * containing folder to the specified path. The copied repository is
	 * returned.
	 *
	 * @param original
	 * @param relativeClonePath path relative to the ".supermod" directory
	 * 			where the clone will be inserted.
	 * @param rs will manage the copy of the repository
	 * @return the copy of the repository opened in the specified resource set,
	 * 			or null in case the resource set is null.
	 * @throws IOException in case cloning fails
	 */
	public Repository cloneRepository(Repository original, 
			String relativeClonePath, ResourceSet rs) throws IOException;

}
