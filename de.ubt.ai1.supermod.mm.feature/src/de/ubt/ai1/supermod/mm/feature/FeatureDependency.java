/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.mm.feature;

import de.ubt.ai1.supermod.mm.core.HybridElement;
import de.ubt.ai1.supermod.mm.core.Invariant;
import de.ubt.ai1.supermod.mm.core.UUIDElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature Dependency</b></em>'.
 * A feature dependency denotes a cross-tree relationship between two features.
 * There are two kinds of dependencies: requirements and exclusions, each
 * expressing a specific semantics.
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date 	2014-07-28
 * @see 	FeatureExclusion
 * @see		FeatureRequirement
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai1.supermod.mm.feature.FeatureDependency#getDependencyInvariant <em>Dependency Invariant</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.feature.FeatureDependency#getSourceFeature <em>Source Feature</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.feature.FeatureDependency#getTargetFeature <em>Target Feature</em>}</li>
 * </ul>
 *
 * @see de.ubt.ai1.supermod.mm.feature.SuperModFeaturePackage#getFeatureDependency()
 * @model abstract="true"
 * @generated
 */
public interface FeatureDependency extends HybridElement, UUIDElement {
	/**
	 * Returns the value of the '<em><b>Dependency Invariant</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * A low-level invariant which expresses the semantics represented by this
	 * cross-tree feature dependency.
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependency Invariant</em>' containment reference.
	 * @see #setDependencyInvariant(Invariant)
	 * @see de.ubt.ai1.supermod.mm.feature.SuperModFeaturePackage#getFeatureDependency_DependencyInvariant()
	 * @model containment="true"
	 * @generated
	 */
	Invariant getDependencyInvariant();

	/**
	 * Sets the value of the '{@link de.ubt.ai1.supermod.mm.feature.FeatureDependency#getDependencyInvariant <em>Dependency Invariant</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dependency Invariant</em>' containment reference.
	 * @see #getDependencyInvariant()
	 * @generated
	 */
	void setDependencyInvariant(Invariant value);

	/**
	 * Returns the value of the '<em><b>Source Feature</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.ubt.ai1.supermod.mm.feature.Feature#getOutgoingDependencies <em>Outgoing Dependencies</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * The first operand and the container of this dependency.
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Feature</em>' container reference.
	 * @see #setSourceFeature(Feature)
	 * @see de.ubt.ai1.supermod.mm.feature.SuperModFeaturePackage#getFeatureDependency_SourceFeature()
	 * @see de.ubt.ai1.supermod.mm.feature.Feature#getOutgoingDependencies
	 * @model opposite="outgoingDependencies" transient="false"
	 * @generated
	 */
	Feature getSourceFeature();

	/**
	 * Sets the value of the '{@link de.ubt.ai1.supermod.mm.feature.FeatureDependency#getSourceFeature <em>Source Feature</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Feature</em>' container reference.
	 * @see #getSourceFeature()
	 * @generated
	 */
	void setSourceFeature(Feature value);

	/**
	 * Returns the value of the '<em><b>Target Feature</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link de.ubt.ai1.supermod.mm.feature.Feature#getIncomingDependencies <em>Incoming Dependencies</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * The second operand of the dependency, connected by a cross-reference.
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Feature</em>' reference.
	 * @see #setTargetFeature(Feature)
	 * @see de.ubt.ai1.supermod.mm.feature.SuperModFeaturePackage#getFeatureDependency_TargetFeature()
	 * @see de.ubt.ai1.supermod.mm.feature.Feature#getIncomingDependencies
	 * @model opposite="incomingDependencies"
	 * @generated
	 */
	Feature getTargetFeature();

	/**
	 * Sets the value of the '{@link de.ubt.ai1.supermod.mm.feature.FeatureDependency#getTargetFeature <em>Target Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Feature</em>' reference.
	 * @see #getTargetFeature()
	 * @generated
	 */
	void setTargetFeature(Feature value);

} // FeatureDependency
