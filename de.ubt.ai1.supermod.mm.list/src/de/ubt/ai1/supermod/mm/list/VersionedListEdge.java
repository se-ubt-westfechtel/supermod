/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.mm.list;

import de.ubt.ai1.supermod.mm.core.ProductSpaceElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Versioned List Edge</b></em>'.
 * An edge inside a versioned graph connects two versined vertices.
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date 	2014-07-25
 * @see VersionedVertex
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai1.supermod.mm.list.VersionedListEdge#getSource <em>Source</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.list.VersionedListEdge#getSink <em>Sink</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.list.VersionedListEdge#getList <em>List</em>}</li>
 * </ul>
 *
 * @see de.ubt.ai1.supermod.mm.list.SuperModListPackage#getVersionedListEdge()
 * @model
 * @generated
 */
public interface VersionedListEdge extends ProductSpaceElement {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link de.ubt.ai1.supermod.mm.list.VersionedListVertex#getOutgoingEdges <em>Outgoing Edges</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * The vertex where this edge starts.
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(VersionedListVertex)
	 * @see de.ubt.ai1.supermod.mm.list.SuperModListPackage#getVersionedListEdge_Source()
	 * @see de.ubt.ai1.supermod.mm.list.VersionedListVertex#getOutgoingEdges
	 * @model opposite="outgoingEdges"
	 * @generated
	 */
	VersionedListVertex getSource();

	/**
	 * Sets the value of the '{@link de.ubt.ai1.supermod.mm.list.VersionedListEdge#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(VersionedListVertex value);

	/**
	 * Returns the value of the '<em><b>Sink</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link de.ubt.ai1.supermod.mm.list.VersionedListVertex#getIncomingEdges <em>Incoming Edges</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * The vertex where this edge ends.
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sink</em>' reference.
	 * @see #setSink(VersionedListVertex)
	 * @see de.ubt.ai1.supermod.mm.list.SuperModListPackage#getVersionedListEdge_Sink()
	 * @see de.ubt.ai1.supermod.mm.list.VersionedListVertex#getIncomingEdges
	 * @model opposite="incomingEdges"
	 * @generated
	 */
	VersionedListVertex getSink();

	/**
	 * Sets the value of the '{@link de.ubt.ai1.supermod.mm.list.VersionedListEdge#getSink <em>Sink</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sink</em>' reference.
	 * @see #getSink()
	 * @generated
	 */
	void setSink(VersionedListVertex value);

	/**
	 * Returns the value of the '<em><b>List</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.ubt.ai1.supermod.mm.list.VersionedList#getEdges <em>Edges</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * The versioned list that contains this edge in its edge set.
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List</em>' container reference.
	 * @see #setList(VersionedList)
	 * @see de.ubt.ai1.supermod.mm.list.SuperModListPackage#getVersionedListEdge_List()
	 * @see de.ubt.ai1.supermod.mm.list.VersionedList#getEdges
	 * @model opposite="edges" transient="false"
	 * @generated
	 */
	VersionedList getList();

	/**
	 * Sets the value of the '{@link de.ubt.ai1.supermod.mm.list.VersionedListEdge#getList <em>List</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List</em>' container reference.
	 * @see #getList()
	 * @generated
	 */
	void setList(VersionedList value);

} // VersionedListEdge
