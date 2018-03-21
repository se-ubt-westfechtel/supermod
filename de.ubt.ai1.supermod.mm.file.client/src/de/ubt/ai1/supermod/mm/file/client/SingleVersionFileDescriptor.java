/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.mm.file.client;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Single Version File Descriptor</b></em>'.
 * Describes a file in the local file system.
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date 	2014-07-28
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai1.supermod.mm.file.client.SingleVersionFileDescriptor#getHash <em>Hash</em>}</li>
 * </ul>
 *
 * @see de.ubt.ai1.supermod.mm.file.client.SuperModFileClientPackage#getSingleVersionFileDescriptor()
 * @model
 * @generated
 */
public interface SingleVersionFileDescriptor extends SingleVersionResourceDescriptor {
	/**
	 * Returns the value of the '<em><b>Hash</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * The hashed file content which is used in order to track modifications
	 * to the described file.
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hash</em>' attribute.
	 * @see #setHash(String)
	 * @see de.ubt.ai1.supermod.mm.file.client.SuperModFileClientPackage#getSingleVersionFileDescriptor_Hash()
	 * @model
	 * @generated
	 */
	String getHash();

	/**
	 * Sets the value of the '{@link de.ubt.ai1.supermod.mm.file.client.SingleVersionFileDescriptor#getHash <em>Hash</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hash</em>' attribute.
	 * @see #getHash()
	 * @generated
	 */
	void setHash(String value);

} // SingleVersionFileDescriptor
