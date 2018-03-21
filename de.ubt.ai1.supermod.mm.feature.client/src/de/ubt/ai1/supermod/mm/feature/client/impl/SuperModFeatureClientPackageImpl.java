/******************************************************************************
 * Copyright (c) 2018 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.mm.feature.client.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import de.ubt.ai1.supermod.mm.client.SuperModClientPackage;
import de.ubt.ai1.supermod.mm.core.SuperModCorePackage;
import de.ubt.ai1.supermod.mm.feature.SuperModFeaturePackage;
import de.ubt.ai1.supermod.mm.feature.client.CyclicFeatureTreeConflict;
import de.ubt.ai1.supermod.mm.feature.client.DanglingDependencyConflict;
import de.ubt.ai1.supermod.mm.feature.client.DanglingFeatureConflict;
import de.ubt.ai1.supermod.mm.feature.client.DanglingGroupConflict;
import de.ubt.ai1.supermod.mm.feature.client.DependencyLinkTargetConflict;
import de.ubt.ai1.supermod.mm.feature.client.DisplayNameConflict;
import de.ubt.ai1.supermod.mm.feature.client.FeatureConfiguration;
import de.ubt.ai1.supermod.mm.feature.client.FeatureModelExportTrace;
import de.ubt.ai1.supermod.mm.feature.client.MultipleGroupMembershipConflict;
import de.ubt.ai1.supermod.mm.feature.client.NonOptionalGroupedFeatureConflict;
import de.ubt.ai1.supermod.mm.feature.client.ParentFeatureConflict;
import de.ubt.ai1.supermod.mm.feature.client.RemoteGroupMembershipConflict;
import de.ubt.ai1.supermod.mm.feature.client.RootFeatureConflict;
import de.ubt.ai1.supermod.mm.feature.client.SingleVersionFeatureModelDescriptor;
import de.ubt.ai1.supermod.mm.feature.client.SuperModFeatureClientFactory;
import de.ubt.ai1.supermod.mm.feature.client.SuperModFeatureClientPackage;
import java.util.Map;
import org.eclipse.emf.ecore.EAttribute;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>,
 * 			Johannes Schroepfer <Johannes.M.Schroepfer(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	2018-01-09
 * <!-- end-user-doc -->
 * @generated
 */
public class SuperModFeatureClientPackageImpl extends EPackageImpl implements SuperModFeatureClientPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass singleVersionFeatureModelDescriptorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rootFeatureConflictEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parentFeatureConflictEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cyclicFeatureTreeConflictEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nonOptionalGroupedFeatureConflictEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dependencyLinkTargetConflictEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass danglingFeatureConflictEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass danglingGroupConflictEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass danglingDependencyConflictEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass displayNameConflictEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multipleGroupMembershipConflictEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass remoteGroupMembershipConflictEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureConfigurationEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureModelExportTraceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureToFeatureMapEntryEClass = null;
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
	 * @see de.ubt.ai1.supermod.mm.feature.client.SuperModFeatureClientPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SuperModFeatureClientPackageImpl() {
		super(eNS_URI, SuperModFeatureClientFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SuperModFeatureClientPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SuperModFeatureClientPackage init() {
		if (isInited) return (SuperModFeatureClientPackage)EPackage.Registry.INSTANCE.getEPackage(SuperModFeatureClientPackage.eNS_URI);

		// Obtain or create and register package
		SuperModFeatureClientPackageImpl theSuperModFeatureClientPackage = (SuperModFeatureClientPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SuperModFeatureClientPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SuperModFeatureClientPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		SuperModClientPackage.eINSTANCE.eClass();
		SuperModCorePackage.eINSTANCE.eClass();
		SuperModFeaturePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theSuperModFeatureClientPackage.createPackageContents();

		// Initialize created meta-data
		theSuperModFeatureClientPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSuperModFeatureClientPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SuperModFeatureClientPackage.eNS_URI, theSuperModFeatureClientPackage);
		return theSuperModFeatureClientPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSingleVersionFeatureModelDescriptor() {
		return singleVersionFeatureModelDescriptorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSingleVersionFeatureModelDescriptor_FeatureModel() {
		return (EReference)singleVersionFeatureModelDescriptorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSingleVersionFeatureModelDescriptor_Modified() {
		return (EAttribute)singleVersionFeatureModelDescriptorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRootFeatureConflict() {
		return rootFeatureConflictEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRootFeatureConflict_ContextModel() {
		return (EReference)rootFeatureConflictEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParentFeatureConflict() {
		return parentFeatureConflictEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParentFeatureConflict_ContextFeature() {
		return (EReference)parentFeatureConflictEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCyclicFeatureTreeConflict() {
		return cyclicFeatureTreeConflictEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCyclicFeatureTreeConflict_AffectedFeatures() {
		return (EReference)cyclicFeatureTreeConflictEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNonOptionalGroupedFeatureConflict() {
		return nonOptionalGroupedFeatureConflictEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNonOptionalGroupedFeatureConflict_ContextFeature() {
		return (EReference)nonOptionalGroupedFeatureConflictEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDependencyLinkTargetConflict() {
		return dependencyLinkTargetConflictEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDependencyLinkTargetConflict_ContextDependency() {
		return (EReference)dependencyLinkTargetConflictEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDanglingFeatureConflict() {
		return danglingFeatureConflictEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDanglingFeatureConflict_ContextFeature() {
		return (EReference)danglingFeatureConflictEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDanglingGroupConflict() {
		return danglingGroupConflictEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDanglingGroupConflict_ContextGroup() {
		return (EReference)danglingGroupConflictEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDanglingDependencyConflict() {
		return danglingDependencyConflictEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDanglingDependencyConflict_ContextDependency() {
		return (EReference)danglingDependencyConflictEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDisplayNameConflict() {
		return displayNameConflictEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDisplayNameConflict_ContextFeature() {
		return (EReference)displayNameConflictEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMultipleGroupMembershipConflict() {
		return multipleGroupMembershipConflictEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMultipleGroupMembershipConflict_ContextFeature() {
		return (EReference)multipleGroupMembershipConflictEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRemoteGroupMembershipConflict() {
		return remoteGroupMembershipConflictEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRemoteGroupMembershipConflict_ContextFeature() {
		return (EReference)remoteGroupMembershipConflictEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeatureConfiguration() {
		return featureConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeatureConfiguration_FeatureModel() {
		return (EReference)featureConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeatureConfiguration_OptionBinding() {
		return (EReference)featureConfigurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeatureConfiguration_Name() {
		return (EAttribute)featureConfigurationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeatureModelExportTrace() {
		return featureModelExportTraceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeatureModelExportTrace_FeatureToFeatureMap() {
		return (EReference)featureModelExportTraceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeatureToFeatureMapEntry() {
		return featureToFeatureMapEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeatureToFeatureMapEntry_Key() {
		return (EReference)featureToFeatureMapEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeatureToFeatureMapEntry_Value() {
		return (EReference)featureToFeatureMapEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SuperModFeatureClientFactory getSuperModFeatureClientFactory() {
		return (SuperModFeatureClientFactory)getEFactoryInstance();
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
		rootFeatureConflictEClass = createEClass(ROOT_FEATURE_CONFLICT);
		createEReference(rootFeatureConflictEClass, ROOT_FEATURE_CONFLICT__CONTEXT_MODEL);

		parentFeatureConflictEClass = createEClass(PARENT_FEATURE_CONFLICT);
		createEReference(parentFeatureConflictEClass, PARENT_FEATURE_CONFLICT__CONTEXT_FEATURE);

		cyclicFeatureTreeConflictEClass = createEClass(CYCLIC_FEATURE_TREE_CONFLICT);
		createEReference(cyclicFeatureTreeConflictEClass, CYCLIC_FEATURE_TREE_CONFLICT__AFFECTED_FEATURES);

		displayNameConflictEClass = createEClass(DISPLAY_NAME_CONFLICT);
		createEReference(displayNameConflictEClass, DISPLAY_NAME_CONFLICT__CONTEXT_FEATURE);

		multipleGroupMembershipConflictEClass = createEClass(MULTIPLE_GROUP_MEMBERSHIP_CONFLICT);
		createEReference(multipleGroupMembershipConflictEClass, MULTIPLE_GROUP_MEMBERSHIP_CONFLICT__CONTEXT_FEATURE);

		remoteGroupMembershipConflictEClass = createEClass(REMOTE_GROUP_MEMBERSHIP_CONFLICT);
		createEReference(remoteGroupMembershipConflictEClass, REMOTE_GROUP_MEMBERSHIP_CONFLICT__CONTEXT_FEATURE);

		nonOptionalGroupedFeatureConflictEClass = createEClass(NON_OPTIONAL_GROUPED_FEATURE_CONFLICT);
		createEReference(nonOptionalGroupedFeatureConflictEClass, NON_OPTIONAL_GROUPED_FEATURE_CONFLICT__CONTEXT_FEATURE);

		dependencyLinkTargetConflictEClass = createEClass(DEPENDENCY_LINK_TARGET_CONFLICT);
		createEReference(dependencyLinkTargetConflictEClass, DEPENDENCY_LINK_TARGET_CONFLICT__CONTEXT_DEPENDENCY);

		danglingFeatureConflictEClass = createEClass(DANGLING_FEATURE_CONFLICT);
		createEReference(danglingFeatureConflictEClass, DANGLING_FEATURE_CONFLICT__CONTEXT_FEATURE);

		danglingGroupConflictEClass = createEClass(DANGLING_GROUP_CONFLICT);
		createEReference(danglingGroupConflictEClass, DANGLING_GROUP_CONFLICT__CONTEXT_GROUP);

		danglingDependencyConflictEClass = createEClass(DANGLING_DEPENDENCY_CONFLICT);
		createEReference(danglingDependencyConflictEClass, DANGLING_DEPENDENCY_CONFLICT__CONTEXT_DEPENDENCY);

		singleVersionFeatureModelDescriptorEClass = createEClass(SINGLE_VERSION_FEATURE_MODEL_DESCRIPTOR);
		createEReference(singleVersionFeatureModelDescriptorEClass, SINGLE_VERSION_FEATURE_MODEL_DESCRIPTOR__FEATURE_MODEL);
		createEAttribute(singleVersionFeatureModelDescriptorEClass, SINGLE_VERSION_FEATURE_MODEL_DESCRIPTOR__MODIFIED);

		featureConfigurationEClass = createEClass(FEATURE_CONFIGURATION);
		createEReference(featureConfigurationEClass, FEATURE_CONFIGURATION__FEATURE_MODEL);
		createEReference(featureConfigurationEClass, FEATURE_CONFIGURATION__OPTION_BINDING);
		createEAttribute(featureConfigurationEClass, FEATURE_CONFIGURATION__NAME);

		featureModelExportTraceEClass = createEClass(FEATURE_MODEL_EXPORT_TRACE);
		createEReference(featureModelExportTraceEClass, FEATURE_MODEL_EXPORT_TRACE__FEATURE_TO_FEATURE_MAP);

		featureToFeatureMapEntryEClass = createEClass(FEATURE_TO_FEATURE_MAP_ENTRY);
		createEReference(featureToFeatureMapEntryEClass, FEATURE_TO_FEATURE_MAP_ENTRY__KEY);
		createEReference(featureToFeatureMapEntryEClass, FEATURE_TO_FEATURE_MAP_ENTRY__VALUE);
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
		SuperModFeaturePackage theSuperModFeaturePackage = (SuperModFeaturePackage)EPackage.Registry.INSTANCE.getEPackage(SuperModFeaturePackage.eNS_URI);
		SuperModCorePackage theSuperModCorePackage = (SuperModCorePackage)EPackage.Registry.INSTANCE.getEPackage(SuperModCorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		rootFeatureConflictEClass.getESuperTypes().add(theSuperModClientPackage.getProductConflict());
		parentFeatureConflictEClass.getESuperTypes().add(theSuperModClientPackage.getProductConflict());
		cyclicFeatureTreeConflictEClass.getESuperTypes().add(theSuperModClientPackage.getProductConflict());
		displayNameConflictEClass.getESuperTypes().add(theSuperModClientPackage.getProductConflict());
		multipleGroupMembershipConflictEClass.getESuperTypes().add(theSuperModClientPackage.getProductConflict());
		remoteGroupMembershipConflictEClass.getESuperTypes().add(theSuperModClientPackage.getProductConflict());
		nonOptionalGroupedFeatureConflictEClass.getESuperTypes().add(theSuperModClientPackage.getProductConflict());
		dependencyLinkTargetConflictEClass.getESuperTypes().add(theSuperModClientPackage.getProductConflict());
		danglingFeatureConflictEClass.getESuperTypes().add(theSuperModClientPackage.getProductConflict());
		danglingGroupConflictEClass.getESuperTypes().add(theSuperModClientPackage.getProductConflict());
		danglingDependencyConflictEClass.getESuperTypes().add(theSuperModClientPackage.getProductConflict());
		singleVersionFeatureModelDescriptorEClass.getESuperTypes().add(theSuperModClientPackage.getSingleVersionProductDimensionDescriptor());
		featureModelExportTraceEClass.getESuperTypes().add(theSuperModClientPackage.getProductDimensionExportTrace());

		// Initialize classes, features, and operations; add parameters
		initEClass(rootFeatureConflictEClass, RootFeatureConflict.class, "RootFeatureConflict", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRootFeatureConflict_ContextModel(), theSuperModFeaturePackage.getFeatureModel(), null, "contextModel", null, 0, 1, RootFeatureConflict.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parentFeatureConflictEClass, ParentFeatureConflict.class, "ParentFeatureConflict", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParentFeatureConflict_ContextFeature(), theSuperModFeaturePackage.getFeature(), null, "contextFeature", null, 0, 1, ParentFeatureConflict.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cyclicFeatureTreeConflictEClass, CyclicFeatureTreeConflict.class, "CyclicFeatureTreeConflict", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCyclicFeatureTreeConflict_AffectedFeatures(), theSuperModFeaturePackage.getFeature(), null, "affectedFeatures", null, 0, -1, CyclicFeatureTreeConflict.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(displayNameConflictEClass, DisplayNameConflict.class, "DisplayNameConflict", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDisplayNameConflict_ContextFeature(), theSuperModFeaturePackage.getFeature(), null, "contextFeature", null, 0, 1, DisplayNameConflict.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(multipleGroupMembershipConflictEClass, MultipleGroupMembershipConflict.class, "MultipleGroupMembershipConflict", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMultipleGroupMembershipConflict_ContextFeature(), theSuperModFeaturePackage.getFeature(), null, "contextFeature", null, 0, 1, MultipleGroupMembershipConflict.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(remoteGroupMembershipConflictEClass, RemoteGroupMembershipConflict.class, "RemoteGroupMembershipConflict", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRemoteGroupMembershipConflict_ContextFeature(), theSuperModFeaturePackage.getFeature(), null, "contextFeature", null, 0, 1, RemoteGroupMembershipConflict.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nonOptionalGroupedFeatureConflictEClass, NonOptionalGroupedFeatureConflict.class, "NonOptionalGroupedFeatureConflict", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNonOptionalGroupedFeatureConflict_ContextFeature(), theSuperModFeaturePackage.getFeature(), null, "contextFeature", null, 0, 1, NonOptionalGroupedFeatureConflict.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dependencyLinkTargetConflictEClass, DependencyLinkTargetConflict.class, "DependencyLinkTargetConflict", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDependencyLinkTargetConflict_ContextDependency(), theSuperModFeaturePackage.getFeatureDependency(), null, "contextDependency", null, 0, 1, DependencyLinkTargetConflict.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(danglingFeatureConflictEClass, DanglingFeatureConflict.class, "DanglingFeatureConflict", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDanglingFeatureConflict_ContextFeature(), theSuperModFeaturePackage.getFeature(), null, "contextFeature", null, 0, 1, DanglingFeatureConflict.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(danglingGroupConflictEClass, DanglingGroupConflict.class, "DanglingGroupConflict", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDanglingGroupConflict_ContextGroup(), theSuperModFeaturePackage.getFeatureGroup(), null, "contextGroup", null, 0, 1, DanglingGroupConflict.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(danglingDependencyConflictEClass, DanglingDependencyConflict.class, "DanglingDependencyConflict", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDanglingDependencyConflict_ContextDependency(), theSuperModFeaturePackage.getFeatureDependency(), null, "contextDependency", null, 0, 1, DanglingDependencyConflict.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(singleVersionFeatureModelDescriptorEClass, SingleVersionFeatureModelDescriptor.class, "SingleVersionFeatureModelDescriptor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSingleVersionFeatureModelDescriptor_FeatureModel(), theSuperModFeaturePackage.getFeatureModel(), null, "featureModel", null, 0, 1, SingleVersionFeatureModelDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSingleVersionFeatureModelDescriptor_Modified(), ecorePackage.getEBoolean(), "modified", null, 0, 1, SingleVersionFeatureModelDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(featureConfigurationEClass, FeatureConfiguration.class, "FeatureConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFeatureConfiguration_FeatureModel(), theSuperModFeaturePackage.getFeatureModel(), null, "featureModel", null, 0, 1, FeatureConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFeatureConfiguration_OptionBinding(), theSuperModCorePackage.getOptionBinding(), null, "optionBinding", null, 0, 1, FeatureConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeatureConfiguration_Name(), ecorePackage.getEString(), "name", null, 0, 1, FeatureConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(featureModelExportTraceEClass, FeatureModelExportTrace.class, "FeatureModelExportTrace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFeatureModelExportTrace_FeatureToFeatureMap(), this.getFeatureToFeatureMapEntry(), null, "featureToFeatureMap", null, 0, -1, FeatureModelExportTrace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(featureToFeatureMapEntryEClass, Map.Entry.class, "FeatureToFeatureMapEntry", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFeatureToFeatureMapEntry_Key(), theSuperModFeaturePackage.getFeature(), null, "key", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFeatureToFeatureMapEntry_Value(), theSuperModFeaturePackage.getFeature(), null, "value", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //SuperModFeatureClientPackageImpl
