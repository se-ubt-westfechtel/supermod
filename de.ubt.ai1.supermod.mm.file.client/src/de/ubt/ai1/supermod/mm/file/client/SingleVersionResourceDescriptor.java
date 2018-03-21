/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.mm.file.client;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Single Version Resource Descriptor</b></em>'.
 * Base type for file and folder descriptors. Each descriptor refers to a fragment
 * of a resource path. Furthermore, each resource descriptor contains a flag that
 * specifies whether the mapped resource is subject to version control.
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
 *   <li>{@link de.ubt.ai1.supermod.mm.file.client.SingleVersionResourceDescriptor#getName <em>Name</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.file.client.SingleVersionResourceDescriptor#getPath <em>Path</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.file.client.SingleVersionResourceDescriptor#getContainer <em>Container</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.file.client.SingleVersionResourceDescriptor#isVersioned <em>Versioned</em>}</li>
 * </ul>
 *
 * @see de.ubt.ai1.supermod.mm.file.client.SuperModFileClientPackage#getSingleVersionResourceDescriptor()
 * @model abstract="true"
 * @generated
 */
public interface SingleVersionResourceDescriptor extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * The name of the current resource descriptor. Unique inside its parent
	 * folder descriptor.
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.ubt.ai1.supermod.mm.file.client.SuperModFileClientPackage#getSingleVersionResourceDescriptor_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.ubt.ai1.supermod.mm.file.client.SingleVersionResourceDescriptor#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * The path of this resource descriptor, which is created by concatenating
	 * its parent's path using the slash as separator.
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path</em>' attribute.
	 * @see de.ubt.ai1.supermod.mm.file.client.SuperModFileClientPackage#getSingleVersionResourceDescriptor_Path()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getPath();

	/**
	 * Returns the value of the '<em><b>Container</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.ubt.ai1.supermod.mm.file.client.SingleVersionFolderDescriptor#getContents <em>Contents</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * The folder descriptor which directly contains this resource descriptor.
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container</em>' container reference.
	 * @see #setContainer(SingleVersionFolderDescriptor)
	 * @see de.ubt.ai1.supermod.mm.file.client.SuperModFileClientPackage#getSingleVersionResourceDescriptor_Container()
	 * @see de.ubt.ai1.supermod.mm.file.client.SingleVersionFolderDescriptor#getContents
	 * @model opposite="contents" transient="false"
	 * @generated
	 */
	SingleVersionFolderDescriptor getContainer();

	/**
	 * Sets the value of the '{@link de.ubt.ai1.supermod.mm.file.client.SingleVersionResourceDescriptor#getContainer <em>Container</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container</em>' container reference.
	 * @see #getContainer()
	 * @generated
	 */
	void setContainer(SingleVersionFolderDescriptor value);

	/**
	 * Returns the value of the '<em><b>Versioned</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * Whether the described resource is subject to version control.
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Versioned</em>' attribute.
	 * @see #setVersioned(boolean)
	 * @see de.ubt.ai1.supermod.mm.file.client.SuperModFileClientPackage#getSingleVersionResourceDescriptor_Versioned()
	 * @model
	 * @generated
	 */
	boolean isVersioned();

	/**
	 * Sets the value of the '{@link de.ubt.ai1.supermod.mm.file.client.SingleVersionResourceDescriptor#isVersioned <em>Versioned</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Versioned</em>' attribute.
	 * @see #isVersioned()
	 * @generated
	 */
	void setVersioned(boolean value);

} // SingleVersionResourceDescriptor
