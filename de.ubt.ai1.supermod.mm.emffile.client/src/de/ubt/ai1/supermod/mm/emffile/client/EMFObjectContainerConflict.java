/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.mm.emffile.client;

import de.ubt.ai1.supermod.mm.client.ProductConflict;
import de.ubt.ai1.supermod.mm.emffile.EMFObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EMF Object Container Conflict</b></em>'.
 * This conflict is reported in case the number of containers of a specific EMF
 * object is greater than one.
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date 	2014-07-28
 * @see		EMFObject
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai1.supermod.mm.emffile.client.EMFObjectContainerConflict#getAffectedObject <em>Affected Object</em>}</li>
 * </ul>
 *
 * @see de.ubt.ai1.supermod.mm.emffile.client.SuperModEMFFileClientPackage#getEMFObjectContainerConflict()
 * @model
 * @generated
 */
public interface EMFObjectContainerConflict extends ProductConflict {
	/**
	 * Returns the value of the '<em><b>Affected Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * The object for which more than one container is defined.
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Affected Object</em>' reference.
	 * @see #setAffectedObject(EMFObject)
	 * @see de.ubt.ai1.supermod.mm.emffile.client.SuperModEMFFileClientPackage#getEMFObjectContainerConflict_AffectedObject()
	 * @model
	 * @generated
	 */
	EMFObject getAffectedObject();

	/**
	 * Sets the value of the '{@link de.ubt.ai1.supermod.mm.emffile.client.EMFObjectContainerConflict#getAffectedObject <em>Affected Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Affected Object</em>' reference.
	 * @see #getAffectedObject()
	 * @generated
	 */
	void setAffectedObject(EMFObject value);

} // EMFObjectContainerConflict
