/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/

package de.ubt.ai1.supermod.service.change.client.impl;

import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

import de.ubt.ai1.supermod.mm.change.ChangeDimension;
import de.ubt.ai1.supermod.mm.change.SuperModChangeFactory;
import de.ubt.ai1.supermod.mm.core.VersionDimension;
import de.ubt.ai1.supermod.service.client.IVersionDimensionInitializationService;
import de.ubt.ai1.supermod.service.client.exceptions.SuperModClientException;
import de.ubt.ai1.supermod.service.client.exceptions.SuperModClientWrappedException;

/**
 * An implementation of the version dimension initialization service specific
 * to the change dimension. It creates a resource where an empty revision
 * graph is stored: <code>.supermod/main/main.change</code>.
 * 
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	01.08.2014
 */
public class ChangeDimensionInitializationService
implements IVersionDimensionInitializationService {

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.client.
	 * IVersionDimensionInitializationService#initializeVersionDimension(
	 * org.eclipse.emf.ecore.resource.ResourceSet, java.lang.String)
	 */
	@Override
	public VersionDimension initializeVersionDimension(
			ResourceSet rs, String repoUri)
			throws SuperModClientException {
		URI changeDimUri = URI.createPlatformResourceURI(repoUri, true)
				.trimFileExtension().appendFileExtension("change");
		Resource changeDimRes = rs.createResource(changeDimUri);
		ChangeDimension changeDim = SuperModChangeFactory.eINSTANCE
				.createChangeDimension();
		changeDim.setDimensionName("change");
		changeDimRes.getContents().add(changeDim);
		try {
			changeDimRes.save(null);
		} catch (IOException e) {
			throw new SuperModClientWrappedException(e);
		}
		return changeDim;
	}

}
