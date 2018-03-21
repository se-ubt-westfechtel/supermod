/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.mm.file.client;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Single Version Folder Descriptor</b></em>'.
 * A folder descriptor maps a folder of the local workspace to a single-version
 * representation of a SuperMod product space.
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
 *   <li>{@link de.ubt.ai1.supermod.mm.file.client.SingleVersionFolderDescriptor#getContents <em>Contents</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.file.client.SingleVersionFolderDescriptor#getAllContents <em>All Contents</em>}</li>
 * </ul>
 *
 * @see de.ubt.ai1.supermod.mm.file.client.SuperModFileClientPackage#getSingleVersionFolderDescriptor()
 * @model
 * @generated
 */
public interface SingleVersionFolderDescriptor extends SingleVersionResourceDescriptor {
	/**
	 * Returns the value of the '<em><b>Contents</b></em>' containment reference list.
	 * The list contents are of type {@link de.ubt.ai1.supermod.mm.file.client.SingleVersionResourceDescriptor}.
	 * It is bidirectional and its opposite is '{@link de.ubt.ai1.supermod.mm.file.client.SingleVersionResourceDescriptor#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * The direct contents of this folder descriptor.
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contents</em>' containment reference list.
	 * @see de.ubt.ai1.supermod.mm.file.client.SuperModFileClientPackage#getSingleVersionFolderDescriptor_Contents()
	 * @see de.ubt.ai1.supermod.mm.file.client.SingleVersionResourceDescriptor#getContainer
	 * @model opposite="container" containment="true"
	 * @generated
	 */
	EList<SingleVersionResourceDescriptor> getContents();

	/**
	 * Returns the value of the '<em><b>All Contents</b></em>' reference list.
	 * The list contents are of type {@link de.ubt.ai1.supermod.mm.file.client.SingleVersionResourceDescriptor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * The transitive contents of this folder descriptor and sub-folders thereof.
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All Contents</em>' reference list.
	 * @see de.ubt.ai1.supermod.mm.file.client.SuperModFileClientPackage#getSingleVersionFolderDescriptor_AllContents()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<SingleVersionResourceDescriptor> getAllContents();

	/**
	 * <!-- begin-user-doc -->
	 * Returns a directly contained resource descriptor that has the
	 * specified name.
	 * @param	name resource descriptor name to look up.
	 * @return	Corresponding resource descriptor, if any, or <code>null</code>.
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	SingleVersionResourceDescriptor getContent(String name);

} // SingleVersionFolderDescriptor
