/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.mm.textfile.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import de.ubt.ai1.supermod.mm.textfile.SuperModTextfileFactory;
import de.ubt.ai1.supermod.mm.textfile.SuperModTextfilePackage;
import de.ubt.ai1.supermod.mm.textfile.TextFileContent;
import de.ubt.ai1.supermod.mm.textfile.TextLine;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date 	2014-07-28
 * <!-- end-user-doc -->
 * @generated
 */
public class SuperModTextfileFactoryImpl extends EFactoryImpl implements SuperModTextfileFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SuperModTextfileFactory init() {
		try {
			SuperModTextfileFactory theSuperModTextfileFactory = (SuperModTextfileFactory)EPackage.Registry.INSTANCE.getEFactory(SuperModTextfilePackage.eNS_URI);
			if (theSuperModTextfileFactory != null) {
				return theSuperModTextfileFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SuperModTextfileFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SuperModTextfileFactoryImpl() {
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
			case SuperModTextfilePackage.TEXT_FILE_CONTENT: return createTextFileContent();
			case SuperModTextfilePackage.TEXT_LINE: return createTextLine();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextFileContent createTextFileContent() {
		TextFileContentImpl textFileContent = new TextFileContentImpl();
		return textFileContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextLine createTextLine() {
		TextLineImpl textLine = new TextLineImpl();
		return textLine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SuperModTextfilePackage getSuperModTextfilePackage() {
		return (SuperModTextfilePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SuperModTextfilePackage getPackage() {
		return SuperModTextfilePackage.eINSTANCE;
	}

} //SuperModTextfileFactoryImpl
