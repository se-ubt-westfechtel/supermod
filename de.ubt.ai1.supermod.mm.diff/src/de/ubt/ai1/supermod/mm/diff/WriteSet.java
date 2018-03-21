/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.mm.diff;

import de.ubt.ai1.supermod.mm.core.OptionBinding;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Write Set</b></em>'.
 * A write set is a subtype of {@link ProductDimensionDelta}, which describes a
 * change to a specific product space dimension under an <em>ambition</em>, which
 * is represented by an option binding. The ambition describes the set of versions
 * for which the change is visible.
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date 	2014-07-25
 * @see		OptionBinding
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai1.supermod.mm.diff.WriteSet#getAmbition <em>Ambition</em>}</li>
 * </ul>
 *
 * @see de.ubt.ai1.supermod.mm.diff.SuperModDiffPackage#getWriteSet()
 * @model
 * @generated
 */
public interface WriteSet extends ProductDimensionDelta {
	/**
	 * Returns the value of the '<em><b>Ambition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * The option binding under which the described change is visible.
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ambition</em>' containment reference.
	 * @see #setAmbition(OptionBinding)
	 * @see de.ubt.ai1.supermod.mm.diff.SuperModDiffPackage#getWriteSet_Ambition()
	 * @model containment="true"
	 * @generated
	 */
	OptionBinding getAmbition();

	/**
	 * Sets the value of the '{@link de.ubt.ai1.supermod.mm.diff.WriteSet#getAmbition <em>Ambition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ambition</em>' containment reference.
	 * @see #getAmbition()
	 * @generated
	 */
	void setAmbition(OptionBinding value);

} // WriteSet
