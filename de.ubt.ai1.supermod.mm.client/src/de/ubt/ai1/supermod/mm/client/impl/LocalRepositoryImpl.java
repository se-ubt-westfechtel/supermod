/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.mm.client.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import de.ubt.ai1.supermod.mm.client.LocalRepository;
import de.ubt.ai1.supermod.mm.client.SingleVersionProductSpaceDescriptor;
import de.ubt.ai1.supermod.mm.client.SuperModClientPackage;
import de.ubt.ai1.supermod.mm.core.OptionBinding;
import de.ubt.ai1.supermod.mm.core.impl.RepositoryImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Local Repository</b></em>'.
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date 	2014-07-28
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai1.supermod.mm.client.impl.LocalRepositoryImpl#getLocalDescriptor <em>Local Descriptor</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.client.impl.LocalRepositoryImpl#getLocalChoice <em>Local Choice</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.client.impl.LocalRepositoryImpl#getLocalAmbition <em>Local Ambition</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.client.impl.LocalRepositoryImpl#getRemoteUri <em>Remote Uri</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.client.impl.LocalRepositoryImpl#getRemoteUser <em>Remote User</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.client.impl.LocalRepositoryImpl#isLocallyModified <em>Locally Modified</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.client.impl.LocalRepositoryImpl#getReadTransactionId <em>Read Transaction Id</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.client.impl.LocalRepositoryImpl#getWriteTransactionId <em>Write Transaction Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LocalRepositoryImpl extends RepositoryImpl implements LocalRepository {
	/**
	 * The cached value of the '{@link #getLocalDescriptor() <em>Local Descriptor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalDescriptor()
	 * @generated
	 * @ordered
	 */
	protected SingleVersionProductSpaceDescriptor localDescriptor;

	/**
	 * The cached value of the '{@link #getLocalChoice() <em>Local Choice</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalChoice()
	 * @generated
	 * @ordered
	 */
	protected OptionBinding localChoice;

	/**
	 * The cached value of the '{@link #getLocalAmbition() <em>Local Ambition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalAmbition()
	 * @generated
	 * @ordered
	 */
	protected OptionBinding localAmbition;

	/**
	 * The default value of the '{@link #getRemoteUri() <em>Remote Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemoteUri()
	 * @generated
	 * @ordered
	 */
	protected static final String REMOTE_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRemoteUri() <em>Remote Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemoteUri()
	 * @generated
	 * @ordered
	 */
	protected String remoteUri = REMOTE_URI_EDEFAULT;

	/**
	 * The default value of the '{@link #getRemoteUser() <em>Remote User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemoteUser()
	 * @generated
	 * @ordered
	 */
	protected static final String REMOTE_USER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRemoteUser() <em>Remote User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemoteUser()
	 * @generated
	 * @ordered
	 */
	protected String remoteUser = REMOTE_USER_EDEFAULT;

	/**
	 * The default value of the '{@link #isLocallyModified() <em>Locally Modified</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLocallyModified()
	 * @generated
	 * @ordered
	 */
	protected static final boolean LOCALLY_MODIFIED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isLocallyModified() <em>Locally Modified</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLocallyModified()
	 * @generated
	 * @ordered
	 */
	protected boolean locallyModified = LOCALLY_MODIFIED_EDEFAULT;

	/**
	 * The default value of the '{@link #getReadTransactionId() <em>Read Transaction Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadTransactionId()
	 * @generated
	 * @ordered
	 */
	protected static final int READ_TRANSACTION_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getReadTransactionId() <em>Read Transaction Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadTransactionId()
	 * @generated
	 * @ordered
	 */
	protected int readTransactionId = READ_TRANSACTION_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getWriteTransactionId() <em>Write Transaction Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWriteTransactionId()
	 * @generated
	 * @ordered
	 */
	protected static final int WRITE_TRANSACTION_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getWriteTransactionId() <em>Write Transaction Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWriteTransactionId()
	 * @generated
	 * @ordered
	 */
	protected int writeTransactionId = WRITE_TRANSACTION_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LocalRepositoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SuperModClientPackage.Literals.LOCAL_REPOSITORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleVersionProductSpaceDescriptor getLocalDescriptor() {
		return localDescriptor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocalDescriptor(SingleVersionProductSpaceDescriptor newLocalDescriptor, NotificationChain msgs) {
		SingleVersionProductSpaceDescriptor oldLocalDescriptor = localDescriptor;
		localDescriptor = newLocalDescriptor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SuperModClientPackage.LOCAL_REPOSITORY__LOCAL_DESCRIPTOR, oldLocalDescriptor, newLocalDescriptor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocalDescriptor(SingleVersionProductSpaceDescriptor newLocalDescriptor) {
		if (newLocalDescriptor != localDescriptor) {
			NotificationChain msgs = null;
			if (localDescriptor != null)
				msgs = ((InternalEObject)localDescriptor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SuperModClientPackage.LOCAL_REPOSITORY__LOCAL_DESCRIPTOR, null, msgs);
			if (newLocalDescriptor != null)
				msgs = ((InternalEObject)newLocalDescriptor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SuperModClientPackage.LOCAL_REPOSITORY__LOCAL_DESCRIPTOR, null, msgs);
			msgs = basicSetLocalDescriptor(newLocalDescriptor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SuperModClientPackage.LOCAL_REPOSITORY__LOCAL_DESCRIPTOR, newLocalDescriptor, newLocalDescriptor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OptionBinding getLocalChoice() {
		if (localChoice != null && localChoice.eIsProxy()) {
			InternalEObject oldLocalChoice = (InternalEObject)localChoice;
			localChoice = (OptionBinding)eResolveProxy(oldLocalChoice);
			if (localChoice != oldLocalChoice) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SuperModClientPackage.LOCAL_REPOSITORY__LOCAL_CHOICE, oldLocalChoice, localChoice));
			}
		}
		return localChoice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OptionBinding basicGetLocalChoice() {
		return localChoice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocalChoice(OptionBinding newLocalChoice) {
		OptionBinding oldLocalChoice = localChoice;
		localChoice = newLocalChoice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SuperModClientPackage.LOCAL_REPOSITORY__LOCAL_CHOICE, oldLocalChoice, localChoice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OptionBinding getLocalAmbition() {
		if (localAmbition != null && localAmbition.eIsProxy()) {
			InternalEObject oldLocalAmbition = (InternalEObject)localAmbition;
			localAmbition = (OptionBinding)eResolveProxy(oldLocalAmbition);
			if (localAmbition != oldLocalAmbition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SuperModClientPackage.LOCAL_REPOSITORY__LOCAL_AMBITION, oldLocalAmbition, localAmbition));
			}
		}
		return localAmbition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OptionBinding basicGetLocalAmbition() {
		return localAmbition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocalAmbition(OptionBinding newLocalAmbition) {
		OptionBinding oldLocalAmbition = localAmbition;
		localAmbition = newLocalAmbition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SuperModClientPackage.LOCAL_REPOSITORY__LOCAL_AMBITION, oldLocalAmbition, localAmbition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRemoteUri() {
		return remoteUri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRemoteUri(String newRemoteUri) {
		String oldRemoteUri = remoteUri;
		remoteUri = newRemoteUri;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SuperModClientPackage.LOCAL_REPOSITORY__REMOTE_URI, oldRemoteUri, remoteUri));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRemoteUser() {
		return remoteUser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRemoteUser(String newRemoteUser) {
		String oldRemoteUser = remoteUser;
		remoteUser = newRemoteUser;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SuperModClientPackage.LOCAL_REPOSITORY__REMOTE_USER, oldRemoteUser, remoteUser));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isLocallyModified() {
		return locallyModified;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocallyModified(boolean newLocallyModified) {
		boolean oldLocallyModified = locallyModified;
		locallyModified = newLocallyModified;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SuperModClientPackage.LOCAL_REPOSITORY__LOCALLY_MODIFIED, oldLocallyModified, locallyModified));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getReadTransactionId() {
		return readTransactionId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReadTransactionId(int newReadTransactionId) {
		int oldReadTransactionId = readTransactionId;
		readTransactionId = newReadTransactionId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SuperModClientPackage.LOCAL_REPOSITORY__READ_TRANSACTION_ID, oldReadTransactionId, readTransactionId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getWriteTransactionId() {
		return writeTransactionId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWriteTransactionId(int newWriteTransactionId) {
		int oldWriteTransactionId = writeTransactionId;
		writeTransactionId = newWriteTransactionId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SuperModClientPackage.LOCAL_REPOSITORY__WRITE_TRANSACTION_ID, oldWriteTransactionId, writeTransactionId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SuperModClientPackage.LOCAL_REPOSITORY__LOCAL_DESCRIPTOR:
				return basicSetLocalDescriptor(null, msgs);
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
			case SuperModClientPackage.LOCAL_REPOSITORY__LOCAL_DESCRIPTOR:
				return getLocalDescriptor();
			case SuperModClientPackage.LOCAL_REPOSITORY__LOCAL_CHOICE:
				if (resolve) return getLocalChoice();
				return basicGetLocalChoice();
			case SuperModClientPackage.LOCAL_REPOSITORY__LOCAL_AMBITION:
				if (resolve) return getLocalAmbition();
				return basicGetLocalAmbition();
			case SuperModClientPackage.LOCAL_REPOSITORY__REMOTE_URI:
				return getRemoteUri();
			case SuperModClientPackage.LOCAL_REPOSITORY__REMOTE_USER:
				return getRemoteUser();
			case SuperModClientPackage.LOCAL_REPOSITORY__LOCALLY_MODIFIED:
				return isLocallyModified();
			case SuperModClientPackage.LOCAL_REPOSITORY__READ_TRANSACTION_ID:
				return getReadTransactionId();
			case SuperModClientPackage.LOCAL_REPOSITORY__WRITE_TRANSACTION_ID:
				return getWriteTransactionId();
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
			case SuperModClientPackage.LOCAL_REPOSITORY__LOCAL_DESCRIPTOR:
				setLocalDescriptor((SingleVersionProductSpaceDescriptor)newValue);
				return;
			case SuperModClientPackage.LOCAL_REPOSITORY__LOCAL_CHOICE:
				setLocalChoice((OptionBinding)newValue);
				return;
			case SuperModClientPackage.LOCAL_REPOSITORY__LOCAL_AMBITION:
				setLocalAmbition((OptionBinding)newValue);
				return;
			case SuperModClientPackage.LOCAL_REPOSITORY__REMOTE_URI:
				setRemoteUri((String)newValue);
				return;
			case SuperModClientPackage.LOCAL_REPOSITORY__REMOTE_USER:
				setRemoteUser((String)newValue);
				return;
			case SuperModClientPackage.LOCAL_REPOSITORY__LOCALLY_MODIFIED:
				setLocallyModified((Boolean)newValue);
				return;
			case SuperModClientPackage.LOCAL_REPOSITORY__READ_TRANSACTION_ID:
				setReadTransactionId((Integer)newValue);
				return;
			case SuperModClientPackage.LOCAL_REPOSITORY__WRITE_TRANSACTION_ID:
				setWriteTransactionId((Integer)newValue);
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
			case SuperModClientPackage.LOCAL_REPOSITORY__LOCAL_DESCRIPTOR:
				setLocalDescriptor((SingleVersionProductSpaceDescriptor)null);
				return;
			case SuperModClientPackage.LOCAL_REPOSITORY__LOCAL_CHOICE:
				setLocalChoice((OptionBinding)null);
				return;
			case SuperModClientPackage.LOCAL_REPOSITORY__LOCAL_AMBITION:
				setLocalAmbition((OptionBinding)null);
				return;
			case SuperModClientPackage.LOCAL_REPOSITORY__REMOTE_URI:
				setRemoteUri(REMOTE_URI_EDEFAULT);
				return;
			case SuperModClientPackage.LOCAL_REPOSITORY__REMOTE_USER:
				setRemoteUser(REMOTE_USER_EDEFAULT);
				return;
			case SuperModClientPackage.LOCAL_REPOSITORY__LOCALLY_MODIFIED:
				setLocallyModified(LOCALLY_MODIFIED_EDEFAULT);
				return;
			case SuperModClientPackage.LOCAL_REPOSITORY__READ_TRANSACTION_ID:
				setReadTransactionId(READ_TRANSACTION_ID_EDEFAULT);
				return;
			case SuperModClientPackage.LOCAL_REPOSITORY__WRITE_TRANSACTION_ID:
				setWriteTransactionId(WRITE_TRANSACTION_ID_EDEFAULT);
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
			case SuperModClientPackage.LOCAL_REPOSITORY__LOCAL_DESCRIPTOR:
				return localDescriptor != null;
			case SuperModClientPackage.LOCAL_REPOSITORY__LOCAL_CHOICE:
				return localChoice != null;
			case SuperModClientPackage.LOCAL_REPOSITORY__LOCAL_AMBITION:
				return localAmbition != null;
			case SuperModClientPackage.LOCAL_REPOSITORY__REMOTE_URI:
				return REMOTE_URI_EDEFAULT == null ? remoteUri != null : !REMOTE_URI_EDEFAULT.equals(remoteUri);
			case SuperModClientPackage.LOCAL_REPOSITORY__REMOTE_USER:
				return REMOTE_USER_EDEFAULT == null ? remoteUser != null : !REMOTE_USER_EDEFAULT.equals(remoteUser);
			case SuperModClientPackage.LOCAL_REPOSITORY__LOCALLY_MODIFIED:
				return locallyModified != LOCALLY_MODIFIED_EDEFAULT;
			case SuperModClientPackage.LOCAL_REPOSITORY__READ_TRANSACTION_ID:
				return readTransactionId != READ_TRANSACTION_ID_EDEFAULT;
			case SuperModClientPackage.LOCAL_REPOSITORY__WRITE_TRANSACTION_ID:
				return writeTransactionId != WRITE_TRANSACTION_ID_EDEFAULT;
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
		result.append(" (remoteUri: ");
		result.append(remoteUri);
		result.append(", remoteUser: ");
		result.append(remoteUser);
		result.append(", locallyModified: ");
		result.append(locallyModified);
		result.append(", readTransactionId: ");
		result.append(readTransactionId);
		result.append(", writeTransactionId: ");
		result.append(writeTransactionId);
		result.append(')');
		return result.toString();
	}

} //LocalRepositoryImpl
