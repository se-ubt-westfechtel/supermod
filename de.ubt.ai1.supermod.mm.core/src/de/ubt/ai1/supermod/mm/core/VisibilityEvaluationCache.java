/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.mm.core;

import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Visibility Evaluation Cache</b></em>'.
 * Visibility evaluation caches are auxiliary data structures which avoid the
 * repeated evaluation of option expressions with respect to the same option
 * binding. They consist of a map that stores the evaluation result of each
 * processed feature expression. The evaluation strategy in {@link OptionExpr}
 * will return the cached result instead of performing a re-evaluation whenever
 * possible.
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date 	2014-07-25
 * @see 	OptionExpr
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai1.supermod.mm.core.VisibilityEvaluationCache#getEntries <em>Entries</em>}</li>
 * </ul>
 *
 * @see de.ubt.ai1.supermod.mm.core.SuperModCorePackage#getVisibilityEvaluationCache()
 * @model
 * @generated
 */
public interface VisibilityEvaluationCache extends EObject {
	/**
	 * Returns the value of the '<em><b>Entries</b></em>' map.
	 * The key is of type {@link de.ubt.ai1.supermod.mm.core.OptionExpr},
	 * and the value is of type {@link de.ubt.ai1.supermod.mm.core.Tristate},
	 * <!-- begin-user-doc -->
	 * <p>
	 * The map used for caching internally.
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entries</em>' map.
	 * @see de.ubt.ai1.supermod.mm.core.SuperModCorePackage#getVisibilityEvaluationCache_Entries()
	 * @model mapType="de.ubt.ai1.supermod.mm.core.OptionExprToTristateMapEntry&lt;de.ubt.ai1.supermod.mm.core.OptionExpr, de.ubt.ai1.supermod.mm.core.Tristate&gt;"
	 * @generated
	 */
	EMap<OptionExpr, Tristate> getEntries();

	/**
	 * <!-- begin-user-doc -->
	 * Empties the cache by cleaning the internal map.
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void invalidate();

	/**
	 * <!-- begin-user-doc -->
	 * Stores the evaluation result of a given option expression in the map.
	 * @param	optionExpr the evaluated option expression.
	 * @param	result the evaluation result to cache.
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void save(OptionExpr optionExpr, Tristate result);

	/**
	 * <!-- begin-user-doc -->
	 * Returns the cached evaluation result for a given option expression.
	 * @param 	optionExpr the expression whose evaluation result to look up.
	 * @return	the cached evaluation result if existing, or <code>null</code>.
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Tristate get(OptionExpr expr);

} // VisibilityEvaluationCache
