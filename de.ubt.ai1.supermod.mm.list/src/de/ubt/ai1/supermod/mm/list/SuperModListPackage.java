/******************************************************************************
 * Copyright (c) 2018 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.mm.list;

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
 * The SuperMod list meta-model contains re-usable classes for product spaces which
 * contain versioned ordered collections. Internally, the order of elements is
 * versioned by means of a directed graph, whose vertices and edges are represented
 * as versioned elements.
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>,
 * 			Johannes Schroepfer <Johannes.M.Schroepfer(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	2018-01-09
 * <!-- end-user-doc -->
 * @see de.ubt.ai1.supermod.mm.list.SuperModListFactory
 * @model kind="package"
 * @generated
 */
public interface SuperModListPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "list";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://ai1.uni-bayreuth.de/supermod/list/0.1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "de.ubt.ai1.supermod.mm.list";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SuperModListPackage eINSTANCE = de.ubt.ai1.supermod.mm.list.impl.SuperModListPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.ubt.ai1.supermod.mm.list.impl.VersionedListImpl <em>Versioned List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai1.supermod.mm.list.impl.VersionedListImpl
	 * @see de.ubt.ai1.supermod.mm.list.impl.SuperModListPackageImpl#getVersionedList()
	 * @generated
	 */
	int VERSIONED_LIST = 0;

	/**
	 * The feature id for the '<em><b>Super Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_LIST__SUPER_ELEMENT = SuperModCorePackage.PRODUCT_SPACE_ELEMENT__SUPER_ELEMENT;

	/**
	 * The feature id for the '<em><b>Sub Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_LIST__SUB_ELEMENTS = SuperModCorePackage.PRODUCT_SPACE_ELEMENT__SUB_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Super Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_LIST__ALL_SUPER_ELEMENTS = SuperModCorePackage.PRODUCT_SPACE_ELEMENT__ALL_SUPER_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Sub Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_LIST__ALL_SUB_ELEMENTS = SuperModCorePackage.PRODUCT_SPACE_ELEMENT__ALL_SUB_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Cross Referenced Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_LIST__CROSS_REFERENCED_ELEMENTS = SuperModCorePackage.PRODUCT_SPACE_ELEMENT__CROSS_REFERENCED_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Cross Referencing Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_LIST__CROSS_REFERENCING_ELEMENTS = SuperModCorePackage.PRODUCT_SPACE_ELEMENT__CROSS_REFERENCING_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Proxy UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_LIST__PROXY_UUID = SuperModCorePackage.PRODUCT_SPACE_ELEMENT__PROXY_UUID;

	/**
	 * The feature id for the '<em><b>Transaction Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_LIST__TRANSACTION_ID = SuperModCorePackage.PRODUCT_SPACE_ELEMENT__TRANSACTION_ID;

	/**
	 * The feature id for the '<em><b>Product Dimension</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_LIST__PRODUCT_DIMENSION = SuperModCorePackage.PRODUCT_SPACE_ELEMENT__PRODUCT_DIMENSION;

	/**
	 * The feature id for the '<em><b>Product Space</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_LIST__PRODUCT_SPACE = SuperModCorePackage.PRODUCT_SPACE_ELEMENT__PRODUCT_SPACE;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_LIST__VISIBILITY = SuperModCorePackage.PRODUCT_SPACE_ELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Super Product Space Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_LIST__SUPER_PRODUCT_SPACE_ELEMENT = SuperModCorePackage.PRODUCT_SPACE_ELEMENT__SUPER_PRODUCT_SPACE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Sub Product Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_LIST__SUB_PRODUCT_SPACE_ELEMENTS = SuperModCorePackage.PRODUCT_SPACE_ELEMENT__SUB_PRODUCT_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Super Product Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_LIST__ALL_SUPER_PRODUCT_SPACE_ELEMENTS = SuperModCorePackage.PRODUCT_SPACE_ELEMENT__ALL_SUPER_PRODUCT_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Sub Product Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_LIST__ALL_SUB_PRODUCT_SPACE_ELEMENTS = SuperModCorePackage.PRODUCT_SPACE_ELEMENT__ALL_SUB_PRODUCT_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Cross Referenced Product Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_LIST__CROSS_REFERENCED_PRODUCT_SPACE_ELEMENTS = SuperModCorePackage.PRODUCT_SPACE_ELEMENT__CROSS_REFERENCED_PRODUCT_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Cross Referencing Product Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_LIST__CROSS_REFERENCING_PRODUCT_SPACE_ELEMENTS = SuperModCorePackage.PRODUCT_SPACE_ELEMENT__CROSS_REFERENCING_PRODUCT_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Hierarchical Visibility</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_LIST__HIERARCHICAL_VISIBILITY = SuperModCorePackage.PRODUCT_SPACE_ELEMENT__HIERARCHICAL_VISIBILITY;

	/**
	 * The feature id for the '<em><b>Superordinate Visibility</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_LIST__SUPERORDINATE_VISIBILITY = SuperModCorePackage.PRODUCT_SPACE_ELEMENT__SUPERORDINATE_VISIBILITY;

	/**
	 * The feature id for the '<em><b>Vertices</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_LIST__VERTICES = SuperModCorePackage.PRODUCT_SPACE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Edges</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_LIST__EDGES = SuperModCorePackage.PRODUCT_SPACE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Start Vertices</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_LIST__START_VERTICES = SuperModCorePackage.PRODUCT_SPACE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Versioned List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_LIST_FEATURE_COUNT = SuperModCorePackage.PRODUCT_SPACE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Is Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_LIST___IS_PROXY = SuperModCorePackage.PRODUCT_SPACE_ELEMENT___IS_PROXY;

	/**
	 * The operation id for the '<em>Is Visible</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_LIST___IS_VISIBLE__OPTIONBINDING_VISIBILITYEVALUATIONCACHE = SuperModCorePackage.PRODUCT_SPACE_ELEMENT___IS_VISIBLE__OPTIONBINDING_VISIBILITYEVALUATIONCACHE;

	/**
	 * The operation id for the '<em>Is Visible Hierarchically</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_LIST___IS_VISIBLE_HIERARCHICALLY__OPTIONBINDING_VISIBILITYEVALUATIONCACHE = SuperModCorePackage.PRODUCT_SPACE_ELEMENT___IS_VISIBLE_HIERARCHICALLY__OPTIONBINDING_VISIBILITYEVALUATIONCACHE;

	/**
	 * The operation id for the '<em>Get All Occurrences Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_LIST___GET_ALL_OCCURRENCES_OF__PRODUCTSPACEELEMENT = SuperModCorePackage.PRODUCT_SPACE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Linearize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_LIST___LINEARIZE = SuperModCorePackage.PRODUCT_SPACE_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Edge</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_LIST___GET_EDGE__VERSIONEDLISTVERTEX_VERSIONEDLISTVERTEX = SuperModCorePackage.PRODUCT_SPACE_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Versioned List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_LIST_OPERATION_COUNT = SuperModCorePackage.PRODUCT_SPACE_ELEMENT_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link de.ubt.ai1.supermod.mm.list.impl.VersionedListVertexImpl <em>Versioned List Vertex</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai1.supermod.mm.list.impl.VersionedListVertexImpl
	 * @see de.ubt.ai1.supermod.mm.list.impl.SuperModListPackageImpl#getVersionedListVertex()
	 * @generated
	 */
	int VERSIONED_LIST_VERTEX = 1;

	/**
	 * The feature id for the '<em><b>Super Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_LIST_VERTEX__SUPER_ELEMENT = SuperModCorePackage.PRODUCT_SPACE_ELEMENT__SUPER_ELEMENT;

	/**
	 * The feature id for the '<em><b>Sub Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_LIST_VERTEX__SUB_ELEMENTS = SuperModCorePackage.PRODUCT_SPACE_ELEMENT__SUB_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Super Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_LIST_VERTEX__ALL_SUPER_ELEMENTS = SuperModCorePackage.PRODUCT_SPACE_ELEMENT__ALL_SUPER_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Sub Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_LIST_VERTEX__ALL_SUB_ELEMENTS = SuperModCorePackage.PRODUCT_SPACE_ELEMENT__ALL_SUB_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Cross Referenced Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_LIST_VERTEX__CROSS_REFERENCED_ELEMENTS = SuperModCorePackage.PRODUCT_SPACE_ELEMENT__CROSS_REFERENCED_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Cross Referencing Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_LIST_VERTEX__CROSS_REFERENCING_ELEMENTS = SuperModCorePackage.PRODUCT_SPACE_ELEMENT__CROSS_REFERENCING_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Proxy UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_LIST_VERTEX__PROXY_UUID = SuperModCorePackage.PRODUCT_SPACE_ELEMENT__PROXY_UUID;

	/**
	 * The feature id for the '<em><b>Transaction Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_LIST_VERTEX__TRANSACTION_ID = SuperModCorePackage.PRODUCT_SPACE_ELEMENT__TRANSACTION_ID;

	/**
	 * The feature id for the '<em><b>Product Dimension</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_LIST_VERTEX__PRODUCT_DIMENSION = SuperModCorePackage.PRODUCT_SPACE_ELEMENT__PRODUCT_DIMENSION;

	/**
	 * The feature id for the '<em><b>Product Space</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_LIST_VERTEX__PRODUCT_SPACE = SuperModCorePackage.PRODUCT_SPACE_ELEMENT__PRODUCT_SPACE;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_LIST_VERTEX__VISIBILITY = SuperModCorePackage.PRODUCT_SPACE_ELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Super Product Space Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_LIST_VERTEX__SUPER_PRODUCT_SPACE_ELEMENT = SuperModCorePackage.PRODUCT_SPACE_ELEMENT__SUPER_PRODUCT_SPACE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Sub Product Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_LIST_VERTEX__SUB_PRODUCT_SPACE_ELEMENTS = SuperModCorePackage.PRODUCT_SPACE_ELEMENT__SUB_PRODUCT_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Super Product Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_LIST_VERTEX__ALL_SUPER_PRODUCT_SPACE_ELEMENTS = SuperModCorePackage.PRODUCT_SPACE_ELEMENT__ALL_SUPER_PRODUCT_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Sub Product Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_LIST_VERTEX__ALL_SUB_PRODUCT_SPACE_ELEMENTS = SuperModCorePackage.PRODUCT_SPACE_ELEMENT__ALL_SUB_PRODUCT_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Cross Referenced Product Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_LIST_VERTEX__CROSS_REFERENCED_PRODUCT_SPACE_ELEMENTS = SuperModCorePackage.PRODUCT_SPACE_ELEMENT__CROSS_REFERENCED_PRODUCT_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Cross Referencing Product Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_LIST_VERTEX__CROSS_REFERENCING_PRODUCT_SPACE_ELEMENTS = SuperModCorePackage.PRODUCT_SPACE_ELEMENT__CROSS_REFERENCING_PRODUCT_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Hierarchical Visibility</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_LIST_VERTEX__HIERARCHICAL_VISIBILITY = SuperModCorePackage.PRODUCT_SPACE_ELEMENT__HIERARCHICAL_VISIBILITY;

	/**
	 * The feature id for the '<em><b>Superordinate Visibility</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_LIST_VERTEX__SUPERORDINATE_VISIBILITY = SuperModCorePackage.PRODUCT_SPACE_ELEMENT__SUPERORDINATE_VISIBILITY;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_LIST_VERTEX__UUID = SuperModCorePackage.PRODUCT_SPACE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_LIST_VERTEX__ELEMENT = SuperModCorePackage.PRODUCT_SPACE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Incoming Edges</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_LIST_VERTEX__INCOMING_EDGES = SuperModCorePackage.PRODUCT_SPACE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Outgoing Edges</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_LIST_VERTEX__OUTGOING_EDGES = SuperModCorePackage.PRODUCT_SPACE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>List</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_LIST_VERTEX__LIST = SuperModCorePackage.PRODUCT_SPACE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Start Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_LIST_VERTEX__START_REF = SuperModCorePackage.PRODUCT_SPACE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Versioned List Vertex</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_LIST_VERTEX_FEATURE_COUNT = SuperModCorePackage.PRODUCT_SPACE_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>Is Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_LIST_VERTEX___IS_PROXY = SuperModCorePackage.PRODUCT_SPACE_ELEMENT___IS_PROXY;

	/**
	 * The operation id for the '<em>Is Visible</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_LIST_VERTEX___IS_VISIBLE__OPTIONBINDING_VISIBILITYEVALUATIONCACHE = SuperModCorePackage.PRODUCT_SPACE_ELEMENT___IS_VISIBLE__OPTIONBINDING_VISIBILITYEVALUATIONCACHE;

	/**
	 * The operation id for the '<em>Is Visible Hierarchically</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_LIST_VERTEX___IS_VISIBLE_HIERARCHICALLY__OPTIONBINDING_VISIBILITYEVALUATIONCACHE = SuperModCorePackage.PRODUCT_SPACE_ELEMENT___IS_VISIBLE_HIERARCHICALLY__OPTIONBINDING_VISIBILITYEVALUATIONCACHE;

	/**
	 * The number of operations of the '<em>Versioned List Vertex</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_LIST_VERTEX_OPERATION_COUNT = SuperModCorePackage.PRODUCT_SPACE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.ubt.ai1.supermod.mm.list.impl.VersionedListEdgeImpl <em>Versioned List Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai1.supermod.mm.list.impl.VersionedListEdgeImpl
	 * @see de.ubt.ai1.supermod.mm.list.impl.SuperModListPackageImpl#getVersionedListEdge()
	 * @generated
	 */
	int VERSIONED_LIST_EDGE = 2;

	/**
	 * The feature id for the '<em><b>Super Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_LIST_EDGE__SUPER_ELEMENT = SuperModCorePackage.PRODUCT_SPACE_ELEMENT__SUPER_ELEMENT;

	/**
	 * The feature id for the '<em><b>Sub Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_LIST_EDGE__SUB_ELEMENTS = SuperModCorePackage.PRODUCT_SPACE_ELEMENT__SUB_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Super Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_LIST_EDGE__ALL_SUPER_ELEMENTS = SuperModCorePackage.PRODUCT_SPACE_ELEMENT__ALL_SUPER_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Sub Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_LIST_EDGE__ALL_SUB_ELEMENTS = SuperModCorePackage.PRODUCT_SPACE_ELEMENT__ALL_SUB_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Cross Referenced Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_LIST_EDGE__CROSS_REFERENCED_ELEMENTS = SuperModCorePackage.PRODUCT_SPACE_ELEMENT__CROSS_REFERENCED_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Cross Referencing Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_LIST_EDGE__CROSS_REFERENCING_ELEMENTS = SuperModCorePackage.PRODUCT_SPACE_ELEMENT__CROSS_REFERENCING_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Proxy UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_LIST_EDGE__PROXY_UUID = SuperModCorePackage.PRODUCT_SPACE_ELEMENT__PROXY_UUID;

	/**
	 * The feature id for the '<em><b>Transaction Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_LIST_EDGE__TRANSACTION_ID = SuperModCorePackage.PRODUCT_SPACE_ELEMENT__TRANSACTION_ID;

	/**
	 * The feature id for the '<em><b>Product Dimension</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_LIST_EDGE__PRODUCT_DIMENSION = SuperModCorePackage.PRODUCT_SPACE_ELEMENT__PRODUCT_DIMENSION;

	/**
	 * The feature id for the '<em><b>Product Space</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_LIST_EDGE__PRODUCT_SPACE = SuperModCorePackage.PRODUCT_SPACE_ELEMENT__PRODUCT_SPACE;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_LIST_EDGE__VISIBILITY = SuperModCorePackage.PRODUCT_SPACE_ELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Super Product Space Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_LIST_EDGE__SUPER_PRODUCT_SPACE_ELEMENT = SuperModCorePackage.PRODUCT_SPACE_ELEMENT__SUPER_PRODUCT_SPACE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Sub Product Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_LIST_EDGE__SUB_PRODUCT_SPACE_ELEMENTS = SuperModCorePackage.PRODUCT_SPACE_ELEMENT__SUB_PRODUCT_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Super Product Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_LIST_EDGE__ALL_SUPER_PRODUCT_SPACE_ELEMENTS = SuperModCorePackage.PRODUCT_SPACE_ELEMENT__ALL_SUPER_PRODUCT_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Sub Product Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_LIST_EDGE__ALL_SUB_PRODUCT_SPACE_ELEMENTS = SuperModCorePackage.PRODUCT_SPACE_ELEMENT__ALL_SUB_PRODUCT_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Cross Referenced Product Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_LIST_EDGE__CROSS_REFERENCED_PRODUCT_SPACE_ELEMENTS = SuperModCorePackage.PRODUCT_SPACE_ELEMENT__CROSS_REFERENCED_PRODUCT_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Cross Referencing Product Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_LIST_EDGE__CROSS_REFERENCING_PRODUCT_SPACE_ELEMENTS = SuperModCorePackage.PRODUCT_SPACE_ELEMENT__CROSS_REFERENCING_PRODUCT_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Hierarchical Visibility</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_LIST_EDGE__HIERARCHICAL_VISIBILITY = SuperModCorePackage.PRODUCT_SPACE_ELEMENT__HIERARCHICAL_VISIBILITY;

	/**
	 * The feature id for the '<em><b>Superordinate Visibility</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_LIST_EDGE__SUPERORDINATE_VISIBILITY = SuperModCorePackage.PRODUCT_SPACE_ELEMENT__SUPERORDINATE_VISIBILITY;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_LIST_EDGE__SOURCE = SuperModCorePackage.PRODUCT_SPACE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sink</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_LIST_EDGE__SINK = SuperModCorePackage.PRODUCT_SPACE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>List</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_LIST_EDGE__LIST = SuperModCorePackage.PRODUCT_SPACE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Versioned List Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_LIST_EDGE_FEATURE_COUNT = SuperModCorePackage.PRODUCT_SPACE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Is Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_LIST_EDGE___IS_PROXY = SuperModCorePackage.PRODUCT_SPACE_ELEMENT___IS_PROXY;

	/**
	 * The operation id for the '<em>Is Visible</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_LIST_EDGE___IS_VISIBLE__OPTIONBINDING_VISIBILITYEVALUATIONCACHE = SuperModCorePackage.PRODUCT_SPACE_ELEMENT___IS_VISIBLE__OPTIONBINDING_VISIBILITYEVALUATIONCACHE;

	/**
	 * The operation id for the '<em>Is Visible Hierarchically</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_LIST_EDGE___IS_VISIBLE_HIERARCHICALLY__OPTIONBINDING_VISIBILITYEVALUATIONCACHE = SuperModCorePackage.PRODUCT_SPACE_ELEMENT___IS_VISIBLE_HIERARCHICALLY__OPTIONBINDING_VISIBILITYEVALUATIONCACHE;

	/**
	 * The number of operations of the '<em>Versioned List Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_LIST_EDGE_OPERATION_COUNT = SuperModCorePackage.PRODUCT_SPACE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.ubt.ai1.supermod.mm.list.impl.VersionedListStartReferenceImpl <em>Versioned List Start Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai1.supermod.mm.list.impl.VersionedListStartReferenceImpl
	 * @see de.ubt.ai1.supermod.mm.list.impl.SuperModListPackageImpl#getVersionedListStartReference()
	 * @generated
	 */
	int VERSIONED_LIST_START_REFERENCE = 3;

	/**
	 * The feature id for the '<em><b>Super Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_LIST_START_REFERENCE__SUPER_ELEMENT = SuperModCorePackage.PRODUCT_SPACE_ELEMENT__SUPER_ELEMENT;

	/**
	 * The feature id for the '<em><b>Sub Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_LIST_START_REFERENCE__SUB_ELEMENTS = SuperModCorePackage.PRODUCT_SPACE_ELEMENT__SUB_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Super Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_LIST_START_REFERENCE__ALL_SUPER_ELEMENTS = SuperModCorePackage.PRODUCT_SPACE_ELEMENT__ALL_SUPER_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Sub Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_LIST_START_REFERENCE__ALL_SUB_ELEMENTS = SuperModCorePackage.PRODUCT_SPACE_ELEMENT__ALL_SUB_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Cross Referenced Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_LIST_START_REFERENCE__CROSS_REFERENCED_ELEMENTS = SuperModCorePackage.PRODUCT_SPACE_ELEMENT__CROSS_REFERENCED_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Cross Referencing Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_LIST_START_REFERENCE__CROSS_REFERENCING_ELEMENTS = SuperModCorePackage.PRODUCT_SPACE_ELEMENT__CROSS_REFERENCING_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Proxy UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_LIST_START_REFERENCE__PROXY_UUID = SuperModCorePackage.PRODUCT_SPACE_ELEMENT__PROXY_UUID;

	/**
	 * The feature id for the '<em><b>Transaction Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_LIST_START_REFERENCE__TRANSACTION_ID = SuperModCorePackage.PRODUCT_SPACE_ELEMENT__TRANSACTION_ID;

	/**
	 * The feature id for the '<em><b>Product Dimension</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_LIST_START_REFERENCE__PRODUCT_DIMENSION = SuperModCorePackage.PRODUCT_SPACE_ELEMENT__PRODUCT_DIMENSION;

	/**
	 * The feature id for the '<em><b>Product Space</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_LIST_START_REFERENCE__PRODUCT_SPACE = SuperModCorePackage.PRODUCT_SPACE_ELEMENT__PRODUCT_SPACE;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_LIST_START_REFERENCE__VISIBILITY = SuperModCorePackage.PRODUCT_SPACE_ELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Super Product Space Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_LIST_START_REFERENCE__SUPER_PRODUCT_SPACE_ELEMENT = SuperModCorePackage.PRODUCT_SPACE_ELEMENT__SUPER_PRODUCT_SPACE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Sub Product Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_LIST_START_REFERENCE__SUB_PRODUCT_SPACE_ELEMENTS = SuperModCorePackage.PRODUCT_SPACE_ELEMENT__SUB_PRODUCT_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Super Product Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_LIST_START_REFERENCE__ALL_SUPER_PRODUCT_SPACE_ELEMENTS = SuperModCorePackage.PRODUCT_SPACE_ELEMENT__ALL_SUPER_PRODUCT_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Sub Product Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_LIST_START_REFERENCE__ALL_SUB_PRODUCT_SPACE_ELEMENTS = SuperModCorePackage.PRODUCT_SPACE_ELEMENT__ALL_SUB_PRODUCT_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Cross Referenced Product Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_LIST_START_REFERENCE__CROSS_REFERENCED_PRODUCT_SPACE_ELEMENTS = SuperModCorePackage.PRODUCT_SPACE_ELEMENT__CROSS_REFERENCED_PRODUCT_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Cross Referencing Product Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_LIST_START_REFERENCE__CROSS_REFERENCING_PRODUCT_SPACE_ELEMENTS = SuperModCorePackage.PRODUCT_SPACE_ELEMENT__CROSS_REFERENCING_PRODUCT_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Hierarchical Visibility</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_LIST_START_REFERENCE__HIERARCHICAL_VISIBILITY = SuperModCorePackage.PRODUCT_SPACE_ELEMENT__HIERARCHICAL_VISIBILITY;

	/**
	 * The feature id for the '<em><b>Superordinate Visibility</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_LIST_START_REFERENCE__SUPERORDINATE_VISIBILITY = SuperModCorePackage.PRODUCT_SPACE_ELEMENT__SUPERORDINATE_VISIBILITY;

	/**
	 * The feature id for the '<em><b>Vertex</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_LIST_START_REFERENCE__VERTEX = SuperModCorePackage.PRODUCT_SPACE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>List</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_LIST_START_REFERENCE__LIST = SuperModCorePackage.PRODUCT_SPACE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Versioned List Start Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_LIST_START_REFERENCE_FEATURE_COUNT = SuperModCorePackage.PRODUCT_SPACE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Is Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_LIST_START_REFERENCE___IS_PROXY = SuperModCorePackage.PRODUCT_SPACE_ELEMENT___IS_PROXY;

	/**
	 * The operation id for the '<em>Is Visible</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_LIST_START_REFERENCE___IS_VISIBLE__OPTIONBINDING_VISIBILITYEVALUATIONCACHE = SuperModCorePackage.PRODUCT_SPACE_ELEMENT___IS_VISIBLE__OPTIONBINDING_VISIBILITYEVALUATIONCACHE;

	/**
	 * The operation id for the '<em>Is Visible Hierarchically</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_LIST_START_REFERENCE___IS_VISIBLE_HIERARCHICALLY__OPTIONBINDING_VISIBILITYEVALUATIONCACHE = SuperModCorePackage.PRODUCT_SPACE_ELEMENT___IS_VISIBLE_HIERARCHICALLY__OPTIONBINDING_VISIBILITYEVALUATIONCACHE;

	/**
	 * The number of operations of the '<em>Versioned List Start Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_LIST_START_REFERENCE_OPERATION_COUNT = SuperModCorePackage.PRODUCT_SPACE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link de.ubt.ai1.supermod.mm.list.VersionedList <em>Versioned List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Versioned List</em>'.
	 * @see de.ubt.ai1.supermod.mm.list.VersionedList
	 * @generated
	 */
	EClass getVersionedList();

	/**
	 * Returns the meta object for the containment reference list '{@link de.ubt.ai1.supermod.mm.list.VersionedList#getVertices <em>Vertices</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Vertices</em>'.
	 * @see de.ubt.ai1.supermod.mm.list.VersionedList#getVertices()
	 * @see #getVersionedList()
	 * @generated
	 */
	EReference getVersionedList_Vertices();

	/**
	 * Returns the meta object for the containment reference list '{@link de.ubt.ai1.supermod.mm.list.VersionedList#getEdges <em>Edges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Edges</em>'.
	 * @see de.ubt.ai1.supermod.mm.list.VersionedList#getEdges()
	 * @see #getVersionedList()
	 * @generated
	 */
	EReference getVersionedList_Edges();

	/**
	 * Returns the meta object for the containment reference list '{@link de.ubt.ai1.supermod.mm.list.VersionedList#getStartVertices <em>Start Vertices</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Start Vertices</em>'.
	 * @see de.ubt.ai1.supermod.mm.list.VersionedList#getStartVertices()
	 * @see #getVersionedList()
	 * @generated
	 */
	EReference getVersionedList_StartVertices();

	/**
	 * Returns the meta object for the '{@link de.ubt.ai1.supermod.mm.list.VersionedList#getAllOccurrencesOf(de.ubt.ai1.supermod.mm.core.ProductSpaceElement) <em>Get All Occurrences Of</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Occurrences Of</em>' operation.
	 * @see de.ubt.ai1.supermod.mm.list.VersionedList#getAllOccurrencesOf(de.ubt.ai1.supermod.mm.core.ProductSpaceElement)
	 * @generated
	 */
	EOperation getVersionedList__GetAllOccurrencesOf__ProductSpaceElement();

	/**
	 * Returns the meta object for the '{@link de.ubt.ai1.supermod.mm.list.VersionedList#linearize() <em>Linearize</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Linearize</em>' operation.
	 * @see de.ubt.ai1.supermod.mm.list.VersionedList#linearize()
	 * @generated
	 */
	EOperation getVersionedList__Linearize();

	/**
	 * Returns the meta object for the '{@link de.ubt.ai1.supermod.mm.list.VersionedList#getEdge(de.ubt.ai1.supermod.mm.list.VersionedListVertex, de.ubt.ai1.supermod.mm.list.VersionedListVertex) <em>Get Edge</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Edge</em>' operation.
	 * @see de.ubt.ai1.supermod.mm.list.VersionedList#getEdge(de.ubt.ai1.supermod.mm.list.VersionedListVertex, de.ubt.ai1.supermod.mm.list.VersionedListVertex)
	 * @generated
	 */
	EOperation getVersionedList__GetEdge__VersionedListVertex_VersionedListVertex();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai1.supermod.mm.list.VersionedListVertex <em>Versioned List Vertex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Versioned List Vertex</em>'.
	 * @see de.ubt.ai1.supermod.mm.list.VersionedListVertex
	 * @generated
	 */
	EClass getVersionedListVertex();

	/**
	 * Returns the meta object for the reference '{@link de.ubt.ai1.supermod.mm.list.VersionedListVertex#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Element</em>'.
	 * @see de.ubt.ai1.supermod.mm.list.VersionedListVertex#getElement()
	 * @see #getVersionedListVertex()
	 * @generated
	 */
	EReference getVersionedListVertex_Element();

	/**
	 * Returns the meta object for the reference list '{@link de.ubt.ai1.supermod.mm.list.VersionedListVertex#getIncomingEdges <em>Incoming Edges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incoming Edges</em>'.
	 * @see de.ubt.ai1.supermod.mm.list.VersionedListVertex#getIncomingEdges()
	 * @see #getVersionedListVertex()
	 * @generated
	 */
	EReference getVersionedListVertex_IncomingEdges();

	/**
	 * Returns the meta object for the reference list '{@link de.ubt.ai1.supermod.mm.list.VersionedListVertex#getOutgoingEdges <em>Outgoing Edges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outgoing Edges</em>'.
	 * @see de.ubt.ai1.supermod.mm.list.VersionedListVertex#getOutgoingEdges()
	 * @see #getVersionedListVertex()
	 * @generated
	 */
	EReference getVersionedListVertex_OutgoingEdges();

	/**
	 * Returns the meta object for the container reference '{@link de.ubt.ai1.supermod.mm.list.VersionedListVertex#getList <em>List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>List</em>'.
	 * @see de.ubt.ai1.supermod.mm.list.VersionedListVertex#getList()
	 * @see #getVersionedListVertex()
	 * @generated
	 */
	EReference getVersionedListVertex_List();

	/**
	 * Returns the meta object for the reference '{@link de.ubt.ai1.supermod.mm.list.VersionedListVertex#getStartRef <em>Start Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Start Ref</em>'.
	 * @see de.ubt.ai1.supermod.mm.list.VersionedListVertex#getStartRef()
	 * @see #getVersionedListVertex()
	 * @generated
	 */
	EReference getVersionedListVertex_StartRef();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai1.supermod.mm.list.VersionedListEdge <em>Versioned List Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Versioned List Edge</em>'.
	 * @see de.ubt.ai1.supermod.mm.list.VersionedListEdge
	 * @generated
	 */
	EClass getVersionedListEdge();

	/**
	 * Returns the meta object for the reference '{@link de.ubt.ai1.supermod.mm.list.VersionedListEdge#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see de.ubt.ai1.supermod.mm.list.VersionedListEdge#getSource()
	 * @see #getVersionedListEdge()
	 * @generated
	 */
	EReference getVersionedListEdge_Source();

	/**
	 * Returns the meta object for the reference '{@link de.ubt.ai1.supermod.mm.list.VersionedListEdge#getSink <em>Sink</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sink</em>'.
	 * @see de.ubt.ai1.supermod.mm.list.VersionedListEdge#getSink()
	 * @see #getVersionedListEdge()
	 * @generated
	 */
	EReference getVersionedListEdge_Sink();

	/**
	 * Returns the meta object for the container reference '{@link de.ubt.ai1.supermod.mm.list.VersionedListEdge#getList <em>List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>List</em>'.
	 * @see de.ubt.ai1.supermod.mm.list.VersionedListEdge#getList()
	 * @see #getVersionedListEdge()
	 * @generated
	 */
	EReference getVersionedListEdge_List();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai1.supermod.mm.list.VersionedListStartReference <em>Versioned List Start Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Versioned List Start Reference</em>'.
	 * @see de.ubt.ai1.supermod.mm.list.VersionedListStartReference
	 * @generated
	 */
	EClass getVersionedListStartReference();

	/**
	 * Returns the meta object for the reference '{@link de.ubt.ai1.supermod.mm.list.VersionedListStartReference#getVertex <em>Vertex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Vertex</em>'.
	 * @see de.ubt.ai1.supermod.mm.list.VersionedListStartReference#getVertex()
	 * @see #getVersionedListStartReference()
	 * @generated
	 */
	EReference getVersionedListStartReference_Vertex();

	/**
	 * Returns the meta object for the container reference '{@link de.ubt.ai1.supermod.mm.list.VersionedListStartReference#getList <em>List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>List</em>'.
	 * @see de.ubt.ai1.supermod.mm.list.VersionedListStartReference#getList()
	 * @see #getVersionedListStartReference()
	 * @generated
	 */
	EReference getVersionedListStartReference_List();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SuperModListFactory getSuperModListFactory();

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
		 * The meta object literal for the '{@link de.ubt.ai1.supermod.mm.list.impl.VersionedListImpl <em>Versioned List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai1.supermod.mm.list.impl.VersionedListImpl
		 * @see de.ubt.ai1.supermod.mm.list.impl.SuperModListPackageImpl#getVersionedList()
		 * @generated
		 */
		EClass VERSIONED_LIST = eINSTANCE.getVersionedList();

		/**
		 * The meta object literal for the '<em><b>Vertices</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VERSIONED_LIST__VERTICES = eINSTANCE.getVersionedList_Vertices();

		/**
		 * The meta object literal for the '<em><b>Edges</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VERSIONED_LIST__EDGES = eINSTANCE.getVersionedList_Edges();

		/**
		 * The meta object literal for the '<em><b>Start Vertices</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VERSIONED_LIST__START_VERTICES = eINSTANCE.getVersionedList_StartVertices();

		/**
		 * The meta object literal for the '<em><b>Get All Occurrences Of</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VERSIONED_LIST___GET_ALL_OCCURRENCES_OF__PRODUCTSPACEELEMENT = eINSTANCE.getVersionedList__GetAllOccurrencesOf__ProductSpaceElement();

		/**
		 * The meta object literal for the '<em><b>Linearize</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VERSIONED_LIST___LINEARIZE = eINSTANCE.getVersionedList__Linearize();

		/**
		 * The meta object literal for the '<em><b>Get Edge</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VERSIONED_LIST___GET_EDGE__VERSIONEDLISTVERTEX_VERSIONEDLISTVERTEX = eINSTANCE.getVersionedList__GetEdge__VersionedListVertex_VersionedListVertex();

		/**
		 * The meta object literal for the '{@link de.ubt.ai1.supermod.mm.list.impl.VersionedListVertexImpl <em>Versioned List Vertex</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai1.supermod.mm.list.impl.VersionedListVertexImpl
		 * @see de.ubt.ai1.supermod.mm.list.impl.SuperModListPackageImpl#getVersionedListVertex()
		 * @generated
		 */
		EClass VERSIONED_LIST_VERTEX = eINSTANCE.getVersionedListVertex();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VERSIONED_LIST_VERTEX__ELEMENT = eINSTANCE.getVersionedListVertex_Element();

		/**
		 * The meta object literal for the '<em><b>Incoming Edges</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VERSIONED_LIST_VERTEX__INCOMING_EDGES = eINSTANCE.getVersionedListVertex_IncomingEdges();

		/**
		 * The meta object literal for the '<em><b>Outgoing Edges</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VERSIONED_LIST_VERTEX__OUTGOING_EDGES = eINSTANCE.getVersionedListVertex_OutgoingEdges();

		/**
		 * The meta object literal for the '<em><b>List</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VERSIONED_LIST_VERTEX__LIST = eINSTANCE.getVersionedListVertex_List();

		/**
		 * The meta object literal for the '<em><b>Start Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VERSIONED_LIST_VERTEX__START_REF = eINSTANCE.getVersionedListVertex_StartRef();

		/**
		 * The meta object literal for the '{@link de.ubt.ai1.supermod.mm.list.impl.VersionedListEdgeImpl <em>Versioned List Edge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai1.supermod.mm.list.impl.VersionedListEdgeImpl
		 * @see de.ubt.ai1.supermod.mm.list.impl.SuperModListPackageImpl#getVersionedListEdge()
		 * @generated
		 */
		EClass VERSIONED_LIST_EDGE = eINSTANCE.getVersionedListEdge();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VERSIONED_LIST_EDGE__SOURCE = eINSTANCE.getVersionedListEdge_Source();

		/**
		 * The meta object literal for the '<em><b>Sink</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VERSIONED_LIST_EDGE__SINK = eINSTANCE.getVersionedListEdge_Sink();

		/**
		 * The meta object literal for the '<em><b>List</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VERSIONED_LIST_EDGE__LIST = eINSTANCE.getVersionedListEdge_List();

		/**
		 * The meta object literal for the '{@link de.ubt.ai1.supermod.mm.list.impl.VersionedListStartReferenceImpl <em>Versioned List Start Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai1.supermod.mm.list.impl.VersionedListStartReferenceImpl
		 * @see de.ubt.ai1.supermod.mm.list.impl.SuperModListPackageImpl#getVersionedListStartReference()
		 * @generated
		 */
		EClass VERSIONED_LIST_START_REFERENCE = eINSTANCE.getVersionedListStartReference();

		/**
		 * The meta object literal for the '<em><b>Vertex</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VERSIONED_LIST_START_REFERENCE__VERTEX = eINSTANCE.getVersionedListStartReference_Vertex();

		/**
		 * The meta object literal for the '<em><b>List</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VERSIONED_LIST_START_REFERENCE__LIST = eINSTANCE.getVersionedListStartReference_List();

	}

} //SuperModListPackage
