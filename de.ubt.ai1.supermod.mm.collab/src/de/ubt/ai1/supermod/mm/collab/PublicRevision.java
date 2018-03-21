/**
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package de.ubt.ai1.supermod.mm.collab;

import de.ubt.ai1.supermod.mm.core.DefaultBinding;
import de.ubt.ai1.supermod.mm.core.Option;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Public Revision</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai1.supermod.mm.collab.PublicRevision#getRevisionDimension <em>Revision Dimension</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.collab.PublicRevision#getPrivateRevisions <em>Private Revisions</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.collab.PublicRevision#getCommitter <em>Committer</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.collab.PublicRevision#getLatestPrivateRevisionNumber <em>Latest Private Revision Number</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.collab.PublicRevision#getInitialPrivateRevision <em>Initial Private Revision</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.collab.PublicRevision#getPrivateHead <em>Private Head</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.collab.PublicRevision#isHead <em>Head</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.collab.PublicRevision#isFinished <em>Finished</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.collab.PublicRevision#getFinishedOption <em>Finished Option</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.collab.PublicRevision#getFinishedDefaultBinding <em>Finished Default Binding</em>}</li>
 * </ul>
 *
 * @see de.ubt.ai1.supermod.mm.collab.SuperModCollabPackage#getPublicRevision()
 * @model
 * @generated
 */
public interface PublicRevision extends Revision {
	/**
	 * Returns the value of the '<em><b>Revision Dimension</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.ubt.ai1.supermod.mm.collab.CollaborativeRevisionDimension#getPublicRevisions <em>Public Revisions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Revision Dimension</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Revision Dimension</em>' container reference.
	 * @see #setRevisionDimension(CollaborativeRevisionDimension)
	 * @see de.ubt.ai1.supermod.mm.collab.SuperModCollabPackage#getPublicRevision_RevisionDimension()
	 * @see de.ubt.ai1.supermod.mm.collab.CollaborativeRevisionDimension#getPublicRevisions
	 * @model opposite="publicRevisions" transient="false"
	 * @generated
	 */
	CollaborativeRevisionDimension getRevisionDimension();

	/**
	 * Sets the value of the '{@link de.ubt.ai1.supermod.mm.collab.PublicRevision#getRevisionDimension <em>Revision Dimension</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Revision Dimension</em>' container reference.
	 * @see #getRevisionDimension()
	 * @generated
	 */
	void setRevisionDimension(CollaborativeRevisionDimension value);

	/**
	 * Returns the value of the '<em><b>Private Revisions</b></em>' containment reference list.
	 * The list contents are of type {@link de.ubt.ai1.supermod.mm.collab.PrivateRevision}.
	 * It is bidirectional and its opposite is '{@link de.ubt.ai1.supermod.mm.collab.PrivateRevision#getPublicRevision <em>Public Revision</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Private Revisions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Private Revisions</em>' containment reference list.
	 * @see de.ubt.ai1.supermod.mm.collab.SuperModCollabPackage#getPublicRevision_PrivateRevisions()
	 * @see de.ubt.ai1.supermod.mm.collab.PrivateRevision#getPublicRevision
	 * @model opposite="publicRevision" containment="true"
	 * @generated
	 */
	EList<PrivateRevision> getPrivateRevisions();

	/**
	 * Returns the value of the '<em><b>Committer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Committer</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Committer</em>' attribute.
	 * @see #setCommitter(String)
	 * @see de.ubt.ai1.supermod.mm.collab.SuperModCollabPackage#getPublicRevision_Committer()
	 * @model
	 * @generated
	 */
	String getCommitter();

	/**
	 * Sets the value of the '{@link de.ubt.ai1.supermod.mm.collab.PublicRevision#getCommitter <em>Committer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Committer</em>' attribute.
	 * @see #getCommitter()
	 * @generated
	 */
	void setCommitter(String value);

	/**
	 * Returns the value of the '<em><b>Latest Private Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Latest Private Revision Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Latest Private Revision Number</em>' attribute.
	 * @see #setLatestPrivateRevisionNumber(int)
	 * @see de.ubt.ai1.supermod.mm.collab.SuperModCollabPackage#getPublicRevision_LatestPrivateRevisionNumber()
	 * @model
	 * @generated
	 */
	int getLatestPrivateRevisionNumber();

	/**
	 * Sets the value of the '{@link de.ubt.ai1.supermod.mm.collab.PublicRevision#getLatestPrivateRevisionNumber <em>Latest Private Revision Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Latest Private Revision Number</em>' attribute.
	 * @see #getLatestPrivateRevisionNumber()
	 * @generated
	 */
	void setLatestPrivateRevisionNumber(int value);

	/**
	 * Returns the value of the '<em><b>Initial Private Revision</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial Private Revision</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Private Revision</em>' reference.
	 * @see #setInitialPrivateRevision(PrivateRevision)
	 * @see de.ubt.ai1.supermod.mm.collab.SuperModCollabPackage#getPublicRevision_InitialPrivateRevision()
	 * @model
	 * @generated
	 */
	PrivateRevision getInitialPrivateRevision();

	/**
	 * Sets the value of the '{@link de.ubt.ai1.supermod.mm.collab.PublicRevision#getInitialPrivateRevision <em>Initial Private Revision</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Private Revision</em>' reference.
	 * @see #getInitialPrivateRevision()
	 * @generated
	 */
	void setInitialPrivateRevision(PrivateRevision value);

	/**
	 * Returns the value of the '<em><b>Private Head</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Private Head</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Private Head</em>' reference.
	 * @see #setPrivateHead(PrivateRevision)
	 * @see de.ubt.ai1.supermod.mm.collab.SuperModCollabPackage#getPublicRevision_PrivateHead()
	 * @model
	 * @generated
	 */
	PrivateRevision getPrivateHead();

	/**
	 * Sets the value of the '{@link de.ubt.ai1.supermod.mm.collab.PublicRevision#getPrivateHead <em>Private Head</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Private Head</em>' reference.
	 * @see #getPrivateHead()
	 * @generated
	 */
	void setPrivateHead(PrivateRevision value);

	/**
	 * Returns the value of the '<em><b>Head</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Head</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Head</em>' attribute.
	 * @see de.ubt.ai1.supermod.mm.collab.SuperModCollabPackage#getPublicRevision_Head()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	boolean isHead();

	/**
	 * Returns the value of the '<em><b>Finished</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Finished</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Finished</em>' attribute.
	 * @see de.ubt.ai1.supermod.mm.collab.SuperModCollabPackage#getPublicRevision_Finished()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	boolean isFinished();

	/**
	 * Returns the value of the '<em><b>Finished Option</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Finished Option</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Finished Option</em>' containment reference.
	 * @see #setFinishedOption(Option)
	 * @see de.ubt.ai1.supermod.mm.collab.SuperModCollabPackage#getPublicRevision_FinishedOption()
	 * @model containment="true"
	 * @generated
	 */
	Option getFinishedOption();

	/**
	 * Sets the value of the '{@link de.ubt.ai1.supermod.mm.collab.PublicRevision#getFinishedOption <em>Finished Option</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Finished Option</em>' containment reference.
	 * @see #getFinishedOption()
	 * @generated
	 */
	void setFinishedOption(Option value);

	/**
	 * Returns the value of the '<em><b>Finished Default Binding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Finished Default Binding</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Finished Default Binding</em>' containment reference.
	 * @see #setFinishedDefaultBinding(DefaultBinding)
	 * @see de.ubt.ai1.supermod.mm.collab.SuperModCollabPackage#getPublicRevision_FinishedDefaultBinding()
	 * @model containment="true"
	 * @generated
	 */
	DefaultBinding getFinishedDefaultBinding();

	/**
	 * Sets the value of the '{@link de.ubt.ai1.supermod.mm.collab.PublicRevision#getFinishedDefaultBinding <em>Finished Default Binding</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Finished Default Binding</em>' containment reference.
	 * @see #getFinishedDefaultBinding()
	 * @generated
	 */
	void setFinishedDefaultBinding(DefaultBinding value);

} // PublicRevision
