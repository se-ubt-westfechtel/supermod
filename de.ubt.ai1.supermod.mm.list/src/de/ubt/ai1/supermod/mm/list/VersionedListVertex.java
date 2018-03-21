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
import de.ubt.ai1.supermod.mm.core.UUIDElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Versioned List Vertex</b></em>'.
 * A vertex inside a versioned graph references a product space element.
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>,
 * 			Johannes Schroepfer <Johannes.M.Schroepfer(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	2018-01-09
 * @see 	ProductSpaceElement
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai1.supermod.mm.list.VersionedListVertex#getElement <em>Element</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.list.VersionedListVertex#getIncomingEdges <em>Incoming Edges</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.list.VersionedListVertex#getOutgoingEdges <em>Outgoing Edges</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.list.VersionedListVertex#getList <em>List</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.list.VersionedListVertex#getStartRef <em>Start Ref</em>}</li>
 * </ul>
 *
 * @see de.ubt.ai1.supermod.mm.list.SuperModListPackage#getVersionedListVertex()
 * @model
 * @generated
 */
public interface VersionedListVertex extends ProductSpaceElement, UUIDElement {
	/**
	 * Returns the value of the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * The product space element referenced by this edge.
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element</em>' reference.
	 * @see #setElement(ProductSpaceElement)
	 * @see de.ubt.ai1.supermod.mm.list.SuperModListPackage#getVersionedListVertex_Element()
	 * @model
	 * @generated
	 */
	ProductSpaceElement getElement();

	/**
	 * Sets the value of the '{@link de.ubt.ai1.supermod.mm.list.VersionedListVertex#getElement <em>Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element</em>' reference.
	 * @see #getElement()
	 * @generated
	 */
	void setElement(ProductSpaceElement value);

	/**
	 * Returns the value of the '<em><b>Incoming Edges</b></em>' reference list.
	 * The list contents are of type {@link de.ubt.ai1.supermod.mm.list.VersionedListEdge}.
	 * It is bidirectional and its opposite is '{@link de.ubt.ai1.supermod.mm.list.VersionedListEdge#getSink <em>Sink</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * Versioned edges whose target connect to this vertex.
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming Edges</em>' reference list.
	 * @see de.ubt.ai1.supermod.mm.list.SuperModListPackage#getVersionedListVertex_IncomingEdges()
	 * @see de.ubt.ai1.supermod.mm.list.VersionedListEdge#getSink
	 * @model opposite="sink"
	 * @generated
	 */
	EList<VersionedListEdge> getIncomingEdges();

	/**
	 * Returns the value of the '<em><b>Outgoing Edges</b></em>' reference list.
	 * The list contents are of type {@link de.ubt.ai1.supermod.mm.list.VersionedListEdge}.
	 * It is bidirectional and its opposite is '{@link de.ubt.ai1.supermod.mm.list.VersionedListEdge#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * Versioned edges who have their source at this vertex.
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing Edges</em>' reference list.
	 * @see de.ubt.ai1.supermod.mm.list.SuperModListPackage#getVersionedListVertex_OutgoingEdges()
	 * @see de.ubt.ai1.supermod.mm.list.VersionedListEdge#getSource
	 * @model opposite="source"
	 * @generated
	 */
	EList<VersionedListEdge> getOutgoingEdges();

	/**
	 * Returns the value of the '<em><b>List</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.ubt.ai1.supermod.mm.list.VersionedList#getVertices <em>Vertices</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * The versioned list where this vertex belongs to.
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List</em>' container reference.
	 * @see #setList(VersionedList)
	 * @see de.ubt.ai1.supermod.mm.list.SuperModListPackage#getVersionedListVertex_List()
	 * @see de.ubt.ai1.supermod.mm.list.VersionedList#getVertices
	 * @model opposite="vertices" transient="false"
	 * @generated
	 */
	VersionedList getList();

	/**
	 * Sets the value of the '{@link de.ubt.ai1.supermod.mm.list.VersionedListVertex#getList <em>List</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List</em>' container reference.
	 * @see #getList()
	 * @generated
	 */
	void setList(VersionedList value);

	/**
	 * Returns the value of the '<em><b>Start Ref</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link de.ubt.ai1.supermod.mm.list.VersionedListStartReference#getVertex <em>Vertex</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Ref</em>' reference.
	 * @see #setStartRef(VersionedListStartReference)
	 * @see de.ubt.ai1.supermod.mm.list.SuperModListPackage#getVersionedListVertex_StartRef()
	 * @see de.ubt.ai1.supermod.mm.list.VersionedListStartReference#getVertex
	 * @model opposite="vertex"
	 * @generated
	 */
	VersionedListStartReference getStartRef();

	/**
	 * Sets the value of the '{@link de.ubt.ai1.supermod.mm.list.VersionedListVertex#getStartRef <em>Start Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Ref</em>' reference.
	 * @see #getStartRef()
	 * @generated
	 */
	void setStartRef(VersionedListStartReference value);

} // VersionedListVertex
