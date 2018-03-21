/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.mm.file;

import org.eclipse.emf.common.util.EList;

import de.ubt.ai1.supermod.mm.core.ProductDimension;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Versioned File System</b></em>'.
 * A versioned file system is a tree of resources, where files may only be
 * leaves, and folders may be both inner nodes and leaves. Each member of the
 * file system is a versioned product space element itself. The versioned file
 * system is a dimension inside a SuperMod product space.
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date 	2014-07-28
 * @see		ProductDimension
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai1.supermod.mm.file.VersionedFileSystem#getRoots <em>Roots</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.file.VersionedFileSystem#getAllResources <em>All Resources</em>}</li>
 * </ul>
 *
 * @see de.ubt.ai1.supermod.mm.file.SuperModFilePackage#getVersionedFileSystem()
 * @model
 * @generated
 */
public interface VersionedFileSystem extends ProductDimension {
	/**
	 * Returns the value of the '<em><b>Roots</b></em>' containment reference list.
	 * The list contents are of type {@link de.ubt.ai1.supermod.mm.file.VersionedResource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * Files or folders which are located in the root of the file system.
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roots</em>' containment reference list.
	 * @see de.ubt.ai1.supermod.mm.file.SuperModFilePackage#getVersionedFileSystem_Roots()
	 * @model containment="true"
	 * @generated
	 */
	EList<VersionedResource> getRoots();

	/**
	 * Returns the value of the '<em><b>All Resources</b></em>' reference list.
	 * The list contents are of type {@link de.ubt.ai1.supermod.mm.file.VersionedResource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * All files or folders which are located in the file system.
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All Resources</em>' reference list.
	 * @see de.ubt.ai1.supermod.mm.file.SuperModFilePackage#getVersionedFileSystem_AllResources()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<VersionedResource> getAllResources();

	/**
	 * <!-- begin-user-doc -->
	 * Finds a resource whose path matches the specified path inside this
	 * file system.
	 * @param	path the path to match, slash-separated.
	 * @return	a resource that matches this path, if any, or <code>null</code>.
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	VersionedResource getResource(String path);

	/**
	 * <!-- begin-user-doc -->
	 * Creates a file at the specified path and returns it.
	 * If some path segments do not exist, corresponding folders are created.
	 * @param	path the path where the file shall be created, slash-separated.
	 * @return	An empty file with no content, located at the specified path.
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	VersionedFile createFile(String path);

	/**
	 * <!-- begin-user-doc -->
	 * Creates a folder at the specified path and returns it.
	 * If some path segments do not exist, corresponding folders are created.
	 * @param	path the path where the folder shall be created, slash-separated.
	 * @return	An empty folder, located at the specified path.
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	VersionedFolder createFolder(String path);

} // VersionedFileSystem
