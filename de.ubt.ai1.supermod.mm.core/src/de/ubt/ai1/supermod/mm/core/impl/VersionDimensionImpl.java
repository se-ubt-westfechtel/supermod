/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.mm.core.impl;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;

import de.ubt.ai1.supermod.mm.core.DefaultBinding;
import de.ubt.ai1.supermod.mm.core.Element;
import de.ubt.ai1.supermod.mm.core.Invariant;
import de.ubt.ai1.supermod.mm.core.Option;
import de.ubt.ai1.supermod.mm.core.OptionBinding;
import de.ubt.ai1.supermod.mm.core.OptionExpr;
import de.ubt.ai1.supermod.mm.core.Preference;
import de.ubt.ai1.supermod.mm.core.Repository;
import de.ubt.ai1.supermod.mm.core.SuperModCoreFactory;
import de.ubt.ai1.supermod.mm.core.SuperModCorePackage;
import de.ubt.ai1.supermod.mm.core.Tristate;
import de.ubt.ai1.supermod.mm.core.VersionDimension;
import de.ubt.ai1.supermod.mm.core.VersionSpace;
import de.ubt.ai1.supermod.mm.core.VersionSpaceElement;
import de.ubt.ai1.supermod.mm.core.util.SatUtil;
import de.ubt.ai1.supermod.mm.core.util.TristateUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rule Base Dimension</b></em>'.
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date 	2014-07-25
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai1.supermod.mm.core.impl.VersionDimensionImpl#getOptions <em>Options</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.core.impl.VersionDimensionImpl#getInvariants <em>Invariants</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.core.impl.VersionDimensionImpl#getPreferences <em>Preferences</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.core.impl.VersionDimensionImpl#getDefaultBindings <em>Default Bindings</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.core.impl.VersionDimensionImpl#getRootVersionSpaceElements <em>Root Version Space Elements</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.core.impl.VersionDimensionImpl#getAllVersionSpaceElements <em>All Version Space Elements</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.core.impl.VersionDimensionImpl#getVersionSpace <em>Version Space</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class VersionDimensionImpl extends DimensionImpl implements VersionDimension {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VersionDimensionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SuperModCorePackage.Literals.VERSION_DIMENSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public abstract EList<Option> getOptions();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public abstract EList<Invariant> getInvariants();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public abstract EList<Preference> getPreferences();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public abstract EList<DefaultBinding> getDefaultBindings();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public abstract EList<VersionSpaceElement> getRootVersionSpaceElements();
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<VersionSpaceElement> getAllVersionSpaceElements() {
		EList<VersionSpaceElement> allVsElements = ECollections.newBasicEList();
		for (VersionSpaceElement root : getRootVersionSpaceElements()) {
			allVsElements.add(root);
			allVsElements.addAll(root.getAllSubVersionSpaceElements());
		}
		return ECollections.unmodifiableEList(allVsElements);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VersionSpace getVersionSpace() {
		VersionSpace versionSpace = basicGetVersionSpace();
		return versionSpace != null && versionSpace.eIsProxy() ? (VersionSpace)eResolveProxy((InternalEObject)versionSpace) : versionSpace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public VersionSpace basicGetVersionSpace() {
		if (eResource() != null) {
			URI repoUri = eResource().getURI().trimFileExtension()
					.appendFileExtension("rep");
			Resource repoRes = eResource().getResourceSet()
					.getResource(repoUri, true);
			try {
				repoRes.load(null);
			} catch (IOException e) {
				e.printStackTrace();
			}
			if (!repoRes.getContents().isEmpty() && 
					repoRes.getContents().get(0) instanceof Repository) {
				return ((Repository) repoRes.getContents().get(0))
						.getVersionSpace();
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Tristate validate(OptionBinding optionBinding) {
		Tristate state = Tristate.TRUE;
		for (Invariant inv : getInvariants()) {
			Tristate invState = inv.getOptionExpr().apply(optionBinding);
			state = TristateUtil.and(state, invState);
			if (state == Tristate.FALSE) {
				break;
			}
		}
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isComplete(OptionBinding optionBinding) {
		for (Option o : getOptions()) {
			if (!optionBinding.getBoundOptions().containsKey(o)
					|| optionBinding.getBoundOptions().get(o) == Tristate.UNKNOWN) {
				return false;
			}
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isSatisfiable(OptionBinding premise) {
		if (premise == null) {
			premise = SuperModCoreFactory.eINSTANCE.createOptionBinding();
		}
		List<OptionExpr> exprs = new LinkedList<>();
		Set<Option> options = new HashSet<>();
		for (Invariant inv : getInvariants()) {
			exprs.add(inv.getOptionExpr());
			options.addAll(inv.getOptionExpr().getReferencedOptions());
		}
		for (Option o : premise.getBoundOptions().keySet()) {
			options.add(o);
		}
		return SatUtil.isSatisfiable(new ArrayList<Option>(options),
				exprs, premise);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public OptionBinding applyPreferences(OptionBinding optionBinding) {
		OptionBinding obWithPrefs = EcoreUtil.copy(optionBinding);
		if (obWithPrefs == null) {
			obWithPrefs = SuperModCoreFactory.eINSTANCE.createOptionBinding();
		}
		for (Preference pref : getPreferences()) {
			Tristate state = obWithPrefs.getBoundOptions().get(pref.getOption());
			if (state == null || state == Tristate.UNKNOWN) {
				Tristate newState = pref.getOptionExpr().apply(optionBinding);
				if (newState != null && newState != Tristate.UNKNOWN) {
					obWithPrefs.bind(pref.getOption(), newState);
				}
			}
		}
		return obWithPrefs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public OptionBinding applyDefaults(OptionBinding optionBinding) {
		OptionBinding obWithDefs = EcoreUtil.copy(optionBinding);
		if (obWithDefs == null) {
			obWithDefs = SuperModCoreFactory.eINSTANCE.createOptionBinding();
		}
		for (DefaultBinding def : getDefaultBindings()) {
			Tristate state = obWithDefs.getBoundOptions().get(def.getOption());
			if (state == null || state == Tristate.UNKNOWN) {
				Tristate newState = def.getState();
				if (newState != null && newState != Tristate.UNKNOWN) {
					obWithDefs.bind(def.getOption(), newState);
				}				
			}
		}
		return obWithDefs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public OptionBinding applyCompletions(OptionBinding optionBinding) {
		int previousBindings = 0;
		int currentBindings = 0;
		OptionBinding current = optionBinding;
		do {
			current = applyPreferences(current);
			previousBindings = currentBindings;
			currentBindings = current.getNumberOfBindings();
		}
		while (previousBindings < currentBindings);
		do {
			current = applyDefaults(current);
			previousBindings = currentBindings;
			currentBindings = current.getNumberOfBindings();
		}
		while (previousBindings < currentBindings);
		return current;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Option getOption(String id) {
		for (Option o : getOptions()) {
			if (id.equals(o.getName())) {
				return o;
			}
		}
		return null;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SuperModCorePackage.VERSION_DIMENSION__OPTIONS:
				return getOptions();
			case SuperModCorePackage.VERSION_DIMENSION__INVARIANTS:
				return getInvariants();
			case SuperModCorePackage.VERSION_DIMENSION__PREFERENCES:
				return getPreferences();
			case SuperModCorePackage.VERSION_DIMENSION__DEFAULT_BINDINGS:
				return getDefaultBindings();
			case SuperModCorePackage.VERSION_DIMENSION__ROOT_VERSION_SPACE_ELEMENTS:
				return getRootVersionSpaceElements();
			case SuperModCorePackage.VERSION_DIMENSION__ALL_VERSION_SPACE_ELEMENTS:
				return getAllVersionSpaceElements();
			case SuperModCorePackage.VERSION_DIMENSION__VERSION_SPACE:
				if (resolve) return getVersionSpace();
				return basicGetVersionSpace();
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
			case SuperModCorePackage.VERSION_DIMENSION__OPTIONS:
				return !getOptions().isEmpty();
			case SuperModCorePackage.VERSION_DIMENSION__INVARIANTS:
				return !getInvariants().isEmpty();
			case SuperModCorePackage.VERSION_DIMENSION__PREFERENCES:
				return !getPreferences().isEmpty();
			case SuperModCorePackage.VERSION_DIMENSION__DEFAULT_BINDINGS:
				return !getDefaultBindings().isEmpty();
			case SuperModCorePackage.VERSION_DIMENSION__ROOT_VERSION_SPACE_ELEMENTS:
				return !getRootVersionSpaceElements().isEmpty();
			case SuperModCorePackage.VERSION_DIMENSION__ALL_VERSION_SPACE_ELEMENTS:
				return !getAllVersionSpaceElements().isEmpty();
			case SuperModCorePackage.VERSION_DIMENSION__VERSION_SPACE:
				return basicGetVersionSpace() != null;
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
			case SuperModCorePackage.VERSION_DIMENSION___VALIDATE__OPTIONBINDING:
				return validate((OptionBinding)arguments.get(0));
			case SuperModCorePackage.VERSION_DIMENSION___IS_COMPLETE__OPTIONBINDING:
				return isComplete((OptionBinding)arguments.get(0));
			case SuperModCorePackage.VERSION_DIMENSION___IS_SATISFIABLE__OPTIONBINDING:
				return isSatisfiable((OptionBinding)arguments.get(0));
			case SuperModCorePackage.VERSION_DIMENSION___APPLY_PREFERENCES__OPTIONBINDING:
				return applyPreferences((OptionBinding)arguments.get(0));
			case SuperModCorePackage.VERSION_DIMENSION___APPLY_DEFAULTS__OPTIONBINDING:
				return applyDefaults((OptionBinding)arguments.get(0));
			case SuperModCorePackage.VERSION_DIMENSION___APPLY_COMPLETIONS__OPTIONBINDING:
				return applyCompletions((OptionBinding)arguments.get(0));
			case SuperModCorePackage.VERSION_DIMENSION___GET_OPTION__STRING:
				return getOption((String)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}
	
	@Override
	public EList<Element> getRootElements() {
		return ECollections.unmodifiableEList(getRootVersionSpaceElements());
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.emf.ecore.impl.BasicEObjectImpl#toString()
	 */
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append(getDimensionName() + "\n");
		sb.append("\tOptions:\n");
		for (Option o : getOptions()) {
			sb.append("\t\t" + o + "\n");
		}
		sb.append("\tInvariants:\n");
		for (Invariant i : getInvariants()) {
			sb.append("\t\t" + i + "\n");
		}
		sb.append("\tPreferences:\n");
		for (Preference p : getPreferences()) {
			sb.append("\t\t" + p + "\n");
		}
		sb.append("\tDefaults:\n");
		for (DefaultBinding d : getDefaultBindings()) {
			sb.append("\t\t" + d + "\n");
		}
		return sb.toString();
	}

} //VersionDimensionImpl
