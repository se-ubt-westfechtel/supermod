/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.mm.emffile.client.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import de.ubt.ai1.supermod.mm.client.SuperModClientPackage;
import de.ubt.ai1.supermod.mm.emffile.SuperModEMFFilePackage;
import de.ubt.ai1.supermod.mm.emffile.client.EMFClassDefinitionConflict;
import de.ubt.ai1.supermod.mm.emffile.client.EMFCyclicContainmentConflict;
import de.ubt.ai1.supermod.mm.emffile.client.EMFFeatureCompatibilityConflict;
import de.ubt.ai1.supermod.mm.emffile.client.EMFFileExportTrace;
import de.ubt.ai1.supermod.mm.emffile.client.EMFLinkCompatibilityConflict;
import de.ubt.ai1.supermod.mm.emffile.client.EMFMultiFeatureValueConflict;
import de.ubt.ai1.supermod.mm.emffile.client.EMFObjectClassConflict;
import de.ubt.ai1.supermod.mm.emffile.client.EMFObjectContainerConflict;
import de.ubt.ai1.supermod.mm.emffile.client.EMFObjectDefinitionConflict;
import de.ubt.ai1.supermod.mm.emffile.client.EMFReferentialIntegrityConflict;
import de.ubt.ai1.supermod.mm.emffile.client.EMFSingleFeatureValueConflict;
import de.ubt.ai1.supermod.mm.emffile.client.SuperModEMFFileClientFactory;
import de.ubt.ai1.supermod.mm.emffile.client.SuperModEMFFileClientPackage;
import de.ubt.ai1.supermod.mm.file.client.SuperModFileClientPackage;
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
public class SuperModEMFFileClientPackageImpl extends EPackageImpl implements SuperModEMFFileClientPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emfObjectClassConflictEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emfClassDefinitionConflictEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emfFeatureCompatibilityConflictEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emfObjectContainerConflictEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emfCyclicContainmentConflictEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emfSingleFeatureValueConflictEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emfMultiFeatureValueConflictEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emfLinkCompatibilityConflictEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emfObjectDefinitionConflictEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emfReferentialIntegrityConflictEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emfFileExportTraceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emfObjectToEObjectMapEntryEClass = null;

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
	 * @see de.ubt.ai1.supermod.mm.emffile.client.SuperModEMFFileClientPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SuperModEMFFileClientPackageImpl() {
		super(eNS_URI, SuperModEMFFileClientFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SuperModEMFFileClientPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SuperModEMFFileClientPackage init() {
		if (isInited) return (SuperModEMFFileClientPackage)EPackage.Registry.INSTANCE.getEPackage(SuperModEMFFileClientPackage.eNS_URI);

		// Obtain or create and register package
		SuperModEMFFileClientPackageImpl theSuperModEMFFileClientPackage = (SuperModEMFFileClientPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SuperModEMFFileClientPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SuperModEMFFileClientPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		SuperModEMFFilePackage.eINSTANCE.eClass();
		SuperModFileClientPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theSuperModEMFFileClientPackage.createPackageContents();

		// Initialize created meta-data
		theSuperModEMFFileClientPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSuperModEMFFileClientPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SuperModEMFFileClientPackage.eNS_URI, theSuperModEMFFileClientPackage);
		return theSuperModEMFFileClientPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEMFObjectClassConflict() {
		return emfObjectClassConflictEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMFObjectClassConflict_AffectedObject() {
		return (EReference)emfObjectClassConflictEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEMFClassDefinitionConflict() {
		return emfClassDefinitionConflictEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMFClassDefinitionConflict_AffectedClassRef() {
		return (EReference)emfClassDefinitionConflictEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEMFFeatureCompatibilityConflict() {
		return emfFeatureCompatibilityConflictEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMFFeatureCompatibilityConflict_AffectedFeatureRef() {
		return (EReference)emfFeatureCompatibilityConflictEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEMFObjectContainerConflict() {
		return emfObjectContainerConflictEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMFObjectContainerConflict_AffectedObject() {
		return (EReference)emfObjectContainerConflictEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEMFCyclicContainmentConflict() {
		return emfCyclicContainmentConflictEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMFCyclicContainmentConflict_AffectedObjects() {
		return (EReference)emfCyclicContainmentConflictEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEMFSingleFeatureValueConflict() {
		return emfSingleFeatureValueConflictEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMFSingleFeatureValueConflict_AffectedFeatureRef() {
		return (EReference)emfSingleFeatureValueConflictEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEMFMultiFeatureValueConflict() {
		return emfMultiFeatureValueConflictEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMFMultiFeatureValueConflict_AffectedFeatureRef() {
		return (EReference)emfMultiFeatureValueConflictEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEMFLinkCompatibilityConflict() {
		return emfLinkCompatibilityConflictEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMFLinkCompatibilityConflict_IncompatibleLink() {
		return (EReference)emfLinkCompatibilityConflictEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEMFObjectDefinitionConflict() {
		return emfObjectDefinitionConflictEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMFObjectDefinitionConflict_AffectedObjectRef() {
		return (EReference)emfObjectDefinitionConflictEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEMFReferentialIntegrityConflict() {
		return emfReferentialIntegrityConflictEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMFReferentialIntegrityConflict_AffectedObjectRef() {
		return (EReference)emfReferentialIntegrityConflictEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEMFFileExportTrace() {
		return emfFileExportTraceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMFFileExportTrace_EmfObjectToEObjectMap() {
		return (EReference)emfFileExportTraceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEMFObjectToEObjectMapEntry() {
		return emfObjectToEObjectMapEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMFObjectToEObjectMapEntry_Key() {
		return (EReference)emfObjectToEObjectMapEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMFObjectToEObjectMapEntry_Value() {
		return (EReference)emfObjectToEObjectMapEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SuperModEMFFileClientFactory getSuperModEMFFileClientFactory() {
		return (SuperModEMFFileClientFactory)getEFactoryInstance();
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
		emfObjectClassConflictEClass = createEClass(EMF_OBJECT_CLASS_CONFLICT);
		createEReference(emfObjectClassConflictEClass, EMF_OBJECT_CLASS_CONFLICT__AFFECTED_OBJECT);

		emfClassDefinitionConflictEClass = createEClass(EMF_CLASS_DEFINITION_CONFLICT);
		createEReference(emfClassDefinitionConflictEClass, EMF_CLASS_DEFINITION_CONFLICT__AFFECTED_CLASS_REF);

		emfFeatureCompatibilityConflictEClass = createEClass(EMF_FEATURE_COMPATIBILITY_CONFLICT);
		createEReference(emfFeatureCompatibilityConflictEClass, EMF_FEATURE_COMPATIBILITY_CONFLICT__AFFECTED_FEATURE_REF);

		emfObjectContainerConflictEClass = createEClass(EMF_OBJECT_CONTAINER_CONFLICT);
		createEReference(emfObjectContainerConflictEClass, EMF_OBJECT_CONTAINER_CONFLICT__AFFECTED_OBJECT);

		emfCyclicContainmentConflictEClass = createEClass(EMF_CYCLIC_CONTAINMENT_CONFLICT);
		createEReference(emfCyclicContainmentConflictEClass, EMF_CYCLIC_CONTAINMENT_CONFLICT__AFFECTED_OBJECTS);

		emfSingleFeatureValueConflictEClass = createEClass(EMF_SINGLE_FEATURE_VALUE_CONFLICT);
		createEReference(emfSingleFeatureValueConflictEClass, EMF_SINGLE_FEATURE_VALUE_CONFLICT__AFFECTED_FEATURE_REF);

		emfMultiFeatureValueConflictEClass = createEClass(EMF_MULTI_FEATURE_VALUE_CONFLICT);
		createEReference(emfMultiFeatureValueConflictEClass, EMF_MULTI_FEATURE_VALUE_CONFLICT__AFFECTED_FEATURE_REF);

		emfLinkCompatibilityConflictEClass = createEClass(EMF_LINK_COMPATIBILITY_CONFLICT);
		createEReference(emfLinkCompatibilityConflictEClass, EMF_LINK_COMPATIBILITY_CONFLICT__INCOMPATIBLE_LINK);

		emfObjectDefinitionConflictEClass = createEClass(EMF_OBJECT_DEFINITION_CONFLICT);
		createEReference(emfObjectDefinitionConflictEClass, EMF_OBJECT_DEFINITION_CONFLICT__AFFECTED_OBJECT_REF);

		emfReferentialIntegrityConflictEClass = createEClass(EMF_REFERENTIAL_INTEGRITY_CONFLICT);
		createEReference(emfReferentialIntegrityConflictEClass, EMF_REFERENTIAL_INTEGRITY_CONFLICT__AFFECTED_OBJECT_REF);

		emfFileExportTraceEClass = createEClass(EMF_FILE_EXPORT_TRACE);
		createEReference(emfFileExportTraceEClass, EMF_FILE_EXPORT_TRACE__EMF_OBJECT_TO_EOBJECT_MAP);

		emfObjectToEObjectMapEntryEClass = createEClass(EMF_OBJECT_TO_EOBJECT_MAP_ENTRY);
		createEReference(emfObjectToEObjectMapEntryEClass, EMF_OBJECT_TO_EOBJECT_MAP_ENTRY__KEY);
		createEReference(emfObjectToEObjectMapEntryEClass, EMF_OBJECT_TO_EOBJECT_MAP_ENTRY__VALUE);
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
		SuperModEMFFilePackage theSuperModEMFFilePackage = (SuperModEMFFilePackage)EPackage.Registry.INSTANCE.getEPackage(SuperModEMFFilePackage.eNS_URI);
		SuperModFileClientPackage theSuperModFileClientPackage = (SuperModFileClientPackage)EPackage.Registry.INSTANCE.getEPackage(SuperModFileClientPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		emfObjectClassConflictEClass.getESuperTypes().add(theSuperModClientPackage.getProductConflict());
		emfClassDefinitionConflictEClass.getESuperTypes().add(theSuperModClientPackage.getProductConflict());
		emfFeatureCompatibilityConflictEClass.getESuperTypes().add(theSuperModClientPackage.getProductConflict());
		emfObjectContainerConflictEClass.getESuperTypes().add(theSuperModClientPackage.getProductConflict());
		emfCyclicContainmentConflictEClass.getESuperTypes().add(theSuperModClientPackage.getProductConflict());
		emfSingleFeatureValueConflictEClass.getESuperTypes().add(theSuperModClientPackage.getProductConflict());
		emfMultiFeatureValueConflictEClass.getESuperTypes().add(theSuperModClientPackage.getProductConflict());
		emfLinkCompatibilityConflictEClass.getESuperTypes().add(theSuperModClientPackage.getProductConflict());
		emfObjectDefinitionConflictEClass.getESuperTypes().add(theSuperModClientPackage.getProductConflict());
		emfReferentialIntegrityConflictEClass.getESuperTypes().add(theSuperModClientPackage.getProductConflict());
		emfFileExportTraceEClass.getESuperTypes().add(theSuperModFileClientPackage.getVersionedFileExportTrace());

		// Initialize classes, features, and operations; add parameters
		initEClass(emfObjectClassConflictEClass, EMFObjectClassConflict.class, "EMFObjectClassConflict", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEMFObjectClassConflict_AffectedObject(), theSuperModEMFFilePackage.getEMFObject(), null, "affectedObject", null, 0, 1, EMFObjectClassConflict.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(emfClassDefinitionConflictEClass, EMFClassDefinitionConflict.class, "EMFClassDefinitionConflict", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEMFClassDefinitionConflict_AffectedClassRef(), theSuperModEMFFilePackage.getEMFClassRef(), null, "affectedClassRef", null, 0, 1, EMFClassDefinitionConflict.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(emfFeatureCompatibilityConflictEClass, EMFFeatureCompatibilityConflict.class, "EMFFeatureCompatibilityConflict", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEMFFeatureCompatibilityConflict_AffectedFeatureRef(), theSuperModEMFFilePackage.getEMFFeatureRef(), null, "affectedFeatureRef", null, 0, 1, EMFFeatureCompatibilityConflict.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(emfObjectContainerConflictEClass, EMFObjectContainerConflict.class, "EMFObjectContainerConflict", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEMFObjectContainerConflict_AffectedObject(), theSuperModEMFFilePackage.getEMFObject(), null, "affectedObject", null, 0, 1, EMFObjectContainerConflict.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(emfCyclicContainmentConflictEClass, EMFCyclicContainmentConflict.class, "EMFCyclicContainmentConflict", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEMFCyclicContainmentConflict_AffectedObjects(), theSuperModEMFFilePackage.getEMFObject(), null, "affectedObjects", null, 0, -1, EMFCyclicContainmentConflict.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(emfSingleFeatureValueConflictEClass, EMFSingleFeatureValueConflict.class, "EMFSingleFeatureValueConflict", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEMFSingleFeatureValueConflict_AffectedFeatureRef(), theSuperModEMFFilePackage.getEMFFeatureRef(), null, "affectedFeatureRef", null, 0, 1, EMFSingleFeatureValueConflict.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(emfMultiFeatureValueConflictEClass, EMFMultiFeatureValueConflict.class, "EMFMultiFeatureValueConflict", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEMFMultiFeatureValueConflict_AffectedFeatureRef(), theSuperModEMFFilePackage.getEMFFeatureRef(), null, "affectedFeatureRef", null, 0, 1, EMFMultiFeatureValueConflict.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(emfLinkCompatibilityConflictEClass, EMFLinkCompatibilityConflict.class, "EMFLinkCompatibilityConflict", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEMFLinkCompatibilityConflict_IncompatibleLink(), theSuperModEMFFilePackage.getEMFInternalReferenceValue(), null, "incompatibleLink", null, 0, 1, EMFLinkCompatibilityConflict.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(emfObjectDefinitionConflictEClass, EMFObjectDefinitionConflict.class, "EMFObjectDefinitionConflict", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEMFObjectDefinitionConflict_AffectedObjectRef(), theSuperModEMFFilePackage.getEMFExternalReferenceValue(), null, "affectedObjectRef", null, 0, 1, EMFObjectDefinitionConflict.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(emfReferentialIntegrityConflictEClass, EMFReferentialIntegrityConflict.class, "EMFReferentialIntegrityConflict", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEMFReferentialIntegrityConflict_AffectedObjectRef(), theSuperModEMFFilePackage.getEMFInternalReferenceValue(), null, "affectedObjectRef", null, 0, 1, EMFReferentialIntegrityConflict.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(emfFileExportTraceEClass, EMFFileExportTrace.class, "EMFFileExportTrace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEMFFileExportTrace_EmfObjectToEObjectMap(), this.getEMFObjectToEObjectMapEntry(), null, "emfObjectToEObjectMap", null, 0, -1, EMFFileExportTrace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(emfObjectToEObjectMapEntryEClass, Map.Entry.class, "EMFObjectToEObjectMapEntry", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEMFObjectToEObjectMapEntry_Key(), theSuperModEMFFilePackage.getEMFObject(), null, "key", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMFObjectToEObjectMapEntry_Value(), ecorePackage.getEObject(), null, "value", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //SuperModEMFFileClientPackageImpl
