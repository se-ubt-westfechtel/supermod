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
 * A representation of the model object '<em><b>Default Binding</b></em>'.
 * A default binding is a rule base element that defines a default tristate value for
 * a given option inside the rule base. It is taken into account only in case the user
 * does not specify a value and the option is not automatically bound by evaluating
 * a {@link Preference}.
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date 	2014-07-25
 * @see		{@link Option}
 * @see		{@link Tristate}
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai1.supermod.mm.core.DefaultBinding#getOption <em>Option</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.core.DefaultBinding#getState <em>State</em>}</li>
 * </ul>
 *
 * @see de.ubt.ai1.supermod.mm.core.SuperModCorePackage#getDefaultBinding()
 * @model
 * @generated
 */
public interface DefaultBinding extends RuleBaseElement {

	/**
	 * Returns the value of the '<em><b>Option</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * The option for which a default value is specified.
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Option</em>' reference.
	 * @see #setOption(Option)
	 * @see de.ubt.ai1.supermod.mm.core.SuperModCorePackage#getDefaultBinding_Option()
	 * @model
	 * @generated
	 */
	Option getOption();

	/**
	 * Sets the value of the '{@link de.ubt.ai1.supermod.mm.core.DefaultBinding#getOption <em>Option</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Option</em>' reference.
	 * @see #getOption()
	 * @generated
	 */
	void setOption(Option value);

	/**
	 * Returns the value of the '<em><b>State</b></em>' attribute.
	 * The literals are from the enumeration {@link de.ubt.ai1.supermod.mm.core.Tristate}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * The {@link Tristate} which is bound to the specified option in case it remains unbound.
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' attribute.
	 * @see de.ubt.ai1.supermod.mm.core.Tristate
	 * @see #setState(Tristate)
	 * @see de.ubt.ai1.supermod.mm.core.SuperModCorePackage#getDefaultBinding_State()
	 * @model
	 * @generated
	 */
	Tristate getState();

	/**
	 * Sets the value of the '{@link de.ubt.ai1.supermod.mm.core.DefaultBinding#getState <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' attribute.
	 * @see de.ubt.ai1.supermod.mm.core.Tristate
	 * @see #getState()
	 * @generated
	 */
	void setState(Tristate value);
} // DefaultBinding
