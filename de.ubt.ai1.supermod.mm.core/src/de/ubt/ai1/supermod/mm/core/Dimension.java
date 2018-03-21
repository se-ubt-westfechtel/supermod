/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.mm.core;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dimension</b></em>'.
 * Base class for product dimensions and version dimensions. A dimension has a unique name
 * and contains a number of root elements. Each element is also qualified by a unique name.
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date 	2014-07-25
 * @see 	{@link ProductDimension}
 * @see 	{@link VersionDimension}
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai1.supermod.mm.core.Dimension#getDimensionName <em>Dimension Name</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.core.Dimension#getRootElements <em>Root Elements</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.core.Dimension#getAllElements <em>All Elements</em>}</li>
 * </ul>
 *
 * @see de.ubt.ai1.supermod.mm.core.SuperModCorePackage#getDimension()
 * @model abstract="true"
 * @generated
 */
public interface Dimension extends EObject {
	/**
	 * Returns the value of the '<em><b>Dimension Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * A unique name for the dimension.
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dimension Name</em>' attribute.
	 * @see #setDimensionName(String)
	 * @see de.ubt.ai1.supermod.mm.core.SuperModCorePackage#getDimension_DimensionName()
	 * @model
	 * @generated
	 */
	String getDimensionName();

	/**
	 * Sets the value of the '{@link de.ubt.ai1.supermod.mm.core.Dimension#getDimensionName <em>Dimension Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dimension Name</em>' attribute.
	 * @see #getDimensionName()
	 * @generated
	 */
	void setDimensionName(String value);

	/**
	 * Returns the value of the '<em><b>Root Elements</b></em>' reference list.
	 * The list contents are of type {@link de.ubt.ai1.supermod.mm.core.Element}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * All SuperMod elements which are directly contained by the given dimension.
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root Elements</em>' reference list.
	 * @see de.ubt.ai1.supermod.mm.core.SuperModCorePackage#getDimension_RootElements()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<Element> getRootElements();

	/**
	 * Returns the value of the '<em><b>All Elements</b></em>' reference list.
	 * The list contents are of type {@link de.ubt.ai1.supermod.mm.core.Element}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * All SuperMod elements which are transitively contained by the given dimension.
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All Elements</em>' reference list.
	 * @see de.ubt.ai1.supermod.mm.core.SuperModCorePackage#getDimension_AllElements()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<Element> getAllElements();

} // Dimension
