/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.mm.core.impl;

import de.ubt.ai1.supermod.mm.core.*;
import java.util.Map;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
 * @date 	2014-07-25
 * <!-- end-user-doc -->
 * @generated
 */
public class SuperModCoreFactoryImpl extends EFactoryImpl implements SuperModCoreFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SuperModCoreFactory init() {
		try {
			SuperModCoreFactory theSuperModCoreFactory = (SuperModCoreFactory)EPackage.Registry.INSTANCE.getEFactory(SuperModCorePackage.eNS_URI);
			if (theSuperModCoreFactory != null) {
				return theSuperModCoreFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SuperModCoreFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SuperModCoreFactoryImpl() {
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
			case SuperModCorePackage.REPOSITORY: return createRepository();
			case SuperModCorePackage.PRODUCT_SPACE: return createProductSpace();
			case SuperModCorePackage.VERSION_SPACE: return createVersionSpace();
			case SuperModCorePackage.INVARIANT: return createInvariant();
			case SuperModCorePackage.PREFERENCE: return createPreference();
			case SuperModCorePackage.DEFAULT_BINDING: return createDefaultBinding();
			case SuperModCorePackage.OPTION: return createOption();
			case SuperModCorePackage.OPTION_BINDING: return createOptionBinding();
			case SuperModCorePackage.OPTION_TO_TRISTATE_MAP_ENTRY: return (EObject)createOptionToTristateMapEntry();
			case SuperModCorePackage.VISIBILITY_EVALUATION_CACHE: return createVisibilityEvaluationCache();
			case SuperModCorePackage.OPTION_EXPR_TO_TRISTATE_MAP_ENTRY: return (EObject)createOptionExprToTristateMapEntry();
			case SuperModCorePackage.VISIBILITY_FOREST: return createVisibilityForest();
			case SuperModCorePackage.VISIBILITY: return createVisibility();
			case SuperModCorePackage.VISIBILITY_REF: return createVisibilityRef();
			case SuperModCorePackage.OPTION_REF: return createOptionRef();
			case SuperModCorePackage.NEG_EXPR: return createNegExpr();
			case SuperModCorePackage.AND_EXPR: return createAndExpr();
			case SuperModCorePackage.OR_EXPR: return createOrExpr();
			case SuperModCorePackage.XOR_EXPR: return createXorExpr();
			case SuperModCorePackage.IMPLIES_EXPR: return createImpliesExpr();
			case SuperModCorePackage.BICONDITIONAL_EXPR: return createBiconditionalExpr();
			case SuperModCorePackage.NAND_EXPR: return createNandExpr();
			case SuperModCorePackage.MINUS_EXPR: return createMinusExpr();
			case SuperModCorePackage.MERGE_EXPR: return createMergeExpr();
			case SuperModCorePackage.BIG_AND_EXPR: return createBigAndExpr();
			case SuperModCorePackage.BIG_OR_EXPR: return createBigOrExpr();
			case SuperModCorePackage.BIG_XOR_EXPR: return createBigXorExpr();
			case SuperModCorePackage.BIG_NAND_EXPR: return createBigNandExpr();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case SuperModCorePackage.TRISTATE:
				return createTristateFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case SuperModCorePackage.TRISTATE:
				return convertTristateToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Repository createRepository() {
		RepositoryImpl repository = new RepositoryImpl();
		return repository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisibilityForest createVisibilityForest() {
		VisibilityForestImpl visibilityForest = new VisibilityForestImpl();
		return visibilityForest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Visibility createVisibility() {
		VisibilityImpl visibility = new VisibilityImpl();
		return visibility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisibilityRef createVisibilityRef() {
		VisibilityRefImpl visibilityRef = new VisibilityRefImpl();
		return visibilityRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductSpace createProductSpace() {
		ProductSpaceImpl productSpace = new ProductSpaceImpl();
		return productSpace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VersionSpace createVersionSpace() {
		VersionSpaceImpl versionSpace = new VersionSpaceImpl();
		return versionSpace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Invariant createInvariant() {
		InvariantImpl invariant = new InvariantImpl();
		return invariant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Preference createPreference() {
		PreferenceImpl preference = new PreferenceImpl();
		return preference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefaultBinding createDefaultBinding() {
		DefaultBindingImpl defaultBinding = new DefaultBindingImpl();
		return defaultBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Option createOption() {
		OptionImpl option = new OptionImpl();
		return option;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OptionBinding createOptionBinding() {
		OptionBindingImpl optionBinding = new OptionBindingImpl();
		return optionBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<Option, Tristate> createOptionToTristateMapEntry() {
		OptionToTristateMapEntryImpl optionToTristateMapEntry = new OptionToTristateMapEntryImpl();
		return optionToTristateMapEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisibilityEvaluationCache createVisibilityEvaluationCache() {
		VisibilityEvaluationCacheImpl visibilityEvaluationCache = new VisibilityEvaluationCacheImpl();
		return visibilityEvaluationCache;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<OptionExpr, Tristate> createOptionExprToTristateMapEntry() {
		OptionExprToTristateMapEntryImpl optionExprToTristateMapEntry = new OptionExprToTristateMapEntryImpl();
		return optionExprToTristateMapEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OptionRef createOptionRef() {
		OptionRefImpl optionRef = new OptionRefImpl();
		return optionRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NegExpr createNegExpr() {
		NegExprImpl negExpr = new NegExprImpl();
		return negExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AndExpr createAndExpr() {
		AndExprImpl andExpr = new AndExprImpl();
		return andExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrExpr createOrExpr() {
		OrExprImpl orExpr = new OrExprImpl();
		return orExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XorExpr createXorExpr() {
		XorExprImpl xorExpr = new XorExprImpl();
		return xorExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImpliesExpr createImpliesExpr() {
		ImpliesExprImpl impliesExpr = new ImpliesExprImpl();
		return impliesExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BiconditionalExpr createBiconditionalExpr() {
		BiconditionalExprImpl biconditionalExpr = new BiconditionalExprImpl();
		return biconditionalExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NandExpr createNandExpr() {
		NandExprImpl nandExpr = new NandExprImpl();
		return nandExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MinusExpr createMinusExpr() {
		MinusExprImpl minusExpr = new MinusExprImpl();
		return minusExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MergeExpr createMergeExpr() {
		MergeExprImpl mergeExpr = new MergeExprImpl();
		return mergeExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigAndExpr createBigAndExpr() {
		BigAndExprImpl bigAndExpr = new BigAndExprImpl();
		return bigAndExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigOrExpr createBigOrExpr() {
		BigOrExprImpl bigOrExpr = new BigOrExprImpl();
		return bigOrExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigXorExpr createBigXorExpr() {
		BigXorExprImpl bigXorExpr = new BigXorExprImpl();
		return bigXorExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigNandExpr createBigNandExpr() {
		BigNandExprImpl bigNandExpr = new BigNandExprImpl();
		return bigNandExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tristate createTristateFromString(EDataType eDataType, String initialValue) {
		Tristate result = Tristate.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTristateToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SuperModCorePackage getSuperModCorePackage() {
		return (SuperModCorePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SuperModCorePackage getPackage() {
		return SuperModCorePackage.eINSTANCE;
	}

} //SuperModCoreFactoryImpl
