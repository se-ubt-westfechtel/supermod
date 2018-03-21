/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.service.revision.pure.impl;

import de.ubt.ai1.supermod.mm.core.VersionSpace;
import de.ubt.ai1.supermod.service.IVersionSpaceReconciliationService;

/**
 * Implementation of the version space reconciliation service which is specific
 * to a version space consisting of only a revision dimension. This rule base
 * need not be mapped because low-level concepts are directly created at commit
 * time in a consistent way.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	28.10.2014
 */
public class PureRevVersionSpaceReconciliationService 
implements IVersionSpaceReconciliationService {

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.client.
	 * IVersionSpaceReconciliationService#reconcileVersionSpace(
	 * de.ubt.ai1.supermod.mm.core.VersionSpace)
	 */
	@Override
	public void reconcileVersionSpace(VersionSpace vs) {
		// nothing to do.
	}

}
