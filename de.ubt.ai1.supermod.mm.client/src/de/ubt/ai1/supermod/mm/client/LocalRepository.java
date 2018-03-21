/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.mm.client;

import de.ubt.ai1.supermod.mm.core.OptionBinding;
import de.ubt.ai1.supermod.mm.core.Repository;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Local Repository</b></em>'.
 * Local repositories have additional information attached, which concern the
 * management of client-side details.
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
 *   <li>{@link de.ubt.ai1.supermod.mm.client.LocalRepository#getLocalDescriptor <em>Local Descriptor</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.client.LocalRepository#getLocalChoice <em>Local Choice</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.client.LocalRepository#getLocalAmbition <em>Local Ambition</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.client.LocalRepository#getRemoteUri <em>Remote Uri</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.client.LocalRepository#getRemoteUser <em>Remote User</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.client.LocalRepository#isLocallyModified <em>Locally Modified</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.client.LocalRepository#getReadTransactionId <em>Read Transaction Id</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.client.LocalRepository#getWriteTransactionId <em>Write Transaction Id</em>}</li>
 * </ul>
 *
 * @see de.ubt.ai1.supermod.mm.client.SuperModClientPackage#getLocalRepository()
 * @model
 * @generated
 */
public interface LocalRepository extends Repository {
	/**
	 * Returns the value of the '<em><b>Local Descriptor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * Describes the product space represented by this local repository in its
	 * single-version representation.
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local Descriptor</em>' containment reference.
	 * @see #setLocalDescriptor(SingleVersionProductSpaceDescriptor)
	 * @see de.ubt.ai1.supermod.mm.client.SuperModClientPackage#getLocalRepository_LocalDescriptor()
	 * @model containment="true"
	 * @generated
	 */
	SingleVersionProductSpaceDescriptor getLocalDescriptor();

	/**
	 * Sets the value of the '{@link de.ubt.ai1.supermod.mm.client.LocalRepository#getLocalDescriptor <em>Local Descriptor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Local Descriptor</em>' containment reference.
	 * @see #getLocalDescriptor()
	 * @generated
	 */
	void setLocalDescriptor(SingleVersionProductSpaceDescriptor value);

	/**
	 * Returns the value of the '<em><b>Local Choice</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * An option binding which represents the current product space available
	 * in the local workspace. Equivalent to the choice specified during the
	 * latest checkout/update/switch operation.
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local Choice</em>' reference.
	 * @see #setLocalChoice(OptionBinding)
	 * @see de.ubt.ai1.supermod.mm.client.SuperModClientPackage#getLocalRepository_LocalChoice()
	 * @model
	 * @generated
	 */
	OptionBinding getLocalChoice();

	/**
	 * Sets the value of the '{@link de.ubt.ai1.supermod.mm.client.LocalRepository#getLocalChoice <em>Local Choice</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Local Choice</em>' reference.
	 * @see #getLocalChoice()
	 * @generated
	 */
	void setLocalChoice(OptionBinding value);

	/**
	 * Returns the value of the '<em><b>Local Ambition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * An option binding which represents the scope of the current change
	 * happening in the local workspace. Temporary available until commit.
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local Ambition</em>' reference.
	 * @see #setLocalAmbition(OptionBinding)
	 * @see de.ubt.ai1.supermod.mm.client.SuperModClientPackage#getLocalRepository_LocalAmbition()
	 * @model
	 * @generated
	 */
	OptionBinding getLocalAmbition();

	/**
	 * Sets the value of the '{@link de.ubt.ai1.supermod.mm.client.LocalRepository#getLocalAmbition <em>Local Ambition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Local Ambition</em>' reference.
	 * @see #getLocalAmbition()
	 * @generated
	 */
	void setLocalAmbition(OptionBinding value);

	/**
	 * Returns the value of the '<em><b>Remote Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Remote Uri</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Remote Uri</em>' attribute.
	 * @see #setRemoteUri(String)
	 * @see de.ubt.ai1.supermod.mm.client.SuperModClientPackage#getLocalRepository_RemoteUri()
	 * @model
	 * @generated
	 */
	String getRemoteUri();

	/**
	 * Sets the value of the '{@link de.ubt.ai1.supermod.mm.client.LocalRepository#getRemoteUri <em>Remote Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remote Uri</em>' attribute.
	 * @see #getRemoteUri()
	 * @generated
	 */
	void setRemoteUri(String value);

	/**
	 * Returns the value of the '<em><b>Remote User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Remote User</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Remote User</em>' attribute.
	 * @see #setRemoteUser(String)
	 * @see de.ubt.ai1.supermod.mm.client.SuperModClientPackage#getLocalRepository_RemoteUser()
	 * @model
	 * @generated
	 */
	String getRemoteUser();

	/**
	 * Sets the value of the '{@link de.ubt.ai1.supermod.mm.client.LocalRepository#getRemoteUser <em>Remote User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remote User</em>' attribute.
	 * @see #getRemoteUser()
	 * @generated
	 */
	void setRemoteUser(String value);

	/**
	 * Returns the value of the '<em><b>Locally Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Locally Modified</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Locally Modified</em>' attribute.
	 * @see #setLocallyModified(boolean)
	 * @see de.ubt.ai1.supermod.mm.client.SuperModClientPackage#getLocalRepository_LocallyModified()
	 * @model
	 * @generated
	 */
	boolean isLocallyModified();

	/**
	 * Sets the value of the '{@link de.ubt.ai1.supermod.mm.client.LocalRepository#isLocallyModified <em>Locally Modified</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Locally Modified</em>' attribute.
	 * @see #isLocallyModified()
	 * @generated
	 */
	void setLocallyModified(boolean value);

	/**
	 * Returns the value of the '<em><b>Read Transaction Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Read Transaction Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Read Transaction Id</em>' attribute.
	 * @see #setReadTransactionId(int)
	 * @see de.ubt.ai1.supermod.mm.client.SuperModClientPackage#getLocalRepository_ReadTransactionId()
	 * @model
	 * @generated
	 */
	int getReadTransactionId();

	/**
	 * Sets the value of the '{@link de.ubt.ai1.supermod.mm.client.LocalRepository#getReadTransactionId <em>Read Transaction Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Read Transaction Id</em>' attribute.
	 * @see #getReadTransactionId()
	 * @generated
	 */
	void setReadTransactionId(int value);

	/**
	 * Returns the value of the '<em><b>Write Transaction Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Write Transaction Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Write Transaction Id</em>' attribute.
	 * @see #setWriteTransactionId(int)
	 * @see de.ubt.ai1.supermod.mm.client.SuperModClientPackage#getLocalRepository_WriteTransactionId()
	 * @model
	 * @generated
	 */
	int getWriteTransactionId();

	/**
	 * Sets the value of the '{@link de.ubt.ai1.supermod.mm.client.LocalRepository#getWriteTransactionId <em>Write Transaction Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Write Transaction Id</em>' attribute.
	 * @see #getWriteTransactionId()
	 * @generated
	 */
	void setWriteTransactionId(int value);

} // LocalRepository
