/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/

package de.ubt.ai1.supermod.service.file.client.impl;

import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

import de.ubt.ai1.supermod.mm.file.SuperModFileFactory;
import de.ubt.ai1.supermod.mm.file.VersionedFileSystem;
import de.ubt.ai1.supermod.service.client.IProductDimensionInitializationService;
import de.ubt.ai1.supermod.service.client.exceptions.SuperModClientException;
import de.ubt.ai1.supermod.service.client.exceptions.SuperModClientWrappedException;

/**
 * An implementation of the product dimension initialization service specific
 * to the dimension type 'versioned file system'. It creates a new resource
 * for the file system tree in <code>.supermod/main/main.vfs</code> and inserts
 * an empty versioned file system there.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	31.07.2014
 */
public class VersionedFileSystemInitializationService implements
		IProductDimensionInitializationService {

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.client.
	 * IProductDimensionInitializationService#initializeProductDimension(
	 * org.eclipse.emf.ecore.resource.ResourceSet, 
	 * de.ubt.ai1.supermod.mm.core.VersionSpace, 
	 * de.ubt.ai1.supermod.mm.core.VisibilityForest, java.lang.String)
	 */
	@Override
	public VersionedFileSystem initializeProductDimension(ResourceSet rs, 
			String repoUri)
			throws SuperModClientException {
		URI psUri = URI.createPlatformResourceURI(repoUri, true)
				.trimFileExtension().appendFileExtension("vfs");
		Resource psRes = rs.createResource(psUri);
		VersionedFileSystem vfs = SuperModFileFactory.eINSTANCE
				.createVersionedFileSystem();
		vfs.setDimensionName("vfs");
		psRes.getContents().add(vfs);
		try {
			psRes.save(null);
		} catch (IOException e) {
			throw new SuperModClientWrappedException(e);
		}
		return vfs;
	}

}
