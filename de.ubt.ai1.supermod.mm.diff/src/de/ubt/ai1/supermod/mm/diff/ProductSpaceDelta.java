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
 * A representation of the model object '<em><b>Product Space Delta</b></em>'.
 * A product space delta consists of a set of product dimension deltas, which
 * describe changes to the respective product dimensions.
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
 *   <li>{@link de.ubt.ai1.supermod.mm.diff.ProductSpaceDelta#getProductDimensionDeltas <em>Product Dimension Deltas</em>}</li>
 * </ul>
 *
 * @see de.ubt.ai1.supermod.mm.diff.SuperModDiffPackage#getProductSpaceDelta()
 * @model
 * @generated
 */
public interface ProductSpaceDelta extends EObject {
	/**
	 * Returns the value of the '<em><b>Product Dimension Deltas</b></em>' reference list.
	 * The list contents are of type {@link de.ubt.ai1.supermod.mm.diff.ProductDimensionDelta}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * Product dimension deltas, each referring to a specific product dimension.
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Dimension Deltas</em>' reference list.
	 * @see de.ubt.ai1.supermod.mm.diff.SuperModDiffPackage#getProductSpaceDelta_ProductDimensionDeltas()
	 * @model
	 * @generated
	 */
	EList<ProductDimensionDelta> getProductDimensionDeltas();

} // ProductSpaceDelta
