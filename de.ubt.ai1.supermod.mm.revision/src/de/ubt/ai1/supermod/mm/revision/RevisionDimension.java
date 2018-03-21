/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.mm.revision;

import org.eclipse.emf.common.util.EList;

import de.ubt.ai1.supermod.mm.core.Invariant;
import de.ubt.ai1.supermod.mm.core.OptionBinding;
import de.ubt.ai1.supermod.mm.core.RuleBaseElement;
import de.ubt.ai1.supermod.mm.core.VersionDimension;

/**
 * <!-- begin-user-doc --> 
 * A representation of the model object '<em><b>Revision Dimension</b></em>'.
 * The SuperMod revision dimension is a simple implementation of a <em>revision
 * graph</em>, a directed acyclic graph of revisions with a dedicated initial
 * revision and a dedicated <head>. By convention, the <em>trunk</em> is
 * traversed by following the first predecessor of each revision.
 * Within a revision graph, certain versioning rules are expressed implicitly.
 * For each of these versioning rule, a low-level rule base element is
 * provided, which ensures its correctness at the abstraction level of rule
 * base elements.
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date 	2014-07-25
 * @see		Revision
 * @see		RuleBaseElement
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai1.supermod.mm.revision.RevisionDimension#getRevisions <em>Revisions</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.revision.RevisionDimension#getInitialRevision <em>Initial Revision</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.revision.RevisionDimension#getInitialRevisionInvariant <em>Initial Revision Invariant</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.revision.RevisionDimension#getLatestRevisionNumber <em>Latest Revision Number</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.revision.RevisionDimension#getHead <em>Head</em>}</li>
 * </ul>
 *
 * @see de.ubt.ai1.supermod.mm.revision.SuperModRevisionPackage#getRevisionDimension()
 * @model
 * @generated
 */
public interface RevisionDimension extends VersionDimension {
	/**
	 * Returns the value of the '<em><b>Revisions</b></em>' containment reference list.
	 * The list contents are of type {@link de.ubt.ai1.supermod.mm.revision.Revision}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * All revisions which are part of the current revision graph. The order does not
	 * necessarily represent the temporal revision order.
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Revisions</em>' containment reference list.
	 * @see de.ubt.ai1.supermod.mm.revision.SuperModRevisionPackage#getRevisionDimension_Revisions()
	 * @model containment="true" changeable="false"
	 * @generated
	 */
	EList<Revision> getRevisions();

	/**
	 * Returns the value of the '<em><b>Initial Revision</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * The first revision that had ever been committed to this dimension.
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Revision</em>' reference.
	 * @see #setInitialRevision(Revision)
	 * @see de.ubt.ai1.supermod.mm.revision.SuperModRevisionPackage#getRevisionDimension_InitialRevision()
	 * @model
	 * @generated
	 */
	Revision getInitialRevision();

	/**
	 * Sets the value of the '{@link de.ubt.ai1.supermod.mm.revision.RevisionDimension#getInitialRevision <em>Initial Revision</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Revision</em>' reference.
	 * @see #getInitialRevision()
	 * @generated
	 */
	void setInitialRevision(Revision value);

	/**
	 * Returns the value of the '<em><b>Initial Revision Invariant</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * An invariant which ensures that the initial revision is always selected.
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Revision Invariant</em>' containment reference.
	 * @see #setInitialRevisionInvariant(Invariant)
	 * @see de.ubt.ai1.supermod.mm.revision.SuperModRevisionPackage#getRevisionDimension_InitialRevisionInvariant()
	 * @model containment="true"
	 * @generated
	 */
	Invariant getInitialRevisionInvariant();

	/**
	 * Sets the value of the '{@link de.ubt.ai1.supermod.mm.revision.RevisionDimension#getInitialRevisionInvariant <em>Initial Revision Invariant</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Revision Invariant</em>' containment reference.
	 * @see #getInitialRevisionInvariant()
	 * @generated
	 */
	void setInitialRevisionInvariant(Invariant value);

	/**
	 * Returns the value of the '<em><b>Head</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * The head of the revision graph, which denotes the latest revision of the
	 * <em>trunk</em>. This value is changed whenever a new revision is committed
	 * to the trunk.
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Head</em>' reference.
	 * @see #setHead(Revision)
	 * @see de.ubt.ai1.supermod.mm.revision.SuperModRevisionPackage#getRevisionDimension_Head()
	 * @model
	 * @generated
	 */
	Revision getHead();

	/**
	 * Sets the value of the '{@link de.ubt.ai1.supermod.mm.revision.RevisionDimension#getHead <em>Head</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Head</em>' reference.
	 * @see #getHead()
	 * @generated
	 */
	void setHead(Revision value);

	/**
	 * Returns the value of the '<em><b>Latest Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * The revision number that had been used for the most recent commit, regardless
	 * of whether it was committed to the <em>trunk</em> or to a <em>branch</em>.
	 * In SuperMod, revision numbers are counted flatly. This value is incremented
	 * during each commit.
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Latest Revision Number</em>' attribute.
	 * @see #setLatestRevisionNumber(int)
	 * @see de.ubt.ai1.supermod.mm.revision.SuperModRevisionPackage#getRevisionDimension_LatestRevisionNumber()
	 * @model
	 * @generated
	 */
	int getLatestRevisionNumber();

	/**
	 * Sets the value of the '{@link de.ubt.ai1.supermod.mm.revision.RevisionDimension#getLatestRevisionNumber <em>Latest Revision Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Latest Revision Number</em>' attribute.
	 * @see #getLatestRevisionNumber()
	 * @generated
	 */
	void setLatestRevisionNumber(int value);

	/**
	 * <!-- begin-user-doc -->
	 * Auxiliary operation that converts a given low-level option binding
	 * into a selection of revisions correspondingly.
	 * @param	binding the binding for whose selected options the revisions
	 * 			are searched.
	 * @return	A selection of revisions, which produce exactly the binding.
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EList<Revision> getRevisionsForBinding(OptionBinding binding);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model revisionsMany="true"
	 * @generated
	 */
	EList<Revision> getLatestRevisions(EList<Revision> revisions);

} // TemporalDimension
