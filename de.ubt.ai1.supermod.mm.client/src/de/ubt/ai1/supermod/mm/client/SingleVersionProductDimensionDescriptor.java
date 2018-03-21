/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.mm.client;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Single Version Product Dimension Descriptor</b></em>'.
 * Defines a handle to elements of the local workspace in a specific version
 * dimension. Properties will be added by sub-types.
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date 	2014-07-28 
 * @see 	SingleVersionProductSpaceDescriptor
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai1.supermod.mm.client.SingleVersionProductDimensionDescriptor#getDimensionName <em>Dimension Name</em>}</li>
 * </ul>
 *
 * @see de.ubt.ai1.supermod.mm.client.SuperModClientPackage#getSingleVersionProductDimensionDescriptor()
 * @model abstract="true"
 * @generated
 */
public interface SingleVersionProductDimensionDescriptor extends EObject {

	/**
	 * Returns the value of the '<em><b>Dimension Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * The name of the product space dimension this descriptor refers to.
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dimension Name</em>' attribute.
	 * @see #setDimensionName(String)
	 * @see de.ubt.ai1.supermod.mm.client.SuperModClientPackage#getSingleVersionProductDimensionDescriptor_DimensionName()
	 * @model
	 * @generated
	 */
	String getDimensionName();

	/**
	 * Sets the value of the '{@link de.ubt.ai1.supermod.mm.client.SingleVersionProductDimensionDescriptor#getDimensionName <em>Dimension Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dimension Name</em>' attribute.
	 * @see #getDimensionName()
	 * @generated
	 */
	void setDimensionName(String value);

	/**
	 * <!-- begin-user-doc -->
	 * Checks whether the dimension has been locally modified (optional operation).
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isModified();

	/**
	 * <!-- begin-user-doc -->
	 * Sets the modification state of the dimension (optional operation).
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setModified(boolean modified);
} // SingleVersionProductDimensionDescriptor
