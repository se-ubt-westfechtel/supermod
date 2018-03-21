/**
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package de.ubt.ai1.supermod.mm.collab;

import org.eclipse.emf.common.util.EList;

import de.ubt.ai1.supermod.mm.core.Invariant;
import de.ubt.ai1.supermod.mm.core.OptionBinding;
import de.ubt.ai1.supermod.mm.core.VersionDimension;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Collaborative Revision Dimension</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai1.supermod.mm.collab.CollaborativeRevisionDimension#getPublicRevisions <em>Public Revisions</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.collab.CollaborativeRevisionDimension#getInitialPublicRevision <em>Initial Public Revision</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.collab.CollaborativeRevisionDimension#getInitialPublicRevisionInvariant <em>Initial Public Revision Invariant</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.collab.CollaborativeRevisionDimension#getLatestPublicRevisionNumber <em>Latest Public Revision Number</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.collab.CollaborativeRevisionDimension#getPublicHead <em>Public Head</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.collab.CollaborativeRevisionDimension#getCurrentPublicRevision <em>Current Public Revision</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.collab.CollaborativeRevisionDimension#getAllRevisions <em>All Revisions</em>}</li>
 * </ul>
 *
 * @see de.ubt.ai1.supermod.mm.collab.SuperModCollabPackage#getCollaborativeRevisionDimension()
 * @model
 * @generated
 */
public interface CollaborativeRevisionDimension extends VersionDimension {
	/**
	 * Returns the value of the '<em><b>Public Revisions</b></em>' containment reference list.
	 * The list contents are of type {@link de.ubt.ai1.supermod.mm.collab.PublicRevision}.
	 * It is bidirectional and its opposite is '{@link de.ubt.ai1.supermod.mm.collab.PublicRevision#getRevisionDimension <em>Revision Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Public Revisions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Public Revisions</em>' containment reference list.
	 * @see de.ubt.ai1.supermod.mm.collab.SuperModCollabPackage#getCollaborativeRevisionDimension_PublicRevisions()
	 * @see de.ubt.ai1.supermod.mm.collab.PublicRevision#getRevisionDimension
	 * @model opposite="revisionDimension" containment="true"
	 * @generated
	 */
	EList<PublicRevision> getPublicRevisions();

	/**
	 * Returns the value of the '<em><b>Initial Public Revision</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial Public Revision</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Public Revision</em>' reference.
	 * @see #setInitialPublicRevision(PublicRevision)
	 * @see de.ubt.ai1.supermod.mm.collab.SuperModCollabPackage#getCollaborativeRevisionDimension_InitialPublicRevision()
	 * @model
	 * @generated
	 */
	PublicRevision getInitialPublicRevision();

	/**
	 * Sets the value of the '{@link de.ubt.ai1.supermod.mm.collab.CollaborativeRevisionDimension#getInitialPublicRevision <em>Initial Public Revision</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Public Revision</em>' reference.
	 * @see #getInitialPublicRevision()
	 * @generated
	 */
	void setInitialPublicRevision(PublicRevision value);

	/**
	 * Returns the value of the '<em><b>Initial Public Revision Invariant</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial Public Revision Invariant</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Public Revision Invariant</em>' containment reference.
	 * @see #setInitialPublicRevisionInvariant(Invariant)
	 * @see de.ubt.ai1.supermod.mm.collab.SuperModCollabPackage#getCollaborativeRevisionDimension_InitialPublicRevisionInvariant()
	 * @model containment="true"
	 * @generated
	 */
	Invariant getInitialPublicRevisionInvariant();

	/**
	 * Sets the value of the '{@link de.ubt.ai1.supermod.mm.collab.CollaborativeRevisionDimension#getInitialPublicRevisionInvariant <em>Initial Public Revision Invariant</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Public Revision Invariant</em>' containment reference.
	 * @see #getInitialPublicRevisionInvariant()
	 * @generated
	 */
	void setInitialPublicRevisionInvariant(Invariant value);

	/**
	 * Returns the value of the '<em><b>Latest Public Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Latest Public Revision Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Latest Public Revision Number</em>' attribute.
	 * @see #setLatestPublicRevisionNumber(int)
	 * @see de.ubt.ai1.supermod.mm.collab.SuperModCollabPackage#getCollaborativeRevisionDimension_LatestPublicRevisionNumber()
	 * @model
	 * @generated
	 */
	int getLatestPublicRevisionNumber();

	/**
	 * Sets the value of the '{@link de.ubt.ai1.supermod.mm.collab.CollaborativeRevisionDimension#getLatestPublicRevisionNumber <em>Latest Public Revision Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Latest Public Revision Number</em>' attribute.
	 * @see #getLatestPublicRevisionNumber()
	 * @generated
	 */
	void setLatestPublicRevisionNumber(int value);

	/**
	 * Returns the value of the '<em><b>Public Head</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Public Head</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Public Head</em>' reference.
	 * @see #setPublicHead(PublicRevision)
	 * @see de.ubt.ai1.supermod.mm.collab.SuperModCollabPackage#getCollaborativeRevisionDimension_PublicHead()
	 * @model
	 * @generated
	 */
	PublicRevision getPublicHead();

	/**
	 * Sets the value of the '{@link de.ubt.ai1.supermod.mm.collab.CollaborativeRevisionDimension#getPublicHead <em>Public Head</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Public Head</em>' reference.
	 * @see #getPublicHead()
	 * @generated
	 */
	void setPublicHead(PublicRevision value);

	/**
	 * Returns the value of the '<em><b>Current Public Revision</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current Public Revision</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Public Revision</em>' reference.
	 * @see #setCurrentPublicRevision(PublicRevision)
	 * @see de.ubt.ai1.supermod.mm.collab.SuperModCollabPackage#getCollaborativeRevisionDimension_CurrentPublicRevision()
	 * @model
	 * @generated
	 */
	PublicRevision getCurrentPublicRevision();

	/**
	 * Sets the value of the '{@link de.ubt.ai1.supermod.mm.collab.CollaborativeRevisionDimension#getCurrentPublicRevision <em>Current Public Revision</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Public Revision</em>' reference.
	 * @see #getCurrentPublicRevision()
	 * @generated
	 */
	void setCurrentPublicRevision(PublicRevision value);

	/**
	 * Returns the value of the '<em><b>All Revisions</b></em>' reference list.
	 * The list contents are of type {@link de.ubt.ai1.supermod.mm.collab.Revision}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>All Revisions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All Revisions</em>' reference list.
	 * @see de.ubt.ai1.supermod.mm.collab.SuperModCollabPackage#getCollaborativeRevisionDimension_AllRevisions()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<Revision> getAllRevisions();

	/**
	 * <!-- begin-user-doc -->
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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model publicRevisionsMany="true"
	 * @generated
	 */
	EList<PublicRevision> getLatestPublicRevisions(EList<PublicRevision> publicRevisions);

} // CollaborativeRevisionDimension
