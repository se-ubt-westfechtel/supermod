/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.mm.emffile.impl;

import de.ubt.ai1.supermod.mm.emffile.*;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

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
public class SuperModEMFFileFactoryImpl extends EFactoryImpl implements SuperModEMFFileFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SuperModEMFFileFactory init() {
		try {
			SuperModEMFFileFactory theSuperModEMFFileFactory = (SuperModEMFFileFactory)EPackage.Registry.INSTANCE.getEFactory(SuperModEMFFilePackage.eNS_URI);
			if (theSuperModEMFFileFactory != null) {
				return theSuperModEMFFileFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SuperModEMFFileFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SuperModEMFFileFactoryImpl() {
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
			case SuperModEMFFilePackage.EMF_FILE_CONTENT: return createEMFFileContent();
			case SuperModEMFFilePackage.EMF_OBJECT: return createEMFObject();
			case SuperModEMFFilePackage.EMF_CLASS_REF: return createEMFClassRef();
			case SuperModEMFFilePackage.EMF_FEATURE_REF: return createEMFFeatureRef();
			case SuperModEMFFilePackage.EMF_ATTRIBUTE_VALUE: return createEMFAttributeValue();
			case SuperModEMFFilePackage.EMF_INTERNAL_REFERENCE_VALUE: return createEMFInternalReferenceValue();
			case SuperModEMFFilePackage.EMF_EXTERNAL_REFERENCE_VALUE: return createEMFExternalReferenceValue();
			case SuperModEMFFilePackage.EMF_CONTAINMENT_REFERENCE_VALUE: return createEMFContainmentReferenceValue();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMFFileContent createEMFFileContent() {
		EMFFileContentImpl emfFileContent = new EMFFileContentImpl();
		return emfFileContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMFObject createEMFObject() {
		EMFObjectImpl emfObject = new EMFObjectImpl();
		return emfObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMFClassRef createEMFClassRef() {
		EMFClassRefImpl emfClassRef = new EMFClassRefImpl();
		return emfClassRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMFFeatureRef createEMFFeatureRef() {
		EMFFeatureRefImpl emfFeatureRef = new EMFFeatureRefImpl();
		return emfFeatureRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMFAttributeValue createEMFAttributeValue() {
		EMFAttributeValueImpl emfAttributeValue = new EMFAttributeValueImpl();
		return emfAttributeValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMFInternalReferenceValue createEMFInternalReferenceValue() {
		EMFInternalReferenceValueImpl emfInternalReferenceValue = new EMFInternalReferenceValueImpl();
		return emfInternalReferenceValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMFExternalReferenceValue createEMFExternalReferenceValue() {
		EMFExternalReferenceValueImpl emfExternalReferenceValue = new EMFExternalReferenceValueImpl();
		return emfExternalReferenceValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMFContainmentReferenceValue createEMFContainmentReferenceValue() {
		EMFContainmentReferenceValueImpl emfContainmentReferenceValue = new EMFContainmentReferenceValueImpl();
		return emfContainmentReferenceValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SuperModEMFFilePackage getSuperModEMFFilePackage() {
		return (SuperModEMFFilePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SuperModEMFFilePackage getPackage() {
		return SuperModEMFFilePackage.eINSTANCE;
	}

} //SuperModEMFFileFactoryImpl
