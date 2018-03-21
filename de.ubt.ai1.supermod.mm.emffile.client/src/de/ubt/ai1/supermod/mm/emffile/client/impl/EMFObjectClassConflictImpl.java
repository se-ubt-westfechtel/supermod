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
import de.ubt.ai1.supermod.mm.emffile.EMFObject;
import de.ubt.ai1.supermod.mm.emffile.client.EMFObjectClassConflict;
import de.ubt.ai1.supermod.mm.emffile.client.SuperModEMFFileClientPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EMF Object Class Conflict</b></em>'.
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date 	2014-07-28
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai1.supermod.mm.emffile.client.impl.EMFObjectClassConflictImpl#getAffectedObject <em>Affected Object</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EMFObjectClassConflictImpl extends ProductConflictImpl implements EMFObjectClassConflict {
	/**
	 * The cached value of the '{@link #getAffectedObject() <em>Affected Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAffectedObject()
	 * @generated
	 * @ordered
	 */
	protected EMFObject affectedObject;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EMFObjectClassConflictImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SuperModEMFFileClientPackage.Literals.EMF_OBJECT_CLASS_CONFLICT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMFObject getAffectedObject() {
		if (affectedObject != null && affectedObject.eIsProxy()) {
			InternalEObject oldAffectedObject = (InternalEObject)affectedObject;
			affectedObject = (EMFObject)eResolveProxy(oldAffectedObject);
			if (affectedObject != oldAffectedObject) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SuperModEMFFileClientPackage.EMF_OBJECT_CLASS_CONFLICT__AFFECTED_OBJECT, oldAffectedObject, affectedObject));
			}
		}
		return affectedObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMFObject basicGetAffectedObject() {
		return affectedObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAffectedObject(EMFObject newAffectedObject) {
		EMFObject oldAffectedObject = affectedObject;
		affectedObject = newAffectedObject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SuperModEMFFileClientPackage.EMF_OBJECT_CLASS_CONFLICT__AFFECTED_OBJECT, oldAffectedObject, affectedObject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SuperModEMFFileClientPackage.EMF_OBJECT_CLASS_CONFLICT__AFFECTED_OBJECT:
				if (resolve) return getAffectedObject();
				return basicGetAffectedObject();
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
			case SuperModEMFFileClientPackage.EMF_OBJECT_CLASS_CONFLICT__AFFECTED_OBJECT:
				setAffectedObject((EMFObject)newValue);
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
			case SuperModEMFFileClientPackage.EMF_OBJECT_CLASS_CONFLICT__AFFECTED_OBJECT:
				setAffectedObject((EMFObject)null);
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
			case SuperModEMFFileClientPackage.EMF_OBJECT_CLASS_CONFLICT__AFFECTED_OBJECT:
				return affectedObject != null;
		}
		return super.eIsSet(featureID);
	}
	
	@Override
	public EList<ProductSpaceElement> getAffectedProductSpaceElements() {
		return ECollections.singletonEList(getAffectedObject());
	}

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.mm.client.impl.ProductConflictImpl#getSeverity()
	 */
	@Override
	public Severity getSeverity() {
		return Severity.ERROR;
	}


} //EMFObjectClassConflictImpl
