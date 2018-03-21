/**
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package de.ubt.ai1.supermod.mm.file.client;

import de.ubt.ai1.supermod.mm.file.VersionedFile;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Versioned File Export Trace</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai1.supermod.mm.file.client.VersionedFileExportTrace#getVersionedFile <em>Versioned File</em>}</li>
 * </ul>
 *
 * @see de.ubt.ai1.supermod.mm.file.client.SuperModFileClientPackage#getVersionedFileExportTrace()
 * @model abstract="true"
 * @generated
 */
public interface VersionedFileExportTrace extends EObject {
	/**
	 * Returns the value of the '<em><b>Versioned File</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Versioned File</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Versioned File</em>' reference.
	 * @see #setVersionedFile(VersionedFile)
	 * @see de.ubt.ai1.supermod.mm.file.client.SuperModFileClientPackage#getVersionedFileExportTrace_VersionedFile()
	 * @model
	 * @generated
	 */
	VersionedFile getVersionedFile();

	/**
	 * Sets the value of the '{@link de.ubt.ai1.supermod.mm.file.client.VersionedFileExportTrace#getVersionedFile <em>Versioned File</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Versioned File</em>' reference.
	 * @see #getVersionedFile()
	 * @generated
	 */
	void setVersionedFile(VersionedFile value);

} // VersionedFileExportTrace
