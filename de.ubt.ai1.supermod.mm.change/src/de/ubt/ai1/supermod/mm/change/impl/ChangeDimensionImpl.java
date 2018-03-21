/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.mm.change.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import de.ubt.ai1.supermod.mm.change.Change;
import de.ubt.ai1.supermod.mm.change.ChangeDimension;
import de.ubt.ai1.supermod.mm.change.ChangeSet;
import de.ubt.ai1.supermod.mm.change.SuperModChangePackage;
import de.ubt.ai1.supermod.mm.core.DefaultBinding;
import de.ubt.ai1.supermod.mm.core.Invariant;
import de.ubt.ai1.supermod.mm.core.Option;
import de.ubt.ai1.supermod.mm.core.Preference;
import de.ubt.ai1.supermod.mm.core.VersionSpaceElement;
import de.ubt.ai1.supermod.mm.core.impl.VersionDimensionImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Change Dimension</b></em>'.
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date 	2014-07-28
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai1.supermod.mm.change.impl.ChangeDimensionImpl#getChangeSets <em>Change Sets</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ChangeDimensionImpl extends VersionDimensionImpl implements ChangeDimension {
	/**
	 * The cached value of the '{@link #getChangeSets() <em>Change Sets</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangeSets()
	 * @generated
	 * @ordered
	 */
	protected EList<ChangeSet> changeSets;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChangeDimensionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SuperModChangePackage.Literals.CHANGE_DIMENSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ChangeSet> getChangeSets() {
		if (changeSets == null) {
			changeSets = new EObjectContainmentEList<ChangeSet>(ChangeSet.class, this, SuperModChangePackage.CHANGE_DIMENSION__CHANGE_SETS);
		}
		return changeSets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SuperModChangePackage.CHANGE_DIMENSION__CHANGE_SETS:
				return ((InternalEList<?>)getChangeSets()).basicRemove(otherEnd, msgs);
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
			case SuperModChangePackage.CHANGE_DIMENSION__CHANGE_SETS:
				return getChangeSets();
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
			case SuperModChangePackage.CHANGE_DIMENSION__CHANGE_SETS:
				getChangeSets().clear();
				getChangeSets().addAll((Collection<? extends ChangeSet>)newValue);
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
			case SuperModChangePackage.CHANGE_DIMENSION__CHANGE_SETS:
				getChangeSets().clear();
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
			case SuperModChangePackage.CHANGE_DIMENSION__CHANGE_SETS:
				return changeSets != null && !changeSets.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	@Override
	public EList<Option> getOptions() {
		EList<Option> options = ECollections.newBasicEList();
		for (ChangeSet cs : getChangeSets()) {
			for (Change c : cs.getChanges()) {
				if (c.getChangeOption() != null) {
					options.add(c.getChangeOption());
				}
			}
		}
		return ECollections.unmodifiableEList(options);
	}

	@Override
	public EList<Invariant> getInvariants() {
		EList<Invariant> invariants = ECollections.newBasicEList();
		for (ChangeSet cs : getChangeSets()) {
			for (Change c : cs.getChanges()) {
				if (c.getChangeOption() != null) {
					invariants.add(c.getChangeInvariant());
				}
			}
		}
		return ECollections.unmodifiableEList(invariants);
	}

	@Override
	public EList<Preference> getPreferences() {
		EList<Preference> preferences = ECollections.newBasicEList();
		for (ChangeSet cs : getChangeSets()) {
			for (Change c : cs.getChanges()) {
				if (c.getChangePreference() != null) {
					preferences.add(c.getChangePreference());
				}
			}
		}
		return ECollections.unmodifiableEList(preferences);
	}

	@Override
	public EList<DefaultBinding> getDefaultBindings() {
		return ECollections.emptyEList();
	}

	@Override
	public EList<VersionSpaceElement> getRootVersionSpaceElements() {
		return ECollections.unmodifiableEList(getChangeSets());
	}

} //ChangeDimensionImpl
