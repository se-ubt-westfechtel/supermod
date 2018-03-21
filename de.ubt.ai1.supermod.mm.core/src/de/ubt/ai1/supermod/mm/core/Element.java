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
 * A representation of the model object '<em><b>Element</b></em>'.
 * Base interface for all elements inside a SuperMod repository. An element has a
 * uniquely qualified name, which is hierarchically organized. Each element may have
 * at most one container element and an arbitrary number of child elements. Furthermore,
 * there may be non-containment cross-references to different elements.
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date 	2014-07-25
 * @see		{@link ProductSpaceElement}
 * @see		{@link VersionSpaceElement}
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai1.supermod.mm.core.Element#getSuperElement <em>Super Element</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.core.Element#getSubElements <em>Sub Elements</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.core.Element#getAllSuperElements <em>All Super Elements</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.core.Element#getAllSubElements <em>All Sub Elements</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.core.Element#getCrossReferencedElements <em>Cross Referenced Elements</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.core.Element#getCrossReferencingElements <em>Cross Referencing Elements</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.core.Element#getProxyUUID <em>Proxy UUID</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.core.Element#getTransactionId <em>Transaction Id</em>}</li>
 * </ul>
 *
 * @see de.ubt.ai1.supermod.mm.core.SuperModCorePackage#getElement()
 * @model abstract="true"
 * @generated
 */
public interface Element extends EObject {
	/**
	 * Returns the value of the '<em><b>Super Element</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link de.ubt.ai1.supermod.mm.core.Element#getSubElements <em>Sub Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Super Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super Element</em>' reference.
	 * @see de.ubt.ai1.supermod.mm.core.SuperModCorePackage#getElement_SuperElement()
	 * @see de.ubt.ai1.supermod.mm.core.Element#getSubElements
	 * @model opposite="subElements" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	Element getSuperElement();

	/**
	 * Returns the value of the '<em><b>Sub Elements</b></em>' reference list.
	 * The list contents are of type {@link de.ubt.ai1.supermod.mm.core.Element}.
	 * It is bidirectional and its opposite is '{@link de.ubt.ai1.supermod.mm.core.Element#getSuperElement <em>Super Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Elements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Elements</em>' reference list.
	 * @see de.ubt.ai1.supermod.mm.core.SuperModCorePackage#getElement_SubElements()
	 * @see de.ubt.ai1.supermod.mm.core.Element#getSuperElement
	 * @model opposite="superElement" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<Element> getSubElements();

	/**
	 * Returns the value of the '<em><b>All Super Elements</b></em>' reference list.
	 * The list contents are of type {@link de.ubt.ai1.supermod.mm.core.Element}.
	 * It is bidirectional and its opposite is '{@link de.ubt.ai1.supermod.mm.core.Element#getAllSubElements <em>All Sub Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>All Super Elements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All Super Elements</em>' reference list.
	 * @see de.ubt.ai1.supermod.mm.core.SuperModCorePackage#getElement_AllSuperElements()
	 * @see de.ubt.ai1.supermod.mm.core.Element#getAllSubElements
	 * @model opposite="allSubElements" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<Element> getAllSuperElements();

	/**
	 * Returns the value of the '<em><b>All Sub Elements</b></em>' reference list.
	 * The list contents are of type {@link de.ubt.ai1.supermod.mm.core.Element}.
	 * It is bidirectional and its opposite is '{@link de.ubt.ai1.supermod.mm.core.Element#getAllSuperElements <em>All Super Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>All Sub Elements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All Sub Elements</em>' reference list.
	 * @see de.ubt.ai1.supermod.mm.core.SuperModCorePackage#getElement_AllSubElements()
	 * @see de.ubt.ai1.supermod.mm.core.Element#getAllSuperElements
	 * @model opposite="allSuperElements" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<Element> getAllSubElements();

	/**
	 * Returns the value of the '<em><b>Cross Referenced Elements</b></em>' reference list.
	 * The list contents are of type {@link de.ubt.ai1.supermod.mm.core.Element}.
	 * It is bidirectional and its opposite is '{@link de.ubt.ai1.supermod.mm.core.Element#getCrossReferencingElements <em>Cross Referencing Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cross Referenced Elements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cross Referenced Elements</em>' reference list.
	 * @see de.ubt.ai1.supermod.mm.core.SuperModCorePackage#getElement_CrossReferencedElements()
	 * @see de.ubt.ai1.supermod.mm.core.Element#getCrossReferencingElements
	 * @model opposite="crossReferencingElements" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<Element> getCrossReferencedElements();

	/**
	 * Returns the value of the '<em><b>Cross Referencing Elements</b></em>' reference list.
	 * The list contents are of type {@link de.ubt.ai1.supermod.mm.core.Element}.
	 * It is bidirectional and its opposite is '{@link de.ubt.ai1.supermod.mm.core.Element#getCrossReferencedElements <em>Cross Referenced Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cross Referencing Elements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cross Referencing Elements</em>' reference list.
	 * @see de.ubt.ai1.supermod.mm.core.SuperModCorePackage#getElement_CrossReferencingElements()
	 * @see de.ubt.ai1.supermod.mm.core.Element#getCrossReferencedElements
	 * @model opposite="crossReferencedElements" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<Element> getCrossReferencingElements();

	/**
	 * Returns the value of the '<em><b>Proxy UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Proxy UUID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Proxy UUID</em>' attribute.
	 * @see #setProxyUUID(String)
	 * @see de.ubt.ai1.supermod.mm.core.SuperModCorePackage#getElement_ProxyUUID()
	 * @model
	 * @generated
	 */
	String getProxyUUID();

	/**
	 * Sets the value of the '{@link de.ubt.ai1.supermod.mm.core.Element#getProxyUUID <em>Proxy UUID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Proxy UUID</em>' attribute.
	 * @see #getProxyUUID()
	 * @generated
	 */
	void setProxyUUID(String value);

	/**
	 * Returns the value of the '<em><b>Transaction Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transaction Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transaction Id</em>' attribute.
	 * @see #setTransactionId(int)
	 * @see de.ubt.ai1.supermod.mm.core.SuperModCorePackage#getElement_TransactionId()
	 * @model
	 * @generated
	 */
	int getTransactionId();

	/**
	 * Sets the value of the '{@link de.ubt.ai1.supermod.mm.core.Element#getTransactionId <em>Transaction Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transaction Id</em>' attribute.
	 * @see #getTransactionId()
	 * @generated
	 */
	void setTransactionId(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isProxy();

} // Element
