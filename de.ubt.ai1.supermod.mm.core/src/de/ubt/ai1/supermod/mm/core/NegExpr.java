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
 * A representation of the model object '<em><b>Neg Expr</b></em>'.
 * A negative expression evaluates to the logical opposite of the contained expression.
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date 	2014-07-25
 * @see		{@link OptionExpr}
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai1.supermod.mm.core.NegExpr#getNeg <em>Neg</em>}</li>
 * </ul>
 *
 * @see de.ubt.ai1.supermod.mm.core.SuperModCorePackage#getNegExpr()
 * @model
 * @generated
 */
public interface NegExpr extends OptionExpr {
	/**
	 * Returns the value of the '<em><b>Neg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * The contained option expression to negate.
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Neg</em>' containment reference.
	 * @see #setNeg(OptionExpr)
	 * @see de.ubt.ai1.supermod.mm.core.SuperModCorePackage#getNegExpr_Neg()
	 * @model containment="true"
	 * @generated
	 */
	OptionExpr getNeg();

	/**
	 * Sets the value of the '{@link de.ubt.ai1.supermod.mm.core.NegExpr#getNeg <em>Neg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Neg</em>' containment reference.
	 * @see #getNeg()
	 * @generated
	 */
	void setNeg(OptionExpr value);

} // NegExpr
