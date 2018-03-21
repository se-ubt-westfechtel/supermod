/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.mm.file.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import de.ubt.ai1.supermod.mm.core.SuperModCorePackage;
import de.ubt.ai1.supermod.mm.file.SuperModFileFactory;
import de.ubt.ai1.supermod.mm.file.SuperModFilePackage;
import de.ubt.ai1.supermod.mm.file.VersionedFile;
import de.ubt.ai1.supermod.mm.file.VersionedFileContent;
import de.ubt.ai1.supermod.mm.file.VersionedFileSystem;
import de.ubt.ai1.supermod.mm.file.VersionedFolder;
import de.ubt.ai1.supermod.mm.file.VersionedResource;

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
public class SuperModFilePackageImpl extends EPackageImpl implements SuperModFilePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass versionedFileSystemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass versionedResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass versionedFolderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass versionedFileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass versionedFileContentEClass = null;

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
	 * @see de.ubt.ai1.supermod.mm.file.SuperModFilePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SuperModFilePackageImpl() {
		super(eNS_URI, SuperModFileFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SuperModFilePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SuperModFilePackage init() {
		if (isInited) return (SuperModFilePackage)EPackage.Registry.INSTANCE.getEPackage(SuperModFilePackage.eNS_URI);

		// Obtain or create and register package
		SuperModFilePackageImpl theSuperModFilePackage = (SuperModFilePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SuperModFilePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SuperModFilePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		SuperModCorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theSuperModFilePackage.createPackageContents();

		// Initialize created meta-data
		theSuperModFilePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSuperModFilePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SuperModFilePackage.eNS_URI, theSuperModFilePackage);
		return theSuperModFilePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVersionedFileSystem() {
		return versionedFileSystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVersionedFileSystem_Roots() {
		return (EReference)versionedFileSystemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVersionedFileSystem_AllResources() {
		return (EReference)versionedFileSystemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVersionedFileSystem__GetResource__String() {
		return versionedFileSystemEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVersionedFileSystem__CreateFile__String() {
		return versionedFileSystemEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVersionedFileSystem__CreateFolder__String() {
		return versionedFileSystemEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVersionedResource() {
		return versionedResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVersionedResource_Name() {
		return (EAttribute)versionedResourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVersionedResource_Path() {
		return (EAttribute)versionedResourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVersionedResource_Container() {
		return (EReference)versionedResourceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVersionedFolder() {
		return versionedFolderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVersionedFolder_Contents() {
		return (EReference)versionedFolderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVersionedFolder_AllContents() {
		return (EReference)versionedFolderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVersionedFolder__GetContent__String() {
		return versionedFolderEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVersionedFile() {
		return versionedFileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVersionedFile_ContentType() {
		return (EAttribute)versionedFileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVersionedFile_Content() {
		return (EReference)versionedFileEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVersionedFileContent() {
		return versionedFileContentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVersionedFileContent_File() {
		return (EReference)versionedFileContentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVersionedFileContent_SuperExtension() {
		return (EAttribute)versionedFileContentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SuperModFileFactory getSuperModFileFactory() {
		return (SuperModFileFactory)getEFactoryInstance();
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
		versionedFileSystemEClass = createEClass(VERSIONED_FILE_SYSTEM);
		createEReference(versionedFileSystemEClass, VERSIONED_FILE_SYSTEM__ROOTS);
		createEReference(versionedFileSystemEClass, VERSIONED_FILE_SYSTEM__ALL_RESOURCES);
		createEOperation(versionedFileSystemEClass, VERSIONED_FILE_SYSTEM___GET_RESOURCE__STRING);
		createEOperation(versionedFileSystemEClass, VERSIONED_FILE_SYSTEM___CREATE_FILE__STRING);
		createEOperation(versionedFileSystemEClass, VERSIONED_FILE_SYSTEM___CREATE_FOLDER__STRING);

		versionedResourceEClass = createEClass(VERSIONED_RESOURCE);
		createEAttribute(versionedResourceEClass, VERSIONED_RESOURCE__NAME);
		createEAttribute(versionedResourceEClass, VERSIONED_RESOURCE__PATH);
		createEReference(versionedResourceEClass, VERSIONED_RESOURCE__CONTAINER);

		versionedFolderEClass = createEClass(VERSIONED_FOLDER);
		createEReference(versionedFolderEClass, VERSIONED_FOLDER__CONTENTS);
		createEReference(versionedFolderEClass, VERSIONED_FOLDER__ALL_CONTENTS);
		createEOperation(versionedFolderEClass, VERSIONED_FOLDER___GET_CONTENT__STRING);

		versionedFileEClass = createEClass(VERSIONED_FILE);
		createEAttribute(versionedFileEClass, VERSIONED_FILE__CONTENT_TYPE);
		createEReference(versionedFileEClass, VERSIONED_FILE__CONTENT);

		versionedFileContentEClass = createEClass(VERSIONED_FILE_CONTENT);
		createEReference(versionedFileContentEClass, VERSIONED_FILE_CONTENT__FILE);
		createEAttribute(versionedFileContentEClass, VERSIONED_FILE_CONTENT__SUPER_EXTENSION);
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
		SuperModCorePackage theSuperModCorePackage = (SuperModCorePackage)EPackage.Registry.INSTANCE.getEPackage(SuperModCorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		versionedFileSystemEClass.getESuperTypes().add(theSuperModCorePackage.getProductDimension());
		versionedResourceEClass.getESuperTypes().add(theSuperModCorePackage.getProductSpaceElement());
		versionedFolderEClass.getESuperTypes().add(this.getVersionedResource());
		versionedFileEClass.getESuperTypes().add(this.getVersionedResource());
		versionedFileContentEClass.getESuperTypes().add(theSuperModCorePackage.getProductSpaceElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(versionedFileSystemEClass, VersionedFileSystem.class, "VersionedFileSystem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVersionedFileSystem_Roots(), this.getVersionedResource(), null, "roots", null, 0, -1, VersionedFileSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVersionedFileSystem_AllResources(), this.getVersionedResource(), null, "allResources", null, 0, -1, VersionedFileSystem.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getVersionedFileSystem__GetResource__String(), this.getVersionedResource(), "getResource", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "path", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getVersionedFileSystem__CreateFile__String(), this.getVersionedFile(), "createFile", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "path", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getVersionedFileSystem__CreateFolder__String(), this.getVersionedFolder(), "createFolder", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "path", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(versionedResourceEClass, VersionedResource.class, "VersionedResource", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVersionedResource_Name(), ecorePackage.getEString(), "name", null, 0, 1, VersionedResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVersionedResource_Path(), ecorePackage.getEString(), "path", null, 0, 1, VersionedResource.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getVersionedResource_Container(), this.getVersionedFolder(), this.getVersionedFolder_Contents(), "container", null, 0, 1, VersionedResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(versionedFolderEClass, VersionedFolder.class, "VersionedFolder", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVersionedFolder_Contents(), this.getVersionedResource(), this.getVersionedResource_Container(), "contents", null, 0, -1, VersionedFolder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVersionedFolder_AllContents(), this.getVersionedResource(), null, "allContents", null, 0, -1, VersionedFolder.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		op = initEOperation(getVersionedFolder__GetContent__String(), this.getVersionedResource(), "getContent", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(versionedFileEClass, VersionedFile.class, "VersionedFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVersionedFile_ContentType(), ecorePackage.getEString(), "contentType", null, 0, 1, VersionedFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVersionedFile_Content(), this.getVersionedFileContent(), this.getVersionedFileContent_File(), "content", null, 0, 1, VersionedFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(versionedFileContentEClass, VersionedFileContent.class, "VersionedFileContent", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVersionedFileContent_File(), this.getVersionedFile(), this.getVersionedFile_Content(), "file", null, 0, 1, VersionedFileContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVersionedFileContent_SuperExtension(), ecorePackage.getEString(), "superExtension", null, 0, 1, VersionedFileContent.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //SuperModFilePackageImpl
