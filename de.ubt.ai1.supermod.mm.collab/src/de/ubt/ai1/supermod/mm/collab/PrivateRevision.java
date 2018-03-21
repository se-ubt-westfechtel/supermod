/**
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package de.ubt.ai1.supermod.mm.collab;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Private Revision</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai1.supermod.mm.collab.PrivateRevision#getPublicRevision <em>Public Revision</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.collab.PrivateRevision#getPublicPredecessors <em>Public Predecessors</em>}</li>
 * </ul>
 *
 * @see de.ubt.ai1.supermod.mm.collab.SuperModCollabPackage#getPrivateRevision()
 * @model
 * @generated
 */
public interface PrivateRevision extends Revision {

	/**
	 * Returns the value of the '<em><b>Public Revision</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.ubt.ai1.supermod.mm.collab.PublicRevision#getPrivateRevisions <em>Private Revisions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Public Revision</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Public Revision</em>' container reference.
	 * @see #setPublicRevision(PublicRevision)
	 * @see de.ubt.ai1.supermod.mm.collab.SuperModCollabPackage#getPrivateRevision_PublicRevision()
	 * @see de.ubt.ai1.supermod.mm.collab.PublicRevision#getPrivateRevisions
	 * @model opposite="privateRevisions" transient="false"
	 * @generated
	 */
	PublicRevision getPublicRevision();

	/**
	 * Sets the value of the '{@link de.ubt.ai1.supermod.mm.collab.PrivateRevision#getPublicRevision <em>Public Revision</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Public Revision</em>' container reference.
	 * @see #getPublicRevision()
	 * @generated
	 */
	void setPublicRevision(PublicRevision value);

	/**
	 * Returns the value of the '<em><b>Public Predecessors</b></em>' reference list.
	 * The list contents are of type {@link de.ubt.ai1.supermod.mm.collab.PublicRevision}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Public Predecessors</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Public Predecessors</em>' reference list.
	 * @see de.ubt.ai1.supermod.mm.collab.SuperModCollabPackage#getPrivateRevision_PublicPredecessors()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<PublicRevision> getPublicPredecessors();
} // PrivateRevision
