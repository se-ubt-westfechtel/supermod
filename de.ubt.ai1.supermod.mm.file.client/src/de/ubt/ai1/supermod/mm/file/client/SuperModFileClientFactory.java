/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.mm.file.client;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date 	2014-07-28
 * <!-- end-user-doc -->
 * @see de.ubt.ai1.supermod.mm.file.client.SuperModFileClientPackage
 * @generated
 */
public interface SuperModFileClientFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SuperModFileClientFactory eINSTANCE = de.ubt.ai1.supermod.mm.file.client.impl.SuperModFileClientFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Single Version File System Descriptor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Single Version File System Descriptor</em>'.
	 * @generated
	 */
	SingleVersionFileSystemDescriptor createSingleVersionFileSystemDescriptor();

	/**
	 * Returns a new object of class '<em>Single Version File Descriptor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Single Version File Descriptor</em>'.
	 * @generated
	 */
	SingleVersionFileDescriptor createSingleVersionFileDescriptor();

	/**
	 * Returns a new object of class '<em>Single Version Folder Descriptor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Single Version Folder Descriptor</em>'.
	 * @generated
	 */
	SingleVersionFolderDescriptor createSingleVersionFolderDescriptor();

	/**
	 * Returns a new object of class '<em>Versioned File System Export Trace</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Versioned File System Export Trace</em>'.
	 * @generated
	 */
	VersionedFileSystemExportTrace createVersionedFileSystemExportTrace();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SuperModFileClientPackage getSuperModFileClientPackage();

} //SuperModFileClientFactory
