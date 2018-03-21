/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.mm.client.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import de.ubt.ai1.supermod.mm.client.SingleVersionProductDimensionDescriptor;
import de.ubt.ai1.supermod.mm.client.SingleVersionProductSpaceDescriptor;
import de.ubt.ai1.supermod.mm.client.SuperModClientPackage;
import java.lang.reflect.InvocationTargetException;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Single Version Product Space Descriptor</b></em>'.
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date 	2014-07-28
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai1.supermod.mm.client.impl.SingleVersionProductSpaceDescriptorImpl#getDimensionDescriptors <em>Dimension Descriptors</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SingleVersionProductSpaceDescriptorImpl extends MinimalEObjectImpl.Container implements SingleVersionProductSpaceDescriptor {
	/**
	 * The cached value of the '{@link #getDimensionDescriptors() <em>Dimension Descriptors</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDimensionDescriptors()
	 * @generated
	 * @ordered
	 */
	protected EList<SingleVersionProductDimensionDescriptor> dimensionDescriptors;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SingleVersionProductSpaceDescriptorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SuperModClientPackage.Literals.SINGLE_VERSION_PRODUCT_SPACE_DESCRIPTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SingleVersionProductDimensionDescriptor> getDimensionDescriptors() {
		if (dimensionDescriptors == null) {
			dimensionDescriptors = new EObjectResolvingEList<SingleVersionProductDimensionDescriptor>(SingleVersionProductDimensionDescriptor.class, this, SuperModClientPackage.SINGLE_VERSION_PRODUCT_SPACE_DESCRIPTOR__DIMENSION_DESCRIPTORS);
		}
		return dimensionDescriptors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isModified() {
		for (SingleVersionProductDimensionDescriptor pdd : 
				getDimensionDescriptors()) {
			if (pdd.isModified()) {
				return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setModified(boolean modified) {
		for (SingleVersionProductDimensionDescriptor pdd : 
				getDimensionDescriptors()) {
			pdd.setModified(modified);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SuperModClientPackage.SINGLE_VERSION_PRODUCT_SPACE_DESCRIPTOR__DIMENSION_DESCRIPTORS:
				return getDimensionDescriptors();
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
			case SuperModClientPackage.SINGLE_VERSION_PRODUCT_SPACE_DESCRIPTOR__DIMENSION_DESCRIPTORS:
				getDimensionDescriptors().clear();
				getDimensionDescriptors().addAll((Collection<? extends SingleVersionProductDimensionDescriptor>)newValue);
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
			case SuperModClientPackage.SINGLE_VERSION_PRODUCT_SPACE_DESCRIPTOR__DIMENSION_DESCRIPTORS:
				getDimensionDescriptors().clear();
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
			case SuperModClientPackage.SINGLE_VERSION_PRODUCT_SPACE_DESCRIPTOR__DIMENSION_DESCRIPTORS:
				return dimensionDescriptors != null && !dimensionDescriptors.isEmpty();
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
			case SuperModClientPackage.SINGLE_VERSION_PRODUCT_SPACE_DESCRIPTOR___IS_MODIFIED:
				return isModified();
			case SuperModClientPackage.SINGLE_VERSION_PRODUCT_SPACE_DESCRIPTOR___SET_MODIFIED__BOOLEAN:
				setModified((Boolean)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //SingleVersionProductSpaceDescriptorImpl
