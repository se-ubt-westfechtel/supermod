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
 * A representation of the model object '<em><b>Visibility Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai1.supermod.mm.core.VisibilityRef#getVisibility <em>Visibility</em>}</li>
 * </ul>
 *
 * @see de.ubt.ai1.supermod.mm.core.SuperModCorePackage#getVisibilityRef()
 * @model
 * @generated
 */
public interface VisibilityRef extends OptionExpr {
	/**
	 * Returns the value of the '<em><b>Visibility</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Visibility</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visibility</em>' reference.
	 * @see #setVisibility(Visibility)
	 * @see de.ubt.ai1.supermod.mm.core.SuperModCorePackage#getVisibilityRef_Visibility()
	 * @model
	 * @generated
	 */
	Visibility getVisibility();

	/**
	 * Sets the value of the '{@link de.ubt.ai1.supermod.mm.core.VisibilityRef#getVisibility <em>Visibility</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visibility</em>' reference.
	 * @see #getVisibility()
	 * @generated
	 */
	void setVisibility(Visibility value);

} // VisibilityRef
