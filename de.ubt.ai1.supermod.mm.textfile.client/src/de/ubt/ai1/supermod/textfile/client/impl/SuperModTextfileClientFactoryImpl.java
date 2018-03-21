/**
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package de.ubt.ai1.supermod.textfile.client.impl;

import de.ubt.ai1.supermod.textfile.client.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SuperModTextfileClientFactoryImpl extends EFactoryImpl implements SuperModTextfileClientFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SuperModTextfileClientFactory init() {
		try {
			SuperModTextfileClientFactory theSuperModTextfileClientFactory = (SuperModTextfileClientFactory)EPackage.Registry.INSTANCE.getEFactory(SuperModTextfileClientPackage.eNS_URI);
			if (theSuperModTextfileClientFactory != null) {
				return theSuperModTextfileClientFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SuperModTextfileClientFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SuperModTextfileClientFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case SuperModTextfileClientPackage.TEXT_FILE_EXPORT_TRACE: return createTextFileExportTrace();
			case SuperModTextfileClientPackage.TEXT_LINE_EXPORT_TRACE: return createTextLineExportTrace();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextFileExportTrace createTextFileExportTrace() {
		TextFileExportTraceImpl textFileExportTrace = new TextFileExportTraceImpl();
		return textFileExportTrace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextLineExportTrace createTextLineExportTrace() {
		TextLineExportTraceImpl textLineExportTrace = new TextLineExportTraceImpl();
		return textLineExportTrace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SuperModTextfileClientPackage getSuperModTextfileClientPackage() {
		return (SuperModTextfileClientPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SuperModTextfileClientPackage getPackage() {
		return SuperModTextfileClientPackage.eINSTANCE;
	}

} //SuperModTextfileClientFactoryImpl
