/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.mm.emffile;

import de.ubt.ai1.supermod.mm.core.ProductSpaceElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EMF Class Ref</b></em>'.
 * Base type for references to classes of the (versioned or unversioned)
 * meta-model.
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date 	2014-07-28
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai1.supermod.mm.emffile.EMFClassRef#getPackageUri <em>Package Uri</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.emffile.EMFClassRef#getClassName <em>Class Name</em>}</li>
 * </ul>
 *
 * @see de.ubt.ai1.supermod.mm.emffile.SuperModEMFFilePackage#getEMFClassRef()
 * @model
 * @generated
 */
public interface EMFClassRef extends ProductSpaceElement {

	/**
	 * Returns the value of the '<em><b>Package Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Package Uri</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package Uri</em>' attribute.
	 * @see #setPackageUri(String)
	 * @see de.ubt.ai1.supermod.mm.emffile.SuperModEMFFilePackage#getEMFClassRef_PackageUri()
	 * @model
	 * @generated
	 */
	String getPackageUri();

	/**
	 * Sets the value of the '{@link de.ubt.ai1.supermod.mm.emffile.EMFClassRef#getPackageUri <em>Package Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package Uri</em>' attribute.
	 * @see #getPackageUri()
	 * @generated
	 */
	void setPackageUri(String value);

	/**
	 * Returns the value of the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class Name</em>' attribute.
	 * @see #setClassName(String)
	 * @see de.ubt.ai1.supermod.mm.emffile.SuperModEMFFilePackage#getEMFClassRef_ClassName()
	 * @model
	 * @generated
	 */
	String getClassName();

	/**
	 * Sets the value of the '{@link de.ubt.ai1.supermod.mm.emffile.EMFClassRef#getClassName <em>Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class Name</em>' attribute.
	 * @see #getClassName()
	 * @generated
	 */
	void setClassName(String value);

} // EMFClassRef
