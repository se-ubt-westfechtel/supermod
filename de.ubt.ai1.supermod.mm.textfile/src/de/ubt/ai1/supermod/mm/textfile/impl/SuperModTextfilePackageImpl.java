/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.mm.textfile.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import de.ubt.ai1.supermod.mm.core.SuperModCorePackage;
import de.ubt.ai1.supermod.mm.file.SuperModFilePackage;
import de.ubt.ai1.supermod.mm.list.SuperModListPackage;
import de.ubt.ai1.supermod.mm.textfile.SuperModTextfileFactory;
import de.ubt.ai1.supermod.mm.textfile.SuperModTextfilePackage;
import de.ubt.ai1.supermod.mm.textfile.TextFileContent;
import de.ubt.ai1.supermod.mm.textfile.TextLine;

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
public class SuperModTextfilePackageImpl extends EPackageImpl implements SuperModTextfilePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textFileContentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textLineEClass = null;

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
	 * @see de.ubt.ai1.supermod.mm.textfile.SuperModTextfilePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SuperModTextfilePackageImpl() {
		super(eNS_URI, SuperModTextfileFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SuperModTextfilePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SuperModTextfilePackage init() {
		if (isInited) return (SuperModTextfilePackage)EPackage.Registry.INSTANCE.getEPackage(SuperModTextfilePackage.eNS_URI);

		// Obtain or create and register package
		SuperModTextfilePackageImpl theSuperModTextfilePackage = (SuperModTextfilePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SuperModTextfilePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SuperModTextfilePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		SuperModFilePackage.eINSTANCE.eClass();
		SuperModListPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theSuperModTextfilePackage.createPackageContents();

		// Initialize created meta-data
		theSuperModTextfilePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSuperModTextfilePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SuperModTextfilePackage.eNS_URI, theSuperModTextfilePackage);
		return theSuperModTextfilePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTextFileContent() {
		return textFileContentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTextFileContent_Lines() {
		return (EReference)textFileContentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTextFileContent_LineOrdering() {
		return (EReference)textFileContentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTextLine() {
		return textLineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextLine_Text() {
		return (EAttribute)textLineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTextLine_TextFileContent() {
		return (EReference)textLineEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SuperModTextfileFactory getSuperModTextfileFactory() {
		return (SuperModTextfileFactory)getEFactoryInstance();
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
		textFileContentEClass = createEClass(TEXT_FILE_CONTENT);
		createEReference(textFileContentEClass, TEXT_FILE_CONTENT__LINES);
		createEReference(textFileContentEClass, TEXT_FILE_CONTENT__LINE_ORDERING);

		textLineEClass = createEClass(TEXT_LINE);
		createEAttribute(textLineEClass, TEXT_LINE__TEXT);
		createEReference(textLineEClass, TEXT_LINE__TEXT_FILE_CONTENT);
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
		SuperModListPackage theSuperModListPackage = (SuperModListPackage)EPackage.Registry.INSTANCE.getEPackage(SuperModListPackage.eNS_URI);
		SuperModCorePackage theSuperModCorePackage = (SuperModCorePackage)EPackage.Registry.INSTANCE.getEPackage(SuperModCorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		textFileContentEClass.getESuperTypes().add(theSuperModFilePackage.getVersionedFileContent());
		textLineEClass.getESuperTypes().add(theSuperModCorePackage.getProductSpaceElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(textFileContentEClass, TextFileContent.class, "TextFileContent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getTextFileContent_Lines(), this.getTextLine(), this.getTextLine_TextFileContent(), "lines", null, 0, -1, TextFileContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getTextFileContent_LineOrdering(), theSuperModListPackage.getVersionedList(), null, "lineOrdering", null, 0, 1, TextFileContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(textLineEClass, TextLine.class, "TextLine", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getTextLine_Text(), ecorePackage.getEString(), "text", null, 0, 1, TextLine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getTextLine_TextFileContent(), this.getTextFileContent(), this.getTextFileContent_Lines(), "textFileContent", null, 0, 1, TextLine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		// Create resource
		createResource(eNS_URI);
	}

} //SuperModTextfilePackageImpl
