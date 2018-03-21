/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.mm.emffile.client;

import de.ubt.ai1.supermod.mm.client.ProductConflict;
import de.ubt.ai1.supermod.mm.emffile.EMFClassRef;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EMF Class Definition Conflict</b></em>'.
 * A class definition conflict occurs in case a class reference cannot be
 * resolved to a (versioned or unversioned) class.
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date 	2014-07-28
 * @see		EMFClassRef
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai1.supermod.mm.emffile.client.EMFClassDefinitionConflict#getAffectedClassRef <em>Affected Class Ref</em>}</li>
 * </ul>
 *
 * @see de.ubt.ai1.supermod.mm.emffile.client.SuperModEMFFileClientPackage#getEMFClassDefinitionConflict()
 * @model
 * @generated
 */
public interface EMFClassDefinitionConflict extends ProductConflict {
	/**
	 * Returns the value of the '<em><b>Affected Class Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * The class reference that cannot be resolved.
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Affected Class Ref</em>' reference.
	 * @see #setAffectedClassRef(EMFClassRef)
	 * @see de.ubt.ai1.supermod.mm.emffile.client.SuperModEMFFileClientPackage#getEMFClassDefinitionConflict_AffectedClassRef()
	 * @model
	 * @generated
	 */
	EMFClassRef getAffectedClassRef();

	/**
	 * Sets the value of the '{@link de.ubt.ai1.supermod.mm.emffile.client.EMFClassDefinitionConflict#getAffectedClassRef <em>Affected Class Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Affected Class Ref</em>' reference.
	 * @see #getAffectedClassRef()
	 * @generated
	 */
	void setAffectedClassRef(EMFClassRef value);

} // EMFClassDefinitionConflict
