/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/

package de.ubt.ai1.supermod.service.file.pure.client.impl;

import com.google.inject.Inject;

import de.ubt.ai1.supermod.mm.client.ConflictSet;
import de.ubt.ai1.supermod.mm.client.SuperModClientFactory;
import de.ubt.ai1.supermod.mm.core.ProductDimension;
import de.ubt.ai1.supermod.mm.core.ProductSpace;
import de.ubt.ai1.supermod.service.client.IProductDimensionValidationService;
import de.ubt.ai1.supermod.service.client.IProductSpaceValidationService;
import de.ubt.ai1.supermod.service.file.File;

/**
 * Implementation of the product space validation client service interface 
 * specific to a product space which consists of only a versioned file system.
 * It invokes the corresponding {@link IProductDimensionValidationService} for
 * the product dimension type {@link de.ubt.ai1.supermod.service.file.File}.
 * 
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	31.07.2014
 */
public class PurefileProductSpaceValidationService 
implements IProductSpaceValidationService {

	@Inject
	@File
	private IProductDimensionValidationService fileSystemValidationService;
	
	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.client.IProductSpaceValidationService
	 * #validate(de.ubt.ai1.supermod.mm.core.ProductSpace)
	 */
	@Override
	public ConflictSet validate(ProductSpace productSpace) {
		ConflictSet cs = SuperModClientFactory.eINSTANCE.createConflictSet();
		for (ProductDimension pd : productSpace.getDimensions()) {
			cs.getConflicts().addAll(fileSystemValidationService.validate(pd)
					.getConflicts());
		}
		return cs;
	}

}
