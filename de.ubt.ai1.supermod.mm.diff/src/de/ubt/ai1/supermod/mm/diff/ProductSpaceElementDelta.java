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

import de.ubt.ai1.supermod.mm.core.ProductSpaceElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product Space Element Delta</b></em>'.
 * A product space element delta defines a number of product space elements, which
 * have been inserted or deleted at a specific location of the product space.
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date 	2014-07-25
 * @see		ProductSpaceElement
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai1.supermod.mm.diff.ProductSpaceElementDelta#getRootElements <em>Root Elements</em>}</li>
 * </ul>
 *
 * @see de.ubt.ai1.supermod.mm.diff.SuperModDiffPackage#getProductSpaceElementDelta()
 * @model
 * @generated
 */
public interface ProductSpaceElementDelta extends EObject {
	/**
	 * Returns the value of the '<em><b>Root Elements</b></em>' reference list.
	 * The list contents are of type {@link de.ubt.ai1.supermod.mm.core.ProductSpaceElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * The set of product space elements that have been inserted or deleted.
	 * Transitively contained elements are part of the corresponding operation,
	 * too.
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root Elements</em>' reference list.
	 * @see de.ubt.ai1.supermod.mm.diff.SuperModDiffPackage#getProductSpaceElementDelta_RootElements()
	 * @model
	 * @generated
	 */
	EList<ProductSpaceElement> getRootElements();

} // ElementDelta
