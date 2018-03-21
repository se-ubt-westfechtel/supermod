/**
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package de.ubt.ai1.supermod.mm.client.impl;

import de.ubt.ai1.supermod.mm.client.ProductDimensionExportTrace;
import de.ubt.ai1.supermod.mm.client.ProductSpaceExportTrace;
import de.ubt.ai1.supermod.mm.client.SuperModClientPackage;

import de.ubt.ai1.supermod.mm.core.ProductDimension;
import de.ubt.ai1.supermod.mm.core.ProductSpace;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product Space Export Trace</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai1.supermod.mm.client.impl.ProductSpaceExportTraceImpl#getProductSpace <em>Product Space</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.client.impl.ProductSpaceExportTraceImpl#getDimensionTraces <em>Dimension Traces</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProductSpaceExportTraceImpl extends MinimalEObjectImpl.Container implements ProductSpaceExportTrace {
	/**
	 * The cached value of the '{@link #getProductSpace() <em>Product Space</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductSpace()
	 * @generated
	 * @ordered
	 */
	protected ProductSpace productSpace;

	/**
	 * The cached value of the '{@link #getDimensionTraces() <em>Dimension Traces</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDimensionTraces()
	 * @generated
	 * @ordered
	 */
	protected EList<ProductDimensionExportTrace> dimensionTraces;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductSpaceExportTraceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SuperModClientPackage.Literals.PRODUCT_SPACE_EXPORT_TRACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductSpace getProductSpace() {
		if (productSpace != null && productSpace.eIsProxy()) {
			InternalEObject oldProductSpace = (InternalEObject)productSpace;
			productSpace = (ProductSpace)eResolveProxy(oldProductSpace);
			if (productSpace != oldProductSpace) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SuperModClientPackage.PRODUCT_SPACE_EXPORT_TRACE__PRODUCT_SPACE, oldProductSpace, productSpace));
			}
		}
		return productSpace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductSpace basicGetProductSpace() {
		return productSpace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProductSpace(ProductSpace newProductSpace) {
		ProductSpace oldProductSpace = productSpace;
		productSpace = newProductSpace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SuperModClientPackage.PRODUCT_SPACE_EXPORT_TRACE__PRODUCT_SPACE, oldProductSpace, productSpace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProductDimensionExportTrace> getDimensionTraces() {
		if (dimensionTraces == null) {
			dimensionTraces = new EObjectContainmentEList<ProductDimensionExportTrace>(ProductDimensionExportTrace.class, this, SuperModClientPackage.PRODUCT_SPACE_EXPORT_TRACE__DIMENSION_TRACES);
		}
		return dimensionTraces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public ProductDimensionExportTrace getTraceForDimension(ProductDimension dimension) {
		for (ProductDimensionExportTrace trace : getDimensionTraces()) {
			if (trace.getProductDimension().equals(dimension)) {
				return trace;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SuperModClientPackage.PRODUCT_SPACE_EXPORT_TRACE__DIMENSION_TRACES:
				return ((InternalEList<?>)getDimensionTraces()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SuperModClientPackage.PRODUCT_SPACE_EXPORT_TRACE__PRODUCT_SPACE:
				if (resolve) return getProductSpace();
				return basicGetProductSpace();
			case SuperModClientPackage.PRODUCT_SPACE_EXPORT_TRACE__DIMENSION_TRACES:
				return getDimensionTraces();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SuperModClientPackage.PRODUCT_SPACE_EXPORT_TRACE__PRODUCT_SPACE:
				setProductSpace((ProductSpace)newValue);
				return;
			case SuperModClientPackage.PRODUCT_SPACE_EXPORT_TRACE__DIMENSION_TRACES:
				getDimensionTraces().clear();
				getDimensionTraces().addAll((Collection<? extends ProductDimensionExportTrace>)newValue);
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
			case SuperModClientPackage.PRODUCT_SPACE_EXPORT_TRACE__PRODUCT_SPACE:
				setProductSpace((ProductSpace)null);
				return;
			case SuperModClientPackage.PRODUCT_SPACE_EXPORT_TRACE__DIMENSION_TRACES:
				getDimensionTraces().clear();
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
			case SuperModClientPackage.PRODUCT_SPACE_EXPORT_TRACE__PRODUCT_SPACE:
				return productSpace != null;
			case SuperModClientPackage.PRODUCT_SPACE_EXPORT_TRACE__DIMENSION_TRACES:
				return dimensionTraces != null && !dimensionTraces.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case SuperModClientPackage.PRODUCT_SPACE_EXPORT_TRACE___GET_TRACE_FOR_DIMENSION__PRODUCTDIMENSION:
				return getTraceForDimension((ProductDimension)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //ProductSpaceExportTraceImpl
