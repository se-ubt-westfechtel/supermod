/**
 */
package de.ubt.ai1.supermod.mm.feature.client.impl;

import de.ubt.ai1.supermod.mm.core.OptionBinding;
import de.ubt.ai1.supermod.mm.feature.FeatureModel;
import de.ubt.ai1.supermod.mm.feature.client.FeatureConfiguration;
import de.ubt.ai1.supermod.mm.feature.client.SuperModFeatureClientPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai1.supermod.mm.feature.client.impl.FeatureConfigurationImpl#getFeatureModel <em>Feature Model</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.feature.client.impl.FeatureConfigurationImpl#getOptionBinding <em>Option Binding</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.feature.client.impl.FeatureConfigurationImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FeatureConfigurationImpl extends MinimalEObjectImpl.Container implements FeatureConfiguration {
	/**
	 * The cached value of the '{@link #getFeatureModel() <em>Feature Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureModel()
	 * @generated
	 * @ordered
	 */
	protected FeatureModel featureModel;

	/**
	 * The cached value of the '{@link #getOptionBinding() <em>Option Binding</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptionBinding()
	 * @generated
	 * @ordered
	 */
	protected OptionBinding optionBinding;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeatureConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SuperModFeatureClientPackage.Literals.FEATURE_CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureModel getFeatureModel() {
		if (featureModel != null && featureModel.eIsProxy()) {
			InternalEObject oldFeatureModel = (InternalEObject)featureModel;
			featureModel = (FeatureModel)eResolveProxy(oldFeatureModel);
			if (featureModel != oldFeatureModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SuperModFeatureClientPackage.FEATURE_CONFIGURATION__FEATURE_MODEL, oldFeatureModel, featureModel));
			}
		}
		return featureModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureModel basicGetFeatureModel() {
		return featureModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeatureModel(FeatureModel newFeatureModel) {
		FeatureModel oldFeatureModel = featureModel;
		featureModel = newFeatureModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SuperModFeatureClientPackage.FEATURE_CONFIGURATION__FEATURE_MODEL, oldFeatureModel, featureModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OptionBinding getOptionBinding() {
		return optionBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOptionBinding(OptionBinding newOptionBinding, NotificationChain msgs) {
		OptionBinding oldOptionBinding = optionBinding;
		optionBinding = newOptionBinding;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SuperModFeatureClientPackage.FEATURE_CONFIGURATION__OPTION_BINDING, oldOptionBinding, newOptionBinding);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOptionBinding(OptionBinding newOptionBinding) {
		if (newOptionBinding != optionBinding) {
			NotificationChain msgs = null;
			if (optionBinding != null)
				msgs = ((InternalEObject)optionBinding).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SuperModFeatureClientPackage.FEATURE_CONFIGURATION__OPTION_BINDING, null, msgs);
			if (newOptionBinding != null)
				msgs = ((InternalEObject)newOptionBinding).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SuperModFeatureClientPackage.FEATURE_CONFIGURATION__OPTION_BINDING, null, msgs);
			msgs = basicSetOptionBinding(newOptionBinding, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SuperModFeatureClientPackage.FEATURE_CONFIGURATION__OPTION_BINDING, newOptionBinding, newOptionBinding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SuperModFeatureClientPackage.FEATURE_CONFIGURATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SuperModFeatureClientPackage.FEATURE_CONFIGURATION__OPTION_BINDING:
				return basicSetOptionBinding(null, msgs);
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
			case SuperModFeatureClientPackage.FEATURE_CONFIGURATION__FEATURE_MODEL:
				if (resolve) return getFeatureModel();
				return basicGetFeatureModel();
			case SuperModFeatureClientPackage.FEATURE_CONFIGURATION__OPTION_BINDING:
				return getOptionBinding();
			case SuperModFeatureClientPackage.FEATURE_CONFIGURATION__NAME:
				return getName();
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
			case SuperModFeatureClientPackage.FEATURE_CONFIGURATION__FEATURE_MODEL:
				setFeatureModel((FeatureModel)newValue);
				return;
			case SuperModFeatureClientPackage.FEATURE_CONFIGURATION__OPTION_BINDING:
				setOptionBinding((OptionBinding)newValue);
				return;
			case SuperModFeatureClientPackage.FEATURE_CONFIGURATION__NAME:
				setName((String)newValue);
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
			case SuperModFeatureClientPackage.FEATURE_CONFIGURATION__FEATURE_MODEL:
				setFeatureModel((FeatureModel)null);
				return;
			case SuperModFeatureClientPackage.FEATURE_CONFIGURATION__OPTION_BINDING:
				setOptionBinding((OptionBinding)null);
				return;
			case SuperModFeatureClientPackage.FEATURE_CONFIGURATION__NAME:
				setName(NAME_EDEFAULT);
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
			case SuperModFeatureClientPackage.FEATURE_CONFIGURATION__FEATURE_MODEL:
				return featureModel != null;
			case SuperModFeatureClientPackage.FEATURE_CONFIGURATION__OPTION_BINDING:
				return optionBinding != null;
			case SuperModFeatureClientPackage.FEATURE_CONFIGURATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //FeatureConfigurationImpl
