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
import de.ubt.ai1.supermod.mm.core.UUIDElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EMF Object</b></em>'.
 * A multi-variant representation of an instance of an arbitrary <em>EClass</em>.
 * The link to the class is realized by a (versioned or unversioned) class
 * reference. For each structural feature specified in the class, this EMF
 * object defines a set of structural feature values by feature references.
 * Each EMF object has a unique UUID, which is different from the UUID used
 * in the extrinsic XMI representation.
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date 	2014-07-28
 * @see		EMFClassRef
 * @see		EMFFeatureRef
 * @see		EMFValue
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai1.supermod.mm.emffile.EMFObject#getClassRefs <em>Class Refs</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.emffile.EMFObject#getFeatureRefs <em>Feature Refs</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.emffile.EMFObject#getTargetingRefVals <em>Targeting Ref Vals</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.emffile.EMFObject#getTargetingContainmentRefVals <em>Targeting Containment Ref Vals</em>}</li>
 * </ul>
 *
 * @see de.ubt.ai1.supermod.mm.emffile.SuperModEMFFilePackage#getEMFObject()
 * @model
 * @generated
 */
public interface EMFObject extends ProductSpaceElement, UUIDElement {
	/**
	 * Returns the value of the '<em><b>Class Refs</b></em>' containment reference list.
	 * The list contents are of type {@link de.ubt.ai1.supermod.mm.emffile.EMFClassRef}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * References to classes this object is an instance of. In a single-version product,
	 * there must be exactly one class reference defined.
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class Refs</em>' containment reference list.
	 * @see de.ubt.ai1.supermod.mm.emffile.SuperModEMFFilePackage#getEMFObject_ClassRefs()
	 * @model containment="true"
	 * @generated
	 */
	EList<EMFClassRef> getClassRefs();

	/**
	 * Returns the value of the '<em><b>Feature Refs</b></em>' containment reference list.
	 * The list contents are of type {@link de.ubt.ai1.supermod.mm.emffile.EMFFeatureRef}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * References to features this object defines values for.
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature Refs</em>' containment reference list.
	 * @see de.ubt.ai1.supermod.mm.emffile.SuperModEMFFilePackage#getEMFObject_FeatureRefs()
	 * @model containment="true"
	 * @generated
	 */
	EList<EMFFeatureRef> getFeatureRefs();

	/**
	 * Returns the value of the '<em><b>Targeting Ref Vals</b></em>' reference list.
	 * The list contents are of type {@link de.ubt.ai1.supermod.mm.emffile.EMFInternalReferenceValue}.
	 * It is bidirectional and its opposite is '{@link de.ubt.ai1.supermod.mm.emffile.EMFInternalReferenceValue#getReferencedObject <em>Referenced Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * Applied occurrences of this object within different structural features
	 * of different objects.
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Targeting Ref Vals</em>' reference list.
	 * @see de.ubt.ai1.supermod.mm.emffile.SuperModEMFFilePackage#getEMFObject_TargetingRefVals()
	 * @see de.ubt.ai1.supermod.mm.emffile.EMFInternalReferenceValue#getReferencedObject
	 * @model opposite="referencedObject" resolveProxies="false"
	 * @generated
	 */
	EList<EMFInternalReferenceValue> getTargetingRefVals();

	/**
	 * Returns the value of the '<em><b>Targeting Containment Ref Vals</b></em>' reference list.
	 * The list contents are of type {@link de.ubt.ai1.supermod.mm.emffile.EMFContainmentReferenceValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * The subset of 6{@code #getTargetingRefVals()} which refers to containment
	 * references.
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Targeting Containment Ref Vals</em>' reference list.
	 * @see de.ubt.ai1.supermod.mm.emffile.SuperModEMFFilePackage#getEMFObject_TargetingContainmentRefVals()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<EMFContainmentReferenceValue> getTargetingContainmentRefVals();

} // EMFObject
