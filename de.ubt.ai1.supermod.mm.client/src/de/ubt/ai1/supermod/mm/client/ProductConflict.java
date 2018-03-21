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
import de.ubt.ai1.supermod.mm.core.ProductSpaceElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product Conflict</b></em>'.
 * A conflict which refers to a specific location in the product space, where a
 * well-formedness constrained is violated.
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
 *   <li>{@link de.ubt.ai1.supermod.mm.client.ProductConflict#getAffectedProductSpaceElements <em>Affected Product Space Elements</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.client.ProductConflict#getSeverity <em>Severity</em>}</li>
 * </ul>
 *
 * @see de.ubt.ai1.supermod.mm.client.SuperModClientPackage#getProductConflict()
 * @model abstract="true"
 * @generated
 */
public interface ProductConflict extends EObject {
	/**
	 * Returns the value of the '<em><b>Affected Product Space Elements</b></em>' reference list.
	 * The list contents are of type {@link de.ubt.ai1.supermod.mm.core.ProductSpaceElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * Product space elements which are involved in this conflict.
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Affected Product Space Elements</em>' reference list.
	 * @see de.ubt.ai1.supermod.mm.client.SuperModClientPackage#getProductConflict_AffectedProductSpaceElements()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<ProductSpaceElement> getAffectedProductSpaceElements();

	/**
	 * Returns the value of the '<em><b>Severity</b></em>' attribute.
	 * The literals are from the enumeration {@link de.ubt.ai1.supermod.mm.client.Severity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Severity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Severity</em>' attribute.
	 * @see de.ubt.ai1.supermod.mm.client.Severity
	 * @see de.ubt.ai1.supermod.mm.client.SuperModClientPackage#getProductConflict_Severity()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	Severity getSeverity();

} // ProductConflict
