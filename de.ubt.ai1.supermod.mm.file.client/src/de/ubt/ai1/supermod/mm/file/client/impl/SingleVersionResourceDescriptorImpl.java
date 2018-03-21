/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.mm.file.client.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

import de.ubt.ai1.supermod.mm.file.client.SingleVersionFolderDescriptor;
import de.ubt.ai1.supermod.mm.file.client.SingleVersionResourceDescriptor;
import de.ubt.ai1.supermod.mm.file.client.SuperModFileClientPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Single Version Resource Descriptor</b></em>'.
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date 	2014-07-28
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai1.supermod.mm.file.client.impl.SingleVersionResourceDescriptorImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.file.client.impl.SingleVersionResourceDescriptorImpl#getPath <em>Path</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.file.client.impl.SingleVersionResourceDescriptorImpl#getContainer <em>Container</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.file.client.impl.SingleVersionResourceDescriptorImpl#isVersioned <em>Versioned</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class SingleVersionResourceDescriptorImpl extends MinimalEObjectImpl.Container implements SingleVersionResourceDescriptor {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected static final String PATH_EDEFAULT = null;

	/**
	 * The default value of the '{@link #isVersioned() <em>Versioned</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVersioned()
	 * @generated
	 * @ordered
	 */
	protected static final boolean VERSIONED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isVersioned() <em>Versioned</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVersioned()
	 * @generated
	 * @ordered
	 */
	protected boolean versioned = VERSIONED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SingleVersionResourceDescriptorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SuperModFileClientPackage.Literals.SINGLE_VERSION_RESOURCE_DESCRIPTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SuperModFileClientPackage.SINGLE_VERSION_RESOURCE_DESCRIPTOR__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getPath() {
		String parentPath = "";
		if (getContainer() != null) {
			parentPath = getContainer().getPath() + "/";
		}
		return parentPath + getName();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleVersionFolderDescriptor getContainer() {
		if (eContainerFeatureID() != SuperModFileClientPackage.SINGLE_VERSION_RESOURCE_DESCRIPTOR__CONTAINER) return null;
		return (SingleVersionFolderDescriptor)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContainer(SingleVersionFolderDescriptor newContainer, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newContainer, SuperModFileClientPackage.SINGLE_VERSION_RESOURCE_DESCRIPTOR__CONTAINER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainer(SingleVersionFolderDescriptor newContainer) {
		if (newContainer != eInternalContainer() || (eContainerFeatureID() != SuperModFileClientPackage.SINGLE_VERSION_RESOURCE_DESCRIPTOR__CONTAINER && newContainer != null)) {
			if (EcoreUtil.isAncestor(this, newContainer))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newContainer != null)
				msgs = ((InternalEObject)newContainer).eInverseAdd(this, SuperModFileClientPackage.SINGLE_VERSION_FOLDER_DESCRIPTOR__CONTENTS, SingleVersionFolderDescriptor.class, msgs);
			msgs = basicSetContainer(newContainer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SuperModFileClientPackage.SINGLE_VERSION_RESOURCE_DESCRIPTOR__CONTAINER, newContainer, newContainer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isVersioned() {
		return versioned;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersioned(boolean newVersioned) {
		boolean oldVersioned = versioned;
		versioned = newVersioned;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SuperModFileClientPackage.SINGLE_VERSION_RESOURCE_DESCRIPTOR__VERSIONED, oldVersioned, versioned));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SuperModFileClientPackage.SINGLE_VERSION_RESOURCE_DESCRIPTOR__CONTAINER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetContainer((SingleVersionFolderDescriptor)otherEnd, msgs);
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
			case SuperModFileClientPackage.SINGLE_VERSION_RESOURCE_DESCRIPTOR__CONTAINER:
				return basicSetContainer(null, msgs);
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
			case SuperModFileClientPackage.SINGLE_VERSION_RESOURCE_DESCRIPTOR__CONTAINER:
				return eInternalContainer().eInverseRemove(this, SuperModFileClientPackage.SINGLE_VERSION_FOLDER_DESCRIPTOR__CONTENTS, SingleVersionFolderDescriptor.class, msgs);
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
			case SuperModFileClientPackage.SINGLE_VERSION_RESOURCE_DESCRIPTOR__NAME:
				return getName();
			case SuperModFileClientPackage.SINGLE_VERSION_RESOURCE_DESCRIPTOR__PATH:
				return getPath();
			case SuperModFileClientPackage.SINGLE_VERSION_RESOURCE_DESCRIPTOR__CONTAINER:
				return getContainer();
			case SuperModFileClientPackage.SINGLE_VERSION_RESOURCE_DESCRIPTOR__VERSIONED:
				return isVersioned();
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
			case SuperModFileClientPackage.SINGLE_VERSION_RESOURCE_DESCRIPTOR__NAME:
				setName((String)newValue);
				return;
			case SuperModFileClientPackage.SINGLE_VERSION_RESOURCE_DESCRIPTOR__CONTAINER:
				setContainer((SingleVersionFolderDescriptor)newValue);
				return;
			case SuperModFileClientPackage.SINGLE_VERSION_RESOURCE_DESCRIPTOR__VERSIONED:
				setVersioned((Boolean)newValue);
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
			case SuperModFileClientPackage.SINGLE_VERSION_RESOURCE_DESCRIPTOR__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SuperModFileClientPackage.SINGLE_VERSION_RESOURCE_DESCRIPTOR__CONTAINER:
				setContainer((SingleVersionFolderDescriptor)null);
				return;
			case SuperModFileClientPackage.SINGLE_VERSION_RESOURCE_DESCRIPTOR__VERSIONED:
				setVersioned(VERSIONED_EDEFAULT);
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
			case SuperModFileClientPackage.SINGLE_VERSION_RESOURCE_DESCRIPTOR__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SuperModFileClientPackage.SINGLE_VERSION_RESOURCE_DESCRIPTOR__PATH:
				return PATH_EDEFAULT == null ? getPath() != null : !PATH_EDEFAULT.equals(getPath());
			case SuperModFileClientPackage.SINGLE_VERSION_RESOURCE_DESCRIPTOR__CONTAINER:
				return getContainer() != null;
			case SuperModFileClientPackage.SINGLE_VERSION_RESOURCE_DESCRIPTOR__VERSIONED:
				return versioned != VERSIONED_EDEFAULT;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", versioned: ");
		result.append(versioned);
		result.append(')');
		return result.toString();
	}

} //SingleVersionResourceDescriptorImpl
