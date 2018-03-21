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
 * A representation of the model object '<em><b>Product Dimension Delta</b></em>'.
 * A product dimension delta describes changes to the product space, including 
 * insertions and deletions of product space elements and updates to the visibility
 * of elements.
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date 	2014-07-25
 * @see 	ProductSpaceElementDelta
 * @see		VisibilityUpdate
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai1.supermod.mm.diff.ProductDimensionDelta#getInsertedElements <em>Inserted Elements</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.diff.ProductDimensionDelta#getDeletedElements <em>Deleted Elements</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.diff.ProductDimensionDelta#getDimensionName <em>Dimension Name</em>}</li>
 * </ul>
 *
 * @see de.ubt.ai1.supermod.mm.diff.SuperModDiffPackage#getProductDimensionDelta()
 * @model
 * @generated
 */
public interface ProductDimensionDelta extends EObject {
	/**
	 * Returns the value of the '<em><b>Inserted Elements</b></em>' containment reference list.
	 * The list contents are of type {@link de.ubt.ai1.supermod.mm.diff.ProductSpaceElementDelta}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * Description of elements which have been inserted into a product space.
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inserted Elements</em>' containment reference list.
	 * @see de.ubt.ai1.supermod.mm.diff.SuperModDiffPackage#getProductDimensionDelta_InsertedElements()
	 * @model containment="true"
	 * @generated
	 */
	EList<ProductSpaceElementDelta> getInsertedElements();

	/**
	 * Returns the value of the '<em><b>Deleted Elements</b></em>' containment reference list.
	 * The list contents are of type {@link de.ubt.ai1.supermod.mm.diff.ProductSpaceElementDelta}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * Description of elements which have been removed from a product space.
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deleted Elements</em>' containment reference list.
	 * @see de.ubt.ai1.supermod.mm.diff.SuperModDiffPackage#getProductDimensionDelta_DeletedElements()
	 * @model containment="true"
	 * @generated
	 */
	EList<ProductSpaceElementDelta> getDeletedElements();

	/**
	 * Returns the value of the '<em><b>Dimension Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * The name of the product space dimension this delta refers to.
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dimension Name</em>' attribute.
	 * @see #setDimensionName(String)
	 * @see de.ubt.ai1.supermod.mm.diff.SuperModDiffPackage#getProductDimensionDelta_DimensionName()
	 * @model
	 * @generated
	 */
	String getDimensionName();

	/**
	 * Sets the value of the '{@link de.ubt.ai1.supermod.mm.diff.ProductDimensionDelta#getDimensionName <em>Dimension Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dimension Name</em>' attribute.
	 * @see #getDimensionName()
	 * @generated
	 */
	void setDimensionName(String value);

} // ProductDimensionDelta
