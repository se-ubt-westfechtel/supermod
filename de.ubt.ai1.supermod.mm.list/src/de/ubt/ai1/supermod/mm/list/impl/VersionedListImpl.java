/******************************************************************************
 * Copyright (c) 2018 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.mm.list.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Set;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import de.ubt.ai1.supermod.mm.core.ProductSpaceElement;
import de.ubt.ai1.supermod.mm.core.impl.ProductSpaceElementImpl;
import de.ubt.ai1.supermod.mm.list.SuperModListPackage;
import de.ubt.ai1.supermod.mm.list.VersionedList;
import de.ubt.ai1.supermod.mm.list.VersionedListEdge;
import de.ubt.ai1.supermod.mm.list.VersionedListStartReference;
import de.ubt.ai1.supermod.mm.list.VersionedListVertex;
import de.ubt.ai1.supermod.mm.list.util.VersionedListUtil;
import de.ubt.ai1.supermod.mm.list.util.VersionedListUtil.IVertexSelector;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Versioned List</b></em>'.
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
 *   <li>{@link de.ubt.ai1.supermod.mm.list.impl.VersionedListImpl#getVertices <em>Vertices</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.list.impl.VersionedListImpl#getEdges <em>Edges</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.list.impl.VersionedListImpl#getStartVertices <em>Start Vertices</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VersionedListImpl extends ProductSpaceElementImpl implements VersionedList {
	/**
	 * The cached value of the '{@link #getVertices() <em>Vertices</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVertices()
	 * @generated
	 * @ordered
	 */
	protected EList<VersionedListVertex> vertices;

	/**
	 * The cached value of the '{@link #getEdges() <em>Edges</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEdges()
	 * @generated
	 * @ordered
	 */
	protected EList<VersionedListEdge> edges;

	/**
	 * The cached value of the '{@link #getStartVertices() <em>Start Vertices</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartVertices()
	 * @generated
	 * @ordered
	 */
	protected EList<VersionedListStartReference> startVertices;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VersionedListImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SuperModListPackage.Literals.VERSIONED_LIST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VersionedListVertex> getVertices() {
		if (vertices == null) {
			vertices = new EObjectContainmentWithInverseEList<VersionedListVertex>(VersionedListVertex.class, this, SuperModListPackage.VERSIONED_LIST__VERTICES, SuperModListPackage.VERSIONED_LIST_VERTEX__LIST);
		}
		return vertices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VersionedListEdge> getEdges() {
		if (edges == null) {
			edges = new EObjectContainmentWithInverseEList<VersionedListEdge>(VersionedListEdge.class, this, SuperModListPackage.VERSIONED_LIST__EDGES, SuperModListPackage.VERSIONED_LIST_EDGE__LIST);
		}
		return edges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VersionedListStartReference> getStartVertices() {
		if (startVertices == null) {
			startVertices = new EObjectContainmentWithInverseEList<VersionedListStartReference>(VersionedListStartReference.class, this, SuperModListPackage.VERSIONED_LIST__START_VERTICES, SuperModListPackage.VERSIONED_LIST_START_REFERENCE__LIST);
		}
		return startVertices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<VersionedListVertex> getAllOccurrencesOf(ProductSpaceElement element) {
		EList<VersionedListVertex> allOccurrences = ECollections.newBasicEList();
		for (VersionedListVertex vv : getVertices()) {
			if (element.equals(vv.getElement())) {
				allOccurrences.add(vv);
			}
		}
		return ECollections.unmodifiableEList(allOccurrences);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<ProductSpaceElement> linearize() {
		return VersionedListUtil.linearize(this, new IVertexSelector() {
			@Override
			public VersionedListVertex select(VersionedListVertex lastVertex,
					Set<VersionedListVertex> candidates) {
				for (VersionedListVertex v : candidates) {
					return v;
				}
				return null;
			}			
		});
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public VersionedListEdge getEdge(VersionedListVertex from, VersionedListVertex to) {
		for (VersionedListEdge edge : getEdges()) {
			if (edge.getSource().equals(from) && edge.getSink().equals(to)) {
				return edge;
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
			case SuperModListPackage.VERSIONED_LIST__VERTICES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getVertices()).basicAdd(otherEnd, msgs);
			case SuperModListPackage.VERSIONED_LIST__EDGES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEdges()).basicAdd(otherEnd, msgs);
			case SuperModListPackage.VERSIONED_LIST__START_VERTICES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getStartVertices()).basicAdd(otherEnd, msgs);
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
			case SuperModListPackage.VERSIONED_LIST__VERTICES:
				return ((InternalEList<?>)getVertices()).basicRemove(otherEnd, msgs);
			case SuperModListPackage.VERSIONED_LIST__EDGES:
				return ((InternalEList<?>)getEdges()).basicRemove(otherEnd, msgs);
			case SuperModListPackage.VERSIONED_LIST__START_VERTICES:
				return ((InternalEList<?>)getStartVertices()).basicRemove(otherEnd, msgs);
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
			case SuperModListPackage.VERSIONED_LIST__VERTICES:
				return getVertices();
			case SuperModListPackage.VERSIONED_LIST__EDGES:
				return getEdges();
			case SuperModListPackage.VERSIONED_LIST__START_VERTICES:
				return getStartVertices();
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
			case SuperModListPackage.VERSIONED_LIST__VERTICES:
				getVertices().clear();
				getVertices().addAll((Collection<? extends VersionedListVertex>)newValue);
				return;
			case SuperModListPackage.VERSIONED_LIST__EDGES:
				getEdges().clear();
				getEdges().addAll((Collection<? extends VersionedListEdge>)newValue);
				return;
			case SuperModListPackage.VERSIONED_LIST__START_VERTICES:
				getStartVertices().clear();
				getStartVertices().addAll((Collection<? extends VersionedListStartReference>)newValue);
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
			case SuperModListPackage.VERSIONED_LIST__VERTICES:
				getVertices().clear();
				return;
			case SuperModListPackage.VERSIONED_LIST__EDGES:
				getEdges().clear();
				return;
			case SuperModListPackage.VERSIONED_LIST__START_VERTICES:
				getStartVertices().clear();
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
			case SuperModListPackage.VERSIONED_LIST__VERTICES:
				return vertices != null && !vertices.isEmpty();
			case SuperModListPackage.VERSIONED_LIST__EDGES:
				return edges != null && !edges.isEmpty();
			case SuperModListPackage.VERSIONED_LIST__START_VERTICES:
				return startVertices != null && !startVertices.isEmpty();
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
			case SuperModListPackage.VERSIONED_LIST___GET_ALL_OCCURRENCES_OF__PRODUCTSPACEELEMENT:
				return getAllOccurrencesOf((ProductSpaceElement)arguments.get(0));
			case SuperModListPackage.VERSIONED_LIST___LINEARIZE:
				return linearize();
			case SuperModListPackage.VERSIONED_LIST___GET_EDGE__VERSIONEDLISTVERTEX_VERSIONEDLISTVERTEX:
				return getEdge((VersionedListVertex)arguments.get(0), (VersionedListVertex)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

	@Override
	public ProductSpaceElement basicGetSuperProductSpaceElement() {
		EObject current = eContainer();
		while (current != null) {
			if (current instanceof ProductSpaceElement) {
				return (ProductSpaceElement) current;
			}
			current = current.eContainer();
		}
		return null;		
	}


	@Override
	public EList<ProductSpaceElement> getSubProductSpaceElements() {
		EList<ProductSpaceElement> subElements = ECollections.newBasicEList();
		subElements.addAll(getVertices());
		subElements.addAll(getEdges());
		subElements.addAll(getStartVertices());
		return ECollections.unmodifiableEList(subElements);
	}

	@Override
	public EList<ProductSpaceElement> getCrossReferencedProductSpaceElements() {
		return ECollections.emptyEList();
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
		StringBuffer sb = new StringBuffer();
		for (VersionedListVertex v : getVertices()) {
			sb.append(v + "\n");
			if (v.getStartRef() != null) {
				sb.append("\t(start vertex)\n");
			}
			for (VersionedListEdge e : v.getOutgoingEdges()) {
				sb.append("\t-> " + e.getSink() + "\n");
			}
		}
		return sb.toString();
	}

} //VersionedListImpl
