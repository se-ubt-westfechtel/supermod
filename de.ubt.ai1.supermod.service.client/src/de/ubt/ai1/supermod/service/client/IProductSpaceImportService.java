/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/

package de.ubt.ai1.supermod.service.client;

import de.ubt.ai1.supermod.mm.client.SingleVersionProductSpaceDescriptor;
import de.ubt.ai1.supermod.mm.core.ProductSpace;
import de.ubt.ai1.supermod.service.client.exceptions.SuperModClientException;

/**
 * Service interface for importing entire product spaces. Importing a product
 * space is realized by importing all of its product dimensions. For this
 * purpose, specific product dimension import services may be used.
 * 
 * @see IProductDimensionImportService
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	30.07.2014
 */
public interface IProductSpaceImportService {
	
	/**
	 * Imports a product space by means of specific product dimension import
	 * services.
	 *
	 * @param descriptor contains a product dimension descriptor for each
	 * 			dimension to be imported.
	 * @return the resulting product space that consists of the imported
	 * 			product dimensions.
	 * @throws SuperModClientException in case the import fails.
	 */
	public ProductSpace doImport(
			SingleVersionProductSpaceDescriptor descriptor) 
					throws SuperModClientException;

}
