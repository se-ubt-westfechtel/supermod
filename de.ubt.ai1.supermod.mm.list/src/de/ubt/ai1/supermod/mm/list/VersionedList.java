/******************************************************************************
 * Copyright (c) 2018 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.mm.list;

import org.eclipse.emf.common.util.EList;

import de.ubt.ai1.supermod.mm.core.ProductSpaceElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Versioned List</b></em>'.
 * A versioned list consists of a collection of versioned vertices, each referring
 * to a product space element, a collection of versioned edges, each 
 * connecting two vertices, and a collection of versioned start references, each
 * referring to a vertex that represents the beginning of the list.
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>,
 * 			Johannes Schroepfer <Johannes.M.Schroepfer(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	2018-01-09
 * @see		ProductSpaceElement
 * @see		VersionedListVertex
 * @see		VersionedListEdge
 * @see		VersionedListStartReference
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai1.supermod.mm.list.VersionedList#getVertices <em>Vertices</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.list.VersionedList#getEdges <em>Edges</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.list.VersionedList#getStartVertices <em>Start Vertices</em>}</li>
 * </ul>
 *
 * @see de.ubt.ai1.supermod.mm.list.SuperModListPackage#getVersionedList()
 * @model
 * @generated
 */
public interface VersionedList extends ProductSpaceElement {
	/**
	 * Returns the value of the '<em><b>Vertices</b></em>' containment reference list.
	 * The list contents are of type {@link de.ubt.ai1.supermod.mm.list.VersionedListVertex}.
	 * It is bidirectional and its opposite is '{@link de.ubt.ai1.supermod.mm.list.VersionedListVertex#getList <em>List</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * The vertex set.
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vertices</em>' containment reference list.
	 * @see de.ubt.ai1.supermod.mm.list.SuperModListPackage#getVersionedList_Vertices()
	 * @see de.ubt.ai1.supermod.mm.list.VersionedListVertex#getList
	 * @model opposite="list" containment="true"
	 * @generated
	 */
	EList<VersionedListVertex> getVertices();

	/**
	 * Returns the value of the '<em><b>Edges</b></em>' containment reference list.
	 * The list contents are of type {@link de.ubt.ai1.supermod.mm.list.VersionedListEdge}.
	 * It is bidirectional and its opposite is '{@link de.ubt.ai1.supermod.mm.list.VersionedListEdge#getList <em>List</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * The edge set.
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edges</em>' containment reference list.
	 * @see de.ubt.ai1.supermod.mm.list.SuperModListPackage#getVersionedList_Edges()
	 * @see de.ubt.ai1.supermod.mm.list.VersionedListEdge#getList
	 * @model opposite="list" containment="true"
	 * @generated
	 */
	EList<VersionedListEdge> getEdges();

	/**
	 * Returns the value of the '<em><b>Start Vertices</b></em>' containment reference list.
	 * The list contents are of type {@link de.ubt.ai1.supermod.mm.list.VersionedListStartReference}.
	 * It is bidirectional and its opposite is '{@link de.ubt.ai1.supermod.mm.list.VersionedListStartReference#getList <em>List</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Vertices</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Vertices</em>' containment reference list.
	 * @see de.ubt.ai1.supermod.mm.list.SuperModListPackage#getVersionedList_StartVertices()
	 * @see de.ubt.ai1.supermod.mm.list.VersionedListStartReference#getList
	 * @model opposite="list" containment="true"
	 * @generated
	 */
	EList<VersionedListStartReference> getStartVertices();

	/**
	 * <!-- begin-user-doc -->
	 * Returns all occurrences, i.e., all vertices which refer a given product space
	 * element, inside this graph.
	 * @param element the product space element to find occurrences for.
	 * @return a list of all vertices that refer to the element.
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EList<VersionedListVertex> getAllOccurrencesOf(ProductSpaceElement element);

	/**
	 * <!-- begin-user-doc -->
	 * Traverses the graph and tries to find a linear order. In case the order
	 * between two vertices is underspecified or conflicting, this operation
	 * proceeds randomly.
	 * @return a list containing the versioned graph's element in linear order.
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EList<ProductSpaceElement> linearize();

	/**
	 * <!-- begin-user-doc -->
	 * Finds an edge in the graph which connects two given vertices.
	 * @param from the source of the edge to find.
	 * @param to the target of the edge to find.
	 * @return the edge that connects source to target, if exists, or 
	 * 			<code>null</code>.
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	VersionedListEdge getEdge(VersionedListVertex from, VersionedListVertex to);

} // VersionedList
