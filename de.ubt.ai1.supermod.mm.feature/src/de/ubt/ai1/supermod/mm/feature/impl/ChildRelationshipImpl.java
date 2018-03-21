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
import de.ubt.ai1.supermod.mm.core.Preference;
import de.ubt.ai1.supermod.mm.core.RuleBaseElement;
import de.ubt.ai1.supermod.mm.core.impl.HybridElementImpl;
import de.ubt.ai1.supermod.mm.feature.ChildRelationship;
import de.ubt.ai1.supermod.mm.feature.Feature;
import de.ubt.ai1.supermod.mm.feature.SuperModFeaturePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Child Relationship</b></em>'.
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date 	2014-07-28
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai1.supermod.mm.feature.impl.ChildRelationshipImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.feature.impl.ChildRelationshipImpl#getChild <em>Child</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.feature.impl.ChildRelationshipImpl#getParentInvariant <em>Parent Invariant</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.feature.impl.ChildRelationshipImpl#getParentPreference <em>Parent Preference</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ChildRelationshipImpl extends HybridElementImpl implements ChildRelationship {
	/**
	 * The cached value of the '{@link #getChild() <em>Child</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChild()
	 * @generated
	 * @ordered
	 */
	protected Feature child;

	/**
	 * The cached value of the '{@link #getParentInvariant() <em>Parent Invariant</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentInvariant()
	 * @generated
	 * @ordered
	 */
	protected Invariant parentInvariant;

	/**
	 * The cached value of the '{@link #getParentPreference() <em>Parent Preference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentPreference()
	 * @generated
	 * @ordered
	 */
	protected Preference parentPreference;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChildRelationshipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SuperModFeaturePackage.Literals.CHILD_RELATIONSHIP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature getParent() {
		if (eContainerFeatureID() != SuperModFeaturePackage.CHILD_RELATIONSHIP__PARENT) return null;
		return (Feature)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(Feature newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, SuperModFeaturePackage.CHILD_RELATIONSHIP__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(Feature newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != SuperModFeaturePackage.CHILD_RELATIONSHIP__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, SuperModFeaturePackage.FEATURE__CHILDREN, Feature.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SuperModFeaturePackage.CHILD_RELATIONSHIP__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature getChild() {
		if (child != null && child.eIsProxy()) {
			InternalEObject oldChild = (InternalEObject)child;
			child = (Feature)eResolveProxy(oldChild);
			if (child != oldChild) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SuperModFeaturePackage.CHILD_RELATIONSHIP__CHILD, oldChild, child));
			}
		}
		return child;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature basicGetChild() {
		return child;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChild(Feature newChild, NotificationChain msgs) {
		Feature oldChild = child;
		child = newChild;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SuperModFeaturePackage.CHILD_RELATIONSHIP__CHILD, oldChild, newChild);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChild(Feature newChild) {
		if (newChild != child) {
			NotificationChain msgs = null;
			if (child != null)
				msgs = ((InternalEObject)child).eInverseRemove(this, SuperModFeaturePackage.FEATURE__PARENTS, Feature.class, msgs);
			if (newChild != null)
				msgs = ((InternalEObject)newChild).eInverseAdd(this, SuperModFeaturePackage.FEATURE__PARENTS, Feature.class, msgs);
			msgs = basicSetChild(newChild, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SuperModFeaturePackage.CHILD_RELATIONSHIP__CHILD, newChild, newChild));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Invariant getParentInvariant() {
		return parentInvariant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentInvariant(Invariant newParentInvariant, NotificationChain msgs) {
		Invariant oldParentInvariant = parentInvariant;
		parentInvariant = newParentInvariant;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SuperModFeaturePackage.CHILD_RELATIONSHIP__PARENT_INVARIANT, oldParentInvariant, newParentInvariant);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentInvariant(Invariant newParentInvariant) {
		if (newParentInvariant != parentInvariant) {
			NotificationChain msgs = null;
			if (parentInvariant != null)
				msgs = ((InternalEObject)parentInvariant).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SuperModFeaturePackage.CHILD_RELATIONSHIP__PARENT_INVARIANT, null, msgs);
			if (newParentInvariant != null)
				msgs = ((InternalEObject)newParentInvariant).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SuperModFeaturePackage.CHILD_RELATIONSHIP__PARENT_INVARIANT, null, msgs);
			msgs = basicSetParentInvariant(newParentInvariant, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SuperModFeaturePackage.CHILD_RELATIONSHIP__PARENT_INVARIANT, newParentInvariant, newParentInvariant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Preference getParentPreference() {
		return parentPreference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentPreference(Preference newParentPreference, NotificationChain msgs) {
		Preference oldParentPreference = parentPreference;
		parentPreference = newParentPreference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SuperModFeaturePackage.CHILD_RELATIONSHIP__PARENT_PREFERENCE, oldParentPreference, newParentPreference);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentPreference(Preference newParentPreference) {
		if (newParentPreference != parentPreference) {
			NotificationChain msgs = null;
			if (parentPreference != null)
				msgs = ((InternalEObject)parentPreference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SuperModFeaturePackage.CHILD_RELATIONSHIP__PARENT_PREFERENCE, null, msgs);
			if (newParentPreference != null)
				msgs = ((InternalEObject)newParentPreference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SuperModFeaturePackage.CHILD_RELATIONSHIP__PARENT_PREFERENCE, null, msgs);
			msgs = basicSetParentPreference(newParentPreference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SuperModFeaturePackage.CHILD_RELATIONSHIP__PARENT_PREFERENCE, newParentPreference, newParentPreference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SuperModFeaturePackage.CHILD_RELATIONSHIP__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((Feature)otherEnd, msgs);
			case SuperModFeaturePackage.CHILD_RELATIONSHIP__CHILD:
				if (child != null)
					msgs = ((InternalEObject)child).eInverseRemove(this, SuperModFeaturePackage.FEATURE__PARENTS, Feature.class, msgs);
				return basicSetChild((Feature)otherEnd, msgs);
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
			case SuperModFeaturePackage.CHILD_RELATIONSHIP__PARENT:
				return basicSetParent(null, msgs);
			case SuperModFeaturePackage.CHILD_RELATIONSHIP__CHILD:
				return basicSetChild(null, msgs);
			case SuperModFeaturePackage.CHILD_RELATIONSHIP__PARENT_INVARIANT:
				return basicSetParentInvariant(null, msgs);
			case SuperModFeaturePackage.CHILD_RELATIONSHIP__PARENT_PREFERENCE:
				return basicSetParentPreference(null, msgs);
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
			case SuperModFeaturePackage.CHILD_RELATIONSHIP__PARENT:
				return eInternalContainer().eInverseRemove(this, SuperModFeaturePackage.FEATURE__CHILDREN, Feature.class, msgs);
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
			case SuperModFeaturePackage.CHILD_RELATIONSHIP__PARENT:
				return getParent();
			case SuperModFeaturePackage.CHILD_RELATIONSHIP__CHILD:
				if (resolve) return getChild();
				return basicGetChild();
			case SuperModFeaturePackage.CHILD_RELATIONSHIP__PARENT_INVARIANT:
				return getParentInvariant();
			case SuperModFeaturePackage.CHILD_RELATIONSHIP__PARENT_PREFERENCE:
				return getParentPreference();
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
			case SuperModFeaturePackage.CHILD_RELATIONSHIP__PARENT:
				setParent((Feature)newValue);
				return;
			case SuperModFeaturePackage.CHILD_RELATIONSHIP__CHILD:
				setChild((Feature)newValue);
				return;
			case SuperModFeaturePackage.CHILD_RELATIONSHIP__PARENT_INVARIANT:
				setParentInvariant((Invariant)newValue);
				return;
			case SuperModFeaturePackage.CHILD_RELATIONSHIP__PARENT_PREFERENCE:
				setParentPreference((Preference)newValue);
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
			case SuperModFeaturePackage.CHILD_RELATIONSHIP__PARENT:
				setParent((Feature)null);
				return;
			case SuperModFeaturePackage.CHILD_RELATIONSHIP__CHILD:
				setChild((Feature)null);
				return;
			case SuperModFeaturePackage.CHILD_RELATIONSHIP__PARENT_INVARIANT:
				setParentInvariant((Invariant)null);
				return;
			case SuperModFeaturePackage.CHILD_RELATIONSHIP__PARENT_PREFERENCE:
				setParentPreference((Preference)null);
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
			case SuperModFeaturePackage.CHILD_RELATIONSHIP__PARENT:
				return getParent() != null;
			case SuperModFeaturePackage.CHILD_RELATIONSHIP__CHILD:
				return child != null;
			case SuperModFeaturePackage.CHILD_RELATIONSHIP__PARENT_INVARIANT:
				return parentInvariant != null;
			case SuperModFeaturePackage.CHILD_RELATIONSHIP__PARENT_PREFERENCE:
				return parentPreference != null;
		}
		return super.eIsSet(featureID);
	}

	@Override
	public EList<RuleBaseElement> getLowLevelConcepts() {
		EList<RuleBaseElement> lowLevelConcepts = ECollections.newBasicEList();
		if (getParentInvariant() != null) {
			lowLevelConcepts.add(getParentInvariant());
		}
		if (getParentPreference() != null) {
			lowLevelConcepts.add(getParentPreference());
		}
		return lowLevelConcepts;
	}

	@Override
	public HybridElement basicGetSuperHybridElement() {
		return getParent();
	}

	@Override
	public EList<HybridElement> getSubHybridElements() {
		return ECollections.emptyEList();
	}

	@Override
	public EList<HybridElement> getCrossReferencedHybridElements() {
		if (getChild() != null) {
			return ECollections.singletonEList(getChild());
		}
		return ECollections.emptyEList();
	}
	
	@Override
	public EList<HybridElement> getCrossReferencingHybridElements() {
		return ECollections.emptyEList();
	}

} //ChildRelationshipImpl
