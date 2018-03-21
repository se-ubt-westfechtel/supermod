/**
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package de.ubt.ai1.supermod.mm.diff;

import org.eclipse.emf.ecore.EObject;

import de.ubt.ai1.supermod.mm.core.ProductDimension;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Matched Product Dimension</b></em>'.
 * Describes a reference to a product dimension which is part of a matching
 * expressed by {@link MatchedProductDimension}.
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date 	2015-03-05
 * @see 	ProductDimensionMatching
 * @see		ProductDimension
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai1.supermod.mm.diff.MatchedProductDimension#getProductDimension <em>Product Dimension</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.diff.MatchedProductDimension#getRole <em>Role</em>}</li>
 * </ul>
 *
 * @see de.ubt.ai1.supermod.mm.diff.SuperModDiffPackage#getMatchedProductDimension()
 * @model
 * @generated
 */
public interface MatchedProductDimension extends EObject {
	/**
	 * Returns the value of the '<em><b>Product Dimension</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Dimension</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Dimension</em>' reference.
	 * @see #setProductDimension(ProductDimension)
	 * @see de.ubt.ai1.supermod.mm.diff.SuperModDiffPackage#getMatchedProductDimension_ProductDimension()
	 * @model
	 * @generated
	 */
	ProductDimension getProductDimension();

	/**
	 * Sets the value of the '{@link de.ubt.ai1.supermod.mm.diff.MatchedProductDimension#getProductDimension <em>Product Dimension</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Dimension</em>' reference.
	 * @see #getProductDimension()
	 * @generated
	 */
	void setProductDimension(ProductDimension value);

	/**
	 * Returns the value of the '<em><b>Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' reference.
	 * @see #setRole(MatchingRole)
	 * @see de.ubt.ai1.supermod.mm.diff.SuperModDiffPackage#getMatchedProductDimension_Role()
	 * @model
	 * @generated
	 */
	MatchingRole getRole();

	/**
	 * Sets the value of the '{@link de.ubt.ai1.supermod.mm.diff.MatchedProductDimension#getRole <em>Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' reference.
	 * @see #getRole()
	 * @generated
	 */
	void setRole(MatchingRole value);

} // MatchedProductDimension
