/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.mm.feature.impl;

import de.ubt.ai1.supermod.mm.feature.*;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date 	2014-07-28
 * <!-- end-user-doc -->
 * @generated
 */
public class SuperModFeatureFactoryImpl extends EFactoryImpl implements SuperModFeatureFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SuperModFeatureFactory init() {
		try {
			SuperModFeatureFactory theSuperModFeatureFactory = (SuperModFeatureFactory)EPackage.Registry.INSTANCE.getEFactory(SuperModFeaturePackage.eNS_URI);
			if (theSuperModFeatureFactory != null) {
				return theSuperModFeatureFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SuperModFeatureFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SuperModFeatureFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case SuperModFeaturePackage.FEATURE_MODEL: return createFeatureModel();
			case SuperModFeaturePackage.FEATURE: return createFeature();
			case SuperModFeaturePackage.DISPLAY_NAME: return createDisplayName();
			case SuperModFeaturePackage.GROUP_MEMBERSHIP: return createGroupMembership();
			case SuperModFeaturePackage.OR_FEATURE_GROUP: return createOrFeatureGroup();
			case SuperModFeaturePackage.XOR_FEATURE_GROUP: return createXorFeatureGroup();
			case SuperModFeaturePackage.FEATURE_REQUIREMENT: return createFeatureRequirement();
			case SuperModFeaturePackage.FEATURE_EXCLUSION: return createFeatureExclusion();
			case SuperModFeaturePackage.ROOT_RELATIONSHIP: return createRootRelationship();
			case SuperModFeaturePackage.CHILD_RELATIONSHIP: return createChildRelationship();
			case SuperModFeaturePackage.MANDATORY: return createMandatory();
			case SuperModFeaturePackage.ELIMINATION: return createElimination();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureModel createFeatureModel() {
		FeatureModelImpl featureModel = new FeatureModelImpl();
		return featureModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature createFeature() {
		FeatureImpl feature = new FeatureImpl();
		return feature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DisplayName createDisplayName() {
		DisplayNameImpl displayName = new DisplayNameImpl();
		return displayName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroupMembership createGroupMembership() {
		GroupMembershipImpl groupMembership = new GroupMembershipImpl();
		return groupMembership;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrFeatureGroup createOrFeatureGroup() {
		OrFeatureGroupImpl orFeatureGroup = new OrFeatureGroupImpl();
		return orFeatureGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XorFeatureGroup createXorFeatureGroup() {
		XorFeatureGroupImpl xorFeatureGroup = new XorFeatureGroupImpl();
		return xorFeatureGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureRequirement createFeatureRequirement() {
		FeatureRequirementImpl featureRequirement = new FeatureRequirementImpl();
		return featureRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureExclusion createFeatureExclusion() {
		FeatureExclusionImpl featureExclusion = new FeatureExclusionImpl();
		return featureExclusion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RootRelationship createRootRelationship() {
		RootRelationshipImpl rootRelationship = new RootRelationshipImpl();
		return rootRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChildRelationship createChildRelationship() {
		ChildRelationshipImpl childRelationship = new ChildRelationshipImpl();
		return childRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mandatory createMandatory() {
		MandatoryImpl mandatory = new MandatoryImpl();
		return mandatory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Elimination createElimination() {
		EliminationImpl elimination = new EliminationImpl();
		return elimination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SuperModFeaturePackage getSuperModFeaturePackage() {
		return (SuperModFeaturePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SuperModFeaturePackage getPackage() {
		return SuperModFeaturePackage.eINSTANCE;
	}

} //SuperModSPLEFactoryImpl
