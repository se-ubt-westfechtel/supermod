/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.mm.core.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.sat4j.core.VecInt;
import org.sat4j.minisat.SolverFactory;
import org.sat4j.specs.ContradictionException;
import org.sat4j.specs.IConstr;
import org.sat4j.specs.ISolver;
import org.sat4j.specs.TimeoutException;
import org.sat4j.tools.GateTranslator;

import de.ubt.ai1.supermod.mm.core.AndExpr;
import de.ubt.ai1.supermod.mm.core.BiconditionalExpr;
import de.ubt.ai1.supermod.mm.core.BigAndExpr;
import de.ubt.ai1.supermod.mm.core.BigNandExpr;
import de.ubt.ai1.supermod.mm.core.BigOrExpr;
import de.ubt.ai1.supermod.mm.core.BigXorExpr;
import de.ubt.ai1.supermod.mm.core.ImpliesExpr;
import de.ubt.ai1.supermod.mm.core.MinusExpr;
import de.ubt.ai1.supermod.mm.core.NandExpr;
import de.ubt.ai1.supermod.mm.core.NegExpr;
import de.ubt.ai1.supermod.mm.core.Option;
import de.ubt.ai1.supermod.mm.core.OptionBinding;
import de.ubt.ai1.supermod.mm.core.OptionExpr;
import de.ubt.ai1.supermod.mm.core.OptionRef;
import de.ubt.ai1.supermod.mm.core.OrExpr;
import de.ubt.ai1.supermod.mm.core.Tristate;
import de.ubt.ai1.supermod.mm.core.VisibilityRef;
import de.ubt.ai1.supermod.mm.core.XorExpr;

/**
 * Utility class to solve satisfiability problems with respect to option
 * expressions and bindings.
 *
 * @author Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version 0.1.0
 * @since 0.1.0
 * @date 08.09.2015
 */
public class SatUtil {

	/**
	 * Timeout for the SAT solver in seconds.
	 */
	private static final int TIMEOUT = 3600;

	/**
	 * Checks whether a given conjunction of option expressions is satisfiable
	 * under a specified premise, i.e., there exists a binding for the specified
	 * option set that includes the premise and returns true when applied to all
	 * expressions. Internally, the SAT4j solver is used.
	 *
	 * @param options
	 *            the option set to consider
	 * @param exprs
	 *            option expressions to satisfy. Implicitly, a conjunction is
	 *            assumed.
	 * @param premise
	 *            fixed option bindings to constrain the specified option set,
	 *            or null if no premise is assumed.
	 * @return whether the specified problem is satisfiable.
	 */
	public static boolean isSatisfiable(List<Option> options,
			List<OptionExpr> exprs, OptionBinding premise) {
		// prepare the SAT4j solver.
		ISolver solver = SolverFactory.newDefault();
		solver.newVar(options.size());
		solver.setTimeout(TIMEOUT);

		// map each option to an integer variable
		int i = 1;
		LinkedHashMap<Option, Integer> varMap = new LinkedHashMap<>();
		for (Option o : options) {
			varMap.put(o, i);
			i++;
		}

		// use a gate translator to transform option bindings and option
		// expressions into CNF format
		List<IConstr> constraints = new ArrayList<>();
		GateTranslator gt = new GateTranslator(solver);
		try {
			constraints
					.addAll(createConstraintsForPremise(gt, premise, varMap));
		} catch (ContradictionException e1) {
			return false;
		}
		// use a gate switch to reduce complex expressions
		GateSwitch gs = new GateSwitch(gt, varMap);
		for (OptionExpr expr : exprs) {
			List<IConstr> cons = createConstraintsForExpr(gt, gs, expr, varMap);
			if (cons == null)
				return false;
			constraints.addAll(cons);
		}

		// run the SAT4j solver.
		try {
			boolean sat = solver.isSatisfiable();
			return sat;
		} catch (TimeoutException e) {
			e.printStackTrace();
			return false;
		}
	}

	/**
	 * Converts an option binding into gate-translatable clauses and adds them
	 * to the constraint set of the SAT solver.
	 *
	 * @param gt
	 * @param ob
	 * @param varMap
	 * @return
	 * @throws ContradictionException
	 */
	private static List<IConstr> createConstraintsForPremise(GateTranslator gt,
			OptionBinding ob, LinkedHashMap<Option, Integer> varMap)
			throws ContradictionException {
		List<IConstr> constraints = new ArrayList<>();
		for (Map.Entry<Option, Tristate> e : ob.getBoundOptions().entrySet()) {
			int var = varMap.get(e.getKey());
			if (e.getValue() == Tristate.TRUE) {
				constraints.add(gt.gateTrue(var));
			} else if (e.getValue() == Tristate.FALSE) {
				constraints.add(gt.gateFalse(var));
			}
		}
		return constraints;
	}

	/**
	 * Converts an option expression into gate-translatable clauses and adds
	 * them to the constraint set of the SAT solver.
	 *
	 * @param gt
	 * @param gs
	 * @param expr
	 * @param varMap
	 * @return
	 * @throws ContradictionException
	 */
	private static List<IConstr> createConstraintsForExpr(GateTranslator gt,
			GateSwitch gs, OptionExpr expr,
			LinkedHashMap<Option, Integer> varMap) {
		gs.constraints.clear();
		int var = gs.doSwitch(expr);
		if (var == 0)
			return null;
		try {
			// make the expression an invariant using a true gate
			IConstr constr = gt.gateTrue(var);
			gs.constraints.add(constr);
		} catch (ContradictionException e) {
			return Collections.emptyList();
		}
		return gs.constraints;
	}

	/**
	 * Utility class for the recursive traversal of option expressions and the
	 * invocation of gate creation functions of the SAT4j GateTranslator
	 * utility. Complex expressions are resolved by introducing new variables.
	 * The return value of doSwitch points to the variable of the overall
	 * expression. The expression can be converted into an invariant by adding a
	 * true gate for the returned value.
	 *
	 * @author Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
	 * @version 0.1.0
	 * @since 0.1.0
	 * @date 08.09.2015
	 */
	protected static class GateSwitch extends SuperModCoreSwitch<Integer> {

		protected GateTranslator gt;
		protected LinkedHashMap<Option, Integer> varMap;
		protected List<IConstr> constraints;
		protected Map<OptionExpr, Integer> optionExprRefCache;

		/**
		 * Creates a new instance using specified GateTranslator and variable
		 * map.
		 *
		 * @param gt
		 * @param varMap
		 */
		protected GateSwitch(GateTranslator gt,
				LinkedHashMap<Option, Integer> varMap) {
			this.gt = gt;
			this.varMap = varMap;
			this.constraints = new ArrayList<>();
			this.optionExprRefCache = new HashMap<>();
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see de.ubt.ai1.supermod.mm.core.util.SuperModCoreSwitch
		 * #caseOptionExprRef(de.ubt.ai1.supermod.mm.core.OptionExprRef)
		 */
		@Override
		public Integer caseVisibilityRef(VisibilityRef visRef) {
			OptionExpr expr = visRef.getVisibility().getExpr();
			if (optionExprRefCache.containsKey(expr)) {
				return optionExprRefCache.get(expr);
			} else {
				int var = doSwitch(expr);
				optionExprRefCache.put(expr, var);
				return var;
			}
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see de.ubt.ai1.supermod.mm.core.util.SuperModCoreSwitch
		 * #caseOptionExpr(de.ubt.ai1.supermod.mm.core.OptionExpr)
		 */
		@Override
		public Integer caseOptionRef(OptionRef optionRef) {
			int var = varMap.get(optionRef.getOption());
			return var;
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see de.ubt.ai1.supermod.mm.core.util.SuperModCoreSwitch
		 * #caseNegExpr(de.ubt.ai1.supermod.mm.core.NegExpr)
		 */
		@Override
		public Integer caseNegExpr(NegExpr negExpr) {
			int var = doSwitch(negExpr.getNeg());
			if (var == 0)
				return 0;
			int neg = gt.nextFreeVarId(true);
			try {
				IConstr[] constr = gt.not(neg, var);
				constraints.addAll(Arrays.asList(constr));
				return neg;
			} catch (ContradictionException e) {
				return 0;
			}
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see de.ubt.ai1.supermod.mm.core.util.SuperModCoreSwitch
		 * #caseAndExpr(de.ubt.ai1.supermod.mm.core.AndExpr)
		 */
		@Override
		public Integer caseAndExpr(AndExpr andExpr) {
			int left = doSwitch(andExpr.getLeft());
			int right = doSwitch(andExpr.getRight());
			if (left == 0 || right == 0)
				return 0;
			int and = gt.nextFreeVarId(true);
			try {
				IConstr[] constr = gt.and(and, new VecInt(new int[] { left,
						right }));
				constraints.addAll(Arrays.asList(constr));
				return and;
			} catch (ContradictionException e) {
				return 0;
			}
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see de.ubt.ai1.supermod.mm.core.util.SuperModCoreSwitch
		 * #caseOrExpr(de.ubt.ai1.supermod.mm.core.OrExpr)
		 */
		@Override
		public Integer caseOrExpr(OrExpr orExpr) {
			int left = doSwitch(orExpr.getLeft());
			int right = doSwitch(orExpr.getRight());
			if (left == 0 || right == 0)
				return 0;
			int or = gt.nextFreeVarId(true);
			try {
				IConstr[] constr = gt.or(or, new VecInt(
						new int[] { left, right }));
				constraints.addAll(Arrays.asList(constr));
				return or;
			} catch (ContradictionException e) {
				return 0;
			}
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see de.ubt.ai1.supermod.mm.core.util.SuperModCoreSwitch
		 * #caseXorExpr(de.ubt.ai1.supermod.mm.core.XorExpr)
		 */
		@Override
		public Integer caseXorExpr(XorExpr xorExpr) {
			int left = doSwitch(xorExpr.getLeft());
			int right = doSwitch(xorExpr.getRight());
			if (left == 0 || right == 0)
				return 0;
			int xor = gt.nextFreeVarId(true);
			try {
				IConstr[] constr = gt.xor(xor, new VecInt(new int[] { left,
						right }));
				constraints.addAll(Arrays.asList(constr));
				return xor;
			} catch (ContradictionException e) {
				return 0;
			}
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see de.ubt.ai1.supermod.mm.core.util.SuperModCoreSwitch
		 * #caseImpliesExpr(de.ubt.ai1.supermod.mm.core.ImpliesExpr)
		 */
		@Override
		public Integer caseImpliesExpr(ImpliesExpr impExpr) {
			int left = doSwitch(impExpr.getLeft());
			int right = doSwitch(impExpr.getRight());
			if (left == 0 || right == 0)
				return 0;
			int imp = gt.nextFreeVarId(true);
			try {
				IConstr[] constr = gt.or(imp, new VecInt(new int[] { -left,
						right }));
				constraints.addAll(Arrays.asList(constr));
				return imp;
			} catch (ContradictionException e) {
				return 0;
			}
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see de.ubt.ai1.supermod.mm.core.util.SuperModCoreSwitch
		 * #caseNandExpr(de.ubt.ai1.supermod.mm.core.NandExpr)
		 */
		@Override
		public Integer caseNandExpr(NandExpr nandExpr) {
			int left = doSwitch(nandExpr.getLeft());
			int right = doSwitch(nandExpr.getRight());
			if (left == 0 || right == 0)
				return 0;
			int nand = gt.nextFreeVarId(true);
			try {
				IConstr[] constr = gt.or(nand, new VecInt(new int[] { -left,
						-right }));
				constraints.addAll(Arrays.asList(constr));
				return nand;
			} catch (ContradictionException e) {
				return 0;
			}
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see de.ubt.ai1.supermod.mm.core.util.SuperModCoreSwitch
		 * #caseMinusExpr(de.ubt.ai1.supermod.mm.core.MinusExpr)
		 */
		@Override
		public Integer caseMinusExpr(MinusExpr minusExpr) {
			int left = doSwitch(minusExpr.getLeft());
			int right = doSwitch(minusExpr.getRight());
			if (left == 0 || right == 0)
				return 0;
			int minus = gt.nextFreeVarId(true);
			try {
				IConstr[] constr = gt.and(minus, new VecInt(new int[] { left,
						-right }));
				constraints.addAll(Arrays.asList(constr));
				return minus;
			} catch (ContradictionException e) {
				return 0;
			}
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see de.ubt.ai1.supermod.mm.core.util.SuperModCoreSwitch
		 * #caseBiconditionalExpr(de.ubt.ai1.supermod.mm.core.BiconditionalExpr)
		 */
		@Override
		public Integer caseBiconditionalExpr(BiconditionalExpr bicExpr) {
			int left = doSwitch(bicExpr.getLeft());
			int right = doSwitch(bicExpr.getRight());
			if (left == 0 || right == 0)
				return 0;
			int bic = gt.nextFreeVarId(true);
			try {
				IConstr[] constr = gt.iff(bic, new VecInt(new int[] { left,
						right }));
				constraints.addAll(Arrays.asList(constr));
				return bic;
			} catch (ContradictionException e) {
				return 0;
			}
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see de.ubt.ai1.supermod.mm.core.util.SuperModCoreSwitch
		 * #caseBigAndExpr(de.ubt.ai1.supermod.mm.core.BigAndExpr)
		 */
		@Override
		public Integer caseBigAndExpr(BigAndExpr bigAndExpr) {
			int[] operands = new int[bigAndExpr.getChildren().size()];
			int i = 0;
			for (OptionExpr operand : bigAndExpr.getChildren()) {
				int var = doSwitch(operand);
				if (var == 0)
					return 0;
				operands[i] = var;
				i++;
			}
			int and = gt.nextFreeVarId(true);
			try {
				IConstr[] constr = gt.and(and, new VecInt(operands));
				constraints.addAll(Arrays.asList(constr));
				return and;
			} catch (ContradictionException e) {
				return 0;
			}
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see de.ubt.ai1.supermod.mm.core.util.SuperModCoreSwitch
		 * #caseBigOrExpr(de.ubt.ai1.supermod.mm.core.BigOrExpr)
		 */
		@Override
		public Integer caseBigOrExpr(BigOrExpr bigOrExpr) {
			int[] operands = new int[bigOrExpr.getChildren().size()];
			int i = 0;
			for (OptionExpr operand : bigOrExpr.getChildren()) {
				int var = doSwitch(operand);
				if (var == 0)
					return 0;
				operands[i] = var;
				i++;
			}
			int or = gt.nextFreeVarId(true);
			try {
				IConstr[] constr = gt.or(or, new VecInt(operands));
				constraints.addAll(Arrays.asList(constr));
				return or;
			} catch (ContradictionException e) {
				return 0;
			}
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see de.ubt.ai1.supermod.mm.core.util.SuperModCoreSwitch
		 * #caseBigXorExpr(de.ubt.ai1.supermod.mm.core.BigXorExpr)
		 */
		@Override
		public Integer caseBigXorExpr(BigXorExpr bigXorExpr) {
			int[] operands = new int[bigXorExpr.getChildren().size()];
			int i = 0;
			for (OptionExpr operand : bigXorExpr.getChildren()) {
				int var = doSwitch(operand);
				if (var == 0)
					return 0;
				operands[i] = var;
				i++;
			}
			int xor = gt.nextFreeVarId(true);
			try {
				IConstr[] constr = gt.xor(xor, new VecInt(operands));
				constraints.addAll(Arrays.asList(constr));
				return xor;
			} catch (ContradictionException e) {
				return 0;
			}
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see de.ubt.ai1.supermod.mm.core.util.SuperModCoreSwitch
		 * #caseBigNandExpr(de.ubt.ai1.supermod.mm.core.BigNandExpr)
		 */
		@Override
		public Integer caseBigNandExpr(BigNandExpr bigNandExpr) {
			int[] operands = new int[bigNandExpr.getChildren().size()];
			int i = 0;
			for (OptionExpr operand : bigNandExpr.getChildren()) {
				int var = doSwitch(operand);
				if (var == 0)
					return 0;
				operands[i] = var;
				i++;
			}
			int[] ands = new int[((operands.length) * (operands.length - 1)) / 2];
			try {
				int a = 0;
				for (int j = 0; j < operands.length; j++) {
					for (int k = 0; k < j; k++) {
						int and = gt.nextFreeVarId(true);
						ands[a] = and;
						IConstr[] constr = gt.or(and, new VecInt(new int[] {
								-operands[j], -operands[k] }));
						constraints.addAll(Arrays.asList(constr));
						a++;
					}
				}
				int nand = gt.nextFreeVarId(true);
				IConstr[] constr = gt.and(nand, new VecInt(ands));
				constraints.addAll(Arrays.asList(constr));
				return nand;
			} catch (ContradictionException e) {
				return 0;
			}
		}
	}

}
