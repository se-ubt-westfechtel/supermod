/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.mm.core;

import org.eclipse.emf.ecore.EObject;



/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule Base Element</b></em>'.
 * The rule base of a SuperMod repository is considered as the entirety of all
 * low-level concepts occurring in the version space. Rule base elements have been
 * initially developed in the Uniform Version Model (UVM). They are divided into
 * options, invariants, preferences, and default bindings. This base interface
 * summarizes properties all rule base elements have in common, being a unique
 * identifier, a version dimension and an optional reference to a higher level
 * concept (e.g., a revision, or a feature constraint).
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date 	2014-07-25
 * @see {@link VersionSpace}
 * @see {@link VersionDimension}
 * @see {@link Option}
 * @see {@link Invariant}
 * @see {@link Preference}
 * @see {@link DefaultBinding}
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai1.supermod.mm.core.RuleBaseElement#getName <em>Name</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.core.RuleBaseElement#getDimension <em>Dimension</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.core.RuleBaseElement#getHighLevelConcept <em>High Level Concept</em>}</li>
 * </ul>
 *
 * @see de.ubt.ai1.supermod.mm.core.SuperModCorePackage#getRuleBaseElement()
 * @model abstract="true"
 * @generated
 */
public interface RuleBaseElement extends EObject {

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.ubt.ai1.supermod.mm.core.SuperModCorePackage#getRuleBaseElement_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.ubt.ai1.supermod.mm.core.RuleBaseElement#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Dimension</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * The version dimension where this rule base element is defined.
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dimension</em>' reference.
	 * @see de.ubt.ai1.supermod.mm.core.SuperModCorePackage#getRuleBaseElement_Dimension()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	VersionDimension getDimension();

	/**
	 * Returns the value of the '<em><b>High Level Concept</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link de.ubt.ai1.supermod.mm.core.VersionSpaceElement#getLowLevelConcepts <em>Low Level Concepts</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * A higher-level abstraction of the current rule base element that describes
	 * this rule base element in a user-friendly way. E.g., a revision.
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>High Level Concept</em>' reference.
	 * @see de.ubt.ai1.supermod.mm.core.SuperModCorePackage#getRuleBaseElement_HighLevelConcept()
	 * @see de.ubt.ai1.supermod.mm.core.VersionSpaceElement#getLowLevelConcepts
	 * @model opposite="lowLevelConcepts" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	VersionSpaceElement getHighLevelConcept();
} // RuleBaseElement
