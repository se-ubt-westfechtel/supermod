/**
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package de.ubt.ai1.supermod.mm.collab;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
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
 * <!-- end-user-doc -->
 * @see de.ubt.ai1.supermod.mm.collab.SuperModCollabFactory
 * @model kind="package"
 * @generated
 */
public interface SuperModCollabPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "collab";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://ai1.uni-bayreuth.de/supermod/collab/0.1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "de.ubt.ai1.supermod.mm.collab";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SuperModCollabPackage eINSTANCE = de.ubt.ai1.supermod.mm.collab.impl.SuperModCollabPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.ubt.ai1.supermod.mm.collab.impl.CollaborativeRevisionDimensionImpl <em>Collaborative Revision Dimension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai1.supermod.mm.collab.impl.CollaborativeRevisionDimensionImpl
	 * @see de.ubt.ai1.supermod.mm.collab.impl.SuperModCollabPackageImpl#getCollaborativeRevisionDimension()
	 * @generated
	 */
	int COLLABORATIVE_REVISION_DIMENSION = 0;

	/**
	 * The feature id for the '<em><b>Dimension Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATIVE_REVISION_DIMENSION__DIMENSION_NAME = SuperModCorePackage.VERSION_DIMENSION__DIMENSION_NAME;

	/**
	 * The feature id for the '<em><b>Root Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATIVE_REVISION_DIMENSION__ROOT_ELEMENTS = SuperModCorePackage.VERSION_DIMENSION__ROOT_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATIVE_REVISION_DIMENSION__ALL_ELEMENTS = SuperModCorePackage.VERSION_DIMENSION__ALL_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Options</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATIVE_REVISION_DIMENSION__OPTIONS = SuperModCorePackage.VERSION_DIMENSION__OPTIONS;

	/**
	 * The feature id for the '<em><b>Invariants</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATIVE_REVISION_DIMENSION__INVARIANTS = SuperModCorePackage.VERSION_DIMENSION__INVARIANTS;

	/**
	 * The feature id for the '<em><b>Preferences</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATIVE_REVISION_DIMENSION__PREFERENCES = SuperModCorePackage.VERSION_DIMENSION__PREFERENCES;

	/**
	 * The feature id for the '<em><b>Default Bindings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATIVE_REVISION_DIMENSION__DEFAULT_BINDINGS = SuperModCorePackage.VERSION_DIMENSION__DEFAULT_BINDINGS;

	/**
	 * The feature id for the '<em><b>Root Version Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATIVE_REVISION_DIMENSION__ROOT_VERSION_SPACE_ELEMENTS = SuperModCorePackage.VERSION_DIMENSION__ROOT_VERSION_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Version Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATIVE_REVISION_DIMENSION__ALL_VERSION_SPACE_ELEMENTS = SuperModCorePackage.VERSION_DIMENSION__ALL_VERSION_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Version Space</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATIVE_REVISION_DIMENSION__VERSION_SPACE = SuperModCorePackage.VERSION_DIMENSION__VERSION_SPACE;

	/**
	 * The feature id for the '<em><b>Public Revisions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATIVE_REVISION_DIMENSION__PUBLIC_REVISIONS = SuperModCorePackage.VERSION_DIMENSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Initial Public Revision</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATIVE_REVISION_DIMENSION__INITIAL_PUBLIC_REVISION = SuperModCorePackage.VERSION_DIMENSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Initial Public Revision Invariant</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATIVE_REVISION_DIMENSION__INITIAL_PUBLIC_REVISION_INVARIANT = SuperModCorePackage.VERSION_DIMENSION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Latest Public Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATIVE_REVISION_DIMENSION__LATEST_PUBLIC_REVISION_NUMBER = SuperModCorePackage.VERSION_DIMENSION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Public Head</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATIVE_REVISION_DIMENSION__PUBLIC_HEAD = SuperModCorePackage.VERSION_DIMENSION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Current Public Revision</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATIVE_REVISION_DIMENSION__CURRENT_PUBLIC_REVISION = SuperModCorePackage.VERSION_DIMENSION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>All Revisions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATIVE_REVISION_DIMENSION__ALL_REVISIONS = SuperModCorePackage.VERSION_DIMENSION_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Collaborative Revision Dimension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATIVE_REVISION_DIMENSION_FEATURE_COUNT = SuperModCorePackage.VERSION_DIMENSION_FEATURE_COUNT + 7;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATIVE_REVISION_DIMENSION___VALIDATE__OPTIONBINDING = SuperModCorePackage.VERSION_DIMENSION___VALIDATE__OPTIONBINDING;

	/**
	 * The operation id for the '<em>Is Complete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATIVE_REVISION_DIMENSION___IS_COMPLETE__OPTIONBINDING = SuperModCorePackage.VERSION_DIMENSION___IS_COMPLETE__OPTIONBINDING;

	/**
	 * The operation id for the '<em>Is Satisfiable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATIVE_REVISION_DIMENSION___IS_SATISFIABLE__OPTIONBINDING = SuperModCorePackage.VERSION_DIMENSION___IS_SATISFIABLE__OPTIONBINDING;

	/**
	 * The operation id for the '<em>Apply Preferences</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATIVE_REVISION_DIMENSION___APPLY_PREFERENCES__OPTIONBINDING = SuperModCorePackage.VERSION_DIMENSION___APPLY_PREFERENCES__OPTIONBINDING;

	/**
	 * The operation id for the '<em>Apply Defaults</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATIVE_REVISION_DIMENSION___APPLY_DEFAULTS__OPTIONBINDING = SuperModCorePackage.VERSION_DIMENSION___APPLY_DEFAULTS__OPTIONBINDING;

	/**
	 * The operation id for the '<em>Apply Completions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATIVE_REVISION_DIMENSION___APPLY_COMPLETIONS__OPTIONBINDING = SuperModCorePackage.VERSION_DIMENSION___APPLY_COMPLETIONS__OPTIONBINDING;

	/**
	 * The operation id for the '<em>Get Option</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATIVE_REVISION_DIMENSION___GET_OPTION__STRING = SuperModCorePackage.VERSION_DIMENSION___GET_OPTION__STRING;

	/**
	 * The operation id for the '<em>Get Revisions For Binding</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATIVE_REVISION_DIMENSION___GET_REVISIONS_FOR_BINDING__OPTIONBINDING = SuperModCorePackage.VERSION_DIMENSION_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Latest Revisions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATIVE_REVISION_DIMENSION___GET_LATEST_REVISIONS__ELIST = SuperModCorePackage.VERSION_DIMENSION_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Latest Public Revisions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATIVE_REVISION_DIMENSION___GET_LATEST_PUBLIC_REVISIONS__ELIST = SuperModCorePackage.VERSION_DIMENSION_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Collaborative Revision Dimension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATIVE_REVISION_DIMENSION_OPERATION_COUNT = SuperModCorePackage.VERSION_DIMENSION_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link de.ubt.ai1.supermod.mm.collab.impl.RevisionImpl <em>Revision</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai1.supermod.mm.collab.impl.RevisionImpl
	 * @see de.ubt.ai1.supermod.mm.collab.impl.SuperModCollabPackageImpl#getRevision()
	 * @generated
	 */
	int REVISION = 1;

	/**
	 * The feature id for the '<em><b>Super Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVISION__SUPER_ELEMENT = SuperModCorePackage.VERSION_SPACE_ELEMENT__SUPER_ELEMENT;

	/**
	 * The feature id for the '<em><b>Sub Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVISION__SUB_ELEMENTS = SuperModCorePackage.VERSION_SPACE_ELEMENT__SUB_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Super Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVISION__ALL_SUPER_ELEMENTS = SuperModCorePackage.VERSION_SPACE_ELEMENT__ALL_SUPER_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Sub Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVISION__ALL_SUB_ELEMENTS = SuperModCorePackage.VERSION_SPACE_ELEMENT__ALL_SUB_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Cross Referenced Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVISION__CROSS_REFERENCED_ELEMENTS = SuperModCorePackage.VERSION_SPACE_ELEMENT__CROSS_REFERENCED_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Cross Referencing Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVISION__CROSS_REFERENCING_ELEMENTS = SuperModCorePackage.VERSION_SPACE_ELEMENT__CROSS_REFERENCING_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Proxy UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVISION__PROXY_UUID = SuperModCorePackage.VERSION_SPACE_ELEMENT__PROXY_UUID;

	/**
	 * The feature id for the '<em><b>Transaction Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVISION__TRANSACTION_ID = SuperModCorePackage.VERSION_SPACE_ELEMENT__TRANSACTION_ID;

	/**
	 * The feature id for the '<em><b>Version Dimension</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVISION__VERSION_DIMENSION = SuperModCorePackage.VERSION_SPACE_ELEMENT__VERSION_DIMENSION;

	/**
	 * The feature id for the '<em><b>Version Space</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVISION__VERSION_SPACE = SuperModCorePackage.VERSION_SPACE_ELEMENT__VERSION_SPACE;

	/**
	 * The feature id for the '<em><b>Super Version Space Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVISION__SUPER_VERSION_SPACE_ELEMENT = SuperModCorePackage.VERSION_SPACE_ELEMENT__SUPER_VERSION_SPACE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Sub Version Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVISION__SUB_VERSION_SPACE_ELEMENTS = SuperModCorePackage.VERSION_SPACE_ELEMENT__SUB_VERSION_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Super Version Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVISION__ALL_SUPER_VERSION_SPACE_ELEMENTS = SuperModCorePackage.VERSION_SPACE_ELEMENT__ALL_SUPER_VERSION_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Sub Version Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVISION__ALL_SUB_VERSION_SPACE_ELEMENTS = SuperModCorePackage.VERSION_SPACE_ELEMENT__ALL_SUB_VERSION_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Cross Referenced Version Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVISION__CROSS_REFERENCED_VERSION_SPACE_ELEMENTS = SuperModCorePackage.VERSION_SPACE_ELEMENT__CROSS_REFERENCED_VERSION_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Cross Referencing Version Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVISION__CROSS_REFERENCING_VERSION_SPACE_ELEMENTS = SuperModCorePackage.VERSION_SPACE_ELEMENT__CROSS_REFERENCING_VERSION_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Low Level Concepts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVISION__LOW_LEVEL_CONCEPTS = SuperModCorePackage.VERSION_SPACE_ELEMENT__LOW_LEVEL_CONCEPTS;

	/**
	 * The feature id for the '<em><b>Predecessors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVISION__PREDECESSORS = SuperModCorePackage.VERSION_SPACE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Successors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVISION__SUCCESSORS = SuperModCorePackage.VERSION_SPACE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>All Predecessors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVISION__ALL_PREDECESSORS = SuperModCorePackage.VERSION_SPACE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>All Successors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVISION__ALL_SUCCESSORS = SuperModCorePackage.VERSION_SPACE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Earliest Predecessors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVISION__EARLIEST_PREDECESSORS = SuperModCorePackage.VERSION_SPACE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Latest Successors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVISION__LATEST_SUCCESSORS = SuperModCorePackage.VERSION_SPACE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Revision Option</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVISION__REVISION_OPTION = SuperModCorePackage.VERSION_SPACE_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Revision Default Binding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVISION__REVISION_DEFAULT_BINDING = SuperModCorePackage.VERSION_SPACE_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Predecessor Preferences</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVISION__PREDECESSOR_PREFERENCES = SuperModCorePackage.VERSION_SPACE_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVISION__REVISION_NUMBER = SuperModCorePackage.VERSION_SPACE_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Display Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVISION__DISPLAY_REVISION_NUMBER = SuperModCorePackage.VERSION_SPACE_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVISION__DATE = SuperModCorePackage.VERSION_SPACE_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Commit Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVISION__COMMIT_MESSAGE = SuperModCorePackage.VERSION_SPACE_ELEMENT_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>Revision</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVISION_FEATURE_COUNT = SuperModCorePackage.VERSION_SPACE_ELEMENT_FEATURE_COUNT + 13;

	/**
	 * The operation id for the '<em>Is Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVISION___IS_PROXY = SuperModCorePackage.VERSION_SPACE_ELEMENT___IS_PROXY;

	/**
	 * The number of operations of the '<em>Revision</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVISION_OPERATION_COUNT = SuperModCorePackage.VERSION_SPACE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.ubt.ai1.supermod.mm.collab.impl.PublicRevisionImpl <em>Public Revision</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai1.supermod.mm.collab.impl.PublicRevisionImpl
	 * @see de.ubt.ai1.supermod.mm.collab.impl.SuperModCollabPackageImpl#getPublicRevision()
	 * @generated
	 */
	int PUBLIC_REVISION = 2;

	/**
	 * The feature id for the '<em><b>Super Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_REVISION__SUPER_ELEMENT = REVISION__SUPER_ELEMENT;

	/**
	 * The feature id for the '<em><b>Sub Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_REVISION__SUB_ELEMENTS = REVISION__SUB_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Super Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_REVISION__ALL_SUPER_ELEMENTS = REVISION__ALL_SUPER_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Sub Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_REVISION__ALL_SUB_ELEMENTS = REVISION__ALL_SUB_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Cross Referenced Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_REVISION__CROSS_REFERENCED_ELEMENTS = REVISION__CROSS_REFERENCED_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Cross Referencing Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_REVISION__CROSS_REFERENCING_ELEMENTS = REVISION__CROSS_REFERENCING_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Proxy UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_REVISION__PROXY_UUID = REVISION__PROXY_UUID;

	/**
	 * The feature id for the '<em><b>Transaction Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_REVISION__TRANSACTION_ID = REVISION__TRANSACTION_ID;

	/**
	 * The feature id for the '<em><b>Version Dimension</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_REVISION__VERSION_DIMENSION = REVISION__VERSION_DIMENSION;

	/**
	 * The feature id for the '<em><b>Version Space</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_REVISION__VERSION_SPACE = REVISION__VERSION_SPACE;

	/**
	 * The feature id for the '<em><b>Super Version Space Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_REVISION__SUPER_VERSION_SPACE_ELEMENT = REVISION__SUPER_VERSION_SPACE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Sub Version Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_REVISION__SUB_VERSION_SPACE_ELEMENTS = REVISION__SUB_VERSION_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Super Version Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_REVISION__ALL_SUPER_VERSION_SPACE_ELEMENTS = REVISION__ALL_SUPER_VERSION_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Sub Version Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_REVISION__ALL_SUB_VERSION_SPACE_ELEMENTS = REVISION__ALL_SUB_VERSION_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Cross Referenced Version Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_REVISION__CROSS_REFERENCED_VERSION_SPACE_ELEMENTS = REVISION__CROSS_REFERENCED_VERSION_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Cross Referencing Version Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_REVISION__CROSS_REFERENCING_VERSION_SPACE_ELEMENTS = REVISION__CROSS_REFERENCING_VERSION_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Low Level Concepts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_REVISION__LOW_LEVEL_CONCEPTS = REVISION__LOW_LEVEL_CONCEPTS;

	/**
	 * The feature id for the '<em><b>Predecessors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_REVISION__PREDECESSORS = REVISION__PREDECESSORS;

	/**
	 * The feature id for the '<em><b>Successors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_REVISION__SUCCESSORS = REVISION__SUCCESSORS;

	/**
	 * The feature id for the '<em><b>All Predecessors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_REVISION__ALL_PREDECESSORS = REVISION__ALL_PREDECESSORS;

	/**
	 * The feature id for the '<em><b>All Successors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_REVISION__ALL_SUCCESSORS = REVISION__ALL_SUCCESSORS;

	/**
	 * The feature id for the '<em><b>Earliest Predecessors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_REVISION__EARLIEST_PREDECESSORS = REVISION__EARLIEST_PREDECESSORS;

	/**
	 * The feature id for the '<em><b>Latest Successors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_REVISION__LATEST_SUCCESSORS = REVISION__LATEST_SUCCESSORS;

	/**
	 * The feature id for the '<em><b>Revision Option</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_REVISION__REVISION_OPTION = REVISION__REVISION_OPTION;

	/**
	 * The feature id for the '<em><b>Revision Default Binding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_REVISION__REVISION_DEFAULT_BINDING = REVISION__REVISION_DEFAULT_BINDING;

	/**
	 * The feature id for the '<em><b>Predecessor Preferences</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_REVISION__PREDECESSOR_PREFERENCES = REVISION__PREDECESSOR_PREFERENCES;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_REVISION__REVISION_NUMBER = REVISION__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Display Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_REVISION__DISPLAY_REVISION_NUMBER = REVISION__DISPLAY_REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_REVISION__DATE = REVISION__DATE;

	/**
	 * The feature id for the '<em><b>Commit Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_REVISION__COMMIT_MESSAGE = REVISION__COMMIT_MESSAGE;

	/**
	 * The feature id for the '<em><b>Revision Dimension</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_REVISION__REVISION_DIMENSION = REVISION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Private Revisions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_REVISION__PRIVATE_REVISIONS = REVISION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Committer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_REVISION__COMMITTER = REVISION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Latest Private Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_REVISION__LATEST_PRIVATE_REVISION_NUMBER = REVISION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Initial Private Revision</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_REVISION__INITIAL_PRIVATE_REVISION = REVISION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Private Head</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_REVISION__PRIVATE_HEAD = REVISION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Head</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_REVISION__HEAD = REVISION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Finished</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_REVISION__FINISHED = REVISION_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Finished Option</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_REVISION__FINISHED_OPTION = REVISION_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Finished Default Binding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_REVISION__FINISHED_DEFAULT_BINDING = REVISION_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Public Revision</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_REVISION_FEATURE_COUNT = REVISION_FEATURE_COUNT + 10;

	/**
	 * The operation id for the '<em>Is Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_REVISION___IS_PROXY = REVISION___IS_PROXY;

	/**
	 * The number of operations of the '<em>Public Revision</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_REVISION_OPERATION_COUNT = REVISION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.ubt.ai1.supermod.mm.collab.impl.PrivateRevisionImpl <em>Private Revision</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai1.supermod.mm.collab.impl.PrivateRevisionImpl
	 * @see de.ubt.ai1.supermod.mm.collab.impl.SuperModCollabPackageImpl#getPrivateRevision()
	 * @generated
	 */
	int PRIVATE_REVISION = 3;

	/**
	 * The feature id for the '<em><b>Super Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_REVISION__SUPER_ELEMENT = REVISION__SUPER_ELEMENT;

	/**
	 * The feature id for the '<em><b>Sub Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_REVISION__SUB_ELEMENTS = REVISION__SUB_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Super Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_REVISION__ALL_SUPER_ELEMENTS = REVISION__ALL_SUPER_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Sub Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_REVISION__ALL_SUB_ELEMENTS = REVISION__ALL_SUB_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Cross Referenced Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_REVISION__CROSS_REFERENCED_ELEMENTS = REVISION__CROSS_REFERENCED_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Cross Referencing Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_REVISION__CROSS_REFERENCING_ELEMENTS = REVISION__CROSS_REFERENCING_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Proxy UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_REVISION__PROXY_UUID = REVISION__PROXY_UUID;

	/**
	 * The feature id for the '<em><b>Transaction Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_REVISION__TRANSACTION_ID = REVISION__TRANSACTION_ID;

	/**
	 * The feature id for the '<em><b>Version Dimension</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_REVISION__VERSION_DIMENSION = REVISION__VERSION_DIMENSION;

	/**
	 * The feature id for the '<em><b>Version Space</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_REVISION__VERSION_SPACE = REVISION__VERSION_SPACE;

	/**
	 * The feature id for the '<em><b>Super Version Space Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_REVISION__SUPER_VERSION_SPACE_ELEMENT = REVISION__SUPER_VERSION_SPACE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Sub Version Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_REVISION__SUB_VERSION_SPACE_ELEMENTS = REVISION__SUB_VERSION_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Super Version Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_REVISION__ALL_SUPER_VERSION_SPACE_ELEMENTS = REVISION__ALL_SUPER_VERSION_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Sub Version Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_REVISION__ALL_SUB_VERSION_SPACE_ELEMENTS = REVISION__ALL_SUB_VERSION_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Cross Referenced Version Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_REVISION__CROSS_REFERENCED_VERSION_SPACE_ELEMENTS = REVISION__CROSS_REFERENCED_VERSION_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Cross Referencing Version Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_REVISION__CROSS_REFERENCING_VERSION_SPACE_ELEMENTS = REVISION__CROSS_REFERENCING_VERSION_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Low Level Concepts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_REVISION__LOW_LEVEL_CONCEPTS = REVISION__LOW_LEVEL_CONCEPTS;

	/**
	 * The feature id for the '<em><b>Predecessors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_REVISION__PREDECESSORS = REVISION__PREDECESSORS;

	/**
	 * The feature id for the '<em><b>Successors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_REVISION__SUCCESSORS = REVISION__SUCCESSORS;

	/**
	 * The feature id for the '<em><b>All Predecessors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_REVISION__ALL_PREDECESSORS = REVISION__ALL_PREDECESSORS;

	/**
	 * The feature id for the '<em><b>All Successors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_REVISION__ALL_SUCCESSORS = REVISION__ALL_SUCCESSORS;

	/**
	 * The feature id for the '<em><b>Earliest Predecessors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_REVISION__EARLIEST_PREDECESSORS = REVISION__EARLIEST_PREDECESSORS;

	/**
	 * The feature id for the '<em><b>Latest Successors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_REVISION__LATEST_SUCCESSORS = REVISION__LATEST_SUCCESSORS;

	/**
	 * The feature id for the '<em><b>Revision Option</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_REVISION__REVISION_OPTION = REVISION__REVISION_OPTION;

	/**
	 * The feature id for the '<em><b>Revision Default Binding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_REVISION__REVISION_DEFAULT_BINDING = REVISION__REVISION_DEFAULT_BINDING;

	/**
	 * The feature id for the '<em><b>Predecessor Preferences</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_REVISION__PREDECESSOR_PREFERENCES = REVISION__PREDECESSOR_PREFERENCES;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_REVISION__REVISION_NUMBER = REVISION__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Display Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_REVISION__DISPLAY_REVISION_NUMBER = REVISION__DISPLAY_REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_REVISION__DATE = REVISION__DATE;

	/**
	 * The feature id for the '<em><b>Commit Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_REVISION__COMMIT_MESSAGE = REVISION__COMMIT_MESSAGE;

	/**
	 * The feature id for the '<em><b>Public Revision</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_REVISION__PUBLIC_REVISION = REVISION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Public Predecessors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_REVISION__PUBLIC_PREDECESSORS = REVISION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Private Revision</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_REVISION_FEATURE_COUNT = REVISION_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Is Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_REVISION___IS_PROXY = REVISION___IS_PROXY;

	/**
	 * The number of operations of the '<em>Private Revision</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_REVISION_OPERATION_COUNT = REVISION_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link de.ubt.ai1.supermod.mm.collab.CollaborativeRevisionDimension <em>Collaborative Revision Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Collaborative Revision Dimension</em>'.
	 * @see de.ubt.ai1.supermod.mm.collab.CollaborativeRevisionDimension
	 * @generated
	 */
	EClass getCollaborativeRevisionDimension();

	/**
	 * Returns the meta object for the containment reference list '{@link de.ubt.ai1.supermod.mm.collab.CollaborativeRevisionDimension#getPublicRevisions <em>Public Revisions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Public Revisions</em>'.
	 * @see de.ubt.ai1.supermod.mm.collab.CollaborativeRevisionDimension#getPublicRevisions()
	 * @see #getCollaborativeRevisionDimension()
	 * @generated
	 */
	EReference getCollaborativeRevisionDimension_PublicRevisions();

	/**
	 * Returns the meta object for the reference '{@link de.ubt.ai1.supermod.mm.collab.CollaborativeRevisionDimension#getInitialPublicRevision <em>Initial Public Revision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Initial Public Revision</em>'.
	 * @see de.ubt.ai1.supermod.mm.collab.CollaborativeRevisionDimension#getInitialPublicRevision()
	 * @see #getCollaborativeRevisionDimension()
	 * @generated
	 */
	EReference getCollaborativeRevisionDimension_InitialPublicRevision();

	/**
	 * Returns the meta object for the containment reference '{@link de.ubt.ai1.supermod.mm.collab.CollaborativeRevisionDimension#getInitialPublicRevisionInvariant <em>Initial Public Revision Invariant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Initial Public Revision Invariant</em>'.
	 * @see de.ubt.ai1.supermod.mm.collab.CollaborativeRevisionDimension#getInitialPublicRevisionInvariant()
	 * @see #getCollaborativeRevisionDimension()
	 * @generated
	 */
	EReference getCollaborativeRevisionDimension_InitialPublicRevisionInvariant();

	/**
	 * Returns the meta object for the attribute '{@link de.ubt.ai1.supermod.mm.collab.CollaborativeRevisionDimension#getLatestPublicRevisionNumber <em>Latest Public Revision Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Latest Public Revision Number</em>'.
	 * @see de.ubt.ai1.supermod.mm.collab.CollaborativeRevisionDimension#getLatestPublicRevisionNumber()
	 * @see #getCollaborativeRevisionDimension()
	 * @generated
	 */
	EAttribute getCollaborativeRevisionDimension_LatestPublicRevisionNumber();

	/**
	 * Returns the meta object for the reference '{@link de.ubt.ai1.supermod.mm.collab.CollaborativeRevisionDimension#getPublicHead <em>Public Head</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Public Head</em>'.
	 * @see de.ubt.ai1.supermod.mm.collab.CollaborativeRevisionDimension#getPublicHead()
	 * @see #getCollaborativeRevisionDimension()
	 * @generated
	 */
	EReference getCollaborativeRevisionDimension_PublicHead();

	/**
	 * Returns the meta object for the reference '{@link de.ubt.ai1.supermod.mm.collab.CollaborativeRevisionDimension#getCurrentPublicRevision <em>Current Public Revision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Current Public Revision</em>'.
	 * @see de.ubt.ai1.supermod.mm.collab.CollaborativeRevisionDimension#getCurrentPublicRevision()
	 * @see #getCollaborativeRevisionDimension()
	 * @generated
	 */
	EReference getCollaborativeRevisionDimension_CurrentPublicRevision();

	/**
	 * Returns the meta object for the reference list '{@link de.ubt.ai1.supermod.mm.collab.CollaborativeRevisionDimension#getAllRevisions <em>All Revisions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>All Revisions</em>'.
	 * @see de.ubt.ai1.supermod.mm.collab.CollaborativeRevisionDimension#getAllRevisions()
	 * @see #getCollaborativeRevisionDimension()
	 * @generated
	 */
	EReference getCollaborativeRevisionDimension_AllRevisions();

	/**
	 * Returns the meta object for the '{@link de.ubt.ai1.supermod.mm.collab.CollaborativeRevisionDimension#getRevisionsForBinding(de.ubt.ai1.supermod.mm.core.OptionBinding) <em>Get Revisions For Binding</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Revisions For Binding</em>' operation.
	 * @see de.ubt.ai1.supermod.mm.collab.CollaborativeRevisionDimension#getRevisionsForBinding(de.ubt.ai1.supermod.mm.core.OptionBinding)
	 * @generated
	 */
	EOperation getCollaborativeRevisionDimension__GetRevisionsForBinding__OptionBinding();

	/**
	 * Returns the meta object for the '{@link de.ubt.ai1.supermod.mm.collab.CollaborativeRevisionDimension#getLatestRevisions(org.eclipse.emf.common.util.EList) <em>Get Latest Revisions</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Latest Revisions</em>' operation.
	 * @see de.ubt.ai1.supermod.mm.collab.CollaborativeRevisionDimension#getLatestRevisions(org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getCollaborativeRevisionDimension__GetLatestRevisions__EList();

	/**
	 * Returns the meta object for the '{@link de.ubt.ai1.supermod.mm.collab.CollaborativeRevisionDimension#getLatestPublicRevisions(org.eclipse.emf.common.util.EList) <em>Get Latest Public Revisions</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Latest Public Revisions</em>' operation.
	 * @see de.ubt.ai1.supermod.mm.collab.CollaborativeRevisionDimension#getLatestPublicRevisions(org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getCollaborativeRevisionDimension__GetLatestPublicRevisions__EList();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai1.supermod.mm.collab.Revision <em>Revision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Revision</em>'.
	 * @see de.ubt.ai1.supermod.mm.collab.Revision
	 * @generated
	 */
	EClass getRevision();

	/**
	 * Returns the meta object for the reference list '{@link de.ubt.ai1.supermod.mm.collab.Revision#getPredecessors <em>Predecessors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Predecessors</em>'.
	 * @see de.ubt.ai1.supermod.mm.collab.Revision#getPredecessors()
	 * @see #getRevision()
	 * @generated
	 */
	EReference getRevision_Predecessors();

	/**
	 * Returns the meta object for the reference list '{@link de.ubt.ai1.supermod.mm.collab.Revision#getSuccessors <em>Successors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Successors</em>'.
	 * @see de.ubt.ai1.supermod.mm.collab.Revision#getSuccessors()
	 * @see #getRevision()
	 * @generated
	 */
	EReference getRevision_Successors();

	/**
	 * Returns the meta object for the reference list '{@link de.ubt.ai1.supermod.mm.collab.Revision#getAllPredecessors <em>All Predecessors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>All Predecessors</em>'.
	 * @see de.ubt.ai1.supermod.mm.collab.Revision#getAllPredecessors()
	 * @see #getRevision()
	 * @generated
	 */
	EReference getRevision_AllPredecessors();

	/**
	 * Returns the meta object for the reference list '{@link de.ubt.ai1.supermod.mm.collab.Revision#getAllSuccessors <em>All Successors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>All Successors</em>'.
	 * @see de.ubt.ai1.supermod.mm.collab.Revision#getAllSuccessors()
	 * @see #getRevision()
	 * @generated
	 */
	EReference getRevision_AllSuccessors();

	/**
	 * Returns the meta object for the reference list '{@link de.ubt.ai1.supermod.mm.collab.Revision#getEarliestPredecessors <em>Earliest Predecessors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Earliest Predecessors</em>'.
	 * @see de.ubt.ai1.supermod.mm.collab.Revision#getEarliestPredecessors()
	 * @see #getRevision()
	 * @generated
	 */
	EReference getRevision_EarliestPredecessors();

	/**
	 * Returns the meta object for the reference list '{@link de.ubt.ai1.supermod.mm.collab.Revision#getLatestSuccessors <em>Latest Successors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Latest Successors</em>'.
	 * @see de.ubt.ai1.supermod.mm.collab.Revision#getLatestSuccessors()
	 * @see #getRevision()
	 * @generated
	 */
	EReference getRevision_LatestSuccessors();

	/**
	 * Returns the meta object for the containment reference '{@link de.ubt.ai1.supermod.mm.collab.Revision#getRevisionOption <em>Revision Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Revision Option</em>'.
	 * @see de.ubt.ai1.supermod.mm.collab.Revision#getRevisionOption()
	 * @see #getRevision()
	 * @generated
	 */
	EReference getRevision_RevisionOption();

	/**
	 * Returns the meta object for the containment reference '{@link de.ubt.ai1.supermod.mm.collab.Revision#getRevisionDefaultBinding <em>Revision Default Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Revision Default Binding</em>'.
	 * @see de.ubt.ai1.supermod.mm.collab.Revision#getRevisionDefaultBinding()
	 * @see #getRevision()
	 * @generated
	 */
	EReference getRevision_RevisionDefaultBinding();

	/**
	 * Returns the meta object for the containment reference list '{@link de.ubt.ai1.supermod.mm.collab.Revision#getPredecessorPreferences <em>Predecessor Preferences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Predecessor Preferences</em>'.
	 * @see de.ubt.ai1.supermod.mm.collab.Revision#getPredecessorPreferences()
	 * @see #getRevision()
	 * @generated
	 */
	EReference getRevision_PredecessorPreferences();

	/**
	 * Returns the meta object for the attribute '{@link de.ubt.ai1.supermod.mm.collab.Revision#getRevisionNumber <em>Revision Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Revision Number</em>'.
	 * @see de.ubt.ai1.supermod.mm.collab.Revision#getRevisionNumber()
	 * @see #getRevision()
	 * @generated
	 */
	EAttribute getRevision_RevisionNumber();

	/**
	 * Returns the meta object for the attribute '{@link de.ubt.ai1.supermod.mm.collab.Revision#getDisplayRevisionNumber <em>Display Revision Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display Revision Number</em>'.
	 * @see de.ubt.ai1.supermod.mm.collab.Revision#getDisplayRevisionNumber()
	 * @see #getRevision()
	 * @generated
	 */
	EAttribute getRevision_DisplayRevisionNumber();

	/**
	 * Returns the meta object for the attribute '{@link de.ubt.ai1.supermod.mm.collab.Revision#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see de.ubt.ai1.supermod.mm.collab.Revision#getDate()
	 * @see #getRevision()
	 * @generated
	 */
	EAttribute getRevision_Date();

	/**
	 * Returns the meta object for the attribute '{@link de.ubt.ai1.supermod.mm.collab.Revision#getCommitMessage <em>Commit Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Commit Message</em>'.
	 * @see de.ubt.ai1.supermod.mm.collab.Revision#getCommitMessage()
	 * @see #getRevision()
	 * @generated
	 */
	EAttribute getRevision_CommitMessage();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai1.supermod.mm.collab.PublicRevision <em>Public Revision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Public Revision</em>'.
	 * @see de.ubt.ai1.supermod.mm.collab.PublicRevision
	 * @generated
	 */
	EClass getPublicRevision();

	/**
	 * Returns the meta object for the container reference '{@link de.ubt.ai1.supermod.mm.collab.PublicRevision#getRevisionDimension <em>Revision Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Revision Dimension</em>'.
	 * @see de.ubt.ai1.supermod.mm.collab.PublicRevision#getRevisionDimension()
	 * @see #getPublicRevision()
	 * @generated
	 */
	EReference getPublicRevision_RevisionDimension();

	/**
	 * Returns the meta object for the containment reference list '{@link de.ubt.ai1.supermod.mm.collab.PublicRevision#getPrivateRevisions <em>Private Revisions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Private Revisions</em>'.
	 * @see de.ubt.ai1.supermod.mm.collab.PublicRevision#getPrivateRevisions()
	 * @see #getPublicRevision()
	 * @generated
	 */
	EReference getPublicRevision_PrivateRevisions();

	/**
	 * Returns the meta object for the attribute '{@link de.ubt.ai1.supermod.mm.collab.PublicRevision#getCommitter <em>Committer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Committer</em>'.
	 * @see de.ubt.ai1.supermod.mm.collab.PublicRevision#getCommitter()
	 * @see #getPublicRevision()
	 * @generated
	 */
	EAttribute getPublicRevision_Committer();

	/**
	 * Returns the meta object for the attribute '{@link de.ubt.ai1.supermod.mm.collab.PublicRevision#getLatestPrivateRevisionNumber <em>Latest Private Revision Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Latest Private Revision Number</em>'.
	 * @see de.ubt.ai1.supermod.mm.collab.PublicRevision#getLatestPrivateRevisionNumber()
	 * @see #getPublicRevision()
	 * @generated
	 */
	EAttribute getPublicRevision_LatestPrivateRevisionNumber();

	/**
	 * Returns the meta object for the reference '{@link de.ubt.ai1.supermod.mm.collab.PublicRevision#getInitialPrivateRevision <em>Initial Private Revision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Initial Private Revision</em>'.
	 * @see de.ubt.ai1.supermod.mm.collab.PublicRevision#getInitialPrivateRevision()
	 * @see #getPublicRevision()
	 * @generated
	 */
	EReference getPublicRevision_InitialPrivateRevision();

	/**
	 * Returns the meta object for the reference '{@link de.ubt.ai1.supermod.mm.collab.PublicRevision#getPrivateHead <em>Private Head</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Private Head</em>'.
	 * @see de.ubt.ai1.supermod.mm.collab.PublicRevision#getPrivateHead()
	 * @see #getPublicRevision()
	 * @generated
	 */
	EReference getPublicRevision_PrivateHead();

	/**
	 * Returns the meta object for the attribute '{@link de.ubt.ai1.supermod.mm.collab.PublicRevision#isHead <em>Head</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Head</em>'.
	 * @see de.ubt.ai1.supermod.mm.collab.PublicRevision#isHead()
	 * @see #getPublicRevision()
	 * @generated
	 */
	EAttribute getPublicRevision_Head();

	/**
	 * Returns the meta object for the attribute '{@link de.ubt.ai1.supermod.mm.collab.PublicRevision#isFinished <em>Finished</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Finished</em>'.
	 * @see de.ubt.ai1.supermod.mm.collab.PublicRevision#isFinished()
	 * @see #getPublicRevision()
	 * @generated
	 */
	EAttribute getPublicRevision_Finished();

	/**
	 * Returns the meta object for the containment reference '{@link de.ubt.ai1.supermod.mm.collab.PublicRevision#getFinishedOption <em>Finished Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Finished Option</em>'.
	 * @see de.ubt.ai1.supermod.mm.collab.PublicRevision#getFinishedOption()
	 * @see #getPublicRevision()
	 * @generated
	 */
	EReference getPublicRevision_FinishedOption();

	/**
	 * Returns the meta object for the containment reference '{@link de.ubt.ai1.supermod.mm.collab.PublicRevision#getFinishedDefaultBinding <em>Finished Default Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Finished Default Binding</em>'.
	 * @see de.ubt.ai1.supermod.mm.collab.PublicRevision#getFinishedDefaultBinding()
	 * @see #getPublicRevision()
	 * @generated
	 */
	EReference getPublicRevision_FinishedDefaultBinding();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai1.supermod.mm.collab.PrivateRevision <em>Private Revision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Private Revision</em>'.
	 * @see de.ubt.ai1.supermod.mm.collab.PrivateRevision
	 * @generated
	 */
	EClass getPrivateRevision();

	/**
	 * Returns the meta object for the container reference '{@link de.ubt.ai1.supermod.mm.collab.PrivateRevision#getPublicRevision <em>Public Revision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Public Revision</em>'.
	 * @see de.ubt.ai1.supermod.mm.collab.PrivateRevision#getPublicRevision()
	 * @see #getPrivateRevision()
	 * @generated
	 */
	EReference getPrivateRevision_PublicRevision();

	/**
	 * Returns the meta object for the reference list '{@link de.ubt.ai1.supermod.mm.collab.PrivateRevision#getPublicPredecessors <em>Public Predecessors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Public Predecessors</em>'.
	 * @see de.ubt.ai1.supermod.mm.collab.PrivateRevision#getPublicPredecessors()
	 * @see #getPrivateRevision()
	 * @generated
	 */
	EReference getPrivateRevision_PublicPredecessors();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SuperModCollabFactory getSuperModCollabFactory();

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
		 * The meta object literal for the '{@link de.ubt.ai1.supermod.mm.collab.impl.CollaborativeRevisionDimensionImpl <em>Collaborative Revision Dimension</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai1.supermod.mm.collab.impl.CollaborativeRevisionDimensionImpl
		 * @see de.ubt.ai1.supermod.mm.collab.impl.SuperModCollabPackageImpl#getCollaborativeRevisionDimension()
		 * @generated
		 */
		EClass COLLABORATIVE_REVISION_DIMENSION = eINSTANCE.getCollaborativeRevisionDimension();

		/**
		 * The meta object literal for the '<em><b>Public Revisions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLABORATIVE_REVISION_DIMENSION__PUBLIC_REVISIONS = eINSTANCE.getCollaborativeRevisionDimension_PublicRevisions();

		/**
		 * The meta object literal for the '<em><b>Initial Public Revision</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLABORATIVE_REVISION_DIMENSION__INITIAL_PUBLIC_REVISION = eINSTANCE.getCollaborativeRevisionDimension_InitialPublicRevision();

		/**
		 * The meta object literal for the '<em><b>Initial Public Revision Invariant</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLABORATIVE_REVISION_DIMENSION__INITIAL_PUBLIC_REVISION_INVARIANT = eINSTANCE.getCollaborativeRevisionDimension_InitialPublicRevisionInvariant();

		/**
		 * The meta object literal for the '<em><b>Latest Public Revision Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLABORATIVE_REVISION_DIMENSION__LATEST_PUBLIC_REVISION_NUMBER = eINSTANCE.getCollaborativeRevisionDimension_LatestPublicRevisionNumber();

		/**
		 * The meta object literal for the '<em><b>Public Head</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLABORATIVE_REVISION_DIMENSION__PUBLIC_HEAD = eINSTANCE.getCollaborativeRevisionDimension_PublicHead();

		/**
		 * The meta object literal for the '<em><b>Current Public Revision</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLABORATIVE_REVISION_DIMENSION__CURRENT_PUBLIC_REVISION = eINSTANCE.getCollaborativeRevisionDimension_CurrentPublicRevision();

		/**
		 * The meta object literal for the '<em><b>All Revisions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLABORATIVE_REVISION_DIMENSION__ALL_REVISIONS = eINSTANCE.getCollaborativeRevisionDimension_AllRevisions();

		/**
		 * The meta object literal for the '<em><b>Get Revisions For Binding</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COLLABORATIVE_REVISION_DIMENSION___GET_REVISIONS_FOR_BINDING__OPTIONBINDING = eINSTANCE.getCollaborativeRevisionDimension__GetRevisionsForBinding__OptionBinding();

		/**
		 * The meta object literal for the '<em><b>Get Latest Revisions</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COLLABORATIVE_REVISION_DIMENSION___GET_LATEST_REVISIONS__ELIST = eINSTANCE.getCollaborativeRevisionDimension__GetLatestRevisions__EList();

		/**
		 * The meta object literal for the '<em><b>Get Latest Public Revisions</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COLLABORATIVE_REVISION_DIMENSION___GET_LATEST_PUBLIC_REVISIONS__ELIST = eINSTANCE.getCollaborativeRevisionDimension__GetLatestPublicRevisions__EList();

		/**
		 * The meta object literal for the '{@link de.ubt.ai1.supermod.mm.collab.impl.RevisionImpl <em>Revision</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai1.supermod.mm.collab.impl.RevisionImpl
		 * @see de.ubt.ai1.supermod.mm.collab.impl.SuperModCollabPackageImpl#getRevision()
		 * @generated
		 */
		EClass REVISION = eINSTANCE.getRevision();

		/**
		 * The meta object literal for the '<em><b>Predecessors</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REVISION__PREDECESSORS = eINSTANCE.getRevision_Predecessors();

		/**
		 * The meta object literal for the '<em><b>Successors</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REVISION__SUCCESSORS = eINSTANCE.getRevision_Successors();

		/**
		 * The meta object literal for the '<em><b>All Predecessors</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REVISION__ALL_PREDECESSORS = eINSTANCE.getRevision_AllPredecessors();

		/**
		 * The meta object literal for the '<em><b>All Successors</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REVISION__ALL_SUCCESSORS = eINSTANCE.getRevision_AllSuccessors();

		/**
		 * The meta object literal for the '<em><b>Earliest Predecessors</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REVISION__EARLIEST_PREDECESSORS = eINSTANCE.getRevision_EarliestPredecessors();

		/**
		 * The meta object literal for the '<em><b>Latest Successors</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REVISION__LATEST_SUCCESSORS = eINSTANCE.getRevision_LatestSuccessors();

		/**
		 * The meta object literal for the '<em><b>Revision Option</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REVISION__REVISION_OPTION = eINSTANCE.getRevision_RevisionOption();

		/**
		 * The meta object literal for the '<em><b>Revision Default Binding</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REVISION__REVISION_DEFAULT_BINDING = eINSTANCE.getRevision_RevisionDefaultBinding();

		/**
		 * The meta object literal for the '<em><b>Predecessor Preferences</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REVISION__PREDECESSOR_PREFERENCES = eINSTANCE.getRevision_PredecessorPreferences();

		/**
		 * The meta object literal for the '<em><b>Revision Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REVISION__REVISION_NUMBER = eINSTANCE.getRevision_RevisionNumber();

		/**
		 * The meta object literal for the '<em><b>Display Revision Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REVISION__DISPLAY_REVISION_NUMBER = eINSTANCE.getRevision_DisplayRevisionNumber();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REVISION__DATE = eINSTANCE.getRevision_Date();

		/**
		 * The meta object literal for the '<em><b>Commit Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REVISION__COMMIT_MESSAGE = eINSTANCE.getRevision_CommitMessage();

		/**
		 * The meta object literal for the '{@link de.ubt.ai1.supermod.mm.collab.impl.PublicRevisionImpl <em>Public Revision</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai1.supermod.mm.collab.impl.PublicRevisionImpl
		 * @see de.ubt.ai1.supermod.mm.collab.impl.SuperModCollabPackageImpl#getPublicRevision()
		 * @generated
		 */
		EClass PUBLIC_REVISION = eINSTANCE.getPublicRevision();

		/**
		 * The meta object literal for the '<em><b>Revision Dimension</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PUBLIC_REVISION__REVISION_DIMENSION = eINSTANCE.getPublicRevision_RevisionDimension();

		/**
		 * The meta object literal for the '<em><b>Private Revisions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PUBLIC_REVISION__PRIVATE_REVISIONS = eINSTANCE.getPublicRevision_PrivateRevisions();

		/**
		 * The meta object literal for the '<em><b>Committer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUBLIC_REVISION__COMMITTER = eINSTANCE.getPublicRevision_Committer();

		/**
		 * The meta object literal for the '<em><b>Latest Private Revision Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUBLIC_REVISION__LATEST_PRIVATE_REVISION_NUMBER = eINSTANCE.getPublicRevision_LatestPrivateRevisionNumber();

		/**
		 * The meta object literal for the '<em><b>Initial Private Revision</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PUBLIC_REVISION__INITIAL_PRIVATE_REVISION = eINSTANCE.getPublicRevision_InitialPrivateRevision();

		/**
		 * The meta object literal for the '<em><b>Private Head</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PUBLIC_REVISION__PRIVATE_HEAD = eINSTANCE.getPublicRevision_PrivateHead();

		/**
		 * The meta object literal for the '<em><b>Head</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUBLIC_REVISION__HEAD = eINSTANCE.getPublicRevision_Head();

		/**
		 * The meta object literal for the '<em><b>Finished</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUBLIC_REVISION__FINISHED = eINSTANCE.getPublicRevision_Finished();

		/**
		 * The meta object literal for the '<em><b>Finished Option</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PUBLIC_REVISION__FINISHED_OPTION = eINSTANCE.getPublicRevision_FinishedOption();

		/**
		 * The meta object literal for the '<em><b>Finished Default Binding</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PUBLIC_REVISION__FINISHED_DEFAULT_BINDING = eINSTANCE.getPublicRevision_FinishedDefaultBinding();

		/**
		 * The meta object literal for the '{@link de.ubt.ai1.supermod.mm.collab.impl.PrivateRevisionImpl <em>Private Revision</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai1.supermod.mm.collab.impl.PrivateRevisionImpl
		 * @see de.ubt.ai1.supermod.mm.collab.impl.SuperModCollabPackageImpl#getPrivateRevision()
		 * @generated
		 */
		EClass PRIVATE_REVISION = eINSTANCE.getPrivateRevision();

		/**
		 * The meta object literal for the '<em><b>Public Revision</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRIVATE_REVISION__PUBLIC_REVISION = eINSTANCE.getPrivateRevision_PublicRevision();

		/**
		 * The meta object literal for the '<em><b>Public Predecessors</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRIVATE_REVISION__PUBLIC_PREDECESSORS = eINSTANCE.getPrivateRevision_PublicPredecessors();

	}

} //SuperModCollabPackage
