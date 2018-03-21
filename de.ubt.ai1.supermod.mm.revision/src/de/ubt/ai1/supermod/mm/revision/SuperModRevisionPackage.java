/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.mm.revision;

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
 * 
 * This package contains meta-classes for SuperMod's revision version dimension,
 * which enables temporal versioning by means of a revision graph.
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date 	2014-07-25
 * @see		RevisionDimension
 * <!-- end-user-doc -->
 * @see de.ubt.ai1.supermod.mm.revision.SuperModRevisionFactory
 * @model kind="package"
 * @generated
 */
public interface SuperModRevisionPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "revision";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://ai1.uni-bayreuth.de/supermod/revision/0.1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "de.ubt.ai1.supermod.mm.revision";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SuperModRevisionPackage eINSTANCE = de.ubt.ai1.supermod.mm.revision.impl.SuperModRevisionPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.ubt.ai1.supermod.mm.revision.impl.RevisionDimensionImpl <em>Revision Dimension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai1.supermod.mm.revision.impl.RevisionDimensionImpl
	 * @see de.ubt.ai1.supermod.mm.revision.impl.SuperModRevisionPackageImpl#getRevisionDimension()
	 * @generated
	 */
	int REVISION_DIMENSION = 0;

	/**
	 * The feature id for the '<em><b>Dimension Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVISION_DIMENSION__DIMENSION_NAME = SuperModCorePackage.VERSION_DIMENSION__DIMENSION_NAME;

	/**
	 * The feature id for the '<em><b>Root Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVISION_DIMENSION__ROOT_ELEMENTS = SuperModCorePackage.VERSION_DIMENSION__ROOT_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVISION_DIMENSION__ALL_ELEMENTS = SuperModCorePackage.VERSION_DIMENSION__ALL_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Options</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVISION_DIMENSION__OPTIONS = SuperModCorePackage.VERSION_DIMENSION__OPTIONS;

	/**
	 * The feature id for the '<em><b>Invariants</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVISION_DIMENSION__INVARIANTS = SuperModCorePackage.VERSION_DIMENSION__INVARIANTS;

	/**
	 * The feature id for the '<em><b>Preferences</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVISION_DIMENSION__PREFERENCES = SuperModCorePackage.VERSION_DIMENSION__PREFERENCES;

	/**
	 * The feature id for the '<em><b>Default Bindings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVISION_DIMENSION__DEFAULT_BINDINGS = SuperModCorePackage.VERSION_DIMENSION__DEFAULT_BINDINGS;

	/**
	 * The feature id for the '<em><b>Root Version Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVISION_DIMENSION__ROOT_VERSION_SPACE_ELEMENTS = SuperModCorePackage.VERSION_DIMENSION__ROOT_VERSION_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Version Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVISION_DIMENSION__ALL_VERSION_SPACE_ELEMENTS = SuperModCorePackage.VERSION_DIMENSION__ALL_VERSION_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Version Space</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVISION_DIMENSION__VERSION_SPACE = SuperModCorePackage.VERSION_DIMENSION__VERSION_SPACE;

	/**
	 * The feature id for the '<em><b>Revisions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVISION_DIMENSION__REVISIONS = SuperModCorePackage.VERSION_DIMENSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Initial Revision</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVISION_DIMENSION__INITIAL_REVISION = SuperModCorePackage.VERSION_DIMENSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Initial Revision Invariant</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVISION_DIMENSION__INITIAL_REVISION_INVARIANT = SuperModCorePackage.VERSION_DIMENSION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Latest Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVISION_DIMENSION__LATEST_REVISION_NUMBER = SuperModCorePackage.VERSION_DIMENSION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Head</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVISION_DIMENSION__HEAD = SuperModCorePackage.VERSION_DIMENSION_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Revision Dimension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVISION_DIMENSION_FEATURE_COUNT = SuperModCorePackage.VERSION_DIMENSION_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVISION_DIMENSION___VALIDATE__OPTIONBINDING = SuperModCorePackage.VERSION_DIMENSION___VALIDATE__OPTIONBINDING;

	/**
	 * The operation id for the '<em>Is Complete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVISION_DIMENSION___IS_COMPLETE__OPTIONBINDING = SuperModCorePackage.VERSION_DIMENSION___IS_COMPLETE__OPTIONBINDING;

	/**
	 * The operation id for the '<em>Is Satisfiable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVISION_DIMENSION___IS_SATISFIABLE__OPTIONBINDING = SuperModCorePackage.VERSION_DIMENSION___IS_SATISFIABLE__OPTIONBINDING;

	/**
	 * The operation id for the '<em>Apply Preferences</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVISION_DIMENSION___APPLY_PREFERENCES__OPTIONBINDING = SuperModCorePackage.VERSION_DIMENSION___APPLY_PREFERENCES__OPTIONBINDING;

	/**
	 * The operation id for the '<em>Apply Defaults</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVISION_DIMENSION___APPLY_DEFAULTS__OPTIONBINDING = SuperModCorePackage.VERSION_DIMENSION___APPLY_DEFAULTS__OPTIONBINDING;

	/**
	 * The operation id for the '<em>Apply Completions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVISION_DIMENSION___APPLY_COMPLETIONS__OPTIONBINDING = SuperModCorePackage.VERSION_DIMENSION___APPLY_COMPLETIONS__OPTIONBINDING;

	/**
	 * The operation id for the '<em>Get Option</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVISION_DIMENSION___GET_OPTION__STRING = SuperModCorePackage.VERSION_DIMENSION___GET_OPTION__STRING;

	/**
	 * The operation id for the '<em>Get Revisions For Binding</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVISION_DIMENSION___GET_REVISIONS_FOR_BINDING__OPTIONBINDING = SuperModCorePackage.VERSION_DIMENSION_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Latest Revisions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVISION_DIMENSION___GET_LATEST_REVISIONS__ELIST = SuperModCorePackage.VERSION_DIMENSION_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Revision Dimension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVISION_DIMENSION_OPERATION_COUNT = SuperModCorePackage.VERSION_DIMENSION_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.ubt.ai1.supermod.mm.revision.impl.RevisionImpl <em>Revision</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai1.supermod.mm.revision.impl.RevisionImpl
	 * @see de.ubt.ai1.supermod.mm.revision.impl.SuperModRevisionPackageImpl#getRevision()
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
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVISION__REVISION_NUMBER = SuperModCorePackage.VERSION_SPACE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Committer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVISION__COMMITTER = SuperModCorePackage.VERSION_SPACE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Commit Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVISION__COMMIT_MESSAGE = SuperModCorePackage.VERSION_SPACE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVISION__DATE = SuperModCorePackage.VERSION_SPACE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>All Predecessors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVISION__ALL_PREDECESSORS = SuperModCorePackage.VERSION_SPACE_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>All Successors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVISION__ALL_SUCCESSORS = SuperModCorePackage.VERSION_SPACE_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Earliest Predecessors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVISION__EARLIEST_PREDECESSORS = SuperModCorePackage.VERSION_SPACE_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Latest Successors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVISION__LATEST_SUCCESSORS = SuperModCorePackage.VERSION_SPACE_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Revision Option</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVISION__REVISION_OPTION = SuperModCorePackage.VERSION_SPACE_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Revision Default Binding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVISION__REVISION_DEFAULT_BINDING = SuperModCorePackage.VERSION_SPACE_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Predecessor Preferences</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVISION__PREDECESSOR_PREFERENCES = SuperModCorePackage.VERSION_SPACE_ELEMENT_FEATURE_COUNT + 12;

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
	 * Returns the meta object for class '{@link de.ubt.ai1.supermod.mm.revision.RevisionDimension <em>Revision Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Revision Dimension</em>'.
	 * @see de.ubt.ai1.supermod.mm.revision.RevisionDimension
	 * @generated
	 */
	EClass getRevisionDimension();

	/**
	 * Returns the meta object for the containment reference list '{@link de.ubt.ai1.supermod.mm.revision.RevisionDimension#getRevisions <em>Revisions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Revisions</em>'.
	 * @see de.ubt.ai1.supermod.mm.revision.RevisionDimension#getRevisions()
	 * @see #getRevisionDimension()
	 * @generated
	 */
	EReference getRevisionDimension_Revisions();

	/**
	 * Returns the meta object for the reference '{@link de.ubt.ai1.supermod.mm.revision.RevisionDimension#getInitialRevision <em>Initial Revision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Initial Revision</em>'.
	 * @see de.ubt.ai1.supermod.mm.revision.RevisionDimension#getInitialRevision()
	 * @see #getRevisionDimension()
	 * @generated
	 */
	EReference getRevisionDimension_InitialRevision();

	/**
	 * Returns the meta object for the containment reference '{@link de.ubt.ai1.supermod.mm.revision.RevisionDimension#getInitialRevisionInvariant <em>Initial Revision Invariant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Initial Revision Invariant</em>'.
	 * @see de.ubt.ai1.supermod.mm.revision.RevisionDimension#getInitialRevisionInvariant()
	 * @see #getRevisionDimension()
	 * @generated
	 */
	EReference getRevisionDimension_InitialRevisionInvariant();

	/**
	 * Returns the meta object for the attribute '{@link de.ubt.ai1.supermod.mm.revision.RevisionDimension#getLatestRevisionNumber <em>Latest Revision Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Latest Revision Number</em>'.
	 * @see de.ubt.ai1.supermod.mm.revision.RevisionDimension#getLatestRevisionNumber()
	 * @see #getRevisionDimension()
	 * @generated
	 */
	EAttribute getRevisionDimension_LatestRevisionNumber();

	/**
	 * Returns the meta object for the reference '{@link de.ubt.ai1.supermod.mm.revision.RevisionDimension#getHead <em>Head</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Head</em>'.
	 * @see de.ubt.ai1.supermod.mm.revision.RevisionDimension#getHead()
	 * @see #getRevisionDimension()
	 * @generated
	 */
	EReference getRevisionDimension_Head();

	/**
	 * Returns the meta object for the '{@link de.ubt.ai1.supermod.mm.revision.RevisionDimension#getRevisionsForBinding(de.ubt.ai1.supermod.mm.core.OptionBinding) <em>Get Revisions For Binding</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Revisions For Binding</em>' operation.
	 * @see de.ubt.ai1.supermod.mm.revision.RevisionDimension#getRevisionsForBinding(de.ubt.ai1.supermod.mm.core.OptionBinding)
	 * @generated
	 */
	EOperation getRevisionDimension__GetRevisionsForBinding__OptionBinding();

	/**
	 * Returns the meta object for the '{@link de.ubt.ai1.supermod.mm.revision.RevisionDimension#getLatestRevisions(org.eclipse.emf.common.util.EList) <em>Get Latest Revisions</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Latest Revisions</em>' operation.
	 * @see de.ubt.ai1.supermod.mm.revision.RevisionDimension#getLatestRevisions(org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getRevisionDimension__GetLatestRevisions__EList();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai1.supermod.mm.revision.Revision <em>Revision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Revision</em>'.
	 * @see de.ubt.ai1.supermod.mm.revision.Revision
	 * @generated
	 */
	EClass getRevision();

	/**
	 * Returns the meta object for the reference list '{@link de.ubt.ai1.supermod.mm.revision.Revision#getPredecessors <em>Predecessors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Predecessors</em>'.
	 * @see de.ubt.ai1.supermod.mm.revision.Revision#getPredecessors()
	 * @see #getRevision()
	 * @generated
	 */
	EReference getRevision_Predecessors();

	/**
	 * Returns the meta object for the reference list '{@link de.ubt.ai1.supermod.mm.revision.Revision#getSuccessors <em>Successors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Successors</em>'.
	 * @see de.ubt.ai1.supermod.mm.revision.Revision#getSuccessors()
	 * @see #getRevision()
	 * @generated
	 */
	EReference getRevision_Successors();

	/**
	 * Returns the meta object for the attribute '{@link de.ubt.ai1.supermod.mm.revision.Revision#getRevisionNumber <em>Revision Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Revision Number</em>'.
	 * @see de.ubt.ai1.supermod.mm.revision.Revision#getRevisionNumber()
	 * @see #getRevision()
	 * @generated
	 */
	EAttribute getRevision_RevisionNumber();

	/**
	 * Returns the meta object for the attribute '{@link de.ubt.ai1.supermod.mm.revision.Revision#getCommitter <em>Committer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Committer</em>'.
	 * @see de.ubt.ai1.supermod.mm.revision.Revision#getCommitter()
	 * @see #getRevision()
	 * @generated
	 */
	EAttribute getRevision_Committer();

	/**
	 * Returns the meta object for the attribute '{@link de.ubt.ai1.supermod.mm.revision.Revision#getCommitMessage <em>Commit Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Commit Message</em>'.
	 * @see de.ubt.ai1.supermod.mm.revision.Revision#getCommitMessage()
	 * @see #getRevision()
	 * @generated
	 */
	EAttribute getRevision_CommitMessage();

	/**
	 * Returns the meta object for the attribute '{@link de.ubt.ai1.supermod.mm.revision.Revision#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see de.ubt.ai1.supermod.mm.revision.Revision#getDate()
	 * @see #getRevision()
	 * @generated
	 */
	EAttribute getRevision_Date();

	/**
	 * Returns the meta object for the reference list '{@link de.ubt.ai1.supermod.mm.revision.Revision#getAllPredecessors <em>All Predecessors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>All Predecessors</em>'.
	 * @see de.ubt.ai1.supermod.mm.revision.Revision#getAllPredecessors()
	 * @see #getRevision()
	 * @generated
	 */
	EReference getRevision_AllPredecessors();

	/**
	 * Returns the meta object for the reference list '{@link de.ubt.ai1.supermod.mm.revision.Revision#getAllSuccessors <em>All Successors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>All Successors</em>'.
	 * @see de.ubt.ai1.supermod.mm.revision.Revision#getAllSuccessors()
	 * @see #getRevision()
	 * @generated
	 */
	EReference getRevision_AllSuccessors();

	/**
	 * Returns the meta object for the reference list '{@link de.ubt.ai1.supermod.mm.revision.Revision#getEarliestPredecessors <em>Earliest Predecessors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Earliest Predecessors</em>'.
	 * @see de.ubt.ai1.supermod.mm.revision.Revision#getEarliestPredecessors()
	 * @see #getRevision()
	 * @generated
	 */
	EReference getRevision_EarliestPredecessors();

	/**
	 * Returns the meta object for the reference list '{@link de.ubt.ai1.supermod.mm.revision.Revision#getLatestSuccessors <em>Latest Successors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Latest Successors</em>'.
	 * @see de.ubt.ai1.supermod.mm.revision.Revision#getLatestSuccessors()
	 * @see #getRevision()
	 * @generated
	 */
	EReference getRevision_LatestSuccessors();

	/**
	 * Returns the meta object for the containment reference '{@link de.ubt.ai1.supermod.mm.revision.Revision#getRevisionOption <em>Revision Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Revision Option</em>'.
	 * @see de.ubt.ai1.supermod.mm.revision.Revision#getRevisionOption()
	 * @see #getRevision()
	 * @generated
	 */
	EReference getRevision_RevisionOption();

	/**
	 * Returns the meta object for the containment reference '{@link de.ubt.ai1.supermod.mm.revision.Revision#getRevisionDefaultBinding <em>Revision Default Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Revision Default Binding</em>'.
	 * @see de.ubt.ai1.supermod.mm.revision.Revision#getRevisionDefaultBinding()
	 * @see #getRevision()
	 * @generated
	 */
	EReference getRevision_RevisionDefaultBinding();

	/**
	 * Returns the meta object for the containment reference list '{@link de.ubt.ai1.supermod.mm.revision.Revision#getPredecessorPreferences <em>Predecessor Preferences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Predecessor Preferences</em>'.
	 * @see de.ubt.ai1.supermod.mm.revision.Revision#getPredecessorPreferences()
	 * @see #getRevision()
	 * @generated
	 */
	EReference getRevision_PredecessorPreferences();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SuperModRevisionFactory getSuperModRevisionFactory();

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
		 * The meta object literal for the '{@link de.ubt.ai1.supermod.mm.revision.impl.RevisionDimensionImpl <em>Revision Dimension</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai1.supermod.mm.revision.impl.RevisionDimensionImpl
		 * @see de.ubt.ai1.supermod.mm.revision.impl.SuperModRevisionPackageImpl#getRevisionDimension()
		 * @generated
		 */
		EClass REVISION_DIMENSION = eINSTANCE.getRevisionDimension();

		/**
		 * The meta object literal for the '<em><b>Revisions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REVISION_DIMENSION__REVISIONS = eINSTANCE.getRevisionDimension_Revisions();

		/**
		 * The meta object literal for the '<em><b>Initial Revision</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REVISION_DIMENSION__INITIAL_REVISION = eINSTANCE.getRevisionDimension_InitialRevision();

		/**
		 * The meta object literal for the '<em><b>Initial Revision Invariant</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REVISION_DIMENSION__INITIAL_REVISION_INVARIANT = eINSTANCE.getRevisionDimension_InitialRevisionInvariant();

		/**
		 * The meta object literal for the '<em><b>Latest Revision Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REVISION_DIMENSION__LATEST_REVISION_NUMBER = eINSTANCE.getRevisionDimension_LatestRevisionNumber();

		/**
		 * The meta object literal for the '<em><b>Head</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REVISION_DIMENSION__HEAD = eINSTANCE.getRevisionDimension_Head();

		/**
		 * The meta object literal for the '<em><b>Get Revisions For Binding</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation REVISION_DIMENSION___GET_REVISIONS_FOR_BINDING__OPTIONBINDING = eINSTANCE.getRevisionDimension__GetRevisionsForBinding__OptionBinding();

		/**
		 * The meta object literal for the '<em><b>Get Latest Revisions</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation REVISION_DIMENSION___GET_LATEST_REVISIONS__ELIST = eINSTANCE.getRevisionDimension__GetLatestRevisions__EList();

		/**
		 * The meta object literal for the '{@link de.ubt.ai1.supermod.mm.revision.impl.RevisionImpl <em>Revision</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai1.supermod.mm.revision.impl.RevisionImpl
		 * @see de.ubt.ai1.supermod.mm.revision.impl.SuperModRevisionPackageImpl#getRevision()
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
		 * The meta object literal for the '<em><b>Revision Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REVISION__REVISION_NUMBER = eINSTANCE.getRevision_RevisionNumber();

		/**
		 * The meta object literal for the '<em><b>Committer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REVISION__COMMITTER = eINSTANCE.getRevision_Committer();

		/**
		 * The meta object literal for the '<em><b>Commit Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REVISION__COMMIT_MESSAGE = eINSTANCE.getRevision_CommitMessage();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REVISION__DATE = eINSTANCE.getRevision_Date();

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

	}

} //SuperModRevisionPackage
