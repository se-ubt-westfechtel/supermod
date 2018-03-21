/******************************************************************************
 * Copyright (c) 2018 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.service.revision.client.impl;


import de.ubt.ai1.supermod.mm.core.Option;
import de.ubt.ai1.supermod.mm.revision.Revision;
import de.ubt.ai1.supermod.service.generic.client.impl.AbstractScoreBasedDefaultResolver;

/**
 * Custom default resolution provider for the revision dimension.
 * <p>
 * Supported strategies: '<em>Random</em>', '<em>Most Recent</em>', '<em>Least
 * Recent</em>'
 * 
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>,
 * 			Johannes Schroepfer <Johannes.M.Schroepfer(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	2018-01-09
 */
public class RevisionDefaultResolver extends AbstractScoreBasedDefaultResolver {
	
	/*
	 * (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.client.impl.AbstractScoreBasedDefaultResolver#getScore(
	 * de.ubt.ai1.supermod.mm.core.Option,
	 * de.ubt.ai1.supermod.service.client.IDefaultResolver.Strategy)
	 */
	@Override
	protected int getScore(Option option, Strategy strategy) {
		
		if (option.getHighLevelConcept() instanceof Revision) {
			Revision r = (Revision) option.getHighLevelConcept();
			switch (strategy) {
				case MOST_RECENT:				
					return r.getRevisionNumber();
				case LEAST_RECENT:
					return Integer.MAX_VALUE - r.getRevisionNumber();
				default:
					return -1;
			}
		}
		return -1;
	}
}
