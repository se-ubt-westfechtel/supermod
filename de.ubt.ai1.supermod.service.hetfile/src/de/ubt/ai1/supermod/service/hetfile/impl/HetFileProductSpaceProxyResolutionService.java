/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.service.hetfile.impl;

import com.google.inject.Inject;

import de.ubt.ai1.supermod.mm.core.ProductSpace;
import de.ubt.ai1.supermod.service.IProductDimensionProxyResolutionService;
import de.ubt.ai1.supermod.service.IProductSpaceProxyResolutionService;
import de.ubt.ai1.supermod.service.emffile.EMFFile;
import de.ubt.ai1.supermod.service.file.IVersionedFileSystemProvider;

/**
 * Implementation of the proxy resolution service specific to the 'hetfile'
 * product space type. It resolves all EMF proxies in the versioned file system
 * using an appropriate product dimension proxy resolver.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	07.08.2015
 */
public class HetFileProductSpaceProxyResolutionService
implements IProductSpaceProxyResolutionService {
	
	@Inject
	private IVersionedFileSystemProvider vfsProvider;
	
	@Inject
	@EMFFile
	private IProductDimensionProxyResolutionService emfProxyResolver;

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.IProductSpaceProxyResolutionService
	 * #resolveProxies(de.ubt.ai1.supermod.service.ProductSpace)
	 */
	@Override
	public void resolveProxies(ProductSpace productSpace) {
		emfProxyResolver.resolveProxies(
				vfsProvider.getVersionedFileSystem(productSpace));
		
	}

}
