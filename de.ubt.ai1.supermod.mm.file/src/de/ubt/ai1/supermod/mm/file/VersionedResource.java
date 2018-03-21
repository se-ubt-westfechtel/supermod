/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.mm.file;

import de.ubt.ai1.supermod.mm.core.ProductSpaceElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Versioned Resource</b></em>'.
 * Base type for versioned files or folders. A resource is contained in a folder
 * or is the root of a file system. It has a unique name within its parent folder
 * (or root).
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date 	2014-07-28
 * @see		VersionedFile
 * @see		VersionedFolder
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai1.supermod.mm.file.VersionedResource#getName <em>Name</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.file.VersionedResource#getPath <em>Path</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.file.VersionedResource#getContainer <em>Container</em>}</li>
 * </ul>
 *
 * @see de.ubt.ai1.supermod.mm.file.SuperModFilePackage#getVersionedResource()
 * @model abstract="true"
 * @generated
 */
public interface VersionedResource extends ProductSpaceElement {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * The name of the current resource. Unique inside the parent folder
	 * (or file system, if root).
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.ubt.ai1.supermod.mm.file.SuperModFilePackage#getVersionedResource_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.ubt.ai1.supermod.mm.file.VersionedResource#getName <em>Name</em>}' attribute.
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
	 * The path of this resource, which is created by concatenation with its parent
	 * resource's path, using the slash as a separator.
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path</em>' attribute.
	 * @see de.ubt.ai1.supermod.mm.file.SuperModFilePackage#getVersionedResource_Path()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getPath();

	/**
	 * Returns the value of the '<em><b>Container</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.ubt.ai1.supermod.mm.file.VersionedFolder#getContents <em>Contents</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * The versioned folder that directly contains this resource, if it is not
	 * a root of the file system.
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container</em>' container reference.
	 * @see #setContainer(VersionedFolder)
	 * @see de.ubt.ai1.supermod.mm.file.SuperModFilePackage#getVersionedResource_Container()
	 * @see de.ubt.ai1.supermod.mm.file.VersionedFolder#getContents
	 * @model opposite="contents" transient="false"
	 * @generated
	 */
	VersionedFolder getContainer();

	/**
	 * Sets the value of the '{@link de.ubt.ai1.supermod.mm.file.VersionedResource#getContainer <em>Container</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container</em>' container reference.
	 * @see #getContainer()
	 * @generated
	 */
	void setContainer(VersionedFolder value);

} // VersionedResource
