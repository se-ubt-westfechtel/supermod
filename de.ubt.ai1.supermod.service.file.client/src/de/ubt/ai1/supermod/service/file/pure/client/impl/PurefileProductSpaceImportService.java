/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/

package de.ubt.ai1.supermod.service.file.pure.client.impl;

import com.google.inject.Inject;

import de.ubt.ai1.supermod.mm.client.SingleVersionProductSpaceDescriptor;
import de.ubt.ai1.supermod.mm.core.ProductSpace;
import de.ubt.ai1.supermod.mm.core.SuperModCoreFactory;
import de.ubt.ai1.supermod.service.client.IProductDimensionImportService;
import de.ubt.ai1.supermod.service.client.IProductSpaceImportService;
import de.ubt.ai1.supermod.service.client.exceptions.SuperModClientException;
import de.ubt.ai1.supermod.service.file.File;
import de.ubt.ai1.supermod.service.file.client.ISingleVersionFileSystemDescriptorProvider;

/**
 * Implementation of the product space import client service interface specific 
 * to a product space which consists of only a versioned file system. It invokes 
 * the corresponding {@link IProductDimensionImportService} for the product
 * dimension type {@link de.ubt.ai1.supermod.service.file.File}.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	31.07.2014
 */
public class PurefileProductSpaceImportService
implements IProductSpaceImportService {
	
	@Inject
	private ISingleVersionFileSystemDescriptorProvider svsProvider;
	
	@Inject
	@File
	private IProductDimensionImportService fileSystemImportService;

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.client.IProductSpaceImportService
	 * #doImport(de.ubt.ai1.supermod.mm.client.
	 * SingleVersionProductSpaceDescriptor)
	 */
	@Override
	public ProductSpace doImport(SingleVersionProductSpaceDescriptor descriptor)
			throws SuperModClientException {
		ProductSpace ps = SuperModCoreFactory.eINSTANCE.createProductSpace();
		ps.getDimensions().add(fileSystemImportService.doImport(
				svsProvider.getSingleVersionFileSystemDescriptor(descriptor)));
		return ps;
	}

}
