/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.service.logical.pure.impl;

import de.ubt.ai1.supermod.mm.core.VersionSpace;
import de.ubt.ai1.supermod.mm.logical.LogicalDimension;
import de.ubt.ai1.supermod.service.logical.ILogicalDimensionProvider;

/**
 * Implementation of the logical dimension provider interface specific to a
 * purely logical version space.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	11.08.2014
 */
public class PureLogicalDimensionProvider implements ILogicalDimensionProvider {

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.logical.ILogicalDimensionProvider
	 * #getLogicalDimension(de.ubt.ai1.supermod.mm.core.VersionSpace)
	 */
	@Override
	public LogicalDimension getLogicalDimension(VersionSpace vs) {
		if (vs.getDimensions().size() > 0 && vs.getDimensions().get(0)
				instanceof LogicalDimension) {
			return (LogicalDimension) vs.getDimensions().get(0);
		}
		return null;
	}

}
