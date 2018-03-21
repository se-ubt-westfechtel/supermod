/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.mm.core;

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
 * @see de.ubt.ai1.supermod.mm.core.SuperModCorePackage
 * @generated
 */
public interface SuperModCoreFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SuperModCoreFactory eINSTANCE = de.ubt.ai1.supermod.mm.core.impl.SuperModCoreFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Repository</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Repository</em>'.
	 * @generated
	 */
	Repository createRepository();

	/**
	 * Returns a new object of class '<em>Visibility Forest</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Visibility Forest</em>'.
	 * @generated
	 */
	VisibilityForest createVisibilityForest();

	/**
	 * Returns a new object of class '<em>Visibility</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Visibility</em>'.
	 * @generated
	 */
	Visibility createVisibility();

	/**
	 * Returns a new object of class '<em>Visibility Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Visibility Ref</em>'.
	 * @generated
	 */
	VisibilityRef createVisibilityRef();

	/**
	 * Returns a new object of class '<em>Product Space</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Product Space</em>'.
	 * @generated
	 */
	ProductSpace createProductSpace();

	/**
	 * Returns a new object of class '<em>Version Space</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Version Space</em>'.
	 * @generated
	 */
	VersionSpace createVersionSpace();

	/**
	 * Returns a new object of class '<em>Invariant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Invariant</em>'.
	 * @generated
	 */
	Invariant createInvariant();

	/**
	 * Returns a new object of class '<em>Preference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Preference</em>'.
	 * @generated
	 */
	Preference createPreference();

	/**
	 * Returns a new object of class '<em>Default Binding</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Default Binding</em>'.
	 * @generated
	 */
	DefaultBinding createDefaultBinding();

	/**
	 * Returns a new object of class '<em>Option</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Option</em>'.
	 * @generated
	 */
	Option createOption();

	/**
	 * Returns a new object of class '<em>Option Binding</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Option Binding</em>'.
	 * @generated
	 */
	OptionBinding createOptionBinding();

	/**
	 * Returns a new object of class '<em>Visibility Evaluation Cache</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Visibility Evaluation Cache</em>'.
	 * @generated
	 */
	VisibilityEvaluationCache createVisibilityEvaluationCache();

	/**
	 * Returns a new object of class '<em>Option Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Option Ref</em>'.
	 * @generated
	 */
	OptionRef createOptionRef();

	/**
	 * Returns a new object of class '<em>Neg Expr</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Neg Expr</em>'.
	 * @generated
	 */
	NegExpr createNegExpr();

	/**
	 * Returns a new object of class '<em>And Expr</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>And Expr</em>'.
	 * @generated
	 */
	AndExpr createAndExpr();

	/**
	 * Returns a new object of class '<em>Or Expr</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Or Expr</em>'.
	 * @generated
	 */
	OrExpr createOrExpr();

	/**
	 * Returns a new object of class '<em>Xor Expr</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Xor Expr</em>'.
	 * @generated
	 */
	XorExpr createXorExpr();

	/**
	 * Returns a new object of class '<em>Implies Expr</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Implies Expr</em>'.
	 * @generated
	 */
	ImpliesExpr createImpliesExpr();

	/**
	 * Returns a new object of class '<em>Biconditional Expr</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Biconditional Expr</em>'.
	 * @generated
	 */
	BiconditionalExpr createBiconditionalExpr();

	/**
	 * Returns a new object of class '<em>Nand Expr</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Nand Expr</em>'.
	 * @generated
	 */
	NandExpr createNandExpr();

	/**
	 * Returns a new object of class '<em>Minus Expr</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Minus Expr</em>'.
	 * @generated
	 */
	MinusExpr createMinusExpr();

	/**
	 * Returns a new object of class '<em>Merge Expr</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Merge Expr</em>'.
	 * @generated
	 */
	MergeExpr createMergeExpr();

	/**
	 * Returns a new object of class '<em>Big And Expr</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Big And Expr</em>'.
	 * @generated
	 */
	BigAndExpr createBigAndExpr();

	/**
	 * Returns a new object of class '<em>Big Or Expr</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Big Or Expr</em>'.
	 * @generated
	 */
	BigOrExpr createBigOrExpr();

	/**
	 * Returns a new object of class '<em>Big Xor Expr</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Big Xor Expr</em>'.
	 * @generated
	 */
	BigXorExpr createBigXorExpr();

	/**
	 * Returns a new object of class '<em>Big Nand Expr</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Big Nand Expr</em>'.
	 * @generated
	 */
	BigNandExpr createBigNandExpr();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SuperModCorePackage getSuperModCorePackage();

} //SuperModCoreFactory
