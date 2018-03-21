/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.mm.feature.validation;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.IValidationContext;

import de.ubt.ai1.supermod.mm.feature.Feature;
import de.ubt.ai1.supermod.mm.feature.FeatureDependency;
import de.ubt.ai1.supermod.mm.feature.FeatureExclusion;
import de.ubt.ai1.supermod.mm.feature.FeatureRequirement;

/**
 * A model constraint which ensures that feature dependencies, i.e., requires
 * and excludes relationships, are not contradicting.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	14.09.2015
 */
public class NonContradictingDependenciesConstraint extends
		AbstractModelConstraint {

	/* (non-Javadoc)
	 * @see org.eclipse.emf.validation.AbstractModelConstraint
	 * #validate(org.eclipse.emf.validation.IValidationContext)
	 */
	@Override
	public IStatus validate(IValidationContext ctx) {
		EObject eo = ctx.getTarget();
		if (eo instanceof Feature) {
			Feature f = (Feature) eo;
			boolean cont = isContradictory(f);
			if (cont) {
				return ctx.createFailureStatus(f);
			}
		}
		return ctx.createSuccessStatus();
	}

	/**
	 * Checks whether the sets of requires and excludes relationships reached
	 * by a specific feature are transitively non-disjoint.
	 *
	 * @param f
	 * @return true in case there are contradictions, i.e., requires and
	 * 			excludes are not transitively disjoint for <code>f</code>.
	 */
	private boolean isContradictory(Feature f) {
		Map<Feature, FeatureDependency> tReq = 
				getTransitivelyRequiredFeatures(f, new HashSet<Feature>());
		Map<Feature, FeatureDependency> tExc = 
				getTransitivelyExcludedFeatures(f, new HashSet<Feature>());
		if (tReq.containsKey(f) || tExc.containsKey(f)) {
			return true;
		}
		for (Feature df : tReq.keySet()) {
			if (tExc.keySet().contains(df)) {
				return true;
			}
		}
		return false;
	}


	/**
	 * Calculates the transitive closure over the requires relationships of a
	 * given feature.
	 *
	 * @param f
	 * @return a map that maps from the feature to the last requires edge of the
	 * 			path where it is reachable from <code>f</code>.
	 */
	private Map<Feature, FeatureDependency> getTransitivelyRequiredFeatures(
			Feature f, HashSet<Feature> tabu) {
		Map<Feature, FeatureDependency> reqMap = new HashMap<>();
		for (FeatureDependency fd : f.getOutgoingDependencies()) {
			if (fd instanceof FeatureRequirement && 
					!tabu.contains(fd.getTargetFeature())) {
				tabu.add(fd.getTargetFeature());
				reqMap.put(fd.getTargetFeature(), fd);
				reqMap.putAll(getTransitivelyRequiredFeatures(
						fd.getTargetFeature(), tabu));
			}
		}
		return reqMap;
	}

	/**
	 * Calculates the transitive closure over the excludes relationships of a
	 * given feature.
	 *
	 * @param f
	 * @return a map that maps from the feature to the last excludes edge of the
	 * 			path where it is reachable from <code>f</code>.
	 */
	private Map<Feature, FeatureDependency> getTransitivelyExcludedFeatures(
			Feature f, HashSet<Feature> tabu) {
		Map<Feature, FeatureDependency> excMap = new HashMap<>();
		for (FeatureDependency fd : f.getOutgoingDependencies()) {
			if (fd instanceof FeatureExclusion && 
					!tabu.contains(fd.getTargetFeature())) {
				tabu.add(fd.getTargetFeature());
				excMap.put(fd.getTargetFeature(), fd);
				excMap.putAll(getTransitivelyExcludedFeatures(
						fd.getTargetFeature(), tabu));
			}
		}
		return excMap;
	}
	
}
