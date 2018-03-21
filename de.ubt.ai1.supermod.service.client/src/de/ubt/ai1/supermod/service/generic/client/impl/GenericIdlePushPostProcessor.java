/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.service.generic.client.impl;

import de.ubt.ai1.supermod.mm.client.LocalRepository;
import de.ubt.ai1.supermod.service.client.IPushPostProcessor;

/**
 * An implementation of the push post processor client service interface
 * that does not do anything. Suitable for local repositories.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	10.11.2015
 */
public class GenericIdlePushPostProcessor
implements IPushPostProcessor {

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.client.IPushPostProcessor
	 * #postProcess(de.ubt.ai1.supermod.mm.client.LocalRepository)
	 */
	@Override
	public void postProcess(LocalRepository repo, int newTid) {
		// nothing to do.
	}

}
