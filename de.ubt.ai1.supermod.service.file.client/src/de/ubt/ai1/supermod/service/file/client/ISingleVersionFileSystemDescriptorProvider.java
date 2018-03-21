/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.service.file.client;

import de.ubt.ai1.supermod.mm.client.SingleVersionProductSpaceDescriptor;
import de.ubt.ai1.supermod.mm.file.client.SingleVersionFileSystemDescriptor;

/**
 * Provider interface for a single-version file system dimension descriptor
 * within a single version product space descriptor.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	11.08.2014
 */
public interface ISingleVersionFileSystemDescriptorProvider {
	
	/**
	 * To be implemented in order to return the file system descriptor.
	 *
	 * @param desc where to find the file system descriptor in.
	 * @return the file system descriptor
	 */
	public SingleVersionFileSystemDescriptor 
	getSingleVersionFileSystemDescriptor(
			SingleVersionProductSpaceDescriptor desc);

}
