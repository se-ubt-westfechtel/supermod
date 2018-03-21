/******************************************************************************
 * Copyright (c) 2018 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.mm.feature.client;

import de.ubt.ai1.supermod.mm.client.ProductConflict;
import de.ubt.ai1.supermod.mm.feature.FeatureModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root Feature Conflict</b></em>'.
 * This conflict is reported in case a single-version feature model contains
 * multiple features as its root.
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
 *   <li>{@link de.ubt.ai1.supermod.mm.feature.client.RootFeatureConflict#getContextModel <em>Context Model</em>}</li>
 * </ul>
 *
 * @see de.ubt.ai1.supermod.mm.feature.client.SuperModFeatureClientPackage#getRootFeatureConflict()
 * @model
 * @generated
 */
public interface RootFeatureConflict extends ProductConflict {
	/**
	 * Returns the value of the '<em><b>Context Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * The feature model that contains multiple roots.
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context Model</em>' reference.
	 * @see #setContextModel(FeatureModel)
	 * @see de.ubt.ai1.supermod.mm.feature.client.SuperModFeatureClientPackage#getRootFeatureConflict_ContextModel()
	 * @model
	 * @generated
	 */
	FeatureModel getContextModel();

	/**
	 * Sets the value of the '{@link de.ubt.ai1.supermod.mm.feature.client.RootFeatureConflict#getContextModel <em>Context Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context Model</em>' reference.
	 * @see #getContextModel()
	 * @generated
	 */
	void setContextModel(FeatureModel value);

} // RootFeatureConflict
