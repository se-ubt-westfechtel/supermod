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
 * A representation of the model object '<em><b>EMF Link Compatibility Conflict</b></em>'.
 * This conflict occurs in case there is an internal reference that defines a link
 * to an object whose class is incompatible with the reference.
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date 	2014-07-28
 * @see		EMFInternalReferenceValue
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai1.supermod.mm.emffile.client.EMFLinkCompatibilityConflict#getIncompatibleLink <em>Incompatible Link</em>}</li>
 * </ul>
 *
 * @see de.ubt.ai1.supermod.mm.emffile.client.SuperModEMFFileClientPackage#getEMFLinkCompatibilityConflict()
 * @model
 * @generated
 */
public interface EMFLinkCompatibilityConflict extends ProductConflict {
	/**
	 * Returns the value of the '<em><b>Incompatible Link</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * The link that causes a type conflict.
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incompatible Link</em>' reference.
	 * @see #setIncompatibleLink(EMFInternalReferenceValue)
	 * @see de.ubt.ai1.supermod.mm.emffile.client.SuperModEMFFileClientPackage#getEMFLinkCompatibilityConflict_IncompatibleLink()
	 * @model
	 * @generated
	 */
	EMFInternalReferenceValue getIncompatibleLink();

	/**
	 * Sets the value of the '{@link de.ubt.ai1.supermod.mm.emffile.client.EMFLinkCompatibilityConflict#getIncompatibleLink <em>Incompatible Link</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Incompatible Link</em>' reference.
	 * @see #getIncompatibleLink()
	 * @generated
	 */
	void setIncompatibleLink(EMFInternalReferenceValue value);

} // EMFLinkCompatibilityConflict
