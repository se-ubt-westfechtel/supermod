/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.mm.core.impl;

import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import de.ubt.ai1.supermod.mm.core.AndExpr;
import de.ubt.ai1.supermod.mm.core.BiconditionalExpr;
import de.ubt.ai1.supermod.mm.core.ImpliesExpr;
import de.ubt.ai1.supermod.mm.core.MinusExpr;
import de.ubt.ai1.supermod.mm.core.NandExpr;
import de.ubt.ai1.supermod.mm.core.NegExpr;
import de.ubt.ai1.supermod.mm.core.Option;
import de.ubt.ai1.supermod.mm.core.OptionBinding;
import de.ubt.ai1.supermod.mm.core.OptionExpr;
import de.ubt.ai1.supermod.mm.core.OrExpr;
import de.ubt.ai1.supermod.mm.core.SuperModCoreFactory;
import de.ubt.ai1.supermod.mm.core.SuperModCorePackage;
import de.ubt.ai1.supermod.mm.core.Tristate;
import de.ubt.ai1.supermod.mm.core.VersionDimension;
import de.ubt.ai1.supermod.mm.core.VisibilityEvaluationCache;
import de.ubt.ai1.supermod.mm.core.XorExpr;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Option Expr</b></em>'.
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date 	2014-07-25
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai1.supermod.mm.core.impl.OptionExprImpl#getReferencedOptions <em>Referenced Options</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.core.impl.OptionExprImpl#getReferencedDimensions <em>Referenced Dimensions</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class OptionExprImpl extends MinimalEObjectImpl.Container implements OptionExpr {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OptionExprImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SuperModCorePackage.Literals.OPTION_EXPR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public abstract EList<Option> getReferencedOptions();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public abstract EList<VersionDimension> getReferencedDimensions();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Tristate apply(OptionBinding binding, VisibilityEvaluationCache cache) {
		if (cache == null) {
			return apply(binding);
		}
		Tristate cachedState = cache.get(this);
		if (cachedState == null) {
			cachedState = apply(binding);
			cache.save(this, cachedState);
		}
		return cachedState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public abstract Tristate apply(OptionBinding binding);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public NegExpr not() {
		NegExpr not = SuperModCoreFactory.eINSTANCE.createNegExpr();
		not.setNeg(this);
		return not;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public AndExpr and(OptionExpr other) {
		AndExpr and = SuperModCoreFactory.eINSTANCE.createAndExpr();
		and.setLeft(this);
		and.setRight(other);
		return and;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public OrExpr or(OptionExpr other) {
		OrExpr or = SuperModCoreFactory.eINSTANCE.createOrExpr();
		or.setLeft(this);
		or.setRight(other);
		return or;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public XorExpr xor(OptionExpr other) {
		XorExpr xor = SuperModCoreFactory.eINSTANCE.createXorExpr();
		xor.setLeft(this);
		xor.setRight(other);
		return xor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public ImpliesExpr implies(OptionExpr other) {
		ImpliesExpr implies = SuperModCoreFactory.eINSTANCE.createImpliesExpr();
		implies.setLeft(this);
		implies.setRight(other);
		return implies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public BiconditionalExpr iff(OptionExpr other) {
		BiconditionalExpr bicon = SuperModCoreFactory.eINSTANCE.createBiconditionalExpr();
		bicon.setLeft(this);
		bicon.setRight(other);
		return bicon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public NandExpr nand(OptionExpr other) {
		NandExpr nand = SuperModCoreFactory.eINSTANCE.createNandExpr();
		nand.setLeft(this);
		nand.setRight(other);
		return nand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public MinusExpr minus(OptionExpr other) {
		MinusExpr minus = SuperModCoreFactory.eINSTANCE.createMinusExpr();
		minus.setLeft(this);
		minus.setRight(other);
		return minus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public abstract OptionExpr extract();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SuperModCorePackage.OPTION_EXPR__REFERENCED_OPTIONS:
				return getReferencedOptions();
			case SuperModCorePackage.OPTION_EXPR__REFERENCED_DIMENSIONS:
				return getReferencedDimensions();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SuperModCorePackage.OPTION_EXPR__REFERENCED_OPTIONS:
				return !getReferencedOptions().isEmpty();
			case SuperModCorePackage.OPTION_EXPR__REFERENCED_DIMENSIONS:
				return !getReferencedDimensions().isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case SuperModCorePackage.OPTION_EXPR___APPLY__OPTIONBINDING_VISIBILITYEVALUATIONCACHE:
				return apply((OptionBinding)arguments.get(0), (VisibilityEvaluationCache)arguments.get(1));
			case SuperModCorePackage.OPTION_EXPR___APPLY__OPTIONBINDING:
				return apply((OptionBinding)arguments.get(0));
			case SuperModCorePackage.OPTION_EXPR___NOT:
				return not();
			case SuperModCorePackage.OPTION_EXPR___AND__OPTIONEXPR:
				return and((OptionExpr)arguments.get(0));
			case SuperModCorePackage.OPTION_EXPR___OR__OPTIONEXPR:
				return or((OptionExpr)arguments.get(0));
			case SuperModCorePackage.OPTION_EXPR___XOR__OPTIONEXPR:
				return xor((OptionExpr)arguments.get(0));
			case SuperModCorePackage.OPTION_EXPR___IMPLIES__OPTIONEXPR:
				return implies((OptionExpr)arguments.get(0));
			case SuperModCorePackage.OPTION_EXPR___IFF__OPTIONEXPR:
				return iff((OptionExpr)arguments.get(0));
			case SuperModCorePackage.OPTION_EXPR___NAND__OPTIONEXPR:
				return nand((OptionExpr)arguments.get(0));
			case SuperModCorePackage.OPTION_EXPR___MINUS__OPTIONEXPR:
				return minus((OptionExpr)arguments.get(0));
			case SuperModCorePackage.OPTION_EXPR___EXTRACT:
				return extract();
		}
		return super.eInvoke(operationID, arguments);
	}

} //OptionExprImpl
