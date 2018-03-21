/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.mm.core;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Version Space Element</b></em>'.
 * A version space element is a higher-level representation of one or several rule
 * base elements. Version space elements are hierarchically organized and 
 * (transitively) contained in a specific version dimension.
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date 	2014-07-25
 * @see {@link VersionDimension}
 * @see {@link RuleBaseElement}
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai1.supermod.mm.core.VersionSpaceElement#getVersionDimension <em>Version Dimension</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.core.VersionSpaceElement#getVersionSpace <em>Version Space</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.core.VersionSpaceElement#getSuperVersionSpaceElement <em>Super Version Space Element</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.core.VersionSpaceElement#getSubVersionSpaceElements <em>Sub Version Space Elements</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.core.VersionSpaceElement#getAllSuperVersionSpaceElements <em>All Super Version Space Elements</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.core.VersionSpaceElement#getAllSubVersionSpaceElements <em>All Sub Version Space Elements</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.core.VersionSpaceElement#getCrossReferencedVersionSpaceElements <em>Cross Referenced Version Space Elements</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.core.VersionSpaceElement#getCrossReferencingVersionSpaceElements <em>Cross Referencing Version Space Elements</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.core.VersionSpaceElement#getLowLevelConcepts <em>Low Level Concepts</em>}</li>
 * </ul>
 *
 * @see de.ubt.ai1.supermod.mm.core.SuperModCorePackage#getVersionSpaceElement()
 * @model abstract="true"
 * @generated
 */
public interface VersionSpaceElement extends Element {
	/**
	 * Returns the value of the '<em><b>Version Dimension</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * The version dimension where this element is defined.
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version Dimension</em>' reference.
	 * @see de.ubt.ai1.supermod.mm.core.SuperModCorePackage#getVersionSpaceElement_VersionDimension()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	VersionDimension getVersionDimension();

	/**
	 * Returns the value of the '<em><b>Version Space</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * The version space where this element is defined.
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version Space</em>' reference.
	 * @see de.ubt.ai1.supermod.mm.core.SuperModCorePackage#getVersionSpaceElement_VersionSpace()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	VersionSpace getVersionSpace();

	/**
	 * Returns the value of the '<em><b>Super Version Space Element</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link de.ubt.ai1.supermod.mm.core.VersionSpaceElement#getSubVersionSpaceElements <em>Sub Version Space Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * The version space element that directly contains this element.
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super Version Space Element</em>' reference.
	 * @see de.ubt.ai1.supermod.mm.core.SuperModCorePackage#getVersionSpaceElement_SuperVersionSpaceElement()
	 * @see de.ubt.ai1.supermod.mm.core.VersionSpaceElement#getSubVersionSpaceElements
	 * @model opposite="subVersionSpaceElements" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	VersionSpaceElement getSuperVersionSpaceElement();

	/**
	 * Returns the value of the '<em><b>Sub Version Space Elements</b></em>' reference list.
	 * The list contents are of type {@link de.ubt.ai1.supermod.mm.core.VersionSpaceElement}.
	 * It is bidirectional and its opposite is '{@link de.ubt.ai1.supermod.mm.core.VersionSpaceElement#getSuperVersionSpaceElement <em>Super Version Space Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * Version space elements which are directly contained in this element.
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Version Space Elements</em>' reference list.
	 * @see de.ubt.ai1.supermod.mm.core.SuperModCorePackage#getVersionSpaceElement_SubVersionSpaceElements()
	 * @see de.ubt.ai1.supermod.mm.core.VersionSpaceElement#getSuperVersionSpaceElement
	 * @model opposite="superVersionSpaceElement" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<VersionSpaceElement> getSubVersionSpaceElements();

	/**
	 * Returns the value of the '<em><b>All Super Version Space Elements</b></em>' reference list.
	 * The list contents are of type {@link de.ubt.ai1.supermod.mm.core.VersionSpaceElement}.
	 * It is bidirectional and its opposite is '{@link de.ubt.ai1.supermod.mm.core.VersionSpaceElement#getAllSubVersionSpaceElements <em>All Sub Version Space Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * The transitive closure over the super version space elements.
	 * @see #getSuperVersionSpaceElement()
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All Super Version Space Elements</em>' reference list.
	 * @see de.ubt.ai1.supermod.mm.core.SuperModCorePackage#getVersionSpaceElement_AllSuperVersionSpaceElements()
	 * @see de.ubt.ai1.supermod.mm.core.VersionSpaceElement#getAllSubVersionSpaceElements
	 * @model opposite="allSubVersionSpaceElements" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<VersionSpaceElement> getAllSuperVersionSpaceElements();

	/**
	 * Returns the value of the '<em><b>All Sub Version Space Elements</b></em>' reference list.
	 * The list contents are of type {@link de.ubt.ai1.supermod.mm.core.VersionSpaceElement}.
	 * It is bidirectional and its opposite is '{@link de.ubt.ai1.supermod.mm.core.VersionSpaceElement#getAllSuperVersionSpaceElements <em>All Super Version Space Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * The transitive closure over the sub version space elements.
	 * @see #getSubVersionSpaceElements()
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All Sub Version Space Elements</em>' reference list.
	 * @see de.ubt.ai1.supermod.mm.core.SuperModCorePackage#getVersionSpaceElement_AllSubVersionSpaceElements()
	 * @see de.ubt.ai1.supermod.mm.core.VersionSpaceElement#getAllSuperVersionSpaceElements
	 * @model opposite="allSuperVersionSpaceElements" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<VersionSpaceElement> getAllSubVersionSpaceElements();

	/**
	 * Returns the value of the '<em><b>Cross Referenced Version Space Elements</b></em>' reference list.
	 * The list contents are of type {@link de.ubt.ai1.supermod.mm.core.VersionSpaceElement}.
	 * It is bidirectional and its opposite is '{@link de.ubt.ai1.supermod.mm.core.VersionSpaceElement#getCrossReferencingVersionSpaceElements <em>Cross Referencing Version Space Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * Version space element which are connected to this element by a non-containment
	 * cross-link.
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cross Referenced Version Space Elements</em>' reference list.
	 * @see de.ubt.ai1.supermod.mm.core.SuperModCorePackage#getVersionSpaceElement_CrossReferencedVersionSpaceElements()
	 * @see de.ubt.ai1.supermod.mm.core.VersionSpaceElement#getCrossReferencingVersionSpaceElements
	 * @model opposite="crossReferencingVersionSpaceElements" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<VersionSpaceElement> getCrossReferencedVersionSpaceElements();

	/**
	 * Returns the value of the '<em><b>Cross Referencing Version Space Elements</b></em>' reference list.
	 * The list contents are of type {@link de.ubt.ai1.supermod.mm.core.VersionSpaceElement}.
	 * It is bidirectional and its opposite is '{@link de.ubt.ai1.supermod.mm.core.VersionSpaceElement#getCrossReferencedVersionSpaceElements <em>Cross Referenced Version Space Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cross Referencing Version Space Elements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cross Referencing Version Space Elements</em>' reference list.
	 * @see de.ubt.ai1.supermod.mm.core.SuperModCorePackage#getVersionSpaceElement_CrossReferencingVersionSpaceElements()
	 * @see de.ubt.ai1.supermod.mm.core.VersionSpaceElement#getCrossReferencedVersionSpaceElements
	 * @model opposite="crossReferencedVersionSpaceElements" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<VersionSpaceElement> getCrossReferencingVersionSpaceElements();

	/**
	 * Returns the value of the '<em><b>Low Level Concepts</b></em>' reference list.
	 * The list contents are of type {@link de.ubt.ai1.supermod.mm.core.RuleBaseElement}.
	 * It is bidirectional and its opposite is '{@link de.ubt.ai1.supermod.mm.core.RuleBaseElement#getHighLevelConcept <em>High Level Concept</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * Low-level concepts of the rule base (i.e., options, preferences, default
	 * bindings and invariants) which represent this version space element at a
	 * lower level of abstraction.
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Low Level Concepts</em>' reference list.
	 * @see de.ubt.ai1.supermod.mm.core.SuperModCorePackage#getVersionSpaceElement_LowLevelConcepts()
	 * @see de.ubt.ai1.supermod.mm.core.RuleBaseElement#getHighLevelConcept
	 * @model opposite="highLevelConcept" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<RuleBaseElement> getLowLevelConcepts();

} // VersionSpaceElement
