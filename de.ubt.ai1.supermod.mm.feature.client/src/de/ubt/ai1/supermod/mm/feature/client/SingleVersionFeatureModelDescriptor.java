/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.mm.feature.client;

import de.ubt.ai1.supermod.mm.client.SingleVersionProductDimensionDescriptor;
import de.ubt.ai1.supermod.mm.feature.FeatureModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Single Version Feature Model Descriptor</b></em>'.
 * A single-version representation of a feature model. Represented by a link
 * to the intrinsic multi-variant representation.
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date 	2014-11-17
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai1.supermod.mm.feature.client.SingleVersionFeatureModelDescriptor#getFeatureModel <em>Feature Model</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.feature.client.SingleVersionFeatureModelDescriptor#isModified <em>Modified</em>}</li>
 * </ul>
 *
 * @see de.ubt.ai1.supermod.mm.feature.client.SuperModFeatureClientPackage#getSingleVersionFeatureModelDescriptor()
 * @model
 * @generated
 */
public interface SingleVersionFeatureModelDescriptor extends SingleVersionProductDimensionDescriptor {
	/**
	 * Returns the value of the '<em><b>Feature Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature Model</em>' containment reference.
	 * @see #setFeatureModel(FeatureModel)
	 * @see de.ubt.ai1.supermod.mm.feature.client.SuperModFeatureClientPackage#getSingleVersionFeatureModelDescriptor_FeatureModel()
	 * @model containment="true"
	 * @generated
	 */
	FeatureModel getFeatureModel();

	/**
	 * Sets the value of the '{@link de.ubt.ai1.supermod.mm.feature.client.SingleVersionFeatureModelDescriptor#getFeatureModel <em>Feature Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature Model</em>' containment reference.
	 * @see #getFeatureModel()
	 * @generated
	 */
	void setFeatureModel(FeatureModel value);

	/**
	 * Returns the value of the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modified</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modified</em>' attribute.
	 * @see #setModified(boolean)
	 * @see de.ubt.ai1.supermod.mm.feature.client.SuperModFeatureClientPackage#getSingleVersionFeatureModelDescriptor_Modified()
	 * @model
	 * @generated
	 */
	boolean isModified();

	/**
	 * Sets the value of the '{@link de.ubt.ai1.supermod.mm.feature.client.SingleVersionFeatureModelDescriptor#isModified <em>Modified</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modified</em>' attribute.
	 * @see #isModified()
	 * @generated
	 */
	void setModified(boolean value);

} // SingleVersionFeatureModelDescriptor
