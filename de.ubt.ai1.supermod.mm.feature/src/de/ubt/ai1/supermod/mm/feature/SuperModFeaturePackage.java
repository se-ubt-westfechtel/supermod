/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.mm.feature;

import org.eclipse.emf.ecore.EAttribute;
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
 * This package contains the <em>feature space</em>, which plays a hybrid role in
 * SuperMod: it is both a product space, whose evolution is recognized, and a
 * version space, which describes versioning rules for further product space
 * dimensions. A single version of a feature model is a tree of features and
 * defines exactly one root element.
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date 	2014-07-28
 * @see		FeatureModel
 * <!-- end-user-doc -->
 * @see de.ubt.ai1.supermod.mm.feature.SuperModFeatureFactory
 * @model kind="package"
 * @generated
 */
public interface SuperModFeaturePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "feature";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://ai1.uni-bayreuth.de/supermod/feature/0.1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "de.ubt.ai1.supermod.mm.feature";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SuperModFeaturePackage eINSTANCE = de.ubt.ai1.supermod.mm.feature.impl.SuperModFeaturePackageImpl.init();

	/**
	 * The meta object id for the '{@link de.ubt.ai1.supermod.mm.feature.impl.FeatureModelImpl <em>Feature Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai1.supermod.mm.feature.impl.FeatureModelImpl
	 * @see de.ubt.ai1.supermod.mm.feature.impl.SuperModFeaturePackageImpl#getFeatureModel()
	 * @generated
	 */
	int FEATURE_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Dimension Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_MODEL__DIMENSION_NAME = SuperModCorePackage.HYBRID_DIMENSION__DIMENSION_NAME;

	/**
	 * The feature id for the '<em><b>Root Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_MODEL__ROOT_ELEMENTS = SuperModCorePackage.HYBRID_DIMENSION__ROOT_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_MODEL__ALL_ELEMENTS = SuperModCorePackage.HYBRID_DIMENSION__ALL_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Options</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_MODEL__OPTIONS = SuperModCorePackage.HYBRID_DIMENSION__OPTIONS;

	/**
	 * The feature id for the '<em><b>Invariants</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_MODEL__INVARIANTS = SuperModCorePackage.HYBRID_DIMENSION__INVARIANTS;

	/**
	 * The feature id for the '<em><b>Preferences</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_MODEL__PREFERENCES = SuperModCorePackage.HYBRID_DIMENSION__PREFERENCES;

	/**
	 * The feature id for the '<em><b>Default Bindings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_MODEL__DEFAULT_BINDINGS = SuperModCorePackage.HYBRID_DIMENSION__DEFAULT_BINDINGS;

	/**
	 * The feature id for the '<em><b>Root Version Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_MODEL__ROOT_VERSION_SPACE_ELEMENTS = SuperModCorePackage.HYBRID_DIMENSION__ROOT_VERSION_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Version Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_MODEL__ALL_VERSION_SPACE_ELEMENTS = SuperModCorePackage.HYBRID_DIMENSION__ALL_VERSION_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Version Space</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_MODEL__VERSION_SPACE = SuperModCorePackage.HYBRID_DIMENSION__VERSION_SPACE;

	/**
	 * The feature id for the '<em><b>Root Product Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_MODEL__ROOT_PRODUCT_SPACE_ELEMENTS = SuperModCorePackage.HYBRID_DIMENSION__ROOT_PRODUCT_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Product Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_MODEL__ALL_PRODUCT_SPACE_ELEMENTS = SuperModCorePackage.HYBRID_DIMENSION__ALL_PRODUCT_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Product Space</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_MODEL__PRODUCT_SPACE = SuperModCorePackage.HYBRID_DIMENSION__PRODUCT_SPACE;

	/**
	 * The feature id for the '<em><b>Root Hybrid Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_MODEL__ROOT_HYBRID_ELEMENTS = SuperModCorePackage.HYBRID_DIMENSION__ROOT_HYBRID_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Hybrid Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_MODEL__ALL_HYBRID_ELEMENTS = SuperModCorePackage.HYBRID_DIMENSION__ALL_HYBRID_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Roots</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_MODEL__ROOTS = SuperModCorePackage.HYBRID_DIMENSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_MODEL__FEATURES = SuperModCorePackage.HYBRID_DIMENSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Feature Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_MODEL_FEATURE_COUNT = SuperModCorePackage.HYBRID_DIMENSION_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_MODEL___VALIDATE__OPTIONBINDING = SuperModCorePackage.HYBRID_DIMENSION___VALIDATE__OPTIONBINDING;

	/**
	 * The operation id for the '<em>Is Complete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_MODEL___IS_COMPLETE__OPTIONBINDING = SuperModCorePackage.HYBRID_DIMENSION___IS_COMPLETE__OPTIONBINDING;

	/**
	 * The operation id for the '<em>Is Satisfiable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_MODEL___IS_SATISFIABLE__OPTIONBINDING = SuperModCorePackage.HYBRID_DIMENSION___IS_SATISFIABLE__OPTIONBINDING;

	/**
	 * The operation id for the '<em>Apply Preferences</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_MODEL___APPLY_PREFERENCES__OPTIONBINDING = SuperModCorePackage.HYBRID_DIMENSION___APPLY_PREFERENCES__OPTIONBINDING;

	/**
	 * The operation id for the '<em>Apply Defaults</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_MODEL___APPLY_DEFAULTS__OPTIONBINDING = SuperModCorePackage.HYBRID_DIMENSION___APPLY_DEFAULTS__OPTIONBINDING;

	/**
	 * The operation id for the '<em>Apply Completions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_MODEL___APPLY_COMPLETIONS__OPTIONBINDING = SuperModCorePackage.HYBRID_DIMENSION___APPLY_COMPLETIONS__OPTIONBINDING;

	/**
	 * The operation id for the '<em>Get Option</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_MODEL___GET_OPTION__STRING = SuperModCorePackage.HYBRID_DIMENSION___GET_OPTION__STRING;

	/**
	 * The number of operations of the '<em>Feature Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_MODEL_OPERATION_COUNT = SuperModCorePackage.HYBRID_DIMENSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.ubt.ai1.supermod.mm.feature.impl.FeatureImpl <em>Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai1.supermod.mm.feature.impl.FeatureImpl
	 * @see de.ubt.ai1.supermod.mm.feature.impl.SuperModFeaturePackageImpl#getFeature()
	 * @generated
	 */
	int FEATURE = 1;

	/**
	 * The feature id for the '<em><b>Super Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__SUPER_ELEMENT = SuperModCorePackage.HYBRID_ELEMENT__SUPER_ELEMENT;

	/**
	 * The feature id for the '<em><b>Sub Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__SUB_ELEMENTS = SuperModCorePackage.HYBRID_ELEMENT__SUB_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Super Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__ALL_SUPER_ELEMENTS = SuperModCorePackage.HYBRID_ELEMENT__ALL_SUPER_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Sub Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__ALL_SUB_ELEMENTS = SuperModCorePackage.HYBRID_ELEMENT__ALL_SUB_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Cross Referenced Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__CROSS_REFERENCED_ELEMENTS = SuperModCorePackage.HYBRID_ELEMENT__CROSS_REFERENCED_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Cross Referencing Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__CROSS_REFERENCING_ELEMENTS = SuperModCorePackage.HYBRID_ELEMENT__CROSS_REFERENCING_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Proxy UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__PROXY_UUID = SuperModCorePackage.HYBRID_ELEMENT__PROXY_UUID;

	/**
	 * The feature id for the '<em><b>Transaction Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__TRANSACTION_ID = SuperModCorePackage.HYBRID_ELEMENT__TRANSACTION_ID;

	/**
	 * The feature id for the '<em><b>Product Dimension</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__PRODUCT_DIMENSION = SuperModCorePackage.HYBRID_ELEMENT__PRODUCT_DIMENSION;

	/**
	 * The feature id for the '<em><b>Product Space</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__PRODUCT_SPACE = SuperModCorePackage.HYBRID_ELEMENT__PRODUCT_SPACE;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__VISIBILITY = SuperModCorePackage.HYBRID_ELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Super Product Space Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__SUPER_PRODUCT_SPACE_ELEMENT = SuperModCorePackage.HYBRID_ELEMENT__SUPER_PRODUCT_SPACE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Sub Product Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__SUB_PRODUCT_SPACE_ELEMENTS = SuperModCorePackage.HYBRID_ELEMENT__SUB_PRODUCT_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Super Product Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__ALL_SUPER_PRODUCT_SPACE_ELEMENTS = SuperModCorePackage.HYBRID_ELEMENT__ALL_SUPER_PRODUCT_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Sub Product Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__ALL_SUB_PRODUCT_SPACE_ELEMENTS = SuperModCorePackage.HYBRID_ELEMENT__ALL_SUB_PRODUCT_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Cross Referenced Product Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__CROSS_REFERENCED_PRODUCT_SPACE_ELEMENTS = SuperModCorePackage.HYBRID_ELEMENT__CROSS_REFERENCED_PRODUCT_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Cross Referencing Product Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__CROSS_REFERENCING_PRODUCT_SPACE_ELEMENTS = SuperModCorePackage.HYBRID_ELEMENT__CROSS_REFERENCING_PRODUCT_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Hierarchical Visibility</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__HIERARCHICAL_VISIBILITY = SuperModCorePackage.HYBRID_ELEMENT__HIERARCHICAL_VISIBILITY;

	/**
	 * The feature id for the '<em><b>Superordinate Visibility</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__SUPERORDINATE_VISIBILITY = SuperModCorePackage.HYBRID_ELEMENT__SUPERORDINATE_VISIBILITY;

	/**
	 * The feature id for the '<em><b>Version Dimension</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__VERSION_DIMENSION = SuperModCorePackage.HYBRID_ELEMENT__VERSION_DIMENSION;

	/**
	 * The feature id for the '<em><b>Version Space</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__VERSION_SPACE = SuperModCorePackage.HYBRID_ELEMENT__VERSION_SPACE;

	/**
	 * The feature id for the '<em><b>Super Version Space Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__SUPER_VERSION_SPACE_ELEMENT = SuperModCorePackage.HYBRID_ELEMENT__SUPER_VERSION_SPACE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Sub Version Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__SUB_VERSION_SPACE_ELEMENTS = SuperModCorePackage.HYBRID_ELEMENT__SUB_VERSION_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Super Version Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__ALL_SUPER_VERSION_SPACE_ELEMENTS = SuperModCorePackage.HYBRID_ELEMENT__ALL_SUPER_VERSION_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Sub Version Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__ALL_SUB_VERSION_SPACE_ELEMENTS = SuperModCorePackage.HYBRID_ELEMENT__ALL_SUB_VERSION_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Cross Referenced Version Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__CROSS_REFERENCED_VERSION_SPACE_ELEMENTS = SuperModCorePackage.HYBRID_ELEMENT__CROSS_REFERENCED_VERSION_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Cross Referencing Version Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__CROSS_REFERENCING_VERSION_SPACE_ELEMENTS = SuperModCorePackage.HYBRID_ELEMENT__CROSS_REFERENCING_VERSION_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Low Level Concepts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__LOW_LEVEL_CONCEPTS = SuperModCorePackage.HYBRID_ELEMENT__LOW_LEVEL_CONCEPTS;

	/**
	 * The feature id for the '<em><b>Super Hybrid Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__SUPER_HYBRID_ELEMENT = SuperModCorePackage.HYBRID_ELEMENT__SUPER_HYBRID_ELEMENT;

	/**
	 * The feature id for the '<em><b>Sub Hybrid Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__SUB_HYBRID_ELEMENTS = SuperModCorePackage.HYBRID_ELEMENT__SUB_HYBRID_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Super Hybrid Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__ALL_SUPER_HYBRID_ELEMENTS = SuperModCorePackage.HYBRID_ELEMENT__ALL_SUPER_HYBRID_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Sub Hybrid Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__ALL_SUB_HYBRID_ELEMENTS = SuperModCorePackage.HYBRID_ELEMENT__ALL_SUB_HYBRID_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Cross Referenced Hybrid Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__CROSS_REFERENCED_HYBRID_ELEMENTS = SuperModCorePackage.HYBRID_ELEMENT__CROSS_REFERENCED_HYBRID_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Cross Referencing Hybrid Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__CROSS_REFERENCING_HYBRID_ELEMENTS = SuperModCorePackage.HYBRID_ELEMENT__CROSS_REFERENCING_HYBRID_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__UUID = SuperModCorePackage.HYBRID_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Feature Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__FEATURE_MODEL = SuperModCorePackage.HYBRID_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Feature Option</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__FEATURE_OPTION = SuperModCorePackage.HYBRID_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Names</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__NAMES = SuperModCorePackage.HYBRID_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__CHILDREN = SuperModCorePackage.HYBRID_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Parents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__PARENTS = SuperModCorePackage.HYBRID_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__GROUPS = SuperModCorePackage.HYBRID_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Grouped By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__GROUPED_BY = SuperModCorePackage.HYBRID_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Incoming Dependencies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__INCOMING_DEPENDENCIES = SuperModCorePackage.HYBRID_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Outgoing Dependencies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__OUTGOING_DEPENDENCIES = SuperModCorePackage.HYBRID_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Mandatory</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__MANDATORY = SuperModCorePackage.HYBRID_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Eliminations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__ELIMINATIONS = SuperModCorePackage.HYBRID_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Incoming Roots</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__INCOMING_ROOTS = SuperModCorePackage.HYBRID_ELEMENT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>All Child Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__ALL_CHILD_FEATURES = SuperModCorePackage.HYBRID_ELEMENT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Transitive Elimination State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__TRANSITIVE_ELIMINATION_STATE = SuperModCorePackage.HYBRID_ELEMENT_FEATURE_COUNT + 14;

	/**
	 * The number of structural features of the '<em>Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_FEATURE_COUNT = SuperModCorePackage.HYBRID_ELEMENT_FEATURE_COUNT + 15;

	/**
	 * The operation id for the '<em>Is Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE___IS_PROXY = SuperModCorePackage.HYBRID_ELEMENT___IS_PROXY;

	/**
	 * The operation id for the '<em>Is Visible</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE___IS_VISIBLE__OPTIONBINDING_VISIBILITYEVALUATIONCACHE = SuperModCorePackage.HYBRID_ELEMENT___IS_VISIBLE__OPTIONBINDING_VISIBILITYEVALUATIONCACHE;

	/**
	 * The operation id for the '<em>Is Visible Hierarchically</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE___IS_VISIBLE_HIERARCHICALLY__OPTIONBINDING_VISIBILITYEVALUATIONCACHE = SuperModCorePackage.HYBRID_ELEMENT___IS_VISIBLE_HIERARCHICALLY__OPTIONBINDING_VISIBILITYEVALUATIONCACHE;

	/**
	 * The number of operations of the '<em>Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OPERATION_COUNT = SuperModCorePackage.HYBRID_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.ubt.ai1.supermod.mm.feature.impl.DisplayNameImpl <em>Display Name</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai1.supermod.mm.feature.impl.DisplayNameImpl
	 * @see de.ubt.ai1.supermod.mm.feature.impl.SuperModFeaturePackageImpl#getDisplayName()
	 * @generated
	 */
	int DISPLAY_NAME = 2;

	/**
	 * The feature id for the '<em><b>Super Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_NAME__SUPER_ELEMENT = SuperModCorePackage.HYBRID_ELEMENT__SUPER_ELEMENT;

	/**
	 * The feature id for the '<em><b>Sub Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_NAME__SUB_ELEMENTS = SuperModCorePackage.HYBRID_ELEMENT__SUB_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Super Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_NAME__ALL_SUPER_ELEMENTS = SuperModCorePackage.HYBRID_ELEMENT__ALL_SUPER_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Sub Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_NAME__ALL_SUB_ELEMENTS = SuperModCorePackage.HYBRID_ELEMENT__ALL_SUB_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Cross Referenced Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_NAME__CROSS_REFERENCED_ELEMENTS = SuperModCorePackage.HYBRID_ELEMENT__CROSS_REFERENCED_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Cross Referencing Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_NAME__CROSS_REFERENCING_ELEMENTS = SuperModCorePackage.HYBRID_ELEMENT__CROSS_REFERENCING_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Proxy UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_NAME__PROXY_UUID = SuperModCorePackage.HYBRID_ELEMENT__PROXY_UUID;

	/**
	 * The feature id for the '<em><b>Transaction Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_NAME__TRANSACTION_ID = SuperModCorePackage.HYBRID_ELEMENT__TRANSACTION_ID;

	/**
	 * The feature id for the '<em><b>Product Dimension</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_NAME__PRODUCT_DIMENSION = SuperModCorePackage.HYBRID_ELEMENT__PRODUCT_DIMENSION;

	/**
	 * The feature id for the '<em><b>Product Space</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_NAME__PRODUCT_SPACE = SuperModCorePackage.HYBRID_ELEMENT__PRODUCT_SPACE;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_NAME__VISIBILITY = SuperModCorePackage.HYBRID_ELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Super Product Space Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_NAME__SUPER_PRODUCT_SPACE_ELEMENT = SuperModCorePackage.HYBRID_ELEMENT__SUPER_PRODUCT_SPACE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Sub Product Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_NAME__SUB_PRODUCT_SPACE_ELEMENTS = SuperModCorePackage.HYBRID_ELEMENT__SUB_PRODUCT_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Super Product Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_NAME__ALL_SUPER_PRODUCT_SPACE_ELEMENTS = SuperModCorePackage.HYBRID_ELEMENT__ALL_SUPER_PRODUCT_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Sub Product Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_NAME__ALL_SUB_PRODUCT_SPACE_ELEMENTS = SuperModCorePackage.HYBRID_ELEMENT__ALL_SUB_PRODUCT_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Cross Referenced Product Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_NAME__CROSS_REFERENCED_PRODUCT_SPACE_ELEMENTS = SuperModCorePackage.HYBRID_ELEMENT__CROSS_REFERENCED_PRODUCT_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Cross Referencing Product Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_NAME__CROSS_REFERENCING_PRODUCT_SPACE_ELEMENTS = SuperModCorePackage.HYBRID_ELEMENT__CROSS_REFERENCING_PRODUCT_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Hierarchical Visibility</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_NAME__HIERARCHICAL_VISIBILITY = SuperModCorePackage.HYBRID_ELEMENT__HIERARCHICAL_VISIBILITY;

	/**
	 * The feature id for the '<em><b>Superordinate Visibility</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_NAME__SUPERORDINATE_VISIBILITY = SuperModCorePackage.HYBRID_ELEMENT__SUPERORDINATE_VISIBILITY;

	/**
	 * The feature id for the '<em><b>Version Dimension</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_NAME__VERSION_DIMENSION = SuperModCorePackage.HYBRID_ELEMENT__VERSION_DIMENSION;

	/**
	 * The feature id for the '<em><b>Version Space</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_NAME__VERSION_SPACE = SuperModCorePackage.HYBRID_ELEMENT__VERSION_SPACE;

	/**
	 * The feature id for the '<em><b>Super Version Space Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_NAME__SUPER_VERSION_SPACE_ELEMENT = SuperModCorePackage.HYBRID_ELEMENT__SUPER_VERSION_SPACE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Sub Version Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_NAME__SUB_VERSION_SPACE_ELEMENTS = SuperModCorePackage.HYBRID_ELEMENT__SUB_VERSION_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Super Version Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_NAME__ALL_SUPER_VERSION_SPACE_ELEMENTS = SuperModCorePackage.HYBRID_ELEMENT__ALL_SUPER_VERSION_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Sub Version Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_NAME__ALL_SUB_VERSION_SPACE_ELEMENTS = SuperModCorePackage.HYBRID_ELEMENT__ALL_SUB_VERSION_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Cross Referenced Version Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_NAME__CROSS_REFERENCED_VERSION_SPACE_ELEMENTS = SuperModCorePackage.HYBRID_ELEMENT__CROSS_REFERENCED_VERSION_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Cross Referencing Version Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_NAME__CROSS_REFERENCING_VERSION_SPACE_ELEMENTS = SuperModCorePackage.HYBRID_ELEMENT__CROSS_REFERENCING_VERSION_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Low Level Concepts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_NAME__LOW_LEVEL_CONCEPTS = SuperModCorePackage.HYBRID_ELEMENT__LOW_LEVEL_CONCEPTS;

	/**
	 * The feature id for the '<em><b>Super Hybrid Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_NAME__SUPER_HYBRID_ELEMENT = SuperModCorePackage.HYBRID_ELEMENT__SUPER_HYBRID_ELEMENT;

	/**
	 * The feature id for the '<em><b>Sub Hybrid Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_NAME__SUB_HYBRID_ELEMENTS = SuperModCorePackage.HYBRID_ELEMENT__SUB_HYBRID_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Super Hybrid Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_NAME__ALL_SUPER_HYBRID_ELEMENTS = SuperModCorePackage.HYBRID_ELEMENT__ALL_SUPER_HYBRID_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Sub Hybrid Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_NAME__ALL_SUB_HYBRID_ELEMENTS = SuperModCorePackage.HYBRID_ELEMENT__ALL_SUB_HYBRID_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Cross Referenced Hybrid Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_NAME__CROSS_REFERENCED_HYBRID_ELEMENTS = SuperModCorePackage.HYBRID_ELEMENT__CROSS_REFERENCED_HYBRID_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Cross Referencing Hybrid Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_NAME__CROSS_REFERENCING_HYBRID_ELEMENTS = SuperModCorePackage.HYBRID_ELEMENT__CROSS_REFERENCING_HYBRID_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_NAME__DISPLAY_NAME = SuperModCorePackage.HYBRID_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_NAME__FEATURE = SuperModCorePackage.HYBRID_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Display Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_NAME_FEATURE_COUNT = SuperModCorePackage.HYBRID_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Is Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_NAME___IS_PROXY = SuperModCorePackage.HYBRID_ELEMENT___IS_PROXY;

	/**
	 * The operation id for the '<em>Is Visible</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_NAME___IS_VISIBLE__OPTIONBINDING_VISIBILITYEVALUATIONCACHE = SuperModCorePackage.HYBRID_ELEMENT___IS_VISIBLE__OPTIONBINDING_VISIBILITYEVALUATIONCACHE;

	/**
	 * The operation id for the '<em>Is Visible Hierarchically</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_NAME___IS_VISIBLE_HIERARCHICALLY__OPTIONBINDING_VISIBILITYEVALUATIONCACHE = SuperModCorePackage.HYBRID_ELEMENT___IS_VISIBLE_HIERARCHICALLY__OPTIONBINDING_VISIBILITYEVALUATIONCACHE;

	/**
	 * The number of operations of the '<em>Display Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_NAME_OPERATION_COUNT = SuperModCorePackage.HYBRID_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.ubt.ai1.supermod.mm.feature.impl.FeatureGroupImpl <em>Feature Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai1.supermod.mm.feature.impl.FeatureGroupImpl
	 * @see de.ubt.ai1.supermod.mm.feature.impl.SuperModFeaturePackageImpl#getFeatureGroup()
	 * @generated
	 */
	int FEATURE_GROUP = 3;

	/**
	 * The feature id for the '<em><b>Super Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_GROUP__SUPER_ELEMENT = SuperModCorePackage.HYBRID_ELEMENT__SUPER_ELEMENT;

	/**
	 * The feature id for the '<em><b>Sub Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_GROUP__SUB_ELEMENTS = SuperModCorePackage.HYBRID_ELEMENT__SUB_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Super Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_GROUP__ALL_SUPER_ELEMENTS = SuperModCorePackage.HYBRID_ELEMENT__ALL_SUPER_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Sub Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_GROUP__ALL_SUB_ELEMENTS = SuperModCorePackage.HYBRID_ELEMENT__ALL_SUB_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Cross Referenced Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_GROUP__CROSS_REFERENCED_ELEMENTS = SuperModCorePackage.HYBRID_ELEMENT__CROSS_REFERENCED_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Cross Referencing Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_GROUP__CROSS_REFERENCING_ELEMENTS = SuperModCorePackage.HYBRID_ELEMENT__CROSS_REFERENCING_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Proxy UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_GROUP__PROXY_UUID = SuperModCorePackage.HYBRID_ELEMENT__PROXY_UUID;

	/**
	 * The feature id for the '<em><b>Transaction Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_GROUP__TRANSACTION_ID = SuperModCorePackage.HYBRID_ELEMENT__TRANSACTION_ID;

	/**
	 * The feature id for the '<em><b>Product Dimension</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_GROUP__PRODUCT_DIMENSION = SuperModCorePackage.HYBRID_ELEMENT__PRODUCT_DIMENSION;

	/**
	 * The feature id for the '<em><b>Product Space</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_GROUP__PRODUCT_SPACE = SuperModCorePackage.HYBRID_ELEMENT__PRODUCT_SPACE;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_GROUP__VISIBILITY = SuperModCorePackage.HYBRID_ELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Super Product Space Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_GROUP__SUPER_PRODUCT_SPACE_ELEMENT = SuperModCorePackage.HYBRID_ELEMENT__SUPER_PRODUCT_SPACE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Sub Product Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_GROUP__SUB_PRODUCT_SPACE_ELEMENTS = SuperModCorePackage.HYBRID_ELEMENT__SUB_PRODUCT_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Super Product Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_GROUP__ALL_SUPER_PRODUCT_SPACE_ELEMENTS = SuperModCorePackage.HYBRID_ELEMENT__ALL_SUPER_PRODUCT_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Sub Product Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_GROUP__ALL_SUB_PRODUCT_SPACE_ELEMENTS = SuperModCorePackage.HYBRID_ELEMENT__ALL_SUB_PRODUCT_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Cross Referenced Product Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_GROUP__CROSS_REFERENCED_PRODUCT_SPACE_ELEMENTS = SuperModCorePackage.HYBRID_ELEMENT__CROSS_REFERENCED_PRODUCT_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Cross Referencing Product Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_GROUP__CROSS_REFERENCING_PRODUCT_SPACE_ELEMENTS = SuperModCorePackage.HYBRID_ELEMENT__CROSS_REFERENCING_PRODUCT_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Hierarchical Visibility</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_GROUP__HIERARCHICAL_VISIBILITY = SuperModCorePackage.HYBRID_ELEMENT__HIERARCHICAL_VISIBILITY;

	/**
	 * The feature id for the '<em><b>Superordinate Visibility</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_GROUP__SUPERORDINATE_VISIBILITY = SuperModCorePackage.HYBRID_ELEMENT__SUPERORDINATE_VISIBILITY;

	/**
	 * The feature id for the '<em><b>Version Dimension</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_GROUP__VERSION_DIMENSION = SuperModCorePackage.HYBRID_ELEMENT__VERSION_DIMENSION;

	/**
	 * The feature id for the '<em><b>Version Space</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_GROUP__VERSION_SPACE = SuperModCorePackage.HYBRID_ELEMENT__VERSION_SPACE;

	/**
	 * The feature id for the '<em><b>Super Version Space Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_GROUP__SUPER_VERSION_SPACE_ELEMENT = SuperModCorePackage.HYBRID_ELEMENT__SUPER_VERSION_SPACE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Sub Version Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_GROUP__SUB_VERSION_SPACE_ELEMENTS = SuperModCorePackage.HYBRID_ELEMENT__SUB_VERSION_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Super Version Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_GROUP__ALL_SUPER_VERSION_SPACE_ELEMENTS = SuperModCorePackage.HYBRID_ELEMENT__ALL_SUPER_VERSION_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Sub Version Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_GROUP__ALL_SUB_VERSION_SPACE_ELEMENTS = SuperModCorePackage.HYBRID_ELEMENT__ALL_SUB_VERSION_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Cross Referenced Version Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_GROUP__CROSS_REFERENCED_VERSION_SPACE_ELEMENTS = SuperModCorePackage.HYBRID_ELEMENT__CROSS_REFERENCED_VERSION_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Cross Referencing Version Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_GROUP__CROSS_REFERENCING_VERSION_SPACE_ELEMENTS = SuperModCorePackage.HYBRID_ELEMENT__CROSS_REFERENCING_VERSION_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Low Level Concepts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_GROUP__LOW_LEVEL_CONCEPTS = SuperModCorePackage.HYBRID_ELEMENT__LOW_LEVEL_CONCEPTS;

	/**
	 * The feature id for the '<em><b>Super Hybrid Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_GROUP__SUPER_HYBRID_ELEMENT = SuperModCorePackage.HYBRID_ELEMENT__SUPER_HYBRID_ELEMENT;

	/**
	 * The feature id for the '<em><b>Sub Hybrid Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_GROUP__SUB_HYBRID_ELEMENTS = SuperModCorePackage.HYBRID_ELEMENT__SUB_HYBRID_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Super Hybrid Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_GROUP__ALL_SUPER_HYBRID_ELEMENTS = SuperModCorePackage.HYBRID_ELEMENT__ALL_SUPER_HYBRID_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Sub Hybrid Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_GROUP__ALL_SUB_HYBRID_ELEMENTS = SuperModCorePackage.HYBRID_ELEMENT__ALL_SUB_HYBRID_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Cross Referenced Hybrid Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_GROUP__CROSS_REFERENCED_HYBRID_ELEMENTS = SuperModCorePackage.HYBRID_ELEMENT__CROSS_REFERENCED_HYBRID_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Cross Referencing Hybrid Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_GROUP__CROSS_REFERENCING_HYBRID_ELEMENTS = SuperModCorePackage.HYBRID_ELEMENT__CROSS_REFERENCING_HYBRID_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_GROUP__UUID = SuperModCorePackage.HYBRID_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Grouped Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_GROUP__GROUPED_FEATURES = SuperModCorePackage.HYBRID_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Group Invariant</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_GROUP__GROUP_INVARIANT = SuperModCorePackage.HYBRID_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Parent Feature</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_GROUP__PARENT_FEATURE = SuperModCorePackage.HYBRID_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Feature Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_GROUP_FEATURE_COUNT = SuperModCorePackage.HYBRID_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Is Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_GROUP___IS_PROXY = SuperModCorePackage.HYBRID_ELEMENT___IS_PROXY;

	/**
	 * The operation id for the '<em>Is Visible</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_GROUP___IS_VISIBLE__OPTIONBINDING_VISIBILITYEVALUATIONCACHE = SuperModCorePackage.HYBRID_ELEMENT___IS_VISIBLE__OPTIONBINDING_VISIBILITYEVALUATIONCACHE;

	/**
	 * The operation id for the '<em>Is Visible Hierarchically</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_GROUP___IS_VISIBLE_HIERARCHICALLY__OPTIONBINDING_VISIBILITYEVALUATIONCACHE = SuperModCorePackage.HYBRID_ELEMENT___IS_VISIBLE_HIERARCHICALLY__OPTIONBINDING_VISIBILITYEVALUATIONCACHE;

	/**
	 * The number of operations of the '<em>Feature Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_GROUP_OPERATION_COUNT = SuperModCorePackage.HYBRID_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.ubt.ai1.supermod.mm.feature.impl.GroupMembershipImpl <em>Group Membership</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai1.supermod.mm.feature.impl.GroupMembershipImpl
	 * @see de.ubt.ai1.supermod.mm.feature.impl.SuperModFeaturePackageImpl#getGroupMembership()
	 * @generated
	 */
	int GROUP_MEMBERSHIP = 4;

	/**
	 * The feature id for the '<em><b>Super Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_MEMBERSHIP__SUPER_ELEMENT = SuperModCorePackage.HYBRID_ELEMENT__SUPER_ELEMENT;

	/**
	 * The feature id for the '<em><b>Sub Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_MEMBERSHIP__SUB_ELEMENTS = SuperModCorePackage.HYBRID_ELEMENT__SUB_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Super Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_MEMBERSHIP__ALL_SUPER_ELEMENTS = SuperModCorePackage.HYBRID_ELEMENT__ALL_SUPER_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Sub Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_MEMBERSHIP__ALL_SUB_ELEMENTS = SuperModCorePackage.HYBRID_ELEMENT__ALL_SUB_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Cross Referenced Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_MEMBERSHIP__CROSS_REFERENCED_ELEMENTS = SuperModCorePackage.HYBRID_ELEMENT__CROSS_REFERENCED_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Cross Referencing Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_MEMBERSHIP__CROSS_REFERENCING_ELEMENTS = SuperModCorePackage.HYBRID_ELEMENT__CROSS_REFERENCING_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Proxy UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_MEMBERSHIP__PROXY_UUID = SuperModCorePackage.HYBRID_ELEMENT__PROXY_UUID;

	/**
	 * The feature id for the '<em><b>Transaction Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_MEMBERSHIP__TRANSACTION_ID = SuperModCorePackage.HYBRID_ELEMENT__TRANSACTION_ID;

	/**
	 * The feature id for the '<em><b>Product Dimension</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_MEMBERSHIP__PRODUCT_DIMENSION = SuperModCorePackage.HYBRID_ELEMENT__PRODUCT_DIMENSION;

	/**
	 * The feature id for the '<em><b>Product Space</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_MEMBERSHIP__PRODUCT_SPACE = SuperModCorePackage.HYBRID_ELEMENT__PRODUCT_SPACE;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_MEMBERSHIP__VISIBILITY = SuperModCorePackage.HYBRID_ELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Super Product Space Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_MEMBERSHIP__SUPER_PRODUCT_SPACE_ELEMENT = SuperModCorePackage.HYBRID_ELEMENT__SUPER_PRODUCT_SPACE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Sub Product Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_MEMBERSHIP__SUB_PRODUCT_SPACE_ELEMENTS = SuperModCorePackage.HYBRID_ELEMENT__SUB_PRODUCT_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Super Product Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_MEMBERSHIP__ALL_SUPER_PRODUCT_SPACE_ELEMENTS = SuperModCorePackage.HYBRID_ELEMENT__ALL_SUPER_PRODUCT_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Sub Product Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_MEMBERSHIP__ALL_SUB_PRODUCT_SPACE_ELEMENTS = SuperModCorePackage.HYBRID_ELEMENT__ALL_SUB_PRODUCT_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Cross Referenced Product Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_MEMBERSHIP__CROSS_REFERENCED_PRODUCT_SPACE_ELEMENTS = SuperModCorePackage.HYBRID_ELEMENT__CROSS_REFERENCED_PRODUCT_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Cross Referencing Product Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_MEMBERSHIP__CROSS_REFERENCING_PRODUCT_SPACE_ELEMENTS = SuperModCorePackage.HYBRID_ELEMENT__CROSS_REFERENCING_PRODUCT_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Hierarchical Visibility</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_MEMBERSHIP__HIERARCHICAL_VISIBILITY = SuperModCorePackage.HYBRID_ELEMENT__HIERARCHICAL_VISIBILITY;

	/**
	 * The feature id for the '<em><b>Superordinate Visibility</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_MEMBERSHIP__SUPERORDINATE_VISIBILITY = SuperModCorePackage.HYBRID_ELEMENT__SUPERORDINATE_VISIBILITY;

	/**
	 * The feature id for the '<em><b>Version Dimension</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_MEMBERSHIP__VERSION_DIMENSION = SuperModCorePackage.HYBRID_ELEMENT__VERSION_DIMENSION;

	/**
	 * The feature id for the '<em><b>Version Space</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_MEMBERSHIP__VERSION_SPACE = SuperModCorePackage.HYBRID_ELEMENT__VERSION_SPACE;

	/**
	 * The feature id for the '<em><b>Super Version Space Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_MEMBERSHIP__SUPER_VERSION_SPACE_ELEMENT = SuperModCorePackage.HYBRID_ELEMENT__SUPER_VERSION_SPACE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Sub Version Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_MEMBERSHIP__SUB_VERSION_SPACE_ELEMENTS = SuperModCorePackage.HYBRID_ELEMENT__SUB_VERSION_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Super Version Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_MEMBERSHIP__ALL_SUPER_VERSION_SPACE_ELEMENTS = SuperModCorePackage.HYBRID_ELEMENT__ALL_SUPER_VERSION_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Sub Version Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_MEMBERSHIP__ALL_SUB_VERSION_SPACE_ELEMENTS = SuperModCorePackage.HYBRID_ELEMENT__ALL_SUB_VERSION_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Cross Referenced Version Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_MEMBERSHIP__CROSS_REFERENCED_VERSION_SPACE_ELEMENTS = SuperModCorePackage.HYBRID_ELEMENT__CROSS_REFERENCED_VERSION_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Cross Referencing Version Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_MEMBERSHIP__CROSS_REFERENCING_VERSION_SPACE_ELEMENTS = SuperModCorePackage.HYBRID_ELEMENT__CROSS_REFERENCING_VERSION_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Low Level Concepts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_MEMBERSHIP__LOW_LEVEL_CONCEPTS = SuperModCorePackage.HYBRID_ELEMENT__LOW_LEVEL_CONCEPTS;

	/**
	 * The feature id for the '<em><b>Super Hybrid Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_MEMBERSHIP__SUPER_HYBRID_ELEMENT = SuperModCorePackage.HYBRID_ELEMENT__SUPER_HYBRID_ELEMENT;

	/**
	 * The feature id for the '<em><b>Sub Hybrid Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_MEMBERSHIP__SUB_HYBRID_ELEMENTS = SuperModCorePackage.HYBRID_ELEMENT__SUB_HYBRID_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Super Hybrid Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_MEMBERSHIP__ALL_SUPER_HYBRID_ELEMENTS = SuperModCorePackage.HYBRID_ELEMENT__ALL_SUPER_HYBRID_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Sub Hybrid Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_MEMBERSHIP__ALL_SUB_HYBRID_ELEMENTS = SuperModCorePackage.HYBRID_ELEMENT__ALL_SUB_HYBRID_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Cross Referenced Hybrid Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_MEMBERSHIP__CROSS_REFERENCED_HYBRID_ELEMENTS = SuperModCorePackage.HYBRID_ELEMENT__CROSS_REFERENCED_HYBRID_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Cross Referencing Hybrid Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_MEMBERSHIP__CROSS_REFERENCING_HYBRID_ELEMENTS = SuperModCorePackage.HYBRID_ELEMENT__CROSS_REFERENCING_HYBRID_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Grouped Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_MEMBERSHIP__GROUPED_FEATURE = SuperModCorePackage.HYBRID_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_MEMBERSHIP__GROUP = SuperModCorePackage.HYBRID_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Group Membership</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_MEMBERSHIP_FEATURE_COUNT = SuperModCorePackage.HYBRID_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Is Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_MEMBERSHIP___IS_PROXY = SuperModCorePackage.HYBRID_ELEMENT___IS_PROXY;

	/**
	 * The operation id for the '<em>Is Visible</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_MEMBERSHIP___IS_VISIBLE__OPTIONBINDING_VISIBILITYEVALUATIONCACHE = SuperModCorePackage.HYBRID_ELEMENT___IS_VISIBLE__OPTIONBINDING_VISIBILITYEVALUATIONCACHE;

	/**
	 * The operation id for the '<em>Is Visible Hierarchically</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_MEMBERSHIP___IS_VISIBLE_HIERARCHICALLY__OPTIONBINDING_VISIBILITYEVALUATIONCACHE = SuperModCorePackage.HYBRID_ELEMENT___IS_VISIBLE_HIERARCHICALLY__OPTIONBINDING_VISIBILITYEVALUATIONCACHE;

	/**
	 * The number of operations of the '<em>Group Membership</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_MEMBERSHIP_OPERATION_COUNT = SuperModCorePackage.HYBRID_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.ubt.ai1.supermod.mm.feature.impl.OrFeatureGroupImpl <em>Or Feature Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai1.supermod.mm.feature.impl.OrFeatureGroupImpl
	 * @see de.ubt.ai1.supermod.mm.feature.impl.SuperModFeaturePackageImpl#getOrFeatureGroup()
	 * @generated
	 */
	int OR_FEATURE_GROUP = 5;

	/**
	 * The feature id for the '<em><b>Super Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_FEATURE_GROUP__SUPER_ELEMENT = FEATURE_GROUP__SUPER_ELEMENT;

	/**
	 * The feature id for the '<em><b>Sub Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_FEATURE_GROUP__SUB_ELEMENTS = FEATURE_GROUP__SUB_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Super Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_FEATURE_GROUP__ALL_SUPER_ELEMENTS = FEATURE_GROUP__ALL_SUPER_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Sub Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_FEATURE_GROUP__ALL_SUB_ELEMENTS = FEATURE_GROUP__ALL_SUB_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Cross Referenced Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_FEATURE_GROUP__CROSS_REFERENCED_ELEMENTS = FEATURE_GROUP__CROSS_REFERENCED_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Cross Referencing Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_FEATURE_GROUP__CROSS_REFERENCING_ELEMENTS = FEATURE_GROUP__CROSS_REFERENCING_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Proxy UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_FEATURE_GROUP__PROXY_UUID = FEATURE_GROUP__PROXY_UUID;

	/**
	 * The feature id for the '<em><b>Transaction Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_FEATURE_GROUP__TRANSACTION_ID = FEATURE_GROUP__TRANSACTION_ID;

	/**
	 * The feature id for the '<em><b>Product Dimension</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_FEATURE_GROUP__PRODUCT_DIMENSION = FEATURE_GROUP__PRODUCT_DIMENSION;

	/**
	 * The feature id for the '<em><b>Product Space</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_FEATURE_GROUP__PRODUCT_SPACE = FEATURE_GROUP__PRODUCT_SPACE;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_FEATURE_GROUP__VISIBILITY = FEATURE_GROUP__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Super Product Space Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_FEATURE_GROUP__SUPER_PRODUCT_SPACE_ELEMENT = FEATURE_GROUP__SUPER_PRODUCT_SPACE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Sub Product Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_FEATURE_GROUP__SUB_PRODUCT_SPACE_ELEMENTS = FEATURE_GROUP__SUB_PRODUCT_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Super Product Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_FEATURE_GROUP__ALL_SUPER_PRODUCT_SPACE_ELEMENTS = FEATURE_GROUP__ALL_SUPER_PRODUCT_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Sub Product Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_FEATURE_GROUP__ALL_SUB_PRODUCT_SPACE_ELEMENTS = FEATURE_GROUP__ALL_SUB_PRODUCT_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Cross Referenced Product Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_FEATURE_GROUP__CROSS_REFERENCED_PRODUCT_SPACE_ELEMENTS = FEATURE_GROUP__CROSS_REFERENCED_PRODUCT_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Cross Referencing Product Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_FEATURE_GROUP__CROSS_REFERENCING_PRODUCT_SPACE_ELEMENTS = FEATURE_GROUP__CROSS_REFERENCING_PRODUCT_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Hierarchical Visibility</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_FEATURE_GROUP__HIERARCHICAL_VISIBILITY = FEATURE_GROUP__HIERARCHICAL_VISIBILITY;

	/**
	 * The feature id for the '<em><b>Superordinate Visibility</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_FEATURE_GROUP__SUPERORDINATE_VISIBILITY = FEATURE_GROUP__SUPERORDINATE_VISIBILITY;

	/**
	 * The feature id for the '<em><b>Version Dimension</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_FEATURE_GROUP__VERSION_DIMENSION = FEATURE_GROUP__VERSION_DIMENSION;

	/**
	 * The feature id for the '<em><b>Version Space</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_FEATURE_GROUP__VERSION_SPACE = FEATURE_GROUP__VERSION_SPACE;

	/**
	 * The feature id for the '<em><b>Super Version Space Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_FEATURE_GROUP__SUPER_VERSION_SPACE_ELEMENT = FEATURE_GROUP__SUPER_VERSION_SPACE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Sub Version Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_FEATURE_GROUP__SUB_VERSION_SPACE_ELEMENTS = FEATURE_GROUP__SUB_VERSION_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Super Version Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_FEATURE_GROUP__ALL_SUPER_VERSION_SPACE_ELEMENTS = FEATURE_GROUP__ALL_SUPER_VERSION_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Sub Version Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_FEATURE_GROUP__ALL_SUB_VERSION_SPACE_ELEMENTS = FEATURE_GROUP__ALL_SUB_VERSION_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Cross Referenced Version Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_FEATURE_GROUP__CROSS_REFERENCED_VERSION_SPACE_ELEMENTS = FEATURE_GROUP__CROSS_REFERENCED_VERSION_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Cross Referencing Version Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_FEATURE_GROUP__CROSS_REFERENCING_VERSION_SPACE_ELEMENTS = FEATURE_GROUP__CROSS_REFERENCING_VERSION_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Low Level Concepts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_FEATURE_GROUP__LOW_LEVEL_CONCEPTS = FEATURE_GROUP__LOW_LEVEL_CONCEPTS;

	/**
	 * The feature id for the '<em><b>Super Hybrid Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_FEATURE_GROUP__SUPER_HYBRID_ELEMENT = FEATURE_GROUP__SUPER_HYBRID_ELEMENT;

	/**
	 * The feature id for the '<em><b>Sub Hybrid Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_FEATURE_GROUP__SUB_HYBRID_ELEMENTS = FEATURE_GROUP__SUB_HYBRID_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Super Hybrid Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_FEATURE_GROUP__ALL_SUPER_HYBRID_ELEMENTS = FEATURE_GROUP__ALL_SUPER_HYBRID_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Sub Hybrid Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_FEATURE_GROUP__ALL_SUB_HYBRID_ELEMENTS = FEATURE_GROUP__ALL_SUB_HYBRID_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Cross Referenced Hybrid Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_FEATURE_GROUP__CROSS_REFERENCED_HYBRID_ELEMENTS = FEATURE_GROUP__CROSS_REFERENCED_HYBRID_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Cross Referencing Hybrid Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_FEATURE_GROUP__CROSS_REFERENCING_HYBRID_ELEMENTS = FEATURE_GROUP__CROSS_REFERENCING_HYBRID_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_FEATURE_GROUP__UUID = FEATURE_GROUP__UUID;

	/**
	 * The feature id for the '<em><b>Grouped Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_FEATURE_GROUP__GROUPED_FEATURES = FEATURE_GROUP__GROUPED_FEATURES;

	/**
	 * The feature id for the '<em><b>Group Invariant</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_FEATURE_GROUP__GROUP_INVARIANT = FEATURE_GROUP__GROUP_INVARIANT;

	/**
	 * The feature id for the '<em><b>Parent Feature</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_FEATURE_GROUP__PARENT_FEATURE = FEATURE_GROUP__PARENT_FEATURE;

	/**
	 * The number of structural features of the '<em>Or Feature Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_FEATURE_GROUP_FEATURE_COUNT = FEATURE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_FEATURE_GROUP___IS_PROXY = FEATURE_GROUP___IS_PROXY;

	/**
	 * The operation id for the '<em>Is Visible</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_FEATURE_GROUP___IS_VISIBLE__OPTIONBINDING_VISIBILITYEVALUATIONCACHE = FEATURE_GROUP___IS_VISIBLE__OPTIONBINDING_VISIBILITYEVALUATIONCACHE;

	/**
	 * The operation id for the '<em>Is Visible Hierarchically</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_FEATURE_GROUP___IS_VISIBLE_HIERARCHICALLY__OPTIONBINDING_VISIBILITYEVALUATIONCACHE = FEATURE_GROUP___IS_VISIBLE_HIERARCHICALLY__OPTIONBINDING_VISIBILITYEVALUATIONCACHE;

	/**
	 * The number of operations of the '<em>Or Feature Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_FEATURE_GROUP_OPERATION_COUNT = FEATURE_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.ubt.ai1.supermod.mm.feature.impl.XorFeatureGroupImpl <em>Xor Feature Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai1.supermod.mm.feature.impl.XorFeatureGroupImpl
	 * @see de.ubt.ai1.supermod.mm.feature.impl.SuperModFeaturePackageImpl#getXorFeatureGroup()
	 * @generated
	 */
	int XOR_FEATURE_GROUP = 6;

	/**
	 * The feature id for the '<em><b>Super Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR_FEATURE_GROUP__SUPER_ELEMENT = FEATURE_GROUP__SUPER_ELEMENT;

	/**
	 * The feature id for the '<em><b>Sub Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR_FEATURE_GROUP__SUB_ELEMENTS = FEATURE_GROUP__SUB_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Super Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR_FEATURE_GROUP__ALL_SUPER_ELEMENTS = FEATURE_GROUP__ALL_SUPER_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Sub Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR_FEATURE_GROUP__ALL_SUB_ELEMENTS = FEATURE_GROUP__ALL_SUB_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Cross Referenced Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR_FEATURE_GROUP__CROSS_REFERENCED_ELEMENTS = FEATURE_GROUP__CROSS_REFERENCED_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Cross Referencing Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR_FEATURE_GROUP__CROSS_REFERENCING_ELEMENTS = FEATURE_GROUP__CROSS_REFERENCING_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Proxy UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR_FEATURE_GROUP__PROXY_UUID = FEATURE_GROUP__PROXY_UUID;

	/**
	 * The feature id for the '<em><b>Transaction Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR_FEATURE_GROUP__TRANSACTION_ID = FEATURE_GROUP__TRANSACTION_ID;

	/**
	 * The feature id for the '<em><b>Product Dimension</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR_FEATURE_GROUP__PRODUCT_DIMENSION = FEATURE_GROUP__PRODUCT_DIMENSION;

	/**
	 * The feature id for the '<em><b>Product Space</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR_FEATURE_GROUP__PRODUCT_SPACE = FEATURE_GROUP__PRODUCT_SPACE;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR_FEATURE_GROUP__VISIBILITY = FEATURE_GROUP__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Super Product Space Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR_FEATURE_GROUP__SUPER_PRODUCT_SPACE_ELEMENT = FEATURE_GROUP__SUPER_PRODUCT_SPACE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Sub Product Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR_FEATURE_GROUP__SUB_PRODUCT_SPACE_ELEMENTS = FEATURE_GROUP__SUB_PRODUCT_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Super Product Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR_FEATURE_GROUP__ALL_SUPER_PRODUCT_SPACE_ELEMENTS = FEATURE_GROUP__ALL_SUPER_PRODUCT_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Sub Product Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR_FEATURE_GROUP__ALL_SUB_PRODUCT_SPACE_ELEMENTS = FEATURE_GROUP__ALL_SUB_PRODUCT_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Cross Referenced Product Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR_FEATURE_GROUP__CROSS_REFERENCED_PRODUCT_SPACE_ELEMENTS = FEATURE_GROUP__CROSS_REFERENCED_PRODUCT_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Cross Referencing Product Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR_FEATURE_GROUP__CROSS_REFERENCING_PRODUCT_SPACE_ELEMENTS = FEATURE_GROUP__CROSS_REFERENCING_PRODUCT_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Hierarchical Visibility</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR_FEATURE_GROUP__HIERARCHICAL_VISIBILITY = FEATURE_GROUP__HIERARCHICAL_VISIBILITY;

	/**
	 * The feature id for the '<em><b>Superordinate Visibility</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR_FEATURE_GROUP__SUPERORDINATE_VISIBILITY = FEATURE_GROUP__SUPERORDINATE_VISIBILITY;

	/**
	 * The feature id for the '<em><b>Version Dimension</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR_FEATURE_GROUP__VERSION_DIMENSION = FEATURE_GROUP__VERSION_DIMENSION;

	/**
	 * The feature id for the '<em><b>Version Space</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR_FEATURE_GROUP__VERSION_SPACE = FEATURE_GROUP__VERSION_SPACE;

	/**
	 * The feature id for the '<em><b>Super Version Space Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR_FEATURE_GROUP__SUPER_VERSION_SPACE_ELEMENT = FEATURE_GROUP__SUPER_VERSION_SPACE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Sub Version Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR_FEATURE_GROUP__SUB_VERSION_SPACE_ELEMENTS = FEATURE_GROUP__SUB_VERSION_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Super Version Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR_FEATURE_GROUP__ALL_SUPER_VERSION_SPACE_ELEMENTS = FEATURE_GROUP__ALL_SUPER_VERSION_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Sub Version Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR_FEATURE_GROUP__ALL_SUB_VERSION_SPACE_ELEMENTS = FEATURE_GROUP__ALL_SUB_VERSION_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Cross Referenced Version Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR_FEATURE_GROUP__CROSS_REFERENCED_VERSION_SPACE_ELEMENTS = FEATURE_GROUP__CROSS_REFERENCED_VERSION_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Cross Referencing Version Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR_FEATURE_GROUP__CROSS_REFERENCING_VERSION_SPACE_ELEMENTS = FEATURE_GROUP__CROSS_REFERENCING_VERSION_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Low Level Concepts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR_FEATURE_GROUP__LOW_LEVEL_CONCEPTS = FEATURE_GROUP__LOW_LEVEL_CONCEPTS;

	/**
	 * The feature id for the '<em><b>Super Hybrid Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR_FEATURE_GROUP__SUPER_HYBRID_ELEMENT = FEATURE_GROUP__SUPER_HYBRID_ELEMENT;

	/**
	 * The feature id for the '<em><b>Sub Hybrid Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR_FEATURE_GROUP__SUB_HYBRID_ELEMENTS = FEATURE_GROUP__SUB_HYBRID_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Super Hybrid Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR_FEATURE_GROUP__ALL_SUPER_HYBRID_ELEMENTS = FEATURE_GROUP__ALL_SUPER_HYBRID_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Sub Hybrid Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR_FEATURE_GROUP__ALL_SUB_HYBRID_ELEMENTS = FEATURE_GROUP__ALL_SUB_HYBRID_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Cross Referenced Hybrid Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR_FEATURE_GROUP__CROSS_REFERENCED_HYBRID_ELEMENTS = FEATURE_GROUP__CROSS_REFERENCED_HYBRID_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Cross Referencing Hybrid Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR_FEATURE_GROUP__CROSS_REFERENCING_HYBRID_ELEMENTS = FEATURE_GROUP__CROSS_REFERENCING_HYBRID_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR_FEATURE_GROUP__UUID = FEATURE_GROUP__UUID;

	/**
	 * The feature id for the '<em><b>Grouped Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR_FEATURE_GROUP__GROUPED_FEATURES = FEATURE_GROUP__GROUPED_FEATURES;

	/**
	 * The feature id for the '<em><b>Group Invariant</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR_FEATURE_GROUP__GROUP_INVARIANT = FEATURE_GROUP__GROUP_INVARIANT;

	/**
	 * The feature id for the '<em><b>Parent Feature</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR_FEATURE_GROUP__PARENT_FEATURE = FEATURE_GROUP__PARENT_FEATURE;

	/**
	 * The number of structural features of the '<em>Xor Feature Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR_FEATURE_GROUP_FEATURE_COUNT = FEATURE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR_FEATURE_GROUP___IS_PROXY = FEATURE_GROUP___IS_PROXY;

	/**
	 * The operation id for the '<em>Is Visible</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR_FEATURE_GROUP___IS_VISIBLE__OPTIONBINDING_VISIBILITYEVALUATIONCACHE = FEATURE_GROUP___IS_VISIBLE__OPTIONBINDING_VISIBILITYEVALUATIONCACHE;

	/**
	 * The operation id for the '<em>Is Visible Hierarchically</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR_FEATURE_GROUP___IS_VISIBLE_HIERARCHICALLY__OPTIONBINDING_VISIBILITYEVALUATIONCACHE = FEATURE_GROUP___IS_VISIBLE_HIERARCHICALLY__OPTIONBINDING_VISIBILITYEVALUATIONCACHE;

	/**
	 * The number of operations of the '<em>Xor Feature Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR_FEATURE_GROUP_OPERATION_COUNT = FEATURE_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.ubt.ai1.supermod.mm.feature.impl.FeatureDependencyImpl <em>Feature Dependency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai1.supermod.mm.feature.impl.FeatureDependencyImpl
	 * @see de.ubt.ai1.supermod.mm.feature.impl.SuperModFeaturePackageImpl#getFeatureDependency()
	 * @generated
	 */
	int FEATURE_DEPENDENCY = 7;

	/**
	 * The feature id for the '<em><b>Super Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_DEPENDENCY__SUPER_ELEMENT = SuperModCorePackage.HYBRID_ELEMENT__SUPER_ELEMENT;

	/**
	 * The feature id for the '<em><b>Sub Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_DEPENDENCY__SUB_ELEMENTS = SuperModCorePackage.HYBRID_ELEMENT__SUB_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Super Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_DEPENDENCY__ALL_SUPER_ELEMENTS = SuperModCorePackage.HYBRID_ELEMENT__ALL_SUPER_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Sub Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_DEPENDENCY__ALL_SUB_ELEMENTS = SuperModCorePackage.HYBRID_ELEMENT__ALL_SUB_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Cross Referenced Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_DEPENDENCY__CROSS_REFERENCED_ELEMENTS = SuperModCorePackage.HYBRID_ELEMENT__CROSS_REFERENCED_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Cross Referencing Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_DEPENDENCY__CROSS_REFERENCING_ELEMENTS = SuperModCorePackage.HYBRID_ELEMENT__CROSS_REFERENCING_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Proxy UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_DEPENDENCY__PROXY_UUID = SuperModCorePackage.HYBRID_ELEMENT__PROXY_UUID;

	/**
	 * The feature id for the '<em><b>Transaction Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_DEPENDENCY__TRANSACTION_ID = SuperModCorePackage.HYBRID_ELEMENT__TRANSACTION_ID;

	/**
	 * The feature id for the '<em><b>Product Dimension</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_DEPENDENCY__PRODUCT_DIMENSION = SuperModCorePackage.HYBRID_ELEMENT__PRODUCT_DIMENSION;

	/**
	 * The feature id for the '<em><b>Product Space</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_DEPENDENCY__PRODUCT_SPACE = SuperModCorePackage.HYBRID_ELEMENT__PRODUCT_SPACE;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_DEPENDENCY__VISIBILITY = SuperModCorePackage.HYBRID_ELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Super Product Space Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_DEPENDENCY__SUPER_PRODUCT_SPACE_ELEMENT = SuperModCorePackage.HYBRID_ELEMENT__SUPER_PRODUCT_SPACE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Sub Product Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_DEPENDENCY__SUB_PRODUCT_SPACE_ELEMENTS = SuperModCorePackage.HYBRID_ELEMENT__SUB_PRODUCT_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Super Product Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_DEPENDENCY__ALL_SUPER_PRODUCT_SPACE_ELEMENTS = SuperModCorePackage.HYBRID_ELEMENT__ALL_SUPER_PRODUCT_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Sub Product Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_DEPENDENCY__ALL_SUB_PRODUCT_SPACE_ELEMENTS = SuperModCorePackage.HYBRID_ELEMENT__ALL_SUB_PRODUCT_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Cross Referenced Product Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_DEPENDENCY__CROSS_REFERENCED_PRODUCT_SPACE_ELEMENTS = SuperModCorePackage.HYBRID_ELEMENT__CROSS_REFERENCED_PRODUCT_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Cross Referencing Product Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_DEPENDENCY__CROSS_REFERENCING_PRODUCT_SPACE_ELEMENTS = SuperModCorePackage.HYBRID_ELEMENT__CROSS_REFERENCING_PRODUCT_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Hierarchical Visibility</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_DEPENDENCY__HIERARCHICAL_VISIBILITY = SuperModCorePackage.HYBRID_ELEMENT__HIERARCHICAL_VISIBILITY;

	/**
	 * The feature id for the '<em><b>Superordinate Visibility</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_DEPENDENCY__SUPERORDINATE_VISIBILITY = SuperModCorePackage.HYBRID_ELEMENT__SUPERORDINATE_VISIBILITY;

	/**
	 * The feature id for the '<em><b>Version Dimension</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_DEPENDENCY__VERSION_DIMENSION = SuperModCorePackage.HYBRID_ELEMENT__VERSION_DIMENSION;

	/**
	 * The feature id for the '<em><b>Version Space</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_DEPENDENCY__VERSION_SPACE = SuperModCorePackage.HYBRID_ELEMENT__VERSION_SPACE;

	/**
	 * The feature id for the '<em><b>Super Version Space Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_DEPENDENCY__SUPER_VERSION_SPACE_ELEMENT = SuperModCorePackage.HYBRID_ELEMENT__SUPER_VERSION_SPACE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Sub Version Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_DEPENDENCY__SUB_VERSION_SPACE_ELEMENTS = SuperModCorePackage.HYBRID_ELEMENT__SUB_VERSION_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Super Version Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_DEPENDENCY__ALL_SUPER_VERSION_SPACE_ELEMENTS = SuperModCorePackage.HYBRID_ELEMENT__ALL_SUPER_VERSION_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Sub Version Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_DEPENDENCY__ALL_SUB_VERSION_SPACE_ELEMENTS = SuperModCorePackage.HYBRID_ELEMENT__ALL_SUB_VERSION_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Cross Referenced Version Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_DEPENDENCY__CROSS_REFERENCED_VERSION_SPACE_ELEMENTS = SuperModCorePackage.HYBRID_ELEMENT__CROSS_REFERENCED_VERSION_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Cross Referencing Version Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_DEPENDENCY__CROSS_REFERENCING_VERSION_SPACE_ELEMENTS = SuperModCorePackage.HYBRID_ELEMENT__CROSS_REFERENCING_VERSION_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Low Level Concepts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_DEPENDENCY__LOW_LEVEL_CONCEPTS = SuperModCorePackage.HYBRID_ELEMENT__LOW_LEVEL_CONCEPTS;

	/**
	 * The feature id for the '<em><b>Super Hybrid Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_DEPENDENCY__SUPER_HYBRID_ELEMENT = SuperModCorePackage.HYBRID_ELEMENT__SUPER_HYBRID_ELEMENT;

	/**
	 * The feature id for the '<em><b>Sub Hybrid Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_DEPENDENCY__SUB_HYBRID_ELEMENTS = SuperModCorePackage.HYBRID_ELEMENT__SUB_HYBRID_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Super Hybrid Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_DEPENDENCY__ALL_SUPER_HYBRID_ELEMENTS = SuperModCorePackage.HYBRID_ELEMENT__ALL_SUPER_HYBRID_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Sub Hybrid Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_DEPENDENCY__ALL_SUB_HYBRID_ELEMENTS = SuperModCorePackage.HYBRID_ELEMENT__ALL_SUB_HYBRID_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Cross Referenced Hybrid Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_DEPENDENCY__CROSS_REFERENCED_HYBRID_ELEMENTS = SuperModCorePackage.HYBRID_ELEMENT__CROSS_REFERENCED_HYBRID_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Cross Referencing Hybrid Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_DEPENDENCY__CROSS_REFERENCING_HYBRID_ELEMENTS = SuperModCorePackage.HYBRID_ELEMENT__CROSS_REFERENCING_HYBRID_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_DEPENDENCY__UUID = SuperModCorePackage.HYBRID_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dependency Invariant</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_DEPENDENCY__DEPENDENCY_INVARIANT = SuperModCorePackage.HYBRID_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Source Feature</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_DEPENDENCY__SOURCE_FEATURE = SuperModCorePackage.HYBRID_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Target Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_DEPENDENCY__TARGET_FEATURE = SuperModCorePackage.HYBRID_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Feature Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_DEPENDENCY_FEATURE_COUNT = SuperModCorePackage.HYBRID_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Is Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_DEPENDENCY___IS_PROXY = SuperModCorePackage.HYBRID_ELEMENT___IS_PROXY;

	/**
	 * The operation id for the '<em>Is Visible</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_DEPENDENCY___IS_VISIBLE__OPTIONBINDING_VISIBILITYEVALUATIONCACHE = SuperModCorePackage.HYBRID_ELEMENT___IS_VISIBLE__OPTIONBINDING_VISIBILITYEVALUATIONCACHE;

	/**
	 * The operation id for the '<em>Is Visible Hierarchically</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_DEPENDENCY___IS_VISIBLE_HIERARCHICALLY__OPTIONBINDING_VISIBILITYEVALUATIONCACHE = SuperModCorePackage.HYBRID_ELEMENT___IS_VISIBLE_HIERARCHICALLY__OPTIONBINDING_VISIBILITYEVALUATIONCACHE;

	/**
	 * The number of operations of the '<em>Feature Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_DEPENDENCY_OPERATION_COUNT = SuperModCorePackage.HYBRID_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.ubt.ai1.supermod.mm.feature.impl.FeatureRequirementImpl <em>Feature Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai1.supermod.mm.feature.impl.FeatureRequirementImpl
	 * @see de.ubt.ai1.supermod.mm.feature.impl.SuperModFeaturePackageImpl#getFeatureRequirement()
	 * @generated
	 */
	int FEATURE_REQUIREMENT = 8;

	/**
	 * The feature id for the '<em><b>Super Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_REQUIREMENT__SUPER_ELEMENT = FEATURE_DEPENDENCY__SUPER_ELEMENT;

	/**
	 * The feature id for the '<em><b>Sub Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_REQUIREMENT__SUB_ELEMENTS = FEATURE_DEPENDENCY__SUB_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Super Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_REQUIREMENT__ALL_SUPER_ELEMENTS = FEATURE_DEPENDENCY__ALL_SUPER_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Sub Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_REQUIREMENT__ALL_SUB_ELEMENTS = FEATURE_DEPENDENCY__ALL_SUB_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Cross Referenced Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_REQUIREMENT__CROSS_REFERENCED_ELEMENTS = FEATURE_DEPENDENCY__CROSS_REFERENCED_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Cross Referencing Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_REQUIREMENT__CROSS_REFERENCING_ELEMENTS = FEATURE_DEPENDENCY__CROSS_REFERENCING_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Proxy UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_REQUIREMENT__PROXY_UUID = FEATURE_DEPENDENCY__PROXY_UUID;

	/**
	 * The feature id for the '<em><b>Transaction Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_REQUIREMENT__TRANSACTION_ID = FEATURE_DEPENDENCY__TRANSACTION_ID;

	/**
	 * The feature id for the '<em><b>Product Dimension</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_REQUIREMENT__PRODUCT_DIMENSION = FEATURE_DEPENDENCY__PRODUCT_DIMENSION;

	/**
	 * The feature id for the '<em><b>Product Space</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_REQUIREMENT__PRODUCT_SPACE = FEATURE_DEPENDENCY__PRODUCT_SPACE;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_REQUIREMENT__VISIBILITY = FEATURE_DEPENDENCY__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Super Product Space Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_REQUIREMENT__SUPER_PRODUCT_SPACE_ELEMENT = FEATURE_DEPENDENCY__SUPER_PRODUCT_SPACE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Sub Product Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_REQUIREMENT__SUB_PRODUCT_SPACE_ELEMENTS = FEATURE_DEPENDENCY__SUB_PRODUCT_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Super Product Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_REQUIREMENT__ALL_SUPER_PRODUCT_SPACE_ELEMENTS = FEATURE_DEPENDENCY__ALL_SUPER_PRODUCT_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Sub Product Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_REQUIREMENT__ALL_SUB_PRODUCT_SPACE_ELEMENTS = FEATURE_DEPENDENCY__ALL_SUB_PRODUCT_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Cross Referenced Product Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_REQUIREMENT__CROSS_REFERENCED_PRODUCT_SPACE_ELEMENTS = FEATURE_DEPENDENCY__CROSS_REFERENCED_PRODUCT_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Cross Referencing Product Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_REQUIREMENT__CROSS_REFERENCING_PRODUCT_SPACE_ELEMENTS = FEATURE_DEPENDENCY__CROSS_REFERENCING_PRODUCT_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Hierarchical Visibility</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_REQUIREMENT__HIERARCHICAL_VISIBILITY = FEATURE_DEPENDENCY__HIERARCHICAL_VISIBILITY;

	/**
	 * The feature id for the '<em><b>Superordinate Visibility</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_REQUIREMENT__SUPERORDINATE_VISIBILITY = FEATURE_DEPENDENCY__SUPERORDINATE_VISIBILITY;

	/**
	 * The feature id for the '<em><b>Version Dimension</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_REQUIREMENT__VERSION_DIMENSION = FEATURE_DEPENDENCY__VERSION_DIMENSION;

	/**
	 * The feature id for the '<em><b>Version Space</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_REQUIREMENT__VERSION_SPACE = FEATURE_DEPENDENCY__VERSION_SPACE;

	/**
	 * The feature id for the '<em><b>Super Version Space Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_REQUIREMENT__SUPER_VERSION_SPACE_ELEMENT = FEATURE_DEPENDENCY__SUPER_VERSION_SPACE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Sub Version Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_REQUIREMENT__SUB_VERSION_SPACE_ELEMENTS = FEATURE_DEPENDENCY__SUB_VERSION_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Super Version Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_REQUIREMENT__ALL_SUPER_VERSION_SPACE_ELEMENTS = FEATURE_DEPENDENCY__ALL_SUPER_VERSION_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Sub Version Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_REQUIREMENT__ALL_SUB_VERSION_SPACE_ELEMENTS = FEATURE_DEPENDENCY__ALL_SUB_VERSION_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Cross Referenced Version Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_REQUIREMENT__CROSS_REFERENCED_VERSION_SPACE_ELEMENTS = FEATURE_DEPENDENCY__CROSS_REFERENCED_VERSION_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Cross Referencing Version Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_REQUIREMENT__CROSS_REFERENCING_VERSION_SPACE_ELEMENTS = FEATURE_DEPENDENCY__CROSS_REFERENCING_VERSION_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Low Level Concepts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_REQUIREMENT__LOW_LEVEL_CONCEPTS = FEATURE_DEPENDENCY__LOW_LEVEL_CONCEPTS;

	/**
	 * The feature id for the '<em><b>Super Hybrid Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_REQUIREMENT__SUPER_HYBRID_ELEMENT = FEATURE_DEPENDENCY__SUPER_HYBRID_ELEMENT;

	/**
	 * The feature id for the '<em><b>Sub Hybrid Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_REQUIREMENT__SUB_HYBRID_ELEMENTS = FEATURE_DEPENDENCY__SUB_HYBRID_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Super Hybrid Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_REQUIREMENT__ALL_SUPER_HYBRID_ELEMENTS = FEATURE_DEPENDENCY__ALL_SUPER_HYBRID_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Sub Hybrid Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_REQUIREMENT__ALL_SUB_HYBRID_ELEMENTS = FEATURE_DEPENDENCY__ALL_SUB_HYBRID_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Cross Referenced Hybrid Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_REQUIREMENT__CROSS_REFERENCED_HYBRID_ELEMENTS = FEATURE_DEPENDENCY__CROSS_REFERENCED_HYBRID_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Cross Referencing Hybrid Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_REQUIREMENT__CROSS_REFERENCING_HYBRID_ELEMENTS = FEATURE_DEPENDENCY__CROSS_REFERENCING_HYBRID_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_REQUIREMENT__UUID = FEATURE_DEPENDENCY__UUID;

	/**
	 * The feature id for the '<em><b>Dependency Invariant</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_REQUIREMENT__DEPENDENCY_INVARIANT = FEATURE_DEPENDENCY__DEPENDENCY_INVARIANT;

	/**
	 * The feature id for the '<em><b>Source Feature</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_REQUIREMENT__SOURCE_FEATURE = FEATURE_DEPENDENCY__SOURCE_FEATURE;

	/**
	 * The feature id for the '<em><b>Target Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_REQUIREMENT__TARGET_FEATURE = FEATURE_DEPENDENCY__TARGET_FEATURE;

	/**
	 * The number of structural features of the '<em>Feature Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_REQUIREMENT_FEATURE_COUNT = FEATURE_DEPENDENCY_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_REQUIREMENT___IS_PROXY = FEATURE_DEPENDENCY___IS_PROXY;

	/**
	 * The operation id for the '<em>Is Visible</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_REQUIREMENT___IS_VISIBLE__OPTIONBINDING_VISIBILITYEVALUATIONCACHE = FEATURE_DEPENDENCY___IS_VISIBLE__OPTIONBINDING_VISIBILITYEVALUATIONCACHE;

	/**
	 * The operation id for the '<em>Is Visible Hierarchically</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_REQUIREMENT___IS_VISIBLE_HIERARCHICALLY__OPTIONBINDING_VISIBILITYEVALUATIONCACHE = FEATURE_DEPENDENCY___IS_VISIBLE_HIERARCHICALLY__OPTIONBINDING_VISIBILITYEVALUATIONCACHE;

	/**
	 * The number of operations of the '<em>Feature Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_REQUIREMENT_OPERATION_COUNT = FEATURE_DEPENDENCY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.ubt.ai1.supermod.mm.feature.impl.FeatureExclusionImpl <em>Feature Exclusion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai1.supermod.mm.feature.impl.FeatureExclusionImpl
	 * @see de.ubt.ai1.supermod.mm.feature.impl.SuperModFeaturePackageImpl#getFeatureExclusion()
	 * @generated
	 */
	int FEATURE_EXCLUSION = 9;

	/**
	 * The feature id for the '<em><b>Super Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_EXCLUSION__SUPER_ELEMENT = FEATURE_DEPENDENCY__SUPER_ELEMENT;

	/**
	 * The feature id for the '<em><b>Sub Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_EXCLUSION__SUB_ELEMENTS = FEATURE_DEPENDENCY__SUB_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Super Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_EXCLUSION__ALL_SUPER_ELEMENTS = FEATURE_DEPENDENCY__ALL_SUPER_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Sub Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_EXCLUSION__ALL_SUB_ELEMENTS = FEATURE_DEPENDENCY__ALL_SUB_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Cross Referenced Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_EXCLUSION__CROSS_REFERENCED_ELEMENTS = FEATURE_DEPENDENCY__CROSS_REFERENCED_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Cross Referencing Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_EXCLUSION__CROSS_REFERENCING_ELEMENTS = FEATURE_DEPENDENCY__CROSS_REFERENCING_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Proxy UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_EXCLUSION__PROXY_UUID = FEATURE_DEPENDENCY__PROXY_UUID;

	/**
	 * The feature id for the '<em><b>Transaction Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_EXCLUSION__TRANSACTION_ID = FEATURE_DEPENDENCY__TRANSACTION_ID;

	/**
	 * The feature id for the '<em><b>Product Dimension</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_EXCLUSION__PRODUCT_DIMENSION = FEATURE_DEPENDENCY__PRODUCT_DIMENSION;

	/**
	 * The feature id for the '<em><b>Product Space</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_EXCLUSION__PRODUCT_SPACE = FEATURE_DEPENDENCY__PRODUCT_SPACE;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_EXCLUSION__VISIBILITY = FEATURE_DEPENDENCY__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Super Product Space Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_EXCLUSION__SUPER_PRODUCT_SPACE_ELEMENT = FEATURE_DEPENDENCY__SUPER_PRODUCT_SPACE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Sub Product Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_EXCLUSION__SUB_PRODUCT_SPACE_ELEMENTS = FEATURE_DEPENDENCY__SUB_PRODUCT_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Super Product Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_EXCLUSION__ALL_SUPER_PRODUCT_SPACE_ELEMENTS = FEATURE_DEPENDENCY__ALL_SUPER_PRODUCT_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Sub Product Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_EXCLUSION__ALL_SUB_PRODUCT_SPACE_ELEMENTS = FEATURE_DEPENDENCY__ALL_SUB_PRODUCT_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Cross Referenced Product Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_EXCLUSION__CROSS_REFERENCED_PRODUCT_SPACE_ELEMENTS = FEATURE_DEPENDENCY__CROSS_REFERENCED_PRODUCT_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Cross Referencing Product Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_EXCLUSION__CROSS_REFERENCING_PRODUCT_SPACE_ELEMENTS = FEATURE_DEPENDENCY__CROSS_REFERENCING_PRODUCT_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Hierarchical Visibility</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_EXCLUSION__HIERARCHICAL_VISIBILITY = FEATURE_DEPENDENCY__HIERARCHICAL_VISIBILITY;

	/**
	 * The feature id for the '<em><b>Superordinate Visibility</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_EXCLUSION__SUPERORDINATE_VISIBILITY = FEATURE_DEPENDENCY__SUPERORDINATE_VISIBILITY;

	/**
	 * The feature id for the '<em><b>Version Dimension</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_EXCLUSION__VERSION_DIMENSION = FEATURE_DEPENDENCY__VERSION_DIMENSION;

	/**
	 * The feature id for the '<em><b>Version Space</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_EXCLUSION__VERSION_SPACE = FEATURE_DEPENDENCY__VERSION_SPACE;

	/**
	 * The feature id for the '<em><b>Super Version Space Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_EXCLUSION__SUPER_VERSION_SPACE_ELEMENT = FEATURE_DEPENDENCY__SUPER_VERSION_SPACE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Sub Version Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_EXCLUSION__SUB_VERSION_SPACE_ELEMENTS = FEATURE_DEPENDENCY__SUB_VERSION_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Super Version Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_EXCLUSION__ALL_SUPER_VERSION_SPACE_ELEMENTS = FEATURE_DEPENDENCY__ALL_SUPER_VERSION_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Sub Version Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_EXCLUSION__ALL_SUB_VERSION_SPACE_ELEMENTS = FEATURE_DEPENDENCY__ALL_SUB_VERSION_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Cross Referenced Version Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_EXCLUSION__CROSS_REFERENCED_VERSION_SPACE_ELEMENTS = FEATURE_DEPENDENCY__CROSS_REFERENCED_VERSION_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Cross Referencing Version Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_EXCLUSION__CROSS_REFERENCING_VERSION_SPACE_ELEMENTS = FEATURE_DEPENDENCY__CROSS_REFERENCING_VERSION_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Low Level Concepts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_EXCLUSION__LOW_LEVEL_CONCEPTS = FEATURE_DEPENDENCY__LOW_LEVEL_CONCEPTS;

	/**
	 * The feature id for the '<em><b>Super Hybrid Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_EXCLUSION__SUPER_HYBRID_ELEMENT = FEATURE_DEPENDENCY__SUPER_HYBRID_ELEMENT;

	/**
	 * The feature id for the '<em><b>Sub Hybrid Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_EXCLUSION__SUB_HYBRID_ELEMENTS = FEATURE_DEPENDENCY__SUB_HYBRID_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Super Hybrid Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_EXCLUSION__ALL_SUPER_HYBRID_ELEMENTS = FEATURE_DEPENDENCY__ALL_SUPER_HYBRID_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Sub Hybrid Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_EXCLUSION__ALL_SUB_HYBRID_ELEMENTS = FEATURE_DEPENDENCY__ALL_SUB_HYBRID_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Cross Referenced Hybrid Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_EXCLUSION__CROSS_REFERENCED_HYBRID_ELEMENTS = FEATURE_DEPENDENCY__CROSS_REFERENCED_HYBRID_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Cross Referencing Hybrid Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_EXCLUSION__CROSS_REFERENCING_HYBRID_ELEMENTS = FEATURE_DEPENDENCY__CROSS_REFERENCING_HYBRID_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_EXCLUSION__UUID = FEATURE_DEPENDENCY__UUID;

	/**
	 * The feature id for the '<em><b>Dependency Invariant</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_EXCLUSION__DEPENDENCY_INVARIANT = FEATURE_DEPENDENCY__DEPENDENCY_INVARIANT;

	/**
	 * The feature id for the '<em><b>Source Feature</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_EXCLUSION__SOURCE_FEATURE = FEATURE_DEPENDENCY__SOURCE_FEATURE;

	/**
	 * The feature id for the '<em><b>Target Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_EXCLUSION__TARGET_FEATURE = FEATURE_DEPENDENCY__TARGET_FEATURE;

	/**
	 * The number of structural features of the '<em>Feature Exclusion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_EXCLUSION_FEATURE_COUNT = FEATURE_DEPENDENCY_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_EXCLUSION___IS_PROXY = FEATURE_DEPENDENCY___IS_PROXY;

	/**
	 * The operation id for the '<em>Is Visible</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_EXCLUSION___IS_VISIBLE__OPTIONBINDING_VISIBILITYEVALUATIONCACHE = FEATURE_DEPENDENCY___IS_VISIBLE__OPTIONBINDING_VISIBILITYEVALUATIONCACHE;

	/**
	 * The operation id for the '<em>Is Visible Hierarchically</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_EXCLUSION___IS_VISIBLE_HIERARCHICALLY__OPTIONBINDING_VISIBILITYEVALUATIONCACHE = FEATURE_DEPENDENCY___IS_VISIBLE_HIERARCHICALLY__OPTIONBINDING_VISIBILITYEVALUATIONCACHE;

	/**
	 * The number of operations of the '<em>Feature Exclusion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_EXCLUSION_OPERATION_COUNT = FEATURE_DEPENDENCY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.ubt.ai1.supermod.mm.feature.impl.RootRelationshipImpl <em>Root Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai1.supermod.mm.feature.impl.RootRelationshipImpl
	 * @see de.ubt.ai1.supermod.mm.feature.impl.SuperModFeaturePackageImpl#getRootRelationship()
	 * @generated
	 */
	int ROOT_RELATIONSHIP = 10;

	/**
	 * The feature id for the '<em><b>Super Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_RELATIONSHIP__SUPER_ELEMENT = SuperModCorePackage.HYBRID_ELEMENT__SUPER_ELEMENT;

	/**
	 * The feature id for the '<em><b>Sub Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_RELATIONSHIP__SUB_ELEMENTS = SuperModCorePackage.HYBRID_ELEMENT__SUB_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Super Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_RELATIONSHIP__ALL_SUPER_ELEMENTS = SuperModCorePackage.HYBRID_ELEMENT__ALL_SUPER_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Sub Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_RELATIONSHIP__ALL_SUB_ELEMENTS = SuperModCorePackage.HYBRID_ELEMENT__ALL_SUB_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Cross Referenced Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_RELATIONSHIP__CROSS_REFERENCED_ELEMENTS = SuperModCorePackage.HYBRID_ELEMENT__CROSS_REFERENCED_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Cross Referencing Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_RELATIONSHIP__CROSS_REFERENCING_ELEMENTS = SuperModCorePackage.HYBRID_ELEMENT__CROSS_REFERENCING_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Proxy UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_RELATIONSHIP__PROXY_UUID = SuperModCorePackage.HYBRID_ELEMENT__PROXY_UUID;

	/**
	 * The feature id for the '<em><b>Transaction Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_RELATIONSHIP__TRANSACTION_ID = SuperModCorePackage.HYBRID_ELEMENT__TRANSACTION_ID;

	/**
	 * The feature id for the '<em><b>Product Dimension</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_RELATIONSHIP__PRODUCT_DIMENSION = SuperModCorePackage.HYBRID_ELEMENT__PRODUCT_DIMENSION;

	/**
	 * The feature id for the '<em><b>Product Space</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_RELATIONSHIP__PRODUCT_SPACE = SuperModCorePackage.HYBRID_ELEMENT__PRODUCT_SPACE;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_RELATIONSHIP__VISIBILITY = SuperModCorePackage.HYBRID_ELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Super Product Space Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_RELATIONSHIP__SUPER_PRODUCT_SPACE_ELEMENT = SuperModCorePackage.HYBRID_ELEMENT__SUPER_PRODUCT_SPACE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Sub Product Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_RELATIONSHIP__SUB_PRODUCT_SPACE_ELEMENTS = SuperModCorePackage.HYBRID_ELEMENT__SUB_PRODUCT_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Super Product Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_RELATIONSHIP__ALL_SUPER_PRODUCT_SPACE_ELEMENTS = SuperModCorePackage.HYBRID_ELEMENT__ALL_SUPER_PRODUCT_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Sub Product Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_RELATIONSHIP__ALL_SUB_PRODUCT_SPACE_ELEMENTS = SuperModCorePackage.HYBRID_ELEMENT__ALL_SUB_PRODUCT_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Cross Referenced Product Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_RELATIONSHIP__CROSS_REFERENCED_PRODUCT_SPACE_ELEMENTS = SuperModCorePackage.HYBRID_ELEMENT__CROSS_REFERENCED_PRODUCT_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Cross Referencing Product Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_RELATIONSHIP__CROSS_REFERENCING_PRODUCT_SPACE_ELEMENTS = SuperModCorePackage.HYBRID_ELEMENT__CROSS_REFERENCING_PRODUCT_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Hierarchical Visibility</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_RELATIONSHIP__HIERARCHICAL_VISIBILITY = SuperModCorePackage.HYBRID_ELEMENT__HIERARCHICAL_VISIBILITY;

	/**
	 * The feature id for the '<em><b>Superordinate Visibility</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_RELATIONSHIP__SUPERORDINATE_VISIBILITY = SuperModCorePackage.HYBRID_ELEMENT__SUPERORDINATE_VISIBILITY;

	/**
	 * The feature id for the '<em><b>Version Dimension</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_RELATIONSHIP__VERSION_DIMENSION = SuperModCorePackage.HYBRID_ELEMENT__VERSION_DIMENSION;

	/**
	 * The feature id for the '<em><b>Version Space</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_RELATIONSHIP__VERSION_SPACE = SuperModCorePackage.HYBRID_ELEMENT__VERSION_SPACE;

	/**
	 * The feature id for the '<em><b>Super Version Space Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_RELATIONSHIP__SUPER_VERSION_SPACE_ELEMENT = SuperModCorePackage.HYBRID_ELEMENT__SUPER_VERSION_SPACE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Sub Version Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_RELATIONSHIP__SUB_VERSION_SPACE_ELEMENTS = SuperModCorePackage.HYBRID_ELEMENT__SUB_VERSION_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Super Version Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_RELATIONSHIP__ALL_SUPER_VERSION_SPACE_ELEMENTS = SuperModCorePackage.HYBRID_ELEMENT__ALL_SUPER_VERSION_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Sub Version Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_RELATIONSHIP__ALL_SUB_VERSION_SPACE_ELEMENTS = SuperModCorePackage.HYBRID_ELEMENT__ALL_SUB_VERSION_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Cross Referenced Version Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_RELATIONSHIP__CROSS_REFERENCED_VERSION_SPACE_ELEMENTS = SuperModCorePackage.HYBRID_ELEMENT__CROSS_REFERENCED_VERSION_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Cross Referencing Version Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_RELATIONSHIP__CROSS_REFERENCING_VERSION_SPACE_ELEMENTS = SuperModCorePackage.HYBRID_ELEMENT__CROSS_REFERENCING_VERSION_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Low Level Concepts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_RELATIONSHIP__LOW_LEVEL_CONCEPTS = SuperModCorePackage.HYBRID_ELEMENT__LOW_LEVEL_CONCEPTS;

	/**
	 * The feature id for the '<em><b>Super Hybrid Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_RELATIONSHIP__SUPER_HYBRID_ELEMENT = SuperModCorePackage.HYBRID_ELEMENT__SUPER_HYBRID_ELEMENT;

	/**
	 * The feature id for the '<em><b>Sub Hybrid Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_RELATIONSHIP__SUB_HYBRID_ELEMENTS = SuperModCorePackage.HYBRID_ELEMENT__SUB_HYBRID_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Super Hybrid Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_RELATIONSHIP__ALL_SUPER_HYBRID_ELEMENTS = SuperModCorePackage.HYBRID_ELEMENT__ALL_SUPER_HYBRID_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Sub Hybrid Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_RELATIONSHIP__ALL_SUB_HYBRID_ELEMENTS = SuperModCorePackage.HYBRID_ELEMENT__ALL_SUB_HYBRID_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Cross Referenced Hybrid Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_RELATIONSHIP__CROSS_REFERENCED_HYBRID_ELEMENTS = SuperModCorePackage.HYBRID_ELEMENT__CROSS_REFERENCED_HYBRID_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Cross Referencing Hybrid Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_RELATIONSHIP__CROSS_REFERENCING_HYBRID_ELEMENTS = SuperModCorePackage.HYBRID_ELEMENT__CROSS_REFERENCING_HYBRID_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Root Invariant</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_RELATIONSHIP__ROOT_INVARIANT = SuperModCorePackage.HYBRID_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Root Default</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_RELATIONSHIP__ROOT_DEFAULT = SuperModCorePackage.HYBRID_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_RELATIONSHIP__FEATURE = SuperModCorePackage.HYBRID_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Root Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_RELATIONSHIP_FEATURE_COUNT = SuperModCorePackage.HYBRID_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Is Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_RELATIONSHIP___IS_PROXY = SuperModCorePackage.HYBRID_ELEMENT___IS_PROXY;

	/**
	 * The operation id for the '<em>Is Visible</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_RELATIONSHIP___IS_VISIBLE__OPTIONBINDING_VISIBILITYEVALUATIONCACHE = SuperModCorePackage.HYBRID_ELEMENT___IS_VISIBLE__OPTIONBINDING_VISIBILITYEVALUATIONCACHE;

	/**
	 * The operation id for the '<em>Is Visible Hierarchically</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_RELATIONSHIP___IS_VISIBLE_HIERARCHICALLY__OPTIONBINDING_VISIBILITYEVALUATIONCACHE = SuperModCorePackage.HYBRID_ELEMENT___IS_VISIBLE_HIERARCHICALLY__OPTIONBINDING_VISIBILITYEVALUATIONCACHE;

	/**
	 * The number of operations of the '<em>Root Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_RELATIONSHIP_OPERATION_COUNT = SuperModCorePackage.HYBRID_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.ubt.ai1.supermod.mm.feature.impl.ChildRelationshipImpl <em>Child Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai1.supermod.mm.feature.impl.ChildRelationshipImpl
	 * @see de.ubt.ai1.supermod.mm.feature.impl.SuperModFeaturePackageImpl#getChildRelationship()
	 * @generated
	 */
	int CHILD_RELATIONSHIP = 11;

	/**
	 * The feature id for the '<em><b>Super Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_RELATIONSHIP__SUPER_ELEMENT = SuperModCorePackage.HYBRID_ELEMENT__SUPER_ELEMENT;

	/**
	 * The feature id for the '<em><b>Sub Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_RELATIONSHIP__SUB_ELEMENTS = SuperModCorePackage.HYBRID_ELEMENT__SUB_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Super Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_RELATIONSHIP__ALL_SUPER_ELEMENTS = SuperModCorePackage.HYBRID_ELEMENT__ALL_SUPER_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Sub Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_RELATIONSHIP__ALL_SUB_ELEMENTS = SuperModCorePackage.HYBRID_ELEMENT__ALL_SUB_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Cross Referenced Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_RELATIONSHIP__CROSS_REFERENCED_ELEMENTS = SuperModCorePackage.HYBRID_ELEMENT__CROSS_REFERENCED_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Cross Referencing Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_RELATIONSHIP__CROSS_REFERENCING_ELEMENTS = SuperModCorePackage.HYBRID_ELEMENT__CROSS_REFERENCING_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Proxy UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_RELATIONSHIP__PROXY_UUID = SuperModCorePackage.HYBRID_ELEMENT__PROXY_UUID;

	/**
	 * The feature id for the '<em><b>Transaction Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_RELATIONSHIP__TRANSACTION_ID = SuperModCorePackage.HYBRID_ELEMENT__TRANSACTION_ID;

	/**
	 * The feature id for the '<em><b>Product Dimension</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_RELATIONSHIP__PRODUCT_DIMENSION = SuperModCorePackage.HYBRID_ELEMENT__PRODUCT_DIMENSION;

	/**
	 * The feature id for the '<em><b>Product Space</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_RELATIONSHIP__PRODUCT_SPACE = SuperModCorePackage.HYBRID_ELEMENT__PRODUCT_SPACE;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_RELATIONSHIP__VISIBILITY = SuperModCorePackage.HYBRID_ELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Super Product Space Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_RELATIONSHIP__SUPER_PRODUCT_SPACE_ELEMENT = SuperModCorePackage.HYBRID_ELEMENT__SUPER_PRODUCT_SPACE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Sub Product Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_RELATIONSHIP__SUB_PRODUCT_SPACE_ELEMENTS = SuperModCorePackage.HYBRID_ELEMENT__SUB_PRODUCT_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Super Product Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_RELATIONSHIP__ALL_SUPER_PRODUCT_SPACE_ELEMENTS = SuperModCorePackage.HYBRID_ELEMENT__ALL_SUPER_PRODUCT_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Sub Product Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_RELATIONSHIP__ALL_SUB_PRODUCT_SPACE_ELEMENTS = SuperModCorePackage.HYBRID_ELEMENT__ALL_SUB_PRODUCT_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Cross Referenced Product Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_RELATIONSHIP__CROSS_REFERENCED_PRODUCT_SPACE_ELEMENTS = SuperModCorePackage.HYBRID_ELEMENT__CROSS_REFERENCED_PRODUCT_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Cross Referencing Product Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_RELATIONSHIP__CROSS_REFERENCING_PRODUCT_SPACE_ELEMENTS = SuperModCorePackage.HYBRID_ELEMENT__CROSS_REFERENCING_PRODUCT_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Hierarchical Visibility</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_RELATIONSHIP__HIERARCHICAL_VISIBILITY = SuperModCorePackage.HYBRID_ELEMENT__HIERARCHICAL_VISIBILITY;

	/**
	 * The feature id for the '<em><b>Superordinate Visibility</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_RELATIONSHIP__SUPERORDINATE_VISIBILITY = SuperModCorePackage.HYBRID_ELEMENT__SUPERORDINATE_VISIBILITY;

	/**
	 * The feature id for the '<em><b>Version Dimension</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_RELATIONSHIP__VERSION_DIMENSION = SuperModCorePackage.HYBRID_ELEMENT__VERSION_DIMENSION;

	/**
	 * The feature id for the '<em><b>Version Space</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_RELATIONSHIP__VERSION_SPACE = SuperModCorePackage.HYBRID_ELEMENT__VERSION_SPACE;

	/**
	 * The feature id for the '<em><b>Super Version Space Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_RELATIONSHIP__SUPER_VERSION_SPACE_ELEMENT = SuperModCorePackage.HYBRID_ELEMENT__SUPER_VERSION_SPACE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Sub Version Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_RELATIONSHIP__SUB_VERSION_SPACE_ELEMENTS = SuperModCorePackage.HYBRID_ELEMENT__SUB_VERSION_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Super Version Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_RELATIONSHIP__ALL_SUPER_VERSION_SPACE_ELEMENTS = SuperModCorePackage.HYBRID_ELEMENT__ALL_SUPER_VERSION_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Sub Version Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_RELATIONSHIP__ALL_SUB_VERSION_SPACE_ELEMENTS = SuperModCorePackage.HYBRID_ELEMENT__ALL_SUB_VERSION_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Cross Referenced Version Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_RELATIONSHIP__CROSS_REFERENCED_VERSION_SPACE_ELEMENTS = SuperModCorePackage.HYBRID_ELEMENT__CROSS_REFERENCED_VERSION_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Cross Referencing Version Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_RELATIONSHIP__CROSS_REFERENCING_VERSION_SPACE_ELEMENTS = SuperModCorePackage.HYBRID_ELEMENT__CROSS_REFERENCING_VERSION_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Low Level Concepts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_RELATIONSHIP__LOW_LEVEL_CONCEPTS = SuperModCorePackage.HYBRID_ELEMENT__LOW_LEVEL_CONCEPTS;

	/**
	 * The feature id for the '<em><b>Super Hybrid Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_RELATIONSHIP__SUPER_HYBRID_ELEMENT = SuperModCorePackage.HYBRID_ELEMENT__SUPER_HYBRID_ELEMENT;

	/**
	 * The feature id for the '<em><b>Sub Hybrid Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_RELATIONSHIP__SUB_HYBRID_ELEMENTS = SuperModCorePackage.HYBRID_ELEMENT__SUB_HYBRID_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Super Hybrid Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_RELATIONSHIP__ALL_SUPER_HYBRID_ELEMENTS = SuperModCorePackage.HYBRID_ELEMENT__ALL_SUPER_HYBRID_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Sub Hybrid Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_RELATIONSHIP__ALL_SUB_HYBRID_ELEMENTS = SuperModCorePackage.HYBRID_ELEMENT__ALL_SUB_HYBRID_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Cross Referenced Hybrid Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_RELATIONSHIP__CROSS_REFERENCED_HYBRID_ELEMENTS = SuperModCorePackage.HYBRID_ELEMENT__CROSS_REFERENCED_HYBRID_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Cross Referencing Hybrid Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_RELATIONSHIP__CROSS_REFERENCING_HYBRID_ELEMENTS = SuperModCorePackage.HYBRID_ELEMENT__CROSS_REFERENCING_HYBRID_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_RELATIONSHIP__PARENT = SuperModCorePackage.HYBRID_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Child</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_RELATIONSHIP__CHILD = SuperModCorePackage.HYBRID_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parent Invariant</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_RELATIONSHIP__PARENT_INVARIANT = SuperModCorePackage.HYBRID_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Parent Preference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_RELATIONSHIP__PARENT_PREFERENCE = SuperModCorePackage.HYBRID_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Child Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_RELATIONSHIP_FEATURE_COUNT = SuperModCorePackage.HYBRID_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Is Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_RELATIONSHIP___IS_PROXY = SuperModCorePackage.HYBRID_ELEMENT___IS_PROXY;

	/**
	 * The operation id for the '<em>Is Visible</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_RELATIONSHIP___IS_VISIBLE__OPTIONBINDING_VISIBILITYEVALUATIONCACHE = SuperModCorePackage.HYBRID_ELEMENT___IS_VISIBLE__OPTIONBINDING_VISIBILITYEVALUATIONCACHE;

	/**
	 * The operation id for the '<em>Is Visible Hierarchically</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_RELATIONSHIP___IS_VISIBLE_HIERARCHICALLY__OPTIONBINDING_VISIBILITYEVALUATIONCACHE = SuperModCorePackage.HYBRID_ELEMENT___IS_VISIBLE_HIERARCHICALLY__OPTIONBINDING_VISIBILITYEVALUATIONCACHE;

	/**
	 * The number of operations of the '<em>Child Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_RELATIONSHIP_OPERATION_COUNT = SuperModCorePackage.HYBRID_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.ubt.ai1.supermod.mm.feature.impl.MandatoryImpl <em>Mandatory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai1.supermod.mm.feature.impl.MandatoryImpl
	 * @see de.ubt.ai1.supermod.mm.feature.impl.SuperModFeaturePackageImpl#getMandatory()
	 * @generated
	 */
	int MANDATORY = 12;

	/**
	 * The feature id for the '<em><b>Super Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANDATORY__SUPER_ELEMENT = SuperModCorePackage.HYBRID_ELEMENT__SUPER_ELEMENT;

	/**
	 * The feature id for the '<em><b>Sub Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANDATORY__SUB_ELEMENTS = SuperModCorePackage.HYBRID_ELEMENT__SUB_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Super Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANDATORY__ALL_SUPER_ELEMENTS = SuperModCorePackage.HYBRID_ELEMENT__ALL_SUPER_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Sub Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANDATORY__ALL_SUB_ELEMENTS = SuperModCorePackage.HYBRID_ELEMENT__ALL_SUB_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Cross Referenced Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANDATORY__CROSS_REFERENCED_ELEMENTS = SuperModCorePackage.HYBRID_ELEMENT__CROSS_REFERENCED_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Cross Referencing Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANDATORY__CROSS_REFERENCING_ELEMENTS = SuperModCorePackage.HYBRID_ELEMENT__CROSS_REFERENCING_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Proxy UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANDATORY__PROXY_UUID = SuperModCorePackage.HYBRID_ELEMENT__PROXY_UUID;

	/**
	 * The feature id for the '<em><b>Transaction Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANDATORY__TRANSACTION_ID = SuperModCorePackage.HYBRID_ELEMENT__TRANSACTION_ID;

	/**
	 * The feature id for the '<em><b>Product Dimension</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANDATORY__PRODUCT_DIMENSION = SuperModCorePackage.HYBRID_ELEMENT__PRODUCT_DIMENSION;

	/**
	 * The feature id for the '<em><b>Product Space</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANDATORY__PRODUCT_SPACE = SuperModCorePackage.HYBRID_ELEMENT__PRODUCT_SPACE;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANDATORY__VISIBILITY = SuperModCorePackage.HYBRID_ELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Super Product Space Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANDATORY__SUPER_PRODUCT_SPACE_ELEMENT = SuperModCorePackage.HYBRID_ELEMENT__SUPER_PRODUCT_SPACE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Sub Product Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANDATORY__SUB_PRODUCT_SPACE_ELEMENTS = SuperModCorePackage.HYBRID_ELEMENT__SUB_PRODUCT_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Super Product Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANDATORY__ALL_SUPER_PRODUCT_SPACE_ELEMENTS = SuperModCorePackage.HYBRID_ELEMENT__ALL_SUPER_PRODUCT_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Sub Product Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANDATORY__ALL_SUB_PRODUCT_SPACE_ELEMENTS = SuperModCorePackage.HYBRID_ELEMENT__ALL_SUB_PRODUCT_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Cross Referenced Product Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANDATORY__CROSS_REFERENCED_PRODUCT_SPACE_ELEMENTS = SuperModCorePackage.HYBRID_ELEMENT__CROSS_REFERENCED_PRODUCT_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Cross Referencing Product Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANDATORY__CROSS_REFERENCING_PRODUCT_SPACE_ELEMENTS = SuperModCorePackage.HYBRID_ELEMENT__CROSS_REFERENCING_PRODUCT_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Hierarchical Visibility</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANDATORY__HIERARCHICAL_VISIBILITY = SuperModCorePackage.HYBRID_ELEMENT__HIERARCHICAL_VISIBILITY;

	/**
	 * The feature id for the '<em><b>Superordinate Visibility</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANDATORY__SUPERORDINATE_VISIBILITY = SuperModCorePackage.HYBRID_ELEMENT__SUPERORDINATE_VISIBILITY;

	/**
	 * The feature id for the '<em><b>Version Dimension</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANDATORY__VERSION_DIMENSION = SuperModCorePackage.HYBRID_ELEMENT__VERSION_DIMENSION;

	/**
	 * The feature id for the '<em><b>Version Space</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANDATORY__VERSION_SPACE = SuperModCorePackage.HYBRID_ELEMENT__VERSION_SPACE;

	/**
	 * The feature id for the '<em><b>Super Version Space Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANDATORY__SUPER_VERSION_SPACE_ELEMENT = SuperModCorePackage.HYBRID_ELEMENT__SUPER_VERSION_SPACE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Sub Version Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANDATORY__SUB_VERSION_SPACE_ELEMENTS = SuperModCorePackage.HYBRID_ELEMENT__SUB_VERSION_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Super Version Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANDATORY__ALL_SUPER_VERSION_SPACE_ELEMENTS = SuperModCorePackage.HYBRID_ELEMENT__ALL_SUPER_VERSION_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Sub Version Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANDATORY__ALL_SUB_VERSION_SPACE_ELEMENTS = SuperModCorePackage.HYBRID_ELEMENT__ALL_SUB_VERSION_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Cross Referenced Version Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANDATORY__CROSS_REFERENCED_VERSION_SPACE_ELEMENTS = SuperModCorePackage.HYBRID_ELEMENT__CROSS_REFERENCED_VERSION_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Cross Referencing Version Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANDATORY__CROSS_REFERENCING_VERSION_SPACE_ELEMENTS = SuperModCorePackage.HYBRID_ELEMENT__CROSS_REFERENCING_VERSION_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Low Level Concepts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANDATORY__LOW_LEVEL_CONCEPTS = SuperModCorePackage.HYBRID_ELEMENT__LOW_LEVEL_CONCEPTS;

	/**
	 * The feature id for the '<em><b>Super Hybrid Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANDATORY__SUPER_HYBRID_ELEMENT = SuperModCorePackage.HYBRID_ELEMENT__SUPER_HYBRID_ELEMENT;

	/**
	 * The feature id for the '<em><b>Sub Hybrid Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANDATORY__SUB_HYBRID_ELEMENTS = SuperModCorePackage.HYBRID_ELEMENT__SUB_HYBRID_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Super Hybrid Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANDATORY__ALL_SUPER_HYBRID_ELEMENTS = SuperModCorePackage.HYBRID_ELEMENT__ALL_SUPER_HYBRID_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Sub Hybrid Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANDATORY__ALL_SUB_HYBRID_ELEMENTS = SuperModCorePackage.HYBRID_ELEMENT__ALL_SUB_HYBRID_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Cross Referenced Hybrid Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANDATORY__CROSS_REFERENCED_HYBRID_ELEMENTS = SuperModCorePackage.HYBRID_ELEMENT__CROSS_REFERENCED_HYBRID_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Cross Referencing Hybrid Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANDATORY__CROSS_REFERENCING_HYBRID_ELEMENTS = SuperModCorePackage.HYBRID_ELEMENT__CROSS_REFERENCING_HYBRID_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANDATORY__FEATURE = SuperModCorePackage.HYBRID_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Mandatory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANDATORY_FEATURE_COUNT = SuperModCorePackage.HYBRID_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANDATORY___IS_PROXY = SuperModCorePackage.HYBRID_ELEMENT___IS_PROXY;

	/**
	 * The operation id for the '<em>Is Visible</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANDATORY___IS_VISIBLE__OPTIONBINDING_VISIBILITYEVALUATIONCACHE = SuperModCorePackage.HYBRID_ELEMENT___IS_VISIBLE__OPTIONBINDING_VISIBILITYEVALUATIONCACHE;

	/**
	 * The operation id for the '<em>Is Visible Hierarchically</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANDATORY___IS_VISIBLE_HIERARCHICALLY__OPTIONBINDING_VISIBILITYEVALUATIONCACHE = SuperModCorePackage.HYBRID_ELEMENT___IS_VISIBLE_HIERARCHICALLY__OPTIONBINDING_VISIBILITYEVALUATIONCACHE;

	/**
	 * The number of operations of the '<em>Mandatory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANDATORY_OPERATION_COUNT = SuperModCorePackage.HYBRID_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.ubt.ai1.supermod.mm.feature.impl.EliminationImpl <em>Elimination</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai1.supermod.mm.feature.impl.EliminationImpl
	 * @see de.ubt.ai1.supermod.mm.feature.impl.SuperModFeaturePackageImpl#getElimination()
	 * @generated
	 */
	int ELIMINATION = 13;

	/**
	 * The feature id for the '<em><b>Super Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELIMINATION__SUPER_ELEMENT = SuperModCorePackage.HYBRID_ELEMENT__SUPER_ELEMENT;

	/**
	 * The feature id for the '<em><b>Sub Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELIMINATION__SUB_ELEMENTS = SuperModCorePackage.HYBRID_ELEMENT__SUB_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Super Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELIMINATION__ALL_SUPER_ELEMENTS = SuperModCorePackage.HYBRID_ELEMENT__ALL_SUPER_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Sub Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELIMINATION__ALL_SUB_ELEMENTS = SuperModCorePackage.HYBRID_ELEMENT__ALL_SUB_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Cross Referenced Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELIMINATION__CROSS_REFERENCED_ELEMENTS = SuperModCorePackage.HYBRID_ELEMENT__CROSS_REFERENCED_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Cross Referencing Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELIMINATION__CROSS_REFERENCING_ELEMENTS = SuperModCorePackage.HYBRID_ELEMENT__CROSS_REFERENCING_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Proxy UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELIMINATION__PROXY_UUID = SuperModCorePackage.HYBRID_ELEMENT__PROXY_UUID;

	/**
	 * The feature id for the '<em><b>Transaction Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELIMINATION__TRANSACTION_ID = SuperModCorePackage.HYBRID_ELEMENT__TRANSACTION_ID;

	/**
	 * The feature id for the '<em><b>Product Dimension</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELIMINATION__PRODUCT_DIMENSION = SuperModCorePackage.HYBRID_ELEMENT__PRODUCT_DIMENSION;

	/**
	 * The feature id for the '<em><b>Product Space</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELIMINATION__PRODUCT_SPACE = SuperModCorePackage.HYBRID_ELEMENT__PRODUCT_SPACE;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELIMINATION__VISIBILITY = SuperModCorePackage.HYBRID_ELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Super Product Space Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELIMINATION__SUPER_PRODUCT_SPACE_ELEMENT = SuperModCorePackage.HYBRID_ELEMENT__SUPER_PRODUCT_SPACE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Sub Product Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELIMINATION__SUB_PRODUCT_SPACE_ELEMENTS = SuperModCorePackage.HYBRID_ELEMENT__SUB_PRODUCT_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Super Product Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELIMINATION__ALL_SUPER_PRODUCT_SPACE_ELEMENTS = SuperModCorePackage.HYBRID_ELEMENT__ALL_SUPER_PRODUCT_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Sub Product Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELIMINATION__ALL_SUB_PRODUCT_SPACE_ELEMENTS = SuperModCorePackage.HYBRID_ELEMENT__ALL_SUB_PRODUCT_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Cross Referenced Product Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELIMINATION__CROSS_REFERENCED_PRODUCT_SPACE_ELEMENTS = SuperModCorePackage.HYBRID_ELEMENT__CROSS_REFERENCED_PRODUCT_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Cross Referencing Product Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELIMINATION__CROSS_REFERENCING_PRODUCT_SPACE_ELEMENTS = SuperModCorePackage.HYBRID_ELEMENT__CROSS_REFERENCING_PRODUCT_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Hierarchical Visibility</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELIMINATION__HIERARCHICAL_VISIBILITY = SuperModCorePackage.HYBRID_ELEMENT__HIERARCHICAL_VISIBILITY;

	/**
	 * The feature id for the '<em><b>Superordinate Visibility</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELIMINATION__SUPERORDINATE_VISIBILITY = SuperModCorePackage.HYBRID_ELEMENT__SUPERORDINATE_VISIBILITY;

	/**
	 * The feature id for the '<em><b>Version Dimension</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELIMINATION__VERSION_DIMENSION = SuperModCorePackage.HYBRID_ELEMENT__VERSION_DIMENSION;

	/**
	 * The feature id for the '<em><b>Version Space</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELIMINATION__VERSION_SPACE = SuperModCorePackage.HYBRID_ELEMENT__VERSION_SPACE;

	/**
	 * The feature id for the '<em><b>Super Version Space Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELIMINATION__SUPER_VERSION_SPACE_ELEMENT = SuperModCorePackage.HYBRID_ELEMENT__SUPER_VERSION_SPACE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Sub Version Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELIMINATION__SUB_VERSION_SPACE_ELEMENTS = SuperModCorePackage.HYBRID_ELEMENT__SUB_VERSION_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Super Version Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELIMINATION__ALL_SUPER_VERSION_SPACE_ELEMENTS = SuperModCorePackage.HYBRID_ELEMENT__ALL_SUPER_VERSION_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Sub Version Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELIMINATION__ALL_SUB_VERSION_SPACE_ELEMENTS = SuperModCorePackage.HYBRID_ELEMENT__ALL_SUB_VERSION_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Cross Referenced Version Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELIMINATION__CROSS_REFERENCED_VERSION_SPACE_ELEMENTS = SuperModCorePackage.HYBRID_ELEMENT__CROSS_REFERENCED_VERSION_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Cross Referencing Version Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELIMINATION__CROSS_REFERENCING_VERSION_SPACE_ELEMENTS = SuperModCorePackage.HYBRID_ELEMENT__CROSS_REFERENCING_VERSION_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Low Level Concepts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELIMINATION__LOW_LEVEL_CONCEPTS = SuperModCorePackage.HYBRID_ELEMENT__LOW_LEVEL_CONCEPTS;

	/**
	 * The feature id for the '<em><b>Super Hybrid Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELIMINATION__SUPER_HYBRID_ELEMENT = SuperModCorePackage.HYBRID_ELEMENT__SUPER_HYBRID_ELEMENT;

	/**
	 * The feature id for the '<em><b>Sub Hybrid Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELIMINATION__SUB_HYBRID_ELEMENTS = SuperModCorePackage.HYBRID_ELEMENT__SUB_HYBRID_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Super Hybrid Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELIMINATION__ALL_SUPER_HYBRID_ELEMENTS = SuperModCorePackage.HYBRID_ELEMENT__ALL_SUPER_HYBRID_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Sub Hybrid Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELIMINATION__ALL_SUB_HYBRID_ELEMENTS = SuperModCorePackage.HYBRID_ELEMENT__ALL_SUB_HYBRID_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Cross Referenced Hybrid Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELIMINATION__CROSS_REFERENCED_HYBRID_ELEMENTS = SuperModCorePackage.HYBRID_ELEMENT__CROSS_REFERENCED_HYBRID_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Cross Referencing Hybrid Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELIMINATION__CROSS_REFERENCING_HYBRID_ELEMENTS = SuperModCorePackage.HYBRID_ELEMENT__CROSS_REFERENCING_HYBRID_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELIMINATION__FEATURE = SuperModCorePackage.HYBRID_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Default Selection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELIMINATION__DEFAULT_SELECTION = SuperModCorePackage.HYBRID_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Elimination Invariant</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELIMINATION__ELIMINATION_INVARIANT = SuperModCorePackage.HYBRID_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Elimination Default</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELIMINATION__ELIMINATION_DEFAULT = SuperModCorePackage.HYBRID_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Elimination</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELIMINATION_FEATURE_COUNT = SuperModCorePackage.HYBRID_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Is Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELIMINATION___IS_PROXY = SuperModCorePackage.HYBRID_ELEMENT___IS_PROXY;

	/**
	 * The operation id for the '<em>Is Visible</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELIMINATION___IS_VISIBLE__OPTIONBINDING_VISIBILITYEVALUATIONCACHE = SuperModCorePackage.HYBRID_ELEMENT___IS_VISIBLE__OPTIONBINDING_VISIBILITYEVALUATIONCACHE;

	/**
	 * The operation id for the '<em>Is Visible Hierarchically</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELIMINATION___IS_VISIBLE_HIERARCHICALLY__OPTIONBINDING_VISIBILITYEVALUATIONCACHE = SuperModCorePackage.HYBRID_ELEMENT___IS_VISIBLE_HIERARCHICALLY__OPTIONBINDING_VISIBILITYEVALUATIONCACHE;

	/**
	 * The number of operations of the '<em>Elimination</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELIMINATION_OPERATION_COUNT = SuperModCorePackage.HYBRID_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link de.ubt.ai1.supermod.mm.feature.FeatureModel <em>Feature Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Model</em>'.
	 * @see de.ubt.ai1.supermod.mm.feature.FeatureModel
	 * @generated
	 */
	EClass getFeatureModel();

	/**
	 * Returns the meta object for the containment reference list '{@link de.ubt.ai1.supermod.mm.feature.FeatureModel#getRoots <em>Roots</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Roots</em>'.
	 * @see de.ubt.ai1.supermod.mm.feature.FeatureModel#getRoots()
	 * @see #getFeatureModel()
	 * @generated
	 */
	EReference getFeatureModel_Roots();

	/**
	 * Returns the meta object for the containment reference list '{@link de.ubt.ai1.supermod.mm.feature.FeatureModel#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Features</em>'.
	 * @see de.ubt.ai1.supermod.mm.feature.FeatureModel#getFeatures()
	 * @see #getFeatureModel()
	 * @generated
	 */
	EReference getFeatureModel_Features();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai1.supermod.mm.feature.Feature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature</em>'.
	 * @see de.ubt.ai1.supermod.mm.feature.Feature
	 * @generated
	 */
	EClass getFeature();

	/**
	 * Returns the meta object for the container reference '{@link de.ubt.ai1.supermod.mm.feature.Feature#getFeatureModel <em>Feature Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Feature Model</em>'.
	 * @see de.ubt.ai1.supermod.mm.feature.Feature#getFeatureModel()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_FeatureModel();

	/**
	 * Returns the meta object for the containment reference '{@link de.ubt.ai1.supermod.mm.feature.Feature#getFeatureOption <em>Feature Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Feature Option</em>'.
	 * @see de.ubt.ai1.supermod.mm.feature.Feature#getFeatureOption()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_FeatureOption();

	/**
	 * Returns the meta object for the containment reference list '{@link de.ubt.ai1.supermod.mm.feature.Feature#getNames <em>Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Names</em>'.
	 * @see de.ubt.ai1.supermod.mm.feature.Feature#getNames()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_Names();

	/**
	 * Returns the meta object for the containment reference '{@link de.ubt.ai1.supermod.mm.feature.Feature#getMandatory <em>Mandatory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mandatory</em>'.
	 * @see de.ubt.ai1.supermod.mm.feature.Feature#getMandatory()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_Mandatory();

	/**
	 * Returns the meta object for the containment reference list '{@link de.ubt.ai1.supermod.mm.feature.Feature#getEliminations <em>Eliminations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Eliminations</em>'.
	 * @see de.ubt.ai1.supermod.mm.feature.Feature#getEliminations()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_Eliminations();

	/**
	 * Returns the meta object for the reference list '{@link de.ubt.ai1.supermod.mm.feature.Feature#getIncomingRoots <em>Incoming Roots</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incoming Roots</em>'.
	 * @see de.ubt.ai1.supermod.mm.feature.Feature#getIncomingRoots()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_IncomingRoots();

	/**
	 * Returns the meta object for the reference list '{@link de.ubt.ai1.supermod.mm.feature.Feature#getAllChildFeatures <em>All Child Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>All Child Features</em>'.
	 * @see de.ubt.ai1.supermod.mm.feature.Feature#getAllChildFeatures()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_AllChildFeatures();

	/**
	 * Returns the meta object for the attribute '{@link de.ubt.ai1.supermod.mm.feature.Feature#getTransitiveEliminationState <em>Transitive Elimination State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transitive Elimination State</em>'.
	 * @see de.ubt.ai1.supermod.mm.feature.Feature#getTransitiveEliminationState()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_TransitiveEliminationState();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai1.supermod.mm.feature.DisplayName <em>Display Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Display Name</em>'.
	 * @see de.ubt.ai1.supermod.mm.feature.DisplayName
	 * @generated
	 */
	EClass getDisplayName();

	/**
	 * Returns the meta object for the attribute '{@link de.ubt.ai1.supermod.mm.feature.DisplayName#getDisplayName <em>Display Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display Name</em>'.
	 * @see de.ubt.ai1.supermod.mm.feature.DisplayName#getDisplayName()
	 * @see #getDisplayName()
	 * @generated
	 */
	EAttribute getDisplayName_DisplayName();

	/**
	 * Returns the meta object for the container reference '{@link de.ubt.ai1.supermod.mm.feature.DisplayName#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Feature</em>'.
	 * @see de.ubt.ai1.supermod.mm.feature.DisplayName#getFeature()
	 * @see #getDisplayName()
	 * @generated
	 */
	EReference getDisplayName_Feature();

	/**
	 * Returns the meta object for the reference list '{@link de.ubt.ai1.supermod.mm.feature.Feature#getGroupedBy <em>Grouped By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Grouped By</em>'.
	 * @see de.ubt.ai1.supermod.mm.feature.Feature#getGroupedBy()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_GroupedBy();

	/**
	 * Returns the meta object for the containment reference list '{@link de.ubt.ai1.supermod.mm.feature.Feature#getGroups <em>Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Groups</em>'.
	 * @see de.ubt.ai1.supermod.mm.feature.Feature#getGroups()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_Groups();

	/**
	 * Returns the meta object for the reference list '{@link de.ubt.ai1.supermod.mm.feature.Feature#getIncomingDependencies <em>Incoming Dependencies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incoming Dependencies</em>'.
	 * @see de.ubt.ai1.supermod.mm.feature.Feature#getIncomingDependencies()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_IncomingDependencies();

	/**
	 * Returns the meta object for the containment reference list '{@link de.ubt.ai1.supermod.mm.feature.Feature#getOutgoingDependencies <em>Outgoing Dependencies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Outgoing Dependencies</em>'.
	 * @see de.ubt.ai1.supermod.mm.feature.Feature#getOutgoingDependencies()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_OutgoingDependencies();

	/**
	 * Returns the meta object for the containment reference list '{@link de.ubt.ai1.supermod.mm.feature.Feature#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see de.ubt.ai1.supermod.mm.feature.Feature#getChildren()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_Children();

	/**
	 * Returns the meta object for the reference list '{@link de.ubt.ai1.supermod.mm.feature.Feature#getParents <em>Parents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Parents</em>'.
	 * @see de.ubt.ai1.supermod.mm.feature.Feature#getParents()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_Parents();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai1.supermod.mm.feature.FeatureGroup <em>Feature Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Group</em>'.
	 * @see de.ubt.ai1.supermod.mm.feature.FeatureGroup
	 * @generated
	 */
	EClass getFeatureGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link de.ubt.ai1.supermod.mm.feature.FeatureGroup#getGroupedFeatures <em>Grouped Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Grouped Features</em>'.
	 * @see de.ubt.ai1.supermod.mm.feature.FeatureGroup#getGroupedFeatures()
	 * @see #getFeatureGroup()
	 * @generated
	 */
	EReference getFeatureGroup_GroupedFeatures();

	/**
	 * Returns the meta object for the containment reference '{@link de.ubt.ai1.supermod.mm.feature.FeatureGroup#getGroupInvariant <em>Group Invariant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Group Invariant</em>'.
	 * @see de.ubt.ai1.supermod.mm.feature.FeatureGroup#getGroupInvariant()
	 * @see #getFeatureGroup()
	 * @generated
	 */
	EReference getFeatureGroup_GroupInvariant();

	/**
	 * Returns the meta object for the container reference '{@link de.ubt.ai1.supermod.mm.feature.FeatureGroup#getParentFeature <em>Parent Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent Feature</em>'.
	 * @see de.ubt.ai1.supermod.mm.feature.FeatureGroup#getParentFeature()
	 * @see #getFeatureGroup()
	 * @generated
	 */
	EReference getFeatureGroup_ParentFeature();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai1.supermod.mm.feature.GroupMembership <em>Group Membership</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Group Membership</em>'.
	 * @see de.ubt.ai1.supermod.mm.feature.GroupMembership
	 * @generated
	 */
	EClass getGroupMembership();

	/**
	 * Returns the meta object for the reference '{@link de.ubt.ai1.supermod.mm.feature.GroupMembership#getGroupedFeature <em>Grouped Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Grouped Feature</em>'.
	 * @see de.ubt.ai1.supermod.mm.feature.GroupMembership#getGroupedFeature()
	 * @see #getGroupMembership()
	 * @generated
	 */
	EReference getGroupMembership_GroupedFeature();

	/**
	 * Returns the meta object for the container reference '{@link de.ubt.ai1.supermod.mm.feature.GroupMembership#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Group</em>'.
	 * @see de.ubt.ai1.supermod.mm.feature.GroupMembership#getGroup()
	 * @see #getGroupMembership()
	 * @generated
	 */
	EReference getGroupMembership_Group();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai1.supermod.mm.feature.OrFeatureGroup <em>Or Feature Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Or Feature Group</em>'.
	 * @see de.ubt.ai1.supermod.mm.feature.OrFeatureGroup
	 * @generated
	 */
	EClass getOrFeatureGroup();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai1.supermod.mm.feature.XorFeatureGroup <em>Xor Feature Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xor Feature Group</em>'.
	 * @see de.ubt.ai1.supermod.mm.feature.XorFeatureGroup
	 * @generated
	 */
	EClass getXorFeatureGroup();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai1.supermod.mm.feature.FeatureDependency <em>Feature Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Dependency</em>'.
	 * @see de.ubt.ai1.supermod.mm.feature.FeatureDependency
	 * @generated
	 */
	EClass getFeatureDependency();

	/**
	 * Returns the meta object for the containment reference '{@link de.ubt.ai1.supermod.mm.feature.FeatureDependency#getDependencyInvariant <em>Dependency Invariant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dependency Invariant</em>'.
	 * @see de.ubt.ai1.supermod.mm.feature.FeatureDependency#getDependencyInvariant()
	 * @see #getFeatureDependency()
	 * @generated
	 */
	EReference getFeatureDependency_DependencyInvariant();

	/**
	 * Returns the meta object for the container reference '{@link de.ubt.ai1.supermod.mm.feature.FeatureDependency#getSourceFeature <em>Source Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Source Feature</em>'.
	 * @see de.ubt.ai1.supermod.mm.feature.FeatureDependency#getSourceFeature()
	 * @see #getFeatureDependency()
	 * @generated
	 */
	EReference getFeatureDependency_SourceFeature();

	/**
	 * Returns the meta object for the reference '{@link de.ubt.ai1.supermod.mm.feature.FeatureDependency#getTargetFeature <em>Target Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Feature</em>'.
	 * @see de.ubt.ai1.supermod.mm.feature.FeatureDependency#getTargetFeature()
	 * @see #getFeatureDependency()
	 * @generated
	 */
	EReference getFeatureDependency_TargetFeature();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai1.supermod.mm.feature.FeatureRequirement <em>Feature Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Requirement</em>'.
	 * @see de.ubt.ai1.supermod.mm.feature.FeatureRequirement
	 * @generated
	 */
	EClass getFeatureRequirement();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai1.supermod.mm.feature.FeatureExclusion <em>Feature Exclusion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Exclusion</em>'.
	 * @see de.ubt.ai1.supermod.mm.feature.FeatureExclusion
	 * @generated
	 */
	EClass getFeatureExclusion();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai1.supermod.mm.feature.RootRelationship <em>Root Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root Relationship</em>'.
	 * @see de.ubt.ai1.supermod.mm.feature.RootRelationship
	 * @generated
	 */
	EClass getRootRelationship();

	/**
	 * Returns the meta object for the containment reference '{@link de.ubt.ai1.supermod.mm.feature.RootRelationship#getRootInvariant <em>Root Invariant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Root Invariant</em>'.
	 * @see de.ubt.ai1.supermod.mm.feature.RootRelationship#getRootInvariant()
	 * @see #getRootRelationship()
	 * @generated
	 */
	EReference getRootRelationship_RootInvariant();

	/**
	 * Returns the meta object for the containment reference '{@link de.ubt.ai1.supermod.mm.feature.RootRelationship#getRootDefault <em>Root Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Root Default</em>'.
	 * @see de.ubt.ai1.supermod.mm.feature.RootRelationship#getRootDefault()
	 * @see #getRootRelationship()
	 * @generated
	 */
	EReference getRootRelationship_RootDefault();

	/**
	 * Returns the meta object for the reference '{@link de.ubt.ai1.supermod.mm.feature.RootRelationship#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Feature</em>'.
	 * @see de.ubt.ai1.supermod.mm.feature.RootRelationship#getFeature()
	 * @see #getRootRelationship()
	 * @generated
	 */
	EReference getRootRelationship_Feature();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai1.supermod.mm.feature.ChildRelationship <em>Child Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Child Relationship</em>'.
	 * @see de.ubt.ai1.supermod.mm.feature.ChildRelationship
	 * @generated
	 */
	EClass getChildRelationship();

	/**
	 * Returns the meta object for the container reference '{@link de.ubt.ai1.supermod.mm.feature.ChildRelationship#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see de.ubt.ai1.supermod.mm.feature.ChildRelationship#getParent()
	 * @see #getChildRelationship()
	 * @generated
	 */
	EReference getChildRelationship_Parent();

	/**
	 * Returns the meta object for the reference '{@link de.ubt.ai1.supermod.mm.feature.ChildRelationship#getChild <em>Child</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Child</em>'.
	 * @see de.ubt.ai1.supermod.mm.feature.ChildRelationship#getChild()
	 * @see #getChildRelationship()
	 * @generated
	 */
	EReference getChildRelationship_Child();

	/**
	 * Returns the meta object for the containment reference '{@link de.ubt.ai1.supermod.mm.feature.ChildRelationship#getParentInvariant <em>Parent Invariant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Parent Invariant</em>'.
	 * @see de.ubt.ai1.supermod.mm.feature.ChildRelationship#getParentInvariant()
	 * @see #getChildRelationship()
	 * @generated
	 */
	EReference getChildRelationship_ParentInvariant();

	/**
	 * Returns the meta object for the containment reference '{@link de.ubt.ai1.supermod.mm.feature.ChildRelationship#getParentPreference <em>Parent Preference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Parent Preference</em>'.
	 * @see de.ubt.ai1.supermod.mm.feature.ChildRelationship#getParentPreference()
	 * @see #getChildRelationship()
	 * @generated
	 */
	EReference getChildRelationship_ParentPreference();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai1.supermod.mm.feature.Mandatory <em>Mandatory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mandatory</em>'.
	 * @see de.ubt.ai1.supermod.mm.feature.Mandatory
	 * @generated
	 */
	EClass getMandatory();

	/**
	 * Returns the meta object for the container reference '{@link de.ubt.ai1.supermod.mm.feature.Mandatory#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Feature</em>'.
	 * @see de.ubt.ai1.supermod.mm.feature.Mandatory#getFeature()
	 * @see #getMandatory()
	 * @generated
	 */
	EReference getMandatory_Feature();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai1.supermod.mm.feature.Elimination <em>Elimination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Elimination</em>'.
	 * @see de.ubt.ai1.supermod.mm.feature.Elimination
	 * @generated
	 */
	EClass getElimination();

	/**
	 * Returns the meta object for the container reference '{@link de.ubt.ai1.supermod.mm.feature.Elimination#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Feature</em>'.
	 * @see de.ubt.ai1.supermod.mm.feature.Elimination#getFeature()
	 * @see #getElimination()
	 * @generated
	 */
	EReference getElimination_Feature();

	/**
	 * Returns the meta object for the attribute '{@link de.ubt.ai1.supermod.mm.feature.Elimination#getDefaultSelection <em>Default Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Selection</em>'.
	 * @see de.ubt.ai1.supermod.mm.feature.Elimination#getDefaultSelection()
	 * @see #getElimination()
	 * @generated
	 */
	EAttribute getElimination_DefaultSelection();

	/**
	 * Returns the meta object for the containment reference '{@link de.ubt.ai1.supermod.mm.feature.Elimination#getEliminationInvariant <em>Elimination Invariant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Elimination Invariant</em>'.
	 * @see de.ubt.ai1.supermod.mm.feature.Elimination#getEliminationInvariant()
	 * @see #getElimination()
	 * @generated
	 */
	EReference getElimination_EliminationInvariant();

	/**
	 * Returns the meta object for the containment reference '{@link de.ubt.ai1.supermod.mm.feature.Elimination#getEliminationDefault <em>Elimination Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Elimination Default</em>'.
	 * @see de.ubt.ai1.supermod.mm.feature.Elimination#getEliminationDefault()
	 * @see #getElimination()
	 * @generated
	 */
	EReference getElimination_EliminationDefault();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SuperModFeatureFactory getSuperModFeatureFactory();

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
		 * The meta object literal for the '{@link de.ubt.ai1.supermod.mm.feature.impl.FeatureModelImpl <em>Feature Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai1.supermod.mm.feature.impl.FeatureModelImpl
		 * @see de.ubt.ai1.supermod.mm.feature.impl.SuperModFeaturePackageImpl#getFeatureModel()
		 * @generated
		 */
		EClass FEATURE_MODEL = eINSTANCE.getFeatureModel();

		/**
		 * The meta object literal for the '<em><b>Roots</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_MODEL__ROOTS = eINSTANCE.getFeatureModel_Roots();

		/**
		 * The meta object literal for the '<em><b>Features</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_MODEL__FEATURES = eINSTANCE.getFeatureModel_Features();

		/**
		 * The meta object literal for the '{@link de.ubt.ai1.supermod.mm.feature.impl.FeatureImpl <em>Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai1.supermod.mm.feature.impl.FeatureImpl
		 * @see de.ubt.ai1.supermod.mm.feature.impl.SuperModFeaturePackageImpl#getFeature()
		 * @generated
		 */
		EClass FEATURE = eINSTANCE.getFeature();

		/**
		 * The meta object literal for the '<em><b>Feature Model</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE__FEATURE_MODEL = eINSTANCE.getFeature_FeatureModel();

		/**
		 * The meta object literal for the '<em><b>Feature Option</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE__FEATURE_OPTION = eINSTANCE.getFeature_FeatureOption();

		/**
		 * The meta object literal for the '<em><b>Names</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE__NAMES = eINSTANCE.getFeature_Names();

		/**
		 * The meta object literal for the '<em><b>Mandatory</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE__MANDATORY = eINSTANCE.getFeature_Mandatory();

		/**
		 * The meta object literal for the '<em><b>Eliminations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE__ELIMINATIONS = eINSTANCE.getFeature_Eliminations();

		/**
		 * The meta object literal for the '<em><b>Incoming Roots</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE__INCOMING_ROOTS = eINSTANCE.getFeature_IncomingRoots();

		/**
		 * The meta object literal for the '<em><b>All Child Features</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE__ALL_CHILD_FEATURES = eINSTANCE.getFeature_AllChildFeatures();

		/**
		 * The meta object literal for the '<em><b>Transitive Elimination State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__TRANSITIVE_ELIMINATION_STATE = eINSTANCE.getFeature_TransitiveEliminationState();

		/**
		 * The meta object literal for the '{@link de.ubt.ai1.supermod.mm.feature.impl.DisplayNameImpl <em>Display Name</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai1.supermod.mm.feature.impl.DisplayNameImpl
		 * @see de.ubt.ai1.supermod.mm.feature.impl.SuperModFeaturePackageImpl#getDisplayName()
		 * @generated
		 */
		EClass DISPLAY_NAME = eINSTANCE.getDisplayName();

		/**
		 * The meta object literal for the '<em><b>Display Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISPLAY_NAME__DISPLAY_NAME = eINSTANCE.getDisplayName_DisplayName();

		/**
		 * The meta object literal for the '<em><b>Feature</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISPLAY_NAME__FEATURE = eINSTANCE.getDisplayName_Feature();

		/**
		 * The meta object literal for the '<em><b>Grouped By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE__GROUPED_BY = eINSTANCE.getFeature_GroupedBy();

		/**
		 * The meta object literal for the '<em><b>Groups</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE__GROUPS = eINSTANCE.getFeature_Groups();

		/**
		 * The meta object literal for the '<em><b>Incoming Dependencies</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE__INCOMING_DEPENDENCIES = eINSTANCE.getFeature_IncomingDependencies();

		/**
		 * The meta object literal for the '<em><b>Outgoing Dependencies</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE__OUTGOING_DEPENDENCIES = eINSTANCE.getFeature_OutgoingDependencies();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE__CHILDREN = eINSTANCE.getFeature_Children();

		/**
		 * The meta object literal for the '<em><b>Parents</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE__PARENTS = eINSTANCE.getFeature_Parents();

		/**
		 * The meta object literal for the '{@link de.ubt.ai1.supermod.mm.feature.impl.FeatureGroupImpl <em>Feature Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai1.supermod.mm.feature.impl.FeatureGroupImpl
		 * @see de.ubt.ai1.supermod.mm.feature.impl.SuperModFeaturePackageImpl#getFeatureGroup()
		 * @generated
		 */
		EClass FEATURE_GROUP = eINSTANCE.getFeatureGroup();

		/**
		 * The meta object literal for the '<em><b>Grouped Features</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_GROUP__GROUPED_FEATURES = eINSTANCE.getFeatureGroup_GroupedFeatures();

		/**
		 * The meta object literal for the '<em><b>Group Invariant</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_GROUP__GROUP_INVARIANT = eINSTANCE.getFeatureGroup_GroupInvariant();

		/**
		 * The meta object literal for the '<em><b>Parent Feature</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_GROUP__PARENT_FEATURE = eINSTANCE.getFeatureGroup_ParentFeature();

		/**
		 * The meta object literal for the '{@link de.ubt.ai1.supermod.mm.feature.impl.GroupMembershipImpl <em>Group Membership</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai1.supermod.mm.feature.impl.GroupMembershipImpl
		 * @see de.ubt.ai1.supermod.mm.feature.impl.SuperModFeaturePackageImpl#getGroupMembership()
		 * @generated
		 */
		EClass GROUP_MEMBERSHIP = eINSTANCE.getGroupMembership();

		/**
		 * The meta object literal for the '<em><b>Grouped Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUP_MEMBERSHIP__GROUPED_FEATURE = eINSTANCE.getGroupMembership_GroupedFeature();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUP_MEMBERSHIP__GROUP = eINSTANCE.getGroupMembership_Group();

		/**
		 * The meta object literal for the '{@link de.ubt.ai1.supermod.mm.feature.impl.OrFeatureGroupImpl <em>Or Feature Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai1.supermod.mm.feature.impl.OrFeatureGroupImpl
		 * @see de.ubt.ai1.supermod.mm.feature.impl.SuperModFeaturePackageImpl#getOrFeatureGroup()
		 * @generated
		 */
		EClass OR_FEATURE_GROUP = eINSTANCE.getOrFeatureGroup();

		/**
		 * The meta object literal for the '{@link de.ubt.ai1.supermod.mm.feature.impl.XorFeatureGroupImpl <em>Xor Feature Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai1.supermod.mm.feature.impl.XorFeatureGroupImpl
		 * @see de.ubt.ai1.supermod.mm.feature.impl.SuperModFeaturePackageImpl#getXorFeatureGroup()
		 * @generated
		 */
		EClass XOR_FEATURE_GROUP = eINSTANCE.getXorFeatureGroup();

		/**
		 * The meta object literal for the '{@link de.ubt.ai1.supermod.mm.feature.impl.FeatureDependencyImpl <em>Feature Dependency</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai1.supermod.mm.feature.impl.FeatureDependencyImpl
		 * @see de.ubt.ai1.supermod.mm.feature.impl.SuperModFeaturePackageImpl#getFeatureDependency()
		 * @generated
		 */
		EClass FEATURE_DEPENDENCY = eINSTANCE.getFeatureDependency();

		/**
		 * The meta object literal for the '<em><b>Dependency Invariant</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_DEPENDENCY__DEPENDENCY_INVARIANT = eINSTANCE.getFeatureDependency_DependencyInvariant();

		/**
		 * The meta object literal for the '<em><b>Source Feature</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_DEPENDENCY__SOURCE_FEATURE = eINSTANCE.getFeatureDependency_SourceFeature();

		/**
		 * The meta object literal for the '<em><b>Target Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_DEPENDENCY__TARGET_FEATURE = eINSTANCE.getFeatureDependency_TargetFeature();

		/**
		 * The meta object literal for the '{@link de.ubt.ai1.supermod.mm.feature.impl.FeatureRequirementImpl <em>Feature Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai1.supermod.mm.feature.impl.FeatureRequirementImpl
		 * @see de.ubt.ai1.supermod.mm.feature.impl.SuperModFeaturePackageImpl#getFeatureRequirement()
		 * @generated
		 */
		EClass FEATURE_REQUIREMENT = eINSTANCE.getFeatureRequirement();

		/**
		 * The meta object literal for the '{@link de.ubt.ai1.supermod.mm.feature.impl.FeatureExclusionImpl <em>Feature Exclusion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai1.supermod.mm.feature.impl.FeatureExclusionImpl
		 * @see de.ubt.ai1.supermod.mm.feature.impl.SuperModFeaturePackageImpl#getFeatureExclusion()
		 * @generated
		 */
		EClass FEATURE_EXCLUSION = eINSTANCE.getFeatureExclusion();

		/**
		 * The meta object literal for the '{@link de.ubt.ai1.supermod.mm.feature.impl.RootRelationshipImpl <em>Root Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai1.supermod.mm.feature.impl.RootRelationshipImpl
		 * @see de.ubt.ai1.supermod.mm.feature.impl.SuperModFeaturePackageImpl#getRootRelationship()
		 * @generated
		 */
		EClass ROOT_RELATIONSHIP = eINSTANCE.getRootRelationship();

		/**
		 * The meta object literal for the '<em><b>Root Invariant</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT_RELATIONSHIP__ROOT_INVARIANT = eINSTANCE.getRootRelationship_RootInvariant();

		/**
		 * The meta object literal for the '<em><b>Root Default</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT_RELATIONSHIP__ROOT_DEFAULT = eINSTANCE.getRootRelationship_RootDefault();

		/**
		 * The meta object literal for the '<em><b>Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT_RELATIONSHIP__FEATURE = eINSTANCE.getRootRelationship_Feature();

		/**
		 * The meta object literal for the '{@link de.ubt.ai1.supermod.mm.feature.impl.ChildRelationshipImpl <em>Child Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai1.supermod.mm.feature.impl.ChildRelationshipImpl
		 * @see de.ubt.ai1.supermod.mm.feature.impl.SuperModFeaturePackageImpl#getChildRelationship()
		 * @generated
		 */
		EClass CHILD_RELATIONSHIP = eINSTANCE.getChildRelationship();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHILD_RELATIONSHIP__PARENT = eINSTANCE.getChildRelationship_Parent();

		/**
		 * The meta object literal for the '<em><b>Child</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHILD_RELATIONSHIP__CHILD = eINSTANCE.getChildRelationship_Child();

		/**
		 * The meta object literal for the '<em><b>Parent Invariant</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHILD_RELATIONSHIP__PARENT_INVARIANT = eINSTANCE.getChildRelationship_ParentInvariant();

		/**
		 * The meta object literal for the '<em><b>Parent Preference</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHILD_RELATIONSHIP__PARENT_PREFERENCE = eINSTANCE.getChildRelationship_ParentPreference();

		/**
		 * The meta object literal for the '{@link de.ubt.ai1.supermod.mm.feature.impl.MandatoryImpl <em>Mandatory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai1.supermod.mm.feature.impl.MandatoryImpl
		 * @see de.ubt.ai1.supermod.mm.feature.impl.SuperModFeaturePackageImpl#getMandatory()
		 * @generated
		 */
		EClass MANDATORY = eINSTANCE.getMandatory();

		/**
		 * The meta object literal for the '<em><b>Feature</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MANDATORY__FEATURE = eINSTANCE.getMandatory_Feature();

		/**
		 * The meta object literal for the '{@link de.ubt.ai1.supermod.mm.feature.impl.EliminationImpl <em>Elimination</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai1.supermod.mm.feature.impl.EliminationImpl
		 * @see de.ubt.ai1.supermod.mm.feature.impl.SuperModFeaturePackageImpl#getElimination()
		 * @generated
		 */
		EClass ELIMINATION = eINSTANCE.getElimination();

		/**
		 * The meta object literal for the '<em><b>Feature</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELIMINATION__FEATURE = eINSTANCE.getElimination_Feature();

		/**
		 * The meta object literal for the '<em><b>Default Selection</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELIMINATION__DEFAULT_SELECTION = eINSTANCE.getElimination_DefaultSelection();

		/**
		 * The meta object literal for the '<em><b>Elimination Invariant</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELIMINATION__ELIMINATION_INVARIANT = eINSTANCE.getElimination_EliminationInvariant();

		/**
		 * The meta object literal for the '<em><b>Elimination Default</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELIMINATION__ELIMINATION_DEFAULT = eINSTANCE.getElimination_EliminationDefault();

	}

} //SuperModSPLEPackage
