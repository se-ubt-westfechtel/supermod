/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.vcs.client.impl;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;

import com.google.inject.Inject;

import de.ubt.ai1.supermod.mm.client.LocalRepository;
import de.ubt.ai1.supermod.mm.core.Tristate;
import de.ubt.ai1.supermod.mm.file.VersionedFileSystem;
import de.ubt.ai1.supermod.mm.file.VersionedResource;
import de.ubt.ai1.supermod.mm.file.client.SingleVersionFileDescriptor;
import de.ubt.ai1.supermod.mm.file.client.SingleVersionFileSystemDescriptor;
import de.ubt.ai1.supermod.mm.file.client.SingleVersionFolderDescriptor;
import de.ubt.ai1.supermod.mm.file.client.SingleVersionResourceDescriptor;
import de.ubt.ai1.supermod.service.client.exceptions.SuperModClientException;
import de.ubt.ai1.supermod.service.client.exceptions.SuperModClientWrappedException;
import de.ubt.ai1.supermod.service.file.IVersionedFileSystemProvider;
import de.ubt.ai1.supermod.service.file.client.FileUtil;
import de.ubt.ai1.supermod.service.file.client.IFileHasher;
import de.ubt.ai1.supermod.service.file.client.IFileVersioningHandler;
import de.ubt.ai1.supermod.service.file.client.ISingleVersionFileSystemDescriptorProvider;
import de.ubt.ai1.supermod.vcs.client.IStateService;

/**
 * Default implementation of the VCS operation "State". It looks up a given
 * resource both in the local workspace and the repository product space and
 * compares the respective contents in order to determine the versioning state.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	04.08.2014
 */
public class StateService implements IStateService {
	
	@Inject
	private ISingleVersionFileSystemDescriptorProvider svsProvider;
	
	@Inject
	private IVersionedFileSystemProvider vfsProvider;
	
	@Inject
	private IFileVersioningHandler fileVersioningHandler;
	
	@Inject
	private IFileHasher fileHasher;

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.vcs.IStateService#getState(
	 * de.ubt.ai1.supermod.mm.client.LocalRepository, java.lang.String)
	 */
	@Override
	public State getState(LocalRepository repo, String resourceUri) 
			throws SuperModClientException {
		if (repo.getLocalDescriptor() == null) {
			return State.UNKNOWN;
		}
		IResource resource = ResourcesPlugin.getWorkspace().getRoot()
				.findMember(resourceUri);
		boolean inWorkspace = resource != null;
		SingleVersionFileSystemDescriptor svs = 
				svsProvider.getSingleVersionFileSystemDescriptor(
						repo.getLocalDescriptor());
		VersionedResource versionedRes = getInProductSpace(
				vfsProvider.getVersionedFileSystem(repo.getProductSpace()),
				svs.getRootUri(), resourceUri);
		boolean versioned = fileVersioningHandler.isVersioned(
				resourceUri, repo);
		boolean unversioned = fileVersioningHandler.isUnversioned(
				resourceUri, repo);
		boolean inRepository = versionedRes != null &&
				versionedRes.isVisibleHierarchically(
						repo.getVersionSpace().applyAllCompletions(
								repo.getLocalChoice()), null)
						== Tristate.TRUE;
		boolean isRoot = resourceUri != null && resource != null &&
				resourceUri.equals(resource.getProject()
						.getFullPath().toPortableString());
		
		if (isRoot) {
			if (repo.getLocalDescriptor().isModified() ||
					isModified(resource, repo)) {
				return State.CHANGED;
			}
			else {
				return State.UNCHANGED;
			}
		}
		
		if (inWorkspace && resource.getProject() != null) {
			String metaPath = resource.getProject().getFullPath()
					.toPortableString() + "/.supermod";
			if (resource.getFullPath().toPortableString()
					.contains(metaPath)) {
				return State.METADATA;
			}
		}
		
		if (inRepository) {
			if (versioned && !inWorkspace) {
				return State.MISSING;
			}
			if (unversioned) {
				return State.REMOVED;
			}
		}
		
		if (inWorkspace && !inRepository) {
			if (unversioned) {
				return State.UNVERSIONED;
			}
			else if (versioned) {
				return State.ADDED;
			}
		}
		
		if (inWorkspace && inRepository) {
			if (isModified(resource, repo)) {
				return State.CHANGED;
			}
			else {
				return State.UNCHANGED;
			}
		}
		
		return State.UNKNOWN;
	}
	
	/**
	 * Retrieves a versioned resource with a specified URI in a given versioned
	 * file system.
	 *
	 * @param vfs
	 * @param rootUri root URI of the versioned file system
	 * @param uri absolute URI
	 * @return the versioned resource, if found, or <code>null</code>.
	 */
	private VersionedResource getInProductSpace(
			VersionedFileSystem vfs, String rootUri, String uri) {
		String relativeUri = FileUtil.makeRelative(rootUri, uri);
		return vfs.getResource(relativeUri);
	}

	/**
	 * Checks whether a specified resource is modified in the local workspace.
	 * A folder is modified in case one of its contents is modified, or a
	 * resource has been added or deleted within it. A file is modified in case
	 * hashing its current contents returns a value different from the hash
	 * that is currently cached in the workspace descriptor.
	 *
	 * @param resource
	 * @param repo
	 * @return
	 * @throws SuperModClientException
	 */
	private boolean isModified(IResource resource,
			LocalRepository repo) throws SuperModClientException {
		String uri = resource.getFullPath().toPortableString();
		SingleVersionFileSystemDescriptor svfs = 
				svsProvider.getSingleVersionFileSystemDescriptor(
						repo.getLocalDescriptor());
		String rootUri = (svfs.getRootUri());
		String relativeUri = FileUtil.makeRelative(rootUri, uri);
		SingleVersionResourceDescriptor resDesc = svfs.getResource(relativeUri);
		if (resource instanceof IFile && 
				resDesc instanceof SingleVersionFileDescriptor) {
			// file: compare current with cached hash value.
			String cachedHash = ((SingleVersionFileDescriptor) 
					resDesc).getHash();
			String actualHash = fileHasher.hash((IFile) resource);
			return cachedHash == null || !cachedHash.equals(actualHash);
		}
		else if (resource instanceof IContainer) {
			try {
				Set<String> traversedMembers = new HashSet<>();
				// container: recursively iterate over contents.
				for (IResource member : ((IContainer) resource).members()) {
					State memberState = getState(repo, member.getFullPath()
							.toPortableString());
					if (memberState == State.CHANGED || memberState == 
							State.ADDED || memberState == State.UNKNOWN ||
							memberState == State.REMOVED) {
						return true;
					}
					traversedMembers.add(member.getName());
				}
				if (resDesc instanceof SingleVersionFolderDescriptor) {
					for (SingleVersionResourceDescriptor versionedContent : 
						((SingleVersionFolderDescriptor) resDesc).getContents()) {
						if (!traversedMembers.contains(versionedContent.getName())) {
							State memberState = getState(repo, svfs.getRootUri() +
									"/" + versionedContent.getPath());
							if (memberState == State.CHANGED || memberState ==
									State.MISSING) {
								return true;
							}
						}
					}
				}
			} catch (CoreException e) {
				throw new SuperModClientWrappedException(e);
			}
		}
		return false;
	}

}
