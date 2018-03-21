/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.mm.emffile;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EMF External Reference Value</b></em>'.
 * Refers to an external, unversioned EMF object as the value of a structural feature
 * (reference) within the multi-variant EMF representation. The reference is initialized
 * lazily by permanently storing only a workspace-global EObject URI.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai1.supermod.mm.emffile.EMFExternalReferenceValue#getEObjectUri <em>EObject Uri</em>}</li>
 * </ul>
 *
 * @see de.ubt.ai1.supermod.mm.emffile.SuperModEMFFilePackage#getEMFExternalReferenceValue()
 * @model
 * @generated
 */
public interface EMFExternalReferenceValue extends EMFValue {
	/**
	 * Returns the value of the '<em><b>EObject Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * A workspace-global EObject URI which uniquely describes the referenced element.
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EObject Uri</em>' attribute.
	 * @see #setEObjectUri(String)
	 * @see de.ubt.ai1.supermod.mm.emffile.SuperModEMFFilePackage#getEMFExternalReferenceValue_EObjectUri()
	 * @model
	 * @generated
	 */
	String getEObjectUri();

	/**
	 * Sets the value of the '{@link de.ubt.ai1.supermod.mm.emffile.EMFExternalReferenceValue#getEObjectUri <em>EObject Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EObject Uri</em>' attribute.
	 * @see #getEObjectUri()
	 * @generated
	 */
	void setEObjectUri(String value);

} // EMFExternalReferenceValue
