/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.service.file.pure.impl;

import de.ubt.ai1.supermod.mm.core.ProductSpace;
import de.ubt.ai1.supermod.mm.file.VersionedFileSystem;
import de.ubt.ai1.supermod.service.file.IVersionedFileSystemProvider;

/**
 * Implementation of the versioned file system provider interface specific to
 * the "pure file" version space.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	11.08.2014
 */
public class PurefileVersionedFileSystemProvider 
implements IVersionedFileSystemProvider {

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.file.IVersionedFileSystemProvider
	 * #getRevisionDimension(de.ubt.ai1.supermod.mm.core.ProductSpace)
	 */
	@Override
	public VersionedFileSystem getVersionedFileSystem(ProductSpace ps) {
		if (ps.getDimensions().size() > 0 && ps.getDimensions().get(0)
				instanceof VersionedFileSystem) {
			return (VersionedFileSystem) ps.getDimensions().get(0);
		}
		return null;
	}

}
