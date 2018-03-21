/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.mm.emffile.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import de.ubt.ai1.supermod.mm.emffile.EMFExternalReferenceValue;
import de.ubt.ai1.supermod.mm.emffile.SuperModEMFFilePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EMF External Reference Value</b></em>'.
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date 	2014-07-28
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai1.supermod.mm.emffile.impl.EMFExternalReferenceValueImpl#getEObjectUri <em>EObject Uri</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EMFExternalReferenceValueImpl extends EMFValueImpl implements EMFExternalReferenceValue {
	/**
	 * The default value of the '{@link #getEObjectUri() <em>EObject Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEObjectUri()
	 * @generated
	 * @ordered
	 */
	protected static final String EOBJECT_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEObjectUri() <em>EObject Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEObjectUri()
	 * @generated
	 * @ordered
	 */
	protected String eObjectUri = EOBJECT_URI_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EMFExternalReferenceValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SuperModEMFFilePackage.Literals.EMF_EXTERNAL_REFERENCE_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEObjectUri() {
		return eObjectUri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEObjectUri(String newEObjectUri) {
		String oldEObjectUri = eObjectUri;
		eObjectUri = newEObjectUri;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SuperModEMFFilePackage.EMF_EXTERNAL_REFERENCE_VALUE__EOBJECT_URI, oldEObjectUri, eObjectUri));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SuperModEMFFilePackage.EMF_EXTERNAL_REFERENCE_VALUE__EOBJECT_URI:
				return getEObjectUri();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SuperModEMFFilePackage.EMF_EXTERNAL_REFERENCE_VALUE__EOBJECT_URI:
				setEObjectUri((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SuperModEMFFilePackage.EMF_EXTERNAL_REFERENCE_VALUE__EOBJECT_URI:
				setEObjectUri(EOBJECT_URI_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SuperModEMFFilePackage.EMF_EXTERNAL_REFERENCE_VALUE__EOBJECT_URI:
				return EOBJECT_URI_EDEFAULT == null ? eObjectUri != null : !EOBJECT_URI_EDEFAULT.equals(eObjectUri);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (eObjectUri: ");
		result.append(eObjectUri);
		result.append(')');
		return result.toString();
	}

} //EMFExternalReferenceValueImpl
