/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.service.generic.client.impl;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.google.inject.Inject;

import de.ubt.ai1.supermod.mm.core.Option;
import de.ubt.ai1.supermod.mm.core.OptionBinding;
import de.ubt.ai1.supermod.mm.core.OptionExpr;
import de.ubt.ai1.supermod.mm.core.ProductSpaceElement;
import de.ubt.ai1.supermod.mm.core.SuperModCoreFactory;
import de.ubt.ai1.supermod.mm.core.Tristate;
import de.ubt.ai1.supermod.mm.core.VersionSpace;
import de.ubt.ai1.supermod.mm.core.VisibilityEvaluationCache;
import de.ubt.ai1.supermod.mm.diff.WriteSet;
import de.ubt.ai1.supermod.service.client.IWriteSetAffectedElementsCalculator;
import de.ubt.ai1.supermod.service.client.IWriteSetAnalysisService;

/**
 * Generic implementation of the write set analysis service. It defines the
 * set of affected elements as the union of
 * <ul>
 * 	<li>containers of inserted elements,</li>
 *  <li>existing elements cross-referenced by inserted elements,</li>
 *  <li>deleted elements,</li>
 *  <li>containers of deleted elements,</li>
 *  <li>existing elements cross-referencing deleted elements.</li>
 * </ul>
 * and checks for each affected element <code>e</code>, whether its effective
 * visibility <code>v(e)</code> is implied by the associated ambition 
 * <code>a</code>. The write set is sufficiently general iff this is true for 
 * all affected elements visible in the choice <code>c</code>.
 * (<code>c => a => v</code>)
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	03.09.2014
 */
public class GenericWriteSetAnalysisService 
implements IWriteSetAnalysisService {

	@Inject
	private IWriteSetAffectedElementsCalculator affectedElementsCalculator;
	
	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.client.IWriteSetAnalysisService
	 * #isSufficientlyGeneral(de.ubt.ai1.supermod.mm.diff.WriteSet, 
	 * de.ubt.ai1.supermod.mm.core.OptionBinding, 
	 * de.ubt.ai1.supermod.mm.core.VersionSpace)
	 */
	@Override
	public OptionBinding isSufficientlyGeneral(WriteSet writeSet, 
			OptionBinding choice, VersionSpace vs) {
		choice = vs.applyAllCompletions(choice);
		OptionBinding ambition = vs.applyAllCompletions(writeSet.getAmbition());
		List<ProductSpaceElement> affectedElements = 
				affectedElementsCalculator.getAffectedElements(writeSet);
		List<ProductSpaceElement> nonRepChanges = 
				findNonRepresentativeChanges(choice, ambition, affectedElements);
		
		OptionBinding missingBindings = SuperModCoreFactory.eINSTANCE
				.createOptionBinding();
		for (ProductSpaceElement pse : nonRepChanges) {
			Set<Option> unboundOptions = getUnboundOptions(
					pse.getHierarchicalVisibility(), ambition);
			addMissingBindings(missingBindings, unboundOptions, choice);
		}
		return missingBindings;
	}

	/**
	 * Identifies the set of non-representative changes.
	 *
	 * @param choice
	 * @param ambition
	 * @param affectedElements
	 */
	protected List<ProductSpaceElement> findNonRepresentativeChanges(
			OptionBinding choice, OptionBinding ambition, 
			List<ProductSpaceElement> affectedElements) {
		VisibilityEvaluationCache choiceCache = SuperModCoreFactory.eINSTANCE
				.createVisibilityEvaluationCache();
		VisibilityEvaluationCache ambitionCache = SuperModCoreFactory.eINSTANCE
				.createVisibilityEvaluationCache();
		List<ProductSpaceElement> result = new ArrayList<>();
		for (ProductSpaceElement e : affectedElements) {
			if (e == null) continue;
			Tristate visible = e.isVisibleHierarchically(choice, choiceCache);
			Tristate representative = e.isVisibleHierarchically(ambition, 
					ambitionCache);
			if (visible == Tristate.TRUE && representative != Tristate.TRUE) {
				result.add(e);
			}
		}
		return result;
	}
	
	
	/**
	 * Returns all options referenced by a specific option expression,
	 * which do not occur in the specified option binding.
	 *
	 * @param expr
	 * @param ob
	 * @return
	 */
	protected Set<Option> getUnboundOptions(OptionExpr expr, OptionBinding ob) {
		Set<Option> unboundOptions = new HashSet<>();
		List<Option> options = expr.getReferencedOptions();
		for (Option o : options) {
			if (ob.getState(o) == null || ob.getState(o) == Tristate.UNKNOWN) {
				unboundOptions.add(o);
			}
		}
		return unboundOptions;
	}

	/**
	 * Adds bindings for a specified set of unbound options to the result,
	 * according to a specified binding source.
	 *
	 * @param result
	 * @param unboundOptions
	 * @param source
	 */
	protected void addMissingBindings(OptionBinding result, 
			Set<Option> unboundOptions, OptionBinding source) {
		for (Option o : unboundOptions) {
			Tristate t = source.getState(o);
			if (t == Tristate.TRUE || t == Tristate.FALSE) {
				result.bind(o, t);
			}
		}
	}

}
