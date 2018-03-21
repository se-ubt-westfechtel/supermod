/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/

package de.ubt.ai1.supermod.service.file;

import java.util.Collection;

import de.ubt.ai1.supermod.mm.diff.MatchingRole;
import de.ubt.ai1.supermod.mm.diff.ProductDimensionMatching;
import de.ubt.ai1.supermod.mm.diff.ProductSpaceElementMatching;
import de.ubt.ai1.supermod.mm.file.VersionedFileContent;
import de.ubt.ai1.supermod.service.file.impl.VersionedFileSystemMatchService;

/**
 * Service interface for file content type specific matching. The matching
 * process is divided into three phases, <em>start</em>, <em>matching</end>,
 * and <em>finish</em>, which are controlled by the service implementation
 * {@link VersionedFileSystemMatchService} that injects this service.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	30.07.2014
 */
public interface IVersionedFileContentMatchService {
	
	/**
	 * Initializes the matching service and binds it to a specific matching
	 * scenario. Called once for a versioned file system before the first call
	 * of {@link #canMatch(Collection)}.
	 * 
	 * @param roles assigns a specific purpose to each product space which will
	 * 			be part of the file content matching.
	 */
	public void start(Collection<MatchingRole> roles);
	
	/**
	 * To be implemented in order to determine whether a specific file content
	 * may be processed by this match service.
	 *
	 * @param versionedFileContents the different versions of a file content
	 * 			to match.
	 * @return whether this service is able to calculate a matching for the
	 * 			specified contents.
	 */
	public boolean canMatch(
			Collection<VersionedFileContent> versionedFileContents);
		
	/**
	 * To be implemented in order to perform the calculation of the matching
	 * specific to its file content type
	 *
	 * @param versionedFileContents the different versions of a file content
	 * 			to match.
	 * @param pdMatching a matching referring to the superordinate product
	 * 			dimension.
	 * @param roles assigns a specific purpose to each product space which will
	 * 			be part of the file content matching.
	 * @return the calculated matching.
	 */
	public Collection<ProductSpaceElementMatching> matchFiles(
			Collection<VersionedFileContent> versionedFileContents, 
			ProductDimensionMatching pdMatching, 
			Collection<MatchingRole> roles);
	
	/**
	 * Clears all resources that have been allocated in order to perform the
	 * matching, and unbinds this service from the specific matching scenario.
	 * Called once for a versioned file system after the last call of {@link
	 * #matchFiles(Collection, ProductDimensionMatching, Collection)}.
	 *
	 * @param pdMatching the product dimension matching where the result of
	 * 			this matching had been inserted.
	 */
	public void finish(ProductDimensionMatching pdMatching);
	
	/**
	 * A registry which allows to retrieve a collection of concrete file 
	 * content matchings for a specific purpose. Instances of {@link 
	 * VersionedFileSystemMatchService} will try to apply the specific
	 * content merge services in the specified order.
	 */
	public interface Registry {		
		
		/**
		 * To be implemented in order to return the services to be used for a
		 * specific file system match scenario.
		 *
		 * @return the list of content match services to use.
		 */
		public Collection<? extends IVersionedFileContentMatchService> 
		getServices();
	}

}
