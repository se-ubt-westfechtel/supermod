/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.mm.diff;

import org.eclipse.emf.ecore.EObject;

import de.ubt.ai1.supermod.mm.core.ProductSpaceElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Matched Element</b></em>'.
 * Describes a reference to a product space element which is part of a matching
 * expressed by {@link MatchedProductSpaceElement}.
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date 	2014-07-25
 * @see 	ProductSpaceElementMatching
 * @see		ProductSpaceElement
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai1.supermod.mm.diff.MatchedProductSpaceElement#getElement <em>Element</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.diff.MatchedProductSpaceElement#getRole <em>Role</em>}</li>
 * </ul>
 *
 * @see de.ubt.ai1.supermod.mm.diff.SuperModDiffPackage#getMatchedProductSpaceElement()
 * @model
 * @generated
 */
public interface MatchedProductSpaceElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * The element part of a specific product space participating at the matching.
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element</em>' reference.
	 * @see #setElement(ProductSpaceElement)
	 * @see de.ubt.ai1.supermod.mm.diff.SuperModDiffPackage#getMatchedProductSpaceElement_Element()
	 * @model
	 * @generated
	 */
	ProductSpaceElement getElement();

	/**
	 * Sets the value of the '{@link de.ubt.ai1.supermod.mm.diff.MatchedProductSpaceElement#getElement <em>Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element</em>' reference.
	 * @see #getElement()
	 * @generated
	 */
	void setElement(ProductSpaceElement value);

	/**
	 * Returns the value of the '<em><b>Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * The role of the product space of the matched element inside the product 
	 * space matching.
	 * @see 	ProductSpaceMatching
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' reference.
	 * @see #setRole(MatchingRole)
	 * @see de.ubt.ai1.supermod.mm.diff.SuperModDiffPackage#getMatchedProductSpaceElement_Role()
	 * @model
	 * @generated
	 */
	MatchingRole getRole();

	/**
	 * Sets the value of the '{@link de.ubt.ai1.supermod.mm.diff.MatchedProductSpaceElement#getRole <em>Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' reference.
	 * @see #getRole()
	 * @generated
	 */
	void setRole(MatchingRole value);

} // MatchedElement
