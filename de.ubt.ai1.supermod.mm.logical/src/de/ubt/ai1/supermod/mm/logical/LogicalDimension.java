/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.mm.logical;

import org.eclipse.emf.common.util.EList;

import de.ubt.ai1.supermod.mm.core.DefaultBinding;
import de.ubt.ai1.supermod.mm.core.Invariant;
import de.ubt.ai1.supermod.mm.core.Option;
import de.ubt.ai1.supermod.mm.core.Preference;
import de.ubt.ai1.supermod.mm.core.RuleBaseElement;
import de.ubt.ai1.supermod.mm.core.VersionDimension;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Logical Dimension</b></em>'.
 * A version dimension that lets the user directly operate on low-level rule base
 * concepts. This dimension is non-versioned.
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date 	2014-07-25
 * @see		VersionDimension
 * @see		RuleBaseElement
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai1.supermod.mm.logical.LogicalDimension#getLogicalOptions <em>Logical Options</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.logical.LogicalDimension#getLogicalInvariants <em>Logical Invariants</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.logical.LogicalDimension#getLogicalPreferences <em>Logical Preferences</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.logical.LogicalDimension#getLogicalDefaults <em>Logical Defaults</em>}</li>
 * </ul>
 *
 * @see de.ubt.ai1.supermod.mm.logical.SuperModLogicalPackage#getLogicalDimension()
 * @model
 * @generated
 */
public interface LogicalDimension extends VersionDimension {

	/**
	 * Returns the value of the '<em><b>Logical Options</b></em>' containment reference list.
	 * The list contents are of type {@link de.ubt.ai1.supermod.mm.core.Option}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * Logical options, which are directly contained in this dimension.
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logical Options</em>' containment reference list.
	 * @see de.ubt.ai1.supermod.mm.logical.SuperModLogicalPackage#getLogicalDimension_LogicalOptions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Option> getLogicalOptions();

	/**
	 * Returns the value of the '<em><b>Logical Invariants</b></em>' containment reference list.
	 * The list contents are of type {@link de.ubt.ai1.supermod.mm.core.Invariant}.
	 * <!-- begin-user-doc -->
	 * <p>	 
	 * Logical invariants, which are directly contained in this dimension.
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logical Invariants</em>' containment reference list.
	 * @see de.ubt.ai1.supermod.mm.logical.SuperModLogicalPackage#getLogicalDimension_LogicalInvariants()
	 * @model containment="true"
	 * @generated
	 */
	EList<Invariant> getLogicalInvariants();

	/**
	 * Returns the value of the '<em><b>Logical Preferences</b></em>' containment reference list.
	 * The list contents are of type {@link de.ubt.ai1.supermod.mm.core.Preference}.
	 * <!-- begin-user-doc -->
	 * <p>
 	 * Logical preferences, which are directly contained in this dimension.
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logical Preferences</em>' containment reference list.
	 * @see de.ubt.ai1.supermod.mm.logical.SuperModLogicalPackage#getLogicalDimension_LogicalPreferences()
	 * @model containment="true"
	 * @generated
	 */
	EList<Preference> getLogicalPreferences();

	/**
	 * Returns the value of the '<em><b>Logical Defaults</b></em>' containment reference list.
	 * The list contents are of type {@link de.ubt.ai1.supermod.mm.core.DefaultBinding}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * Logical default bindings, which are directly contained in this dimension.
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logical Defaults</em>' containment reference list.
	 * @see de.ubt.ai1.supermod.mm.logical.SuperModLogicalPackage#getLogicalDimension_LogicalDefaults()
	 * @model containment="true"
	 * @generated
	 */
	EList<DefaultBinding> getLogicalDefaults();
} // LogicalDimension
