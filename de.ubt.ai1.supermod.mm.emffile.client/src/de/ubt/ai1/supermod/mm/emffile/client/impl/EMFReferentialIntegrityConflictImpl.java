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
import de.ubt.ai1.supermod.mm.emffile.EMFInternalReferenceValue;
import de.ubt.ai1.supermod.mm.emffile.client.EMFReferentialIntegrityConflict;
import de.ubt.ai1.supermod.mm.emffile.client.SuperModEMFFileClientPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EMF Referential Integrity Conflict</b></em>'.
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date 	2014-07-28
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai1.supermod.mm.emffile.client.impl.EMFReferentialIntegrityConflictImpl#getAffectedObjectRef <em>Affected Object Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EMFReferentialIntegrityConflictImpl extends ProductConflictImpl implements EMFReferentialIntegrityConflict {
	/**
	 * The cached value of the '{@link #getAffectedObjectRef() <em>Affected Object Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAffectedObjectRef()
	 * @generated
	 * @ordered
	 */
	protected EMFInternalReferenceValue affectedObjectRef;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EMFReferentialIntegrityConflictImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SuperModEMFFileClientPackage.Literals.EMF_REFERENTIAL_INTEGRITY_CONFLICT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMFInternalReferenceValue getAffectedObjectRef() {
		if (affectedObjectRef != null && affectedObjectRef.eIsProxy()) {
			InternalEObject oldAffectedObjectRef = (InternalEObject)affectedObjectRef;
			affectedObjectRef = (EMFInternalReferenceValue)eResolveProxy(oldAffectedObjectRef);
			if (affectedObjectRef != oldAffectedObjectRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SuperModEMFFileClientPackage.EMF_REFERENTIAL_INTEGRITY_CONFLICT__AFFECTED_OBJECT_REF, oldAffectedObjectRef, affectedObjectRef));
			}
		}
		return affectedObjectRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMFInternalReferenceValue basicGetAffectedObjectRef() {
		return affectedObjectRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAffectedObjectRef(EMFInternalReferenceValue newAffectedObjectRef) {
		EMFInternalReferenceValue oldAffectedObjectRef = affectedObjectRef;
		affectedObjectRef = newAffectedObjectRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SuperModEMFFileClientPackage.EMF_REFERENTIAL_INTEGRITY_CONFLICT__AFFECTED_OBJECT_REF, oldAffectedObjectRef, affectedObjectRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SuperModEMFFileClientPackage.EMF_REFERENTIAL_INTEGRITY_CONFLICT__AFFECTED_OBJECT_REF:
				if (resolve) return getAffectedObjectRef();
				return basicGetAffectedObjectRef();
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
			case SuperModEMFFileClientPackage.EMF_REFERENTIAL_INTEGRITY_CONFLICT__AFFECTED_OBJECT_REF:
				setAffectedObjectRef((EMFInternalReferenceValue)newValue);
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
			case SuperModEMFFileClientPackage.EMF_REFERENTIAL_INTEGRITY_CONFLICT__AFFECTED_OBJECT_REF:
				setAffectedObjectRef((EMFInternalReferenceValue)null);
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
			case SuperModEMFFileClientPackage.EMF_REFERENTIAL_INTEGRITY_CONFLICT__AFFECTED_OBJECT_REF:
				return affectedObjectRef != null;
		}
		return super.eIsSet(featureID);
	}

	@Override
	public EList<ProductSpaceElement> getAffectedProductSpaceElements() {
		return ECollections.singletonEList(getAffectedObjectRef());
	}
	
	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.mm.client.impl.ConflictImpl#getSeverity()
	 */
	@Override
	public Severity getSeverity() {
		return Severity.WARNING;
	}

} //EMFReferentialIntegrityConflictImpl
