/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.mm.file;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import de.ubt.ai1.supermod.mm.core.ProductDimension;
import de.ubt.ai1.supermod.mm.core.SuperModCorePackage;

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
 * The SuperMod file meta-model represents a hierarchically organized file system
 * in a multi-version representation as a product dimension.
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date 	2014-07-28
 * @see		ProductDimension
 * <!-- end-user-doc -->
 * @see de.ubt.ai1.supermod.mm.file.SuperModFileFactory
 * @model kind="package"
 * @generated
 */
public interface SuperModFilePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "file";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://ai1.uni-bayreuth.de/supermod/file/0.1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "de.ubt.ai1.supermod.mm.file";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SuperModFilePackage eINSTANCE = de.ubt.ai1.supermod.mm.file.impl.SuperModFilePackageImpl.init();

	/**
	 * The meta object id for the '{@link de.ubt.ai1.supermod.mm.file.impl.VersionedFileSystemImpl <em>Versioned File System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai1.supermod.mm.file.impl.VersionedFileSystemImpl
	 * @see de.ubt.ai1.supermod.mm.file.impl.SuperModFilePackageImpl#getVersionedFileSystem()
	 * @generated
	 */
	int VERSIONED_FILE_SYSTEM = 0;

	/**
	 * The feature id for the '<em><b>Dimension Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_FILE_SYSTEM__DIMENSION_NAME = SuperModCorePackage.PRODUCT_DIMENSION__DIMENSION_NAME;

	/**
	 * The feature id for the '<em><b>Root Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_FILE_SYSTEM__ROOT_ELEMENTS = SuperModCorePackage.PRODUCT_DIMENSION__ROOT_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_FILE_SYSTEM__ALL_ELEMENTS = SuperModCorePackage.PRODUCT_DIMENSION__ALL_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Root Product Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_FILE_SYSTEM__ROOT_PRODUCT_SPACE_ELEMENTS = SuperModCorePackage.PRODUCT_DIMENSION__ROOT_PRODUCT_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Product Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_FILE_SYSTEM__ALL_PRODUCT_SPACE_ELEMENTS = SuperModCorePackage.PRODUCT_DIMENSION__ALL_PRODUCT_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Product Space</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_FILE_SYSTEM__PRODUCT_SPACE = SuperModCorePackage.PRODUCT_DIMENSION__PRODUCT_SPACE;

	/**
	 * The feature id for the '<em><b>Roots</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_FILE_SYSTEM__ROOTS = SuperModCorePackage.PRODUCT_DIMENSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>All Resources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_FILE_SYSTEM__ALL_RESOURCES = SuperModCorePackage.PRODUCT_DIMENSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Versioned File System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_FILE_SYSTEM_FEATURE_COUNT = SuperModCorePackage.PRODUCT_DIMENSION_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Resource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_FILE_SYSTEM___GET_RESOURCE__STRING = SuperModCorePackage.PRODUCT_DIMENSION_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Create File</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_FILE_SYSTEM___CREATE_FILE__STRING = SuperModCorePackage.PRODUCT_DIMENSION_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Create Folder</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_FILE_SYSTEM___CREATE_FOLDER__STRING = SuperModCorePackage.PRODUCT_DIMENSION_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Versioned File System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_FILE_SYSTEM_OPERATION_COUNT = SuperModCorePackage.PRODUCT_DIMENSION_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link de.ubt.ai1.supermod.mm.file.impl.VersionedResourceImpl <em>Versioned Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai1.supermod.mm.file.impl.VersionedResourceImpl
	 * @see de.ubt.ai1.supermod.mm.file.impl.SuperModFilePackageImpl#getVersionedResource()
	 * @generated
	 */
	int VERSIONED_RESOURCE = 1;

	/**
	 * The feature id for the '<em><b>Super Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_RESOURCE__SUPER_ELEMENT = SuperModCorePackage.PRODUCT_SPACE_ELEMENT__SUPER_ELEMENT;

	/**
	 * The feature id for the '<em><b>Sub Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_RESOURCE__SUB_ELEMENTS = SuperModCorePackage.PRODUCT_SPACE_ELEMENT__SUB_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Super Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_RESOURCE__ALL_SUPER_ELEMENTS = SuperModCorePackage.PRODUCT_SPACE_ELEMENT__ALL_SUPER_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Sub Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_RESOURCE__ALL_SUB_ELEMENTS = SuperModCorePackage.PRODUCT_SPACE_ELEMENT__ALL_SUB_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Cross Referenced Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_RESOURCE__CROSS_REFERENCED_ELEMENTS = SuperModCorePackage.PRODUCT_SPACE_ELEMENT__CROSS_REFERENCED_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Cross Referencing Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_RESOURCE__CROSS_REFERENCING_ELEMENTS = SuperModCorePackage.PRODUCT_SPACE_ELEMENT__CROSS_REFERENCING_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Proxy UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_RESOURCE__PROXY_UUID = SuperModCorePackage.PRODUCT_SPACE_ELEMENT__PROXY_UUID;

	/**
	 * The feature id for the '<em><b>Transaction Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_RESOURCE__TRANSACTION_ID = SuperModCorePackage.PRODUCT_SPACE_ELEMENT__TRANSACTION_ID;

	/**
	 * The feature id for the '<em><b>Product Dimension</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_RESOURCE__PRODUCT_DIMENSION = SuperModCorePackage.PRODUCT_SPACE_ELEMENT__PRODUCT_DIMENSION;

	/**
	 * The feature id for the '<em><b>Product Space</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_RESOURCE__PRODUCT_SPACE = SuperModCorePackage.PRODUCT_SPACE_ELEMENT__PRODUCT_SPACE;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_RESOURCE__VISIBILITY = SuperModCorePackage.PRODUCT_SPACE_ELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Super Product Space Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_RESOURCE__SUPER_PRODUCT_SPACE_ELEMENT = SuperModCorePackage.PRODUCT_SPACE_ELEMENT__SUPER_PRODUCT_SPACE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Sub Product Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_RESOURCE__SUB_PRODUCT_SPACE_ELEMENTS = SuperModCorePackage.PRODUCT_SPACE_ELEMENT__SUB_PRODUCT_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Super Product Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_RESOURCE__ALL_SUPER_PRODUCT_SPACE_ELEMENTS = SuperModCorePackage.PRODUCT_SPACE_ELEMENT__ALL_SUPER_PRODUCT_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Sub Product Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_RESOURCE__ALL_SUB_PRODUCT_SPACE_ELEMENTS = SuperModCorePackage.PRODUCT_SPACE_ELEMENT__ALL_SUB_PRODUCT_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Cross Referenced Product Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_RESOURCE__CROSS_REFERENCED_PRODUCT_SPACE_ELEMENTS = SuperModCorePackage.PRODUCT_SPACE_ELEMENT__CROSS_REFERENCED_PRODUCT_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Cross Referencing Product Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_RESOURCE__CROSS_REFERENCING_PRODUCT_SPACE_ELEMENTS = SuperModCorePackage.PRODUCT_SPACE_ELEMENT__CROSS_REFERENCING_PRODUCT_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Hierarchical Visibility</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_RESOURCE__HIERARCHICAL_VISIBILITY = SuperModCorePackage.PRODUCT_SPACE_ELEMENT__HIERARCHICAL_VISIBILITY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_RESOURCE__NAME = SuperModCorePackage.PRODUCT_SPACE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_RESOURCE__PATH = SuperModCorePackage.PRODUCT_SPACE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_RESOURCE__CONTAINER = SuperModCorePackage.PRODUCT_SPACE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Versioned Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_RESOURCE_FEATURE_COUNT = SuperModCorePackage.PRODUCT_SPACE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Is Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_RESOURCE___IS_PROXY = SuperModCorePackage.PRODUCT_SPACE_ELEMENT___IS_PROXY;

	/**
	 * The operation id for the '<em>Is Visible</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_RESOURCE___IS_VISIBLE__OPTIONBINDING_VISIBILITYEVALUATIONCACHE = SuperModCorePackage.PRODUCT_SPACE_ELEMENT___IS_VISIBLE__OPTIONBINDING_VISIBILITYEVALUATIONCACHE;

	/**
	 * The operation id for the '<em>Is Visible Hierarchically</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_RESOURCE___IS_VISIBLE_HIERARCHICALLY__OPTIONBINDING_VISIBILITYEVALUATIONCACHE = SuperModCorePackage.PRODUCT_SPACE_ELEMENT___IS_VISIBLE_HIERARCHICALLY__OPTIONBINDING_VISIBILITYEVALUATIONCACHE;

	/**
	 * The number of operations of the '<em>Versioned Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_RESOURCE_OPERATION_COUNT = SuperModCorePackage.PRODUCT_SPACE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.ubt.ai1.supermod.mm.file.impl.VersionedFolderImpl <em>Versioned Folder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai1.supermod.mm.file.impl.VersionedFolderImpl
	 * @see de.ubt.ai1.supermod.mm.file.impl.SuperModFilePackageImpl#getVersionedFolder()
	 * @generated
	 */
	int VERSIONED_FOLDER = 2;

	/**
	 * The feature id for the '<em><b>Super Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_FOLDER__SUPER_ELEMENT = VERSIONED_RESOURCE__SUPER_ELEMENT;

	/**
	 * The feature id for the '<em><b>Sub Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_FOLDER__SUB_ELEMENTS = VERSIONED_RESOURCE__SUB_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Super Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_FOLDER__ALL_SUPER_ELEMENTS = VERSIONED_RESOURCE__ALL_SUPER_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Sub Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_FOLDER__ALL_SUB_ELEMENTS = VERSIONED_RESOURCE__ALL_SUB_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Cross Referenced Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_FOLDER__CROSS_REFERENCED_ELEMENTS = VERSIONED_RESOURCE__CROSS_REFERENCED_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Cross Referencing Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_FOLDER__CROSS_REFERENCING_ELEMENTS = VERSIONED_RESOURCE__CROSS_REFERENCING_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Proxy UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_FOLDER__PROXY_UUID = VERSIONED_RESOURCE__PROXY_UUID;

	/**
	 * The feature id for the '<em><b>Transaction Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_FOLDER__TRANSACTION_ID = VERSIONED_RESOURCE__TRANSACTION_ID;

	/**
	 * The feature id for the '<em><b>Product Dimension</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_FOLDER__PRODUCT_DIMENSION = VERSIONED_RESOURCE__PRODUCT_DIMENSION;

	/**
	 * The feature id for the '<em><b>Product Space</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_FOLDER__PRODUCT_SPACE = VERSIONED_RESOURCE__PRODUCT_SPACE;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_FOLDER__VISIBILITY = VERSIONED_RESOURCE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Super Product Space Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_FOLDER__SUPER_PRODUCT_SPACE_ELEMENT = VERSIONED_RESOURCE__SUPER_PRODUCT_SPACE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Sub Product Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_FOLDER__SUB_PRODUCT_SPACE_ELEMENTS = VERSIONED_RESOURCE__SUB_PRODUCT_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Super Product Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_FOLDER__ALL_SUPER_PRODUCT_SPACE_ELEMENTS = VERSIONED_RESOURCE__ALL_SUPER_PRODUCT_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Sub Product Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_FOLDER__ALL_SUB_PRODUCT_SPACE_ELEMENTS = VERSIONED_RESOURCE__ALL_SUB_PRODUCT_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Cross Referenced Product Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_FOLDER__CROSS_REFERENCED_PRODUCT_SPACE_ELEMENTS = VERSIONED_RESOURCE__CROSS_REFERENCED_PRODUCT_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Cross Referencing Product Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_FOLDER__CROSS_REFERENCING_PRODUCT_SPACE_ELEMENTS = VERSIONED_RESOURCE__CROSS_REFERENCING_PRODUCT_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Hierarchical Visibility</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_FOLDER__HIERARCHICAL_VISIBILITY = VERSIONED_RESOURCE__HIERARCHICAL_VISIBILITY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_FOLDER__NAME = VERSIONED_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_FOLDER__PATH = VERSIONED_RESOURCE__PATH;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_FOLDER__CONTAINER = VERSIONED_RESOURCE__CONTAINER;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_FOLDER__CONTENTS = VERSIONED_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>All Contents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_FOLDER__ALL_CONTENTS = VERSIONED_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Versioned Folder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_FOLDER_FEATURE_COUNT = VERSIONED_RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Is Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_FOLDER___IS_PROXY = VERSIONED_RESOURCE___IS_PROXY;

	/**
	 * The operation id for the '<em>Is Visible</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_FOLDER___IS_VISIBLE__OPTIONBINDING_VISIBILITYEVALUATIONCACHE = VERSIONED_RESOURCE___IS_VISIBLE__OPTIONBINDING_VISIBILITYEVALUATIONCACHE;

	/**
	 * The operation id for the '<em>Is Visible Hierarchically</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_FOLDER___IS_VISIBLE_HIERARCHICALLY__OPTIONBINDING_VISIBILITYEVALUATIONCACHE = VERSIONED_RESOURCE___IS_VISIBLE_HIERARCHICALLY__OPTIONBINDING_VISIBILITYEVALUATIONCACHE;

	/**
	 * The operation id for the '<em>Get Content</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_FOLDER___GET_CONTENT__STRING = VERSIONED_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Versioned Folder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_FOLDER_OPERATION_COUNT = VERSIONED_RESOURCE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.ubt.ai1.supermod.mm.file.impl.VersionedFileImpl <em>Versioned File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai1.supermod.mm.file.impl.VersionedFileImpl
	 * @see de.ubt.ai1.supermod.mm.file.impl.SuperModFilePackageImpl#getVersionedFile()
	 * @generated
	 */
	int VERSIONED_FILE = 3;

	/**
	 * The feature id for the '<em><b>Super Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_FILE__SUPER_ELEMENT = VERSIONED_RESOURCE__SUPER_ELEMENT;

	/**
	 * The feature id for the '<em><b>Sub Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_FILE__SUB_ELEMENTS = VERSIONED_RESOURCE__SUB_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Super Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_FILE__ALL_SUPER_ELEMENTS = VERSIONED_RESOURCE__ALL_SUPER_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Sub Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_FILE__ALL_SUB_ELEMENTS = VERSIONED_RESOURCE__ALL_SUB_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Cross Referenced Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_FILE__CROSS_REFERENCED_ELEMENTS = VERSIONED_RESOURCE__CROSS_REFERENCED_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Cross Referencing Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_FILE__CROSS_REFERENCING_ELEMENTS = VERSIONED_RESOURCE__CROSS_REFERENCING_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Proxy UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_FILE__PROXY_UUID = VERSIONED_RESOURCE__PROXY_UUID;

	/**
	 * The feature id for the '<em><b>Transaction Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_FILE__TRANSACTION_ID = VERSIONED_RESOURCE__TRANSACTION_ID;

	/**
	 * The feature id for the '<em><b>Product Dimension</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_FILE__PRODUCT_DIMENSION = VERSIONED_RESOURCE__PRODUCT_DIMENSION;

	/**
	 * The feature id for the '<em><b>Product Space</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_FILE__PRODUCT_SPACE = VERSIONED_RESOURCE__PRODUCT_SPACE;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_FILE__VISIBILITY = VERSIONED_RESOURCE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Super Product Space Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_FILE__SUPER_PRODUCT_SPACE_ELEMENT = VERSIONED_RESOURCE__SUPER_PRODUCT_SPACE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Sub Product Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_FILE__SUB_PRODUCT_SPACE_ELEMENTS = VERSIONED_RESOURCE__SUB_PRODUCT_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Super Product Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_FILE__ALL_SUPER_PRODUCT_SPACE_ELEMENTS = VERSIONED_RESOURCE__ALL_SUPER_PRODUCT_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Sub Product Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_FILE__ALL_SUB_PRODUCT_SPACE_ELEMENTS = VERSIONED_RESOURCE__ALL_SUB_PRODUCT_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Cross Referenced Product Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_FILE__CROSS_REFERENCED_PRODUCT_SPACE_ELEMENTS = VERSIONED_RESOURCE__CROSS_REFERENCED_PRODUCT_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Cross Referencing Product Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_FILE__CROSS_REFERENCING_PRODUCT_SPACE_ELEMENTS = VERSIONED_RESOURCE__CROSS_REFERENCING_PRODUCT_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Hierarchical Visibility</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_FILE__HIERARCHICAL_VISIBILITY = VERSIONED_RESOURCE__HIERARCHICAL_VISIBILITY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_FILE__NAME = VERSIONED_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_FILE__PATH = VERSIONED_RESOURCE__PATH;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_FILE__CONTAINER = VERSIONED_RESOURCE__CONTAINER;

	/**
	 * The feature id for the '<em><b>Content Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_FILE__CONTENT_TYPE = VERSIONED_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Content</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_FILE__CONTENT = VERSIONED_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Versioned File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_FILE_FEATURE_COUNT = VERSIONED_RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Is Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_FILE___IS_PROXY = VERSIONED_RESOURCE___IS_PROXY;

	/**
	 * The operation id for the '<em>Is Visible</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_FILE___IS_VISIBLE__OPTIONBINDING_VISIBILITYEVALUATIONCACHE = VERSIONED_RESOURCE___IS_VISIBLE__OPTIONBINDING_VISIBILITYEVALUATIONCACHE;

	/**
	 * The operation id for the '<em>Is Visible Hierarchically</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_FILE___IS_VISIBLE_HIERARCHICALLY__OPTIONBINDING_VISIBILITYEVALUATIONCACHE = VERSIONED_RESOURCE___IS_VISIBLE_HIERARCHICALLY__OPTIONBINDING_VISIBILITYEVALUATIONCACHE;

	/**
	 * The number of operations of the '<em>Versioned File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_FILE_OPERATION_COUNT = VERSIONED_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.ubt.ai1.supermod.mm.file.impl.VersionedFileContentImpl <em>Versioned File Content</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai1.supermod.mm.file.impl.VersionedFileContentImpl
	 * @see de.ubt.ai1.supermod.mm.file.impl.SuperModFilePackageImpl#getVersionedFileContent()
	 * @generated
	 */
	int VERSIONED_FILE_CONTENT = 4;

	/**
	 * The feature id for the '<em><b>Super Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_FILE_CONTENT__SUPER_ELEMENT = SuperModCorePackage.PRODUCT_SPACE_ELEMENT__SUPER_ELEMENT;

	/**
	 * The feature id for the '<em><b>Sub Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_FILE_CONTENT__SUB_ELEMENTS = SuperModCorePackage.PRODUCT_SPACE_ELEMENT__SUB_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Super Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_FILE_CONTENT__ALL_SUPER_ELEMENTS = SuperModCorePackage.PRODUCT_SPACE_ELEMENT__ALL_SUPER_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Sub Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_FILE_CONTENT__ALL_SUB_ELEMENTS = SuperModCorePackage.PRODUCT_SPACE_ELEMENT__ALL_SUB_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Cross Referenced Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_FILE_CONTENT__CROSS_REFERENCED_ELEMENTS = SuperModCorePackage.PRODUCT_SPACE_ELEMENT__CROSS_REFERENCED_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Cross Referencing Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_FILE_CONTENT__CROSS_REFERENCING_ELEMENTS = SuperModCorePackage.PRODUCT_SPACE_ELEMENT__CROSS_REFERENCING_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Proxy UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_FILE_CONTENT__PROXY_UUID = SuperModCorePackage.PRODUCT_SPACE_ELEMENT__PROXY_UUID;

	/**
	 * The feature id for the '<em><b>Transaction Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_FILE_CONTENT__TRANSACTION_ID = SuperModCorePackage.PRODUCT_SPACE_ELEMENT__TRANSACTION_ID;

	/**
	 * The feature id for the '<em><b>Product Dimension</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_FILE_CONTENT__PRODUCT_DIMENSION = SuperModCorePackage.PRODUCT_SPACE_ELEMENT__PRODUCT_DIMENSION;

	/**
	 * The feature id for the '<em><b>Product Space</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_FILE_CONTENT__PRODUCT_SPACE = SuperModCorePackage.PRODUCT_SPACE_ELEMENT__PRODUCT_SPACE;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_FILE_CONTENT__VISIBILITY = SuperModCorePackage.PRODUCT_SPACE_ELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Super Product Space Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_FILE_CONTENT__SUPER_PRODUCT_SPACE_ELEMENT = SuperModCorePackage.PRODUCT_SPACE_ELEMENT__SUPER_PRODUCT_SPACE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Sub Product Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_FILE_CONTENT__SUB_PRODUCT_SPACE_ELEMENTS = SuperModCorePackage.PRODUCT_SPACE_ELEMENT__SUB_PRODUCT_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Super Product Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_FILE_CONTENT__ALL_SUPER_PRODUCT_SPACE_ELEMENTS = SuperModCorePackage.PRODUCT_SPACE_ELEMENT__ALL_SUPER_PRODUCT_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>All Sub Product Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_FILE_CONTENT__ALL_SUB_PRODUCT_SPACE_ELEMENTS = SuperModCorePackage.PRODUCT_SPACE_ELEMENT__ALL_SUB_PRODUCT_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Cross Referenced Product Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_FILE_CONTENT__CROSS_REFERENCED_PRODUCT_SPACE_ELEMENTS = SuperModCorePackage.PRODUCT_SPACE_ELEMENT__CROSS_REFERENCED_PRODUCT_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Cross Referencing Product Space Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_FILE_CONTENT__CROSS_REFERENCING_PRODUCT_SPACE_ELEMENTS = SuperModCorePackage.PRODUCT_SPACE_ELEMENT__CROSS_REFERENCING_PRODUCT_SPACE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Hierarchical Visibility</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_FILE_CONTENT__HIERARCHICAL_VISIBILITY = SuperModCorePackage.PRODUCT_SPACE_ELEMENT__HIERARCHICAL_VISIBILITY;

	/**
	 * The feature id for the '<em><b>File</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_FILE_CONTENT__FILE = SuperModCorePackage.PRODUCT_SPACE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Super Extension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_FILE_CONTENT__SUPER_EXTENSION = SuperModCorePackage.PRODUCT_SPACE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Versioned File Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_FILE_CONTENT_FEATURE_COUNT = SuperModCorePackage.PRODUCT_SPACE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Is Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_FILE_CONTENT___IS_PROXY = SuperModCorePackage.PRODUCT_SPACE_ELEMENT___IS_PROXY;

	/**
	 * The operation id for the '<em>Is Visible</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_FILE_CONTENT___IS_VISIBLE__OPTIONBINDING_VISIBILITYEVALUATIONCACHE = SuperModCorePackage.PRODUCT_SPACE_ELEMENT___IS_VISIBLE__OPTIONBINDING_VISIBILITYEVALUATIONCACHE;

	/**
	 * The operation id for the '<em>Is Visible Hierarchically</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_FILE_CONTENT___IS_VISIBLE_HIERARCHICALLY__OPTIONBINDING_VISIBILITYEVALUATIONCACHE = SuperModCorePackage.PRODUCT_SPACE_ELEMENT___IS_VISIBLE_HIERARCHICALLY__OPTIONBINDING_VISIBILITYEVALUATIONCACHE;

	/**
	 * The number of operations of the '<em>Versioned File Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_FILE_CONTENT_OPERATION_COUNT = SuperModCorePackage.PRODUCT_SPACE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link de.ubt.ai1.supermod.mm.file.VersionedFileSystem <em>Versioned File System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Versioned File System</em>'.
	 * @see de.ubt.ai1.supermod.mm.file.VersionedFileSystem
	 * @generated
	 */
	EClass getVersionedFileSystem();

	/**
	 * Returns the meta object for the containment reference list '{@link de.ubt.ai1.supermod.mm.file.VersionedFileSystem#getRoots <em>Roots</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Roots</em>'.
	 * @see de.ubt.ai1.supermod.mm.file.VersionedFileSystem#getRoots()
	 * @see #getVersionedFileSystem()
	 * @generated
	 */
	EReference getVersionedFileSystem_Roots();

	/**
	 * Returns the meta object for the reference list '{@link de.ubt.ai1.supermod.mm.file.VersionedFileSystem#getAllResources <em>All Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>All Resources</em>'.
	 * @see de.ubt.ai1.supermod.mm.file.VersionedFileSystem#getAllResources()
	 * @see #getVersionedFileSystem()
	 * @generated
	 */
	EReference getVersionedFileSystem_AllResources();

	/**
	 * Returns the meta object for the '{@link de.ubt.ai1.supermod.mm.file.VersionedFileSystem#getResource(java.lang.String) <em>Get Resource</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Resource</em>' operation.
	 * @see de.ubt.ai1.supermod.mm.file.VersionedFileSystem#getResource(java.lang.String)
	 * @generated
	 */
	EOperation getVersionedFileSystem__GetResource__String();

	/**
	 * Returns the meta object for the '{@link de.ubt.ai1.supermod.mm.file.VersionedFileSystem#createFile(java.lang.String) <em>Create File</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create File</em>' operation.
	 * @see de.ubt.ai1.supermod.mm.file.VersionedFileSystem#createFile(java.lang.String)
	 * @generated
	 */
	EOperation getVersionedFileSystem__CreateFile__String();

	/**
	 * Returns the meta object for the '{@link de.ubt.ai1.supermod.mm.file.VersionedFileSystem#createFolder(java.lang.String) <em>Create Folder</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Folder</em>' operation.
	 * @see de.ubt.ai1.supermod.mm.file.VersionedFileSystem#createFolder(java.lang.String)
	 * @generated
	 */
	EOperation getVersionedFileSystem__CreateFolder__String();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai1.supermod.mm.file.VersionedResource <em>Versioned Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Versioned Resource</em>'.
	 * @see de.ubt.ai1.supermod.mm.file.VersionedResource
	 * @generated
	 */
	EClass getVersionedResource();

	/**
	 * Returns the meta object for the attribute '{@link de.ubt.ai1.supermod.mm.file.VersionedResource#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.ubt.ai1.supermod.mm.file.VersionedResource#getName()
	 * @see #getVersionedResource()
	 * @generated
	 */
	EAttribute getVersionedResource_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.ubt.ai1.supermod.mm.file.VersionedResource#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see de.ubt.ai1.supermod.mm.file.VersionedResource#getPath()
	 * @see #getVersionedResource()
	 * @generated
	 */
	EAttribute getVersionedResource_Path();

	/**
	 * Returns the meta object for the container reference '{@link de.ubt.ai1.supermod.mm.file.VersionedResource#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Container</em>'.
	 * @see de.ubt.ai1.supermod.mm.file.VersionedResource#getContainer()
	 * @see #getVersionedResource()
	 * @generated
	 */
	EReference getVersionedResource_Container();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai1.supermod.mm.file.VersionedFolder <em>Versioned Folder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Versioned Folder</em>'.
	 * @see de.ubt.ai1.supermod.mm.file.VersionedFolder
	 * @generated
	 */
	EClass getVersionedFolder();

	/**
	 * Returns the meta object for the containment reference list '{@link de.ubt.ai1.supermod.mm.file.VersionedFolder#getContents <em>Contents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contents</em>'.
	 * @see de.ubt.ai1.supermod.mm.file.VersionedFolder#getContents()
	 * @see #getVersionedFolder()
	 * @generated
	 */
	EReference getVersionedFolder_Contents();

	/**
	 * Returns the meta object for the reference list '{@link de.ubt.ai1.supermod.mm.file.VersionedFolder#getAllContents <em>All Contents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>All Contents</em>'.
	 * @see de.ubt.ai1.supermod.mm.file.VersionedFolder#getAllContents()
	 * @see #getVersionedFolder()
	 * @generated
	 */
	EReference getVersionedFolder_AllContents();

	/**
	 * Returns the meta object for the '{@link de.ubt.ai1.supermod.mm.file.VersionedFolder#getContent(java.lang.String) <em>Get Content</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Content</em>' operation.
	 * @see de.ubt.ai1.supermod.mm.file.VersionedFolder#getContent(java.lang.String)
	 * @generated
	 */
	EOperation getVersionedFolder__GetContent__String();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai1.supermod.mm.file.VersionedFile <em>Versioned File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Versioned File</em>'.
	 * @see de.ubt.ai1.supermod.mm.file.VersionedFile
	 * @generated
	 */
	EClass getVersionedFile();

	/**
	 * Returns the meta object for the attribute '{@link de.ubt.ai1.supermod.mm.file.VersionedFile#getContentType <em>Content Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content Type</em>'.
	 * @see de.ubt.ai1.supermod.mm.file.VersionedFile#getContentType()
	 * @see #getVersionedFile()
	 * @generated
	 */
	EAttribute getVersionedFile_ContentType();

	/**
	 * Returns the meta object for the reference '{@link de.ubt.ai1.supermod.mm.file.VersionedFile#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Content</em>'.
	 * @see de.ubt.ai1.supermod.mm.file.VersionedFile#getContent()
	 * @see #getVersionedFile()
	 * @generated
	 */
	EReference getVersionedFile_Content();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai1.supermod.mm.file.VersionedFileContent <em>Versioned File Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Versioned File Content</em>'.
	 * @see de.ubt.ai1.supermod.mm.file.VersionedFileContent
	 * @generated
	 */
	EClass getVersionedFileContent();

	/**
	 * Returns the meta object for the reference '{@link de.ubt.ai1.supermod.mm.file.VersionedFileContent#getFile <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>File</em>'.
	 * @see de.ubt.ai1.supermod.mm.file.VersionedFileContent#getFile()
	 * @see #getVersionedFileContent()
	 * @generated
	 */
	EReference getVersionedFileContent_File();

	/**
	 * Returns the meta object for the attribute '{@link de.ubt.ai1.supermod.mm.file.VersionedFileContent#getSuperExtension <em>Super Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Super Extension</em>'.
	 * @see de.ubt.ai1.supermod.mm.file.VersionedFileContent#getSuperExtension()
	 * @see #getVersionedFileContent()
	 * @generated
	 */
	EAttribute getVersionedFileContent_SuperExtension();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SuperModFileFactory getSuperModFileFactory();

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
		 * The meta object literal for the '{@link de.ubt.ai1.supermod.mm.file.impl.VersionedFileSystemImpl <em>Versioned File System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai1.supermod.mm.file.impl.VersionedFileSystemImpl
		 * @see de.ubt.ai1.supermod.mm.file.impl.SuperModFilePackageImpl#getVersionedFileSystem()
		 * @generated
		 */
		EClass VERSIONED_FILE_SYSTEM = eINSTANCE.getVersionedFileSystem();

		/**
		 * The meta object literal for the '<em><b>Roots</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VERSIONED_FILE_SYSTEM__ROOTS = eINSTANCE.getVersionedFileSystem_Roots();

		/**
		 * The meta object literal for the '<em><b>All Resources</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VERSIONED_FILE_SYSTEM__ALL_RESOURCES = eINSTANCE.getVersionedFileSystem_AllResources();

		/**
		 * The meta object literal for the '<em><b>Get Resource</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VERSIONED_FILE_SYSTEM___GET_RESOURCE__STRING = eINSTANCE.getVersionedFileSystem__GetResource__String();

		/**
		 * The meta object literal for the '<em><b>Create File</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VERSIONED_FILE_SYSTEM___CREATE_FILE__STRING = eINSTANCE.getVersionedFileSystem__CreateFile__String();

		/**
		 * The meta object literal for the '<em><b>Create Folder</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VERSIONED_FILE_SYSTEM___CREATE_FOLDER__STRING = eINSTANCE.getVersionedFileSystem__CreateFolder__String();

		/**
		 * The meta object literal for the '{@link de.ubt.ai1.supermod.mm.file.impl.VersionedResourceImpl <em>Versioned Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai1.supermod.mm.file.impl.VersionedResourceImpl
		 * @see de.ubt.ai1.supermod.mm.file.impl.SuperModFilePackageImpl#getVersionedResource()
		 * @generated
		 */
		EClass VERSIONED_RESOURCE = eINSTANCE.getVersionedResource();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERSIONED_RESOURCE__NAME = eINSTANCE.getVersionedResource_Name();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERSIONED_RESOURCE__PATH = eINSTANCE.getVersionedResource_Path();

		/**
		 * The meta object literal for the '<em><b>Container</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VERSIONED_RESOURCE__CONTAINER = eINSTANCE.getVersionedResource_Container();

		/**
		 * The meta object literal for the '{@link de.ubt.ai1.supermod.mm.file.impl.VersionedFolderImpl <em>Versioned Folder</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai1.supermod.mm.file.impl.VersionedFolderImpl
		 * @see de.ubt.ai1.supermod.mm.file.impl.SuperModFilePackageImpl#getVersionedFolder()
		 * @generated
		 */
		EClass VERSIONED_FOLDER = eINSTANCE.getVersionedFolder();

		/**
		 * The meta object literal for the '<em><b>Contents</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VERSIONED_FOLDER__CONTENTS = eINSTANCE.getVersionedFolder_Contents();

		/**
		 * The meta object literal for the '<em><b>All Contents</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VERSIONED_FOLDER__ALL_CONTENTS = eINSTANCE.getVersionedFolder_AllContents();

		/**
		 * The meta object literal for the '<em><b>Get Content</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VERSIONED_FOLDER___GET_CONTENT__STRING = eINSTANCE.getVersionedFolder__GetContent__String();

		/**
		 * The meta object literal for the '{@link de.ubt.ai1.supermod.mm.file.impl.VersionedFileImpl <em>Versioned File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai1.supermod.mm.file.impl.VersionedFileImpl
		 * @see de.ubt.ai1.supermod.mm.file.impl.SuperModFilePackageImpl#getVersionedFile()
		 * @generated
		 */
		EClass VERSIONED_FILE = eINSTANCE.getVersionedFile();

		/**
		 * The meta object literal for the '<em><b>Content Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERSIONED_FILE__CONTENT_TYPE = eINSTANCE.getVersionedFile_ContentType();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VERSIONED_FILE__CONTENT = eINSTANCE.getVersionedFile_Content();

		/**
		 * The meta object literal for the '{@link de.ubt.ai1.supermod.mm.file.impl.VersionedFileContentImpl <em>Versioned File Content</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai1.supermod.mm.file.impl.VersionedFileContentImpl
		 * @see de.ubt.ai1.supermod.mm.file.impl.SuperModFilePackageImpl#getVersionedFileContent()
		 * @generated
		 */
		EClass VERSIONED_FILE_CONTENT = eINSTANCE.getVersionedFileContent();

		/**
		 * The meta object literal for the '<em><b>File</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VERSIONED_FILE_CONTENT__FILE = eINSTANCE.getVersionedFileContent_File();

		/**
		 * The meta object literal for the '<em><b>Super Extension</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERSIONED_FILE_CONTENT__SUPER_EXTENSION = eINSTANCE.getVersionedFileContent_SuperExtension();

	}

} //SuperModFilePackage
