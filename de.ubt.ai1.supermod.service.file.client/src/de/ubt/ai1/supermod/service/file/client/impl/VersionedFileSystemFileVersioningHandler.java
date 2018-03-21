/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/

package de.ubt.ai1.supermod.service.file.client.impl;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;

import com.google.inject.Inject;

import de.ubt.ai1.supermod.mm.client.LocalRepository;
import de.ubt.ai1.supermod.mm.client.SingleVersionProductDimensionDescriptor;
import de.ubt.ai1.supermod.mm.file.client.SingleVersionFileSystemDescriptor;
import de.ubt.ai1.supermod.mm.file.client.SingleVersionResourceDescriptor;
import de.ubt.ai1.supermod.service.file.client.FileUtil;
import de.ubt.ai1.supermod.service.file.client.IFileVersioningHandler;
import de.ubt.ai1.supermod.service.file.client.ISingleVersionFileSystemDescriptorProvider;

/**
 * An implementation of the file versioning handler interface which manages 
 * versioned resources by means of the local descriptor.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	31.07.2014
 */
public class VersionedFileSystemFileVersioningHandler 
implements IFileVersioningHandler {
	
	@Inject
	private ISingleVersionFileSystemDescriptorProvider svsProvider;

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.file.client.IFileVersioningHandler
	 * #addToVersionControl(java.lang.String, 
	 * de.ubt.ai1.supermod.mm.client.LocalRepository)
	 */
	@Override
	public boolean addToVersionControl(String resourceUri, 
			LocalRepository repo) {
		SingleVersionFileSystemDescriptor svfs = 
				svsProvider.getSingleVersionFileSystemDescriptor(
						repo.getLocalDescriptor());
		IResource iRes = ResourcesPlugin.getWorkspace().getRoot()
				.findMember(resourceUri);
		String relativeUri = relativize(resourceUri, svfs);
		SingleVersionResourceDescriptor resDesc = svfs.getResource(relativeUri);
		if (resDesc == null) {
			if (iRes instanceof IFile) {
				resDesc = svfs.createFile(relativeUri);
			}
			else {
				resDesc = svfs.createFolder(relativeUri);
			}
		}
		else {
			if (resDesc.isVersioned()) {
				return false;
			}
		}
		// in case the container of the added resource is not versions, it must
		// be added to version control, too.
		SingleVersionResourceDescriptor current = resDesc;
		while (current != null) {
			current.setVersioned(true);
			current = current.getContainer();
		}
		return true;
	}

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.file.client.IFileVersioningHandler
	 * #removeFromVersionControl(java.lang.String, 
	 * de.ubt.ai1.supermod.mm.client.LocalRepository)
	 */
	@Override
	public boolean removeFromVersionControl(String resourceUri, 
			LocalRepository repo) {
		SingleVersionFileSystemDescriptor svfs = 
				svsProvider.getSingleVersionFileSystemDescriptor(
						repo.getLocalDescriptor());
		IResource iRes = ResourcesPlugin.getWorkspace().getRoot()
				.findMember(resourceUri);
		String relativeUri = relativize(resourceUri, svfs);
		SingleVersionResourceDescriptor resDesc = svfs.getResource(relativeUri);
		if (resDesc == null) {
			if (iRes instanceof IFile) {
				resDesc = svfs.createFile(relativeUri);
			}
			else {
				resDesc = svfs.createFolder(relativeUri);
			}
		}
		else {
			if (!resDesc.isVersioned()) {
				return false;
			}
		}
		resDesc.setVersioned(false);
		return true;
	}

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.file.client.IFileVersioningHandler
	 * #isVersioned(java.lang.String, 
	 * de.ubt.ai1.supermod.mm.client.LocalRepository)
	 */
	@Override
	public boolean isVersioned(String resourceUri, LocalRepository repo) {
		SingleVersionFileSystemDescriptor svfs = 
				svsProvider.getSingleVersionFileSystemDescriptor(
						repo.getLocalDescriptor());
		String relativeUri = relativize(resourceUri, svfs);
		SingleVersionResourceDescriptor resDesc = svfs.getResource(relativeUri);
		return (resDesc != null && resDesc.isVersioned());
	}
	
	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.file.client.IFileVersioningHandler
	 * #isUnversioned(java.lang.String, 
	 * de.ubt.ai1.supermod.mm.client.LocalRepository)
	 */
	@Override
	public boolean isUnversioned(String resourceUri, LocalRepository repo) {
		SingleVersionFileSystemDescriptor svfs = 
				svsProvider.getSingleVersionFileSystemDescriptor(
						repo.getLocalDescriptor());
		String relativeUri = relativize(resourceUri, svfs);
		SingleVersionResourceDescriptor resDesc = svfs.getResource(relativeUri);
		return (resDesc != null && !resDesc.isVersioned());
	}

	/**
	 * Makes a resource URI relative to the root URI defined in a given file
	 * system descriptor.
	 *
	 * @see FileUtil#makeRelative(String, String)
	 *
	 * @param resourceUri
	 * @param pdDescriptor
	 * @return the relative URI.
	 */
	private String relativize(String resourceUri,
			SingleVersionProductDimensionDescriptor pdDescriptor) {
		return FileUtil.makeRelative(((SingleVersionFileSystemDescriptor) 
				pdDescriptor).getRootUri(), resourceUri);
	}

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.file.client.IFileVersioningHandler
	 * #isResponsibleFor(java.lang.String, 
	 * de.ubt.ai1.supermod.mm.client.LocalRepository)
	 */
	@Override
	public boolean isResponsibleFor(String resourceUri, LocalRepository repo) {
		SingleVersionFileSystemDescriptor svfs = 
				svsProvider.getSingleVersionFileSystemDescriptor(
						repo.getLocalDescriptor());
		String relUri = relativize(resourceUri, svfs);
		return relUri != null && !relUri.isEmpty() &&
				!relUri.equals(resourceUri);
	}


}
