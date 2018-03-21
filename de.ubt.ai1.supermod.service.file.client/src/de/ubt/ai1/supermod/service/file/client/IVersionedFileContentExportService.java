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
import de.ubt.ai1.supermod.mm.file.client.SingleVersionFileDescriptor;
import de.ubt.ai1.supermod.mm.file.client.SingleVersionFileSystemDescriptor;
import de.ubt.ai1.supermod.mm.file.client.VersionedFileExportTrace;
import de.ubt.ai1.supermod.service.client.exceptions.SuperModClientException;

/**
 * Service interface for the export operation specific to a given versioned
 * file content type. The process is divided up into five phases, of which
 * the first and the last (<em>start</em> and <em>end</em>) are global with
 * respect to a versioned file system, and the middle phases (<em>lex</em>,
 * <em>compile</em>, and <em>link</em>) are local with respect to a single
 * versioned file content.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	31.07.2014
 */
public interface IVersionedFileContentExportService {
	
	/**
	 * Allocates all necessary resources for the export service.
	 *
 	 * @param fsDescriptor the superordinate file system descriptor.
	 */
	public void start(SingleVersionFileSystemDescriptor fsDescriptor);
	
	/**
	 * Reads the contents of a specified file content and determines whether
	 * this export service is suitable for the content type.
	 *
	 * @param fileContent the content to lex.
	 * @return whether this service may export the specified file content.
	 * @throws SuperModClientException in case lexing is interrupted
	 * 			unexpectedly.
	 */
	public boolean lex(VersionedFileContent fileContent)
			throws SuperModClientException;
	
	/**
	 * Converts the contents of a specified file content from its internal
	 * SuperMod representation to a workspace-specific single-version
	 * representation. This representation may still contain unresolved
	 * cross-links, which will be resolved in the linking phase.
	 *
	 * @param fileContent the content to export.
	 * @return a trace explaining how this file has been exported.
	 * @throws SuperModClientException in case the compilation fails.
	 */
	public VersionedFileExportTrace compile(VersionedFileContent fileContent)
					throws SuperModClientException;
	
	/**
	 * Links cross-links, which have remained in an unresolved state after the
	 * compile phase when exporting a specific file content type.
	 *
	 * @param fileContent the file content that had been compiled.
	 * @param descriptor the compilation result, which describes potentially
	 * 			resolved cross-links.
	 * @throws SuperModClientException in case linking fails.
	 */
	public void link(VersionedFileContent fileContent, 
			SingleVersionFileDescriptor descriptor)
					throws SuperModClientException;
	
	/**
	 * Cleans up all resources that have been allocated in the start phase.
	 *
	 * @throws SuperModClientException in case finishing fails.
	 */
	public void finish() throws SuperModClientException;
	
	/**
	 * A registry of file content export services. Clients may implement this
	 * registry in order to provide a suitable set of export services for a
	 * given versioning scenario.
	 */
	public interface Registry {
		
		/**
		 * To be implemented in order to return a set of suitable export
		 * services, which will be used to export file contents.
		 *
		 * @return the export services to use.
		 */
		public Collection<? extends IVersionedFileContentExportService> 
		getServices();

	}

}
