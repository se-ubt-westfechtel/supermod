/******************************************************************************
 * Copyright (c) 2018 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.service.emffile.client.impl;


import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import de.ubt.ai1.supermod.mm.emffile.EMFContainmentReferenceValue;
import de.ubt.ai1.supermod.mm.emffile.EMFObject;

/**
 * Auxiliary operations for validation and export.
 * 
 * 
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>,
 * 			Johannes Schroepfer <Johannes.M.Schroepfer(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	2018-01-09
 */
public class EMFFileContentUtil {
	
	/**
	 * Detects containment cycles emerging from the given object.
	 * 
	 * @param obj
	 * @param path
	 * @return the detected cycle (iff the given object is part of
	 * 		any) or <code>null</code>
	 */
	public static Set<EMFObject> getContainmentCycle(EMFObject obj,
			Set<EMFObject> path) {
		
		return getContainmentCycle(obj, obj, path);
	}
	
	/**
	 * Recursive auxiliary operation that detects containment cycles which
	 * emerge from a current object and end up in a specified root.
	 * 
	 * @param current
	 * @param root
	 * @param path
	 * @return the detected cycle, or <code>null</code> if this object is not
	 * 			part of a containment cycle.
	 */
	public static Set<EMFObject> getContainmentCycle(EMFObject current, 
			EMFObject root, Set<EMFObject> path) {
		
		for (EMFContainmentReferenceValue crv : current
				.getTargetingContainmentRefVals()) {
			if (crv.eContainer() != null && 
					crv.eContainer().eContainer() != null) {
				EMFObject container = (EMFObject) crv.eContainer().eContainer();
				HashSet<EMFObject> containerPath = new LinkedHashSet<>();
				containerPath.addAll(path);
				containerPath.add(current);
				if (container == root) {
					return containerPath;
				}
				if (!path.contains(container)) {
					Set<EMFObject> containerCycle = getContainmentCycle(
							container, root, containerPath);
					if (containerCycle != null && !containerCycle.isEmpty()) {
						return containerCycle;
					}
				}
			}
		}
		return null;
	}
}
