/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.mm.emffile.client;

import de.ubt.ai1.supermod.mm.client.ProductConflict;
import de.ubt.ai1.supermod.mm.emffile.EMFInternalReferenceValue;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EMF Referential Integrity Conflict</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai1.supermod.mm.emffile.client.EMFReferentialIntegrityConflict#getAffectedObjectRef <em>Affected Object Ref</em>}</li>
 * </ul>
 *
 * @see de.ubt.ai1.supermod.mm.emffile.client.SuperModEMFFileClientPackage#getEMFReferentialIntegrityConflict()
 * @model
 * @generated
 */
public interface EMFReferentialIntegrityConflict extends ProductConflict {
	/**
	 * Returns the value of the '<em><b>Affected Object Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Affected Object Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Affected Object Ref</em>' reference.
	 * @see #setAffectedObjectRef(EMFInternalReferenceValue)
	 * @see de.ubt.ai1.supermod.mm.emffile.client.SuperModEMFFileClientPackage#getEMFReferentialIntegrityConflict_AffectedObjectRef()
	 * @model
	 * @generated
	 */
	EMFInternalReferenceValue getAffectedObjectRef();

	/**
	 * Sets the value of the '{@link de.ubt.ai1.supermod.mm.emffile.client.EMFReferentialIntegrityConflict#getAffectedObjectRef <em>Affected Object Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Affected Object Ref</em>' reference.
	 * @see #getAffectedObjectRef()
	 * @generated
	 */
	void setAffectedObjectRef(EMFInternalReferenceValue value);

} // EMFReferentialIntegrityConflict
