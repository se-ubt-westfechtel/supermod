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
 * A representation of the model object '<em><b>Invariant</b></em>'.
 * An invariant is a rule base element which defines an option expression that must evaluate
 * to the value {@link Tristate#TRUE} in order to be <em>strongly consistent</em>, and must
 * not evaluate to {@link Tristate#FALSE} in order to be <em>weakly consistent</em>.
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date 	2014-07-25
 * @see		{@link OptionExpr}
 * @see		{@link Tristate}
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai1.supermod.mm.core.Invariant#getOptionExpr <em>Option Expr</em>}</li>
 * </ul>
 *
 * @see de.ubt.ai1.supermod.mm.core.SuperModCorePackage#getInvariant()
 * @model
 * @generated
 */
public interface Invariant extends RuleBaseElement {
	/**
	 * Returns the value of the '<em><b>Option Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Option Expr</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Option Expr</em>' containment reference.
	 * @see #setOptionExpr(OptionExpr)
	 * @see de.ubt.ai1.supermod.mm.core.SuperModCorePackage#getInvariant_OptionExpr()
	 * @model containment="true"
	 * @generated
	 */
	OptionExpr getOptionExpr();

	/**
	 * Sets the value of the '{@link de.ubt.ai1.supermod.mm.core.Invariant#getOptionExpr <em>Option Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Option Expr</em>' containment reference.
	 * @see #getOptionExpr()
	 * @generated
	 */
	void setOptionExpr(OptionExpr value);

} // Invariant
