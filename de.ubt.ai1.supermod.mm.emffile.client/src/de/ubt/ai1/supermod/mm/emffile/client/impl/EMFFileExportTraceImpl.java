/**
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package de.ubt.ai1.supermod.mm.emffile.client.impl;

import de.ubt.ai1.supermod.mm.emffile.EMFObject;

import de.ubt.ai1.supermod.mm.emffile.client.EMFFileExportTrace;
import de.ubt.ai1.supermod.mm.emffile.client.SuperModEMFFileClientPackage;

import de.ubt.ai1.supermod.mm.file.client.impl.VersionedFileExportTraceImpl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EMF File Export Trace</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai1.supermod.mm.emffile.client.impl.EMFFileExportTraceImpl#getEmfObjectToEObjectMap <em>Emf Object To EObject Map</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EMFFileExportTraceImpl extends VersionedFileExportTraceImpl implements EMFFileExportTrace {
	/**
	 * The cached value of the '{@link #getEmfObjectToEObjectMap() <em>Emf Object To EObject Map</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmfObjectToEObjectMap()
	 * @generated
	 * @ordered
	 */
	protected EMap<EMFObject, EObject> emfObjectToEObjectMap;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EMFFileExportTraceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SuperModEMFFileClientPackage.Literals.EMF_FILE_EXPORT_TRACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<EMFObject, EObject> getEmfObjectToEObjectMap() {
		if (emfObjectToEObjectMap == null) {
			emfObjectToEObjectMap = new EcoreEMap<EMFObject,EObject>(SuperModEMFFileClientPackage.Literals.EMF_OBJECT_TO_EOBJECT_MAP_ENTRY, EMFObjectToEObjectMapEntryImpl.class, this, SuperModEMFFileClientPackage.EMF_FILE_EXPORT_TRACE__EMF_OBJECT_TO_EOBJECT_MAP);
		}
		return emfObjectToEObjectMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SuperModEMFFileClientPackage.EMF_FILE_EXPORT_TRACE__EMF_OBJECT_TO_EOBJECT_MAP:
				return ((InternalEList<?>)getEmfObjectToEObjectMap()).basicRemove(otherEnd, msgs);
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
			case SuperModEMFFileClientPackage.EMF_FILE_EXPORT_TRACE__EMF_OBJECT_TO_EOBJECT_MAP:
				if (coreType) return getEmfObjectToEObjectMap();
				else return getEmfObjectToEObjectMap().map();
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
			case SuperModEMFFileClientPackage.EMF_FILE_EXPORT_TRACE__EMF_OBJECT_TO_EOBJECT_MAP:
				((EStructuralFeature.Setting)getEmfObjectToEObjectMap()).set(newValue);
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
			case SuperModEMFFileClientPackage.EMF_FILE_EXPORT_TRACE__EMF_OBJECT_TO_EOBJECT_MAP:
				getEmfObjectToEObjectMap().clear();
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
			case SuperModEMFFileClientPackage.EMF_FILE_EXPORT_TRACE__EMF_OBJECT_TO_EOBJECT_MAP:
				return emfObjectToEObjectMap != null && !emfObjectToEObjectMap.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EMFFileExportTraceImpl
