/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.mm.feature.client.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import de.ubt.ai1.supermod.mm.client.impl.SingleVersionProductDimensionDescriptorImpl;
import de.ubt.ai1.supermod.mm.feature.FeatureModel;
import de.ubt.ai1.supermod.mm.feature.client.SingleVersionFeatureModelDescriptor;
import de.ubt.ai1.supermod.mm.feature.client.SuperModFeatureClientPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Single Version Feature Model Descriptor</b></em>'.
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date 	2014-11-17
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai1.supermod.mm.feature.client.impl.SingleVersionFeatureModelDescriptorImpl#getFeatureModel <em>Feature Model</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.feature.client.impl.SingleVersionFeatureModelDescriptorImpl#isModified <em>Modified</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SingleVersionFeatureModelDescriptorImpl extends SingleVersionProductDimensionDescriptorImpl implements SingleVersionFeatureModelDescriptor {
	/**
	 * The cached value of the '{@link #getFeatureModel() <em>Feature Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureModel()
	 * @generated
	 * @ordered
	 */
	protected FeatureModel featureModel;

	/**
	 * The default value of the '{@link #isModified() <em>Modified</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isModified()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MODIFIED_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isModified() <em>Modified</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isModified()
	 * @generated
	 * @ordered
	 */
	protected boolean modified = MODIFIED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SingleVersionFeatureModelDescriptorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SuperModFeatureClientPackage.Literals.SINGLE_VERSION_FEATURE_MODEL_DESCRIPTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureModel getFeatureModel() {
		return featureModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFeatureModel(FeatureModel newFeatureModel, NotificationChain msgs) {
		FeatureModel oldFeatureModel = featureModel;
		featureModel = newFeatureModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SuperModFeatureClientPackage.SINGLE_VERSION_FEATURE_MODEL_DESCRIPTOR__FEATURE_MODEL, oldFeatureModel, newFeatureModel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeatureModel(FeatureModel newFeatureModel) {
		if (newFeatureModel != featureModel) {
			NotificationChain msgs = null;
			if (featureModel != null)
				msgs = ((InternalEObject)featureModel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SuperModFeatureClientPackage.SINGLE_VERSION_FEATURE_MODEL_DESCRIPTOR__FEATURE_MODEL, null, msgs);
			if (newFeatureModel != null)
				msgs = ((InternalEObject)newFeatureModel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SuperModFeatureClientPackage.SINGLE_VERSION_FEATURE_MODEL_DESCRIPTOR__FEATURE_MODEL, null, msgs);
			msgs = basicSetFeatureModel(newFeatureModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SuperModFeatureClientPackage.SINGLE_VERSION_FEATURE_MODEL_DESCRIPTOR__FEATURE_MODEL, newFeatureModel, newFeatureModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isModified() {
		return modified;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModified(boolean newModified) {
		boolean oldModified = modified;
		modified = newModified;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SuperModFeatureClientPackage.SINGLE_VERSION_FEATURE_MODEL_DESCRIPTOR__MODIFIED, oldModified, modified));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SuperModFeatureClientPackage.SINGLE_VERSION_FEATURE_MODEL_DESCRIPTOR__FEATURE_MODEL:
				return basicSetFeatureModel(null, msgs);
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
			case SuperModFeatureClientPackage.SINGLE_VERSION_FEATURE_MODEL_DESCRIPTOR__FEATURE_MODEL:
				return getFeatureModel();
			case SuperModFeatureClientPackage.SINGLE_VERSION_FEATURE_MODEL_DESCRIPTOR__MODIFIED:
				return isModified();
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
			case SuperModFeatureClientPackage.SINGLE_VERSION_FEATURE_MODEL_DESCRIPTOR__FEATURE_MODEL:
				setFeatureModel((FeatureModel)newValue);
				return;
			case SuperModFeatureClientPackage.SINGLE_VERSION_FEATURE_MODEL_DESCRIPTOR__MODIFIED:
				setModified((Boolean)newValue);
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
			case SuperModFeatureClientPackage.SINGLE_VERSION_FEATURE_MODEL_DESCRIPTOR__FEATURE_MODEL:
				setFeatureModel((FeatureModel)null);
				return;
			case SuperModFeatureClientPackage.SINGLE_VERSION_FEATURE_MODEL_DESCRIPTOR__MODIFIED:
				setModified(MODIFIED_EDEFAULT);
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
			case SuperModFeatureClientPackage.SINGLE_VERSION_FEATURE_MODEL_DESCRIPTOR__FEATURE_MODEL:
				return featureModel != null;
			case SuperModFeatureClientPackage.SINGLE_VERSION_FEATURE_MODEL_DESCRIPTOR__MODIFIED:
				return modified != MODIFIED_EDEFAULT;
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
		result.append(" (modified: ");
		result.append(modified);
		result.append(')');
		return result.toString();
	}

} //SingleVersionFeatureModelDescriptorImpl
