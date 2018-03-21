/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.mm.list.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

import de.ubt.ai1.supermod.mm.core.ProductSpaceElement;
import de.ubt.ai1.supermod.mm.core.impl.ProductSpaceElementImpl;
import de.ubt.ai1.supermod.mm.list.SuperModListPackage;
import de.ubt.ai1.supermod.mm.list.VersionedList;
import de.ubt.ai1.supermod.mm.list.VersionedListEdge;
import de.ubt.ai1.supermod.mm.list.VersionedListVertex;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Versioned List Edge</b></em>'.
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date 	2014-07-25
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai1.supermod.mm.list.impl.VersionedListEdgeImpl#getSource <em>Source</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.list.impl.VersionedListEdgeImpl#getSink <em>Sink</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.list.impl.VersionedListEdgeImpl#getList <em>List</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VersionedListEdgeImpl extends ProductSpaceElementImpl implements VersionedListEdge {
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected VersionedListVertex source;

	/**
	 * The cached value of the '{@link #getSink() <em>Sink</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSink()
	 * @generated
	 * @ordered
	 */
	protected VersionedListVertex sink;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VersionedListEdgeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SuperModListPackage.Literals.VERSIONED_LIST_EDGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VersionedListVertex getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (VersionedListVertex)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SuperModListPackage.VERSIONED_LIST_EDGE__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VersionedListVertex basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSource(VersionedListVertex newSource, NotificationChain msgs) {
		VersionedListVertex oldSource = source;
		source = newSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SuperModListPackage.VERSIONED_LIST_EDGE__SOURCE, oldSource, newSource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(VersionedListVertex newSource) {
		if (newSource != source) {
			NotificationChain msgs = null;
			if (source != null)
				msgs = ((InternalEObject)source).eInverseRemove(this, SuperModListPackage.VERSIONED_LIST_VERTEX__OUTGOING_EDGES, VersionedListVertex.class, msgs);
			if (newSource != null)
				msgs = ((InternalEObject)newSource).eInverseAdd(this, SuperModListPackage.VERSIONED_LIST_VERTEX__OUTGOING_EDGES, VersionedListVertex.class, msgs);
			msgs = basicSetSource(newSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SuperModListPackage.VERSIONED_LIST_EDGE__SOURCE, newSource, newSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VersionedListVertex getSink() {
		if (sink != null && sink.eIsProxy()) {
			InternalEObject oldSink = (InternalEObject)sink;
			sink = (VersionedListVertex)eResolveProxy(oldSink);
			if (sink != oldSink) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SuperModListPackage.VERSIONED_LIST_EDGE__SINK, oldSink, sink));
			}
		}
		return sink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VersionedListVertex basicGetSink() {
		return sink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSink(VersionedListVertex newSink, NotificationChain msgs) {
		VersionedListVertex oldSink = sink;
		sink = newSink;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SuperModListPackage.VERSIONED_LIST_EDGE__SINK, oldSink, newSink);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSink(VersionedListVertex newSink) {
		if (newSink != sink) {
			NotificationChain msgs = null;
			if (sink != null)
				msgs = ((InternalEObject)sink).eInverseRemove(this, SuperModListPackage.VERSIONED_LIST_VERTEX__INCOMING_EDGES, VersionedListVertex.class, msgs);
			if (newSink != null)
				msgs = ((InternalEObject)newSink).eInverseAdd(this, SuperModListPackage.VERSIONED_LIST_VERTEX__INCOMING_EDGES, VersionedListVertex.class, msgs);
			msgs = basicSetSink(newSink, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SuperModListPackage.VERSIONED_LIST_EDGE__SINK, newSink, newSink));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VersionedList getList() {
		if (eContainerFeatureID() != SuperModListPackage.VERSIONED_LIST_EDGE__LIST) return null;
		return (VersionedList)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetList(VersionedList newList, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newList, SuperModListPackage.VERSIONED_LIST_EDGE__LIST, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setList(VersionedList newList) {
		if (newList != eInternalContainer() || (eContainerFeatureID() != SuperModListPackage.VERSIONED_LIST_EDGE__LIST && newList != null)) {
			if (EcoreUtil.isAncestor(this, newList))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newList != null)
				msgs = ((InternalEObject)newList).eInverseAdd(this, SuperModListPackage.VERSIONED_LIST__EDGES, VersionedList.class, msgs);
			msgs = basicSetList(newList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SuperModListPackage.VERSIONED_LIST_EDGE__LIST, newList, newList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SuperModListPackage.VERSIONED_LIST_EDGE__SOURCE:
				if (source != null)
					msgs = ((InternalEObject)source).eInverseRemove(this, SuperModListPackage.VERSIONED_LIST_VERTEX__OUTGOING_EDGES, VersionedListVertex.class, msgs);
				return basicSetSource((VersionedListVertex)otherEnd, msgs);
			case SuperModListPackage.VERSIONED_LIST_EDGE__SINK:
				if (sink != null)
					msgs = ((InternalEObject)sink).eInverseRemove(this, SuperModListPackage.VERSIONED_LIST_VERTEX__INCOMING_EDGES, VersionedListVertex.class, msgs);
				return basicSetSink((VersionedListVertex)otherEnd, msgs);
			case SuperModListPackage.VERSIONED_LIST_EDGE__LIST:
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
			case SuperModListPackage.VERSIONED_LIST_EDGE__SOURCE:
				return basicSetSource(null, msgs);
			case SuperModListPackage.VERSIONED_LIST_EDGE__SINK:
				return basicSetSink(null, msgs);
			case SuperModListPackage.VERSIONED_LIST_EDGE__LIST:
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
			case SuperModListPackage.VERSIONED_LIST_EDGE__LIST:
				return eInternalContainer().eInverseRemove(this, SuperModListPackage.VERSIONED_LIST__EDGES, VersionedList.class, msgs);
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
			case SuperModListPackage.VERSIONED_LIST_EDGE__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case SuperModListPackage.VERSIONED_LIST_EDGE__SINK:
				if (resolve) return getSink();
				return basicGetSink();
			case SuperModListPackage.VERSIONED_LIST_EDGE__LIST:
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
			case SuperModListPackage.VERSIONED_LIST_EDGE__SOURCE:
				setSource((VersionedListVertex)newValue);
				return;
			case SuperModListPackage.VERSIONED_LIST_EDGE__SINK:
				setSink((VersionedListVertex)newValue);
				return;
			case SuperModListPackage.VERSIONED_LIST_EDGE__LIST:
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
			case SuperModListPackage.VERSIONED_LIST_EDGE__SOURCE:
				setSource((VersionedListVertex)null);
				return;
			case SuperModListPackage.VERSIONED_LIST_EDGE__SINK:
				setSink((VersionedListVertex)null);
				return;
			case SuperModListPackage.VERSIONED_LIST_EDGE__LIST:
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
			case SuperModListPackage.VERSIONED_LIST_EDGE__SOURCE:
				return source != null;
			case SuperModListPackage.VERSIONED_LIST_EDGE__SINK:
				return sink != null;
			case SuperModListPackage.VERSIONED_LIST_EDGE__LIST:
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
		crossRefs.add(getSource());
		crossRefs.add(getSink());
		return ECollections.unmodifiableEList(crossRefs);
	}
	
	@Override
	public EList<ProductSpaceElement> getCrossReferencingProductSpaceElements() {
		return ECollections.emptyEList();
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.emf.ecore.impl.BasicEObjectImpl#toString()
	 */
	@Override
	public String toString() {
		return getSource() + "_" + getSink();
	}

} //VersionedListEdgeImpl
