/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.mm.emffile.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import de.ubt.ai1.supermod.mm.core.Element;
import de.ubt.ai1.supermod.mm.core.ProductSpaceElement;
import de.ubt.ai1.supermod.mm.core.UUIDElement;
import de.ubt.ai1.supermod.mm.emffile.EMFAttributeValue;
import de.ubt.ai1.supermod.mm.emffile.EMFClassRef;
import de.ubt.ai1.supermod.mm.emffile.EMFContainmentReferenceValue;
import de.ubt.ai1.supermod.mm.emffile.EMFExternalReferenceValue;
import de.ubt.ai1.supermod.mm.emffile.EMFFeatureRef;
import de.ubt.ai1.supermod.mm.emffile.EMFFileContent;
import de.ubt.ai1.supermod.mm.emffile.EMFInternalReferenceValue;
import de.ubt.ai1.supermod.mm.emffile.EMFObject;
import de.ubt.ai1.supermod.mm.emffile.EMFValue;
import de.ubt.ai1.supermod.mm.emffile.SuperModEMFFilePackage;
import de.ubt.ai1.supermod.mm.file.VersionedFileContent;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date 	2014-07-28
 * <!-- end-user-doc -->
 * @see de.ubt.ai1.supermod.mm.emffile.SuperModEMFFilePackage
 * @generated
 */
public class SuperModEMFFileSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SuperModEMFFilePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SuperModEMFFileSwitch() {
		if (modelPackage == null) {
			modelPackage = SuperModEMFFilePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case SuperModEMFFilePackage.EMF_FILE_CONTENT: {
				EMFFileContent emfFileContent = (EMFFileContent)theEObject;
				T result = caseEMFFileContent(emfFileContent);
				if (result == null) result = caseVersionedFileContent(emfFileContent);
				if (result == null) result = caseProductSpaceElement(emfFileContent);
				if (result == null) result = caseElement(emfFileContent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SuperModEMFFilePackage.EMF_OBJECT: {
				EMFObject emfObject = (EMFObject)theEObject;
				T result = caseEMFObject(emfObject);
				if (result == null) result = caseProductSpaceElement(emfObject);
				if (result == null) result = caseUUIDElement(emfObject);
				if (result == null) result = caseElement(emfObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SuperModEMFFilePackage.EMF_CLASS_REF: {
				EMFClassRef emfClassRef = (EMFClassRef)theEObject;
				T result = caseEMFClassRef(emfClassRef);
				if (result == null) result = caseProductSpaceElement(emfClassRef);
				if (result == null) result = caseElement(emfClassRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SuperModEMFFilePackage.EMF_FEATURE_REF: {
				EMFFeatureRef emfFeatureRef = (EMFFeatureRef)theEObject;
				T result = caseEMFFeatureRef(emfFeatureRef);
				if (result == null) result = caseProductSpaceElement(emfFeatureRef);
				if (result == null) result = caseElement(emfFeatureRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SuperModEMFFilePackage.EMF_VALUE: {
				EMFValue emfValue = (EMFValue)theEObject;
				T result = caseEMFValue(emfValue);
				if (result == null) result = caseProductSpaceElement(emfValue);
				if (result == null) result = caseElement(emfValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SuperModEMFFilePackage.EMF_ATTRIBUTE_VALUE: {
				EMFAttributeValue emfAttributeValue = (EMFAttributeValue)theEObject;
				T result = caseEMFAttributeValue(emfAttributeValue);
				if (result == null) result = caseEMFValue(emfAttributeValue);
				if (result == null) result = caseProductSpaceElement(emfAttributeValue);
				if (result == null) result = caseElement(emfAttributeValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SuperModEMFFilePackage.EMF_INTERNAL_REFERENCE_VALUE: {
				EMFInternalReferenceValue emfInternalReferenceValue = (EMFInternalReferenceValue)theEObject;
				T result = caseEMFInternalReferenceValue(emfInternalReferenceValue);
				if (result == null) result = caseEMFValue(emfInternalReferenceValue);
				if (result == null) result = caseProductSpaceElement(emfInternalReferenceValue);
				if (result == null) result = caseElement(emfInternalReferenceValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SuperModEMFFilePackage.EMF_EXTERNAL_REFERENCE_VALUE: {
				EMFExternalReferenceValue emfExternalReferenceValue = (EMFExternalReferenceValue)theEObject;
				T result = caseEMFExternalReferenceValue(emfExternalReferenceValue);
				if (result == null) result = caseEMFValue(emfExternalReferenceValue);
				if (result == null) result = caseProductSpaceElement(emfExternalReferenceValue);
				if (result == null) result = caseElement(emfExternalReferenceValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SuperModEMFFilePackage.EMF_CONTAINMENT_REFERENCE_VALUE: {
				EMFContainmentReferenceValue emfContainmentReferenceValue = (EMFContainmentReferenceValue)theEObject;
				T result = caseEMFContainmentReferenceValue(emfContainmentReferenceValue);
				if (result == null) result = caseEMFInternalReferenceValue(emfContainmentReferenceValue);
				if (result == null) result = caseEMFValue(emfContainmentReferenceValue);
				if (result == null) result = caseProductSpaceElement(emfContainmentReferenceValue);
				if (result == null) result = caseElement(emfContainmentReferenceValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EMF File Content</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EMF File Content</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEMFFileContent(EMFFileContent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EMF Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EMF Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEMFObject(EMFObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EMF Class Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EMF Class Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEMFClassRef(EMFClassRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EMF Feature Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EMF Feature Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEMFFeatureRef(EMFFeatureRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EMF Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EMF Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEMFValue(EMFValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EMF Attribute Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EMF Attribute Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEMFAttributeValue(EMFAttributeValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EMF Internal Reference Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EMF Internal Reference Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEMFInternalReferenceValue(EMFInternalReferenceValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EMF External Reference Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EMF External Reference Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEMFExternalReferenceValue(EMFExternalReferenceValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EMF Containment Reference Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EMF Containment Reference Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEMFContainmentReferenceValue(EMFContainmentReferenceValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElement(Element object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Product Space Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Product Space Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProductSpaceElement(ProductSpaceElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Versioned File Content</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Versioned File Content</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVersionedFileContent(VersionedFileContent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UUID Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UUID Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUUIDElement(UUIDElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //SuperModEMFFileSwitch
