/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/

package de.ubt.ai1.supermod.service.file.client.impl;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

import com.google.inject.Inject;

import de.ubt.ai1.supermod.mm.client.LocalRepository;
import de.ubt.ai1.supermod.mm.core.ProductDimension;
import de.ubt.ai1.supermod.mm.file.VersionedFile;
import de.ubt.ai1.supermod.mm.file.VersionedFileContent;
import de.ubt.ai1.supermod.mm.file.VersionedFileSystem;
import de.ubt.ai1.supermod.mm.file.VersionedResource;
import de.ubt.ai1.supermod.mm.file.client.SingleVersionFileSystemDescriptor;
import de.ubt.ai1.supermod.service.client.IProductDimensionImportPostProcessor;
import de.ubt.ai1.supermod.service.client.exceptions.SuperModClientException;
import de.ubt.ai1.supermod.service.file.client.IFileHasher;
import de.ubt.ai1.supermod.service.file.client.ISingleVersionFileSystemDescriptorProvider;

/**
 * Implementation of the file system import post processor interface which
 * ensures that after importing a
 * versioned file system, an EMF resource is allocated for each file content,
 * mapping the directory tree of the versioned workspace contents. Furthermore,
 * the file hashes within the local descriptor are update by means of a
 * {@link IFileHasher}.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	31.07.2014
 */
public class VersionedFileSystemImportPostProcessor 
implements IProductDimensionImportPostProcessor {
	
	/**
	 * The folder where all SuperMod meta-data are organized, relative to the
	 * root of the single-version workspace.
	 */
	public static final String METADATA_FOLER = "/.supermod/main/";

	@Inject
	private ISingleVersionFileSystemDescriptorProvider svsProvider;
	
	@Inject
	private IFileHasher fileHasher;

	@Override
	public void postProcess(LocalRepository repo, ResourceSet rs,
			ProductDimension oldPd, ProductDimension newPd) 
					throws SuperModClientException {
		if (!(oldPd instanceof VersionedFileSystem) || 
				!(newPd instanceof VersionedFileSystem)) {
			throw new UnsupportedOperationException();
		}	
		
		SingleVersionFileSystemDescriptor svfs = 
				svsProvider.getSingleVersionFileSystemDescriptor(
						repo.getLocalDescriptor());
		String rootUriStr = svfs.getRootUri();
		
		for (VersionedResource newRes : 
				((VersionedFileSystem) newPd).getAllResources()) {
			if (newRes instanceof VersionedFile && 
					((VersionedFile) newRes).getContent() != null) {
				VersionedResource oldRes = ((VersionedFileSystem) oldPd)
						.getResource(newRes.getPath());
				Resource newContentRes = null;
				// in case a resource already exists, re-use it, else allocate
				// a new one.
				if (oldRes instanceof VersionedFile && 
						((VersionedFile) oldRes).getContent() != null &&
						((VersionedFile) oldRes).getContent().eResource()
								!= null) {
					newContentRes = ((VersionedFile) oldRes).getContent()
							.eResource();
				}
				else {
					String uriStr = rootUriStr + METADATA_FOLER 
							+ newRes.getPath() + "." 
							+ ((VersionedFile) newRes).getContent()
									.getSuperExtension();
					newContentRes = rs.createResource(
							URI.createPlatformResourceURI(uriStr, true));
				}
				VersionedFileContent newContent = ((VersionedFile) newRes)
						.getContent();
				newContent.setFile(null);
				if (newContentRes != null) {
					newContentRes.getContents().clear();
					newContentRes.getContents().add(newContent);
				}
				newContent.setFile((VersionedFile) newRes);
			}
		}
		// remove old file contents from file content resources.
		for (VersionedResource oldRes : 
				((VersionedFileSystem) oldPd).getAllResources()) {
			VersionedResource newRes = ((VersionedFileSystem) newPd)
					.getResource(oldRes.getPath());
			if (oldRes instanceof VersionedFile && newRes == null) {
				VersionedFile oldFile = (VersionedFile) oldRes;
				if (oldFile.getContent() != null && 
						oldFile.getContent().eResource() != null) {
					oldFile.getContent().eResource().getContents().clear();
				}
			}
 		}
		
		fileHasher.updateHashes(svfs);				
	}

}
