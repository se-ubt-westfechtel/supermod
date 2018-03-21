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
 * A representation of the model object '<em><b>Product Space Element Matching</b></em>'.
 * A product space element matching describes a correspondence between similar
 * elements of different (copies of) product spaces. The elements are indirectly
 * referenced by {@link MatchedProductSpaceElement#getElement()}. Element matchings
 * are arranged hierarchically, and the root is contained by a 
 * {@link ProductDimensionMatching}.
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date 	2014-07-25
 * @see		MatchedProductSpaceElement
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai1.supermod.mm.diff.ProductSpaceElementMatching#getMatchedElements <em>Matched Elements</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.diff.ProductSpaceElementMatching#getSubMatchings <em>Sub Matchings</em>}</li>
 * </ul>
 *
 * @see de.ubt.ai1.supermod.mm.diff.SuperModDiffPackage#getProductSpaceElementMatching()
 * @model
 * @generated
 */
public interface ProductSpaceElementMatching extends EObject {
	/**
	 * Returns the value of the '<em><b>Matched Elements</b></em>' containment reference list.
	 * The list contents are of type {@link de.ubt.ai1.supermod.mm.diff.MatchedProductSpaceElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * Refers to the matched elements from the different product space.
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Matched Elements</em>' containment reference list.
	 * @see de.ubt.ai1.supermod.mm.diff.SuperModDiffPackage#getProductSpaceElementMatching_MatchedElements()
	 * @model containment="true"
	 * @generated
	 */
	EList<MatchedProductSpaceElement> getMatchedElements();

	/**
	 * Returns the value of the '<em><b>Sub Matchings</b></em>' containment reference list.
	 * The list contents are of type {@link de.ubt.ai1.supermod.mm.diff.ProductSpaceElementMatching}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * Directly contained matchings for sub-elements of the matched elements.
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Matchings</em>' containment reference list.
	 * @see de.ubt.ai1.supermod.mm.diff.SuperModDiffPackage#getProductSpaceElementMatching_SubMatchings()
	 * @model containment="true"
	 * @generated
	 */
	EList<ProductSpaceElementMatching> getSubMatchings();

	/**
	 * <!-- begin-user-doc -->
	 * Returns the matched element for a given matching role.
	 * @param 	role the matching role to get the matched element for.
	 * @return	the matched element, if exists for this role, or <code>null</code>.
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	MatchedProductSpaceElement getMatchedElement(MatchingRole role);

} // ElementMatching
