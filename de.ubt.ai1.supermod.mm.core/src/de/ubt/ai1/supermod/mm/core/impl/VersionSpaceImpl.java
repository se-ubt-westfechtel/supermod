/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.mm.core.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import de.ubt.ai1.supermod.mm.core.DefaultBinding;
import de.ubt.ai1.supermod.mm.core.Invariant;
import de.ubt.ai1.supermod.mm.core.Option;
import de.ubt.ai1.supermod.mm.core.OptionBinding;
import de.ubt.ai1.supermod.mm.core.OptionExpr;
import de.ubt.ai1.supermod.mm.core.Preference;
import de.ubt.ai1.supermod.mm.core.Repository;
import de.ubt.ai1.supermod.mm.core.SuperModCorePackage;
import de.ubt.ai1.supermod.mm.core.Tristate;
import de.ubt.ai1.supermod.mm.core.VersionDimension;
import de.ubt.ai1.supermod.mm.core.VersionSpace;
import de.ubt.ai1.supermod.mm.core.util.SatUtil;
import de.ubt.ai1.supermod.mm.core.util.TristateUtil;

/**
 * <!-- begin-user-doc --> 
 * An implementation of the model object '<em><b>Version Space</b></em>'.
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date 	2014-07-25
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai1.supermod.mm.core.impl.VersionSpaceImpl#getDimensions <em>Dimensions</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.core.impl.VersionSpaceImpl#getAllOptions <em>All Options</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.core.impl.VersionSpaceImpl#getAllInvariants <em>All Invariants</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.core.impl.VersionSpaceImpl#getAllPreferences <em>All Preferences</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.core.impl.VersionSpaceImpl#getAllDefaultBindings <em>All Default Bindings</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.core.impl.VersionSpaceImpl#getRepository <em>Repository</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VersionSpaceImpl extends MinimalEObjectImpl.Container implements VersionSpace {
	/**
	 * The cached value of the '{@link #getDimensions() <em>Dimensions</em>}' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getDimensions()
	 * @generated
	 * @ordered
	 */
	protected EList<VersionDimension> dimensions;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected VersionSpaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SuperModCorePackage.Literals.VERSION_SPACE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VersionDimension> getDimensions() {
		if (dimensions == null) {
			dimensions = new EObjectResolvingEList<VersionDimension>(VersionDimension.class, this, SuperModCorePackage.VERSION_SPACE__DIMENSIONS);
		}
		return dimensions;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public EList<Option> getAllOptions() {
		EList<Option> allOptions = ECollections.newBasicEList();
		for (VersionDimension dim : getDimensions()) {
			allOptions.addAll(dim.getOptions());
		}
		return ECollections.unmodifiableEList(allOptions);
	} 

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public EList<Invariant> getAllInvariants() {
		EList<Invariant> allInvariants = ECollections.newBasicEList();
		for (VersionDimension dim : getDimensions()) {
			allInvariants.addAll(dim.getInvariants());
		}
		return ECollections.unmodifiableEList(allInvariants);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public EList<Preference> getAllPreferences() {
		EList<Preference> allPreferences = ECollections.newBasicEList();
		for (VersionDimension dim : getDimensions()) {
			allPreferences.addAll(dim.getPreferences());
		}
		return ECollections.unmodifiableEList(allPreferences);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<DefaultBinding> getAllDefaultBindings() {
		EList<DefaultBinding> allDefaults = ECollections.newBasicEList();
		for (VersionDimension dim : getDimensions()) {
			allDefaults.addAll(dim.getDefaultBindings());
		}
		return ECollections.unmodifiableEList(allDefaults);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Repository getRepository() {
		if (eContainerFeatureID() != SuperModCorePackage.VERSION_SPACE__REPOSITORY) return null;
		return (Repository)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRepository(Repository newRepository, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newRepository, SuperModCorePackage.VERSION_SPACE__REPOSITORY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepository(Repository newRepository) {
		if (newRepository != eInternalContainer() || (eContainerFeatureID() != SuperModCorePackage.VERSION_SPACE__REPOSITORY && newRepository != null)) {
			if (EcoreUtil.isAncestor(this, newRepository))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newRepository != null)
				msgs = ((InternalEObject)newRepository).eInverseAdd(this, SuperModCorePackage.REPOSITORY__VERSION_SPACE, Repository.class, msgs);
			msgs = basicSetRepository(newRepository, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SuperModCorePackage.VERSION_SPACE__REPOSITORY, newRepository, newRepository));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public Tristate validate(OptionBinding optionBinding) {
//		return getDimensions().stream()
//				.map(dim -> dim.validate(optionBinding))
//				.reduce(Tristate.TRUE, TristateUtil::and);
		Tristate state = Tristate.TRUE;
		for (VersionDimension dim : getDimensions()) {
			state = TristateUtil.and(state, dim.validate(optionBinding));
			if (state == Tristate.FALSE) break;
		}
		return state;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean isComplete(OptionBinding optionBinding) {
		boolean complete = true;
		for (VersionDimension dim : getDimensions()) {
			complete = complete && dim.isComplete(optionBinding);
			if (!complete) break;
		}
		return complete;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isSatisfiable(OptionBinding premise) {
		List<OptionExpr> exprs = new LinkedList<>();
		Set<Option> options = new HashSet<>();
		for (Invariant inv : getAllInvariants()) {
			exprs.add(inv.getOptionExpr());
			options.addAll(inv.getOptionExpr().getReferencedOptions());
		}
		return SatUtil.isSatisfiable(new ArrayList<Option>(options),
				exprs, premise);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public OptionBinding applyAllPreferences(OptionBinding optionBinding) {
		OptionBinding bindingWithPrefs = optionBinding;
		for (VersionDimension dim : getDimensions()) {
			bindingWithPrefs = dim.applyPreferences(bindingWithPrefs);
		}
		return bindingWithPrefs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public OptionBinding applyAllDefaults(OptionBinding optionBinding) {
		OptionBinding bindingWithDefs = optionBinding;
		for (VersionDimension dim : getDimensions()) {
			bindingWithDefs = dim.applyDefaults(bindingWithDefs);
		}
		return bindingWithDefs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public OptionBinding applyAllCompletions(OptionBinding optionBinding) {
		int allPreviousBindings = 0;
		int allCurrentBindings = 0;
		OptionBinding current = optionBinding;
		do {
			int previousBindings = 0;
			int currentBindings = 0;
			do {
				for (VersionDimension dim : getDimensions()) {
					current = dim.applyPreferences(current);
				}
				previousBindings = currentBindings;
				currentBindings = current.getNumberOfBindings();
			}
			while (previousBindings < currentBindings);
			do {
				for (VersionDimension dim : getDimensions()) {
					current = dim.applyDefaults(current);
				}
				previousBindings = currentBindings;
				currentBindings = current.getNumberOfBindings();
			}
			while (previousBindings < currentBindings);
			allPreviousBindings = allCurrentBindings;
			allCurrentBindings = currentBindings;
		}
		while (allPreviousBindings < allCurrentBindings);		
		return current;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public Option getOption(String id) {
		for (VersionDimension dim : getDimensions()) {
			Option opt = dim.getOption(id);
			if (opt != null) return opt;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SuperModCorePackage.VERSION_SPACE__REPOSITORY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetRepository((Repository)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SuperModCorePackage.VERSION_SPACE__REPOSITORY:
				return basicSetRepository(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case SuperModCorePackage.VERSION_SPACE__REPOSITORY:
				return eInternalContainer().eInverseRemove(this, SuperModCorePackage.REPOSITORY__VERSION_SPACE, Repository.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SuperModCorePackage.VERSION_SPACE__DIMENSIONS:
				return getDimensions();
			case SuperModCorePackage.VERSION_SPACE__ALL_OPTIONS:
				return getAllOptions();
			case SuperModCorePackage.VERSION_SPACE__ALL_INVARIANTS:
				return getAllInvariants();
			case SuperModCorePackage.VERSION_SPACE__ALL_PREFERENCES:
				return getAllPreferences();
			case SuperModCorePackage.VERSION_SPACE__ALL_DEFAULT_BINDINGS:
				return getAllDefaultBindings();
			case SuperModCorePackage.VERSION_SPACE__REPOSITORY:
				return getRepository();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SuperModCorePackage.VERSION_SPACE__DIMENSIONS:
				getDimensions().clear();
				getDimensions().addAll((Collection<? extends VersionDimension>)newValue);
				return;
			case SuperModCorePackage.VERSION_SPACE__REPOSITORY:
				setRepository((Repository)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SuperModCorePackage.VERSION_SPACE__DIMENSIONS:
				getDimensions().clear();
				return;
			case SuperModCorePackage.VERSION_SPACE__REPOSITORY:
				setRepository((Repository)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SuperModCorePackage.VERSION_SPACE__DIMENSIONS:
				return dimensions != null && !dimensions.isEmpty();
			case SuperModCorePackage.VERSION_SPACE__ALL_OPTIONS:
				return !getAllOptions().isEmpty();
			case SuperModCorePackage.VERSION_SPACE__ALL_INVARIANTS:
				return !getAllInvariants().isEmpty();
			case SuperModCorePackage.VERSION_SPACE__ALL_PREFERENCES:
				return !getAllPreferences().isEmpty();
			case SuperModCorePackage.VERSION_SPACE__ALL_DEFAULT_BINDINGS:
				return !getAllDefaultBindings().isEmpty();
			case SuperModCorePackage.VERSION_SPACE__REPOSITORY:
				return getRepository() != null;
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
			case SuperModCorePackage.VERSION_SPACE___VALIDATE__OPTIONBINDING:
				return validate((OptionBinding)arguments.get(0));
			case SuperModCorePackage.VERSION_SPACE___IS_COMPLETE__OPTIONBINDING:
				return isComplete((OptionBinding)arguments.get(0));
			case SuperModCorePackage.VERSION_SPACE___IS_SATISFIABLE__OPTIONBINDING:
				return isSatisfiable((OptionBinding)arguments.get(0));
			case SuperModCorePackage.VERSION_SPACE___APPLY_ALL_PREFERENCES__OPTIONBINDING:
				return applyAllPreferences((OptionBinding)arguments.get(0));
			case SuperModCorePackage.VERSION_SPACE___APPLY_ALL_DEFAULTS__OPTIONBINDING:
				return applyAllDefaults((OptionBinding)arguments.get(0));
			case SuperModCorePackage.VERSION_SPACE___APPLY_ALL_COMPLETIONS__OPTIONBINDING:
				return applyAllCompletions((OptionBinding)arguments.get(0));
			case SuperModCorePackage.VERSION_SPACE___GET_OPTION__STRING:
				return getOption((String)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.emf.ecore.impl.BasicEObjectImpl#toString()
	 */
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		for (VersionDimension vd : getDimensions()) {
			sb.append(vd.toString() + "\n");
		}
		return sb.toString();
	}

} // VersionSpaceImpl
