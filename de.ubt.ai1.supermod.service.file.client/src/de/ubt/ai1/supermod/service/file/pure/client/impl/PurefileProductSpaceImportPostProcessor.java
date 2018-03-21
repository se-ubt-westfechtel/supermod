/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/

package de.ubt.ai1.supermod.service.file.pure.client.impl;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

import com.google.inject.Inject;

import de.ubt.ai1.supermod.mm.client.LocalRepository;
import de.ubt.ai1.supermod.mm.core.ProductSpace;
import de.ubt.ai1.supermod.mm.file.VersionedFileSystem;
import de.ubt.ai1.supermod.service.client.IProductDimensionImportPostProcessor;
import de.ubt.ai1.supermod.service.client.IProductSpaceImportPostProcessor;
import de.ubt.ai1.supermod.service.client.exceptions.SuperModClientException;
import de.ubt.ai1.supermod.service.file.File;
import de.ubt.ai1.supermod.service.file.IVersionedFileSystemProvider;

/**
 * Implementation of the product space import post-processor client service
 * interface specific to a product space which consists of only a versioned
 * file system. It invokes the corresponding {@link 
 * IProductDimensionImportPostProcessor} for the product dimension type {@link
 * de.ubt.ai1.supermod.service.file.File}.
 * 
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	31.07.2014
 */
public class PurefileProductSpaceImportPostProcessor 
implements IProductSpaceImportPostProcessor {

	@Inject
	@File
	private IProductDimensionImportPostProcessor fileSystemPostProcessor;
	
	@Inject
	private IVersionedFileSystemProvider fileSystemProvider;
	
	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.client.IProductSpaceImportPostProcessor
	 * #postProcess(de.ubt.ai1.supermod.mm.client.LocalRepository,
	 *  org.eclipse.emf.ecore.resource.ResourceSet, 
	 *  de.ubt.ai1.supermod.mm.core.ProductSpace, 
	 *  de.ubt.ai1.supermod.mm.core.ProductSpace)
	 */
	@Override
	public void postProcess(LocalRepository repo, ResourceSet rs,
			ProductSpace oldPs, ProductSpace newPs) 
					throws SuperModClientException {
		VersionedFileSystem oldVfs = fileSystemProvider
				.getVersionedFileSystem(oldPs);
		VersionedFileSystem newVfs = fileSystemProvider
				.getVersionedFileSystem(newPs);
		if (oldVfs.getDimensionName().equals(newVfs.getDimensionName())) {
			fileSystemPostProcessor.postProcess(repo, rs, oldVfs, newVfs);
			Resource res = oldVfs.eResource();
			if (res != null) {
				res.getContents().clear();
				res.getContents().add(newVfs);
			}
		}
	}

}
