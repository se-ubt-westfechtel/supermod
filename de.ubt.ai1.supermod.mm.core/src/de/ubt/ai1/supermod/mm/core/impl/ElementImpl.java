/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.mm.core.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import de.ubt.ai1.supermod.mm.core.Element;
import de.ubt.ai1.supermod.mm.core.SuperModCorePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element</b></em>'.
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date 	2014-07-25
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai1.supermod.mm.core.impl.ElementImpl#getSuperElement <em>Super Element</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.core.impl.ElementImpl#getSubElements <em>Sub Elements</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.core.impl.ElementImpl#getAllSuperElements <em>All Super Elements</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.core.impl.ElementImpl#getAllSubElements <em>All Sub Elements</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.core.impl.ElementImpl#getCrossReferencedElements <em>Cross Referenced Elements</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.core.impl.ElementImpl#getCrossReferencingElements <em>Cross Referencing Elements</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.core.impl.ElementImpl#getProxyUUID <em>Proxy UUID</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.core.impl.ElementImpl#getTransactionId <em>Transaction Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ElementImpl extends MinimalEObjectImpl.Container implements Element {
	/**
	 * The default value of the '{@link #getProxyUUID() <em>Proxy UUID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProxyUUID()
	 * @generated
	 * @ordered
	 */
	protected static final String PROXY_UUID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getProxyUUID() <em>Proxy UUID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProxyUUID()
	 * @generated
	 * @ordered
	 */
	protected String proxyUUID = PROXY_UUID_EDEFAULT;

	/**
	 * The default value of the '{@link #getTransactionId() <em>Transaction Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransactionId()
	 * @generated
	 * @ordered
	 */
	protected static final int TRANSACTION_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTransactionId() <em>Transaction Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransactionId()
	 * @generated
	 * @ordered
	 */
	protected int transactionId = TRANSACTION_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SuperModCorePackage.Literals.ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element getSuperElement() {
		Element superElement = basicGetSuperElement();
		return superElement != null && superElement.eIsProxy() ? (Element)eResolveProxy((InternalEObject)superElement) : superElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public abstract Element basicGetSuperElement();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public abstract EList<Element> getSubElements();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Element> getAllSuperElements() {
		EList<Element> allSuperElements = ECollections.newBasicEList();
		if (getSuperElement() !=  null) {
			allSuperElements.add(getSuperElement());
			allSuperElements.addAll(getSuperElement().getAllSuperElements());
		}
		return ECollections.unmodifiableEList(allSuperElements);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Element> getAllSubElements() {
		EList<Element> allSubElements = ECollections.newBasicEList();
		for (Element subElement : getSubElements()) {
			allSubElements.add(subElement);
			allSubElements.addAll(subElement.getAllSubElements());
		}
		return ECollections.unmodifiableEList(allSubElements);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public abstract EList<Element> getCrossReferencedElements();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public abstract EList<Element> getCrossReferencingElements();
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProxyUUID() {
		return proxyUUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProxyUUID(String newProxyUUID) {
		String oldProxyUUID = proxyUUID;
		proxyUUID = newProxyUUID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SuperModCorePackage.ELEMENT__PROXY_UUID, oldProxyUUID, proxyUUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTransactionId() {
		return transactionId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransactionId(int newTransactionId) {
		int oldTransactionId = transactionId;
		transactionId = newTransactionId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SuperModCorePackage.ELEMENT__TRANSACTION_ID, oldTransactionId, transactionId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isProxy() {
		return proxyUUID != PROXY_UUID_EDEFAULT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SuperModCorePackage.ELEMENT__SUPER_ELEMENT:
				if (resolve) return getSuperElement();
				return basicGetSuperElement();
			case SuperModCorePackage.ELEMENT__SUB_ELEMENTS:
				return getSubElements();
			case SuperModCorePackage.ELEMENT__ALL_SUPER_ELEMENTS:
				return getAllSuperElements();
			case SuperModCorePackage.ELEMENT__ALL_SUB_ELEMENTS:
				return getAllSubElements();
			case SuperModCorePackage.ELEMENT__CROSS_REFERENCED_ELEMENTS:
				return getCrossReferencedElements();
			case SuperModCorePackage.ELEMENT__CROSS_REFERENCING_ELEMENTS:
				return getCrossReferencingElements();
			case SuperModCorePackage.ELEMENT__PROXY_UUID:
				return getProxyUUID();
			case SuperModCorePackage.ELEMENT__TRANSACTION_ID:
				return getTransactionId();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SuperModCorePackage.ELEMENT__PROXY_UUID:
				setProxyUUID((String)newValue);
				return;
			case SuperModCorePackage.ELEMENT__TRANSACTION_ID:
				setTransactionId((Integer)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SuperModCorePackage.ELEMENT__PROXY_UUID:
				setProxyUUID(PROXY_UUID_EDEFAULT);
				return;
			case SuperModCorePackage.ELEMENT__TRANSACTION_ID:
				setTransactionId(TRANSACTION_ID_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SuperModCorePackage.ELEMENT__SUPER_ELEMENT:
				return basicGetSuperElement() != null;
			case SuperModCorePackage.ELEMENT__SUB_ELEMENTS:
				return !getSubElements().isEmpty();
			case SuperModCorePackage.ELEMENT__ALL_SUPER_ELEMENTS:
				return !getAllSuperElements().isEmpty();
			case SuperModCorePackage.ELEMENT__ALL_SUB_ELEMENTS:
				return !getAllSubElements().isEmpty();
			case SuperModCorePackage.ELEMENT__CROSS_REFERENCED_ELEMENTS:
				return !getCrossReferencedElements().isEmpty();
			case SuperModCorePackage.ELEMENT__CROSS_REFERENCING_ELEMENTS:
				return !getCrossReferencingElements().isEmpty();
			case SuperModCorePackage.ELEMENT__PROXY_UUID:
				return PROXY_UUID_EDEFAULT == null ? proxyUUID != null : !PROXY_UUID_EDEFAULT.equals(proxyUUID);
			case SuperModCorePackage.ELEMENT__TRANSACTION_ID:
				return transactionId != TRANSACTION_ID_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case SuperModCorePackage.ELEMENT___IS_PROXY:
				return isProxy();
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (proxyUUID: ");
		result.append(proxyUUID);
		result.append(", transactionId: ");
		result.append(transactionId);
		result.append(')');
		return result.toString();
	}

} //ElementImpl
