/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.service.file.pure.impl;

import com.google.inject.Inject;

import de.ubt.ai1.supermod.mm.core.OptionBinding;
import de.ubt.ai1.supermod.mm.core.ProductSpace;
import de.ubt.ai1.supermod.mm.core.SuperModCoreFactory;
import de.ubt.ai1.supermod.service.IProductDimensionFilterService;
import de.ubt.ai1.supermod.service.IProductSpaceFilterService;
import de.ubt.ai1.supermod.service.exceptions.UnderspecifiedVisibilityException;
import de.ubt.ai1.supermod.service.file.File;
import de.ubt.ai1.supermod.service.file.IVersionedFileSystemProvider;

/**
 * Implementation of the product space filter service interface specific to
 * SuperMod's pure file product space type. It reuses the file specific
 * dimension filter service.
 * 
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	09.09.2014
 */
public class PurefileProductSpaceFilterService 
implements IProductSpaceFilterService {
	
	@Inject
	private IVersionedFileSystemProvider fileSystemProvider;
	
	@Inject
	@File
	private IProductDimensionFilterService fileSystemFilterService;
	
	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.IProductSpaceFilterService
	 * #filter(de.ubt.ai1.supermod.mm.core.ProductSpace, 
	 * de.ubt.ai1.supermod.mm.core.OptionBinding)
	 */
	@Override
	public ProductSpace filter(ProductSpace base, OptionBinding filter) 
			throws UnderspecifiedVisibilityException {
		ProductSpace filteredPs = SuperModCoreFactory.eINSTANCE
				.createProductSpace();
		filteredPs.getDimensions().add(
				fileSystemFilterService.filter(
						fileSystemProvider.getVersionedFileSystem(base), 
						filter));
		return filteredPs;
	}

}
