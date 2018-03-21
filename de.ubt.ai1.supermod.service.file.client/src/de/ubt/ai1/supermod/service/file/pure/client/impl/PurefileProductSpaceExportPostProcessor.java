/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/

package de.ubt.ai1.supermod.service.file.pure.client.impl;

import org.eclipse.emf.ecore.resource.ResourceSet;

import com.google.inject.Inject;

import de.ubt.ai1.supermod.mm.client.LocalRepository;
import de.ubt.ai1.supermod.mm.core.ProductDimension;
import de.ubt.ai1.supermod.mm.core.ProductSpace;
import de.ubt.ai1.supermod.service.client.IProductDimensionExportPostProcessor;
import de.ubt.ai1.supermod.service.client.IProductSpaceExportPostProcessor;
import de.ubt.ai1.supermod.service.client.exceptions.SuperModClientException;
import de.ubt.ai1.supermod.service.file.File;

/**
 * Implementation of the product space export post-processor client service
 * interface specific to a product space which consists of only a versioned
 * file system. It invokes the corresponding {@link 
 * IProductDimensionExportPostProcessor} for the product dimension type {@link
 * de.ubt.ai1.supermod.service.file.File}.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	31.07.2014
 */
public class PurefileProductSpaceExportPostProcessor 
implements IProductSpaceExportPostProcessor {

	@Inject
	@File
	private IProductDimensionExportPostProcessor fileSystemPostProcessor;
	
	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.client.IProductSpaceExportPostProcessor
	 * #postProcess(de.ubt.ai1.supermod.mm.client.LocalRepository,
	 *  org.eclipse.emf.ecore.resource.ResourceSet, 
	 *  de.ubt.ai1.supermod.mm.core.ProductSpace, 
	 *  de.ubt.ai1.supermod.mm.core.ProductSpace, java.lang.String)
	 */
	@Override
	public void postProcess(LocalRepository repo, ResourceSet rs,
			ProductSpace oldPs, ProductSpace newPs, String psId)
			throws SuperModClientException {
		for (ProductDimension oldPd : oldPs.getDimensions()) {
			for (ProductDimension newPd : newPs.getDimensions()) {
				fileSystemPostProcessor.postProcess(
						repo, rs, oldPd, newPd, psId);
			}
		}
	}

}
