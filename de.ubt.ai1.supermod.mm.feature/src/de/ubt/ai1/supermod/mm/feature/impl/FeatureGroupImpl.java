/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.mm.feature.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import de.ubt.ai1.supermod.mm.core.HybridElement;
import de.ubt.ai1.supermod.mm.core.Invariant;
import de.ubt.ai1.supermod.mm.core.RuleBaseElement;
import de.ubt.ai1.supermod.mm.core.SuperModCorePackage;
import de.ubt.ai1.supermod.mm.core.UUIDElement;
import de.ubt.ai1.supermod.mm.core.impl.HybridElementImpl;
import de.ubt.ai1.supermod.mm.feature.Feature;
import de.ubt.ai1.supermod.mm.feature.FeatureGroup;
import de.ubt.ai1.supermod.mm.feature.GroupMembership;
import de.ubt.ai1.supermod.mm.feature.SuperModFeaturePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature Group</b></em>'.
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date 	2014-07-28
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai1.supermod.mm.feature.impl.FeatureGroupImpl#getUuid <em>Uuid</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.feature.impl.FeatureGroupImpl#getGroupedFeatures <em>Grouped Features</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.feature.impl.FeatureGroupImpl#getGroupInvariant <em>Group Invariant</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.feature.impl.FeatureGroupImpl#getParentFeature <em>Parent Feature</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class FeatureGroupImpl extends HybridElementImpl implements FeatureGroup {
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
	 * The cached value of the '{@link #getGroupedFeatures() <em>Grouped Features</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupedFeatures()
	 * @generated
	 * @ordered
	 */
	protected EList<GroupMembership> groupedFeatures;

	/**
	 * The cached value of the '{@link #getGroupInvariant() <em>Group Invariant</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupInvariant()
	 * @generated
	 * @ordered
	 */
	protected Invariant groupInvariant;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeatureGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SuperModFeaturePackage.Literals.FEATURE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GroupMembership> getGroupedFeatures() {
		if (groupedFeatures == null) {
			groupedFeatures = new EObjectContainmentWithInverseEList<GroupMembership>(GroupMembership.class, this, SuperModFeaturePackage.FEATURE_GROUP__GROUPED_FEATURES, SuperModFeaturePackage.GROUP_MEMBERSHIP__GROUP);
		}
		return groupedFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Invariant getGroupInvariant() {
		return groupInvariant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGroupInvariant(Invariant newGroupInvariant, NotificationChain msgs) {
		Invariant oldGroupInvariant = groupInvariant;
		groupInvariant = newGroupInvariant;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SuperModFeaturePackage.FEATURE_GROUP__GROUP_INVARIANT, oldGroupInvariant, newGroupInvariant);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGroupInvariant(Invariant newGroupInvariant) {
		if (newGroupInvariant != groupInvariant) {
			NotificationChain msgs = null;
			if (groupInvariant != null)
				msgs = ((InternalEObject)groupInvariant).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SuperModFeaturePackage.FEATURE_GROUP__GROUP_INVARIANT, null, msgs);
			if (newGroupInvariant != null)
				msgs = ((InternalEObject)newGroupInvariant).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SuperModFeaturePackage.FEATURE_GROUP__GROUP_INVARIANT, null, msgs);
			msgs = basicSetGroupInvariant(newGroupInvariant, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SuperModFeaturePackage.FEATURE_GROUP__GROUP_INVARIANT, newGroupInvariant, newGroupInvariant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature getParentFeature() {
		if (eContainerFeatureID() != SuperModFeaturePackage.FEATURE_GROUP__PARENT_FEATURE) return null;
		return (Feature)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentFeature(Feature newParentFeature, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParentFeature, SuperModFeaturePackage.FEATURE_GROUP__PARENT_FEATURE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentFeature(Feature newParentFeature) {
		if (newParentFeature != eInternalContainer() || (eContainerFeatureID() != SuperModFeaturePackage.FEATURE_GROUP__PARENT_FEATURE && newParentFeature != null)) {
			if (EcoreUtil.isAncestor(this, newParentFeature))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParentFeature != null)
				msgs = ((InternalEObject)newParentFeature).eInverseAdd(this, SuperModFeaturePackage.FEATURE__GROUPS, Feature.class, msgs);
			msgs = basicSetParentFeature(newParentFeature, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SuperModFeaturePackage.FEATURE_GROUP__PARENT_FEATURE, newParentFeature, newParentFeature));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SuperModFeaturePackage.FEATURE_GROUP__UUID, oldUuid, uuid));
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
			case SuperModFeaturePackage.FEATURE_GROUP__GROUPED_FEATURES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGroupedFeatures()).basicAdd(otherEnd, msgs);
			case SuperModFeaturePackage.FEATURE_GROUP__PARENT_FEATURE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParentFeature((Feature)otherEnd, msgs);
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
			case SuperModFeaturePackage.FEATURE_GROUP__GROUPED_FEATURES:
				return ((InternalEList<?>)getGroupedFeatures()).basicRemove(otherEnd, msgs);
			case SuperModFeaturePackage.FEATURE_GROUP__GROUP_INVARIANT:
				return basicSetGroupInvariant(null, msgs);
			case SuperModFeaturePackage.FEATURE_GROUP__PARENT_FEATURE:
				return basicSetParentFeature(null, msgs);
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
			case SuperModFeaturePackage.FEATURE_GROUP__PARENT_FEATURE:
				return eInternalContainer().eInverseRemove(this, SuperModFeaturePackage.FEATURE__GROUPS, Feature.class, msgs);
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
			case SuperModFeaturePackage.FEATURE_GROUP__UUID:
				return getUuid();
			case SuperModFeaturePackage.FEATURE_GROUP__GROUPED_FEATURES:
				return getGroupedFeatures();
			case SuperModFeaturePackage.FEATURE_GROUP__GROUP_INVARIANT:
				return getGroupInvariant();
			case SuperModFeaturePackage.FEATURE_GROUP__PARENT_FEATURE:
				return getParentFeature();
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
			case SuperModFeaturePackage.FEATURE_GROUP__UUID:
				setUuid((String)newValue);
				return;
			case SuperModFeaturePackage.FEATURE_GROUP__GROUPED_FEATURES:
				getGroupedFeatures().clear();
				getGroupedFeatures().addAll((Collection<? extends GroupMembership>)newValue);
				return;
			case SuperModFeaturePackage.FEATURE_GROUP__GROUP_INVARIANT:
				setGroupInvariant((Invariant)newValue);
				return;
			case SuperModFeaturePackage.FEATURE_GROUP__PARENT_FEATURE:
				setParentFeature((Feature)newValue);
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
			case SuperModFeaturePackage.FEATURE_GROUP__UUID:
				setUuid(UUID_EDEFAULT);
				return;
			case SuperModFeaturePackage.FEATURE_GROUP__GROUPED_FEATURES:
				getGroupedFeatures().clear();
				return;
			case SuperModFeaturePackage.FEATURE_GROUP__GROUP_INVARIANT:
				setGroupInvariant((Invariant)null);
				return;
			case SuperModFeaturePackage.FEATURE_GROUP__PARENT_FEATURE:
				setParentFeature((Feature)null);
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
			case SuperModFeaturePackage.FEATURE_GROUP__UUID:
				return UUID_EDEFAULT == null ? uuid != null : !UUID_EDEFAULT.equals(uuid);
			case SuperModFeaturePackage.FEATURE_GROUP__GROUPED_FEATURES:
				return groupedFeatures != null && !groupedFeatures.isEmpty();
			case SuperModFeaturePackage.FEATURE_GROUP__GROUP_INVARIANT:
				return groupInvariant != null;
			case SuperModFeaturePackage.FEATURE_GROUP__PARENT_FEATURE:
				return getParentFeature() != null;
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
				case SuperModFeaturePackage.FEATURE_GROUP__UUID: return SuperModCorePackage.UUID_ELEMENT__UUID;
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
				case SuperModCorePackage.UUID_ELEMENT__UUID: return SuperModFeaturePackage.FEATURE_GROUP__UUID;
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
		return getParentFeature();
	}

	@Override
	public EList<HybridElement> getSubHybridElements() {
		return ECollections.unmodifiableEList(getGroupedFeatures());
	}

	@Override
	public EList<HybridElement> getCrossReferencedHybridElements() {
		return ECollections.emptyEList();
	}
	
	@Override
	public EList<HybridElement> getCrossReferencingHybridElements() {
		return ECollections.emptyEList();
	}

	@Override
	public EList<RuleBaseElement> getLowLevelConcepts() {
		if (getGroupInvariant() != null) {
			return ECollections.singletonEList(getGroupInvariant());
		}
		return ECollections.emptyEList();
	}

} //FeatureGroupImpl
