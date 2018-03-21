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
 * A representation of the model object '<em><b>Conflict Set</b></em>'.
 * A conflict set groups several conflicts that have been detected during a single
 * validation procedure.
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
 *   <li>{@link de.ubt.ai1.supermod.mm.client.ConflictSet#getConflicts <em>Conflicts</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.client.ConflictSet#getSeverity <em>Severity</em>}</li>
 * </ul>
 *
 * @see de.ubt.ai1.supermod.mm.client.SuperModClientPackage#getConflictSet()
 * @model
 * @generated
 */
public interface ConflictSet extends EObject {
	/**
	 * Returns the value of the '<em><b>Conflicts</b></em>' containment reference list.
	 * The list contents are of type {@link de.ubt.ai1.supermod.mm.client.ProductConflict}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conflicts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conflicts</em>' containment reference list.
	 * @see de.ubt.ai1.supermod.mm.client.SuperModClientPackage#getConflictSet_Conflicts()
	 * @model containment="true"
	 * @generated
	 */
	EList<ProductConflict> getConflicts();

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
	 * @see de.ubt.ai1.supermod.mm.client.SuperModClientPackage#getConflictSet_Severity()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	Severity getSeverity();

} // ConflictSet
