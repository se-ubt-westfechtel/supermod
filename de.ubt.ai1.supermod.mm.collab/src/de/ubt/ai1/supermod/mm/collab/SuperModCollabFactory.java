/**
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package de.ubt.ai1.supermod.mm.collab;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.ubt.ai1.supermod.mm.collab.SuperModCollabPackage
 * @generated
 */
public interface SuperModCollabFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SuperModCollabFactory eINSTANCE = de.ubt.ai1.supermod.mm.collab.impl.SuperModCollabFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Collaborative Revision Dimension</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Collaborative Revision Dimension</em>'.
	 * @generated
	 */
	CollaborativeRevisionDimension createCollaborativeRevisionDimension();

	/**
	 * Returns a new object of class '<em>Public Revision</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Public Revision</em>'.
	 * @generated
	 */
	PublicRevision createPublicRevision();

	/**
	 * Returns a new object of class '<em>Private Revision</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Private Revision</em>'.
	 * @generated
	 */
	PrivateRevision createPrivateRevision();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SuperModCollabPackage getSuperModCollabPackage();

} //SuperModCollabFactory
