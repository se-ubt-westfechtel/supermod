/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.mm.emffile.client.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import de.ubt.ai1.supermod.mm.client.Severity;
import de.ubt.ai1.supermod.mm.client.impl.ProductConflictImpl;
import de.ubt.ai1.supermod.mm.core.ProductSpaceElement;
import de.ubt.ai1.supermod.mm.emffile.EMFFeatureRef;
import de.ubt.ai1.supermod.mm.emffile.client.EMFSingleFeatureValueConflict;
import de.ubt.ai1.supermod.mm.emffile.client.SuperModEMFFileClientPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EMF Single Feature Value Conflict</b></em>'.
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date 	2014-07-28
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai1.supermod.mm.emffile.client.impl.EMFSingleFeatureValueConflictImpl#getAffectedFeatureRef <em>Affected Feature Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EMFSingleFeatureValueConflictImpl extends ProductConflictImpl implements EMFSingleFeatureValueConflict {
	/**
	 * The cached value of the '{@link #getAffectedFeatureRef() <em>Affected Feature Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAffectedFeatureRef()
	 * @generated
	 * @ordered
	 */
	protected EMFFeatureRef affectedFeatureRef;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EMFSingleFeatureValueConflictImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SuperModEMFFileClientPackage.Literals.EMF_SINGLE_FEATURE_VALUE_CONFLICT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMFFeatureRef getAffectedFeatureRef() {
		if (affectedFeatureRef != null && affectedFeatureRef.eIsProxy()) {
			InternalEObject oldAffectedFeatureRef = (InternalEObject)affectedFeatureRef;
			affectedFeatureRef = (EMFFeatureRef)eResolveProxy(oldAffectedFeatureRef);
			if (affectedFeatureRef != oldAffectedFeatureRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SuperModEMFFileClientPackage.EMF_SINGLE_FEATURE_VALUE_CONFLICT__AFFECTED_FEATURE_REF, oldAffectedFeatureRef, affectedFeatureRef));
			}
		}
		return affectedFeatureRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMFFeatureRef basicGetAffectedFeatureRef() {
		return affectedFeatureRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAffectedFeatureRef(EMFFeatureRef newAffectedFeatureRef) {
		EMFFeatureRef oldAffectedFeatureRef = affectedFeatureRef;
		affectedFeatureRef = newAffectedFeatureRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SuperModEMFFileClientPackage.EMF_SINGLE_FEATURE_VALUE_CONFLICT__AFFECTED_FEATURE_REF, oldAffectedFeatureRef, affectedFeatureRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SuperModEMFFileClientPackage.EMF_SINGLE_FEATURE_VALUE_CONFLICT__AFFECTED_FEATURE_REF:
				if (resolve) return getAffectedFeatureRef();
				return basicGetAffectedFeatureRef();
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
			case SuperModEMFFileClientPackage.EMF_SINGLE_FEATURE_VALUE_CONFLICT__AFFECTED_FEATURE_REF:
				setAffectedFeatureRef((EMFFeatureRef)newValue);
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
			case SuperModEMFFileClientPackage.EMF_SINGLE_FEATURE_VALUE_CONFLICT__AFFECTED_FEATURE_REF:
				setAffectedFeatureRef((EMFFeatureRef)null);
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
			case SuperModEMFFileClientPackage.EMF_SINGLE_FEATURE_VALUE_CONFLICT__AFFECTED_FEATURE_REF:
				return affectedFeatureRef != null;
		}
		return super.eIsSet(featureID);
	}
	
	@Override
	public EList<ProductSpaceElement> getAffectedProductSpaceElements() {
		return ECollections.singletonEList(getAffectedFeatureRef());
	}

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.mm.client.impl.ProductConflictImpl#getSeverity()
	 */
	@Override
	public Severity getSeverity() {
		return Severity.ERROR;
	}


} //EMFSingleFeatureValueConflictImpl
