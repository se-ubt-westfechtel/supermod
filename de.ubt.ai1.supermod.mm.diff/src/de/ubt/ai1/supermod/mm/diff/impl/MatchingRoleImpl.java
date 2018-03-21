/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.mm.diff.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import de.ubt.ai1.supermod.mm.core.ProductSpace;
import de.ubt.ai1.supermod.mm.diff.MatchingRole;
import de.ubt.ai1.supermod.mm.diff.SuperModDiffPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Matching Role</b></em>'.
 * @author Felix Schwaegerl
 * @version	0.1.0
 * @since	0.1.0
 * @date 	2014-07-25
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai1.supermod.mm.diff.impl.MatchingRoleImpl#getRoleName <em>Role Name</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.diff.impl.MatchingRoleImpl#getMatchedProductSpace <em>Matched Product Space</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MatchingRoleImpl extends MinimalEObjectImpl.Container implements MatchingRole {
	/**
	 * The default value of the '{@link #getRoleName() <em>Role Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleName()
	 * @generated
	 * @ordered
	 */
	protected static final String ROLE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRoleName() <em>Role Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleName()
	 * @generated
	 * @ordered
	 */
	protected String roleName = ROLE_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMatchedProductSpace() <em>Matched Product Space</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatchedProductSpace()
	 * @generated
	 * @ordered
	 */
	protected ProductSpace matchedProductSpace;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MatchingRoleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SuperModDiffPackage.Literals.MATCHING_ROLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRoleName() {
		return roleName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoleName(String newRoleName) {
		String oldRoleName = roleName;
		roleName = newRoleName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SuperModDiffPackage.MATCHING_ROLE__ROLE_NAME, oldRoleName, roleName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductSpace getMatchedProductSpace() {
		if (matchedProductSpace != null && matchedProductSpace.eIsProxy()) {
			InternalEObject oldMatchedProductSpace = (InternalEObject)matchedProductSpace;
			matchedProductSpace = (ProductSpace)eResolveProxy(oldMatchedProductSpace);
			if (matchedProductSpace != oldMatchedProductSpace) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SuperModDiffPackage.MATCHING_ROLE__MATCHED_PRODUCT_SPACE, oldMatchedProductSpace, matchedProductSpace));
			}
		}
		return matchedProductSpace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductSpace basicGetMatchedProductSpace() {
		return matchedProductSpace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMatchedProductSpace(ProductSpace newMatchedProductSpace) {
		ProductSpace oldMatchedProductSpace = matchedProductSpace;
		matchedProductSpace = newMatchedProductSpace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SuperModDiffPackage.MATCHING_ROLE__MATCHED_PRODUCT_SPACE, oldMatchedProductSpace, matchedProductSpace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SuperModDiffPackage.MATCHING_ROLE__ROLE_NAME:
				return getRoleName();
			case SuperModDiffPackage.MATCHING_ROLE__MATCHED_PRODUCT_SPACE:
				if (resolve) return getMatchedProductSpace();
				return basicGetMatchedProductSpace();
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
			case SuperModDiffPackage.MATCHING_ROLE__ROLE_NAME:
				setRoleName((String)newValue);
				return;
			case SuperModDiffPackage.MATCHING_ROLE__MATCHED_PRODUCT_SPACE:
				setMatchedProductSpace((ProductSpace)newValue);
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
			case SuperModDiffPackage.MATCHING_ROLE__ROLE_NAME:
				setRoleName(ROLE_NAME_EDEFAULT);
				return;
			case SuperModDiffPackage.MATCHING_ROLE__MATCHED_PRODUCT_SPACE:
				setMatchedProductSpace((ProductSpace)null);
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
			case SuperModDiffPackage.MATCHING_ROLE__ROLE_NAME:
				return ROLE_NAME_EDEFAULT == null ? roleName != null : !ROLE_NAME_EDEFAULT.equals(roleName);
			case SuperModDiffPackage.MATCHING_ROLE__MATCHED_PRODUCT_SPACE:
				return matchedProductSpace != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String toString() {
		return getRoleName();
	}

} //MatchingRoleImpl
