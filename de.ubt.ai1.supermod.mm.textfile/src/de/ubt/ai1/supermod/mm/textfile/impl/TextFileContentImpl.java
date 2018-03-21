/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.mm.textfile.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
import de.ubt.ai1.supermod.mm.core.ProductSpaceElement;
import de.ubt.ai1.supermod.mm.file.impl.VersionedFileContentImpl;
import de.ubt.ai1.supermod.mm.list.VersionedList;
import de.ubt.ai1.supermod.mm.textfile.SuperModTextfilePackage;
import de.ubt.ai1.supermod.mm.textfile.TextFileContent;
import de.ubt.ai1.supermod.mm.textfile.TextLine;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Text File Content</b></em>'.
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date 	2014-07-28
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai1.supermod.mm.textfile.impl.TextFileContentImpl#getLines <em>Lines</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.textfile.impl.TextFileContentImpl#getLineOrdering <em>Line Ordering</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TextFileContentImpl extends VersionedFileContentImpl implements TextFileContent {
	/**
	 * The cached value of the '{@link #getLines() <em>Lines</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLines()
	 * @generated
	 * @ordered
	 */
	protected EList<TextLine> lines;

	/**
	 * The cached value of the '{@link #getLineOrdering() <em>Line Ordering</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineOrdering()
	 * @generated
	 * @ordered
	 */
	protected VersionedList lineOrdering;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TextFileContentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SuperModTextfilePackage.Literals.TEXT_FILE_CONTENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextLine> getLines() {
		if (lines == null) {
			lines = new EObjectContainmentWithInverseEList<TextLine>(TextLine.class, this, SuperModTextfilePackage.TEXT_FILE_CONTENT__LINES, SuperModTextfilePackage.TEXT_LINE__TEXT_FILE_CONTENT);
		}
		return lines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VersionedList getLineOrdering() {
		return lineOrdering;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLineOrdering(VersionedList newLineOrdering, NotificationChain msgs) {
		VersionedList oldLineOrdering = lineOrdering;
		lineOrdering = newLineOrdering;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SuperModTextfilePackage.TEXT_FILE_CONTENT__LINE_ORDERING, oldLineOrdering, newLineOrdering);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLineOrdering(VersionedList newLineOrdering) {
		if (newLineOrdering != lineOrdering) {
			NotificationChain msgs = null;
			if (lineOrdering != null)
				msgs = ((InternalEObject)lineOrdering).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SuperModTextfilePackage.TEXT_FILE_CONTENT__LINE_ORDERING, null, msgs);
			if (newLineOrdering != null)
				msgs = ((InternalEObject)newLineOrdering).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SuperModTextfilePackage.TEXT_FILE_CONTENT__LINE_ORDERING, null, msgs);
			msgs = basicSetLineOrdering(newLineOrdering, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SuperModTextfilePackage.TEXT_FILE_CONTENT__LINE_ORDERING, newLineOrdering, newLineOrdering));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SuperModTextfilePackage.TEXT_FILE_CONTENT__LINES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLines()).basicAdd(otherEnd, msgs);
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
			case SuperModTextfilePackage.TEXT_FILE_CONTENT__LINES:
				return ((InternalEList<?>)getLines()).basicRemove(otherEnd, msgs);
			case SuperModTextfilePackage.TEXT_FILE_CONTENT__LINE_ORDERING:
				return basicSetLineOrdering(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SuperModTextfilePackage.TEXT_FILE_CONTENT__LINES:
				return getLines();
			case SuperModTextfilePackage.TEXT_FILE_CONTENT__LINE_ORDERING:
				return getLineOrdering();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SuperModTextfilePackage.TEXT_FILE_CONTENT__LINES:
				getLines().clear();
				getLines().addAll((Collection<? extends TextLine>)newValue);
				return;
			case SuperModTextfilePackage.TEXT_FILE_CONTENT__LINE_ORDERING:
				setLineOrdering((VersionedList)newValue);
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
			case SuperModTextfilePackage.TEXT_FILE_CONTENT__LINES:
				getLines().clear();
				return;
			case SuperModTextfilePackage.TEXT_FILE_CONTENT__LINE_ORDERING:
				setLineOrdering((VersionedList)null);
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
			case SuperModTextfilePackage.TEXT_FILE_CONTENT__LINES:
				return lines != null && !lines.isEmpty();
			case SuperModTextfilePackage.TEXT_FILE_CONTENT__LINE_ORDERING:
				return lineOrdering != null;
		}
		return super.eIsSet(featureID);
	}

	@Override
	public EList<ProductSpaceElement> getSubProductSpaceElements() {
		EList<ProductSpaceElement> subElements = ECollections.newBasicEList();
		subElements.addAll(getLines());
		if (getLineOrdering() != null) {
			subElements.add(getLineOrdering());
		}
		return ECollections.unmodifiableEList(subElements);
	}

	@Override
	public String getSuperExtension() {
		return "supermodtextfile";
	}

} //TextFileContentImpl
