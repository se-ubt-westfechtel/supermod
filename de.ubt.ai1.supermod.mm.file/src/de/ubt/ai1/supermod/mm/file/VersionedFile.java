/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.mm.file;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Versioned File</b></em>'.
 * A versioned file is a leaf in the file system tree. Its content depends on the
 * specific content type (e.g., plain text or EMF).
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
 *   <li>{@link de.ubt.ai1.supermod.mm.file.VersionedFile#getContentType <em>Content Type</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.file.VersionedFile#getContent <em>Content</em>}</li>
 * </ul>
 *
 * @see de.ubt.ai1.supermod.mm.file.SuperModFilePackage#getVersionedFile()
 * @model
 * @generated
 */
public interface VersionedFile extends VersionedResource {
	/**
	 * Returns the value of the '<em><b>Content Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Type</em>' attribute.
	 * @see #setContentType(String)
	 * @see de.ubt.ai1.supermod.mm.file.SuperModFilePackage#getVersionedFile_ContentType()
	 * @model
	 * @generated
	 */
	String getContentType();

	/**
	 * Sets the value of the '{@link de.ubt.ai1.supermod.mm.file.VersionedFile#getContentType <em>Content Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Type</em>' attribute.
	 * @see #getContentType()
	 * @generated
	 */
	void setContentType(String value);

	/**
	 * Returns the value of the '<em><b>Content</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link de.ubt.ai1.supermod.mm.file.VersionedFileContent#getFile <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * The content of the versioned file in its content-specific representation.
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' reference.
	 * @see #setContent(VersionedFileContent)
	 * @see de.ubt.ai1.supermod.mm.file.SuperModFilePackage#getVersionedFile_Content()
	 * @see de.ubt.ai1.supermod.mm.file.VersionedFileContent#getFile
	 * @model opposite="file"
	 * @generated
	 */
	VersionedFileContent getContent();

	/**
	 * Sets the value of the '{@link de.ubt.ai1.supermod.mm.file.VersionedFile#getContent <em>Content</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content</em>' reference.
	 * @see #getContent()
	 * @generated
	 */
	void setContent(VersionedFileContent value);

} // VersionedFile
