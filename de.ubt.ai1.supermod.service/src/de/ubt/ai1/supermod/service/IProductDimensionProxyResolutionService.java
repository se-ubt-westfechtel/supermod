/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/

package de.ubt.ai1.supermod.service;

import de.ubt.ai1.supermod.mm.core.ProductDimension;

/**
 * Service interface for the resolution of any kinds of proxies, which define a 
 * place-holder for specific cross reference targets internally in a product
 * dimension. Typically, those proxies are created during importing or merging
 * product space dimensions.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	30.07.2014
 */
public interface IProductDimensionProxyResolutionService {
	
	/**
	 * Resolves all of the proxies found within the specified product dimension.
	 *
	 * @param productDimension where to apply proxy resolution.
	 */
	public void resolveProxies(ProductDimension productDimension);

}
