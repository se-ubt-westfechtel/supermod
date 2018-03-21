/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.service.collab.pure.impl;

import de.ubt.ai1.supermod.mm.collab.CollaborativeRevisionDimension;
import de.ubt.ai1.supermod.mm.core.VersionSpace;
import de.ubt.ai1.supermod.service.collab.ICollabDimensionProvider;

/**
 * Implementation of the revision dimension provider interface specific to a
 * purely collaborative revision version space.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	23.10.2015
 */
public class PureCollabDimensionProvider implements ICollabDimensionProvider {

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.collab.ICollabDimensionProvider
	 * #getCollabDimension(de.ubt.ai1.supermod.mm.core.VersionSpace)
	 */
	@Override
	public CollaborativeRevisionDimension getCollabDimension(VersionSpace vs) {
		if (vs.getDimensions().size() > 0 && vs.getDimensions().get(0)
				instanceof CollaborativeRevisionDimension) {
			return (CollaborativeRevisionDimension) vs.getDimensions().get(0);
		}
		return null;
	}

}
