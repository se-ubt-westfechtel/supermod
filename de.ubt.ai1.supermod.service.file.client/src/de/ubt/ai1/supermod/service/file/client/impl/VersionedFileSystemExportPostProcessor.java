/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/

package de.ubt.ai1.supermod.service.file.client.impl;

import org.eclipse.emf.ecore.resource.ResourceSet;

import com.google.inject.Inject;

import de.ubt.ai1.supermod.mm.client.LocalRepository;
import de.ubt.ai1.supermod.mm.core.ProductDimension;
import de.ubt.ai1.supermod.service.client.IProductDimensionExportPostProcessor;
import de.ubt.ai1.supermod.service.client.exceptions.SuperModClientException;
import de.ubt.ai1.supermod.service.file.client.IFileHasher;
import de.ubt.ai1.supermod.service.file.client.ISingleVersionFileSystemDescriptorProvider;

/**
 * An implementation of the export post processor that assumes a versioned
 * file system, whose hashes are updated after the export.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	31.07.2014
 */
public class VersionedFileSystemExportPostProcessor 
implements IProductDimensionExportPostProcessor {
	
	@Inject
	private ISingleVersionFileSystemDescriptorProvider svsProvider;
	
	@Inject
	private IFileHasher fileHasher;

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.client.
	 * IProductDimensionExportPostProcessor#postProcess(
	 * de.ubt.ai1.supermod.mm.client.LocalRepository, 
	 * org.eclipse.emf.ecore.resource.ResourceSet, 
	 * de.ubt.ai1.supermod.mm.core.ProductDimension, 
	 * de.ubt.ai1.supermod.mm.core.ProductDimension, java.lang.String)
	 */
	@Override
	public void postProcess(LocalRepository repo, ResourceSet rs,
			ProductDimension oldPd, ProductDimension newPd, String psId) 
					throws SuperModClientException {
		fileHasher.updateHashes(
				svsProvider.getSingleVersionFileSystemDescriptor(
						repo.getLocalDescriptor()));	
	}

}
