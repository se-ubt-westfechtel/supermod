/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.mm.diff.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import de.ubt.ai1.supermod.mm.diff.ProductDimensionDelta;
import de.ubt.ai1.supermod.mm.diff.ProductSpaceDelta;
import de.ubt.ai1.supermod.mm.diff.SuperModDiffPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product Space Delta</b></em>'.
 * @author Felix Schwaegerl
 * @version	0.1.0
 * @since	0.1.0
 * @date 	2014-07-25
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai1.supermod.mm.diff.impl.ProductSpaceDeltaImpl#getProductDimensionDeltas <em>Product Dimension Deltas</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProductSpaceDeltaImpl extends MinimalEObjectImpl.Container implements ProductSpaceDelta {
	/**
	 * The cached value of the '{@link #getProductDimensionDeltas() <em>Product Dimension Deltas</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductDimensionDeltas()
	 * @generated
	 * @ordered
	 */
	protected EList<ProductDimensionDelta> productDimensionDeltas;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductSpaceDeltaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SuperModDiffPackage.Literals.PRODUCT_SPACE_DELTA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProductDimensionDelta> getProductDimensionDeltas() {
		if (productDimensionDeltas == null) {
			productDimensionDeltas = new EObjectResolvingEList<ProductDimensionDelta>(ProductDimensionDelta.class, this, SuperModDiffPackage.PRODUCT_SPACE_DELTA__PRODUCT_DIMENSION_DELTAS);
		}
		return productDimensionDeltas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SuperModDiffPackage.PRODUCT_SPACE_DELTA__PRODUCT_DIMENSION_DELTAS:
				return getProductDimensionDeltas();
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
			case SuperModDiffPackage.PRODUCT_SPACE_DELTA__PRODUCT_DIMENSION_DELTAS:
				getProductDimensionDeltas().clear();
				getProductDimensionDeltas().addAll((Collection<? extends ProductDimensionDelta>)newValue);
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
			case SuperModDiffPackage.PRODUCT_SPACE_DELTA__PRODUCT_DIMENSION_DELTAS:
				getProductDimensionDeltas().clear();
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
			case SuperModDiffPackage.PRODUCT_SPACE_DELTA__PRODUCT_DIMENSION_DELTAS:
				return productDimensionDeltas != null && !productDimensionDeltas.isEmpty();
		}
		return super.eIsSet(featureID);
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.emf.ecore.impl.BasicEObjectImpl#toString()
	 */
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("<<\n");
		for (ProductDimensionDelta dimDelta : getProductDimensionDeltas()) {
			sb.append(dimDelta + "\n");
		}
		sb.append(">>");
		return sb.toString();
	}

} //ProductSpaceDeltaImpl
