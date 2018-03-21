/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.mm.core;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule Base</b></em>'.
 * The version space of a SuperMod repository defines rules for version selection,
 * validation and completion. A version space is divided up into several version
 * dimensions, each representing a versioning aspect at a higher level of abstraction.
 * At its low-level representation, a version space consists of rule base elements, being
 * options, invariants, preferences and default bindings.
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
 *   <li>{@link de.ubt.ai1.supermod.mm.core.VersionSpace#getDimensions <em>Dimensions</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.core.VersionSpace#getAllOptions <em>All Options</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.core.VersionSpace#getAllInvariants <em>All Invariants</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.core.VersionSpace#getAllPreferences <em>All Preferences</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.core.VersionSpace#getAllDefaultBindings <em>All Default Bindings</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.core.VersionSpace#getRepository <em>Repository</em>}</li>
 * </ul>
 *
 * @see de.ubt.ai1.supermod.mm.core.SuperModCorePackage#getVersionSpace()
 * @model
 * @generated
 */
public interface VersionSpace extends EObject {
	/**
	 * Returns the value of the '<em><b>Dimensions</b></em>' reference list.
	 * The list contents are of type {@link de.ubt.ai1.supermod.mm.core.VersionDimension}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * The dimensions this version space is divided up into.
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dimensions</em>' reference list.
	 * @see de.ubt.ai1.supermod.mm.core.SuperModCorePackage#getVersionSpace_Dimensions()
	 * @model
	 * @generated
	 */
	EList<VersionDimension> getDimensions();

	/**
	 * Returns the value of the '<em><b>All Options</b></em>' reference list.
	 * The list contents are of type {@link de.ubt.ai1.supermod.mm.core.Option}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * The union of options defined by all dimensions.
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All Options</em>' reference list.
	 * @see de.ubt.ai1.supermod.mm.core.SuperModCorePackage#getVersionSpace_AllOptions()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<Option> getAllOptions();

	/**
	 * Returns the value of the '<em><b>All Invariants</b></em>' reference list.
	 * The list contents are of type {@link de.ubt.ai1.supermod.mm.core.Invariant}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * The union of invariants defined by all dimensions.
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All Invariants</em>' reference list.
	 * @see de.ubt.ai1.supermod.mm.core.SuperModCorePackage#getVersionSpace_AllInvariants()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<Invariant> getAllInvariants();

	/**
	 * Returns the value of the '<em><b>All Preferences</b></em>' reference list.
	 * The list contents are of type {@link de.ubt.ai1.supermod.mm.core.Preference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * The union of preferences defined by all dimensions.
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All Preferences</em>' reference list.
	 * @see de.ubt.ai1.supermod.mm.core.SuperModCorePackage#getVersionSpace_AllPreferences()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<Preference> getAllPreferences();

	/**
	 * Returns the value of the '<em><b>All Default Bindings</b></em>' reference list.
	 * The list contents are of type {@link de.ubt.ai1.supermod.mm.core.DefaultBinding}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * The union of default bindings defined by all dimensions.
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All Default Bindings</em>' reference list.
	 * @see de.ubt.ai1.supermod.mm.core.SuperModCorePackage#getVersionSpace_AllDefaultBindings()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<DefaultBinding> getAllDefaultBindings();

	/**
	 * Returns the value of the '<em><b>Repository</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.ubt.ai1.supermod.mm.core.Repository#getVersionSpace <em>Version Space</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * The repository whose product space is versioned with respect to this
	 * version space.
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repository</em>' container reference.
	 * @see #setRepository(Repository)
	 * @see de.ubt.ai1.supermod.mm.core.SuperModCorePackage#getVersionSpace_Repository()
	 * @see de.ubt.ai1.supermod.mm.core.Repository#getVersionSpace
	 * @model opposite="versionSpace" transient="false"
	 * @generated
	 */
	Repository getRepository();

	/**
	 * Sets the value of the '{@link de.ubt.ai1.supermod.mm.core.VersionSpace#getRepository <em>Repository</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repository</em>' container reference.
	 * @see #getRepository()
	 * @generated
	 */
	void setRepository(Repository value);

	/**
	 * <!-- begin-user-doc -->
	 * Performs a conjunction over the validation results of all dimensions
	 * with respect to the specified option binding.
	 * @param 	optionBinding
	 * @return  overall validation result. A value of
	 * 			{@link Tristate#TRUE} denotes <em>strong consistency</em>, whereas
	 * 			{@link Tristate#UNKNOWN} denotes <em>weak consistency</em>.
	 * @see		{@link VersionDimension#validate(OptionBinding)}
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Tristate validate(OptionBinding optionBinding);

	/**
	 * <!-- begin-user-doc -->
	 * Checks whether the specified option binding is complete with respect to
	 * all version dimensions.
	 * @param 	optionBinding
	 * @return  whether option binding is complete.
	 * @see		{@link VersionDimension#isComplete(OptionBinding)}
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean isComplete(OptionBinding optionBinding);

	/**
	 * <!-- begin-user-doc -->
	 * Checks whether there is an option binding which contains the specified
	 * premise that satisfies the rule base of this version dimension.
	 * @param 	premise option binding that specifies predefined option
	 * 			selection states.
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean isSatisfiable(OptionBinding premise);

	/**
	 * <!-- begin-user-doc -->
	 * Applies the preferences of all dimensions to the specified option binding.
	 * @param 	optionBinding
	 * @return  option binding with all preferences applied.
	 * @see		{@link VersionDimension#applyPreferences(OptionBinding)}
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	OptionBinding applyAllPreferences(OptionBinding optionBinding);

	/**
	 * <!-- begin-user-doc -->
	 * Applies the default bindings of all dimensions to the specified option binding.
	 * @param 	optionBinding
	 * @return  option binding with all default bindings applied.
	 * @see		{@link VersionDimension#applyDefaults(OptionBinding)}
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	OptionBinding applyAllDefaults(OptionBinding optionBinding);

	/**
	 * <!-- begin-user-doc -->
	 * Applies the all preferences and then all default bindings to the specified 
	 * option binding.
	 * @param 	optionBinding
	 * @return  option binding with all completions applied.
	 * @see		#applyAllPreferences(OptionBinding)
	 * @see		#applyAllDefaults(OptionBinding)
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	OptionBinding applyAllCompletions(OptionBinding optionBinding);

	/**
	 * <!-- begin-user-doc -->
	 * Finds an option with specified id in any version dimension.
	 * @param 	id
	 * @return 	the corresponding option
	 * @see 	VersionDimension#findElement(EList)
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Option getOption(String id);

} // VersionSpace
