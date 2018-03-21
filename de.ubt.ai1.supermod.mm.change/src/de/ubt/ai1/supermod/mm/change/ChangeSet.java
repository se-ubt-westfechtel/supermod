/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.mm.change;

import de.ubt.ai1.supermod.mm.core.UUIDElement;
import org.eclipse.emf.common.util.EList;

import de.ubt.ai1.supermod.mm.core.VersionSpaceElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Change Set</b></em>'.
 * A change set summarizes a set of changes, each performed under a separate
 * ambition.
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date 	2014-07-28
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai1.supermod.mm.change.ChangeSet#getChanges <em>Changes</em>}</li>
 * </ul>
 *
 * @see de.ubt.ai1.supermod.mm.change.SuperModChangePackage#getChangeSet()
 * @model
 * @generated
 */
public interface ChangeSet extends VersionSpaceElement, UUIDElement {
	/**
	 * Returns the value of the '<em><b>Changes</b></em>' containment reference list.
	 * The list contents are of type {@link de.ubt.ai1.supermod.mm.change.Change}.
	 * It is bidirectional and its opposite is '{@link de.ubt.ai1.supermod.mm.change.Change#getChangeSet <em>Change Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * The changes belonging to this change set.
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Changes</em>' containment reference list.
	 * @see de.ubt.ai1.supermod.mm.change.SuperModChangePackage#getChangeSet_Changes()
	 * @see de.ubt.ai1.supermod.mm.change.Change#getChangeSet
	 * @model opposite="changeSet" containment="true"
	 * @generated
	 */
	EList<Change> getChanges();

} // ChangeSet
