/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.mm.change;

import de.ubt.ai1.supermod.mm.core.Invariant;
import de.ubt.ai1.supermod.mm.core.Option;
import de.ubt.ai1.supermod.mm.core.OptionBinding;
import de.ubt.ai1.supermod.mm.core.OptionExpr;
import de.ubt.ai1.supermod.mm.core.Preference;
import de.ubt.ai1.supermod.mm.core.ProductDimension;
import de.ubt.ai1.supermod.mm.core.UUIDElement;
import de.ubt.ai1.supermod.mm.core.VersionSpaceElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Change</b></em>'.
 * A change represents an (already applied) modification to a specific product
 * space dimension. It introduces a <em>change option</em> to the low-level
 * rule base as well as several additional rule base elements. Each change
 * defines an <em>ambition</em>, the set of versions where the change is
 * visible. When using the change space, only change options should occur 
 * within the option expressions of product space elements' visibilities.
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
 *   <li>{@link de.ubt.ai1.supermod.mm.change.Change#getChangeOption <em>Change Option</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.change.Change#getChangePreference <em>Change Preference</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.change.Change#getChangeInvariant <em>Change Invariant</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.change.Change#getUserAmbitionBinding <em>User Ambition Binding</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.change.Change#getUserAmbitionExpr <em>User Ambition Expr</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.change.Change#getAffectedDimension <em>Affected Dimension</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.change.Change#getChangeSet <em>Change Set</em>}</li>
 * </ul>
 *
 * @see de.ubt.ai1.supermod.mm.change.SuperModChangePackage#getChange()
 * @model
 * @generated
 */
public interface Change extends VersionSpaceElement, UUIDElement {
	/**
	 * Returns the value of the '<em><b>Change Option</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * The option which may be used to reproduce the described change.
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Change Option</em>' containment reference.
	 * @see #setChangeOption(Option)
	 * @see de.ubt.ai1.supermod.mm.change.SuperModChangePackage#getChange_ChangeOption()
	 * @model containment="true"
	 * @generated
	 */
	Option getChangeOption();

	/**
	 * Sets the value of the '{@link de.ubt.ai1.supermod.mm.change.Change#getChangeOption <em>Change Option</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Change Option</em>' containment reference.
	 * @see #getChangeOption()
	 * @generated
	 */
	void setChangeOption(Option value);

	/**
	 * Returns the value of the '<em><b>Change Preference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * The preference which makes sure that this change is automatically selected
	 * in case it matches the user-specified ambition.
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Change Preference</em>' containment reference.
	 * @see #setChangePreference(Preference)
	 * @see de.ubt.ai1.supermod.mm.change.SuperModChangePackage#getChange_ChangePreference()
	 * @model containment="true"
	 * @generated
	 */
	Preference getChangePreference();

	/**
	 * Sets the value of the '{@link de.ubt.ai1.supermod.mm.change.Change#getChangePreference <em>Change Preference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Change Preference</em>' containment reference.
	 * @see #getChangePreference()
	 * @generated
	 */
	void setChangePreference(Preference value);

	/**
	 * Returns the value of the '<em><b>Change Invariant</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * This invariant ensures that if selected, the change option is consistent with
	 * the user-specified ambition, i.e., the latter is implied by the first.
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Change Invariant</em>' containment reference.
	 * @see #setChangeInvariant(Invariant)
	 * @see de.ubt.ai1.supermod.mm.change.SuperModChangePackage#getChange_ChangeInvariant()
	 * @model containment="true"
	 * @generated
	 */
	Invariant getChangeInvariant();

	/**
	 * Sets the value of the '{@link de.ubt.ai1.supermod.mm.change.Change#getChangeInvariant <em>Change Invariant</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Change Invariant</em>' containment reference.
	 * @see #getChangeInvariant()
	 * @generated
	 */
	void setChangeInvariant(Invariant value);

	/**
	 * Returns the value of the '<em><b>User Ambition Binding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Ambition Binding</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Ambition Binding</em>' containment reference.
	 * @see #setUserAmbitionBinding(OptionBinding)
	 * @see de.ubt.ai1.supermod.mm.change.SuperModChangePackage#getChange_UserAmbitionBinding()
	 * @model containment="true"
	 * @generated
	 */
	OptionBinding getUserAmbitionBinding();

	/**
	 * Sets the value of the '{@link de.ubt.ai1.supermod.mm.change.Change#getUserAmbitionBinding <em>User Ambition Binding</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Ambition Binding</em>' containment reference.
	 * @see #getUserAmbitionBinding()
	 * @generated
	 */
	void setUserAmbitionBinding(OptionBinding value);

	/**
	 * Returns the value of the '<em><b>User Ambition Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Ambition Expr</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Ambition Expr</em>' containment reference.
	 * @see #setUserAmbitionExpr(OptionExpr)
	 * @see de.ubt.ai1.supermod.mm.change.SuperModChangePackage#getChange_UserAmbitionExpr()
	 * @model containment="true"
	 * @generated
	 */
	OptionExpr getUserAmbitionExpr();

	/**
	 * Sets the value of the '{@link de.ubt.ai1.supermod.mm.change.Change#getUserAmbitionExpr <em>User Ambition Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Ambition Expr</em>' containment reference.
	 * @see #getUserAmbitionExpr()
	 * @generated
	 */
	void setUserAmbitionExpr(OptionExpr value);

	/**
	 * Returns the value of the '<em><b>Affected Dimension</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * The dimension in which the change is performed.
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Affected Dimension</em>' reference.
	 * @see #setAffectedDimension(ProductDimension)
	 * @see de.ubt.ai1.supermod.mm.change.SuperModChangePackage#getChange_AffectedDimension()
	 * @model
	 * @generated
	 */
	ProductDimension getAffectedDimension();

	/**
	 * Sets the value of the '{@link de.ubt.ai1.supermod.mm.change.Change#getAffectedDimension <em>Affected Dimension</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Affected Dimension</em>' reference.
	 * @see #getAffectedDimension()
	 * @generated
	 */
	void setAffectedDimension(ProductDimension value);

	/**
	 * Returns the value of the '<em><b>Change Set</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.ubt.ai1.supermod.mm.change.ChangeSet#getChanges <em>Changes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * The change set this change belongs to.
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Change Set</em>' container reference.
	 * @see #setChangeSet(ChangeSet)
	 * @see de.ubt.ai1.supermod.mm.change.SuperModChangePackage#getChange_ChangeSet()
	 * @see de.ubt.ai1.supermod.mm.change.ChangeSet#getChanges
	 * @model opposite="changes" transient="false"
	 * @generated
	 */
	ChangeSet getChangeSet();

	/**
	 * Sets the value of the '{@link de.ubt.ai1.supermod.mm.change.Change#getChangeSet <em>Change Set</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Change Set</em>' container reference.
	 * @see #getChangeSet()
	 * @generated
	 */
	void setChangeSet(ChangeSet value);

} // Change
