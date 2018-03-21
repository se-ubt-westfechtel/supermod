/**
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package de.ubt.ai1.supermod.mm.client;

import de.ubt.ai1.supermod.mm.core.ProductDimension;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product Dimension Export Trace</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai1.supermod.mm.client.ProductDimensionExportTrace#getProductDimension <em>Product Dimension</em>}</li>
 * </ul>
 *
 * @see de.ubt.ai1.supermod.mm.client.SuperModClientPackage#getProductDimensionExportTrace()
 * @model abstract="true"
 * @generated
 */
public interface ProductDimensionExportTrace extends EObject {
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
	 * @see de.ubt.ai1.supermod.mm.client.SuperModClientPackage#getProductDimensionExportTrace_ProductDimension()
	 * @model
	 * @generated
	 */
	ProductDimension getProductDimension();

	/**
	 * Sets the value of the '{@link de.ubt.ai1.supermod.mm.client.ProductDimensionExportTrace#getProductDimension <em>Product Dimension</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Dimension</em>' reference.
	 * @see #getProductDimension()
	 * @generated
	 */
	void setProductDimension(ProductDimension value);

} // ProductDimensionExportTrace
