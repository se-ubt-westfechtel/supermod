/**
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package de.ubt.ai1.supermod.mm.collab.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import de.ubt.ai1.supermod.mm.collab.CollaborativeRevisionDimension;
import de.ubt.ai1.supermod.mm.collab.PrivateRevision;
import de.ubt.ai1.supermod.mm.collab.PublicRevision;
import de.ubt.ai1.supermod.mm.collab.SuperModCollabFactory;
import de.ubt.ai1.supermod.mm.collab.SuperModCollabPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SuperModCollabFactoryImpl extends EFactoryImpl implements SuperModCollabFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SuperModCollabFactory init() {
		try {
			SuperModCollabFactory theSuperModCollabFactory = (SuperModCollabFactory)EPackage.Registry.INSTANCE.getEFactory(SuperModCollabPackage.eNS_URI);
			if (theSuperModCollabFactory != null) {
				return theSuperModCollabFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SuperModCollabFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SuperModCollabFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case SuperModCollabPackage.COLLABORATIVE_REVISION_DIMENSION: return createCollaborativeRevisionDimension();
			case SuperModCollabPackage.PUBLIC_REVISION: return createPublicRevision();
			case SuperModCollabPackage.PRIVATE_REVISION: return createPrivateRevision();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollaborativeRevisionDimension createCollaborativeRevisionDimension() {
		CollaborativeRevisionDimensionImpl collaborativeRevisionDimension = new CollaborativeRevisionDimensionImpl();
		return collaborativeRevisionDimension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PublicRevision createPublicRevision() {
		PublicRevisionImpl publicRevision = new PublicRevisionImpl();
		return publicRevision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrivateRevision createPrivateRevision() {
		PrivateRevisionImpl privateRevision = new PrivateRevisionImpl();
		return privateRevision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SuperModCollabPackage getSuperModCollabPackage() {
		return (SuperModCollabPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SuperModCollabPackage getPackage() {
		return SuperModCollabPackage.eINSTANCE;
	}

} //SuperModCollabFactoryImpl
