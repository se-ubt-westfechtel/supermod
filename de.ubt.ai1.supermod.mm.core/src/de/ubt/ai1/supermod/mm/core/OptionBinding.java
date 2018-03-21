/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.mm.core;

import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Option Binding</b></em>'.
 * An option binding refers to a given rule base by binding a tristate value (one of
 * true, false or unknown) to each option defined in the rule base. It describes a
 * specific version of a SuperMod product at a low level of abstraction. Typically,
 * option bindings are not imposed to the user, but only their higher-level abstractions,
 * such as revision selections or feature configurations.
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
 *   <li>{@link de.ubt.ai1.supermod.mm.core.OptionBinding#getBoundOptions <em>Bound Options</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.core.OptionBinding#getNumberOfBindings <em>Number Of Bindings</em>}</li>
 * </ul>
 *
 * @see de.ubt.ai1.supermod.mm.core.SuperModCorePackage#getOptionBinding()
 * @model
 * @generated
 */
public interface OptionBinding extends EObject {
	/**
	 * Returns the value of the '<em><b>Bound Options</b></em>' map.
	 * The key is of type {@link de.ubt.ai1.supermod.mm.core.Option},
	 * and the value is of type {@link de.ubt.ai1.supermod.mm.core.Tristate},
	 * <!-- begin-user-doc -->
	 * <p>
	 * The '<em><b>Bound Options</b></em>' map defines tristate values for each option. In
	 * case there is no entry for a specific option, {@link Tristate#UNKNOWN} is implicitly
	 * assumed as its value.
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bound Options</em>' map.
	 * @see de.ubt.ai1.supermod.mm.core.SuperModCorePackage#getOptionBinding_BoundOptions()
	 * @model mapType="de.ubt.ai1.supermod.mm.core.OptionToTristateMapEntry&lt;de.ubt.ai1.supermod.mm.core.Option, de.ubt.ai1.supermod.mm.core.Tristate&gt;"
	 * @generated
	 */
	EMap<Option, Tristate> getBoundOptions();

	/**
	 * Returns the value of the '<em><b>Number Of Bindings</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Of Bindings</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Bindings</em>' attribute.
	 * @see de.ubt.ai1.supermod.mm.core.SuperModCorePackage#getOptionBinding_NumberOfBindings()
	 * @model default="0" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	int getNumberOfBindings();

	/**
	 * <!-- begin-user-doc -->
	 * Looks up a given option in the '<em><b>Bound Options</b></em>' map and returns
	 * the tristate value bound to it.
	 * @param	option the {@link Option} to look up.
	 * @return	the {@link Tristate} bound to the option.
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Tristate getState(Option option);

	/**
	 * <!-- begin-user-doc -->
	 * Checks whether this option binding imples another option binding. The implication
	 * is broken down to a conjunction of the implication of the tristates bound to
	 * corresponding options.
	 * @param	other another option binding to act as the second operand of the
	 * 			implication operation.
	 * @return	tristate value indicating whether this binding implies the other.
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Tristate implies(OptionBinding other);

	/**
	 * <!-- begin-user-doc -->
	 * Transforms this option binding into an option expression by forming a conjunction
	 * over all options bound to a value different from {@link Tristate#UNKNOWN}. Options
	 * which are bound to {@link Tristate#TRUE} will appear in a positive form, options
	 * which are bound to {@link Tristate#FALSE} in a negative form ({@link NegExpr}).
	 * @return	an option expression that represents conjunction of all bound options.
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	OptionExpr toVisibility();

	/**
	 * <!-- begin-user-doc -->
	 * Binds a given option in the '<em><b>Bound Options</b></em>' map to a specified
	 * tristate. Potentially removes a previous binding.
	 * @param	option the {@link Option} to bind.
	 * @param	state the {@link Tristate} to bind the option to.
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void bind(Option option, Tristate state);

	/**
	 * <!-- begin-user-doc -->
	 * Creates a new option binding that contains all bindings specified by the
	 * current and a given option binding. This operation is only allowed in
	 * case <code>this.implies(other) != FALSE</code>
	 * @param	other another option binding to act as the second operand of the
	 * 			implication operation.
	 * @return 	the combined option binding, or <code>null</code> in case the
	 *			precondition (implies) fails.
	 * @see 	OptionBinding.implies 
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	OptionBinding combine(OptionBinding other);

	/**
	 * <!-- begin-user-doc -->
	 * Clears the binding by removing all entries from the map.
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void clear();

} // OptionBinding
