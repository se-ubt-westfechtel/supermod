/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/

package de.ubt.ai1.supermod.service.file.client;

import java.util.Collection;

import de.ubt.ai1.supermod.mm.file.VersionedFileContent;
import de.ubt.ai1.supermod.mm.file.VersionedFileSystem;
import de.ubt.ai1.supermod.mm.file.client.SingleVersionFileDescriptor;
import de.ubt.ai1.supermod.mm.file.client.SingleVersionFileSystemDescriptor;
import de.ubt.ai1.supermod.service.client.exceptions.SuperModClientException;

/**
 * Service interface for the import operation specific to a given versioned
 * file content type. The process is divided up into five phases, of which
 * the first and the last (<em>start</em> and <em>end</em>) are global with
 * respect to a local workspace, and the middle phases (<em>lex</em>,
 * <em>compile</em>, and <em>link</em>) are local with respect to a single
 * workspace resource.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	31.07.2014
 */
public interface IVersionedFileContentImportService {
	
	/**
	 * Allocates all necessary resources for the export service.
	 * 
	 * @param fsDescriptor the superordinate file system descriptor which
	 * 			describes all fragments to be imported.
	 */
	public void start(SingleVersionFileSystemDescriptor fsDescriptor);

	/**
	 * Determines whether the workspace resource described by a specified
	 * descriptor may be imported using this service.
	 *
	 * @param descriptor points to a file within the workspace.
	 * @return whether this service is able to transform the workspace resource
	 * 			into a multi-version representation (versioned file content).
	 * @throws SuperModClientException in case lexing is interrupted 
	 * 			unexpectedly.
	 */
	public boolean lex(SingleVersionFileDescriptor descriptor)
			throws SuperModClientException;
	
	/**
	 * Converts a workspace file described by a specified file content
	 * descriptor from its original representation to its internal SuperMod
	 * representation. The resulting file content may still contain unresolved
	 * cross-links, which will be resolved in the linking phase.
	 * 
	 * @param fs the superordinate versioned file system.
	 * @param descriptor describes the workspace file to be imported.
	 * @return the compiled file in its SuperMod internal representation.
	 * @throws SuperModClientException in case the compilation fails.
	 */
	public VersionedFileContent compile(VersionedFileSystem fs, 
			SingleVersionFileDescriptor descriptor) 
					throws SuperModClientException;
	
	/**
	 * Links cross-links, which have remained in an unresolved state after the
	 * compile phase when importing a specific file content type.
	 * 
	 * @param descriptor the descriptor that describes the workspace file that
	 * 			had been imported.
	 * @param fileContent the compilation result.
	 * @throws SuperModClientException in case linking fails.
	 */
	public void link(SingleVersionFileDescriptor descriptor, 
			VersionedFileContent fileContent)
					throws SuperModClientException;
	
	/**
	 * Cleans up all resources that have been allocated in the start phase.
	 *
	 * @throws SuperModClientException in case finishing fails.
	 */
	public void finish() throws SuperModClientException;
	
	/**
	 * A registry of file content import services. Clients may implement this
	 * registry in order to provide a suitable set of import services for a
	 * given versioning scenario.
	 */
	public interface Registry {
		
		/**
		 * To be implemented in order to return a set of suitable import
		 * services, which will be used to import file contents.
		 *
		 * @return the import services to use.
		 */
		public Collection<? extends IVersionedFileContentImportService>
		getServices();

	}
	
}
