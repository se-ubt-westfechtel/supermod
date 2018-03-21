/******************************************************************************
 * Copyright (c) 2018 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.mm.feature.client;

import de.ubt.ai1.supermod.mm.client.ProductConflict;

import de.ubt.ai1.supermod.mm.feature.Feature;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Display Name Conflict</b></em>'.
 * This conflict is reported in case a feature has multiple names in 
 * a single-version feature model.
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>,
 * 			Johannes Schroepfer <Johannes.M.Schroepfer(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	2018-01-09
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai1.supermod.mm.feature.client.DisplayNameConflict#getContextFeature <em>Context Feature</em>}</li>
 * </ul>
 *
 * @see de.ubt.ai1.supermod.mm.feature.client.SuperModFeatureClientPackage#getDisplayNameConflict()
 * @model
 * @generated
 */
public interface DisplayNameConflict extends ProductConflict {
	/**
	 * Returns the value of the '<em><b>Context Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * Returns the feature which has multiple names.
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context Feature</em>' reference.
	 * @see #setContextFeature(Feature)
	 * @see de.ubt.ai1.supermod.mm.feature.client.SuperModFeatureClientPackage#getDisplayNameConflict_ContextFeature()
	 * @model
	 * @generated
	 */
	Feature getContextFeature();

	/**
	 * Sets the value of the '{@link de.ubt.ai1.supermod.mm.feature.client.DisplayNameConflict#getContextFeature <em>Context Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context Feature</em>' reference.
	 * @see #getContextFeature()
	 * @generated
	 */
	void setContextFeature(Feature value);

} // DisplayNameConflict
