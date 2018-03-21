/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.mm.feature.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import de.ubt.ai1.supermod.mm.core.DefaultBinding;
import de.ubt.ai1.supermod.mm.core.HybridElement;
import de.ubt.ai1.supermod.mm.core.Invariant;
import de.ubt.ai1.supermod.mm.core.Option;
import de.ubt.ai1.supermod.mm.core.OptionBinding;
import de.ubt.ai1.supermod.mm.core.Preference;
import de.ubt.ai1.supermod.mm.core.Tristate;
import de.ubt.ai1.supermod.mm.core.impl.HybridDimensionImpl;
import de.ubt.ai1.supermod.mm.feature.ChildRelationship;
import de.ubt.ai1.supermod.mm.feature.Elimination;
import de.ubt.ai1.supermod.mm.feature.Feature;
import de.ubt.ai1.supermod.mm.feature.FeatureDependency;
import de.ubt.ai1.supermod.mm.feature.FeatureGroup;
import de.ubt.ai1.supermod.mm.feature.FeatureModel;
import de.ubt.ai1.supermod.mm.feature.RootRelationship;
import de.ubt.ai1.supermod.mm.feature.SuperModFeaturePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature Model</b></em>'.
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date 	2014-07-28
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai1.supermod.mm.feature.impl.FeatureModelImpl#getRoots <em>Roots</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.feature.impl.FeatureModelImpl#getFeatures <em>Features</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FeatureModelImpl extends HybridDimensionImpl implements FeatureModel {
	/**
	 * The cached value of the '{@link #getRoots() <em>Roots</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoots()
	 * @generated
	 * @ordered
	 */
	protected EList<RootRelationship> roots;

	/**
	 * The cached value of the '{@link #getFeatures() <em>Features</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatures()
	 * @generated
	 * @ordered
	 */
	protected EList<Feature> features;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeatureModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SuperModFeaturePackage.Literals.FEATURE_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RootRelationship> getRoots() {
		if (roots == null) {
			roots = new EObjectContainmentEList<RootRelationship>(RootRelationship.class, this, SuperModFeaturePackage.FEATURE_MODEL__ROOTS);
		}
		return roots;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Feature> getFeatures() {
		if (features == null) {
			features = new EObjectContainmentWithInverseEList<Feature>(Feature.class, this, SuperModFeaturePackage.FEATURE_MODEL__FEATURES, SuperModFeaturePackage.FEATURE__FEATURE_MODEL);
		}
		return features;
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
			case SuperModFeaturePackage.FEATURE_MODEL__FEATURES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFeatures()).basicAdd(otherEnd, msgs);
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
			case SuperModFeaturePackage.FEATURE_MODEL__ROOTS:
				return ((InternalEList<?>)getRoots()).basicRemove(otherEnd, msgs);
			case SuperModFeaturePackage.FEATURE_MODEL__FEATURES:
				return ((InternalEList<?>)getFeatures()).basicRemove(otherEnd, msgs);
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
			case SuperModFeaturePackage.FEATURE_MODEL__ROOTS:
				return getRoots();
			case SuperModFeaturePackage.FEATURE_MODEL__FEATURES:
				return getFeatures();
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
			case SuperModFeaturePackage.FEATURE_MODEL__ROOTS:
				getRoots().clear();
				getRoots().addAll((Collection<? extends RootRelationship>)newValue);
				return;
			case SuperModFeaturePackage.FEATURE_MODEL__FEATURES:
				getFeatures().clear();
				getFeatures().addAll((Collection<? extends Feature>)newValue);
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
			case SuperModFeaturePackage.FEATURE_MODEL__ROOTS:
				getRoots().clear();
				return;
			case SuperModFeaturePackage.FEATURE_MODEL__FEATURES:
				getFeatures().clear();
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
			case SuperModFeaturePackage.FEATURE_MODEL__ROOTS:
				return roots != null && !roots.isEmpty();
			case SuperModFeaturePackage.FEATURE_MODEL__FEATURES:
				return features != null && !features.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	@Override
	public EList<Option> getOptions() {
		EList<Option> options = ECollections.newBasicEList();
		for (Feature f : getFeatures()) {
			if (f.getFeatureOption() != null) {
				options.add(f.getFeatureOption());
			}
		}
		return ECollections.unmodifiableEList(options);
	}

	@Override
	public EList<Invariant> getInvariants() {
		EList<Invariant> invariants = ECollections.newBasicEList();
		for (RootRelationship r : getRoots()) {
			if (r.getRootInvariant() != null) {
				invariants.add(r.getRootInvariant());
			}
		}
		for (Feature f : getFeatures()) {
			for (ChildRelationship c : f.getChildren()) {
				if (c.getParentInvariant() != null) {
					invariants.add(c.getParentInvariant());
				}
			}
			for (FeatureGroup g : f.getGroups()) {
				if (g.getGroupInvariant() != null) {
					invariants.add(g.getGroupInvariant());
				}
			}
			for (FeatureDependency d : f.getOutgoingDependencies()) {
				if (d.getDependencyInvariant() != null) {
					invariants.add(d.getDependencyInvariant());
				}
			}
		}
		return ECollections.unmodifiableEList(invariants);
	}

	@Override
	public EList<Preference> getPreferences() {
		EList<Preference> preferences = ECollections.newBasicEList();
		for (Feature f : getFeatures()) {
			for (ChildRelationship c : f.getChildren()) {
				if (c.getParentPreference() != null) {
					preferences.add(c.getParentPreference());
				}
			}
		}
		return ECollections.unmodifiableEList(preferences);
	}

	@Override
	public EList<DefaultBinding> getDefaultBindings() {
		EList<DefaultBinding> defaults = ECollections.newBasicEList();
		for (RootRelationship rr : getRoots()) {
			if (rr.getRootDefault() != null) {
				defaults.add(rr.getRootDefault());
			}
		}
		for (Feature f : getFeatures()) {
			for (Elimination el : f.getEliminations()) {
				defaults.add(el.getEliminationDefault());
			}
		}
		return ECollections.unmodifiableEList(defaults);
	}

	@Override
	public EList<HybridElement> getRootHybridElements() {
		EList<HybridElement> rootElements = ECollections.newBasicEList();
		rootElements.addAll(getFeatures());
		rootElements.addAll(getRoots());
		return ECollections.unmodifiableEList(rootElements);
	}
	
	@Override
	public OptionBinding applyCompletions(OptionBinding optionBinding) {
		OptionBinding ob = super.applyCompletions(optionBinding);
		for (Feature f : getFeatures()) {
			Tristate t = f.getTransitiveEliminationState();
			if (t != Tristate.UNKNOWN) {
				ob.bind(f.getFeatureOption(), t);
			}
		}
		return ob;
	}

} //FeatureModelImpl
