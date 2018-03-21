/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.mm.logical.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import de.ubt.ai1.supermod.mm.core.DefaultBinding;
import de.ubt.ai1.supermod.mm.core.Invariant;
import de.ubt.ai1.supermod.mm.core.Option;
import de.ubt.ai1.supermod.mm.core.Preference;
import de.ubt.ai1.supermod.mm.core.VersionSpaceElement;
import de.ubt.ai1.supermod.mm.core.impl.VersionDimensionImpl;
import de.ubt.ai1.supermod.mm.logical.LogicalDimension;
import de.ubt.ai1.supermod.mm.logical.SuperModLogicalPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Logical Dimension</b></em>'.
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date 	2014-07-25
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai1.supermod.mm.logical.impl.LogicalDimensionImpl#getLogicalOptions <em>Logical Options</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.logical.impl.LogicalDimensionImpl#getLogicalInvariants <em>Logical Invariants</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.logical.impl.LogicalDimensionImpl#getLogicalPreferences <em>Logical Preferences</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.logical.impl.LogicalDimensionImpl#getLogicalDefaults <em>Logical Defaults</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LogicalDimensionImpl extends VersionDimensionImpl implements LogicalDimension {
	/**
	 * The cached value of the '{@link #getLogicalOptions() <em>Logical Options</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogicalOptions()
	 * @generated
	 * @ordered
	 */
	protected EList<Option> logicalOptions;
	/**
	 * The cached value of the '{@link #getLogicalInvariants() <em>Logical Invariants</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogicalInvariants()
	 * @generated
	 * @ordered
	 */
	protected EList<Invariant> logicalInvariants;
	/**
	 * The cached value of the '{@link #getLogicalPreferences() <em>Logical Preferences</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogicalPreferences()
	 * @generated
	 * @ordered
	 */
	protected EList<Preference> logicalPreferences;
	/**
	 * The cached value of the '{@link #getLogicalDefaults() <em>Logical Defaults</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogicalDefaults()
	 * @generated
	 * @ordered
	 */
	protected EList<DefaultBinding> logicalDefaults;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LogicalDimensionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SuperModLogicalPackage.Literals.LOGICAL_DIMENSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Option> getLogicalOptions() {
		if (logicalOptions == null) {
			logicalOptions = new EObjectContainmentEList<Option>(Option.class, this, SuperModLogicalPackage.LOGICAL_DIMENSION__LOGICAL_OPTIONS);
		}
		return logicalOptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Invariant> getLogicalInvariants() {
		if (logicalInvariants == null) {
			logicalInvariants = new EObjectContainmentEList<Invariant>(Invariant.class, this, SuperModLogicalPackage.LOGICAL_DIMENSION__LOGICAL_INVARIANTS);
		}
		return logicalInvariants;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Preference> getLogicalPreferences() {
		if (logicalPreferences == null) {
			logicalPreferences = new EObjectContainmentEList<Preference>(Preference.class, this, SuperModLogicalPackage.LOGICAL_DIMENSION__LOGICAL_PREFERENCES);
		}
		return logicalPreferences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DefaultBinding> getLogicalDefaults() {
		if (logicalDefaults == null) {
			logicalDefaults = new EObjectContainmentEList<DefaultBinding>(DefaultBinding.class, this, SuperModLogicalPackage.LOGICAL_DIMENSION__LOGICAL_DEFAULTS);
		}
		return logicalDefaults;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SuperModLogicalPackage.LOGICAL_DIMENSION__LOGICAL_OPTIONS:
				return ((InternalEList<?>)getLogicalOptions()).basicRemove(otherEnd, msgs);
			case SuperModLogicalPackage.LOGICAL_DIMENSION__LOGICAL_INVARIANTS:
				return ((InternalEList<?>)getLogicalInvariants()).basicRemove(otherEnd, msgs);
			case SuperModLogicalPackage.LOGICAL_DIMENSION__LOGICAL_PREFERENCES:
				return ((InternalEList<?>)getLogicalPreferences()).basicRemove(otherEnd, msgs);
			case SuperModLogicalPackage.LOGICAL_DIMENSION__LOGICAL_DEFAULTS:
				return ((InternalEList<?>)getLogicalDefaults()).basicRemove(otherEnd, msgs);
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
			case SuperModLogicalPackage.LOGICAL_DIMENSION__LOGICAL_OPTIONS:
				return getLogicalOptions();
			case SuperModLogicalPackage.LOGICAL_DIMENSION__LOGICAL_INVARIANTS:
				return getLogicalInvariants();
			case SuperModLogicalPackage.LOGICAL_DIMENSION__LOGICAL_PREFERENCES:
				return getLogicalPreferences();
			case SuperModLogicalPackage.LOGICAL_DIMENSION__LOGICAL_DEFAULTS:
				return getLogicalDefaults();
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
			case SuperModLogicalPackage.LOGICAL_DIMENSION__LOGICAL_OPTIONS:
				getLogicalOptions().clear();
				getLogicalOptions().addAll((Collection<? extends Option>)newValue);
				return;
			case SuperModLogicalPackage.LOGICAL_DIMENSION__LOGICAL_INVARIANTS:
				getLogicalInvariants().clear();
				getLogicalInvariants().addAll((Collection<? extends Invariant>)newValue);
				return;
			case SuperModLogicalPackage.LOGICAL_DIMENSION__LOGICAL_PREFERENCES:
				getLogicalPreferences().clear();
				getLogicalPreferences().addAll((Collection<? extends Preference>)newValue);
				return;
			case SuperModLogicalPackage.LOGICAL_DIMENSION__LOGICAL_DEFAULTS:
				getLogicalDefaults().clear();
				getLogicalDefaults().addAll((Collection<? extends DefaultBinding>)newValue);
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
			case SuperModLogicalPackage.LOGICAL_DIMENSION__LOGICAL_OPTIONS:
				getLogicalOptions().clear();
				return;
			case SuperModLogicalPackage.LOGICAL_DIMENSION__LOGICAL_INVARIANTS:
				getLogicalInvariants().clear();
				return;
			case SuperModLogicalPackage.LOGICAL_DIMENSION__LOGICAL_PREFERENCES:
				getLogicalPreferences().clear();
				return;
			case SuperModLogicalPackage.LOGICAL_DIMENSION__LOGICAL_DEFAULTS:
				getLogicalDefaults().clear();
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
			case SuperModLogicalPackage.LOGICAL_DIMENSION__LOGICAL_OPTIONS:
				return logicalOptions != null && !logicalOptions.isEmpty();
			case SuperModLogicalPackage.LOGICAL_DIMENSION__LOGICAL_INVARIANTS:
				return logicalInvariants != null && !logicalInvariants.isEmpty();
			case SuperModLogicalPackage.LOGICAL_DIMENSION__LOGICAL_PREFERENCES:
				return logicalPreferences != null && !logicalPreferences.isEmpty();
			case SuperModLogicalPackage.LOGICAL_DIMENSION__LOGICAL_DEFAULTS:
				return logicalDefaults != null && !logicalDefaults.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	@Override
	public EList<Option> getOptions() {
		return ECollections.unmodifiableEList(getLogicalOptions());
	}

	@Override
	public EList<Invariant> getInvariants() {
		return ECollections.unmodifiableEList(getLogicalInvariants());
	}

	@Override
	public EList<Preference> getPreferences() {
		return ECollections.unmodifiableEList(getLogicalPreferences());
	}

	@Override
	public EList<DefaultBinding> getDefaultBindings() {
		return ECollections.unmodifiableEList(getLogicalDefaults());
	}

	@Override
	public EList<VersionSpaceElement> getRootVersionSpaceElements() {
		return ECollections.emptyEList();
	}

} //LogicalDimensionImpl
