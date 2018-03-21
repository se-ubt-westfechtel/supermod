/**
 */
package de.ubt.ai1.supermod.mm.feature.client;

import de.ubt.ai1.supermod.mm.core.OptionBinding;
import de.ubt.ai1.supermod.mm.feature.FeatureModel;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai1.supermod.mm.feature.client.FeatureConfiguration#getFeatureModel <em>Feature Model</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.feature.client.FeatureConfiguration#getOptionBinding <em>Option Binding</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.feature.client.FeatureConfiguration#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see de.ubt.ai1.supermod.mm.feature.client.SuperModFeatureClientPackage#getFeatureConfiguration()
 * @model
 * @generated
 */
public interface FeatureConfiguration extends EObject {
	/**
	 * Returns the value of the '<em><b>Feature Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature Model</em>' reference.
	 * @see #setFeatureModel(FeatureModel)
	 * @see de.ubt.ai1.supermod.mm.feature.client.SuperModFeatureClientPackage#getFeatureConfiguration_FeatureModel()
	 * @model
	 * @generated
	 */
	FeatureModel getFeatureModel();

	/**
	 * Sets the value of the '{@link de.ubt.ai1.supermod.mm.feature.client.FeatureConfiguration#getFeatureModel <em>Feature Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature Model</em>' reference.
	 * @see #getFeatureModel()
	 * @generated
	 */
	void setFeatureModel(FeatureModel value);

	/**
	 * Returns the value of the '<em><b>Option Binding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Option Binding</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Option Binding</em>' containment reference.
	 * @see #setOptionBinding(OptionBinding)
	 * @see de.ubt.ai1.supermod.mm.feature.client.SuperModFeatureClientPackage#getFeatureConfiguration_OptionBinding()
	 * @model containment="true"
	 * @generated
	 */
	OptionBinding getOptionBinding();

	/**
	 * Sets the value of the '{@link de.ubt.ai1.supermod.mm.feature.client.FeatureConfiguration#getOptionBinding <em>Option Binding</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Option Binding</em>' containment reference.
	 * @see #getOptionBinding()
	 * @generated
	 */
	void setOptionBinding(OptionBinding value);

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
	 * @see de.ubt.ai1.supermod.mm.feature.client.SuperModFeatureClientPackage#getFeatureConfiguration_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.ubt.ai1.supermod.mm.feature.client.FeatureConfiguration#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // FeatureConfiguration
