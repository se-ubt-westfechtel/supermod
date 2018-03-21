/******************************************************************************
 * Copyright (c) 2018 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.mm.list.client.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import de.ubt.ai1.supermod.mm.client.SuperModClientPackage;
import de.ubt.ai1.supermod.mm.core.SuperModCorePackage;
import de.ubt.ai1.supermod.mm.list.SuperModListPackage;
import de.ubt.ai1.supermod.mm.list.client.OrderingConflict;
import de.ubt.ai1.supermod.mm.list.client.SuperModListClientFactory;
import de.ubt.ai1.supermod.mm.list.client.SuperModListClientPackage;

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
public class SuperModListClientPackageImpl extends EPackageImpl implements SuperModListClientPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orderingConflictEClass = null;

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
	 * @see de.ubt.ai1.supermod.mm.list.client.SuperModListClientPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SuperModListClientPackageImpl() {
		super(eNS_URI, SuperModListClientFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SuperModListClientPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SuperModListClientPackage init() {
		if (isInited) return (SuperModListClientPackage)EPackage.Registry.INSTANCE.getEPackage(SuperModListClientPackage.eNS_URI);

		// Obtain or create and register package
		SuperModListClientPackageImpl theSuperModListClientPackage = (SuperModListClientPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SuperModListClientPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SuperModListClientPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		SuperModClientPackage.eINSTANCE.eClass();
		SuperModCorePackage.eINSTANCE.eClass();
		SuperModListPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theSuperModListClientPackage.createPackageContents();

		// Initialize created meta-data
		theSuperModListClientPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSuperModListClientPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SuperModListClientPackage.eNS_URI, theSuperModListClientPackage);
		return theSuperModListClientPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrderingConflict() {
		return orderingConflictEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrderingConflict_ContextList() {
		return (EReference)orderingConflictEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrderingConflict_LastVertex() {
		return (EReference)orderingConflictEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrderingConflict_SuccessorEdges() {
		return (EReference)orderingConflictEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrderingConflict_SuccessorVertices() {
		return (EReference)orderingConflictEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SuperModListClientFactory getSuperModListClientFactory() {
		return (SuperModListClientFactory)getEFactoryInstance();
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
		orderingConflictEClass = createEClass(ORDERING_CONFLICT);
		createEReference(orderingConflictEClass, ORDERING_CONFLICT__CONTEXT_LIST);
		createEReference(orderingConflictEClass, ORDERING_CONFLICT__LAST_VERTEX);
		createEReference(orderingConflictEClass, ORDERING_CONFLICT__SUCCESSOR_EDGES);
		createEReference(orderingConflictEClass, ORDERING_CONFLICT__SUCCESSOR_VERTICES);
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
		SuperModListPackage theSuperModListPackage = (SuperModListPackage)EPackage.Registry.INSTANCE.getEPackage(SuperModListPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		orderingConflictEClass.getESuperTypes().add(theSuperModClientPackage.getProductConflict());

		// Initialize classes, features, and operations; add parameters
		initEClass(orderingConflictEClass, OrderingConflict.class, "OrderingConflict", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOrderingConflict_ContextList(), theSuperModListPackage.getVersionedList(), null, "contextList", null, 0, 1, OrderingConflict.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrderingConflict_LastVertex(), theSuperModListPackage.getVersionedListVertex(), null, "lastVertex", null, 0, 1, OrderingConflict.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrderingConflict_SuccessorEdges(), theSuperModListPackage.getVersionedListEdge(), null, "successorEdges", null, 0, -1, OrderingConflict.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrderingConflict_SuccessorVertices(), theSuperModListPackage.getVersionedListVertex(), null, "successorVertices", null, 0, -1, OrderingConflict.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //SuperModListClientPackageImpl
