/**
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package de.ubt.ai1.supermod.mm.client.impl;

import de.ubt.ai1.supermod.mm.client.ProductDimensionExportTrace;
import de.ubt.ai1.supermod.mm.client.SuperModClientPackage;

import de.ubt.ai1.supermod.mm.core.ProductDimension;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product Dimension Export Trace</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai1.supermod.mm.client.impl.ProductDimensionExportTraceImpl#getProductDimension <em>Product Dimension</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ProductDimensionExportTraceImpl extends MinimalEObjectImpl.Container implements ProductDimensionExportTrace {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductDimensionExportTraceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SuperModClientPackage.Literals.PRODUCT_DIMENSION_EXPORT_TRACE;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SuperModClientPackage.PRODUCT_DIMENSION_EXPORT_TRACE__PRODUCT_DIMENSION, oldProductDimension, productDimension));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SuperModClientPackage.PRODUCT_DIMENSION_EXPORT_TRACE__PRODUCT_DIMENSION, oldProductDimension, productDimension));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SuperModClientPackage.PRODUCT_DIMENSION_EXPORT_TRACE__PRODUCT_DIMENSION:
				if (resolve) return getProductDimension();
				return basicGetProductDimension();
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
			case SuperModClientPackage.PRODUCT_DIMENSION_EXPORT_TRACE__PRODUCT_DIMENSION:
				setProductDimension((ProductDimension)newValue);
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
			case SuperModClientPackage.PRODUCT_DIMENSION_EXPORT_TRACE__PRODUCT_DIMENSION:
				setProductDimension((ProductDimension)null);
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
			case SuperModClientPackage.PRODUCT_DIMENSION_EXPORT_TRACE__PRODUCT_DIMENSION:
				return productDimension != null;
		}
		return super.eIsSet(featureID);
	}

} //ProductDimensionExportTraceImpl
