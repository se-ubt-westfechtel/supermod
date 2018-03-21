/**
 */
package de.ubt.ai1.supermod.example.bootstrap.superstrap;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Repository</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai1.supermod.example.bootstrap.superstrap.Repository#getArchitectureCode <em>Architecture Code</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.example.bootstrap.superstrap.Repository#getVforest <em>Vforest</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.example.bootstrap.superstrap.Repository#getDimensions <em>Dimensions</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.example.bootstrap.superstrap.Repository#getOperations <em>Operations</em>}</li>
 * </ul>
 *
 * @see de.ubt.ai1.supermod.example.bootstrap.superstrap.SuperstrapPackage#getRepository()
 * @model
 * @generated
 */
public interface Repository extends EObject {
	/**
	 * Returns the value of the '<em><b>Architecture Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Architecture Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Architecture Code</em>' attribute.
	 * @see #setArchitectureCode(String)
	 * @see de.ubt.ai1.supermod.example.bootstrap.superstrap.SuperstrapPackage#getRepository_ArchitectureCode()
	 * @model
	 * @generated
	 */
	String getArchitectureCode();

	/**
	 * Sets the value of the '{@link de.ubt.ai1.supermod.example.bootstrap.superstrap.Repository#getArchitectureCode <em>Architecture Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Architecture Code</em>' attribute.
	 * @see #getArchitectureCode()
	 * @generated
	 */
	void setArchitectureCode(String value);

	/**
	 * Returns the value of the '<em><b>Dimensions</b></em>' containment reference list.
	 * The list contents are of type {@link de.ubt.ai1.supermod.example.bootstrap.superstrap.Dimension}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dimensions</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dimensions</em>' containment reference list.
	 * @see de.ubt.ai1.supermod.example.bootstrap.superstrap.SuperstrapPackage#getRepository_Dimensions()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Dimension> getDimensions();

	/**
	 * Returns the value of the '<em><b>Vforest</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vforest</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vforest</em>' containment reference.
	 * @see #setVforest(VisibilityForest)
	 * @see de.ubt.ai1.supermod.example.bootstrap.superstrap.SuperstrapPackage#getRepository_Vforest()
	 * @model containment="true"
	 * @generated
	 */
	VisibilityForest getVforest();

	/**
	 * Sets the value of the '{@link de.ubt.ai1.supermod.example.bootstrap.superstrap.Repository#getVforest <em>Vforest</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vforest</em>' containment reference.
	 * @see #getVforest()
	 * @generated
	 */
	void setVforest(VisibilityForest value);

	/**
	 * Returns the value of the '<em><b>Operations</b></em>' containment reference list.
	 * The list contents are of type {@link de.ubt.ai1.supermod.example.bootstrap.superstrap.Operation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operations</em>' containment reference list.
	 * @see de.ubt.ai1.supermod.example.bootstrap.superstrap.SuperstrapPackage#getRepository_Operations()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList<Operation> getOperations();

} // Repository
