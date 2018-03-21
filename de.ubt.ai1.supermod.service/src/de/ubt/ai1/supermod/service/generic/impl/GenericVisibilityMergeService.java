/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/

package de.ubt.ai1.supermod.service.generic.impl;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.ecore.util.EcoreUtil;

import de.ubt.ai1.supermod.mm.core.BigExpr;
import de.ubt.ai1.supermod.mm.core.BinaryExpr;
import de.ubt.ai1.supermod.mm.core.MergeExpr;
import de.ubt.ai1.supermod.mm.core.NegExpr;
import de.ubt.ai1.supermod.mm.core.OptionExpr;
import de.ubt.ai1.supermod.mm.core.ProductSpaceElement;
import de.ubt.ai1.supermod.mm.core.SuperModCoreFactory;
import de.ubt.ai1.supermod.mm.core.Visibility;
import de.ubt.ai1.supermod.mm.core.VisibilityForest;
import de.ubt.ai1.supermod.mm.core.VisibilityRef;
import de.ubt.ai1.supermod.mm.core.util.SuperModCoreSwitch;
import de.ubt.ai1.supermod.service.IVisibilityMergeService;

/**
 * An implementation of the visibility merge service interface which combines
 * the specified elements' visibilities by means of a 'merge' expression.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	29.07.2014
 */
public class GenericVisibilityMergeService 
implements IVisibilityMergeService {
	
	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.IVisibilityMergeService#mergeVisibility
	 * (java.util.Collection, de.ubt.ai1.supermod.mm.core.VisibilityForest)
	 */
	@Override
	public OptionExpr mergeVisibility(
			Collection<? extends ProductSpaceElement> elements, 
			VisibilityForest forest) {
		OptionExpr expr = null;
		boolean composite = false;
		for (ProductSpaceElement ve : elements) {
			if (ve.getVisibility() != null) {
				OptionExpr veExpr = ve.getVisibility();
				if (expr == null) {
					expr = veExpr;
				}
				else {
					OptionExpr right = null;
					// re-use existing visibilities by a non-containment
					// option expression reference if possible. Otherwise, copy.
					if (veExpr.eContainer() instanceof Visibility) {
						VisibilityRef ref = SuperModCoreFactory
								.eINSTANCE.createVisibilityRef();
						ref.setVisibility((Visibility) veExpr.eContainer());
						right = ref;
					}
					else {
						right = EcoreUtil.copy(veExpr);
					}
					MergeExpr merge = SuperModCoreFactory.eINSTANCE.createMergeExpr();
					merge.setLeft(expr);
					merge.setRight(right);
					Visibility baseVis = getBaseVisibility(expr, right);
					if (baseVis != null) {
						VisibilityRef ref = SuperModCoreFactory
								.eINSTANCE.createVisibilityRef();
						ref.setVisibility(baseVis);
						merge.setBaseExpr(ref);
					}
					expr = merge;
					composite = true;
				}
			}
		}
		if (composite) {
			// in case a new composite visibility has been created, add it
			// to the visibility forest.
			forest.add(expr);
		}
		return expr;
	}

	/**
	 * @param expr1
	 * @param expr2
	 * @return a common visibility that both expr1 and expr2 refer to
	 */
	private Visibility getBaseVisibility(OptionExpr expr1, OptionExpr expr2) {
		while (expr1 instanceof VisibilityRef) {
			expr1 = ((VisibilityRef) expr2).getVisibility().getExpr();
		}
		while (expr2 instanceof VisibilityRef) {
			expr2 = ((VisibilityRef) expr2).getVisibility().getExpr();
		}
		if (expr1 == expr2) {
			if (expr1.eContainer() instanceof Visibility) {
				return (Visibility) expr1.eContainer();
			}
		}
		for (OptionExpr subExpr1 : getSubExprs(expr1)) {
			Visibility base = getBaseVisibility(expr2, subExpr1);
			if (base != null) {
				return base;
			}
		}
		for (OptionExpr subExpr2 : getSubExprs(expr2)) {
			Visibility base = getBaseVisibility(subExpr2, expr1);
			if (base != null) {
				return base;
			}
		}
		return null;
	}

	/**
	 * @param expr2
	 * @return all expressions referred to by expr.
	 */
	private Set<OptionExpr> getSubExprs(OptionExpr expr) {
		Set<OptionExpr> result = new HashSet<OptionExpr>();
		new SuperModCoreSwitch<Void>() {
			public Void caseBinaryExpr(BinaryExpr object) {
				result.add(object.getLeft());
				result.add(object.getRight());
				return (Void)null; 
			}
			public Void caseBigExpr(BigExpr object) {
				result.addAll(object.getChildren());
				return (Void)null; 
			}
			public Void caseNegExpr(NegExpr object) {
				result.add(object.getNeg());
				return (Void)null; 
			}
			public Void caseVisibilityRef(VisibilityRef object) {
				result.add(object.getVisibility().getExpr());
				return (Void)null; 
			}
		}.doSwitch(expr);
		return result;
	}

}
