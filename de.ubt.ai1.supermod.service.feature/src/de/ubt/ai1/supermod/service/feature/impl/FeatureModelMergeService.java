/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.service.feature.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.EList;

import com.google.inject.Inject;

import de.ubt.ai1.supermod.mm.core.Option;
import de.ubt.ai1.supermod.mm.core.ProductDimension;
import de.ubt.ai1.supermod.mm.core.SuperModCoreFactory;
import de.ubt.ai1.supermod.mm.core.Tristate;
import de.ubt.ai1.supermod.mm.core.VersionDimension;
import de.ubt.ai1.supermod.mm.core.VisibilityForest;
import de.ubt.ai1.supermod.mm.diff.MatchingRole;
import de.ubt.ai1.supermod.mm.diff.ProductDimensionMatching;
import de.ubt.ai1.supermod.mm.diff.ProductSpaceElementMatching;
import de.ubt.ai1.supermod.mm.diff.SuperModDiffFactory;
import de.ubt.ai1.supermod.mm.feature.ChildRelationship;
import de.ubt.ai1.supermod.mm.feature.DisplayName;
import de.ubt.ai1.supermod.mm.feature.Elimination;
import de.ubt.ai1.supermod.mm.feature.Feature;
import de.ubt.ai1.supermod.mm.feature.FeatureDependency;
import de.ubt.ai1.supermod.mm.feature.FeatureExclusion;
import de.ubt.ai1.supermod.mm.feature.FeatureGroup;
import de.ubt.ai1.supermod.mm.feature.FeatureModel;
import de.ubt.ai1.supermod.mm.feature.FeatureRequirement;
import de.ubt.ai1.supermod.mm.feature.GroupMembership;
import de.ubt.ai1.supermod.mm.feature.Mandatory;
import de.ubt.ai1.supermod.mm.feature.OrFeatureGroup;
import de.ubt.ai1.supermod.mm.feature.RootRelationship;
import de.ubt.ai1.supermod.mm.feature.SuperModFeatureFactory;
import de.ubt.ai1.supermod.mm.feature.XorFeatureGroup;
import de.ubt.ai1.supermod.service.IProductDimensionMatchService;
import de.ubt.ai1.supermod.service.IProductDimensionMergeService;
import de.ubt.ai1.supermod.service.IVersionDimensionMergeService;
import de.ubt.ai1.supermod.service.IVersionDimensionReconciliationService;
import de.ubt.ai1.supermod.service.IVisibilityMergeService;
import de.ubt.ai1.supermod.service.generic.MatchUtil;
import de.ubt.ai1.supermod.service.generic.MergeUtil;
import de.ubt.ai1.supermod.service.generic.MergeUtil.PropertyAccessor;

/**
 * A hybrid implementation of both the product dimension and the version
 * dimension merge service interface specific to versioned feature models,
 * which are a hybrid dimension.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	17.11.2014
 */
public class FeatureModelMergeService 
implements IProductDimensionMergeService, IVersionDimensionMergeService {
	
	protected static final String BASE = "BASE";
	protected static final String OTHER = "OTHER";
	
	protected static final PropertyAccessor<Feature, String> featureUuidAccessor
			= new PropertyAccessor<Feature, String>() {
				@Override
				public String getProperty(Feature v) {
					return v.getUuid();
				}
			};
			
	@Inject
	private IVisibilityMergeService visibilityMergeService;
	
	@Inject
	@de.ubt.ai1.supermod.service.feature.Feature
	private IVersionDimensionReconciliationService featureReconService;
	
	@Inject
	@de.ubt.ai1.supermod.service.feature.Feature
	private IProductDimensionMatchService featureDimMatchService;
		
	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.IProductDimensionMergeService
	 * #merge(de.ubt.ai1.supermod.service.ProductDimensionMatching, 
	 * java.util.Collection, de.ubt.ai1.supermod.service.MatchingRole,
	 *  de.ubt.ai1.supermod.mm.core.VisibilityForest)
	 */
	@Override
	public ProductDimension mergeOutPlace(ProductDimensionMatching pdMatching,
			Collection<MatchingRole> inputRoles, MatchingRole mergeRole,
			VisibilityForest visibilityForest) {
		
		Map<String, Feature> featureMap = new HashMap<>();
		
		// merge the feature models without merging their contents
		Collection<FeatureModel> featureModels = MergeUtil.filterPdMatching(
				pdMatching, FeatureModel.class, inputRoles);
		if (featureModels.isEmpty()) return null;
		FeatureModel mergedFm = SuperModFeatureFactory.eINSTANCE
				.createFeatureModel();
		mergedFm.setDimensionName(MergeUtil.getUnique(featureModels, 
				new PropertyAccessor<ProductDimension, String>() {
					@Override
					public String getProperty(ProductDimension v) {
						return v.getDimensionName();
					}			
		}));
		
		for (ProductSpaceElementMatching featEm : 
			pdMatching.getRootElementMatchings()) {
			EList<Feature> matchedFeatures = 
					MergeUtil.filterMatching(featEm, Feature.class);
			if (matchedFeatures != null && !matchedFeatures.isEmpty()) {
				Feature mergedFeature = mergeFeatureOutPlace(matchedFeatures, mergedFm,
						mergeRole, visibilityForest, featureMap);
				MergeUtil.addMergeRole(featEm, mergeRole, mergedFeature);
				MergeUtil.updateTransactionId(featEm, mergedFeature, mergeRole);
			}
		}
		
		for (ProductSpaceElementMatching rootEm : 
			pdMatching.getRootElementMatchings()) {
			EList<RootRelationship> matchedRoots = 
					MergeUtil.filterMatching(rootEm, RootRelationship.class);
			if (matchedRoots != null && !matchedRoots.isEmpty()) {
				RootRelationship mergedRoot = mergeRootOutPlace(matchedRoots, mergedFm, 
						mergeRole, visibilityForest, featureMap);			
				MergeUtil.addMergeRole(rootEm, mergeRole, mergedRoot);
				MergeUtil.updateTransactionId(rootEm, mergedRoot, mergeRole);
			}
		}
		
		for (ProductSpaceElementMatching featEm : 
			pdMatching.getRootElementMatchings()) {
			EList<Feature> matchedFeatures = 
					MergeUtil.filterMatching(featEm, Feature.class);
			String featureName = MergeUtil.getUnique(matchedFeatures,
					featureUuidAccessor);
			Feature mergedFeature = featureMap.get(featureName);
			if (mergedFeature != null) {
				for (ProductSpaceElementMatching em : 
					featEm.getSubMatchings()) {
					EList<DisplayName> matchedNames =
							MergeUtil.filterMatching(em, DisplayName.class);
					if (matchedNames != null && !matchedNames.isEmpty()) {
						DisplayName mergedName = mergeDisplayNameOutPlace(
								matchedNames, mergedFeature, mergeRole, 
								visibilityForest, featureMap);
						MergeUtil.addMergeRole(em, mergeRole, mergedName);
						MergeUtil.updateTransactionId(em, mergedName, mergeRole);
					}					
					EList<ChildRelationship> matchedChildren = 
							MergeUtil.filterMatching(em, 
									ChildRelationship.class);
					if (matchedChildren != null && !matchedChildren.isEmpty()) {
						ChildRelationship mergedChild = mergeChildRelationshipOutPlace(
								matchedChildren, mergedFeature, 
								mergeRole, visibilityForest, featureMap);
						MergeUtil.addMergeRole(em, mergeRole, mergedChild);
						MergeUtil.updateTransactionId(em, mergedChild, mergeRole);
					}
					EList<FeatureGroup> matchedGroups = 
							MergeUtil.filterMatching(em, 
									FeatureGroup.class);
					if (matchedGroups != null && !matchedGroups.isEmpty()) {
						FeatureGroup mergedFeatureGroup = mergeFeatureGroupOutPlace(
								matchedGroups, mergedFeature, mergeRole, 
								visibilityForest, featureMap, em);
						MergeUtil.addMergeRole(em, mergeRole, 
								mergedFeatureGroup);
						MergeUtil.updateTransactionId(em, mergedFeatureGroup,
								mergeRole);
					}
					EList<FeatureDependency> matchedDeps = 
							MergeUtil.filterMatching(em, 
									FeatureDependency.class);
					if (matchedDeps != null && !matchedDeps.isEmpty()) {
						FeatureDependency mergedDep = mergeFeatureDependencyOutPlace(
								matchedDeps, mergedFeature, 
								mergeRole, visibilityForest, featureMap);
						MergeUtil.addMergeRole(em, mergeRole, mergedDep);
						MergeUtil.updateTransactionId(em, mergedDep, mergeRole);
					}
					EList<Mandatory> matchedMandatory = 
							MergeUtil.filterMatching(em, Mandatory.class);
					if (matchedMandatory != null && 
							!matchedMandatory.isEmpty()) {
						Mandatory mergedMand = mergeMandatoryOutPlace(matchedMandatory,
								mergedFeature, mergeRole, 
								visibilityForest, featureMap);
						MergeUtil.addMergeRole(em, mergeRole, mergedMand);
						MergeUtil.updateTransactionId(em, mergedMand, mergeRole);
					}
					EList<Elimination> matchedElims = MergeUtil.filterMatching(
							em, Elimination.class);
					if (matchedElims != null && !matchedElims.isEmpty()) {
						Elimination mergedElim = mergeEliminationOutPlace(
								matchedElims, mergedFeature, mergeRole,
								visibilityForest, featureMap);
						MergeUtil.addMergeRole(em, mergeRole, mergedElim);
						MergeUtil.updateTransactionId(em, mergedElim, mergeRole);
					}
				}		
			}
		}
		
		featureReconService.reconcileVersionDimension(mergedFm);
		return mergedFm;		
	}

	/**
	 * Merges the specified matched features and adds it to the merged feature
	 * model. Includes merging the visibilities.
	 *
	 * @param matchedFeatures
	 * @param mergedFm
	 * @param mergeRole
	 * @param vf
	 * @param featureMap
	 * @return the merged feature
	 */
	private Feature mergeFeatureOutPlace(EList<Feature> matchedFeatures,
			FeatureModel mergedFm, MatchingRole mergeRole,
			VisibilityForest vf, Map<String, Feature> featureMap) {
		Feature mergedFeature = SuperModFeatureFactory
				.eINSTANCE.createFeature();
		String uuid = MergeUtil.getUnique(matchedFeatures, 
				featureUuidAccessor);
		mergedFeature.setUuid(uuid);
		MergeUtil.setVisibility(matchedFeatures, mergedFeature, vf,
				visibilityMergeService);
		featureMap.put(uuid, mergedFeature);
		mergedFm.getFeatures().add(mergedFeature);
		return mergedFeature;
	}
	
	/**
	 * Merges the specified matched feature names and adds it to the merged
	 * feature. Includes merging the visibilities
	 *
	 * @param matchedNames
	 * @param mergedFeature
	 * @param mergeRole
	 * @param vf
	 * @param featureMap
	 * @return the merged display name
	 */
	private DisplayName mergeDisplayNameOutPlace(
			EList<DisplayName> matchedNames, Feature mergedFeature,
			MatchingRole mergeRole, VisibilityForest vf,
			Map<String, Feature> featureMap) {
		DisplayName mergedName = SuperModFeatureFactory.eINSTANCE.createDisplayName();
		String name = MergeUtil.getUnique(matchedNames, 
				new PropertyAccessor<DisplayName, String>() {
			@Override
			public String getProperty(DisplayName v) {
				return v.getDisplayName();
			}
		});
		mergedName.setDisplayName(name);
		MergeUtil.setVisibility(matchedNames, mergedName, vf, 
				visibilityMergeService);
		mergedFeature.getNames().add(mergedName);
		return mergedName;
	}

	/**
	 * Merges the specified matched roots and adds it to the merged feature
	 * model. Includes merging the visibilities.	 
	 *
	 * @param matchedRoots
	 * @param mergedFm
	 * @param mergeRole
	 * @param vf
	 * @param featureMap
	 * @return the merged root relationship
	 */
	private RootRelationship mergeRootOutPlace(EList<RootRelationship> matchedRoots,
			FeatureModel mergedFm, MatchingRole mergeRole, VisibilityForest vf,
			Map<String, Feature> featureMap) {
		RootRelationship mergedRoot = SuperModFeatureFactory.eINSTANCE
				.createRootRelationship();
		String featureUuid = MergeUtil.getUnique(matchedRoots, 
				new PropertyAccessor<RootRelationship, String>() {
			@Override
			public String getProperty(RootRelationship v) {
				return v.getFeature().getUuid();
			}
		});
		Feature rootFeature = featureMap.get(featureUuid);
		mergedRoot.setFeature(rootFeature);
		MergeUtil.setVisibility(matchedRoots, mergedRoot, vf,
				visibilityMergeService);
		mergedFm.getRoots().add(mergedRoot);
		return mergedRoot;
	}

	/**
	 * Merges the specified child relationships and adds the result to the
	 * specified merged feature. Includes merging the visibilities.
	 *
	 * @param matchedChildren
	 * @param mergedFeature
	 * @param mergeRole
	 * @param visibilityForest 
	 * @param featureMap
	 * @return the merged child relationship
	 */
	private ChildRelationship mergeChildRelationshipOutPlace(
			EList<ChildRelationship> matchedChildren, Feature mergedFeature,
			MatchingRole mergeRole, VisibilityForest vf, 
			Map<String, Feature> featureMap) {
		ChildRelationship mergedChild = SuperModFeatureFactory.eINSTANCE
				.createChildRelationship();
		String featureName = MergeUtil.getUnique(matchedChildren, 
				new PropertyAccessor<ChildRelationship, String>() {
			@Override
			public String getProperty(ChildRelationship v) {
				return v.getChild().getUuid();
			}
		});
		Feature childFeature = featureMap.get(featureName);
		mergedChild.setChild(childFeature);
		MergeUtil.setVisibility(matchedChildren, mergedChild, vf, 
				visibilityMergeService);
		mergedFeature.getChildren().add(mergedChild);
		return mergedChild;
	}

	/**
	 * Merges the specified feature group and adds the result to the
	 * specified merged feature. Includes merging the visibilities.
	 *
	 * @param matchedGroups
	 * @param mergedFeature
	 * @param mergeRole
	 * @param visibilityForest 
	 * @param featureMap
	 * @param fgMatching matching for the feature groups
	 * @return the merged feature group
	 */
	private FeatureGroup mergeFeatureGroupOutPlace(
			EList<FeatureGroup> matchedGroups,
			Feature mergedFeature, MatchingRole mergeRole,
			VisibilityForest vf, Map<String, Feature> featureMap,
			ProductSpaceElementMatching fgMatching) {
		FeatureGroup mergedFg = null;
		if (MatchUtil.allInstanceOf(matchedGroups, OrFeatureGroup.class)) {
			mergedFg = SuperModFeatureFactory.eINSTANCE.createOrFeatureGroup();
		}
		else if (MatchUtil.allInstanceOf(matchedGroups, XorFeatureGroup.class)){
			mergedFg = SuperModFeatureFactory.eINSTANCE.createXorFeatureGroup();
		}
		
		String uuid = MergeUtil.getUnique(matchedGroups, 
				new PropertyAccessor<FeatureGroup, String>() {
					@Override
					public String getProperty(FeatureGroup v) {
						return v.getUuid();
					}
				});
		mergedFg.setUuid(uuid);
		
		for (ProductSpaceElementMatching gmMatching : fgMatching.getSubMatchings()) {
			List<GroupMembership> gms = MergeUtil.filterMatching(
					gmMatching, GroupMembership.class);
			GroupMembership mergedGm = mergeGroupMembershipOutPlace(
					gms, mergedFg, mergeRole, vf, featureMap);
			MergeUtil.addMergeRole(gmMatching, mergeRole, mergedGm);
			MergeUtil.updateTransactionId(gmMatching, mergedGm, mergeRole);
		}
		
		MergeUtil.setVisibility(matchedGroups, mergedFg, vf,
				visibilityMergeService);
		mergedFeature.getGroups().add(mergedFg);
		return mergedFg;
	}

	/**
	 * Merges the specified group membership and adds the result to the
	 * specified merged feature. Includes merging the visibilities.
	 *
	 * @param matchedGms
	 * @param mergedFg
	 * @param mergeRole
	 * @param vf
	 * @param featureMap
	 * @return the merged group membership
	 */
	private GroupMembership mergeGroupMembershipOutPlace(
			List<GroupMembership> matchedGms, FeatureGroup mergedFg,
			MatchingRole mergeRole, VisibilityForest vf,
			Map<String, Feature> featureMap) {
		GroupMembership mergedGm = SuperModFeatureFactory.eINSTANCE
				.createGroupMembership();
		String uuid = MergeUtil.getUnique(matchedGms, 
				new PropertyAccessor<GroupMembership, String>() {
			@Override
			public String getProperty(GroupMembership v) {
				if (v.getGroupedFeature() != null) {
					return v.getGroupedFeature().getUuid();
				}
				return null;
			}
		});
		Feature groupedFeature = featureMap.get(uuid);
		mergedGm.setGroupedFeature(groupedFeature);
		MergeUtil.setVisibility(matchedGms, mergedGm, vf,
				visibilityMergeService);
		mergedFg.getGroupedFeatures().add(mergedGm);
		return mergedGm;
	}

	/**
	 * Merges the specified feature dependency and adds the result to the
	 * specified merged feature. Includes merging the visibilities.
	 *
	 * @param matchedDeps
	 * @param mergedFeature
	 * @param mergeRole
	 * @param visibilityForest 
	 * @param featureMap
	 * @return the merged feature dependency
	 */
	private FeatureDependency mergeFeatureDependencyOutPlace(
			EList<FeatureDependency> matchedDeps,
			Feature mergedFeature, MatchingRole mergeRole,
			VisibilityForest vf, Map<String, Feature> featureMap) {
		FeatureDependency mergedDep = null;
		if (MatchUtil.allInstanceOf(matchedDeps, FeatureRequirement.class)) {
			mergedDep = SuperModFeatureFactory.eINSTANCE
					.createFeatureRequirement();
		}
		else if (MatchUtil.allInstanceOf(matchedDeps, FeatureExclusion.class)) {
			mergedDep = SuperModFeatureFactory.eINSTANCE
					.createFeatureExclusion();
		}
		
		String uuid = MergeUtil.getUnique(matchedDeps, 
				new PropertyAccessor<FeatureDependency, String>() {
					@Override
					public String getProperty(FeatureDependency v) {
						return v.getUuid();
					}
				});
		mergedDep.setUuid(uuid);
		
		String targetUuid = MergeUtil.getUnique(matchedDeps, 
				new PropertyAccessor<FeatureDependency, String>() {
			@Override
			public String getProperty(FeatureDependency v) {
				if (v.getTargetFeature() != null) {
					return v.getTargetFeature().getUuid();
				}
				return null;
			}
		});
		Feature targetFeature = featureMap.get(targetUuid);
		mergedDep.setTargetFeature(targetFeature);		
		MergeUtil.setVisibility(matchedDeps, mergedDep, vf, 
				visibilityMergeService);
		mergedFeature.getOutgoingDependencies().add(mergedDep);
		return mergedDep;
	}

	/**
	 * Merges the specified mandatory flag and adds the result to the
	 * specified merged feature. Includes merging the visibilities.
	 *
	 * @param matchedChildren
	 * @param mergedFeature
	 * @param mergeRole
	 * @param visibilityForest 
	 * @param featureMap
	 * @return the merged mandatory flag
	 */
	private Mandatory mergeMandatoryOutPlace(EList<Mandatory> matchedMandatory,
			Feature mergedFeature, MatchingRole mergeRole,
			VisibilityForest vf, Map<String, Feature> featureMap) {
		Mandatory mergedMand = SuperModFeatureFactory.eINSTANCE
				.createMandatory();
		MergeUtil.setVisibility(matchedMandatory, mergedMand, vf, 
				visibilityMergeService);
		mergedFeature.setMandatory(mergedMand);
		return mergedMand;		
	}
	

	/**
	 * Merges the specified elimination hint and adds the result to the
	 * specified merged feature. Includes merging the visibilities.
	 *
	 * @param matchedElims
	 * @param mergedFeature
	 * @param mergeRole
	 * @param vf
	 * @param featureMap
	 * @return the merged elimination hint
	 */
	private Elimination mergeEliminationOutPlace(
			EList<Elimination> matchedElims, Feature mergedFeature,
			MatchingRole mergeRole, VisibilityForest vf,
			Map<String, Feature> featureMap) {
		Elimination mergedElim = SuperModFeatureFactory.eINSTANCE.createElimination();
		Tristate mergedDefSel = MergeUtil.getUnique(matchedElims, 
				new PropertyAccessor<Elimination, Tristate>() {
					@Override
					public Tristate getProperty(Elimination v) {
						return v.getDefaultSelection();
					}
				});
		mergedElim.setDefaultSelection(mergedDefSel);
		MergeUtil.setVisibility(matchedElims, mergedElim, vf, 
				visibilityMergeService);
		mergedFeature.getEliminations().add(mergedElim);
		return mergedElim;
	}

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.IProductDimensionMergeService
	 * #mergeInPlace(de.ubt.ai1.supermod.mm.diff.ProductDimensionMatching,
	 * java.util.Collection, de.ubt.ai1.supermod.mm.diff.MatchingRole,
	 * de.ubt.ai1.supermod.mm.core.VisibilityForest)
	 */
	@Override
	public void mergeInPlace(ProductDimensionMatching pdMatching,
			Collection<MatchingRole> inputRoles, MatchingRole masterRole,
			VisibilityForest visibilityForest) {
		Map<String, Feature> featureMap = new HashMap<>();
		
		// extract or create the master version of the feature model
		FeatureModel masterFm = (FeatureModel) 
				pdMatching.getMatchedDimension(masterRole)
				.getProductDimension();
		if (masterFm == null) {
			mergeOutPlace(pdMatching, inputRoles, masterRole, visibilityForest);
			return;
		}

		// merge features
		for (ProductSpaceElementMatching featEm : 
					pdMatching.getRootElementMatchings()) {
			EList<Feature> matchedFeatures = 
					MergeUtil.filterMatching(featEm, Feature.class);
			if (matchedFeatures != null && !matchedFeatures.isEmpty()) {
				Feature masterFeature = null;
				if (featEm.getMatchedElement(masterRole) != null) {
					masterFeature = (Feature) featEm
							.getMatchedElement(masterRole).getElement();
				}
				if (masterFeature == null) {
					masterFeature = mergeFeatureOutPlace(matchedFeatures, masterFm,
							masterRole, visibilityForest, featureMap);
					MergeUtil.addMergeRole(featEm, masterRole, masterFeature);
					MergeUtil.updateTransactionId(featEm, masterFeature,
							masterRole);
				}
				else {
					featureMap.put(masterFeature.getUuid(), masterFeature);
				}
			}
		}
		
		// merge roots
		for (ProductSpaceElementMatching rootEm : 
					pdMatching.getRootElementMatchings()) {
			EList<RootRelationship> matchedRoots = 
					MergeUtil.filterMatching(rootEm, RootRelationship.class);
			if (matchedRoots != null && !matchedRoots.isEmpty()) {
				RootRelationship masterRoot = null;
				if (rootEm.getMatchedElement(masterRole) != null) {
					masterRoot = (RootRelationship) rootEm
							.getMatchedElement(masterRole).getElement();
				}
				if (masterRoot == null) {
					masterRoot = mergeRootOutPlace(matchedRoots, masterFm, 
							masterRole, visibilityForest, featureMap);
					MergeUtil.addMergeRole(rootEm, masterRole, masterRoot);
					MergeUtil.updateTransactionId(rootEm, masterRoot,
							masterRole);
				}
			}
		}
		
		// merge feature details
		for (ProductSpaceElementMatching featEm : 
					pdMatching.getRootElementMatchings()) {
			EList<Feature> matchedFeatures = 
					MergeUtil.filterMatching(featEm, Feature.class);
			if (matchedFeatures.isEmpty()) continue;
			String featureUuid = ((Feature) featEm.getMatchedElement(masterRole)
					.getElement()).getUuid();
			Feature masterFeature = featureMap.get(featureUuid);
			if (masterFeature != null) {
				for (ProductSpaceElementMatching em : featEm.getSubMatchings()) {
					
					// merge display names
					EList<DisplayName> matchedNames = MergeUtil.filterMatching(
							em, DisplayName.class);
					if (matchedNames != null && !matchedNames.isEmpty()) {
						DisplayName masterName = null;
						if (em.getMatchedElement(masterRole) != null) {
							masterName = (DisplayName) em
									.getMatchedElement(masterRole).getElement();
						}
						if (masterName == null) {
							masterName = mergeDisplayNameOutPlace(
									matchedNames, masterFeature, masterRole,
									visibilityForest, featureMap);
							MergeUtil.addMergeRole(em, masterRole, masterName);
							MergeUtil.updateTransactionId(em, masterName,
									masterRole);
						}
					}
					
					// merge child relationships
					EList<ChildRelationship> matchedChildren = 
							MergeUtil.filterMatching(em, 
									ChildRelationship.class);
					if (matchedChildren != null && !matchedChildren.isEmpty()) {
						ChildRelationship masterChild = null;
						if (em.getMatchedElement(masterRole) != null) {
							masterChild = (ChildRelationship) em
									.getMatchedElement(masterRole).getElement();
						}
						if (masterChild == null) {
							masterChild = mergeChildRelationshipOutPlace(
									matchedChildren, masterFeature, 
									masterRole, visibilityForest, featureMap);
							MergeUtil.addMergeRole(em, masterRole, masterChild);
							MergeUtil.updateTransactionId(em, masterChild,
									masterRole);
						}
					}
					
					// merge groups
					EList<FeatureGroup> matchedGroups = 
							MergeUtil.filterMatching(em, FeatureGroup.class);
					if (matchedGroups != null && !matchedGroups.isEmpty()) {
						FeatureGroup masterGroup = null;
						if (em.getMatchedElement(masterRole) != null) {
							masterGroup = (FeatureGroup) em
									.getMatchedElement(masterRole).getElement();
							
							// merge group memberships
							for (ProductSpaceElementMatching subEm : 
								em.getSubMatchings()) {
								EList<GroupMembership> matchedGms = MergeUtil
										.filterMatching(subEm, 
												GroupMembership.class);
								if (matchedGms != null && 
										!matchedGms.isEmpty()) {
									GroupMembership masterGm = null;
									if (subEm.getMatchedElement(masterRole) 
											!= null) {
										masterGm = (GroupMembership) subEm
												.getMatchedElement(masterRole)
												.getElement();
									}
									if (masterGm == null) {
										masterGm = mergeGroupMembershipOutPlace(
												matchedGms, masterGroup, 
												masterRole, visibilityForest, 
												featureMap);
										MergeUtil.addMergeRole(subEm, 
												masterRole, masterGm);
										MergeUtil.updateTransactionId(subEm,
												masterGm, masterRole);
									}
								}
							}
						}
						if (masterGroup == null) {
							masterGroup = mergeFeatureGroupOutPlace(
									matchedGroups, masterFeature, masterRole, 
									visibilityForest, featureMap, em);
							MergeUtil.addMergeRole(em, masterRole, masterGroup);
							MergeUtil.updateTransactionId(em, masterGroup,
									masterRole);
						}
					}
					
					// merge dependencies
					EList<FeatureDependency> matchedDeps = 
							MergeUtil.filterMatching(em, 
									FeatureDependency.class);
					if (matchedDeps != null && !matchedDeps.isEmpty()) {
						FeatureDependency masterDep = null;
						if (em.getMatchedElement(masterRole) != null) { 
							masterDep = (FeatureDependency) em
									.getMatchedElement(masterRole).getElement();
						}
						if (masterDep == null) {
							masterDep = mergeFeatureDependencyOutPlace(
									matchedDeps, masterFeature, 
									masterRole, visibilityForest, featureMap);
							MergeUtil.addMergeRole(em, masterRole, masterDep);
							MergeUtil.updateTransactionId(em, masterDep,
									masterRole);
						}
					}
					
					// merge mandatory flags
					EList<Mandatory> matchedMandatory = 
							MergeUtil.filterMatching(em, Mandatory.class);
					if (matchedMandatory != null && 
							!matchedMandatory.isEmpty()) {
						Mandatory masterMand = null;
						if (em.getMatchedElement(masterRole) != null) {
							masterMand = (Mandatory) em
									.getMatchedElement(masterRole).getElement();
						}
						if (masterMand == null) {
							masterMand = mergeMandatoryOutPlace(
									matchedMandatory, masterFeature, masterRole, 
									visibilityForest, featureMap);
							MergeUtil.addMergeRole(em, masterRole, masterMand);
							MergeUtil.updateTransactionId(em, masterMand,
									masterRole);
						}
					}
					
					// merge elimination hints
					EList<Elimination> matchedElims = MergeUtil.filterMatching(
							em, Elimination.class);
					if (matchedElims != null && !matchedElims.isEmpty()) {
						Elimination masterElim = null;
						if (em.getMatchedElement(masterRole) != null) {
							masterElim = (Elimination) em
									.getMatchedElement(masterRole).getElement();
						}
						if (masterElim == null) {
							masterElim = mergeEliminationOutPlace(
									matchedElims, masterFeature, masterRole,
									visibilityForest, featureMap);
							MergeUtil.addMergeRole(em, masterRole, masterElim);
							MergeUtil.updateTransactionId(em, masterElim,
									masterRole);
						}
					}
				}		
			}
		}
		
		featureReconService.reconcileVersionDimension(masterFm);		
	}

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.IVersionDimensionMergeService
	 * #merge(de.ubt.ai1.supermod.mm.core.VersionDimension,
	 * de.ubt.ai1.supermod.mm.core.VersionDimension, java.util.Map)
	 */
	@Override
	public Map<String, Option> merge(
			VersionDimension base, VersionDimension other,
			Map<String, Option> dependingMap) {
		FeatureModel baseFm = (FeatureModel) base;
		FeatureModel otherFm = (FeatureModel) other;
		
		List<MatchingRole> roles = new ArrayList<>();		
		
		boolean fakeBase = false;
		if (baseFm.getProductSpace() == null) {
			baseFm.setProductSpace(SuperModCoreFactory.eINSTANCE
					.createProductSpace());
			fakeBase = true;
		}
		MatchingRole baseRole = SuperModDiffFactory.eINSTANCE
				.createMatchingRole();
		baseRole.setMatchedProductSpace(baseFm.getProductSpace());
		baseRole.setRoleName(BASE);
		roles.add(baseRole);
		
		boolean fakeOther = false;
		if (otherFm.getProductSpace() == null) {
			otherFm.setProductSpace(SuperModCoreFactory.eINSTANCE
					.createProductSpace());
			fakeOther = true;
		}
		MatchingRole otherRole = SuperModDiffFactory.eINSTANCE
				.createMatchingRole();
		otherRole.setMatchedProductSpace(otherFm.getProductSpace());
		otherRole.setRoleName(OTHER);
		roles.add(otherRole);
		
		List<ProductDimension> dims = new ArrayList<>();
		dims.add(baseFm);
		dims.add(otherFm);
		
		ProductDimensionMatching matching = 
				featureDimMatchService.match(roles, dims);
		mergeInPlace(matching, roles, baseRole, 
				base.getVersionSpace().getRepository().getVisibilityForest());
		
		Map<String, Option> result = mapFeatureOptions(baseFm);
		
		if (fakeBase) {
			baseFm.setProductSpace(null);
		}
		if (fakeOther) {
			otherFm.setProductSpace(null);
		}
		
		return result;
	}

	/**
	 * Creates a rule base ID to option map for the specified feature model
	 * @param fm the feature model
	 * @result the map
	 */
	private Map<String, Option> mapFeatureOptions(FeatureModel fm) {
		Map<String, Option> result = new HashMap<>();
		for (Feature f : fm.getFeatures()) {
			if (f.getFeatureOption() != null) {
				result.put(f.getFeatureOption().getName(),
						f.getFeatureOption());
			}
		}
		return result;
	}

}
