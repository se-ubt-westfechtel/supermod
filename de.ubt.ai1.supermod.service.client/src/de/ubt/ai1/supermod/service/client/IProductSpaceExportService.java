/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/

package de.ubt.ai1.supermod.service.client;

import de.ubt.ai1.supermod.mm.client.ProductSpaceExportTrace;
import de.ubt.ai1.supermod.mm.client.SingleVersionProductSpaceDescriptor;
import de.ubt.ai1.supermod.mm.core.ProductSpace;
import de.ubt.ai1.supermod.service.client.exceptions.SuperModClientException;

/**
 * Service interface for exporting entire product spaces. Exporting a product
 * space is realized by exporting all of its product dimensions. For this
 * purpose, specific product dimension export services may be used.
 * 
 * @see IProductDimensionExportService
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	30.07.2014
 */
public interface IProductSpaceExportService {
	
	/**
	 * Exports the sub-set of the specified product space, which is described
	 * by the specified descriptor. Modifies the descriptor in order to
	 * describe the state of the product space after exporting.
	 *
	 * @param ps the product space to export.
	 * @param descriptor describes the sub-set of the product space and will be
	 * 			updated during the export transformation.
	 * @return a trace explaining how elements have been exported.
	 * @throws SuperModClientException in case exporting fails.
	 */
	public ProductSpaceExportTrace export(ProductSpace ps, 
			SingleVersionProductSpaceDescriptor descriptor) 
					throws SuperModClientException;

}
