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
import de.ubt.ai1.supermod.mm.core.Preference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Child Relationship</b></em>'.
 * Represents a parent-child relationship between two features. This relationship
 * is directly contained by the parent feature and references the child feature
 * by a non-containment relationships, in order to achieve container variability
 * within features. This relationship has the following semantics: In case the
 * child feature is selected, the parent feature needs to be selected, too.
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
 *   <li>{@link de.ubt.ai1.supermod.mm.feature.ChildRelationship#getParent <em>Parent</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.feature.ChildRelationship#getChild <em>Child</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.feature.ChildRelationship#getParentInvariant <em>Parent Invariant</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.feature.ChildRelationship#getParentPreference <em>Parent Preference</em>}</li>
 * </ul>
 *
 * @see de.ubt.ai1.supermod.mm.feature.SuperModFeaturePackage#getChildRelationship()
 * @model
 * @generated
 */
public interface ChildRelationship extends HybridElement {
	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.ubt.ai1.supermod.mm.feature.Feature#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * The parent feature of the parent-child relationship.
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(Feature)
	 * @see de.ubt.ai1.supermod.mm.feature.SuperModFeaturePackage#getChildRelationship_Parent()
	 * @see de.ubt.ai1.supermod.mm.feature.Feature#getChildren
	 * @model opposite="children" transient="false"
	 * @generated
	 */
	Feature getParent();

	/**
	 * Sets the value of the '{@link de.ubt.ai1.supermod.mm.feature.ChildRelationship#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(Feature value);

	/**
	 * Returns the value of the '<em><b>Child</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link de.ubt.ai1.supermod.mm.feature.Feature#getParents <em>Parents</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * The child feature of the parent-child relationship.
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child</em>' reference.
	 * @see #setChild(Feature)
	 * @see de.ubt.ai1.supermod.mm.feature.SuperModFeaturePackage#getChildRelationship_Child()
	 * @see de.ubt.ai1.supermod.mm.feature.Feature#getParents
	 * @model opposite="parents"
	 * @generated
	 */
	Feature getChild();

	/**
	 * Sets the value of the '{@link de.ubt.ai1.supermod.mm.feature.ChildRelationship#getChild <em>Child</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Child</em>' reference.
	 * @see #getChild()
	 * @generated
	 */
	void setChild(Feature value);

	/**
	 * Returns the value of the '<em><b>Parent Invariant</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * An invariant which expresses the parent-child constraint represented by
	 * this relationship.
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Invariant</em>' containment reference.
	 * @see #setParentInvariant(Invariant)
	 * @see de.ubt.ai1.supermod.mm.feature.SuperModFeaturePackage#getChildRelationship_ParentInvariant()
	 * @model containment="true"
	 * @generated
	 */
	Invariant getParentInvariant();

	/**
	 * Sets the value of the '{@link de.ubt.ai1.supermod.mm.feature.ChildRelationship#getParentInvariant <em>Parent Invariant</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Invariant</em>' containment reference.
	 * @see #getParentInvariant()
	 * @generated
	 */
	void setParentInvariant(Invariant value);

	/**
	 * Returns the value of the '<em><b>Parent Preference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Preference</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Preference</em>' containment reference.
	 * @see #setParentPreference(Preference)
	 * @see de.ubt.ai1.supermod.mm.feature.SuperModFeaturePackage#getChildRelationship_ParentPreference()
	 * @model containment="true"
	 * @generated
	 */
	Preference getParentPreference();

	/**
	 * Sets the value of the '{@link de.ubt.ai1.supermod.mm.feature.ChildRelationship#getParentPreference <em>Parent Preference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Preference</em>' containment reference.
	 * @see #getParentPreference()
	 * @generated
	 */
	void setParentPreference(Preference value);

} // ChildRelationship
