/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.service.collab.impl;

import com.google.inject.Inject;

import de.ubt.ai1.supermod.mm.core.VersionDimension;
import de.ubt.ai1.supermod.mm.core.VersionSpace;
import de.ubt.ai1.supermod.service.IRevisionGraphProvider;
import de.ubt.ai1.supermod.service.collab.ICollabDimensionProvider;

/**
 * Provider for the collaborative revision graph.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	10.05.2016
 */
public class CollabRevisionGraphProvider implements IRevisionGraphProvider {
	
	@Inject
	private ICollabDimensionProvider collDimProvider;

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.IRevisionGraphProvider
	 * #getRevisionGraph(de.ubt.ai1.supermod.mm.core.VersionSpace)
	 */
	@Override
	public VersionDimension getRevisionGraph(VersionSpace vs) {
		return collDimProvider.getCollabDimension(vs);
	}

}
