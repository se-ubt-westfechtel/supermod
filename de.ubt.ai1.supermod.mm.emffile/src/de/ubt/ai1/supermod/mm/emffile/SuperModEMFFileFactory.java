/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.mm.emffile;

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
 * @see de.ubt.ai1.supermod.mm.emffile.SuperModEMFFilePackage
 * @generated
 */
public interface SuperModEMFFileFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SuperModEMFFileFactory eINSTANCE = de.ubt.ai1.supermod.mm.emffile.impl.SuperModEMFFileFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>EMF File Content</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EMF File Content</em>'.
	 * @generated
	 */
	EMFFileContent createEMFFileContent();

	/**
	 * Returns a new object of class '<em>EMF Object</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EMF Object</em>'.
	 * @generated
	 */
	EMFObject createEMFObject();

	/**
	 * Returns a new object of class '<em>EMF Class Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EMF Class Ref</em>'.
	 * @generated
	 */
	EMFClassRef createEMFClassRef();

	/**
	 * Returns a new object of class '<em>EMF Feature Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EMF Feature Ref</em>'.
	 * @generated
	 */
	EMFFeatureRef createEMFFeatureRef();

	/**
	 * Returns a new object of class '<em>EMF Attribute Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EMF Attribute Value</em>'.
	 * @generated
	 */
	EMFAttributeValue createEMFAttributeValue();

	/**
	 * Returns a new object of class '<em>EMF Internal Reference Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EMF Internal Reference Value</em>'.
	 * @generated
	 */
	EMFInternalReferenceValue createEMFInternalReferenceValue();

	/**
	 * Returns a new object of class '<em>EMF External Reference Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EMF External Reference Value</em>'.
	 * @generated
	 */
	EMFExternalReferenceValue createEMFExternalReferenceValue();

	/**
	 * Returns a new object of class '<em>EMF Containment Reference Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EMF Containment Reference Value</em>'.
	 * @generated
	 */
	EMFContainmentReferenceValue createEMFContainmentReferenceValue();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SuperModEMFFilePackage getSuperModEMFFilePackage();

} //SuperModEMFFileFactory
