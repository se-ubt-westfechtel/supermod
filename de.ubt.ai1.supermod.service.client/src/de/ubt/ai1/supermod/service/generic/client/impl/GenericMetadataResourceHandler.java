/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.service.generic.client.impl;

import java.io.IOException;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

import de.ubt.ai1.supermod.mm.client.LocalRepository;
import de.ubt.ai1.supermod.service.client.IMetadataResourceHandler;
import de.ubt.ai1.supermod.service.client.exceptions.SuperModClientException;
import de.ubt.ai1.supermod.service.client.exceptions.SuperModClientWrappedException;
import de.ubt.ai1.util.emf.AI1ResourceUtil;

/**
 * Default implementation of the meta-data resource handler, an auxiliary VCS
 * service. It assumes that the repository is stored in the directory
 * <code>.supermod/main/main.rep</code>, relative to the root directory of the
 * versioned file system fragment.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	04.08.2014
 */
public class GenericMetadataResourceHandler
implements IMetadataResourceHandler {
	
	public static final String METADATA_FOLDER = ".supermod/main";
	public static final String METADATA_FILE = "main.rep";
	
	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.vcs.IMetadataResourceHandler#
	 * createRepositoryUri(de.ubt.ai1.supermod.mm.client.
	 * SingleVersionProductSpaceDescriptor)
	 */
	@Override
	public String createRepositoryUri(String rootUri) {
		return rootUri + "/" + METADATA_FOLDER + "/" + METADATA_FILE;
	}

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.vcs.IMetadataResourceHandler#getRepository(
	 * java.lang.String, org.eclipse.emf.ecore.resource.ResourceSet)
	 */
	@Override
	public LocalRepository getRepository(String fileUri, ResourceSet rs) 
			throws SuperModClientException {
		IResource res = ResourcesPlugin.getWorkspace().getRoot()
				.findMember(fileUri);
		if (res == null) return null;
		IContainer cont = res instanceof IContainer ? 
				(IContainer) res : res.getParent();
		while (cont != null) {
			IResource member = cont.findMember(METADATA_FOLDER + "/" + 
					METADATA_FILE);
			if (member instanceof IFile) {
				IFile repoFile = (IFile) member;
				Resource r = AI1ResourceUtil.iResourceToEResource(repoFile, rs);
				if (r != null) {
					try {
						r.load(null);
					} catch (IOException e) {
						throw new SuperModClientWrappedException(e);
					}
					return (LocalRepository) r.getContents().get(0);
				}
			}
			cont = cont.getParent();
		}
		return null;
	}

}
