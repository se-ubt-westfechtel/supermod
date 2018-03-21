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
import de.ubt.ai1.supermod.mm.emffile.client.EMFLinkCompatibilityConflict;
import de.ubt.ai1.supermod.mm.emffile.client.SuperModEMFFileClientPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EMF Link Compatibility Conflict</b></em>'.
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date 	2014-07-28
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai1.supermod.mm.emffile.client.impl.EMFLinkCompatibilityConflictImpl#getIncompatibleLink <em>Incompatible Link</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EMFLinkCompatibilityConflictImpl extends ProductConflictImpl implements EMFLinkCompatibilityConflict {
	/**
	 * The cached value of the '{@link #getIncompatibleLink() <em>Incompatible Link</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncompatibleLink()
	 * @generated
	 * @ordered
	 */
	protected EMFInternalReferenceValue incompatibleLink;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EMFLinkCompatibilityConflictImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SuperModEMFFileClientPackage.Literals.EMF_LINK_COMPATIBILITY_CONFLICT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMFInternalReferenceValue getIncompatibleLink() {
		if (incompatibleLink != null && incompatibleLink.eIsProxy()) {
			InternalEObject oldIncompatibleLink = (InternalEObject)incompatibleLink;
			incompatibleLink = (EMFInternalReferenceValue)eResolveProxy(oldIncompatibleLink);
			if (incompatibleLink != oldIncompatibleLink) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SuperModEMFFileClientPackage.EMF_LINK_COMPATIBILITY_CONFLICT__INCOMPATIBLE_LINK, oldIncompatibleLink, incompatibleLink));
			}
		}
		return incompatibleLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMFInternalReferenceValue basicGetIncompatibleLink() {
		return incompatibleLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIncompatibleLink(EMFInternalReferenceValue newIncompatibleLink) {
		EMFInternalReferenceValue oldIncompatibleLink = incompatibleLink;
		incompatibleLink = newIncompatibleLink;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SuperModEMFFileClientPackage.EMF_LINK_COMPATIBILITY_CONFLICT__INCOMPATIBLE_LINK, oldIncompatibleLink, incompatibleLink));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SuperModEMFFileClientPackage.EMF_LINK_COMPATIBILITY_CONFLICT__INCOMPATIBLE_LINK:
				if (resolve) return getIncompatibleLink();
				return basicGetIncompatibleLink();
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
			case SuperModEMFFileClientPackage.EMF_LINK_COMPATIBILITY_CONFLICT__INCOMPATIBLE_LINK:
				setIncompatibleLink((EMFInternalReferenceValue)newValue);
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
			case SuperModEMFFileClientPackage.EMF_LINK_COMPATIBILITY_CONFLICT__INCOMPATIBLE_LINK:
				setIncompatibleLink((EMFInternalReferenceValue)null);
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
			case SuperModEMFFileClientPackage.EMF_LINK_COMPATIBILITY_CONFLICT__INCOMPATIBLE_LINK:
				return incompatibleLink != null;
		}
		return super.eIsSet(featureID);
	}
	
	@Override
	public EList<ProductSpaceElement> getAffectedProductSpaceElements() {
		return ECollections.singletonEList(getIncompatibleLink());
	}

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.mm.client.impl.ProductConflictImpl#getSeverity()
	 */
	@Override
	public Severity getSeverity() {
		return Severity.ERROR;
	}


} //EMFLinkCompatibilityConflictImpl
