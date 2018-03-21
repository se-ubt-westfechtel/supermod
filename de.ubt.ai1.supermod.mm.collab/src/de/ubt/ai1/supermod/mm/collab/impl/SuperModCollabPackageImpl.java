/**
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package de.ubt.ai1.supermod.mm.collab.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import de.ubt.ai1.supermod.mm.collab.CollaborativeRevisionDimension;
import de.ubt.ai1.supermod.mm.collab.PrivateRevision;
import de.ubt.ai1.supermod.mm.collab.PublicRevision;
import de.ubt.ai1.supermod.mm.collab.Revision;
import de.ubt.ai1.supermod.mm.collab.SuperModCollabFactory;
import de.ubt.ai1.supermod.mm.collab.SuperModCollabPackage;
import de.ubt.ai1.supermod.mm.core.SuperModCorePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SuperModCollabPackageImpl extends EPackageImpl implements SuperModCollabPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass collaborativeRevisionDimensionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass revisionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass publicRevisionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass privateRevisionEClass = null;

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
	 * @see de.ubt.ai1.supermod.mm.collab.SuperModCollabPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SuperModCollabPackageImpl() {
		super(eNS_URI, SuperModCollabFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SuperModCollabPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SuperModCollabPackage init() {
		if (isInited) return (SuperModCollabPackage)EPackage.Registry.INSTANCE.getEPackage(SuperModCollabPackage.eNS_URI);

		// Obtain or create and register package
		SuperModCollabPackageImpl theSuperModCollabPackage = (SuperModCollabPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SuperModCollabPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SuperModCollabPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		SuperModCorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theSuperModCollabPackage.createPackageContents();

		// Initialize created meta-data
		theSuperModCollabPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSuperModCollabPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SuperModCollabPackage.eNS_URI, theSuperModCollabPackage);
		return theSuperModCollabPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCollaborativeRevisionDimension() {
		return collaborativeRevisionDimensionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCollaborativeRevisionDimension_PublicRevisions() {
		return (EReference)collaborativeRevisionDimensionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCollaborativeRevisionDimension_InitialPublicRevision() {
		return (EReference)collaborativeRevisionDimensionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCollaborativeRevisionDimension_InitialPublicRevisionInvariant() {
		return (EReference)collaborativeRevisionDimensionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollaborativeRevisionDimension_LatestPublicRevisionNumber() {
		return (EAttribute)collaborativeRevisionDimensionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCollaborativeRevisionDimension_PublicHead() {
		return (EReference)collaborativeRevisionDimensionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCollaborativeRevisionDimension_CurrentPublicRevision() {
		return (EReference)collaborativeRevisionDimensionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCollaborativeRevisionDimension_AllRevisions() {
		return (EReference)collaborativeRevisionDimensionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCollaborativeRevisionDimension__GetRevisionsForBinding__OptionBinding() {
		return collaborativeRevisionDimensionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCollaborativeRevisionDimension__GetLatestRevisions__EList() {
		return collaborativeRevisionDimensionEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCollaborativeRevisionDimension__GetLatestPublicRevisions__EList() {
		return collaborativeRevisionDimensionEClass.getEOperations().get(2);
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
	public EReference getRevision_AllPredecessors() {
		return (EReference)revisionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRevision_AllSuccessors() {
		return (EReference)revisionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRevision_EarliestPredecessors() {
		return (EReference)revisionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRevision_LatestSuccessors() {
		return (EReference)revisionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRevision_RevisionOption() {
		return (EReference)revisionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRevision_RevisionDefaultBinding() {
		return (EReference)revisionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRevision_PredecessorPreferences() {
		return (EReference)revisionEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRevision_RevisionNumber() {
		return (EAttribute)revisionEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRevision_DisplayRevisionNumber() {
		return (EAttribute)revisionEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRevision_Date() {
		return (EAttribute)revisionEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRevision_CommitMessage() {
		return (EAttribute)revisionEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPublicRevision() {
		return publicRevisionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPublicRevision_RevisionDimension() {
		return (EReference)publicRevisionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPublicRevision_PrivateRevisions() {
		return (EReference)publicRevisionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPublicRevision_Committer() {
		return (EAttribute)publicRevisionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPublicRevision_LatestPrivateRevisionNumber() {
		return (EAttribute)publicRevisionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPublicRevision_InitialPrivateRevision() {
		return (EReference)publicRevisionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPublicRevision_PrivateHead() {
		return (EReference)publicRevisionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPublicRevision_Head() {
		return (EAttribute)publicRevisionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPublicRevision_Finished() {
		return (EAttribute)publicRevisionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPublicRevision_FinishedOption() {
		return (EReference)publicRevisionEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPublicRevision_FinishedDefaultBinding() {
		return (EReference)publicRevisionEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrivateRevision() {
		return privateRevisionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrivateRevision_PublicRevision() {
		return (EReference)privateRevisionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrivateRevision_PublicPredecessors() {
		return (EReference)privateRevisionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SuperModCollabFactory getSuperModCollabFactory() {
		return (SuperModCollabFactory)getEFactoryInstance();
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
		collaborativeRevisionDimensionEClass = createEClass(COLLABORATIVE_REVISION_DIMENSION);
		createEReference(collaborativeRevisionDimensionEClass, COLLABORATIVE_REVISION_DIMENSION__PUBLIC_REVISIONS);
		createEReference(collaborativeRevisionDimensionEClass, COLLABORATIVE_REVISION_DIMENSION__INITIAL_PUBLIC_REVISION);
		createEReference(collaborativeRevisionDimensionEClass, COLLABORATIVE_REVISION_DIMENSION__INITIAL_PUBLIC_REVISION_INVARIANT);
		createEAttribute(collaborativeRevisionDimensionEClass, COLLABORATIVE_REVISION_DIMENSION__LATEST_PUBLIC_REVISION_NUMBER);
		createEReference(collaborativeRevisionDimensionEClass, COLLABORATIVE_REVISION_DIMENSION__PUBLIC_HEAD);
		createEReference(collaborativeRevisionDimensionEClass, COLLABORATIVE_REVISION_DIMENSION__CURRENT_PUBLIC_REVISION);
		createEReference(collaborativeRevisionDimensionEClass, COLLABORATIVE_REVISION_DIMENSION__ALL_REVISIONS);
		createEOperation(collaborativeRevisionDimensionEClass, COLLABORATIVE_REVISION_DIMENSION___GET_REVISIONS_FOR_BINDING__OPTIONBINDING);
		createEOperation(collaborativeRevisionDimensionEClass, COLLABORATIVE_REVISION_DIMENSION___GET_LATEST_REVISIONS__ELIST);
		createEOperation(collaborativeRevisionDimensionEClass, COLLABORATIVE_REVISION_DIMENSION___GET_LATEST_PUBLIC_REVISIONS__ELIST);

		revisionEClass = createEClass(REVISION);
		createEReference(revisionEClass, REVISION__PREDECESSORS);
		createEReference(revisionEClass, REVISION__SUCCESSORS);
		createEReference(revisionEClass, REVISION__ALL_PREDECESSORS);
		createEReference(revisionEClass, REVISION__ALL_SUCCESSORS);
		createEReference(revisionEClass, REVISION__EARLIEST_PREDECESSORS);
		createEReference(revisionEClass, REVISION__LATEST_SUCCESSORS);
		createEReference(revisionEClass, REVISION__REVISION_OPTION);
		createEReference(revisionEClass, REVISION__REVISION_DEFAULT_BINDING);
		createEReference(revisionEClass, REVISION__PREDECESSOR_PREFERENCES);
		createEAttribute(revisionEClass, REVISION__REVISION_NUMBER);
		createEAttribute(revisionEClass, REVISION__DISPLAY_REVISION_NUMBER);
		createEAttribute(revisionEClass, REVISION__DATE);
		createEAttribute(revisionEClass, REVISION__COMMIT_MESSAGE);

		publicRevisionEClass = createEClass(PUBLIC_REVISION);
		createEReference(publicRevisionEClass, PUBLIC_REVISION__REVISION_DIMENSION);
		createEReference(publicRevisionEClass, PUBLIC_REVISION__PRIVATE_REVISIONS);
		createEAttribute(publicRevisionEClass, PUBLIC_REVISION__COMMITTER);
		createEAttribute(publicRevisionEClass, PUBLIC_REVISION__LATEST_PRIVATE_REVISION_NUMBER);
		createEReference(publicRevisionEClass, PUBLIC_REVISION__INITIAL_PRIVATE_REVISION);
		createEReference(publicRevisionEClass, PUBLIC_REVISION__PRIVATE_HEAD);
		createEAttribute(publicRevisionEClass, PUBLIC_REVISION__HEAD);
		createEAttribute(publicRevisionEClass, PUBLIC_REVISION__FINISHED);
		createEReference(publicRevisionEClass, PUBLIC_REVISION__FINISHED_OPTION);
		createEReference(publicRevisionEClass, PUBLIC_REVISION__FINISHED_DEFAULT_BINDING);

		privateRevisionEClass = createEClass(PRIVATE_REVISION);
		createEReference(privateRevisionEClass, PRIVATE_REVISION__PUBLIC_REVISION);
		createEReference(privateRevisionEClass, PRIVATE_REVISION__PUBLIC_PREDECESSORS);
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
		collaborativeRevisionDimensionEClass.getESuperTypes().add(theSuperModCorePackage.getVersionDimension());
		revisionEClass.getESuperTypes().add(theSuperModCorePackage.getVersionSpaceElement());
		publicRevisionEClass.getESuperTypes().add(this.getRevision());
		privateRevisionEClass.getESuperTypes().add(this.getRevision());

		// Initialize classes, features, and operations; add parameters
		initEClass(collaborativeRevisionDimensionEClass, CollaborativeRevisionDimension.class, "CollaborativeRevisionDimension", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCollaborativeRevisionDimension_PublicRevisions(), this.getPublicRevision(), this.getPublicRevision_RevisionDimension(), "publicRevisions", null, 0, -1, CollaborativeRevisionDimension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCollaborativeRevisionDimension_InitialPublicRevision(), this.getPublicRevision(), null, "initialPublicRevision", null, 0, 1, CollaborativeRevisionDimension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCollaborativeRevisionDimension_InitialPublicRevisionInvariant(), theSuperModCorePackage.getInvariant(), null, "initialPublicRevisionInvariant", null, 0, 1, CollaborativeRevisionDimension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCollaborativeRevisionDimension_LatestPublicRevisionNumber(), ecorePackage.getEInt(), "latestPublicRevisionNumber", null, 0, 1, CollaborativeRevisionDimension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCollaborativeRevisionDimension_PublicHead(), this.getPublicRevision(), null, "publicHead", null, 0, 1, CollaborativeRevisionDimension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCollaborativeRevisionDimension_CurrentPublicRevision(), this.getPublicRevision(), null, "currentPublicRevision", null, 0, 1, CollaborativeRevisionDimension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCollaborativeRevisionDimension_AllRevisions(), this.getRevision(), null, "allRevisions", null, 0, -1, CollaborativeRevisionDimension.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getCollaborativeRevisionDimension__GetRevisionsForBinding__OptionBinding(), this.getRevision(), "getRevisionsForBinding", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSuperModCorePackage.getOptionBinding(), "binding", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCollaborativeRevisionDimension__GetLatestRevisions__EList(), this.getRevision(), "getLatestRevisions", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getRevision(), "revisions", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCollaborativeRevisionDimension__GetLatestPublicRevisions__EList(), this.getPublicRevision(), "getLatestPublicRevisions", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getPublicRevision(), "publicRevisions", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(revisionEClass, Revision.class, "Revision", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRevision_Predecessors(), this.getRevision(), this.getRevision_Successors(), "predecessors", null, 0, -1, Revision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRevision_Successors(), this.getRevision(), this.getRevision_Predecessors(), "successors", null, 0, -1, Revision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRevision_AllPredecessors(), this.getRevision(), this.getRevision_AllSuccessors(), "allPredecessors", null, 0, -1, Revision.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getRevision_AllSuccessors(), this.getRevision(), this.getRevision_AllPredecessors(), "allSuccessors", null, 0, -1, Revision.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getRevision_EarliestPredecessors(), this.getRevision(), null, "earliestPredecessors", null, 0, -1, Revision.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getRevision_LatestSuccessors(), this.getRevision(), null, "latestSuccessors", null, 0, -1, Revision.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getRevision_RevisionOption(), theSuperModCorePackage.getOption(), null, "revisionOption", null, 0, 1, Revision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRevision_RevisionDefaultBinding(), theSuperModCorePackage.getDefaultBinding(), null, "revisionDefaultBinding", null, 0, 1, Revision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRevision_PredecessorPreferences(), theSuperModCorePackage.getPreference(), null, "predecessorPreferences", null, 0, -1, Revision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRevision_RevisionNumber(), ecorePackage.getEInt(), "revisionNumber", null, 0, 1, Revision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRevision_DisplayRevisionNumber(), ecorePackage.getEString(), "displayRevisionNumber", null, 0, 1, Revision.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getRevision_Date(), ecorePackage.getEDate(), "date", null, 0, 1, Revision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRevision_CommitMessage(), ecorePackage.getEString(), "commitMessage", null, 0, 1, Revision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(publicRevisionEClass, PublicRevision.class, "PublicRevision", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPublicRevision_RevisionDimension(), this.getCollaborativeRevisionDimension(), this.getCollaborativeRevisionDimension_PublicRevisions(), "revisionDimension", null, 0, 1, PublicRevision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPublicRevision_PrivateRevisions(), this.getPrivateRevision(), this.getPrivateRevision_PublicRevision(), "privateRevisions", null, 0, -1, PublicRevision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPublicRevision_Committer(), ecorePackage.getEString(), "committer", null, 0, 1, PublicRevision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPublicRevision_LatestPrivateRevisionNumber(), ecorePackage.getEInt(), "latestPrivateRevisionNumber", null, 0, 1, PublicRevision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPublicRevision_InitialPrivateRevision(), this.getPrivateRevision(), null, "initialPrivateRevision", null, 0, 1, PublicRevision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPublicRevision_PrivateHead(), this.getPrivateRevision(), null, "privateHead", null, 0, 1, PublicRevision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPublicRevision_Head(), ecorePackage.getEBoolean(), "head", null, 0, 1, PublicRevision.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getPublicRevision_Finished(), ecorePackage.getEBoolean(), "finished", null, 0, 1, PublicRevision.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getPublicRevision_FinishedOption(), theSuperModCorePackage.getOption(), null, "finishedOption", null, 0, 1, PublicRevision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPublicRevision_FinishedDefaultBinding(), theSuperModCorePackage.getDefaultBinding(), null, "finishedDefaultBinding", null, 0, 1, PublicRevision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(privateRevisionEClass, PrivateRevision.class, "PrivateRevision", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPrivateRevision_PublicRevision(), this.getPublicRevision(), this.getPublicRevision_PrivateRevisions(), "publicRevision", null, 0, 1, PrivateRevision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPrivateRevision_PublicPredecessors(), this.getPublicRevision(), null, "publicPredecessors", null, 0, -1, PrivateRevision.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //SuperModCollabPackageImpl
