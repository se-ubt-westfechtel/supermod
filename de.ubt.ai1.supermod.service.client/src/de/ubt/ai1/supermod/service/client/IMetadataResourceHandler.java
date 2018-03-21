/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.service.client;

import org.eclipse.emf.ecore.resource.ResourceSet;

import com.google.inject.ImplementedBy;

import de.ubt.ai1.supermod.mm.client.LocalRepository;
import de.ubt.ai1.supermod.service.client.exceptions.SuperModClientException;
import de.ubt.ai1.supermod.service.generic.client.impl.GenericMetadataResourceHandler;

/**
 * Interface for an auxiliary VCS service which organizes meta-data resources
 * within the <code>.supermod</code> folder.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	01.08.2014
 */
@ImplementedBy(GenericMetadataResourceHandler.class)
public interface IMetadataResourceHandler {

	/**
	 * Creates the absolute URI of a repository within the meta-data section
	 * of a versioned project.
	 *
	 * @param String rootUri a URI referring to the workspace root.
	 * @return the absolute repository URI.
	 */
	public String createRepositoryUri(String rootUri);
	
	/**
	 * Finds a SuperMod repository where a specified workspace file is versioned
	 * in.
	 *
	 * @param fileUri absolute URI of the file to find the SuperMod repository
	 * 			for.
	 * @param rs the resource set where the local repository will be loaded
	 * @return the loaded repository, or <code>null</code> in case the
	 * 			specified file is not versioned by SuperMod.
	 * @throws SuperModClientException
	 */
	public LocalRepository getRepository(String fileUri, ResourceSet rs) 
			throws SuperModClientException;

}
