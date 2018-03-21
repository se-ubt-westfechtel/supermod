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

import com.google.inject.Inject;

import de.ubt.ai1.supermod.mm.client.SingleVersionProductDimensionDescriptor;
import de.ubt.ai1.supermod.mm.file.client.SingleVersionFileSystemDescriptor;
import de.ubt.ai1.supermod.mm.file.client.SuperModFileClientFactory;
import de.ubt.ai1.supermod.service.client.IMetadataResourceHandler;
import de.ubt.ai1.supermod.service.client.ISingleVersionProductDimensionDescriptorInitializationService;
import de.ubt.ai1.supermod.service.client.ISingleVersionProductDimensionDescriptorSelectionService;
import de.ubt.ai1.supermod.service.client.exceptions.SuperModClientException;
import de.ubt.ai1.supermod.service.client.exceptions.SuperModClientWrappedException;
import de.ubt.ai1.supermod.service.file.File;

/**
 * Implementation of the single version product dimension descriptor
 * initialization service interface specific to the content type of versioned
 * file systems. It initializes the descriptor by a corresponding user
 * selection. The selection is moved into a separate EMF resource, namely
 * <code>.supermod/main/main.svfs</code>.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	31.07.2014
 */
public class VersionedFileSystemSingleVersionProductDimensionDescriptorInitializationService 
implements ISingleVersionProductDimensionDescriptorInitializationService {
	
	@Inject
	@File
	private ISingleVersionProductDimensionDescriptorSelectionService
	fileSingleVersionSelectionService;
	
	@Inject
	private IMetadataResourceHandler metadataResourceHandler;

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.client.
	 * ISingleVersionProductDimensionDescriptorInitializationService
	 * #initializeSingleVersionProductDimensionDescriptor(
	 * de.ubt.ai1.supermod.mm.client.SingleVersionProductDimensionDescriptor,
	 *  org.eclipse.emf.ecore.resource.ResourceSet, java.lang.String)
	 */
	@Override
	public SingleVersionProductDimensionDescriptor 
	initializeSingleVersionProductDimensionDescriptor(String rootUri,
			ResourceSet rs, boolean interactive) throws SuperModClientException {
		String repoUriStr = metadataResourceHandler.createRepositoryUri(rootUri);
		URI svfsUri = URI.createPlatformResourceURI(repoUriStr, true)
				.trimFileExtension().appendFileExtension("svfs");
		Resource svfsRes = rs.createResource(svfsUri);
		SingleVersionProductDimensionDescriptor svfs = null;
		if (interactive) {
			svfs = fileSingleVersionSelectionService
					.selectSingleVersionProductDimension(rootUri);
		}
		else {
			svfs = SuperModFileClientFactory.eINSTANCE
					.createSingleVersionFileSystemDescriptor();
			((SingleVersionFileSystemDescriptor) svfs).setRootUri(rootUri);
		}
		svfsRes.getContents().add(svfs);
		try {
			svfsRes.save(null);
		} catch (IOException e) {
			throw new SuperModClientWrappedException(e);
		}
		return svfs;
	}

}
