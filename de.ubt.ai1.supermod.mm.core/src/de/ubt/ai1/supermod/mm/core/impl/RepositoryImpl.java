/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.mm.core.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import de.ubt.ai1.supermod.mm.core.ProductSpace;
import de.ubt.ai1.supermod.mm.core.Repository;
import de.ubt.ai1.supermod.mm.core.SuperModCorePackage;
import de.ubt.ai1.supermod.mm.core.VersionSpace;
import de.ubt.ai1.supermod.mm.core.VisibilityForest;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Repository</b></em>'.
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date 	2014-07-25
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai1.supermod.mm.core.impl.RepositoryImpl#getProductSpace <em>Product Space</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.core.impl.RepositoryImpl#getVersionSpace <em>Version Space</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.core.impl.RepositoryImpl#getVisibilityForest <em>Visibility Forest</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.core.impl.RepositoryImpl#getModuleId <em>Module Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RepositoryImpl extends MinimalEObjectImpl.Container implements Repository {
	/**
	 * The cached value of the '{@link #getProductSpace() <em>Product Space</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductSpace()
	 * @generated
	 * @ordered
	 */
	protected ProductSpace productSpace;

	/**
	 * The cached value of the '{@link #getVersionSpace() <em>Version Space</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersionSpace()
	 * @generated
	 * @ordered
	 */
	protected VersionSpace versionSpace;

	/**
	 * The cached value of the '{@link #getVisibilityForest() <em>Visibility Forest</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibilityForest()
	 * @generated
	 * @ordered
	 */
	protected VisibilityForest visibilityForest;

	/**
	 * The default value of the '{@link #getModuleId() <em>Module Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModuleId()
	 * @generated
	 * @ordered
	 */
	protected static final String MODULE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModuleId() <em>Module Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModuleId()
	 * @generated
	 * @ordered
	 */
	protected String moduleId = MODULE_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RepositoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SuperModCorePackage.Literals.REPOSITORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductSpace getProductSpace() {
		return productSpace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProductSpace(ProductSpace newProductSpace, NotificationChain msgs) {
		ProductSpace oldProductSpace = productSpace;
		productSpace = newProductSpace;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SuperModCorePackage.REPOSITORY__PRODUCT_SPACE, oldProductSpace, newProductSpace);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProductSpace(ProductSpace newProductSpace) {
		if (newProductSpace != productSpace) {
			NotificationChain msgs = null;
			if (productSpace != null)
				msgs = ((InternalEObject)productSpace).eInverseRemove(this, SuperModCorePackage.PRODUCT_SPACE__REPOSITORY, ProductSpace.class, msgs);
			if (newProductSpace != null)
				msgs = ((InternalEObject)newProductSpace).eInverseAdd(this, SuperModCorePackage.PRODUCT_SPACE__REPOSITORY, ProductSpace.class, msgs);
			msgs = basicSetProductSpace(newProductSpace, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SuperModCorePackage.REPOSITORY__PRODUCT_SPACE, newProductSpace, newProductSpace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VersionSpace getVersionSpace() {
		return versionSpace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVersionSpace(VersionSpace newVersionSpace, NotificationChain msgs) {
		VersionSpace oldVersionSpace = versionSpace;
		versionSpace = newVersionSpace;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SuperModCorePackage.REPOSITORY__VERSION_SPACE, oldVersionSpace, newVersionSpace);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersionSpace(VersionSpace newVersionSpace) {
		if (newVersionSpace != versionSpace) {
			NotificationChain msgs = null;
			if (versionSpace != null)
				msgs = ((InternalEObject)versionSpace).eInverseRemove(this, SuperModCorePackage.VERSION_SPACE__REPOSITORY, VersionSpace.class, msgs);
			if (newVersionSpace != null)
				msgs = ((InternalEObject)newVersionSpace).eInverseAdd(this, SuperModCorePackage.VERSION_SPACE__REPOSITORY, VersionSpace.class, msgs);
			msgs = basicSetVersionSpace(newVersionSpace, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SuperModCorePackage.REPOSITORY__VERSION_SPACE, newVersionSpace, newVersionSpace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisibilityForest getVisibilityForest() {
		if (visibilityForest != null && visibilityForest.eIsProxy()) {
			InternalEObject oldVisibilityForest = (InternalEObject)visibilityForest;
			visibilityForest = (VisibilityForest)eResolveProxy(oldVisibilityForest);
			if (visibilityForest != oldVisibilityForest) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SuperModCorePackage.REPOSITORY__VISIBILITY_FOREST, oldVisibilityForest, visibilityForest));
			}
		}
		return visibilityForest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisibilityForest basicGetVisibilityForest() {
		return visibilityForest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVisibilityForest(VisibilityForest newVisibilityForest, NotificationChain msgs) {
		VisibilityForest oldVisibilityForest = visibilityForest;
		visibilityForest = newVisibilityForest;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SuperModCorePackage.REPOSITORY__VISIBILITY_FOREST, oldVisibilityForest, newVisibilityForest);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisibilityForest(VisibilityForest newVisibilityForest) {
		if (newVisibilityForest != visibilityForest) {
			NotificationChain msgs = null;
			if (visibilityForest != null)
				msgs = ((InternalEObject)visibilityForest).eInverseRemove(this, SuperModCorePackage.VISIBILITY_FOREST__REPOSITORY, VisibilityForest.class, msgs);
			if (newVisibilityForest != null)
				msgs = ((InternalEObject)newVisibilityForest).eInverseAdd(this, SuperModCorePackage.VISIBILITY_FOREST__REPOSITORY, VisibilityForest.class, msgs);
			msgs = basicSetVisibilityForest(newVisibilityForest, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SuperModCorePackage.REPOSITORY__VISIBILITY_FOREST, newVisibilityForest, newVisibilityForest));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getModuleId() {
		return moduleId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModuleId(String newModuleId) {
		String oldModuleId = moduleId;
		moduleId = newModuleId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SuperModCorePackage.REPOSITORY__MODULE_ID, oldModuleId, moduleId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SuperModCorePackage.REPOSITORY__PRODUCT_SPACE:
				if (productSpace != null)
					msgs = ((InternalEObject)productSpace).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SuperModCorePackage.REPOSITORY__PRODUCT_SPACE, null, msgs);
				return basicSetProductSpace((ProductSpace)otherEnd, msgs);
			case SuperModCorePackage.REPOSITORY__VERSION_SPACE:
				if (versionSpace != null)
					msgs = ((InternalEObject)versionSpace).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SuperModCorePackage.REPOSITORY__VERSION_SPACE, null, msgs);
				return basicSetVersionSpace((VersionSpace)otherEnd, msgs);
			case SuperModCorePackage.REPOSITORY__VISIBILITY_FOREST:
				if (visibilityForest != null)
					msgs = ((InternalEObject)visibilityForest).eInverseRemove(this, SuperModCorePackage.VISIBILITY_FOREST__REPOSITORY, VisibilityForest.class, msgs);
				return basicSetVisibilityForest((VisibilityForest)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SuperModCorePackage.REPOSITORY__PRODUCT_SPACE:
				return basicSetProductSpace(null, msgs);
			case SuperModCorePackage.REPOSITORY__VERSION_SPACE:
				return basicSetVersionSpace(null, msgs);
			case SuperModCorePackage.REPOSITORY__VISIBILITY_FOREST:
				return basicSetVisibilityForest(null, msgs);
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
			case SuperModCorePackage.REPOSITORY__PRODUCT_SPACE:
				return getProductSpace();
			case SuperModCorePackage.REPOSITORY__VERSION_SPACE:
				return getVersionSpace();
			case SuperModCorePackage.REPOSITORY__VISIBILITY_FOREST:
				if (resolve) return getVisibilityForest();
				return basicGetVisibilityForest();
			case SuperModCorePackage.REPOSITORY__MODULE_ID:
				return getModuleId();
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
			case SuperModCorePackage.REPOSITORY__PRODUCT_SPACE:
				setProductSpace((ProductSpace)newValue);
				return;
			case SuperModCorePackage.REPOSITORY__VERSION_SPACE:
				setVersionSpace((VersionSpace)newValue);
				return;
			case SuperModCorePackage.REPOSITORY__VISIBILITY_FOREST:
				setVisibilityForest((VisibilityForest)newValue);
				return;
			case SuperModCorePackage.REPOSITORY__MODULE_ID:
				setModuleId((String)newValue);
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
			case SuperModCorePackage.REPOSITORY__PRODUCT_SPACE:
				setProductSpace((ProductSpace)null);
				return;
			case SuperModCorePackage.REPOSITORY__VERSION_SPACE:
				setVersionSpace((VersionSpace)null);
				return;
			case SuperModCorePackage.REPOSITORY__VISIBILITY_FOREST:
				setVisibilityForest((VisibilityForest)null);
				return;
			case SuperModCorePackage.REPOSITORY__MODULE_ID:
				setModuleId(MODULE_ID_EDEFAULT);
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
			case SuperModCorePackage.REPOSITORY__PRODUCT_SPACE:
				return productSpace != null;
			case SuperModCorePackage.REPOSITORY__VERSION_SPACE:
				return versionSpace != null;
			case SuperModCorePackage.REPOSITORY__VISIBILITY_FOREST:
				return visibilityForest != null;
			case SuperModCorePackage.REPOSITORY__MODULE_ID:
				return MODULE_ID_EDEFAULT == null ? moduleId != null : !MODULE_ID_EDEFAULT.equals(moduleId);
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
		result.append(" (moduleId: ");
		result.append(moduleId);
		result.append(')');
		return result.toString();
	}

} //RepositoryImpl
