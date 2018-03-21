/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/

package de.ubt.ai1.supermod.service.client;

import de.ubt.ai1.supermod.mm.client.SingleVersionProductSpaceDescriptor;
import de.ubt.ai1.supermod.service.client.exceptions.SuperModClientException;

/**
 * Service interface for the selection of a single version among the complete
 * product space. Typically, this is implemented by providing a selection in
 * each product dimension separately, using specific implementations of {@link
 * ISingleVersionProductDimensionDescriptorSelectionService}.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	31.07.2014
 */
public interface ISingleVersionProductSpaceDescriptorSelectionService {
	
	/**
	 * To be implemented by clients in order to prompt the user for the
	 * selection of a sub-set of the entire product space.
	 *
	 * @param proposedDescriptor an initial proposal of product space selection.
	 * @return the performed single version selection.
	 * @throws SuperModClientException in case selection fails.
	 */
	public SingleVersionProductSpaceDescriptor selectSingleVersion(
			String rootUri) throws SuperModClientException;

}
