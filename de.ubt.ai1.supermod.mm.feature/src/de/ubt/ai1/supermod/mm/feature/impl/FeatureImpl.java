/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.mm.feature.impl;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import de.ubt.ai1.supermod.mm.core.HybridElement;
import de.ubt.ai1.supermod.mm.core.Option;
import de.ubt.ai1.supermod.mm.core.RuleBaseElement;
import de.ubt.ai1.supermod.mm.core.SuperModCorePackage;
import de.ubt.ai1.supermod.mm.core.Tristate;
import de.ubt.ai1.supermod.mm.core.UUIDElement;
import de.ubt.ai1.supermod.mm.core.impl.HybridElementImpl;
import de.ubt.ai1.supermod.mm.feature.ChildRelationship;
import de.ubt.ai1.supermod.mm.feature.DisplayName;
import de.ubt.ai1.supermod.mm.feature.Elimination;
import de.ubt.ai1.supermod.mm.feature.Feature;
import de.ubt.ai1.supermod.mm.feature.FeatureDependency;
import de.ubt.ai1.supermod.mm.feature.FeatureGroup;
import de.ubt.ai1.supermod.mm.feature.FeatureModel;
import de.ubt.ai1.supermod.mm.feature.GroupMembership;
import de.ubt.ai1.supermod.mm.feature.Mandatory;
import de.ubt.ai1.supermod.mm.feature.RootRelationship;
import de.ubt.ai1.supermod.mm.feature.SuperModFeaturePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature</b></em>'.
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date 	2014-07-28
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai1.supermod.mm.feature.impl.FeatureImpl#getUuid <em>Uuid</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.feature.impl.FeatureImpl#getFeatureModel <em>Feature Model</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.feature.impl.FeatureImpl#getFeatureOption <em>Feature Option</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.feature.impl.FeatureImpl#getNames <em>Names</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.feature.impl.FeatureImpl#getChildren <em>Children</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.feature.impl.FeatureImpl#getParents <em>Parents</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.feature.impl.FeatureImpl#getGroups <em>Groups</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.feature.impl.FeatureImpl#getGroupedBy <em>Grouped By</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.feature.impl.FeatureImpl#getIncomingDependencies <em>Incoming Dependencies</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.feature.impl.FeatureImpl#getOutgoingDependencies <em>Outgoing Dependencies</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.feature.impl.FeatureImpl#getMandatory <em>Mandatory</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.feature.impl.FeatureImpl#getEliminations <em>Eliminations</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.feature.impl.FeatureImpl#getIncomingRoots <em>Incoming Roots</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.feature.impl.FeatureImpl#getAllChildFeatures <em>All Child Features</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.feature.impl.FeatureImpl#getTransitiveEliminationState <em>Transitive Elimination State</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FeatureImpl extends HybridElementImpl implements Feature {
	/**
	 * The default value of the '{@link #getUuid() <em>Uuid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUuid()
	 * @generated
	 * @ordered
	 */
	protected static final String UUID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUuid() <em>Uuid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUuid()
	 * @generated
	 * @ordered
	 */
	protected String uuid = UUID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFeatureOption() <em>Feature Option</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureOption()
	 * @generated
	 * @ordered
	 */
	protected Option featureOption;

	/**
	 * The cached value of the '{@link #getNames() <em>Names</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNames()
	 * @generated
	 * @ordered
	 */
	protected EList<DisplayName> names;

	/**
	 * The cached value of the '{@link #getChildren() <em>Children</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildren()
	 * @generated
	 * @ordered
	 */
	protected EList<ChildRelationship> children;

	/**
	 * The cached value of the '{@link #getParents() <em>Parents</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParents()
	 * @generated
	 * @ordered
	 */
	protected EList<ChildRelationship> parents;

	/**
	 * The cached value of the '{@link #getGroups() <em>Groups</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroups()
	 * @generated
	 * @ordered
	 */
	protected EList<FeatureGroup> groups;

	/**
	 * The cached value of the '{@link #getGroupedBy() <em>Grouped By</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupedBy()
	 * @generated
	 * @ordered
	 */
	protected EList<GroupMembership> groupedBy;

	/**
	 * The cached value of the '{@link #getIncomingDependencies() <em>Incoming Dependencies</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncomingDependencies()
	 * @generated
	 * @ordered
	 */
	protected EList<FeatureDependency> incomingDependencies;

	/**
	 * The cached value of the '{@link #getOutgoingDependencies() <em>Outgoing Dependencies</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoingDependencies()
	 * @generated
	 * @ordered
	 */
	protected EList<FeatureDependency> outgoingDependencies;

	/**
	 * The cached value of the '{@link #getMandatory() <em>Mandatory</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMandatory()
	 * @generated
	 * @ordered
	 */
	protected Mandatory mandatory;

	/**
	 * The cached value of the '{@link #getEliminations() <em>Eliminations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEliminations()
	 * @generated
	 * @ordered
	 */
	protected EList<Elimination> eliminations;

	/**
	 * The cached value of the '{@link #getIncomingRoots() <em>Incoming Roots</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncomingRoots()
	 * @generated
	 * @ordered
	 */
	protected EList<RootRelationship> incomingRoots;

	/**
	 * The default value of the '{@link #getTransitiveEliminationState() <em>Transitive Elimination State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransitiveEliminationState()
	 * @generated
	 * @ordered
	 */
	protected static final Tristate TRANSITIVE_ELIMINATION_STATE_EDEFAULT = Tristate.UNKNOWN;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SuperModFeaturePackage.Literals.FEATURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUuid() {
		return uuid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUuid(String newUuid) {
		String oldUuid = uuid;
		uuid = newUuid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SuperModFeaturePackage.FEATURE__UUID, oldUuid, uuid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureModel getFeatureModel() {
		if (eContainerFeatureID() != SuperModFeaturePackage.FEATURE__FEATURE_MODEL) return null;
		return (FeatureModel)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFeatureModel(FeatureModel newFeatureModel, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newFeatureModel, SuperModFeaturePackage.FEATURE__FEATURE_MODEL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeatureModel(FeatureModel newFeatureModel) {
		if (newFeatureModel != eInternalContainer() || (eContainerFeatureID() != SuperModFeaturePackage.FEATURE__FEATURE_MODEL && newFeatureModel != null)) {
			if (EcoreUtil.isAncestor(this, newFeatureModel))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newFeatureModel != null)
				msgs = ((InternalEObject)newFeatureModel).eInverseAdd(this, SuperModFeaturePackage.FEATURE_MODEL__FEATURES, FeatureModel.class, msgs);
			msgs = basicSetFeatureModel(newFeatureModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SuperModFeaturePackage.FEATURE__FEATURE_MODEL, newFeatureModel, newFeatureModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Option getFeatureOption() {
		return featureOption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFeatureOption(Option newFeatureOption, NotificationChain msgs) {
		Option oldFeatureOption = featureOption;
		featureOption = newFeatureOption;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SuperModFeaturePackage.FEATURE__FEATURE_OPTION, oldFeatureOption, newFeatureOption);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeatureOption(Option newFeatureOption) {
		if (newFeatureOption != featureOption) {
			NotificationChain msgs = null;
			if (featureOption != null)
				msgs = ((InternalEObject)featureOption).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SuperModFeaturePackage.FEATURE__FEATURE_OPTION, null, msgs);
			if (newFeatureOption != null)
				msgs = ((InternalEObject)newFeatureOption).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SuperModFeaturePackage.FEATURE__FEATURE_OPTION, null, msgs);
			msgs = basicSetFeatureOption(newFeatureOption, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SuperModFeaturePackage.FEATURE__FEATURE_OPTION, newFeatureOption, newFeatureOption));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DisplayName> getNames() {
		if (names == null) {
			names = new EObjectContainmentWithInverseEList<DisplayName>(DisplayName.class, this, SuperModFeaturePackage.FEATURE__NAMES, SuperModFeaturePackage.DISPLAY_NAME__FEATURE);
		}
		return names;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ChildRelationship> getChildren() {
		if (children == null) {
			children = new EObjectContainmentWithInverseEList<ChildRelationship>(ChildRelationship.class, this, SuperModFeaturePackage.FEATURE__CHILDREN, SuperModFeaturePackage.CHILD_RELATIONSHIP__PARENT);
		}
		return children;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ChildRelationship> getParents() {
		if (parents == null) {
			parents = new EObjectWithInverseResolvingEList<ChildRelationship>(ChildRelationship.class, this, SuperModFeaturePackage.FEATURE__PARENTS, SuperModFeaturePackage.CHILD_RELATIONSHIP__CHILD);
		}
		return parents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FeatureGroup> getGroups() {
		if (groups == null) {
			groups = new EObjectContainmentWithInverseEList<FeatureGroup>(FeatureGroup.class, this, SuperModFeaturePackage.FEATURE__GROUPS, SuperModFeaturePackage.FEATURE_GROUP__PARENT_FEATURE);
		}
		return groups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FeatureDependency> getIncomingDependencies() {
		if (incomingDependencies == null) {
			incomingDependencies = new EObjectWithInverseResolvingEList<FeatureDependency>(FeatureDependency.class, this, SuperModFeaturePackage.FEATURE__INCOMING_DEPENDENCIES, SuperModFeaturePackage.FEATURE_DEPENDENCY__TARGET_FEATURE);
		}
		return incomingDependencies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FeatureDependency> getOutgoingDependencies() {
		if (outgoingDependencies == null) {
			outgoingDependencies = new EObjectContainmentWithInverseEList<FeatureDependency>(FeatureDependency.class, this, SuperModFeaturePackage.FEATURE__OUTGOING_DEPENDENCIES, SuperModFeaturePackage.FEATURE_DEPENDENCY__SOURCE_FEATURE);
		}
		return outgoingDependencies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mandatory getMandatory() {
		return mandatory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMandatory(Mandatory newMandatory, NotificationChain msgs) {
		Mandatory oldMandatory = mandatory;
		mandatory = newMandatory;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SuperModFeaturePackage.FEATURE__MANDATORY, oldMandatory, newMandatory);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMandatory(Mandatory newMandatory) {
		if (newMandatory != mandatory) {
			NotificationChain msgs = null;
			if (mandatory != null)
				msgs = ((InternalEObject)mandatory).eInverseRemove(this, SuperModFeaturePackage.MANDATORY__FEATURE, Mandatory.class, msgs);
			if (newMandatory != null)
				msgs = ((InternalEObject)newMandatory).eInverseAdd(this, SuperModFeaturePackage.MANDATORY__FEATURE, Mandatory.class, msgs);
			msgs = basicSetMandatory(newMandatory, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SuperModFeaturePackage.FEATURE__MANDATORY, newMandatory, newMandatory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Elimination> getEliminations() {
		if (eliminations == null) {
			eliminations = new EObjectContainmentWithInverseEList<Elimination>(Elimination.class, this, SuperModFeaturePackage.FEATURE__ELIMINATIONS, SuperModFeaturePackage.ELIMINATION__FEATURE);
		}
		return eliminations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RootRelationship> getIncomingRoots() {
		if (incomingRoots == null) {
			incomingRoots = new EObjectWithInverseResolvingEList<RootRelationship>(RootRelationship.class, this, SuperModFeaturePackage.FEATURE__INCOMING_ROOTS, SuperModFeaturePackage.ROOT_RELATIONSHIP__FEATURE);
		}
		return incomingRoots;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Feature> getAllChildFeatures() {
		return ECollections.unmodifiableEList(
				getAllChildFeaturesRec(new HashSet<Feature>()));
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Tristate getTransitiveEliminationState() {
		return getTransitiveEliminationStateRec(new HashSet<Feature>());
	}

	private Tristate getTransitiveEliminationStateRec(Set<Feature> tabu) {
		tabu.add(this);
		for (Elimination e : getEliminations()) {
			return e.getDefaultSelection();
		}
		for (ChildRelationship parent : getParents()) {
			if (!tabu.contains(parent.getParent())) {
				return ((FeatureImpl) parent.getParent()).getTransitiveEliminationStateRec(tabu);
			}
		}
		return Tristate.UNKNOWN;
	}

	private EList<Feature> getAllChildFeaturesRec(Set<Feature> tabu) {
		EList<Feature> children = ECollections.newBasicEList();
		for (ChildRelationship cr : getChildren()) {
			Feature child = cr.getChild();
			if (child != null && !tabu.contains(child)) {
				tabu.add(child);
				children.add(child);
				children.addAll(((FeatureImpl) child).getAllChildFeaturesRec(tabu));
			}
		}
		return children;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GroupMembership> getGroupedBy() {
		if (groupedBy == null) {
			groupedBy = new EObjectWithInverseResolvingEList<GroupMembership>(GroupMembership.class, this, SuperModFeaturePackage.FEATURE__GROUPED_BY, SuperModFeaturePackage.GROUP_MEMBERSHIP__GROUPED_FEATURE);
		}
		return groupedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Feature basicGetParent() {
		if (eContainer() instanceof Feature) {
			return (Feature) eContainer();
		}
		else if (eContainer() instanceof FeatureGroup) {
			return ((FeatureGroup) eContainer()).getParentFeature();
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SuperModFeaturePackage.FEATURE__FEATURE_MODEL:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetFeatureModel((FeatureModel)otherEnd, msgs);
			case SuperModFeaturePackage.FEATURE__NAMES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getNames()).basicAdd(otherEnd, msgs);
			case SuperModFeaturePackage.FEATURE__CHILDREN:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getChildren()).basicAdd(otherEnd, msgs);
			case SuperModFeaturePackage.FEATURE__PARENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getParents()).basicAdd(otherEnd, msgs);
			case SuperModFeaturePackage.FEATURE__GROUPS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGroups()).basicAdd(otherEnd, msgs);
			case SuperModFeaturePackage.FEATURE__GROUPED_BY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGroupedBy()).basicAdd(otherEnd, msgs);
			case SuperModFeaturePackage.FEATURE__INCOMING_DEPENDENCIES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIncomingDependencies()).basicAdd(otherEnd, msgs);
			case SuperModFeaturePackage.FEATURE__OUTGOING_DEPENDENCIES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutgoingDependencies()).basicAdd(otherEnd, msgs);
			case SuperModFeaturePackage.FEATURE__MANDATORY:
				if (mandatory != null)
					msgs = ((InternalEObject)mandatory).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SuperModFeaturePackage.FEATURE__MANDATORY, null, msgs);
				return basicSetMandatory((Mandatory)otherEnd, msgs);
			case SuperModFeaturePackage.FEATURE__ELIMINATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEliminations()).basicAdd(otherEnd, msgs);
			case SuperModFeaturePackage.FEATURE__INCOMING_ROOTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIncomingRoots()).basicAdd(otherEnd, msgs);
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
			case SuperModFeaturePackage.FEATURE__FEATURE_MODEL:
				return basicSetFeatureModel(null, msgs);
			case SuperModFeaturePackage.FEATURE__FEATURE_OPTION:
				return basicSetFeatureOption(null, msgs);
			case SuperModFeaturePackage.FEATURE__NAMES:
				return ((InternalEList<?>)getNames()).basicRemove(otherEnd, msgs);
			case SuperModFeaturePackage.FEATURE__CHILDREN:
				return ((InternalEList<?>)getChildren()).basicRemove(otherEnd, msgs);
			case SuperModFeaturePackage.FEATURE__PARENTS:
				return ((InternalEList<?>)getParents()).basicRemove(otherEnd, msgs);
			case SuperModFeaturePackage.FEATURE__GROUPS:
				return ((InternalEList<?>)getGroups()).basicRemove(otherEnd, msgs);
			case SuperModFeaturePackage.FEATURE__GROUPED_BY:
				return ((InternalEList<?>)getGroupedBy()).basicRemove(otherEnd, msgs);
			case SuperModFeaturePackage.FEATURE__INCOMING_DEPENDENCIES:
				return ((InternalEList<?>)getIncomingDependencies()).basicRemove(otherEnd, msgs);
			case SuperModFeaturePackage.FEATURE__OUTGOING_DEPENDENCIES:
				return ((InternalEList<?>)getOutgoingDependencies()).basicRemove(otherEnd, msgs);
			case SuperModFeaturePackage.FEATURE__MANDATORY:
				return basicSetMandatory(null, msgs);
			case SuperModFeaturePackage.FEATURE__ELIMINATIONS:
				return ((InternalEList<?>)getEliminations()).basicRemove(otherEnd, msgs);
			case SuperModFeaturePackage.FEATURE__INCOMING_ROOTS:
				return ((InternalEList<?>)getIncomingRoots()).basicRemove(otherEnd, msgs);
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
			case SuperModFeaturePackage.FEATURE__FEATURE_MODEL:
				return eInternalContainer().eInverseRemove(this, SuperModFeaturePackage.FEATURE_MODEL__FEATURES, FeatureModel.class, msgs);
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
			case SuperModFeaturePackage.FEATURE__UUID:
				return getUuid();
			case SuperModFeaturePackage.FEATURE__FEATURE_MODEL:
				return getFeatureModel();
			case SuperModFeaturePackage.FEATURE__FEATURE_OPTION:
				return getFeatureOption();
			case SuperModFeaturePackage.FEATURE__NAMES:
				return getNames();
			case SuperModFeaturePackage.FEATURE__CHILDREN:
				return getChildren();
			case SuperModFeaturePackage.FEATURE__PARENTS:
				return getParents();
			case SuperModFeaturePackage.FEATURE__GROUPS:
				return getGroups();
			case SuperModFeaturePackage.FEATURE__GROUPED_BY:
				return getGroupedBy();
			case SuperModFeaturePackage.FEATURE__INCOMING_DEPENDENCIES:
				return getIncomingDependencies();
			case SuperModFeaturePackage.FEATURE__OUTGOING_DEPENDENCIES:
				return getOutgoingDependencies();
			case SuperModFeaturePackage.FEATURE__MANDATORY:
				return getMandatory();
			case SuperModFeaturePackage.FEATURE__ELIMINATIONS:
				return getEliminations();
			case SuperModFeaturePackage.FEATURE__INCOMING_ROOTS:
				return getIncomingRoots();
			case SuperModFeaturePackage.FEATURE__ALL_CHILD_FEATURES:
				return getAllChildFeatures();
			case SuperModFeaturePackage.FEATURE__TRANSITIVE_ELIMINATION_STATE:
				return getTransitiveEliminationState();
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
			case SuperModFeaturePackage.FEATURE__UUID:
				setUuid((String)newValue);
				return;
			case SuperModFeaturePackage.FEATURE__FEATURE_MODEL:
				setFeatureModel((FeatureModel)newValue);
				return;
			case SuperModFeaturePackage.FEATURE__FEATURE_OPTION:
				setFeatureOption((Option)newValue);
				return;
			case SuperModFeaturePackage.FEATURE__NAMES:
				getNames().clear();
				getNames().addAll((Collection<? extends DisplayName>)newValue);
				return;
			case SuperModFeaturePackage.FEATURE__CHILDREN:
				getChildren().clear();
				getChildren().addAll((Collection<? extends ChildRelationship>)newValue);
				return;
			case SuperModFeaturePackage.FEATURE__PARENTS:
				getParents().clear();
				getParents().addAll((Collection<? extends ChildRelationship>)newValue);
				return;
			case SuperModFeaturePackage.FEATURE__GROUPS:
				getGroups().clear();
				getGroups().addAll((Collection<? extends FeatureGroup>)newValue);
				return;
			case SuperModFeaturePackage.FEATURE__GROUPED_BY:
				getGroupedBy().clear();
				getGroupedBy().addAll((Collection<? extends GroupMembership>)newValue);
				return;
			case SuperModFeaturePackage.FEATURE__INCOMING_DEPENDENCIES:
				getIncomingDependencies().clear();
				getIncomingDependencies().addAll((Collection<? extends FeatureDependency>)newValue);
				return;
			case SuperModFeaturePackage.FEATURE__OUTGOING_DEPENDENCIES:
				getOutgoingDependencies().clear();
				getOutgoingDependencies().addAll((Collection<? extends FeatureDependency>)newValue);
				return;
			case SuperModFeaturePackage.FEATURE__MANDATORY:
				setMandatory((Mandatory)newValue);
				return;
			case SuperModFeaturePackage.FEATURE__ELIMINATIONS:
				getEliminations().clear();
				getEliminations().addAll((Collection<? extends Elimination>)newValue);
				return;
			case SuperModFeaturePackage.FEATURE__INCOMING_ROOTS:
				getIncomingRoots().clear();
				getIncomingRoots().addAll((Collection<? extends RootRelationship>)newValue);
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
			case SuperModFeaturePackage.FEATURE__UUID:
				setUuid(UUID_EDEFAULT);
				return;
			case SuperModFeaturePackage.FEATURE__FEATURE_MODEL:
				setFeatureModel((FeatureModel)null);
				return;
			case SuperModFeaturePackage.FEATURE__FEATURE_OPTION:
				setFeatureOption((Option)null);
				return;
			case SuperModFeaturePackage.FEATURE__NAMES:
				getNames().clear();
				return;
			case SuperModFeaturePackage.FEATURE__CHILDREN:
				getChildren().clear();
				return;
			case SuperModFeaturePackage.FEATURE__PARENTS:
				getParents().clear();
				return;
			case SuperModFeaturePackage.FEATURE__GROUPS:
				getGroups().clear();
				return;
			case SuperModFeaturePackage.FEATURE__GROUPED_BY:
				getGroupedBy().clear();
				return;
			case SuperModFeaturePackage.FEATURE__INCOMING_DEPENDENCIES:
				getIncomingDependencies().clear();
				return;
			case SuperModFeaturePackage.FEATURE__OUTGOING_DEPENDENCIES:
				getOutgoingDependencies().clear();
				return;
			case SuperModFeaturePackage.FEATURE__MANDATORY:
				setMandatory((Mandatory)null);
				return;
			case SuperModFeaturePackage.FEATURE__ELIMINATIONS:
				getEliminations().clear();
				return;
			case SuperModFeaturePackage.FEATURE__INCOMING_ROOTS:
				getIncomingRoots().clear();
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
			case SuperModFeaturePackage.FEATURE__UUID:
				return UUID_EDEFAULT == null ? uuid != null : !UUID_EDEFAULT.equals(uuid);
			case SuperModFeaturePackage.FEATURE__FEATURE_MODEL:
				return getFeatureModel() != null;
			case SuperModFeaturePackage.FEATURE__FEATURE_OPTION:
				return featureOption != null;
			case SuperModFeaturePackage.FEATURE__NAMES:
				return names != null && !names.isEmpty();
			case SuperModFeaturePackage.FEATURE__CHILDREN:
				return children != null && !children.isEmpty();
			case SuperModFeaturePackage.FEATURE__PARENTS:
				return parents != null && !parents.isEmpty();
			case SuperModFeaturePackage.FEATURE__GROUPS:
				return groups != null && !groups.isEmpty();
			case SuperModFeaturePackage.FEATURE__GROUPED_BY:
				return groupedBy != null && !groupedBy.isEmpty();
			case SuperModFeaturePackage.FEATURE__INCOMING_DEPENDENCIES:
				return incomingDependencies != null && !incomingDependencies.isEmpty();
			case SuperModFeaturePackage.FEATURE__OUTGOING_DEPENDENCIES:
				return outgoingDependencies != null && !outgoingDependencies.isEmpty();
			case SuperModFeaturePackage.FEATURE__MANDATORY:
				return mandatory != null;
			case SuperModFeaturePackage.FEATURE__ELIMINATIONS:
				return eliminations != null && !eliminations.isEmpty();
			case SuperModFeaturePackage.FEATURE__INCOMING_ROOTS:
				return incomingRoots != null && !incomingRoots.isEmpty();
			case SuperModFeaturePackage.FEATURE__ALL_CHILD_FEATURES:
				return !getAllChildFeatures().isEmpty();
			case SuperModFeaturePackage.FEATURE__TRANSITIVE_ELIMINATION_STATE:
				return getTransitiveEliminationState() != TRANSITIVE_ELIMINATION_STATE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == UUIDElement.class) {
			switch (derivedFeatureID) {
				case SuperModFeaturePackage.FEATURE__UUID: return SuperModCorePackage.UUID_ELEMENT__UUID;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == UUIDElement.class) {
			switch (baseFeatureID) {
				case SuperModCorePackage.UUID_ELEMENT__UUID: return SuperModFeaturePackage.FEATURE__UUID;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String toString() {
		return getNames().toString();
	}

	@Override
	public HybridElement basicGetSuperHybridElement() {
		return null;
	}

	@Override
	public EList<HybridElement> getSubHybridElements() {
		EList<HybridElement> subElements = ECollections.newBasicEList();
		if (getMandatory() != null) {
			subElements.add(getMandatory());
		}
		subElements.addAll(getNames());
		subElements.addAll(getChildren());
		subElements.addAll(getGroups());
		subElements.addAll(getOutgoingDependencies());
		subElements.addAll(getEliminations());
		return ECollections.unmodifiableEList(subElements);
	}

	@Override
	public EList<HybridElement> getCrossReferencedHybridElements() {
		return ECollections.emptyEList();
	}
	
	@Override
	public EList<HybridElement> getCrossReferencingHybridElements() {
		EList<HybridElement> referencingElements = ECollections.newBasicEList();
		referencingElements.addAll(getIncomingRoots());
		referencingElements.addAll(getParents());
		referencingElements.addAll(getGroupedBy());
		referencingElements.addAll(getIncomingDependencies());
		return ECollections.unmodifiableEList(referencingElements);	
	}

	@Override
	public EList<RuleBaseElement> getLowLevelConcepts() {
		if (getFeatureOption() != null) {
			return ECollections.singletonEList(getFeatureOption());
		}
		return ECollections.emptyEList();
	}
	
} //FeatureImpl
