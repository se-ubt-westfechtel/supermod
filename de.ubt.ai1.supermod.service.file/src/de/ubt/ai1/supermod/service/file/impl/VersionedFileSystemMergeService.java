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

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

import com.google.inject.Inject;

import de.ubt.ai1.supermod.mm.core.ProductDimension;
import de.ubt.ai1.supermod.mm.core.VisibilityForest;
import de.ubt.ai1.supermod.mm.diff.MatchingRole;
import de.ubt.ai1.supermod.mm.diff.ProductDimensionMatching;
import de.ubt.ai1.supermod.mm.diff.ProductSpaceElementMatching;
import de.ubt.ai1.supermod.mm.file.SuperModFileFactory;
import de.ubt.ai1.supermod.mm.file.VersionedFile;
import de.ubt.ai1.supermod.mm.file.VersionedFileContent;
import de.ubt.ai1.supermod.mm.file.VersionedFileSystem;
import de.ubt.ai1.supermod.mm.file.VersionedFolder;
import de.ubt.ai1.supermod.mm.file.VersionedResource;
import de.ubt.ai1.supermod.service.IProductDimensionMergeService;
import de.ubt.ai1.supermod.service.IVisibilityMergeService;
import de.ubt.ai1.supermod.service.file.IVersionedFileContentMergeService;
import de.ubt.ai1.supermod.service.generic.MergeUtil;
import de.ubt.ai1.supermod.service.generic.MergeUtil.PropertyAccessor;

/**
 * Implementation of the product dimension merge service specific to versioned
 * file systems.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	30.07.2014
 */
public class VersionedFileSystemMergeService 
implements IProductDimensionMergeService {
	
	@Inject
	private IVersionedFileContentMergeService.Registry mergeServiceRegistry;
	
	@Inject
	private IVisibilityMergeService visibilityMergeService;
	
	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.IProductDimensionMergeService
	 * #merge(de.ubt.ai1.supermod.mm.diff.ProductDimensionMatching, 
	 * java.util.Collection, de.ubt.ai1.supermod.mm.diff.MatchingRole, 
	 * de.ubt.ai1.supermod.mm.core.VisibilityForest)
	 */
	public VersionedFileSystem mergeOutPlace(ProductDimensionMatching pdMatching, 
			Collection<MatchingRole> inputRoles, MatchingRole mergeRole, 
			VisibilityForest visibilityForest) {
		
		// merge the file systems without merging their contents
		Collection<VersionedFileSystem> fileSystems = MergeUtil
				.filterPdMatching(pdMatching, VersionedFileSystem.class, 
						inputRoles);
		if (fileSystems.isEmpty()) return null;
		VersionedFileSystem mergedFs = createMergedFileSystem();
		mergedFs.setDimensionName(MergeUtil.getUnique(fileSystems, 
				new PropertyAccessor<ProductDimension, String>() {
					@Override
					public String getProperty(ProductDimension v) {
						return v.getDimensionName();
					}
				}));
	
		// start the file content merge services found in the registry.
		List<IVersionedFileContentMergeService> mergeServices = 
				new ArrayList<>(mergeServiceRegistry.getServices());
		for (IVersionedFileContentMergeService mergeService : mergeServices) {
			mergeService.start(pdMatching, visibilityForest);
		}		
		
		// recursively merge the resources, beginning with roots.
		for (ProductSpaceElementMatching resourceMatching : 
			pdMatching.getRootElementMatchings()) {
			VersionedResource mergedResource = mergeResourceOutPlace(
					mergeRole, mergeServices, resourceMatching, 
					visibilityForest);
			mergedFs.getRoots().add(mergedResource);
		}
		
		// finish content merge services and return the result.
		for (IVersionedFileContentMergeService mergeService : mergeServices) {
			mergeService.finish(mergedFs);
		}		
		return mergedFs;
	}

	/**
	 * Merges several file systems into one, ignoring their contents.
	 *
	 * @param fileSystems
	 * @return a versioned file system without merged resources.
	 */
	private VersionedFileSystem createMergedFileSystem() {
		VersionedFileSystem mergedFs = SuperModFileFactory
				.eINSTANCE.createVersionedFileSystem();
		return mergedFs;
	}

	/**
	 * Merges resources in a specified resource matching into a merged
	 * resource, which can be a file or folder, depending on the inputs. In
	 * case the merged resource is a folder, contained resources are merged
	 * recursively.
	 *
	 * @param mergeRole
	 * @param mergeServices
	 * @param resourceMatching
	 * @param visibilityForest
	 * @return a merged versioned resource with all contents included.
	 */
	private VersionedResource mergeResourceOutPlace(MatchingRole mergeRole,
			List<IVersionedFileContentMergeService> mergeServices,
			ProductSpaceElementMatching resourceMatching, 
			VisibilityForest visibilityForest) {
		VersionedResource mergedResource = null;
		// in case the resource is a file in at least one version, it will be
		// a file in the merged version.
		Collection<VersionedFile> files = MergeUtil.filterMatching(
				resourceMatching, VersionedFile.class);
		if (!files.isEmpty()) {
			VersionedFile mergedFile = createMergedFile();
			// merge the file contents using a suitable content merge service.
			if (!resourceMatching.getSubMatchings().isEmpty()) {
				ProductSpaceElementMatching contentMatching = 
						resourceMatching.getSubMatchings().get(0);
				for (IVersionedFileContentMergeService mergeService : 
						mergeServices) {
					if (mergeService.canMerge(contentMatching)) {
						VersionedFileContent mergedContent = mergeService
								.mergeOutPlace(contentMatching, mergeRole);
						mergedFile.setContent(mergedContent);
						break;
					}
				}
			}
			// merge the file content type.
			mergedFile.setContentType(MergeUtil.getUnique(files,
					new PropertyAccessor<VersionedFile, String>() {
				@Override
				public String getProperty(VersionedFile v) {
					return v.getContentType();
				}
			}));
			mergedResource = mergedFile;
		}
		else {
			// merge the folder and recursively its contents.
			VersionedFolder mergedFolder = createMergedFolder();
			for (ProductSpaceElementMatching contentMatching : 
					resourceMatching.getSubMatchings()) {
				VersionedResource mergedContent = mergeResourceOutPlace(mergeRole, 
						mergeServices, contentMatching, visibilityForest);
				mergedFolder.getContents().add(mergedContent);
			}
			mergedResource = mergedFolder;
		}
		if (mergedResource != null) {
			// merge the name and visibility of the merged resource, add the
			// specified merge role to the matching, and return the result.
			Collection<VersionedResource> resources = MergeUtil
					.filterMatching(resourceMatching, VersionedResource.class);
			mergedResource.setName(MergeUtil.getUnique(resources, 
					new PropertyAccessor<VersionedResource, String>() {
				@Override
				public String getProperty(VersionedResource v) {
					return v.getName();
				}
			}));	
			MergeUtil.setVisibility(resources, mergedResource, 
					visibilityForest, visibilityMergeService);
			MergeUtil.addMergeRole(resourceMatching, mergeRole, 
					mergedResource);
			MergeUtil.updateTransactionId(resourceMatching, mergedResource,
					mergeRole);
		}		
		return mergedResource;
	}

	/**
	 * Creates a merged file without file contents.
	 * @return
	 */
	private VersionedFile createMergedFile() {
		VersionedFile mergedFile = SuperModFileFactory.eINSTANCE
				.createVersionedFile();
		return mergedFile;
	}

	/**
	 * Creates a merged folder without contained resources.
	 * @return
	 */
	private VersionedFolder createMergedFolder() {
		VersionedFolder mergedFolder = SuperModFileFactory
				.eINSTANCE.createVersionedFolder();
		return mergedFolder;
	}

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.IProductDimensionMergeService
	 * #mergeInPlace(de.ubt.ai1.supermod.mm.diff.ProductDimensionMatching, 
	 * java.util.Collection, de.ubt.ai1.supermod.mm.diff.MatchingRole, 
	 * de.ubt.ai1.supermod.mm.core.VisibilityForest)
	 */
	@Override
	public void mergeInPlace(ProductDimensionMatching pdMatching,
			Collection<MatchingRole> inputRoles, MatchingRole masterRole,
			VisibilityForest visibilityForest) {
		// merge the file systems without merging their contents
		Collection<VersionedFileSystem> fileSystems = MergeUtil
				.filterPdMatching(pdMatching, VersionedFileSystem.class, 
						inputRoles);
		if (fileSystems.isEmpty()) return;
		
		// fetch or create the master file system
		VersionedFileSystem masterFs = (VersionedFileSystem) 
				pdMatching.getMatchedDimension(masterRole)
				.getProductDimension();
		if (masterFs == null) {
			mergeOutPlace(pdMatching, inputRoles, masterRole, visibilityForest);
			return;
		}
	
		// start the file content merge services found in the registry.
		List<IVersionedFileContentMergeService> mergeServices = 
				new ArrayList<>(mergeServiceRegistry.getServices());
		for (IVersionedFileContentMergeService mergeService : mergeServices) {
			mergeService.start(pdMatching, visibilityForest);
		}		
		
		// recursively merge the resources, beginning with roots.
		for (ProductSpaceElementMatching resourceMatching : 
			pdMatching.getRootElementMatchings()) {
			mergeResourceInPlace(
					masterRole, mergeServices, resourceMatching, 
					visibilityForest);
		}
		
		// finish content merge services.
		for (IVersionedFileContentMergeService mergeService : mergeServices) {
			mergeService.finish(masterFs);
		}
		
		// create resources for files not contained in any resource.
		if (masterFs.eResource() != null) {
			ResourceSet rs = masterFs.eResource().getResourceSet();
			URI baseUri = masterFs.eResource().getURI().trimSegments(1);
			for (VersionedResource vr : masterFs.getAllResources()) {
				if (vr instanceof VersionedFile) {
					VersionedFile vf = (VersionedFile) vr;
					VersionedFileContent content = vf.getContent();
					if (content.eResource() == null && vf.getPath() != null) {
						URI contentUri = baseUri;
						String path = vf.getPath() + "." + content.getSuperExtension();
						for (String seg : path.split("/")) {
							contentUri = contentUri.appendSegment(seg);
						}
						Resource contentRes = rs.createResource(contentUri);
						contentRes.getContents().clear();
						contentRes.getContents().add(content);
					}
				}
			}
		}
		
	}

	/**
	 * Merges resources in a specified resource matching out-place by either
	 * modifying/extending a master resource or by creating a new merged
	 * resource, which can be a file or folder, depending on the inputs. In
	 * case the merged resource is a folder, contained resources are merged
	 * recursively.
	 *
	 * @param masterRole
	 * @param mergeServices
	 * @param resourceMatching
	 * @param visibilityForest
	 */
	private void mergeResourceInPlace(MatchingRole masterRole,
			List<IVersionedFileContentMergeService> mergeServices,
			ProductSpaceElementMatching resourceMatching,
			VisibilityForest visibilityForest) {
		VersionedResource masterResource = null;
		if (resourceMatching.getMatchedElement(masterRole) != null) {
			masterResource = (VersionedResource) resourceMatching
				.getMatchedElement(masterRole).getElement();
		}
		// in case no version exists for the master resource, it must be created
		// by out-place merging.
		if (masterResource == null) {
			VersionedResource mergedResource = mergeResourceOutPlace(masterRole,
					mergeServices, resourceMatching, visibilityForest);
			if (resourceMatching.eContainer() instanceof 
					ProductSpaceElementMatching) {
				ProductSpaceElementMatching containerMatching = 
						(ProductSpaceElementMatching)
						resourceMatching.eContainer();
				VersionedFolder masterContainer = (VersionedFolder)
						containerMatching.getMatchedElement(masterRole)
						.getElement();
				masterContainer.getContents().add(mergedResource);
			}
			else if (resourceMatching.eContainer() instanceof 
					ProductDimensionMatching) {
				ProductDimensionMatching containerMatching = 
						(ProductDimensionMatching)
						resourceMatching.eContainer();
				VersionedFileSystem masterRoot = (VersionedFileSystem)
						containerMatching.getMatchedDimension(masterRole)
						.getProductDimension();
				masterRoot.getRoots().add(mergedResource);
			}
			return;
		}
		// in case a master version of a file or folder exists, merge its
		// contents in-place
		if (masterResource instanceof VersionedFile) {
			// merge the file contents using a suitable content merge service.
			if (!resourceMatching.getSubMatchings().isEmpty()) {
				ProductSpaceElementMatching contentMatching = 
						resourceMatching.getSubMatchings().get(0);
				for (IVersionedFileContentMergeService mergeService : 
						mergeServices) {
					if (mergeService.canMerge(contentMatching)) {
						mergeService.mergeInPlace(contentMatching, masterRole);
						break;
					}
				}
			}
		}
		else if (masterResource instanceof VersionedFolder) {
			// merge the folder and recursively its contained resources.
			if (!resourceMatching.getSubMatchings().isEmpty()) {
				for (ProductSpaceElementMatching contentMatching : 
					resourceMatching.getSubMatchings()) {
					mergeResourceInPlace(masterRole, mergeServices,
							contentMatching, visibilityForest);
				}
			}
		}
	}


}
