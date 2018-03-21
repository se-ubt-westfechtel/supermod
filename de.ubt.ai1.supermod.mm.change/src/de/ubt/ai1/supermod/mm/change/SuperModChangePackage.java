/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.mm.change;

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
 * This package contains the meta-model of the SuperMod change space. The purpose
 * of the change space is to obtain a better comprehensibility of changes which
 * have been performed on a repository. Furthermore, performance may be increased
 * significantly by avoiding equivalent feature expressions. The change space is
 * primarily used in order to combine multiple version dimensions, e.g. the
 * <em>revision space</em> and the <em>feature space</em>.
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date 	2014-07-28
 * <!-- end-user-doc -->
 * @see de.ubt.ai1.supermod.mm.change.SuperModChangeFactory
 * @model kind="package"
 * @generated
 */
public interface SuperModChangePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "change";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://ai1.uni-bayreuth.de/supermod/change/0.1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "de.ubt.ai1.supermod.mm.change";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SuperModChangePackage eINSTANCE = de.ubt.ai1.supermod.mm.change.impl.SuperModChangePackageImpl.init();

	/**
	 * The meta object id for the '{@link de.ubt.ai1.supermod.mm.change.impl.ChangeDimensionImpl <em>Change Dimension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai1.supermod.mm.change.impl.ChangeDimensionImpl
	 * @see de.ubt.ai1.supermod.mm.change.impl.SuperModChangePackageImpl#getChangeDimension()
	 * @generated
	 */
	int CHANGE_DIMENSION = 0;

	/**
	 * The feature id for the '<em><b>Dimension Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_DIMENSION__DIMENSION_NAME = SuperModCorePackage.VERSION_DIMENSION__DIMENSION_NAME;

	/**
	 * The feature id for the '<em><b>Root Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_DIMENSION__ROOT_ELEMENTS = SuperModCorePackage.VERSION_DIMENSION__ROOT_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_DIMENSION__ALL_ELEMENTS = SuperModCorePackage.VERSION_DIMENSION__ALL_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Options</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_DIMENSION__OPTIONS = SuperModCorePackage.VERSION_DIMENSION__OPTIONS;

	/**
	 * The feature id for the '<em><b>Invariants</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_DIMENSION__INVARIANTS = SuperModCorePackage.VERSION_DIMENSION__INVARIANTS;

	/**
	 * The feature id for the '<em><b>Preferences</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_DIMENSION__PREFERENCES = SuperModCorePackage.VERSION_DIMENSION__PREFERENCES;

	/**
	 * The feature id for the '<em><b>Default Bindings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_DIMENSION__DEFAULT_BINDINGS = SuperModCorePackage.VERSION_DIMENSION__DEFAULT_BINDINGS;

	/**
	 * The feature id for the '<em><b>Root Version Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_DIMENSION__ROOT_VERSION_SPACE_ELEMENTS = SuperModCorePackage.VERSION_DIMENSION__ROOT_VERSION_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Version Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_DIMENSION__ALL_VERSION_SPACE_ELEMENTS = SuperModCorePackage.VERSION_DIMENSION__ALL_VERSION_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Version Space</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_DIMENSION__VERSION_SPACE = SuperModCorePackage.VERSION_DIMENSION__VERSION_SPACE;

	/**
	 * The feature id for the '<em><b>Change Sets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_DIMENSION__CHANGE_SETS = SuperModCorePackage.VERSION_DIMENSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Change Dimension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_DIMENSION_FEATURE_COUNT = SuperModCorePackage.VERSION_DIMENSION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_DIMENSION___VALIDATE__OPTIONBINDING = SuperModCorePackage.VERSION_DIMENSION___VALIDATE__OPTIONBINDING;

	/**
	 * The operation id for the '<em>Is Complete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_DIMENSION___IS_COMPLETE__OPTIONBINDING = SuperModCorePackage.VERSION_DIMENSION___IS_COMPLETE__OPTIONBINDING;

	/**
	 * The operation id for the '<em>Is Satisfiable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_DIMENSION___IS_SATISFIABLE__OPTIONBINDING = SuperModCorePackage.VERSION_DIMENSION___IS_SATISFIABLE__OPTIONBINDING;

	/**
	 * The operation id for the '<em>Apply Preferences</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_DIMENSION___APPLY_PREFERENCES__OPTIONBINDING = SuperModCorePackage.VERSION_DIMENSION___APPLY_PREFERENCES__OPTIONBINDING;

	/**
	 * The operation id for the '<em>Apply Defaults</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_DIMENSION___APPLY_DEFAULTS__OPTIONBINDING = SuperModCorePackage.VERSION_DIMENSION___APPLY_DEFAULTS__OPTIONBINDING;

	/**
	 * The operation id for the '<em>Apply Completions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_DIMENSION___APPLY_COMPLETIONS__OPTIONBINDING = SuperModCorePackage.VERSION_DIMENSION___APPLY_COMPLETIONS__OPTIONBINDING;

	/**
	 * The operation id for the '<em>Get Option</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_DIMENSION___GET_OPTION__STRING = SuperModCorePackage.VERSION_DIMENSION___GET_OPTION__STRING;

	/**
	 * The number of operations of the '<em>Change Dimension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_DIMENSION_OPERATION_COUNT = SuperModCorePackage.VERSION_DIMENSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.ubt.ai1.supermod.mm.change.impl.ChangeImpl <em>Change</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai1.supermod.mm.change.impl.ChangeImpl
	 * @see de.ubt.ai1.supermod.mm.change.impl.SuperModChangePackageImpl#getChange()
	 * @generated
	 */
	int CHANGE = 2;

	/**
	 * The meta object id for the '{@link de.ubt.ai1.supermod.mm.change.impl.ChangeSetImpl <em>Change Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai1.supermod.mm.change.impl.ChangeSetImpl
	 * @see de.ubt.ai1.supermod.mm.change.impl.SuperModChangePackageImpl#getChangeSet()
	 * @generated
	 */
	int CHANGE_SET = 1;

	/**
	 * The feature id for the '<em><b>Super Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_SET__SUPER_ELEMENT = SuperModCorePackage.VERSION_SPACE_ELEMENT__SUPER_ELEMENT;

	/**
	 * The feature id for the '<em><b>Sub Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_SET__SUB_ELEMENTS = SuperModCorePackage.VERSION_SPACE_ELEMENT__SUB_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Super Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_SET__ALL_SUPER_ELEMENTS = SuperModCorePackage.VERSION_SPACE_ELEMENT__ALL_SUPER_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Sub Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_SET__ALL_SUB_ELEMENTS = SuperModCorePackage.VERSION_SPACE_ELEMENT__ALL_SUB_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Cross Referenced Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_SET__CROSS_REFERENCED_ELEMENTS = SuperModCorePackage.VERSION_SPACE_ELEMENT__CROSS_REFERENCED_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Cross Referencing Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_SET__CROSS_REFERENCING_ELEMENTS = SuperModCorePackage.VERSION_SPACE_ELEMENT__CROSS_REFERENCING_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Proxy UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_SET__PROXY_UUID = SuperModCorePackage.VERSION_SPACE_ELEMENT__PROXY_UUID;

	/**
	 * The feature id for the '<em><b>Transaction Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_SET__TRANSACTION_ID = SuperModCorePackage.VERSION_SPACE_ELEMENT__TRANSACTION_ID;

	/**
	 * The feature id for the '<em><b>Version Dimension</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_SET__VERSION_DIMENSION = SuperModCorePackage.VERSION_SPACE_ELEMENT__VERSION_DIMENSION;

	/**
	 * The feature id for the '<em><b>Version Space</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_SET__VERSION_SPACE = SuperModCorePackage.VERSION_SPACE_ELEMENT__VERSION_SPACE;

	/**
	 * The feature id for the '<em><b>Super Version Space Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_SET__SUPER_VERSION_SPACE_ELEMENT = SuperModCorePackage.VERSION_SPACE_ELEMENT__SUPER_VERSION_SPACE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Sub Version Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_SET__SUB_VERSION_SPACE_ELEMENTS = SuperModCorePackage.VERSION_SPACE_ELEMENT__SUB_VERSION_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Super Version Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_SET__ALL_SUPER_VERSION_SPACE_ELEMENTS = SuperModCorePackage.VERSION_SPACE_ELEMENT__ALL_SUPER_VERSION_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Sub Version Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_SET__ALL_SUB_VERSION_SPACE_ELEMENTS = SuperModCorePackage.VERSION_SPACE_ELEMENT__ALL_SUB_VERSION_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Cross Referenced Version Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_SET__CROSS_REFERENCED_VERSION_SPACE_ELEMENTS = SuperModCorePackage.VERSION_SPACE_ELEMENT__CROSS_REFERENCED_VERSION_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Cross Referencing Version Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_SET__CROSS_REFERENCING_VERSION_SPACE_ELEMENTS = SuperModCorePackage.VERSION_SPACE_ELEMENT__CROSS_REFERENCING_VERSION_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Low Level Concepts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_SET__LOW_LEVEL_CONCEPTS = SuperModCorePackage.VERSION_SPACE_ELEMENT__LOW_LEVEL_CONCEPTS;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_SET__UUID = SuperModCorePackage.VERSION_SPACE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Changes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_SET__CHANGES = SuperModCorePackage.VERSION_SPACE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Change Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_SET_FEATURE_COUNT = SuperModCorePackage.VERSION_SPACE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Is Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_SET___IS_PROXY = SuperModCorePackage.VERSION_SPACE_ELEMENT___IS_PROXY;

	/**
	 * The number of operations of the '<em>Change Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_SET_OPERATION_COUNT = SuperModCorePackage.VERSION_SPACE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Super Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE__SUPER_ELEMENT = SuperModCorePackage.VERSION_SPACE_ELEMENT__SUPER_ELEMENT;

	/**
	 * The feature id for the '<em><b>Sub Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE__SUB_ELEMENTS = SuperModCorePackage.VERSION_SPACE_ELEMENT__SUB_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Super Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE__ALL_SUPER_ELEMENTS = SuperModCorePackage.VERSION_SPACE_ELEMENT__ALL_SUPER_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Sub Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE__ALL_SUB_ELEMENTS = SuperModCorePackage.VERSION_SPACE_ELEMENT__ALL_SUB_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Cross Referenced Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE__CROSS_REFERENCED_ELEMENTS = SuperModCorePackage.VERSION_SPACE_ELEMENT__CROSS_REFERENCED_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Cross Referencing Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE__CROSS_REFERENCING_ELEMENTS = SuperModCorePackage.VERSION_SPACE_ELEMENT__CROSS_REFERENCING_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Proxy UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE__PROXY_UUID = SuperModCorePackage.VERSION_SPACE_ELEMENT__PROXY_UUID;

	/**
	 * The feature id for the '<em><b>Transaction Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE__TRANSACTION_ID = SuperModCorePackage.VERSION_SPACE_ELEMENT__TRANSACTION_ID;

	/**
	 * The feature id for the '<em><b>Version Dimension</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE__VERSION_DIMENSION = SuperModCorePackage.VERSION_SPACE_ELEMENT__VERSION_DIMENSION;

	/**
	 * The feature id for the '<em><b>Version Space</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE__VERSION_SPACE = SuperModCorePackage.VERSION_SPACE_ELEMENT__VERSION_SPACE;

	/**
	 * The feature id for the '<em><b>Super Version Space Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE__SUPER_VERSION_SPACE_ELEMENT = SuperModCorePackage.VERSION_SPACE_ELEMENT__SUPER_VERSION_SPACE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Sub Version Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE__SUB_VERSION_SPACE_ELEMENTS = SuperModCorePackage.VERSION_SPACE_ELEMENT__SUB_VERSION_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Super Version Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE__ALL_SUPER_VERSION_SPACE_ELEMENTS = SuperModCorePackage.VERSION_SPACE_ELEMENT__ALL_SUPER_VERSION_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Sub Version Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE__ALL_SUB_VERSION_SPACE_ELEMENTS = SuperModCorePackage.VERSION_SPACE_ELEMENT__ALL_SUB_VERSION_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Cross Referenced Version Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE__CROSS_REFERENCED_VERSION_SPACE_ELEMENTS = SuperModCorePackage.VERSION_SPACE_ELEMENT__CROSS_REFERENCED_VERSION_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Cross Referencing Version Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE__CROSS_REFERENCING_VERSION_SPACE_ELEMENTS = SuperModCorePackage.VERSION_SPACE_ELEMENT__CROSS_REFERENCING_VERSION_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Low Level Concepts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE__LOW_LEVEL_CONCEPTS = SuperModCorePackage.VERSION_SPACE_ELEMENT__LOW_LEVEL_CONCEPTS;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE__UUID = SuperModCorePackage.VERSION_SPACE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Change Option</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE__CHANGE_OPTION = SuperModCorePackage.VERSION_SPACE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Change Preference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE__CHANGE_PREFERENCE = SuperModCorePackage.VERSION_SPACE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Change Invariant</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE__CHANGE_INVARIANT = SuperModCorePackage.VERSION_SPACE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>User Ambition Binding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE__USER_AMBITION_BINDING = SuperModCorePackage.VERSION_SPACE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>User Ambition Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE__USER_AMBITION_EXPR = SuperModCorePackage.VERSION_SPACE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Affected Dimension</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE__AFFECTED_DIMENSION = SuperModCorePackage.VERSION_SPACE_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Change Set</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE__CHANGE_SET = SuperModCorePackage.VERSION_SPACE_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Change</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_FEATURE_COUNT = SuperModCorePackage.VERSION_SPACE_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The operation id for the '<em>Is Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE___IS_PROXY = SuperModCorePackage.VERSION_SPACE_ELEMENT___IS_PROXY;

	/**
	 * The number of operations of the '<em>Change</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_OPERATION_COUNT = SuperModCorePackage.VERSION_SPACE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link de.ubt.ai1.supermod.mm.change.ChangeDimension <em>Change Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Change Dimension</em>'.
	 * @see de.ubt.ai1.supermod.mm.change.ChangeDimension
	 * @generated
	 */
	EClass getChangeDimension();

	/**
	 * Returns the meta object for the containment reference list '{@link de.ubt.ai1.supermod.mm.change.ChangeDimension#getChangeSets <em>Change Sets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Change Sets</em>'.
	 * @see de.ubt.ai1.supermod.mm.change.ChangeDimension#getChangeSets()
	 * @see #getChangeDimension()
	 * @generated
	 */
	EReference getChangeDimension_ChangeSets();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai1.supermod.mm.change.Change <em>Change</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Change</em>'.
	 * @see de.ubt.ai1.supermod.mm.change.Change
	 * @generated
	 */
	EClass getChange();

	/**
	 * Returns the meta object for the containment reference '{@link de.ubt.ai1.supermod.mm.change.Change#getChangeOption <em>Change Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Change Option</em>'.
	 * @see de.ubt.ai1.supermod.mm.change.Change#getChangeOption()
	 * @see #getChange()
	 * @generated
	 */
	EReference getChange_ChangeOption();

	/**
	 * Returns the meta object for the containment reference '{@link de.ubt.ai1.supermod.mm.change.Change#getChangePreference <em>Change Preference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Change Preference</em>'.
	 * @see de.ubt.ai1.supermod.mm.change.Change#getChangePreference()
	 * @see #getChange()
	 * @generated
	 */
	EReference getChange_ChangePreference();

	/**
	 * Returns the meta object for the containment reference '{@link de.ubt.ai1.supermod.mm.change.Change#getChangeInvariant <em>Change Invariant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Change Invariant</em>'.
	 * @see de.ubt.ai1.supermod.mm.change.Change#getChangeInvariant()
	 * @see #getChange()
	 * @generated
	 */
	EReference getChange_ChangeInvariant();

	/**
	 * Returns the meta object for the containment reference '{@link de.ubt.ai1.supermod.mm.change.Change#getUserAmbitionBinding <em>User Ambition Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>User Ambition Binding</em>'.
	 * @see de.ubt.ai1.supermod.mm.change.Change#getUserAmbitionBinding()
	 * @see #getChange()
	 * @generated
	 */
	EReference getChange_UserAmbitionBinding();

	/**
	 * Returns the meta object for the containment reference '{@link de.ubt.ai1.supermod.mm.change.Change#getUserAmbitionExpr <em>User Ambition Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>User Ambition Expr</em>'.
	 * @see de.ubt.ai1.supermod.mm.change.Change#getUserAmbitionExpr()
	 * @see #getChange()
	 * @generated
	 */
	EReference getChange_UserAmbitionExpr();

	/**
	 * Returns the meta object for the reference '{@link de.ubt.ai1.supermod.mm.change.Change#getAffectedDimension <em>Affected Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Affected Dimension</em>'.
	 * @see de.ubt.ai1.supermod.mm.change.Change#getAffectedDimension()
	 * @see #getChange()
	 * @generated
	 */
	EReference getChange_AffectedDimension();

	/**
	 * Returns the meta object for the container reference '{@link de.ubt.ai1.supermod.mm.change.Change#getChangeSet <em>Change Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Change Set</em>'.
	 * @see de.ubt.ai1.supermod.mm.change.Change#getChangeSet()
	 * @see #getChange()
	 * @generated
	 */
	EReference getChange_ChangeSet();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai1.supermod.mm.change.ChangeSet <em>Change Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Change Set</em>'.
	 * @see de.ubt.ai1.supermod.mm.change.ChangeSet
	 * @generated
	 */
	EClass getChangeSet();

	/**
	 * Returns the meta object for the containment reference list '{@link de.ubt.ai1.supermod.mm.change.ChangeSet#getChanges <em>Changes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Changes</em>'.
	 * @see de.ubt.ai1.supermod.mm.change.ChangeSet#getChanges()
	 * @see #getChangeSet()
	 * @generated
	 */
	EReference getChangeSet_Changes();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SuperModChangeFactory getSuperModChangeFactory();

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
		 * The meta object literal for the '{@link de.ubt.ai1.supermod.mm.change.impl.ChangeDimensionImpl <em>Change Dimension</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai1.supermod.mm.change.impl.ChangeDimensionImpl
		 * @see de.ubt.ai1.supermod.mm.change.impl.SuperModChangePackageImpl#getChangeDimension()
		 * @generated
		 */
		EClass CHANGE_DIMENSION = eINSTANCE.getChangeDimension();

		/**
		 * The meta object literal for the '<em><b>Change Sets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANGE_DIMENSION__CHANGE_SETS = eINSTANCE.getChangeDimension_ChangeSets();

		/**
		 * The meta object literal for the '{@link de.ubt.ai1.supermod.mm.change.impl.ChangeImpl <em>Change</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai1.supermod.mm.change.impl.ChangeImpl
		 * @see de.ubt.ai1.supermod.mm.change.impl.SuperModChangePackageImpl#getChange()
		 * @generated
		 */
		EClass CHANGE = eINSTANCE.getChange();

		/**
		 * The meta object literal for the '<em><b>Change Option</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANGE__CHANGE_OPTION = eINSTANCE.getChange_ChangeOption();

		/**
		 * The meta object literal for the '<em><b>Change Preference</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANGE__CHANGE_PREFERENCE = eINSTANCE.getChange_ChangePreference();

		/**
		 * The meta object literal for the '<em><b>Change Invariant</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANGE__CHANGE_INVARIANT = eINSTANCE.getChange_ChangeInvariant();

		/**
		 * The meta object literal for the '<em><b>User Ambition Binding</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANGE__USER_AMBITION_BINDING = eINSTANCE.getChange_UserAmbitionBinding();

		/**
		 * The meta object literal for the '<em><b>User Ambition Expr</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANGE__USER_AMBITION_EXPR = eINSTANCE.getChange_UserAmbitionExpr();

		/**
		 * The meta object literal for the '<em><b>Affected Dimension</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANGE__AFFECTED_DIMENSION = eINSTANCE.getChange_AffectedDimension();

		/**
		 * The meta object literal for the '<em><b>Change Set</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANGE__CHANGE_SET = eINSTANCE.getChange_ChangeSet();

		/**
		 * The meta object literal for the '{@link de.ubt.ai1.supermod.mm.change.impl.ChangeSetImpl <em>Change Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai1.supermod.mm.change.impl.ChangeSetImpl
		 * @see de.ubt.ai1.supermod.mm.change.impl.SuperModChangePackageImpl#getChangeSet()
		 * @generated
		 */
		EClass CHANGE_SET = eINSTANCE.getChangeSet();

		/**
		 * The meta object literal for the '<em><b>Changes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANGE_SET__CHANGES = eINSTANCE.getChangeSet_Changes();

	}

} //SuperModChangePackage
