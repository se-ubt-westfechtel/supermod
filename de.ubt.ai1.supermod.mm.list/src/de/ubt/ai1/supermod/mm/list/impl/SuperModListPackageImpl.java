/******************************************************************************
 * Copyright (c) 2018 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.mm.list.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import de.ubt.ai1.supermod.mm.core.SuperModCorePackage;
import de.ubt.ai1.supermod.mm.list.SuperModListFactory;
import de.ubt.ai1.supermod.mm.list.SuperModListPackage;
import de.ubt.ai1.supermod.mm.list.VersionedList;
import de.ubt.ai1.supermod.mm.list.VersionedListEdge;
import de.ubt.ai1.supermod.mm.list.VersionedListStartReference;
import de.ubt.ai1.supermod.mm.list.VersionedListVertex;

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
public class SuperModListPackageImpl extends EPackageImpl implements SuperModListPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass versionedListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass versionedListVertexEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass versionedListEdgeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass versionedListStartReferenceEClass = null;

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
	 * @see de.ubt.ai1.supermod.mm.list.SuperModListPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SuperModListPackageImpl() {
		super(eNS_URI, SuperModListFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SuperModListPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SuperModListPackage init() {
		if (isInited) return (SuperModListPackage)EPackage.Registry.INSTANCE.getEPackage(SuperModListPackage.eNS_URI);

		// Obtain or create and register package
		SuperModListPackageImpl theSuperModListPackage = (SuperModListPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SuperModListPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SuperModListPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		SuperModCorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theSuperModListPackage.createPackageContents();

		// Initialize created meta-data
		theSuperModListPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSuperModListPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SuperModListPackage.eNS_URI, theSuperModListPackage);
		return theSuperModListPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVersionedList() {
		return versionedListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVersionedList_Vertices() {
		return (EReference)versionedListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVersionedList_Edges() {
		return (EReference)versionedListEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVersionedList_StartVertices() {
		return (EReference)versionedListEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVersionedList__GetAllOccurrencesOf__ProductSpaceElement() {
		return versionedListEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVersionedList__Linearize() {
		return versionedListEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVersionedList__GetEdge__VersionedListVertex_VersionedListVertex() {
		return versionedListEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVersionedListVertex() {
		return versionedListVertexEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVersionedListVertex_Element() {
		return (EReference)versionedListVertexEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVersionedListVertex_IncomingEdges() {
		return (EReference)versionedListVertexEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVersionedListVertex_OutgoingEdges() {
		return (EReference)versionedListVertexEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVersionedListVertex_List() {
		return (EReference)versionedListVertexEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVersionedListVertex_StartRef() {
		return (EReference)versionedListVertexEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVersionedListEdge() {
		return versionedListEdgeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVersionedListEdge_Source() {
		return (EReference)versionedListEdgeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVersionedListEdge_Sink() {
		return (EReference)versionedListEdgeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVersionedListEdge_List() {
		return (EReference)versionedListEdgeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVersionedListStartReference() {
		return versionedListStartReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVersionedListStartReference_Vertex() {
		return (EReference)versionedListStartReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVersionedListStartReference_List() {
		return (EReference)versionedListStartReferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SuperModListFactory getSuperModListFactory() {
		return (SuperModListFactory)getEFactoryInstance();
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
		versionedListEClass = createEClass(VERSIONED_LIST);
		createEReference(versionedListEClass, VERSIONED_LIST__VERTICES);
		createEReference(versionedListEClass, VERSIONED_LIST__EDGES);
		createEReference(versionedListEClass, VERSIONED_LIST__START_VERTICES);
		createEOperation(versionedListEClass, VERSIONED_LIST___GET_ALL_OCCURRENCES_OF__PRODUCTSPACEELEMENT);
		createEOperation(versionedListEClass, VERSIONED_LIST___LINEARIZE);
		createEOperation(versionedListEClass, VERSIONED_LIST___GET_EDGE__VERSIONEDLISTVERTEX_VERSIONEDLISTVERTEX);

		versionedListVertexEClass = createEClass(VERSIONED_LIST_VERTEX);
		createEReference(versionedListVertexEClass, VERSIONED_LIST_VERTEX__ELEMENT);
		createEReference(versionedListVertexEClass, VERSIONED_LIST_VERTEX__INCOMING_EDGES);
		createEReference(versionedListVertexEClass, VERSIONED_LIST_VERTEX__OUTGOING_EDGES);
		createEReference(versionedListVertexEClass, VERSIONED_LIST_VERTEX__LIST);
		createEReference(versionedListVertexEClass, VERSIONED_LIST_VERTEX__START_REF);

		versionedListEdgeEClass = createEClass(VERSIONED_LIST_EDGE);
		createEReference(versionedListEdgeEClass, VERSIONED_LIST_EDGE__SOURCE);
		createEReference(versionedListEdgeEClass, VERSIONED_LIST_EDGE__SINK);
		createEReference(versionedListEdgeEClass, VERSIONED_LIST_EDGE__LIST);

		versionedListStartReferenceEClass = createEClass(VERSIONED_LIST_START_REFERENCE);
		createEReference(versionedListStartReferenceEClass, VERSIONED_LIST_START_REFERENCE__VERTEX);
		createEReference(versionedListStartReferenceEClass, VERSIONED_LIST_START_REFERENCE__LIST);
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
		versionedListEClass.getESuperTypes().add(theSuperModCorePackage.getProductSpaceElement());
		versionedListVertexEClass.getESuperTypes().add(theSuperModCorePackage.getProductSpaceElement());
		versionedListVertexEClass.getESuperTypes().add(theSuperModCorePackage.getUUIDElement());
		versionedListEdgeEClass.getESuperTypes().add(theSuperModCorePackage.getProductSpaceElement());
		versionedListStartReferenceEClass.getESuperTypes().add(theSuperModCorePackage.getProductSpaceElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(versionedListEClass, VersionedList.class, "VersionedList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVersionedList_Vertices(), this.getVersionedListVertex(), this.getVersionedListVertex_List(), "vertices", null, 0, -1, VersionedList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVersionedList_Edges(), this.getVersionedListEdge(), this.getVersionedListEdge_List(), "edges", null, 0, -1, VersionedList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVersionedList_StartVertices(), this.getVersionedListStartReference(), this.getVersionedListStartReference_List(), "startVertices", null, 0, -1, VersionedList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getVersionedList__GetAllOccurrencesOf__ProductSpaceElement(), this.getVersionedListVertex(), "getAllOccurrencesOf", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSuperModCorePackage.getProductSpaceElement(), "element", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getVersionedList__Linearize(), theSuperModCorePackage.getProductSpaceElement(), "linearize", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getVersionedList__GetEdge__VersionedListVertex_VersionedListVertex(), this.getVersionedListEdge(), "getEdge", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getVersionedListVertex(), "from", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getVersionedListVertex(), "to", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(versionedListVertexEClass, VersionedListVertex.class, "VersionedListVertex", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVersionedListVertex_Element(), theSuperModCorePackage.getProductSpaceElement(), null, "element", null, 0, 1, VersionedListVertex.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVersionedListVertex_IncomingEdges(), this.getVersionedListEdge(), this.getVersionedListEdge_Sink(), "incomingEdges", null, 0, -1, VersionedListVertex.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVersionedListVertex_OutgoingEdges(), this.getVersionedListEdge(), this.getVersionedListEdge_Source(), "outgoingEdges", null, 0, -1, VersionedListVertex.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVersionedListVertex_List(), this.getVersionedList(), this.getVersionedList_Vertices(), "list", null, 0, 1, VersionedListVertex.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVersionedListVertex_StartRef(), this.getVersionedListStartReference(), this.getVersionedListStartReference_Vertex(), "startRef", null, 0, 1, VersionedListVertex.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(versionedListEdgeEClass, VersionedListEdge.class, "VersionedListEdge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVersionedListEdge_Source(), this.getVersionedListVertex(), this.getVersionedListVertex_OutgoingEdges(), "source", null, 0, 1, VersionedListEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVersionedListEdge_Sink(), this.getVersionedListVertex(), this.getVersionedListVertex_IncomingEdges(), "sink", null, 0, 1, VersionedListEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVersionedListEdge_List(), this.getVersionedList(), this.getVersionedList_Edges(), "list", null, 0, 1, VersionedListEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(versionedListStartReferenceEClass, VersionedListStartReference.class, "VersionedListStartReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVersionedListStartReference_Vertex(), this.getVersionedListVertex(), this.getVersionedListVertex_StartRef(), "vertex", null, 0, 1, VersionedListStartReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVersionedListStartReference_List(), this.getVersionedList(), this.getVersionedList_StartVertices(), "list", null, 0, 1, VersionedListStartReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //SuperModListPackageImpl
