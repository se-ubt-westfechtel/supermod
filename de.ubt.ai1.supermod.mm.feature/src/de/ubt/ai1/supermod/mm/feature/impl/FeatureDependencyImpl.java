/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.mm.feature.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

import de.ubt.ai1.supermod.mm.core.HybridElement;
import de.ubt.ai1.supermod.mm.core.Invariant;
import de.ubt.ai1.supermod.mm.core.RuleBaseElement;
import de.ubt.ai1.supermod.mm.core.SuperModCorePackage;
import de.ubt.ai1.supermod.mm.core.UUIDElement;
import de.ubt.ai1.supermod.mm.core.impl.HybridElementImpl;
import de.ubt.ai1.supermod.mm.feature.Feature;
import de.ubt.ai1.supermod.mm.feature.FeatureDependency;
import de.ubt.ai1.supermod.mm.feature.SuperModFeaturePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature Dependency</b></em>'.
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date 	2014-07-28
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai1.supermod.mm.feature.impl.FeatureDependencyImpl#getUuid <em>Uuid</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.feature.impl.FeatureDependencyImpl#getDependencyInvariant <em>Dependency Invariant</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.feature.impl.FeatureDependencyImpl#getSourceFeature <em>Source Feature</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.feature.impl.FeatureDependencyImpl#getTargetFeature <em>Target Feature</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class FeatureDependencyImpl extends HybridElementImpl implements FeatureDependency {
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
	 * The cached value of the '{@link #getDependencyInvariant() <em>Dependency Invariant</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependencyInvariant()
	 * @generated
	 * @ordered
	 */
	protected Invariant dependencyInvariant;

	/**
	 * The cached value of the '{@link #getTargetFeature() <em>Target Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetFeature()
	 * @generated
	 * @ordered
	 */
	protected Feature targetFeature;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeatureDependencyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SuperModFeaturePackage.Literals.FEATURE_DEPENDENCY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Invariant getDependencyInvariant() {
		return dependencyInvariant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDependencyInvariant(Invariant newDependencyInvariant, NotificationChain msgs) {
		Invariant oldDependencyInvariant = dependencyInvariant;
		dependencyInvariant = newDependencyInvariant;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SuperModFeaturePackage.FEATURE_DEPENDENCY__DEPENDENCY_INVARIANT, oldDependencyInvariant, newDependencyInvariant);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDependencyInvariant(Invariant newDependencyInvariant) {
		if (newDependencyInvariant != dependencyInvariant) {
			NotificationChain msgs = null;
			if (dependencyInvariant != null)
				msgs = ((InternalEObject)dependencyInvariant).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SuperModFeaturePackage.FEATURE_DEPENDENCY__DEPENDENCY_INVARIANT, null, msgs);
			if (newDependencyInvariant != null)
				msgs = ((InternalEObject)newDependencyInvariant).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SuperModFeaturePackage.FEATURE_DEPENDENCY__DEPENDENCY_INVARIANT, null, msgs);
			msgs = basicSetDependencyInvariant(newDependencyInvariant, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SuperModFeaturePackage.FEATURE_DEPENDENCY__DEPENDENCY_INVARIANT, newDependencyInvariant, newDependencyInvariant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature getSourceFeature() {
		if (eContainerFeatureID() != SuperModFeaturePackage.FEATURE_DEPENDENCY__SOURCE_FEATURE) return null;
		return (Feature)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSourceFeature(Feature newSourceFeature, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSourceFeature, SuperModFeaturePackage.FEATURE_DEPENDENCY__SOURCE_FEATURE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceFeature(Feature newSourceFeature) {
		if (newSourceFeature != eInternalContainer() || (eContainerFeatureID() != SuperModFeaturePackage.FEATURE_DEPENDENCY__SOURCE_FEATURE && newSourceFeature != null)) {
			if (EcoreUtil.isAncestor(this, newSourceFeature))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSourceFeature != null)
				msgs = ((InternalEObject)newSourceFeature).eInverseAdd(this, SuperModFeaturePackage.FEATURE__OUTGOING_DEPENDENCIES, Feature.class, msgs);
			msgs = basicSetSourceFeature(newSourceFeature, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SuperModFeaturePackage.FEATURE_DEPENDENCY__SOURCE_FEATURE, newSourceFeature, newSourceFeature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature getTargetFeature() {
		if (targetFeature != null && targetFeature.eIsProxy()) {
			InternalEObject oldTargetFeature = (InternalEObject)targetFeature;
			targetFeature = (Feature)eResolveProxy(oldTargetFeature);
			if (targetFeature != oldTargetFeature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SuperModFeaturePackage.FEATURE_DEPENDENCY__TARGET_FEATURE, oldTargetFeature, targetFeature));
			}
		}
		return targetFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature basicGetTargetFeature() {
		return targetFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTargetFeature(Feature newTargetFeature, NotificationChain msgs) {
		Feature oldTargetFeature = targetFeature;
		targetFeature = newTargetFeature;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SuperModFeaturePackage.FEATURE_DEPENDENCY__TARGET_FEATURE, oldTargetFeature, newTargetFeature);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetFeature(Feature newTargetFeature) {
		if (newTargetFeature != targetFeature) {
			NotificationChain msgs = null;
			if (targetFeature != null)
				msgs = ((InternalEObject)targetFeature).eInverseRemove(this, SuperModFeaturePackage.FEATURE__INCOMING_DEPENDENCIES, Feature.class, msgs);
			if (newTargetFeature != null)
				msgs = ((InternalEObject)newTargetFeature).eInverseAdd(this, SuperModFeaturePackage.FEATURE__INCOMING_DEPENDENCIES, Feature.class, msgs);
			msgs = basicSetTargetFeature(newTargetFeature, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SuperModFeaturePackage.FEATURE_DEPENDENCY__TARGET_FEATURE, newTargetFeature, newTargetFeature));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SuperModFeaturePackage.FEATURE_DEPENDENCY__UUID, oldUuid, uuid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SuperModFeaturePackage.FEATURE_DEPENDENCY__SOURCE_FEATURE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSourceFeature((Feature)otherEnd, msgs);
			case SuperModFeaturePackage.FEATURE_DEPENDENCY__TARGET_FEATURE:
				if (targetFeature != null)
					msgs = ((InternalEObject)targetFeature).eInverseRemove(this, SuperModFeaturePackage.FEATURE__INCOMING_DEPENDENCIES, Feature.class, msgs);
				return basicSetTargetFeature((Feature)otherEnd, msgs);
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
			case SuperModFeaturePackage.FEATURE_DEPENDENCY__DEPENDENCY_INVARIANT:
				return basicSetDependencyInvariant(null, msgs);
			case SuperModFeaturePackage.FEATURE_DEPENDENCY__SOURCE_FEATURE:
				return basicSetSourceFeature(null, msgs);
			case SuperModFeaturePackage.FEATURE_DEPENDENCY__TARGET_FEATURE:
				return basicSetTargetFeature(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case SuperModFeaturePackage.FEATURE_DEPENDENCY__SOURCE_FEATURE:
				return eInternalContainer().eInverseRemove(this, SuperModFeaturePackage.FEATURE__OUTGOING_DEPENDENCIES, Feature.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SuperModFeaturePackage.FEATURE_DEPENDENCY__UUID:
				return getUuid();
			case SuperModFeaturePackage.FEATURE_DEPENDENCY__DEPENDENCY_INVARIANT:
				return getDependencyInvariant();
			case SuperModFeaturePackage.FEATURE_DEPENDENCY__SOURCE_FEATURE:
				return getSourceFeature();
			case SuperModFeaturePackage.FEATURE_DEPENDENCY__TARGET_FEATURE:
				if (resolve) return getTargetFeature();
				return basicGetTargetFeature();
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
			case SuperModFeaturePackage.FEATURE_DEPENDENCY__UUID:
				setUuid((String)newValue);
				return;
			case SuperModFeaturePackage.FEATURE_DEPENDENCY__DEPENDENCY_INVARIANT:
				setDependencyInvariant((Invariant)newValue);
				return;
			case SuperModFeaturePackage.FEATURE_DEPENDENCY__SOURCE_FEATURE:
				setSourceFeature((Feature)newValue);
				return;
			case SuperModFeaturePackage.FEATURE_DEPENDENCY__TARGET_FEATURE:
				setTargetFeature((Feature)newValue);
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
			case SuperModFeaturePackage.FEATURE_DEPENDENCY__UUID:
				setUuid(UUID_EDEFAULT);
				return;
			case SuperModFeaturePackage.FEATURE_DEPENDENCY__DEPENDENCY_INVARIANT:
				setDependencyInvariant((Invariant)null);
				return;
			case SuperModFeaturePackage.FEATURE_DEPENDENCY__SOURCE_FEATURE:
				setSourceFeature((Feature)null);
				return;
			case SuperModFeaturePackage.FEATURE_DEPENDENCY__TARGET_FEATURE:
				setTargetFeature((Feature)null);
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
			case SuperModFeaturePackage.FEATURE_DEPENDENCY__UUID:
				return UUID_EDEFAULT == null ? uuid != null : !UUID_EDEFAULT.equals(uuid);
			case SuperModFeaturePackage.FEATURE_DEPENDENCY__DEPENDENCY_INVARIANT:
				return dependencyInvariant != null;
			case SuperModFeaturePackage.FEATURE_DEPENDENCY__SOURCE_FEATURE:
				return getSourceFeature() != null;
			case SuperModFeaturePackage.FEATURE_DEPENDENCY__TARGET_FEATURE:
				return targetFeature != null;
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
				case SuperModFeaturePackage.FEATURE_DEPENDENCY__UUID: return SuperModCorePackage.UUID_ELEMENT__UUID;
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
				case SuperModCorePackage.UUID_ELEMENT__UUID: return SuperModFeaturePackage.FEATURE_DEPENDENCY__UUID;
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
	public HybridElement basicGetSuperHybridElement() {
		return getSourceFeature();
	}

	@Override
	public EList<HybridElement> getSubHybridElements() {
		return ECollections.emptyEList();
	}

	@Override
	public EList<HybridElement> getCrossReferencedHybridElements() {
		return ECollections.singletonEList(getTargetFeature());
	}
	
	@Override
	public EList<HybridElement> getCrossReferencingHybridElements() {
		return ECollections.emptyEList();
	}

	@Override
	public EList<RuleBaseElement> getLowLevelConcepts() {
		if (getDependencyInvariant() != null) {
			return ECollections.singletonEList(getDependencyInvariant());
		}
		return ECollections.emptyEList();
	}

} //FeatureDependencyImpl
