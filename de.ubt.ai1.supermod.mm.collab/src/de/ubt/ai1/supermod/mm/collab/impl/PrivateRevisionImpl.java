/**
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package de.ubt.ai1.supermod.mm.collab.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.UniqueEList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

import de.ubt.ai1.supermod.mm.collab.PrivateRevision;
import de.ubt.ai1.supermod.mm.collab.PublicRevision;
import de.ubt.ai1.supermod.mm.collab.Revision;
import de.ubt.ai1.supermod.mm.collab.SuperModCollabPackage;
import de.ubt.ai1.supermod.mm.core.VersionSpaceElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Private Revision</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai1.supermod.mm.collab.impl.PrivateRevisionImpl#getPublicRevision <em>Public Revision</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.collab.impl.PrivateRevisionImpl#getPublicPredecessors <em>Public Predecessors</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PrivateRevisionImpl extends RevisionImpl implements PrivateRevision {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrivateRevisionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SuperModCollabPackage.Literals.PRIVATE_REVISION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PublicRevision getPublicRevision() {
		if (eContainerFeatureID() != SuperModCollabPackage.PRIVATE_REVISION__PUBLIC_REVISION) return null;
		return (PublicRevision)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPublicRevision(PublicRevision newPublicRevision, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newPublicRevision, SuperModCollabPackage.PRIVATE_REVISION__PUBLIC_REVISION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPublicRevision(PublicRevision newPublicRevision) {
		if (newPublicRevision != eInternalContainer() || (eContainerFeatureID() != SuperModCollabPackage.PRIVATE_REVISION__PUBLIC_REVISION && newPublicRevision != null)) {
			if (EcoreUtil.isAncestor(this, newPublicRevision))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newPublicRevision != null)
				msgs = ((InternalEObject)newPublicRevision).eInverseAdd(this, SuperModCollabPackage.PUBLIC_REVISION__PRIVATE_REVISIONS, PublicRevision.class, msgs);
			msgs = basicSetPublicRevision(newPublicRevision, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SuperModCollabPackage.PRIVATE_REVISION__PUBLIC_REVISION, newPublicRevision, newPublicRevision));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<PublicRevision> getPublicPredecessors() {
		EList<PublicRevision> result = new UniqueEList<>();
		for (Revision pred : getPredecessors()) {
			if (pred instanceof PublicRevision) {
				result.add((PublicRevision) pred);
			}
			else if (pred instanceof PrivateRevision) {
				result.addAll(((PrivateRevision) pred).getPublicPredecessors());
			}
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SuperModCollabPackage.PRIVATE_REVISION__PUBLIC_REVISION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetPublicRevision((PublicRevision)otherEnd, msgs);
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
			case SuperModCollabPackage.PRIVATE_REVISION__PUBLIC_REVISION:
				return basicSetPublicRevision(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case SuperModCollabPackage.PRIVATE_REVISION__PUBLIC_REVISION:
				return eInternalContainer().eInverseRemove(this, SuperModCollabPackage.PUBLIC_REVISION__PRIVATE_REVISIONS, PublicRevision.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SuperModCollabPackage.PRIVATE_REVISION__PUBLIC_REVISION:
				return getPublicRevision();
			case SuperModCollabPackage.PRIVATE_REVISION__PUBLIC_PREDECESSORS:
				return getPublicPredecessors();
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
			case SuperModCollabPackage.PRIVATE_REVISION__PUBLIC_REVISION:
				setPublicRevision((PublicRevision)newValue);
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
			case SuperModCollabPackage.PRIVATE_REVISION__PUBLIC_REVISION:
				setPublicRevision((PublicRevision)null);
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
			case SuperModCollabPackage.PRIVATE_REVISION__PUBLIC_REVISION:
				return getPublicRevision() != null;
			case SuperModCollabPackage.PRIVATE_REVISION__PUBLIC_PREDECESSORS:
				return !getPublicPredecessors().isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.mm.core.impl.VersionSpaceElementImpl#basicGetSuperVersionSpaceElement()
	 */
	@Override
	public VersionSpaceElement basicGetSuperVersionSpaceElement() {
		return getPublicRevision();
	}

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.mm.core.impl.VersionSpaceElementImpl#getSubVersionSpaceElements()
	 */
	@Override
	public EList<VersionSpaceElement> getSubVersionSpaceElements() {
		return ECollections.emptyEList();
	}

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.mm.collab.impl.RevisionImpl#getDisplayRevisionNumber()
	 */
	@Override
	public String getDisplayRevisionNumber() {
		if (getPublicRevision() == null) {
			return "0." + getRevisionNumber();
		}
		return getPublicRevision().getRevisionNumber() + "." + getRevisionNumber();
	}
	
	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.mm.collab.impl.RevisionImpl#toString()
	 */
	@Override
	public String toString() {
		StringBuffer result = new StringBuffer(super.toString());
		result.append(getPublicRevision().getCommitter());
		return result.toString();
	}

} //PrivateRevisionImpl
