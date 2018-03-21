/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.mm.core;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product Dimension</b></em>'.
 * A product dimension denotes an independent product artefact which is versioned with
 * respect to the same version space together with other dimensions. A product space
 * consists of a number of product elements, which are hierarchically organized.
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date 	2014-07-25
 * @see		{@link ProductSpace}
 * @see		{@link ProductSpaceElement}
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai1.supermod.mm.core.ProductDimension#getRootProductSpaceElements <em>Root Product Space Elements</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.core.ProductDimension#getAllProductSpaceElements <em>All Product Space Elements</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.core.ProductDimension#getProductSpace <em>Product Space</em>}</li>
 * </ul>
 *
 * @see de.ubt.ai1.supermod.mm.core.SuperModCorePackage#getProductDimension()
 * @model abstract="true"
 * @generated
 */
public interface ProductDimension extends Dimension {
	/**
	 * Returns the value of the '<em><b>Root Product Space Elements</b></em>' reference list.
	 * The list contents are of type {@link de.ubt.ai1.supermod.mm.core.ProductSpaceElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * The direct roots elements of this product dimension.
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root Product Space Elements</em>' reference list.
	 * @see de.ubt.ai1.supermod.mm.core.SuperModCorePackage#getProductDimension_RootProductSpaceElements()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<ProductSpaceElement> getRootProductSpaceElements();

	/**
	 * Returns the value of the '<em><b>All Product Space Elements</b></em>' reference list.
	 * The list contents are of type {@link de.ubt.ai1.supermod.mm.core.ProductSpaceElement}.
	 * It is bidirectional and its opposite is '{@link de.ubt.ai1.supermod.mm.core.ProductSpaceElement#getProductDimension <em>Product Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * All product elements that are transitively contained in this product dimension.
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All Product Space Elements</em>' reference list.
	 * @see de.ubt.ai1.supermod.mm.core.SuperModCorePackage#getProductDimension_AllProductSpaceElements()
	 * @see de.ubt.ai1.supermod.mm.core.ProductSpaceElement#getProductDimension
	 * @model opposite="productDimension" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<ProductSpaceElement> getAllProductSpaceElements();

	/**
	 * Returns the value of the '<em><b>Product Space</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link de.ubt.ai1.supermod.mm.core.ProductSpace#getDimensions <em>Dimensions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * The product space in which this product dimension is contained.
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Space</em>' reference.
	 * @see #setProductSpace(ProductSpace)
	 * @see de.ubt.ai1.supermod.mm.core.SuperModCorePackage#getProductDimension_ProductSpace()
	 * @see de.ubt.ai1.supermod.mm.core.ProductSpace#getDimensions
	 * @model opposite="dimensions"
	 * @generated
	 */
	ProductSpace getProductSpace();

	/**
	 * Sets the value of the '{@link de.ubt.ai1.supermod.mm.core.ProductDimension#getProductSpace <em>Product Space</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Space</em>' reference.
	 * @see #getProductSpace()
	 * @generated
	 */
	void setProductSpace(ProductSpace value);

} // ProductDimension
