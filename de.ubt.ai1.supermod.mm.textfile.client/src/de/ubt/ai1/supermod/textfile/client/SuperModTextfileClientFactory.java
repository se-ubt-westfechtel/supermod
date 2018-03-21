/**
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package de.ubt.ai1.supermod.textfile.client;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.ubt.ai1.supermod.textfile.client.SuperModTextfileClientPackage
 * @generated
 */
public interface SuperModTextfileClientFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SuperModTextfileClientFactory eINSTANCE = de.ubt.ai1.supermod.textfile.client.impl.SuperModTextfileClientFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Text File Export Trace</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Text File Export Trace</em>'.
	 * @generated
	 */
	TextFileExportTrace createTextFileExportTrace();

	/**
	 * Returns a new object of class '<em>Text Line Export Trace</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Text Line Export Trace</em>'.
	 * @generated
	 */
	TextLineExportTrace createTextLineExportTrace();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SuperModTextfileClientPackage getSuperModTextfileClientPackage();

} //SuperModTextfileClientFactory
