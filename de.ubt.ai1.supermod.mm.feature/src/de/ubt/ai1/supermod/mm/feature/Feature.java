/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.mm.feature;

import org.eclipse.emf.common.util.EList;

import de.ubt.ai1.supermod.mm.core.HybridElement;
import de.ubt.ai1.supermod.mm.core.Option;
import de.ubt.ai1.supermod.mm.core.Tristate;
import de.ubt.ai1.supermod.mm.core.UUIDElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature</b></em>'.
 * A feature is a higher-level representation of a logical option in SuperMod. As
 * a part of a feature model, it describes a logical property of a system, which
 * may be connected to other features by means of different kinds of relationships,
 * being parent-child relationships, feature groups, or cross-tree dependencies.
 * A feature may be mandatory or not; this property may evolve within multiple
 * revisions of a feature model and is therefore modeled as an additional
 * product space element. The name of a feature is considered to be stable.
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date 	2014-07-28
 * @see		Mandatory
 * @see		ChildRelationship
 * @see		FeatureGroup
 * @see		FeatureDependency
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai1.supermod.mm.feature.Feature#getFeatureModel <em>Feature Model</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.feature.Feature#getFeatureOption <em>Feature Option</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.feature.Feature#getNames <em>Names</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.feature.Feature#getChildren <em>Children</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.feature.Feature#getParents <em>Parents</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.feature.Feature#getGroups <em>Groups</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.feature.Feature#getGroupedBy <em>Grouped By</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.feature.Feature#getIncomingDependencies <em>Incoming Dependencies</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.feature.Feature#getOutgoingDependencies <em>Outgoing Dependencies</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.feature.Feature#getMandatory <em>Mandatory</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.feature.Feature#getEliminations <em>Eliminations</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.feature.Feature#getIncomingRoots <em>Incoming Roots</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.feature.Feature#getAllChildFeatures <em>All Child Features</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.feature.Feature#getTransitiveEliminationState <em>Transitive Elimination State</em>}</li>
 * </ul>
 *
 * @see de.ubt.ai1.supermod.mm.feature.SuperModFeaturePackage#getFeature()
 * @model
 * @generated
 */
public interface Feature extends HybridElement, UUIDElement {
	/**
	 * Returns the value of the '<em><b>Feature Model</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.ubt.ai1.supermod.mm.feature.FeatureModel#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature Model</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature Model</em>' container reference.
	 * @see #setFeatureModel(FeatureModel)
	 * @see de.ubt.ai1.supermod.mm.feature.SuperModFeaturePackage#getFeature_FeatureModel()
	 * @see de.ubt.ai1.supermod.mm.feature.FeatureModel#getFeatures
	 * @model opposite="features" transient="false"
	 * @generated
	 */
	FeatureModel getFeatureModel();

	/**
	 * Sets the value of the '{@link de.ubt.ai1.supermod.mm.feature.Feature#getFeatureModel <em>Feature Model</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature Model</em>' container reference.
	 * @see #getFeatureModel()
	 * @generated
	 */
	void setFeatureModel(FeatureModel value);

	/**
	 * Returns the value of the '<em><b>Feature Option</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * A low-level option which maps to this feature.
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature Option</em>' containment reference.
	 * @see #setFeatureOption(Option)
	 * @see de.ubt.ai1.supermod.mm.feature.SuperModFeaturePackage#getFeature_FeatureOption()
	 * @model containment="true"
	 * @generated
	 */
	Option getFeatureOption();

	/**
	 * Sets the value of the '{@link de.ubt.ai1.supermod.mm.feature.Feature#getFeatureOption <em>Feature Option</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature Option</em>' containment reference.
	 * @see #getFeatureOption()
	 * @generated
	 */
	void setFeatureOption(Option value);

	/**
	 * Returns the value of the '<em><b>Names</b></em>' containment reference list.
	 * The list contents are of type {@link de.ubt.ai1.supermod.mm.feature.DisplayName}.
	 * It is bidirectional and its opposite is '{@link de.ubt.ai1.supermod.mm.feature.DisplayName#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Names</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Names</em>' containment reference list.
	 * @see de.ubt.ai1.supermod.mm.feature.SuperModFeaturePackage#getFeature_Names()
	 * @see de.ubt.ai1.supermod.mm.feature.DisplayName#getFeature
	 * @model opposite="feature" containment="true"
	 * @generated
	 */
	EList<DisplayName> getNames();

	/**
	 * Returns the value of the '<em><b>Groups</b></em>' containment reference list.
	 * The list contents are of type {@link de.ubt.ai1.supermod.mm.feature.FeatureGroup}.
	 * It is bidirectional and its opposite is '{@link de.ubt.ai1.supermod.mm.feature.FeatureGroup#getParentFeature <em>Parent Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * A set of contained feature groups, which disjointly refer to children
	 * features of this feature, in order to impose additional constraints.
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Groups</em>' containment reference list.
	 * @see de.ubt.ai1.supermod.mm.feature.SuperModFeaturePackage#getFeature_Groups()
	 * @see de.ubt.ai1.supermod.mm.feature.FeatureGroup#getParentFeature
	 * @model opposite="parentFeature" containment="true"
	 * @generated
	 */
	EList<FeatureGroup> getGroups();

	/**
	 * Returns the value of the '<em><b>Incoming Dependencies</b></em>' reference list.
	 * The list contents are of type {@link de.ubt.ai1.supermod.mm.feature.FeatureDependency}.
	 * It is bidirectional and its opposite is '{@link de.ubt.ai1.supermod.mm.feature.FeatureDependency#getTargetFeature <em>Target Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * A list of feature dependencies which refer to this feature as the target.
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming Dependencies</em>' reference list.
	 * @see de.ubt.ai1.supermod.mm.feature.SuperModFeaturePackage#getFeature_IncomingDependencies()
	 * @see de.ubt.ai1.supermod.mm.feature.FeatureDependency#getTargetFeature
	 * @model opposite="targetFeature"
	 * @generated
	 */
	EList<FeatureDependency> getIncomingDependencies();

	/**
	 * Returns the value of the '<em><b>Outgoing Dependencies</b></em>' containment reference list.
	 * The list contents are of type {@link de.ubt.ai1.supermod.mm.feature.FeatureDependency}.
	 * It is bidirectional and its opposite is '{@link de.ubt.ai1.supermod.mm.feature.FeatureDependency#getSourceFeature <em>Source Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * A list of feature dependencies that emerge from this feature.
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing Dependencies</em>' containment reference list.
	 * @see de.ubt.ai1.supermod.mm.feature.SuperModFeaturePackage#getFeature_OutgoingDependencies()
	 * @see de.ubt.ai1.supermod.mm.feature.FeatureDependency#getSourceFeature
	 * @model opposite="sourceFeature" containment="true"
	 * @generated
	 */
	EList<FeatureDependency> getOutgoingDependencies();

	/**
	 * Returns the value of the '<em><b>Mandatory</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link de.ubt.ai1.supermod.mm.feature.Mandatory#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * The mandatory flag, which decides in which versions this feature is
	 * mandatory. Implemented as an additional product space element.
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mandatory</em>' containment reference.
	 * @see #setMandatory(Mandatory)
	 * @see de.ubt.ai1.supermod.mm.feature.SuperModFeaturePackage#getFeature_Mandatory()
	 * @see de.ubt.ai1.supermod.mm.feature.Mandatory#getFeature
	 * @model opposite="feature" containment="true"
	 * @generated
	 */
	Mandatory getMandatory();

	/**
	 * Sets the value of the '{@link de.ubt.ai1.supermod.mm.feature.Feature#getMandatory <em>Mandatory</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mandatory</em>' containment reference.
	 * @see #getMandatory()
	 * @generated
	 */
	void setMandatory(Mandatory value);

	/**
	 * Returns the value of the '<em><b>Eliminations</b></em>' containment reference list.
	 * The list contents are of type {@link de.ubt.ai1.supermod.mm.feature.Elimination}.
	 * It is bidirectional and its opposite is '{@link de.ubt.ai1.supermod.mm.feature.Elimination#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Eliminations</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Eliminations</em>' containment reference list.
	 * @see de.ubt.ai1.supermod.mm.feature.SuperModFeaturePackage#getFeature_Eliminations()
	 * @see de.ubt.ai1.supermod.mm.feature.Elimination#getFeature
	 * @model opposite="feature" containment="true" upper="2"
	 * @generated
	 */
	EList<Elimination> getEliminations();

	/**
	 * Returns the value of the '<em><b>Incoming Roots</b></em>' reference list.
	 * The list contents are of type {@link de.ubt.ai1.supermod.mm.feature.RootRelationship}.
	 * It is bidirectional and its opposite is '{@link de.ubt.ai1.supermod.mm.feature.RootRelationship#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming Roots</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming Roots</em>' reference list.
	 * @see de.ubt.ai1.supermod.mm.feature.SuperModFeaturePackage#getFeature_IncomingRoots()
	 * @see de.ubt.ai1.supermod.mm.feature.RootRelationship#getFeature
	 * @model opposite="feature"
	 * @generated
	 */
	EList<RootRelationship> getIncomingRoots();

	/**
	 * Returns the value of the '<em><b>All Child Features</b></em>' reference list.
	 * The list contents are of type {@link de.ubt.ai1.supermod.mm.feature.Feature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>All Child Features</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All Child Features</em>' reference list.
	 * @see de.ubt.ai1.supermod.mm.feature.SuperModFeaturePackage#getFeature_AllChildFeatures()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<Feature> getAllChildFeatures();

	/**
	 * Returns the value of the '<em><b>Transitive Elimination State</b></em>' attribute.
	 * The literals are from the enumeration {@link de.ubt.ai1.supermod.mm.core.Tristate}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transitive Elimination State</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transitive Elimination State</em>' attribute.
	 * @see de.ubt.ai1.supermod.mm.core.Tristate
	 * @see de.ubt.ai1.supermod.mm.feature.SuperModFeaturePackage#getFeature_TransitiveEliminationState()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	Tristate getTransitiveEliminationState();

	/**
	 * Returns the value of the '<em><b>Grouped By</b></em>' reference list.
	 * The list contents are of type {@link de.ubt.ai1.supermod.mm.feature.GroupMembership}.
	 * It is bidirectional and its opposite is '{@link de.ubt.ai1.supermod.mm.feature.GroupMembership#getGroupedFeature <em>Grouped Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * A list of feature groups where this feature occurs. In single-version
	 * representation, only one group is permitted.
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grouped By</em>' reference list.
	 * @see de.ubt.ai1.supermod.mm.feature.SuperModFeaturePackage#getFeature_GroupedBy()
	 * @see de.ubt.ai1.supermod.mm.feature.GroupMembership#getGroupedFeature
	 * @model opposite="groupedFeature"
	 * @generated
	 */
	EList<GroupMembership> getGroupedBy();

	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference list.
	 * The list contents are of type {@link de.ubt.ai1.supermod.mm.feature.ChildRelationship}.
	 * It is bidirectional and its opposite is '{@link de.ubt.ai1.supermod.mm.feature.ChildRelationship#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * A list of child relationships which describe children of this feature. Due
	 * to <em>container variability</em>, only the relationships are connected by
	 * containment, but not the features they refer to.
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see de.ubt.ai1.supermod.mm.feature.SuperModFeaturePackage#getFeature_Children()
	 * @see de.ubt.ai1.supermod.mm.feature.ChildRelationship#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<ChildRelationship> getChildren();

	/**
	 * Returns the value of the '<em><b>Parents</b></em>' reference list.
	 * The list contents are of type {@link de.ubt.ai1.supermod.mm.feature.ChildRelationship}.
	 * It is bidirectional and its opposite is '{@link de.ubt.ai1.supermod.mm.feature.ChildRelationship#getChild <em>Child</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * A list of child relationships that refer to this feature as the parent
	 * feature.
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parents</em>' reference list.
	 * @see de.ubt.ai1.supermod.mm.feature.SuperModFeaturePackage#getFeature_Parents()
	 * @see de.ubt.ai1.supermod.mm.feature.ChildRelationship#getChild
	 * @model opposite="child"
	 * @generated
	 */
	EList<ChildRelationship> getParents();

} // Feature
