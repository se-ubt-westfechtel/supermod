/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.mm.revision.impl;

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

import de.ubt.ai1.supermod.mm.core.DefaultBinding;
import de.ubt.ai1.supermod.mm.core.Option;
import de.ubt.ai1.supermod.mm.core.Preference;
import de.ubt.ai1.supermod.mm.core.RuleBaseElement;
import de.ubt.ai1.supermod.mm.core.VersionSpaceElement;
import de.ubt.ai1.supermod.mm.core.impl.VersionSpaceElementImpl;
import de.ubt.ai1.supermod.mm.revision.Revision;
import de.ubt.ai1.supermod.mm.revision.SuperModRevisionPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Revision</b></em>'.
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date 	2014-07-25
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai1.supermod.mm.revision.impl.RevisionImpl#getPredecessors <em>Predecessors</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.revision.impl.RevisionImpl#getSuccessors <em>Successors</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.revision.impl.RevisionImpl#getRevisionNumber <em>Revision Number</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.revision.impl.RevisionImpl#getCommitter <em>Committer</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.revision.impl.RevisionImpl#getCommitMessage <em>Commit Message</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.revision.impl.RevisionImpl#getDate <em>Date</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.revision.impl.RevisionImpl#getAllPredecessors <em>All Predecessors</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.revision.impl.RevisionImpl#getAllSuccessors <em>All Successors</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.revision.impl.RevisionImpl#getEarliestPredecessors <em>Earliest Predecessors</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.revision.impl.RevisionImpl#getLatestSuccessors <em>Latest Successors</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.revision.impl.RevisionImpl#getRevisionOption <em>Revision Option</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.revision.impl.RevisionImpl#getRevisionDefaultBinding <em>Revision Default Binding</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.revision.impl.RevisionImpl#getPredecessorPreferences <em>Predecessor Preferences</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RevisionImpl extends VersionSpaceElementImpl implements Revision {
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
	 * The default value of the '{@link #getCommitter() <em>Committer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommitter()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMITTER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCommitter() <em>Committer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommitter()
	 * @generated
	 * @ordered
	 */
	protected String committer = COMMITTER_EDEFAULT;

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
		return SuperModRevisionPackage.Literals.REVISION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Revision> getPredecessors() {
		if (predecessors == null) {
			predecessors = new EObjectWithInverseResolvingEList.ManyInverse<Revision>(Revision.class, this, SuperModRevisionPackage.REVISION__PREDECESSORS, SuperModRevisionPackage.REVISION__SUCCESSORS);
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
			successors = new EObjectWithInverseResolvingEList.ManyInverse<Revision>(Revision.class, this, SuperModRevisionPackage.REVISION__SUCCESSORS, SuperModRevisionPackage.REVISION__PREDECESSORS);
		}
		return successors;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SuperModRevisionPackage.REVISION__REVISION_NUMBER, oldRevisionNumber, revisionNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCommitter() {
		return committer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommitter(String newCommitter) {
		String oldCommitter = committer;
		committer = newCommitter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SuperModRevisionPackage.REVISION__COMMITTER, oldCommitter, committer));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SuperModRevisionPackage.REVISION__COMMIT_MESSAGE, oldCommitMessage, commitMessage));
	}

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
			eNotify(new ENotificationImpl(this, Notification.SET, SuperModRevisionPackage.REVISION__DATE, oldDate, date));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SuperModRevisionPackage.REVISION__REVISION_OPTION, oldRevisionOption, newRevisionOption);
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
				msgs = ((InternalEObject)revisionOption).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SuperModRevisionPackage.REVISION__REVISION_OPTION, null, msgs);
			if (newRevisionOption != null)
				msgs = ((InternalEObject)newRevisionOption).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SuperModRevisionPackage.REVISION__REVISION_OPTION, null, msgs);
			msgs = basicSetRevisionOption(newRevisionOption, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SuperModRevisionPackage.REVISION__REVISION_OPTION, newRevisionOption, newRevisionOption));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Preference> getPredecessorPreferences() {
		if (predecessorPreferences == null) {
			predecessorPreferences = new EObjectContainmentEList<Preference>(Preference.class, this, SuperModRevisionPackage.REVISION__PREDECESSOR_PREFERENCES);
		}
		return predecessorPreferences;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SuperModRevisionPackage.REVISION__REVISION_DEFAULT_BINDING, oldRevisionDefaultBinding, newRevisionDefaultBinding);
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
				msgs = ((InternalEObject)revisionDefaultBinding).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SuperModRevisionPackage.REVISION__REVISION_DEFAULT_BINDING, null, msgs);
			if (newRevisionDefaultBinding != null)
				msgs = ((InternalEObject)newRevisionDefaultBinding).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SuperModRevisionPackage.REVISION__REVISION_DEFAULT_BINDING, null, msgs);
			msgs = basicSetRevisionDefaultBinding(newRevisionDefaultBinding, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SuperModRevisionPackage.REVISION__REVISION_DEFAULT_BINDING, newRevisionDefaultBinding, newRevisionDefaultBinding));
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
			case SuperModRevisionPackage.REVISION__PREDECESSORS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPredecessors()).basicAdd(otherEnd, msgs);
			case SuperModRevisionPackage.REVISION__SUCCESSORS:
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
			case SuperModRevisionPackage.REVISION__PREDECESSORS:
				return ((InternalEList<?>)getPredecessors()).basicRemove(otherEnd, msgs);
			case SuperModRevisionPackage.REVISION__SUCCESSORS:
				return ((InternalEList<?>)getSuccessors()).basicRemove(otherEnd, msgs);
			case SuperModRevisionPackage.REVISION__REVISION_OPTION:
				return basicSetRevisionOption(null, msgs);
			case SuperModRevisionPackage.REVISION__REVISION_DEFAULT_BINDING:
				return basicSetRevisionDefaultBinding(null, msgs);
			case SuperModRevisionPackage.REVISION__PREDECESSOR_PREFERENCES:
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
			case SuperModRevisionPackage.REVISION__PREDECESSORS:
				return getPredecessors();
			case SuperModRevisionPackage.REVISION__SUCCESSORS:
				return getSuccessors();
			case SuperModRevisionPackage.REVISION__REVISION_NUMBER:
				return getRevisionNumber();
			case SuperModRevisionPackage.REVISION__COMMITTER:
				return getCommitter();
			case SuperModRevisionPackage.REVISION__COMMIT_MESSAGE:
				return getCommitMessage();
			case SuperModRevisionPackage.REVISION__DATE:
				return getDate();
			case SuperModRevisionPackage.REVISION__ALL_PREDECESSORS:
				return getAllPredecessors();
			case SuperModRevisionPackage.REVISION__ALL_SUCCESSORS:
				return getAllSuccessors();
			case SuperModRevisionPackage.REVISION__EARLIEST_PREDECESSORS:
				return getEarliestPredecessors();
			case SuperModRevisionPackage.REVISION__LATEST_SUCCESSORS:
				return getLatestSuccessors();
			case SuperModRevisionPackage.REVISION__REVISION_OPTION:
				return getRevisionOption();
			case SuperModRevisionPackage.REVISION__REVISION_DEFAULT_BINDING:
				return getRevisionDefaultBinding();
			case SuperModRevisionPackage.REVISION__PREDECESSOR_PREFERENCES:
				return getPredecessorPreferences();
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
			case SuperModRevisionPackage.REVISION__PREDECESSORS:
				getPredecessors().clear();
				getPredecessors().addAll((Collection<? extends Revision>)newValue);
				return;
			case SuperModRevisionPackage.REVISION__SUCCESSORS:
				getSuccessors().clear();
				getSuccessors().addAll((Collection<? extends Revision>)newValue);
				return;
			case SuperModRevisionPackage.REVISION__REVISION_NUMBER:
				setRevisionNumber((Integer)newValue);
				return;
			case SuperModRevisionPackage.REVISION__COMMITTER:
				setCommitter((String)newValue);
				return;
			case SuperModRevisionPackage.REVISION__COMMIT_MESSAGE:
				setCommitMessage((String)newValue);
				return;
			case SuperModRevisionPackage.REVISION__DATE:
				setDate((Date)newValue);
				return;
			case SuperModRevisionPackage.REVISION__REVISION_OPTION:
				setRevisionOption((Option)newValue);
				return;
			case SuperModRevisionPackage.REVISION__REVISION_DEFAULT_BINDING:
				setRevisionDefaultBinding((DefaultBinding)newValue);
				return;
			case SuperModRevisionPackage.REVISION__PREDECESSOR_PREFERENCES:
				getPredecessorPreferences().clear();
				getPredecessorPreferences().addAll((Collection<? extends Preference>)newValue);
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
			case SuperModRevisionPackage.REVISION__PREDECESSORS:
				getPredecessors().clear();
				return;
			case SuperModRevisionPackage.REVISION__SUCCESSORS:
				getSuccessors().clear();
				return;
			case SuperModRevisionPackage.REVISION__REVISION_NUMBER:
				setRevisionNumber(REVISION_NUMBER_EDEFAULT);
				return;
			case SuperModRevisionPackage.REVISION__COMMITTER:
				setCommitter(COMMITTER_EDEFAULT);
				return;
			case SuperModRevisionPackage.REVISION__COMMIT_MESSAGE:
				setCommitMessage(COMMIT_MESSAGE_EDEFAULT);
				return;
			case SuperModRevisionPackage.REVISION__DATE:
				setDate(DATE_EDEFAULT);
				return;
			case SuperModRevisionPackage.REVISION__REVISION_OPTION:
				setRevisionOption((Option)null);
				return;
			case SuperModRevisionPackage.REVISION__REVISION_DEFAULT_BINDING:
				setRevisionDefaultBinding((DefaultBinding)null);
				return;
			case SuperModRevisionPackage.REVISION__PREDECESSOR_PREFERENCES:
				getPredecessorPreferences().clear();
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
			case SuperModRevisionPackage.REVISION__PREDECESSORS:
				return predecessors != null && !predecessors.isEmpty();
			case SuperModRevisionPackage.REVISION__SUCCESSORS:
				return successors != null && !successors.isEmpty();
			case SuperModRevisionPackage.REVISION__REVISION_NUMBER:
				return revisionNumber != REVISION_NUMBER_EDEFAULT;
			case SuperModRevisionPackage.REVISION__COMMITTER:
				return COMMITTER_EDEFAULT == null ? committer != null : !COMMITTER_EDEFAULT.equals(committer);
			case SuperModRevisionPackage.REVISION__COMMIT_MESSAGE:
				return COMMIT_MESSAGE_EDEFAULT == null ? commitMessage != null : !COMMIT_MESSAGE_EDEFAULT.equals(commitMessage);
			case SuperModRevisionPackage.REVISION__DATE:
				return DATE_EDEFAULT == null ? date != null : !DATE_EDEFAULT.equals(date);
			case SuperModRevisionPackage.REVISION__ALL_PREDECESSORS:
				return !getAllPredecessors().isEmpty();
			case SuperModRevisionPackage.REVISION__ALL_SUCCESSORS:
				return !getAllSuccessors().isEmpty();
			case SuperModRevisionPackage.REVISION__EARLIEST_PREDECESSORS:
				return !getEarliestPredecessors().isEmpty();
			case SuperModRevisionPackage.REVISION__LATEST_SUCCESSORS:
				return !getLatestSuccessors().isEmpty();
			case SuperModRevisionPackage.REVISION__REVISION_OPTION:
				return revisionOption != null;
			case SuperModRevisionPackage.REVISION__REVISION_DEFAULT_BINDING:
				return revisionDefaultBinding != null;
			case SuperModRevisionPackage.REVISION__PREDECESSOR_PREFERENCES:
				return predecessorPreferences != null && !predecessorPreferences.isEmpty();
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
		result.append(revisionNumber);
		result.append("\n");
		result.append(commitMessage);
		result.append("\n");
		result.append(date);
		result.append("\n");
		result.append(committer);		
		result.append("\n");		
		return result.toString();
	}

	@Override
	public VersionSpaceElement basicGetSuperVersionSpaceElement() {
		return null;
	}

	@Override
	public EList<VersionSpaceElement> getSubVersionSpaceElements() {
		return ECollections.emptyEList();
	}

	@Override
	public EList<VersionSpaceElement> getCrossReferencedVersionSpaceElements() {
		EList<VersionSpaceElement> crossRefs = ECollections.newBasicEList();
		crossRefs.addAll(getPredecessors());
		crossRefs.addAll(getSuccessors());
		return ECollections.unmodifiableEList(crossRefs);
	}

	@Override
	public EList<VersionSpaceElement> getCrossReferencingVersionSpaceElements() {
		return getCrossReferencedVersionSpaceElements();
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
