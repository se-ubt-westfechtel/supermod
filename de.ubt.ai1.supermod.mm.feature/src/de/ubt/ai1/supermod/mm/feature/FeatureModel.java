/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.mm.feature;

import org.eclipse.emf.common.util.EList;

import de.ubt.ai1.supermod.mm.core.HybridDimension;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature Model</b></em>'.
 * A feature model is a high-level logical version dimension which defines a
 * low-level option for each feature, as well as a number of structural
 * invariants for specific semantical dependencies implicitly expressed
 * by the feature model.
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date 	2014-07-28
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai1.supermod.mm.feature.FeatureModel#getRoots <em>Roots</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.feature.FeatureModel#getFeatures <em>Features</em>}</li>
 * </ul>
 *
 * @see de.ubt.ai1.supermod.mm.feature.SuperModFeaturePackage#getFeatureModel()
 * @model
 * @generated
 */
public interface FeatureModel extends HybridDimension {
	/**
	 * Returns the value of the '<em><b>Roots</b></em>' containment reference list.
	 * The list contents are of type {@link de.ubt.ai1.supermod.mm.feature.RootRelationship}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * Expresses in which version which feature denote the root of the feature
	 * model.
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roots</em>' containment reference list.
	 * @see de.ubt.ai1.supermod.mm.feature.SuperModFeaturePackage#getFeatureModel_Roots()
	 * @model containment="true"
	 * @generated
	 */
	EList<RootRelationship> getRoots();

	/**
	 * Returns the value of the '<em><b>Features</b></em>' containment reference list.
	 * The list contents are of type {@link de.ubt.ai1.supermod.mm.feature.Feature}.
	 * It is bidirectional and its opposite is '{@link de.ubt.ai1.supermod.mm.feature.Feature#getFeatureModel <em>Feature Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * Contains all features defined by the feature model. Additional dependencies
	 * between features are contained by the features themselves.
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Features</em>' containment reference list.
	 * @see de.ubt.ai1.supermod.mm.feature.SuperModFeaturePackage#getFeatureModel_Features()
	 * @see de.ubt.ai1.supermod.mm.feature.Feature#getFeatureModel
	 * @model opposite="featureModel" containment="true"
	 * @generated
	 */
	EList<Feature> getFeatures();

} // FeatureModel
