/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.mm.diff;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product Dimension Matching</b></em>'.
 * A product dimension matching contains a hierarchically organized tree of
 * product space element matchings, which refer to corresponding elements out of
 * different (copies of) product spaces.
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date 	2014-07-25
 * @see 	ProductSpaceElementMatching
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai1.supermod.mm.diff.ProductDimensionMatching#getMatchedDimensions <em>Matched Dimensions</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.diff.ProductDimensionMatching#getRootElementMatchings <em>Root Element Matchings</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.diff.ProductDimensionMatching#getDimensionName <em>Dimension Name</em>}</li>
 * </ul>
 *
 * @see de.ubt.ai1.supermod.mm.diff.SuperModDiffPackage#getProductDimensionMatching()
 * @model
 * @generated
 */
public interface ProductDimensionMatching extends EObject {
	/**
	 * Returns the value of the '<em><b>Matched Dimensions</b></em>' containment reference list.
	 * The list contents are of type {@link de.ubt.ai1.supermod.mm.diff.MatchedProductDimension}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Matched Dimensions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Matched Dimensions</em>' containment reference list.
	 * @see de.ubt.ai1.supermod.mm.diff.SuperModDiffPackage#getProductDimensionMatching_MatchedDimensions()
	 * @model containment="true"
	 * @generated
	 */
	EList<MatchedProductDimension> getMatchedDimensions();

	/**
	 * Returns the value of the '<em><b>Root Element Matchings</b></em>' containment reference list.
	 * The list contents are of type {@link de.ubt.ai1.supermod.mm.diff.ProductSpaceElementMatching}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * The root of the matching tree of element matchings. The tree is traversed
	 * by means of the {@link ProductSpaceElementMatching#getSubMatchings()} reference.
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root Element Matchings</em>' containment reference list.
	 * @see de.ubt.ai1.supermod.mm.diff.SuperModDiffPackage#getProductDimensionMatching_RootElementMatchings()
	 * @model containment="true"
	 * @generated
	 */
	EList<ProductSpaceElementMatching> getRootElementMatchings();

	/**
	 * Returns the value of the '<em><b>Dimension Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * The name of the matched product dimension.
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dimension Name</em>' attribute.
	 * @see #setDimensionName(String)
	 * @see de.ubt.ai1.supermod.mm.diff.SuperModDiffPackage#getProductDimensionMatching_DimensionName()
	 * @model
	 * @generated
	 */
	String getDimensionName();

	/**
	 * Sets the value of the '{@link de.ubt.ai1.supermod.mm.diff.ProductDimensionMatching#getDimensionName <em>Dimension Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dimension Name</em>' attribute.
	 * @see #getDimensionName()
	 * @generated
	 */
	void setDimensionName(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	MatchedProductDimension getMatchedDimension(MatchingRole role);

} // ProductDimensionMatching
