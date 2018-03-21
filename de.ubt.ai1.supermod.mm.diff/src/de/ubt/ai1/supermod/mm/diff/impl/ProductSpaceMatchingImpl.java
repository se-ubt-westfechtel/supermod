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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import de.ubt.ai1.supermod.mm.core.ProductSpace;
import de.ubt.ai1.supermod.mm.diff.MatchingRole;
import de.ubt.ai1.supermod.mm.diff.ProductDimensionMatching;
import de.ubt.ai1.supermod.mm.diff.ProductSpaceMatching;
import de.ubt.ai1.supermod.mm.diff.SuperModDiffPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product Space Matching</b></em>'.
 * @author Felix Schwaegerl
 * @version	0.1.0
 * @since	0.1.0
 * @date 	2014-07-25
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai1.supermod.mm.diff.impl.ProductSpaceMatchingImpl#getMatchingRoles <em>Matching Roles</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.diff.impl.ProductSpaceMatchingImpl#getDimensionMatchings <em>Dimension Matchings</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProductSpaceMatchingImpl extends MinimalEObjectImpl.Container implements ProductSpaceMatching {
	/**
	 * The cached value of the '{@link #getMatchingRoles() <em>Matching Roles</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatchingRoles()
	 * @generated
	 * @ordered
	 */
	protected EList<MatchingRole> matchingRoles;

	/**
	 * The cached value of the '{@link #getDimensionMatchings() <em>Dimension Matchings</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDimensionMatchings()
	 * @generated
	 * @ordered
	 */
	protected EList<ProductDimensionMatching> dimensionMatchings;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductSpaceMatchingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SuperModDiffPackage.Literals.PRODUCT_SPACE_MATCHING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MatchingRole> getMatchingRoles() {
		if (matchingRoles == null) {
			matchingRoles = new EObjectContainmentEList<MatchingRole>(MatchingRole.class, this, SuperModDiffPackage.PRODUCT_SPACE_MATCHING__MATCHING_ROLES);
		}
		return matchingRoles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProductDimensionMatching> getDimensionMatchings() {
		if (dimensionMatchings == null) {
			dimensionMatchings = new EObjectResolvingEList<ProductDimensionMatching>(ProductDimensionMatching.class, this, SuperModDiffPackage.PRODUCT_SPACE_MATCHING__DIMENSION_MATCHINGS);
		}
		return dimensionMatchings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public MatchingRole getMatchingRole(ProductSpace ps) {
		for (MatchingRole mr : getMatchingRoles()) {
			if (ps.equals(mr.getMatchedProductSpace())) {
				return mr;
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
			case SuperModDiffPackage.PRODUCT_SPACE_MATCHING__MATCHING_ROLES:
				return ((InternalEList<?>)getMatchingRoles()).basicRemove(otherEnd, msgs);
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
			case SuperModDiffPackage.PRODUCT_SPACE_MATCHING__MATCHING_ROLES:
				return getMatchingRoles();
			case SuperModDiffPackage.PRODUCT_SPACE_MATCHING__DIMENSION_MATCHINGS:
				return getDimensionMatchings();
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
			case SuperModDiffPackage.PRODUCT_SPACE_MATCHING__MATCHING_ROLES:
				getMatchingRoles().clear();
				getMatchingRoles().addAll((Collection<? extends MatchingRole>)newValue);
				return;
			case SuperModDiffPackage.PRODUCT_SPACE_MATCHING__DIMENSION_MATCHINGS:
				getDimensionMatchings().clear();
				getDimensionMatchings().addAll((Collection<? extends ProductDimensionMatching>)newValue);
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
			case SuperModDiffPackage.PRODUCT_SPACE_MATCHING__MATCHING_ROLES:
				getMatchingRoles().clear();
				return;
			case SuperModDiffPackage.PRODUCT_SPACE_MATCHING__DIMENSION_MATCHINGS:
				getDimensionMatchings().clear();
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
			case SuperModDiffPackage.PRODUCT_SPACE_MATCHING__MATCHING_ROLES:
				return matchingRoles != null && !matchingRoles.isEmpty();
			case SuperModDiffPackage.PRODUCT_SPACE_MATCHING__DIMENSION_MATCHINGS:
				return dimensionMatchings != null && !dimensionMatchings.isEmpty();
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
			case SuperModDiffPackage.PRODUCT_SPACE_MATCHING___GET_MATCHING_ROLE__PRODUCTSPACE:
				return getMatchingRole((ProductSpace)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.emf.ecore.impl.BasicEObjectImpl#toString()
	 */
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("match with roles ");
		for (MatchingRole mr : getMatchingRoles()) {
			sb.append(mr.toString() + ", ");
		}
		sb.setLength(sb.length() - 2);
		sb.append("{\n");
		for (ProductDimensionMatching dimMatch : getDimensionMatchings()) {
			sb.append(dimMatch.toString() + "\n");
		}
		sb.append("}");
		return sb.toString();
	}

} //ProductSpaceMatchingImpl
