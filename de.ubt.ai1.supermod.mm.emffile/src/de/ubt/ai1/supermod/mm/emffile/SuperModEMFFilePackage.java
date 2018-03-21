/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.mm.emffile;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import de.ubt.ai1.supermod.mm.core.SuperModCorePackage;
import de.ubt.ai1.supermod.mm.file.SuperModFilePackage;

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
 * Meta-model for the intrinsic multi-variant representation of arbitrary
 * instances of Ecore models. An EMF instance is represented as a specfic
 * file content, defining a number of EMF objects.
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date 	2014-07-28
 * @see		EMFFileContent
 * @see		EMFObject
 * <!-- end-user-doc -->
 * @see de.ubt.ai1.supermod.mm.emffile.SuperModEMFFileFactory
 * @model kind="package"
 * @generated
 */
public interface SuperModEMFFilePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "emffile";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://ai1.uni-bayreuth.de/supermod/emffile/0.1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "de.ubt.ai1.supermod.mm.emffile";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SuperModEMFFilePackage eINSTANCE = de.ubt.ai1.supermod.mm.emffile.impl.SuperModEMFFilePackageImpl.init();

	/**
	 * The meta object id for the '{@link de.ubt.ai1.supermod.mm.emffile.impl.EMFFileContentImpl <em>EMF File Content</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai1.supermod.mm.emffile.impl.EMFFileContentImpl
	 * @see de.ubt.ai1.supermod.mm.emffile.impl.SuperModEMFFilePackageImpl#getEMFFileContent()
	 * @generated
	 */
	int EMF_FILE_CONTENT = 0;

	/**
	 * The feature id for the '<em><b>Super Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_FILE_CONTENT__SUPER_ELEMENT = SuperModFilePackage.VERSIONED_FILE_CONTENT__SUPER_ELEMENT;

	/**
	 * The feature id for the '<em><b>Sub Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_FILE_CONTENT__SUB_ELEMENTS = SuperModFilePackage.VERSIONED_FILE_CONTENT__SUB_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Super Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_FILE_CONTENT__ALL_SUPER_ELEMENTS = SuperModFilePackage.VERSIONED_FILE_CONTENT__ALL_SUPER_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Sub Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_FILE_CONTENT__ALL_SUB_ELEMENTS = SuperModFilePackage.VERSIONED_FILE_CONTENT__ALL_SUB_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Cross Referenced Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_FILE_CONTENT__CROSS_REFERENCED_ELEMENTS = SuperModFilePackage.VERSIONED_FILE_CONTENT__CROSS_REFERENCED_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Cross Referencing Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_FILE_CONTENT__CROSS_REFERENCING_ELEMENTS = SuperModFilePackage.VERSIONED_FILE_CONTENT__CROSS_REFERENCING_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Proxy UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_FILE_CONTENT__PROXY_UUID = SuperModFilePackage.VERSIONED_FILE_CONTENT__PROXY_UUID;

	/**
	 * The feature id for the '<em><b>Transaction Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_FILE_CONTENT__TRANSACTION_ID = SuperModFilePackage.VERSIONED_FILE_CONTENT__TRANSACTION_ID;

	/**
	 * The feature id for the '<em><b>Product Dimension</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_FILE_CONTENT__PRODUCT_DIMENSION = SuperModFilePackage.VERSIONED_FILE_CONTENT__PRODUCT_DIMENSION;

	/**
	 * The feature id for the '<em><b>Product Space</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_FILE_CONTENT__PRODUCT_SPACE = SuperModFilePackage.VERSIONED_FILE_CONTENT__PRODUCT_SPACE;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_FILE_CONTENT__VISIBILITY = SuperModFilePackage.VERSIONED_FILE_CONTENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Super Product Space Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_FILE_CONTENT__SUPER_PRODUCT_SPACE_ELEMENT = SuperModFilePackage.VERSIONED_FILE_CONTENT__SUPER_PRODUCT_SPACE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Sub Product Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_FILE_CONTENT__SUB_PRODUCT_SPACE_ELEMENTS = SuperModFilePackage.VERSIONED_FILE_CONTENT__SUB_PRODUCT_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Super Product Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_FILE_CONTENT__ALL_SUPER_PRODUCT_SPACE_ELEMENTS = SuperModFilePackage.VERSIONED_FILE_CONTENT__ALL_SUPER_PRODUCT_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Sub Product Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_FILE_CONTENT__ALL_SUB_PRODUCT_SPACE_ELEMENTS = SuperModFilePackage.VERSIONED_FILE_CONTENT__ALL_SUB_PRODUCT_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Cross Referenced Product Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_FILE_CONTENT__CROSS_REFERENCED_PRODUCT_SPACE_ELEMENTS = SuperModFilePackage.VERSIONED_FILE_CONTENT__CROSS_REFERENCED_PRODUCT_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Cross Referencing Product Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_FILE_CONTENT__CROSS_REFERENCING_PRODUCT_SPACE_ELEMENTS = SuperModFilePackage.VERSIONED_FILE_CONTENT__CROSS_REFERENCING_PRODUCT_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Hierarchical Visibility</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_FILE_CONTENT__HIERARCHICAL_VISIBILITY = SuperModFilePackage.VERSIONED_FILE_CONTENT__HIERARCHICAL_VISIBILITY;

	/**
	 * The feature id for the '<em><b>File</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_FILE_CONTENT__FILE = SuperModFilePackage.VERSIONED_FILE_CONTENT__FILE;

	/**
	 * The feature id for the '<em><b>Super Extension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_FILE_CONTENT__SUPER_EXTENSION = SuperModFilePackage.VERSIONED_FILE_CONTENT__SUPER_EXTENSION;

	/**
	 * The feature id for the '<em><b>Objects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_FILE_CONTENT__OBJECTS = SuperModFilePackage.VERSIONED_FILE_CONTENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Roots</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_FILE_CONTENT__ROOTS = SuperModFilePackage.VERSIONED_FILE_CONTENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>EMF File Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_FILE_CONTENT_FEATURE_COUNT = SuperModFilePackage.VERSIONED_FILE_CONTENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Is Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_FILE_CONTENT___IS_PROXY = SuperModFilePackage.VERSIONED_FILE_CONTENT___IS_PROXY;

	/**
	 * The operation id for the '<em>Is Visible</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_FILE_CONTENT___IS_VISIBLE__OPTIONBINDING_VISIBILITYEVALUATIONCACHE = SuperModFilePackage.VERSIONED_FILE_CONTENT___IS_VISIBLE__OPTIONBINDING_VISIBILITYEVALUATIONCACHE;

	/**
	 * The operation id for the '<em>Is Visible Hierarchically</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_FILE_CONTENT___IS_VISIBLE_HIERARCHICALLY__OPTIONBINDING_VISIBILITYEVALUATIONCACHE = SuperModFilePackage.VERSIONED_FILE_CONTENT___IS_VISIBLE_HIERARCHICALLY__OPTIONBINDING_VISIBILITYEVALUATIONCACHE;

	/**
	 * The number of operations of the '<em>EMF File Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_FILE_CONTENT_OPERATION_COUNT = SuperModFilePackage.VERSIONED_FILE_CONTENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.ubt.ai1.supermod.mm.emffile.impl.EMFObjectImpl <em>EMF Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai1.supermod.mm.emffile.impl.EMFObjectImpl
	 * @see de.ubt.ai1.supermod.mm.emffile.impl.SuperModEMFFilePackageImpl#getEMFObject()
	 * @generated
	 */
	int EMF_OBJECT = 1;

	/**
	 * The feature id for the '<em><b>Super Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_OBJECT__SUPER_ELEMENT = SuperModCorePackage.PRODUCT_SPACE_ELEMENT__SUPER_ELEMENT;

	/**
	 * The feature id for the '<em><b>Sub Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_OBJECT__SUB_ELEMENTS = SuperModCorePackage.PRODUCT_SPACE_ELEMENT__SUB_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Super Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_OBJECT__ALL_SUPER_ELEMENTS = SuperModCorePackage.PRODUCT_SPACE_ELEMENT__ALL_SUPER_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Sub Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_OBJECT__ALL_SUB_ELEMENTS = SuperModCorePackage.PRODUCT_SPACE_ELEMENT__ALL_SUB_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Cross Referenced Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_OBJECT__CROSS_REFERENCED_ELEMENTS = SuperModCorePackage.PRODUCT_SPACE_ELEMENT__CROSS_REFERENCED_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Cross Referencing Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_OBJECT__CROSS_REFERENCING_ELEMENTS = SuperModCorePackage.PRODUCT_SPACE_ELEMENT__CROSS_REFERENCING_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Proxy UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_OBJECT__PROXY_UUID = SuperModCorePackage.PRODUCT_SPACE_ELEMENT__PROXY_UUID;

	/**
	 * The feature id for the '<em><b>Transaction Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_OBJECT__TRANSACTION_ID = SuperModCorePackage.PRODUCT_SPACE_ELEMENT__TRANSACTION_ID;

	/**
	 * The feature id for the '<em><b>Product Dimension</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_OBJECT__PRODUCT_DIMENSION = SuperModCorePackage.PRODUCT_SPACE_ELEMENT__PRODUCT_DIMENSION;

	/**
	 * The feature id for the '<em><b>Product Space</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_OBJECT__PRODUCT_SPACE = SuperModCorePackage.PRODUCT_SPACE_ELEMENT__PRODUCT_SPACE;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_OBJECT__VISIBILITY = SuperModCorePackage.PRODUCT_SPACE_ELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Super Product Space Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_OBJECT__SUPER_PRODUCT_SPACE_ELEMENT = SuperModCorePackage.PRODUCT_SPACE_ELEMENT__SUPER_PRODUCT_SPACE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Sub Product Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_OBJECT__SUB_PRODUCT_SPACE_ELEMENTS = SuperModCorePackage.PRODUCT_SPACE_ELEMENT__SUB_PRODUCT_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Super Product Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_OBJECT__ALL_SUPER_PRODUCT_SPACE_ELEMENTS = SuperModCorePackage.PRODUCT_SPACE_ELEMENT__ALL_SUPER_PRODUCT_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Sub Product Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_OBJECT__ALL_SUB_PRODUCT_SPACE_ELEMENTS = SuperModCorePackage.PRODUCT_SPACE_ELEMENT__ALL_SUB_PRODUCT_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Cross Referenced Product Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_OBJECT__CROSS_REFERENCED_PRODUCT_SPACE_ELEMENTS = SuperModCorePackage.PRODUCT_SPACE_ELEMENT__CROSS_REFERENCED_PRODUCT_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Cross Referencing Product Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_OBJECT__CROSS_REFERENCING_PRODUCT_SPACE_ELEMENTS = SuperModCorePackage.PRODUCT_SPACE_ELEMENT__CROSS_REFERENCING_PRODUCT_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Hierarchical Visibility</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_OBJECT__HIERARCHICAL_VISIBILITY = SuperModCorePackage.PRODUCT_SPACE_ELEMENT__HIERARCHICAL_VISIBILITY;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_OBJECT__UUID = SuperModCorePackage.PRODUCT_SPACE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Class Refs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_OBJECT__CLASS_REFS = SuperModCorePackage.PRODUCT_SPACE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Feature Refs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_OBJECT__FEATURE_REFS = SuperModCorePackage.PRODUCT_SPACE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Targeting Ref Vals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_OBJECT__TARGETING_REF_VALS = SuperModCorePackage.PRODUCT_SPACE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Targeting Containment Ref Vals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_OBJECT__TARGETING_CONTAINMENT_REF_VALS = SuperModCorePackage.PRODUCT_SPACE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>EMF Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_OBJECT_FEATURE_COUNT = SuperModCorePackage.PRODUCT_SPACE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_OBJECT___IS_PROXY = SuperModCorePackage.PRODUCT_SPACE_ELEMENT___IS_PROXY;

	/**
	 * The operation id for the '<em>Is Visible</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_OBJECT___IS_VISIBLE__OPTIONBINDING_VISIBILITYEVALUATIONCACHE = SuperModCorePackage.PRODUCT_SPACE_ELEMENT___IS_VISIBLE__OPTIONBINDING_VISIBILITYEVALUATIONCACHE;

	/**
	 * The operation id for the '<em>Is Visible Hierarchically</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_OBJECT___IS_VISIBLE_HIERARCHICALLY__OPTIONBINDING_VISIBILITYEVALUATIONCACHE = SuperModCorePackage.PRODUCT_SPACE_ELEMENT___IS_VISIBLE_HIERARCHICALLY__OPTIONBINDING_VISIBILITYEVALUATIONCACHE;

	/**
	 * The number of operations of the '<em>EMF Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_OBJECT_OPERATION_COUNT = SuperModCorePackage.PRODUCT_SPACE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.ubt.ai1.supermod.mm.emffile.impl.EMFClassRefImpl <em>EMF Class Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai1.supermod.mm.emffile.impl.EMFClassRefImpl
	 * @see de.ubt.ai1.supermod.mm.emffile.impl.SuperModEMFFilePackageImpl#getEMFClassRef()
	 * @generated
	 */
	int EMF_CLASS_REF = 2;

	/**
	 * The feature id for the '<em><b>Super Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_CLASS_REF__SUPER_ELEMENT = SuperModCorePackage.PRODUCT_SPACE_ELEMENT__SUPER_ELEMENT;

	/**
	 * The feature id for the '<em><b>Sub Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_CLASS_REF__SUB_ELEMENTS = SuperModCorePackage.PRODUCT_SPACE_ELEMENT__SUB_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Super Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_CLASS_REF__ALL_SUPER_ELEMENTS = SuperModCorePackage.PRODUCT_SPACE_ELEMENT__ALL_SUPER_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Sub Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_CLASS_REF__ALL_SUB_ELEMENTS = SuperModCorePackage.PRODUCT_SPACE_ELEMENT__ALL_SUB_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Cross Referenced Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_CLASS_REF__CROSS_REFERENCED_ELEMENTS = SuperModCorePackage.PRODUCT_SPACE_ELEMENT__CROSS_REFERENCED_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Cross Referencing Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_CLASS_REF__CROSS_REFERENCING_ELEMENTS = SuperModCorePackage.PRODUCT_SPACE_ELEMENT__CROSS_REFERENCING_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Proxy UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_CLASS_REF__PROXY_UUID = SuperModCorePackage.PRODUCT_SPACE_ELEMENT__PROXY_UUID;

	/**
	 * The feature id for the '<em><b>Transaction Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_CLASS_REF__TRANSACTION_ID = SuperModCorePackage.PRODUCT_SPACE_ELEMENT__TRANSACTION_ID;

	/**
	 * The feature id for the '<em><b>Product Dimension</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_CLASS_REF__PRODUCT_DIMENSION = SuperModCorePackage.PRODUCT_SPACE_ELEMENT__PRODUCT_DIMENSION;

	/**
	 * The feature id for the '<em><b>Product Space</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_CLASS_REF__PRODUCT_SPACE = SuperModCorePackage.PRODUCT_SPACE_ELEMENT__PRODUCT_SPACE;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_CLASS_REF__VISIBILITY = SuperModCorePackage.PRODUCT_SPACE_ELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Super Product Space Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_CLASS_REF__SUPER_PRODUCT_SPACE_ELEMENT = SuperModCorePackage.PRODUCT_SPACE_ELEMENT__SUPER_PRODUCT_SPACE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Sub Product Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_CLASS_REF__SUB_PRODUCT_SPACE_ELEMENTS = SuperModCorePackage.PRODUCT_SPACE_ELEMENT__SUB_PRODUCT_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Super Product Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_CLASS_REF__ALL_SUPER_PRODUCT_SPACE_ELEMENTS = SuperModCorePackage.PRODUCT_SPACE_ELEMENT__ALL_SUPER_PRODUCT_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Sub Product Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_CLASS_REF__ALL_SUB_PRODUCT_SPACE_ELEMENTS = SuperModCorePackage.PRODUCT_SPACE_ELEMENT__ALL_SUB_PRODUCT_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Cross Referenced Product Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_CLASS_REF__CROSS_REFERENCED_PRODUCT_SPACE_ELEMENTS = SuperModCorePackage.PRODUCT_SPACE_ELEMENT__CROSS_REFERENCED_PRODUCT_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Cross Referencing Product Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_CLASS_REF__CROSS_REFERENCING_PRODUCT_SPACE_ELEMENTS = SuperModCorePackage.PRODUCT_SPACE_ELEMENT__CROSS_REFERENCING_PRODUCT_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Hierarchical Visibility</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_CLASS_REF__HIERARCHICAL_VISIBILITY = SuperModCorePackage.PRODUCT_SPACE_ELEMENT__HIERARCHICAL_VISIBILITY;

	/**
	 * The feature id for the '<em><b>Package Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_CLASS_REF__PACKAGE_URI = SuperModCorePackage.PRODUCT_SPACE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_CLASS_REF__CLASS_NAME = SuperModCorePackage.PRODUCT_SPACE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>EMF Class Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_CLASS_REF_FEATURE_COUNT = SuperModCorePackage.PRODUCT_SPACE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Is Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_CLASS_REF___IS_PROXY = SuperModCorePackage.PRODUCT_SPACE_ELEMENT___IS_PROXY;

	/**
	 * The operation id for the '<em>Is Visible</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_CLASS_REF___IS_VISIBLE__OPTIONBINDING_VISIBILITYEVALUATIONCACHE = SuperModCorePackage.PRODUCT_SPACE_ELEMENT___IS_VISIBLE__OPTIONBINDING_VISIBILITYEVALUATIONCACHE;

	/**
	 * The operation id for the '<em>Is Visible Hierarchically</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_CLASS_REF___IS_VISIBLE_HIERARCHICALLY__OPTIONBINDING_VISIBILITYEVALUATIONCACHE = SuperModCorePackage.PRODUCT_SPACE_ELEMENT___IS_VISIBLE_HIERARCHICALLY__OPTIONBINDING_VISIBILITYEVALUATIONCACHE;

	/**
	 * The number of operations of the '<em>EMF Class Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_CLASS_REF_OPERATION_COUNT = SuperModCorePackage.PRODUCT_SPACE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.ubt.ai1.supermod.mm.emffile.impl.EMFFeatureRefImpl <em>EMF Feature Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai1.supermod.mm.emffile.impl.EMFFeatureRefImpl
	 * @see de.ubt.ai1.supermod.mm.emffile.impl.SuperModEMFFilePackageImpl#getEMFFeatureRef()
	 * @generated
	 */
	int EMF_FEATURE_REF = 3;

	/**
	 * The feature id for the '<em><b>Super Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_FEATURE_REF__SUPER_ELEMENT = SuperModCorePackage.PRODUCT_SPACE_ELEMENT__SUPER_ELEMENT;

	/**
	 * The feature id for the '<em><b>Sub Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_FEATURE_REF__SUB_ELEMENTS = SuperModCorePackage.PRODUCT_SPACE_ELEMENT__SUB_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Super Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_FEATURE_REF__ALL_SUPER_ELEMENTS = SuperModCorePackage.PRODUCT_SPACE_ELEMENT__ALL_SUPER_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Sub Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_FEATURE_REF__ALL_SUB_ELEMENTS = SuperModCorePackage.PRODUCT_SPACE_ELEMENT__ALL_SUB_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Cross Referenced Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_FEATURE_REF__CROSS_REFERENCED_ELEMENTS = SuperModCorePackage.PRODUCT_SPACE_ELEMENT__CROSS_REFERENCED_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Cross Referencing Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_FEATURE_REF__CROSS_REFERENCING_ELEMENTS = SuperModCorePackage.PRODUCT_SPACE_ELEMENT__CROSS_REFERENCING_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Proxy UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_FEATURE_REF__PROXY_UUID = SuperModCorePackage.PRODUCT_SPACE_ELEMENT__PROXY_UUID;

	/**
	 * The feature id for the '<em><b>Transaction Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_FEATURE_REF__TRANSACTION_ID = SuperModCorePackage.PRODUCT_SPACE_ELEMENT__TRANSACTION_ID;

	/**
	 * The feature id for the '<em><b>Product Dimension</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_FEATURE_REF__PRODUCT_DIMENSION = SuperModCorePackage.PRODUCT_SPACE_ELEMENT__PRODUCT_DIMENSION;

	/**
	 * The feature id for the '<em><b>Product Space</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_FEATURE_REF__PRODUCT_SPACE = SuperModCorePackage.PRODUCT_SPACE_ELEMENT__PRODUCT_SPACE;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_FEATURE_REF__VISIBILITY = SuperModCorePackage.PRODUCT_SPACE_ELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Super Product Space Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_FEATURE_REF__SUPER_PRODUCT_SPACE_ELEMENT = SuperModCorePackage.PRODUCT_SPACE_ELEMENT__SUPER_PRODUCT_SPACE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Sub Product Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_FEATURE_REF__SUB_PRODUCT_SPACE_ELEMENTS = SuperModCorePackage.PRODUCT_SPACE_ELEMENT__SUB_PRODUCT_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Super Product Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_FEATURE_REF__ALL_SUPER_PRODUCT_SPACE_ELEMENTS = SuperModCorePackage.PRODUCT_SPACE_ELEMENT__ALL_SUPER_PRODUCT_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Sub Product Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_FEATURE_REF__ALL_SUB_PRODUCT_SPACE_ELEMENTS = SuperModCorePackage.PRODUCT_SPACE_ELEMENT__ALL_SUB_PRODUCT_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Cross Referenced Product Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_FEATURE_REF__CROSS_REFERENCED_PRODUCT_SPACE_ELEMENTS = SuperModCorePackage.PRODUCT_SPACE_ELEMENT__CROSS_REFERENCED_PRODUCT_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Cross Referencing Product Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_FEATURE_REF__CROSS_REFERENCING_PRODUCT_SPACE_ELEMENTS = SuperModCorePackage.PRODUCT_SPACE_ELEMENT__CROSS_REFERENCING_PRODUCT_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Hierarchical Visibility</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_FEATURE_REF__HIERARCHICAL_VISIBILITY = SuperModCorePackage.PRODUCT_SPACE_ELEMENT__HIERARCHICAL_VISIBILITY;

	/**
	 * The feature id for the '<em><b>Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_FEATURE_REF__VALUES = SuperModCorePackage.PRODUCT_SPACE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value Ordering</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_FEATURE_REF__VALUE_ORDERING = SuperModCorePackage.PRODUCT_SPACE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Ordered Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_FEATURE_REF__ORDERED_VALUES = SuperModCorePackage.PRODUCT_SPACE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Feature Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_FEATURE_REF__FEATURE_NAME = SuperModCorePackage.PRODUCT_SPACE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>EMF Feature Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_FEATURE_REF_FEATURE_COUNT = SuperModCorePackage.PRODUCT_SPACE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Is Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_FEATURE_REF___IS_PROXY = SuperModCorePackage.PRODUCT_SPACE_ELEMENT___IS_PROXY;

	/**
	 * The operation id for the '<em>Is Visible</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_FEATURE_REF___IS_VISIBLE__OPTIONBINDING_VISIBILITYEVALUATIONCACHE = SuperModCorePackage.PRODUCT_SPACE_ELEMENT___IS_VISIBLE__OPTIONBINDING_VISIBILITYEVALUATIONCACHE;

	/**
	 * The operation id for the '<em>Is Visible Hierarchically</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_FEATURE_REF___IS_VISIBLE_HIERARCHICALLY__OPTIONBINDING_VISIBILITYEVALUATIONCACHE = SuperModCorePackage.PRODUCT_SPACE_ELEMENT___IS_VISIBLE_HIERARCHICALLY__OPTIONBINDING_VISIBILITYEVALUATIONCACHE;

	/**
	 * The number of operations of the '<em>EMF Feature Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_FEATURE_REF_OPERATION_COUNT = SuperModCorePackage.PRODUCT_SPACE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.ubt.ai1.supermod.mm.emffile.impl.EMFValueImpl <em>EMF Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai1.supermod.mm.emffile.impl.EMFValueImpl
	 * @see de.ubt.ai1.supermod.mm.emffile.impl.SuperModEMFFilePackageImpl#getEMFValue()
	 * @generated
	 */
	int EMF_VALUE = 4;

	/**
	 * The feature id for the '<em><b>Super Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_VALUE__SUPER_ELEMENT = SuperModCorePackage.PRODUCT_SPACE_ELEMENT__SUPER_ELEMENT;

	/**
	 * The feature id for the '<em><b>Sub Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_VALUE__SUB_ELEMENTS = SuperModCorePackage.PRODUCT_SPACE_ELEMENT__SUB_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Super Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_VALUE__ALL_SUPER_ELEMENTS = SuperModCorePackage.PRODUCT_SPACE_ELEMENT__ALL_SUPER_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Sub Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_VALUE__ALL_SUB_ELEMENTS = SuperModCorePackage.PRODUCT_SPACE_ELEMENT__ALL_SUB_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Cross Referenced Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_VALUE__CROSS_REFERENCED_ELEMENTS = SuperModCorePackage.PRODUCT_SPACE_ELEMENT__CROSS_REFERENCED_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Cross Referencing Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_VALUE__CROSS_REFERENCING_ELEMENTS = SuperModCorePackage.PRODUCT_SPACE_ELEMENT__CROSS_REFERENCING_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Proxy UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_VALUE__PROXY_UUID = SuperModCorePackage.PRODUCT_SPACE_ELEMENT__PROXY_UUID;

	/**
	 * The feature id for the '<em><b>Transaction Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_VALUE__TRANSACTION_ID = SuperModCorePackage.PRODUCT_SPACE_ELEMENT__TRANSACTION_ID;

	/**
	 * The feature id for the '<em><b>Product Dimension</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_VALUE__PRODUCT_DIMENSION = SuperModCorePackage.PRODUCT_SPACE_ELEMENT__PRODUCT_DIMENSION;

	/**
	 * The feature id for the '<em><b>Product Space</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_VALUE__PRODUCT_SPACE = SuperModCorePackage.PRODUCT_SPACE_ELEMENT__PRODUCT_SPACE;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_VALUE__VISIBILITY = SuperModCorePackage.PRODUCT_SPACE_ELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Super Product Space Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_VALUE__SUPER_PRODUCT_SPACE_ELEMENT = SuperModCorePackage.PRODUCT_SPACE_ELEMENT__SUPER_PRODUCT_SPACE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Sub Product Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_VALUE__SUB_PRODUCT_SPACE_ELEMENTS = SuperModCorePackage.PRODUCT_SPACE_ELEMENT__SUB_PRODUCT_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Super Product Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_VALUE__ALL_SUPER_PRODUCT_SPACE_ELEMENTS = SuperModCorePackage.PRODUCT_SPACE_ELEMENT__ALL_SUPER_PRODUCT_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Sub Product Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_VALUE__ALL_SUB_PRODUCT_SPACE_ELEMENTS = SuperModCorePackage.PRODUCT_SPACE_ELEMENT__ALL_SUB_PRODUCT_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Cross Referenced Product Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_VALUE__CROSS_REFERENCED_PRODUCT_SPACE_ELEMENTS = SuperModCorePackage.PRODUCT_SPACE_ELEMENT__CROSS_REFERENCED_PRODUCT_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Cross Referencing Product Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_VALUE__CROSS_REFERENCING_PRODUCT_SPACE_ELEMENTS = SuperModCorePackage.PRODUCT_SPACE_ELEMENT__CROSS_REFERENCING_PRODUCT_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Hierarchical Visibility</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_VALUE__HIERARCHICAL_VISIBILITY = SuperModCorePackage.PRODUCT_SPACE_ELEMENT__HIERARCHICAL_VISIBILITY;

	/**
	 * The number of structural features of the '<em>EMF Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_VALUE_FEATURE_COUNT = SuperModCorePackage.PRODUCT_SPACE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_VALUE___IS_PROXY = SuperModCorePackage.PRODUCT_SPACE_ELEMENT___IS_PROXY;

	/**
	 * The operation id for the '<em>Is Visible</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_VALUE___IS_VISIBLE__OPTIONBINDING_VISIBILITYEVALUATIONCACHE = SuperModCorePackage.PRODUCT_SPACE_ELEMENT___IS_VISIBLE__OPTIONBINDING_VISIBILITYEVALUATIONCACHE;

	/**
	 * The operation id for the '<em>Is Visible Hierarchically</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_VALUE___IS_VISIBLE_HIERARCHICALLY__OPTIONBINDING_VISIBILITYEVALUATIONCACHE = SuperModCorePackage.PRODUCT_SPACE_ELEMENT___IS_VISIBLE_HIERARCHICALLY__OPTIONBINDING_VISIBILITYEVALUATIONCACHE;

	/**
	 * The number of operations of the '<em>EMF Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_VALUE_OPERATION_COUNT = SuperModCorePackage.PRODUCT_SPACE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.ubt.ai1.supermod.mm.emffile.impl.EMFAttributeValueImpl <em>EMF Attribute Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai1.supermod.mm.emffile.impl.EMFAttributeValueImpl
	 * @see de.ubt.ai1.supermod.mm.emffile.impl.SuperModEMFFilePackageImpl#getEMFAttributeValue()
	 * @generated
	 */
	int EMF_ATTRIBUTE_VALUE = 5;

	/**
	 * The feature id for the '<em><b>Super Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_ATTRIBUTE_VALUE__SUPER_ELEMENT = EMF_VALUE__SUPER_ELEMENT;

	/**
	 * The feature id for the '<em><b>Sub Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_ATTRIBUTE_VALUE__SUB_ELEMENTS = EMF_VALUE__SUB_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Super Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_ATTRIBUTE_VALUE__ALL_SUPER_ELEMENTS = EMF_VALUE__ALL_SUPER_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Sub Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_ATTRIBUTE_VALUE__ALL_SUB_ELEMENTS = EMF_VALUE__ALL_SUB_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Cross Referenced Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_ATTRIBUTE_VALUE__CROSS_REFERENCED_ELEMENTS = EMF_VALUE__CROSS_REFERENCED_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Cross Referencing Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_ATTRIBUTE_VALUE__CROSS_REFERENCING_ELEMENTS = EMF_VALUE__CROSS_REFERENCING_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Proxy UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_ATTRIBUTE_VALUE__PROXY_UUID = EMF_VALUE__PROXY_UUID;

	/**
	 * The feature id for the '<em><b>Transaction Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_ATTRIBUTE_VALUE__TRANSACTION_ID = EMF_VALUE__TRANSACTION_ID;

	/**
	 * The feature id for the '<em><b>Product Dimension</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_ATTRIBUTE_VALUE__PRODUCT_DIMENSION = EMF_VALUE__PRODUCT_DIMENSION;

	/**
	 * The feature id for the '<em><b>Product Space</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_ATTRIBUTE_VALUE__PRODUCT_SPACE = EMF_VALUE__PRODUCT_SPACE;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_ATTRIBUTE_VALUE__VISIBILITY = EMF_VALUE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Super Product Space Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_ATTRIBUTE_VALUE__SUPER_PRODUCT_SPACE_ELEMENT = EMF_VALUE__SUPER_PRODUCT_SPACE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Sub Product Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_ATTRIBUTE_VALUE__SUB_PRODUCT_SPACE_ELEMENTS = EMF_VALUE__SUB_PRODUCT_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Super Product Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_ATTRIBUTE_VALUE__ALL_SUPER_PRODUCT_SPACE_ELEMENTS = EMF_VALUE__ALL_SUPER_PRODUCT_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Sub Product Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_ATTRIBUTE_VALUE__ALL_SUB_PRODUCT_SPACE_ELEMENTS = EMF_VALUE__ALL_SUB_PRODUCT_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Cross Referenced Product Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_ATTRIBUTE_VALUE__CROSS_REFERENCED_PRODUCT_SPACE_ELEMENTS = EMF_VALUE__CROSS_REFERENCED_PRODUCT_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Cross Referencing Product Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_ATTRIBUTE_VALUE__CROSS_REFERENCING_PRODUCT_SPACE_ELEMENTS = EMF_VALUE__CROSS_REFERENCING_PRODUCT_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Hierarchical Visibility</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_ATTRIBUTE_VALUE__HIERARCHICAL_VISIBILITY = EMF_VALUE__HIERARCHICAL_VISIBILITY;

	/**
	 * The feature id for the '<em><b>Literal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_ATTRIBUTE_VALUE__LITERAL = EMF_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EMF Attribute Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_ATTRIBUTE_VALUE_FEATURE_COUNT = EMF_VALUE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_ATTRIBUTE_VALUE___IS_PROXY = EMF_VALUE___IS_PROXY;

	/**
	 * The operation id for the '<em>Is Visible</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_ATTRIBUTE_VALUE___IS_VISIBLE__OPTIONBINDING_VISIBILITYEVALUATIONCACHE = EMF_VALUE___IS_VISIBLE__OPTIONBINDING_VISIBILITYEVALUATIONCACHE;

	/**
	 * The operation id for the '<em>Is Visible Hierarchically</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_ATTRIBUTE_VALUE___IS_VISIBLE_HIERARCHICALLY__OPTIONBINDING_VISIBILITYEVALUATIONCACHE = EMF_VALUE___IS_VISIBLE_HIERARCHICALLY__OPTIONBINDING_VISIBILITYEVALUATIONCACHE;

	/**
	 * The number of operations of the '<em>EMF Attribute Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_ATTRIBUTE_VALUE_OPERATION_COUNT = EMF_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.ubt.ai1.supermod.mm.emffile.impl.EMFInternalReferenceValueImpl <em>EMF Internal Reference Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai1.supermod.mm.emffile.impl.EMFInternalReferenceValueImpl
	 * @see de.ubt.ai1.supermod.mm.emffile.impl.SuperModEMFFilePackageImpl#getEMFInternalReferenceValue()
	 * @generated
	 */
	int EMF_INTERNAL_REFERENCE_VALUE = 6;

	/**
	 * The feature id for the '<em><b>Super Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_INTERNAL_REFERENCE_VALUE__SUPER_ELEMENT = EMF_VALUE__SUPER_ELEMENT;

	/**
	 * The feature id for the '<em><b>Sub Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_INTERNAL_REFERENCE_VALUE__SUB_ELEMENTS = EMF_VALUE__SUB_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Super Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_INTERNAL_REFERENCE_VALUE__ALL_SUPER_ELEMENTS = EMF_VALUE__ALL_SUPER_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Sub Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_INTERNAL_REFERENCE_VALUE__ALL_SUB_ELEMENTS = EMF_VALUE__ALL_SUB_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Cross Referenced Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_INTERNAL_REFERENCE_VALUE__CROSS_REFERENCED_ELEMENTS = EMF_VALUE__CROSS_REFERENCED_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Cross Referencing Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_INTERNAL_REFERENCE_VALUE__CROSS_REFERENCING_ELEMENTS = EMF_VALUE__CROSS_REFERENCING_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Proxy UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_INTERNAL_REFERENCE_VALUE__PROXY_UUID = EMF_VALUE__PROXY_UUID;

	/**
	 * The feature id for the '<em><b>Transaction Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_INTERNAL_REFERENCE_VALUE__TRANSACTION_ID = EMF_VALUE__TRANSACTION_ID;

	/**
	 * The feature id for the '<em><b>Product Dimension</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_INTERNAL_REFERENCE_VALUE__PRODUCT_DIMENSION = EMF_VALUE__PRODUCT_DIMENSION;

	/**
	 * The feature id for the '<em><b>Product Space</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_INTERNAL_REFERENCE_VALUE__PRODUCT_SPACE = EMF_VALUE__PRODUCT_SPACE;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_INTERNAL_REFERENCE_VALUE__VISIBILITY = EMF_VALUE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Super Product Space Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_INTERNAL_REFERENCE_VALUE__SUPER_PRODUCT_SPACE_ELEMENT = EMF_VALUE__SUPER_PRODUCT_SPACE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Sub Product Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_INTERNAL_REFERENCE_VALUE__SUB_PRODUCT_SPACE_ELEMENTS = EMF_VALUE__SUB_PRODUCT_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Super Product Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_INTERNAL_REFERENCE_VALUE__ALL_SUPER_PRODUCT_SPACE_ELEMENTS = EMF_VALUE__ALL_SUPER_PRODUCT_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Sub Product Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_INTERNAL_REFERENCE_VALUE__ALL_SUB_PRODUCT_SPACE_ELEMENTS = EMF_VALUE__ALL_SUB_PRODUCT_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Cross Referenced Product Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_INTERNAL_REFERENCE_VALUE__CROSS_REFERENCED_PRODUCT_SPACE_ELEMENTS = EMF_VALUE__CROSS_REFERENCED_PRODUCT_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Cross Referencing Product Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_INTERNAL_REFERENCE_VALUE__CROSS_REFERENCING_PRODUCT_SPACE_ELEMENTS = EMF_VALUE__CROSS_REFERENCING_PRODUCT_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Hierarchical Visibility</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_INTERNAL_REFERENCE_VALUE__HIERARCHICAL_VISIBILITY = EMF_VALUE__HIERARCHICAL_VISIBILITY;

	/**
	 * The feature id for the '<em><b>Referenced Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_INTERNAL_REFERENCE_VALUE__REFERENCED_OBJECT = EMF_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EMF Internal Reference Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_INTERNAL_REFERENCE_VALUE_FEATURE_COUNT = EMF_VALUE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_INTERNAL_REFERENCE_VALUE___IS_PROXY = EMF_VALUE___IS_PROXY;

	/**
	 * The operation id for the '<em>Is Visible</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_INTERNAL_REFERENCE_VALUE___IS_VISIBLE__OPTIONBINDING_VISIBILITYEVALUATIONCACHE = EMF_VALUE___IS_VISIBLE__OPTIONBINDING_VISIBILITYEVALUATIONCACHE;

	/**
	 * The operation id for the '<em>Is Visible Hierarchically</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_INTERNAL_REFERENCE_VALUE___IS_VISIBLE_HIERARCHICALLY__OPTIONBINDING_VISIBILITYEVALUATIONCACHE = EMF_VALUE___IS_VISIBLE_HIERARCHICALLY__OPTIONBINDING_VISIBILITYEVALUATIONCACHE;

	/**
	 * The number of operations of the '<em>EMF Internal Reference Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_INTERNAL_REFERENCE_VALUE_OPERATION_COUNT = EMF_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.ubt.ai1.supermod.mm.emffile.impl.EMFExternalReferenceValueImpl <em>EMF External Reference Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai1.supermod.mm.emffile.impl.EMFExternalReferenceValueImpl
	 * @see de.ubt.ai1.supermod.mm.emffile.impl.SuperModEMFFilePackageImpl#getEMFExternalReferenceValue()
	 * @generated
	 */
	int EMF_EXTERNAL_REFERENCE_VALUE = 7;

	/**
	 * The feature id for the '<em><b>Super Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_EXTERNAL_REFERENCE_VALUE__SUPER_ELEMENT = EMF_VALUE__SUPER_ELEMENT;

	/**
	 * The feature id for the '<em><b>Sub Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_EXTERNAL_REFERENCE_VALUE__SUB_ELEMENTS = EMF_VALUE__SUB_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Super Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_EXTERNAL_REFERENCE_VALUE__ALL_SUPER_ELEMENTS = EMF_VALUE__ALL_SUPER_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Sub Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_EXTERNAL_REFERENCE_VALUE__ALL_SUB_ELEMENTS = EMF_VALUE__ALL_SUB_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Cross Referenced Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_EXTERNAL_REFERENCE_VALUE__CROSS_REFERENCED_ELEMENTS = EMF_VALUE__CROSS_REFERENCED_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Cross Referencing Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_EXTERNAL_REFERENCE_VALUE__CROSS_REFERENCING_ELEMENTS = EMF_VALUE__CROSS_REFERENCING_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Proxy UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_EXTERNAL_REFERENCE_VALUE__PROXY_UUID = EMF_VALUE__PROXY_UUID;

	/**
	 * The feature id for the '<em><b>Transaction Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_EXTERNAL_REFERENCE_VALUE__TRANSACTION_ID = EMF_VALUE__TRANSACTION_ID;

	/**
	 * The feature id for the '<em><b>Product Dimension</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_EXTERNAL_REFERENCE_VALUE__PRODUCT_DIMENSION = EMF_VALUE__PRODUCT_DIMENSION;

	/**
	 * The feature id for the '<em><b>Product Space</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_EXTERNAL_REFERENCE_VALUE__PRODUCT_SPACE = EMF_VALUE__PRODUCT_SPACE;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_EXTERNAL_REFERENCE_VALUE__VISIBILITY = EMF_VALUE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Super Product Space Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_EXTERNAL_REFERENCE_VALUE__SUPER_PRODUCT_SPACE_ELEMENT = EMF_VALUE__SUPER_PRODUCT_SPACE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Sub Product Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_EXTERNAL_REFERENCE_VALUE__SUB_PRODUCT_SPACE_ELEMENTS = EMF_VALUE__SUB_PRODUCT_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Super Product Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_EXTERNAL_REFERENCE_VALUE__ALL_SUPER_PRODUCT_SPACE_ELEMENTS = EMF_VALUE__ALL_SUPER_PRODUCT_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Sub Product Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_EXTERNAL_REFERENCE_VALUE__ALL_SUB_PRODUCT_SPACE_ELEMENTS = EMF_VALUE__ALL_SUB_PRODUCT_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Cross Referenced Product Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_EXTERNAL_REFERENCE_VALUE__CROSS_REFERENCED_PRODUCT_SPACE_ELEMENTS = EMF_VALUE__CROSS_REFERENCED_PRODUCT_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Cross Referencing Product Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_EXTERNAL_REFERENCE_VALUE__CROSS_REFERENCING_PRODUCT_SPACE_ELEMENTS = EMF_VALUE__CROSS_REFERENCING_PRODUCT_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Hierarchical Visibility</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_EXTERNAL_REFERENCE_VALUE__HIERARCHICAL_VISIBILITY = EMF_VALUE__HIERARCHICAL_VISIBILITY;

	/**
	 * The feature id for the '<em><b>EObject Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_EXTERNAL_REFERENCE_VALUE__EOBJECT_URI = EMF_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EMF External Reference Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_EXTERNAL_REFERENCE_VALUE_FEATURE_COUNT = EMF_VALUE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_EXTERNAL_REFERENCE_VALUE___IS_PROXY = EMF_VALUE___IS_PROXY;

	/**
	 * The operation id for the '<em>Is Visible</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_EXTERNAL_REFERENCE_VALUE___IS_VISIBLE__OPTIONBINDING_VISIBILITYEVALUATIONCACHE = EMF_VALUE___IS_VISIBLE__OPTIONBINDING_VISIBILITYEVALUATIONCACHE;

	/**
	 * The operation id for the '<em>Is Visible Hierarchically</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_EXTERNAL_REFERENCE_VALUE___IS_VISIBLE_HIERARCHICALLY__OPTIONBINDING_VISIBILITYEVALUATIONCACHE = EMF_VALUE___IS_VISIBLE_HIERARCHICALLY__OPTIONBINDING_VISIBILITYEVALUATIONCACHE;

	/**
	 * The number of operations of the '<em>EMF External Reference Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_EXTERNAL_REFERENCE_VALUE_OPERATION_COUNT = EMF_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.ubt.ai1.supermod.mm.emffile.impl.EMFContainmentReferenceValueImpl <em>EMF Containment Reference Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai1.supermod.mm.emffile.impl.EMFContainmentReferenceValueImpl
	 * @see de.ubt.ai1.supermod.mm.emffile.impl.SuperModEMFFilePackageImpl#getEMFContainmentReferenceValue()
	 * @generated
	 */
	int EMF_CONTAINMENT_REFERENCE_VALUE = 8;

	/**
	 * The feature id for the '<em><b>Super Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_CONTAINMENT_REFERENCE_VALUE__SUPER_ELEMENT = EMF_INTERNAL_REFERENCE_VALUE__SUPER_ELEMENT;

	/**
	 * The feature id for the '<em><b>Sub Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_CONTAINMENT_REFERENCE_VALUE__SUB_ELEMENTS = EMF_INTERNAL_REFERENCE_VALUE__SUB_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Super Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_CONTAINMENT_REFERENCE_VALUE__ALL_SUPER_ELEMENTS = EMF_INTERNAL_REFERENCE_VALUE__ALL_SUPER_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Sub Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_CONTAINMENT_REFERENCE_VALUE__ALL_SUB_ELEMENTS = EMF_INTERNAL_REFERENCE_VALUE__ALL_SUB_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Cross Referenced Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_CONTAINMENT_REFERENCE_VALUE__CROSS_REFERENCED_ELEMENTS = EMF_INTERNAL_REFERENCE_VALUE__CROSS_REFERENCED_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Cross Referencing Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_CONTAINMENT_REFERENCE_VALUE__CROSS_REFERENCING_ELEMENTS = EMF_INTERNAL_REFERENCE_VALUE__CROSS_REFERENCING_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Proxy UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_CONTAINMENT_REFERENCE_VALUE__PROXY_UUID = EMF_INTERNAL_REFERENCE_VALUE__PROXY_UUID;

	/**
	 * The feature id for the '<em><b>Transaction Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_CONTAINMENT_REFERENCE_VALUE__TRANSACTION_ID = EMF_INTERNAL_REFERENCE_VALUE__TRANSACTION_ID;

	/**
	 * The feature id for the '<em><b>Product Dimension</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_CONTAINMENT_REFERENCE_VALUE__PRODUCT_DIMENSION = EMF_INTERNAL_REFERENCE_VALUE__PRODUCT_DIMENSION;

	/**
	 * The feature id for the '<em><b>Product Space</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_CONTAINMENT_REFERENCE_VALUE__PRODUCT_SPACE = EMF_INTERNAL_REFERENCE_VALUE__PRODUCT_SPACE;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_CONTAINMENT_REFERENCE_VALUE__VISIBILITY = EMF_INTERNAL_REFERENCE_VALUE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Super Product Space Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_CONTAINMENT_REFERENCE_VALUE__SUPER_PRODUCT_SPACE_ELEMENT = EMF_INTERNAL_REFERENCE_VALUE__SUPER_PRODUCT_SPACE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Sub Product Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_CONTAINMENT_REFERENCE_VALUE__SUB_PRODUCT_SPACE_ELEMENTS = EMF_INTERNAL_REFERENCE_VALUE__SUB_PRODUCT_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Super Product Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_CONTAINMENT_REFERENCE_VALUE__ALL_SUPER_PRODUCT_SPACE_ELEMENTS = EMF_INTERNAL_REFERENCE_VALUE__ALL_SUPER_PRODUCT_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Sub Product Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_CONTAINMENT_REFERENCE_VALUE__ALL_SUB_PRODUCT_SPACE_ELEMENTS = EMF_INTERNAL_REFERENCE_VALUE__ALL_SUB_PRODUCT_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Cross Referenced Product Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_CONTAINMENT_REFERENCE_VALUE__CROSS_REFERENCED_PRODUCT_SPACE_ELEMENTS = EMF_INTERNAL_REFERENCE_VALUE__CROSS_REFERENCED_PRODUCT_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Cross Referencing Product Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_CONTAINMENT_REFERENCE_VALUE__CROSS_REFERENCING_PRODUCT_SPACE_ELEMENTS = EMF_INTERNAL_REFERENCE_VALUE__CROSS_REFERENCING_PRODUCT_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Hierarchical Visibility</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_CONTAINMENT_REFERENCE_VALUE__HIERARCHICAL_VISIBILITY = EMF_INTERNAL_REFERENCE_VALUE__HIERARCHICAL_VISIBILITY;

	/**
	 * The feature id for the '<em><b>Referenced Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_CONTAINMENT_REFERENCE_VALUE__REFERENCED_OBJECT = EMF_INTERNAL_REFERENCE_VALUE__REFERENCED_OBJECT;

	/**
	 * The number of structural features of the '<em>EMF Containment Reference Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_CONTAINMENT_REFERENCE_VALUE_FEATURE_COUNT = EMF_INTERNAL_REFERENCE_VALUE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_CONTAINMENT_REFERENCE_VALUE___IS_PROXY = EMF_INTERNAL_REFERENCE_VALUE___IS_PROXY;

	/**
	 * The operation id for the '<em>Is Visible</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_CONTAINMENT_REFERENCE_VALUE___IS_VISIBLE__OPTIONBINDING_VISIBILITYEVALUATIONCACHE = EMF_INTERNAL_REFERENCE_VALUE___IS_VISIBLE__OPTIONBINDING_VISIBILITYEVALUATIONCACHE;

	/**
	 * The operation id for the '<em>Is Visible Hierarchically</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_CONTAINMENT_REFERENCE_VALUE___IS_VISIBLE_HIERARCHICALLY__OPTIONBINDING_VISIBILITYEVALUATIONCACHE = EMF_INTERNAL_REFERENCE_VALUE___IS_VISIBLE_HIERARCHICALLY__OPTIONBINDING_VISIBILITYEVALUATIONCACHE;

	/**
	 * The number of operations of the '<em>EMF Containment Reference Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_CONTAINMENT_REFERENCE_VALUE_OPERATION_COUNT = EMF_INTERNAL_REFERENCE_VALUE_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link de.ubt.ai1.supermod.mm.emffile.EMFFileContent <em>EMF File Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EMF File Content</em>'.
	 * @see de.ubt.ai1.supermod.mm.emffile.EMFFileContent
	 * @generated
	 */
	EClass getEMFFileContent();

	/**
	 * Returns the meta object for the containment reference list '{@link de.ubt.ai1.supermod.mm.emffile.EMFFileContent#getObjects <em>Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Objects</em>'.
	 * @see de.ubt.ai1.supermod.mm.emffile.EMFFileContent#getObjects()
	 * @see #getEMFFileContent()
	 * @generated
	 */
	EReference getEMFFileContent_Objects();

	/**
	 * Returns the meta object for the reference list '{@link de.ubt.ai1.supermod.mm.emffile.EMFFileContent#getRoots <em>Roots</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Roots</em>'.
	 * @see de.ubt.ai1.supermod.mm.emffile.EMFFileContent#getRoots()
	 * @see #getEMFFileContent()
	 * @generated
	 */
	EReference getEMFFileContent_Roots();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai1.supermod.mm.emffile.EMFObject <em>EMF Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EMF Object</em>'.
	 * @see de.ubt.ai1.supermod.mm.emffile.EMFObject
	 * @generated
	 */
	EClass getEMFObject();

	/**
	 * Returns the meta object for the containment reference list '{@link de.ubt.ai1.supermod.mm.emffile.EMFObject#getClassRefs <em>Class Refs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Class Refs</em>'.
	 * @see de.ubt.ai1.supermod.mm.emffile.EMFObject#getClassRefs()
	 * @see #getEMFObject()
	 * @generated
	 */
	EReference getEMFObject_ClassRefs();

	/**
	 * Returns the meta object for the containment reference list '{@link de.ubt.ai1.supermod.mm.emffile.EMFObject#getFeatureRefs <em>Feature Refs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Feature Refs</em>'.
	 * @see de.ubt.ai1.supermod.mm.emffile.EMFObject#getFeatureRefs()
	 * @see #getEMFObject()
	 * @generated
	 */
	EReference getEMFObject_FeatureRefs();

	/**
	 * Returns the meta object for the reference list '{@link de.ubt.ai1.supermod.mm.emffile.EMFObject#getTargetingRefVals <em>Targeting Ref Vals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Targeting Ref Vals</em>'.
	 * @see de.ubt.ai1.supermod.mm.emffile.EMFObject#getTargetingRefVals()
	 * @see #getEMFObject()
	 * @generated
	 */
	EReference getEMFObject_TargetingRefVals();

	/**
	 * Returns the meta object for the reference list '{@link de.ubt.ai1.supermod.mm.emffile.EMFObject#getTargetingContainmentRefVals <em>Targeting Containment Ref Vals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Targeting Containment Ref Vals</em>'.
	 * @see de.ubt.ai1.supermod.mm.emffile.EMFObject#getTargetingContainmentRefVals()
	 * @see #getEMFObject()
	 * @generated
	 */
	EReference getEMFObject_TargetingContainmentRefVals();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai1.supermod.mm.emffile.EMFClassRef <em>EMF Class Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EMF Class Ref</em>'.
	 * @see de.ubt.ai1.supermod.mm.emffile.EMFClassRef
	 * @generated
	 */
	EClass getEMFClassRef();

	/**
	 * Returns the meta object for the attribute '{@link de.ubt.ai1.supermod.mm.emffile.EMFClassRef#getPackageUri <em>Package Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Package Uri</em>'.
	 * @see de.ubt.ai1.supermod.mm.emffile.EMFClassRef#getPackageUri()
	 * @see #getEMFClassRef()
	 * @generated
	 */
	EAttribute getEMFClassRef_PackageUri();

	/**
	 * Returns the meta object for the attribute '{@link de.ubt.ai1.supermod.mm.emffile.EMFClassRef#getClassName <em>Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Name</em>'.
	 * @see de.ubt.ai1.supermod.mm.emffile.EMFClassRef#getClassName()
	 * @see #getEMFClassRef()
	 * @generated
	 */
	EAttribute getEMFClassRef_ClassName();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai1.supermod.mm.emffile.EMFFeatureRef <em>EMF Feature Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EMF Feature Ref</em>'.
	 * @see de.ubt.ai1.supermod.mm.emffile.EMFFeatureRef
	 * @generated
	 */
	EClass getEMFFeatureRef();

	/**
	 * Returns the meta object for the containment reference list '{@link de.ubt.ai1.supermod.mm.emffile.EMFFeatureRef#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Values</em>'.
	 * @see de.ubt.ai1.supermod.mm.emffile.EMFFeatureRef#getValues()
	 * @see #getEMFFeatureRef()
	 * @generated
	 */
	EReference getEMFFeatureRef_Values();

	/**
	 * Returns the meta object for the containment reference '{@link de.ubt.ai1.supermod.mm.emffile.EMFFeatureRef#getValueOrdering <em>Value Ordering</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value Ordering</em>'.
	 * @see de.ubt.ai1.supermod.mm.emffile.EMFFeatureRef#getValueOrdering()
	 * @see #getEMFFeatureRef()
	 * @generated
	 */
	EReference getEMFFeatureRef_ValueOrdering();

	/**
	 * Returns the meta object for the reference list '{@link de.ubt.ai1.supermod.mm.emffile.EMFFeatureRef#getOrderedValues <em>Ordered Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ordered Values</em>'.
	 * @see de.ubt.ai1.supermod.mm.emffile.EMFFeatureRef#getOrderedValues()
	 * @see #getEMFFeatureRef()
	 * @generated
	 */
	EReference getEMFFeatureRef_OrderedValues();

	/**
	 * Returns the meta object for the attribute '{@link de.ubt.ai1.supermod.mm.emffile.EMFFeatureRef#getFeatureName <em>Feature Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Feature Name</em>'.
	 * @see de.ubt.ai1.supermod.mm.emffile.EMFFeatureRef#getFeatureName()
	 * @see #getEMFFeatureRef()
	 * @generated
	 */
	EAttribute getEMFFeatureRef_FeatureName();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai1.supermod.mm.emffile.EMFValue <em>EMF Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EMF Value</em>'.
	 * @see de.ubt.ai1.supermod.mm.emffile.EMFValue
	 * @generated
	 */
	EClass getEMFValue();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai1.supermod.mm.emffile.EMFAttributeValue <em>EMF Attribute Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EMF Attribute Value</em>'.
	 * @see de.ubt.ai1.supermod.mm.emffile.EMFAttributeValue
	 * @generated
	 */
	EClass getEMFAttributeValue();

	/**
	 * Returns the meta object for the attribute '{@link de.ubt.ai1.supermod.mm.emffile.EMFAttributeValue#getLiteral <em>Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Literal</em>'.
	 * @see de.ubt.ai1.supermod.mm.emffile.EMFAttributeValue#getLiteral()
	 * @see #getEMFAttributeValue()
	 * @generated
	 */
	EAttribute getEMFAttributeValue_Literal();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai1.supermod.mm.emffile.EMFInternalReferenceValue <em>EMF Internal Reference Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EMF Internal Reference Value</em>'.
	 * @see de.ubt.ai1.supermod.mm.emffile.EMFInternalReferenceValue
	 * @generated
	 */
	EClass getEMFInternalReferenceValue();

	/**
	 * Returns the meta object for the reference '{@link de.ubt.ai1.supermod.mm.emffile.EMFInternalReferenceValue#getReferencedObject <em>Referenced Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Referenced Object</em>'.
	 * @see de.ubt.ai1.supermod.mm.emffile.EMFInternalReferenceValue#getReferencedObject()
	 * @see #getEMFInternalReferenceValue()
	 * @generated
	 */
	EReference getEMFInternalReferenceValue_ReferencedObject();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai1.supermod.mm.emffile.EMFExternalReferenceValue <em>EMF External Reference Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EMF External Reference Value</em>'.
	 * @see de.ubt.ai1.supermod.mm.emffile.EMFExternalReferenceValue
	 * @generated
	 */
	EClass getEMFExternalReferenceValue();

	/**
	 * Returns the meta object for the attribute '{@link de.ubt.ai1.supermod.mm.emffile.EMFExternalReferenceValue#getEObjectUri <em>EObject Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>EObject Uri</em>'.
	 * @see de.ubt.ai1.supermod.mm.emffile.EMFExternalReferenceValue#getEObjectUri()
	 * @see #getEMFExternalReferenceValue()
	 * @generated
	 */
	EAttribute getEMFExternalReferenceValue_EObjectUri();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai1.supermod.mm.emffile.EMFContainmentReferenceValue <em>EMF Containment Reference Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EMF Containment Reference Value</em>'.
	 * @see de.ubt.ai1.supermod.mm.emffile.EMFContainmentReferenceValue
	 * @generated
	 */
	EClass getEMFContainmentReferenceValue();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SuperModEMFFileFactory getSuperModEMFFileFactory();

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
		 * The meta object literal for the '{@link de.ubt.ai1.supermod.mm.emffile.impl.EMFFileContentImpl <em>EMF File Content</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai1.supermod.mm.emffile.impl.EMFFileContentImpl
		 * @see de.ubt.ai1.supermod.mm.emffile.impl.SuperModEMFFilePackageImpl#getEMFFileContent()
		 * @generated
		 */
		EClass EMF_FILE_CONTENT = eINSTANCE.getEMFFileContent();

		/**
		 * The meta object literal for the '<em><b>Objects</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMF_FILE_CONTENT__OBJECTS = eINSTANCE.getEMFFileContent_Objects();

		/**
		 * The meta object literal for the '<em><b>Roots</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMF_FILE_CONTENT__ROOTS = eINSTANCE.getEMFFileContent_Roots();

		/**
		 * The meta object literal for the '{@link de.ubt.ai1.supermod.mm.emffile.impl.EMFObjectImpl <em>EMF Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai1.supermod.mm.emffile.impl.EMFObjectImpl
		 * @see de.ubt.ai1.supermod.mm.emffile.impl.SuperModEMFFilePackageImpl#getEMFObject()
		 * @generated
		 */
		EClass EMF_OBJECT = eINSTANCE.getEMFObject();

		/**
		 * The meta object literal for the '<em><b>Class Refs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMF_OBJECT__CLASS_REFS = eINSTANCE.getEMFObject_ClassRefs();

		/**
		 * The meta object literal for the '<em><b>Feature Refs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMF_OBJECT__FEATURE_REFS = eINSTANCE.getEMFObject_FeatureRefs();

		/**
		 * The meta object literal for the '<em><b>Targeting Ref Vals</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMF_OBJECT__TARGETING_REF_VALS = eINSTANCE.getEMFObject_TargetingRefVals();

		/**
		 * The meta object literal for the '<em><b>Targeting Containment Ref Vals</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMF_OBJECT__TARGETING_CONTAINMENT_REF_VALS = eINSTANCE.getEMFObject_TargetingContainmentRefVals();

		/**
		 * The meta object literal for the '{@link de.ubt.ai1.supermod.mm.emffile.impl.EMFClassRefImpl <em>EMF Class Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai1.supermod.mm.emffile.impl.EMFClassRefImpl
		 * @see de.ubt.ai1.supermod.mm.emffile.impl.SuperModEMFFilePackageImpl#getEMFClassRef()
		 * @generated
		 */
		EClass EMF_CLASS_REF = eINSTANCE.getEMFClassRef();

		/**
		 * The meta object literal for the '<em><b>Package Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMF_CLASS_REF__PACKAGE_URI = eINSTANCE.getEMFClassRef_PackageUri();

		/**
		 * The meta object literal for the '<em><b>Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMF_CLASS_REF__CLASS_NAME = eINSTANCE.getEMFClassRef_ClassName();

		/**
		 * The meta object literal for the '{@link de.ubt.ai1.supermod.mm.emffile.impl.EMFFeatureRefImpl <em>EMF Feature Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai1.supermod.mm.emffile.impl.EMFFeatureRefImpl
		 * @see de.ubt.ai1.supermod.mm.emffile.impl.SuperModEMFFilePackageImpl#getEMFFeatureRef()
		 * @generated
		 */
		EClass EMF_FEATURE_REF = eINSTANCE.getEMFFeatureRef();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMF_FEATURE_REF__VALUES = eINSTANCE.getEMFFeatureRef_Values();

		/**
		 * The meta object literal for the '<em><b>Value Ordering</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMF_FEATURE_REF__VALUE_ORDERING = eINSTANCE.getEMFFeatureRef_ValueOrdering();

		/**
		 * The meta object literal for the '<em><b>Ordered Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMF_FEATURE_REF__ORDERED_VALUES = eINSTANCE.getEMFFeatureRef_OrderedValues();

		/**
		 * The meta object literal for the '<em><b>Feature Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMF_FEATURE_REF__FEATURE_NAME = eINSTANCE.getEMFFeatureRef_FeatureName();

		/**
		 * The meta object literal for the '{@link de.ubt.ai1.supermod.mm.emffile.impl.EMFValueImpl <em>EMF Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai1.supermod.mm.emffile.impl.EMFValueImpl
		 * @see de.ubt.ai1.supermod.mm.emffile.impl.SuperModEMFFilePackageImpl#getEMFValue()
		 * @generated
		 */
		EClass EMF_VALUE = eINSTANCE.getEMFValue();

		/**
		 * The meta object literal for the '{@link de.ubt.ai1.supermod.mm.emffile.impl.EMFAttributeValueImpl <em>EMF Attribute Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai1.supermod.mm.emffile.impl.EMFAttributeValueImpl
		 * @see de.ubt.ai1.supermod.mm.emffile.impl.SuperModEMFFilePackageImpl#getEMFAttributeValue()
		 * @generated
		 */
		EClass EMF_ATTRIBUTE_VALUE = eINSTANCE.getEMFAttributeValue();

		/**
		 * The meta object literal for the '<em><b>Literal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMF_ATTRIBUTE_VALUE__LITERAL = eINSTANCE.getEMFAttributeValue_Literal();

		/**
		 * The meta object literal for the '{@link de.ubt.ai1.supermod.mm.emffile.impl.EMFInternalReferenceValueImpl <em>EMF Internal Reference Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai1.supermod.mm.emffile.impl.EMFInternalReferenceValueImpl
		 * @see de.ubt.ai1.supermod.mm.emffile.impl.SuperModEMFFilePackageImpl#getEMFInternalReferenceValue()
		 * @generated
		 */
		EClass EMF_INTERNAL_REFERENCE_VALUE = eINSTANCE.getEMFInternalReferenceValue();

		/**
		 * The meta object literal for the '<em><b>Referenced Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMF_INTERNAL_REFERENCE_VALUE__REFERENCED_OBJECT = eINSTANCE.getEMFInternalReferenceValue_ReferencedObject();

		/**
		 * The meta object literal for the '{@link de.ubt.ai1.supermod.mm.emffile.impl.EMFExternalReferenceValueImpl <em>EMF External Reference Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai1.supermod.mm.emffile.impl.EMFExternalReferenceValueImpl
		 * @see de.ubt.ai1.supermod.mm.emffile.impl.SuperModEMFFilePackageImpl#getEMFExternalReferenceValue()
		 * @generated
		 */
		EClass EMF_EXTERNAL_REFERENCE_VALUE = eINSTANCE.getEMFExternalReferenceValue();

		/**
		 * The meta object literal for the '<em><b>EObject Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMF_EXTERNAL_REFERENCE_VALUE__EOBJECT_URI = eINSTANCE.getEMFExternalReferenceValue_EObjectUri();

		/**
		 * The meta object literal for the '{@link de.ubt.ai1.supermod.mm.emffile.impl.EMFContainmentReferenceValueImpl <em>EMF Containment Reference Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai1.supermod.mm.emffile.impl.EMFContainmentReferenceValueImpl
		 * @see de.ubt.ai1.supermod.mm.emffile.impl.SuperModEMFFilePackageImpl#getEMFContainmentReferenceValue()
		 * @generated
		 */
		EClass EMF_CONTAINMENT_REFERENCE_VALUE = eINSTANCE.getEMFContainmentReferenceValue();

	}

} //SuperModEMFFilePackage
