/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/

package de.ubt.ai1.supermod.service.file.impl;

import org.eclipse.emf.ecore.util.EcoreUtil.Copier;

import de.ubt.ai1.supermod.mm.core.ProductDimension;
import de.ubt.ai1.supermod.mm.file.VersionedFile;
import de.ubt.ai1.supermod.mm.file.VersionedFileContent;
import de.ubt.ai1.supermod.mm.file.VersionedFileSystem;
import de.ubt.ai1.supermod.mm.file.VersionedResource;
import de.ubt.ai1.supermod.service.IProductDimensionCloneService;

/**
 * An implementation of the product dimension clone service interface specific
 * to versioned file systems. It makes sure that all file contents are copied
 * additionally to the versioned file system tree.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	30.07.2014
 */
public class VersionedFileSystemCloneService 
implements IProductDimensionCloneService {

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.IProductDimensionCloneService
	 * #clone(de.ubt.ai1.supermod.mm.core.ProductDimension)
	 */
	@Override
	public VersionedFileSystem clone(ProductDimension original) {
		Copier copier = new Copier();
		VersionedFileSystem clone = (VersionedFileSystem) 
				copier.copy(original);
		for (VersionedResource vr : ((VersionedFileSystem) 
				original).getAllResources()) {
			if (vr instanceof VersionedFile) {
				VersionedFileContent copyContent = (VersionedFileContent)
						copier.copy(((VersionedFile) vr).getContent());
				((VersionedFile) copier.get(vr)).setContent(copyContent);
			}
		}
		copier.copyReferences();		
		return clone;
	}

}
