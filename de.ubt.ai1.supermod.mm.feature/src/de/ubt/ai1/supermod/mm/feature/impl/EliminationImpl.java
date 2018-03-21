/**
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package de.ubt.ai1.supermod.mm.feature.impl;

import de.ubt.ai1.supermod.mm.core.DefaultBinding;
import de.ubt.ai1.supermod.mm.core.HybridElement;
import de.ubt.ai1.supermod.mm.core.Invariant;
import de.ubt.ai1.supermod.mm.core.RuleBaseElement;
import de.ubt.ai1.supermod.mm.core.Tristate;
import de.ubt.ai1.supermod.mm.core.impl.HybridElementImpl;
import de.ubt.ai1.supermod.mm.feature.Elimination;
import de.ubt.ai1.supermod.mm.feature.Feature;
import de.ubt.ai1.supermod.mm.feature.SuperModFeaturePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Elimination</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai1.supermod.mm.feature.impl.EliminationImpl#getFeature <em>Feature</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.feature.impl.EliminationImpl#getDefaultSelection <em>Default Selection</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.feature.impl.EliminationImpl#getEliminationInvariant <em>Elimination Invariant</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.feature.impl.EliminationImpl#getEliminationDefault <em>Elimination Default</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EliminationImpl extends HybridElementImpl implements Elimination {
	/**
	 * The default value of the '{@link #getDefaultSelection() <em>Default Selection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultSelection()
	 * @generated
	 * @ordered
	 */
	protected static final Tristate DEFAULT_SELECTION_EDEFAULT = Tristate.UNKNOWN;

	/**
	 * The cached value of the '{@link #getDefaultSelection() <em>Default Selection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultSelection()
	 * @generated
	 * @ordered
	 */
	protected Tristate defaultSelection = DEFAULT_SELECTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEliminationInvariant() <em>Elimination Invariant</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEliminationInvariant()
	 * @generated
	 * @ordered
	 */
	protected Invariant eliminationInvariant;

	/**
	 * The cached value of the '{@link #getEliminationDefault() <em>Elimination Default</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEliminationDefault()
	 * @generated
	 * @ordered
	 */
	protected DefaultBinding eliminationDefault;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EliminationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SuperModFeaturePackage.Literals.ELIMINATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature getFeature() {
		if (eContainerFeatureID() != SuperModFeaturePackage.ELIMINATION__FEATURE) return null;
		return (Feature)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFeature(Feature newFeature, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newFeature, SuperModFeaturePackage.ELIMINATION__FEATURE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeature(Feature newFeature) {
		if (newFeature != eInternalContainer() || (eContainerFeatureID() != SuperModFeaturePackage.ELIMINATION__FEATURE && newFeature != null)) {
			if (EcoreUtil.isAncestor(this, newFeature))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newFeature != null)
				msgs = ((InternalEObject)newFeature).eInverseAdd(this, SuperModFeaturePackage.FEATURE__ELIMINATIONS, Feature.class, msgs);
			msgs = basicSetFeature(newFeature, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SuperModFeaturePackage.ELIMINATION__FEATURE, newFeature, newFeature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tristate getDefaultSelection() {
		return defaultSelection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultSelection(Tristate newDefaultSelection) {
		Tristate oldDefaultSelection = defaultSelection;
		defaultSelection = newDefaultSelection == null ? DEFAULT_SELECTION_EDEFAULT : newDefaultSelection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SuperModFeaturePackage.ELIMINATION__DEFAULT_SELECTION, oldDefaultSelection, defaultSelection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Invariant getEliminationInvariant() {
		return eliminationInvariant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEliminationInvariant(Invariant newEliminationInvariant, NotificationChain msgs) {
		Invariant oldEliminationInvariant = eliminationInvariant;
		eliminationInvariant = newEliminationInvariant;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SuperModFeaturePackage.ELIMINATION__ELIMINATION_INVARIANT, oldEliminationInvariant, newEliminationInvariant);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEliminationInvariant(Invariant newEliminationInvariant) {
		if (newEliminationInvariant != eliminationInvariant) {
			NotificationChain msgs = null;
			if (eliminationInvariant != null)
				msgs = ((InternalEObject)eliminationInvariant).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SuperModFeaturePackage.ELIMINATION__ELIMINATION_INVARIANT, null, msgs);
			if (newEliminationInvariant != null)
				msgs = ((InternalEObject)newEliminationInvariant).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SuperModFeaturePackage.ELIMINATION__ELIMINATION_INVARIANT, null, msgs);
			msgs = basicSetEliminationInvariant(newEliminationInvariant, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SuperModFeaturePackage.ELIMINATION__ELIMINATION_INVARIANT, newEliminationInvariant, newEliminationInvariant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefaultBinding getEliminationDefault() {
		return eliminationDefault;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEliminationDefault(DefaultBinding newEliminationDefault, NotificationChain msgs) {
		DefaultBinding oldEliminationDefault = eliminationDefault;
		eliminationDefault = newEliminationDefault;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SuperModFeaturePackage.ELIMINATION__ELIMINATION_DEFAULT, oldEliminationDefault, newEliminationDefault);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEliminationDefault(DefaultBinding newEliminationDefault) {
		if (newEliminationDefault != eliminationDefault) {
			NotificationChain msgs = null;
			if (eliminationDefault != null)
				msgs = ((InternalEObject)eliminationDefault).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SuperModFeaturePackage.ELIMINATION__ELIMINATION_DEFAULT, null, msgs);
			if (newEliminationDefault != null)
				msgs = ((InternalEObject)newEliminationDefault).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SuperModFeaturePackage.ELIMINATION__ELIMINATION_DEFAULT, null, msgs);
			msgs = basicSetEliminationDefault(newEliminationDefault, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SuperModFeaturePackage.ELIMINATION__ELIMINATION_DEFAULT, newEliminationDefault, newEliminationDefault));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SuperModFeaturePackage.ELIMINATION__FEATURE:
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
			case SuperModFeaturePackage.ELIMINATION__FEATURE:
				return basicSetFeature(null, msgs);
			case SuperModFeaturePackage.ELIMINATION__ELIMINATION_INVARIANT:
				return basicSetEliminationInvariant(null, msgs);
			case SuperModFeaturePackage.ELIMINATION__ELIMINATION_DEFAULT:
				return basicSetEliminationDefault(null, msgs);
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
			case SuperModFeaturePackage.ELIMINATION__FEATURE:
				return eInternalContainer().eInverseRemove(this, SuperModFeaturePackage.FEATURE__ELIMINATIONS, Feature.class, msgs);
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
			case SuperModFeaturePackage.ELIMINATION__FEATURE:
				return getFeature();
			case SuperModFeaturePackage.ELIMINATION__DEFAULT_SELECTION:
				return getDefaultSelection();
			case SuperModFeaturePackage.ELIMINATION__ELIMINATION_INVARIANT:
				return getEliminationInvariant();
			case SuperModFeaturePackage.ELIMINATION__ELIMINATION_DEFAULT:
				return getEliminationDefault();
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
			case SuperModFeaturePackage.ELIMINATION__FEATURE:
				setFeature((Feature)newValue);
				return;
			case SuperModFeaturePackage.ELIMINATION__DEFAULT_SELECTION:
				setDefaultSelection((Tristate)newValue);
				return;
			case SuperModFeaturePackage.ELIMINATION__ELIMINATION_INVARIANT:
				setEliminationInvariant((Invariant)newValue);
				return;
			case SuperModFeaturePackage.ELIMINATION__ELIMINATION_DEFAULT:
				setEliminationDefault((DefaultBinding)newValue);
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
			case SuperModFeaturePackage.ELIMINATION__FEATURE:
				setFeature((Feature)null);
				return;
			case SuperModFeaturePackage.ELIMINATION__DEFAULT_SELECTION:
				setDefaultSelection(DEFAULT_SELECTION_EDEFAULT);
				return;
			case SuperModFeaturePackage.ELIMINATION__ELIMINATION_INVARIANT:
				setEliminationInvariant((Invariant)null);
				return;
			case SuperModFeaturePackage.ELIMINATION__ELIMINATION_DEFAULT:
				setEliminationDefault((DefaultBinding)null);
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
			case SuperModFeaturePackage.ELIMINATION__FEATURE:
				return getFeature() != null;
			case SuperModFeaturePackage.ELIMINATION__DEFAULT_SELECTION:
				return defaultSelection != DEFAULT_SELECTION_EDEFAULT;
			case SuperModFeaturePackage.ELIMINATION__ELIMINATION_INVARIANT:
				return eliminationInvariant != null;
			case SuperModFeaturePackage.ELIMINATION__ELIMINATION_DEFAULT:
				return eliminationDefault != null;
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
		result.append(" (defaultSelection: ");
		result.append(defaultSelection);
		result.append(')');
		return result.toString();
	}
	

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.mm.core.impl.HybridElementImpl#getLowLevelConcepts()
	 */
	@Override
	public EList<RuleBaseElement> getLowLevelConcepts() {
		EList<RuleBaseElement> llc = new BasicEList<>();
		if (getEliminationDefault() != null) {
			llc.add(getEliminationDefault());
		}
		if (getEliminationInvariant() != null) {
			llc.add(getEliminationInvariant());
		}
		return llc;
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

} //EliminationImpl
