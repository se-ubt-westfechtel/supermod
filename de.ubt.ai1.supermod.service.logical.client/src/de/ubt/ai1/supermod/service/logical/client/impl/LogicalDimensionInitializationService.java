/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/

package de.ubt.ai1.supermod.service.logical.client.impl;

import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

import de.ubt.ai1.supermod.mm.core.VersionDimension;
import de.ubt.ai1.supermod.mm.logical.LogicalDimension;
import de.ubt.ai1.supermod.mm.logical.SuperModLogicalFactory;
import de.ubt.ai1.supermod.service.client.IVersionDimensionInitializationService;
import de.ubt.ai1.supermod.service.client.exceptions.SuperModClientException;
import de.ubt.ai1.supermod.service.client.exceptions.SuperModClientWrappedException;

/**
 * An implementation of the version dimension initialization service specific
 * to the low-level logical version dimension. It creates an Xtext resource
 * for the textually represented logical version dimension in the file
 * <code>.supermod/main/main.logical</code>.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	01.08.2014
 */
public class LogicalDimensionInitializationService 
implements IVersionDimensionInitializationService {

	@Override
	public VersionDimension initializeVersionDimension(ResourceSet rs, 
			String repoUri) throws SuperModClientException {
		URI logDimUri = URI.createPlatformResourceURI(repoUri, true)
				.trimFileExtension().appendFileExtension("logical");
		Resource logDimRes = rs.createResource(logDimUri);
		LogicalDimension logDim = SuperModLogicalFactory.eINSTANCE
				.createLogicalDimension();
		logDim.setDimensionName("log");
		logDimRes.getContents().add(logDim);
		try {
			logDimRes.save(null);
		} catch (IOException e) {
			throw new SuperModClientWrappedException(e);
		}
		return logDim;
	}

}
