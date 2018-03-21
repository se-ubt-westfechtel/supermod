/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/

package de.ubt.ai1.supermod.service.generic.impl;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.util.EcoreUtil;

import com.google.inject.Inject;

import de.ubt.ai1.supermod.mm.core.AndExpr;
import de.ubt.ai1.supermod.mm.core.NegExpr;
import de.ubt.ai1.supermod.mm.core.OptionExpr;
import de.ubt.ai1.supermod.mm.core.OrExpr;
import de.ubt.ai1.supermod.mm.core.ProductSpaceElement;
import de.ubt.ai1.supermod.mm.core.SuperModCoreFactory;
import de.ubt.ai1.supermod.mm.core.Visibility;
import de.ubt.ai1.supermod.mm.core.VisibilityForest;
import de.ubt.ai1.supermod.mm.core.VisibilityRef;
import de.ubt.ai1.supermod.mm.diff.ProductSpaceElementDelta;
import de.ubt.ai1.supermod.mm.diff.WriteSet;
import de.ubt.ai1.supermod.service.IElementDeletionService;
import de.ubt.ai1.supermod.service.IVisibilityUpdateService;

/**
 * An implementation of the visibility update service interface. It updates
 * visibilities of inserted or deleted elements as follows:
 * <ul>
 * 	<li> <em>insertions:</em> the current visibility of the element is
 * 			connected to the ambition using an <em>or</em>-disjunction. </li>
 *  <li> <em>deletions:</em> the current visibility of the element is connected
 *  		to the <em>negation</em> of the specified ambition using an 
 *  		<em>and</em>-conjunction. </li>.
 * </ul>
 * Rather than connecting the existing visibilities to new visibilities by
 * containment, corresponding option expression references are established.
 * This implementation ensures that no equivalent copies of the same expression
 * are created. Rather, once after a new visibility has been constructed using
 * the rules above, it is cached, and re-used in case an equivalent visibility
 * would be created.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	31.07.2014
 */
public class GenericCachedVisibilityUpdateService 
implements IVisibilityUpdateService {
	
	@Inject
	private IElementDeletionService deletionService;
	
	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.IVisibilityUpdateService
	 * #updateVisibilities(de.ubt.ai1.supermod.mm.diff.WriteSet, 
	 * de.ubt.ai1.supermod.mm.core.VisibilityForest)
	 */
	@Override
	public void updateVisibilities(WriteSet writeSet, VisibilityForest forest,
			int transactionId) {
		// create an option expression which corresponds to the options bound
		// in the specified ambition.
		OptionExpr ambitionExpr = writeSet.getAmbition().toVisibility();
		if (ambitionExpr != null) {
			// process inserted elements using a cache for the combination of
			// existing visibilities with the ambition.
			Visibility ambitionVis = forest.add(ambitionExpr);
			ambitionVis.setTransactionId(transactionId);
			Map<Visibility, Visibility> insCache = new HashMap<>();
			for (ProductSpaceElementDelta insDelta : 
					writeSet.getInsertedElements()) {
				for (ProductSpaceElement insElement : 
						insDelta.getRootElements()) {
					insElement.setVisibility(createInsertedVis(
							getVisibility(insElement, forest), ambitionVis, 
							forest, insCache).getExpr());
				}
			}
			// process inserted elements using a cache for the combination of
			// existing visibilities with the negated ambition.
			OptionExpr negAmbitionExpr = createNegatedAmbitionVis(ambitionVis);
			Visibility negAmbitionVis = forest.add(negAmbitionExpr);
			negAmbitionVis.setTransactionId(transactionId);
			Map<Visibility, Visibility> delCache = new HashMap<>();
			for (ProductSpaceElementDelta delDelta : 
					writeSet.getDeletedElements()) {
				for (ProductSpaceElement delElement : 
						delDelta.getRootElements()) {
					delElement.setVisibility(createDeletedVis(
							getVisibility(delElement, forest), negAmbitionVis, 
							forest, delCache).getExpr());
				}
			}
		}
		else {
			// in case the visibility of an element would effectively be false,
			// delete the element from the product space.
			for (ProductSpaceElementDelta delDelta : 
					writeSet.getDeletedElements()) {
				for (ProductSpaceElement delElement : 
						delDelta.getRootElements()) {
					deletionService.delete(delElement);
				}
			}
		}
	}

	/**
	 * Returns the visibility object which contains the specified element's
	 * visibility expression.
	 *
	 * @param el
	 * @param vf
	 * @return
	 */
	private Visibility getVisibility(ProductSpaceElement el, 
			VisibilityForest vf) {
		if (el.getVisibility() == null) return null;
		if (el.getVisibility().eContainer() instanceof Visibility) {
			return (Visibility) el.getVisibility().eContainer();
		}
		else {
			return vf.add(EcoreUtil.copy(el.getVisibility()));
		}
	}

	/**
	 * Creates and returns the negative form of the specified ambition 
	 * visibility.
	 *
	 * @param ambitionVis
	 * @return negated form of <code>ambitionVis</code>.
	 */
	private OptionExpr createNegatedAmbitionVis(Visibility ambitionVis) {
		VisibilityRef ambitionRef = SuperModCoreFactory.eINSTANCE
				.createVisibilityRef();
		ambitionRef.setVisibility(ambitionVis);
		NegExpr negatedAmbitionVis = SuperModCoreFactory.eINSTANCE
				.createNegExpr();
		negatedAmbitionVis.setNeg(ambitionRef);
		return negatedAmbitionVis;		
	}

	/**
	 * Creates a visibility that corresponds to an <em>or</em>-disjunction of
	 * the old visibility of an element with the visibility that represents
	 * the ambition.
	 *
	 * @param oldVis
	 * @param ambitionVis
	 * @param forest
	 * @param cache avoids the repeated creation of equivalent inserted 
	 * 			visibilities.
	 * @return an option expression representing the visibility after insertion.
	 */
	private Visibility createInsertedVis(Visibility oldVis, 
			Visibility ambitionVis, VisibilityForest forest, 
			Map<Visibility, Visibility> cache) {
		if (!cache.containsKey(oldVis)) {
			if (oldVis == null) {
				return ambitionVis;
			}
			else {
				OrExpr orExpr = SuperModCoreFactory.eINSTANCE
						.createOrExpr();
				VisibilityRef left = SuperModCoreFactory.eINSTANCE
						.createVisibilityRef();
				left.setVisibility(oldVis);
				orExpr.setLeft(left);
				VisibilityRef right = SuperModCoreFactory.eINSTANCE
						.createVisibilityRef();
				right.setVisibility(ambitionVis);
				orExpr.setRight(right);
				Visibility orVis = forest.add(orExpr);
				cache.put(oldVis, orVis);
				return orVis;
			}
		}
		return cache.get(oldVis);
	}	

	/**
	 * Creates a visibility that corresponds to an <em>and</em>-conjunction of
	 * the old visibility of an element with the visibility that represents
	 * the <em>negated</em> ambition.
	 *
	 * @param oldVis
	 * @param negAmbitionVis
	 * @param forest 
	 * @param cache avoids the repeated creation of equivalent inserted 
	 * 			visibilities.
	 * @return an option expression representing the visibility after deletion.
	 */
	private Visibility createDeletedVis(Visibility oldVis, 
			Visibility negAmbitionVis, VisibilityForest forest,
			Map<Visibility, Visibility> cache) {
		if (!cache.containsKey(oldVis)) {
			if (oldVis == null) {
				return negAmbitionVis;
			}
			else {
				AndExpr andNotExpr = SuperModCoreFactory.eINSTANCE
						.createAndExpr();
				VisibilityRef left = SuperModCoreFactory.eINSTANCE
						.createVisibilityRef();
				left.setVisibility(oldVis);
				andNotExpr.setLeft(left);
				VisibilityRef right = SuperModCoreFactory.eINSTANCE
						.createVisibilityRef();
				right.setVisibility(negAmbitionVis);
				andNotExpr.setRight(right);
				Visibility andNotVis = forest.add(andNotExpr);
				cache.put(oldVis, andNotVis);
				return andNotVis;
			}
		}
		return cache.get(oldVis);
	}

}
