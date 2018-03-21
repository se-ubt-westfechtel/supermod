/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.mm.feature;

import de.ubt.ai1.supermod.mm.core.HybridElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mandatory</b></em>'.
 * Denotes in which version a specific feature is mandatory. For each mandatory
 * feature, in its low-level rule base representation, an <em>invariant</em>,
 * and a <em>default binding</em> are provided, which ensure that the feature
 * is always selected.
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date 	2014-07-28
 * @see		Feature
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai1.supermod.mm.feature.Mandatory#getFeature <em>Feature</em>}</li>
 * </ul>
 *
 * @see de.ubt.ai1.supermod.mm.feature.SuperModFeaturePackage#getMandatory()
 * @model
 * @generated
 */
public interface Mandatory extends HybridElement {
	/**
	 * Returns the value of the '<em><b>Feature</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.ubt.ai1.supermod.mm.feature.Feature#getMandatory <em>Mandatory</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * The feature this mandatory flag belongs to.
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature</em>' container reference.
	 * @see #setFeature(Feature)
	 * @see de.ubt.ai1.supermod.mm.feature.SuperModFeaturePackage#getMandatory_Feature()
	 * @see de.ubt.ai1.supermod.mm.feature.Feature#getMandatory
	 * @model opposite="mandatory" transient="false"
	 * @generated
	 */
	Feature getFeature();

	/**
	 * Sets the value of the '{@link de.ubt.ai1.supermod.mm.feature.Mandatory#getFeature <em>Feature</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature</em>' container reference.
	 * @see #getFeature()
	 * @generated
	 */
	void setFeature(Feature value);

} // Mandatory
