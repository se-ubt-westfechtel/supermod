/**
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package de.ubt.ai1.supermod.mm.client;

import de.ubt.ai1.supermod.mm.core.ProductDimension;
import de.ubt.ai1.supermod.mm.core.ProductSpace;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product Space Export Trace</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai1.supermod.mm.client.ProductSpaceExportTrace#getProductSpace <em>Product Space</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.client.ProductSpaceExportTrace#getDimensionTraces <em>Dimension Traces</em>}</li>
 * </ul>
 *
 * @see de.ubt.ai1.supermod.mm.client.SuperModClientPackage#getProductSpaceExportTrace()
 * @model
 * @generated
 */
public interface ProductSpaceExportTrace extends EObject {
	/**
	 * Returns the value of the '<em><b>Product Space</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Space</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Space</em>' reference.
	 * @see #setProductSpace(ProductSpace)
	 * @see de.ubt.ai1.supermod.mm.client.SuperModClientPackage#getProductSpaceExportTrace_ProductSpace()
	 * @model
	 * @generated
	 */
	ProductSpace getProductSpace();

	/**
	 * Sets the value of the '{@link de.ubt.ai1.supermod.mm.client.ProductSpaceExportTrace#getProductSpace <em>Product Space</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Space</em>' reference.
	 * @see #getProductSpace()
	 * @generated
	 */
	void setProductSpace(ProductSpace value);

	/**
	 * Returns the value of the '<em><b>Dimension Traces</b></em>' containment reference list.
	 * The list contents are of type {@link de.ubt.ai1.supermod.mm.client.ProductDimensionExportTrace}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dimension Traces</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dimension Traces</em>' containment reference list.
	 * @see de.ubt.ai1.supermod.mm.client.SuperModClientPackage#getProductSpaceExportTrace_DimensionTraces()
	 * @model containment="true"
	 * @generated
	 */
	EList<ProductDimensionExportTrace> getDimensionTraces();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	ProductDimensionExportTrace getTraceForDimension(ProductDimension dimension);

} // ProductSpaceExportTrace
