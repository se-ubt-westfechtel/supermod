/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.mm.core.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;

import de.ubt.ai1.supermod.mm.core.AndExpr;
import de.ubt.ai1.supermod.mm.core.NegExpr;
import de.ubt.ai1.supermod.mm.core.Option;
import de.ubt.ai1.supermod.mm.core.OptionBinding;
import de.ubt.ai1.supermod.mm.core.OptionExpr;
import de.ubt.ai1.supermod.mm.core.OptionRef;
import de.ubt.ai1.supermod.mm.core.SuperModCoreFactory;
import de.ubt.ai1.supermod.mm.core.SuperModCorePackage;
import de.ubt.ai1.supermod.mm.core.Tristate;
import de.ubt.ai1.supermod.mm.core.util.TristateUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Option Binding</b></em>'.
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date 	2014-07-25
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai1.supermod.mm.core.impl.OptionBindingImpl#getBoundOptions <em>Bound Options</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.core.impl.OptionBindingImpl#getNumberOfBindings <em>Number Of Bindings</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OptionBindingImpl extends MinimalEObjectImpl.Container implements OptionBinding {
	/**
	 * The cached value of the '{@link #getBoundOptions() <em>Bound Options</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoundOptions()
	 * @generated
	 * @ordered
	 */
	protected EMap<Option, Tristate> boundOptions;

	/**
	 * The default value of the '{@link #getNumberOfBindings() <em>Number Of Bindings</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfBindings()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_OF_BINDINGS_EDEFAULT = 0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OptionBindingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SuperModCorePackage.Literals.OPTION_BINDING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<Option, Tristate> getBoundOptions() {
		if (boundOptions == null) {
			boundOptions = new EcoreEMap<Option,Tristate>(SuperModCorePackage.Literals.OPTION_TO_TRISTATE_MAP_ENTRY, OptionToTristateMapEntryImpl.class, this, SuperModCorePackage.OPTION_BINDING__BOUND_OPTIONS);
		}
		return boundOptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public int getNumberOfBindings() {
		int numberOfBindings = 0;
		for (Entry<Option, Tristate> e : getBoundOptions().entrySet()) {
			if (e.getValue() != null && e.getValue() != Tristate.UNKNOWN) {
				numberOfBindings++;
			}
		}
		return numberOfBindings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Tristate getState(Option option) {
		return getBoundOptions().get(option);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Tristate implies(OptionBinding other) {
		Tristate implies = Tristate.TRUE;
		for (Option o : other.getBoundOptions().keySet()) {
			Tristate thisState = getState(o);
			if (thisState == null) {
				thisState = Tristate.UNKNOWN;
			}
			Tristate otherState = other.getState(o);
			if (otherState == null) {
				otherState = Tristate.UNKNOWN;
			}
			Tristate tempImplies = TristateUtil.biconditionallyImplies(
					thisState, otherState);
			if (tempImplies == Tristate.FALSE) {
				return Tristate.FALSE;
			}
			implies = TristateUtil.and(implies, tempImplies);			
		}
		return implies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public OptionExpr toVisibility() {
		OptionExpr expr = null;
		for (Entry<Option, Tristate> e : getBoundOptions().entrySet()) {
			if (e.getKey() != null && e.getValue() != Tristate.UNKNOWN) {
				OptionRef ref = SuperModCoreFactory.eINSTANCE.createOptionRef();
				ref.setOption(e.getKey());
				OptionExpr current = null;
				if (e.getValue() == Tristate.TRUE) {
					current = ref;
				}
				else {
					NegExpr neg = SuperModCoreFactory.eINSTANCE.createNegExpr();
					neg.setNeg(ref);
					current = neg;
				}
				if (expr == null) {
					expr = current;
				}
				else {
					AndExpr and = SuperModCoreFactory.eINSTANCE.createAndExpr();
					and.setLeft(expr);
					and.setRight(current);
					expr = and;
				}
			}
		}
		return expr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void bind(Option option, Tristate state) {
		if (state == Tristate.TRUE || state == Tristate.FALSE) {
			getBoundOptions().put(option, state);
		}
		else if (state == Tristate.UNKNOWN) {
			getBoundOptions().removeKey(option);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public OptionBinding combine(OptionBinding other) {
		OptionBinding combined = SuperModCoreFactory.eINSTANCE
				.createOptionBinding();
		Set<Option> boundOptions = new HashSet<>(getBoundOptions().keySet());
		boundOptions.addAll(other.getBoundOptions().keySet());
		for (Option o : boundOptions) {
			Tristate thisState = getState(o);
			if (thisState == null) {
				thisState = Tristate.UNKNOWN;
			}
			Tristate otherState = other.getState(o);
			if (otherState == null) {
				otherState = Tristate.UNKNOWN;
			}
			if (thisState == Tristate.TRUE && otherState == Tristate.FALSE) {
				return null;
			}
			if (thisState == Tristate.FALSE && otherState == Tristate.TRUE) {
				return null;
			}
			if (thisState == Tristate.TRUE || otherState == Tristate.TRUE) {
				combined.bind(o, Tristate.TRUE);
			}
			if (thisState == Tristate.FALSE || otherState == Tristate.FALSE) {
				combined.bind(o, Tristate.FALSE);
			}
		}
		return combined;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void clear() {
		getBoundOptions().clear();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SuperModCorePackage.OPTION_BINDING__BOUND_OPTIONS:
				return ((InternalEList<?>)getBoundOptions()).basicRemove(otherEnd, msgs);
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
			case SuperModCorePackage.OPTION_BINDING__BOUND_OPTIONS:
				if (coreType) return getBoundOptions();
				else return getBoundOptions().map();
			case SuperModCorePackage.OPTION_BINDING__NUMBER_OF_BINDINGS:
				return getNumberOfBindings();
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
			case SuperModCorePackage.OPTION_BINDING__BOUND_OPTIONS:
				((EStructuralFeature.Setting)getBoundOptions()).set(newValue);
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
			case SuperModCorePackage.OPTION_BINDING__BOUND_OPTIONS:
				getBoundOptions().clear();
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
			case SuperModCorePackage.OPTION_BINDING__BOUND_OPTIONS:
				return boundOptions != null && !boundOptions.isEmpty();
			case SuperModCorePackage.OPTION_BINDING__NUMBER_OF_BINDINGS:
				return getNumberOfBindings() != NUMBER_OF_BINDINGS_EDEFAULT;
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
			case SuperModCorePackage.OPTION_BINDING___GET_STATE__OPTION:
				return getState((Option)arguments.get(0));
			case SuperModCorePackage.OPTION_BINDING___IMPLIES__OPTIONBINDING:
				return implies((OptionBinding)arguments.get(0));
			case SuperModCorePackage.OPTION_BINDING___TO_VISIBILITY:
				return toVisibility();
			case SuperModCorePackage.OPTION_BINDING___BIND__OPTION_TRISTATE:
				bind((Option)arguments.get(0), (Tristate)arguments.get(1));
				return null;
			case SuperModCorePackage.OPTION_BINDING___COMBINE__OPTIONBINDING:
				return combine((OptionBinding)arguments.get(0));
			case SuperModCorePackage.OPTION_BINDING___CLEAR:
				clear();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (Map.Entry<Option, Tristate> e : getBoundOptions().entrySet()) {
			sb.append(e.toString() + "\n");
		}
		return sb.toString();
	}
	
} //OptionBindingImpl
