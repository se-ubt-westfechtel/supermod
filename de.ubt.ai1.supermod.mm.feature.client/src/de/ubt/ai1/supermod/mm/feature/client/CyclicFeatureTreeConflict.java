/******************************************************************************
 * Copyright (c) 2018 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.mm.feature.client;

import org.eclipse.emf.common.util.EList;

import de.ubt.ai1.supermod.mm.client.ProductConflict;
import de.ubt.ai1.supermod.mm.feature.Feature;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cyclic Feature Tree Conflict</b></em>'.
 * This conflict is reported in case a single-version feature model defines a
 * feature that transitively contains itself.
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
 *   <li>{@link de.ubt.ai1.supermod.mm.feature.client.CyclicFeatureTreeConflict#getAffectedFeatures <em>Affected Features</em>}</li>
 * </ul>
 *
 * @see de.ubt.ai1.supermod.mm.feature.client.SuperModFeatureClientPackage#getCyclicFeatureTreeConflict()
 * @model
 * @generated
 */
public interface CyclicFeatureTreeConflict extends ProductConflict {
	/**
	 * Returns the value of the '<em><b>Affected Features</b></em>' reference list.
	 * The list contents are of type {@link de.ubt.ai1.supermod.mm.feature.Feature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * Returns a list of features which occur within the containment cycle.
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Affected Features</em>' reference list.
	 * @see de.ubt.ai1.supermod.mm.feature.client.SuperModFeatureClientPackage#getCyclicFeatureTreeConflict_AffectedFeatures()
	 * @model
	 * @generated
	 */
	EList<Feature> getAffectedFeatures();

} // CyclicFeatureTreeConflict
