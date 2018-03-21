/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/

package de.ubt.ai1.supermod.service.client;

import de.ubt.ai1.supermod.mm.client.SingleVersionProductDimensionDescriptor;
import de.ubt.ai1.supermod.mm.core.ProductDimension;
import de.ubt.ai1.supermod.service.client.exceptions.SuperModClientException;

/**
 * Service interface for the import operation defined on product dimensions. It
 * takes a descriptor as input, which describes a sub-set of the workspace which
 * is currently visible. As its result, it produces a corresponding 
 * multi-version representation.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	30.07.2014
 */
public interface IProductDimensionImportService {
	
	/**
	 * Performs the input operation on the specific product space dimensions.
	 * Client must implement this method in order to implement the concrete
	 * transformation procedure for each specific product dimension type.
	 *
	 * @param descriptor describes the sub-set of the local workspace to be
	 * 			converted.
	 * @return the converted multi-version representation of the described
	 * 			workspace elements.
	 * @throws SuperModClientException
	 */
	public ProductDimension doImport(
			SingleVersionProductDimensionDescriptor descriptor) 
					throws SuperModClientException;

}
