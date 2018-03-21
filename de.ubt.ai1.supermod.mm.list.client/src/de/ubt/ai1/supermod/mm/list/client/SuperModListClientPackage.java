/******************************************************************************
 * Copyright (c) 2018 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.mm.list.client;


import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import de.ubt.ai1.supermod.mm.client.SuperModClientPackage;

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
 * The SuperMod List client package contains meta-classes relevant for the client
 * repository when versioning an ordered collection.
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>,
 * 			Johannes Schroepfer <Johannes.M.Schroepfer(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	2018-01-09
 * <!-- end-user-doc -->
 * @see de.ubt.ai1.supermod.mm.list.client.SuperModListClientFactory
 * @model kind="package"
 * @generated
 */
public interface SuperModListClientPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "client";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://ai1.uni-bayreuth.de/supermod/list/client/0.1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "de.ubt.ai1.supermod.mm.list.client";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SuperModListClientPackage eINSTANCE = de.ubt.ai1.supermod.mm.list.client.impl.SuperModListClientPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.ubt.ai1.supermod.mm.list.client.impl.OrderingConflictImpl <em>Ordering Conflict</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai1.supermod.mm.list.client.impl.OrderingConflictImpl
	 * @see de.ubt.ai1.supermod.mm.list.client.impl.SuperModListClientPackageImpl#getOrderingConflict()
	 * @generated
	 */
	int ORDERING_CONFLICT = 0;

	/**
	 * The feature id for the '<em><b>Affected Product Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERING_CONFLICT__AFFECTED_PRODUCT_SPACE_ELEMENTS = SuperModClientPackage.PRODUCT_CONFLICT__AFFECTED_PRODUCT_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERING_CONFLICT__SEVERITY = SuperModClientPackage.PRODUCT_CONFLICT__SEVERITY;

	/**
	 * The feature id for the '<em><b>Context List</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERING_CONFLICT__CONTEXT_LIST = SuperModClientPackage.PRODUCT_CONFLICT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Last Vertex</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERING_CONFLICT__LAST_VERTEX = SuperModClientPackage.PRODUCT_CONFLICT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Successor Edges</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERING_CONFLICT__SUCCESSOR_EDGES = SuperModClientPackage.PRODUCT_CONFLICT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Successor Vertices</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERING_CONFLICT__SUCCESSOR_VERTICES = SuperModClientPackage.PRODUCT_CONFLICT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Ordering Conflict</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERING_CONFLICT_FEATURE_COUNT = SuperModClientPackage.PRODUCT_CONFLICT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Ordering Conflict</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERING_CONFLICT_OPERATION_COUNT = SuperModClientPackage.PRODUCT_CONFLICT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link de.ubt.ai1.supermod.mm.list.client.OrderingConflict <em>Ordering Conflict</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ordering Conflict</em>'.
	 * @see de.ubt.ai1.supermod.mm.list.client.OrderingConflict
	 * @generated
	 */
	EClass getOrderingConflict();

	/**
	 * Returns the meta object for the reference '{@link de.ubt.ai1.supermod.mm.list.client.OrderingConflict#getContextList <em>Context List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Context List</em>'.
	 * @see de.ubt.ai1.supermod.mm.list.client.OrderingConflict#getContextList()
	 * @see #getOrderingConflict()
	 * @generated
	 */
	EReference getOrderingConflict_ContextList();

	/**
	 * Returns the meta object for the reference '{@link de.ubt.ai1.supermod.mm.list.client.OrderingConflict#getLastVertex <em>Last Vertex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Last Vertex</em>'.
	 * @see de.ubt.ai1.supermod.mm.list.client.OrderingConflict#getLastVertex()
	 * @see #getOrderingConflict()
	 * @generated
	 */
	EReference getOrderingConflict_LastVertex();

	/**
	 * Returns the meta object for the reference list '{@link de.ubt.ai1.supermod.mm.list.client.OrderingConflict#getSuccessorEdges <em>Successor Edges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Successor Edges</em>'.
	 * @see de.ubt.ai1.supermod.mm.list.client.OrderingConflict#getSuccessorEdges()
	 * @see #getOrderingConflict()
	 * @generated
	 */
	EReference getOrderingConflict_SuccessorEdges();

	/**
	 * Returns the meta object for the reference list '{@link de.ubt.ai1.supermod.mm.list.client.OrderingConflict#getSuccessorVertices <em>Successor Vertices</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Successor Vertices</em>'.
	 * @see de.ubt.ai1.supermod.mm.list.client.OrderingConflict#getSuccessorVertices()
	 * @see #getOrderingConflict()
	 * @generated
	 */
	EReference getOrderingConflict_SuccessorVertices();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SuperModListClientFactory getSuperModListClientFactory();

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
		 * The meta object literal for the '{@link de.ubt.ai1.supermod.mm.list.client.impl.OrderingConflictImpl <em>Ordering Conflict</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai1.supermod.mm.list.client.impl.OrderingConflictImpl
		 * @see de.ubt.ai1.supermod.mm.list.client.impl.SuperModListClientPackageImpl#getOrderingConflict()
		 * @generated
		 */
		EClass ORDERING_CONFLICT = eINSTANCE.getOrderingConflict();

		/**
		 * The meta object literal for the '<em><b>Context List</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDERING_CONFLICT__CONTEXT_LIST = eINSTANCE.getOrderingConflict_ContextList();

		/**
		 * The meta object literal for the '<em><b>Last Vertex</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDERING_CONFLICT__LAST_VERTEX = eINSTANCE.getOrderingConflict_LastVertex();

		/**
		 * The meta object literal for the '<em><b>Successor Edges</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDERING_CONFLICT__SUCCESSOR_EDGES = eINSTANCE.getOrderingConflict_SuccessorEdges();

		/**
		 * The meta object literal for the '<em><b>Successor Vertices</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDERING_CONFLICT__SUCCESSOR_VERTICES = eINSTANCE.getOrderingConflict_SuccessorVertices();

	}

} //SuperModListClientPackage
