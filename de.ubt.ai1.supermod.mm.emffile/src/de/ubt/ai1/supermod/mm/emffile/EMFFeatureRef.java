/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.mm.emffile;

import org.eclipse.emf.common.util.EList;

import de.ubt.ai1.supermod.mm.core.ProductSpaceElement;
import de.ubt.ai1.supermod.mm.list.VersionedList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EMF Feature Ref</b></em>'.
 * Base type for references to a structural feature of the (versioned or unversioned)
 * meta-model of the versioned object. For a feature, a set of values may be specified.
 * In the case of an ordered structural feature, the value order is versioned
 * additionally.
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
 *   <li>{@link de.ubt.ai1.supermod.mm.emffile.EMFFeatureRef#getValues <em>Values</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.emffile.EMFFeatureRef#getValueOrdering <em>Value Ordering</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.emffile.EMFFeatureRef#getOrderedValues <em>Ordered Values</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.emffile.EMFFeatureRef#getFeatureName <em>Feature Name</em>}</li>
 * </ul>
 *
 * @see de.ubt.ai1.supermod.mm.emffile.SuperModEMFFilePackage#getEMFFeatureRef()
 * @model
 * @generated
 */
public interface EMFFeatureRef extends ProductSpaceElement {
	/**
	 * Returns the value of the '<em><b>Values</b></em>' containment reference list.
	 * The list contents are of type {@link de.ubt.ai1.supermod.mm.emffile.EMFValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * Values which are assigned to this structural feature for the given object,
	 * which is accessible as the <code>eContainer</code> of this feature reference.
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values</em>' containment reference list.
	 * @see de.ubt.ai1.supermod.mm.emffile.SuperModEMFFilePackage#getEMFFeatureRef_Values()
	 * @model containment="true"
	 * @generated
	 */
	EList<EMFValue> getValues();

	/**
	 * Returns the value of the '<em><b>Value Ordering</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Ordering</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Ordering</em>' containment reference.
	 * @see #setValueOrdering(VersionedList)
	 * @see de.ubt.ai1.supermod.mm.emffile.SuperModEMFFilePackage#getEMFFeatureRef_ValueOrdering()
	 * @model containment="true"
	 * @generated
	 */
	VersionedList getValueOrdering();

	/**
	 * Sets the value of the '{@link de.ubt.ai1.supermod.mm.emffile.EMFFeatureRef#getValueOrdering <em>Value Ordering</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Ordering</em>' containment reference.
	 * @see #getValueOrdering()
	 * @generated
	 */
	void setValueOrdering(VersionedList value);

	/**
	 * Returns the value of the '<em><b>Ordered Values</b></em>' reference list.
	 * The list contents are of type {@link de.ubt.ai1.supermod.mm.emffile.EMFValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ordered Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ordered Values</em>' reference list.
	 * @see de.ubt.ai1.supermod.mm.emffile.SuperModEMFFilePackage#getEMFFeatureRef_OrderedValues()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<EMFValue> getOrderedValues();

	/**
	 * Returns the value of the '<em><b>Feature Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature Name</em>' attribute.
	 * @see #setFeatureName(String)
	 * @see de.ubt.ai1.supermod.mm.emffile.SuperModEMFFilePackage#getEMFFeatureRef_FeatureName()
	 * @model
	 * @generated
	 */
	String getFeatureName();

	/**
	 * Sets the value of the '{@link de.ubt.ai1.supermod.mm.emffile.EMFFeatureRef#getFeatureName <em>Feature Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature Name</em>' attribute.
	 * @see #getFeatureName()
	 * @generated
	 */
	void setFeatureName(String value);

} // EMFFeatureRef
