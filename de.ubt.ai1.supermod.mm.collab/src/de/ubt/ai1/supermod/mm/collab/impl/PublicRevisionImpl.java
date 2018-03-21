/**
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package de.ubt.ai1.supermod.mm.collab.impl;

import de.ubt.ai1.supermod.mm.collab.CollaborativeRevisionDimension;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import de.ubt.ai1.supermod.mm.collab.PrivateRevision;
import de.ubt.ai1.supermod.mm.collab.PublicRevision;
import de.ubt.ai1.supermod.mm.collab.SuperModCollabPackage;
import de.ubt.ai1.supermod.mm.core.DefaultBinding;
import de.ubt.ai1.supermod.mm.core.Option;
import de.ubt.ai1.supermod.mm.core.RuleBaseElement;
import de.ubt.ai1.supermod.mm.core.VersionSpaceElement;

import java.util.Collection;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Public Revision</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai1.supermod.mm.collab.impl.PublicRevisionImpl#getRevisionDimension <em>Revision Dimension</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.collab.impl.PublicRevisionImpl#getPrivateRevisions <em>Private Revisions</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.collab.impl.PublicRevisionImpl#getCommitter <em>Committer</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.collab.impl.PublicRevisionImpl#getLatestPrivateRevisionNumber <em>Latest Private Revision Number</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.collab.impl.PublicRevisionImpl#getInitialPrivateRevision <em>Initial Private Revision</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.collab.impl.PublicRevisionImpl#getPrivateHead <em>Private Head</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.collab.impl.PublicRevisionImpl#isHead <em>Head</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.collab.impl.PublicRevisionImpl#isFinished <em>Finished</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.collab.impl.PublicRevisionImpl#getFinishedOption <em>Finished Option</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.collab.impl.PublicRevisionImpl#getFinishedDefaultBinding <em>Finished Default Binding</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PublicRevisionImpl extends RevisionImpl implements PublicRevision {
	/**
	 * The cached value of the '{@link #getPrivateRevisions() <em>Private Revisions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrivateRevisions()
	 * @generated
	 * @ordered
	 */
	protected EList<PrivateRevision> privateRevisions;

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
	 * The default value of the '{@link #getLatestPrivateRevisionNumber() <em>Latest Private Revision Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLatestPrivateRevisionNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int LATEST_PRIVATE_REVISION_NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLatestPrivateRevisionNumber() <em>Latest Private Revision Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLatestPrivateRevisionNumber()
	 * @generated
	 * @ordered
	 */
	protected int latestPrivateRevisionNumber = LATEST_PRIVATE_REVISION_NUMBER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInitialPrivateRevision() <em>Initial Private Revision</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialPrivateRevision()
	 * @generated
	 * @ordered
	 */
	protected PrivateRevision initialPrivateRevision;

	/**
	 * The cached value of the '{@link #getPrivateHead() <em>Private Head</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrivateHead()
	 * @generated
	 * @ordered
	 */
	protected PrivateRevision privateHead;

	/**
	 * The default value of the '{@link #isHead() <em>Head</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHead()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HEAD_EDEFAULT = false;

	/**
	 * The default value of the '{@link #isFinished() <em>Finished</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFinished()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FINISHED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #getFinishedOption() <em>Finished Option</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinishedOption()
	 * @generated
	 * @ordered
	 */
	protected Option finishedOption;

	/**
	 * The cached value of the '{@link #getFinishedDefaultBinding() <em>Finished Default Binding</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinishedDefaultBinding()
	 * @generated
	 * @ordered
	 */
	protected DefaultBinding finishedDefaultBinding;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PublicRevisionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SuperModCollabPackage.Literals.PUBLIC_REVISION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollaborativeRevisionDimension getRevisionDimension() {
		if (eContainerFeatureID() != SuperModCollabPackage.PUBLIC_REVISION__REVISION_DIMENSION) return null;
		return (CollaborativeRevisionDimension)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRevisionDimension(CollaborativeRevisionDimension newRevisionDimension, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newRevisionDimension, SuperModCollabPackage.PUBLIC_REVISION__REVISION_DIMENSION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRevisionDimension(CollaborativeRevisionDimension newRevisionDimension) {
		if (newRevisionDimension != eInternalContainer() || (eContainerFeatureID() != SuperModCollabPackage.PUBLIC_REVISION__REVISION_DIMENSION && newRevisionDimension != null)) {
			if (EcoreUtil.isAncestor(this, newRevisionDimension))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newRevisionDimension != null)
				msgs = ((InternalEObject)newRevisionDimension).eInverseAdd(this, SuperModCollabPackage.COLLABORATIVE_REVISION_DIMENSION__PUBLIC_REVISIONS, CollaborativeRevisionDimension.class, msgs);
			msgs = basicSetRevisionDimension(newRevisionDimension, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SuperModCollabPackage.PUBLIC_REVISION__REVISION_DIMENSION, newRevisionDimension, newRevisionDimension));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PrivateRevision> getPrivateRevisions() {
		if (privateRevisions == null) {
			privateRevisions = new EObjectContainmentWithInverseEList<PrivateRevision>(PrivateRevision.class, this, SuperModCollabPackage.PUBLIC_REVISION__PRIVATE_REVISIONS, SuperModCollabPackage.PRIVATE_REVISION__PUBLIC_REVISION);
		}
		return privateRevisions;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SuperModCollabPackage.PUBLIC_REVISION__COMMITTER, oldCommitter, committer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLatestPrivateRevisionNumber() {
		return latestPrivateRevisionNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLatestPrivateRevisionNumber(int newLatestPrivateRevisionNumber) {
		int oldLatestPrivateRevisionNumber = latestPrivateRevisionNumber;
		latestPrivateRevisionNumber = newLatestPrivateRevisionNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SuperModCollabPackage.PUBLIC_REVISION__LATEST_PRIVATE_REVISION_NUMBER, oldLatestPrivateRevisionNumber, latestPrivateRevisionNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrivateRevision getInitialPrivateRevision() {
		if (initialPrivateRevision != null && initialPrivateRevision.eIsProxy()) {
			InternalEObject oldInitialPrivateRevision = (InternalEObject)initialPrivateRevision;
			initialPrivateRevision = (PrivateRevision)eResolveProxy(oldInitialPrivateRevision);
			if (initialPrivateRevision != oldInitialPrivateRevision) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SuperModCollabPackage.PUBLIC_REVISION__INITIAL_PRIVATE_REVISION, oldInitialPrivateRevision, initialPrivateRevision));
			}
		}
		return initialPrivateRevision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrivateRevision basicGetInitialPrivateRevision() {
		return initialPrivateRevision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitialPrivateRevision(PrivateRevision newInitialPrivateRevision) {
		PrivateRevision oldInitialPrivateRevision = initialPrivateRevision;
		initialPrivateRevision = newInitialPrivateRevision;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SuperModCollabPackage.PUBLIC_REVISION__INITIAL_PRIVATE_REVISION, oldInitialPrivateRevision, initialPrivateRevision));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrivateRevision getPrivateHead() {
		if (privateHead != null && privateHead.eIsProxy()) {
			InternalEObject oldPrivateHead = (InternalEObject)privateHead;
			privateHead = (PrivateRevision)eResolveProxy(oldPrivateHead);
			if (privateHead != oldPrivateHead) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SuperModCollabPackage.PUBLIC_REVISION__PRIVATE_HEAD, oldPrivateHead, privateHead));
			}
		}
		return privateHead;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrivateRevision basicGetPrivateHead() {
		return privateHead;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrivateHead(PrivateRevision newPrivateHead) {
		PrivateRevision oldPrivateHead = privateHead;
		privateHead = newPrivateHead;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SuperModCollabPackage.PUBLIC_REVISION__PRIVATE_HEAD, oldPrivateHead, privateHead));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isHead() {
		return getRevisionDimension() != null && 
				getRevisionDimension().getPublicHead() != null &&
				getRevisionDimension().getPublicHead().equals(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isFinished() {
		return getFinishedOption() != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Option getFinishedOption() {
		return finishedOption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFinishedOption(Option newFinishedOption, NotificationChain msgs) {
		Option oldFinishedOption = finishedOption;
		finishedOption = newFinishedOption;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SuperModCollabPackage.PUBLIC_REVISION__FINISHED_OPTION, oldFinishedOption, newFinishedOption);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFinishedOption(Option newFinishedOption) {
		if (newFinishedOption != finishedOption) {
			NotificationChain msgs = null;
			if (finishedOption != null)
				msgs = ((InternalEObject)finishedOption).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SuperModCollabPackage.PUBLIC_REVISION__FINISHED_OPTION, null, msgs);
			if (newFinishedOption != null)
				msgs = ((InternalEObject)newFinishedOption).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SuperModCollabPackage.PUBLIC_REVISION__FINISHED_OPTION, null, msgs);
			msgs = basicSetFinishedOption(newFinishedOption, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SuperModCollabPackage.PUBLIC_REVISION__FINISHED_OPTION, newFinishedOption, newFinishedOption));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefaultBinding getFinishedDefaultBinding() {
		return finishedDefaultBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFinishedDefaultBinding(DefaultBinding newFinishedDefaultBinding, NotificationChain msgs) {
		DefaultBinding oldFinishedDefaultBinding = finishedDefaultBinding;
		finishedDefaultBinding = newFinishedDefaultBinding;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SuperModCollabPackage.PUBLIC_REVISION__FINISHED_DEFAULT_BINDING, oldFinishedDefaultBinding, newFinishedDefaultBinding);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFinishedDefaultBinding(DefaultBinding newFinishedDefaultBinding) {
		if (newFinishedDefaultBinding != finishedDefaultBinding) {
			NotificationChain msgs = null;
			if (finishedDefaultBinding != null)
				msgs = ((InternalEObject)finishedDefaultBinding).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SuperModCollabPackage.PUBLIC_REVISION__FINISHED_DEFAULT_BINDING, null, msgs);
			if (newFinishedDefaultBinding != null)
				msgs = ((InternalEObject)newFinishedDefaultBinding).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SuperModCollabPackage.PUBLIC_REVISION__FINISHED_DEFAULT_BINDING, null, msgs);
			msgs = basicSetFinishedDefaultBinding(newFinishedDefaultBinding, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SuperModCollabPackage.PUBLIC_REVISION__FINISHED_DEFAULT_BINDING, newFinishedDefaultBinding, newFinishedDefaultBinding));
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
			case SuperModCollabPackage.PUBLIC_REVISION__REVISION_DIMENSION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetRevisionDimension((CollaborativeRevisionDimension)otherEnd, msgs);
			case SuperModCollabPackage.PUBLIC_REVISION__PRIVATE_REVISIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPrivateRevisions()).basicAdd(otherEnd, msgs);
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
			case SuperModCollabPackage.PUBLIC_REVISION__REVISION_DIMENSION:
				return basicSetRevisionDimension(null, msgs);
			case SuperModCollabPackage.PUBLIC_REVISION__PRIVATE_REVISIONS:
				return ((InternalEList<?>)getPrivateRevisions()).basicRemove(otherEnd, msgs);
			case SuperModCollabPackage.PUBLIC_REVISION__FINISHED_OPTION:
				return basicSetFinishedOption(null, msgs);
			case SuperModCollabPackage.PUBLIC_REVISION__FINISHED_DEFAULT_BINDING:
				return basicSetFinishedDefaultBinding(null, msgs);
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
			case SuperModCollabPackage.PUBLIC_REVISION__REVISION_DIMENSION:
				return eInternalContainer().eInverseRemove(this, SuperModCollabPackage.COLLABORATIVE_REVISION_DIMENSION__PUBLIC_REVISIONS, CollaborativeRevisionDimension.class, msgs);
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
			case SuperModCollabPackage.PUBLIC_REVISION__REVISION_DIMENSION:
				return getRevisionDimension();
			case SuperModCollabPackage.PUBLIC_REVISION__PRIVATE_REVISIONS:
				return getPrivateRevisions();
			case SuperModCollabPackage.PUBLIC_REVISION__COMMITTER:
				return getCommitter();
			case SuperModCollabPackage.PUBLIC_REVISION__LATEST_PRIVATE_REVISION_NUMBER:
				return getLatestPrivateRevisionNumber();
			case SuperModCollabPackage.PUBLIC_REVISION__INITIAL_PRIVATE_REVISION:
				if (resolve) return getInitialPrivateRevision();
				return basicGetInitialPrivateRevision();
			case SuperModCollabPackage.PUBLIC_REVISION__PRIVATE_HEAD:
				if (resolve) return getPrivateHead();
				return basicGetPrivateHead();
			case SuperModCollabPackage.PUBLIC_REVISION__HEAD:
				return isHead();
			case SuperModCollabPackage.PUBLIC_REVISION__FINISHED:
				return isFinished();
			case SuperModCollabPackage.PUBLIC_REVISION__FINISHED_OPTION:
				return getFinishedOption();
			case SuperModCollabPackage.PUBLIC_REVISION__FINISHED_DEFAULT_BINDING:
				return getFinishedDefaultBinding();
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
			case SuperModCollabPackage.PUBLIC_REVISION__REVISION_DIMENSION:
				setRevisionDimension((CollaborativeRevisionDimension)newValue);
				return;
			case SuperModCollabPackage.PUBLIC_REVISION__PRIVATE_REVISIONS:
				getPrivateRevisions().clear();
				getPrivateRevisions().addAll((Collection<? extends PrivateRevision>)newValue);
				return;
			case SuperModCollabPackage.PUBLIC_REVISION__COMMITTER:
				setCommitter((String)newValue);
				return;
			case SuperModCollabPackage.PUBLIC_REVISION__LATEST_PRIVATE_REVISION_NUMBER:
				setLatestPrivateRevisionNumber((Integer)newValue);
				return;
			case SuperModCollabPackage.PUBLIC_REVISION__INITIAL_PRIVATE_REVISION:
				setInitialPrivateRevision((PrivateRevision)newValue);
				return;
			case SuperModCollabPackage.PUBLIC_REVISION__PRIVATE_HEAD:
				setPrivateHead((PrivateRevision)newValue);
				return;
			case SuperModCollabPackage.PUBLIC_REVISION__FINISHED_OPTION:
				setFinishedOption((Option)newValue);
				return;
			case SuperModCollabPackage.PUBLIC_REVISION__FINISHED_DEFAULT_BINDING:
				setFinishedDefaultBinding((DefaultBinding)newValue);
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
			case SuperModCollabPackage.PUBLIC_REVISION__REVISION_DIMENSION:
				setRevisionDimension((CollaborativeRevisionDimension)null);
				return;
			case SuperModCollabPackage.PUBLIC_REVISION__PRIVATE_REVISIONS:
				getPrivateRevisions().clear();
				return;
			case SuperModCollabPackage.PUBLIC_REVISION__COMMITTER:
				setCommitter(COMMITTER_EDEFAULT);
				return;
			case SuperModCollabPackage.PUBLIC_REVISION__LATEST_PRIVATE_REVISION_NUMBER:
				setLatestPrivateRevisionNumber(LATEST_PRIVATE_REVISION_NUMBER_EDEFAULT);
				return;
			case SuperModCollabPackage.PUBLIC_REVISION__INITIAL_PRIVATE_REVISION:
				setInitialPrivateRevision((PrivateRevision)null);
				return;
			case SuperModCollabPackage.PUBLIC_REVISION__PRIVATE_HEAD:
				setPrivateHead((PrivateRevision)null);
				return;
			case SuperModCollabPackage.PUBLIC_REVISION__FINISHED_OPTION:
				setFinishedOption((Option)null);
				return;
			case SuperModCollabPackage.PUBLIC_REVISION__FINISHED_DEFAULT_BINDING:
				setFinishedDefaultBinding((DefaultBinding)null);
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
			case SuperModCollabPackage.PUBLIC_REVISION__REVISION_DIMENSION:
				return getRevisionDimension() != null;
			case SuperModCollabPackage.PUBLIC_REVISION__PRIVATE_REVISIONS:
				return privateRevisions != null && !privateRevisions.isEmpty();
			case SuperModCollabPackage.PUBLIC_REVISION__COMMITTER:
				return COMMITTER_EDEFAULT == null ? committer != null : !COMMITTER_EDEFAULT.equals(committer);
			case SuperModCollabPackage.PUBLIC_REVISION__LATEST_PRIVATE_REVISION_NUMBER:
				return latestPrivateRevisionNumber != LATEST_PRIVATE_REVISION_NUMBER_EDEFAULT;
			case SuperModCollabPackage.PUBLIC_REVISION__INITIAL_PRIVATE_REVISION:
				return initialPrivateRevision != null;
			case SuperModCollabPackage.PUBLIC_REVISION__PRIVATE_HEAD:
				return privateHead != null;
			case SuperModCollabPackage.PUBLIC_REVISION__HEAD:
				return isHead() != HEAD_EDEFAULT;
			case SuperModCollabPackage.PUBLIC_REVISION__FINISHED:
				return isFinished() != FINISHED_EDEFAULT;
			case SuperModCollabPackage.PUBLIC_REVISION__FINISHED_OPTION:
				return finishedOption != null;
			case SuperModCollabPackage.PUBLIC_REVISION__FINISHED_DEFAULT_BINDING:
				return finishedDefaultBinding != null;
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
		StringBuffer result = new StringBuffer(super.toString());
		result.append(getCommitter());
		return result.toString();
	}

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.mm.core.impl.VersionSpaceElementImpl#basicGetSuperVersionSpaceElement()
	 */
	@Override
	public VersionSpaceElement basicGetSuperVersionSpaceElement() {
		return null;
	}

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.mm.core.impl.VersionSpaceElementImpl#getSubVersionSpaceElements()
	 */
	@Override
	public EList<VersionSpaceElement> getSubVersionSpaceElements() {
		return ECollections.unmodifiableEList(getPrivateRevisions());
	}

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.mm.collab.impl.RevisionImpl#getDisplayRevisionNumber()
	 */
	@Override
	public String getDisplayRevisionNumber() {
		if (isFinished()) {
			return getRevisionNumber() + ".final";
		}
		else {
			return getRevisionNumber() + ".0";
		}
	}
	
	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.mm.collab.impl.RevisionImpl#getLowLevelConcepts()
	 */
	@Override
	public EList<RuleBaseElement> getLowLevelConcepts() {
		EList<RuleBaseElement> result = ECollections.newBasicEList(
				super.getLowLevelConcepts());
		if (getFinishedOption() != null) {
			result.add(getFinishedOption());
		}
		if (getFinishedDefaultBinding() != null) {
			result.add(getFinishedDefaultBinding());
		}
		return ECollections.unmodifiableEList(result);
	}
	
} //PublicRevisionImpl
