/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.mm.emffile.client;

import de.ubt.ai1.supermod.mm.client.ProductConflict;
import de.ubt.ai1.supermod.mm.emffile.EMFExternalReferenceValue;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EMF Object Definition Conflict</b></em>'.
 * An object definition conflict denotes that an external EMF reference cannot
 * be resolved in the local workspace.
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date 	2014-07-28
 * @see		EMFExternalReferenceValue
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai1.supermod.mm.emffile.client.EMFObjectDefinitionConflict#getAffectedObjectRef <em>Affected Object Ref</em>}</li>
 * </ul>
 *
 * @see de.ubt.ai1.supermod.mm.emffile.client.SuperModEMFFileClientPackage#getEMFObjectDefinitionConflict()
 * @model
 * @generated
 */
public interface EMFObjectDefinitionConflict extends ProductConflict {
	/**
	 * Returns the value of the '<em><b>Affected Object Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * The external EMF object reference whose object URI cannot be resolved to
	 * an object in the local workspace.
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Affected Object Ref</em>' reference.
	 * @see #setAffectedObjectRef(EMFExternalReferenceValue)
	 * @see de.ubt.ai1.supermod.mm.emffile.client.SuperModEMFFileClientPackage#getEMFObjectDefinitionConflict_AffectedObjectRef()
	 * @model
	 * @generated
	 */
	EMFExternalReferenceValue getAffectedObjectRef();

	/**
	 * Sets the value of the '{@link de.ubt.ai1.supermod.mm.emffile.client.EMFObjectDefinitionConflict#getAffectedObjectRef <em>Affected Object Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Affected Object Ref</em>' reference.
	 * @see #getAffectedObjectRef()
	 * @generated
	 */
	void setAffectedObjectRef(EMFExternalReferenceValue value);

} // EMFObjectDefinitionConflict
