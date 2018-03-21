/**
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package de.ubt.ai1.supermod.mm.feature;

import de.ubt.ai1.supermod.mm.core.DefaultBinding;
import de.ubt.ai1.supermod.mm.core.HybridElement;
import de.ubt.ai1.supermod.mm.core.Invariant;
import de.ubt.ai1.supermod.mm.core.Tristate;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Elimination</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai1.supermod.mm.feature.Elimination#getFeature <em>Feature</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.feature.Elimination#getDefaultSelection <em>Default Selection</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.feature.Elimination#getEliminationInvariant <em>Elimination Invariant</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.feature.Elimination#getEliminationDefault <em>Elimination Default</em>}</li>
 * </ul>
 *
 * @see de.ubt.ai1.supermod.mm.feature.SuperModFeaturePackage#getElimination()
 * @model
 * @generated
 */
public interface Elimination extends HybridElement {
	/**
	 * Returns the value of the '<em><b>Feature</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.ubt.ai1.supermod.mm.feature.Feature#getEliminations <em>Eliminations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature</em>' container reference.
	 * @see #setFeature(Feature)
	 * @see de.ubt.ai1.supermod.mm.feature.SuperModFeaturePackage#getElimination_Feature()
	 * @see de.ubt.ai1.supermod.mm.feature.Feature#getEliminations
	 * @model opposite="eliminations" transient="false"
	 * @generated
	 */
	Feature getFeature();

	/**
	 * Sets the value of the '{@link de.ubt.ai1.supermod.mm.feature.Elimination#getFeature <em>Feature</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature</em>' container reference.
	 * @see #getFeature()
	 * @generated
	 */
	void setFeature(Feature value);

	/**
	 * Returns the value of the '<em><b>Default Selection</b></em>' attribute.
	 * The literals are from the enumeration {@link de.ubt.ai1.supermod.mm.core.Tristate}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Selection</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Selection</em>' attribute.
	 * @see de.ubt.ai1.supermod.mm.core.Tristate
	 * @see #setDefaultSelection(Tristate)
	 * @see de.ubt.ai1.supermod.mm.feature.SuperModFeaturePackage#getElimination_DefaultSelection()
	 * @model
	 * @generated
	 */
	Tristate getDefaultSelection();

	/**
	 * Sets the value of the '{@link de.ubt.ai1.supermod.mm.feature.Elimination#getDefaultSelection <em>Default Selection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Selection</em>' attribute.
	 * @see de.ubt.ai1.supermod.mm.core.Tristate
	 * @see #getDefaultSelection()
	 * @generated
	 */
	void setDefaultSelection(Tristate value);

	/**
	 * Returns the value of the '<em><b>Elimination Invariant</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elimination Invariant</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elimination Invariant</em>' containment reference.
	 * @see #setEliminationInvariant(Invariant)
	 * @see de.ubt.ai1.supermod.mm.feature.SuperModFeaturePackage#getElimination_EliminationInvariant()
	 * @model containment="true"
	 * @generated
	 */
	Invariant getEliminationInvariant();

	/**
	 * Sets the value of the '{@link de.ubt.ai1.supermod.mm.feature.Elimination#getEliminationInvariant <em>Elimination Invariant</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Elimination Invariant</em>' containment reference.
	 * @see #getEliminationInvariant()
	 * @generated
	 */
	void setEliminationInvariant(Invariant value);

	/**
	 * Returns the value of the '<em><b>Elimination Default</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elimination Default</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elimination Default</em>' containment reference.
	 * @see #setEliminationDefault(DefaultBinding)
	 * @see de.ubt.ai1.supermod.mm.feature.SuperModFeaturePackage#getElimination_EliminationDefault()
	 * @model containment="true"
	 * @generated
	 */
	DefaultBinding getEliminationDefault();

	/**
	 * Sets the value of the '{@link de.ubt.ai1.supermod.mm.feature.Elimination#getEliminationDefault <em>Elimination Default</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Elimination Default</em>' containment reference.
	 * @see #getEliminationDefault()
	 * @generated
	 */
	void setEliminationDefault(DefaultBinding value);

} // Elimination
