/**
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package de.ubt.ai1.supermod.mm.file.client.impl;

import de.ubt.ai1.supermod.mm.client.impl.ProductDimensionExportTraceImpl;

import de.ubt.ai1.supermod.mm.file.client.SuperModFileClientPackage;
import de.ubt.ai1.supermod.mm.file.client.VersionedFileExportTrace;
import de.ubt.ai1.supermod.mm.file.client.VersionedFileSystemExportTrace;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Versioned File System Export Trace</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai1.supermod.mm.file.client.impl.VersionedFileSystemExportTraceImpl#getPathToVersionedFileMap <em>Path To Versioned File Map</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VersionedFileSystemExportTraceImpl extends ProductDimensionExportTraceImpl implements VersionedFileSystemExportTrace {
	/**
	 * The cached value of the '{@link #getPathToVersionedFileMap() <em>Path To Versioned File Map</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPathToVersionedFileMap()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, VersionedFileExportTrace> pathToVersionedFileMap;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VersionedFileSystemExportTraceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SuperModFileClientPackage.Literals.VERSIONED_FILE_SYSTEM_EXPORT_TRACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, VersionedFileExportTrace> getPathToVersionedFileMap() {
		if (pathToVersionedFileMap == null) {
			pathToVersionedFileMap = new EcoreEMap<String,VersionedFileExportTrace>(SuperModFileClientPackage.Literals.PATH_TO_VERSIONED_FILE_MAP_ENTRY, PathToVersionedFileMapEntryImpl.class, this, SuperModFileClientPackage.VERSIONED_FILE_SYSTEM_EXPORT_TRACE__PATH_TO_VERSIONED_FILE_MAP);
		}
		return pathToVersionedFileMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SuperModFileClientPackage.VERSIONED_FILE_SYSTEM_EXPORT_TRACE__PATH_TO_VERSIONED_FILE_MAP:
				return ((InternalEList<?>)getPathToVersionedFileMap()).basicRemove(otherEnd, msgs);
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
			case SuperModFileClientPackage.VERSIONED_FILE_SYSTEM_EXPORT_TRACE__PATH_TO_VERSIONED_FILE_MAP:
				if (coreType) return getPathToVersionedFileMap();
				else return getPathToVersionedFileMap().map();
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
			case SuperModFileClientPackage.VERSIONED_FILE_SYSTEM_EXPORT_TRACE__PATH_TO_VERSIONED_FILE_MAP:
				((EStructuralFeature.Setting)getPathToVersionedFileMap()).set(newValue);
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
			case SuperModFileClientPackage.VERSIONED_FILE_SYSTEM_EXPORT_TRACE__PATH_TO_VERSIONED_FILE_MAP:
				getPathToVersionedFileMap().clear();
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
			case SuperModFileClientPackage.VERSIONED_FILE_SYSTEM_EXPORT_TRACE__PATH_TO_VERSIONED_FILE_MAP:
				return pathToVersionedFileMap != null && !pathToVersionedFileMap.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //VersionedFileSystemExportTraceImpl
