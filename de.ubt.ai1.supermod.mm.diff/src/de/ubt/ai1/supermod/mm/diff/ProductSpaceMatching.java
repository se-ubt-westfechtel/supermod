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

import de.ubt.ai1.supermod.mm.core.ProductSpace;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product Space Matching</b></em>'.
 * The result of a comparison between several (copies of) product spaces. It
 * defines a number of matching roles, each describing the purpose of a specific
 * product space, and number of product dimension matchings, which refer to
 * correspondences within different versions of the product space dimensions.
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date 	2014-07-25
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai1.supermod.mm.diff.ProductSpaceMatching#getMatchingRoles <em>Matching Roles</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.diff.ProductSpaceMatching#getDimensionMatchings <em>Dimension Matchings</em>}</li>
 * </ul>
 *
 * @see de.ubt.ai1.supermod.mm.diff.SuperModDiffPackage#getProductSpaceMatching()
 * @model
 * @generated
 */
public interface ProductSpaceMatching extends EObject {
	/**
	 * Returns the value of the '<em><b>Matching Roles</b></em>' containment reference list.
	 * The list contents are of type {@link de.ubt.ai1.supermod.mm.diff.MatchingRole}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * The matching roles that define the purpose of different product spaces part
	 * of the matching.
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Matching Roles</em>' containment reference list.
	 * @see de.ubt.ai1.supermod.mm.diff.SuperModDiffPackage#getProductSpaceMatching_MatchingRoles()
	 * @model containment="true"
	 * @generated
	 */
	EList<MatchingRole> getMatchingRoles();

	/**
	 * Returns the value of the '<em><b>Dimension Matchings</b></em>' reference list.
	 * The list contents are of type {@link de.ubt.ai1.supermod.mm.diff.ProductDimensionMatching}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * Comparison results for specific product space dimensions.
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dimension Matchings</em>' reference list.
	 * @see de.ubt.ai1.supermod.mm.diff.SuperModDiffPackage#getProductSpaceMatching_DimensionMatchings()
	 * @model
	 * @generated
	 */
	EList<ProductDimensionMatching> getDimensionMatchings();

	/**
	 * <!-- begin-user-doc -->
	 * Returns the matching role for a given product space
	 * @param 	ps product space.
	 * @return 	the corresponding matching role.
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	MatchingRole getMatchingRole(ProductSpace ps);

} // ProductSpaceMatching
