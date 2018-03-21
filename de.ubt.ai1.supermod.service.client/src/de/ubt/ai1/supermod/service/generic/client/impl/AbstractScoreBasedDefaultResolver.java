/******************************************************************************
 * Copyright (c) 2018 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.service.generic.client.impl;


import static de.ubt.ai1.supermod.service.generic.client.impl.DefaultResolutionPreferenceUtil.DEFAULTRES__CYCLIC_CONTAINMENT;
import static de.ubt.ai1.supermod.service.generic.client.impl.DefaultResolutionPreferenceUtil.DEFAULTRES__CYCLIC_FEATURE_TREE;

import org.eclipse.core.resources.IProject;
import org.eclipse.emf.common.util.EList;

import com.google.inject.Inject;

import de.ubt.ai1.supermod.mm.core.Option;
import de.ubt.ai1.supermod.mm.core.OptionExpr;
import de.ubt.ai1.supermod.mm.core.ProductSpaceElement;
import de.ubt.ai1.supermod.service.IOptionResolver;
import de.ubt.ai1.supermod.service.client.IDefaultResolver;

/**
 * A partial implementation of the default resolution service interface for
 * score-based implementations (collab and revision dimensions and their
 * subdimensions).
 * <p>
 * Subclasses must implement the <code>getScore(Option, Strategy)</code> method
 * to define the computation of the score for a specific option.
 * 
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>,
 * 			Johannes Schroepfer <Johannes.M.Schroepfer(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	2018-01-28
 */
public abstract class AbstractScoreBasedDefaultResolver
implements IDefaultResolver {
	
	@Inject
	public IOptionResolver optionResolver;
	
	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.client.IDefaultResolver#selectCandidate(
	 * org.eclipse.emf.common.util.EList)
	 */
	@Override
	public <E extends ProductSpaceElement> E selectCandidate(
			EList<? extends E> candidates, String conflict, IProject project) {
		
		if (candidates.isEmpty())
			return null;
		
		if (candidates.size() == 1)
			return candidates.get(0);
		
		Strategy strategy = DefaultResolutionPreferenceUtil.getPreferredStrategy(
				conflict, project);
		if (conflict.equals(DEFAULTRES__CYCLIC_CONTAINMENT) ||
				conflict.equals(DEFAULTRES__CYCLIC_FEATURE_TREE))
			strategy = invert(strategy);
		
		int maxScore = -1;
		E winner = null;
		for (E candidate : candidates) {
			OptionExpr visibility =
					(strategy == Strategy.MOST_SPECIFIC || strategy == Strategy.LEAST_SPECIFIC) ?
								candidate.getHierarchicalVisibility() : candidate.getSuperordinateVisibility();
			if (visibility != null) {
				int score = getScore(visibility, strategy);
				if (winner == null || score > maxScore) {
					maxScore = score;
					winner = candidate;
				}
			}
		}
		return winner;
	}
	
	/**
	 * Inverts the resolution strategy and returns the respectively inverted
	 * strategy (used for deselection).
	 * 
	 * @param strategy
	 * @return the inverted strategy
	 */
	private Strategy invert(Strategy strategy) {
		
		switch (strategy) {
			case MOST_RECENT:		return Strategy.LEAST_RECENT;
			case LEAST_RECENT:		return Strategy.MOST_RECENT;
			case MINE:				return Strategy.THEIR;
			case THEIR:				return Strategy.MINE;
			case MOST_SPECIFIC:		return Strategy.LEAST_SPECIFIC;
			case LEAST_SPECIFIC:	return Strategy.MOST_SPECIFIC;
			default:				return Strategy.RANDOM;
		}
	}
	
	/**
	 * Calculates a score for an individual visibility.
	 * 
	 * @param candidate
	 * @return the aggregate score
	 */
	protected int getScore(OptionExpr visibility, Strategy strategy) {
		
		// For all resolution strategies, the score is computed for each option
		// independently and the maximum score among the options is returned.
		int maxScore = -1;
		for (Option o : optionResolver.resolveOptions(visibility)) {
			int score = getScore(o, strategy);
			if (score > maxScore)
				maxScore = score;
		}
		return maxScore;
	}
	
	/**
	 * Determines the score of a given option based on a defined selection strategy.
	 * 
	 * @param option
	 * @param strategy
	 * @return the score
	 */
	protected abstract int getScore(Option option, Strategy strategy);
}
