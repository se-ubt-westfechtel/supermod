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
 * Service interface for the clone operation on an entire product space. The
 * result shall not contain any reference to the original product space, and
 * represent exactly the same information. It refers to the same rule base and
 * visibility forest as the original.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	29.07.2014
 */
public interface IProductSpaceCloneService {
	
	/**
	 * Performs the clone operation and returns an appropriate result. Clients
	 * may use specific implementations of 
	 * {@code IProductDimensionCloneService} in order to clone product space
	 * dimensions contained in the original product space.
	 *
	 * @param original the product space to clone.
	 * @return the clone of the original.
	 */
	public ProductSpace clone(ProductSpace original);

}
