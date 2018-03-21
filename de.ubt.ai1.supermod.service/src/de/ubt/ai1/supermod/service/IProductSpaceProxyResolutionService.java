/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/

package de.ubt.ai1.supermod.service;

import de.ubt.ai1.supermod.mm.core.ProductSpace;

/**
 * Service interface for the resolution of any kinds of proxies in a product
 * space. Typically, those proxies are created during importing or merging
 * product space dimensions.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	07.08.2015
 */
public interface IProductSpaceProxyResolutionService {
	
	/**
	 * Resolves all of the proxies found within the specified product space.
	 * This typically invokes several product dimension proxy resolution
	 * services.
	 *
	 * @param productDimension where to apply proxy resolution.
	 */
	public void resolveProxies(ProductSpace productSpace);

}
