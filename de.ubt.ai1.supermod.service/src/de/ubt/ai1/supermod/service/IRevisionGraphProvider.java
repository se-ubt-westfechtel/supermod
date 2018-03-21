/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.service;

import de.ubt.ai1.supermod.mm.core.VersionDimension;
import de.ubt.ai1.supermod.mm.core.VersionSpace;

/**
 * Service interface for obtaining the dedicated revision graph dimension
 * from a version space, if any.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	10.05.2016
 */
public interface IRevisionGraphProvider {

	/**
	 * To be implemented to return the revision graph.
	 *
	 * @param vs
	 * @return the revision graph dimension
	 */
	public VersionDimension getRevisionGraph(VersionSpace vs);

}
