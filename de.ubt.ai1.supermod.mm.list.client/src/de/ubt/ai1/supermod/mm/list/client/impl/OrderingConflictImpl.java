/******************************************************************************
 * Copyright (c) 2018 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.mm.list.client.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import de.ubt.ai1.supermod.mm.client.Severity;
import de.ubt.ai1.supermod.mm.client.impl.ProductConflictImpl;
import de.ubt.ai1.supermod.mm.core.ProductSpaceElement;
import de.ubt.ai1.supermod.mm.list.VersionedList;
import de.ubt.ai1.supermod.mm.list.VersionedListEdge;
import de.ubt.ai1.supermod.mm.list.VersionedListVertex;
import de.ubt.ai1.supermod.mm.list.client.OrderingConflict;
import de.ubt.ai1.supermod.mm.list.client.SuperModListClientPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ordering Conflict</b></em>'.
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
 *   <li>{@link de.ubt.ai1.supermod.mm.list.client.impl.OrderingConflictImpl#getContextList <em>Context List</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.list.client.impl.OrderingConflictImpl#getLastVertex <em>Last Vertex</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.list.client.impl.OrderingConflictImpl#getSuccessorEdges <em>Successor Edges</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.list.client.impl.OrderingConflictImpl#getSuccessorVertices <em>Successor Vertices</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OrderingConflictImpl extends ProductConflictImpl implements OrderingConflict {
	/**
	 * The cached value of the '{@link #getContextList() <em>Context List</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContextList()
	 * @generated
	 * @ordered
	 */
	protected VersionedList contextList;

	/**
	 * The cached value of the '{@link #getLastVertex() <em>Last Vertex</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastVertex()
	 * @generated
	 * @ordered
	 */
	protected VersionedListVertex lastVertex;

	/**
	 * The cached value of the '{@link #getSuccessorEdges() <em>Successor Edges</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuccessorEdges()
	 * @generated
	 * @ordered
	 */
	protected EList<VersionedListEdge> successorEdges;

	/**
	 * The cached value of the '{@link #getSuccessorVertices() <em>Successor Vertices</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuccessorVertices()
	 * @generated
	 * @ordered
	 */
	protected EList<VersionedListVertex> successorVertices;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrderingConflictImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SuperModListClientPackage.Literals.ORDERING_CONFLICT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VersionedList getContextList() {
		if (contextList != null && contextList.eIsProxy()) {
			InternalEObject oldContextList = (InternalEObject)contextList;
			contextList = (VersionedList)eResolveProxy(oldContextList);
			if (contextList != oldContextList) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SuperModListClientPackage.ORDERING_CONFLICT__CONTEXT_LIST, oldContextList, contextList));
			}
		}
		return contextList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VersionedList basicGetContextList() {
		return contextList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContextList(VersionedList newContextList) {
		VersionedList oldContextList = contextList;
		contextList = newContextList;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SuperModListClientPackage.ORDERING_CONFLICT__CONTEXT_LIST, oldContextList, contextList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VersionedListVertex getLastVertex() {
		if (lastVertex != null && lastVertex.eIsProxy()) {
			InternalEObject oldLastVertex = (InternalEObject)lastVertex;
			lastVertex = (VersionedListVertex)eResolveProxy(oldLastVertex);
			if (lastVertex != oldLastVertex) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SuperModListClientPackage.ORDERING_CONFLICT__LAST_VERTEX, oldLastVertex, lastVertex));
			}
		}
		return lastVertex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VersionedListVertex basicGetLastVertex() {
		return lastVertex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastVertex(VersionedListVertex newLastVertex) {
		VersionedListVertex oldLastVertex = lastVertex;
		lastVertex = newLastVertex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SuperModListClientPackage.ORDERING_CONFLICT__LAST_VERTEX, oldLastVertex, lastVertex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VersionedListEdge> getSuccessorEdges() {
		if (successorEdges == null) {
			successorEdges = new EObjectResolvingEList<VersionedListEdge>(VersionedListEdge.class, this, SuperModListClientPackage.ORDERING_CONFLICT__SUCCESSOR_EDGES);
		}
		return successorEdges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VersionedListVertex> getSuccessorVertices() {
		if (successorVertices == null) {
			successorVertices = new EObjectResolvingEList<VersionedListVertex>(VersionedListVertex.class, this, SuperModListClientPackage.ORDERING_CONFLICT__SUCCESSOR_VERTICES);
		}
		return successorVertices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SuperModListClientPackage.ORDERING_CONFLICT__CONTEXT_LIST:
				if (resolve) return getContextList();
				return basicGetContextList();
			case SuperModListClientPackage.ORDERING_CONFLICT__LAST_VERTEX:
				if (resolve) return getLastVertex();
				return basicGetLastVertex();
			case SuperModListClientPackage.ORDERING_CONFLICT__SUCCESSOR_EDGES:
				return getSuccessorEdges();
			case SuperModListClientPackage.ORDERING_CONFLICT__SUCCESSOR_VERTICES:
				return getSuccessorVertices();
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
			case SuperModListClientPackage.ORDERING_CONFLICT__CONTEXT_LIST:
				setContextList((VersionedList)newValue);
				return;
			case SuperModListClientPackage.ORDERING_CONFLICT__LAST_VERTEX:
				setLastVertex((VersionedListVertex)newValue);
				return;
			case SuperModListClientPackage.ORDERING_CONFLICT__SUCCESSOR_EDGES:
				getSuccessorEdges().clear();
				getSuccessorEdges().addAll((Collection<? extends VersionedListEdge>)newValue);
				return;
			case SuperModListClientPackage.ORDERING_CONFLICT__SUCCESSOR_VERTICES:
				getSuccessorVertices().clear();
				getSuccessorVertices().addAll((Collection<? extends VersionedListVertex>)newValue);
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
			case SuperModListClientPackage.ORDERING_CONFLICT__CONTEXT_LIST:
				setContextList((VersionedList)null);
				return;
			case SuperModListClientPackage.ORDERING_CONFLICT__LAST_VERTEX:
				setLastVertex((VersionedListVertex)null);
				return;
			case SuperModListClientPackage.ORDERING_CONFLICT__SUCCESSOR_EDGES:
				getSuccessorEdges().clear();
				return;
			case SuperModListClientPackage.ORDERING_CONFLICT__SUCCESSOR_VERTICES:
				getSuccessorVertices().clear();
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
			case SuperModListClientPackage.ORDERING_CONFLICT__CONTEXT_LIST:
				return contextList != null;
			case SuperModListClientPackage.ORDERING_CONFLICT__LAST_VERTEX:
				return lastVertex != null;
			case SuperModListClientPackage.ORDERING_CONFLICT__SUCCESSOR_EDGES:
				return successorEdges != null && !successorEdges.isEmpty();
			case SuperModListClientPackage.ORDERING_CONFLICT__SUCCESSOR_VERTICES:
				return successorVertices != null && !successorVertices.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	@Override
	public EList<ProductSpaceElement> getAffectedProductSpaceElements() {
		return ECollections.singletonEList(getContextList());
	}
	
	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.mm.client.impl.ConflictImpl#getSeverity()
	 */
	@Override
	public Severity getSeverity() {
		return Severity.WARNING;
	}

} //OrderingConflictImpl
