/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.mm.change;

import org.eclipse.emf.common.util.EList;

import de.ubt.ai1.supermod.mm.core.VersionDimension;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Change Dimension</b></em>'.
 * A change dimension defines a number of change sets, each describing a
 * (composite) modification to the product space performed under a given ambition,
 * which describes the set of versions in which the change is visible.
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date 	2014-07-28
 * @see		ChangeSet
 * @see		Change
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai1.supermod.mm.change.ChangeDimension#getChangeSets <em>Change Sets</em>}</li>
 * </ul>
 *
 * @see de.ubt.ai1.supermod.mm.change.SuperModChangePackage#getChangeDimension()
 * @model
 * @generated
 */
public interface ChangeDimension extends VersionDimension {

	/**
	 * Returns the value of the '<em><b>Change Sets</b></em>' containment reference list.
	 * The list contents are of type {@link de.ubt.ai1.supermod.mm.change.ChangeSet}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * Returns the change sets that have been recorded. These are not necessarily
	 * ordered with respect to the temporal application of changes.
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Change Sets</em>' containment reference list.
	 * @see de.ubt.ai1.supermod.mm.change.SuperModChangePackage#getChangeDimension_ChangeSets()
	 * @model containment="true"
	 * @generated
	 */
	EList<ChangeSet> getChangeSets();
} // ChangeDimension
