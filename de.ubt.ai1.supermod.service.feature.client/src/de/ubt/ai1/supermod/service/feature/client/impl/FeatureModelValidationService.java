/******************************************************************************
 * Copyright (c) 2018 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.service.feature.client.impl;


import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import de.ubt.ai1.supermod.mm.client.ConflictSet;
import de.ubt.ai1.supermod.mm.client.ProductConflict;
import de.ubt.ai1.supermod.mm.client.SuperModClientFactory;
import de.ubt.ai1.supermod.mm.core.ProductDimension;
import de.ubt.ai1.supermod.mm.feature.ChildRelationship;
import de.ubt.ai1.supermod.mm.feature.Feature;
import de.ubt.ai1.supermod.mm.feature.FeatureDependency;
import de.ubt.ai1.supermod.mm.feature.FeatureGroup;
import de.ubt.ai1.supermod.mm.feature.FeatureModel;
import de.ubt.ai1.supermod.mm.feature.RootRelationship;
import de.ubt.ai1.supermod.mm.feature.client.CyclicFeatureTreeConflict;
import de.ubt.ai1.supermod.mm.feature.client.DanglingDependencyConflict;
import de.ubt.ai1.supermod.mm.feature.client.DanglingFeatureConflict;
import de.ubt.ai1.supermod.mm.feature.client.DanglingGroupConflict;
import de.ubt.ai1.supermod.mm.feature.client.DependencyLinkTargetConflict;
import de.ubt.ai1.supermod.mm.feature.client.DisplayNameConflict;
import de.ubt.ai1.supermod.mm.feature.client.MultipleGroupMembershipConflict;
import de.ubt.ai1.supermod.mm.feature.client.NonOptionalGroupedFeatureConflict;
import de.ubt.ai1.supermod.mm.feature.client.ParentFeatureConflict;
import de.ubt.ai1.supermod.mm.feature.client.RemoteGroupMembershipConflict;
import de.ubt.ai1.supermod.mm.feature.client.RootFeatureConflict;
import de.ubt.ai1.supermod.mm.feature.client.SuperModFeatureClientFactory;
import de.ubt.ai1.supermod.service.client.IProductDimensionValidationService;

/**
 * An implementation of the product dimension validation service specific to
 * the product dimension of feature models.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>,
 * 			Johannes Schroepfer <Johannes.M.Schroepfer(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	2018-01-09
 */
public class FeatureModelValidationService 
implements IProductDimensionValidationService {
	
	/**
	 * Caches all features that have ever been detected as a part of a 
	 * containment cycle in order to prevent multiple conflict reports.
	 */
	protected Set<Feature> cyclicFeatures;
	
	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.client.
	 * IProductDimensionValidationService#validate(
	 * de.ubt.ai1.supermod.mm.core.ProductDimension)
	 */
	@Override
	public ConflictSet validate(ProductDimension productDimension) {
		
		cyclicFeatures = new HashSet<Feature>();
		if (!(productDimension instanceof FeatureModel)) {
			return null;
		}
		
		FeatureModel fm = (FeatureModel) productDimension;
		List<ProductConflict> conflicts = new ArrayList<>();
		conflicts.addAll(validateFeatureModel(fm));
		for (Feature f : fm.getFeatures()) {
			conflicts.addAll(validateFeature(f));
			for (FeatureGroup fg : f.getGroups())
				conflicts.addAll(validateFeatureGroup(fg));
			for (FeatureDependency fd : f.getOutgoingDependencies())
				conflicts.addAll(validateFeatureDependency(fd));
		}
		
		cyclicFeatures.clear();
		ConflictSet cs = SuperModClientFactory.eINSTANCE.createConflictSet();
		cs.getConflicts().addAll(conflicts);
		return cs;
	}

	/**
	 * Detects and returns conflicts for a given feature model.
	 *
	 * @param featureModel
	 * @return the list of detected conflicts
	 */
	private Collection<? extends ProductConflict> validateFeatureModel(
			FeatureModel featureModel) {
		
		List<ProductConflict> conflicts = new ArrayList<>();
		
		// "Root Feature"
		if (featureModel.getRoots().size() > 1) {
			RootFeatureConflict c = SuperModFeatureClientFactory
					.eINSTANCE.createRootFeatureConflict();
			c.setContextModel(featureModel);
			conflicts.add(c);
		}
		
		return conflicts;
	}

	/**
	 * Detects and returns conflicts for a given feature.
	 *
	 * @param feature
	 * @return the list of detected conflicts
	 */
	private Collection<? extends ProductConflict> validateFeature(Feature feature) {
		
		List<ProductConflict> conflicts = new ArrayList<>();
		
		// "Parent Feature" and "Remote Group Membership"
		if (feature.getParents().size() != 1) {
			boolean nonUniqueParent = true;
			if (feature.getParents().size() == 0) {
				FeatureModel fm = (FeatureModel) feature.getProductDimension();
				if (feature.getGroupedBy() != null) {
					nonUniqueParent = false;
				}
				else for (RootRelationship rr : fm.getRoots()) {
					if (rr.getFeature() == feature) {
						nonUniqueParent = false;
						break;
					}
				}
			}
			if (nonUniqueParent) {
				if (feature.getGroupedBy().size() == 1) {
					RemoteGroupMembershipConflict c2 = SuperModFeatureClientFactory
							.eINSTANCE.createRemoteGroupMembershipConflict();
					c2.setContextFeature(feature);
					conflicts.add(c2);
				} else {
					ParentFeatureConflict c = SuperModFeatureClientFactory
							.eINSTANCE.createParentFeatureConflict();
					c.setContextFeature(feature);
					conflicts.add(c);
				}
			}			
		}
		
		// "Cyclic Feature Tree"
		Set<Feature> containmentCycle = FeatureModelUtil.getContainmentCycle(
				feature, new LinkedHashSet<Feature>());
		if (containmentCycle != null && !cyclicFeatures.containsAll(
				containmentCycle)) {
			CyclicFeatureTreeConflict c = 
					SuperModFeatureClientFactory.eINSTANCE
					.createCyclicFeatureTreeConflict();
			c.getAffectedFeatures().addAll(containmentCycle);
			cyclicFeatures.addAll(containmentCycle);
			conflicts.add(c);
		}
		
		// "Display Name"
		if (feature.getNames().size() > 1) {
			DisplayNameConflict c = 
					SuperModFeatureClientFactory.eINSTANCE
					.createDisplayNameConflict();
			c.setContextFeature(feature);
			conflicts.add(c);
		}
		
		// "Multiple Group Membership"
		if (feature.getGroupedBy().size() > 1) {
			MultipleGroupMembershipConflict c = 
					SuperModFeatureClientFactory.eINSTANCE
					.createMultipleGroupMembershipConflict();
			c.setContextFeature(feature);
			conflicts.add(c);
		}
		
		// "Non-Optional Grouped Feature"
		if (!feature.getGroupedBy().isEmpty() &&
				feature.getMandatory() != null) {
			NonOptionalGroupedFeatureConflict c = 
					SuperModFeatureClientFactory.eINSTANCE
					.createNonOptionalGroupedFeatureConflict();
			c.setContextFeature(feature);
			conflicts.add(c);
		}
		
		// "Dangling Feature"
		if (feature.getGroupedBy().isEmpty() && feature.getEliminations()
				.isEmpty() && !feature.getParents().isEmpty()) {
			for (ChildRelationship parent : feature.getParents()) {
				if (!parent.getParent().getEliminations().isEmpty()) {
					DanglingFeatureConflict c =
							SuperModFeatureClientFactory.eINSTANCE
							.createDanglingFeatureConflict();
					c.setContextFeature(feature);
					conflicts.add(c);
					break;
				}
			}
		}
		
		return conflicts;
	}
	
	/**
	 * Detects and returns conflicts for a given feature group.
	 * 
	 * @param group
	 * @return the list of detected conflicts
	 */
	private Collection<? extends ProductConflict> validateFeatureGroup(
			FeatureGroup group) {
		
		List<ProductConflict> conflicts = new ArrayList<>();
		
		// "Dangling Group"
		Feature parent = group.getParentFeature();
		if (!parent.getEliminations().isEmpty()) {
			DanglingGroupConflict c = SuperModFeatureClientFactory
					.eINSTANCE.createDanglingGroupConflict();
			c.setContextGroup(group);
			conflicts.add(c);
		}
		
		return conflicts;
	}
	
	/**
	 * Detects and returns conflicts for a given feature dependency.
	 * 
	 * @param dep
	 * @return the list of detected conflicts
	 */
	private Collection<? extends ProductConflict> validateFeatureDependency(
			FeatureDependency dep) {
		
		List<ProductConflict> conflicts = new ArrayList<>();
		
		// "Dangling Dependency"
		Feature parent = dep.getSourceFeature();
		if (!parent.getEliminations().isEmpty()) {
			DanglingDependencyConflict c = SuperModFeatureClientFactory
					.eINSTANCE.createDanglingDependencyConflict();
			c.setContextDependency(dep);
			conflicts.add(c);
		}
		
		// "Dependency Link Target"
		Feature target = dep.getTargetFeature();
		if (!target.getEliminations().isEmpty()) {
			DependencyLinkTargetConflict c = SuperModFeatureClientFactory
					.eINSTANCE.createDependencyLinkTargetConflict();
			c.setContextDependency(dep);
			conflicts.add(c);
		}
		
		return conflicts;
	}
}
