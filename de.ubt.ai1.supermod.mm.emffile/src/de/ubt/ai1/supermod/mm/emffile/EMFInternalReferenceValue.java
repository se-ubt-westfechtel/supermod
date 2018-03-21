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
 * A representation of the model object '<em><b>EMF Internal Reference Value</b></em>'.
 * Value of a structural feature which denotes the applied occurrence of an object
 * part of the same product space. The reference is realized by a link to the
 * corresponding EMF object.
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
 *   <li>{@link de.ubt.ai1.supermod.mm.emffile.EMFInternalReferenceValue#getReferencedObject <em>Referenced Object</em>}</li>
 * </ul>
 *
 * @see de.ubt.ai1.supermod.mm.emffile.SuperModEMFFilePackage#getEMFInternalReferenceValue()
 * @model
 * @generated
 */
public interface EMFInternalReferenceValue extends EMFValue {
	/**
	 * Returns the value of the '<em><b>Referenced Object</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link de.ubt.ai1.supermod.mm.emffile.EMFObject#getTargetingRefVals <em>Targeting Ref Vals</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * The EMF object whose applied occurrence appears as a structural feature value.
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced Object</em>' reference.
	 * @see #setReferencedObject(EMFObject)
	 * @see de.ubt.ai1.supermod.mm.emffile.SuperModEMFFilePackage#getEMFInternalReferenceValue_ReferencedObject()
	 * @see de.ubt.ai1.supermod.mm.emffile.EMFObject#getTargetingRefVals
	 * @model opposite="targetingRefVals"
	 * @generated
	 */
	EMFObject getReferencedObject();

	/**
	 * Sets the value of the '{@link de.ubt.ai1.supermod.mm.emffile.EMFInternalReferenceValue#getReferencedObject <em>Referenced Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referenced Object</em>' reference.
	 * @see #getReferencedObject()
	 * @generated
	 */
	void setReferencedObject(EMFObject value);

} // EMFInternalReferenceValue
