/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.mm.file.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import de.ubt.ai1.supermod.mm.core.ProductSpaceElement;
import de.ubt.ai1.supermod.mm.file.SuperModFilePackage;
import de.ubt.ai1.supermod.mm.file.VersionedFolder;
import de.ubt.ai1.supermod.mm.file.VersionedResource;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Versioned Folder</b></em>'.
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date 	2014-07-28
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai1.supermod.mm.file.impl.VersionedFolderImpl#getContents <em>Contents</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.file.impl.VersionedFolderImpl#getAllContents <em>All Contents</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VersionedFolderImpl extends VersionedResourceImpl implements VersionedFolder {
	/**
	 * The cached value of the '{@link #getContents() <em>Contents</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContents()
	 * @generated
	 * @ordered
	 */
	protected EList<VersionedResource> contents;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VersionedFolderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SuperModFilePackage.Literals.VERSIONED_FOLDER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VersionedResource> getContents() {
		if (contents == null) {
			contents = new EObjectContainmentWithInverseEList<VersionedResource>(VersionedResource.class, this, SuperModFilePackage.VERSIONED_FOLDER__CONTENTS, SuperModFilePackage.VERSIONED_RESOURCE__CONTAINER);
		}
		return contents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<VersionedResource> getAllContents() {
		EList<VersionedResource> allContents = ECollections.newBasicEList();
		for (VersionedResource content : getContents()) {
			allContents.add(content);
			if (content instanceof VersionedFolder) {
				allContents.addAll(((VersionedFolder) content).getAllContents());
			}
		}
		return ECollections.unmodifiableEList(allContents);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public VersionedResource getContent(String name) {
		for (VersionedResource content : getContents()) {
			if (name.equals(content.getName())) {
				return content;
			}
		}
		return null;
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
			case SuperModFilePackage.VERSIONED_FOLDER__CONTENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getContents()).basicAdd(otherEnd, msgs);
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
			case SuperModFilePackage.VERSIONED_FOLDER__CONTENTS:
				return ((InternalEList<?>)getContents()).basicRemove(otherEnd, msgs);
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
			case SuperModFilePackage.VERSIONED_FOLDER__CONTENTS:
				return getContents();
			case SuperModFilePackage.VERSIONED_FOLDER__ALL_CONTENTS:
				return getAllContents();
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
			case SuperModFilePackage.VERSIONED_FOLDER__CONTENTS:
				getContents().clear();
				getContents().addAll((Collection<? extends VersionedResource>)newValue);
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
			case SuperModFilePackage.VERSIONED_FOLDER__CONTENTS:
				getContents().clear();
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
			case SuperModFilePackage.VERSIONED_FOLDER__CONTENTS:
				return contents != null && !contents.isEmpty();
			case SuperModFilePackage.VERSIONED_FOLDER__ALL_CONTENTS:
				return !getAllContents().isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case SuperModFilePackage.VERSIONED_FOLDER___GET_CONTENT__STRING:
				return getContent((String)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	@Override
	public EList<ProductSpaceElement> getSubProductSpaceElements() {
		return ECollections.unmodifiableEList(getContents());
	}

} //VersionedFolderImpl
