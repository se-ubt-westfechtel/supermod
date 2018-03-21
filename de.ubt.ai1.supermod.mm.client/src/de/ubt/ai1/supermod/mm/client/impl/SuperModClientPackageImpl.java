/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.mm.client.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import de.ubt.ai1.supermod.mm.client.ConflictSet;
import de.ubt.ai1.supermod.mm.client.LocalRepository;
import de.ubt.ai1.supermod.mm.client.ProductConflict;
import de.ubt.ai1.supermod.mm.client.ProductDimensionExportTrace;
import de.ubt.ai1.supermod.mm.client.ProductSpaceExportTrace;
import de.ubt.ai1.supermod.mm.client.Severity;
import de.ubt.ai1.supermod.mm.client.SingleVersionProductDimensionDescriptor;
import de.ubt.ai1.supermod.mm.client.SingleVersionProductSpaceDescriptor;
import de.ubt.ai1.supermod.mm.client.SuperModClientFactory;
import de.ubt.ai1.supermod.mm.client.SuperModClientPackage;
import de.ubt.ai1.supermod.mm.core.SuperModCorePackage;

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
public class SuperModClientPackageImpl extends EPackageImpl implements SuperModClientPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass singleVersionProductSpaceDescriptorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass singleVersionProductDimensionDescriptorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass localRepositoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productSpaceExportTraceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productDimensionExportTraceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conflictSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productConflictEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum severityEEnum = null;

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
	 * @see de.ubt.ai1.supermod.mm.client.SuperModClientPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SuperModClientPackageImpl() {
		super(eNS_URI, SuperModClientFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SuperModClientPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SuperModClientPackage init() {
		if (isInited) return (SuperModClientPackage)EPackage.Registry.INSTANCE.getEPackage(SuperModClientPackage.eNS_URI);

		// Obtain or create and register package
		SuperModClientPackageImpl theSuperModClientPackage = (SuperModClientPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SuperModClientPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SuperModClientPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		SuperModCorePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		SuperModClientPackageImpl theSuperModClientPackage_1 = (SuperModClientPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SuperModClientPackage.eNS_URI) instanceof SuperModClientPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SuperModClientPackage.eNS_URI) : SuperModClientPackage.eINSTANCE);

		// Create package meta-data objects
		theSuperModClientPackage.createPackageContents();
		theSuperModClientPackage_1.createPackageContents();

		// Initialize created meta-data
		theSuperModClientPackage.initializePackageContents();
		theSuperModClientPackage_1.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSuperModClientPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SuperModClientPackage.eNS_URI, theSuperModClientPackage);
		return theSuperModClientPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSingleVersionProductSpaceDescriptor() {
		return singleVersionProductSpaceDescriptorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSingleVersionProductSpaceDescriptor_DimensionDescriptors() {
		return (EReference)singleVersionProductSpaceDescriptorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSingleVersionProductSpaceDescriptor__IsModified() {
		return singleVersionProductSpaceDescriptorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSingleVersionProductSpaceDescriptor__SetModified__boolean() {
		return singleVersionProductSpaceDescriptorEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSingleVersionProductDimensionDescriptor() {
		return singleVersionProductDimensionDescriptorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSingleVersionProductDimensionDescriptor_DimensionName() {
		return (EAttribute)singleVersionProductDimensionDescriptorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSingleVersionProductDimensionDescriptor__IsModified() {
		return singleVersionProductDimensionDescriptorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSingleVersionProductDimensionDescriptor__SetModified__boolean() {
		return singleVersionProductDimensionDescriptorEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocalRepository() {
		return localRepositoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocalRepository_LocalDescriptor() {
		return (EReference)localRepositoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocalRepository_LocalChoice() {
		return (EReference)localRepositoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocalRepository_LocalAmbition() {
		return (EReference)localRepositoryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocalRepository_RemoteUri() {
		return (EAttribute)localRepositoryEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocalRepository_RemoteUser() {
		return (EAttribute)localRepositoryEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocalRepository_LocallyModified() {
		return (EAttribute)localRepositoryEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocalRepository_ReadTransactionId() {
		return (EAttribute)localRepositoryEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocalRepository_WriteTransactionId() {
		return (EAttribute)localRepositoryEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProductSpaceExportTrace() {
		return productSpaceExportTraceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProductSpaceExportTrace_ProductSpace() {
		return (EReference)productSpaceExportTraceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProductSpaceExportTrace_DimensionTraces() {
		return (EReference)productSpaceExportTraceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProductSpaceExportTrace__GetTraceForDimension__ProductDimension() {
		return productSpaceExportTraceEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProductDimensionExportTrace() {
		return productDimensionExportTraceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProductDimensionExportTrace_ProductDimension() {
		return (EReference)productDimensionExportTraceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConflictSet() {
		return conflictSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConflictSet_Conflicts() {
		return (EReference)conflictSetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConflictSet_Severity() {
		return (EAttribute)conflictSetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProductConflict() {
		return productConflictEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProductConflict_AffectedProductSpaceElements() {
		return (EReference)productConflictEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProductConflict_Severity() {
		return (EAttribute)productConflictEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSeverity() {
		return severityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SuperModClientFactory getSuperModClientFactory() {
		return (SuperModClientFactory)getEFactoryInstance();
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
		singleVersionProductSpaceDescriptorEClass = createEClass(SINGLE_VERSION_PRODUCT_SPACE_DESCRIPTOR);
		createEReference(singleVersionProductSpaceDescriptorEClass, SINGLE_VERSION_PRODUCT_SPACE_DESCRIPTOR__DIMENSION_DESCRIPTORS);
		createEOperation(singleVersionProductSpaceDescriptorEClass, SINGLE_VERSION_PRODUCT_SPACE_DESCRIPTOR___IS_MODIFIED);
		createEOperation(singleVersionProductSpaceDescriptorEClass, SINGLE_VERSION_PRODUCT_SPACE_DESCRIPTOR___SET_MODIFIED__BOOLEAN);

		singleVersionProductDimensionDescriptorEClass = createEClass(SINGLE_VERSION_PRODUCT_DIMENSION_DESCRIPTOR);
		createEAttribute(singleVersionProductDimensionDescriptorEClass, SINGLE_VERSION_PRODUCT_DIMENSION_DESCRIPTOR__DIMENSION_NAME);
		createEOperation(singleVersionProductDimensionDescriptorEClass, SINGLE_VERSION_PRODUCT_DIMENSION_DESCRIPTOR___IS_MODIFIED);
		createEOperation(singleVersionProductDimensionDescriptorEClass, SINGLE_VERSION_PRODUCT_DIMENSION_DESCRIPTOR___SET_MODIFIED__BOOLEAN);

		localRepositoryEClass = createEClass(LOCAL_REPOSITORY);
		createEReference(localRepositoryEClass, LOCAL_REPOSITORY__LOCAL_DESCRIPTOR);
		createEReference(localRepositoryEClass, LOCAL_REPOSITORY__LOCAL_CHOICE);
		createEReference(localRepositoryEClass, LOCAL_REPOSITORY__LOCAL_AMBITION);
		createEAttribute(localRepositoryEClass, LOCAL_REPOSITORY__REMOTE_URI);
		createEAttribute(localRepositoryEClass, LOCAL_REPOSITORY__REMOTE_USER);
		createEAttribute(localRepositoryEClass, LOCAL_REPOSITORY__LOCALLY_MODIFIED);
		createEAttribute(localRepositoryEClass, LOCAL_REPOSITORY__READ_TRANSACTION_ID);
		createEAttribute(localRepositoryEClass, LOCAL_REPOSITORY__WRITE_TRANSACTION_ID);

		productSpaceExportTraceEClass = createEClass(PRODUCT_SPACE_EXPORT_TRACE);
		createEReference(productSpaceExportTraceEClass, PRODUCT_SPACE_EXPORT_TRACE__PRODUCT_SPACE);
		createEReference(productSpaceExportTraceEClass, PRODUCT_SPACE_EXPORT_TRACE__DIMENSION_TRACES);
		createEOperation(productSpaceExportTraceEClass, PRODUCT_SPACE_EXPORT_TRACE___GET_TRACE_FOR_DIMENSION__PRODUCTDIMENSION);

		productDimensionExportTraceEClass = createEClass(PRODUCT_DIMENSION_EXPORT_TRACE);
		createEReference(productDimensionExportTraceEClass, PRODUCT_DIMENSION_EXPORT_TRACE__PRODUCT_DIMENSION);

		conflictSetEClass = createEClass(CONFLICT_SET);
		createEReference(conflictSetEClass, CONFLICT_SET__CONFLICTS);
		createEAttribute(conflictSetEClass, CONFLICT_SET__SEVERITY);

		productConflictEClass = createEClass(PRODUCT_CONFLICT);
		createEReference(productConflictEClass, PRODUCT_CONFLICT__AFFECTED_PRODUCT_SPACE_ELEMENTS);
		createEAttribute(productConflictEClass, PRODUCT_CONFLICT__SEVERITY);

		// Create enums
		severityEEnum = createEEnum(SEVERITY);
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
		SuperModClientPackage theSuperModClientPackage_1 = (SuperModClientPackage)EPackage.Registry.INSTANCE.getEPackage(SuperModClientPackage.eNS_URI);
		SuperModCorePackage theSuperModCorePackage = (SuperModCorePackage)EPackage.Registry.INSTANCE.getEPackage(SuperModCorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		localRepositoryEClass.getESuperTypes().add(theSuperModCorePackage.getRepository());

		// Initialize classes, features, and operations; add parameters
		initEClass(singleVersionProductSpaceDescriptorEClass, SingleVersionProductSpaceDescriptor.class, "SingleVersionProductSpaceDescriptor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSingleVersionProductSpaceDescriptor_DimensionDescriptors(), theSuperModClientPackage_1.getSingleVersionProductDimensionDescriptor(), null, "dimensionDescriptors", null, 0, -1, SingleVersionProductSpaceDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getSingleVersionProductSpaceDescriptor__IsModified(), ecorePackage.getEBoolean(), "isModified", 0, 1, IS_UNIQUE, IS_ORDERED);

		EOperation op = initEOperation(getSingleVersionProductSpaceDescriptor__SetModified__boolean(), null, "setModified", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "modified", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(singleVersionProductDimensionDescriptorEClass, SingleVersionProductDimensionDescriptor.class, "SingleVersionProductDimensionDescriptor", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSingleVersionProductDimensionDescriptor_DimensionName(), ecorePackage.getEString(), "dimensionName", null, 0, 1, SingleVersionProductDimensionDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getSingleVersionProductDimensionDescriptor__IsModified(), ecorePackage.getEBoolean(), "isModified", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSingleVersionProductDimensionDescriptor__SetModified__boolean(), null, "setModified", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "modified", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(localRepositoryEClass, LocalRepository.class, "LocalRepository", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLocalRepository_LocalDescriptor(), theSuperModClientPackage_1.getSingleVersionProductSpaceDescriptor(), null, "localDescriptor", null, 0, 1, LocalRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLocalRepository_LocalChoice(), theSuperModCorePackage.getOptionBinding(), null, "localChoice", null, 0, 1, LocalRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLocalRepository_LocalAmbition(), theSuperModCorePackage.getOptionBinding(), null, "localAmbition", null, 0, 1, LocalRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocalRepository_RemoteUri(), ecorePackage.getEString(), "remoteUri", null, 0, 1, LocalRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocalRepository_RemoteUser(), ecorePackage.getEString(), "remoteUser", null, 0, 1, LocalRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocalRepository_LocallyModified(), ecorePackage.getEBoolean(), "locallyModified", null, 0, 1, LocalRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocalRepository_ReadTransactionId(), ecorePackage.getEInt(), "readTransactionId", null, 0, 1, LocalRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocalRepository_WriteTransactionId(), ecorePackage.getEInt(), "writeTransactionId", null, 0, 1, LocalRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(productSpaceExportTraceEClass, ProductSpaceExportTrace.class, "ProductSpaceExportTrace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProductSpaceExportTrace_ProductSpace(), theSuperModCorePackage.getProductSpace(), null, "productSpace", null, 0, 1, ProductSpaceExportTrace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProductSpaceExportTrace_DimensionTraces(), theSuperModClientPackage_1.getProductDimensionExportTrace(), null, "dimensionTraces", null, 0, -1, ProductSpaceExportTrace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getProductSpaceExportTrace__GetTraceForDimension__ProductDimension(), theSuperModClientPackage_1.getProductDimensionExportTrace(), "getTraceForDimension", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSuperModCorePackage.getProductDimension(), "dimension", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(productDimensionExportTraceEClass, ProductDimensionExportTrace.class, "ProductDimensionExportTrace", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProductDimensionExportTrace_ProductDimension(), theSuperModCorePackage.getProductDimension(), null, "productDimension", null, 0, 1, ProductDimensionExportTrace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conflictSetEClass, ConflictSet.class, "ConflictSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConflictSet_Conflicts(), theSuperModClientPackage_1.getProductConflict(), null, "conflicts", null, 0, -1, ConflictSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConflictSet_Severity(), theSuperModClientPackage_1.getSeverity(), "severity", null, 0, 1, ConflictSet.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(productConflictEClass, ProductConflict.class, "ProductConflict", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProductConflict_AffectedProductSpaceElements(), theSuperModCorePackage.getProductSpaceElement(), null, "affectedProductSpaceElements", null, 0, -1, ProductConflict.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductConflict_Severity(), theSuperModClientPackage_1.getSeverity(), "severity", null, 0, 1, ProductConflict.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(severityEEnum, Severity.class, "Severity");
		addEEnumLiteral(severityEEnum, Severity.INFO);
		addEEnumLiteral(severityEEnum, Severity.WARNING);
		addEEnumLiteral(severityEEnum, Severity.ERROR);
		addEEnumLiteral(severityEEnum, Severity.FATAL);
	}

} //SuperModClientPackageImpl
