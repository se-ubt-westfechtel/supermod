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
 * A representation of the model object '<em><b>Versioned File Content</b></em>'.
 * Base class for specific file contents. Implemented by additional product
 * space meta-models which can be found in different plug-ins (e.g., plain text
 * or EMF)
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
 *   <li>{@link de.ubt.ai1.supermod.mm.file.VersionedFileContent#getFile <em>File</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.file.VersionedFileContent#getSuperExtension <em>Super Extension</em>}</li>
 * </ul>
 *
 * @see de.ubt.ai1.supermod.mm.file.SuperModFilePackage#getVersionedFileContent()
 * @model abstract="true"
 * @generated
 */
public interface VersionedFileContent extends ProductSpaceElement {

	/**
	 * Returns the value of the '<em><b>File</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link de.ubt.ai1.supermod.mm.file.VersionedFile#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * The file whose content is described by this instance.
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File</em>' reference.
	 * @see #setFile(VersionedFile)
	 * @see de.ubt.ai1.supermod.mm.file.SuperModFilePackage#getVersionedFileContent_File()
	 * @see de.ubt.ai1.supermod.mm.file.VersionedFile#getContent
	 * @model opposite="content"
	 * @generated
	 */
	VersionedFile getFile();

	/**
	 * Sets the value of the '{@link de.ubt.ai1.supermod.mm.file.VersionedFileContent#getFile <em>File</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File</em>' reference.
	 * @see #getFile()
	 * @generated
	 */
	void setFile(VersionedFile value);

	/**
	 * Returns the value of the '<em><b>Super Extension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * Each file content type may define a specific extension which is used in the
	 * superimposition representation in the meta-data area of the workspace, where
	 * the multi-version representation is stored.
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super Extension</em>' attribute.
	 * @see de.ubt.ai1.supermod.mm.file.SuperModFilePackage#getVersionedFileContent_SuperExtension()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getSuperExtension();
} // VersionedFileContent
