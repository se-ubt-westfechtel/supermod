/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.mm.emffile.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
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
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date 	2014-07-28
 * <!-- end-user-doc -->
 * @see de.ubt.ai1.supermod.mm.emffile.SuperModEMFFilePackage
 * @generated
 */
public class SuperModEMFFileAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SuperModEMFFilePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SuperModEMFFileAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = SuperModEMFFilePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SuperModEMFFileSwitch<Adapter> modelSwitch =
		new SuperModEMFFileSwitch<Adapter>() {
			@Override
			public Adapter caseEMFFileContent(EMFFileContent object) {
				return createEMFFileContentAdapter();
			}
			@Override
			public Adapter caseEMFObject(EMFObject object) {
				return createEMFObjectAdapter();
			}
			@Override
			public Adapter caseEMFClassRef(EMFClassRef object) {
				return createEMFClassRefAdapter();
			}
			@Override
			public Adapter caseEMFFeatureRef(EMFFeatureRef object) {
				return createEMFFeatureRefAdapter();
			}
			@Override
			public Adapter caseEMFValue(EMFValue object) {
				return createEMFValueAdapter();
			}
			@Override
			public Adapter caseEMFAttributeValue(EMFAttributeValue object) {
				return createEMFAttributeValueAdapter();
			}
			@Override
			public Adapter caseEMFInternalReferenceValue(EMFInternalReferenceValue object) {
				return createEMFInternalReferenceValueAdapter();
			}
			@Override
			public Adapter caseEMFExternalReferenceValue(EMFExternalReferenceValue object) {
				return createEMFExternalReferenceValueAdapter();
			}
			@Override
			public Adapter caseEMFContainmentReferenceValue(EMFContainmentReferenceValue object) {
				return createEMFContainmentReferenceValueAdapter();
			}
			@Override
			public Adapter caseElement(Element object) {
				return createElementAdapter();
			}
			@Override
			public Adapter caseProductSpaceElement(ProductSpaceElement object) {
				return createProductSpaceElementAdapter();
			}
			@Override
			public Adapter caseVersionedFileContent(VersionedFileContent object) {
				return createVersionedFileContentAdapter();
			}
			@Override
			public Adapter caseUUIDElement(UUIDElement object) {
				return createUUIDElementAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link de.ubt.ai1.supermod.mm.emffile.EMFFileContent <em>EMF File Content</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ubt.ai1.supermod.mm.emffile.EMFFileContent
	 * @generated
	 */
	public Adapter createEMFFileContentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.ubt.ai1.supermod.mm.emffile.EMFObject <em>EMF Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ubt.ai1.supermod.mm.emffile.EMFObject
	 * @generated
	 */
	public Adapter createEMFObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.ubt.ai1.supermod.mm.emffile.EMFClassRef <em>EMF Class Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ubt.ai1.supermod.mm.emffile.EMFClassRef
	 * @generated
	 */
	public Adapter createEMFClassRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.ubt.ai1.supermod.mm.emffile.EMFFeatureRef <em>EMF Feature Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ubt.ai1.supermod.mm.emffile.EMFFeatureRef
	 * @generated
	 */
	public Adapter createEMFFeatureRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.ubt.ai1.supermod.mm.emffile.EMFValue <em>EMF Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ubt.ai1.supermod.mm.emffile.EMFValue
	 * @generated
	 */
	public Adapter createEMFValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.ubt.ai1.supermod.mm.emffile.EMFAttributeValue <em>EMF Attribute Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ubt.ai1.supermod.mm.emffile.EMFAttributeValue
	 * @generated
	 */
	public Adapter createEMFAttributeValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.ubt.ai1.supermod.mm.emffile.EMFInternalReferenceValue <em>EMF Internal Reference Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ubt.ai1.supermod.mm.emffile.EMFInternalReferenceValue
	 * @generated
	 */
	public Adapter createEMFInternalReferenceValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.ubt.ai1.supermod.mm.emffile.EMFExternalReferenceValue <em>EMF External Reference Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ubt.ai1.supermod.mm.emffile.EMFExternalReferenceValue
	 * @generated
	 */
	public Adapter createEMFExternalReferenceValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.ubt.ai1.supermod.mm.emffile.EMFContainmentReferenceValue <em>EMF Containment Reference Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ubt.ai1.supermod.mm.emffile.EMFContainmentReferenceValue
	 * @generated
	 */
	public Adapter createEMFContainmentReferenceValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.ubt.ai1.supermod.mm.core.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ubt.ai1.supermod.mm.core.Element
	 * @generated
	 */
	public Adapter createElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.ubt.ai1.supermod.mm.core.ProductSpaceElement <em>Product Space Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ubt.ai1.supermod.mm.core.ProductSpaceElement
	 * @generated
	 */
	public Adapter createProductSpaceElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.ubt.ai1.supermod.mm.file.VersionedFileContent <em>Versioned File Content</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ubt.ai1.supermod.mm.file.VersionedFileContent
	 * @generated
	 */
	public Adapter createVersionedFileContentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.ubt.ai1.supermod.mm.core.UUIDElement <em>UUID Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.ubt.ai1.supermod.mm.core.UUIDElement
	 * @generated
	 */
	public Adapter createUUIDElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //SuperModEMFFileAdapterFactory
