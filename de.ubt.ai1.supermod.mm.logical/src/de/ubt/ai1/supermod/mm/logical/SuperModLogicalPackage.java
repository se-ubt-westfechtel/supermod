/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.mm.logical;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import de.ubt.ai1.supermod.mm.core.SuperModCorePackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * 
 * This package contains the meta-model for SuperMod's low-level logical
 * dimension, which lets the user operate directly on rule base concepts.
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date 	2014-07-25
 * @see		LogicalDimension
 * <!-- end-user-doc -->
 * @see de.ubt.ai1.supermod.mm.logical.SuperModLogicalFactory
 * @model kind="package"
 * @generated
 */
public interface SuperModLogicalPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "logical";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://ai1.uni-bayreuth.de/supermod/logical/0.1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "de.ubt.ai1.supermod.mm.logical";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SuperModLogicalPackage eINSTANCE = de.ubt.ai1.supermod.mm.logical.impl.SuperModLogicalPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.ubt.ai1.supermod.mm.logical.impl.LogicalDimensionImpl <em>Logical Dimension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai1.supermod.mm.logical.impl.LogicalDimensionImpl
	 * @see de.ubt.ai1.supermod.mm.logical.impl.SuperModLogicalPackageImpl#getLogicalDimension()
	 * @generated
	 */
	int LOGICAL_DIMENSION = 0;

	/**
	 * The feature id for the '<em><b>Dimension Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_DIMENSION__DIMENSION_NAME = SuperModCorePackage.VERSION_DIMENSION__DIMENSION_NAME;

	/**
	 * The feature id for the '<em><b>Root Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_DIMENSION__ROOT_ELEMENTS = SuperModCorePackage.VERSION_DIMENSION__ROOT_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_DIMENSION__ALL_ELEMENTS = SuperModCorePackage.VERSION_DIMENSION__ALL_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Options</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_DIMENSION__OPTIONS = SuperModCorePackage.VERSION_DIMENSION__OPTIONS;

	/**
	 * The feature id for the '<em><b>Invariants</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_DIMENSION__INVARIANTS = SuperModCorePackage.VERSION_DIMENSION__INVARIANTS;

	/**
	 * The feature id for the '<em><b>Preferences</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_DIMENSION__PREFERENCES = SuperModCorePackage.VERSION_DIMENSION__PREFERENCES;

	/**
	 * The feature id for the '<em><b>Default Bindings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_DIMENSION__DEFAULT_BINDINGS = SuperModCorePackage.VERSION_DIMENSION__DEFAULT_BINDINGS;

	/**
	 * The feature id for the '<em><b>Root Version Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_DIMENSION__ROOT_VERSION_SPACE_ELEMENTS = SuperModCorePackage.VERSION_DIMENSION__ROOT_VERSION_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Version Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_DIMENSION__ALL_VERSION_SPACE_ELEMENTS = SuperModCorePackage.VERSION_DIMENSION__ALL_VERSION_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Version Space</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_DIMENSION__VERSION_SPACE = SuperModCorePackage.VERSION_DIMENSION__VERSION_SPACE;

	/**
	 * The feature id for the '<em><b>Logical Options</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_DIMENSION__LOGICAL_OPTIONS = SuperModCorePackage.VERSION_DIMENSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Logical Invariants</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_DIMENSION__LOGICAL_INVARIANTS = SuperModCorePackage.VERSION_DIMENSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Logical Preferences</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_DIMENSION__LOGICAL_PREFERENCES = SuperModCorePackage.VERSION_DIMENSION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Logical Defaults</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_DIMENSION__LOGICAL_DEFAULTS = SuperModCorePackage.VERSION_DIMENSION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Logical Dimension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_DIMENSION_FEATURE_COUNT = SuperModCorePackage.VERSION_DIMENSION_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_DIMENSION___VALIDATE__OPTIONBINDING = SuperModCorePackage.VERSION_DIMENSION___VALIDATE__OPTIONBINDING;

	/**
	 * The operation id for the '<em>Is Complete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_DIMENSION___IS_COMPLETE__OPTIONBINDING = SuperModCorePackage.VERSION_DIMENSION___IS_COMPLETE__OPTIONBINDING;

	/**
	 * The operation id for the '<em>Is Satisfiable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_DIMENSION___IS_SATISFIABLE__OPTIONBINDING = SuperModCorePackage.VERSION_DIMENSION___IS_SATISFIABLE__OPTIONBINDING;

	/**
	 * The operation id for the '<em>Apply Preferences</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_DIMENSION___APPLY_PREFERENCES__OPTIONBINDING = SuperModCorePackage.VERSION_DIMENSION___APPLY_PREFERENCES__OPTIONBINDING;

	/**
	 * The operation id for the '<em>Apply Defaults</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_DIMENSION___APPLY_DEFAULTS__OPTIONBINDING = SuperModCorePackage.VERSION_DIMENSION___APPLY_DEFAULTS__OPTIONBINDING;

	/**
	 * The operation id for the '<em>Apply Completions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_DIMENSION___APPLY_COMPLETIONS__OPTIONBINDING = SuperModCorePackage.VERSION_DIMENSION___APPLY_COMPLETIONS__OPTIONBINDING;

	/**
	 * The operation id for the '<em>Get Option</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_DIMENSION___GET_OPTION__STRING = SuperModCorePackage.VERSION_DIMENSION___GET_OPTION__STRING;

	/**
	 * The number of operations of the '<em>Logical Dimension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_DIMENSION_OPERATION_COUNT = SuperModCorePackage.VERSION_DIMENSION_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link de.ubt.ai1.supermod.mm.logical.LogicalDimension <em>Logical Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Logical Dimension</em>'.
	 * @see de.ubt.ai1.supermod.mm.logical.LogicalDimension
	 * @generated
	 */
	EClass getLogicalDimension();

	/**
	 * Returns the meta object for the containment reference list '{@link de.ubt.ai1.supermod.mm.logical.LogicalDimension#getLogicalOptions <em>Logical Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Logical Options</em>'.
	 * @see de.ubt.ai1.supermod.mm.logical.LogicalDimension#getLogicalOptions()
	 * @see #getLogicalDimension()
	 * @generated
	 */
	EReference getLogicalDimension_LogicalOptions();

	/**
	 * Returns the meta object for the containment reference list '{@link de.ubt.ai1.supermod.mm.logical.LogicalDimension#getLogicalInvariants <em>Logical Invariants</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Logical Invariants</em>'.
	 * @see de.ubt.ai1.supermod.mm.logical.LogicalDimension#getLogicalInvariants()
	 * @see #getLogicalDimension()
	 * @generated
	 */
	EReference getLogicalDimension_LogicalInvariants();

	/**
	 * Returns the meta object for the containment reference list '{@link de.ubt.ai1.supermod.mm.logical.LogicalDimension#getLogicalPreferences <em>Logical Preferences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Logical Preferences</em>'.
	 * @see de.ubt.ai1.supermod.mm.logical.LogicalDimension#getLogicalPreferences()
	 * @see #getLogicalDimension()
	 * @generated
	 */
	EReference getLogicalDimension_LogicalPreferences();

	/**
	 * Returns the meta object for the containment reference list '{@link de.ubt.ai1.supermod.mm.logical.LogicalDimension#getLogicalDefaults <em>Logical Defaults</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Logical Defaults</em>'.
	 * @see de.ubt.ai1.supermod.mm.logical.LogicalDimension#getLogicalDefaults()
	 * @see #getLogicalDimension()
	 * @generated
	 */
	EReference getLogicalDimension_LogicalDefaults();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SuperModLogicalFactory getSuperModLogicalFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link de.ubt.ai1.supermod.mm.logical.impl.LogicalDimensionImpl <em>Logical Dimension</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai1.supermod.mm.logical.impl.LogicalDimensionImpl
		 * @see de.ubt.ai1.supermod.mm.logical.impl.SuperModLogicalPackageImpl#getLogicalDimension()
		 * @generated
		 */
		EClass LOGICAL_DIMENSION = eINSTANCE.getLogicalDimension();
		/**
		 * The meta object literal for the '<em><b>Logical Options</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGICAL_DIMENSION__LOGICAL_OPTIONS = eINSTANCE.getLogicalDimension_LogicalOptions();
		/**
		 * The meta object literal for the '<em><b>Logical Invariants</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGICAL_DIMENSION__LOGICAL_INVARIANTS = eINSTANCE.getLogicalDimension_LogicalInvariants();
		/**
		 * The meta object literal for the '<em><b>Logical Preferences</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGICAL_DIMENSION__LOGICAL_PREFERENCES = eINSTANCE.getLogicalDimension_LogicalPreferences();
		/**
		 * The meta object literal for the '<em><b>Logical Defaults</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGICAL_DIMENSION__LOGICAL_DEFAULTS = eINSTANCE.getLogicalDimension_LogicalDefaults();

	}

} //SuperModLogicalPackage
