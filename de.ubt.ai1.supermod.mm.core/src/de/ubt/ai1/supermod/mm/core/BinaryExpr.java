/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.mm.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binary Expr</b></em>'.
 * This is a base interface for logical option expressions which combine two operands,
 * a 'left' and a 'right' expression.
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date 	2014-07-25
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai1.supermod.mm.core.BinaryExpr#getLeft <em>Left</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.core.BinaryExpr#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see de.ubt.ai1.supermod.mm.core.SuperModCorePackage#getBinaryExpr()
 * @model abstract="true"
 * @generated
 */
public interface BinaryExpr extends OptionExpr {
	/**
	 * Returns the value of the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * The left operand of the logical combination.
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left</em>' containment reference.
	 * @see #setLeft(OptionExpr)
	 * @see de.ubt.ai1.supermod.mm.core.SuperModCorePackage#getBinaryExpr_Left()
	 * @model containment="true"
	 * @generated
	 */
	OptionExpr getLeft();

	/**
	 * Sets the value of the '{@link de.ubt.ai1.supermod.mm.core.BinaryExpr#getLeft <em>Left</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left</em>' containment reference.
	 * @see #getLeft()
	 * @generated
	 */
	void setLeft(OptionExpr value);

	/**
	 * Returns the value of the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * The right operand of the boolean combination.
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right</em>' containment reference.
	 * @see #setRight(OptionExpr)
	 * @see de.ubt.ai1.supermod.mm.core.SuperModCorePackage#getBinaryExpr_Right()
	 * @model containment="true"
	 * @generated
	 */
	OptionExpr getRight();

	/**
	 * Sets the value of the '{@link de.ubt.ai1.supermod.mm.core.BinaryExpr#getRight <em>Right</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right</em>' containment reference.
	 * @see #getRight()
	 * @generated
	 */
	void setRight(OptionExpr value);

} // BinaryExpr
