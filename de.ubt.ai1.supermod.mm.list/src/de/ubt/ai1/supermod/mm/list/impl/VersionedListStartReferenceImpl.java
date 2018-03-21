/******************************************************************************
 * Copyright (c) 2018 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.mm.list.impl;

import de.ubt.ai1.supermod.mm.core.ProductSpaceElement;
import de.ubt.ai1.supermod.mm.core.impl.ProductSpaceElementImpl;

import de.ubt.ai1.supermod.mm.list.SuperModListPackage;
import de.ubt.ai1.supermod.mm.list.VersionedList;
import de.ubt.ai1.supermod.mm.list.VersionedListStartReference;
import de.ubt.ai1.supermod.mm.list.VersionedListVertex;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Versioned List Start Reference</b></em>'.
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>,
 * 			Johannes Schroepfer <Johannes.M.Schroepfer(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	2018-01-09
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai1.supermod.mm.list.impl.VersionedListStartReferenceImpl#getVertex <em>Vertex</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.list.impl.VersionedListStartReferenceImpl#getList <em>List</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VersionedListStartReferenceImpl extends ProductSpaceElementImpl implements VersionedListStartReference {
	/**
	 * The cached value of the '{@link #getVertex() <em>Vertex</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVertex()
	 * @generated
	 * @ordered
	 */
	protected VersionedListVertex vertex;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VersionedListStartReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SuperModListPackage.Literals.VERSIONED_LIST_START_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VersionedListVertex getVertex() {
		if (vertex != null && vertex.eIsProxy()) {
			InternalEObject oldVertex = (InternalEObject)vertex;
			vertex = (VersionedListVertex)eResolveProxy(oldVertex);
			if (vertex != oldVertex) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SuperModListPackage.VERSIONED_LIST_START_REFERENCE__VERTEX, oldVertex, vertex));
			}
		}
		return vertex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VersionedListVertex basicGetVertex() {
		return vertex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVertex(VersionedListVertex newVertex, NotificationChain msgs) {
		VersionedListVertex oldVertex = vertex;
		vertex = newVertex;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SuperModListPackage.VERSIONED_LIST_START_REFERENCE__VERTEX, oldVertex, newVertex);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVertex(VersionedListVertex newVertex) {
		if (newVertex != vertex) {
			NotificationChain msgs = null;
			if (vertex != null)
				msgs = ((InternalEObject)vertex).eInverseRemove(this, SuperModListPackage.VERSIONED_LIST_VERTEX__START_REF, VersionedListVertex.class, msgs);
			if (newVertex != null)
				msgs = ((InternalEObject)newVertex).eInverseAdd(this, SuperModListPackage.VERSIONED_LIST_VERTEX__START_REF, VersionedListVertex.class, msgs);
			msgs = basicSetVertex(newVertex, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SuperModListPackage.VERSIONED_LIST_START_REFERENCE__VERTEX, newVertex, newVertex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VersionedList getList() {
		if (eContainerFeatureID() != SuperModListPackage.VERSIONED_LIST_START_REFERENCE__LIST) return null;
		return (VersionedList)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetList(VersionedList newList, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newList, SuperModListPackage.VERSIONED_LIST_START_REFERENCE__LIST, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setList(VersionedList newList) {
		if (newList != eInternalContainer() || (eContainerFeatureID() != SuperModListPackage.VERSIONED_LIST_START_REFERENCE__LIST && newList != null)) {
			if (EcoreUtil.isAncestor(this, newList))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newList != null)
				msgs = ((InternalEObject)newList).eInverseAdd(this, SuperModListPackage.VERSIONED_LIST__START_VERTICES, VersionedList.class, msgs);
			msgs = basicSetList(newList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SuperModListPackage.VERSIONED_LIST_START_REFERENCE__LIST, newList, newList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SuperModListPackage.VERSIONED_LIST_START_REFERENCE__VERTEX:
				if (vertex != null)
					msgs = ((InternalEObject)vertex).eInverseRemove(this, SuperModListPackage.VERSIONED_LIST_VERTEX__START_REF, VersionedListVertex.class, msgs);
				return basicSetVertex((VersionedListVertex)otherEnd, msgs);
			case SuperModListPackage.VERSIONED_LIST_START_REFERENCE__LIST:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetList((VersionedList)otherEnd, msgs);
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
			case SuperModListPackage.VERSIONED_LIST_START_REFERENCE__VERTEX:
				return basicSetVertex(null, msgs);
			case SuperModListPackage.VERSIONED_LIST_START_REFERENCE__LIST:
				return basicSetList(null, msgs);
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
			case SuperModListPackage.VERSIONED_LIST_START_REFERENCE__LIST:
				return eInternalContainer().eInverseRemove(this, SuperModListPackage.VERSIONED_LIST__START_VERTICES, VersionedList.class, msgs);
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
			case SuperModListPackage.VERSIONED_LIST_START_REFERENCE__VERTEX:
				if (resolve) return getVertex();
				return basicGetVertex();
			case SuperModListPackage.VERSIONED_LIST_START_REFERENCE__LIST:
				return getList();
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
			case SuperModListPackage.VERSIONED_LIST_START_REFERENCE__VERTEX:
				setVertex((VersionedListVertex)newValue);
				return;
			case SuperModListPackage.VERSIONED_LIST_START_REFERENCE__LIST:
				setList((VersionedList)newValue);
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
			case SuperModListPackage.VERSIONED_LIST_START_REFERENCE__VERTEX:
				setVertex((VersionedListVertex)null);
				return;
			case SuperModListPackage.VERSIONED_LIST_START_REFERENCE__LIST:
				setList((VersionedList)null);
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
			case SuperModListPackage.VERSIONED_LIST_START_REFERENCE__VERTEX:
				return vertex != null;
			case SuperModListPackage.VERSIONED_LIST_START_REFERENCE__LIST:
				return getList() != null;
		}
		return super.eIsSet(featureID);
	}

	@Override
	public ProductSpaceElement basicGetSuperProductSpaceElement() {
		
		return getList();
	}

	@Override
	public EList<ProductSpaceElement> getSubProductSpaceElements() {
		
		return ECollections.emptyEList();
	}

	@Override
	public EList<ProductSpaceElement> getCrossReferencedProductSpaceElements() {
		
		EList<ProductSpaceElement> crossRefs = ECollections.newBasicEList();
		crossRefs.add(getVertex());
		return crossRefs;
	}

	@Override
	public EList<ProductSpaceElement> getCrossReferencingProductSpaceElements() {
		
		return ECollections.emptyEList();
	}

} //VersionedListStartReferenceImpl
