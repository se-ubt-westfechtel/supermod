/**
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package de.ubt.ai1.supermod.mm.core;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Big Expr</b></em>'.
 * This is a base interface for logical option expressions which combine an
 * arbitrary number of operands.
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date 	2015-09-07
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai1.supermod.mm.core.BigExpr#getChildren <em>Children</em>}</li>
 * </ul>
 *
 * @see de.ubt.ai1.supermod.mm.core.SuperModCorePackage#getBigExpr()
 * @model abstract="true"
 * @generated
 */
public interface BigExpr extends OptionExpr {
	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference list.
	 * The list contents are of type {@link de.ubt.ai1.supermod.mm.core.OptionExpr}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * The operands contained by this expression.
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see de.ubt.ai1.supermod.mm.core.SuperModCorePackage#getBigExpr_Children()
	 * @model containment="true"
	 * @generated
	 */
	EList<OptionExpr> getChildren();

} // BigExpr
