/**
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package de.ubt.ai1.supermod.mm.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Merge Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai1.supermod.mm.core.MergeExpr#getBaseExpr <em>Base Expr</em>}</li>
 * </ul>
 *
 * @see de.ubt.ai1.supermod.mm.core.SuperModCorePackage#getMergeExpr()
 * @model
 * @generated
 */
public interface MergeExpr extends BinaryExpr {
	/**
	 * Returns the value of the '<em><b>Base Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Expr</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Expr</em>' containment reference.
	 * @see #setBaseExpr(OptionExpr)
	 * @see de.ubt.ai1.supermod.mm.core.SuperModCorePackage#getMergeExpr_BaseExpr()
	 * @model containment="true"
	 * @generated
	 */
	OptionExpr getBaseExpr();

	/**
	 * Sets the value of the '{@link de.ubt.ai1.supermod.mm.core.MergeExpr#getBaseExpr <em>Base Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Expr</em>' containment reference.
	 * @see #getBaseExpr()
	 * @generated
	 */
	void setBaseExpr(OptionExpr value);

} // MergeExpr
