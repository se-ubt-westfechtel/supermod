/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.mm.textfile.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;
import de.ubt.ai1.supermod.mm.core.ProductSpaceElement;
import de.ubt.ai1.supermod.mm.core.impl.ProductSpaceElementImpl;
import de.ubt.ai1.supermod.mm.textfile.SuperModTextfilePackage;
import de.ubt.ai1.supermod.mm.textfile.TextFileContent;
import de.ubt.ai1.supermod.mm.textfile.TextLine;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Text Line</b></em>'.
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date 	2014-07-28
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai1.supermod.mm.textfile.impl.TextLineImpl#getText <em>Text</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.textfile.impl.TextLineImpl#getTextFileContent <em>Text File Content</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TextLineImpl extends ProductSpaceElementImpl implements TextLine {
	/**
	 * The default value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected String text = TEXT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TextLineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SuperModTextfilePackage.Literals.TEXT_LINE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText() {
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setText(String newText) {
		String oldText = text;
		text = newText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SuperModTextfilePackage.TEXT_LINE__TEXT, oldText, text));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextFileContent getTextFileContent() {
		if (eContainerFeatureID() != SuperModTextfilePackage.TEXT_LINE__TEXT_FILE_CONTENT) return null;
		return (TextFileContent)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTextFileContent(TextFileContent newTextFileContent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newTextFileContent, SuperModTextfilePackage.TEXT_LINE__TEXT_FILE_CONTENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextFileContent(TextFileContent newTextFileContent) {
		if (newTextFileContent != eInternalContainer() || (eContainerFeatureID() != SuperModTextfilePackage.TEXT_LINE__TEXT_FILE_CONTENT && newTextFileContent != null)) {
			if (EcoreUtil.isAncestor(this, newTextFileContent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newTextFileContent != null)
				msgs = ((InternalEObject)newTextFileContent).eInverseAdd(this, SuperModTextfilePackage.TEXT_FILE_CONTENT__LINES, TextFileContent.class, msgs);
			msgs = basicSetTextFileContent(newTextFileContent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SuperModTextfilePackage.TEXT_LINE__TEXT_FILE_CONTENT, newTextFileContent, newTextFileContent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SuperModTextfilePackage.TEXT_LINE__TEXT_FILE_CONTENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetTextFileContent((TextFileContent)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SuperModTextfilePackage.TEXT_LINE__TEXT_FILE_CONTENT:
				return basicSetTextFileContent(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case SuperModTextfilePackage.TEXT_LINE__TEXT_FILE_CONTENT:
				return eInternalContainer().eInverseRemove(this, SuperModTextfilePackage.TEXT_FILE_CONTENT__LINES, TextFileContent.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SuperModTextfilePackage.TEXT_LINE__TEXT:
				return getText();
			case SuperModTextfilePackage.TEXT_LINE__TEXT_FILE_CONTENT:
				return getTextFileContent();
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
			case SuperModTextfilePackage.TEXT_LINE__TEXT:
				setText((String)newValue);
				return;
			case SuperModTextfilePackage.TEXT_LINE__TEXT_FILE_CONTENT:
				setTextFileContent((TextFileContent)newValue);
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
			case SuperModTextfilePackage.TEXT_LINE__TEXT:
				setText(TEXT_EDEFAULT);
				return;
			case SuperModTextfilePackage.TEXT_LINE__TEXT_FILE_CONTENT:
				setTextFileContent((TextFileContent)null);
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
			case SuperModTextfilePackage.TEXT_LINE__TEXT:
				return TEXT_EDEFAULT == null ? text != null : !TEXT_EDEFAULT.equals(text);
			case SuperModTextfilePackage.TEXT_LINE__TEXT_FILE_CONTENT:
				return getTextFileContent() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String toString() {
		return getText();
	}

	@Override
	public ProductSpaceElement basicGetSuperProductSpaceElement() {
		return (ProductSpaceElement) eContainer();
	}

	@Override
	public EList<ProductSpaceElement> getSubProductSpaceElements() {
		return ECollections.emptyEList();
	}

	@Override
	public EList<ProductSpaceElement> getCrossReferencedProductSpaceElements() {
		return ECollections.emptyEList();
	}
	
	@Override
	public EList<ProductSpaceElement> getCrossReferencingProductSpaceElements(){
		if (getTextFileContent() != null && 
				getTextFileContent().getLineOrdering() != null) {
			return ECollections.unmodifiableEList(getTextFileContent()
					.getLineOrdering().getAllOccurrencesOf(this));
		}
		return ECollections.emptyEList();
	}

} //TextLineImpl
