/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/

package de.ubt.ai1.supermod.service.client;

import de.ubt.ai1.supermod.mm.client.ConflictSet;
import de.ubt.ai1.supermod.mm.core.ProductSpace;

/**
 * Service interface for the validation of a complete SuperMod product space.
 * Clients may use specific implementations of product dimension validation
 * services to validate each dimension separately. The resulting conflicts
 * are summarized in a single conflict set.
 * 
 * @see IProductDimensionValidationService
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	30.07.2014
 */
public interface IProductSpaceValidationService {
	
	/**
	 * Validates the product space by applying specific validation to its
	 * product dimensions.
	 *
	 * @param productSpace the product space to validate.
	 * @return a conflict that that contains all conflicts detected within the
	 * 			different product dimensions.
	 */
	public ConflictSet validate(ProductSpace productSpace);

}
