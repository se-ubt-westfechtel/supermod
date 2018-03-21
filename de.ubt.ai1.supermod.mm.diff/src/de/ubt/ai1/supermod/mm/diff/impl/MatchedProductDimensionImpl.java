/**
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package de.ubt.ai1.supermod.mm.diff.impl;

import de.ubt.ai1.supermod.mm.core.ProductDimension;
import de.ubt.ai1.supermod.mm.diff.MatchedProductDimension;
import de.ubt.ai1.supermod.mm.diff.MatchingRole;
import de.ubt.ai1.supermod.mm.diff.SuperModDiffPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Matched Product Dimension</b></em>'.
 * @author Felix Schwaegerl
 * @version	0.1.0
 * @since	0.1.0
 * @date 	2015-03-05
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai1.supermod.mm.diff.impl.MatchedProductDimensionImpl#getProductDimension <em>Product Dimension</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.diff.impl.MatchedProductDimensionImpl#getRole <em>Role</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MatchedProductDimensionImpl extends MinimalEObjectImpl.Container implements MatchedProductDimension {
	/**
	 * The cached value of the '{@link #getProductDimension() <em>Product Dimension</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductDimension()
	 * @generated
	 * @ordered
	 */
	protected ProductDimension productDimension;

	/**
	 * The cached value of the '{@link #getRole() <em>Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected MatchingRole role;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MatchedProductDimensionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SuperModDiffPackage.Literals.MATCHED_PRODUCT_DIMENSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductDimension getProductDimension() {
		if (productDimension != null && productDimension.eIsProxy()) {
			InternalEObject oldProductDimension = (InternalEObject)productDimension;
			productDimension = (ProductDimension)eResolveProxy(oldProductDimension);
			if (productDimension != oldProductDimension) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SuperModDiffPackage.MATCHED_PRODUCT_DIMENSION__PRODUCT_DIMENSION, oldProductDimension, productDimension));
			}
		}
		return productDimension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductDimension basicGetProductDimension() {
		return productDimension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProductDimension(ProductDimension newProductDimension) {
		ProductDimension oldProductDimension = productDimension;
		productDimension = newProductDimension;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SuperModDiffPackage.MATCHED_PRODUCT_DIMENSION__PRODUCT_DIMENSION, oldProductDimension, productDimension));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MatchingRole getRole() {
		if (role != null && role.eIsProxy()) {
			InternalEObject oldRole = (InternalEObject)role;
			role = (MatchingRole)eResolveProxy(oldRole);
			if (role != oldRole) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SuperModDiffPackage.MATCHED_PRODUCT_DIMENSION__ROLE, oldRole, role));
			}
		}
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MatchingRole basicGetRole() {
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRole(MatchingRole newRole) {
		MatchingRole oldRole = role;
		role = newRole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SuperModDiffPackage.MATCHED_PRODUCT_DIMENSION__ROLE, oldRole, role));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SuperModDiffPackage.MATCHED_PRODUCT_DIMENSION__PRODUCT_DIMENSION:
				if (resolve) return getProductDimension();
				return basicGetProductDimension();
			case SuperModDiffPackage.MATCHED_PRODUCT_DIMENSION__ROLE:
				if (resolve) return getRole();
				return basicGetRole();
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
			case SuperModDiffPackage.MATCHED_PRODUCT_DIMENSION__PRODUCT_DIMENSION:
				setProductDimension((ProductDimension)newValue);
				return;
			case SuperModDiffPackage.MATCHED_PRODUCT_DIMENSION__ROLE:
				setRole((MatchingRole)newValue);
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
			case SuperModDiffPackage.MATCHED_PRODUCT_DIMENSION__PRODUCT_DIMENSION:
				setProductDimension((ProductDimension)null);
				return;
			case SuperModDiffPackage.MATCHED_PRODUCT_DIMENSION__ROLE:
				setRole((MatchingRole)null);
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
			case SuperModDiffPackage.MATCHED_PRODUCT_DIMENSION__PRODUCT_DIMENSION:
				return productDimension != null;
			case SuperModDiffPackage.MATCHED_PRODUCT_DIMENSION__ROLE:
				return role != null;
		}
		return super.eIsSet(featureID);
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.emf.ecore.impl.BasicEObjectImpl#toString()
	 */
	@Override
	public String toString() {
		return getProductDimension().toString() + "@{" + getRole() + "}";
	}

} //MatchedProductDimensionImpl
