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
import de.ubt.ai1.supermod.mm.emffile.EMFClassRef;
import de.ubt.ai1.supermod.mm.emffile.client.EMFClassDefinitionConflict;
import de.ubt.ai1.supermod.mm.emffile.client.SuperModEMFFileClientPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EMF Class Definition Conflict</b></em>'.
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date 	2014-07-28
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai1.supermod.mm.emffile.client.impl.EMFClassDefinitionConflictImpl#getAffectedClassRef <em>Affected Class Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EMFClassDefinitionConflictImpl extends ProductConflictImpl implements EMFClassDefinitionConflict {
	/**
	 * The cached value of the '{@link #getAffectedClassRef() <em>Affected Class Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAffectedClassRef()
	 * @generated
	 * @ordered
	 */
	protected EMFClassRef affectedClassRef;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EMFClassDefinitionConflictImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SuperModEMFFileClientPackage.Literals.EMF_CLASS_DEFINITION_CONFLICT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMFClassRef getAffectedClassRef() {
		if (affectedClassRef != null && affectedClassRef.eIsProxy()) {
			InternalEObject oldAffectedClassRef = (InternalEObject)affectedClassRef;
			affectedClassRef = (EMFClassRef)eResolveProxy(oldAffectedClassRef);
			if (affectedClassRef != oldAffectedClassRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SuperModEMFFileClientPackage.EMF_CLASS_DEFINITION_CONFLICT__AFFECTED_CLASS_REF, oldAffectedClassRef, affectedClassRef));
			}
		}
		return affectedClassRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMFClassRef basicGetAffectedClassRef() {
		return affectedClassRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAffectedClassRef(EMFClassRef newAffectedClassRef) {
		EMFClassRef oldAffectedClassRef = affectedClassRef;
		affectedClassRef = newAffectedClassRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SuperModEMFFileClientPackage.EMF_CLASS_DEFINITION_CONFLICT__AFFECTED_CLASS_REF, oldAffectedClassRef, affectedClassRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SuperModEMFFileClientPackage.EMF_CLASS_DEFINITION_CONFLICT__AFFECTED_CLASS_REF:
				if (resolve) return getAffectedClassRef();
				return basicGetAffectedClassRef();
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
			case SuperModEMFFileClientPackage.EMF_CLASS_DEFINITION_CONFLICT__AFFECTED_CLASS_REF:
				setAffectedClassRef((EMFClassRef)newValue);
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
			case SuperModEMFFileClientPackage.EMF_CLASS_DEFINITION_CONFLICT__AFFECTED_CLASS_REF:
				setAffectedClassRef((EMFClassRef)null);
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
			case SuperModEMFFileClientPackage.EMF_CLASS_DEFINITION_CONFLICT__AFFECTED_CLASS_REF:
				return affectedClassRef != null;
		}
		return super.eIsSet(featureID);
	}

	@Override
	public EList<ProductSpaceElement> getAffectedProductSpaceElements() {
		return ECollections.singletonEList(getAffectedClassRef());
	}

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.mm.client.impl.ProductConflictImpl#getSeverity()
	 */
	@Override
	public Severity getSeverity() {
		return Severity.ERROR;
	}

} //EMFClassDefinitionConflictImpl
