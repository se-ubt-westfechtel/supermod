/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.mm.emffile.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import de.ubt.ai1.supermod.mm.core.SuperModCorePackage;
import de.ubt.ai1.supermod.mm.emffile.EMFAttributeValue;
import de.ubt.ai1.supermod.mm.emffile.EMFClassRef;
import de.ubt.ai1.supermod.mm.emffile.EMFContainmentReferenceValue;
import de.ubt.ai1.supermod.mm.emffile.EMFExternalReferenceValue;
import de.ubt.ai1.supermod.mm.emffile.EMFFeatureRef;
import de.ubt.ai1.supermod.mm.emffile.EMFFileContent;
import de.ubt.ai1.supermod.mm.emffile.EMFInternalReferenceValue;
import de.ubt.ai1.supermod.mm.emffile.EMFObject;
import de.ubt.ai1.supermod.mm.emffile.EMFValue;
import de.ubt.ai1.supermod.mm.emffile.SuperModEMFFileFactory;
import de.ubt.ai1.supermod.mm.emffile.SuperModEMFFilePackage;
import de.ubt.ai1.supermod.mm.file.SuperModFilePackage;
import de.ubt.ai1.supermod.mm.list.SuperModListPackage;

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
public class SuperModEMFFilePackageImpl extends EPackageImpl implements SuperModEMFFilePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emfFileContentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emfObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emfClassRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emfFeatureRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emfValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emfAttributeValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emfInternalReferenceValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emfExternalReferenceValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emfContainmentReferenceValueEClass = null;

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
	 * @see de.ubt.ai1.supermod.mm.emffile.SuperModEMFFilePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SuperModEMFFilePackageImpl() {
		super(eNS_URI, SuperModEMFFileFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SuperModEMFFilePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SuperModEMFFilePackage init() {
		if (isInited) return (SuperModEMFFilePackage)EPackage.Registry.INSTANCE.getEPackage(SuperModEMFFilePackage.eNS_URI);

		// Obtain or create and register package
		SuperModEMFFilePackageImpl theSuperModEMFFilePackage = (SuperModEMFFilePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SuperModEMFFilePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SuperModEMFFilePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		SuperModFilePackage.eINSTANCE.eClass();
		SuperModListPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theSuperModEMFFilePackage.createPackageContents();

		// Initialize created meta-data
		theSuperModEMFFilePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSuperModEMFFilePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SuperModEMFFilePackage.eNS_URI, theSuperModEMFFilePackage);
		return theSuperModEMFFilePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEMFFileContent() {
		return emfFileContentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMFFileContent_Objects() {
		return (EReference)emfFileContentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMFFileContent_Roots() {
		return (EReference)emfFileContentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEMFObject() {
		return emfObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMFObject_ClassRefs() {
		return (EReference)emfObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMFObject_FeatureRefs() {
		return (EReference)emfObjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMFObject_TargetingRefVals() {
		return (EReference)emfObjectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMFObject_TargetingContainmentRefVals() {
		return (EReference)emfObjectEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEMFClassRef() {
		return emfClassRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEMFClassRef_PackageUri() {
		return (EAttribute)emfClassRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEMFClassRef_ClassName() {
		return (EAttribute)emfClassRefEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEMFFeatureRef() {
		return emfFeatureRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMFFeatureRef_Values() {
		return (EReference)emfFeatureRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMFFeatureRef_ValueOrdering() {
		return (EReference)emfFeatureRefEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMFFeatureRef_OrderedValues() {
		return (EReference)emfFeatureRefEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEMFFeatureRef_FeatureName() {
		return (EAttribute)emfFeatureRefEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEMFValue() {
		return emfValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEMFAttributeValue() {
		return emfAttributeValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEMFAttributeValue_Literal() {
		return (EAttribute)emfAttributeValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEMFInternalReferenceValue() {
		return emfInternalReferenceValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMFInternalReferenceValue_ReferencedObject() {
		return (EReference)emfInternalReferenceValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEMFExternalReferenceValue() {
		return emfExternalReferenceValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEMFExternalReferenceValue_EObjectUri() {
		return (EAttribute)emfExternalReferenceValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEMFContainmentReferenceValue() {
		return emfContainmentReferenceValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SuperModEMFFileFactory getSuperModEMFFileFactory() {
		return (SuperModEMFFileFactory)getEFactoryInstance();
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
		emfFileContentEClass = createEClass(EMF_FILE_CONTENT);
		createEReference(emfFileContentEClass, EMF_FILE_CONTENT__OBJECTS);
		createEReference(emfFileContentEClass, EMF_FILE_CONTENT__ROOTS);

		emfObjectEClass = createEClass(EMF_OBJECT);
		createEReference(emfObjectEClass, EMF_OBJECT__CLASS_REFS);
		createEReference(emfObjectEClass, EMF_OBJECT__FEATURE_REFS);
		createEReference(emfObjectEClass, EMF_OBJECT__TARGETING_REF_VALS);
		createEReference(emfObjectEClass, EMF_OBJECT__TARGETING_CONTAINMENT_REF_VALS);

		emfClassRefEClass = createEClass(EMF_CLASS_REF);
		createEAttribute(emfClassRefEClass, EMF_CLASS_REF__PACKAGE_URI);
		createEAttribute(emfClassRefEClass, EMF_CLASS_REF__CLASS_NAME);

		emfFeatureRefEClass = createEClass(EMF_FEATURE_REF);
		createEReference(emfFeatureRefEClass, EMF_FEATURE_REF__VALUES);
		createEReference(emfFeatureRefEClass, EMF_FEATURE_REF__VALUE_ORDERING);
		createEReference(emfFeatureRefEClass, EMF_FEATURE_REF__ORDERED_VALUES);
		createEAttribute(emfFeatureRefEClass, EMF_FEATURE_REF__FEATURE_NAME);

		emfValueEClass = createEClass(EMF_VALUE);

		emfAttributeValueEClass = createEClass(EMF_ATTRIBUTE_VALUE);
		createEAttribute(emfAttributeValueEClass, EMF_ATTRIBUTE_VALUE__LITERAL);

		emfInternalReferenceValueEClass = createEClass(EMF_INTERNAL_REFERENCE_VALUE);
		createEReference(emfInternalReferenceValueEClass, EMF_INTERNAL_REFERENCE_VALUE__REFERENCED_OBJECT);

		emfExternalReferenceValueEClass = createEClass(EMF_EXTERNAL_REFERENCE_VALUE);
		createEAttribute(emfExternalReferenceValueEClass, EMF_EXTERNAL_REFERENCE_VALUE__EOBJECT_URI);

		emfContainmentReferenceValueEClass = createEClass(EMF_CONTAINMENT_REFERENCE_VALUE);
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
		SuperModFilePackage theSuperModFilePackage = (SuperModFilePackage)EPackage.Registry.INSTANCE.getEPackage(SuperModFilePackage.eNS_URI);
		SuperModCorePackage theSuperModCorePackage = (SuperModCorePackage)EPackage.Registry.INSTANCE.getEPackage(SuperModCorePackage.eNS_URI);
		SuperModListPackage theSuperModListPackage = (SuperModListPackage)EPackage.Registry.INSTANCE.getEPackage(SuperModListPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		emfFileContentEClass.getESuperTypes().add(theSuperModFilePackage.getVersionedFileContent());
		emfObjectEClass.getESuperTypes().add(theSuperModCorePackage.getProductSpaceElement());
		emfObjectEClass.getESuperTypes().add(theSuperModCorePackage.getUUIDElement());
		emfClassRefEClass.getESuperTypes().add(theSuperModCorePackage.getProductSpaceElement());
		emfFeatureRefEClass.getESuperTypes().add(theSuperModCorePackage.getProductSpaceElement());
		emfValueEClass.getESuperTypes().add(theSuperModCorePackage.getProductSpaceElement());
		emfAttributeValueEClass.getESuperTypes().add(this.getEMFValue());
		emfInternalReferenceValueEClass.getESuperTypes().add(this.getEMFValue());
		emfExternalReferenceValueEClass.getESuperTypes().add(this.getEMFValue());
		emfContainmentReferenceValueEClass.getESuperTypes().add(this.getEMFInternalReferenceValue());

		// Initialize classes, features, and operations; add parameters
		initEClass(emfFileContentEClass, EMFFileContent.class, "EMFFileContent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEMFFileContent_Objects(), this.getEMFObject(), null, "objects", null, 0, -1, EMFFileContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMFFileContent_Roots(), this.getEMFObject(), null, "roots", null, 0, -1, EMFFileContent.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(emfObjectEClass, EMFObject.class, "EMFObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEMFObject_ClassRefs(), this.getEMFClassRef(), null, "classRefs", null, 0, -1, EMFObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMFObject_FeatureRefs(), this.getEMFFeatureRef(), null, "featureRefs", null, 0, -1, EMFObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMFObject_TargetingRefVals(), this.getEMFInternalReferenceValue(), this.getEMFInternalReferenceValue_ReferencedObject(), "targetingRefVals", null, 0, -1, EMFObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMFObject_TargetingContainmentRefVals(), this.getEMFContainmentReferenceValue(), null, "targetingContainmentRefVals", null, 0, -1, EMFObject.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(emfClassRefEClass, EMFClassRef.class, "EMFClassRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEMFClassRef_PackageUri(), ecorePackage.getEString(), "packageUri", null, 0, 1, EMFClassRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEMFClassRef_ClassName(), ecorePackage.getEString(), "className", null, 0, 1, EMFClassRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(emfFeatureRefEClass, EMFFeatureRef.class, "EMFFeatureRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEMFFeatureRef_Values(), this.getEMFValue(), null, "values", null, 0, -1, EMFFeatureRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMFFeatureRef_ValueOrdering(), theSuperModListPackage.getVersionedList(), null, "valueOrdering", null, 0, 1, EMFFeatureRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMFFeatureRef_OrderedValues(), this.getEMFValue(), null, "orderedValues", null, 0, -1, EMFFeatureRef.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getEMFFeatureRef_FeatureName(), ecorePackage.getEString(), "featureName", null, 0, 1, EMFFeatureRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(emfValueEClass, EMFValue.class, "EMFValue", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(emfAttributeValueEClass, EMFAttributeValue.class, "EMFAttributeValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEMFAttributeValue_Literal(), ecorePackage.getEString(), "literal", null, 0, 1, EMFAttributeValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(emfInternalReferenceValueEClass, EMFInternalReferenceValue.class, "EMFInternalReferenceValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEMFInternalReferenceValue_ReferencedObject(), this.getEMFObject(), this.getEMFObject_TargetingRefVals(), "referencedObject", null, 0, 1, EMFInternalReferenceValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(emfExternalReferenceValueEClass, EMFExternalReferenceValue.class, "EMFExternalReferenceValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEMFExternalReferenceValue_EObjectUri(), ecorePackage.getEString(), "eObjectUri", null, 0, 1, EMFExternalReferenceValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(emfContainmentReferenceValueEClass, EMFContainmentReferenceValue.class, "EMFContainmentReferenceValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //SuperModEMFFilePackageImpl
