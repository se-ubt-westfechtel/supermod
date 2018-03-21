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
import org.eclipse.emf.ecore.util.EObjectWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import de.ubt.ai1.supermod.mm.core.ProductSpaceElement;
import de.ubt.ai1.supermod.mm.core.SuperModCorePackage;
import de.ubt.ai1.supermod.mm.core.UUIDElement;
import de.ubt.ai1.supermod.mm.core.impl.ProductSpaceElementImpl;
import de.ubt.ai1.supermod.mm.emffile.EMFClassRef;
import de.ubt.ai1.supermod.mm.emffile.EMFContainmentReferenceValue;
import de.ubt.ai1.supermod.mm.emffile.EMFFeatureRef;
import de.ubt.ai1.supermod.mm.emffile.EMFFileContent;
import de.ubt.ai1.supermod.mm.emffile.EMFInternalReferenceValue;
import de.ubt.ai1.supermod.mm.emffile.EMFObject;
import de.ubt.ai1.supermod.mm.emffile.SuperModEMFFilePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EMF Object</b></em>'.
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date 	2014-07-28
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai1.supermod.mm.emffile.impl.EMFObjectImpl#getUuid <em>Uuid</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.emffile.impl.EMFObjectImpl#getClassRefs <em>Class Refs</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.emffile.impl.EMFObjectImpl#getFeatureRefs <em>Feature Refs</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.emffile.impl.EMFObjectImpl#getTargetingRefVals <em>Targeting Ref Vals</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.emffile.impl.EMFObjectImpl#getTargetingContainmentRefVals <em>Targeting Containment Ref Vals</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EMFObjectImpl extends ProductSpaceElementImpl implements EMFObject {
	/**
	 * The default value of the '{@link #getUuid() <em>Uuid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUuid()
	 * @generated
	 * @ordered
	 */
	protected static final String UUID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUuid() <em>Uuid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUuid()
	 * @generated
	 * @ordered
	 */
	protected String uuid = UUID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getClassRefs() <em>Class Refs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassRefs()
	 * @generated
	 * @ordered
	 */
	protected EList<EMFClassRef> classRefs;

	/**
	 * The cached value of the '{@link #getFeatureRefs() <em>Feature Refs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureRefs()
	 * @generated
	 * @ordered
	 */
	protected EList<EMFFeatureRef> featureRefs;

	/**
	 * The cached value of the '{@link #getTargetingRefVals() <em>Targeting Ref Vals</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetingRefVals()
	 * @generated
	 * @ordered
	 */
	protected EList<EMFInternalReferenceValue> targetingRefVals;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EMFObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SuperModEMFFilePackage.Literals.EMF_OBJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUuid() {
		return uuid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUuid(String newUuid) {
		String oldUuid = uuid;
		uuid = newUuid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SuperModEMFFilePackage.EMF_OBJECT__UUID, oldUuid, uuid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EMFClassRef> getClassRefs() {
		if (classRefs == null) {
			classRefs = new EObjectContainmentEList<EMFClassRef>(EMFClassRef.class, this, SuperModEMFFilePackage.EMF_OBJECT__CLASS_REFS);
		}
		return classRefs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EMFFeatureRef> getFeatureRefs() {
		if (featureRefs == null) {
			featureRefs = new EObjectContainmentEList<EMFFeatureRef>(EMFFeatureRef.class, this, SuperModEMFFilePackage.EMF_OBJECT__FEATURE_REFS);
		}
		return featureRefs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EMFInternalReferenceValue> getTargetingRefVals() {
		if (targetingRefVals == null) {
			targetingRefVals = new EObjectWithInverseEList<EMFInternalReferenceValue>(EMFInternalReferenceValue.class, this, SuperModEMFFilePackage.EMF_OBJECT__TARGETING_REF_VALS, SuperModEMFFilePackage.EMF_INTERNAL_REFERENCE_VALUE__REFERENCED_OBJECT);
		}
		return targetingRefVals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<EMFContainmentReferenceValue> getTargetingContainmentRefVals() {
		EList<EMFContainmentReferenceValue> crvs = ECollections.newBasicEList();
		for (EMFInternalReferenceValue irv : getTargetingRefVals()) {
			if (irv instanceof EMFContainmentReferenceValue) {
				crvs.add((EMFContainmentReferenceValue) irv);
			}
		}
		return ECollections.unmodifiableEList(crvs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SuperModEMFFilePackage.EMF_OBJECT__TARGETING_REF_VALS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTargetingRefVals()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SuperModEMFFilePackage.EMF_OBJECT__CLASS_REFS:
				return ((InternalEList<?>)getClassRefs()).basicRemove(otherEnd, msgs);
			case SuperModEMFFilePackage.EMF_OBJECT__FEATURE_REFS:
				return ((InternalEList<?>)getFeatureRefs()).basicRemove(otherEnd, msgs);
			case SuperModEMFFilePackage.EMF_OBJECT__TARGETING_REF_VALS:
				return ((InternalEList<?>)getTargetingRefVals()).basicRemove(otherEnd, msgs);
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
			case SuperModEMFFilePackage.EMF_OBJECT__UUID:
				return getUuid();
			case SuperModEMFFilePackage.EMF_OBJECT__CLASS_REFS:
				return getClassRefs();
			case SuperModEMFFilePackage.EMF_OBJECT__FEATURE_REFS:
				return getFeatureRefs();
			case SuperModEMFFilePackage.EMF_OBJECT__TARGETING_REF_VALS:
				return getTargetingRefVals();
			case SuperModEMFFilePackage.EMF_OBJECT__TARGETING_CONTAINMENT_REF_VALS:
				return getTargetingContainmentRefVals();
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
			case SuperModEMFFilePackage.EMF_OBJECT__UUID:
				setUuid((String)newValue);
				return;
			case SuperModEMFFilePackage.EMF_OBJECT__CLASS_REFS:
				getClassRefs().clear();
				getClassRefs().addAll((Collection<? extends EMFClassRef>)newValue);
				return;
			case SuperModEMFFilePackage.EMF_OBJECT__FEATURE_REFS:
				getFeatureRefs().clear();
				getFeatureRefs().addAll((Collection<? extends EMFFeatureRef>)newValue);
				return;
			case SuperModEMFFilePackage.EMF_OBJECT__TARGETING_REF_VALS:
				getTargetingRefVals().clear();
				getTargetingRefVals().addAll((Collection<? extends EMFInternalReferenceValue>)newValue);
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
			case SuperModEMFFilePackage.EMF_OBJECT__UUID:
				setUuid(UUID_EDEFAULT);
				return;
			case SuperModEMFFilePackage.EMF_OBJECT__CLASS_REFS:
				getClassRefs().clear();
				return;
			case SuperModEMFFilePackage.EMF_OBJECT__FEATURE_REFS:
				getFeatureRefs().clear();
				return;
			case SuperModEMFFilePackage.EMF_OBJECT__TARGETING_REF_VALS:
				getTargetingRefVals().clear();
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
			case SuperModEMFFilePackage.EMF_OBJECT__UUID:
				return UUID_EDEFAULT == null ? uuid != null : !UUID_EDEFAULT.equals(uuid);
			case SuperModEMFFilePackage.EMF_OBJECT__CLASS_REFS:
				return classRefs != null && !classRefs.isEmpty();
			case SuperModEMFFilePackage.EMF_OBJECT__FEATURE_REFS:
				return featureRefs != null && !featureRefs.isEmpty();
			case SuperModEMFFilePackage.EMF_OBJECT__TARGETING_REF_VALS:
				return targetingRefVals != null && !targetingRefVals.isEmpty();
			case SuperModEMFFilePackage.EMF_OBJECT__TARGETING_CONTAINMENT_REF_VALS:
				return !getTargetingContainmentRefVals().isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == UUIDElement.class) {
			switch (derivedFeatureID) {
				case SuperModEMFFilePackage.EMF_OBJECT__UUID: return SuperModCorePackage.UUID_ELEMENT__UUID;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == UUIDElement.class) {
			switch (baseFeatureID) {
				case SuperModCorePackage.UUID_ELEMENT__UUID: return SuperModEMFFilePackage.EMF_OBJECT__UUID;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (uuid: ");
		result.append(uuid);
		result.append(')');
		return result.toString();
	}

	@Override
	public ProductSpaceElement basicGetSuperProductSpaceElement() {
		return (EMFFileContent) eContainer();
	}

	@Override
	public EList<ProductSpaceElement> getSubProductSpaceElements() {
		EList<ProductSpaceElement> subElements = ECollections.newBasicEList();
		subElements.addAll(getClassRefs());
		subElements.addAll(getFeatureRefs());
		return ECollections.unmodifiableEList(subElements);
	}
	
	@Override
	public EList<ProductSpaceElement> getCrossReferencedProductSpaceElements() {
		return ECollections.emptyEList();
	}
	
	@Override
	public EList<ProductSpaceElement> getCrossReferencingProductSpaceElements() {
		return ECollections.unmodifiableEList(getTargetingRefVals());
	}

} //EMFObjectImpl
