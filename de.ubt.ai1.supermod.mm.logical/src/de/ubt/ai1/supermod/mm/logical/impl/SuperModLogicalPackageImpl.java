/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.mm.logical.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import de.ubt.ai1.supermod.mm.core.SuperModCorePackage;
import de.ubt.ai1.supermod.mm.logical.LogicalDimension;
import de.ubt.ai1.supermod.mm.logical.SuperModLogicalFactory;
import de.ubt.ai1.supermod.mm.logical.SuperModLogicalPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date 	2014-07-25
 * <!-- end-user-doc -->
 * @generated
 */
public class SuperModLogicalPackageImpl extends EPackageImpl implements SuperModLogicalPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass logicalDimensionEClass = null;

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
	 * @see de.ubt.ai1.supermod.mm.logical.SuperModLogicalPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SuperModLogicalPackageImpl() {
		super(eNS_URI, SuperModLogicalFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SuperModLogicalPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SuperModLogicalPackage init() {
		if (isInited) return (SuperModLogicalPackage)EPackage.Registry.INSTANCE.getEPackage(SuperModLogicalPackage.eNS_URI);

		// Obtain or create and register package
		SuperModLogicalPackageImpl theSuperModLogicalPackage = (SuperModLogicalPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SuperModLogicalPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SuperModLogicalPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		SuperModCorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theSuperModLogicalPackage.createPackageContents();

		// Initialize created meta-data
		theSuperModLogicalPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSuperModLogicalPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SuperModLogicalPackage.eNS_URI, theSuperModLogicalPackage);
		return theSuperModLogicalPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLogicalDimension() {
		return logicalDimensionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLogicalDimension_LogicalOptions() {
		return (EReference)logicalDimensionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLogicalDimension_LogicalInvariants() {
		return (EReference)logicalDimensionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLogicalDimension_LogicalPreferences() {
		return (EReference)logicalDimensionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLogicalDimension_LogicalDefaults() {
		return (EReference)logicalDimensionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SuperModLogicalFactory getSuperModLogicalFactory() {
		return (SuperModLogicalFactory)getEFactoryInstance();
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
		logicalDimensionEClass = createEClass(LOGICAL_DIMENSION);
		createEReference(logicalDimensionEClass, LOGICAL_DIMENSION__LOGICAL_OPTIONS);
		createEReference(logicalDimensionEClass, LOGICAL_DIMENSION__LOGICAL_INVARIANTS);
		createEReference(logicalDimensionEClass, LOGICAL_DIMENSION__LOGICAL_PREFERENCES);
		createEReference(logicalDimensionEClass, LOGICAL_DIMENSION__LOGICAL_DEFAULTS);
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
		logicalDimensionEClass.getESuperTypes().add(theSuperModCorePackage.getVersionDimension());

		// Initialize classes, features, and operations; add parameters
		initEClass(logicalDimensionEClass, LogicalDimension.class, "LogicalDimension", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLogicalDimension_LogicalOptions(), theSuperModCorePackage.getOption(), null, "logicalOptions", null, 0, -1, LogicalDimension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLogicalDimension_LogicalInvariants(), theSuperModCorePackage.getInvariant(), null, "logicalInvariants", null, 0, -1, LogicalDimension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLogicalDimension_LogicalPreferences(), theSuperModCorePackage.getPreference(), null, "logicalPreferences", null, 0, -1, LogicalDimension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLogicalDimension_LogicalDefaults(), theSuperModCorePackage.getDefaultBinding(), null, "logicalDefaults", null, 0, -1, LogicalDimension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //SuperModLogicalPackageImpl
