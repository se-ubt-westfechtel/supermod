/**
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package de.ubt.ai1.supermod.mm.collab.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
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
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import de.ubt.ai1.supermod.mm.collab.CollaborativeRevisionDimension;
import de.ubt.ai1.supermod.mm.collab.PrivateRevision;
import de.ubt.ai1.supermod.mm.collab.PublicRevision;
import de.ubt.ai1.supermod.mm.collab.Revision;
import de.ubt.ai1.supermod.mm.collab.SuperModCollabPackage;
import de.ubt.ai1.supermod.mm.core.DefaultBinding;
import de.ubt.ai1.supermod.mm.core.Invariant;
import de.ubt.ai1.supermod.mm.core.Option;
import de.ubt.ai1.supermod.mm.core.OptionBinding;
import de.ubt.ai1.supermod.mm.core.Preference;
import de.ubt.ai1.supermod.mm.core.Tristate;
import de.ubt.ai1.supermod.mm.core.VersionSpaceElement;
import de.ubt.ai1.supermod.mm.core.impl.VersionDimensionImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Collaborative Revision Dimension</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai1.supermod.mm.collab.impl.CollaborativeRevisionDimensionImpl#getPublicRevisions <em>Public Revisions</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.collab.impl.CollaborativeRevisionDimensionImpl#getInitialPublicRevision <em>Initial Public Revision</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.collab.impl.CollaborativeRevisionDimensionImpl#getInitialPublicRevisionInvariant <em>Initial Public Revision Invariant</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.collab.impl.CollaborativeRevisionDimensionImpl#getLatestPublicRevisionNumber <em>Latest Public Revision Number</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.collab.impl.CollaborativeRevisionDimensionImpl#getPublicHead <em>Public Head</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.collab.impl.CollaborativeRevisionDimensionImpl#getCurrentPublicRevision <em>Current Public Revision</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.collab.impl.CollaborativeRevisionDimensionImpl#getAllRevisions <em>All Revisions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CollaborativeRevisionDimensionImpl extends VersionDimensionImpl implements CollaborativeRevisionDimension {
	/**
	 * The cached value of the '{@link #getPublicRevisions() <em>Public Revisions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublicRevisions()
	 * @generated
	 * @ordered
	 */
	protected EList<PublicRevision> publicRevisions;

	/**
	 * The cached value of the '{@link #getInitialPublicRevision() <em>Initial Public Revision</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialPublicRevision()
	 * @generated
	 * @ordered
	 */
	protected PublicRevision initialPublicRevision;

	/**
	 * The cached value of the '{@link #getInitialPublicRevisionInvariant() <em>Initial Public Revision Invariant</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialPublicRevisionInvariant()
	 * @generated
	 * @ordered
	 */
	protected Invariant initialPublicRevisionInvariant;

	/**
	 * The default value of the '{@link #getLatestPublicRevisionNumber() <em>Latest Public Revision Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLatestPublicRevisionNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int LATEST_PUBLIC_REVISION_NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLatestPublicRevisionNumber() <em>Latest Public Revision Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLatestPublicRevisionNumber()
	 * @generated
	 * @ordered
	 */
	protected int latestPublicRevisionNumber = LATEST_PUBLIC_REVISION_NUMBER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPublicHead() <em>Public Head</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublicHead()
	 * @generated
	 * @ordered
	 */
	protected PublicRevision publicHead;

	/**
	 * The cached value of the '{@link #getCurrentPublicRevision() <em>Current Public Revision</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentPublicRevision()
	 * @generated
	 * @ordered
	 */
	protected PublicRevision currentPublicRevision;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CollaborativeRevisionDimensionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SuperModCollabPackage.Literals.COLLABORATIVE_REVISION_DIMENSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PublicRevision> getPublicRevisions() {
		if (publicRevisions == null) {
			publicRevisions = new EObjectContainmentWithInverseEList<PublicRevision>(PublicRevision.class, this, SuperModCollabPackage.COLLABORATIVE_REVISION_DIMENSION__PUBLIC_REVISIONS, SuperModCollabPackage.PUBLIC_REVISION__REVISION_DIMENSION);
		}
		return publicRevisions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PublicRevision getInitialPublicRevision() {
		if (initialPublicRevision != null && initialPublicRevision.eIsProxy()) {
			InternalEObject oldInitialPublicRevision = (InternalEObject)initialPublicRevision;
			initialPublicRevision = (PublicRevision)eResolveProxy(oldInitialPublicRevision);
			if (initialPublicRevision != oldInitialPublicRevision) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SuperModCollabPackage.COLLABORATIVE_REVISION_DIMENSION__INITIAL_PUBLIC_REVISION, oldInitialPublicRevision, initialPublicRevision));
			}
		}
		return initialPublicRevision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PublicRevision basicGetInitialPublicRevision() {
		return initialPublicRevision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitialPublicRevision(PublicRevision newInitialPublicRevision) {
		PublicRevision oldInitialPublicRevision = initialPublicRevision;
		initialPublicRevision = newInitialPublicRevision;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SuperModCollabPackage.COLLABORATIVE_REVISION_DIMENSION__INITIAL_PUBLIC_REVISION, oldInitialPublicRevision, initialPublicRevision));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Invariant getInitialPublicRevisionInvariant() {
		return initialPublicRevisionInvariant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInitialPublicRevisionInvariant(Invariant newInitialPublicRevisionInvariant, NotificationChain msgs) {
		Invariant oldInitialPublicRevisionInvariant = initialPublicRevisionInvariant;
		initialPublicRevisionInvariant = newInitialPublicRevisionInvariant;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SuperModCollabPackage.COLLABORATIVE_REVISION_DIMENSION__INITIAL_PUBLIC_REVISION_INVARIANT, oldInitialPublicRevisionInvariant, newInitialPublicRevisionInvariant);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitialPublicRevisionInvariant(Invariant newInitialPublicRevisionInvariant) {
		if (newInitialPublicRevisionInvariant != initialPublicRevisionInvariant) {
			NotificationChain msgs = null;
			if (initialPublicRevisionInvariant != null)
				msgs = ((InternalEObject)initialPublicRevisionInvariant).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SuperModCollabPackage.COLLABORATIVE_REVISION_DIMENSION__INITIAL_PUBLIC_REVISION_INVARIANT, null, msgs);
			if (newInitialPublicRevisionInvariant != null)
				msgs = ((InternalEObject)newInitialPublicRevisionInvariant).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SuperModCollabPackage.COLLABORATIVE_REVISION_DIMENSION__INITIAL_PUBLIC_REVISION_INVARIANT, null, msgs);
			msgs = basicSetInitialPublicRevisionInvariant(newInitialPublicRevisionInvariant, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SuperModCollabPackage.COLLABORATIVE_REVISION_DIMENSION__INITIAL_PUBLIC_REVISION_INVARIANT, newInitialPublicRevisionInvariant, newInitialPublicRevisionInvariant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLatestPublicRevisionNumber() {
		return latestPublicRevisionNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLatestPublicRevisionNumber(int newLatestPublicRevisionNumber) {
		int oldLatestPublicRevisionNumber = latestPublicRevisionNumber;
		latestPublicRevisionNumber = newLatestPublicRevisionNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SuperModCollabPackage.COLLABORATIVE_REVISION_DIMENSION__LATEST_PUBLIC_REVISION_NUMBER, oldLatestPublicRevisionNumber, latestPublicRevisionNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PublicRevision getPublicHead() {
		if (publicHead != null && publicHead.eIsProxy()) {
			InternalEObject oldPublicHead = (InternalEObject)publicHead;
			publicHead = (PublicRevision)eResolveProxy(oldPublicHead);
			if (publicHead != oldPublicHead) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SuperModCollabPackage.COLLABORATIVE_REVISION_DIMENSION__PUBLIC_HEAD, oldPublicHead, publicHead));
			}
		}
		return publicHead;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PublicRevision basicGetPublicHead() {
		return publicHead;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPublicHead(PublicRevision newPublicHead) {
		PublicRevision oldPublicHead = publicHead;
		publicHead = newPublicHead;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SuperModCollabPackage.COLLABORATIVE_REVISION_DIMENSION__PUBLIC_HEAD, oldPublicHead, publicHead));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PublicRevision getCurrentPublicRevision() {
		if (currentPublicRevision != null && currentPublicRevision.eIsProxy()) {
			InternalEObject oldCurrentPublicRevision = (InternalEObject)currentPublicRevision;
			currentPublicRevision = (PublicRevision)eResolveProxy(oldCurrentPublicRevision);
			if (currentPublicRevision != oldCurrentPublicRevision) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SuperModCollabPackage.COLLABORATIVE_REVISION_DIMENSION__CURRENT_PUBLIC_REVISION, oldCurrentPublicRevision, currentPublicRevision));
			}
		}
		return currentPublicRevision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PublicRevision basicGetCurrentPublicRevision() {
		return currentPublicRevision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrentPublicRevision(PublicRevision newCurrentPublicRevision) {
		PublicRevision oldCurrentPublicRevision = currentPublicRevision;
		currentPublicRevision = newCurrentPublicRevision;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SuperModCollabPackage.COLLABORATIVE_REVISION_DIMENSION__CURRENT_PUBLIC_REVISION, oldCurrentPublicRevision, currentPublicRevision));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Revision> getAllRevisions() {
		EList<Revision> allRevisions = ECollections.newBasicEList();
		for (PublicRevision pubRev : getPublicRevisions()) {
			allRevisions.add(pubRev);
			allRevisions.addAll(pubRev.getPrivateRevisions());
		}
		return allRevisions;		
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
	 * @generated NOT
	 */
	public EList<PublicRevision> getLatestPublicRevisions(EList<PublicRevision> publicRevisions) {
		Set<PublicRevision> latestPublicRevisions = new HashSet<PublicRevision>();
		latestPublicRevisions.addAll(publicRevisions);
		for (Revision rev : publicRevisions) {
			if (latestPublicRevisions.contains(rev)) {
				latestPublicRevisions.removeAll(rev.getAllPredecessors());
			}
		}
		return ECollections.newBasicEList(latestPublicRevisions);
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
			case SuperModCollabPackage.COLLABORATIVE_REVISION_DIMENSION__PUBLIC_REVISIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPublicRevisions()).basicAdd(otherEnd, msgs);
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
			case SuperModCollabPackage.COLLABORATIVE_REVISION_DIMENSION__PUBLIC_REVISIONS:
				return ((InternalEList<?>)getPublicRevisions()).basicRemove(otherEnd, msgs);
			case SuperModCollabPackage.COLLABORATIVE_REVISION_DIMENSION__INITIAL_PUBLIC_REVISION_INVARIANT:
				return basicSetInitialPublicRevisionInvariant(null, msgs);
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
			case SuperModCollabPackage.COLLABORATIVE_REVISION_DIMENSION__PUBLIC_REVISIONS:
				return getPublicRevisions();
			case SuperModCollabPackage.COLLABORATIVE_REVISION_DIMENSION__INITIAL_PUBLIC_REVISION:
				if (resolve) return getInitialPublicRevision();
				return basicGetInitialPublicRevision();
			case SuperModCollabPackage.COLLABORATIVE_REVISION_DIMENSION__INITIAL_PUBLIC_REVISION_INVARIANT:
				return getInitialPublicRevisionInvariant();
			case SuperModCollabPackage.COLLABORATIVE_REVISION_DIMENSION__LATEST_PUBLIC_REVISION_NUMBER:
				return getLatestPublicRevisionNumber();
			case SuperModCollabPackage.COLLABORATIVE_REVISION_DIMENSION__PUBLIC_HEAD:
				if (resolve) return getPublicHead();
				return basicGetPublicHead();
			case SuperModCollabPackage.COLLABORATIVE_REVISION_DIMENSION__CURRENT_PUBLIC_REVISION:
				if (resolve) return getCurrentPublicRevision();
				return basicGetCurrentPublicRevision();
			case SuperModCollabPackage.COLLABORATIVE_REVISION_DIMENSION__ALL_REVISIONS:
				return getAllRevisions();
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
			case SuperModCollabPackage.COLLABORATIVE_REVISION_DIMENSION__PUBLIC_REVISIONS:
				getPublicRevisions().clear();
				getPublicRevisions().addAll((Collection<? extends PublicRevision>)newValue);
				return;
			case SuperModCollabPackage.COLLABORATIVE_REVISION_DIMENSION__INITIAL_PUBLIC_REVISION:
				setInitialPublicRevision((PublicRevision)newValue);
				return;
			case SuperModCollabPackage.COLLABORATIVE_REVISION_DIMENSION__INITIAL_PUBLIC_REVISION_INVARIANT:
				setInitialPublicRevisionInvariant((Invariant)newValue);
				return;
			case SuperModCollabPackage.COLLABORATIVE_REVISION_DIMENSION__LATEST_PUBLIC_REVISION_NUMBER:
				setLatestPublicRevisionNumber((Integer)newValue);
				return;
			case SuperModCollabPackage.COLLABORATIVE_REVISION_DIMENSION__PUBLIC_HEAD:
				setPublicHead((PublicRevision)newValue);
				return;
			case SuperModCollabPackage.COLLABORATIVE_REVISION_DIMENSION__CURRENT_PUBLIC_REVISION:
				setCurrentPublicRevision((PublicRevision)newValue);
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
			case SuperModCollabPackage.COLLABORATIVE_REVISION_DIMENSION__PUBLIC_REVISIONS:
				getPublicRevisions().clear();
				return;
			case SuperModCollabPackage.COLLABORATIVE_REVISION_DIMENSION__INITIAL_PUBLIC_REVISION:
				setInitialPublicRevision((PublicRevision)null);
				return;
			case SuperModCollabPackage.COLLABORATIVE_REVISION_DIMENSION__INITIAL_PUBLIC_REVISION_INVARIANT:
				setInitialPublicRevisionInvariant((Invariant)null);
				return;
			case SuperModCollabPackage.COLLABORATIVE_REVISION_DIMENSION__LATEST_PUBLIC_REVISION_NUMBER:
				setLatestPublicRevisionNumber(LATEST_PUBLIC_REVISION_NUMBER_EDEFAULT);
				return;
			case SuperModCollabPackage.COLLABORATIVE_REVISION_DIMENSION__PUBLIC_HEAD:
				setPublicHead((PublicRevision)null);
				return;
			case SuperModCollabPackage.COLLABORATIVE_REVISION_DIMENSION__CURRENT_PUBLIC_REVISION:
				setCurrentPublicRevision((PublicRevision)null);
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
			case SuperModCollabPackage.COLLABORATIVE_REVISION_DIMENSION__PUBLIC_REVISIONS:
				return publicRevisions != null && !publicRevisions.isEmpty();
			case SuperModCollabPackage.COLLABORATIVE_REVISION_DIMENSION__INITIAL_PUBLIC_REVISION:
				return initialPublicRevision != null;
			case SuperModCollabPackage.COLLABORATIVE_REVISION_DIMENSION__INITIAL_PUBLIC_REVISION_INVARIANT:
				return initialPublicRevisionInvariant != null;
			case SuperModCollabPackage.COLLABORATIVE_REVISION_DIMENSION__LATEST_PUBLIC_REVISION_NUMBER:
				return latestPublicRevisionNumber != LATEST_PUBLIC_REVISION_NUMBER_EDEFAULT;
			case SuperModCollabPackage.COLLABORATIVE_REVISION_DIMENSION__PUBLIC_HEAD:
				return publicHead != null;
			case SuperModCollabPackage.COLLABORATIVE_REVISION_DIMENSION__CURRENT_PUBLIC_REVISION:
				return currentPublicRevision != null;
			case SuperModCollabPackage.COLLABORATIVE_REVISION_DIMENSION__ALL_REVISIONS:
				return !getAllRevisions().isEmpty();
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
			case SuperModCollabPackage.COLLABORATIVE_REVISION_DIMENSION___GET_REVISIONS_FOR_BINDING__OPTIONBINDING:
				return getRevisionsForBinding((OptionBinding)arguments.get(0));
			case SuperModCollabPackage.COLLABORATIVE_REVISION_DIMENSION___GET_LATEST_REVISIONS__ELIST:
				return getLatestRevisions((EList<Revision>)arguments.get(0));
			case SuperModCollabPackage.COLLABORATIVE_REVISION_DIMENSION___GET_LATEST_PUBLIC_REVISIONS__ELIST:
				return getLatestPublicRevisions((EList<PublicRevision>)arguments.get(0));
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
		result.append(" (latestPublicRevisionNumber: ");
		result.append(latestPublicRevisionNumber);
		result.append(')');
		return result.toString();
	}

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.mm.core.impl.VersionDimensionImpl#getOptions()
	 */
	@Override
	public EList<Option> getOptions() {
		EList<Option> options = ECollections.newBasicEList();
		for (PublicRevision pubRev : getPublicRevisions()) {
			if (pubRev.getRevisionOption() != null) {
				options.add(pubRev.getRevisionOption());
			}
			if (pubRev.getFinishedOption() != null) {
				options.add(pubRev.getFinishedOption());
			}
			for (PrivateRevision privRev : pubRev.getPrivateRevisions()) {
				if (privRev.getRevisionOption() != null) {
					options.add(privRev.getRevisionOption());
				}
			}
		}
		return ECollections.unmodifiableEList(options);
	}

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.mm.core.impl.VersionDimensionImpl#getInvariants()
	 */
	@Override
	public EList<Invariant> getInvariants() {
		if (getInitialPublicRevisionInvariant() != null) {
			return ECollections.singletonEList(getInitialPublicRevisionInvariant());
		}
		return ECollections.emptyEList();
	}

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.mm.core.impl.VersionDimensionImpl#getPreferences()
	 */
	@Override
	public EList<Preference> getPreferences() {
		EList<Preference> preferences = ECollections.newBasicEList();
		for (PublicRevision pubRev : getPublicRevisions()) {
			if (pubRev.getRevisionOption() != null) {
				preferences.addAll(pubRev.getPredecessorPreferences());
			}
			for (PrivateRevision privRev : pubRev.getPrivateRevisions()) {
				if (privRev.getRevisionOption() != null) {
					preferences.addAll(privRev.getPredecessorPreferences());
				}
			}
		}
		return ECollections.unmodifiableEList(preferences);
	}

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.mm.core.impl.VersionDimensionImpl#getDefaultBindings()
	 */
	@Override
	public EList<DefaultBinding> getDefaultBindings() {
		EList<DefaultBinding> defaults = ECollections.newBasicEList();
		for (PublicRevision pubRev : getPublicRevisions()) {
			if (pubRev.getRevisionOption() != null) {
				defaults.add(pubRev.getRevisionDefaultBinding());
			}
			for (PrivateRevision privRev : pubRev.getPrivateRevisions()) {
				if (privRev.getRevisionOption() != null) {
					defaults.add(privRev.getRevisionDefaultBinding());
				}
			}
		}
		return ECollections.unmodifiableEList(defaults);
	}

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.mm.core.impl.VersionDimensionImpl#getRootVersionSpaceElements()
	 */
	@Override
	public EList<VersionSpaceElement> getRootVersionSpaceElements() {
		return ECollections.unmodifiableEList(getPublicRevisions());

	}

} //CollaborativeRevisionDimensionImpl
