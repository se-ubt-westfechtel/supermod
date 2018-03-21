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
import de.ubt.ai1.supermod.mm.file.VersionedFileContent;

/**
 * Service interface for the validation operation specific to a given versioned
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
public interface IVersionedFileContentValidationService {
	
	/**
	 * Allocates all resources necessary for the validation of multiple file
	 * contents.
	 */
	public void start();
	
	/**
	 * Determines whether this service is suitable for validating a given file
	 * content.
	 *
	 * @param fileContent
	 * @return whether this service may validate <code>fileContent</code>.
	 */
	public boolean lex(VersionedFileContent fileContent);
	
	/**
	 * Takes the specified file content as input and returns identified
	 * conflicts within this file content as its output. The conflict set may
	 * later be refined in the linking phase.
	 *
	 * @param fileContent
	 * @return product conflicts detected within <code>fileContent</code>.
	 */
	public Collection<ProductConflict> compile(
			VersionedFileContent fileContent);
	
	/**
	 * Optionally performs some refinement on the set of conflicts that have
	 * been calculated in the compile phase. For instance, duplicate conflicts
	 * may be summarized into single conflicts.
	 *
	 * @param fileContent
	 * @param conflicts the conflict set which may be refined in-place.
	 */
	public void link(VersionedFileContent fileContent, 
			Collection<ProductConflict> conflicts);
	
	/**
	 * Cleans up all resources allocated within the start phase.
	 */
	public void finish();
	
	/**
	 * A registry of file content validation services. Clients may implement 
	 * this registry in order to provide a suitable set of validation services
	 * for a given versioning scenario.
	 */
	public interface Registry {
		
		/**
		 * To be implemented in order to return a set of suitable validation
		 * services, which will be used to validate file contents.
		 *
		 * @return the validation services to use.
		 */
		public Collection<? extends IVersionedFileContentValidationService> 
		getServices();

	}

}
