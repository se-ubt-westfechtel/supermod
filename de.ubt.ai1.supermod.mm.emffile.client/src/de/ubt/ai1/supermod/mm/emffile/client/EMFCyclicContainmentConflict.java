/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.mm.emffile.client;

import org.eclipse.emf.common.util.EList;

import de.ubt.ai1.supermod.mm.client.ProductConflict;
import de.ubt.ai1.supermod.mm.emffile.EMFObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EMF Cyclic Containment Conflict</b></em>'.
 * A cyclic containment conflict occurs in case an EMF model contains a
 * containment cycle between several object such there is an object which
 * contains itself.
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date 	2014-07-28
 * @see		EMFObject
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai1.supermod.mm.emffile.client.EMFCyclicContainmentConflict#getAffectedObjects <em>Affected Objects</em>}</li>
 * </ul>
 *
 * @see de.ubt.ai1.supermod.mm.emffile.client.SuperModEMFFileClientPackage#getEMFCyclicContainmentConflict()
 * @model
 * @generated
 */
public interface EMFCyclicContainmentConflict extends ProductConflict {
	/**
	 * Returns the value of the '<em><b>Affected Objects</b></em>' reference list.
	 * The list contents are of type {@link de.ubt.ai1.supermod.mm.emffile.EMFObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * The set of EMF objects which are part of the containment cycles.
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Affected Objects</em>' reference list.
	 * @see de.ubt.ai1.supermod.mm.emffile.client.SuperModEMFFileClientPackage#getEMFCyclicContainmentConflict_AffectedObjects()
	 * @model
	 * @generated
	 */
	EList<EMFObject> getAffectedObjects();

} // EMFCyclicContainmentConflict
