/**
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package de.ubt.ai1.supermod.mm.feature;

import de.ubt.ai1.supermod.mm.core.HybridElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Group Membership</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai1.supermod.mm.feature.GroupMembership#getGroupedFeature <em>Grouped Feature</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.feature.GroupMembership#getGroup <em>Group</em>}</li>
 * </ul>
 *
 * @see de.ubt.ai1.supermod.mm.feature.SuperModFeaturePackage#getGroupMembership()
 * @model
 * @generated
 */
public interface GroupMembership extends HybridElement {
	/**
	 * Returns the value of the '<em><b>Grouped Feature</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link de.ubt.ai1.supermod.mm.feature.Feature#getGroupedBy <em>Grouped By</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Grouped Feature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grouped Feature</em>' reference.
	 * @see #setGroupedFeature(Feature)
	 * @see de.ubt.ai1.supermod.mm.feature.SuperModFeaturePackage#getGroupMembership_GroupedFeature()
	 * @see de.ubt.ai1.supermod.mm.feature.Feature#getGroupedBy
	 * @model opposite="groupedBy"
	 * @generated
	 */
	Feature getGroupedFeature();

	/**
	 * Sets the value of the '{@link de.ubt.ai1.supermod.mm.feature.GroupMembership#getGroupedFeature <em>Grouped Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grouped Feature</em>' reference.
	 * @see #getGroupedFeature()
	 * @generated
	 */
	void setGroupedFeature(Feature value);

	/**
	 * Returns the value of the '<em><b>Group</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.ubt.ai1.supermod.mm.feature.FeatureGroup#getGroupedFeatures <em>Grouped Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' container reference.
	 * @see #setGroup(FeatureGroup)
	 * @see de.ubt.ai1.supermod.mm.feature.SuperModFeaturePackage#getGroupMembership_Group()
	 * @see de.ubt.ai1.supermod.mm.feature.FeatureGroup#getGroupedFeatures
	 * @model opposite="groupedFeatures" transient="false"
	 * @generated
	 */
	FeatureGroup getGroup();

	/**
	 * Sets the value of the '{@link de.ubt.ai1.supermod.mm.feature.GroupMembership#getGroup <em>Group</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group</em>' container reference.
	 * @see #getGroup()
	 * @generated
	 */
	void setGroup(FeatureGroup value);

} // GroupMembership
