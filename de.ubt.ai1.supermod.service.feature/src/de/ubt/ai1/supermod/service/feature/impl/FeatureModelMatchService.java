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
import java.util.Collections;
import java.util.List;

import de.ubt.ai1.supermod.mm.core.ProductDimension;
import de.ubt.ai1.supermod.mm.diff.MatchedProductDimension;
import de.ubt.ai1.supermod.mm.diff.MatchedProductSpaceElement;
import de.ubt.ai1.supermod.mm.diff.MatchingRole;
import de.ubt.ai1.supermod.mm.diff.ProductDimensionMatching;
import de.ubt.ai1.supermod.mm.diff.ProductSpaceElementMatching;
import de.ubt.ai1.supermod.mm.diff.SuperModDiffFactory;
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
import de.ubt.ai1.supermod.service.IProductDimensionMatchService;
import de.ubt.ai1.supermod.service.generic.MatchUtil;
import de.ubt.ai1.supermod.service.generic.MatchUtil.KeyMatchFunction;
import de.ubt.ai1.supermod.service.generic.MergeUtil;
import de.ubt.ai1.supermod.service.generic.MergeUtil.PropertyAccessor;

/**
 * An implementation of the product dimension match service interface specific
 * to versioned feature models.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	27.10.2014
 */
public class FeatureModelMatchService implements IProductDimensionMatchService {

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.IProductDimensionMatchService
	 * #match(java.util.Collection, java.util.Collection)
	 */
	@Override
	public ProductDimensionMatching match(Collection<MatchingRole> roles,
			Collection<ProductDimension> dimensions) {

		// the matching to be returned.
		ProductDimensionMatching pdMatching = 
				SuperModDiffFactory.eINSTANCE.createProductDimensionMatching();
		pdMatching.setDimensionName(MergeUtil.getUnique(dimensions, 
				new PropertyAccessor<ProductDimension, String>() {
					@Override
					public String getProperty(ProductDimension v) {
						return v.getDimensionName();
					}
				}));
		
		// register matched dimensions.
		for (MatchingRole role : roles) {
			for (ProductDimension pd : dimensions) {
				if (role.getMatchedProductSpace().equals(pd.getProductSpace())){
					MatchedProductDimension mpd = SuperModDiffFactory.eINSTANCE
							.createMatchedProductDimension();
					mpd.setProductDimension(pd);
					mpd.setRole(role);
					pdMatching.getMatchedDimensions().add(mpd);
				}
			}
		}
		
		// match matrices for features and roots
		List<List<Feature>> featureMtx = new ArrayList<>();
		List<List<RootRelationship>> rootMtx = new ArrayList<>();
		for (ProductDimension dim : dimensions) {
			if (dim instanceof FeatureModel) {
				FeatureModel fm = (FeatureModel) dim;
				featureMtx.add(fm.getFeatures());
				rootMtx.add(fm.getRoots());
			}
		}
		
		// match features
		List<ProductSpaceElementMatching> featureMatchings = MatchUtil
				.matchElementSet(featureMtx, 
						new KeyMatchFunction<String, Feature>() {
							@Override
							public String getKey(Feature value) {
								return value.getUuid();
							}					
						}, roles);
		pdMatching.getRootElementMatchings().addAll(featureMatchings);
		
		// match roots
		List<ProductSpaceElementMatching> rootMatchings = MatchUtil
				.matchElementSet(rootMtx, 
						new KeyMatchFunction<String, RootRelationship>() {
							@Override
							public String getKey(RootRelationship value) {
								if (value.getFeature() == null) return "";
								return value.getFeature().getUuid();
							}					
						}, roles);
		pdMatching.getRootElementMatchings().addAll(rootMatchings);
		
		// match the contents of matched features
		for (ProductSpaceElementMatching featureMatching : featureMatchings) {
			matchFeatureContents(featureMatching, roles);
		}
		
		return pdMatching;		
	}

	/**
	 * Matches the contents of already matched features. The contents are
	 * defined as feature groups, parent-child relationships, requires and
	 * excludes relationships, as well as the mandatory flag.
	 *
	 * @param featureMatching
	 * @param matchingRoles
	 */
	private void matchFeatureContents(
			ProductSpaceElementMatching featureMatching,
			Collection<MatchingRole> matchingRoles) {
		List<Feature> features = new ArrayList<Feature>();
		for (MatchedProductSpaceElement me : 
				featureMatching.getMatchedElements()) {
			if (me.getElement() instanceof Feature) {
				features.add((Feature) me.getElement());
			}
		}
		
		// create and fill content matrices
		List<List<DisplayName>> nameMtx = new ArrayList<>();
		List<List<ChildRelationship>> childMtx = new ArrayList<>();
		List<List<FeatureGroup>> groupMtx = new ArrayList<>();
		List<List<FeatureDependency>> depMtx = new ArrayList<>();
		List<List<Mandatory>> mandMtx = new ArrayList<>();
		List<List<Elimination>> elimMtx = new ArrayList<>();
		
		for (Feature f : features) {
			nameMtx.add(f.getNames());
			childMtx.add(f.getChildren());
			groupMtx.add(f.getGroups());
			depMtx.add(f.getOutgoingDependencies());
			if (f.getMandatory() != null) {
				mandMtx.add(Collections.singletonList(f.getMandatory()));
			}
			elimMtx.add(f.getEliminations());
		}
		
		// match display names
		List<ProductSpaceElementMatching> nameMatchings =
				MatchUtil.matchElementSet(nameMtx, 
						new KeyMatchFunction<String, DisplayName>() {
							@Override
							public String getKey(DisplayName value) {
								return value.getDisplayName();
							}
						}, matchingRoles);
		featureMatching.getSubMatchings().addAll(nameMatchings);
		
		// match children
		List<ProductSpaceElementMatching> childMatchings = 
				MatchUtil.matchElementSet(childMtx, 
						new KeyMatchFunction<String, ChildRelationship>() {
							@Override
							public String getKey(ChildRelationship value) {
								return value.getChild().getUuid();
							}
						},
						matchingRoles);
		featureMatching.getSubMatchings().addAll(childMatchings);
		
		// match groups
		List<ProductSpaceElementMatching> groupMatchings = 
				MatchUtil.matchElementSet(groupMtx,
						new KeyMatchFunction<String, FeatureGroup>() {
							@Override
							public String getKey(FeatureGroup value) {
								return value.getUuid();
							}					
						}, matchingRoles);
		featureMatching.getSubMatchings().addAll(groupMatchings);
		
		// match group memberships
		for (ProductSpaceElementMatching gem : groupMatchings) {
			List<List<GroupMembership>> memberMtx = new ArrayList<>();
			for (MatchedProductSpaceElement gemMatch : gem.getMatchedElements()) {
				FeatureGroup fg = (FeatureGroup) gemMatch.getElement();
				memberMtx.add(fg.getGroupedFeatures());
			}
			List<ProductSpaceElementMatching> memberMatchings =
					MatchUtil.matchElementSet(memberMtx,
							new KeyMatchFunction<String, GroupMembership>() {
								@Override
								public String getKey(GroupMembership value) {
									return value.getGroupedFeature().getUuid();
								}
							}, matchingRoles);
			gem.getSubMatchings().addAll(memberMatchings);
		}
		
		// match dependencies
		List<ProductSpaceElementMatching> depMatchings =
				MatchUtil.matchElementSet(depMtx,
						new KeyMatchFunction<String, FeatureDependency>() {
							@Override
							public String getKey(FeatureDependency value) {
								return value.getUuid();
							}					
						}, matchingRoles);
		featureMatching.getSubMatchings().addAll(depMatchings);
		
		// match mandatory flag
		List<ProductSpaceElementMatching> mandMatchings =
				MatchUtil.matchElementSet(mandMtx, 
						new KeyMatchFunction<String, Mandatory>() {
							@Override
							public String getKey(Mandatory value) {
								return "mand";
							}
				}, matchingRoles);
		featureMatching.getSubMatchings().addAll(mandMatchings);		
		
		// match eliminations
		List<ProductSpaceElementMatching> elimMatchings =
				MatchUtil.matchElementSet(elimMtx, 
						new KeyMatchFunction<String, Elimination>() {
							@Override
							public String getKey(Elimination value) {
								return value.getDefaultSelection().getLiteral();
							}
				}, matchingRoles);
		featureMatching.getSubMatchings().addAll(elimMatchings);	
	}

}
