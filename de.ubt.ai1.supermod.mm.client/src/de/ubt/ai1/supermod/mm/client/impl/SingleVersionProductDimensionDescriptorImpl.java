/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.mm.client.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import de.ubt.ai1.supermod.mm.client.SingleVersionProductDimensionDescriptor;
import de.ubt.ai1.supermod.mm.client.SuperModClientPackage;
import java.lang.reflect.InvocationTargetException;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Single Version Product Dimension Descriptor</b></em>'.
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date 	2014-07-28
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai1.supermod.mm.client.impl.SingleVersionProductDimensionDescriptorImpl#getDimensionName <em>Dimension Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class SingleVersionProductDimensionDescriptorImpl extends MinimalEObjectImpl.Container implements SingleVersionProductDimensionDescriptor {
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
	protected SingleVersionProductDimensionDescriptorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SuperModClientPackage.Literals.SINGLE_VERSION_PRODUCT_DIMENSION_DESCRIPTOR;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SuperModClientPackage.SINGLE_VERSION_PRODUCT_DIMENSION_DESCRIPTOR__DIMENSION_NAME, oldDimensionName, dimensionName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public abstract boolean isModified();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public abstract void setModified(boolean modified);
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SuperModClientPackage.SINGLE_VERSION_PRODUCT_DIMENSION_DESCRIPTOR__DIMENSION_NAME:
				return getDimensionName();
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
			case SuperModClientPackage.SINGLE_VERSION_PRODUCT_DIMENSION_DESCRIPTOR__DIMENSION_NAME:
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
			case SuperModClientPackage.SINGLE_VERSION_PRODUCT_DIMENSION_DESCRIPTOR__DIMENSION_NAME:
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
			case SuperModClientPackage.SINGLE_VERSION_PRODUCT_DIMENSION_DESCRIPTOR__DIMENSION_NAME:
				return DIMENSION_NAME_EDEFAULT == null ? dimensionName != null : !DIMENSION_NAME_EDEFAULT.equals(dimensionName);
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
			case SuperModClientPackage.SINGLE_VERSION_PRODUCT_DIMENSION_DESCRIPTOR___IS_MODIFIED:
				return isModified();
			case SuperModClientPackage.SINGLE_VERSION_PRODUCT_DIMENSION_DESCRIPTOR___SET_MODIFIED__BOOLEAN:
				setModified((Boolean)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (dimensionName: ");
		result.append(dimensionName);
		result.append(')');
		return result.toString();
	}

} //SingleVersionProductDimensionDescriptorImpl
