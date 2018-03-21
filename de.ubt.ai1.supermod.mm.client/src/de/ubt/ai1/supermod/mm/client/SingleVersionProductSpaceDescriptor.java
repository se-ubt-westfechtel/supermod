/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.mm.client;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Single Version Product Space Descriptor</b></em>'.
 * Defines a handle to elements of the local workspace and is divided up into
 * multiple dimension descriptors.
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date 	2014-07-28 
 * @see 	SingleVersionProductDimensionDescriptor
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai1.supermod.mm.client.SingleVersionProductSpaceDescriptor#getDimensionDescriptors <em>Dimension Descriptors</em>}</li>
 * </ul>
 *
 * @see de.ubt.ai1.supermod.mm.client.SuperModClientPackage#getSingleVersionProductSpaceDescriptor()
 * @model
 * @generated
 */
public interface SingleVersionProductSpaceDescriptor extends EObject {
	/**
	 * Returns the value of the '<em><b>Dimension Descriptors</b></em>' reference list.
	 * The list contents are of type {@link de.ubt.ai1.supermod.mm.client.SingleVersionProductDimensionDescriptor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * The contained dimension descriptors.
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dimension Descriptors</em>' reference list.
	 * @see de.ubt.ai1.supermod.mm.client.SuperModClientPackage#getSingleVersionProductSpaceDescriptor_DimensionDescriptors()
	 * @model
	 * @generated
	 */
	EList<SingleVersionProductDimensionDescriptor> getDimensionDescriptors();

	/**
	 * <!-- begin-user-doc -->
	 * Checks the modification state of the descriptor (optional operation).
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isModified();

	/**
	 * <!-- begin-user-doc -->
	 * Sets the modification state of the descriptor (optional operation).
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setModified(boolean modified);

} // SingleVersionProductSpaceDescriptor
