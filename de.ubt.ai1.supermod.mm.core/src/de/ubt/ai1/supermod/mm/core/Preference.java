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
 * A representation of the model object '<em><b>Preference</b></em>'.
 * A preference is a rule base element that consists of a reference to an option
 * and an option expression to be evaluated in case the option has an undefined
 * tristate in a given option binding. In this case, the expression will be evaluated
 * and the result will be bound to the option.
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date 	2014-07-25
 * @see		{@link Option}
 * @see		{@link OptionBinding}
 * @see		{@link OptionExpr}
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai1.supermod.mm.core.Preference#getOption <em>Option</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.core.Preference#getOptionExpr <em>Option Expr</em>}</li>
 * </ul>
 *
 * @see de.ubt.ai1.supermod.mm.core.SuperModCorePackage#getPreference()
 * @model
 * @generated
 */
public interface Preference extends RuleBaseElement {
	/**
	 * Returns the value of the '<em><b>Option</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * The option for which a preference is specified.
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Option</em>' reference.
	 * @see #setOption(Option)
	 * @see de.ubt.ai1.supermod.mm.core.SuperModCorePackage#getPreference_Option()
	 * @model
	 * @generated
	 */
	Option getOption();

	/**
	 * Sets the value of the '{@link de.ubt.ai1.supermod.mm.core.Preference#getOption <em>Option</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Option</em>' reference.
	 * @see #getOption()
	 * @generated
	 */
	void setOption(Option value);

	/**
	 * Returns the value of the '<em><b>Option Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * The option expression whose evaluation result will determine the option's binding.
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Option Expr</em>' containment reference.
	 * @see #setOptionExpr(OptionExpr)
	 * @see de.ubt.ai1.supermod.mm.core.SuperModCorePackage#getPreference_OptionExpr()
	 * @model containment="true"
	 * @generated
	 */
	OptionExpr getOptionExpr();

	/**
	 * Sets the value of the '{@link de.ubt.ai1.supermod.mm.core.Preference#getOptionExpr <em>Option Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Option Expr</em>' containment reference.
	 * @see #getOptionExpr()
	 * @generated
	 */
	void setOptionExpr(OptionExpr value);

	/**
	 * <!-- begin-user-doc -->
	 * Transforms this preference into an invariant, consisting of an option
	 * expression that forms an implication expression of the referenced option 
	 * and the preference expression.
	 * @return 	the corresponding implication invariant.
	 * @see {@link Invariant}
	 * @see {@link ImpliesExpr}
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Invariant toImplicationInvariant();

} // Preference
