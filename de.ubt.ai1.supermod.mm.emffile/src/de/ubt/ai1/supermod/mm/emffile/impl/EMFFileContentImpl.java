/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.mm.emffile.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import de.ubt.ai1.supermod.mm.core.ProductSpaceElement;
import de.ubt.ai1.supermod.mm.emffile.EMFFileContent;
import de.ubt.ai1.supermod.mm.emffile.EMFObject;
import de.ubt.ai1.supermod.mm.emffile.SuperModEMFFilePackage;
import de.ubt.ai1.supermod.mm.file.impl.VersionedFileContentImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EMF File Content</b></em>'.
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date 	2014-07-28
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai1.supermod.mm.emffile.impl.EMFFileContentImpl#getObjects <em>Objects</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.emffile.impl.EMFFileContentImpl#getRoots <em>Roots</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EMFFileContentImpl extends VersionedFileContentImpl implements EMFFileContent {
	/**
	 * The cached value of the '{@link #getObjects() <em>Objects</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjects()
	 * @generated
	 * @ordered
	 */
	protected EList<EMFObject> objects;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EMFFileContentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SuperModEMFFilePackage.Literals.EMF_FILE_CONTENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EMFObject> getObjects() {
		if (objects == null) {
			objects = new EObjectContainmentEList<EMFObject>(EMFObject.class, this, SuperModEMFFilePackage.EMF_FILE_CONTENT__OBJECTS);
		}
		return objects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<EMFObject> getRoots() {
		EList<EMFObject> roots = ECollections.newBasicEList();
		for (EMFObject emfO : getObjects()) {
			if (emfO.getTargetingContainmentRefVals().isEmpty()) {
				roots.add(emfO);
			}
		}
		return ECollections.unmodifiableEList(roots);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SuperModEMFFilePackage.EMF_FILE_CONTENT__OBJECTS:
				return ((InternalEList<?>)getObjects()).basicRemove(otherEnd, msgs);
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
			case SuperModEMFFilePackage.EMF_FILE_CONTENT__OBJECTS:
				return getObjects();
			case SuperModEMFFilePackage.EMF_FILE_CONTENT__ROOTS:
				return getRoots();
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
			case SuperModEMFFilePackage.EMF_FILE_CONTENT__OBJECTS:
				getObjects().clear();
				getObjects().addAll((Collection<? extends EMFObject>)newValue);
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
			case SuperModEMFFilePackage.EMF_FILE_CONTENT__OBJECTS:
				getObjects().clear();
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
			case SuperModEMFFilePackage.EMF_FILE_CONTENT__OBJECTS:
				return objects != null && !objects.isEmpty();
			case SuperModEMFFilePackage.EMF_FILE_CONTENT__ROOTS:
				return !getRoots().isEmpty();
		}
		return super.eIsSet(featureID);
	}

	@Override
	public EList<ProductSpaceElement> getSubProductSpaceElements() {
		EList<ProductSpaceElement> subElements = ECollections.newBasicEList();
		subElements.addAll(getObjects());
		return ECollections.unmodifiableEList(subElements);
	}

	@Override
	public String getSuperExtension() {
		return "supermodemf";
	}

} //EMFFileContentImpl
