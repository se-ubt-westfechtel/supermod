/**
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package de.ubt.ai1.supermod.textfile.client.impl;

import de.ubt.ai1.supermod.mm.file.client.SuperModFileClientPackage;

import de.ubt.ai1.supermod.mm.textfile.SuperModTextfilePackage;

import de.ubt.ai1.supermod.textfile.client.SuperModTextfileClientFactory;
import de.ubt.ai1.supermod.textfile.client.SuperModTextfileClientPackage;
import de.ubt.ai1.supermod.textfile.client.TextFileExportTrace;
import de.ubt.ai1.supermod.textfile.client.TextLineExportTrace;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SuperModTextfileClientPackageImpl extends EPackageImpl implements SuperModTextfileClientPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textFileExportTraceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textLineExportTraceEClass = null;

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
	 * @see de.ubt.ai1.supermod.textfile.client.SuperModTextfileClientPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SuperModTextfileClientPackageImpl() {
		super(eNS_URI, SuperModTextfileClientFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SuperModTextfileClientPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SuperModTextfileClientPackage init() {
		if (isInited) return (SuperModTextfileClientPackage)EPackage.Registry.INSTANCE.getEPackage(SuperModTextfileClientPackage.eNS_URI);

		// Obtain or create and register package
		SuperModTextfileClientPackageImpl theSuperModTextfileClientPackage = (SuperModTextfileClientPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SuperModTextfileClientPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SuperModTextfileClientPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		SuperModFileClientPackage.eINSTANCE.eClass();
		SuperModTextfilePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theSuperModTextfileClientPackage.createPackageContents();

		// Initialize created meta-data
		theSuperModTextfileClientPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSuperModTextfileClientPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SuperModTextfileClientPackage.eNS_URI, theSuperModTextfileClientPackage);
		return theSuperModTextfileClientPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTextFileExportTrace() {
		return textFileExportTraceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTextFileExportTrace_Lines() {
		return (EReference)textFileExportTraceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTextLineExportTrace() {
		return textLineExportTraceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextLineExportTrace_LineNr() {
		return (EAttribute)textLineExportTraceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTextLineExportTrace_Line() {
		return (EReference)textLineExportTraceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SuperModTextfileClientFactory getSuperModTextfileClientFactory() {
		return (SuperModTextfileClientFactory)getEFactoryInstance();
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
		textFileExportTraceEClass = createEClass(TEXT_FILE_EXPORT_TRACE);
		createEReference(textFileExportTraceEClass, TEXT_FILE_EXPORT_TRACE__LINES);

		textLineExportTraceEClass = createEClass(TEXT_LINE_EXPORT_TRACE);
		createEAttribute(textLineExportTraceEClass, TEXT_LINE_EXPORT_TRACE__LINE_NR);
		createEReference(textLineExportTraceEClass, TEXT_LINE_EXPORT_TRACE__LINE);
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
		SuperModFileClientPackage theSuperModFileClientPackage = (SuperModFileClientPackage)EPackage.Registry.INSTANCE.getEPackage(SuperModFileClientPackage.eNS_URI);
		SuperModTextfilePackage theSuperModTextfilePackage = (SuperModTextfilePackage)EPackage.Registry.INSTANCE.getEPackage(SuperModTextfilePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		textFileExportTraceEClass.getESuperTypes().add(theSuperModFileClientPackage.getVersionedFileExportTrace());

		// Initialize classes, features, and operations; add parameters
		initEClass(textFileExportTraceEClass, TextFileExportTrace.class, "TextFileExportTrace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTextFileExportTrace_Lines(), this.getTextLineExportTrace(), null, "lines", null, 0, -1, TextFileExportTrace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(textLineExportTraceEClass, TextLineExportTrace.class, "TextLineExportTrace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTextLineExportTrace_LineNr(), ecorePackage.getEInt(), "lineNr", null, 0, 1, TextLineExportTrace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTextLineExportTrace_Line(), theSuperModTextfilePackage.getTextLine(), null, "line", null, 0, 1, TextLineExportTrace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //SuperModTextfileClientPackageImpl
