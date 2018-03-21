/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.mm.file.client.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import de.ubt.ai1.supermod.mm.client.SuperModClientPackage;
import de.ubt.ai1.supermod.mm.file.SuperModFilePackage;
import de.ubt.ai1.supermod.mm.file.client.SingleVersionFileDescriptor;
import de.ubt.ai1.supermod.mm.file.client.SingleVersionFileSystemDescriptor;
import de.ubt.ai1.supermod.mm.file.client.SingleVersionFolderDescriptor;
import de.ubt.ai1.supermod.mm.file.client.SingleVersionResourceDescriptor;
import de.ubt.ai1.supermod.mm.file.client.SuperModFileClientFactory;
import de.ubt.ai1.supermod.mm.file.client.SuperModFileClientPackage;
import de.ubt.ai1.supermod.mm.file.client.VersionedFileExportTrace;
import de.ubt.ai1.supermod.mm.file.client.VersionedFileSystemExportTrace;
import java.util.Map;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date 	2014-07-28
 * <!-- end-user-doc -->
 * @generated
 */
public class SuperModFileClientPackageImpl extends EPackageImpl implements SuperModFileClientPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass singleVersionFileSystemDescriptorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass singleVersionResourceDescriptorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass singleVersionFileDescriptorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass singleVersionFolderDescriptorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass versionedFileSystemExportTraceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pathToVersionedFileMapEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass versionedFileExportTraceEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see de.ubt.ai1.supermod.mm.file.client.SuperModFileClientPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SuperModFileClientPackageImpl() {
		super(eNS_URI, SuperModFileClientFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link SuperModFileClientPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SuperModFileClientPackage init() {
		if (isInited) return (SuperModFileClientPackage)EPackage.Registry.INSTANCE.getEPackage(SuperModFileClientPackage.eNS_URI);

		// Obtain or create and register package
		SuperModFileClientPackageImpl theSuperModFileClientPackage = (SuperModFileClientPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SuperModFileClientPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SuperModFileClientPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		SuperModClientPackage.eINSTANCE.eClass();
		SuperModFilePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theSuperModFileClientPackage.createPackageContents();

		// Initialize created meta-data
		theSuperModFileClientPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSuperModFileClientPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SuperModFileClientPackage.eNS_URI, theSuperModFileClientPackage);
		return theSuperModFileClientPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSingleVersionFileSystemDescriptor() {
		return singleVersionFileSystemDescriptorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSingleVersionFileSystemDescriptor_Roots() {
		return (EReference)singleVersionFileSystemDescriptorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSingleVersionFileSystemDescriptor_RootUri() {
		return (EAttribute)singleVersionFileSystemDescriptorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSingleVersionFileSystemDescriptor_AllResources() {
		return (EReference)singleVersionFileSystemDescriptorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSingleVersionFileSystemDescriptor__GetResource__String() {
		return singleVersionFileSystemDescriptorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSingleVersionFileSystemDescriptor__CreateFile__String() {
		return singleVersionFileSystemDescriptorEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSingleVersionFileSystemDescriptor__CreateFolder__String() {
		return singleVersionFileSystemDescriptorEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSingleVersionResourceDescriptor() {
		return singleVersionResourceDescriptorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSingleVersionResourceDescriptor_Name() {
		return (EAttribute)singleVersionResourceDescriptorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSingleVersionResourceDescriptor_Path() {
		return (EAttribute)singleVersionResourceDescriptorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSingleVersionResourceDescriptor_Container() {
		return (EReference)singleVersionResourceDescriptorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSingleVersionResourceDescriptor_Versioned() {
		return (EAttribute)singleVersionResourceDescriptorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSingleVersionFileDescriptor() {
		return singleVersionFileDescriptorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSingleVersionFileDescriptor_Hash() {
		return (EAttribute)singleVersionFileDescriptorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSingleVersionFolderDescriptor() {
		return singleVersionFolderDescriptorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSingleVersionFolderDescriptor_Contents() {
		return (EReference)singleVersionFolderDescriptorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSingleVersionFolderDescriptor_AllContents() {
		return (EReference)singleVersionFolderDescriptorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSingleVersionFolderDescriptor__GetContent__String() {
		return singleVersionFolderDescriptorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVersionedFileSystemExportTrace() {
		return versionedFileSystemExportTraceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVersionedFileSystemExportTrace_PathToVersionedFileMap() {
		return (EReference)versionedFileSystemExportTraceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPathToVersionedFileMapEntry() {
		return pathToVersionedFileMapEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPathToVersionedFileMapEntry_Key() {
		return (EAttribute)pathToVersionedFileMapEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPathToVersionedFileMapEntry_Value() {
		return (EReference)pathToVersionedFileMapEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVersionedFileExportTrace() {
		return versionedFileExportTraceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVersionedFileExportTrace_VersionedFile() {
		return (EReference)versionedFileExportTraceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SuperModFileClientFactory getSuperModFileClientFactory() {
		return (SuperModFileClientFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		singleVersionFileSystemDescriptorEClass = createEClass(SINGLE_VERSION_FILE_SYSTEM_DESCRIPTOR);
		createEReference(singleVersionFileSystemDescriptorEClass, SINGLE_VERSION_FILE_SYSTEM_DESCRIPTOR__ROOTS);
		createEAttribute(singleVersionFileSystemDescriptorEClass, SINGLE_VERSION_FILE_SYSTEM_DESCRIPTOR__ROOT_URI);
		createEReference(singleVersionFileSystemDescriptorEClass, SINGLE_VERSION_FILE_SYSTEM_DESCRIPTOR__ALL_RESOURCES);
		createEOperation(singleVersionFileSystemDescriptorEClass, SINGLE_VERSION_FILE_SYSTEM_DESCRIPTOR___GET_RESOURCE__STRING);
		createEOperation(singleVersionFileSystemDescriptorEClass, SINGLE_VERSION_FILE_SYSTEM_DESCRIPTOR___CREATE_FILE__STRING);
		createEOperation(singleVersionFileSystemDescriptorEClass, SINGLE_VERSION_FILE_SYSTEM_DESCRIPTOR___CREATE_FOLDER__STRING);

		singleVersionResourceDescriptorEClass = createEClass(SINGLE_VERSION_RESOURCE_DESCRIPTOR);
		createEAttribute(singleVersionResourceDescriptorEClass, SINGLE_VERSION_RESOURCE_DESCRIPTOR__NAME);
		createEAttribute(singleVersionResourceDescriptorEClass, SINGLE_VERSION_RESOURCE_DESCRIPTOR__PATH);
		createEReference(singleVersionResourceDescriptorEClass, SINGLE_VERSION_RESOURCE_DESCRIPTOR__CONTAINER);
		createEAttribute(singleVersionResourceDescriptorEClass, SINGLE_VERSION_RESOURCE_DESCRIPTOR__VERSIONED);

		singleVersionFileDescriptorEClass = createEClass(SINGLE_VERSION_FILE_DESCRIPTOR);
		createEAttribute(singleVersionFileDescriptorEClass, SINGLE_VERSION_FILE_DESCRIPTOR__HASH);

		singleVersionFolderDescriptorEClass = createEClass(SINGLE_VERSION_FOLDER_DESCRIPTOR);
		createEReference(singleVersionFolderDescriptorEClass, SINGLE_VERSION_FOLDER_DESCRIPTOR__CONTENTS);
		createEReference(singleVersionFolderDescriptorEClass, SINGLE_VERSION_FOLDER_DESCRIPTOR__ALL_CONTENTS);
		createEOperation(singleVersionFolderDescriptorEClass, SINGLE_VERSION_FOLDER_DESCRIPTOR___GET_CONTENT__STRING);

		versionedFileSystemExportTraceEClass = createEClass(VERSIONED_FILE_SYSTEM_EXPORT_TRACE);
		createEReference(versionedFileSystemExportTraceEClass, VERSIONED_FILE_SYSTEM_EXPORT_TRACE__PATH_TO_VERSIONED_FILE_MAP);

		pathToVersionedFileMapEntryEClass = createEClass(PATH_TO_VERSIONED_FILE_MAP_ENTRY);
		createEAttribute(pathToVersionedFileMapEntryEClass, PATH_TO_VERSIONED_FILE_MAP_ENTRY__KEY);
		createEReference(pathToVersionedFileMapEntryEClass, PATH_TO_VERSIONED_FILE_MAP_ENTRY__VALUE);

		versionedFileExportTraceEClass = createEClass(VERSIONED_FILE_EXPORT_TRACE);
		createEReference(versionedFileExportTraceEClass, VERSIONED_FILE_EXPORT_TRACE__VERSIONED_FILE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		SuperModClientPackage theSuperModClientPackage = (SuperModClientPackage)EPackage.Registry.INSTANCE.getEPackage(SuperModClientPackage.eNS_URI);
		SuperModFilePackage theSuperModFilePackage = (SuperModFilePackage)EPackage.Registry.INSTANCE.getEPackage(SuperModFilePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		singleVersionFileSystemDescriptorEClass.getESuperTypes().add(theSuperModClientPackage.getSingleVersionProductDimensionDescriptor());
		singleVersionFileDescriptorEClass.getESuperTypes().add(this.getSingleVersionResourceDescriptor());
		singleVersionFolderDescriptorEClass.getESuperTypes().add(this.getSingleVersionResourceDescriptor());
		versionedFileSystemExportTraceEClass.getESuperTypes().add(theSuperModClientPackage.getProductDimensionExportTrace());

		// Initialize classes, features, and operations; add parameters
		initEClass(singleVersionFileSystemDescriptorEClass, SingleVersionFileSystemDescriptor.class, "SingleVersionFileSystemDescriptor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSingleVersionFileSystemDescriptor_Roots(), this.getSingleVersionResourceDescriptor(), null, "roots", null, 0, -1, SingleVersionFileSystemDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSingleVersionFileSystemDescriptor_RootUri(), ecorePackage.getEString(), "rootUri", null, 0, 1, SingleVersionFileSystemDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSingleVersionFileSystemDescriptor_AllResources(), this.getSingleVersionResourceDescriptor(), null, "allResources", null, 0, -1, SingleVersionFileSystemDescriptor.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getSingleVersionFileSystemDescriptor__GetResource__String(), this.getSingleVersionResourceDescriptor(), "getResource", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "path", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSingleVersionFileSystemDescriptor__CreateFile__String(), this.getSingleVersionFileDescriptor(), "createFile", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "path", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSingleVersionFileSystemDescriptor__CreateFolder__String(), this.getSingleVersionFolderDescriptor(), "createFolder", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "path", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(singleVersionResourceDescriptorEClass, SingleVersionResourceDescriptor.class, "SingleVersionResourceDescriptor", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSingleVersionResourceDescriptor_Name(), ecorePackage.getEString(), "name", null, 0, 1, SingleVersionResourceDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSingleVersionResourceDescriptor_Path(), ecorePackage.getEString(), "path", null, 0, 1, SingleVersionResourceDescriptor.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSingleVersionResourceDescriptor_Container(), this.getSingleVersionFolderDescriptor(), this.getSingleVersionFolderDescriptor_Contents(), "container", null, 0, 1, SingleVersionResourceDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSingleVersionResourceDescriptor_Versioned(), ecorePackage.getEBoolean(), "versioned", null, 0, 1, SingleVersionResourceDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(singleVersionFileDescriptorEClass, SingleVersionFileDescriptor.class, "SingleVersionFileDescriptor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSingleVersionFileDescriptor_Hash(), ecorePackage.getEString(), "hash", null, 0, 1, SingleVersionFileDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(singleVersionFolderDescriptorEClass, SingleVersionFolderDescriptor.class, "SingleVersionFolderDescriptor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSingleVersionFolderDescriptor_Contents(), this.getSingleVersionResourceDescriptor(), this.getSingleVersionResourceDescriptor_Container(), "contents", null, 0, -1, SingleVersionFolderDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSingleVersionFolderDescriptor_AllContents(), this.getSingleVersionResourceDescriptor(), null, "allContents", null, 0, -1, SingleVersionFolderDescriptor.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		op = initEOperation(getSingleVersionFolderDescriptor__GetContent__String(), this.getSingleVersionResourceDescriptor(), "getContent", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(versionedFileSystemExportTraceEClass, VersionedFileSystemExportTrace.class, "VersionedFileSystemExportTrace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVersionedFileSystemExportTrace_PathToVersionedFileMap(), this.getPathToVersionedFileMapEntry(), null, "pathToVersionedFileMap", null, 0, -1, VersionedFileSystemExportTrace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pathToVersionedFileMapEntryEClass, Map.Entry.class, "PathToVersionedFileMapEntry", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPathToVersionedFileMapEntry_Key(), ecorePackage.getEString(), "key", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPathToVersionedFileMapEntry_Value(), this.getVersionedFileExportTrace(), null, "value", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(versionedFileExportTraceEClass, VersionedFileExportTrace.class, "VersionedFileExportTrace", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVersionedFileExportTrace_VersionedFile(), theSuperModFilePackage.getVersionedFile(), null, "versionedFile", null, 0, 1, VersionedFileExportTrace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //SuperModFileClientPackageImpl
