/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.vcs.client.impl;

import com.google.inject.Inject;

import de.ubt.ai1.supermod.mm.client.LocalRepository;
import de.ubt.ai1.supermod.mm.core.OptionExpr;
import de.ubt.ai1.supermod.mm.core.ProductSpaceElement;
import de.ubt.ai1.supermod.mm.file.VersionedFileSystem;
import de.ubt.ai1.supermod.mm.file.VersionedResource;
import de.ubt.ai1.supermod.mm.file.client.SingleVersionFileSystemDescriptor;
import de.ubt.ai1.supermod.service.client.IVersionLabellingService;
import de.ubt.ai1.supermod.service.file.IVersionedFileSystemProvider;
import de.ubt.ai1.supermod.service.file.client.FileUtil;
import de.ubt.ai1.supermod.service.file.client.ISingleVersionFileSystemDescriptorProvider;
import de.ubt.ai1.supermod.vcs.client.IVersionService;

/** 
 * Default implementation of the VCS operation "Version". It presents a textual
 * representation of the selected resource's visibility.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	04.08.2014
 */
public class VersionService implements IVersionService {
	
	@Inject
	private ISingleVersionFileSystemDescriptorProvider svsProvider;
	
	@Inject
	private IVersionedFileSystemProvider vfsProvider;
	
	@Inject
	private IVersionLabellingService versionLabellingService;

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.vcs.IVersionService#getVersion(
	 * de.ubt.ai1.supermod.mm.client.LocalRepository, java.lang.String)
	 */
	@Override
	public String getVersion(LocalRepository repo, String resourceUri) {
		SingleVersionFileSystemDescriptor svfs = 
				svsProvider.getSingleVersionFileSystemDescriptor(
						repo.getLocalDescriptor());
		VersionedResource versionedRes = getInProductSpace(
				vfsProvider.getVersionedFileSystem(repo.getProductSpace()),
				svfs.getRootUri(), resourceUri);
		if (versionedRes != null) {
			OptionExpr vis = getDisplayVisibility(versionedRes);
			if (vis == null) {
				return versionLabellingService.getDefaultLabel();
			}
			else {
				return versionLabellingService.getLabel(vis,
						repo.getVersionSpace());	
			}
		}
		else { // project root
			String s = "";
			if (repo.getLocalChoice().getNumberOfBindings() == 0) {
				s += versionLabellingService.getDefaultLabel();
			}
			else {
				s += versionLabellingService.getLabel(
						repo.getLocalChoice(), repo.getVersionSpace(), false);
			}		
			if (repo.getLocalAmbition() != null) {
				if (repo.getLocalAmbition().getNumberOfBindings() > 0) {
					s += "->" + versionLabellingService.getLabel(
							repo.getLocalAmbition(), repo.getVersionSpace(),
							true);
				}
				else {
					s += "->(true)";
				}
			}
			if (repo.getRemoteUri() != null && repo.getRemoteUser() != null) {
				String uri = repo.getRemoteUri();
				if (uri.contains("://")) {
					uri = uri.substring(uri.indexOf("://") + 3);
				}
				s += " [" + repo.getRemoteUser() + "@" + uri + "]";
			}
			return s;
		}		
	}
	
	/**
	 * returns an option expression that defines the visibility which is
	 * displayed to the user. It is defined as the closest non-null
	 * visibility accessible by walking up the element hierarchy.
	 *
	 * @param element
	 * @return
	 */
	private OptionExpr getDisplayVisibility(ProductSpaceElement element) {
		if (element.getVisibility() != null) {
			return element.getVisibility();
		}
		else if (element.getSuperProductSpaceElement() != null) {
			return getDisplayVisibility(element.getSuperProductSpaceElement());
		}
		return null;
	}

	/**
	 * Retrieves a versioned resource with a specified URI in a given version
	 * space.
	 *
	 * @param productSpace
	 * @param rootUri root URI of the versioned file system
	 * @param uri absolute URI
	 * @return the versioned resource, if found, or <code>null</code>.
	 */
	private VersionedResource getInProductSpace(
			VersionedFileSystem productSpace, String rootUri, String uri) {
		String relativeUri = FileUtil.makeRelative(rootUri, uri);
		return productSpace.getResource(relativeUri);
	}

}
