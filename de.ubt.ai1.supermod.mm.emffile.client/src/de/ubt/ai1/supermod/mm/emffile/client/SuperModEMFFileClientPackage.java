/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.mm.emffile.client;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import de.ubt.ai1.supermod.mm.client.SuperModClientPackage;
import de.ubt.ai1.supermod.mm.file.client.SuperModFileClientPackage;

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
 * 
 * The SuperMod EMF client meta-model defines a number of conflicts which may be
 * detected during the validation of an EMF file content, under the assumption
 * that it represents a single version of an EMF file which shall be converted
 * into its extrinsic single-version representation in the local workspace.
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date 	2014-07-28
 * <!-- end-user-doc -->
 * @see de.ubt.ai1.supermod.mm.emffile.client.SuperModEMFFileClientFactory
 * @model kind="package"
 * @generated
 */
public interface SuperModEMFFileClientPackage extends EPackage {
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
	String eNS_URI = "http://ai1.uni-bayreuth.de/supermod/emffile/client/0.1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "de.ubt.ai1.supermod.mm.emffile.client";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SuperModEMFFileClientPackage eINSTANCE = de.ubt.ai1.supermod.mm.emffile.client.impl.SuperModEMFFileClientPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.ubt.ai1.supermod.mm.emffile.client.impl.EMFObjectClassConflictImpl <em>EMF Object Class Conflict</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai1.supermod.mm.emffile.client.impl.EMFObjectClassConflictImpl
	 * @see de.ubt.ai1.supermod.mm.emffile.client.impl.SuperModEMFFileClientPackageImpl#getEMFObjectClassConflict()
	 * @generated
	 */
	int EMF_OBJECT_CLASS_CONFLICT = 0;

	/**
	 * The feature id for the '<em><b>Affected Product Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_OBJECT_CLASS_CONFLICT__AFFECTED_PRODUCT_SPACE_ELEMENTS = SuperModClientPackage.PRODUCT_CONFLICT__AFFECTED_PRODUCT_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_OBJECT_CLASS_CONFLICT__SEVERITY = SuperModClientPackage.PRODUCT_CONFLICT__SEVERITY;

	/**
	 * The feature id for the '<em><b>Affected Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_OBJECT_CLASS_CONFLICT__AFFECTED_OBJECT = SuperModClientPackage.PRODUCT_CONFLICT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EMF Object Class Conflict</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_OBJECT_CLASS_CONFLICT_FEATURE_COUNT = SuperModClientPackage.PRODUCT_CONFLICT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>EMF Object Class Conflict</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_OBJECT_CLASS_CONFLICT_OPERATION_COUNT = SuperModClientPackage.PRODUCT_CONFLICT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.ubt.ai1.supermod.mm.emffile.client.impl.EMFClassDefinitionConflictImpl <em>EMF Class Definition Conflict</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai1.supermod.mm.emffile.client.impl.EMFClassDefinitionConflictImpl
	 * @see de.ubt.ai1.supermod.mm.emffile.client.impl.SuperModEMFFileClientPackageImpl#getEMFClassDefinitionConflict()
	 * @generated
	 */
	int EMF_CLASS_DEFINITION_CONFLICT = 1;

	/**
	 * The feature id for the '<em><b>Affected Product Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_CLASS_DEFINITION_CONFLICT__AFFECTED_PRODUCT_SPACE_ELEMENTS = SuperModClientPackage.PRODUCT_CONFLICT__AFFECTED_PRODUCT_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_CLASS_DEFINITION_CONFLICT__SEVERITY = SuperModClientPackage.PRODUCT_CONFLICT__SEVERITY;

	/**
	 * The feature id for the '<em><b>Affected Class Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_CLASS_DEFINITION_CONFLICT__AFFECTED_CLASS_REF = SuperModClientPackage.PRODUCT_CONFLICT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EMF Class Definition Conflict</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_CLASS_DEFINITION_CONFLICT_FEATURE_COUNT = SuperModClientPackage.PRODUCT_CONFLICT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>EMF Class Definition Conflict</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_CLASS_DEFINITION_CONFLICT_OPERATION_COUNT = SuperModClientPackage.PRODUCT_CONFLICT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.ubt.ai1.supermod.mm.emffile.client.impl.EMFFeatureCompatibilityConflictImpl <em>EMF Feature Compatibility Conflict</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai1.supermod.mm.emffile.client.impl.EMFFeatureCompatibilityConflictImpl
	 * @see de.ubt.ai1.supermod.mm.emffile.client.impl.SuperModEMFFileClientPackageImpl#getEMFFeatureCompatibilityConflict()
	 * @generated
	 */
	int EMF_FEATURE_COMPATIBILITY_CONFLICT = 2;

	/**
	 * The feature id for the '<em><b>Affected Product Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_FEATURE_COMPATIBILITY_CONFLICT__AFFECTED_PRODUCT_SPACE_ELEMENTS = SuperModClientPackage.PRODUCT_CONFLICT__AFFECTED_PRODUCT_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_FEATURE_COMPATIBILITY_CONFLICT__SEVERITY = SuperModClientPackage.PRODUCT_CONFLICT__SEVERITY;

	/**
	 * The feature id for the '<em><b>Affected Feature Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_FEATURE_COMPATIBILITY_CONFLICT__AFFECTED_FEATURE_REF = SuperModClientPackage.PRODUCT_CONFLICT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EMF Feature Compatibility Conflict</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_FEATURE_COMPATIBILITY_CONFLICT_FEATURE_COUNT = SuperModClientPackage.PRODUCT_CONFLICT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>EMF Feature Compatibility Conflict</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_FEATURE_COMPATIBILITY_CONFLICT_OPERATION_COUNT = SuperModClientPackage.PRODUCT_CONFLICT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.ubt.ai1.supermod.mm.emffile.client.impl.EMFObjectContainerConflictImpl <em>EMF Object Container Conflict</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai1.supermod.mm.emffile.client.impl.EMFObjectContainerConflictImpl
	 * @see de.ubt.ai1.supermod.mm.emffile.client.impl.SuperModEMFFileClientPackageImpl#getEMFObjectContainerConflict()
	 * @generated
	 */
	int EMF_OBJECT_CONTAINER_CONFLICT = 3;

	/**
	 * The feature id for the '<em><b>Affected Product Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_OBJECT_CONTAINER_CONFLICT__AFFECTED_PRODUCT_SPACE_ELEMENTS = SuperModClientPackage.PRODUCT_CONFLICT__AFFECTED_PRODUCT_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_OBJECT_CONTAINER_CONFLICT__SEVERITY = SuperModClientPackage.PRODUCT_CONFLICT__SEVERITY;

	/**
	 * The feature id for the '<em><b>Affected Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_OBJECT_CONTAINER_CONFLICT__AFFECTED_OBJECT = SuperModClientPackage.PRODUCT_CONFLICT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EMF Object Container Conflict</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_OBJECT_CONTAINER_CONFLICT_FEATURE_COUNT = SuperModClientPackage.PRODUCT_CONFLICT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>EMF Object Container Conflict</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_OBJECT_CONTAINER_CONFLICT_OPERATION_COUNT = SuperModClientPackage.PRODUCT_CONFLICT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.ubt.ai1.supermod.mm.emffile.client.impl.EMFCyclicContainmentConflictImpl <em>EMF Cyclic Containment Conflict</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai1.supermod.mm.emffile.client.impl.EMFCyclicContainmentConflictImpl
	 * @see de.ubt.ai1.supermod.mm.emffile.client.impl.SuperModEMFFileClientPackageImpl#getEMFCyclicContainmentConflict()
	 * @generated
	 */
	int EMF_CYCLIC_CONTAINMENT_CONFLICT = 4;

	/**
	 * The feature id for the '<em><b>Affected Product Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_CYCLIC_CONTAINMENT_CONFLICT__AFFECTED_PRODUCT_SPACE_ELEMENTS = SuperModClientPackage.PRODUCT_CONFLICT__AFFECTED_PRODUCT_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_CYCLIC_CONTAINMENT_CONFLICT__SEVERITY = SuperModClientPackage.PRODUCT_CONFLICT__SEVERITY;

	/**
	 * The feature id for the '<em><b>Affected Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_CYCLIC_CONTAINMENT_CONFLICT__AFFECTED_OBJECTS = SuperModClientPackage.PRODUCT_CONFLICT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EMF Cyclic Containment Conflict</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_CYCLIC_CONTAINMENT_CONFLICT_FEATURE_COUNT = SuperModClientPackage.PRODUCT_CONFLICT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>EMF Cyclic Containment Conflict</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_CYCLIC_CONTAINMENT_CONFLICT_OPERATION_COUNT = SuperModClientPackage.PRODUCT_CONFLICT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.ubt.ai1.supermod.mm.emffile.client.impl.EMFSingleFeatureValueConflictImpl <em>EMF Single Feature Value Conflict</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai1.supermod.mm.emffile.client.impl.EMFSingleFeatureValueConflictImpl
	 * @see de.ubt.ai1.supermod.mm.emffile.client.impl.SuperModEMFFileClientPackageImpl#getEMFSingleFeatureValueConflict()
	 * @generated
	 */
	int EMF_SINGLE_FEATURE_VALUE_CONFLICT = 5;

	/**
	 * The feature id for the '<em><b>Affected Product Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_SINGLE_FEATURE_VALUE_CONFLICT__AFFECTED_PRODUCT_SPACE_ELEMENTS = SuperModClientPackage.PRODUCT_CONFLICT__AFFECTED_PRODUCT_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_SINGLE_FEATURE_VALUE_CONFLICT__SEVERITY = SuperModClientPackage.PRODUCT_CONFLICT__SEVERITY;

	/**
	 * The feature id for the '<em><b>Affected Feature Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_SINGLE_FEATURE_VALUE_CONFLICT__AFFECTED_FEATURE_REF = SuperModClientPackage.PRODUCT_CONFLICT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EMF Single Feature Value Conflict</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_SINGLE_FEATURE_VALUE_CONFLICT_FEATURE_COUNT = SuperModClientPackage.PRODUCT_CONFLICT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>EMF Single Feature Value Conflict</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_SINGLE_FEATURE_VALUE_CONFLICT_OPERATION_COUNT = SuperModClientPackage.PRODUCT_CONFLICT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.ubt.ai1.supermod.mm.emffile.client.impl.EMFMultiFeatureValueConflictImpl <em>EMF Multi Feature Value Conflict</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai1.supermod.mm.emffile.client.impl.EMFMultiFeatureValueConflictImpl
	 * @see de.ubt.ai1.supermod.mm.emffile.client.impl.SuperModEMFFileClientPackageImpl#getEMFMultiFeatureValueConflict()
	 * @generated
	 */
	int EMF_MULTI_FEATURE_VALUE_CONFLICT = 6;

	/**
	 * The feature id for the '<em><b>Affected Product Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_MULTI_FEATURE_VALUE_CONFLICT__AFFECTED_PRODUCT_SPACE_ELEMENTS = SuperModClientPackage.PRODUCT_CONFLICT__AFFECTED_PRODUCT_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_MULTI_FEATURE_VALUE_CONFLICT__SEVERITY = SuperModClientPackage.PRODUCT_CONFLICT__SEVERITY;

	/**
	 * The feature id for the '<em><b>Affected Feature Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_MULTI_FEATURE_VALUE_CONFLICT__AFFECTED_FEATURE_REF = SuperModClientPackage.PRODUCT_CONFLICT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EMF Multi Feature Value Conflict</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_MULTI_FEATURE_VALUE_CONFLICT_FEATURE_COUNT = SuperModClientPackage.PRODUCT_CONFLICT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>EMF Multi Feature Value Conflict</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_MULTI_FEATURE_VALUE_CONFLICT_OPERATION_COUNT = SuperModClientPackage.PRODUCT_CONFLICT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.ubt.ai1.supermod.mm.emffile.client.impl.EMFLinkCompatibilityConflictImpl <em>EMF Link Compatibility Conflict</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai1.supermod.mm.emffile.client.impl.EMFLinkCompatibilityConflictImpl
	 * @see de.ubt.ai1.supermod.mm.emffile.client.impl.SuperModEMFFileClientPackageImpl#getEMFLinkCompatibilityConflict()
	 * @generated
	 */
	int EMF_LINK_COMPATIBILITY_CONFLICT = 7;

	/**
	 * The feature id for the '<em><b>Affected Product Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_LINK_COMPATIBILITY_CONFLICT__AFFECTED_PRODUCT_SPACE_ELEMENTS = SuperModClientPackage.PRODUCT_CONFLICT__AFFECTED_PRODUCT_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_LINK_COMPATIBILITY_CONFLICT__SEVERITY = SuperModClientPackage.PRODUCT_CONFLICT__SEVERITY;

	/**
	 * The feature id for the '<em><b>Incompatible Link</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_LINK_COMPATIBILITY_CONFLICT__INCOMPATIBLE_LINK = SuperModClientPackage.PRODUCT_CONFLICT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EMF Link Compatibility Conflict</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_LINK_COMPATIBILITY_CONFLICT_FEATURE_COUNT = SuperModClientPackage.PRODUCT_CONFLICT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>EMF Link Compatibility Conflict</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_LINK_COMPATIBILITY_CONFLICT_OPERATION_COUNT = SuperModClientPackage.PRODUCT_CONFLICT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.ubt.ai1.supermod.mm.emffile.client.impl.EMFObjectDefinitionConflictImpl <em>EMF Object Definition Conflict</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai1.supermod.mm.emffile.client.impl.EMFObjectDefinitionConflictImpl
	 * @see de.ubt.ai1.supermod.mm.emffile.client.impl.SuperModEMFFileClientPackageImpl#getEMFObjectDefinitionConflict()
	 * @generated
	 */
	int EMF_OBJECT_DEFINITION_CONFLICT = 8;

	/**
	 * The feature id for the '<em><b>Affected Product Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_OBJECT_DEFINITION_CONFLICT__AFFECTED_PRODUCT_SPACE_ELEMENTS = SuperModClientPackage.PRODUCT_CONFLICT__AFFECTED_PRODUCT_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_OBJECT_DEFINITION_CONFLICT__SEVERITY = SuperModClientPackage.PRODUCT_CONFLICT__SEVERITY;

	/**
	 * The feature id for the '<em><b>Affected Object Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_OBJECT_DEFINITION_CONFLICT__AFFECTED_OBJECT_REF = SuperModClientPackage.PRODUCT_CONFLICT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EMF Object Definition Conflict</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_OBJECT_DEFINITION_CONFLICT_FEATURE_COUNT = SuperModClientPackage.PRODUCT_CONFLICT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>EMF Object Definition Conflict</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_OBJECT_DEFINITION_CONFLICT_OPERATION_COUNT = SuperModClientPackage.PRODUCT_CONFLICT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.ubt.ai1.supermod.mm.emffile.client.impl.EMFReferentialIntegrityConflictImpl <em>EMF Referential Integrity Conflict</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai1.supermod.mm.emffile.client.impl.EMFReferentialIntegrityConflictImpl
	 * @see de.ubt.ai1.supermod.mm.emffile.client.impl.SuperModEMFFileClientPackageImpl#getEMFReferentialIntegrityConflict()
	 * @generated
	 */
	int EMF_REFERENTIAL_INTEGRITY_CONFLICT = 9;

	/**
	 * The feature id for the '<em><b>Affected Product Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_REFERENTIAL_INTEGRITY_CONFLICT__AFFECTED_PRODUCT_SPACE_ELEMENTS = SuperModClientPackage.PRODUCT_CONFLICT__AFFECTED_PRODUCT_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_REFERENTIAL_INTEGRITY_CONFLICT__SEVERITY = SuperModClientPackage.PRODUCT_CONFLICT__SEVERITY;

	/**
	 * The feature id for the '<em><b>Affected Object Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_REFERENTIAL_INTEGRITY_CONFLICT__AFFECTED_OBJECT_REF = SuperModClientPackage.PRODUCT_CONFLICT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EMF Referential Integrity Conflict</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_REFERENTIAL_INTEGRITY_CONFLICT_FEATURE_COUNT = SuperModClientPackage.PRODUCT_CONFLICT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>EMF Referential Integrity Conflict</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_REFERENTIAL_INTEGRITY_CONFLICT_OPERATION_COUNT = SuperModClientPackage.PRODUCT_CONFLICT_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link de.ubt.ai1.supermod.mm.emffile.client.impl.EMFFileExportTraceImpl <em>EMF File Export Trace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai1.supermod.mm.emffile.client.impl.EMFFileExportTraceImpl
	 * @see de.ubt.ai1.supermod.mm.emffile.client.impl.SuperModEMFFileClientPackageImpl#getEMFFileExportTrace()
	 * @generated
	 */
	int EMF_FILE_EXPORT_TRACE = 10;

	/**
	 * The feature id for the '<em><b>Versioned File</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_FILE_EXPORT_TRACE__VERSIONED_FILE = SuperModFileClientPackage.VERSIONED_FILE_EXPORT_TRACE__VERSIONED_FILE;

	/**
	 * The feature id for the '<em><b>Emf Object To EObject Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_FILE_EXPORT_TRACE__EMF_OBJECT_TO_EOBJECT_MAP = SuperModFileClientPackage.VERSIONED_FILE_EXPORT_TRACE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EMF File Export Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_FILE_EXPORT_TRACE_FEATURE_COUNT = SuperModFileClientPackage.VERSIONED_FILE_EXPORT_TRACE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>EMF File Export Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_FILE_EXPORT_TRACE_OPERATION_COUNT = SuperModFileClientPackage.VERSIONED_FILE_EXPORT_TRACE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.ubt.ai1.supermod.mm.emffile.client.impl.EMFObjectToEObjectMapEntryImpl <em>EMF Object To EObject Map Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai1.supermod.mm.emffile.client.impl.EMFObjectToEObjectMapEntryImpl
	 * @see de.ubt.ai1.supermod.mm.emffile.client.impl.SuperModEMFFileClientPackageImpl#getEMFObjectToEObjectMapEntry()
	 * @generated
	 */
	int EMF_OBJECT_TO_EOBJECT_MAP_ENTRY = 11;

	/**
	 * The feature id for the '<em><b>Key</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_OBJECT_TO_EOBJECT_MAP_ENTRY__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_OBJECT_TO_EOBJECT_MAP_ENTRY__VALUE = 1;

	/**
	 * The number of structural features of the '<em>EMF Object To EObject Map Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_OBJECT_TO_EOBJECT_MAP_ENTRY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>EMF Object To EObject Map Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_OBJECT_TO_EOBJECT_MAP_ENTRY_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link de.ubt.ai1.supermod.mm.emffile.client.EMFObjectClassConflict <em>EMF Object Class Conflict</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EMF Object Class Conflict</em>'.
	 * @see de.ubt.ai1.supermod.mm.emffile.client.EMFObjectClassConflict
	 * @generated
	 */
	EClass getEMFObjectClassConflict();

	/**
	 * Returns the meta object for the reference '{@link de.ubt.ai1.supermod.mm.emffile.client.EMFObjectClassConflict#getAffectedObject <em>Affected Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Affected Object</em>'.
	 * @see de.ubt.ai1.supermod.mm.emffile.client.EMFObjectClassConflict#getAffectedObject()
	 * @see #getEMFObjectClassConflict()
	 * @generated
	 */
	EReference getEMFObjectClassConflict_AffectedObject();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai1.supermod.mm.emffile.client.EMFClassDefinitionConflict <em>EMF Class Definition Conflict</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EMF Class Definition Conflict</em>'.
	 * @see de.ubt.ai1.supermod.mm.emffile.client.EMFClassDefinitionConflict
	 * @generated
	 */
	EClass getEMFClassDefinitionConflict();

	/**
	 * Returns the meta object for the reference '{@link de.ubt.ai1.supermod.mm.emffile.client.EMFClassDefinitionConflict#getAffectedClassRef <em>Affected Class Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Affected Class Ref</em>'.
	 * @see de.ubt.ai1.supermod.mm.emffile.client.EMFClassDefinitionConflict#getAffectedClassRef()
	 * @see #getEMFClassDefinitionConflict()
	 * @generated
	 */
	EReference getEMFClassDefinitionConflict_AffectedClassRef();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai1.supermod.mm.emffile.client.EMFFeatureCompatibilityConflict <em>EMF Feature Compatibility Conflict</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EMF Feature Compatibility Conflict</em>'.
	 * @see de.ubt.ai1.supermod.mm.emffile.client.EMFFeatureCompatibilityConflict
	 * @generated
	 */
	EClass getEMFFeatureCompatibilityConflict();

	/**
	 * Returns the meta object for the reference '{@link de.ubt.ai1.supermod.mm.emffile.client.EMFFeatureCompatibilityConflict#getAffectedFeatureRef <em>Affected Feature Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Affected Feature Ref</em>'.
	 * @see de.ubt.ai1.supermod.mm.emffile.client.EMFFeatureCompatibilityConflict#getAffectedFeatureRef()
	 * @see #getEMFFeatureCompatibilityConflict()
	 * @generated
	 */
	EReference getEMFFeatureCompatibilityConflict_AffectedFeatureRef();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai1.supermod.mm.emffile.client.EMFObjectContainerConflict <em>EMF Object Container Conflict</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EMF Object Container Conflict</em>'.
	 * @see de.ubt.ai1.supermod.mm.emffile.client.EMFObjectContainerConflict
	 * @generated
	 */
	EClass getEMFObjectContainerConflict();

	/**
	 * Returns the meta object for the reference '{@link de.ubt.ai1.supermod.mm.emffile.client.EMFObjectContainerConflict#getAffectedObject <em>Affected Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Affected Object</em>'.
	 * @see de.ubt.ai1.supermod.mm.emffile.client.EMFObjectContainerConflict#getAffectedObject()
	 * @see #getEMFObjectContainerConflict()
	 * @generated
	 */
	EReference getEMFObjectContainerConflict_AffectedObject();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai1.supermod.mm.emffile.client.EMFCyclicContainmentConflict <em>EMF Cyclic Containment Conflict</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EMF Cyclic Containment Conflict</em>'.
	 * @see de.ubt.ai1.supermod.mm.emffile.client.EMFCyclicContainmentConflict
	 * @generated
	 */
	EClass getEMFCyclicContainmentConflict();

	/**
	 * Returns the meta object for the reference list '{@link de.ubt.ai1.supermod.mm.emffile.client.EMFCyclicContainmentConflict#getAffectedObjects <em>Affected Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Affected Objects</em>'.
	 * @see de.ubt.ai1.supermod.mm.emffile.client.EMFCyclicContainmentConflict#getAffectedObjects()
	 * @see #getEMFCyclicContainmentConflict()
	 * @generated
	 */
	EReference getEMFCyclicContainmentConflict_AffectedObjects();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai1.supermod.mm.emffile.client.EMFSingleFeatureValueConflict <em>EMF Single Feature Value Conflict</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EMF Single Feature Value Conflict</em>'.
	 * @see de.ubt.ai1.supermod.mm.emffile.client.EMFSingleFeatureValueConflict
	 * @generated
	 */
	EClass getEMFSingleFeatureValueConflict();

	/**
	 * Returns the meta object for the reference '{@link de.ubt.ai1.supermod.mm.emffile.client.EMFSingleFeatureValueConflict#getAffectedFeatureRef <em>Affected Feature Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Affected Feature Ref</em>'.
	 * @see de.ubt.ai1.supermod.mm.emffile.client.EMFSingleFeatureValueConflict#getAffectedFeatureRef()
	 * @see #getEMFSingleFeatureValueConflict()
	 * @generated
	 */
	EReference getEMFSingleFeatureValueConflict_AffectedFeatureRef();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai1.supermod.mm.emffile.client.EMFMultiFeatureValueConflict <em>EMF Multi Feature Value Conflict</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EMF Multi Feature Value Conflict</em>'.
	 * @see de.ubt.ai1.supermod.mm.emffile.client.EMFMultiFeatureValueConflict
	 * @generated
	 */
	EClass getEMFMultiFeatureValueConflict();

	/**
	 * Returns the meta object for the reference '{@link de.ubt.ai1.supermod.mm.emffile.client.EMFMultiFeatureValueConflict#getAffectedFeatureRef <em>Affected Feature Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Affected Feature Ref</em>'.
	 * @see de.ubt.ai1.supermod.mm.emffile.client.EMFMultiFeatureValueConflict#getAffectedFeatureRef()
	 * @see #getEMFMultiFeatureValueConflict()
	 * @generated
	 */
	EReference getEMFMultiFeatureValueConflict_AffectedFeatureRef();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai1.supermod.mm.emffile.client.EMFLinkCompatibilityConflict <em>EMF Link Compatibility Conflict</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EMF Link Compatibility Conflict</em>'.
	 * @see de.ubt.ai1.supermod.mm.emffile.client.EMFLinkCompatibilityConflict
	 * @generated
	 */
	EClass getEMFLinkCompatibilityConflict();

	/**
	 * Returns the meta object for the reference '{@link de.ubt.ai1.supermod.mm.emffile.client.EMFLinkCompatibilityConflict#getIncompatibleLink <em>Incompatible Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Incompatible Link</em>'.
	 * @see de.ubt.ai1.supermod.mm.emffile.client.EMFLinkCompatibilityConflict#getIncompatibleLink()
	 * @see #getEMFLinkCompatibilityConflict()
	 * @generated
	 */
	EReference getEMFLinkCompatibilityConflict_IncompatibleLink();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai1.supermod.mm.emffile.client.EMFObjectDefinitionConflict <em>EMF Object Definition Conflict</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EMF Object Definition Conflict</em>'.
	 * @see de.ubt.ai1.supermod.mm.emffile.client.EMFObjectDefinitionConflict
	 * @generated
	 */
	EClass getEMFObjectDefinitionConflict();

	/**
	 * Returns the meta object for the reference '{@link de.ubt.ai1.supermod.mm.emffile.client.EMFObjectDefinitionConflict#getAffectedObjectRef <em>Affected Object Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Affected Object Ref</em>'.
	 * @see de.ubt.ai1.supermod.mm.emffile.client.EMFObjectDefinitionConflict#getAffectedObjectRef()
	 * @see #getEMFObjectDefinitionConflict()
	 * @generated
	 */
	EReference getEMFObjectDefinitionConflict_AffectedObjectRef();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai1.supermod.mm.emffile.client.EMFReferentialIntegrityConflict <em>EMF Referential Integrity Conflict</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EMF Referential Integrity Conflict</em>'.
	 * @see de.ubt.ai1.supermod.mm.emffile.client.EMFReferentialIntegrityConflict
	 * @generated
	 */
	EClass getEMFReferentialIntegrityConflict();

	/**
	 * Returns the meta object for the reference '{@link de.ubt.ai1.supermod.mm.emffile.client.EMFReferentialIntegrityConflict#getAffectedObjectRef <em>Affected Object Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Affected Object Ref</em>'.
	 * @see de.ubt.ai1.supermod.mm.emffile.client.EMFReferentialIntegrityConflict#getAffectedObjectRef()
	 * @see #getEMFReferentialIntegrityConflict()
	 * @generated
	 */
	EReference getEMFReferentialIntegrityConflict_AffectedObjectRef();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai1.supermod.mm.emffile.client.EMFFileExportTrace <em>EMF File Export Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EMF File Export Trace</em>'.
	 * @see de.ubt.ai1.supermod.mm.emffile.client.EMFFileExportTrace
	 * @generated
	 */
	EClass getEMFFileExportTrace();

	/**
	 * Returns the meta object for the map '{@link de.ubt.ai1.supermod.mm.emffile.client.EMFFileExportTrace#getEmfObjectToEObjectMap <em>Emf Object To EObject Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Emf Object To EObject Map</em>'.
	 * @see de.ubt.ai1.supermod.mm.emffile.client.EMFFileExportTrace#getEmfObjectToEObjectMap()
	 * @see #getEMFFileExportTrace()
	 * @generated
	 */
	EReference getEMFFileExportTrace_EmfObjectToEObjectMap();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>EMF Object To EObject Map Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EMF Object To EObject Map Entry</em>'.
	 * @see java.util.Map.Entry
	 * @model keyType="de.ubt.ai1.supermod.mm.emffile.EMFObject"
	 *        valueType="org.eclipse.emf.ecore.EObject"
	 * @generated
	 */
	EClass getEMFObjectToEObjectMapEntry();

	/**
	 * Returns the meta object for the reference '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getEMFObjectToEObjectMapEntry()
	 * @generated
	 */
	EReference getEMFObjectToEObjectMapEntry_Key();

	/**
	 * Returns the meta object for the reference '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getEMFObjectToEObjectMapEntry()
	 * @generated
	 */
	EReference getEMFObjectToEObjectMapEntry_Value();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SuperModEMFFileClientFactory getSuperModEMFFileClientFactory();

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
		 * The meta object literal for the '{@link de.ubt.ai1.supermod.mm.emffile.client.impl.EMFObjectClassConflictImpl <em>EMF Object Class Conflict</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai1.supermod.mm.emffile.client.impl.EMFObjectClassConflictImpl
		 * @see de.ubt.ai1.supermod.mm.emffile.client.impl.SuperModEMFFileClientPackageImpl#getEMFObjectClassConflict()
		 * @generated
		 */
		EClass EMF_OBJECT_CLASS_CONFLICT = eINSTANCE.getEMFObjectClassConflict();

		/**
		 * The meta object literal for the '<em><b>Affected Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMF_OBJECT_CLASS_CONFLICT__AFFECTED_OBJECT = eINSTANCE.getEMFObjectClassConflict_AffectedObject();

		/**
		 * The meta object literal for the '{@link de.ubt.ai1.supermod.mm.emffile.client.impl.EMFClassDefinitionConflictImpl <em>EMF Class Definition Conflict</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai1.supermod.mm.emffile.client.impl.EMFClassDefinitionConflictImpl
		 * @see de.ubt.ai1.supermod.mm.emffile.client.impl.SuperModEMFFileClientPackageImpl#getEMFClassDefinitionConflict()
		 * @generated
		 */
		EClass EMF_CLASS_DEFINITION_CONFLICT = eINSTANCE.getEMFClassDefinitionConflict();

		/**
		 * The meta object literal for the '<em><b>Affected Class Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMF_CLASS_DEFINITION_CONFLICT__AFFECTED_CLASS_REF = eINSTANCE.getEMFClassDefinitionConflict_AffectedClassRef();

		/**
		 * The meta object literal for the '{@link de.ubt.ai1.supermod.mm.emffile.client.impl.EMFFeatureCompatibilityConflictImpl <em>EMF Feature Compatibility Conflict</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai1.supermod.mm.emffile.client.impl.EMFFeatureCompatibilityConflictImpl
		 * @see de.ubt.ai1.supermod.mm.emffile.client.impl.SuperModEMFFileClientPackageImpl#getEMFFeatureCompatibilityConflict()
		 * @generated
		 */
		EClass EMF_FEATURE_COMPATIBILITY_CONFLICT = eINSTANCE.getEMFFeatureCompatibilityConflict();

		/**
		 * The meta object literal for the '<em><b>Affected Feature Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMF_FEATURE_COMPATIBILITY_CONFLICT__AFFECTED_FEATURE_REF = eINSTANCE.getEMFFeatureCompatibilityConflict_AffectedFeatureRef();

		/**
		 * The meta object literal for the '{@link de.ubt.ai1.supermod.mm.emffile.client.impl.EMFObjectContainerConflictImpl <em>EMF Object Container Conflict</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai1.supermod.mm.emffile.client.impl.EMFObjectContainerConflictImpl
		 * @see de.ubt.ai1.supermod.mm.emffile.client.impl.SuperModEMFFileClientPackageImpl#getEMFObjectContainerConflict()
		 * @generated
		 */
		EClass EMF_OBJECT_CONTAINER_CONFLICT = eINSTANCE.getEMFObjectContainerConflict();

		/**
		 * The meta object literal for the '<em><b>Affected Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMF_OBJECT_CONTAINER_CONFLICT__AFFECTED_OBJECT = eINSTANCE.getEMFObjectContainerConflict_AffectedObject();

		/**
		 * The meta object literal for the '{@link de.ubt.ai1.supermod.mm.emffile.client.impl.EMFCyclicContainmentConflictImpl <em>EMF Cyclic Containment Conflict</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai1.supermod.mm.emffile.client.impl.EMFCyclicContainmentConflictImpl
		 * @see de.ubt.ai1.supermod.mm.emffile.client.impl.SuperModEMFFileClientPackageImpl#getEMFCyclicContainmentConflict()
		 * @generated
		 */
		EClass EMF_CYCLIC_CONTAINMENT_CONFLICT = eINSTANCE.getEMFCyclicContainmentConflict();

		/**
		 * The meta object literal for the '<em><b>Affected Objects</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMF_CYCLIC_CONTAINMENT_CONFLICT__AFFECTED_OBJECTS = eINSTANCE.getEMFCyclicContainmentConflict_AffectedObjects();

		/**
		 * The meta object literal for the '{@link de.ubt.ai1.supermod.mm.emffile.client.impl.EMFSingleFeatureValueConflictImpl <em>EMF Single Feature Value Conflict</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai1.supermod.mm.emffile.client.impl.EMFSingleFeatureValueConflictImpl
		 * @see de.ubt.ai1.supermod.mm.emffile.client.impl.SuperModEMFFileClientPackageImpl#getEMFSingleFeatureValueConflict()
		 * @generated
		 */
		EClass EMF_SINGLE_FEATURE_VALUE_CONFLICT = eINSTANCE.getEMFSingleFeatureValueConflict();

		/**
		 * The meta object literal for the '<em><b>Affected Feature Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMF_SINGLE_FEATURE_VALUE_CONFLICT__AFFECTED_FEATURE_REF = eINSTANCE.getEMFSingleFeatureValueConflict_AffectedFeatureRef();

		/**
		 * The meta object literal for the '{@link de.ubt.ai1.supermod.mm.emffile.client.impl.EMFMultiFeatureValueConflictImpl <em>EMF Multi Feature Value Conflict</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai1.supermod.mm.emffile.client.impl.EMFMultiFeatureValueConflictImpl
		 * @see de.ubt.ai1.supermod.mm.emffile.client.impl.SuperModEMFFileClientPackageImpl#getEMFMultiFeatureValueConflict()
		 * @generated
		 */
		EClass EMF_MULTI_FEATURE_VALUE_CONFLICT = eINSTANCE.getEMFMultiFeatureValueConflict();

		/**
		 * The meta object literal for the '<em><b>Affected Feature Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMF_MULTI_FEATURE_VALUE_CONFLICT__AFFECTED_FEATURE_REF = eINSTANCE.getEMFMultiFeatureValueConflict_AffectedFeatureRef();

		/**
		 * The meta object literal for the '{@link de.ubt.ai1.supermod.mm.emffile.client.impl.EMFLinkCompatibilityConflictImpl <em>EMF Link Compatibility Conflict</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai1.supermod.mm.emffile.client.impl.EMFLinkCompatibilityConflictImpl
		 * @see de.ubt.ai1.supermod.mm.emffile.client.impl.SuperModEMFFileClientPackageImpl#getEMFLinkCompatibilityConflict()
		 * @generated
		 */
		EClass EMF_LINK_COMPATIBILITY_CONFLICT = eINSTANCE.getEMFLinkCompatibilityConflict();

		/**
		 * The meta object literal for the '<em><b>Incompatible Link</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMF_LINK_COMPATIBILITY_CONFLICT__INCOMPATIBLE_LINK = eINSTANCE.getEMFLinkCompatibilityConflict_IncompatibleLink();

		/**
		 * The meta object literal for the '{@link de.ubt.ai1.supermod.mm.emffile.client.impl.EMFObjectDefinitionConflictImpl <em>EMF Object Definition Conflict</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai1.supermod.mm.emffile.client.impl.EMFObjectDefinitionConflictImpl
		 * @see de.ubt.ai1.supermod.mm.emffile.client.impl.SuperModEMFFileClientPackageImpl#getEMFObjectDefinitionConflict()
		 * @generated
		 */
		EClass EMF_OBJECT_DEFINITION_CONFLICT = eINSTANCE.getEMFObjectDefinitionConflict();

		/**
		 * The meta object literal for the '<em><b>Affected Object Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMF_OBJECT_DEFINITION_CONFLICT__AFFECTED_OBJECT_REF = eINSTANCE.getEMFObjectDefinitionConflict_AffectedObjectRef();

		/**
		 * The meta object literal for the '{@link de.ubt.ai1.supermod.mm.emffile.client.impl.EMFReferentialIntegrityConflictImpl <em>EMF Referential Integrity Conflict</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai1.supermod.mm.emffile.client.impl.EMFReferentialIntegrityConflictImpl
		 * @see de.ubt.ai1.supermod.mm.emffile.client.impl.SuperModEMFFileClientPackageImpl#getEMFReferentialIntegrityConflict()
		 * @generated
		 */
		EClass EMF_REFERENTIAL_INTEGRITY_CONFLICT = eINSTANCE.getEMFReferentialIntegrityConflict();

		/**
		 * The meta object literal for the '<em><b>Affected Object Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMF_REFERENTIAL_INTEGRITY_CONFLICT__AFFECTED_OBJECT_REF = eINSTANCE.getEMFReferentialIntegrityConflict_AffectedObjectRef();

		/**
		 * The meta object literal for the '{@link de.ubt.ai1.supermod.mm.emffile.client.impl.EMFFileExportTraceImpl <em>EMF File Export Trace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai1.supermod.mm.emffile.client.impl.EMFFileExportTraceImpl
		 * @see de.ubt.ai1.supermod.mm.emffile.client.impl.SuperModEMFFileClientPackageImpl#getEMFFileExportTrace()
		 * @generated
		 */
		EClass EMF_FILE_EXPORT_TRACE = eINSTANCE.getEMFFileExportTrace();

		/**
		 * The meta object literal for the '<em><b>Emf Object To EObject Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMF_FILE_EXPORT_TRACE__EMF_OBJECT_TO_EOBJECT_MAP = eINSTANCE.getEMFFileExportTrace_EmfObjectToEObjectMap();

		/**
		 * The meta object literal for the '{@link de.ubt.ai1.supermod.mm.emffile.client.impl.EMFObjectToEObjectMapEntryImpl <em>EMF Object To EObject Map Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai1.supermod.mm.emffile.client.impl.EMFObjectToEObjectMapEntryImpl
		 * @see de.ubt.ai1.supermod.mm.emffile.client.impl.SuperModEMFFileClientPackageImpl#getEMFObjectToEObjectMapEntry()
		 * @generated
		 */
		EClass EMF_OBJECT_TO_EOBJECT_MAP_ENTRY = eINSTANCE.getEMFObjectToEObjectMapEntry();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMF_OBJECT_TO_EOBJECT_MAP_ENTRY__KEY = eINSTANCE.getEMFObjectToEObjectMapEntry_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMF_OBJECT_TO_EOBJECT_MAP_ENTRY__VALUE = eINSTANCE.getEMFObjectToEObjectMapEntry_Value();

	}

} //SuperModEMFFileClientPackage
