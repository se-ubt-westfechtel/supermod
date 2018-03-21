/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.mm.emffile.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import de.ubt.ai1.supermod.mm.core.ProductSpaceElement;
import de.ubt.ai1.supermod.mm.core.impl.ProductSpaceElementImpl;
import de.ubt.ai1.supermod.mm.emffile.EMFFeatureRef;
import de.ubt.ai1.supermod.mm.emffile.EMFObject;
import de.ubt.ai1.supermod.mm.emffile.EMFValue;
import de.ubt.ai1.supermod.mm.emffile.SuperModEMFFilePackage;
import de.ubt.ai1.supermod.mm.list.VersionedList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EMF Feature Ref</b></em>'.
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date 	2014-07-28
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai1.supermod.mm.emffile.impl.EMFFeatureRefImpl#getValues <em>Values</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.emffile.impl.EMFFeatureRefImpl#getValueOrdering <em>Value Ordering</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.emffile.impl.EMFFeatureRefImpl#getOrderedValues <em>Ordered Values</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.emffile.impl.EMFFeatureRefImpl#getFeatureName <em>Feature Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EMFFeatureRefImpl extends ProductSpaceElementImpl implements EMFFeatureRef {
	/**
	 * The cached value of the '{@link #getValues() <em>Values</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValues()
	 * @generated
	 * @ordered
	 */
	protected EList<EMFValue> values;

	/**
	 * The cached value of the '{@link #getValueOrdering() <em>Value Ordering</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueOrdering()
	 * @generated
	 * @ordered
	 */
	protected VersionedList valueOrdering;

	/**
	 * The default value of the '{@link #getFeatureName() <em>Feature Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureName()
	 * @generated
	 * @ordered
	 */
	protected static final String FEATURE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFeatureName() <em>Feature Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureName()
	 * @generated
	 * @ordered
	 */
	protected String featureName = FEATURE_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EMFFeatureRefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SuperModEMFFilePackage.Literals.EMF_FEATURE_REF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EMFValue> getValues() {
		if (values == null) {
			values = new EObjectContainmentEList<EMFValue>(EMFValue.class, this, SuperModEMFFilePackage.EMF_FEATURE_REF__VALUES);
		}
		return values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VersionedList getValueOrdering() {
		return valueOrdering;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueOrdering(VersionedList newValueOrdering, NotificationChain msgs) {
		VersionedList oldValueOrdering = valueOrdering;
		valueOrdering = newValueOrdering;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SuperModEMFFilePackage.EMF_FEATURE_REF__VALUE_ORDERING, oldValueOrdering, newValueOrdering);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueOrdering(VersionedList newValueOrdering) {
		if (newValueOrdering != valueOrdering) {
			NotificationChain msgs = null;
			if (valueOrdering != null)
				msgs = ((InternalEObject)valueOrdering).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SuperModEMFFilePackage.EMF_FEATURE_REF__VALUE_ORDERING, null, msgs);
			if (newValueOrdering != null)
				msgs = ((InternalEObject)newValueOrdering).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SuperModEMFFilePackage.EMF_FEATURE_REF__VALUE_ORDERING, null, msgs);
			msgs = basicSetValueOrdering(newValueOrdering, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SuperModEMFFilePackage.EMF_FEATURE_REF__VALUE_ORDERING, newValueOrdering, newValueOrdering));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<EMFValue> getOrderedValues() {
		if (getValueOrdering() == null) {
			return ECollections.unmodifiableEList(getValues());
		}
		else {
			EList<EMFValue> orderedValues = ECollections.newBasicEList();
			for (ProductSpaceElement pe : getValueOrdering().linearize()) {
				orderedValues.add((EMFValue) pe);
			}
			return ECollections.unmodifiableEList(orderedValues);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFeatureName() {
		return featureName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeatureName(String newFeatureName) {
		String oldFeatureName = featureName;
		featureName = newFeatureName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SuperModEMFFilePackage.EMF_FEATURE_REF__FEATURE_NAME, oldFeatureName, featureName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SuperModEMFFilePackage.EMF_FEATURE_REF__VALUES:
				return ((InternalEList<?>)getValues()).basicRemove(otherEnd, msgs);
			case SuperModEMFFilePackage.EMF_FEATURE_REF__VALUE_ORDERING:
				return basicSetValueOrdering(null, msgs);
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
			case SuperModEMFFilePackage.EMF_FEATURE_REF__VALUES:
				return getValues();
			case SuperModEMFFilePackage.EMF_FEATURE_REF__VALUE_ORDERING:
				return getValueOrdering();
			case SuperModEMFFilePackage.EMF_FEATURE_REF__ORDERED_VALUES:
				return getOrderedValues();
			case SuperModEMFFilePackage.EMF_FEATURE_REF__FEATURE_NAME:
				return getFeatureName();
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
			case SuperModEMFFilePackage.EMF_FEATURE_REF__VALUES:
				getValues().clear();
				getValues().addAll((Collection<? extends EMFValue>)newValue);
				return;
			case SuperModEMFFilePackage.EMF_FEATURE_REF__VALUE_ORDERING:
				setValueOrdering((VersionedList)newValue);
				return;
			case SuperModEMFFilePackage.EMF_FEATURE_REF__FEATURE_NAME:
				setFeatureName((String)newValue);
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
			case SuperModEMFFilePackage.EMF_FEATURE_REF__VALUES:
				getValues().clear();
				return;
			case SuperModEMFFilePackage.EMF_FEATURE_REF__VALUE_ORDERING:
				setValueOrdering((VersionedList)null);
				return;
			case SuperModEMFFilePackage.EMF_FEATURE_REF__FEATURE_NAME:
				setFeatureName(FEATURE_NAME_EDEFAULT);
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
			case SuperModEMFFilePackage.EMF_FEATURE_REF__VALUES:
				return values != null && !values.isEmpty();
			case SuperModEMFFilePackage.EMF_FEATURE_REF__VALUE_ORDERING:
				return valueOrdering != null;
			case SuperModEMFFilePackage.EMF_FEATURE_REF__ORDERED_VALUES:
				return !getOrderedValues().isEmpty();
			case SuperModEMFFilePackage.EMF_FEATURE_REF__FEATURE_NAME:
				return FEATURE_NAME_EDEFAULT == null ? featureName != null : !FEATURE_NAME_EDEFAULT.equals(featureName);
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
		result.append(" (featureName: ");
		result.append(featureName);
		result.append(')');
		return result.toString();
	}

	@Override
	public ProductSpaceElement basicGetSuperProductSpaceElement() {
		return (EMFObject) eContainer();
	}

	@Override
	public EList<ProductSpaceElement> getSubProductSpaceElements() {
		EList<ProductSpaceElement> subElements = ECollections.newBasicEList();
		subElements.addAll(getValues());
		if (getValueOrdering() != null) {
			subElements.add(getValueOrdering());
		}
		return ECollections.unmodifiableEList(subElements);
	}
	
	@Override
	public EList<ProductSpaceElement> getCrossReferencedProductSpaceElements() {
		return ECollections.emptyEList();
	}
	
	@Override
	public EList<ProductSpaceElement> getCrossReferencingProductSpaceElements() {
		return ECollections.emptyEList();
	}

} //EMFFeatureRefImpl
