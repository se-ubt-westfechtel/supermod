/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.mm.change.util;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.eclipse.emf.ecore.util.EcoreUtil;

import de.ubt.ai1.supermod.mm.change.Change;
import de.ubt.ai1.supermod.mm.core.BigExpr;
import de.ubt.ai1.supermod.mm.core.BinaryExpr;
import de.ubt.ai1.supermod.mm.core.MergeExpr;
import de.ubt.ai1.supermod.mm.core.NegExpr;
import de.ubt.ai1.supermod.mm.core.Option;
import de.ubt.ai1.supermod.mm.core.OptionBinding;
import de.ubt.ai1.supermod.mm.core.OptionExpr;
import de.ubt.ai1.supermod.mm.core.OptionRef;
import de.ubt.ai1.supermod.mm.core.SuperModCoreFactory;
import de.ubt.ai1.supermod.mm.core.Tristate;
import de.ubt.ai1.supermod.mm.core.VersionDimension;
import de.ubt.ai1.supermod.mm.core.VersionSpaceElement;
import de.ubt.ai1.supermod.mm.core.VisibilityRef;
import de.ubt.ai1.supermod.mm.core.util.SuperModCoreSwitch;
import de.ubt.ai1.supermod.mm.core.util.TristateUtil;

/**
 * This utility class provides a set of methods which are frequently used when
 * converting elements of the change space to elements of the revision or
 * logical space (or a mixture thereof) from which changes abstract.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	05.12.2014
 */
public class ChangeSpaceUtil {
	
	/**
	 * Returns a collection of options indirectly referenced through the specified change
	 * option. The method operates in a transitive fashion.
	 *
	 * @param o
	 * @return a list of all indirectly referenced non-change options.
	 */
	public static Collection<Option> expandOption(Option o) {
		Set<Option> result = new LinkedHashSet<Option>();		
		if (o.getHighLevelConcept() instanceof Change) {
			Change c = (Change) o.getHighLevelConcept();
			OptionExpr ambExpr = c.getUserAmbitionExpr();
			for (Option oc : ambExpr.getReferencedOptions()) {
				result.addAll(expandOption(oc));
			}
		}
		else if (o != null) {
			result.add(o);
		}
		return result;
	}
	
	/**
	 * Expands an option expression which consists of change options by
	 * replacing change options by their corresponding user ambitions.
	 *
	 * @param expr the expression to expand
	 * @return the expanded expression, which should not contain any change
	 * 			options.
	 */
	public static OptionExpr expandExpression(OptionExpr expr) {
		return new SuperModCoreSwitch<OptionExpr>() {
			public OptionExpr caseOptionRef(OptionRef expr) {
				Option o = expr.getOption();
				if (o != null && o.getHighLevelConcept() instanceof Change) {
					Change c = (Change) o.getHighLevelConcept();
					OptionExpr ambExpr = c.getUserAmbitionExpr();
					return EcoreUtil.copy(ambExpr);
				}
				else {
					return EcoreUtil.copy(expr);
				}
			}
			public OptionExpr caseMergeExpr(MergeExpr value) {
				MergeExpr result = (MergeExpr) caseBinaryExpr(value);
				if (value.getBaseExpr() != null) {
					result.setBaseExpr(expandExpression(value.getBaseExpr()));
				}
				return result;
			}
			public OptionExpr caseBinaryExpr(BinaryExpr expr) {
				BinaryExpr result = (BinaryExpr) 
						SuperModCoreFactory.eINSTANCE.create(expr.eClass());
				result.setLeft(expandExpression(expr.getLeft()));
				result.setRight(expandExpression(expr.getRight()));
				return result;
			}
			public OptionExpr caseNegExpr(NegExpr expr) {
				NegExpr result = SuperModCoreFactory.eINSTANCE.createNegExpr();
				result.setNeg(expandExpression(expr.getNeg()));
				return result;
			}
			public OptionExpr caseBigExpr(BigExpr expr) {
				BigExpr result = (BigExpr)
						SuperModCoreFactory.eINSTANCE.create(expr.eClass());
				for (OptionExpr child : expr.getChildren()) {
					result.getChildren().add(expandExpression(child));
				}
				return result;
			}
			public OptionExpr caseVisibilityRef(VisibilityRef expr) {
				if (expr != null && expr.getVisibility() != null 
						&& expr.getVisibility().getExpr() != null) {
					return expandExpression(expr.getVisibility().getExpr());
				}
				else return null;
			}
		}.doSwitch(expr);
	}
	
	/**
	 * Expands an option binding which consists of change option into a map of
	 * distinct option bindings, one for each dimension from which the change
	 * space abstracts. The bindings are set according to the ambition which has
	 * been specified for the corresponding change option.
	 *
	 * @param ob an option binding consisting of change options
	 * @return a map that maps from the abstracted version dimension to a
	 * 			respective binding that has been inferred.
	 */
	public static Map<VersionDimension, OptionBinding> expandBinding(
			OptionBinding ob) {
		Map<VersionDimension, OptionBinding> result = new HashMap<>();
		for (Entry<Option, Tristate> e : ob.getBoundOptions().entrySet()) {
			if (e.getValue() == Tristate.TRUE || e.getValue() == Tristate.FALSE) {
				Option o = e.getKey();
				VersionSpaceElement vse = o.getHighLevelConcept();
				if (vse instanceof Change) {
					Change c = (Change) vse;
					OptionBinding ambBinding = c.getUserAmbitionBinding();
					for (Entry<Option, Tristate> ambE : 
						ambBinding.getBoundOptions().entrySet()) {
						Option ambO = ambE.getKey();
						Tristate state = TristateUtil.biconditionallyImplies(
								e.getValue(), ambE.getValue());
						VersionDimension dim = ambO.getDimension();
						if (result.get(dim) == null) {
							result.put(dim, SuperModCoreFactory.eINSTANCE
									.createOptionBinding());
						}
						if (result.get(dim).getBoundOptions().containsKey(ambO)) {
							Tristate previousState = result.get(dim).getState(ambO);
							state = TristateUtil.biconditionallyImplies(
									previousState, state);
						}
						result.get(dim).bind(ambO, state);
					}					
				}
				else {
					VersionDimension dim = vse.getVersionDimension();
					if (result.get(dim) == null) {
						result.put(dim, SuperModCoreFactory.eINSTANCE
								.createOptionBinding());
					}
					result.get(dim).bind(o, e.getValue());
				}
			}
		}
		return result;
	}
	
	/**
	 * Filters a given option binding by options belonging to a specified
	 * version dimension. It is assumed that the binding is complete with
	 * respect to all versioning dimensions.
	 *
	 * @param ob an option binding to filter
	 * @param dim the dimension to which all resulting bindings will refer.
	 * @return an option binding consisting of options defined in
	 * 			<code>dim</code> only.
	 */
	public static OptionBinding filterBinding(OptionBinding ob, 
			VersionDimension dim) {
		if (ob == null || dim == null) return null;
		OptionBinding filteredOb = SuperModCoreFactory.eINSTANCE
				.createOptionBinding();
		for (Entry<Option, Tristate> e : ob.getBoundOptions()) {
			if (e.getKey() != null && e.getKey().getDimension() != null &&
					e.getKey().getDimension().equals(dim)
					&& e.getValue() != null 
					&& e.getValue() != Tristate.UNKNOWN) {
				filteredOb.bind(e.getKey(), e.getValue());
			}
		}
		return filteredOb;
	}
	
	/**
	 * The inverse operation to filterBinding. Creates a copy of the specified
	 * option binding, where all bindings not referring to a specified dimension
	 * are removed.
	 *
	 * @param ob an option binding to filter
	 * @param dim the dimension to which none of the resulting bindings will
	 * 			refer.
	 * @return an option binding containing all options of <code>ob</code>,
	 * 			except for options defined in <code>dim</code>.
	 */
	public static OptionBinding rejectBinding(OptionBinding ob, 
			VersionDimension dim) {
		if (ob == null || dim == null) return null;
		OptionBinding filteredOb = SuperModCoreFactory.eINSTANCE
				.createOptionBinding();
		for (Entry<Option, Tristate> e : ob.getBoundOptions()) {
			if (!e.getKey().getDimension().equals(dim)
					&& e.getValue() != null 
					&& e.getValue() != Tristate.UNKNOWN) {
				filteredOb.bind(e.getKey(), e.getValue());
			}
		}
		return filteredOb;
	}

	/**
	 * Reduces a given expression to option references which refer to a
	 * specified version dimension.
	 *
	 * @param expr the expression to reduce
	 * @param dim the version dimension to which the resulting expression will
	 * 			refer to exclusively.
	 * @return an expression that is equivalent to the specified expression,
	 * 			but makes references only to options in <code>dim</code>.
	 */
	public static OptionExpr filterExpression(OptionExpr expr,
			VersionDimension dim) {
		if (expr == null) {
			return null;
		}
		return new SuperModCoreSwitch<OptionExpr>() {
			public OptionExpr caseOptionRef(OptionRef expr) {
				Option o = expr.getOption();
				if (o.getDimension().equals(dim)) {
					OptionRef result = SuperModCoreFactory.eINSTANCE
							.createOptionRef();
					result.setOption(o);
					return result;
				}
				else {
					return null;
				}
			}
			public OptionExpr caseBinaryExpr(BinaryExpr expr) {
				OptionExpr leftFiltered = filterExpression(expr.getLeft(), dim);
				OptionExpr rightFiltered = filterExpression(expr.getRight(), 
						dim);
				if (leftFiltered != null && rightFiltered != null) {
					BinaryExpr result = (BinaryExpr) 
							SuperModCoreFactory.eINSTANCE.create(expr.eClass());
					result.setLeft(leftFiltered);
					result.setRight(rightFiltered);
					return result;
				}
				else if (leftFiltered != null) {
					return leftFiltered;
				}
				else if (rightFiltered != null) {
					return rightFiltered;
				}
				else return null;
			}
			public OptionExpr caseNegExpr(NegExpr expr) {
				OptionExpr negFiltered = filterExpression(expr.getNeg(), dim);
				if (negFiltered != null) {
					NegExpr result = SuperModCoreFactory.eINSTANCE
							.createNegExpr();
					result.setNeg(negFiltered);
					return result;
				}
				return null;
			}
		}.doSwitch(expr);
	}

}
