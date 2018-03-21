/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.mm.core.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import de.ubt.ai1.supermod.mm.core.Dimension;
import de.ubt.ai1.supermod.mm.core.Element;
import de.ubt.ai1.supermod.mm.core.SuperModCorePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dimension</b></em>'.
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date 	2014-07-25
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai1.supermod.mm.core.impl.DimensionImpl#getDimensionName <em>Dimension Name</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.core.impl.DimensionImpl#getRootElements <em>Root Elements</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.core.impl.DimensionImpl#getAllElements <em>All Elements</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class DimensionImpl extends MinimalEObjectImpl.Container implements Dimension {
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
	protected DimensionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SuperModCorePackage.Literals.DIMENSION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SuperModCorePackage.DIMENSION__DIMENSION_NAME, oldDimensionName, dimensionName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public abstract EList<Element> getRootElements();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Element> getAllElements() {
		EList<Element> allElements = ECollections.newBasicEList();
		for (Element root : getRootElements()) {
			allElements.add(root);
			allElements.addAll(root.getAllSubElements());
		}
		return ECollections.unmodifiableEList(allElements);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SuperModCorePackage.DIMENSION__DIMENSION_NAME:
				return getDimensionName();
			case SuperModCorePackage.DIMENSION__ROOT_ELEMENTS:
				return getRootElements();
			case SuperModCorePackage.DIMENSION__ALL_ELEMENTS:
				return getAllElements();
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
			case SuperModCorePackage.DIMENSION__DIMENSION_NAME:
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
			case SuperModCorePackage.DIMENSION__DIMENSION_NAME:
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
			case SuperModCorePackage.DIMENSION__DIMENSION_NAME:
				return DIMENSION_NAME_EDEFAULT == null ? dimensionName != null : !DIMENSION_NAME_EDEFAULT.equals(dimensionName);
			case SuperModCorePackage.DIMENSION__ROOT_ELEMENTS:
				return !getRootElements().isEmpty();
			case SuperModCorePackage.DIMENSION__ALL_ELEMENTS:
				return !getAllElements().isEmpty();
		}
		return super.eIsSet(featureID);
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

} //DimensionImpl
