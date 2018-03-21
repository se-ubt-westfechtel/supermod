/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.mm.revision.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Set;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import de.ubt.ai1.supermod.mm.core.DefaultBinding;
import de.ubt.ai1.supermod.mm.core.Invariant;
import de.ubt.ai1.supermod.mm.core.Option;
import de.ubt.ai1.supermod.mm.core.OptionBinding;
import de.ubt.ai1.supermod.mm.core.Preference;
import de.ubt.ai1.supermod.mm.core.Tristate;
import de.ubt.ai1.supermod.mm.core.VersionSpaceElement;
import de.ubt.ai1.supermod.mm.core.impl.VersionDimensionImpl;
import de.ubt.ai1.supermod.mm.revision.Revision;
import de.ubt.ai1.supermod.mm.revision.RevisionDimension;
import de.ubt.ai1.supermod.mm.revision.SuperModRevisionPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Revision Dimension</b></em>'.
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date 	2014-07-25
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai1.supermod.mm.revision.impl.RevisionDimensionImpl#getRevisions <em>Revisions</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.revision.impl.RevisionDimensionImpl#getInitialRevision <em>Initial Revision</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.revision.impl.RevisionDimensionImpl#getInitialRevisionInvariant <em>Initial Revision Invariant</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.revision.impl.RevisionDimensionImpl#getLatestRevisionNumber <em>Latest Revision Number</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.revision.impl.RevisionDimensionImpl#getHead <em>Head</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RevisionDimensionImpl extends VersionDimensionImpl implements RevisionDimension {
	/**
	 * The cached value of the '{@link #getRevisions() <em>Revisions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRevisions()
	 * @generated
	 * @ordered
	 */
	protected EList<Revision> revisions;
	/**
	 * The cached value of the '{@link #getInitialRevision() <em>Initial Revision</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialRevision()
	 * @generated
	 * @ordered
	 */
	protected Revision initialRevision;
	/**
	 * The cached value of the '{@link #getInitialRevisionInvariant() <em>Initial Revision Invariant</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialRevisionInvariant()
	 * @generated
	 * @ordered
	 */
	protected Invariant initialRevisionInvariant;
	/**
	 * The default value of the '{@link #getLatestRevisionNumber() <em>Latest Revision Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLatestRevisionNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int LATEST_REVISION_NUMBER_EDEFAULT = 0;
	/**
	 * The cached value of the '{@link #getLatestRevisionNumber() <em>Latest Revision Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLatestRevisionNumber()
	 * @generated
	 * @ordered
	 */
	protected int latestRevisionNumber = LATEST_REVISION_NUMBER_EDEFAULT;
	/**
	 * The cached value of the '{@link #getHead() <em>Head</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHead()
	 * @generated
	 * @ordered
	 */
	protected Revision head;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RevisionDimensionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SuperModRevisionPackage.Literals.REVISION_DIMENSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Revision> getRevisions() {
		if (revisions == null) {
			revisions = new EObjectContainmentEList<Revision>(Revision.class, this, SuperModRevisionPackage.REVISION_DIMENSION__REVISIONS);
		}
		return revisions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Revision getInitialRevision() {
		if (initialRevision != null && initialRevision.eIsProxy()) {
			InternalEObject oldInitialRevision = (InternalEObject)initialRevision;
			initialRevision = (Revision)eResolveProxy(oldInitialRevision);
			if (initialRevision != oldInitialRevision) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SuperModRevisionPackage.REVISION_DIMENSION__INITIAL_REVISION, oldInitialRevision, initialRevision));
			}
		}
		return initialRevision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Revision basicGetInitialRevision() {
		return initialRevision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitialRevision(Revision newInitialRevision) {
		Revision oldInitialRevision = initialRevision;
		initialRevision = newInitialRevision;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SuperModRevisionPackage.REVISION_DIMENSION__INITIAL_REVISION, oldInitialRevision, initialRevision));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Invariant getInitialRevisionInvariant() {
		return initialRevisionInvariant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInitialRevisionInvariant(Invariant newInitialRevisionInvariant, NotificationChain msgs) {
		Invariant oldInitialRevisionInvariant = initialRevisionInvariant;
		initialRevisionInvariant = newInitialRevisionInvariant;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SuperModRevisionPackage.REVISION_DIMENSION__INITIAL_REVISION_INVARIANT, oldInitialRevisionInvariant, newInitialRevisionInvariant);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitialRevisionInvariant(Invariant newInitialRevisionInvariant) {
		if (newInitialRevisionInvariant != initialRevisionInvariant) {
			NotificationChain msgs = null;
			if (initialRevisionInvariant != null)
				msgs = ((InternalEObject)initialRevisionInvariant).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SuperModRevisionPackage.REVISION_DIMENSION__INITIAL_REVISION_INVARIANT, null, msgs);
			if (newInitialRevisionInvariant != null)
				msgs = ((InternalEObject)newInitialRevisionInvariant).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SuperModRevisionPackage.REVISION_DIMENSION__INITIAL_REVISION_INVARIANT, null, msgs);
			msgs = basicSetInitialRevisionInvariant(newInitialRevisionInvariant, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SuperModRevisionPackage.REVISION_DIMENSION__INITIAL_REVISION_INVARIANT, newInitialRevisionInvariant, newInitialRevisionInvariant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Revision getHead() {
		if (head != null && head.eIsProxy()) {
			InternalEObject oldHead = (InternalEObject)head;
			head = (Revision)eResolveProxy(oldHead);
			if (head != oldHead) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SuperModRevisionPackage.REVISION_DIMENSION__HEAD, oldHead, head));
			}
		}
		return head;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Revision basicGetHead() {
		return head;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHead(Revision newHead) {
		Revision oldHead = head;
		head = newHead;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SuperModRevisionPackage.REVISION_DIMENSION__HEAD, oldHead, head));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLatestRevisionNumber() {
		return latestRevisionNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLatestRevisionNumber(int newLatestRevisionNumber) {
		int oldLatestRevisionNumber = latestRevisionNumber;
		latestRevisionNumber = newLatestRevisionNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SuperModRevisionPackage.REVISION_DIMENSION__LATEST_REVISION_NUMBER, oldLatestRevisionNumber, latestRevisionNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Revision> getRevisionsForBinding(OptionBinding binding) {
		EList<Revision> revisions = ECollections.newBasicEList();
		for (Entry<Option, Tristate> e : binding.getBoundOptions().entrySet()) {
			if (e.getValue() == Tristate.TRUE) {
				Option o = e.getKey();
				if (o.getHighLevelConcept() instanceof Revision) {
					revisions.add((Revision) o.getHighLevelConcept());
				}
			}
		}
		return ECollections.unmodifiableEList(revisions);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Revision> getLatestRevisions(EList<Revision> revisions) {
		Set<Revision> latestRevisions = new HashSet<Revision>();
		latestRevisions.addAll(revisions);
		for (Revision rev : revisions) {
			if (latestRevisions.contains(rev)) {
				latestRevisions.removeAll(rev.getAllPredecessors());
			}
		}
		return ECollections.newBasicEList(latestRevisions);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SuperModRevisionPackage.REVISION_DIMENSION__REVISIONS:
				return ((InternalEList<?>)getRevisions()).basicRemove(otherEnd, msgs);
			case SuperModRevisionPackage.REVISION_DIMENSION__INITIAL_REVISION_INVARIANT:
				return basicSetInitialRevisionInvariant(null, msgs);
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
			case SuperModRevisionPackage.REVISION_DIMENSION__REVISIONS:
				return getRevisions();
			case SuperModRevisionPackage.REVISION_DIMENSION__INITIAL_REVISION:
				if (resolve) return getInitialRevision();
				return basicGetInitialRevision();
			case SuperModRevisionPackage.REVISION_DIMENSION__INITIAL_REVISION_INVARIANT:
				return getInitialRevisionInvariant();
			case SuperModRevisionPackage.REVISION_DIMENSION__LATEST_REVISION_NUMBER:
				return getLatestRevisionNumber();
			case SuperModRevisionPackage.REVISION_DIMENSION__HEAD:
				if (resolve) return getHead();
				return basicGetHead();
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
			case SuperModRevisionPackage.REVISION_DIMENSION__INITIAL_REVISION:
				setInitialRevision((Revision)newValue);
				return;
			case SuperModRevisionPackage.REVISION_DIMENSION__INITIAL_REVISION_INVARIANT:
				setInitialRevisionInvariant((Invariant)newValue);
				return;
			case SuperModRevisionPackage.REVISION_DIMENSION__LATEST_REVISION_NUMBER:
				setLatestRevisionNumber((Integer)newValue);
				return;
			case SuperModRevisionPackage.REVISION_DIMENSION__HEAD:
				setHead((Revision)newValue);
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
			case SuperModRevisionPackage.REVISION_DIMENSION__INITIAL_REVISION:
				setInitialRevision((Revision)null);
				return;
			case SuperModRevisionPackage.REVISION_DIMENSION__INITIAL_REVISION_INVARIANT:
				setInitialRevisionInvariant((Invariant)null);
				return;
			case SuperModRevisionPackage.REVISION_DIMENSION__LATEST_REVISION_NUMBER:
				setLatestRevisionNumber(LATEST_REVISION_NUMBER_EDEFAULT);
				return;
			case SuperModRevisionPackage.REVISION_DIMENSION__HEAD:
				setHead((Revision)null);
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
			case SuperModRevisionPackage.REVISION_DIMENSION__REVISIONS:
				return revisions != null && !revisions.isEmpty();
			case SuperModRevisionPackage.REVISION_DIMENSION__INITIAL_REVISION:
				return initialRevision != null;
			case SuperModRevisionPackage.REVISION_DIMENSION__INITIAL_REVISION_INVARIANT:
				return initialRevisionInvariant != null;
			case SuperModRevisionPackage.REVISION_DIMENSION__LATEST_REVISION_NUMBER:
				return latestRevisionNumber != LATEST_REVISION_NUMBER_EDEFAULT;
			case SuperModRevisionPackage.REVISION_DIMENSION__HEAD:
				return head != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case SuperModRevisionPackage.REVISION_DIMENSION___GET_REVISIONS_FOR_BINDING__OPTIONBINDING:
				return getRevisionsForBinding((OptionBinding)arguments.get(0));
			case SuperModRevisionPackage.REVISION_DIMENSION___GET_LATEST_REVISIONS__ELIST:
				return getLatestRevisions((EList<Revision>)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (latestRevisionNumber: ");
		result.append(latestRevisionNumber);
		result.append(')');
		return result.toString();
	}

	@Override
	public EList<Option> getOptions() {
		EList<Option> options = ECollections.newBasicEList();
		for (Revision rev : getRevisions()) {
			if (rev.getRevisionOption() != null) {
				options.add(rev.getRevisionOption());
			}
		}
		return ECollections.unmodifiableEList(options);
	}

	@Override
	public EList<Invariant> getInvariants() {
		if (getInitialRevisionInvariant() != null) {
			return ECollections.singletonEList(getInitialRevisionInvariant());
		}
		return ECollections.emptyEList();
	}

	@Override
	public EList<Preference> getPreferences() {
		EList<Preference> preferences = ECollections.newBasicEList();
		for (Revision rev : getRevisions()) {
			preferences.addAll(rev.getPredecessorPreferences());
		}
		return ECollections.unmodifiableEList(preferences);
	}

	@Override
	public EList<DefaultBinding> getDefaultBindings() {
		EList<DefaultBinding> defaults = ECollections.newBasicEList();
		for (Revision rev : getRevisions()) {
			if (rev.getRevisionDefaultBinding() != null) {
				defaults.add(rev.getRevisionDefaultBinding());
			}
		}
		return ECollections.unmodifiableEList(defaults);
	}

	@Override
	public EList<VersionSpaceElement> getRootVersionSpaceElements() {
		return ECollections.unmodifiableEList(getRevisions());
	}

} //TemporalDimensionImpl
