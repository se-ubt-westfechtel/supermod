/**
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package de.ubt.ai1.supermod.mm.collab.impl;

import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.UniqueEList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import de.ubt.ai1.supermod.mm.collab.Revision;
import de.ubt.ai1.supermod.mm.collab.SuperModCollabPackage;
import de.ubt.ai1.supermod.mm.core.DefaultBinding;
import de.ubt.ai1.supermod.mm.core.Option;
import de.ubt.ai1.supermod.mm.core.Preference;
import de.ubt.ai1.supermod.mm.core.RuleBaseElement;
import de.ubt.ai1.supermod.mm.core.VersionSpaceElement;
import de.ubt.ai1.supermod.mm.core.impl.VersionSpaceElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Revision</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai1.supermod.mm.collab.impl.RevisionImpl#getPredecessors <em>Predecessors</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.collab.impl.RevisionImpl#getSuccessors <em>Successors</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.collab.impl.RevisionImpl#getAllPredecessors <em>All Predecessors</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.collab.impl.RevisionImpl#getAllSuccessors <em>All Successors</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.collab.impl.RevisionImpl#getEarliestPredecessors <em>Earliest Predecessors</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.collab.impl.RevisionImpl#getLatestSuccessors <em>Latest Successors</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.collab.impl.RevisionImpl#getRevisionOption <em>Revision Option</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.collab.impl.RevisionImpl#getRevisionDefaultBinding <em>Revision Default Binding</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.collab.impl.RevisionImpl#getPredecessorPreferences <em>Predecessor Preferences</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.collab.impl.RevisionImpl#getRevisionNumber <em>Revision Number</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.collab.impl.RevisionImpl#getDisplayRevisionNumber <em>Display Revision Number</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.collab.impl.RevisionImpl#getDate <em>Date</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.collab.impl.RevisionImpl#getCommitMessage <em>Commit Message</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class RevisionImpl extends VersionSpaceElementImpl implements Revision {
	/**
	 * The cached value of the '{@link #getPredecessors() <em>Predecessors</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPredecessors()
	 * @generated
	 * @ordered
	 */
	protected EList<Revision> predecessors;

	/**
	 * The cached value of the '{@link #getSuccessors() <em>Successors</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuccessors()
	 * @generated
	 * @ordered
	 */
	protected EList<Revision> successors;

	/**
	 * The cached value of the '{@link #getRevisionOption() <em>Revision Option</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRevisionOption()
	 * @generated
	 * @ordered
	 */
	protected Option revisionOption;

	/**
	 * The cached value of the '{@link #getRevisionDefaultBinding() <em>Revision Default Binding</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRevisionDefaultBinding()
	 * @generated
	 * @ordered
	 */
	protected DefaultBinding revisionDefaultBinding;

	/**
	 * The cached value of the '{@link #getPredecessorPreferences() <em>Predecessor Preferences</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPredecessorPreferences()
	 * @generated
	 * @ordered
	 */
	protected EList<Preference> predecessorPreferences;

	/**
	 * The default value of the '{@link #getRevisionNumber() <em>Revision Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRevisionNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int REVISION_NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRevisionNumber() <em>Revision Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRevisionNumber()
	 * @generated
	 * @ordered
	 */
	protected int revisionNumber = REVISION_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getDisplayRevisionNumber() <em>Display Revision Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayRevisionNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String DISPLAY_REVISION_NUMBER_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected Date date = DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCommitMessage() <em>Commit Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommitMessage()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMIT_MESSAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCommitMessage() <em>Commit Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommitMessage()
	 * @generated
	 * @ordered
	 */
	protected String commitMessage = COMMIT_MESSAGE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RevisionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SuperModCollabPackage.Literals.REVISION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Revision> getPredecessors() {
		if (predecessors == null) {
			predecessors = new EObjectWithInverseResolvingEList.ManyInverse<Revision>(Revision.class, this, SuperModCollabPackage.REVISION__PREDECESSORS, SuperModCollabPackage.REVISION__SUCCESSORS);
		}
		return predecessors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Revision> getSuccessors() {
		if (successors == null) {
			successors = new EObjectWithInverseResolvingEList.ManyInverse<Revision>(Revision.class, this, SuperModCollabPackage.REVISION__SUCCESSORS, SuperModCollabPackage.REVISION__PREDECESSORS);
		}
		return successors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Revision> getAllPredecessors() {
		UniqueEList<Revision> result = new UniqueEList<Revision>();
		result.addAll(getAllPredecessorsRec(new HashSet<Revision>()));
		return result;
	}

	private EList<Revision> getAllPredecessorsRec(Set<Revision> tabu) {
		EList<Revision> allPredecessors = new UniqueEList<>();
		for (Revision pred : getPredecessors()) {
			if (!tabu.contains(pred)) {
				tabu.add(pred);
				allPredecessors.add(pred);
				allPredecessors.addAll(((RevisionImpl) pred).getAllPredecessorsRec(tabu));
			}
		}
		return allPredecessors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Revision> getAllSuccessors() {
		UniqueEList<Revision> result = new UniqueEList<Revision>();
		result.addAll(getAllSuccessorsRec(new HashSet<Revision>()));
		return result;
	}

	private EList<Revision> getAllSuccessorsRec(Set<Revision> tabu) {
		EList<Revision> allSuccessors = new UniqueEList<>();
		for (Revision succ : getSuccessors()) {
			if (!tabu.contains(succ)) {
				tabu.add(succ);
				allSuccessors.add(succ);
				allSuccessors.addAll(((RevisionImpl) succ).getAllSuccessorsRec(tabu));
			}
		}
		return allSuccessors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Revision> getEarliestPredecessors() {
		EList<Revision> earliestPredecessors = new UniqueEList<Revision>();
		if (getPredecessors().isEmpty()) {
			earliestPredecessors.add(this);
		}
		else {
			for (Revision pred : getPredecessors()) {
				earliestPredecessors.addAll(pred.getEarliestPredecessors());
			}
		}
		return ECollections.unmodifiableEList(earliestPredecessors);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Revision> getLatestSuccessors() {
		EList<Revision> latestSuccessors = new UniqueEList<Revision>();
		if (getSuccessors().isEmpty()) {
			latestSuccessors.add(this);
		}
		else {
			for (Revision succ : getSuccessors()) {
				latestSuccessors.addAll(succ.getLatestSuccessors());
			}
		}
		return ECollections.unmodifiableEList(latestSuccessors);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Option getRevisionOption() {
		return revisionOption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRevisionOption(Option newRevisionOption, NotificationChain msgs) {
		Option oldRevisionOption = revisionOption;
		revisionOption = newRevisionOption;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SuperModCollabPackage.REVISION__REVISION_OPTION, oldRevisionOption, newRevisionOption);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRevisionOption(Option newRevisionOption) {
		if (newRevisionOption != revisionOption) {
			NotificationChain msgs = null;
			if (revisionOption != null)
				msgs = ((InternalEObject)revisionOption).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SuperModCollabPackage.REVISION__REVISION_OPTION, null, msgs);
			if (newRevisionOption != null)
				msgs = ((InternalEObject)newRevisionOption).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SuperModCollabPackage.REVISION__REVISION_OPTION, null, msgs);
			msgs = basicSetRevisionOption(newRevisionOption, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SuperModCollabPackage.REVISION__REVISION_OPTION, newRevisionOption, newRevisionOption));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefaultBinding getRevisionDefaultBinding() {
		return revisionDefaultBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRevisionDefaultBinding(DefaultBinding newRevisionDefaultBinding, NotificationChain msgs) {
		DefaultBinding oldRevisionDefaultBinding = revisionDefaultBinding;
		revisionDefaultBinding = newRevisionDefaultBinding;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SuperModCollabPackage.REVISION__REVISION_DEFAULT_BINDING, oldRevisionDefaultBinding, newRevisionDefaultBinding);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRevisionDefaultBinding(DefaultBinding newRevisionDefaultBinding) {
		if (newRevisionDefaultBinding != revisionDefaultBinding) {
			NotificationChain msgs = null;
			if (revisionDefaultBinding != null)
				msgs = ((InternalEObject)revisionDefaultBinding).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SuperModCollabPackage.REVISION__REVISION_DEFAULT_BINDING, null, msgs);
			if (newRevisionDefaultBinding != null)
				msgs = ((InternalEObject)newRevisionDefaultBinding).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SuperModCollabPackage.REVISION__REVISION_DEFAULT_BINDING, null, msgs);
			msgs = basicSetRevisionDefaultBinding(newRevisionDefaultBinding, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SuperModCollabPackage.REVISION__REVISION_DEFAULT_BINDING, newRevisionDefaultBinding, newRevisionDefaultBinding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Preference> getPredecessorPreferences() {
		if (predecessorPreferences == null) {
			predecessorPreferences = new EObjectContainmentEList<Preference>(Preference.class, this, SuperModCollabPackage.REVISION__PREDECESSOR_PREFERENCES);
		}
		return predecessorPreferences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRevisionNumber() {
		return revisionNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRevisionNumber(int newRevisionNumber) {
		int oldRevisionNumber = revisionNumber;
		revisionNumber = newRevisionNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SuperModCollabPackage.REVISION__REVISION_NUMBER, oldRevisionNumber, revisionNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public abstract String getDisplayRevisionNumber();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDate(Date newDate) {
		Date oldDate = date;
		date = newDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SuperModCollabPackage.REVISION__DATE, oldDate, date));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCommitMessage() {
		return commitMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommitMessage(String newCommitMessage) {
		String oldCommitMessage = commitMessage;
		commitMessage = newCommitMessage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SuperModCollabPackage.REVISION__COMMIT_MESSAGE, oldCommitMessage, commitMessage));
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
			case SuperModCollabPackage.REVISION__PREDECESSORS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPredecessors()).basicAdd(otherEnd, msgs);
			case SuperModCollabPackage.REVISION__SUCCESSORS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSuccessors()).basicAdd(otherEnd, msgs);
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
			case SuperModCollabPackage.REVISION__PREDECESSORS:
				return ((InternalEList<?>)getPredecessors()).basicRemove(otherEnd, msgs);
			case SuperModCollabPackage.REVISION__SUCCESSORS:
				return ((InternalEList<?>)getSuccessors()).basicRemove(otherEnd, msgs);
			case SuperModCollabPackage.REVISION__REVISION_OPTION:
				return basicSetRevisionOption(null, msgs);
			case SuperModCollabPackage.REVISION__REVISION_DEFAULT_BINDING:
				return basicSetRevisionDefaultBinding(null, msgs);
			case SuperModCollabPackage.REVISION__PREDECESSOR_PREFERENCES:
				return ((InternalEList<?>)getPredecessorPreferences()).basicRemove(otherEnd, msgs);
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
			case SuperModCollabPackage.REVISION__PREDECESSORS:
				return getPredecessors();
			case SuperModCollabPackage.REVISION__SUCCESSORS:
				return getSuccessors();
			case SuperModCollabPackage.REVISION__ALL_PREDECESSORS:
				return getAllPredecessors();
			case SuperModCollabPackage.REVISION__ALL_SUCCESSORS:
				return getAllSuccessors();
			case SuperModCollabPackage.REVISION__EARLIEST_PREDECESSORS:
				return getEarliestPredecessors();
			case SuperModCollabPackage.REVISION__LATEST_SUCCESSORS:
				return getLatestSuccessors();
			case SuperModCollabPackage.REVISION__REVISION_OPTION:
				return getRevisionOption();
			case SuperModCollabPackage.REVISION__REVISION_DEFAULT_BINDING:
				return getRevisionDefaultBinding();
			case SuperModCollabPackage.REVISION__PREDECESSOR_PREFERENCES:
				return getPredecessorPreferences();
			case SuperModCollabPackage.REVISION__REVISION_NUMBER:
				return getRevisionNumber();
			case SuperModCollabPackage.REVISION__DISPLAY_REVISION_NUMBER:
				return getDisplayRevisionNumber();
			case SuperModCollabPackage.REVISION__DATE:
				return getDate();
			case SuperModCollabPackage.REVISION__COMMIT_MESSAGE:
				return getCommitMessage();
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
			case SuperModCollabPackage.REVISION__PREDECESSORS:
				getPredecessors().clear();
				getPredecessors().addAll((Collection<? extends Revision>)newValue);
				return;
			case SuperModCollabPackage.REVISION__SUCCESSORS:
				getSuccessors().clear();
				getSuccessors().addAll((Collection<? extends Revision>)newValue);
				return;
			case SuperModCollabPackage.REVISION__REVISION_OPTION:
				setRevisionOption((Option)newValue);
				return;
			case SuperModCollabPackage.REVISION__REVISION_DEFAULT_BINDING:
				setRevisionDefaultBinding((DefaultBinding)newValue);
				return;
			case SuperModCollabPackage.REVISION__PREDECESSOR_PREFERENCES:
				getPredecessorPreferences().clear();
				getPredecessorPreferences().addAll((Collection<? extends Preference>)newValue);
				return;
			case SuperModCollabPackage.REVISION__REVISION_NUMBER:
				setRevisionNumber((Integer)newValue);
				return;
			case SuperModCollabPackage.REVISION__DATE:
				setDate((Date)newValue);
				return;
			case SuperModCollabPackage.REVISION__COMMIT_MESSAGE:
				setCommitMessage((String)newValue);
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
			case SuperModCollabPackage.REVISION__PREDECESSORS:
				getPredecessors().clear();
				return;
			case SuperModCollabPackage.REVISION__SUCCESSORS:
				getSuccessors().clear();
				return;
			case SuperModCollabPackage.REVISION__REVISION_OPTION:
				setRevisionOption((Option)null);
				return;
			case SuperModCollabPackage.REVISION__REVISION_DEFAULT_BINDING:
				setRevisionDefaultBinding((DefaultBinding)null);
				return;
			case SuperModCollabPackage.REVISION__PREDECESSOR_PREFERENCES:
				getPredecessorPreferences().clear();
				return;
			case SuperModCollabPackage.REVISION__REVISION_NUMBER:
				setRevisionNumber(REVISION_NUMBER_EDEFAULT);
				return;
			case SuperModCollabPackage.REVISION__DATE:
				setDate(DATE_EDEFAULT);
				return;
			case SuperModCollabPackage.REVISION__COMMIT_MESSAGE:
				setCommitMessage(COMMIT_MESSAGE_EDEFAULT);
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
			case SuperModCollabPackage.REVISION__PREDECESSORS:
				return predecessors != null && !predecessors.isEmpty();
			case SuperModCollabPackage.REVISION__SUCCESSORS:
				return successors != null && !successors.isEmpty();
			case SuperModCollabPackage.REVISION__ALL_PREDECESSORS:
				return !getAllPredecessors().isEmpty();
			case SuperModCollabPackage.REVISION__ALL_SUCCESSORS:
				return !getAllSuccessors().isEmpty();
			case SuperModCollabPackage.REVISION__EARLIEST_PREDECESSORS:
				return !getEarliestPredecessors().isEmpty();
			case SuperModCollabPackage.REVISION__LATEST_SUCCESSORS:
				return !getLatestSuccessors().isEmpty();
			case SuperModCollabPackage.REVISION__REVISION_OPTION:
				return revisionOption != null;
			case SuperModCollabPackage.REVISION__REVISION_DEFAULT_BINDING:
				return revisionDefaultBinding != null;
			case SuperModCollabPackage.REVISION__PREDECESSOR_PREFERENCES:
				return predecessorPreferences != null && !predecessorPreferences.isEmpty();
			case SuperModCollabPackage.REVISION__REVISION_NUMBER:
				return revisionNumber != REVISION_NUMBER_EDEFAULT;
			case SuperModCollabPackage.REVISION__DISPLAY_REVISION_NUMBER:
				return DISPLAY_REVISION_NUMBER_EDEFAULT == null ? getDisplayRevisionNumber() != null : !DISPLAY_REVISION_NUMBER_EDEFAULT.equals(getDisplayRevisionNumber());
			case SuperModCollabPackage.REVISION__DATE:
				return DATE_EDEFAULT == null ? date != null : !DATE_EDEFAULT.equals(date);
			case SuperModCollabPackage.REVISION__COMMIT_MESSAGE:
				return COMMIT_MESSAGE_EDEFAULT == null ? commitMessage != null : !COMMIT_MESSAGE_EDEFAULT.equals(commitMessage);
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
		StringBuffer result = new StringBuffer();
		result.append(getDisplayRevisionNumber());
		result.append("\n");
		result.append(date);
		result.append("\n");
		result.append(commitMessage);
		result.append("\n");
		return result.toString();
	}

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.mm.core.impl.VersionSpaceElementImpl#getCrossReferencedVersionSpaceElements()
	 */
	@Override
	public EList<VersionSpaceElement> getCrossReferencedVersionSpaceElements() {
		return ECollections.newBasicEList(getSuccessors());
	}

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.mm.core.impl.VersionSpaceElementImpl#getCrossReferencingVersionSpaceElements()
	 */
	@Override
	public EList<VersionSpaceElement> getCrossReferencingVersionSpaceElements() {
		return ECollections.newBasicEList(getPredecessors());
	}

	@Override
	public EList<RuleBaseElement> getLowLevelConcepts() {
		EList<RuleBaseElement> llc = ECollections.newBasicEList();
		if (getRevisionOption() != null) {
			llc.add(getRevisionOption());
		}
		llc.addAll(getPredecessorPreferences());
		if (getRevisionDefaultBinding() != null) {
			llc.add(getRevisionDefaultBinding());
		}
		return ECollections.unmodifiableEList(llc);
	}

} //RevisionImpl
