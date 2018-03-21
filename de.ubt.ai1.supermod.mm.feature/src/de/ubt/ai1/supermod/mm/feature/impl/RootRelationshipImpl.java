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

import de.ubt.ai1.supermod.mm.core.DefaultBinding;
import de.ubt.ai1.supermod.mm.core.HybridElement;
import de.ubt.ai1.supermod.mm.core.Invariant;
import de.ubt.ai1.supermod.mm.core.RuleBaseElement;
import de.ubt.ai1.supermod.mm.core.impl.HybridElementImpl;
import de.ubt.ai1.supermod.mm.feature.Feature;
import de.ubt.ai1.supermod.mm.feature.RootRelationship;
import de.ubt.ai1.supermod.mm.feature.SuperModFeaturePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Root Relationship</b></em>'.
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date 	2014-07-28
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai1.supermod.mm.feature.impl.RootRelationshipImpl#getRootInvariant <em>Root Invariant</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.feature.impl.RootRelationshipImpl#getRootDefault <em>Root Default</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.feature.impl.RootRelationshipImpl#getFeature <em>Feature</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RootRelationshipImpl extends HybridElementImpl implements RootRelationship {
	/**
	 * The cached value of the '{@link #getRootInvariant() <em>Root Invariant</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRootInvariant()
	 * @generated
	 * @ordered
	 */
	protected Invariant rootInvariant;

	/**
	 * The cached value of the '{@link #getRootDefault() <em>Root Default</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRootDefault()
	 * @generated
	 * @ordered
	 */
	protected DefaultBinding rootDefault;

	/**
	 * The cached value of the '{@link #getFeature() <em>Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeature()
	 * @generated
	 * @ordered
	 */
	protected Feature feature;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RootRelationshipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SuperModFeaturePackage.Literals.ROOT_RELATIONSHIP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Invariant getRootInvariant() {
		return rootInvariant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRootInvariant(Invariant newRootInvariant, NotificationChain msgs) {
		Invariant oldRootInvariant = rootInvariant;
		rootInvariant = newRootInvariant;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SuperModFeaturePackage.ROOT_RELATIONSHIP__ROOT_INVARIANT, oldRootInvariant, newRootInvariant);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRootInvariant(Invariant newRootInvariant) {
		if (newRootInvariant != rootInvariant) {
			NotificationChain msgs = null;
			if (rootInvariant != null)
				msgs = ((InternalEObject)rootInvariant).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SuperModFeaturePackage.ROOT_RELATIONSHIP__ROOT_INVARIANT, null, msgs);
			if (newRootInvariant != null)
				msgs = ((InternalEObject)newRootInvariant).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SuperModFeaturePackage.ROOT_RELATIONSHIP__ROOT_INVARIANT, null, msgs);
			msgs = basicSetRootInvariant(newRootInvariant, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SuperModFeaturePackage.ROOT_RELATIONSHIP__ROOT_INVARIANT, newRootInvariant, newRootInvariant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefaultBinding getRootDefault() {
		return rootDefault;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRootDefault(DefaultBinding newRootDefault, NotificationChain msgs) {
		DefaultBinding oldRootDefault = rootDefault;
		rootDefault = newRootDefault;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SuperModFeaturePackage.ROOT_RELATIONSHIP__ROOT_DEFAULT, oldRootDefault, newRootDefault);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRootDefault(DefaultBinding newRootDefault) {
		if (newRootDefault != rootDefault) {
			NotificationChain msgs = null;
			if (rootDefault != null)
				msgs = ((InternalEObject)rootDefault).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SuperModFeaturePackage.ROOT_RELATIONSHIP__ROOT_DEFAULT, null, msgs);
			if (newRootDefault != null)
				msgs = ((InternalEObject)newRootDefault).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SuperModFeaturePackage.ROOT_RELATIONSHIP__ROOT_DEFAULT, null, msgs);
			msgs = basicSetRootDefault(newRootDefault, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SuperModFeaturePackage.ROOT_RELATIONSHIP__ROOT_DEFAULT, newRootDefault, newRootDefault));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature getFeature() {
		if (feature != null && feature.eIsProxy()) {
			InternalEObject oldFeature = (InternalEObject)feature;
			feature = (Feature)eResolveProxy(oldFeature);
			if (feature != oldFeature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SuperModFeaturePackage.ROOT_RELATIONSHIP__FEATURE, oldFeature, feature));
			}
		}
		return feature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature basicGetFeature() {
		return feature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFeature(Feature newFeature, NotificationChain msgs) {
		Feature oldFeature = feature;
		feature = newFeature;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SuperModFeaturePackage.ROOT_RELATIONSHIP__FEATURE, oldFeature, newFeature);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeature(Feature newFeature) {
		if (newFeature != feature) {
			NotificationChain msgs = null;
			if (feature != null)
				msgs = ((InternalEObject)feature).eInverseRemove(this, SuperModFeaturePackage.FEATURE__INCOMING_ROOTS, Feature.class, msgs);
			if (newFeature != null)
				msgs = ((InternalEObject)newFeature).eInverseAdd(this, SuperModFeaturePackage.FEATURE__INCOMING_ROOTS, Feature.class, msgs);
			msgs = basicSetFeature(newFeature, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SuperModFeaturePackage.ROOT_RELATIONSHIP__FEATURE, newFeature, newFeature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SuperModFeaturePackage.ROOT_RELATIONSHIP__FEATURE:
				if (feature != null)
					msgs = ((InternalEObject)feature).eInverseRemove(this, SuperModFeaturePackage.FEATURE__INCOMING_ROOTS, Feature.class, msgs);
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
			case SuperModFeaturePackage.ROOT_RELATIONSHIP__ROOT_INVARIANT:
				return basicSetRootInvariant(null, msgs);
			case SuperModFeaturePackage.ROOT_RELATIONSHIP__ROOT_DEFAULT:
				return basicSetRootDefault(null, msgs);
			case SuperModFeaturePackage.ROOT_RELATIONSHIP__FEATURE:
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SuperModFeaturePackage.ROOT_RELATIONSHIP__ROOT_INVARIANT:
				return getRootInvariant();
			case SuperModFeaturePackage.ROOT_RELATIONSHIP__ROOT_DEFAULT:
				return getRootDefault();
			case SuperModFeaturePackage.ROOT_RELATIONSHIP__FEATURE:
				if (resolve) return getFeature();
				return basicGetFeature();
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
			case SuperModFeaturePackage.ROOT_RELATIONSHIP__ROOT_INVARIANT:
				setRootInvariant((Invariant)newValue);
				return;
			case SuperModFeaturePackage.ROOT_RELATIONSHIP__ROOT_DEFAULT:
				setRootDefault((DefaultBinding)newValue);
				return;
			case SuperModFeaturePackage.ROOT_RELATIONSHIP__FEATURE:
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
			case SuperModFeaturePackage.ROOT_RELATIONSHIP__ROOT_INVARIANT:
				setRootInvariant((Invariant)null);
				return;
			case SuperModFeaturePackage.ROOT_RELATIONSHIP__ROOT_DEFAULT:
				setRootDefault((DefaultBinding)null);
				return;
			case SuperModFeaturePackage.ROOT_RELATIONSHIP__FEATURE:
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
			case SuperModFeaturePackage.ROOT_RELATIONSHIP__ROOT_INVARIANT:
				return rootInvariant != null;
			case SuperModFeaturePackage.ROOT_RELATIONSHIP__ROOT_DEFAULT:
				return rootDefault != null;
			case SuperModFeaturePackage.ROOT_RELATIONSHIP__FEATURE:
				return feature != null;
		}
		return super.eIsSet(featureID);
	}

	@Override
	public EList<RuleBaseElement> getLowLevelConcepts() {
		EList<RuleBaseElement> lowLevelConcepts = ECollections.newBasicEList();
		if (getRootInvariant() != null) {
			lowLevelConcepts.add(getRootInvariant());
		}
		if (getRootDefault() != null) {
			lowLevelConcepts.add(getRootDefault());
		}
		return lowLevelConcepts;
	}

	@Override
	public HybridElement basicGetSuperHybridElement() {
		return null;
	}

	@Override
	public EList<HybridElement> getSubHybridElements() {
		return ECollections.emptyEList();
	}

	@Override
	public EList<HybridElement> getCrossReferencedHybridElements() {
		if (getFeature() != null) {
			return ECollections.singletonEList(getFeature());
		}
		return ECollections.emptyEList();
	}
	
	@Override
	public EList<HybridElement> getCrossReferencingHybridElements() {
		return ECollections.emptyEList();
	}

} //RootRelationshipImpl
