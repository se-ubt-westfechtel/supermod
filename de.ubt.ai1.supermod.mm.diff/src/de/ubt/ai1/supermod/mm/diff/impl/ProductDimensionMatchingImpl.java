/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.mm.diff.impl;

import de.ubt.ai1.supermod.mm.diff.MatchedProductDimension;
import de.ubt.ai1.supermod.mm.diff.MatchingRole;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import de.ubt.ai1.supermod.mm.diff.ProductDimensionMatching;
import de.ubt.ai1.supermod.mm.diff.ProductSpaceElementMatching;
import de.ubt.ai1.supermod.mm.diff.SuperModDiffPackage;
import java.lang.reflect.InvocationTargetException;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product Dimension Matching</b></em>'.
 * @author Felix Schwaegerl
 * @version	0.1.0
 * @since	0.1.0
 * @date 	2014-07-25
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai1.supermod.mm.diff.impl.ProductDimensionMatchingImpl#getMatchedDimensions <em>Matched Dimensions</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.diff.impl.ProductDimensionMatchingImpl#getRootElementMatchings <em>Root Element Matchings</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.diff.impl.ProductDimensionMatchingImpl#getDimensionName <em>Dimension Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProductDimensionMatchingImpl extends MinimalEObjectImpl.Container implements ProductDimensionMatching {
	/**
	 * The cached value of the '{@link #getMatchedDimensions() <em>Matched Dimensions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatchedDimensions()
	 * @generated
	 * @ordered
	 */
	protected EList<MatchedProductDimension> matchedDimensions;

	/**
	 * The cached value of the '{@link #getRootElementMatchings() <em>Root Element Matchings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRootElementMatchings()
	 * @generated
	 * @ordered
	 */
	protected EList<ProductSpaceElementMatching> rootElementMatchings;

	/**
	 * The default value of the '{@link #getDimensionName() <em>Dimension Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDimensionName()
	 * @generated
	 * @ordered
	 */
	protected static final String DIMENSION_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDimensionName() <em>Dimension Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDimensionName()
	 * @generated
	 * @ordered
	 */
	protected String dimensionName = DIMENSION_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductDimensionMatchingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SuperModDiffPackage.Literals.PRODUCT_DIMENSION_MATCHING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MatchedProductDimension> getMatchedDimensions() {
		if (matchedDimensions == null) {
			matchedDimensions = new EObjectContainmentEList<MatchedProductDimension>(MatchedProductDimension.class, this, SuperModDiffPackage.PRODUCT_DIMENSION_MATCHING__MATCHED_DIMENSIONS);
		}
		return matchedDimensions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProductSpaceElementMatching> getRootElementMatchings() {
		if (rootElementMatchings == null) {
			rootElementMatchings = new EObjectContainmentEList<ProductSpaceElementMatching>(ProductSpaceElementMatching.class, this, SuperModDiffPackage.PRODUCT_DIMENSION_MATCHING__ROOT_ELEMENT_MATCHINGS);
		}
		return rootElementMatchings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDimensionName() {
		return dimensionName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDimensionName(String newDimensionName) {
		String oldDimensionName = dimensionName;
		dimensionName = newDimensionName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SuperModDiffPackage.PRODUCT_DIMENSION_MATCHING__DIMENSION_NAME, oldDimensionName, dimensionName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public MatchedProductDimension getMatchedDimension(MatchingRole role) {
		for (MatchedProductDimension md : getMatchedDimensions()) {
			if (role.equals(md.getRole())) {
				return md;
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
			case SuperModDiffPackage.PRODUCT_DIMENSION_MATCHING__MATCHED_DIMENSIONS:
				return ((InternalEList<?>)getMatchedDimensions()).basicRemove(otherEnd, msgs);
			case SuperModDiffPackage.PRODUCT_DIMENSION_MATCHING__ROOT_ELEMENT_MATCHINGS:
				return ((InternalEList<?>)getRootElementMatchings()).basicRemove(otherEnd, msgs);
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
			case SuperModDiffPackage.PRODUCT_DIMENSION_MATCHING__MATCHED_DIMENSIONS:
				return getMatchedDimensions();
			case SuperModDiffPackage.PRODUCT_DIMENSION_MATCHING__ROOT_ELEMENT_MATCHINGS:
				return getRootElementMatchings();
			case SuperModDiffPackage.PRODUCT_DIMENSION_MATCHING__DIMENSION_NAME:
				return getDimensionName();
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
			case SuperModDiffPackage.PRODUCT_DIMENSION_MATCHING__MATCHED_DIMENSIONS:
				getMatchedDimensions().clear();
				getMatchedDimensions().addAll((Collection<? extends MatchedProductDimension>)newValue);
				return;
			case SuperModDiffPackage.PRODUCT_DIMENSION_MATCHING__ROOT_ELEMENT_MATCHINGS:
				getRootElementMatchings().clear();
				getRootElementMatchings().addAll((Collection<? extends ProductSpaceElementMatching>)newValue);
				return;
			case SuperModDiffPackage.PRODUCT_DIMENSION_MATCHING__DIMENSION_NAME:
				setDimensionName((String)newValue);
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
			case SuperModDiffPackage.PRODUCT_DIMENSION_MATCHING__MATCHED_DIMENSIONS:
				getMatchedDimensions().clear();
				return;
			case SuperModDiffPackage.PRODUCT_DIMENSION_MATCHING__ROOT_ELEMENT_MATCHINGS:
				getRootElementMatchings().clear();
				return;
			case SuperModDiffPackage.PRODUCT_DIMENSION_MATCHING__DIMENSION_NAME:
				setDimensionName(DIMENSION_NAME_EDEFAULT);
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
			case SuperModDiffPackage.PRODUCT_DIMENSION_MATCHING__MATCHED_DIMENSIONS:
				return matchedDimensions != null && !matchedDimensions.isEmpty();
			case SuperModDiffPackage.PRODUCT_DIMENSION_MATCHING__ROOT_ELEMENT_MATCHINGS:
				return rootElementMatchings != null && !rootElementMatchings.isEmpty();
			case SuperModDiffPackage.PRODUCT_DIMENSION_MATCHING__DIMENSION_NAME:
				return DIMENSION_NAME_EDEFAULT == null ? dimensionName != null : !DIMENSION_NAME_EDEFAULT.equals(dimensionName);
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
			case SuperModDiffPackage.PRODUCT_DIMENSION_MATCHING___GET_MATCHED_DIMENSION__MATCHINGROLE:
				return getMatchedDimension((MatchingRole)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("match dim " + getDimensionName() + "{\n");
		for (MatchedProductDimension mDim : getMatchedDimensions()) {
			sb.append(mDim + "\n");
		}
		sb.append("} contents {");
		for (ProductSpaceElementMatching match : getRootElementMatchings()) {
			sb.append("\n\t" + match.toString().replaceAll("\n", "\n\t"));
		}
		return sb.toString();
	}

} //ProductDimensionMatchingImpl
