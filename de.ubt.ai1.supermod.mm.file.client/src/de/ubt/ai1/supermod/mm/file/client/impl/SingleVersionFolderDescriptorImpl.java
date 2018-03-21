/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.mm.file.client.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import de.ubt.ai1.supermod.mm.file.client.SingleVersionFolderDescriptor;
import de.ubt.ai1.supermod.mm.file.client.SingleVersionResourceDescriptor;
import de.ubt.ai1.supermod.mm.file.client.SuperModFileClientPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Single Version Folder Descriptor</b></em>'.
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date 	2014-07-28
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai1.supermod.mm.file.client.impl.SingleVersionFolderDescriptorImpl#getContents <em>Contents</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.file.client.impl.SingleVersionFolderDescriptorImpl#getAllContents <em>All Contents</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SingleVersionFolderDescriptorImpl extends SingleVersionResourceDescriptorImpl implements SingleVersionFolderDescriptor {
	/**
	 * The cached value of the '{@link #getContents() <em>Contents</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContents()
	 * @generated
	 * @ordered
	 */
	protected EList<SingleVersionResourceDescriptor> contents;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SingleVersionFolderDescriptorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SuperModFileClientPackage.Literals.SINGLE_VERSION_FOLDER_DESCRIPTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SingleVersionResourceDescriptor> getContents() {
		if (contents == null) {
			contents = new EObjectContainmentWithInverseEList<SingleVersionResourceDescriptor>(SingleVersionResourceDescriptor.class, this, SuperModFileClientPackage.SINGLE_VERSION_FOLDER_DESCRIPTOR__CONTENTS, SuperModFileClientPackage.SINGLE_VERSION_RESOURCE_DESCRIPTOR__CONTAINER);
		}
		return contents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<SingleVersionResourceDescriptor> getAllContents() {
		EList<SingleVersionResourceDescriptor> allContents = ECollections.newBasicEList();
		for (SingleVersionResourceDescriptor content : getContents()) {
			allContents.add(content);
			if (content instanceof SingleVersionFolderDescriptor) {
				allContents.addAll(((SingleVersionFolderDescriptor) content).getAllContents());
			}
		}
		return ECollections.unmodifiableEList(allContents);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public SingleVersionResourceDescriptor getContent(String name) {
		for (SingleVersionResourceDescriptor content : getContents()) {
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
			case SuperModFileClientPackage.SINGLE_VERSION_FOLDER_DESCRIPTOR__CONTENTS:
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
			case SuperModFileClientPackage.SINGLE_VERSION_FOLDER_DESCRIPTOR__CONTENTS:
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
			case SuperModFileClientPackage.SINGLE_VERSION_FOLDER_DESCRIPTOR__CONTENTS:
				return getContents();
			case SuperModFileClientPackage.SINGLE_VERSION_FOLDER_DESCRIPTOR__ALL_CONTENTS:
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
			case SuperModFileClientPackage.SINGLE_VERSION_FOLDER_DESCRIPTOR__CONTENTS:
				getContents().clear();
				getContents().addAll((Collection<? extends SingleVersionResourceDescriptor>)newValue);
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
			case SuperModFileClientPackage.SINGLE_VERSION_FOLDER_DESCRIPTOR__CONTENTS:
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
			case SuperModFileClientPackage.SINGLE_VERSION_FOLDER_DESCRIPTOR__CONTENTS:
				return contents != null && !contents.isEmpty();
			case SuperModFileClientPackage.SINGLE_VERSION_FOLDER_DESCRIPTOR__ALL_CONTENTS:
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
			case SuperModFileClientPackage.SINGLE_VERSION_FOLDER_DESCRIPTOR___GET_CONTENT__STRING:
				return getContent((String)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //SingleVersionFolderDescriptorImpl
