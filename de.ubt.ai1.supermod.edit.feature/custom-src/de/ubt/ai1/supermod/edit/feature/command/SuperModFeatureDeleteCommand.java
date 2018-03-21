/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.edit.feature.command;

import java.util.Collection;
import java.util.Map.Entry;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.command.DeleteCommand;
import org.eclipse.emf.edit.domain.EditingDomain;

import de.ubt.ai1.supermod.mm.core.Option;
import de.ubt.ai1.supermod.mm.core.OptionBinding;
import de.ubt.ai1.supermod.mm.core.SuperModCoreFactory;
import de.ubt.ai1.supermod.mm.core.Tristate;
import de.ubt.ai1.supermod.mm.feature.ChildRelationship;
import de.ubt.ai1.supermod.mm.feature.Elimination;
import de.ubt.ai1.supermod.mm.feature.Feature;
import de.ubt.ai1.supermod.mm.feature.FeatureDependency;
import de.ubt.ai1.supermod.mm.feature.FeatureGroup;
import de.ubt.ai1.supermod.mm.feature.FeatureModel;
import de.ubt.ai1.supermod.mm.feature.GroupMembership;
import de.ubt.ai1.supermod.mm.feature.RootRelationship;
import de.ubt.ai1.supermod.mm.feature.SuperModFeatureFactory;
import de.ubt.ai1.supermod.mm.feature.util.SuperModFeatureSwitch;

/**
 * Redefinition of the delete command for elements of the feature model. The
 * deletion of feature groups and feature constraints should ensure
 * a consistent state. In case a feature is to be deleted, a clean elimination
 * is performed in order to ensure a consistent selection of future options
 * referring to this feature.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	11.05.2015
 */
public class SuperModFeatureDeleteCommand extends DeleteCommand {
	
	/**
	 * Creates a new instance.
	 *
	 * @param domain
	 * @param collection
	 */
	public SuperModFeatureDeleteCommand(EditingDomain domain,
			Collection<?> collection) {
		super(domain, collection);
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.emf.common.command.AbstractCommand#canExecute()
	 */
	@Override
	public boolean canExecute() {
		for (Object o : getCollection()) {
			if (o instanceof Feature) {
				Feature f = (Feature) o;
				return canDeleteSubtree(f);
			}
		}
		return super.canExecute();
	}

	/**
	 * Checks whether deletion is applicable to a sub-tree in the feature model,
	 * starting with a specified root feature
	 *
	 * @param f the root of the subtree to delete
	 * @return whether deletion of <code>f</code> and all sub-features is
	 * 			allowed
	 */
	protected boolean canDeleteSubtree(Feature f) {
		OptionBinding premise = SuperModCoreFactory.eINSTANCE
				.createOptionBinding();
		premise.bind(f.getFeatureOption(), Tristate.FALSE);
		if (isRoot(f) || isChosen(f) || f.getFeatureModel() == null ||
				!f.getFeatureModel().isSatisfiable(premise)) {
			return false;
		}
		for (ChildRelationship cr : f.getChildren()) {
			if (cr.getChild() != null && !canDeleteSubtree(cr.getChild())) {
				return false;
			}
		}
		return true;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.common.command.CompoundCommand#canUndo()
	 */
	@Override
	public boolean canUndo() {
		return false;
	}
		
	/* (non-Javadoc)
	 * @see org.eclipse.emf.edit.command.DeleteCommand#execute()
	 */
	@Override
	public void execute() {
		for (Object o : getCollection()) {
			new SuperModFeatureSwitch<Void>() {
				
				public Void caseFeatureModel(FeatureModel object) {
					return (Void) null;
				};
				
				@Override
				public Void caseFeature(Feature f) {
					if (isNew(f)) {
						for (ChildRelationship cr : 
								new BasicEList<>(f.getParents())) {
							caseChildRelationship(cr);
						}
						for (ChildRelationship cr : 
								new BasicEList<>(f.getChildren())) {
							caseChildRelationship(cr);
						}
						for (FeatureDependency fd : new BasicEList<>(
								f.getIncomingDependencies())) {
							caseFeatureDependency(fd);
						}
						for (FeatureDependency fd : new BasicEList<>(
								f.getOutgoingDependencies())) {
							caseFeatureDependency(fd);
						}
						for (FeatureGroup fg : new BasicEList<>(f.getGroups())) {
							caseFeatureGroup(fg);
						}
						f.setFeatureModel(null);
					}
					else {
						eliminateFeature(f);
						for (ChildRelationship cr : f.getChildren()) {
							caseFeature(cr.getChild());
						}
					}					
					return (Void) null;
				}
				
				public Void caseFeatureGroup(FeatureGroup fg) {
					fg.setParentFeature(null);
					for (GroupMembership gm : new BasicEList<>(
							fg.getGroupedFeatures())) {
						caseGroupMembership(gm);
					}
					fg.getGroupedFeatures().clear();
					return (Void) null;
				}
				
				public Void caseChildRelationship(ChildRelationship pc) {
					pc.setParent(null);
					pc.setChild(null);
					return (Void) null;
				}
				
				public Void caseGroupMembership(GroupMembership gm) {
					gm.setGroup(null);
					gm.setGroupedFeature(null);
					return (Void) null;
				}
				
				public Void caseFeatureDependency(FeatureDependency fd) {
					fd.setTargetFeature(null);
					fd.setSourceFeature(null);
					return (Void) null;
				}				
				
			}.doSwitch((EObject) o);
		}
	}	
	
	/**
	 * Checks whether a given feature is the root of the local feature model.
	 *
	 * @param f
	 * @return true if f is a root
	 */
	protected boolean isRoot(Feature f) {
		if (f.getFeatureModel() == null) return false;
		for (RootRelationship rr : f.getFeatureModel().getRoots()) {
			if (rr.getFeature().equals(f)) return true;
		}
		return false;
	}

	/**
	 * Checks whether this feature has been chosen in the current choice, i.e.,
	 * whether it has a selection state TRUE assigned.
	 *
	 * @param f
	 * @return whether the feature is chosen
	 */
	protected boolean isChosen(Feature f) {
		if (f.getFeatureOption() == null) {
			return false;
		}
		String rbId = f.getFeatureOption().getName();
		EObject eo = EcoreUtil.getRootContainer(f);
		if (eo == null || eo.eResource() == null) {
			return false;
		}
		URI lcUri = eo.eResource().getURI().trimFileExtension()
				.appendFileExtension("lchoice");
		URI fmUri = eo.eResource().getURI().trimFileExtension()
				.appendFileExtension("feature");
		Resource lcRes = null;
		Resource fmRes = null;
		try {
			lcRes = eo.eResource().getResourceSet().getResource(lcUri, true);
			fmRes = eo.eResource().getResourceSet().getResource(fmUri, true);
		}
		catch (Exception e) { }
		if (lcRes == null || fmRes == null) {
			return false;
		}
		try {
			FeatureModel fm = (FeatureModel) fmRes.getContents().get(0);
			OptionBinding ob = (OptionBinding) lcRes.getContents().get(0);
			ob = fm.applyCompletions(ob);
			for (Entry<Option, Tristate> e : ob.getBoundOptions().entrySet()) {
				if (e.getKey().getName().equals(rbId) && 
						e.getValue().equals(Tristate.TRUE)) {
					return true;
				}
			}
		}
		catch (Exception e) {
			return false;
		}
		finally {
			lcRes.unload();
			fmRes.unload();
			eo.eResource().getResourceSet().getResources().remove(lcRes);
			eo.eResource().getResourceSet().getResources().remove(fmRes);
		}
		return false;
	}
	
	/**
	 * Checks whether this feature has been inserted during the current
	 * modification step, i.e., whether it has not been committed earlier.
	 * For this purpose, the repository feature model is traversed for a feature
	 * carrying the same UUID.
	 *
	 * @param f
	 * @return true if the feature is new.
	 */
	protected boolean isNew(Feature f) {
		EObject eo = EcoreUtil.getRootContainer(f);
		if (eo == null) {
			return true;
		}
		URI uri = eo.eResource().getURI();
		// in case feature model is unversioned, skip the action
		if (uri.fileExtension().equals("feature")) {
			return false;
		}
		else {
			uri = uri.trimFileExtension().appendFileExtension("feature");
			Resource fmRes = null;
			try { 
				fmRes = eo.eResource().getResourceSet().getResource(uri, true);
			}
			catch (Exception e) { }
			if (fmRes == null) {
				return true;
			}
			try {
				FeatureModel fm = (FeatureModel) fmRes.getContents().get(0);
				for (Feature oldF : fm.getFeatures()) {
					if (oldF.getUuid().equals(f.getUuid())) {	
						return false;
					}
				}
				return true;
			}
			finally {
				fmRes.unload();
				eo.eResource().getResourceSet().getResources().remove(fmRes);
			}
		}
	}

	/**
	 * Performs a feature elimination by assigning a negative default binding
	 * that will be applied to future bindings referring to this feature.
	 *
	 * @param f
	 */
	protected void eliminateFeature(Feature f) {
		Elimination elim = SuperModFeatureFactory.eINSTANCE.createElimination();
		elim.setDefaultSelection(Tristate.FALSE);
		f.getEliminations().clear();
		f.getEliminations().add(elim);
	}

}
