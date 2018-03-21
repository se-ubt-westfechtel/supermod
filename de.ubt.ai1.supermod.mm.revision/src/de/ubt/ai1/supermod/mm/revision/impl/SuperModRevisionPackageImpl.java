/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.mm.revision.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import de.ubt.ai1.supermod.mm.core.SuperModCorePackage;
import de.ubt.ai1.supermod.mm.revision.Revision;
import de.ubt.ai1.supermod.mm.revision.RevisionDimension;
import de.ubt.ai1.supermod.mm.revision.SuperModRevisionFactory;
import de.ubt.ai1.supermod.mm.revision.SuperModRevisionPackage;

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
public class SuperModRevisionPackageImpl extends EPackageImpl implements SuperModRevisionPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass revisionDimensionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass revisionEClass = null;

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
	 * @see de.ubt.ai1.supermod.mm.revision.SuperModRevisionPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SuperModRevisionPackageImpl() {
		super(eNS_URI, SuperModRevisionFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SuperModRevisionPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SuperModRevisionPackage init() {
		if (isInited) return (SuperModRevisionPackage)EPackage.Registry.INSTANCE.getEPackage(SuperModRevisionPackage.eNS_URI);

		// Obtain or create and register package
		SuperModRevisionPackageImpl theSuperModRevisionPackage = (SuperModRevisionPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SuperModRevisionPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SuperModRevisionPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		SuperModCorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theSuperModRevisionPackage.createPackageContents();

		// Initialize created meta-data
		theSuperModRevisionPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSuperModRevisionPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SuperModRevisionPackage.eNS_URI, theSuperModRevisionPackage);
		return theSuperModRevisionPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRevisionDimension() {
		return revisionDimensionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRevisionDimension_Revisions() {
		return (EReference)revisionDimensionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRevisionDimension_InitialRevision() {
		return (EReference)revisionDimensionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRevisionDimension_InitialRevisionInvariant() {
		return (EReference)revisionDimensionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRevisionDimension_LatestRevisionNumber() {
		return (EAttribute)revisionDimensionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRevisionDimension_Head() {
		return (EReference)revisionDimensionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRevisionDimension__GetRevisionsForBinding__OptionBinding() {
		return revisionDimensionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRevisionDimension__GetLatestRevisions__EList() {
		return revisionDimensionEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRevision() {
		return revisionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRevision_Predecessors() {
		return (EReference)revisionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRevision_Successors() {
		return (EReference)revisionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRevision_RevisionNumber() {
		return (EAttribute)revisionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRevision_Committer() {
		return (EAttribute)revisionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRevision_CommitMessage() {
		return (EAttribute)revisionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRevision_Date() {
		return (EAttribute)revisionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRevision_AllPredecessors() {
		return (EReference)revisionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRevision_AllSuccessors() {
		return (EReference)revisionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRevision_EarliestPredecessors() {
		return (EReference)revisionEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRevision_LatestSuccessors() {
		return (EReference)revisionEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRevision_RevisionOption() {
		return (EReference)revisionEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRevision_RevisionDefaultBinding() {
		return (EReference)revisionEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRevision_PredecessorPreferences() {
		return (EReference)revisionEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SuperModRevisionFactory getSuperModRevisionFactory() {
		return (SuperModRevisionFactory)getEFactoryInstance();
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
		revisionDimensionEClass = createEClass(REVISION_DIMENSION);
		createEReference(revisionDimensionEClass, REVISION_DIMENSION__REVISIONS);
		createEReference(revisionDimensionEClass, REVISION_DIMENSION__INITIAL_REVISION);
		createEReference(revisionDimensionEClass, REVISION_DIMENSION__INITIAL_REVISION_INVARIANT);
		createEAttribute(revisionDimensionEClass, REVISION_DIMENSION__LATEST_REVISION_NUMBER);
		createEReference(revisionDimensionEClass, REVISION_DIMENSION__HEAD);
		createEOperation(revisionDimensionEClass, REVISION_DIMENSION___GET_REVISIONS_FOR_BINDING__OPTIONBINDING);
		createEOperation(revisionDimensionEClass, REVISION_DIMENSION___GET_LATEST_REVISIONS__ELIST);

		revisionEClass = createEClass(REVISION);
		createEReference(revisionEClass, REVISION__PREDECESSORS);
		createEReference(revisionEClass, REVISION__SUCCESSORS);
		createEAttribute(revisionEClass, REVISION__REVISION_NUMBER);
		createEAttribute(revisionEClass, REVISION__COMMITTER);
		createEAttribute(revisionEClass, REVISION__COMMIT_MESSAGE);
		createEAttribute(revisionEClass, REVISION__DATE);
		createEReference(revisionEClass, REVISION__ALL_PREDECESSORS);
		createEReference(revisionEClass, REVISION__ALL_SUCCESSORS);
		createEReference(revisionEClass, REVISION__EARLIEST_PREDECESSORS);
		createEReference(revisionEClass, REVISION__LATEST_SUCCESSORS);
		createEReference(revisionEClass, REVISION__REVISION_OPTION);
		createEReference(revisionEClass, REVISION__REVISION_DEFAULT_BINDING);
		createEReference(revisionEClass, REVISION__PREDECESSOR_PREFERENCES);
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
		revisionDimensionEClass.getESuperTypes().add(theSuperModCorePackage.getVersionDimension());
		revisionEClass.getESuperTypes().add(theSuperModCorePackage.getVersionSpaceElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(revisionDimensionEClass, RevisionDimension.class, "RevisionDimension", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRevisionDimension_Revisions(), this.getRevision(), null, "revisions", null, 0, -1, RevisionDimension.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRevisionDimension_InitialRevision(), this.getRevision(), null, "initialRevision", null, 0, 1, RevisionDimension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRevisionDimension_InitialRevisionInvariant(), theSuperModCorePackage.getInvariant(), null, "initialRevisionInvariant", null, 0, 1, RevisionDimension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRevisionDimension_LatestRevisionNumber(), ecorePackage.getEInt(), "latestRevisionNumber", null, 0, 1, RevisionDimension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRevisionDimension_Head(), this.getRevision(), null, "head", null, 0, 1, RevisionDimension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getRevisionDimension__GetRevisionsForBinding__OptionBinding(), this.getRevision(), "getRevisionsForBinding", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSuperModCorePackage.getOptionBinding(), "binding", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getRevisionDimension__GetLatestRevisions__EList(), this.getRevision(), "getLatestRevisions", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getRevision(), "revisions", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(revisionEClass, Revision.class, "Revision", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRevision_Predecessors(), this.getRevision(), this.getRevision_Successors(), "predecessors", null, 0, -1, Revision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRevision_Successors(), this.getRevision(), this.getRevision_Predecessors(), "successors", null, 0, -1, Revision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRevision_RevisionNumber(), ecorePackage.getEInt(), "revisionNumber", null, 0, 1, Revision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRevision_Committer(), ecorePackage.getEString(), "committer", null, 0, 1, Revision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRevision_CommitMessage(), ecorePackage.getEString(), "commitMessage", null, 0, 1, Revision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRevision_Date(), ecorePackage.getEDate(), "date", null, 0, 1, Revision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRevision_AllPredecessors(), this.getRevision(), this.getRevision_AllSuccessors(), "allPredecessors", null, 0, -1, Revision.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getRevision_AllSuccessors(), this.getRevision(), this.getRevision_AllPredecessors(), "allSuccessors", null, 0, -1, Revision.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getRevision_EarliestPredecessors(), this.getRevision(), null, "earliestPredecessors", null, 0, -1, Revision.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getRevision_LatestSuccessors(), this.getRevision(), null, "latestSuccessors", null, 0, -1, Revision.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getRevision_RevisionOption(), theSuperModCorePackage.getOption(), null, "revisionOption", null, 0, 1, Revision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRevision_RevisionDefaultBinding(), theSuperModCorePackage.getDefaultBinding(), null, "revisionDefaultBinding", null, 0, 1, Revision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRevision_PredecessorPreferences(), theSuperModCorePackage.getPreference(), null, "predecessorPreferences", null, 0, -1, Revision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //SuperModRevisionPackageImpl
