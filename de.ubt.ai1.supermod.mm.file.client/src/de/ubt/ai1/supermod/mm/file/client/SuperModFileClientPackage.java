/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.mm.file.client;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import de.ubt.ai1.supermod.mm.client.SuperModClientPackage;

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
 * This package contains meta-classes for the single-version representation
 * of a file system. The file tree is copied; file contents are traced by
 * means of hash codes.
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date 	2014-07-28
 * <!-- end-user-doc -->
 * @see de.ubt.ai1.supermod.mm.file.client.SuperModFileClientFactory
 * @model kind="package"
 * @generated
 */
public interface SuperModFileClientPackage extends EPackage {
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
	String eNS_URI = "http://ai1.uni-bayreuth.de/supermod/file/client/0.1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "de.ubt.ai1.supermod.mm.file.client";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SuperModFileClientPackage eINSTANCE = de.ubt.ai1.supermod.mm.file.client.impl.SuperModFileClientPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.ubt.ai1.supermod.mm.file.client.impl.SingleVersionFileSystemDescriptorImpl <em>Single Version File System Descriptor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai1.supermod.mm.file.client.impl.SingleVersionFileSystemDescriptorImpl
	 * @see de.ubt.ai1.supermod.mm.file.client.impl.SuperModFileClientPackageImpl#getSingleVersionFileSystemDescriptor()
	 * @generated
	 */
	int SINGLE_VERSION_FILE_SYSTEM_DESCRIPTOR = 0;

	/**
	 * The feature id for the '<em><b>Dimension Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_VERSION_FILE_SYSTEM_DESCRIPTOR__DIMENSION_NAME = SuperModClientPackage.SINGLE_VERSION_PRODUCT_DIMENSION_DESCRIPTOR__DIMENSION_NAME;

	/**
	 * The feature id for the '<em><b>Roots</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_VERSION_FILE_SYSTEM_DESCRIPTOR__ROOTS = SuperModClientPackage.SINGLE_VERSION_PRODUCT_DIMENSION_DESCRIPTOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Root Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_VERSION_FILE_SYSTEM_DESCRIPTOR__ROOT_URI = SuperModClientPackage.SINGLE_VERSION_PRODUCT_DIMENSION_DESCRIPTOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>All Resources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_VERSION_FILE_SYSTEM_DESCRIPTOR__ALL_RESOURCES = SuperModClientPackage.SINGLE_VERSION_PRODUCT_DIMENSION_DESCRIPTOR_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Single Version File System Descriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_VERSION_FILE_SYSTEM_DESCRIPTOR_FEATURE_COUNT = SuperModClientPackage.SINGLE_VERSION_PRODUCT_DIMENSION_DESCRIPTOR_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Is Modified</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_VERSION_FILE_SYSTEM_DESCRIPTOR___IS_MODIFIED = SuperModClientPackage.SINGLE_VERSION_PRODUCT_DIMENSION_DESCRIPTOR___IS_MODIFIED;

	/**
	 * The operation id for the '<em>Set Modified</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_VERSION_FILE_SYSTEM_DESCRIPTOR___SET_MODIFIED__BOOLEAN = SuperModClientPackage.SINGLE_VERSION_PRODUCT_DIMENSION_DESCRIPTOR___SET_MODIFIED__BOOLEAN;

	/**
	 * The operation id for the '<em>Get Resource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_VERSION_FILE_SYSTEM_DESCRIPTOR___GET_RESOURCE__STRING = SuperModClientPackage.SINGLE_VERSION_PRODUCT_DIMENSION_DESCRIPTOR_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Create File</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_VERSION_FILE_SYSTEM_DESCRIPTOR___CREATE_FILE__STRING = SuperModClientPackage.SINGLE_VERSION_PRODUCT_DIMENSION_DESCRIPTOR_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Create Folder</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_VERSION_FILE_SYSTEM_DESCRIPTOR___CREATE_FOLDER__STRING = SuperModClientPackage.SINGLE_VERSION_PRODUCT_DIMENSION_DESCRIPTOR_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Single Version File System Descriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_VERSION_FILE_SYSTEM_DESCRIPTOR_OPERATION_COUNT = SuperModClientPackage.SINGLE_VERSION_PRODUCT_DIMENSION_DESCRIPTOR_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link de.ubt.ai1.supermod.mm.file.client.impl.SingleVersionResourceDescriptorImpl <em>Single Version Resource Descriptor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai1.supermod.mm.file.client.impl.SingleVersionResourceDescriptorImpl
	 * @see de.ubt.ai1.supermod.mm.file.client.impl.SuperModFileClientPackageImpl#getSingleVersionResourceDescriptor()
	 * @generated
	 */
	int SINGLE_VERSION_RESOURCE_DESCRIPTOR = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_VERSION_RESOURCE_DESCRIPTOR__NAME = 0;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_VERSION_RESOURCE_DESCRIPTOR__PATH = 1;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_VERSION_RESOURCE_DESCRIPTOR__CONTAINER = 2;

	/**
	 * The feature id for the '<em><b>Versioned</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_VERSION_RESOURCE_DESCRIPTOR__VERSIONED = 3;

	/**
	 * The number of structural features of the '<em>Single Version Resource Descriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_VERSION_RESOURCE_DESCRIPTOR_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Single Version Resource Descriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_VERSION_RESOURCE_DESCRIPTOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.ubt.ai1.supermod.mm.file.client.impl.SingleVersionFileDescriptorImpl <em>Single Version File Descriptor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai1.supermod.mm.file.client.impl.SingleVersionFileDescriptorImpl
	 * @see de.ubt.ai1.supermod.mm.file.client.impl.SuperModFileClientPackageImpl#getSingleVersionFileDescriptor()
	 * @generated
	 */
	int SINGLE_VERSION_FILE_DESCRIPTOR = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_VERSION_FILE_DESCRIPTOR__NAME = SINGLE_VERSION_RESOURCE_DESCRIPTOR__NAME;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_VERSION_FILE_DESCRIPTOR__PATH = SINGLE_VERSION_RESOURCE_DESCRIPTOR__PATH;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_VERSION_FILE_DESCRIPTOR__CONTAINER = SINGLE_VERSION_RESOURCE_DESCRIPTOR__CONTAINER;

	/**
	 * The feature id for the '<em><b>Versioned</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_VERSION_FILE_DESCRIPTOR__VERSIONED = SINGLE_VERSION_RESOURCE_DESCRIPTOR__VERSIONED;

	/**
	 * The feature id for the '<em><b>Hash</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_VERSION_FILE_DESCRIPTOR__HASH = SINGLE_VERSION_RESOURCE_DESCRIPTOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Single Version File Descriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_VERSION_FILE_DESCRIPTOR_FEATURE_COUNT = SINGLE_VERSION_RESOURCE_DESCRIPTOR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Single Version File Descriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_VERSION_FILE_DESCRIPTOR_OPERATION_COUNT = SINGLE_VERSION_RESOURCE_DESCRIPTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.ubt.ai1.supermod.mm.file.client.impl.SingleVersionFolderDescriptorImpl <em>Single Version Folder Descriptor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai1.supermod.mm.file.client.impl.SingleVersionFolderDescriptorImpl
	 * @see de.ubt.ai1.supermod.mm.file.client.impl.SuperModFileClientPackageImpl#getSingleVersionFolderDescriptor()
	 * @generated
	 */
	int SINGLE_VERSION_FOLDER_DESCRIPTOR = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_VERSION_FOLDER_DESCRIPTOR__NAME = SINGLE_VERSION_RESOURCE_DESCRIPTOR__NAME;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_VERSION_FOLDER_DESCRIPTOR__PATH = SINGLE_VERSION_RESOURCE_DESCRIPTOR__PATH;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_VERSION_FOLDER_DESCRIPTOR__CONTAINER = SINGLE_VERSION_RESOURCE_DESCRIPTOR__CONTAINER;

	/**
	 * The feature id for the '<em><b>Versioned</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_VERSION_FOLDER_DESCRIPTOR__VERSIONED = SINGLE_VERSION_RESOURCE_DESCRIPTOR__VERSIONED;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_VERSION_FOLDER_DESCRIPTOR__CONTENTS = SINGLE_VERSION_RESOURCE_DESCRIPTOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>All Contents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_VERSION_FOLDER_DESCRIPTOR__ALL_CONTENTS = SINGLE_VERSION_RESOURCE_DESCRIPTOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Single Version Folder Descriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_VERSION_FOLDER_DESCRIPTOR_FEATURE_COUNT = SINGLE_VERSION_RESOURCE_DESCRIPTOR_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Content</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_VERSION_FOLDER_DESCRIPTOR___GET_CONTENT__STRING = SINGLE_VERSION_RESOURCE_DESCRIPTOR_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Single Version Folder Descriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_VERSION_FOLDER_DESCRIPTOR_OPERATION_COUNT = SINGLE_VERSION_RESOURCE_DESCRIPTOR_OPERATION_COUNT + 1;


	/**
	 * The meta object id for the '{@link de.ubt.ai1.supermod.mm.file.client.impl.VersionedFileSystemExportTraceImpl <em>Versioned File System Export Trace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai1.supermod.mm.file.client.impl.VersionedFileSystemExportTraceImpl
	 * @see de.ubt.ai1.supermod.mm.file.client.impl.SuperModFileClientPackageImpl#getVersionedFileSystemExportTrace()
	 * @generated
	 */
	int VERSIONED_FILE_SYSTEM_EXPORT_TRACE = 4;

	/**
	 * The feature id for the '<em><b>Product Dimension</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_FILE_SYSTEM_EXPORT_TRACE__PRODUCT_DIMENSION = SuperModClientPackage.PRODUCT_DIMENSION_EXPORT_TRACE__PRODUCT_DIMENSION;

	/**
	 * The feature id for the '<em><b>Path To Versioned File Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_FILE_SYSTEM_EXPORT_TRACE__PATH_TO_VERSIONED_FILE_MAP = SuperModClientPackage.PRODUCT_DIMENSION_EXPORT_TRACE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Versioned File System Export Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_FILE_SYSTEM_EXPORT_TRACE_FEATURE_COUNT = SuperModClientPackage.PRODUCT_DIMENSION_EXPORT_TRACE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Versioned File System Export Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_FILE_SYSTEM_EXPORT_TRACE_OPERATION_COUNT = SuperModClientPackage.PRODUCT_DIMENSION_EXPORT_TRACE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.ubt.ai1.supermod.mm.file.client.impl.PathToVersionedFileMapEntryImpl <em>Path To Versioned File Map Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai1.supermod.mm.file.client.impl.PathToVersionedFileMapEntryImpl
	 * @see de.ubt.ai1.supermod.mm.file.client.impl.SuperModFileClientPackageImpl#getPathToVersionedFileMapEntry()
	 * @generated
	 */
	int PATH_TO_VERSIONED_FILE_MAP_ENTRY = 5;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_TO_VERSIONED_FILE_MAP_ENTRY__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_TO_VERSIONED_FILE_MAP_ENTRY__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Path To Versioned File Map Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_TO_VERSIONED_FILE_MAP_ENTRY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Path To Versioned File Map Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_TO_VERSIONED_FILE_MAP_ENTRY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.ubt.ai1.supermod.mm.file.client.impl.VersionedFileExportTraceImpl <em>Versioned File Export Trace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai1.supermod.mm.file.client.impl.VersionedFileExportTraceImpl
	 * @see de.ubt.ai1.supermod.mm.file.client.impl.SuperModFileClientPackageImpl#getVersionedFileExportTrace()
	 * @generated
	 */
	int VERSIONED_FILE_EXPORT_TRACE = 6;

	/**
	 * The feature id for the '<em><b>Versioned File</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_FILE_EXPORT_TRACE__VERSIONED_FILE = 0;

	/**
	 * The number of structural features of the '<em>Versioned File Export Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_FILE_EXPORT_TRACE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Versioned File Export Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_FILE_EXPORT_TRACE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link de.ubt.ai1.supermod.mm.file.client.SingleVersionFileSystemDescriptor <em>Single Version File System Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Single Version File System Descriptor</em>'.
	 * @see de.ubt.ai1.supermod.mm.file.client.SingleVersionFileSystemDescriptor
	 * @generated
	 */
	EClass getSingleVersionFileSystemDescriptor();

	/**
	 * Returns the meta object for the containment reference list '{@link de.ubt.ai1.supermod.mm.file.client.SingleVersionFileSystemDescriptor#getRoots <em>Roots</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Roots</em>'.
	 * @see de.ubt.ai1.supermod.mm.file.client.SingleVersionFileSystemDescriptor#getRoots()
	 * @see #getSingleVersionFileSystemDescriptor()
	 * @generated
	 */
	EReference getSingleVersionFileSystemDescriptor_Roots();

	/**
	 * Returns the meta object for the attribute '{@link de.ubt.ai1.supermod.mm.file.client.SingleVersionFileSystemDescriptor#getRootUri <em>Root Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Root Uri</em>'.
	 * @see de.ubt.ai1.supermod.mm.file.client.SingleVersionFileSystemDescriptor#getRootUri()
	 * @see #getSingleVersionFileSystemDescriptor()
	 * @generated
	 */
	EAttribute getSingleVersionFileSystemDescriptor_RootUri();

	/**
	 * Returns the meta object for the reference list '{@link de.ubt.ai1.supermod.mm.file.client.SingleVersionFileSystemDescriptor#getAllResources <em>All Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>All Resources</em>'.
	 * @see de.ubt.ai1.supermod.mm.file.client.SingleVersionFileSystemDescriptor#getAllResources()
	 * @see #getSingleVersionFileSystemDescriptor()
	 * @generated
	 */
	EReference getSingleVersionFileSystemDescriptor_AllResources();

	/**
	 * Returns the meta object for the '{@link de.ubt.ai1.supermod.mm.file.client.SingleVersionFileSystemDescriptor#getResource(java.lang.String) <em>Get Resource</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Resource</em>' operation.
	 * @see de.ubt.ai1.supermod.mm.file.client.SingleVersionFileSystemDescriptor#getResource(java.lang.String)
	 * @generated
	 */
	EOperation getSingleVersionFileSystemDescriptor__GetResource__String();

	/**
	 * Returns the meta object for the '{@link de.ubt.ai1.supermod.mm.file.client.SingleVersionFileSystemDescriptor#createFile(java.lang.String) <em>Create File</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create File</em>' operation.
	 * @see de.ubt.ai1.supermod.mm.file.client.SingleVersionFileSystemDescriptor#createFile(java.lang.String)
	 * @generated
	 */
	EOperation getSingleVersionFileSystemDescriptor__CreateFile__String();

	/**
	 * Returns the meta object for the '{@link de.ubt.ai1.supermod.mm.file.client.SingleVersionFileSystemDescriptor#createFolder(java.lang.String) <em>Create Folder</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Folder</em>' operation.
	 * @see de.ubt.ai1.supermod.mm.file.client.SingleVersionFileSystemDescriptor#createFolder(java.lang.String)
	 * @generated
	 */
	EOperation getSingleVersionFileSystemDescriptor__CreateFolder__String();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai1.supermod.mm.file.client.SingleVersionResourceDescriptor <em>Single Version Resource Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Single Version Resource Descriptor</em>'.
	 * @see de.ubt.ai1.supermod.mm.file.client.SingleVersionResourceDescriptor
	 * @generated
	 */
	EClass getSingleVersionResourceDescriptor();

	/**
	 * Returns the meta object for the attribute '{@link de.ubt.ai1.supermod.mm.file.client.SingleVersionResourceDescriptor#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.ubt.ai1.supermod.mm.file.client.SingleVersionResourceDescriptor#getName()
	 * @see #getSingleVersionResourceDescriptor()
	 * @generated
	 */
	EAttribute getSingleVersionResourceDescriptor_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.ubt.ai1.supermod.mm.file.client.SingleVersionResourceDescriptor#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see de.ubt.ai1.supermod.mm.file.client.SingleVersionResourceDescriptor#getPath()
	 * @see #getSingleVersionResourceDescriptor()
	 * @generated
	 */
	EAttribute getSingleVersionResourceDescriptor_Path();

	/**
	 * Returns the meta object for the container reference '{@link de.ubt.ai1.supermod.mm.file.client.SingleVersionResourceDescriptor#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Container</em>'.
	 * @see de.ubt.ai1.supermod.mm.file.client.SingleVersionResourceDescriptor#getContainer()
	 * @see #getSingleVersionResourceDescriptor()
	 * @generated
	 */
	EReference getSingleVersionResourceDescriptor_Container();

	/**
	 * Returns the meta object for the attribute '{@link de.ubt.ai1.supermod.mm.file.client.SingleVersionResourceDescriptor#isVersioned <em>Versioned</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Versioned</em>'.
	 * @see de.ubt.ai1.supermod.mm.file.client.SingleVersionResourceDescriptor#isVersioned()
	 * @see #getSingleVersionResourceDescriptor()
	 * @generated
	 */
	EAttribute getSingleVersionResourceDescriptor_Versioned();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai1.supermod.mm.file.client.SingleVersionFileDescriptor <em>Single Version File Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Single Version File Descriptor</em>'.
	 * @see de.ubt.ai1.supermod.mm.file.client.SingleVersionFileDescriptor
	 * @generated
	 */
	EClass getSingleVersionFileDescriptor();

	/**
	 * Returns the meta object for the attribute '{@link de.ubt.ai1.supermod.mm.file.client.SingleVersionFileDescriptor#getHash <em>Hash</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hash</em>'.
	 * @see de.ubt.ai1.supermod.mm.file.client.SingleVersionFileDescriptor#getHash()
	 * @see #getSingleVersionFileDescriptor()
	 * @generated
	 */
	EAttribute getSingleVersionFileDescriptor_Hash();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai1.supermod.mm.file.client.SingleVersionFolderDescriptor <em>Single Version Folder Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Single Version Folder Descriptor</em>'.
	 * @see de.ubt.ai1.supermod.mm.file.client.SingleVersionFolderDescriptor
	 * @generated
	 */
	EClass getSingleVersionFolderDescriptor();

	/**
	 * Returns the meta object for the containment reference list '{@link de.ubt.ai1.supermod.mm.file.client.SingleVersionFolderDescriptor#getContents <em>Contents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contents</em>'.
	 * @see de.ubt.ai1.supermod.mm.file.client.SingleVersionFolderDescriptor#getContents()
	 * @see #getSingleVersionFolderDescriptor()
	 * @generated
	 */
	EReference getSingleVersionFolderDescriptor_Contents();

	/**
	 * Returns the meta object for the reference list '{@link de.ubt.ai1.supermod.mm.file.client.SingleVersionFolderDescriptor#getAllContents <em>All Contents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>All Contents</em>'.
	 * @see de.ubt.ai1.supermod.mm.file.client.SingleVersionFolderDescriptor#getAllContents()
	 * @see #getSingleVersionFolderDescriptor()
	 * @generated
	 */
	EReference getSingleVersionFolderDescriptor_AllContents();

	/**
	 * Returns the meta object for the '{@link de.ubt.ai1.supermod.mm.file.client.SingleVersionFolderDescriptor#getContent(java.lang.String) <em>Get Content</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Content</em>' operation.
	 * @see de.ubt.ai1.supermod.mm.file.client.SingleVersionFolderDescriptor#getContent(java.lang.String)
	 * @generated
	 */
	EOperation getSingleVersionFolderDescriptor__GetContent__String();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai1.supermod.mm.file.client.VersionedFileSystemExportTrace <em>Versioned File System Export Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Versioned File System Export Trace</em>'.
	 * @see de.ubt.ai1.supermod.mm.file.client.VersionedFileSystemExportTrace
	 * @generated
	 */
	EClass getVersionedFileSystemExportTrace();

	/**
	 * Returns the meta object for the map '{@link de.ubt.ai1.supermod.mm.file.client.VersionedFileSystemExportTrace#getPathToVersionedFileMap <em>Path To Versioned File Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Path To Versioned File Map</em>'.
	 * @see de.ubt.ai1.supermod.mm.file.client.VersionedFileSystemExportTrace#getPathToVersionedFileMap()
	 * @see #getVersionedFileSystemExportTrace()
	 * @generated
	 */
	EReference getVersionedFileSystemExportTrace_PathToVersionedFileMap();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>Path To Versioned File Map Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Path To Versioned File Map Entry</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="org.eclipse.emf.ecore.EString"
	 *        valueType="de.ubt.ai1.supermod.mm.file.client.VersionedFileExportTrace"
	 * @generated
	 */
	EClass getPathToVersionedFileMapEntry();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getPathToVersionedFileMapEntry()
	 * @generated
	 */
	EAttribute getPathToVersionedFileMapEntry_Key();

	/**
	 * Returns the meta object for the reference '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getPathToVersionedFileMapEntry()
	 * @generated
	 */
	EReference getPathToVersionedFileMapEntry_Value();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai1.supermod.mm.file.client.VersionedFileExportTrace <em>Versioned File Export Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Versioned File Export Trace</em>'.
	 * @see de.ubt.ai1.supermod.mm.file.client.VersionedFileExportTrace
	 * @generated
	 */
	EClass getVersionedFileExportTrace();

	/**
	 * Returns the meta object for the reference '{@link de.ubt.ai1.supermod.mm.file.client.VersionedFileExportTrace#getVersionedFile <em>Versioned File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Versioned File</em>'.
	 * @see de.ubt.ai1.supermod.mm.file.client.VersionedFileExportTrace#getVersionedFile()
	 * @see #getVersionedFileExportTrace()
	 * @generated
	 */
	EReference getVersionedFileExportTrace_VersionedFile();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SuperModFileClientFactory getSuperModFileClientFactory();

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
		 * The meta object literal for the '{@link de.ubt.ai1.supermod.mm.file.client.impl.SingleVersionFileSystemDescriptorImpl <em>Single Version File System Descriptor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai1.supermod.mm.file.client.impl.SingleVersionFileSystemDescriptorImpl
		 * @see de.ubt.ai1.supermod.mm.file.client.impl.SuperModFileClientPackageImpl#getSingleVersionFileSystemDescriptor()
		 * @generated
		 */
		EClass SINGLE_VERSION_FILE_SYSTEM_DESCRIPTOR = eINSTANCE.getSingleVersionFileSystemDescriptor();

		/**
		 * The meta object literal for the '<em><b>Roots</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SINGLE_VERSION_FILE_SYSTEM_DESCRIPTOR__ROOTS = eINSTANCE.getSingleVersionFileSystemDescriptor_Roots();

		/**
		 * The meta object literal for the '<em><b>Root Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SINGLE_VERSION_FILE_SYSTEM_DESCRIPTOR__ROOT_URI = eINSTANCE.getSingleVersionFileSystemDescriptor_RootUri();

		/**
		 * The meta object literal for the '<em><b>All Resources</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SINGLE_VERSION_FILE_SYSTEM_DESCRIPTOR__ALL_RESOURCES = eINSTANCE.getSingleVersionFileSystemDescriptor_AllResources();

		/**
		 * The meta object literal for the '<em><b>Get Resource</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SINGLE_VERSION_FILE_SYSTEM_DESCRIPTOR___GET_RESOURCE__STRING = eINSTANCE.getSingleVersionFileSystemDescriptor__GetResource__String();

		/**
		 * The meta object literal for the '<em><b>Create File</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SINGLE_VERSION_FILE_SYSTEM_DESCRIPTOR___CREATE_FILE__STRING = eINSTANCE.getSingleVersionFileSystemDescriptor__CreateFile__String();

		/**
		 * The meta object literal for the '<em><b>Create Folder</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SINGLE_VERSION_FILE_SYSTEM_DESCRIPTOR___CREATE_FOLDER__STRING = eINSTANCE.getSingleVersionFileSystemDescriptor__CreateFolder__String();

		/**
		 * The meta object literal for the '{@link de.ubt.ai1.supermod.mm.file.client.impl.SingleVersionResourceDescriptorImpl <em>Single Version Resource Descriptor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai1.supermod.mm.file.client.impl.SingleVersionResourceDescriptorImpl
		 * @see de.ubt.ai1.supermod.mm.file.client.impl.SuperModFileClientPackageImpl#getSingleVersionResourceDescriptor()
		 * @generated
		 */
		EClass SINGLE_VERSION_RESOURCE_DESCRIPTOR = eINSTANCE.getSingleVersionResourceDescriptor();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SINGLE_VERSION_RESOURCE_DESCRIPTOR__NAME = eINSTANCE.getSingleVersionResourceDescriptor_Name();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SINGLE_VERSION_RESOURCE_DESCRIPTOR__PATH = eINSTANCE.getSingleVersionResourceDescriptor_Path();

		/**
		 * The meta object literal for the '<em><b>Container</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SINGLE_VERSION_RESOURCE_DESCRIPTOR__CONTAINER = eINSTANCE.getSingleVersionResourceDescriptor_Container();

		/**
		 * The meta object literal for the '<em><b>Versioned</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SINGLE_VERSION_RESOURCE_DESCRIPTOR__VERSIONED = eINSTANCE.getSingleVersionResourceDescriptor_Versioned();

		/**
		 * The meta object literal for the '{@link de.ubt.ai1.supermod.mm.file.client.impl.SingleVersionFileDescriptorImpl <em>Single Version File Descriptor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai1.supermod.mm.file.client.impl.SingleVersionFileDescriptorImpl
		 * @see de.ubt.ai1.supermod.mm.file.client.impl.SuperModFileClientPackageImpl#getSingleVersionFileDescriptor()
		 * @generated
		 */
		EClass SINGLE_VERSION_FILE_DESCRIPTOR = eINSTANCE.getSingleVersionFileDescriptor();

		/**
		 * The meta object literal for the '<em><b>Hash</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SINGLE_VERSION_FILE_DESCRIPTOR__HASH = eINSTANCE.getSingleVersionFileDescriptor_Hash();

		/**
		 * The meta object literal for the '{@link de.ubt.ai1.supermod.mm.file.client.impl.SingleVersionFolderDescriptorImpl <em>Single Version Folder Descriptor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai1.supermod.mm.file.client.impl.SingleVersionFolderDescriptorImpl
		 * @see de.ubt.ai1.supermod.mm.file.client.impl.SuperModFileClientPackageImpl#getSingleVersionFolderDescriptor()
		 * @generated
		 */
		EClass SINGLE_VERSION_FOLDER_DESCRIPTOR = eINSTANCE.getSingleVersionFolderDescriptor();

		/**
		 * The meta object literal for the '<em><b>Contents</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SINGLE_VERSION_FOLDER_DESCRIPTOR__CONTENTS = eINSTANCE.getSingleVersionFolderDescriptor_Contents();

		/**
		 * The meta object literal for the '<em><b>All Contents</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SINGLE_VERSION_FOLDER_DESCRIPTOR__ALL_CONTENTS = eINSTANCE.getSingleVersionFolderDescriptor_AllContents();

		/**
		 * The meta object literal for the '<em><b>Get Content</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SINGLE_VERSION_FOLDER_DESCRIPTOR___GET_CONTENT__STRING = eINSTANCE.getSingleVersionFolderDescriptor__GetContent__String();

		/**
		 * The meta object literal for the '{@link de.ubt.ai1.supermod.mm.file.client.impl.VersionedFileSystemExportTraceImpl <em>Versioned File System Export Trace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai1.supermod.mm.file.client.impl.VersionedFileSystemExportTraceImpl
		 * @see de.ubt.ai1.supermod.mm.file.client.impl.SuperModFileClientPackageImpl#getVersionedFileSystemExportTrace()
		 * @generated
		 */
		EClass VERSIONED_FILE_SYSTEM_EXPORT_TRACE = eINSTANCE.getVersionedFileSystemExportTrace();

		/**
		 * The meta object literal for the '<em><b>Path To Versioned File Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VERSIONED_FILE_SYSTEM_EXPORT_TRACE__PATH_TO_VERSIONED_FILE_MAP = eINSTANCE.getVersionedFileSystemExportTrace_PathToVersionedFileMap();

		/**
		 * The meta object literal for the '{@link de.ubt.ai1.supermod.mm.file.client.impl.PathToVersionedFileMapEntryImpl <em>Path To Versioned File Map Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai1.supermod.mm.file.client.impl.PathToVersionedFileMapEntryImpl
		 * @see de.ubt.ai1.supermod.mm.file.client.impl.SuperModFileClientPackageImpl#getPathToVersionedFileMapEntry()
		 * @generated
		 */
		EClass PATH_TO_VERSIONED_FILE_MAP_ENTRY = eINSTANCE.getPathToVersionedFileMapEntry();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATH_TO_VERSIONED_FILE_MAP_ENTRY__KEY = eINSTANCE.getPathToVersionedFileMapEntry_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATH_TO_VERSIONED_FILE_MAP_ENTRY__VALUE = eINSTANCE.getPathToVersionedFileMapEntry_Value();

		/**
		 * The meta object literal for the '{@link de.ubt.ai1.supermod.mm.file.client.impl.VersionedFileExportTraceImpl <em>Versioned File Export Trace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai1.supermod.mm.file.client.impl.VersionedFileExportTraceImpl
		 * @see de.ubt.ai1.supermod.mm.file.client.impl.SuperModFileClientPackageImpl#getVersionedFileExportTrace()
		 * @generated
		 */
		EClass VERSIONED_FILE_EXPORT_TRACE = eINSTANCE.getVersionedFileExportTrace();

		/**
		 * The meta object literal for the '<em><b>Versioned File</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VERSIONED_FILE_EXPORT_TRACE__VERSIONED_FILE = eINSTANCE.getVersionedFileExportTrace_VersionedFile();

	}

} //SuperModFileClientPackage
