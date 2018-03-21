/**
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package de.ubt.ai1.supermod.mm.file.client.impl;

import de.ubt.ai1.supermod.mm.file.VersionedFile;
import de.ubt.ai1.supermod.mm.file.client.SuperModFileClientPackage;
import de.ubt.ai1.supermod.mm.file.client.VersionedFileExportTrace;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Versioned File Export Trace</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai1.supermod.mm.file.client.impl.VersionedFileExportTraceImpl#getVersionedFile <em>Versioned File</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class VersionedFileExportTraceImpl extends MinimalEObjectImpl.Container implements VersionedFileExportTrace {
	/**
	 * The cached value of the '{@link #getVersionedFile() <em>Versioned File</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersionedFile()
	 * @generated
	 * @ordered
	 */
	protected VersionedFile versionedFile;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VersionedFileExportTraceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SuperModFileClientPackage.Literals.VERSIONED_FILE_EXPORT_TRACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VersionedFile getVersionedFile() {
		if (versionedFile != null && versionedFile.eIsProxy()) {
			InternalEObject oldVersionedFile = (InternalEObject)versionedFile;
			versionedFile = (VersionedFile)eResolveProxy(oldVersionedFile);
			if (versionedFile != oldVersionedFile) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SuperModFileClientPackage.VERSIONED_FILE_EXPORT_TRACE__VERSIONED_FILE, oldVersionedFile, versionedFile));
			}
		}
		return versionedFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VersionedFile basicGetVersionedFile() {
		return versionedFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersionedFile(VersionedFile newVersionedFile) {
		VersionedFile oldVersionedFile = versionedFile;
		versionedFile = newVersionedFile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SuperModFileClientPackage.VERSIONED_FILE_EXPORT_TRACE__VERSIONED_FILE, oldVersionedFile, versionedFile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SuperModFileClientPackage.VERSIONED_FILE_EXPORT_TRACE__VERSIONED_FILE:
				if (resolve) return getVersionedFile();
				return basicGetVersionedFile();
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
			case SuperModFileClientPackage.VERSIONED_FILE_EXPORT_TRACE__VERSIONED_FILE:
				setVersionedFile((VersionedFile)newValue);
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
			case SuperModFileClientPackage.VERSIONED_FILE_EXPORT_TRACE__VERSIONED_FILE:
				setVersionedFile((VersionedFile)null);
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
			case SuperModFileClientPackage.VERSIONED_FILE_EXPORT_TRACE__VERSIONED_FILE:
				return versionedFile != null;
		}
		return super.eIsSet(featureID);
	}

} //VersionedFileExportTraceImpl
