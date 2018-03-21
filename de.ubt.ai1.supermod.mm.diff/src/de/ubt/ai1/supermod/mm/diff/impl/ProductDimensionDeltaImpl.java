/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.mm.diff.impl;

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

import de.ubt.ai1.supermod.mm.diff.ProductDimensionDelta;
import de.ubt.ai1.supermod.mm.diff.ProductSpaceElementDelta;
import de.ubt.ai1.supermod.mm.diff.SuperModDiffPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product Dimension Delta</b></em>'.
 * @author Felix Schwaegerl
 * @version	0.1.0
 * @since	0.1.0
 * @date 	2014-07-25
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai1.supermod.mm.diff.impl.ProductDimensionDeltaImpl#getInsertedElements <em>Inserted Elements</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.diff.impl.ProductDimensionDeltaImpl#getDeletedElements <em>Deleted Elements</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.diff.impl.ProductDimensionDeltaImpl#getDimensionName <em>Dimension Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProductDimensionDeltaImpl extends MinimalEObjectImpl.Container implements ProductDimensionDelta {
	/**
	 * The cached value of the '{@link #getInsertedElements() <em>Inserted Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInsertedElements()
	 * @generated
	 * @ordered
	 */
	protected EList<ProductSpaceElementDelta> insertedElements;

	/**
	 * The cached value of the '{@link #getDeletedElements() <em>Deleted Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeletedElements()
	 * @generated
	 * @ordered
	 */
	protected EList<ProductSpaceElementDelta> deletedElements;

	/**
	 * The default value of the '{@link #getDimensionName() <em>Dimension Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDimensionName()
	 * @generated
	 * @ordered
	 */
	protected static final String DIMENSION_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDimensionName() <em>Dimension Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDimensionName()
	 * @generated
	 * @ordered
	 */
	protected String dimensionName = DIMENSION_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductDimensionDeltaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SuperModDiffPackage.Literals.PRODUCT_DIMENSION_DELTA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProductSpaceElementDelta> getInsertedElements() {
		if (insertedElements == null) {
			insertedElements = new EObjectContainmentEList<ProductSpaceElementDelta>(ProductSpaceElementDelta.class, this, SuperModDiffPackage.PRODUCT_DIMENSION_DELTA__INSERTED_ELEMENTS);
		}
		return insertedElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProductSpaceElementDelta> getDeletedElements() {
		if (deletedElements == null) {
			deletedElements = new EObjectContainmentEList<ProductSpaceElementDelta>(ProductSpaceElementDelta.class, this, SuperModDiffPackage.PRODUCT_DIMENSION_DELTA__DELETED_ELEMENTS);
		}
		return deletedElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDimensionName() {
		return dimensionName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDimensionName(String newDimensionName) {
		String oldDimensionName = dimensionName;
		dimensionName = newDimensionName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SuperModDiffPackage.PRODUCT_DIMENSION_DELTA__DIMENSION_NAME, oldDimensionName, dimensionName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SuperModDiffPackage.PRODUCT_DIMENSION_DELTA__INSERTED_ELEMENTS:
				return ((InternalEList<?>)getInsertedElements()).basicRemove(otherEnd, msgs);
			case SuperModDiffPackage.PRODUCT_DIMENSION_DELTA__DELETED_ELEMENTS:
				return ((InternalEList<?>)getDeletedElements()).basicRemove(otherEnd, msgs);
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
			case SuperModDiffPackage.PRODUCT_DIMENSION_DELTA__INSERTED_ELEMENTS:
				return getInsertedElements();
			case SuperModDiffPackage.PRODUCT_DIMENSION_DELTA__DELETED_ELEMENTS:
				return getDeletedElements();
			case SuperModDiffPackage.PRODUCT_DIMENSION_DELTA__DIMENSION_NAME:
				return getDimensionName();
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
			case SuperModDiffPackage.PRODUCT_DIMENSION_DELTA__INSERTED_ELEMENTS:
				getInsertedElements().clear();
				getInsertedElements().addAll((Collection<? extends ProductSpaceElementDelta>)newValue);
				return;
			case SuperModDiffPackage.PRODUCT_DIMENSION_DELTA__DELETED_ELEMENTS:
				getDeletedElements().clear();
				getDeletedElements().addAll((Collection<? extends ProductSpaceElementDelta>)newValue);
				return;
			case SuperModDiffPackage.PRODUCT_DIMENSION_DELTA__DIMENSION_NAME:
				setDimensionName((String)newValue);
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
			case SuperModDiffPackage.PRODUCT_DIMENSION_DELTA__INSERTED_ELEMENTS:
				getInsertedElements().clear();
				return;
			case SuperModDiffPackage.PRODUCT_DIMENSION_DELTA__DELETED_ELEMENTS:
				getDeletedElements().clear();
				return;
			case SuperModDiffPackage.PRODUCT_DIMENSION_DELTA__DIMENSION_NAME:
				setDimensionName(DIMENSION_NAME_EDEFAULT);
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
			case SuperModDiffPackage.PRODUCT_DIMENSION_DELTA__INSERTED_ELEMENTS:
				return insertedElements != null && !insertedElements.isEmpty();
			case SuperModDiffPackage.PRODUCT_DIMENSION_DELTA__DELETED_ELEMENTS:
				return deletedElements != null && !deletedElements.isEmpty();
			case SuperModDiffPackage.PRODUCT_DIMENSION_DELTA__DIMENSION_NAME:
				return DIMENSION_NAME_EDEFAULT == null ? dimensionName != null : !DIMENSION_NAME_EDEFAULT.equals(dimensionName);
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
		StringBuilder sb = new StringBuilder();
		sb.append("delta " + getDimensionName() + " <<\n");
		for (ProductSpaceElementDelta ins : getInsertedElements()) {
			sb.append("+++" + ins.toString() + "\n");
		}
		for (ProductSpaceElementDelta del : getDeletedElements()) {
			sb.append("---" + del.toString() + "\n");
		}
		sb.append(">>");
		return sb.toString();
	}

} //ProductDimensionDeltaImpl
