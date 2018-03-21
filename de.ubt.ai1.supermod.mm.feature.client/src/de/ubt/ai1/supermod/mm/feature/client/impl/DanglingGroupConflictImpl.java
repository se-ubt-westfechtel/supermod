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
import de.ubt.ai1.supermod.mm.feature.FeatureGroup;

import de.ubt.ai1.supermod.mm.feature.client.DanglingGroupConflict;
import de.ubt.ai1.supermod.mm.feature.client.SuperModFeatureClientPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dangling Group Conflict</b></em>'.
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
 *   <li>{@link de.ubt.ai1.supermod.mm.feature.client.impl.DanglingGroupConflictImpl#getContextGroup <em>Context Group</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DanglingGroupConflictImpl extends ProductConflictImpl implements DanglingGroupConflict {
	/**
	 * The cached value of the '{@link #getContextGroup() <em>Context Group</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContextGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureGroup contextGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DanglingGroupConflictImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SuperModFeatureClientPackage.Literals.DANGLING_GROUP_CONFLICT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureGroup getContextGroup() {
		if (contextGroup != null && contextGroup.eIsProxy()) {
			InternalEObject oldContextGroup = (InternalEObject)contextGroup;
			contextGroup = (FeatureGroup)eResolveProxy(oldContextGroup);
			if (contextGroup != oldContextGroup) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SuperModFeatureClientPackage.DANGLING_GROUP_CONFLICT__CONTEXT_GROUP, oldContextGroup, contextGroup));
			}
		}
		return contextGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureGroup basicGetContextGroup() {
		return contextGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContextGroup(FeatureGroup newContextGroup) {
		FeatureGroup oldContextGroup = contextGroup;
		contextGroup = newContextGroup;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SuperModFeatureClientPackage.DANGLING_GROUP_CONFLICT__CONTEXT_GROUP, oldContextGroup, contextGroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SuperModFeatureClientPackage.DANGLING_GROUP_CONFLICT__CONTEXT_GROUP:
				if (resolve) return getContextGroup();
				return basicGetContextGroup();
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
			case SuperModFeatureClientPackage.DANGLING_GROUP_CONFLICT__CONTEXT_GROUP:
				setContextGroup((FeatureGroup)newValue);
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
			case SuperModFeatureClientPackage.DANGLING_GROUP_CONFLICT__CONTEXT_GROUP:
				setContextGroup((FeatureGroup)null);
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
			case SuperModFeatureClientPackage.DANGLING_GROUP_CONFLICT__CONTEXT_GROUP:
				return contextGroup != null;
		}
		return super.eIsSet(featureID);
	}

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.mm.client.impl.ProductConflictImpl#getAffectedProductSpaceElements()
	 */
	@Override
	public EList<ProductSpaceElement> getAffectedProductSpaceElements() {
		return ECollections.singletonEList(getContextGroup());
	}

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.mm.client.impl.ProductConflictImpl#getSeverity()
	 */
	@Override
	public Severity getSeverity() {
		return Severity.ERROR;
	}

} //DanglingGroupConflictImpl
