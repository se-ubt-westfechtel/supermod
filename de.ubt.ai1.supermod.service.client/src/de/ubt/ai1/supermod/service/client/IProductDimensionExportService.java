/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/

package de.ubt.ai1.supermod.service.client;

import de.ubt.ai1.supermod.mm.client.ProductDimensionExportTrace;
import de.ubt.ai1.supermod.mm.client.SingleVersionProductDimensionDescriptor;
import de.ubt.ai1.supermod.mm.core.ProductDimension;
import de.ubt.ai1.supermod.service.client.exceptions.SuperModClientException;

/**
 * Service interface for the export operation defined on a specific product
 * space dimension. The specified dimension is converted into its
 * single-version representation and moved to the local workspace at a location
 * specified by a single version descriptor.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	30.07.2014
 */
public interface IProductDimensionExportService {
	
	/**
	 * To be implemented by clients in order to realize the product dimension
	 * specific export function.
	 *
	 * @param pd the product dimension to export.
	 * @param descriptor describes the location within the workspace where the
	 * 			product space shall be exported. Furthermore, it should be
	 * 			updated in order to represent the exported product space.
	 * @return a trace explaining how elements have been exported.
	 * @throws SuperModClientException in case exporting failed.
	 */
	public ProductDimensionExportTrace export(ProductDimension pd, 
			SingleVersionProductDimensionDescriptor descriptor) 
					throws SuperModClientException;

}
