/**
 */
package de.ubt.ai1.supermod.example.bootstrap.superstrap.impl;

import de.ubt.ai1.supermod.example.bootstrap.superstrap.Dimension;
import de.ubt.ai1.supermod.example.bootstrap.superstrap.DimensionType;
import de.ubt.ai1.supermod.example.bootstrap.superstrap.SuperstrapPackage;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dimension</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai1.supermod.example.bootstrap.superstrap.impl.DimensionImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.example.bootstrap.superstrap.impl.DimensionImpl#getType <em>Type</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.example.bootstrap.superstrap.impl.DimensionImpl#isEditable <em>Editable</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.example.bootstrap.superstrap.impl.DimensionImpl#getControlledDimensions <em>Controlled Dimensions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DimensionImpl extends MinimalEObjectImpl.Container implements Dimension {
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
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final DimensionType TYPE_EDEFAULT = DimensionType.PRODUCT;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected DimensionType type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #isEditable() <em>Editable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEditable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EDITABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEditable() <em>Editable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEditable()
	 * @generated
	 * @ordered
	 */
	protected boolean editable = EDITABLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getControlledDimensions() <em>Controlled Dimensions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlledDimensions()
	 * @generated
	 * @ordered
	 */
	protected EList<Dimension> controlledDimensions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DimensionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SuperstrapPackage.Literals.DIMENSION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SuperstrapPackage.DIMENSION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Dimension> getControlledDimensions() {
		if (controlledDimensions == null) {
			controlledDimensions = new EObjectResolvingEList<Dimension>(Dimension.class, this, SuperstrapPackage.DIMENSION__CONTROLLED_DIMENSIONS);
		}
		return controlledDimensions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEditable() {
		return editable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEditable(boolean newEditable) {
		boolean oldEditable = editable;
		editable = newEditable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SuperstrapPackage.DIMENSION__EDITABLE, oldEditable, editable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DimensionType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(DimensionType newType) {
		DimensionType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SuperstrapPackage.DIMENSION__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SuperstrapPackage.DIMENSION__NAME:
				return getName();
			case SuperstrapPackage.DIMENSION__TYPE:
				return getType();
			case SuperstrapPackage.DIMENSION__EDITABLE:
				return isEditable();
			case SuperstrapPackage.DIMENSION__CONTROLLED_DIMENSIONS:
				return getControlledDimensions();
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
			case SuperstrapPackage.DIMENSION__NAME:
				setName((String)newValue);
				return;
			case SuperstrapPackage.DIMENSION__TYPE:
				setType((DimensionType)newValue);
				return;
			case SuperstrapPackage.DIMENSION__EDITABLE:
				setEditable((Boolean)newValue);
				return;
			case SuperstrapPackage.DIMENSION__CONTROLLED_DIMENSIONS:
				getControlledDimensions().clear();
				getControlledDimensions().addAll((Collection<? extends Dimension>)newValue);
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
			case SuperstrapPackage.DIMENSION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SuperstrapPackage.DIMENSION__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case SuperstrapPackage.DIMENSION__EDITABLE:
				setEditable(EDITABLE_EDEFAULT);
				return;
			case SuperstrapPackage.DIMENSION__CONTROLLED_DIMENSIONS:
				getControlledDimensions().clear();
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
			case SuperstrapPackage.DIMENSION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SuperstrapPackage.DIMENSION__TYPE:
				return type != TYPE_EDEFAULT;
			case SuperstrapPackage.DIMENSION__EDITABLE:
				return editable != EDITABLE_EDEFAULT;
			case SuperstrapPackage.DIMENSION__CONTROLLED_DIMENSIONS:
				return controlledDimensions != null && !controlledDimensions.isEmpty();
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
		result.append(", type: ");
		result.append(type);
		result.append(", editable: ");
		result.append(editable);
		result.append(')');
		return result.toString();
	}

} //DimensionImpl
