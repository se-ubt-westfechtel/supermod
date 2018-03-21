/******************************************************************************
 * Copyright (c) 2018 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.service.feature.client.impl;


import java.util.LinkedHashSet;
import java.util.Set;

import de.ubt.ai1.supermod.mm.feature.ChildRelationship;
import de.ubt.ai1.supermod.mm.feature.Feature;

/**
 * Auxiliary operations for validation and export.
 * 
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>,
 * 			Johannes Schroepfer <Johannes.M.Schroepfer(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	2018-01-09
 */
public class FeatureModelUtil {
	
	/**
	 * Detects containment cycles emerging from the given feature.
	 * 
	 * @param feature
	 * @param path
	 * @return the detected cycle (iff the given feature is part of
	 * 		any) or <code>null</code>
	 */
	public static Set<Feature> getContainmentCycle(Feature feature,
			Set<Feature> path) {
		
		return getContainmentCycle(feature, feature, path);
	}
	
	/**
	 * Recursive auxiliary operation that detects containment cycles which
	 * emerge from a current feature and end up in a specified root.
	 * 
	 * @param current
	 * @param root
	 * @param path
	 * @return the detected cycle, or <code>null</code> if this feature is not
	 * 			part of a containment cycle.
	 */
	public static Set<Feature> getContainmentCycle(Feature current, 
			Feature root, Set<Feature> path) {
		
		for (ChildRelationship cr : current.getParents()) {
			Feature parent = cr.getParent();
			if (parent != null) {
				Set<Feature> containerPath = new LinkedHashSet<>();
				containerPath.addAll(path);
				containerPath.add(current);
				if (parent == root) {
					return containerPath;
				}			
				if (!path.contains(parent)) {
					Set<Feature> containerCycle = getContainmentCycle(parent, 
							root, containerPath);
					if (containerCycle != null && !containerCycle.isEmpty()) {
						return containerCycle;
					}
				}
			}
		}
		return null;
	}
}
