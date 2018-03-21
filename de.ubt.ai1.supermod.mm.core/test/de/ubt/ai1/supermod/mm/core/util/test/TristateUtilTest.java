/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.mm.core.util.test;

import junit.framework.TestCase;

import org.junit.Test;

import de.ubt.ai1.supermod.mm.core.Tristate;
import static de.ubt.ai1.supermod.mm.core.util.TristateUtil.*;


/**
 * Tests operations of the class TristateUtil using value tables.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	07.09.2015
 */
public class TristateUtilTest extends TestCase {
	
	public static final Tristate T = Tristate.TRUE;
	public static final Tristate U = Tristate.UNKNOWN;
	public static final Tristate F = Tristate.FALSE;
	
	@Test
	public void testNot() {
		assertEquals(F, not(T));
		assertEquals(U, not(U));
		assertEquals(T, not(F));
	}
	
	@Test
	public void testAnd() {
		assertEquals(T, and(T, T));
		assertEquals(U, and(T, U));
		assertEquals(F, and(T, F));
		assertEquals(U, and(U, T));
		assertEquals(U, and(U, U));
		assertEquals(F, and(U, F));
		assertEquals(F, and(F, T));
		assertEquals(F, and(F, U));
		assertEquals(F, and(F, F));
	}
	
	@Test
	public void testOr() {
		assertEquals(T, or(T, T));
		assertEquals(T, or(T, U));
		assertEquals(T, or(T, F));
		assertEquals(T, or(U, T));
		assertEquals(U, or(U, U));
		assertEquals(U, or(U, F));
		assertEquals(T, or(F, T));
		assertEquals(U, or(F, U));
		assertEquals(F, or(F, F));
	}
	
	@Test
	public void testXor() {
		assertEquals(F, xor(T, T));
		assertEquals(U, xor(T, U));
		assertEquals(T, xor(T, F));
		assertEquals(U, xor(U, T));
		assertEquals(U, xor(U, U));
		assertEquals(U, xor(U, F));
		assertEquals(T, xor(F, T));
		assertEquals(U, xor(F, U));
		assertEquals(F, xor(F, F));
	}
	
	@Test
	public void testImplies() {
		assertEquals(T, implies(T, T));
		assertEquals(U, implies(T, U));
		assertEquals(F, implies(T, F));
		assertEquals(T, implies(U, T));
		assertEquals(U, implies(U, U));
		assertEquals(U, implies(U, F));
		assertEquals(T, implies(F, T));
		assertEquals(T, implies(F, U));
		assertEquals(T, implies(F, F));
	}
	
	@Test
	public void testBiconditional() {
		assertEquals(T, biconditionallyImplies(T, T));
		assertEquals(U, biconditionallyImplies(T, U));
		assertEquals(F, biconditionallyImplies(T, F));
		assertEquals(U, biconditionallyImplies(U, T));
		assertEquals(U, biconditionallyImplies(U, U));
		assertEquals(U, biconditionallyImplies(U, F));
		assertEquals(F, biconditionallyImplies(F, T));
		assertEquals(U, biconditionallyImplies(F, U));
		assertEquals(T, biconditionallyImplies(F, F));
	}
	
	@Test
	public void testNand() {
		assertEquals(F, nand(T, T));
		assertEquals(U, nand(T, U));
		assertEquals(T, nand(T, F));
		assertEquals(U, nand(U, T));
		assertEquals(U, nand(U, U));
		assertEquals(T, nand(U, F));
		assertEquals(T, nand(F, T));
		assertEquals(T, nand(F, U));
		assertEquals(T, nand(F, F));
	}
	
	@Test
	public void testMinus() {
		assertEquals(F, minus(T, T));
		assertEquals(U, minus(T, U));
		assertEquals(T, minus(T, F));
		assertEquals(F, minus(U, T));
		assertEquals(U, minus(U, U));
		assertEquals(U, minus(U, F));
		assertEquals(F, minus(F, T));
		assertEquals(F, minus(F, U));
		assertEquals(F, minus(F, F));
	}

}
