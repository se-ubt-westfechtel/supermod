/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.mm.core;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product Space</b></em>'.
 * The product space defines all elements which are subject to version control. The connection
 * to the version space is realized by means of <em>visibilities</em> which are attached to
 * product space elements. The product space is divided up into several independent dimensions,
 * which share a common version space.
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date 	2014-07-25
 * @see		{@link ProductDimension}
 * @see		{@link ProductSpaceElement}
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai1.supermod.mm.core.ProductSpace#getDimensions <em>Dimensions</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.core.ProductSpace#getRepository <em>Repository</em>}</li>
 * </ul>
 *
 * @see de.ubt.ai1.supermod.mm.core.SuperModCorePackage#getProductSpace()
 * @model
 * @generated
 */
public interface ProductSpace extends EObject {
	/**
	 * Returns the value of the '<em><b>Dimensions</b></em>' reference list.
	 * The list contents are of type {@link de.ubt.ai1.supermod.mm.core.ProductDimension}.
	 * It is bidirectional and its opposite is '{@link de.ubt.ai1.supermod.mm.core.ProductDimension#getProductSpace <em>Product Space</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * The dimensions of this product space.
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dimensions</em>' reference list.
	 * @see de.ubt.ai1.supermod.mm.core.SuperModCorePackage#getProductSpace_Dimensions()
	 * @see de.ubt.ai1.supermod.mm.core.ProductDimension#getProductSpace
	 * @model opposite="productSpace"
	 * @generated
	 */
	EList<ProductDimension> getDimensions();

	/**
	 * Returns the value of the '<em><b>Repository</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.ubt.ai1.supermod.mm.core.Repository#getProductSpace <em>Product Space</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * The repository this product space is connected to.
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repository</em>' container reference.
	 * @see #setRepository(Repository)
	 * @see de.ubt.ai1.supermod.mm.core.SuperModCorePackage#getProductSpace_Repository()
	 * @see de.ubt.ai1.supermod.mm.core.Repository#getProductSpace
	 * @model opposite="productSpace" transient="false"
	 * @generated
	 */
	Repository getRepository();

	/**
	 * Sets the value of the '{@link de.ubt.ai1.supermod.mm.core.ProductSpace#getRepository <em>Repository</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repository</em>' container reference.
	 * @see #getRepository()
	 * @generated
	 */
	void setRepository(Repository value);

} // ProductSpace
