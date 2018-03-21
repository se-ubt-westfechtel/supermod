/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.mm.emffile;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EMF Attribute Value</b></em>'.
 * An attribute value consists of a string literal describing the value of a primitive
 * data type.
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
 *   <li>{@link de.ubt.ai1.supermod.mm.emffile.EMFAttributeValue#getLiteral <em>Literal</em>}</li>
 * </ul>
 *
 * @see de.ubt.ai1.supermod.mm.emffile.SuperModEMFFilePackage#getEMFAttributeValue()
 * @model
 * @generated
 */
public interface EMFAttributeValue extends EMFValue {
	/**
	 * Returns the value of the '<em><b>Literal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * The string representation of the attribute value.
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Literal</em>' attribute.
	 * @see #setLiteral(String)
	 * @see de.ubt.ai1.supermod.mm.emffile.SuperModEMFFilePackage#getEMFAttributeValue_Literal()
	 * @model
	 * @generated
	 */
	String getLiteral();

	/**
	 * Sets the value of the '{@link de.ubt.ai1.supermod.mm.emffile.EMFAttributeValue#getLiteral <em>Literal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Literal</em>' attribute.
	 * @see #getLiteral()
	 * @generated
	 */
	void setLiteral(String value);

} // EMFAttributeValue
