/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/

package de.ubt.ai1.supermod.service.file.client;

import org.eclipse.core.resources.IFile;

import de.ubt.ai1.supermod.mm.file.client.SingleVersionFileSystemDescriptor;
import de.ubt.ai1.supermod.service.client.exceptions.SuperModClientException;

/**
 * Service interface for providing a hash value for a specific Eclipse file.
 * Hashes are used in order to determine whether the contents of files located
 * in local SuperMod workspaces have changed.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	31.07.2014
 */
public interface IFileHasher {

	/**
	 * Reads the content of a specified file and calculates a hash value for it.
	 *
	 * @param file the file to hash.
	 * @return the calculated hash code.
	 * @throws SuperModClientException in case hashing fails.
	 */
	public String hash(IFile file) throws SuperModClientException;
	
	/**
	 * Updates the hash values of all files which are accessible from a
	 * specified single version file system descriptor.
	 *
	 * @param descriptor describes the files to update hashes for.
	 * @throws SuperModClientException in case hashing fails.
	 */
	public void updateHashes(SingleVersionFileSystemDescriptor descriptor)
			throws SuperModClientException;

}
