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
 * A representation of the model object '<em><b>Option Ref</b></em>'.
 * An option reference is an option expression that refers to an option defined
 * in the rule base. Evaluating an option expression is realized by a lookup of
 * the referenced option's bound value in the option binding.
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date 	2014-07-25
 * @see		{@link Option}
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai1.supermod.mm.core.OptionRef#getOption <em>Option</em>}</li>
 * </ul>
 *
 * @see de.ubt.ai1.supermod.mm.core.SuperModCorePackage#getOptionRef()
 * @model
 * @generated
 */
public interface OptionRef extends OptionExpr {
	/**
	 * Returns the value of the '<em><b>Option</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * The referenced option which will be replaced by its bound value when evaluating
	 * this expression with respect to an option binding.
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Option</em>' reference.
	 * @see #setOption(Option)
	 * @see de.ubt.ai1.supermod.mm.core.SuperModCorePackage#getOptionRef_Option()
	 * @model
	 * @generated
	 */
	Option getOption();

	/**
	 * Sets the value of the '{@link de.ubt.ai1.supermod.mm.core.OptionRef#getOption <em>Option</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Option</em>' reference.
	 * @see #getOption()
	 * @generated
	 */
	void setOption(Option value);

} // OptionRef
