/******************************************************************************
 * Copyright (c) 2018 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.mm.feature.client;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import de.ubt.ai1.supermod.mm.client.SuperModClientPackage;
import org.eclipse.emf.ecore.EAttribute;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>,
 * 			Johannes Schroepfer <Johannes.M.Schroepfer(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	2018-01-09
 * <!-- end-user-doc -->
 * @see de.ubt.ai1.supermod.mm.feature.client.SuperModFeatureClientFactory
 * @model kind="package"
 * @generated
 */
public interface SuperModFeatureClientPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "client";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://ai1.uni-bayreuth.de/supermod/feature/client/0.1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "de.ubt.ai1.supermod.mm.feature.client";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SuperModFeatureClientPackage eINSTANCE = de.ubt.ai1.supermod.mm.feature.client.impl.SuperModFeatureClientPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.ubt.ai1.supermod.mm.feature.client.impl.SingleVersionFeatureModelDescriptorImpl <em>Single Version Feature Model Descriptor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai1.supermod.mm.feature.client.impl.SingleVersionFeatureModelDescriptorImpl
	 * @see de.ubt.ai1.supermod.mm.feature.client.impl.SuperModFeatureClientPackageImpl#getSingleVersionFeatureModelDescriptor()
	 * @generated
	 */
	int SINGLE_VERSION_FEATURE_MODEL_DESCRIPTOR = 11;

	/**
	 * The meta object id for the '{@link de.ubt.ai1.supermod.mm.feature.client.impl.RootFeatureConflictImpl <em>Root Feature Conflict</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai1.supermod.mm.feature.client.impl.RootFeatureConflictImpl
	 * @see de.ubt.ai1.supermod.mm.feature.client.impl.SuperModFeatureClientPackageImpl#getRootFeatureConflict()
	 * @generated
	 */
	int ROOT_FEATURE_CONFLICT = 0;

	/**
	 * The feature id for the '<em><b>Affected Product Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_FEATURE_CONFLICT__AFFECTED_PRODUCT_SPACE_ELEMENTS = SuperModClientPackage.PRODUCT_CONFLICT__AFFECTED_PRODUCT_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_FEATURE_CONFLICT__SEVERITY = SuperModClientPackage.PRODUCT_CONFLICT__SEVERITY;

	/**
	 * The feature id for the '<em><b>Context Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_FEATURE_CONFLICT__CONTEXT_MODEL = SuperModClientPackage.PRODUCT_CONFLICT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Root Feature Conflict</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_FEATURE_CONFLICT_FEATURE_COUNT = SuperModClientPackage.PRODUCT_CONFLICT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Root Feature Conflict</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_FEATURE_CONFLICT_OPERATION_COUNT = SuperModClientPackage.PRODUCT_CONFLICT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.ubt.ai1.supermod.mm.feature.client.impl.ParentFeatureConflictImpl <em>Parent Feature Conflict</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai1.supermod.mm.feature.client.impl.ParentFeatureConflictImpl
	 * @see de.ubt.ai1.supermod.mm.feature.client.impl.SuperModFeatureClientPackageImpl#getParentFeatureConflict()
	 * @generated
	 */
	int PARENT_FEATURE_CONFLICT = 1;

	/**
	 * The feature id for the '<em><b>Affected Product Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARENT_FEATURE_CONFLICT__AFFECTED_PRODUCT_SPACE_ELEMENTS = SuperModClientPackage.PRODUCT_CONFLICT__AFFECTED_PRODUCT_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARENT_FEATURE_CONFLICT__SEVERITY = SuperModClientPackage.PRODUCT_CONFLICT__SEVERITY;

	/**
	 * The feature id for the '<em><b>Context Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARENT_FEATURE_CONFLICT__CONTEXT_FEATURE = SuperModClientPackage.PRODUCT_CONFLICT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Parent Feature Conflict</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARENT_FEATURE_CONFLICT_FEATURE_COUNT = SuperModClientPackage.PRODUCT_CONFLICT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Parent Feature Conflict</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARENT_FEATURE_CONFLICT_OPERATION_COUNT = SuperModClientPackage.PRODUCT_CONFLICT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.ubt.ai1.supermod.mm.feature.client.impl.CyclicFeatureTreeConflictImpl <em>Cyclic Feature Tree Conflict</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai1.supermod.mm.feature.client.impl.CyclicFeatureTreeConflictImpl
	 * @see de.ubt.ai1.supermod.mm.feature.client.impl.SuperModFeatureClientPackageImpl#getCyclicFeatureTreeConflict()
	 * @generated
	 */
	int CYCLIC_FEATURE_TREE_CONFLICT = 2;

	/**
	 * The feature id for the '<em><b>Affected Product Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYCLIC_FEATURE_TREE_CONFLICT__AFFECTED_PRODUCT_SPACE_ELEMENTS = SuperModClientPackage.PRODUCT_CONFLICT__AFFECTED_PRODUCT_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYCLIC_FEATURE_TREE_CONFLICT__SEVERITY = SuperModClientPackage.PRODUCT_CONFLICT__SEVERITY;

	/**
	 * The feature id for the '<em><b>Affected Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYCLIC_FEATURE_TREE_CONFLICT__AFFECTED_FEATURES = SuperModClientPackage.PRODUCT_CONFLICT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Cyclic Feature Tree Conflict</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYCLIC_FEATURE_TREE_CONFLICT_FEATURE_COUNT = SuperModClientPackage.PRODUCT_CONFLICT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Cyclic Feature Tree Conflict</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYCLIC_FEATURE_TREE_CONFLICT_OPERATION_COUNT = SuperModClientPackage.PRODUCT_CONFLICT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.ubt.ai1.supermod.mm.feature.client.impl.NonOptionalGroupedFeatureConflictImpl <em>Non Optional Grouped Feature Conflict</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai1.supermod.mm.feature.client.impl.NonOptionalGroupedFeatureConflictImpl
	 * @see de.ubt.ai1.supermod.mm.feature.client.impl.SuperModFeatureClientPackageImpl#getNonOptionalGroupedFeatureConflict()
	 * @generated
	 */
	int NON_OPTIONAL_GROUPED_FEATURE_CONFLICT = 6;

	/**
	 * The meta object id for the '{@link de.ubt.ai1.supermod.mm.feature.client.impl.DisplayNameConflictImpl <em>Display Name Conflict</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai1.supermod.mm.feature.client.impl.DisplayNameConflictImpl
	 * @see de.ubt.ai1.supermod.mm.feature.client.impl.SuperModFeatureClientPackageImpl#getDisplayNameConflict()
	 * @generated
	 */
	int DISPLAY_NAME_CONFLICT = 3;

	/**
	 * The feature id for the '<em><b>Affected Product Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_NAME_CONFLICT__AFFECTED_PRODUCT_SPACE_ELEMENTS = SuperModClientPackage.PRODUCT_CONFLICT__AFFECTED_PRODUCT_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_NAME_CONFLICT__SEVERITY = SuperModClientPackage.PRODUCT_CONFLICT__SEVERITY;

	/**
	 * The feature id for the '<em><b>Context Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_NAME_CONFLICT__CONTEXT_FEATURE = SuperModClientPackage.PRODUCT_CONFLICT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Display Name Conflict</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_NAME_CONFLICT_FEATURE_COUNT = SuperModClientPackage.PRODUCT_CONFLICT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Display Name Conflict</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_NAME_CONFLICT_OPERATION_COUNT = SuperModClientPackage.PRODUCT_CONFLICT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.ubt.ai1.supermod.mm.feature.client.impl.MultipleGroupMembershipConflictImpl <em>Multiple Group Membership Conflict</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai1.supermod.mm.feature.client.impl.MultipleGroupMembershipConflictImpl
	 * @see de.ubt.ai1.supermod.mm.feature.client.impl.SuperModFeatureClientPackageImpl#getMultipleGroupMembershipConflict()
	 * @generated
	 */
	int MULTIPLE_GROUP_MEMBERSHIP_CONFLICT = 4;

	/**
	 * The feature id for the '<em><b>Affected Product Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_GROUP_MEMBERSHIP_CONFLICT__AFFECTED_PRODUCT_SPACE_ELEMENTS = SuperModClientPackage.PRODUCT_CONFLICT__AFFECTED_PRODUCT_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_GROUP_MEMBERSHIP_CONFLICT__SEVERITY = SuperModClientPackage.PRODUCT_CONFLICT__SEVERITY;

	/**
	 * The feature id for the '<em><b>Context Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_GROUP_MEMBERSHIP_CONFLICT__CONTEXT_FEATURE = SuperModClientPackage.PRODUCT_CONFLICT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Multiple Group Membership Conflict</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_GROUP_MEMBERSHIP_CONFLICT_FEATURE_COUNT = SuperModClientPackage.PRODUCT_CONFLICT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Multiple Group Membership Conflict</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_GROUP_MEMBERSHIP_CONFLICT_OPERATION_COUNT = SuperModClientPackage.PRODUCT_CONFLICT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.ubt.ai1.supermod.mm.feature.client.impl.RemoteGroupMembershipConflictImpl <em>Remote Group Membership Conflict</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai1.supermod.mm.feature.client.impl.RemoteGroupMembershipConflictImpl
	 * @see de.ubt.ai1.supermod.mm.feature.client.impl.SuperModFeatureClientPackageImpl#getRemoteGroupMembershipConflict()
	 * @generated
	 */
	int REMOTE_GROUP_MEMBERSHIP_CONFLICT = 5;

	/**
	 * The feature id for the '<em><b>Affected Product Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_GROUP_MEMBERSHIP_CONFLICT__AFFECTED_PRODUCT_SPACE_ELEMENTS = SuperModClientPackage.PRODUCT_CONFLICT__AFFECTED_PRODUCT_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_GROUP_MEMBERSHIP_CONFLICT__SEVERITY = SuperModClientPackage.PRODUCT_CONFLICT__SEVERITY;

	/**
	 * The feature id for the '<em><b>Context Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_GROUP_MEMBERSHIP_CONFLICT__CONTEXT_FEATURE = SuperModClientPackage.PRODUCT_CONFLICT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Remote Group Membership Conflict</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_GROUP_MEMBERSHIP_CONFLICT_FEATURE_COUNT = SuperModClientPackage.PRODUCT_CONFLICT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Remote Group Membership Conflict</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_GROUP_MEMBERSHIP_CONFLICT_OPERATION_COUNT = SuperModClientPackage.PRODUCT_CONFLICT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Affected Product Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_OPTIONAL_GROUPED_FEATURE_CONFLICT__AFFECTED_PRODUCT_SPACE_ELEMENTS = SuperModClientPackage.PRODUCT_CONFLICT__AFFECTED_PRODUCT_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_OPTIONAL_GROUPED_FEATURE_CONFLICT__SEVERITY = SuperModClientPackage.PRODUCT_CONFLICT__SEVERITY;

	/**
	 * The feature id for the '<em><b>Context Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_OPTIONAL_GROUPED_FEATURE_CONFLICT__CONTEXT_FEATURE = SuperModClientPackage.PRODUCT_CONFLICT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Non Optional Grouped Feature Conflict</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_OPTIONAL_GROUPED_FEATURE_CONFLICT_FEATURE_COUNT = SuperModClientPackage.PRODUCT_CONFLICT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Non Optional Grouped Feature Conflict</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_OPTIONAL_GROUPED_FEATURE_CONFLICT_OPERATION_COUNT = SuperModClientPackage.PRODUCT_CONFLICT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.ubt.ai1.supermod.mm.feature.client.impl.DependencyLinkTargetConflictImpl <em>Dependency Link Target Conflict</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai1.supermod.mm.feature.client.impl.DependencyLinkTargetConflictImpl
	 * @see de.ubt.ai1.supermod.mm.feature.client.impl.SuperModFeatureClientPackageImpl#getDependencyLinkTargetConflict()
	 * @generated
	 */
	int DEPENDENCY_LINK_TARGET_CONFLICT = 7;

	/**
	 * The feature id for the '<em><b>Affected Product Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_LINK_TARGET_CONFLICT__AFFECTED_PRODUCT_SPACE_ELEMENTS = SuperModClientPackage.PRODUCT_CONFLICT__AFFECTED_PRODUCT_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_LINK_TARGET_CONFLICT__SEVERITY = SuperModClientPackage.PRODUCT_CONFLICT__SEVERITY;

	/**
	 * The feature id for the '<em><b>Context Dependency</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_LINK_TARGET_CONFLICT__CONTEXT_DEPENDENCY = SuperModClientPackage.PRODUCT_CONFLICT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Dependency Link Target Conflict</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_LINK_TARGET_CONFLICT_FEATURE_COUNT = SuperModClientPackage.PRODUCT_CONFLICT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Dependency Link Target Conflict</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_LINK_TARGET_CONFLICT_OPERATION_COUNT = SuperModClientPackage.PRODUCT_CONFLICT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.ubt.ai1.supermod.mm.feature.client.impl.DanglingFeatureConflictImpl <em>Dangling Feature Conflict</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai1.supermod.mm.feature.client.impl.DanglingFeatureConflictImpl
	 * @see de.ubt.ai1.supermod.mm.feature.client.impl.SuperModFeatureClientPackageImpl#getDanglingFeatureConflict()
	 * @generated
	 */
	int DANGLING_FEATURE_CONFLICT = 8;

	/**
	 * The feature id for the '<em><b>Affected Product Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DANGLING_FEATURE_CONFLICT__AFFECTED_PRODUCT_SPACE_ELEMENTS = SuperModClientPackage.PRODUCT_CONFLICT__AFFECTED_PRODUCT_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DANGLING_FEATURE_CONFLICT__SEVERITY = SuperModClientPackage.PRODUCT_CONFLICT__SEVERITY;

	/**
	 * The feature id for the '<em><b>Context Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DANGLING_FEATURE_CONFLICT__CONTEXT_FEATURE = SuperModClientPackage.PRODUCT_CONFLICT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Dangling Feature Conflict</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DANGLING_FEATURE_CONFLICT_FEATURE_COUNT = SuperModClientPackage.PRODUCT_CONFLICT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Dangling Feature Conflict</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DANGLING_FEATURE_CONFLICT_OPERATION_COUNT = SuperModClientPackage.PRODUCT_CONFLICT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.ubt.ai1.supermod.mm.feature.client.impl.DanglingGroupConflictImpl <em>Dangling Group Conflict</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai1.supermod.mm.feature.client.impl.DanglingGroupConflictImpl
	 * @see de.ubt.ai1.supermod.mm.feature.client.impl.SuperModFeatureClientPackageImpl#getDanglingGroupConflict()
	 * @generated
	 */
	int DANGLING_GROUP_CONFLICT = 9;

	/**
	 * The feature id for the '<em><b>Affected Product Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DANGLING_GROUP_CONFLICT__AFFECTED_PRODUCT_SPACE_ELEMENTS = SuperModClientPackage.PRODUCT_CONFLICT__AFFECTED_PRODUCT_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DANGLING_GROUP_CONFLICT__SEVERITY = SuperModClientPackage.PRODUCT_CONFLICT__SEVERITY;

	/**
	 * The feature id for the '<em><b>Context Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DANGLING_GROUP_CONFLICT__CONTEXT_GROUP = SuperModClientPackage.PRODUCT_CONFLICT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Dangling Group Conflict</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DANGLING_GROUP_CONFLICT_FEATURE_COUNT = SuperModClientPackage.PRODUCT_CONFLICT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Dangling Group Conflict</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DANGLING_GROUP_CONFLICT_OPERATION_COUNT = SuperModClientPackage.PRODUCT_CONFLICT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.ubt.ai1.supermod.mm.feature.client.impl.DanglingDependencyConflictImpl <em>Dangling Dependency Conflict</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai1.supermod.mm.feature.client.impl.DanglingDependencyConflictImpl
	 * @see de.ubt.ai1.supermod.mm.feature.client.impl.SuperModFeatureClientPackageImpl#getDanglingDependencyConflict()
	 * @generated
	 */
	int DANGLING_DEPENDENCY_CONFLICT = 10;

	/**
	 * The feature id for the '<em><b>Affected Product Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DANGLING_DEPENDENCY_CONFLICT__AFFECTED_PRODUCT_SPACE_ELEMENTS = SuperModClientPackage.PRODUCT_CONFLICT__AFFECTED_PRODUCT_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DANGLING_DEPENDENCY_CONFLICT__SEVERITY = SuperModClientPackage.PRODUCT_CONFLICT__SEVERITY;

	/**
	 * The feature id for the '<em><b>Context Dependency</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DANGLING_DEPENDENCY_CONFLICT__CONTEXT_DEPENDENCY = SuperModClientPackage.PRODUCT_CONFLICT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Dangling Dependency Conflict</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DANGLING_DEPENDENCY_CONFLICT_FEATURE_COUNT = SuperModClientPackage.PRODUCT_CONFLICT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Dangling Dependency Conflict</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DANGLING_DEPENDENCY_CONFLICT_OPERATION_COUNT = SuperModClientPackage.PRODUCT_CONFLICT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dimension Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_VERSION_FEATURE_MODEL_DESCRIPTOR__DIMENSION_NAME = SuperModClientPackage.SINGLE_VERSION_PRODUCT_DIMENSION_DESCRIPTOR__DIMENSION_NAME;

	/**
	 * The feature id for the '<em><b>Feature Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_VERSION_FEATURE_MODEL_DESCRIPTOR__FEATURE_MODEL = SuperModClientPackage.SINGLE_VERSION_PRODUCT_DIMENSION_DESCRIPTOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_VERSION_FEATURE_MODEL_DESCRIPTOR__MODIFIED = SuperModClientPackage.SINGLE_VERSION_PRODUCT_DIMENSION_DESCRIPTOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Single Version Feature Model Descriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_VERSION_FEATURE_MODEL_DESCRIPTOR_FEATURE_COUNT = SuperModClientPackage.SINGLE_VERSION_PRODUCT_DIMENSION_DESCRIPTOR_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Is Modified</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_VERSION_FEATURE_MODEL_DESCRIPTOR___IS_MODIFIED = SuperModClientPackage.SINGLE_VERSION_PRODUCT_DIMENSION_DESCRIPTOR___IS_MODIFIED;

	/**
	 * The operation id for the '<em>Set Modified</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_VERSION_FEATURE_MODEL_DESCRIPTOR___SET_MODIFIED__BOOLEAN = SuperModClientPackage.SINGLE_VERSION_PRODUCT_DIMENSION_DESCRIPTOR___SET_MODIFIED__BOOLEAN;

	/**
	 * The number of operations of the '<em>Single Version Feature Model Descriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_VERSION_FEATURE_MODEL_DESCRIPTOR_OPERATION_COUNT = SuperModClientPackage.SINGLE_VERSION_PRODUCT_DIMENSION_DESCRIPTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.ubt.ai1.supermod.mm.feature.client.impl.FeatureConfigurationImpl <em>Feature Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai1.supermod.mm.feature.client.impl.FeatureConfigurationImpl
	 * @see de.ubt.ai1.supermod.mm.feature.client.impl.SuperModFeatureClientPackageImpl#getFeatureConfiguration()
	 * @generated
	 */
	int FEATURE_CONFIGURATION = 12;

	/**
	 * The feature id for the '<em><b>Feature Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONFIGURATION__FEATURE_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Option Binding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONFIGURATION__OPTION_BINDING = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONFIGURATION__NAME = 2;

	/**
	 * The number of structural features of the '<em>Feature Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONFIGURATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Feature Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONFIGURATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.ubt.ai1.supermod.mm.feature.client.impl.FeatureModelExportTraceImpl <em>Feature Model Export Trace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai1.supermod.mm.feature.client.impl.FeatureModelExportTraceImpl
	 * @see de.ubt.ai1.supermod.mm.feature.client.impl.SuperModFeatureClientPackageImpl#getFeatureModelExportTrace()
	 * @generated
	 */
	int FEATURE_MODEL_EXPORT_TRACE = 13;

	/**
	 * The feature id for the '<em><b>Product Dimension</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_MODEL_EXPORT_TRACE__PRODUCT_DIMENSION = SuperModClientPackage.PRODUCT_DIMENSION_EXPORT_TRACE__PRODUCT_DIMENSION;

	/**
	 * The feature id for the '<em><b>Feature To Feature Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_MODEL_EXPORT_TRACE__FEATURE_TO_FEATURE_MAP = SuperModClientPackage.PRODUCT_DIMENSION_EXPORT_TRACE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Feature Model Export Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_MODEL_EXPORT_TRACE_FEATURE_COUNT = SuperModClientPackage.PRODUCT_DIMENSION_EXPORT_TRACE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Feature Model Export Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_MODEL_EXPORT_TRACE_OPERATION_COUNT = SuperModClientPackage.PRODUCT_DIMENSION_EXPORT_TRACE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.ubt.ai1.supermod.mm.feature.client.impl.FeatureToFeatureMapEntryImpl <em>Feature To Feature Map Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai1.supermod.mm.feature.client.impl.FeatureToFeatureMapEntryImpl
	 * @see de.ubt.ai1.supermod.mm.feature.client.impl.SuperModFeatureClientPackageImpl#getFeatureToFeatureMapEntry()
	 * @generated
	 */
	int FEATURE_TO_FEATURE_MAP_ENTRY = 14;

	/**
	 * The feature id for the '<em><b>Key</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_TO_FEATURE_MAP_ENTRY__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_TO_FEATURE_MAP_ENTRY__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Feature To Feature Map Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_TO_FEATURE_MAP_ENTRY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Feature To Feature Map Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_TO_FEATURE_MAP_ENTRY_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link de.ubt.ai1.supermod.mm.feature.client.SingleVersionFeatureModelDescriptor <em>Single Version Feature Model Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Single Version Feature Model Descriptor</em>'.
	 * @see de.ubt.ai1.supermod.mm.feature.client.SingleVersionFeatureModelDescriptor
	 * @generated
	 */
	EClass getSingleVersionFeatureModelDescriptor();

	/**
	 * Returns the meta object for the containment reference '{@link de.ubt.ai1.supermod.mm.feature.client.SingleVersionFeatureModelDescriptor#getFeatureModel <em>Feature Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Feature Model</em>'.
	 * @see de.ubt.ai1.supermod.mm.feature.client.SingleVersionFeatureModelDescriptor#getFeatureModel()
	 * @see #getSingleVersionFeatureModelDescriptor()
	 * @generated
	 */
	EReference getSingleVersionFeatureModelDescriptor_FeatureModel();

	/**
	 * Returns the meta object for the attribute '{@link de.ubt.ai1.supermod.mm.feature.client.SingleVersionFeatureModelDescriptor#isModified <em>Modified</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modified</em>'.
	 * @see de.ubt.ai1.supermod.mm.feature.client.SingleVersionFeatureModelDescriptor#isModified()
	 * @see #getSingleVersionFeatureModelDescriptor()
	 * @generated
	 */
	EAttribute getSingleVersionFeatureModelDescriptor_Modified();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai1.supermod.mm.feature.client.RootFeatureConflict <em>Root Feature Conflict</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root Feature Conflict</em>'.
	 * @see de.ubt.ai1.supermod.mm.feature.client.RootFeatureConflict
	 * @generated
	 */
	EClass getRootFeatureConflict();

	/**
	 * Returns the meta object for the reference '{@link de.ubt.ai1.supermod.mm.feature.client.RootFeatureConflict#getContextModel <em>Context Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Context Model</em>'.
	 * @see de.ubt.ai1.supermod.mm.feature.client.RootFeatureConflict#getContextModel()
	 * @see #getRootFeatureConflict()
	 * @generated
	 */
	EReference getRootFeatureConflict_ContextModel();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai1.supermod.mm.feature.client.ParentFeatureConflict <em>Parent Feature Conflict</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parent Feature Conflict</em>'.
	 * @see de.ubt.ai1.supermod.mm.feature.client.ParentFeatureConflict
	 * @generated
	 */
	EClass getParentFeatureConflict();

	/**
	 * Returns the meta object for the reference '{@link de.ubt.ai1.supermod.mm.feature.client.ParentFeatureConflict#getContextFeature <em>Context Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Context Feature</em>'.
	 * @see de.ubt.ai1.supermod.mm.feature.client.ParentFeatureConflict#getContextFeature()
	 * @see #getParentFeatureConflict()
	 * @generated
	 */
	EReference getParentFeatureConflict_ContextFeature();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai1.supermod.mm.feature.client.CyclicFeatureTreeConflict <em>Cyclic Feature Tree Conflict</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cyclic Feature Tree Conflict</em>'.
	 * @see de.ubt.ai1.supermod.mm.feature.client.CyclicFeatureTreeConflict
	 * @generated
	 */
	EClass getCyclicFeatureTreeConflict();

	/**
	 * Returns the meta object for the reference list '{@link de.ubt.ai1.supermod.mm.feature.client.CyclicFeatureTreeConflict#getAffectedFeatures <em>Affected Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Affected Features</em>'.
	 * @see de.ubt.ai1.supermod.mm.feature.client.CyclicFeatureTreeConflict#getAffectedFeatures()
	 * @see #getCyclicFeatureTreeConflict()
	 * @generated
	 */
	EReference getCyclicFeatureTreeConflict_AffectedFeatures();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai1.supermod.mm.feature.client.NonOptionalGroupedFeatureConflict <em>Non Optional Grouped Feature Conflict</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Non Optional Grouped Feature Conflict</em>'.
	 * @see de.ubt.ai1.supermod.mm.feature.client.NonOptionalGroupedFeatureConflict
	 * @generated
	 */
	EClass getNonOptionalGroupedFeatureConflict();

	/**
	 * Returns the meta object for the reference '{@link de.ubt.ai1.supermod.mm.feature.client.NonOptionalGroupedFeatureConflict#getContextFeature <em>Context Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Context Feature</em>'.
	 * @see de.ubt.ai1.supermod.mm.feature.client.NonOptionalGroupedFeatureConflict#getContextFeature()
	 * @see #getNonOptionalGroupedFeatureConflict()
	 * @generated
	 */
	EReference getNonOptionalGroupedFeatureConflict_ContextFeature();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai1.supermod.mm.feature.client.DependencyLinkTargetConflict <em>Dependency Link Target Conflict</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dependency Link Target Conflict</em>'.
	 * @see de.ubt.ai1.supermod.mm.feature.client.DependencyLinkTargetConflict
	 * @generated
	 */
	EClass getDependencyLinkTargetConflict();

	/**
	 * Returns the meta object for the reference '{@link de.ubt.ai1.supermod.mm.feature.client.DependencyLinkTargetConflict#getContextDependency <em>Context Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Context Dependency</em>'.
	 * @see de.ubt.ai1.supermod.mm.feature.client.DependencyLinkTargetConflict#getContextDependency()
	 * @see #getDependencyLinkTargetConflict()
	 * @generated
	 */
	EReference getDependencyLinkTargetConflict_ContextDependency();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai1.supermod.mm.feature.client.DanglingFeatureConflict <em>Dangling Feature Conflict</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dangling Feature Conflict</em>'.
	 * @see de.ubt.ai1.supermod.mm.feature.client.DanglingFeatureConflict
	 * @generated
	 */
	EClass getDanglingFeatureConflict();

	/**
	 * Returns the meta object for the reference '{@link de.ubt.ai1.supermod.mm.feature.client.DanglingFeatureConflict#getContextFeature <em>Context Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Context Feature</em>'.
	 * @see de.ubt.ai1.supermod.mm.feature.client.DanglingFeatureConflict#getContextFeature()
	 * @see #getDanglingFeatureConflict()
	 * @generated
	 */
	EReference getDanglingFeatureConflict_ContextFeature();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai1.supermod.mm.feature.client.DanglingGroupConflict <em>Dangling Group Conflict</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dangling Group Conflict</em>'.
	 * @see de.ubt.ai1.supermod.mm.feature.client.DanglingGroupConflict
	 * @generated
	 */
	EClass getDanglingGroupConflict();

	/**
	 * Returns the meta object for the reference '{@link de.ubt.ai1.supermod.mm.feature.client.DanglingGroupConflict#getContextGroup <em>Context Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Context Group</em>'.
	 * @see de.ubt.ai1.supermod.mm.feature.client.DanglingGroupConflict#getContextGroup()
	 * @see #getDanglingGroupConflict()
	 * @generated
	 */
	EReference getDanglingGroupConflict_ContextGroup();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai1.supermod.mm.feature.client.DanglingDependencyConflict <em>Dangling Dependency Conflict</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dangling Dependency Conflict</em>'.
	 * @see de.ubt.ai1.supermod.mm.feature.client.DanglingDependencyConflict
	 * @generated
	 */
	EClass getDanglingDependencyConflict();

	/**
	 * Returns the meta object for the reference '{@link de.ubt.ai1.supermod.mm.feature.client.DanglingDependencyConflict#getContextDependency <em>Context Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Context Dependency</em>'.
	 * @see de.ubt.ai1.supermod.mm.feature.client.DanglingDependencyConflict#getContextDependency()
	 * @see #getDanglingDependencyConflict()
	 * @generated
	 */
	EReference getDanglingDependencyConflict_ContextDependency();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai1.supermod.mm.feature.client.DisplayNameConflict <em>Display Name Conflict</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Display Name Conflict</em>'.
	 * @see de.ubt.ai1.supermod.mm.feature.client.DisplayNameConflict
	 * @generated
	 */
	EClass getDisplayNameConflict();

	/**
	 * Returns the meta object for the reference '{@link de.ubt.ai1.supermod.mm.feature.client.DisplayNameConflict#getContextFeature <em>Context Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Context Feature</em>'.
	 * @see de.ubt.ai1.supermod.mm.feature.client.DisplayNameConflict#getContextFeature()
	 * @see #getDisplayNameConflict()
	 * @generated
	 */
	EReference getDisplayNameConflict_ContextFeature();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai1.supermod.mm.feature.client.MultipleGroupMembershipConflict <em>Multiple Group Membership Conflict</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multiple Group Membership Conflict</em>'.
	 * @see de.ubt.ai1.supermod.mm.feature.client.MultipleGroupMembershipConflict
	 * @generated
	 */
	EClass getMultipleGroupMembershipConflict();

	/**
	 * Returns the meta object for the reference '{@link de.ubt.ai1.supermod.mm.feature.client.MultipleGroupMembershipConflict#getContextFeature <em>Context Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Context Feature</em>'.
	 * @see de.ubt.ai1.supermod.mm.feature.client.MultipleGroupMembershipConflict#getContextFeature()
	 * @see #getMultipleGroupMembershipConflict()
	 * @generated
	 */
	EReference getMultipleGroupMembershipConflict_ContextFeature();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai1.supermod.mm.feature.client.RemoteGroupMembershipConflict <em>Remote Group Membership Conflict</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Remote Group Membership Conflict</em>'.
	 * @see de.ubt.ai1.supermod.mm.feature.client.RemoteGroupMembershipConflict
	 * @generated
	 */
	EClass getRemoteGroupMembershipConflict();

	/**
	 * Returns the meta object for the reference '{@link de.ubt.ai1.supermod.mm.feature.client.RemoteGroupMembershipConflict#getContextFeature <em>Context Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Context Feature</em>'.
	 * @see de.ubt.ai1.supermod.mm.feature.client.RemoteGroupMembershipConflict#getContextFeature()
	 * @see #getRemoteGroupMembershipConflict()
	 * @generated
	 */
	EReference getRemoteGroupMembershipConflict_ContextFeature();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai1.supermod.mm.feature.client.FeatureConfiguration <em>Feature Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Configuration</em>'.
	 * @see de.ubt.ai1.supermod.mm.feature.client.FeatureConfiguration
	 * @generated
	 */
	EClass getFeatureConfiguration();

	/**
	 * Returns the meta object for the reference '{@link de.ubt.ai1.supermod.mm.feature.client.FeatureConfiguration#getFeatureModel <em>Feature Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Feature Model</em>'.
	 * @see de.ubt.ai1.supermod.mm.feature.client.FeatureConfiguration#getFeatureModel()
	 * @see #getFeatureConfiguration()
	 * @generated
	 */
	EReference getFeatureConfiguration_FeatureModel();

	/**
	 * Returns the meta object for the containment reference '{@link de.ubt.ai1.supermod.mm.feature.client.FeatureConfiguration#getOptionBinding <em>Option Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Option Binding</em>'.
	 * @see de.ubt.ai1.supermod.mm.feature.client.FeatureConfiguration#getOptionBinding()
	 * @see #getFeatureConfiguration()
	 * @generated
	 */
	EReference getFeatureConfiguration_OptionBinding();

	/**
	 * Returns the meta object for the attribute '{@link de.ubt.ai1.supermod.mm.feature.client.FeatureConfiguration#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.ubt.ai1.supermod.mm.feature.client.FeatureConfiguration#getName()
	 * @see #getFeatureConfiguration()
	 * @generated
	 */
	EAttribute getFeatureConfiguration_Name();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai1.supermod.mm.feature.client.FeatureModelExportTrace <em>Feature Model Export Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Model Export Trace</em>'.
	 * @see de.ubt.ai1.supermod.mm.feature.client.FeatureModelExportTrace
	 * @generated
	 */
	EClass getFeatureModelExportTrace();

	/**
	 * Returns the meta object for the map '{@link de.ubt.ai1.supermod.mm.feature.client.FeatureModelExportTrace#getFeatureToFeatureMap <em>Feature To Feature Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Feature To Feature Map</em>'.
	 * @see de.ubt.ai1.supermod.mm.feature.client.FeatureModelExportTrace#getFeatureToFeatureMap()
	 * @see #getFeatureModelExportTrace()
	 * @generated
	 */
	EReference getFeatureModelExportTrace_FeatureToFeatureMap();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>Feature To Feature Map Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature To Feature Map Entry</em>'.
	 * @see java.util.Map.Entry
	 * @model keyType="de.ubt.ai1.supermod.mm.feature.Feature"
	 *        valueType="de.ubt.ai1.supermod.mm.feature.Feature"
	 * @generated
	 */
	EClass getFeatureToFeatureMapEntry();

	/**
	 * Returns the meta object for the reference '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getFeatureToFeatureMapEntry()
	 * @generated
	 */
	EReference getFeatureToFeatureMapEntry_Key();

	/**
	 * Returns the meta object for the reference '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getFeatureToFeatureMapEntry()
	 * @generated
	 */
	EReference getFeatureToFeatureMapEntry_Value();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SuperModFeatureClientFactory getSuperModFeatureClientFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link de.ubt.ai1.supermod.mm.feature.client.impl.SingleVersionFeatureModelDescriptorImpl <em>Single Version Feature Model Descriptor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai1.supermod.mm.feature.client.impl.SingleVersionFeatureModelDescriptorImpl
		 * @see de.ubt.ai1.supermod.mm.feature.client.impl.SuperModFeatureClientPackageImpl#getSingleVersionFeatureModelDescriptor()
		 * @generated
		 */
		EClass SINGLE_VERSION_FEATURE_MODEL_DESCRIPTOR = eINSTANCE.getSingleVersionFeatureModelDescriptor();

		/**
		 * The meta object literal for the '<em><b>Feature Model</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SINGLE_VERSION_FEATURE_MODEL_DESCRIPTOR__FEATURE_MODEL = eINSTANCE.getSingleVersionFeatureModelDescriptor_FeatureModel();

		/**
		 * The meta object literal for the '<em><b>Modified</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SINGLE_VERSION_FEATURE_MODEL_DESCRIPTOR__MODIFIED = eINSTANCE.getSingleVersionFeatureModelDescriptor_Modified();

		/**
		 * The meta object literal for the '{@link de.ubt.ai1.supermod.mm.feature.client.impl.RootFeatureConflictImpl <em>Root Feature Conflict</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai1.supermod.mm.feature.client.impl.RootFeatureConflictImpl
		 * @see de.ubt.ai1.supermod.mm.feature.client.impl.SuperModFeatureClientPackageImpl#getRootFeatureConflict()
		 * @generated
		 */
		EClass ROOT_FEATURE_CONFLICT = eINSTANCE.getRootFeatureConflict();

		/**
		 * The meta object literal for the '<em><b>Context Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT_FEATURE_CONFLICT__CONTEXT_MODEL = eINSTANCE.getRootFeatureConflict_ContextModel();

		/**
		 * The meta object literal for the '{@link de.ubt.ai1.supermod.mm.feature.client.impl.ParentFeatureConflictImpl <em>Parent Feature Conflict</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai1.supermod.mm.feature.client.impl.ParentFeatureConflictImpl
		 * @see de.ubt.ai1.supermod.mm.feature.client.impl.SuperModFeatureClientPackageImpl#getParentFeatureConflict()
		 * @generated
		 */
		EClass PARENT_FEATURE_CONFLICT = eINSTANCE.getParentFeatureConflict();

		/**
		 * The meta object literal for the '<em><b>Context Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARENT_FEATURE_CONFLICT__CONTEXT_FEATURE = eINSTANCE.getParentFeatureConflict_ContextFeature();

		/**
		 * The meta object literal for the '{@link de.ubt.ai1.supermod.mm.feature.client.impl.CyclicFeatureTreeConflictImpl <em>Cyclic Feature Tree Conflict</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai1.supermod.mm.feature.client.impl.CyclicFeatureTreeConflictImpl
		 * @see de.ubt.ai1.supermod.mm.feature.client.impl.SuperModFeatureClientPackageImpl#getCyclicFeatureTreeConflict()
		 * @generated
		 */
		EClass CYCLIC_FEATURE_TREE_CONFLICT = eINSTANCE.getCyclicFeatureTreeConflict();

		/**
		 * The meta object literal for the '<em><b>Affected Features</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CYCLIC_FEATURE_TREE_CONFLICT__AFFECTED_FEATURES = eINSTANCE.getCyclicFeatureTreeConflict_AffectedFeatures();

		/**
		 * The meta object literal for the '{@link de.ubt.ai1.supermod.mm.feature.client.impl.NonOptionalGroupedFeatureConflictImpl <em>Non Optional Grouped Feature Conflict</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai1.supermod.mm.feature.client.impl.NonOptionalGroupedFeatureConflictImpl
		 * @see de.ubt.ai1.supermod.mm.feature.client.impl.SuperModFeatureClientPackageImpl#getNonOptionalGroupedFeatureConflict()
		 * @generated
		 */
		EClass NON_OPTIONAL_GROUPED_FEATURE_CONFLICT = eINSTANCE.getNonOptionalGroupedFeatureConflict();

		/**
		 * The meta object literal for the '<em><b>Context Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NON_OPTIONAL_GROUPED_FEATURE_CONFLICT__CONTEXT_FEATURE = eINSTANCE.getNonOptionalGroupedFeatureConflict_ContextFeature();

		/**
		 * The meta object literal for the '{@link de.ubt.ai1.supermod.mm.feature.client.impl.DependencyLinkTargetConflictImpl <em>Dependency Link Target Conflict</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai1.supermod.mm.feature.client.impl.DependencyLinkTargetConflictImpl
		 * @see de.ubt.ai1.supermod.mm.feature.client.impl.SuperModFeatureClientPackageImpl#getDependencyLinkTargetConflict()
		 * @generated
		 */
		EClass DEPENDENCY_LINK_TARGET_CONFLICT = eINSTANCE.getDependencyLinkTargetConflict();

		/**
		 * The meta object literal for the '<em><b>Context Dependency</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPENDENCY_LINK_TARGET_CONFLICT__CONTEXT_DEPENDENCY = eINSTANCE.getDependencyLinkTargetConflict_ContextDependency();

		/**
		 * The meta object literal for the '{@link de.ubt.ai1.supermod.mm.feature.client.impl.DanglingFeatureConflictImpl <em>Dangling Feature Conflict</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai1.supermod.mm.feature.client.impl.DanglingFeatureConflictImpl
		 * @see de.ubt.ai1.supermod.mm.feature.client.impl.SuperModFeatureClientPackageImpl#getDanglingFeatureConflict()
		 * @generated
		 */
		EClass DANGLING_FEATURE_CONFLICT = eINSTANCE.getDanglingFeatureConflict();

		/**
		 * The meta object literal for the '<em><b>Context Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DANGLING_FEATURE_CONFLICT__CONTEXT_FEATURE = eINSTANCE.getDanglingFeatureConflict_ContextFeature();

		/**
		 * The meta object literal for the '{@link de.ubt.ai1.supermod.mm.feature.client.impl.DanglingGroupConflictImpl <em>Dangling Group Conflict</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai1.supermod.mm.feature.client.impl.DanglingGroupConflictImpl
		 * @see de.ubt.ai1.supermod.mm.feature.client.impl.SuperModFeatureClientPackageImpl#getDanglingGroupConflict()
		 * @generated
		 */
		EClass DANGLING_GROUP_CONFLICT = eINSTANCE.getDanglingGroupConflict();

		/**
		 * The meta object literal for the '<em><b>Context Group</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DANGLING_GROUP_CONFLICT__CONTEXT_GROUP = eINSTANCE.getDanglingGroupConflict_ContextGroup();

		/**
		 * The meta object literal for the '{@link de.ubt.ai1.supermod.mm.feature.client.impl.DanglingDependencyConflictImpl <em>Dangling Dependency Conflict</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai1.supermod.mm.feature.client.impl.DanglingDependencyConflictImpl
		 * @see de.ubt.ai1.supermod.mm.feature.client.impl.SuperModFeatureClientPackageImpl#getDanglingDependencyConflict()
		 * @generated
		 */
		EClass DANGLING_DEPENDENCY_CONFLICT = eINSTANCE.getDanglingDependencyConflict();

		/**
		 * The meta object literal for the '<em><b>Context Dependency</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DANGLING_DEPENDENCY_CONFLICT__CONTEXT_DEPENDENCY = eINSTANCE.getDanglingDependencyConflict_ContextDependency();

		/**
		 * The meta object literal for the '{@link de.ubt.ai1.supermod.mm.feature.client.impl.DisplayNameConflictImpl <em>Display Name Conflict</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai1.supermod.mm.feature.client.impl.DisplayNameConflictImpl
		 * @see de.ubt.ai1.supermod.mm.feature.client.impl.SuperModFeatureClientPackageImpl#getDisplayNameConflict()
		 * @generated
		 */
		EClass DISPLAY_NAME_CONFLICT = eINSTANCE.getDisplayNameConflict();

		/**
		 * The meta object literal for the '<em><b>Context Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISPLAY_NAME_CONFLICT__CONTEXT_FEATURE = eINSTANCE.getDisplayNameConflict_ContextFeature();

		/**
		 * The meta object literal for the '{@link de.ubt.ai1.supermod.mm.feature.client.impl.MultipleGroupMembershipConflictImpl <em>Multiple Group Membership Conflict</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai1.supermod.mm.feature.client.impl.MultipleGroupMembershipConflictImpl
		 * @see de.ubt.ai1.supermod.mm.feature.client.impl.SuperModFeatureClientPackageImpl#getMultipleGroupMembershipConflict()
		 * @generated
		 */
		EClass MULTIPLE_GROUP_MEMBERSHIP_CONFLICT = eINSTANCE.getMultipleGroupMembershipConflict();

		/**
		 * The meta object literal for the '<em><b>Context Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTIPLE_GROUP_MEMBERSHIP_CONFLICT__CONTEXT_FEATURE = eINSTANCE.getMultipleGroupMembershipConflict_ContextFeature();

		/**
		 * The meta object literal for the '{@link de.ubt.ai1.supermod.mm.feature.client.impl.RemoteGroupMembershipConflictImpl <em>Remote Group Membership Conflict</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai1.supermod.mm.feature.client.impl.RemoteGroupMembershipConflictImpl
		 * @see de.ubt.ai1.supermod.mm.feature.client.impl.SuperModFeatureClientPackageImpl#getRemoteGroupMembershipConflict()
		 * @generated
		 */
		EClass REMOTE_GROUP_MEMBERSHIP_CONFLICT = eINSTANCE.getRemoteGroupMembershipConflict();

		/**
		 * The meta object literal for the '<em><b>Context Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REMOTE_GROUP_MEMBERSHIP_CONFLICT__CONTEXT_FEATURE = eINSTANCE.getRemoteGroupMembershipConflict_ContextFeature();

		/**
		 * The meta object literal for the '{@link de.ubt.ai1.supermod.mm.feature.client.impl.FeatureConfigurationImpl <em>Feature Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai1.supermod.mm.feature.client.impl.FeatureConfigurationImpl
		 * @see de.ubt.ai1.supermod.mm.feature.client.impl.SuperModFeatureClientPackageImpl#getFeatureConfiguration()
		 * @generated
		 */
		EClass FEATURE_CONFIGURATION = eINSTANCE.getFeatureConfiguration();

		/**
		 * The meta object literal for the '<em><b>Feature Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_CONFIGURATION__FEATURE_MODEL = eINSTANCE.getFeatureConfiguration_FeatureModel();

		/**
		 * The meta object literal for the '<em><b>Option Binding</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_CONFIGURATION__OPTION_BINDING = eINSTANCE.getFeatureConfiguration_OptionBinding();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE_CONFIGURATION__NAME = eINSTANCE.getFeatureConfiguration_Name();

		/**
		 * The meta object literal for the '{@link de.ubt.ai1.supermod.mm.feature.client.impl.FeatureModelExportTraceImpl <em>Feature Model Export Trace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai1.supermod.mm.feature.client.impl.FeatureModelExportTraceImpl
		 * @see de.ubt.ai1.supermod.mm.feature.client.impl.SuperModFeatureClientPackageImpl#getFeatureModelExportTrace()
		 * @generated
		 */
		EClass FEATURE_MODEL_EXPORT_TRACE = eINSTANCE.getFeatureModelExportTrace();

		/**
		 * The meta object literal for the '<em><b>Feature To Feature Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_MODEL_EXPORT_TRACE__FEATURE_TO_FEATURE_MAP = eINSTANCE.getFeatureModelExportTrace_FeatureToFeatureMap();

		/**
		 * The meta object literal for the '{@link de.ubt.ai1.supermod.mm.feature.client.impl.FeatureToFeatureMapEntryImpl <em>Feature To Feature Map Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai1.supermod.mm.feature.client.impl.FeatureToFeatureMapEntryImpl
		 * @see de.ubt.ai1.supermod.mm.feature.client.impl.SuperModFeatureClientPackageImpl#getFeatureToFeatureMapEntry()
		 * @generated
		 */
		EClass FEATURE_TO_FEATURE_MAP_ENTRY = eINSTANCE.getFeatureToFeatureMapEntry();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_TO_FEATURE_MAP_ENTRY__KEY = eINSTANCE.getFeatureToFeatureMapEntry_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_TO_FEATURE_MAP_ENTRY__VALUE = eINSTANCE.getFeatureToFeatureMapEntry_Value();

	}

} //SuperModFeatureClientPackage
