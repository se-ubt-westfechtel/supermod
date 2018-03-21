/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.mm.file;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Versioned Folder</b></em>'.
 * A folder is a versioned resource which may contain additional resources.
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
 *   <li>{@link de.ubt.ai1.supermod.mm.file.VersionedFolder#getContents <em>Contents</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.file.VersionedFolder#getAllContents <em>All Contents</em>}</li>
 * </ul>
 *
 * @see de.ubt.ai1.supermod.mm.file.SuperModFilePackage#getVersionedFolder()
 * @model
 * @generated
 */
public interface VersionedFolder extends VersionedResource {
	/**
	 * Returns the value of the '<em><b>Contents</b></em>' containment reference list.
	 * The list contents are of type {@link de.ubt.ai1.supermod.mm.file.VersionedResource}.
	 * It is bidirectional and its opposite is '{@link de.ubt.ai1.supermod.mm.file.VersionedResource#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * Resources which are directly contained in this folder.
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contents</em>' containment reference list.
	 * @see de.ubt.ai1.supermod.mm.file.SuperModFilePackage#getVersionedFolder_Contents()
	 * @see de.ubt.ai1.supermod.mm.file.VersionedResource#getContainer
	 * @model opposite="container" containment="true"
	 * @generated
	 */
	EList<VersionedResource> getContents();

	/**
	 * Returns the value of the '<em><b>All Contents</b></em>' reference list.
	 * The list contents are of type {@link de.ubt.ai1.supermod.mm.file.VersionedResource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * Resources which are transitively contained in this folder or a sub-folder thereof.
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All Contents</em>' reference list.
	 * @see de.ubt.ai1.supermod.mm.file.SuperModFilePackage#getVersionedFolder_AllContents()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<VersionedResource> getAllContents();

	/**
	 * <!-- begin-user-doc -->
	 * Finds one of the direct contents of this folder whose name corresponds
	 * to the specified argument.
	 * @param	name the resource name to look for.
	 * @return	the corresponding resource, or <code>null</code>.
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	VersionedResource getContent(String name);

} // VersionedFolder
