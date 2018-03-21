/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.mm.diff;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date 	2014-07-25
 * <!-- end-user-doc -->
 * @see de.ubt.ai1.supermod.mm.diff.SuperModDiffPackage
 * @generated
 */
public interface SuperModDiffFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SuperModDiffFactory eINSTANCE = de.ubt.ai1.supermod.mm.diff.impl.SuperModDiffFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Product Space Matching</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Product Space Matching</em>'.
	 * @generated
	 */
	ProductSpaceMatching createProductSpaceMatching();

	/**
	 * Returns a new object of class '<em>Matching Role</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Matching Role</em>'.
	 * @generated
	 */
	MatchingRole createMatchingRole();

	/**
	 * Returns a new object of class '<em>Product Dimension Matching</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Product Dimension Matching</em>'.
	 * @generated
	 */
	ProductDimensionMatching createProductDimensionMatching();

	/**
	 * Returns a new object of class '<em>Product Space Element Matching</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Product Space Element Matching</em>'.
	 * @generated
	 */
	ProductSpaceElementMatching createProductSpaceElementMatching();

	/**
	 * Returns a new object of class '<em>Matched Product Space Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Matched Product Space Element</em>'.
	 * @generated
	 */
	MatchedProductSpaceElement createMatchedProductSpaceElement();

	/**
	 * Returns a new object of class '<em>Matched Product Dimension</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Matched Product Dimension</em>'.
	 * @generated
	 */
	MatchedProductDimension createMatchedProductDimension();

	/**
	 * Returns a new object of class '<em>Product Space Delta</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Product Space Delta</em>'.
	 * @generated
	 */
	ProductSpaceDelta createProductSpaceDelta();

	/**
	 * Returns a new object of class '<em>Product Dimension Delta</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Product Dimension Delta</em>'.
	 * @generated
	 */
	ProductDimensionDelta createProductDimensionDelta();

	/**
	 * Returns a new object of class '<em>Product Space Element Delta</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Product Space Element Delta</em>'.
	 * @generated
	 */
	ProductSpaceElementDelta createProductSpaceElementDelta();

	/**
	 * Returns a new object of class '<em>Write Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Write Set</em>'.
	 * @generated
	 */
	WriteSet createWriteSet();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SuperModDiffPackage getSuperModDiffPackage();

} //SuperModDiffFactory
