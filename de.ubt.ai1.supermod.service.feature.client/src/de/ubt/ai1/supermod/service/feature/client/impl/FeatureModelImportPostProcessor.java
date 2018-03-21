/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.service.feature.client.impl;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

import de.ubt.ai1.supermod.mm.client.LocalRepository;
import de.ubt.ai1.supermod.mm.core.ProductDimension;
import de.ubt.ai1.supermod.service.client.IProductDimensionImportPostProcessor;
import de.ubt.ai1.supermod.service.client.exceptions.SuperModClientException;

/**
 * Implementation of the file system import post processor interface which
 * ensures that after importing a feature model, an EMF resource is allocated
 * for it.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	04.03.2015
 */
public class FeatureModelImportPostProcessor 
implements IProductDimensionImportPostProcessor {

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.client.
	 * IProductDimensionImportPostProcessor#postProcess(
	 * de.ubt.ai1.supermod.mm.client.LocalRepository, 
	 * org.eclipse.emf.ecore.resource.ResourceSet, 
	 * de.ubt.ai1.supermod.mm.core.ProductDimension, 
	 * de.ubt.ai1.supermod.mm.core.ProductDimension)
	 */
	@Override
	public void postProcess(LocalRepository repo, ResourceSet rs,
			ProductDimension oldPd, ProductDimension newPd)
			throws SuperModClientException {
		Resource featureModelRes = oldPd.eResource();
		if (featureModelRes != null) {
			featureModelRes.getContents().clear();
			featureModelRes.getContents().add(newPd);
		}
	}

}
