/**
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package de.ubt.ai1.supermod.mm.feature.impl;

import de.ubt.ai1.supermod.mm.core.HybridElement;
import de.ubt.ai1.supermod.mm.core.RuleBaseElement;
import de.ubt.ai1.supermod.mm.core.impl.HybridElementImpl;
import de.ubt.ai1.supermod.mm.feature.Feature;
import de.ubt.ai1.supermod.mm.feature.FeatureGroup;
import de.ubt.ai1.supermod.mm.feature.GroupMembership;
import de.ubt.ai1.supermod.mm.feature.SuperModFeaturePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Group Membership</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai1.supermod.mm.feature.impl.GroupMembershipImpl#getGroupedFeature <em>Grouped Feature</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.feature.impl.GroupMembershipImpl#getGroup <em>Group</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GroupMembershipImpl extends HybridElementImpl implements GroupMembership {
	/**
	 * The cached value of the '{@link #getGroupedFeature() <em>Grouped Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupedFeature()
	 * @generated
	 * @ordered
	 */
	protected Feature groupedFeature;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GroupMembershipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SuperModFeaturePackage.Literals.GROUP_MEMBERSHIP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature getGroupedFeature() {
		if (groupedFeature != null && groupedFeature.eIsProxy()) {
			InternalEObject oldGroupedFeature = (InternalEObject)groupedFeature;
			groupedFeature = (Feature)eResolveProxy(oldGroupedFeature);
			if (groupedFeature != oldGroupedFeature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SuperModFeaturePackage.GROUP_MEMBERSHIP__GROUPED_FEATURE, oldGroupedFeature, groupedFeature));
			}
		}
		return groupedFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature basicGetGroupedFeature() {
		return groupedFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGroupedFeature(Feature newGroupedFeature, NotificationChain msgs) {
		Feature oldGroupedFeature = groupedFeature;
		groupedFeature = newGroupedFeature;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SuperModFeaturePackage.GROUP_MEMBERSHIP__GROUPED_FEATURE, oldGroupedFeature, newGroupedFeature);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGroupedFeature(Feature newGroupedFeature) {
		if (newGroupedFeature != groupedFeature) {
			NotificationChain msgs = null;
			if (groupedFeature != null)
				msgs = ((InternalEObject)groupedFeature).eInverseRemove(this, SuperModFeaturePackage.FEATURE__GROUPED_BY, Feature.class, msgs);
			if (newGroupedFeature != null)
				msgs = ((InternalEObject)newGroupedFeature).eInverseAdd(this, SuperModFeaturePackage.FEATURE__GROUPED_BY, Feature.class, msgs);
			msgs = basicSetGroupedFeature(newGroupedFeature, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SuperModFeaturePackage.GROUP_MEMBERSHIP__GROUPED_FEATURE, newGroupedFeature, newGroupedFeature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureGroup getGroup() {
		if (eContainerFeatureID() != SuperModFeaturePackage.GROUP_MEMBERSHIP__GROUP) return null;
		return (FeatureGroup)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGroup(FeatureGroup newGroup, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newGroup, SuperModFeaturePackage.GROUP_MEMBERSHIP__GROUP, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGroup(FeatureGroup newGroup) {
		if (newGroup != eInternalContainer() || (eContainerFeatureID() != SuperModFeaturePackage.GROUP_MEMBERSHIP__GROUP && newGroup != null)) {
			if (EcoreUtil.isAncestor(this, newGroup))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newGroup != null)
				msgs = ((InternalEObject)newGroup).eInverseAdd(this, SuperModFeaturePackage.FEATURE_GROUP__GROUPED_FEATURES, FeatureGroup.class, msgs);
			msgs = basicSetGroup(newGroup, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SuperModFeaturePackage.GROUP_MEMBERSHIP__GROUP, newGroup, newGroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SuperModFeaturePackage.GROUP_MEMBERSHIP__GROUPED_FEATURE:
				if (groupedFeature != null)
					msgs = ((InternalEObject)groupedFeature).eInverseRemove(this, SuperModFeaturePackage.FEATURE__GROUPED_BY, Feature.class, msgs);
				return basicSetGroupedFeature((Feature)otherEnd, msgs);
			case SuperModFeaturePackage.GROUP_MEMBERSHIP__GROUP:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetGroup((FeatureGroup)otherEnd, msgs);
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
			case SuperModFeaturePackage.GROUP_MEMBERSHIP__GROUPED_FEATURE:
				return basicSetGroupedFeature(null, msgs);
			case SuperModFeaturePackage.GROUP_MEMBERSHIP__GROUP:
				return basicSetGroup(null, msgs);
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
			case SuperModFeaturePackage.GROUP_MEMBERSHIP__GROUP:
				return eInternalContainer().eInverseRemove(this, SuperModFeaturePackage.FEATURE_GROUP__GROUPED_FEATURES, FeatureGroup.class, msgs);
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
			case SuperModFeaturePackage.GROUP_MEMBERSHIP__GROUPED_FEATURE:
				if (resolve) return getGroupedFeature();
				return basicGetGroupedFeature();
			case SuperModFeaturePackage.GROUP_MEMBERSHIP__GROUP:
				return getGroup();
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
			case SuperModFeaturePackage.GROUP_MEMBERSHIP__GROUPED_FEATURE:
				setGroupedFeature((Feature)newValue);
				return;
			case SuperModFeaturePackage.GROUP_MEMBERSHIP__GROUP:
				setGroup((FeatureGroup)newValue);
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
			case SuperModFeaturePackage.GROUP_MEMBERSHIP__GROUPED_FEATURE:
				setGroupedFeature((Feature)null);
				return;
			case SuperModFeaturePackage.GROUP_MEMBERSHIP__GROUP:
				setGroup((FeatureGroup)null);
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
			case SuperModFeaturePackage.GROUP_MEMBERSHIP__GROUPED_FEATURE:
				return groupedFeature != null;
			case SuperModFeaturePackage.GROUP_MEMBERSHIP__GROUP:
				return getGroup() != null;
		}
		return super.eIsSet(featureID);
	}

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.mm.core.impl.HybridElementImpl#getLowLevelConcepts()
	 */
	@Override
	public EList<RuleBaseElement> getLowLevelConcepts() {
		return ECollections.emptyEList();
	}

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.mm.core.impl.HybridElementImpl#basicGetSuperHybridElement()
	 */
	@Override
	public HybridElement basicGetSuperHybridElement() {
		return getGroup();
	}

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.mm.core.impl.HybridElementImpl#getSubHybridElements()
	 */
	@Override
	public EList<HybridElement> getSubHybridElements() {
		return ECollections.emptyEList();
	}

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.mm.core.impl.HybridElementImpl#getCrossReferencedHybridElements()
	 */
	@Override
	public EList<HybridElement> getCrossReferencedHybridElements() {
		if (getGroupedFeature() != null) {
			return ECollections.singletonEList(getGroupedFeature());
		}
		return ECollections.emptyEList();
	}

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.mm.core.impl.HybridElementImpl#getCrossReferencingHybridElements()
	 */
	@Override
	public EList<HybridElement> getCrossReferencingHybridElements() {
		return ECollections.emptyEList();
	}

} //GroupMembershipImpl
