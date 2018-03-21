/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.mm.emffile.client;

import de.ubt.ai1.supermod.mm.client.ProductConflict;
import de.ubt.ai1.supermod.mm.emffile.EMFFeatureRef;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EMF Single Feature Value Conflict</b></em>'.
 * A single-feature value conflict occurs in case there are multiple values
 * defined for a single-valued structural feature in an EMF model.
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date 	2014-07-28
 * @see		EMFFeatureRef
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai1.supermod.mm.emffile.client.EMFSingleFeatureValueConflict#getAffectedFeatureRef <em>Affected Feature Ref</em>}</li>
 * </ul>
 *
 * @see de.ubt.ai1.supermod.mm.emffile.client.SuperModEMFFileClientPackage#getEMFSingleFeatureValueConflict()
 * @model
 * @generated
 */
public interface EMFSingleFeatureValueConflict extends ProductConflict {
	/**
	 * Returns the value of the '<em><b>Affected Feature Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * The single-value feature reference for which more than one value is
	 * defined.
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Affected Feature Ref</em>' reference.
	 * @see #setAffectedFeatureRef(EMFFeatureRef)
	 * @see de.ubt.ai1.supermod.mm.emffile.client.SuperModEMFFileClientPackage#getEMFSingleFeatureValueConflict_AffectedFeatureRef()
	 * @model
	 * @generated
	 */
	EMFFeatureRef getAffectedFeatureRef();

	/**
	 * Sets the value of the '{@link de.ubt.ai1.supermod.mm.emffile.client.EMFSingleFeatureValueConflict#getAffectedFeatureRef <em>Affected Feature Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Affected Feature Ref</em>' reference.
	 * @see #getAffectedFeatureRef()
	 * @generated
	 */
	void setAffectedFeatureRef(EMFFeatureRef value);

} // EMFSingleFeatureValueConflict
