/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.mm.core.util;

import de.ubt.ai1.supermod.mm.core.Tristate;

/**
 * Utilities for the enumeration type {@link Tristate}.
 * 
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date 	2014-07-25
 */
/**
 * @author btn103
 *
 */
public class TristateUtil {
	
	/**
	 * Converts a boolean value into a tristate value.
	 * 
	 * @param b the boolean value to convert.
	 * @return the corresponding tristate representation.
	 */
	public static Tristate fromBoolean(boolean b) {
		return b ? Tristate.TRUE : Tristate.FALSE;
	}
	
	/**
	 * Converts a tristate value into a boolean value, additionally specifying
	 * the result in case the tristate value is {@link Tristate#UNKNOWN}.
	 * 
	 * @param t
	 * @param includeUnknown if true, the result will also be true in case t's
	 * 			value is {@link Tristate#UNKNOWN}.
	 * @return a corresponding boolean value.
	 */
	public static boolean toBoolean(Tristate t, boolean includeUnknown) {
		return t == Tristate.TRUE || (includeUnknown && t == Tristate.UNKNOWN);
	}
	
	/**
	 * Performs a logical negation of a tristate.
	 * 
	 * @param t
	 * @return the tristate resulting from the negation.
	 */
	public static Tristate not(Tristate t) {
		switch(t) {
		case TRUE: return Tristate.FALSE;
		case FALSE: return Tristate.TRUE;
		default: return Tristate.UNKNOWN;
		}
	}
	
	/**
	 * Performs a logical and-combiation of two tristates.
	 * 
	 * @param t1
	 * @param t2
	 * @return the tristate resulting from the and-combination.
	 */
	public static Tristate and(Tristate t1, Tristate t2) {
		if (t1 == Tristate.TRUE && t2 == Tristate.TRUE) {
			return Tristate.TRUE;
		}
		if (t1 == Tristate.FALSE || t2 == Tristate.FALSE) {
			return Tristate.FALSE;
		}
		return Tristate.UNKNOWN;
	}

	/**
	 * Performs a logical or-combiation of two tristates.
	 * 
	 * @param t1
	 * @param t2
	 * @return the tristate resulting from the or-combination.
	 */
	public static Tristate or(Tristate t1, Tristate t2) {
		if (t1 == Tristate.FALSE && t2 == Tristate.FALSE) {
			return Tristate.FALSE;
		}
		if (t1 == Tristate.TRUE || t2 == Tristate.TRUE) {
			return Tristate.TRUE;
		}
		return Tristate.UNKNOWN;
	}

	/**
	 * Performs a logical xor-combination of two tristates.
	 * 
	 * @param t1
	 * @param t2
	 * @return the tristate resulting from the xor-combination.
	 */
	public static Tristate xor(Tristate t1, Tristate t2) {
		return and(or(t1, t2), not(and(t1, t2)));
	}
	
	/**
	 * Performs a logical implication of two tristates.
	 * 
	 * @param t1
	 * @param t2
	 * @return the tristate resulting from the implication.
	 */
	public static Tristate implies(Tristate t1, Tristate t2) {
		return or(not(t1), t2);
	}
	
	/**
	 * Performs a biconditional implication (iff) of two tristates.
	 * 
	 * @param t1
	 * @param t2
	 * @return the tristate resulting from the biconditional implication.
	 */
	public static Tristate biconditionallyImplies(Tristate t1, Tristate t2) {
		return and(implies(t1, t2), implies(t2, t1));
	}
	
	/**
	 * Performs a nand-combination of two tristates, i.e., checks whether
	 * at least one of the arguments is false.
	 *
	 * @param t1
	 * @param t2
	 * @return the tristate resulting from the nand-combination.
	 */
	public static Tristate nand(Tristate t1, Tristate t2) {
		return not(and(t1, t2));
	}

	/**
	 * Performs a minus-combination (postsection) with the semantics "t1 and
	 * not t2"
	 *
	 * @param t1
	 * @param t2
	 * @return
	 */
	public static Tristate minus(Tristate t1, Tristate t2) {
		return and(t1, not(t2));
	}

}
