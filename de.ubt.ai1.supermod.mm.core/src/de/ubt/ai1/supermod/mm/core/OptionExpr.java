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
 * A representation of the model object '<em><b>Option Expr</b></em>'.
 * An option expression is a logical expression over the options specified in a
 * given rule base. It may be evaluated with a given option binding in order to
 * return a tristate value, which indicates whether the expression is satisfied.
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date 	2014-07-25
 * @see		{@link OptionBinding}
 * @see		{@link Tristate}
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai1.supermod.mm.core.OptionExpr#getReferencedOptions <em>Referenced Options</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.core.OptionExpr#getReferencedDimensions <em>Referenced Dimensions</em>}</li>
 * </ul>
 *
 * @see de.ubt.ai1.supermod.mm.core.SuperModCorePackage#getOptionExpr()
 * @model abstract="true"
 * @generated
 */
public interface OptionExpr extends EObject {
	/**
	 * Returns the value of the '<em><b>Referenced Options</b></em>' reference list.
	 * The list contents are of type {@link de.ubt.ai1.supermod.mm.core.Option}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * All options which occur in this option expression.
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced Options</em>' reference list.
	 * @see de.ubt.ai1.supermod.mm.core.SuperModCorePackage#getOptionExpr_ReferencedOptions()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<Option> getReferencedOptions();

	/**
	 * Returns the value of the '<em><b>Referenced Dimensions</b></em>' reference list.
	 * The list contents are of type {@link de.ubt.ai1.supermod.mm.core.VersionDimension}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * All version dimensions this expressions refers to.
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced Dimensions</em>' reference list.
	 * @see de.ubt.ai1.supermod.mm.core.SuperModCorePackage#getOptionExpr_ReferencedDimensions()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<VersionDimension> getReferencedDimensions();

	/**
	 * <!-- begin-user-doc -->
	 * Evaluates this option expression with respect to a given option binding. Virtually,
	 * all options that appear in this expression are replaced by their corresponding tristate
	 * values defined in the binding, and then the resulting boolean expression is simplified.
	 * This is the <em>cached<em> implementation variant of the evaluation operation, which
	 * will get computationally cheaper when evaluated repeatedly, but consumes additional
	 * memory for the evaluation cache.
	 * @param 	binding	the option binding this expression is evaluated with.
	 * @param 	cache an evaluation cache that stores the results of previous evaluations
	 * 			in order to avoid expensive repeated evaluation of the same expression.
	 * @return	a tristate value indicating the evaluation result.
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Tristate apply(OptionBinding binding, VisibilityEvaluationCache cache);

	/**
	 * <!-- begin-user-doc -->
	 * Evaluates this option expression with respect to a given option binding. Virtually,
	 * all options that appear in this expression are replaced by their corresponding tristate
	 * values defined in the binding, and then the resulting boolean expression is simplified.
	 * This is the <em>non-cached<em> implementation variant of the evaluation operation, which
	 * will get computationally expensive when evaluated repeatedly, but consumes no additional
	 * memory.
	 * @param 	binding	the option binding this expression is evaluated with.
	 * @return	a tristate value indicating the evaluation result.
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Tristate apply(OptionBinding binding);

	/**
	 * <!-- begin-user-doc -->
	 * Negates this option expression.
	 * @return 	a negative expression that refers to the given expression and evaluates to
	 * 			the opposite of it.
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	NegExpr not();

	/**
	 * <!-- begin-user-doc -->
	 * Performs an and-combination of this option expression and another.
	 * @param	other the option expression to combine with.
	 * @return	an and-expression that combines this expression and the other.
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	AndExpr and(OptionExpr other);

	/**
	 * <!-- begin-user-doc -->
	 * Performs an or-combination of this option expression and another.
	 * @param	other the option expression to combine with.
	 * @return	an or-expression that combines this expression and the other.
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	OrExpr or(OptionExpr other);

	/**
	 * <!-- begin-user-doc -->
	 * Performs an xor-combination of this option expression and another.
	 * @param	other the option expression to combine with.
	 * @return	an xor-expression that combines this expression and the other.
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	XorExpr xor(OptionExpr other);

	/**
	 * <!-- begin-user-doc -->
	 * Performs an implies-combination of this option expression and another.
	 * @param	other the option expression to combine with.
	 * @return	an implies-expression that combines this expression and the other.
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	ImpliesExpr implies(OptionExpr other);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	BiconditionalExpr iff(OptionExpr other);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	NandExpr nand(OptionExpr other);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	MinusExpr minus(OptionExpr other);

	/**
	 * <!-- begin-user-doc -->
	 * Creates a self-contained copy of the given option expression, which does neither
	 * contain any option expression references nor proxies.
	 * @return	extracted expression.
	 * @see		{@link OptionExprRef}
	 * @see		{@link OptionExprProxy}
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	OptionExpr extract();

} // OptionExpr
