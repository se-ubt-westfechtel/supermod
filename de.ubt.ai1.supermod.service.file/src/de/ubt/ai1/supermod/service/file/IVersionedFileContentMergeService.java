/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/

package de.ubt.ai1.supermod.service.file;

import java.util.Collection;

import de.ubt.ai1.supermod.mm.core.ProductDimension;
import de.ubt.ai1.supermod.mm.core.VisibilityForest;
import de.ubt.ai1.supermod.mm.diff.MatchingRole;
import de.ubt.ai1.supermod.mm.diff.ProductDimensionMatching;
import de.ubt.ai1.supermod.mm.diff.ProductSpaceElementMatching;
import de.ubt.ai1.supermod.mm.file.VersionedFileContent;
import de.ubt.ai1.supermod.service.file.impl.VersionedFileSystemMergeService;

/**
 * Service interface for file content type specific merging. The merging
 * process is divided into three phases, <em>start</em>, <em>matching</end>,
 * and <em>finish</em>, which are controlled by the service implementation
 * {@link VersionedFileSystemMergeService} that injects this service.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	30.07.2014
 */
public interface IVersionedFileContentMergeService {

	/**
	 * Initializes the matching service and binds it to a specific merging
	 * scenario. Called once for a versioned file system before the first call
	 * of {@link #canMerge(ProductSpaceElementMatching)}.
	 * 
	 * @param pdMatching a matching that refers to the superordinate product
	 * 			dimension.
	 * @param visibilityForest a visibility forest where merged visibilities
	 * 			shall be stored in.
	 */
	public void start(ProductDimensionMatching pdMatching,
			VisibilityForest visibilityForest);

	/**
	 * To be implemented in order to determine whether this service is 
	 * compatible with a set of versions of a specific file content, whose
	 * matching is provided.
	 *
	 * @param fileContentMatching the matching on which the merge result will
	 * 			be based.
	 * @return whether this service is able to provide a merge result for the
	 * 			specified matching.
	 */
	public boolean canMerge(ProductSpaceElementMatching fileContentMatching);

	/**
	 * To be implemented in order to perform resource merging out-place.
	 *
	 * @param fileContentMatching the matching describing the different
	 *			versions of the file content to be merged.
	 * @param mergeRole will be assigned to merged elements within the provided
	 * 			matching.
	 * @return the calculated merged file content.
	 */
	public VersionedFileContent mergeOutPlace(
			ProductSpaceElementMatching fileContentMatching, 
			MatchingRole mergeRole);
	

	/**
	 * To be implemented in order to perform resource merging in-place.
	 *
	 * @param fileContentMatching the matching describing the different
	 *			versions of the file content to be merged.
	 * @param masterRole elements of this role will be modified in order to
	 * 			incorporate elements of the other versions.
	 */
	public void mergeInPlace(ProductSpaceElementMatching fileContentMatching,
			MatchingRole masterRole);

	/**
	 * Clears all resources that have been allocated in order to perform the
	 * merge, and unbinds this service from the specific merging scenario.
	 * Called once for a versioned file system after the last call of {@link
	 * #mergeOutPlace(ProductSpaceElementMatching, MatchingRole)}.
	 *
	 * @param mergedProductDimension the superordinate product dimension, where
	 * 			the merged contents had been inserted by the corresponding
	 * 			{@link VersionedFileSystemMergeService}.
	 */
	public void finish(ProductDimension mergedProductDimension);

	/**
	 * A registry which allows to retrieve a collection of concrete file 
	 * content merge services for a specific purpose. Instances of {@link 
	 * VersionedFileSystemMergeervice} will try to apply the specific
	 * content merge services in the specified order.
	 */
	public interface Registry {

		/**
		 * To be implemented in order to return the services to be used for a
		 * specific file system merge scenario.
		 *
		 * @return the list of content merge services to use.
		 */
		public Collection<? extends IVersionedFileContentMergeService> 
		getServices();

	}


}
