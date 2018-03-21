/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.mm.client;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model. * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date 	2014-07-25
 * <!-- end-user-doc -->
 * @see de.ubt.ai1.supermod.mm.client.SuperModClientPackage
 * @generated
 */
public interface SuperModClientFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SuperModClientFactory eINSTANCE = de.ubt.ai1.supermod.mm.client.impl.SuperModClientFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Single Version Product Space Descriptor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Single Version Product Space Descriptor</em>'.
	 * @generated
	 */
	SingleVersionProductSpaceDescriptor createSingleVersionProductSpaceDescriptor();

	/**
	 * Returns a new object of class '<em>Local Repository</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Local Repository</em>'.
	 * @generated
	 */
	LocalRepository createLocalRepository();

	/**
	 * Returns a new object of class '<em>Product Space Export Trace</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Product Space Export Trace</em>'.
	 * @generated
	 */
	ProductSpaceExportTrace createProductSpaceExportTrace();

	/**
	 * Returns a new object of class '<em>Conflict Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Conflict Set</em>'.
	 * @generated
	 */
	ConflictSet createConflictSet();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SuperModClientPackage getSuperModClientPackage();

} //SuperModClientFactory
