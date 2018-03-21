/******************************************************************************
 * Copyright (c) 2018 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.mm.list.client;


import org.eclipse.emf.common.util.EList;

import de.ubt.ai1.supermod.mm.client.ProductConflict;
import de.ubt.ai1.supermod.mm.list.VersionedList;
import de.ubt.ai1.supermod.mm.list.VersionedListEdge;
import de.ubt.ai1.supermod.mm.list.VersionedListVertex;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ordering Conflict</b></em>'.
 * An ordering conflict is reported in case a versioned list defines an order
 * which cannot be transformed into a linear list. This is true in case the
 * versioned graph contains cycles, or pairs of mutually unrelated vertices.
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>,
 * 			Johannes Schroepfer <Johannes.M.Schroepfer(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	2018-01-09
 * @see		VersionedList
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai1.supermod.mm.list.client.OrderingConflict#getContextList <em>Context List</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.list.client.OrderingConflict#getLastVertex <em>Last Vertex</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.list.client.OrderingConflict#getSuccessorEdges <em>Successor Edges</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.list.client.OrderingConflict#getSuccessorVertices <em>Successor Vertices</em>}</li>
 * </ul>
 *
 * @see de.ubt.ai1.supermod.mm.list.client.SuperModListClientPackage#getOrderingConflict()
 * @model
 * @generated
 */
public interface OrderingConflict extends ProductConflict {
	/**
	 * Returns the value of the '<em><b>Context List</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context List</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context List</em>' reference.
	 * @see #setContextList(VersionedList)
	 * @see de.ubt.ai1.supermod.mm.list.client.SuperModListClientPackage#getOrderingConflict_ContextList()
	 * @model
	 * @generated
	 */
	VersionedList getContextList();

	/**
	 * Sets the value of the '{@link de.ubt.ai1.supermod.mm.list.client.OrderingConflict#getContextList <em>Context List</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context List</em>' reference.
	 * @see #getContextList()
	 * @generated
	 */
	void setContextList(VersionedList value);

	/**
	 * Returns the value of the '<em><b>Last Vertex</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Vertex</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Vertex</em>' reference.
	 * @see #setLastVertex(VersionedListVertex)
	 * @see de.ubt.ai1.supermod.mm.list.client.SuperModListClientPackage#getOrderingConflict_LastVertex()
	 * @model
	 * @generated
	 */
	VersionedListVertex getLastVertex();

	/**
	 * Sets the value of the '{@link de.ubt.ai1.supermod.mm.list.client.OrderingConflict#getLastVertex <em>Last Vertex</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Vertex</em>' reference.
	 * @see #getLastVertex()
	 * @generated
	 */
	void setLastVertex(VersionedListVertex value);

	/**
	 * Returns the value of the '<em><b>Successor Edges</b></em>' reference list.
	 * The list contents are of type {@link de.ubt.ai1.supermod.mm.list.VersionedListEdge}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Successor Edges</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Successor Edges</em>' reference list.
	 * @see de.ubt.ai1.supermod.mm.list.client.SuperModListClientPackage#getOrderingConflict_SuccessorEdges()
	 * @model
	 * @generated
	 */
	EList<VersionedListEdge> getSuccessorEdges();

	/**
	 * Returns the value of the '<em><b>Successor Vertices</b></em>' reference list.
	 * The list contents are of type {@link de.ubt.ai1.supermod.mm.list.VersionedListVertex}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Successor Vertices</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Successor Vertices</em>' reference list.
	 * @see de.ubt.ai1.supermod.mm.list.client.SuperModListClientPackage#getOrderingConflict_SuccessorVertices()
	 * @model
	 * @generated
	 */
	EList<VersionedListVertex> getSuccessorVertices();

} // OrderingConflict
