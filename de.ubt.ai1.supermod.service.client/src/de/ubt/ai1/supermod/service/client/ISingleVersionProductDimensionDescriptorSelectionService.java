/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/

package de.ubt.ai1.supermod.service.client;

import de.ubt.ai1.supermod.mm.client.SingleVersionProductDimensionDescriptor;
import de.ubt.ai1.supermod.service.client.exceptions.SuperModClientException;

/**
 * Service interface for the selection of a sub-set of the product space which
 * is to be put under version control initially. The selection should be done
 * by the user, who is presented suitable abstractions of the product dimension.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	31.07.2014
 */
public interface ISingleVersionProductDimensionDescriptorSelectionService {
	
	/**
	 * To be implemented in order to make the user select a sub-set of the
	 * product space to be versioned initially. The selection describes the
	 * artifacts which will be versioned in the local SuperMod repository.
	 *
	 * @param rootUri the root of the to be versioned workspace contents.
	 * @return a descriptor that represents the user selection.
	 * @throws SuperModClientException in case selection fails.
	 */
	public SingleVersionProductDimensionDescriptor 
	selectSingleVersionProductDimension(String rootUri) 
					throws SuperModClientException;

}
