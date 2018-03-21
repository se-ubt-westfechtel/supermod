/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.mm.diff.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import de.ubt.ai1.supermod.mm.diff.MatchedProductSpaceElement;
import de.ubt.ai1.supermod.mm.diff.MatchingRole;
import de.ubt.ai1.supermod.mm.diff.ProductSpaceElementMatching;
import de.ubt.ai1.supermod.mm.diff.SuperModDiffPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element Matching</b></em>'.
 * @author Felix Schwaegerl
 * @version	0.1.0
 * @since	0.1.0
 * @date 	2014-07-25
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai1.supermod.mm.diff.impl.ProductSpaceElementMatchingImpl#getMatchedElements <em>Matched Elements</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.diff.impl.ProductSpaceElementMatchingImpl#getSubMatchings <em>Sub Matchings</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProductSpaceElementMatchingImpl extends MinimalEObjectImpl.Container implements ProductSpaceElementMatching {
	/**
	 * The cached value of the '{@link #getMatchedElements() <em>Matched Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatchedElements()
	 * @generated
	 * @ordered
	 */
	protected EList<MatchedProductSpaceElement> matchedElements;

	/**
	 * The cached value of the '{@link #getSubMatchings() <em>Sub Matchings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubMatchings()
	 * @generated
	 * @ordered
	 */
	protected EList<ProductSpaceElementMatching> subMatchings;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductSpaceElementMatchingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SuperModDiffPackage.Literals.PRODUCT_SPACE_ELEMENT_MATCHING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MatchedProductSpaceElement> getMatchedElements() {
		if (matchedElements == null) {
			matchedElements = new EObjectContainmentEList<MatchedProductSpaceElement>(MatchedProductSpaceElement.class, this, SuperModDiffPackage.PRODUCT_SPACE_ELEMENT_MATCHING__MATCHED_ELEMENTS);
		}
		return matchedElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProductSpaceElementMatching> getSubMatchings() {
		if (subMatchings == null) {
			subMatchings = new EObjectContainmentEList<ProductSpaceElementMatching>(ProductSpaceElementMatching.class, this, SuperModDiffPackage.PRODUCT_SPACE_ELEMENT_MATCHING__SUB_MATCHINGS);
		}
		return subMatchings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public MatchedProductSpaceElement getMatchedElement(MatchingRole role) {
		for (MatchedProductSpaceElement me : getMatchedElements()) {
			if (role.equals(me.getRole())) {
				return me;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SuperModDiffPackage.PRODUCT_SPACE_ELEMENT_MATCHING__MATCHED_ELEMENTS:
				return ((InternalEList<?>)getMatchedElements()).basicRemove(otherEnd, msgs);
			case SuperModDiffPackage.PRODUCT_SPACE_ELEMENT_MATCHING__SUB_MATCHINGS:
				return ((InternalEList<?>)getSubMatchings()).basicRemove(otherEnd, msgs);
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
			case SuperModDiffPackage.PRODUCT_SPACE_ELEMENT_MATCHING__MATCHED_ELEMENTS:
				return getMatchedElements();
			case SuperModDiffPackage.PRODUCT_SPACE_ELEMENT_MATCHING__SUB_MATCHINGS:
				return getSubMatchings();
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
			case SuperModDiffPackage.PRODUCT_SPACE_ELEMENT_MATCHING__MATCHED_ELEMENTS:
				getMatchedElements().clear();
				getMatchedElements().addAll((Collection<? extends MatchedProductSpaceElement>)newValue);
				return;
			case SuperModDiffPackage.PRODUCT_SPACE_ELEMENT_MATCHING__SUB_MATCHINGS:
				getSubMatchings().clear();
				getSubMatchings().addAll((Collection<? extends ProductSpaceElementMatching>)newValue);
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
			case SuperModDiffPackage.PRODUCT_SPACE_ELEMENT_MATCHING__MATCHED_ELEMENTS:
				getMatchedElements().clear();
				return;
			case SuperModDiffPackage.PRODUCT_SPACE_ELEMENT_MATCHING__SUB_MATCHINGS:
				getSubMatchings().clear();
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
			case SuperModDiffPackage.PRODUCT_SPACE_ELEMENT_MATCHING__MATCHED_ELEMENTS:
				return matchedElements != null && !matchedElements.isEmpty();
			case SuperModDiffPackage.PRODUCT_SPACE_ELEMENT_MATCHING__SUB_MATCHINGS:
				return subMatchings != null && !subMatchings.isEmpty();
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
			case SuperModDiffPackage.PRODUCT_SPACE_ELEMENT_MATCHING___GET_MATCHED_ELEMENT__MATCHINGROLE:
				return getMatchedElement((MatchingRole)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.emf.ecore.impl.BasicEObjectImpl#toString()
	 */
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("{\n");
		for (MatchedProductSpaceElement me : getMatchedElements()) {
			sb.append("\t" + me.toString().replaceAll("\n", "\n\t") + "\n");
		}
		for (ProductSpaceElementMatching subMatch : getSubMatchings()) {
			sb.append("\n\t" + subMatch.toString().replaceAll("\n", "\n\t"));
		}
		sb.append("}");
		return sb.toString();
	}

} //ElementMatchingImpl
