/******************************************************************************
 * Copyright (c) 2018 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.mm.list;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>,
 * 			Johannes Schroepfer <Johannes.M.Schroepfer(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	2018-01-09
 * <!-- end-user-doc -->
 * @see de.ubt.ai1.supermod.mm.list.SuperModListPackage
 * @generated
 */
public interface SuperModListFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SuperModListFactory eINSTANCE = de.ubt.ai1.supermod.mm.list.impl.SuperModListFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Versioned List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Versioned List</em>'.
	 * @generated
	 */
	VersionedList createVersionedList();

	/**
	 * Returns a new object of class '<em>Versioned List Vertex</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Versioned List Vertex</em>'.
	 * @generated
	 */
	VersionedListVertex createVersionedListVertex();

	/**
	 * Returns a new object of class '<em>Versioned List Edge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Versioned List Edge</em>'.
	 * @generated
	 */
	VersionedListEdge createVersionedListEdge();

	/**
	 * Returns a new object of class '<em>Versioned List Start Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Versioned List Start Reference</em>'.
	 * @generated
	 */
	VersionedListStartReference createVersionedListStartReference();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SuperModListPackage getSuperModListPackage();

} //SuperModListFactory
