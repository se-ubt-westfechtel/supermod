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
import de.ubt.ai1.supermod.mm.core.Invariant;
import de.ubt.ai1.supermod.mm.core.UUIDElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature Group</b></em>'.
 * A feature group organizes a sub-set of features, which are contained by the
 * group parent. There are several sub-types of groups, each expressing a
 * specific semantics. Each feature may only occur in at most one group.
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
 *   <li>{@link de.ubt.ai1.supermod.mm.feature.FeatureGroup#getGroupedFeatures <em>Grouped Features</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.feature.FeatureGroup#getGroupInvariant <em>Group Invariant</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.feature.FeatureGroup#getParentFeature <em>Parent Feature</em>}</li>
 * </ul>
 *
 * @see de.ubt.ai1.supermod.mm.feature.SuperModFeaturePackage#getFeatureGroup()
 * @model abstract="true"
 * @generated
 */
public interface FeatureGroup extends HybridElement, UUIDElement {
	/**
	 * Returns the value of the '<em><b>Grouped Features</b></em>' containment reference list.
	 * The list contents are of type {@link de.ubt.ai1.supermod.mm.feature.GroupMembership}.
	 * It is bidirectional and its opposite is '{@link de.ubt.ai1.supermod.mm.feature.GroupMembership#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * The features part of this group.
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grouped Features</em>' containment reference list.
	 * @see de.ubt.ai1.supermod.mm.feature.SuperModFeaturePackage#getFeatureGroup_GroupedFeatures()
	 * @see de.ubt.ai1.supermod.mm.feature.GroupMembership#getGroup
	 * @model opposite="group" containment="true"
	 * @generated
	 */
	EList<GroupMembership> getGroupedFeatures();

	/**
	 * Returns the value of the '<em><b>Group Invariant</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * A low-level invariant realizing the specific semantics of this group.
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group Invariant</em>' containment reference.
	 * @see #setGroupInvariant(Invariant)
	 * @see de.ubt.ai1.supermod.mm.feature.SuperModFeaturePackage#getFeatureGroup_GroupInvariant()
	 * @model containment="true"
	 * @generated
	 */
	Invariant getGroupInvariant();

	/**
	 * Sets the value of the '{@link de.ubt.ai1.supermod.mm.feature.FeatureGroup#getGroupInvariant <em>Group Invariant</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group Invariant</em>' containment reference.
	 * @see #getGroupInvariant()
	 * @generated
	 */
	void setGroupInvariant(Invariant value);

	/**
	 * Returns the value of the '<em><b>Parent Feature</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.ubt.ai1.supermod.mm.feature.Feature#getGroups <em>Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * The parent feature that contains this group. It must also be connected by
	 * a child relationship to all features which are part of this group.
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Feature</em>' container reference.
	 * @see #setParentFeature(Feature)
	 * @see de.ubt.ai1.supermod.mm.feature.SuperModFeaturePackage#getFeatureGroup_ParentFeature()
	 * @see de.ubt.ai1.supermod.mm.feature.Feature#getGroups
	 * @model opposite="groups" transient="false"
	 * @generated
	 */
	Feature getParentFeature();

	/**
	 * Sets the value of the '{@link de.ubt.ai1.supermod.mm.feature.FeatureGroup#getParentFeature <em>Parent Feature</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Feature</em>' container reference.
	 * @see #getParentFeature()
	 * @generated
	 */
	void setParentFeature(Feature value);

} // FeatureGroup
