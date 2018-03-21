/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.mm.list.client;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date 	2014-07-25
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.ubt.ai1.supermod.mm.list.client.SuperModListClientPackage
 * @generated
 */
public interface SuperModListClientFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SuperModListClientFactory eINSTANCE = de.ubt.ai1.supermod.mm.list.client.impl.SuperModListClientFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Ordering Conflict</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ordering Conflict</em>'.
	 * @generated
	 */
	OrderingConflict createOrderingConflict();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SuperModListClientPackage getSuperModListClientPackage();

} //SuperModListClientFactory
