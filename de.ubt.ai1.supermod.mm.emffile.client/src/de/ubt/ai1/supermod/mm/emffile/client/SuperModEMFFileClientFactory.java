/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.mm.emffile.client;

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
 * @see de.ubt.ai1.supermod.mm.emffile.client.SuperModEMFFileClientPackage
 * @generated
 */
public interface SuperModEMFFileClientFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SuperModEMFFileClientFactory eINSTANCE = de.ubt.ai1.supermod.mm.emffile.client.impl.SuperModEMFFileClientFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>EMF Object Class Conflict</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EMF Object Class Conflict</em>'.
	 * @generated
	 */
	EMFObjectClassConflict createEMFObjectClassConflict();

	/**
	 * Returns a new object of class '<em>EMF Class Definition Conflict</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EMF Class Definition Conflict</em>'.
	 * @generated
	 */
	EMFClassDefinitionConflict createEMFClassDefinitionConflict();

	/**
	 * Returns a new object of class '<em>EMF Feature Compatibility Conflict</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EMF Feature Compatibility Conflict</em>'.
	 * @generated
	 */
	EMFFeatureCompatibilityConflict createEMFFeatureCompatibilityConflict();

	/**
	 * Returns a new object of class '<em>EMF Object Container Conflict</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EMF Object Container Conflict</em>'.
	 * @generated
	 */
	EMFObjectContainerConflict createEMFObjectContainerConflict();

	/**
	 * Returns a new object of class '<em>EMF Cyclic Containment Conflict</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EMF Cyclic Containment Conflict</em>'.
	 * @generated
	 */
	EMFCyclicContainmentConflict createEMFCyclicContainmentConflict();

	/**
	 * Returns a new object of class '<em>EMF Single Feature Value Conflict</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EMF Single Feature Value Conflict</em>'.
	 * @generated
	 */
	EMFSingleFeatureValueConflict createEMFSingleFeatureValueConflict();

	/**
	 * Returns a new object of class '<em>EMF Multi Feature Value Conflict</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EMF Multi Feature Value Conflict</em>'.
	 * @generated
	 */
	EMFMultiFeatureValueConflict createEMFMultiFeatureValueConflict();

	/**
	 * Returns a new object of class '<em>EMF Link Compatibility Conflict</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EMF Link Compatibility Conflict</em>'.
	 * @generated
	 */
	EMFLinkCompatibilityConflict createEMFLinkCompatibilityConflict();

	/**
	 * Returns a new object of class '<em>EMF Object Definition Conflict</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EMF Object Definition Conflict</em>'.
	 * @generated
	 */
	EMFObjectDefinitionConflict createEMFObjectDefinitionConflict();

	/**
	 * Returns a new object of class '<em>EMF Referential Integrity Conflict</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EMF Referential Integrity Conflict</em>'.
	 * @generated
	 */
	EMFReferentialIntegrityConflict createEMFReferentialIntegrityConflict();

	/**
	 * Returns a new object of class '<em>EMF File Export Trace</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EMF File Export Trace</em>'.
	 * @generated
	 */
	EMFFileExportTrace createEMFFileExportTrace();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SuperModEMFFileClientPackage getSuperModEMFFileClientPackage();

} //SuperModEMFFileClientFactory
