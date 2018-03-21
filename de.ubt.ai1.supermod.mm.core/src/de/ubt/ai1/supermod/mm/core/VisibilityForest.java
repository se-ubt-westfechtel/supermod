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
 * A representation of the model object '<em><b>Visibility Forest</b></em>'.
 * A visibility forest is a part of a SuperMod repository. It is a global data
 * which stores option expressions which occur as the visibilities of elements of
 * the product space. The option expressions refer to options which are defined in
 * the version space of the repository. Inside a visibility forest, option
 * expressions intensively refer to each other and build a set of trees. For
 * this purpose, option expressions contained in visibility forests frequently
 * include option expression references.
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date 	2014-07-25
 * @see 	OptionExpr
 * @see		OptionExprRef
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai1.supermod.mm.core.VisibilityForest#getVisibilities <em>Visibilities</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.core.VisibilityForest#getRepository <em>Repository</em>}</li>
 * </ul>
 *
 * @see de.ubt.ai1.supermod.mm.core.SuperModCorePackage#getVisibilityForest()
 * @model
 * @generated
 */
public interface VisibilityForest extends Dimension {
	/**
	 * Returns the value of the '<em><b>Visibilities</b></em>' containment reference list.
	 * The list contents are of type {@link de.ubt.ai1.supermod.mm.core.Visibility}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * The collection of globally stored visibilities, realized as option
	 * expressions.
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visibilities</em>' containment reference list.
	 * @see de.ubt.ai1.supermod.mm.core.SuperModCorePackage#getVisibilityForest_Visibilities()
	 * @model containment="true"
	 * @generated
	 */
	EList<Visibility> getVisibilities();

	/**
	 * Returns the value of the '<em><b>Repository</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link de.ubt.ai1.supermod.mm.core.Repository#getVisibilityForest <em>Visibility Forest</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Repository</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repository</em>' reference.
	 * @see #setRepository(Repository)
	 * @see de.ubt.ai1.supermod.mm.core.SuperModCorePackage#getVisibilityForest_Repository()
	 * @see de.ubt.ai1.supermod.mm.core.Repository#getVisibilityForest
	 * @model opposite="visibilityForest"
	 * @generated
	 */
	Repository getRepository();

	/**
	 * Sets the value of the '{@link de.ubt.ai1.supermod.mm.core.VisibilityForest#getRepository <em>Repository</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repository</em>' reference.
	 * @see #getRepository()
	 * @generated
	 */
	void setRepository(Repository value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Visibility add(OptionExpr expr);

} // VisibilityForest
