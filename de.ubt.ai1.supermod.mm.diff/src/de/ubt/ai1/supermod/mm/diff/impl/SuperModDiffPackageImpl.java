/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.mm.diff.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import de.ubt.ai1.supermod.mm.core.SuperModCorePackage;
import de.ubt.ai1.supermod.mm.diff.MatchedProductDimension;
import de.ubt.ai1.supermod.mm.diff.MatchedProductSpaceElement;
import de.ubt.ai1.supermod.mm.diff.MatchingRole;
import de.ubt.ai1.supermod.mm.diff.ProductDimensionDelta;
import de.ubt.ai1.supermod.mm.diff.ProductDimensionMatching;
import de.ubt.ai1.supermod.mm.diff.ProductSpaceDelta;
import de.ubt.ai1.supermod.mm.diff.ProductSpaceElementDelta;
import de.ubt.ai1.supermod.mm.diff.ProductSpaceElementMatching;
import de.ubt.ai1.supermod.mm.diff.ProductSpaceMatching;
import de.ubt.ai1.supermod.mm.diff.SuperModDiffFactory;
import de.ubt.ai1.supermod.mm.diff.SuperModDiffPackage;
import de.ubt.ai1.supermod.mm.diff.WriteSet;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * @author Felix Schwaegerl
 * @version	0.1.0
 * @since	0.1.0
 * @date 	2014-07-25
 * <!-- end-user-doc -->
 * @generated
 */
public class SuperModDiffPackageImpl extends EPackageImpl implements SuperModDiffPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productSpaceMatchingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass matchingRoleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productDimensionMatchingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productSpaceElementMatchingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass matchedProductSpaceElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass matchedProductDimensionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productSpaceDeltaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productDimensionDeltaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productSpaceElementDeltaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass writeSetEClass = null;

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
	 * @see de.ubt.ai1.supermod.mm.diff.SuperModDiffPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SuperModDiffPackageImpl() {
		super(eNS_URI, SuperModDiffFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SuperModDiffPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SuperModDiffPackage init() {
		if (isInited) return (SuperModDiffPackage)EPackage.Registry.INSTANCE.getEPackage(SuperModDiffPackage.eNS_URI);

		// Obtain or create and register package
		SuperModDiffPackageImpl theSuperModDiffPackage = (SuperModDiffPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SuperModDiffPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SuperModDiffPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		SuperModCorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theSuperModDiffPackage.createPackageContents();

		// Initialize created meta-data
		theSuperModDiffPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSuperModDiffPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SuperModDiffPackage.eNS_URI, theSuperModDiffPackage);
		return theSuperModDiffPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProductSpaceMatching() {
		return productSpaceMatchingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProductSpaceMatching_MatchingRoles() {
		return (EReference)productSpaceMatchingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProductSpaceMatching_DimensionMatchings() {
		return (EReference)productSpaceMatchingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProductSpaceMatching__GetMatchingRole__ProductSpace() {
		return productSpaceMatchingEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMatchingRole() {
		return matchingRoleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMatchingRole_RoleName() {
		return (EAttribute)matchingRoleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMatchingRole_MatchedProductSpace() {
		return (EReference)matchingRoleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProductDimensionMatching() {
		return productDimensionMatchingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProductDimensionMatching_MatchedDimensions() {
		return (EReference)productDimensionMatchingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProductDimensionMatching_RootElementMatchings() {
		return (EReference)productDimensionMatchingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProductDimensionMatching_DimensionName() {
		return (EAttribute)productDimensionMatchingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProductDimensionMatching__GetMatchedDimension__MatchingRole() {
		return productDimensionMatchingEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProductSpaceElementMatching() {
		return productSpaceElementMatchingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProductSpaceElementMatching_MatchedElements() {
		return (EReference)productSpaceElementMatchingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProductSpaceElementMatching_SubMatchings() {
		return (EReference)productSpaceElementMatchingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProductSpaceElementMatching__GetMatchedElement__MatchingRole() {
		return productSpaceElementMatchingEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMatchedProductSpaceElement() {
		return matchedProductSpaceElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMatchedProductSpaceElement_Element() {
		return (EReference)matchedProductSpaceElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMatchedProductSpaceElement_Role() {
		return (EReference)matchedProductSpaceElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMatchedProductDimension() {
		return matchedProductDimensionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMatchedProductDimension_ProductDimension() {
		return (EReference)matchedProductDimensionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMatchedProductDimension_Role() {
		return (EReference)matchedProductDimensionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProductSpaceDelta() {
		return productSpaceDeltaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProductSpaceDelta_ProductDimensionDeltas() {
		return (EReference)productSpaceDeltaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProductDimensionDelta() {
		return productDimensionDeltaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProductDimensionDelta_InsertedElements() {
		return (EReference)productDimensionDeltaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProductDimensionDelta_DeletedElements() {
		return (EReference)productDimensionDeltaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProductDimensionDelta_DimensionName() {
		return (EAttribute)productDimensionDeltaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProductSpaceElementDelta() {
		return productSpaceElementDeltaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProductSpaceElementDelta_RootElements() {
		return (EReference)productSpaceElementDeltaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWriteSet() {
		return writeSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWriteSet_Ambition() {
		return (EReference)writeSetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SuperModDiffFactory getSuperModDiffFactory() {
		return (SuperModDiffFactory)getEFactoryInstance();
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
		matchingRoleEClass = createEClass(MATCHING_ROLE);
		createEAttribute(matchingRoleEClass, MATCHING_ROLE__ROLE_NAME);
		createEReference(matchingRoleEClass, MATCHING_ROLE__MATCHED_PRODUCT_SPACE);

		productSpaceMatchingEClass = createEClass(PRODUCT_SPACE_MATCHING);
		createEReference(productSpaceMatchingEClass, PRODUCT_SPACE_MATCHING__MATCHING_ROLES);
		createEReference(productSpaceMatchingEClass, PRODUCT_SPACE_MATCHING__DIMENSION_MATCHINGS);
		createEOperation(productSpaceMatchingEClass, PRODUCT_SPACE_MATCHING___GET_MATCHING_ROLE__PRODUCTSPACE);

		productDimensionMatchingEClass = createEClass(PRODUCT_DIMENSION_MATCHING);
		createEReference(productDimensionMatchingEClass, PRODUCT_DIMENSION_MATCHING__MATCHED_DIMENSIONS);
		createEReference(productDimensionMatchingEClass, PRODUCT_DIMENSION_MATCHING__ROOT_ELEMENT_MATCHINGS);
		createEAttribute(productDimensionMatchingEClass, PRODUCT_DIMENSION_MATCHING__DIMENSION_NAME);
		createEOperation(productDimensionMatchingEClass, PRODUCT_DIMENSION_MATCHING___GET_MATCHED_DIMENSION__MATCHINGROLE);

		productSpaceElementMatchingEClass = createEClass(PRODUCT_SPACE_ELEMENT_MATCHING);
		createEReference(productSpaceElementMatchingEClass, PRODUCT_SPACE_ELEMENT_MATCHING__MATCHED_ELEMENTS);
		createEReference(productSpaceElementMatchingEClass, PRODUCT_SPACE_ELEMENT_MATCHING__SUB_MATCHINGS);
		createEOperation(productSpaceElementMatchingEClass, PRODUCT_SPACE_ELEMENT_MATCHING___GET_MATCHED_ELEMENT__MATCHINGROLE);

		matchedProductSpaceElementEClass = createEClass(MATCHED_PRODUCT_SPACE_ELEMENT);
		createEReference(matchedProductSpaceElementEClass, MATCHED_PRODUCT_SPACE_ELEMENT__ELEMENT);
		createEReference(matchedProductSpaceElementEClass, MATCHED_PRODUCT_SPACE_ELEMENT__ROLE);

		matchedProductDimensionEClass = createEClass(MATCHED_PRODUCT_DIMENSION);
		createEReference(matchedProductDimensionEClass, MATCHED_PRODUCT_DIMENSION__PRODUCT_DIMENSION);
		createEReference(matchedProductDimensionEClass, MATCHED_PRODUCT_DIMENSION__ROLE);

		productSpaceDeltaEClass = createEClass(PRODUCT_SPACE_DELTA);
		createEReference(productSpaceDeltaEClass, PRODUCT_SPACE_DELTA__PRODUCT_DIMENSION_DELTAS);

		productDimensionDeltaEClass = createEClass(PRODUCT_DIMENSION_DELTA);
		createEReference(productDimensionDeltaEClass, PRODUCT_DIMENSION_DELTA__INSERTED_ELEMENTS);
		createEReference(productDimensionDeltaEClass, PRODUCT_DIMENSION_DELTA__DELETED_ELEMENTS);
		createEAttribute(productDimensionDeltaEClass, PRODUCT_DIMENSION_DELTA__DIMENSION_NAME);

		productSpaceElementDeltaEClass = createEClass(PRODUCT_SPACE_ELEMENT_DELTA);
		createEReference(productSpaceElementDeltaEClass, PRODUCT_SPACE_ELEMENT_DELTA__ROOT_ELEMENTS);

		writeSetEClass = createEClass(WRITE_SET);
		createEReference(writeSetEClass, WRITE_SET__AMBITION);
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
		writeSetEClass.getESuperTypes().add(this.getProductDimensionDelta());

		// Initialize classes, features, and operations; add parameters
		initEClass(matchingRoleEClass, MatchingRole.class, "MatchingRole", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMatchingRole_RoleName(), ecorePackage.getEString(), "roleName", null, 0, 1, MatchingRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMatchingRole_MatchedProductSpace(), theSuperModCorePackage.getProductSpace(), null, "matchedProductSpace", null, 0, 1, MatchingRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(productSpaceMatchingEClass, ProductSpaceMatching.class, "ProductSpaceMatching", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProductSpaceMatching_MatchingRoles(), this.getMatchingRole(), null, "matchingRoles", null, 0, -1, ProductSpaceMatching.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProductSpaceMatching_DimensionMatchings(), this.getProductDimensionMatching(), null, "dimensionMatchings", null, 0, -1, ProductSpaceMatching.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getProductSpaceMatching__GetMatchingRole__ProductSpace(), this.getMatchingRole(), "getMatchingRole", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSuperModCorePackage.getProductSpace(), "ps", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(productDimensionMatchingEClass, ProductDimensionMatching.class, "ProductDimensionMatching", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProductDimensionMatching_MatchedDimensions(), this.getMatchedProductDimension(), null, "matchedDimensions", null, 0, -1, ProductDimensionMatching.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProductDimensionMatching_RootElementMatchings(), this.getProductSpaceElementMatching(), null, "rootElementMatchings", null, 0, -1, ProductDimensionMatching.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductDimensionMatching_DimensionName(), ecorePackage.getEString(), "dimensionName", null, 0, 1, ProductDimensionMatching.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getProductDimensionMatching__GetMatchedDimension__MatchingRole(), this.getMatchedProductDimension(), "getMatchedDimension", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getMatchingRole(), "role", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(productSpaceElementMatchingEClass, ProductSpaceElementMatching.class, "ProductSpaceElementMatching", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProductSpaceElementMatching_MatchedElements(), this.getMatchedProductSpaceElement(), null, "matchedElements", null, 0, -1, ProductSpaceElementMatching.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProductSpaceElementMatching_SubMatchings(), this.getProductSpaceElementMatching(), null, "subMatchings", null, 0, -1, ProductSpaceElementMatching.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getProductSpaceElementMatching__GetMatchedElement__MatchingRole(), this.getMatchedProductSpaceElement(), "getMatchedElement", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getMatchingRole(), "role", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(matchedProductSpaceElementEClass, MatchedProductSpaceElement.class, "MatchedProductSpaceElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMatchedProductSpaceElement_Element(), theSuperModCorePackage.getProductSpaceElement(), null, "element", null, 0, 1, MatchedProductSpaceElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMatchedProductSpaceElement_Role(), this.getMatchingRole(), null, "role", null, 0, 1, MatchedProductSpaceElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(matchedProductDimensionEClass, MatchedProductDimension.class, "MatchedProductDimension", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMatchedProductDimension_ProductDimension(), theSuperModCorePackage.getProductDimension(), null, "productDimension", null, 0, 1, MatchedProductDimension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMatchedProductDimension_Role(), this.getMatchingRole(), null, "role", null, 0, 1, MatchedProductDimension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(productSpaceDeltaEClass, ProductSpaceDelta.class, "ProductSpaceDelta", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProductSpaceDelta_ProductDimensionDeltas(), this.getProductDimensionDelta(), null, "productDimensionDeltas", null, 0, -1, ProductSpaceDelta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(productDimensionDeltaEClass, ProductDimensionDelta.class, "ProductDimensionDelta", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProductDimensionDelta_InsertedElements(), this.getProductSpaceElementDelta(), null, "insertedElements", null, 0, -1, ProductDimensionDelta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProductDimensionDelta_DeletedElements(), this.getProductSpaceElementDelta(), null, "deletedElements", null, 0, -1, ProductDimensionDelta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductDimensionDelta_DimensionName(), ecorePackage.getEString(), "dimensionName", null, 0, 1, ProductDimensionDelta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(productSpaceElementDeltaEClass, ProductSpaceElementDelta.class, "ProductSpaceElementDelta", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProductSpaceElementDelta_RootElements(), theSuperModCorePackage.getProductSpaceElement(), null, "rootElements", null, 0, -1, ProductSpaceElementDelta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(writeSetEClass, WriteSet.class, "WriteSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWriteSet_Ambition(), theSuperModCorePackage.getOptionBinding(), null, "ambition", null, 0, 1, WriteSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //SuperModDiffPackageImpl
