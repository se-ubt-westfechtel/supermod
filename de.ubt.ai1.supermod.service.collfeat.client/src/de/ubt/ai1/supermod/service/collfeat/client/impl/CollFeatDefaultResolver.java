/******************************************************************************
 * Copyright (c) 2018 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.service.collfeat.client.impl;


import de.ubt.ai1.supermod.mm.core.Option;
import de.ubt.ai1.supermod.mm.core.OptionExpr;
import de.ubt.ai1.supermod.mm.feature.Feature;
import de.ubt.ai1.supermod.service.collab.client.impl.CollabDefaultResolver;

/**
 * Custom default resolution provider for the collfeat dimension.
 * <p>
 * Supported strategies: '<em>Random</em>', '<em>Most Recent</em>', '<em>Least
 * Recent</em>', '<em>Mine</em>', '<em>Their</em>', '<em>Most Specific</em>',
 * '<em>Least Specific</em>'
 * 
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>,
 * 			Johannes Schroepfer <Johannes.M.Schroepfer(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	2018-01-09
 */
public class CollFeatDefaultResolver extends CollabDefaultResolver {
	
	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.collab.client.CollabDefaultResolver#getScore(
	 * de.ubt.ai1.supermod.mm.core.OptionExpr,
	 * de.ubt.ai1.supermod.service.client.IDefaultResolver.Strategy)
	 */
	@Override
	protected int getScore(OptionExpr visibility, Strategy strategy) {
		
		// For "Most Specific" and "Least Specific", the score is defined by
		// the number of options with optional features as high level concepts
		// without computing the score for each option.
		if (strategy == Strategy.MOST_SPECIFIC || strategy == Strategy.LEAST_SPECIFIC) {
			int score = 0;
			for (Option o : optionResolver.resolveOptions(visibility)) {
				if (o.getHighLevelConcept() instanceof Feature &&
						((Feature) o.getHighLevelConcept()).getMandatory() == null)
					++score;
			}
			if (strategy == Strategy.LEAST_SPECIFIC)
				score = Integer.MAX_VALUE - score;
			return score;
		}
		
		// For all other resolution strategies, the computation is delegated to
		// the superclass.
		return super.getScore(visibility, strategy);
	}
}
