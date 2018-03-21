/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.mm.file.client;

import org.eclipse.emf.common.util.EList;

import de.ubt.ai1.supermod.mm.client.SingleVersionProductDimensionDescriptor;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Single Version File System Descriptor</b></em>'.
 * Describes a single-version file system as a tree of files and folders.
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
 *   <li>{@link de.ubt.ai1.supermod.mm.file.client.SingleVersionFileSystemDescriptor#getRoots <em>Roots</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.file.client.SingleVersionFileSystemDescriptor#getRootUri <em>Root Uri</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.file.client.SingleVersionFileSystemDescriptor#getAllResources <em>All Resources</em>}</li>
 * </ul>
 *
 * @see de.ubt.ai1.supermod.mm.file.client.SuperModFileClientPackage#getSingleVersionFileSystemDescriptor()
 * @model
 * @generated
 */
public interface SingleVersionFileSystemDescriptor extends SingleVersionProductDimensionDescriptor {
	/**
	 * Returns the value of the '<em><b>Roots</b></em>' containment reference list.
	 * The list contents are of type {@link de.ubt.ai1.supermod.mm.file.client.SingleVersionResourceDescriptor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * The direct roots of the described file system.
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roots</em>' containment reference list.
	 * @see de.ubt.ai1.supermod.mm.file.client.SuperModFileClientPackage#getSingleVersionFileSystemDescriptor_Roots()
	 * @model containment="true"
	 * @generated
	 */
	EList<SingleVersionResourceDescriptor> getRoots();

	/**
	 * Returns the value of the '<em><b>Root Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * An absolute URI which describes the part of the physical file system
	 * which is mapped by this file system descriptor.
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root Uri</em>' attribute.
	 * @see #setRootUri(String)
	 * @see de.ubt.ai1.supermod.mm.file.client.SuperModFileClientPackage#getSingleVersionFileSystemDescriptor_RootUri()
	 * @model
	 * @generated
	 */
	String getRootUri();

	/**
	 * Sets the value of the '{@link de.ubt.ai1.supermod.mm.file.client.SingleVersionFileSystemDescriptor#getRootUri <em>Root Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root Uri</em>' attribute.
	 * @see #getRootUri()
	 * @generated
	 */
	void setRootUri(String value);

	/**
	 * Returns the value of the '<em><b>All Resources</b></em>' reference list.
	 * The list contents are of type {@link de.ubt.ai1.supermod.mm.file.client.SingleVersionResourceDescriptor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * The transitive closure over the contents of the root files.
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All Resources</em>' reference list.
	 * @see de.ubt.ai1.supermod.mm.file.client.SuperModFileClientPackage#getSingleVersionFileSystemDescriptor_AllResources()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<SingleVersionResourceDescriptor> getAllResources();

	/**
	 * <!-- begin-user-doc -->
	 * Returns a resource descriptor which is mapped by the specified path.
	 * @param 	path slash-separated path describing a resource to find.
	 * @return	corresponding resource descriptor, if any, or <code>null</code>.
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	SingleVersionResourceDescriptor getResource(String path);

	/**
	 * <!-- begin-user-doc -->
	 * Creates a file descriptor under the given path.
	 * @param	where to place the file descriptor; slash-separated.
	 * @return	the created file descriptor.
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	SingleVersionFileDescriptor createFile(String path);

	/**
	 * <!-- begin-user-doc -->
	 * Creates a folder descriptor under the given path.
	 * @param	where to place the folder descriptor; slash-separated.
	 * @return	the created folder descriptor.
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	SingleVersionFolderDescriptor createFolder(String path);

} // SingleVersionFileSystemDescriptor
