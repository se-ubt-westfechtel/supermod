/**
 */
package de.ubt.ai1.supermod.example.bootstrap.superstrap.impl;

import de.ubt.ai1.supermod.example.bootstrap.superstrap.Dimension;
import de.ubt.ai1.supermod.example.bootstrap.superstrap.Operation;
import de.ubt.ai1.supermod.example.bootstrap.superstrap.Repository;
import de.ubt.ai1.supermod.example.bootstrap.superstrap.SuperstrapPackage;
import de.ubt.ai1.supermod.example.bootstrap.superstrap.VisibilityForest;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Repository</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai1.supermod.example.bootstrap.superstrap.impl.RepositoryImpl#getArchitectureCode <em>Architecture Code</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.example.bootstrap.superstrap.impl.RepositoryImpl#getVforest <em>Vforest</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.example.bootstrap.superstrap.impl.RepositoryImpl#getDimensions <em>Dimensions</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.example.bootstrap.superstrap.impl.RepositoryImpl#getOperations <em>Operations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RepositoryImpl extends MinimalEObjectImpl.Container implements Repository {
	/**
	 * The default value of the '{@link #getArchitectureCode() <em>Architecture Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArchitectureCode()
	 * @generated
	 * @ordered
	 */
	protected static final String ARCHITECTURE_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getArchitectureCode() <em>Architecture Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArchitectureCode()
	 * @generated
	 * @ordered
	 */
	protected String architectureCode = ARCHITECTURE_CODE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getVforest() <em>Vforest</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVforest()
	 * @generated
	 * @ordered
	 */
	protected VisibilityForest vforest;

	/**
	 * The cached value of the '{@link #getDimensions() <em>Dimensions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDimensions()
	 * @generated
	 * @ordered
	 */
	protected EList<Dimension> dimensions;

	/**
	 * The cached value of the '{@link #getOperations() <em>Operations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperations()
	 * @generated
	 * @ordered
	 */
	protected EList<Operation> operations;

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
		return SuperstrapPackage.Literals.REPOSITORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getArchitectureCode() {
		return architectureCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArchitectureCode(String newArchitectureCode) {
		String oldArchitectureCode = architectureCode;
		architectureCode = newArchitectureCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SuperstrapPackage.REPOSITORY__ARCHITECTURE_CODE, oldArchitectureCode, architectureCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Dimension> getDimensions() {
		if (dimensions == null) {
			dimensions = new EObjectContainmentEList<Dimension>(Dimension.class, this, SuperstrapPackage.REPOSITORY__DIMENSIONS);
		}
		return dimensions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisibilityForest getVforest() {
		return vforest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVforest(VisibilityForest newVforest, NotificationChain msgs) {
		VisibilityForest oldVforest = vforest;
		vforest = newVforest;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SuperstrapPackage.REPOSITORY__VFOREST, oldVforest, newVforest);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVforest(VisibilityForest newVforest) {
		if (newVforest != vforest) {
			NotificationChain msgs = null;
			if (vforest != null)
				msgs = ((InternalEObject)vforest).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SuperstrapPackage.REPOSITORY__VFOREST, null, msgs);
			if (newVforest != null)
				msgs = ((InternalEObject)newVforest).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SuperstrapPackage.REPOSITORY__VFOREST, null, msgs);
			msgs = basicSetVforest(newVforest, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SuperstrapPackage.REPOSITORY__VFOREST, newVforest, newVforest));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Operation> getOperations() {
		if (operations == null) {
			operations = new EObjectContainmentEList<Operation>(Operation.class, this, SuperstrapPackage.REPOSITORY__OPERATIONS);
		}
		return operations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SuperstrapPackage.REPOSITORY__VFOREST:
				return basicSetVforest(null, msgs);
			case SuperstrapPackage.REPOSITORY__DIMENSIONS:
				return ((InternalEList<?>)getDimensions()).basicRemove(otherEnd, msgs);
			case SuperstrapPackage.REPOSITORY__OPERATIONS:
				return ((InternalEList<?>)getOperations()).basicRemove(otherEnd, msgs);
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
			case SuperstrapPackage.REPOSITORY__ARCHITECTURE_CODE:
				return getArchitectureCode();
			case SuperstrapPackage.REPOSITORY__VFOREST:
				return getVforest();
			case SuperstrapPackage.REPOSITORY__DIMENSIONS:
				return getDimensions();
			case SuperstrapPackage.REPOSITORY__OPERATIONS:
				return getOperations();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SuperstrapPackage.REPOSITORY__ARCHITECTURE_CODE:
				setArchitectureCode((String)newValue);
				return;
			case SuperstrapPackage.REPOSITORY__VFOREST:
				setVforest((VisibilityForest)newValue);
				return;
			case SuperstrapPackage.REPOSITORY__DIMENSIONS:
				getDimensions().clear();
				getDimensions().addAll((Collection<? extends Dimension>)newValue);
				return;
			case SuperstrapPackage.REPOSITORY__OPERATIONS:
				getOperations().clear();
				getOperations().addAll((Collection<? extends Operation>)newValue);
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
			case SuperstrapPackage.REPOSITORY__ARCHITECTURE_CODE:
				setArchitectureCode(ARCHITECTURE_CODE_EDEFAULT);
				return;
			case SuperstrapPackage.REPOSITORY__VFOREST:
				setVforest((VisibilityForest)null);
				return;
			case SuperstrapPackage.REPOSITORY__DIMENSIONS:
				getDimensions().clear();
				return;
			case SuperstrapPackage.REPOSITORY__OPERATIONS:
				getOperations().clear();
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
			case SuperstrapPackage.REPOSITORY__ARCHITECTURE_CODE:
				return ARCHITECTURE_CODE_EDEFAULT == null ? architectureCode != null : !ARCHITECTURE_CODE_EDEFAULT.equals(architectureCode);
			case SuperstrapPackage.REPOSITORY__VFOREST:
				return vforest != null;
			case SuperstrapPackage.REPOSITORY__DIMENSIONS:
				return dimensions != null && !dimensions.isEmpty();
			case SuperstrapPackage.REPOSITORY__OPERATIONS:
				return operations != null && !operations.isEmpty();
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
		result.append(" (architectureCode: ");
		result.append(architectureCode);
		result.append(')');
		return result.toString();
	}

} //RepositoryImpl
