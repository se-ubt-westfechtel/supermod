/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/

package de.ubt.ai1.supermod.service.file.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.google.inject.Inject;

import de.ubt.ai1.supermod.mm.core.ProductDimension;
import de.ubt.ai1.supermod.mm.diff.MatchedProductDimension;
import de.ubt.ai1.supermod.mm.diff.MatchedProductSpaceElement;
import de.ubt.ai1.supermod.mm.diff.MatchingRole;
import de.ubt.ai1.supermod.mm.diff.ProductDimensionMatching;
import de.ubt.ai1.supermod.mm.diff.ProductSpaceElementMatching;
import de.ubt.ai1.supermod.mm.diff.SuperModDiffFactory;
import de.ubt.ai1.supermod.mm.file.VersionedFile;
import de.ubt.ai1.supermod.mm.file.VersionedFileContent;
import de.ubt.ai1.supermod.mm.file.VersionedFileSystem;
import de.ubt.ai1.supermod.mm.file.VersionedFolder;
import de.ubt.ai1.supermod.mm.file.VersionedResource;
import de.ubt.ai1.supermod.service.IProductDimensionMatchService;
import de.ubt.ai1.supermod.service.file.IVersionedFileContentMatchService;
import de.ubt.ai1.supermod.service.generic.MatchUtil;
import de.ubt.ai1.supermod.service.generic.MatchUtil.KeyMatchFunction;
import de.ubt.ai1.supermod.service.generic.MergeUtil;
import de.ubt.ai1.supermod.service.generic.MergeUtil.PropertyAccessor;

/**
 * An implementation of the product dimension match service interface specific
 * to versioned file systems.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	30.07.2014
 */
public class VersionedFileSystemMatchService 
implements IProductDimensionMatchService {
	
	@Inject
	private IVersionedFileContentMatchService.Registry matchServiceRegistry;
	
	/**
	 * Defines the name of a versioned resource as its key property to use
	 * for comparison.
	 */
	private static final KeyMatchFunction<String, VersionedResource> 
			resourceMatchFunction 
			= new KeyMatchFunction<String, VersionedResource>() {
		@Override
		public String getKey(VersionedResource value) {
			return value.getName();
		}
	};
	
	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.IProductDimensionMatchService
	 * #match(java.util.Collection, java.util.Collection)
	 */
	@Override
	public ProductDimensionMatching match(Collection<MatchingRole> roles, 
			Collection<ProductDimension> dimensions) {
		
		// get the list of content match services from the registry.
		List<IVersionedFileContentMatchService> matchServices = 
				new ArrayList<>(matchServiceRegistry.getServices());
		
		// start each match service.
		for (IVersionedFileContentMatchService matchService : matchServices) {
			matchService.start(roles);
		}
		
		// the matching to be returned.
		ProductDimensionMatching pdMatching = 
				SuperModDiffFactory.eINSTANCE.createProductDimensionMatching();
		pdMatching.setDimensionName(MergeUtil.getUnique(dimensions, 
				new PropertyAccessor<ProductDimension, String>() {
					@Override
					public String getProperty(ProductDimension v) {
						return v.getDimensionName();
					}
				}));
		
		// register matched dimensions.
		for (MatchingRole role : roles) {
			for (ProductDimension pd : dimensions) {
				if (role.getMatchedProductSpace().equals(pd.getProductSpace())){
					MatchedProductDimension mpd = SuperModDiffFactory.eINSTANCE
							.createMatchedProductDimension();
					mpd.setProductDimension(pd);
					mpd.setRole(role);
					pdMatching.getMatchedDimensions().add(mpd);
				}
			}
		}
		
		// match the roots of the file system versions.
		List<List<VersionedResource>> rootMtx = new ArrayList<>();
		for (ProductDimension vfs : dimensions) {
			if (vfs instanceof VersionedFileSystem) {
				rootMtx.add(((VersionedFileSystem) vfs).getRoots());
			}
		}		
		List<ProductSpaceElementMatching> rootMatchings = MatchUtil
				.matchElementSet(rootMtx, resourceMatchFunction, roles);	
		pdMatching.getRootElementMatchings().addAll(rootMatchings);
		
		// match the contents of the roots recursively.
		for (ProductSpaceElementMatching rootMatching : rootMatchings) {
			matchResourceContents(matchServices, rootMatching, pdMatching, 
					roles);
		}
		
		// finish each match service and return the matching.
		for (IVersionedFileContentMatchService matchService : matchServices) {
			matchService.finish(pdMatching);
		}
		return pdMatching;
	}

	/**
	 * Recursive procedure which matches the contents of an already matched
	 * container for resources.
	 *
	 * @param fileMatchServices
	 * @param resourceMatching
	 * @param pdMatching
	 * @param roles
	 */
	private void matchResourceContents(
			List<IVersionedFileContentMatchService> fileMatchServices,
			ProductSpaceElementMatching resourceMatching, 
			ProductDimensionMatching pdMatching,
			Collection<MatchingRole> roles) {
		
		// divide matched versions of resources up into files and folders
		List<VersionedFile> versionedFiles = new ArrayList<>();
		List<VersionedFolder> versionedFolders = new ArrayList<>();
		for (MatchedProductSpaceElement me : resourceMatching
				.getMatchedElements()) {
			if (me.getElement() instanceof VersionedFile) {
				versionedFiles.add((VersionedFile) me.getElement());
			}
			else if (me.getElement() instanceof VersionedFolder) {
				versionedFolders.add((VersionedFolder) me.getElement());
			}
		}
		if (!versionedFiles.isEmpty()) {
			// for files: use a suitable file content merge service to match
			// their contents.
			List<VersionedFileContent> contents = new ArrayList<>();
			for (VersionedFile vf : versionedFiles) {
				if (vf.getContent() != null) {
					contents.add(vf.getContent());
				}
			}
			ProductSpaceElementMatching contentMatching = MatchUtil
					.matchElement(contents, roles);
			resourceMatching.getSubMatchings().add(contentMatching);
			for (IVersionedFileContentMatchService matchService : 
					fileMatchServices) {
				if (matchService.canMatch(contents)) {
					Collection<ProductSpaceElementMatching> matchedFileContents
							= matchService.matchFiles(
									contents, pdMatching, roles);
					contentMatching.getSubMatchings().addAll(
							matchedFileContents);
					break;
				}
			}
		}
		if (!versionedFolders.isEmpty()) {
			// for folders: recursive decent.
			List<List<VersionedResource>> resourceMtx = new ArrayList<>();
			for (VersionedFolder vf : versionedFolders) {
				resourceMtx.add(vf.getContents());
			}
			List<ProductSpaceElementMatching> contentMatchings = 
					MatchUtil.matchElementSet(
					resourceMtx, resourceMatchFunction, roles);	
			resourceMatching.getSubMatchings().addAll(contentMatchings);
			for (ProductSpaceElementMatching contentMatching : 
					contentMatchings) {
				matchResourceContents(fileMatchServices, contentMatching,
						pdMatching, roles);
			}
		}
	}

}
