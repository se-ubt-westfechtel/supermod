/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.mm.core.util;

import de.ubt.ai1.supermod.mm.core.*;
import java.util.Map;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;

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
 * @date 	2014-07-25
 * <!-- end-user-doc -->
 * @see de.ubt.ai1.supermod.mm.core.SuperModCorePackage
 * @generated
 */
public class SuperModCoreSwitch<T> extends Switch<T>  {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SuperModCorePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SuperModCoreSwitch() {
		if (modelPackage == null) {
			modelPackage = SuperModCorePackage.eINSTANCE;
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
			case SuperModCorePackage.REPOSITORY: {
				Repository repository = (Repository)theEObject;
				T result = caseRepository(repository);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SuperModCorePackage.DIMENSION: {
				Dimension dimension = (Dimension)theEObject;
				T result = caseDimension(dimension);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SuperModCorePackage.ELEMENT: {
				Element element = (Element)theEObject;
				T result = caseElement(element);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SuperModCorePackage.UUID_ELEMENT: {
				UUIDElement uuidElement = (UUIDElement)theEObject;
				T result = caseUUIDElement(uuidElement);
				if (result == null) result = caseElement(uuidElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SuperModCorePackage.PRODUCT_SPACE: {
				ProductSpace productSpace = (ProductSpace)theEObject;
				T result = caseProductSpace(productSpace);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SuperModCorePackage.PRODUCT_DIMENSION: {
				ProductDimension productDimension = (ProductDimension)theEObject;
				T result = caseProductDimension(productDimension);
				if (result == null) result = caseDimension(productDimension);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SuperModCorePackage.PRODUCT_SPACE_ELEMENT: {
				ProductSpaceElement productSpaceElement = (ProductSpaceElement)theEObject;
				T result = caseProductSpaceElement(productSpaceElement);
				if (result == null) result = caseElement(productSpaceElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SuperModCorePackage.VERSION_SPACE: {
				VersionSpace versionSpace = (VersionSpace)theEObject;
				T result = caseVersionSpace(versionSpace);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SuperModCorePackage.VERSION_DIMENSION: {
				VersionDimension versionDimension = (VersionDimension)theEObject;
				T result = caseVersionDimension(versionDimension);
				if (result == null) result = caseDimension(versionDimension);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SuperModCorePackage.VERSION_SPACE_ELEMENT: {
				VersionSpaceElement versionSpaceElement = (VersionSpaceElement)theEObject;
				T result = caseVersionSpaceElement(versionSpaceElement);
				if (result == null) result = caseElement(versionSpaceElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SuperModCorePackage.RULE_BASE_ELEMENT: {
				RuleBaseElement ruleBaseElement = (RuleBaseElement)theEObject;
				T result = caseRuleBaseElement(ruleBaseElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SuperModCorePackage.INVARIANT: {
				Invariant invariant = (Invariant)theEObject;
				T result = caseInvariant(invariant);
				if (result == null) result = caseRuleBaseElement(invariant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SuperModCorePackage.PREFERENCE: {
				Preference preference = (Preference)theEObject;
				T result = casePreference(preference);
				if (result == null) result = caseRuleBaseElement(preference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SuperModCorePackage.DEFAULT_BINDING: {
				DefaultBinding defaultBinding = (DefaultBinding)theEObject;
				T result = caseDefaultBinding(defaultBinding);
				if (result == null) result = caseRuleBaseElement(defaultBinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SuperModCorePackage.OPTION: {
				Option option = (Option)theEObject;
				T result = caseOption(option);
				if (result == null) result = caseRuleBaseElement(option);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SuperModCorePackage.OPTION_BINDING: {
				OptionBinding optionBinding = (OptionBinding)theEObject;
				T result = caseOptionBinding(optionBinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SuperModCorePackage.OPTION_TO_TRISTATE_MAP_ENTRY: {
				@SuppressWarnings("unchecked") Map.Entry<Option, Tristate> optionToTristateMapEntry = (Map.Entry<Option, Tristate>)theEObject;
				T result = caseOptionToTristateMapEntry(optionToTristateMapEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SuperModCorePackage.VISIBILITY_EVALUATION_CACHE: {
				VisibilityEvaluationCache visibilityEvaluationCache = (VisibilityEvaluationCache)theEObject;
				T result = caseVisibilityEvaluationCache(visibilityEvaluationCache);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SuperModCorePackage.OPTION_EXPR_TO_TRISTATE_MAP_ENTRY: {
				@SuppressWarnings("unchecked") Map.Entry<OptionExpr, Tristate> optionExprToTristateMapEntry = (Map.Entry<OptionExpr, Tristate>)theEObject;
				T result = caseOptionExprToTristateMapEntry(optionExprToTristateMapEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SuperModCorePackage.HYBRID_DIMENSION: {
				HybridDimension hybridDimension = (HybridDimension)theEObject;
				T result = caseHybridDimension(hybridDimension);
				if (result == null) result = caseVersionDimension(hybridDimension);
				if (result == null) result = caseProductDimension(hybridDimension);
				if (result == null) result = caseDimension(hybridDimension);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SuperModCorePackage.HYBRID_ELEMENT: {
				HybridElement hybridElement = (HybridElement)theEObject;
				T result = caseHybridElement(hybridElement);
				if (result == null) result = caseProductSpaceElement(hybridElement);
				if (result == null) result = caseVersionSpaceElement(hybridElement);
				if (result == null) result = caseElement(hybridElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SuperModCorePackage.VISIBILITY_FOREST: {
				VisibilityForest visibilityForest = (VisibilityForest)theEObject;
				T result = caseVisibilityForest(visibilityForest);
				if (result == null) result = caseDimension(visibilityForest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SuperModCorePackage.VISIBILITY: {
				Visibility visibility = (Visibility)theEObject;
				T result = caseVisibility(visibility);
				if (result == null) result = caseUUIDElement(visibility);
				if (result == null) result = caseElement(visibility);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SuperModCorePackage.OPTION_EXPR: {
				OptionExpr optionExpr = (OptionExpr)theEObject;
				T result = caseOptionExpr(optionExpr);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SuperModCorePackage.VISIBILITY_REF: {
				VisibilityRef visibilityRef = (VisibilityRef)theEObject;
				T result = caseVisibilityRef(visibilityRef);
				if (result == null) result = caseOptionExpr(visibilityRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SuperModCorePackage.OPTION_REF: {
				OptionRef optionRef = (OptionRef)theEObject;
				T result = caseOptionRef(optionRef);
				if (result == null) result = caseOptionExpr(optionRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SuperModCorePackage.NEG_EXPR: {
				NegExpr negExpr = (NegExpr)theEObject;
				T result = caseNegExpr(negExpr);
				if (result == null) result = caseOptionExpr(negExpr);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SuperModCorePackage.BINARY_EXPR: {
				BinaryExpr binaryExpr = (BinaryExpr)theEObject;
				T result = caseBinaryExpr(binaryExpr);
				if (result == null) result = caseOptionExpr(binaryExpr);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SuperModCorePackage.AND_EXPR: {
				AndExpr andExpr = (AndExpr)theEObject;
				T result = caseAndExpr(andExpr);
				if (result == null) result = caseBinaryExpr(andExpr);
				if (result == null) result = caseOptionExpr(andExpr);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SuperModCorePackage.OR_EXPR: {
				OrExpr orExpr = (OrExpr)theEObject;
				T result = caseOrExpr(orExpr);
				if (result == null) result = caseBinaryExpr(orExpr);
				if (result == null) result = caseOptionExpr(orExpr);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SuperModCorePackage.XOR_EXPR: {
				XorExpr xorExpr = (XorExpr)theEObject;
				T result = caseXorExpr(xorExpr);
				if (result == null) result = caseBinaryExpr(xorExpr);
				if (result == null) result = caseOptionExpr(xorExpr);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SuperModCorePackage.IMPLIES_EXPR: {
				ImpliesExpr impliesExpr = (ImpliesExpr)theEObject;
				T result = caseImpliesExpr(impliesExpr);
				if (result == null) result = caseBinaryExpr(impliesExpr);
				if (result == null) result = caseOptionExpr(impliesExpr);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SuperModCorePackage.BICONDITIONAL_EXPR: {
				BiconditionalExpr biconditionalExpr = (BiconditionalExpr)theEObject;
				T result = caseBiconditionalExpr(biconditionalExpr);
				if (result == null) result = caseBinaryExpr(biconditionalExpr);
				if (result == null) result = caseOptionExpr(biconditionalExpr);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SuperModCorePackage.NAND_EXPR: {
				NandExpr nandExpr = (NandExpr)theEObject;
				T result = caseNandExpr(nandExpr);
				if (result == null) result = caseBinaryExpr(nandExpr);
				if (result == null) result = caseOptionExpr(nandExpr);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SuperModCorePackage.MINUS_EXPR: {
				MinusExpr minusExpr = (MinusExpr)theEObject;
				T result = caseMinusExpr(minusExpr);
				if (result == null) result = caseBinaryExpr(minusExpr);
				if (result == null) result = caseOptionExpr(minusExpr);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SuperModCorePackage.MERGE_EXPR: {
				MergeExpr mergeExpr = (MergeExpr)theEObject;
				T result = caseMergeExpr(mergeExpr);
				if (result == null) result = caseBinaryExpr(mergeExpr);
				if (result == null) result = caseOptionExpr(mergeExpr);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SuperModCorePackage.BIG_EXPR: {
				BigExpr bigExpr = (BigExpr)theEObject;
				T result = caseBigExpr(bigExpr);
				if (result == null) result = caseOptionExpr(bigExpr);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SuperModCorePackage.BIG_AND_EXPR: {
				BigAndExpr bigAndExpr = (BigAndExpr)theEObject;
				T result = caseBigAndExpr(bigAndExpr);
				if (result == null) result = caseBigExpr(bigAndExpr);
				if (result == null) result = caseOptionExpr(bigAndExpr);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SuperModCorePackage.BIG_OR_EXPR: {
				BigOrExpr bigOrExpr = (BigOrExpr)theEObject;
				T result = caseBigOrExpr(bigOrExpr);
				if (result == null) result = caseBigExpr(bigOrExpr);
				if (result == null) result = caseOptionExpr(bigOrExpr);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SuperModCorePackage.BIG_XOR_EXPR: {
				BigXorExpr bigXorExpr = (BigXorExpr)theEObject;
				T result = caseBigXorExpr(bigXorExpr);
				if (result == null) result = caseBigExpr(bigXorExpr);
				if (result == null) result = caseOptionExpr(bigXorExpr);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SuperModCorePackage.BIG_NAND_EXPR: {
				BigNandExpr bigNandExpr = (BigNandExpr)theEObject;
				T result = caseBigNandExpr(bigNandExpr);
				if (result == null) result = caseBigExpr(bigNandExpr);
				if (result == null) result = caseOptionExpr(bigNandExpr);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Repository</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Repository</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRepository(Repository object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dimension</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dimension</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDimension(Dimension object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Visibility Forest</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Visibility Forest</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVisibilityForest(VisibilityForest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Visibility</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Visibility</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVisibility(Visibility object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Product Space</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Product Space</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProductSpace(ProductSpace object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Product Dimension</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Product Dimension</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProductDimension(ProductDimension object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Version Space</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Version Space</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVersionSpace(VersionSpace object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Version Dimension</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Version Dimension</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVersionDimension(VersionDimension object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hybrid Dimension</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hybrid Dimension</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHybridDimension(HybridDimension object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hybrid Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hybrid Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHybridElement(HybridElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rule Base Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rule Base Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRuleBaseElement(RuleBaseElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Invariant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Invariant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInvariant(Invariant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Preference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Preference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePreference(Preference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Default Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Default Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDefaultBinding(DefaultBinding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Option</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Option</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOption(Option object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Option Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Option Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOptionBinding(OptionBinding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Option To Tristate Map Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Option To Tristate Map Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOptionToTristateMapEntry(Map.Entry<Option, Tristate> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Visibility Evaluation Cache</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Visibility Evaluation Cache</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVisibilityEvaluationCache(VisibilityEvaluationCache object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Option Expr To Tristate Map Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Option Expr To Tristate Map Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOptionExprToTristateMapEntry(Map.Entry<OptionExpr, Tristate> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Version Space Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Version Space Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVersionSpaceElement(VersionSpaceElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Option Expr</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Option Expr</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOptionExpr(OptionExpr object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Visibility Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Visibility Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVisibilityRef(VisibilityRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Option Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Option Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOptionRef(OptionRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Neg Expr</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Neg Expr</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNegExpr(NegExpr object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binary Expr</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binary Expr</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBinaryExpr(BinaryExpr object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>And Expr</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>And Expr</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAndExpr(AndExpr object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Or Expr</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Or Expr</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrExpr(OrExpr object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Xor Expr</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Xor Expr</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXorExpr(XorExpr object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Implies Expr</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Implies Expr</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImpliesExpr(ImpliesExpr object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Biconditional Expr</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Biconditional Expr</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBiconditionalExpr(BiconditionalExpr object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nand Expr</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nand Expr</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNandExpr(NandExpr object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Minus Expr</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Minus Expr</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMinusExpr(MinusExpr object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Merge Expr</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Merge Expr</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMergeExpr(MergeExpr object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Big Expr</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Big Expr</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBigExpr(BigExpr object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Big And Expr</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Big And Expr</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBigAndExpr(BigAndExpr object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Big Or Expr</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Big Or Expr</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBigOrExpr(BigOrExpr object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Big Xor Expr</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Big Xor Expr</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBigXorExpr(BigXorExpr object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Big Nand Expr</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Big Nand Expr</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBigNandExpr(BigNandExpr object) {
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

} //SuperModCoreSwitch
