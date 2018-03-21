/******************************************************************************
 * Copyright (c) 2018 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.service.generic.client.impl;


import org.eclipse.core.resources.IProject;
import org.eclipse.emf.common.util.EList;

import de.ubt.ai1.supermod.mm.core.ProductSpaceElement;
import de.ubt.ai1.supermod.service.client.IDefaultResolver;

/**
 * A trivial implementation of the default resolution service interface that
 * always chooses the first item of the list of candidates.
 * <p>
 * Supported strategies: '<em>Random</em>'
 * 
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>,
 * 			Johannes Schroepfer <Johannes.M.Schroepfer(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	2018-01-28
 */
public class PseudoRandomDefaultResolver implements IDefaultResolver {

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.client.IDefaultResolver#selectCandidate(
	 * org.eclipse.emf.common.util.EList)
	 */
	@Override
	public <E extends ProductSpaceElement> E selectCandidate(
			EList<? extends E> candidates, String conflict, IProject project) {
		
		if (candidates.isEmpty()) {
			return null;
		}
		return candidates.get(0);
	}
}
