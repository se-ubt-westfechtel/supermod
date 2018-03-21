/******************************************************************************
 * Copyright (c) 2018 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.mm.feature.client.impl;

import de.ubt.ai1.supermod.mm.client.Severity;
import de.ubt.ai1.supermod.mm.client.impl.ProductConflictImpl;
import de.ubt.ai1.supermod.mm.core.ProductSpaceElement;
import de.ubt.ai1.supermod.mm.feature.Feature;

import de.ubt.ai1.supermod.mm.feature.client.RemoteGroupMembershipConflict;
import de.ubt.ai1.supermod.mm.feature.client.SuperModFeatureClientPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Remote Group Membership Conflict</b></em>'.
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>,
 * 			Johannes Schroepfer <Johannes.M.Schroepfer(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	2018-01-09
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai1.supermod.mm.feature.client.impl.RemoteGroupMembershipConflictImpl#getContextFeature <em>Context Feature</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RemoteGroupMembershipConflictImpl extends ProductConflictImpl implements RemoteGroupMembershipConflict {
	/**
	 * The cached value of the '{@link #getContextFeature() <em>Context Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContextFeature()
	 * @generated
	 * @ordered
	 */
	protected Feature contextFeature;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RemoteGroupMembershipConflictImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SuperModFeatureClientPackage.Literals.REMOTE_GROUP_MEMBERSHIP_CONFLICT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature getContextFeature() {
		if (contextFeature != null && contextFeature.eIsProxy()) {
			InternalEObject oldContextFeature = (InternalEObject)contextFeature;
			contextFeature = (Feature)eResolveProxy(oldContextFeature);
			if (contextFeature != oldContextFeature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SuperModFeatureClientPackage.REMOTE_GROUP_MEMBERSHIP_CONFLICT__CONTEXT_FEATURE, oldContextFeature, contextFeature));
			}
		}
		return contextFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature basicGetContextFeature() {
		return contextFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContextFeature(Feature newContextFeature) {
		Feature oldContextFeature = contextFeature;
		contextFeature = newContextFeature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SuperModFeatureClientPackage.REMOTE_GROUP_MEMBERSHIP_CONFLICT__CONTEXT_FEATURE, oldContextFeature, contextFeature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SuperModFeatureClientPackage.REMOTE_GROUP_MEMBERSHIP_CONFLICT__CONTEXT_FEATURE:
				if (resolve) return getContextFeature();
				return basicGetContextFeature();
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
			case SuperModFeatureClientPackage.REMOTE_GROUP_MEMBERSHIP_CONFLICT__CONTEXT_FEATURE:
				setContextFeature((Feature)newValue);
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
			case SuperModFeatureClientPackage.REMOTE_GROUP_MEMBERSHIP_CONFLICT__CONTEXT_FEATURE:
				setContextFeature((Feature)null);
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
			case SuperModFeatureClientPackage.REMOTE_GROUP_MEMBERSHIP_CONFLICT__CONTEXT_FEATURE:
				return contextFeature != null;
		}
		return super.eIsSet(featureID);
	}

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.mm.client.impl.ProductConflictImpl#getAffectedProductSpaceElements()
	 */
	@Override
	public EList<ProductSpaceElement> getAffectedProductSpaceElements() {
		return ECollections.singletonEList(getContextFeature());
	}

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.mm.client.impl.ProductConflictImpl#getSeverity()
	 */
	@Override
	public Severity getSeverity() {
		return Severity.ERROR;
	}

} //RemoteGroupMembershipConflictImpl
