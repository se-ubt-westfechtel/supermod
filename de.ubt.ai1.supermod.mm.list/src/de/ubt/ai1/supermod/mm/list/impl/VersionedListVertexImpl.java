/******************************************************************************
 * Copyright (c) 2018 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.mm.list.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import de.ubt.ai1.supermod.mm.core.ProductSpaceElement;
import de.ubt.ai1.supermod.mm.core.SuperModCorePackage;
import de.ubt.ai1.supermod.mm.core.UUIDElement;
import de.ubt.ai1.supermod.mm.core.impl.ProductSpaceElementImpl;
import de.ubt.ai1.supermod.mm.list.SuperModListPackage;
import de.ubt.ai1.supermod.mm.list.VersionedList;
import de.ubt.ai1.supermod.mm.list.VersionedListEdge;
import de.ubt.ai1.supermod.mm.list.VersionedListStartReference;
import de.ubt.ai1.supermod.mm.list.VersionedListVertex;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Versioned List Vertex</b></em>'.
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
 *   <li>{@link de.ubt.ai1.supermod.mm.list.impl.VersionedListVertexImpl#getUuid <em>Uuid</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.list.impl.VersionedListVertexImpl#getElement <em>Element</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.list.impl.VersionedListVertexImpl#getIncomingEdges <em>Incoming Edges</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.list.impl.VersionedListVertexImpl#getOutgoingEdges <em>Outgoing Edges</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.list.impl.VersionedListVertexImpl#getList <em>List</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.list.impl.VersionedListVertexImpl#getStartRef <em>Start Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VersionedListVertexImpl extends ProductSpaceElementImpl implements VersionedListVertex {
	/**
	 * The default value of the '{@link #getUuid() <em>Uuid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUuid()
	 * @generated
	 * @ordered
	 */
	protected static final String UUID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUuid() <em>Uuid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUuid()
	 * @generated
	 * @ordered
	 */
	protected String uuid = UUID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getElement() <em>Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElement()
	 * @generated
	 * @ordered
	 */
	protected ProductSpaceElement element;

	/**
	 * The cached value of the '{@link #getIncomingEdges() <em>Incoming Edges</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncomingEdges()
	 * @generated
	 * @ordered
	 */
	protected EList<VersionedListEdge> incomingEdges;

	/**
	 * The cached value of the '{@link #getOutgoingEdges() <em>Outgoing Edges</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoingEdges()
	 * @generated
	 * @ordered
	 */
	protected EList<VersionedListEdge> outgoingEdges;

	/**
	 * The cached value of the '{@link #getStartRef() <em>Start Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartRef()
	 * @generated
	 * @ordered
	 */
	protected VersionedListStartReference startRef;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VersionedListVertexImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SuperModListPackage.Literals.VERSIONED_LIST_VERTEX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUuid() {
		return uuid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUuid(String newUuid) {
		String oldUuid = uuid;
		uuid = newUuid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SuperModListPackage.VERSIONED_LIST_VERTEX__UUID, oldUuid, uuid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductSpaceElement getElement() {
		if (element != null && element.eIsProxy()) {
			InternalEObject oldElement = (InternalEObject)element;
			element = (ProductSpaceElement)eResolveProxy(oldElement);
			if (element != oldElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SuperModListPackage.VERSIONED_LIST_VERTEX__ELEMENT, oldElement, element));
			}
		}
		return element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductSpaceElement basicGetElement() {
		return element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElement(ProductSpaceElement newElement) {
		ProductSpaceElement oldElement = element;
		element = newElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SuperModListPackage.VERSIONED_LIST_VERTEX__ELEMENT, oldElement, element));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VersionedListEdge> getIncomingEdges() {
		if (incomingEdges == null) {
			incomingEdges = new EObjectWithInverseResolvingEList<VersionedListEdge>(VersionedListEdge.class, this, SuperModListPackage.VERSIONED_LIST_VERTEX__INCOMING_EDGES, SuperModListPackage.VERSIONED_LIST_EDGE__SINK);
		}
		return incomingEdges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VersionedListEdge> getOutgoingEdges() {
		if (outgoingEdges == null) {
			outgoingEdges = new EObjectWithInverseResolvingEList<VersionedListEdge>(VersionedListEdge.class, this, SuperModListPackage.VERSIONED_LIST_VERTEX__OUTGOING_EDGES, SuperModListPackage.VERSIONED_LIST_EDGE__SOURCE);
		}
		return outgoingEdges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VersionedList getList() {
		if (eContainerFeatureID() != SuperModListPackage.VERSIONED_LIST_VERTEX__LIST) return null;
		return (VersionedList)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetList(VersionedList newList, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newList, SuperModListPackage.VERSIONED_LIST_VERTEX__LIST, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setList(VersionedList newList) {
		if (newList != eInternalContainer() || (eContainerFeatureID() != SuperModListPackage.VERSIONED_LIST_VERTEX__LIST && newList != null)) {
			if (EcoreUtil.isAncestor(this, newList))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newList != null)
				msgs = ((InternalEObject)newList).eInverseAdd(this, SuperModListPackage.VERSIONED_LIST__VERTICES, VersionedList.class, msgs);
			msgs = basicSetList(newList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SuperModListPackage.VERSIONED_LIST_VERTEX__LIST, newList, newList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VersionedListStartReference getStartRef() {
		if (startRef != null && startRef.eIsProxy()) {
			InternalEObject oldStartRef = (InternalEObject)startRef;
			startRef = (VersionedListStartReference)eResolveProxy(oldStartRef);
			if (startRef != oldStartRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SuperModListPackage.VERSIONED_LIST_VERTEX__START_REF, oldStartRef, startRef));
			}
		}
		return startRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VersionedListStartReference basicGetStartRef() {
		return startRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStartRef(VersionedListStartReference newStartRef, NotificationChain msgs) {
		VersionedListStartReference oldStartRef = startRef;
		startRef = newStartRef;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SuperModListPackage.VERSIONED_LIST_VERTEX__START_REF, oldStartRef, newStartRef);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartRef(VersionedListStartReference newStartRef) {
		if (newStartRef != startRef) {
			NotificationChain msgs = null;
			if (startRef != null)
				msgs = ((InternalEObject)startRef).eInverseRemove(this, SuperModListPackage.VERSIONED_LIST_START_REFERENCE__VERTEX, VersionedListStartReference.class, msgs);
			if (newStartRef != null)
				msgs = ((InternalEObject)newStartRef).eInverseAdd(this, SuperModListPackage.VERSIONED_LIST_START_REFERENCE__VERTEX, VersionedListStartReference.class, msgs);
			msgs = basicSetStartRef(newStartRef, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SuperModListPackage.VERSIONED_LIST_VERTEX__START_REF, newStartRef, newStartRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public int getOccurrence() {
		int occurrence = -1;
		for (VersionedListVertex vv : getList().getVertices()) {
			if (vv.getElement().equals(getElement())) {
				occurrence++;
			}
			if (vv == this) {
				break;
			}			
		}
		return occurrence;
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
			case SuperModListPackage.VERSIONED_LIST_VERTEX__INCOMING_EDGES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIncomingEdges()).basicAdd(otherEnd, msgs);
			case SuperModListPackage.VERSIONED_LIST_VERTEX__OUTGOING_EDGES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutgoingEdges()).basicAdd(otherEnd, msgs);
			case SuperModListPackage.VERSIONED_LIST_VERTEX__LIST:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetList((VersionedList)otherEnd, msgs);
			case SuperModListPackage.VERSIONED_LIST_VERTEX__START_REF:
				if (startRef != null)
					msgs = ((InternalEObject)startRef).eInverseRemove(this, SuperModListPackage.VERSIONED_LIST_START_REFERENCE__VERTEX, VersionedListStartReference.class, msgs);
				return basicSetStartRef((VersionedListStartReference)otherEnd, msgs);
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
			case SuperModListPackage.VERSIONED_LIST_VERTEX__INCOMING_EDGES:
				return ((InternalEList<?>)getIncomingEdges()).basicRemove(otherEnd, msgs);
			case SuperModListPackage.VERSIONED_LIST_VERTEX__OUTGOING_EDGES:
				return ((InternalEList<?>)getOutgoingEdges()).basicRemove(otherEnd, msgs);
			case SuperModListPackage.VERSIONED_LIST_VERTEX__LIST:
				return basicSetList(null, msgs);
			case SuperModListPackage.VERSIONED_LIST_VERTEX__START_REF:
				return basicSetStartRef(null, msgs);
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
			case SuperModListPackage.VERSIONED_LIST_VERTEX__LIST:
				return eInternalContainer().eInverseRemove(this, SuperModListPackage.VERSIONED_LIST__VERTICES, VersionedList.class, msgs);
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
			case SuperModListPackage.VERSIONED_LIST_VERTEX__UUID:
				return getUuid();
			case SuperModListPackage.VERSIONED_LIST_VERTEX__ELEMENT:
				if (resolve) return getElement();
				return basicGetElement();
			case SuperModListPackage.VERSIONED_LIST_VERTEX__INCOMING_EDGES:
				return getIncomingEdges();
			case SuperModListPackage.VERSIONED_LIST_VERTEX__OUTGOING_EDGES:
				return getOutgoingEdges();
			case SuperModListPackage.VERSIONED_LIST_VERTEX__LIST:
				return getList();
			case SuperModListPackage.VERSIONED_LIST_VERTEX__START_REF:
				if (resolve) return getStartRef();
				return basicGetStartRef();
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
			case SuperModListPackage.VERSIONED_LIST_VERTEX__UUID:
				setUuid((String)newValue);
				return;
			case SuperModListPackage.VERSIONED_LIST_VERTEX__ELEMENT:
				setElement((ProductSpaceElement)newValue);
				return;
			case SuperModListPackage.VERSIONED_LIST_VERTEX__INCOMING_EDGES:
				getIncomingEdges().clear();
				getIncomingEdges().addAll((Collection<? extends VersionedListEdge>)newValue);
				return;
			case SuperModListPackage.VERSIONED_LIST_VERTEX__OUTGOING_EDGES:
				getOutgoingEdges().clear();
				getOutgoingEdges().addAll((Collection<? extends VersionedListEdge>)newValue);
				return;
			case SuperModListPackage.VERSIONED_LIST_VERTEX__LIST:
				setList((VersionedList)newValue);
				return;
			case SuperModListPackage.VERSIONED_LIST_VERTEX__START_REF:
				setStartRef((VersionedListStartReference)newValue);
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
			case SuperModListPackage.VERSIONED_LIST_VERTEX__UUID:
				setUuid(UUID_EDEFAULT);
				return;
			case SuperModListPackage.VERSIONED_LIST_VERTEX__ELEMENT:
				setElement((ProductSpaceElement)null);
				return;
			case SuperModListPackage.VERSIONED_LIST_VERTEX__INCOMING_EDGES:
				getIncomingEdges().clear();
				return;
			case SuperModListPackage.VERSIONED_LIST_VERTEX__OUTGOING_EDGES:
				getOutgoingEdges().clear();
				return;
			case SuperModListPackage.VERSIONED_LIST_VERTEX__LIST:
				setList((VersionedList)null);
				return;
			case SuperModListPackage.VERSIONED_LIST_VERTEX__START_REF:
				setStartRef((VersionedListStartReference)null);
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
			case SuperModListPackage.VERSIONED_LIST_VERTEX__UUID:
				return UUID_EDEFAULT == null ? uuid != null : !UUID_EDEFAULT.equals(uuid);
			case SuperModListPackage.VERSIONED_LIST_VERTEX__ELEMENT:
				return element != null;
			case SuperModListPackage.VERSIONED_LIST_VERTEX__INCOMING_EDGES:
				return incomingEdges != null && !incomingEdges.isEmpty();
			case SuperModListPackage.VERSIONED_LIST_VERTEX__OUTGOING_EDGES:
				return outgoingEdges != null && !outgoingEdges.isEmpty();
			case SuperModListPackage.VERSIONED_LIST_VERTEX__LIST:
				return getList() != null;
			case SuperModListPackage.VERSIONED_LIST_VERTEX__START_REF:
				return startRef != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == UUIDElement.class) {
			switch (derivedFeatureID) {
				case SuperModListPackage.VERSIONED_LIST_VERTEX__UUID: return SuperModCorePackage.UUID_ELEMENT__UUID;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == UUIDElement.class) {
			switch (baseFeatureID) {
				case SuperModCorePackage.UUID_ELEMENT__UUID: return SuperModListPackage.VERSIONED_LIST_VERTEX__UUID;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String toString() {
		if (getElement() != null) {
			return getElement().toString() + "[" + getUuid() + "]";
		}
		return "";
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
		crossRefs.add(getElement());
		return ECollections.unmodifiableEList(crossRefs);
	}
	
	@Override
	public EList<ProductSpaceElement> getCrossReferencingProductSpaceElements() {
		EList<ProductSpaceElement> crossRefs = ECollections.newBasicEList();
		crossRefs.addAll(getIncomingEdges());
		crossRefs.addAll(getOutgoingEdges());
		if (getStartRef() != null) {
			crossRefs.add(getStartRef());
		}
		return ECollections.unmodifiableEList(crossRefs);
	}
	
} //VersionedListVertexImpl
