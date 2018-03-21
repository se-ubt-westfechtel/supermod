/******************************************************************************
 * Copyright (c) 2018 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.service.feature.client.impl;


import static de.ubt.ai1.supermod.service.generic.client.impl.DefaultResolutionPreferenceUtil.DEFAULTRES__CYCLIC_FEATURE_TREE;
import static de.ubt.ai1.supermod.service.generic.client.impl.DefaultResolutionPreferenceUtil.DEFAULTRES__DANGLING_DEPENDENCY;
import static de.ubt.ai1.supermod.service.generic.client.impl.DefaultResolutionPreferenceUtil.DEFAULTRES__DANGLING_FEATURE;
import static de.ubt.ai1.supermod.service.generic.client.impl.DefaultResolutionPreferenceUtil.DEFAULTRES__DANGLING_GROUP;
import static de.ubt.ai1.supermod.service.generic.client.impl.DefaultResolutionPreferenceUtil.DEFAULTRES__DEPENDENCY_LINK_TARGET;
import static de.ubt.ai1.supermod.service.generic.client.impl.DefaultResolutionPreferenceUtil.DEFAULTRES__DISPLAY_NAME;
import static de.ubt.ai1.supermod.service.generic.client.impl.DefaultResolutionPreferenceUtil.DEFAULTRES__MULTIPLE_GROUP_MEMBERSHIP;
import static de.ubt.ai1.supermod.service.generic.client.impl.DefaultResolutionPreferenceUtil.DEFAULTRES__NON_OPTIONAL_GROUPED_FEATURE;
import static de.ubt.ai1.supermod.service.generic.client.impl.DefaultResolutionPreferenceUtil.DEFAULTRES__PARENT_FEATURE;
import static de.ubt.ai1.supermod.service.generic.client.impl.DefaultResolutionPreferenceUtil.DEFAULTRES__REMOTE_GROUP_MEMBERSHIP;
import static de.ubt.ai1.supermod.service.generic.client.impl.DefaultResolutionPreferenceUtil.DEFAULTRES__ROOT_FEATURE;

import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil.Copier;

import com.google.inject.Inject;

import de.ubt.ai1.supermod.mm.client.SingleVersionProductDimensionDescriptor;
import de.ubt.ai1.supermod.mm.core.HybridElement;
import de.ubt.ai1.supermod.mm.core.ProductDimension;
import de.ubt.ai1.supermod.mm.core.Tristate;
import de.ubt.ai1.supermod.mm.feature.ChildRelationship;
import de.ubt.ai1.supermod.mm.feature.DisplayName;
import de.ubt.ai1.supermod.mm.feature.Elimination;
import de.ubt.ai1.supermod.mm.feature.Feature;
import de.ubt.ai1.supermod.mm.feature.FeatureDependency;
import de.ubt.ai1.supermod.mm.feature.FeatureGroup;
import de.ubt.ai1.supermod.mm.feature.FeatureModel;
import de.ubt.ai1.supermod.mm.feature.GroupMembership;
import de.ubt.ai1.supermod.mm.feature.RootRelationship;
import de.ubt.ai1.supermod.mm.feature.SuperModFeatureFactory;
import de.ubt.ai1.supermod.mm.feature.client.FeatureModelExportTrace;
import de.ubt.ai1.supermod.mm.feature.client.SingleVersionFeatureModelDescriptor;
import de.ubt.ai1.supermod.mm.feature.client.SuperModFeatureClientFactory;
import de.ubt.ai1.supermod.service.client.IDefaultResolver;
import de.ubt.ai1.supermod.service.client.IProductDimensionExportService;

/**
 * Implementation of the product dimension export interface specific for the
 * feature dimension. It makes the specified descriptor contain a copy of the
 * specified feature model.
 * 
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>,
 * 			Johannes Schroepfer <Johannes.M.Schroepfer(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	2018-01-28
 */
public class FeatureModelExportService 
implements IProductDimensionExportService {
	
	@Inject
	private IDefaultResolver defaultResolver;
	
	private SingleVersionProductDimensionDescriptor pdDescriptor;
	
	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.client.IProductDimensionExportService
	 * #export(de.ubt.ai1.supermod.mm.core.ProductDimension, de.ubt.ai1.
	 * supermod.service.client.SingleVersionProductDimensionDescriptor)
	 */
	@Override
	public FeatureModelExportTrace export(ProductDimension pd,
			SingleVersionProductDimensionDescriptor descriptor) {
		
		pdDescriptor = descriptor;
		
		if (pd instanceof FeatureModel && descriptor instanceof
				SingleVersionFeatureModelDescriptor) {
			FeatureModelExportTrace trace = SuperModFeatureClientFactory
					.eINSTANCE.createFeatureModelExportTrace();
			trace.setProductDimension(pd);
			SingleVersionFeatureModelDescriptor svfm = 
					(SingleVersionFeatureModelDescriptor) descriptor;
			Copier copier = new Copier();
			FeatureModel workspaceFM = (FeatureModel) copier.copy(pd);
			copier.copyReferences();
			defaultRepairFeatureModel(workspaceFM);
			svfm.setFeatureModel(workspaceFM);
			for (Map.Entry<EObject, EObject> e : copier.entrySet()) {
				if (e.getKey() instanceof Feature &&
						e.getValue() instanceof Feature) {
					trace.getFeatureToFeatureMap().put(
							(Feature) e.getKey(), (Feature) e.getValue());
				}
			}
			svfm.setModified(false);
			svfm.eResource().setModified(true);
			return trace;
		}
		return null;
	}

	/**
	 * Applies the default repair actions in order to ensure single-version
	 * syntactical correctness.
	 * 
	 * @param workspaceFM
	 */
	private void defaultRepairFeatureModel(FeatureModel workspaceFM) {
		
		// "Root Feature"
		if (workspaceFM.getRoots().size() > 1) {
			resolveRootFeatureConflict(workspaceFM);
		}
		
		// "Cyclic Feature Tree"
		while (true) {
			Set<Feature> set = null;
			for (Feature feature : workspaceFM.getFeatures()) {
				set = FeatureModelUtil.getContainmentCycle(feature,
						new LinkedHashSet<Feature>());
				if (set != null) break;   // A cycle has been detected.
			}
			if (set == null) break;   // No cycles available any more.
			resolveCyclicFeatureTreeConflict(set);
		}
		
		// "Parent Feature" and "Remote Group Membership"
		for (Feature feature : workspaceFM.getFeatures()) {
			if (feature.getParents().size() > 1) {
				resolveParentFeatureConflict(feature);
			}
		}
		// Post-processing: Removing obsolescent group memberships
		// ("Multiple Group Membership" and "Remote Group Membership")
		groupPostProcess(workspaceFM);
		
		// "Display Name"
		for (Feature feature : workspaceFM.getFeatures()) {
			if (feature.getNames().size() > 1) {
				resolveDisplayNameConflict(feature);
			}
		}
		
		// "Multiple Group Membership"
		for (Feature feature : workspaceFM.getFeatures()) {
			if (feature.getGroupedBy().size() > 1) {
				resolveMultipleGroupMembership(feature);
			}
		}
		
		// "Non-Optional Grouped Feature"
		for (Feature feature : workspaceFM.getFeatures()) {
			if (!feature.getGroupedBy().isEmpty() && feature.getMandatory() != null) {
				resolveNonOptionalGroupedFeatureConflict(feature);
			}
		}
		
		// "Dependency Link Target"
		for (Feature feature : workspaceFM.getFeatures()) {
			for (FeatureDependency dep : ECollections.newBasicEList(
					feature.getOutgoingDependencies())) {
				Feature target = dep.getTargetFeature();
				if (!target.getEliminations().isEmpty()) {
					resolveDependencyLinkTargetConflict(dep, target);
				}
			}
		}
		
		// "Dangling Feature"
		for (Feature feature : workspaceFM.getFeatures()) {
			if (feature.getGroupedBy().isEmpty() && feature.getEliminations()
					.isEmpty() && !feature.getParents().isEmpty()) {
				Feature parent = feature.getParents().get(0).getParent();
				if (!parent.getEliminations().isEmpty()) {
					// feature has no eliminations but the parent
					resolveDanglingFeatureConflict(feature, parent);
				}
			}
		}
		
		// "Dangling Group"
		for (Feature feature : workspaceFM.getFeatures()) {
			for (FeatureGroup group : ECollections.newBasicEList(
					feature.getGroups())) {
				if (!feature.getEliminations().isEmpty()) {
					resolveDanglingGroupConflict(group, feature);
				}
			}
		}
		
		// "Dangling Dependency"
		for (Feature feature : workspaceFM.getFeatures()) {
			for (FeatureDependency dep : ECollections.newBasicEList(
					feature.getOutgoingDependencies())) {
				if (!feature.getEliminations().isEmpty()) {
					resolveDanglingDependencyConflict(dep, feature);
				}
			}
		}
		
		// Final post-processing
		postProcess(workspaceFM);
	}
	
	/**
	 * Resolves the '<em>Root Feature</em>'conflict concerning the given
	 * feature model.
	 * 
	 * @param model   the feature model with multiple roots
	 */
	private void resolveRootFeatureConflict(FeatureModel model) {

		EList<RootRelationship> candidates = model.getRoots();
		RootRelationship selectedRoot =
				defaultResolver.selectCandidate(candidates,
						DEFAULTRES__ROOT_FEATURE, getCurrentProject());
		for (RootRelationship root : ECollections.newBasicEList(candidates)) {
			if (root != selectedRoot) {
				Feature oldRootFeature = root.getFeature();
				root.setFeature(null);
				model.getRoots().remove(root);
				
				ChildRelationship newChildRel = SuperModFeatureFactory
						.eINSTANCE.createChildRelationship();
				newChildRel.setChild(oldRootFeature);
				selectedRoot.getFeature().getChildren().add(newChildRel);
			}
		}
	}
	
	/**
	 * Resolves the '<em>Cyclic Feature Tree</em>' conflict concerning
	 * the given set of features.
	 * 
	 * @param features
	 */
	private void resolveCyclicFeatureTreeConflict(
			Set<Feature> features) {
		
		// Create the list of candidates:
		EList<ChildRelationship> candidates = ECollections
				.newBasicEList();
		for (Feature feature : features) {
			// For each cycle element, its relevant incoming child
			// relationship is computed.
			ChildRelationship correctRel = null;
			for (ChildRelationship rel : feature.getParents()) {
				// Each incoming child relationship is tested.
				if (rel.getParent() != null) {
					Feature parent = rel.getParent();
					if (FeatureModelUtil.getContainmentCycle(parent,
							feature, new LinkedHashSet<Feature>())
							!= null) {
						correctRel = rel;
						break;
					}
				}
			}
			candidates.add(correctRel);
		}
		
		// Remove a proper child relationship:
		ChildRelationship selectedRel = defaultResolver.selectCandidate(
				candidates, DEFAULTRES__CYCLIC_FEATURE_TREE,
				getCurrentProject());
				// Inverse selection: The candidate with the lowest score
				// is selected.
		Feature newRoot = selectedRel.getChild();
		selectedRel.setParent(null);
		newRoot.getParents().remove(selectedRel);
		
		// If necessary, select a proper parent feature:
		if (newRoot.getParents().isEmpty()) {
			// Search for a foreign child relationship to an element of
			// the cycle:
			ChildRelationship adaptedRootRel = null;
			for (Feature feature : features) {
				if (feature.getParents().size() > 1) {
					for (ChildRelationship rel : feature.getParents()) {
						if (!features.contains(rel.getParent())) {
							adaptedRootRel = rel;
							break;
						}
					}
					break;
				}
			}
			
			if (adaptedRootRel != null) {
				// There is a foreign child relationship to an element of
				// the cycle. The feature "newRoot" becomes the new child.
				adaptedRootRel.setChild(newRoot);
			} else {
				// There is no foreign child relationship to an element of
				// the cycle.
				if (!newRoot.getFeatureModel().getRoots().isEmpty())
					// The feature model has no root.
					return;
				
				// The feature model has a root and the feature "newRoot"
				// becomes a child.
				RootRelationship actualRoot = newRoot.getFeatureModel()
						.getRoots().get(0);
				
				ChildRelationship newRootRel = SuperModFeatureFactory
						.eINSTANCE.createChildRelationship();
				newRootRel.setChild(newRoot);
				newRootRel.setParent(actualRoot.getFeature());
			}
		}
		
		// If necessary, remove conflicting foreign child relationships to
		// elements of the cycle.
		for (Feature feature : features) {
			if (feature != newRoot && feature.getParents().size() > 1) {
				for (ChildRelationship rel : ECollections.newBasicEList(
						feature.getParents())) {
					if (!features.contains(rel.getParent())) {
						rel.setParent(null);
						rel.setChild(null);
					}
				}
			}
		}
	}
	
	/**
	 * Resolves the '<em>Parent Feature</em>' conflict concerning the
	 * given feature.
	 * 
	 * @param feature   the feature with multiple parents
	 */
	private void resolveParentFeatureConflict(Feature feature) {
		
		EList<ChildRelationship> candidates = feature.getParents();
		ChildRelationship selectedParent = defaultResolver.selectCandidate(
				candidates, feature.getGroupedBy().size() == 1 ?
				DEFAULTRES__REMOTE_GROUP_MEMBERSHIP : DEFAULTRES__PARENT_FEATURE,
				getCurrentProject());
		for (ChildRelationship parent : ECollections.newBasicEList(candidates)) {
			if (parent != selectedParent) {
				parent.setParent(null);
				parent.setChild(null);
			}
		}
	}
	
	/**
	 * Resolves the '<em>Display Name</em>' conflict concerning the
	 * given feature.
	 * 
	 * @param feature   the feature having multiple names
	 */
	private void resolveDisplayNameConflict(Feature feature) {

		EList<DisplayName> candidates = feature.getNames();
		DisplayName selectedName = defaultResolver.selectCandidate(
				candidates, DEFAULTRES__DISPLAY_NAME, getCurrentProject());
		feature.getNames().retainAll(ECollections.newBasicEList(selectedName));
	}
	
	/**
	 * Resolves the '<em>Multiple Group Membership</em>' conflict
	 * concerning the given feature.
	 * 
	 * @param feature   the feature that is part of multiple groups
	 */
	private void resolveMultipleGroupMembership(Feature feature) {
		
		EList<GroupMembership> candidates = feature.getGroupedBy();
		GroupMembership selectedGroup = defaultResolver.selectCandidate(
				candidates, DEFAULTRES__MULTIPLE_GROUP_MEMBERSHIP,
				getCurrentProject());
		for (GroupMembership group : ECollections.newBasicEList(candidates)) {
			if (group != selectedGroup) {
				group.setGroup(null);
				group.setGroupedFeature(null);
			}
		}
	}
	
	/**
	 * Resolves the '<em>Non-Optional Grouped Feature</em>' conflict
	 * concerning the given feature.
	 * 
	 * @param feature   the feature that is mandatory and part of a group
	 */
	private void resolveNonOptionalGroupedFeatureConflict(
			Feature feature) {

		EList<HybridElement> candidates = ECollections.newBasicEList(
				feature.getGroupedBy());
		candidates.add(feature.getMandatory());
		HybridElement selectedElem = defaultResolver.selectCandidate(
				candidates, DEFAULTRES__NON_OPTIONAL_GROUPED_FEATURE,
				getCurrentProject());
		if (selectedElem instanceof GroupMembership) {
			feature.setMandatory(null);
		} else {
			feature.getGroupedBy().get(0).setGroup(null);
			feature.getGroupedBy().remove(0);
		}
	}
	
	/**
	 * Resolves the '<em>Dependency Link Target</em>' conflict concerning
	 * the given dependency.
	 * 
	 * @param dep      the dependency
	 * @param target   the invisible target feature
	 */
	private void resolveDependencyLinkTargetConflict(FeatureDependency dep,
			Feature target) {
		
		EList<HybridElement> candidates = ECollections.newBasicEList(
				target.getEliminations());
		candidates.add(dep);
		HybridElement selectedElem = defaultResolver.selectCandidate(
				candidates, DEFAULTRES__DEPENDENCY_LINK_TARGET,
				getCurrentProject());
		if (selectedElem instanceof Elimination) {
			dep.setTargetFeature(null);
			dep.setSourceFeature(null);
		} else {
			// Remove eliminations from the target feature and
			// all its (transitive) containers.
			removeEliminationsBottomUp(target);
		}
	}
	
	/**
	 * Resolves the '<em>Dangling Feature</em>' conflict concerning the
	 * given feature.
	 * 
	 * @param feature   the dangling feature
	 * @param parent    the invisible parent feature
	 */
	private void resolveDanglingFeatureConflict(Feature feature,
			Feature parent) {
		
		EList<HybridElement> candidates = ECollections.newBasicEList(
				parent.getEliminations());
		candidates.add(feature.getParents().get(0));
		HybridElement selectedElem = defaultResolver.selectCandidate(
				candidates, DEFAULTRES__DANGLING_FEATURE,
				getCurrentProject());
		if (selectedElem instanceof Elimination) {
			// Add eliminations to all child features (transitively).
			for (ChildRelationship child : ECollections.newBasicEList(
					feature.getChildren()))
				addEliminationsTopDown(child.getChild());
		} else {
			// Remove eliminations from the parent feature and
			// all its (transitive) containers.
			removeEliminationsBottomUp(parent);
		}
	}
	
	/**
	 * Resolves the '<em>Dangling Group</em>' conflict concerning the
	 * given feature group.
	 * 
	 * @param group    the dangling group
	 * @param parent   the invisible parent feature
	 */
	private void resolveDanglingGroupConflict(FeatureGroup group,
			Feature parent) {
		
		EList<HybridElement> candidates = ECollections.newBasicEList(
				parent.getEliminations());
		candidates.add(group);
		HybridElement selectedElem = defaultResolver.selectCandidate(
				candidates, DEFAULTRES__DANGLING_GROUP,
				getCurrentProject());
		if (selectedElem instanceof Elimination) {
			group.setParentFeature(null);
			for (GroupMembership gm : ECollections.newBasicEList(
					group.getGroupedFeatures())) {
				gm.setGroupedFeature(null);
				gm.setGroup(null);
			}
			
			// Add eliminations to all child features (transitively).
			for (ChildRelationship child : ECollections.newBasicEList(
					parent.getChildren()))
				addEliminationsTopDown(child.getChild());
		} else {
			// Remove eliminations from the parent feature and
			// all its (transitive) containers.
			removeEliminationsBottomUp(parent);
		}
	}
	
	/**
	 * Resolves the '<em>Dangling Dependency</em>' conflict concerning
	 * the given dependency.
	 * 
	 * @param dep      the dangling dependency
	 * @param parent   the invisible parent feature
	 */
	private void resolveDanglingDependencyConflict(FeatureDependency dep,
			Feature parent) {
		
		EList<HybridElement> candidates = ECollections.newBasicEList(
				parent.getEliminations());
		candidates.add(dep);
		HybridElement selectedElem = defaultResolver.selectCandidate(
				candidates, DEFAULTRES__DANGLING_DEPENDENCY,
				getCurrentProject());
		if (selectedElem instanceof Elimination) {
			dep.setSourceFeature(null);
			dep.setTargetFeature(null);
		} else {
			// Remove eliminations from the parent feature and
			// all its (transitive) containers.
			removeEliminationsBottomUp(parent);
		}
	}
	
	/**
	 * Removes successively eliminations from all features part of the path
	 * from the given feature to the root feature.
	 * 
	 * @param start   the start feature for the bottom-up traversing
	 */
	private void removeEliminationsBottomUp(Feature start) {
		
		Feature current = start;
		current.getEliminations().clear();
		while (!current.getParents().isEmpty()) {
			current = current.getParents().get(0).getParent();
			current.getEliminations().clear();
		}
	}
	
	/**
	 * Adds successively the given eliminations to all features part of the
	 * feature subtree with the given root.
	 * 
	 * @param feature   the root of the subtree
	 */
	private void addEliminationsTopDown(Feature feature) {
		
		Elimination elim = SuperModFeatureFactory.eINSTANCE.createElimination();
		elim.setDefaultSelection(Tristate.FALSE);
		feature.getEliminations().clear();
		feature.getEliminations().add(elim);
		
		for (ChildRelationship child : ECollections.newBasicEList(
				feature.getChildren()))
			addEliminationsTopDown(child.getChild());
	}
	
	/**
	 * Processes the final resolving actions.
	 * 
	 * @param featureModel   the feature model
	 */
	private void postProcess(FeatureModel featureModel) {
		
		for (Feature feature : featureModel.getFeatures()) {
			for (FeatureGroup group : ECollections.newBasicEList(feature.getGroups())) {
				if (group.getGroupedFeatures().size() < 2) {
					for (GroupMembership member : ECollections.newBasicEList(
						group.getGroupedFeatures())) {
						member.setGroupedFeature(null);
						member.getGroup().setParentFeature(null);
						member.setGroup(null);
					}
				}
			}
		}
	}
	
	/**
	 * Processes some resolving actions such that there are no features left
	 * which are part of some group that is not contained by the features's
	 * parent.
	 * 
	 * @param featureModel   the feature model
	 */
	private void groupPostProcess(FeatureModel featureModel) {

		for (Feature feature : featureModel.getFeatures()) {
			for (GroupMembership group : ECollections.newBasicEList(
					feature.getGroupedBy())) {
				Feature groupParent = group.getGroup().getParentFeature();
				if (feature.getParents().get(0).getParent() != groupParent) {
					group.setGroup(null);
					group.setGroupedFeature(null);
				}
			}
		}
	}
	
	/**
	 * Returns the current project within the workspace by the product dimension
	 * descriptor URI.
	 */
	private IProject getCurrentProject() {
		
		String projectName = pdDescriptor.eResource().getURI().segment(1);
		return ResourcesPlugin.getWorkspace().getRoot().getProject(projectName);
	}
}
