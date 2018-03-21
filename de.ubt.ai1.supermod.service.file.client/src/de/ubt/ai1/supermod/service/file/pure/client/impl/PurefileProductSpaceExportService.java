/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/

package de.ubt.ai1.supermod.service.file.pure.client.impl;

import com.google.inject.Inject;

import de.ubt.ai1.supermod.mm.client.ProductDimensionExportTrace;
import de.ubt.ai1.supermod.mm.client.ProductSpaceExportTrace;
import de.ubt.ai1.supermod.mm.client.SingleVersionProductSpaceDescriptor;
import de.ubt.ai1.supermod.mm.client.SuperModClientFactory;
import de.ubt.ai1.supermod.mm.core.ProductSpace;
import de.ubt.ai1.supermod.service.client.IProductDimensionExportService;
import de.ubt.ai1.supermod.service.client.IProductSpaceExportService;
import de.ubt.ai1.supermod.service.client.exceptions.SuperModClientException;
import de.ubt.ai1.supermod.service.file.File;
import de.ubt.ai1.supermod.service.file.IVersionedFileSystemProvider;
import de.ubt.ai1.supermod.service.file.client.ISingleVersionFileSystemDescriptorProvider;

/**
 * Implementation of the product space export client service interface specific 
 * to a product space which consists of only a versioned file system. It invokes 
 * the corresponding {@link IProductDimensionExportService} for the product
 *  dimension type {@link de.ubt.ai1.supermod.service.file.File}.
 * 
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	31.07.2014
 */
public class PurefileProductSpaceExportService 
implements IProductSpaceExportService {
	
	@Inject
	private IVersionedFileSystemProvider fileSystemProvider;
	
	@Inject
	private ISingleVersionFileSystemDescriptorProvider fileSystemDescProvider;
	
	@Inject
	@File
	private IProductDimensionExportService fileSystemExportService;

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.client.IProductSpaceExportService
	 * #export(de.ubt.ai1.supermod.mm.core.ProductSpace, 
	 * de.ubt.ai1.supermod.mm.client.SingleVersionProductSpaceDescriptor)
	 */
	@Override
	public ProductSpaceExportTrace export(ProductSpace ps, 
			SingleVersionProductSpaceDescriptor descriptor)
			throws SuperModClientException {
		ProductDimensionExportTrace fileTrace =
		fileSystemExportService.export(
				fileSystemProvider.getVersionedFileSystem(ps), 
				fileSystemDescProvider
						.getSingleVersionFileSystemDescriptor(descriptor));
		ProductSpaceExportTrace trace = SuperModClientFactory.eINSTANCE
				.createProductSpaceExportTrace();
		trace.setProductSpace(ps);
		trace.getDimensionTraces().add(fileTrace);
		return trace;
	}

}
