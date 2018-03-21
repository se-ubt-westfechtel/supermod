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
 * A representation of the model object '<em><b>Version Dimension</b></em>'.
 * A version dimension represents a versioning aspect at a higher level of abstraction.
 * At its low-level representation, a version dimension consists of rule base elements, being
 * options, invariants, preferences and default bindings. Several version dimensions make
 * up the product space of a repository.
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date 	2014-07-25
 * @see {@link VersionSpace}
 * @see {@link RuleBaseElement}
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai1.supermod.mm.core.VersionDimension#getOptions <em>Options</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.core.VersionDimension#getInvariants <em>Invariants</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.core.VersionDimension#getPreferences <em>Preferences</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.core.VersionDimension#getDefaultBindings <em>Default Bindings</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.core.VersionDimension#getRootVersionSpaceElements <em>Root Version Space Elements</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.core.VersionDimension#getAllVersionSpaceElements <em>All Version Space Elements</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.core.VersionDimension#getVersionSpace <em>Version Space</em>}</li>
 * </ul>
 *
 * @see de.ubt.ai1.supermod.mm.core.SuperModCorePackage#getVersionDimension()
 * @model abstract="true"
 * @generated
 */
public interface VersionDimension extends Dimension {
	/**
	 * Returns the value of the '<em><b>Options</b></em>' reference list.
	 * The list contents are of type {@link de.ubt.ai1.supermod.mm.core.Option}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * All options derived from the high-level representation.
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Options</em>' reference list.
	 * @see de.ubt.ai1.supermod.mm.core.SuperModCorePackage#getVersionDimension_Options()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<Option> getOptions();

	/**
	 * Returns the value of the '<em><b>Invariants</b></em>' reference list.
	 * The list contents are of type {@link de.ubt.ai1.supermod.mm.core.Invariant}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * All invariants derived from the high-level representation.
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invariants</em>' reference list.
	 * @see de.ubt.ai1.supermod.mm.core.SuperModCorePackage#getVersionDimension_Invariants()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<Invariant> getInvariants();

	/**
	 * Returns the value of the '<em><b>Preferences</b></em>' reference list.
	 * The list contents are of type {@link de.ubt.ai1.supermod.mm.core.Preference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * All preferences derived from the high-level representation.
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Preferences</em>' reference list.
	 * @see de.ubt.ai1.supermod.mm.core.SuperModCorePackage#getVersionDimension_Preferences()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<Preference> getPreferences();

	/**
	 * Returns the value of the '<em><b>Default Bindings</b></em>' reference list.
	 * The list contents are of type {@link de.ubt.ai1.supermod.mm.core.DefaultBinding}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * All default bindings derived from the high-level representation.
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Bindings</em>' reference list.
	 * @see de.ubt.ai1.supermod.mm.core.SuperModCorePackage#getVersionDimension_DefaultBindings()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<DefaultBinding> getDefaultBindings();

	/**
	 * Returns the value of the '<em><b>Root Version Space Elements</b></em>' reference list.
	 * The list contents are of type {@link de.ubt.ai1.supermod.mm.core.VersionSpaceElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * Version space elements which are directly contained as the roots of this dimension.
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root Version Space Elements</em>' reference list.
	 * @see de.ubt.ai1.supermod.mm.core.SuperModCorePackage#getVersionDimension_RootVersionSpaceElements()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<VersionSpaceElement> getRootVersionSpaceElements();

	/**
	 * Returns the value of the '<em><b>All Version Space Elements</b></em>' reference list.
	 * The list contents are of type {@link de.ubt.ai1.supermod.mm.core.VersionSpaceElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * The transitive closure over all root version space elements and their contents.
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All Version Space Elements</em>' reference list.
	 * @see de.ubt.ai1.supermod.mm.core.SuperModCorePackage#getVersionDimension_AllVersionSpaceElements()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<VersionSpaceElement> getAllVersionSpaceElements();

	/**
	 * Returns the value of the '<em><b>Version Space</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * The superordinate version space which contains this dimension.
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version Space</em>' reference.
	 * @see de.ubt.ai1.supermod.mm.core.SuperModCorePackage#getVersionDimension_VersionSpace()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	VersionSpace getVersionSpace();

	/**
	 * <!-- begin-user-doc -->
	 * Validates an option binding with respect to the invariants defined within
	 * this version dimension. Performs an implicit conjunction of the evaluation
	 * result of all invariants with the specified option binding.
	 * @param 	optionBinding the option binding to validate invariants against.
	 * @return 	a tristate representing the evaluation result. A value of
	 * 			{@link Tristate#TRUE} denotes <em>strong consistency</em>, whereas
	 * 			{@link Tristate#UNKNOWN} denotes <em>weak consistency</em>.
	 * @see 	#getInvariants()
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Tristate validate(OptionBinding optionBinding);

	/**
	 * <!-- begin-user-doc -->
	 * Checks whether an option binding is <em>complete</em> with respect to this
	 * version dimension, i.e., all necessary options are bound.
	 * @param 	optionBinding the option binding to check for completeness.
	 * @return	whether a value different from {@link Tristate#UNKNOWN} is assigned
	 * 			to each option defined in this dimension in the given optionBinding.
 	 * @see 	#getOptions()
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
	 * Applies the preferences specified by this version dimension. In case the
	 * option referenced by one of the preferences is unbound in the given option
	 * binding, its associated preference expression is evaluated, and the result
	 * is bound in the returned copy of the option binding.
	 * @param	optionBinding the option binding to apply preferences to.
	 * @return	a copy of the specified option binding, where preferences have
	 * 			been applied.
	 * @see		#getPreferences()
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	OptionBinding applyPreferences(OptionBinding optionBinding);

	/**
	 * <!-- begin-user-doc -->
	 * Applies the default bindings specified by this version dimension. In case 
	 * the option referenced by one of the default bindings is unbound in the given 
	 * option binding, its associated tristate is applied to the returned copy of
	 * the option binding.
	 * @param	optionBinding the option binding to apply default bindings to.
	 * @return	a copy of the specified option binding, where default bindings have
	 * 			been applied.
	 * @see		#getDefaultBindings()
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	OptionBinding applyDefaults(OptionBinding optionBinding);

	/**
	 * <!-- begin-user-doc -->
	 * Applies preferences and then default bindings to the specified option
	 * binding and returns a completed binding.
	 * @param	optionBinding the option binding to apply preferences and default
	 * 			bindings to.
	 * @return	a copy of the specified option binding, where preferences and
	 * 			default bindings have been applied.
	 * @see 	#applyPreferences(OptionBinding)
	 * @see		#applyDefaults(OptionBinding)
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	OptionBinding applyCompletions(OptionBinding optionBinding);

	/**
	 * <!-- begin-user-doc -->
	 * Returns the option with the specified id, if present in the current
	 * version dimension.
	 * @param 	id the id to look up the option for
	 * @return 	an option with specified id, or <code>null</code> if no such
	 * 			option exists.
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Option getOption(String id);

} // VersionDimension
