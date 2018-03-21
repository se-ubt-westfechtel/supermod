/**
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package de.ubt.ai1.supermod.textfile.client.impl;

import de.ubt.ai1.supermod.mm.textfile.TextLine;

import de.ubt.ai1.supermod.textfile.client.SuperModTextfileClientPackage;
import de.ubt.ai1.supermod.textfile.client.TextLineExportTrace;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Text Line Export Trace</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai1.supermod.textfile.client.impl.TextLineExportTraceImpl#getLineNr <em>Line Nr</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.textfile.client.impl.TextLineExportTraceImpl#getLine <em>Line</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TextLineExportTraceImpl extends MinimalEObjectImpl.Container implements TextLineExportTrace {
	/**
	 * The default value of the '{@link #getLineNr() <em>Line Nr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineNr()
	 * @generated
	 * @ordered
	 */
	protected static final int LINE_NR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLineNr() <em>Line Nr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineNr()
	 * @generated
	 * @ordered
	 */
	protected int lineNr = LINE_NR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLine() <em>Line</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLine()
	 * @generated
	 * @ordered
	 */
	protected TextLine line;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TextLineExportTraceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SuperModTextfileClientPackage.Literals.TEXT_LINE_EXPORT_TRACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLineNr() {
		return lineNr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLineNr(int newLineNr) {
		int oldLineNr = lineNr;
		lineNr = newLineNr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SuperModTextfileClientPackage.TEXT_LINE_EXPORT_TRACE__LINE_NR, oldLineNr, lineNr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextLine getLine() {
		if (line != null && line.eIsProxy()) {
			InternalEObject oldLine = (InternalEObject)line;
			line = (TextLine)eResolveProxy(oldLine);
			if (line != oldLine) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SuperModTextfileClientPackage.TEXT_LINE_EXPORT_TRACE__LINE, oldLine, line));
			}
		}
		return line;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextLine basicGetLine() {
		return line;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLine(TextLine newLine) {
		TextLine oldLine = line;
		line = newLine;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SuperModTextfileClientPackage.TEXT_LINE_EXPORT_TRACE__LINE, oldLine, line));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SuperModTextfileClientPackage.TEXT_LINE_EXPORT_TRACE__LINE_NR:
				return getLineNr();
			case SuperModTextfileClientPackage.TEXT_LINE_EXPORT_TRACE__LINE:
				if (resolve) return getLine();
				return basicGetLine();
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
			case SuperModTextfileClientPackage.TEXT_LINE_EXPORT_TRACE__LINE_NR:
				setLineNr((Integer)newValue);
				return;
			case SuperModTextfileClientPackage.TEXT_LINE_EXPORT_TRACE__LINE:
				setLine((TextLine)newValue);
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
			case SuperModTextfileClientPackage.TEXT_LINE_EXPORT_TRACE__LINE_NR:
				setLineNr(LINE_NR_EDEFAULT);
				return;
			case SuperModTextfileClientPackage.TEXT_LINE_EXPORT_TRACE__LINE:
				setLine((TextLine)null);
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
			case SuperModTextfileClientPackage.TEXT_LINE_EXPORT_TRACE__LINE_NR:
				return lineNr != LINE_NR_EDEFAULT;
			case SuperModTextfileClientPackage.TEXT_LINE_EXPORT_TRACE__LINE:
				return line != null;
		}
		return super.eIsSet(featureID);
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
		result.append(" (lineNr: ");
		result.append(lineNr);
		result.append(')');
		return result.toString();
	}

} //TextLineExportTraceImpl
