/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.service.revision.pure.impl;

import de.ubt.ai1.supermod.mm.core.VersionSpace;
import de.ubt.ai1.supermod.mm.revision.RevisionDimension;
import de.ubt.ai1.supermod.service.revision.IRevisionDimensionProvider;

/**
 * Implementation of the revision dimension provider interface specific to a
 * purely revision version space.
 * 
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	11.08.2014
 */
public class PureRevisionDimensionProvider 
implements IRevisionDimensionProvider {

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.revision.IRevisionDimensionProvider
	 * #getRevisionDimension(de.ubt.ai1.supermod.mm.core.VersionSpace)
	 */
	@Override
	public RevisionDimension getRevisionDimension(VersionSpace vs) {
		if (vs.getDimensions().size() > 0 && vs.getDimensions().get(0)
				instanceof RevisionDimension) {
			return (RevisionDimension) vs.getDimensions().get(0);
		}
		return null;
	}

}
