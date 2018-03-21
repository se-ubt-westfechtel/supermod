/******************************************************************************
 * Copyright (c) 2018 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.mm.list;

import de.ubt.ai1.supermod.mm.core.ProductSpaceElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Versioned List Start Reference</b></em>'.
 * A start reference of a versioned list references a vertex that represents the beginning
 * of the list.
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>,
 * 			Johannes Schroepfer <Johannes.M.Schroepfer(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	2018-01-09
 * @see 	VersionedListVertex
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai1.supermod.mm.list.VersionedListStartReference#getVertex <em>Vertex</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.list.VersionedListStartReference#getList <em>List</em>}</li>
 * </ul>
 *
 * @see de.ubt.ai1.supermod.mm.list.SuperModListPackage#getVersionedListStartReference()
 * @model
 * @generated
 */
public interface VersionedListStartReference extends ProductSpaceElement {
	/**
	 * Returns the value of the '<em><b>Vertex</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link de.ubt.ai1.supermod.mm.list.VersionedListVertex#getStartRef <em>Start Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vertex</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vertex</em>' reference.
	 * @see #setVertex(VersionedListVertex)
	 * @see de.ubt.ai1.supermod.mm.list.SuperModListPackage#getVersionedListStartReference_Vertex()
	 * @see de.ubt.ai1.supermod.mm.list.VersionedListVertex#getStartRef
	 * @model opposite="startRef"
	 * @generated
	 */
	VersionedListVertex getVertex();

	/**
	 * Sets the value of the '{@link de.ubt.ai1.supermod.mm.list.VersionedListStartReference#getVertex <em>Vertex</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vertex</em>' reference.
	 * @see #getVertex()
	 * @generated
	 */
	void setVertex(VersionedListVertex value);

	/**
	 * Returns the value of the '<em><b>List</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.ubt.ai1.supermod.mm.list.VersionedList#getStartVertices <em>Start Vertices</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List</em>' container reference.
	 * @see #setList(VersionedList)
	 * @see de.ubt.ai1.supermod.mm.list.SuperModListPackage#getVersionedListStartReference_List()
	 * @see de.ubt.ai1.supermod.mm.list.VersionedList#getStartVertices
	 * @model opposite="startVertices" transient="false"
	 * @generated
	 */
	VersionedList getList();

	/**
	 * Sets the value of the '{@link de.ubt.ai1.supermod.mm.list.VersionedListStartReference#getList <em>List</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List</em>' container reference.
	 * @see #getList()
	 * @generated
	 */
	void setList(VersionedList value);

} // VersionedListStartReference
