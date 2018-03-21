/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.mm.diff;

import org.eclipse.emf.ecore.EObject;

import de.ubt.ai1.supermod.mm.core.ProductSpace;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Matching Role</b></em>'.
 * A matching role defines a specific copy of the product space as a part of the
 * matching under a given role name.
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date 	2014-07-25
 * @see 	ProductSpaceMatching
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai1.supermod.mm.diff.MatchingRole#getRoleName <em>Role Name</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.diff.MatchingRole#getMatchedProductSpace <em>Matched Product Space</em>}</li>
 * </ul>
 *
 * @see de.ubt.ai1.supermod.mm.diff.SuperModDiffPackage#getMatchingRole()
 * @model
 * @generated
 */
public interface MatchingRole extends EObject {
	/**
	 * Returns the value of the '<em><b>Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * A meaningful label for elements of the referenced product space which
	 * occur in the matching. Example: <code>ANCESTOR</code>
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role Name</em>' attribute.
	 * @see #setRoleName(String)
	 * @see de.ubt.ai1.supermod.mm.diff.SuperModDiffPackage#getMatchingRole_RoleName()
	 * @model
	 * @generated
	 */
	String getRoleName();

	/**
	 * Sets the value of the '{@link de.ubt.ai1.supermod.mm.diff.MatchingRole#getRoleName <em>Role Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role Name</em>' attribute.
	 * @see #getRoleName()
	 * @generated
	 */
	void setRoleName(String value);

	/**
	 * Returns the value of the '<em><b>Matched Product Space</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * A reference to the copy of the product space that plays the described role
	 * inside the matching.
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Matched Product Space</em>' reference.
	 * @see #setMatchedProductSpace(ProductSpace)
	 * @see de.ubt.ai1.supermod.mm.diff.SuperModDiffPackage#getMatchingRole_MatchedProductSpace()
	 * @model
	 * @generated
	 */
	ProductSpace getMatchedProductSpace();

	/**
	 * Sets the value of the '{@link de.ubt.ai1.supermod.mm.diff.MatchingRole#getMatchedProductSpace <em>Matched Product Space</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Matched Product Space</em>' reference.
	 * @see #getMatchedProductSpace()
	 * @generated
	 */
	void setMatchedProductSpace(ProductSpace value);

} // MatchingRole
