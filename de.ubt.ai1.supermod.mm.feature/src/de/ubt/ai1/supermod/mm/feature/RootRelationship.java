/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.mm.feature;

import de.ubt.ai1.supermod.mm.core.DefaultBinding;
import de.ubt.ai1.supermod.mm.core.HybridElement;
import de.ubt.ai1.supermod.mm.core.Invariant;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root Relationship</b></em>'.
 * Althogh in one version of a feature model, there must be exactly one root
 * feature, there may be multiple roots within the multi-version representation.
 * Futhermore, the set of root feature varies within multiple versions.
 * Therefore, the information whether a feature belongs to a specific feature
 * model as its root is implemented as a separate product space element.
 * The selection of the root feature is mandatory.
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date 	2014-07-28
 * @see		Feature
 * @see		FeatureModel
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai1.supermod.mm.feature.RootRelationship#getRootInvariant <em>Root Invariant</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.feature.RootRelationship#getRootDefault <em>Root Default</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.feature.RootRelationship#getFeature <em>Feature</em>}</li>
 * </ul>
 *
 * @see de.ubt.ai1.supermod.mm.feature.SuperModFeaturePackage#getRootRelationship()
 * @model
 * @generated
 */
public interface RootRelationship extends HybridElement {
	/**
	 * Returns the value of the '<em><b>Root Invariant</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * A low-level rule base invariant which ensures that the root feature is
	 * always selected.
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root Invariant</em>' containment reference.
	 * @see #setRootInvariant(Invariant)
	 * @see de.ubt.ai1.supermod.mm.feature.SuperModFeaturePackage#getRootRelationship_RootInvariant()
	 * @model containment="true"
	 * @generated
	 */
	Invariant getRootInvariant();

	/**
	 * Sets the value of the '{@link de.ubt.ai1.supermod.mm.feature.RootRelationship#getRootInvariant <em>Root Invariant</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root Invariant</em>' containment reference.
	 * @see #getRootInvariant()
	 * @generated
	 */
	void setRootInvariant(Invariant value);

	/**
	 * Returns the value of the '<em><b>Root Default</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Root Default</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root Default</em>' containment reference.
	 * @see #setRootDefault(DefaultBinding)
	 * @see de.ubt.ai1.supermod.mm.feature.SuperModFeaturePackage#getRootRelationship_RootDefault()
	 * @model containment="true"
	 * @generated
	 */
	DefaultBinding getRootDefault();

	/**
	 * Sets the value of the '{@link de.ubt.ai1.supermod.mm.feature.RootRelationship#getRootDefault <em>Root Default</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root Default</em>' containment reference.
	 * @see #getRootDefault()
	 * @generated
	 */
	void setRootDefault(DefaultBinding value);

	/**
	 * Returns the value of the '<em><b>Feature</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link de.ubt.ai1.supermod.mm.feature.Feature#getIncomingRoots <em>Incoming Roots</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * The root feature.
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature</em>' reference.
	 * @see #setFeature(Feature)
	 * @see de.ubt.ai1.supermod.mm.feature.SuperModFeaturePackage#getRootRelationship_Feature()
	 * @see de.ubt.ai1.supermod.mm.feature.Feature#getIncomingRoots
	 * @model opposite="incomingRoots"
	 * @generated
	 */
	Feature getFeature();

	/**
	 * Sets the value of the '{@link de.ubt.ai1.supermod.mm.feature.RootRelationship#getFeature <em>Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature</em>' reference.
	 * @see #getFeature()
	 * @generated
	 */
	void setFeature(Feature value);

} // RootRelationship
