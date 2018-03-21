/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.service.file.client;

import java.util.Collection;

import de.ubt.ai1.supermod.mm.client.ProductConflict;
import de.ubt.ai1.supermod.mm.file.client.VersionedFileExportTrace;
import de.ubt.ai1.supermod.service.client.exceptions.SuperModClientException;

/**
 * Service interface for the creation of conflict markers for a specific
 * file type.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	10.06.2016
 */
public interface IVersionedFileContentConflictMarkerGenerator {	

	/**
	 * Performs the generation of the marker for the specified conflict. The
	 * marker is supposed to be attached to the resource specified by the path.
	 *
	 * @param projectName
	 * @param resourcePath
	 * @param conflict
	 * @param vfTrace useful to obtain the workspace object corresponding
	 * 		to the repository object(s) referenced by the conflict.
	 * @return false if this conflict marker is not capable of the specified
	 * 		conflict type
	 * @throws SuperModClientException 
	 */
	public boolean generateMarkersFor(String projectName,
			String resourcePath, ProductConflict conflict, 
			VersionedFileExportTrace vfTrace) throws SuperModClientException;

	/**
	 * A registry of file content conflict marker services. Clients may
	 * implement this registry in order to provide a suitable set of
	 * services.
	 */
	public interface Registry {
		
		/**
		 * To be implemented in order to return a set of suitable marker
		 * services, which will be used to mark conflicts for specific
		 * file contents.
		 *
		 * @return the conflict marker services to use.
		 */
		public Collection<? extends IVersionedFileContentConflictMarkerGenerator> 
				getServices();
		
	}

}
