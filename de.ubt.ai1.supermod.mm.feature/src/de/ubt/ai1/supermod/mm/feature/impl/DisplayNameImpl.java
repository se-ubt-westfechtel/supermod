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
import de.ubt.ai1.supermod.mm.feature.DisplayName;
import de.ubt.ai1.supermod.mm.feature.Feature;
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
 * An implementation of the model object '<em><b>Display Name</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai1.supermod.mm.feature.impl.DisplayNameImpl#getDisplayName <em>Display Name</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.feature.impl.DisplayNameImpl#getFeature <em>Feature</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DisplayNameImpl extends HybridElementImpl implements DisplayName {
	/**
	 * The default value of the '{@link #getDisplayName() <em>Display Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayName()
	 * @generated
	 * @ordered
	 */
	protected static final String DISPLAY_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDisplayName() <em>Display Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayName()
	 * @generated
	 * @ordered
	 */
	protected String displayName = DISPLAY_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DisplayNameImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SuperModFeaturePackage.Literals.DISPLAY_NAME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDisplayName() {
		return displayName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisplayName(String newDisplayName) {
		String oldDisplayName = displayName;
		displayName = newDisplayName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SuperModFeaturePackage.DISPLAY_NAME__DISPLAY_NAME, oldDisplayName, displayName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature getFeature() {
		if (eContainerFeatureID() != SuperModFeaturePackage.DISPLAY_NAME__FEATURE) return null;
		return (Feature)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFeature(Feature newFeature, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newFeature, SuperModFeaturePackage.DISPLAY_NAME__FEATURE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeature(Feature newFeature) {
		if (newFeature != eInternalContainer() || (eContainerFeatureID() != SuperModFeaturePackage.DISPLAY_NAME__FEATURE && newFeature != null)) {
			if (EcoreUtil.isAncestor(this, newFeature))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newFeature != null)
				msgs = ((InternalEObject)newFeature).eInverseAdd(this, SuperModFeaturePackage.FEATURE__NAMES, Feature.class, msgs);
			msgs = basicSetFeature(newFeature, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SuperModFeaturePackage.DISPLAY_NAME__FEATURE, newFeature, newFeature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SuperModFeaturePackage.DISPLAY_NAME__FEATURE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetFeature((Feature)otherEnd, msgs);
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
			case SuperModFeaturePackage.DISPLAY_NAME__FEATURE:
				return basicSetFeature(null, msgs);
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
			case SuperModFeaturePackage.DISPLAY_NAME__FEATURE:
				return eInternalContainer().eInverseRemove(this, SuperModFeaturePackage.FEATURE__NAMES, Feature.class, msgs);
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
			case SuperModFeaturePackage.DISPLAY_NAME__DISPLAY_NAME:
				return getDisplayName();
			case SuperModFeaturePackage.DISPLAY_NAME__FEATURE:
				return getFeature();
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
			case SuperModFeaturePackage.DISPLAY_NAME__DISPLAY_NAME:
				setDisplayName((String)newValue);
				return;
			case SuperModFeaturePackage.DISPLAY_NAME__FEATURE:
				setFeature((Feature)newValue);
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
			case SuperModFeaturePackage.DISPLAY_NAME__DISPLAY_NAME:
				setDisplayName(DISPLAY_NAME_EDEFAULT);
				return;
			case SuperModFeaturePackage.DISPLAY_NAME__FEATURE:
				setFeature((Feature)null);
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
			case SuperModFeaturePackage.DISPLAY_NAME__DISPLAY_NAME:
				return DISPLAY_NAME_EDEFAULT == null ? displayName != null : !DISPLAY_NAME_EDEFAULT.equals(displayName);
			case SuperModFeaturePackage.DISPLAY_NAME__FEATURE:
				return getFeature() != null;
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
		return getDisplayName();
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
		return getFeature();
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
		return ECollections.emptyEList();
	}

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.mm.core.impl.HybridElementImpl#getCrossReferencingHybridElements()
	 */
	@Override
	public EList<HybridElement> getCrossReferencingHybridElements() {
		return ECollections.emptyEList();
	}

} //DisplayNameImpl
