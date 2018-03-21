/**
 */
package de.ubt.ai1.supermod.example.bootstrap.superstrap;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dimension</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai1.supermod.example.bootstrap.superstrap.Dimension#getName <em>Name</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.example.bootstrap.superstrap.Dimension#getType <em>Type</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.example.bootstrap.superstrap.Dimension#isEditable <em>Editable</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.example.bootstrap.superstrap.Dimension#getControlledDimensions <em>Controlled Dimensions</em>}</li>
 * </ul>
 *
 * @see de.ubt.ai1.supermod.example.bootstrap.superstrap.SuperstrapPackage#getDimension()
 * @model
 * @generated
 */
public interface Dimension extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.ubt.ai1.supermod.example.bootstrap.superstrap.SuperstrapPackage#getDimension_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.ubt.ai1.supermod.example.bootstrap.superstrap.Dimension#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Controlled Dimensions</b></em>' reference list.
	 * The list contents are of type {@link de.ubt.ai1.supermod.example.bootstrap.superstrap.Dimension}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Controlled Dimensions</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Controlled Dimensions</em>' reference list.
	 * @see de.ubt.ai1.supermod.example.bootstrap.superstrap.SuperstrapPackage#getDimension_ControlledDimensions()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Dimension> getControlledDimensions();

	/**
	 * Returns the value of the '<em><b>Editable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Editable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Editable</em>' attribute.
	 * @see #setEditable(boolean)
	 * @see de.ubt.ai1.supermod.example.bootstrap.superstrap.SuperstrapPackage#getDimension_Editable()
	 * @model
	 * @generated
	 */
	boolean isEditable();

	/**
	 * Sets the value of the '{@link de.ubt.ai1.supermod.example.bootstrap.superstrap.Dimension#isEditable <em>Editable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Editable</em>' attribute.
	 * @see #isEditable()
	 * @generated
	 */
	void setEditable(boolean value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link de.ubt.ai1.supermod.example.bootstrap.superstrap.DimensionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see de.ubt.ai1.supermod.example.bootstrap.superstrap.DimensionType
	 * @see #setType(DimensionType)
	 * @see de.ubt.ai1.supermod.example.bootstrap.superstrap.SuperstrapPackage#getDimension_Type()
	 * @model
	 * @generated
	 */
	DimensionType getType();

	/**
	 * Sets the value of the '{@link de.ubt.ai1.supermod.example.bootstrap.superstrap.Dimension#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see de.ubt.ai1.supermod.example.bootstrap.superstrap.DimensionType
	 * @see #getType()
	 * @generated
	 */
	void setType(DimensionType value);

} // Dimension
