/******************************************************************************
 * Copyright (c) 2018 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.service.list.client;


import static de.ubt.ai1.supermod.service.generic.client.impl.DefaultResolutionPreferenceUtil.DEFAULTRES__ORDER;

import java.util.Set;
import java.util.stream.Collectors;
import org.eclipse.core.resources.IProject;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;

import de.ubt.ai1.supermod.mm.core.ProductSpaceElement;
import de.ubt.ai1.supermod.mm.list.VersionedList;
import de.ubt.ai1.supermod.mm.list.VersionedListEdge;
import de.ubt.ai1.supermod.mm.list.VersionedListStartReference;
import de.ubt.ai1.supermod.mm.list.VersionedListVertex;
import de.ubt.ai1.supermod.mm.list.util.VersionedListUtil;
import de.ubt.ai1.supermod.mm.list.util.VersionedListUtil.IVertexSelector;
import de.ubt.ai1.supermod.service.client.IDefaultResolver;

/**
 * Auxiliary operations for the internal SuperMod extrinsic list
 * representation, which uses a directed graph of element vertices, into
 * arbitrary single-version Java collections of equivalent versioned elements.
 * 
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>,
 * 			Johannes Schroepfer <Johannes.M.Schroepfer(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	2018-01-28
 */
public class ListExportUtil {

	/**
	 * Converts the given multi-version list into a single-version sequence.
	 * In the case of ambiguities, order conflicts are not reported. Rather,
	 * the conflict is default-resolved, utilizing the specified default
	 * resolver instance.
	 * 
	 * @param list              the list to convert
	 * @param defaultResolver   for default-resolving order conflicts
	 * @param project           the current project
	 * @return                  a (potentially empty) single-version list
	 */
	public static <E extends ProductSpaceElement> EList<E> exportList(
			VersionedList list, IDefaultResolver defaultResolver,
			IProject project) {
		
		return VersionedListUtil.linearize(list, new IVertexSelector() {
			
			@Override
			public VersionedListVertex select(VersionedListVertex lastVertex, 
					Set<VersionedListVertex> candidates) {
				
				// Case 1. There is no "lastVertex" vertex (i. e., the set
				// "candidates" only contains start vertices):
				// Consider the start references referring to the candidates.
				if (lastVertex == null) {
					Set<VersionedListStartReference> startRefs = candidates
							.stream().map(v -> v.getStartRef())
							// It holds that: v.getStartRef() != null
							.collect(Collectors.toSet());
					return defaultResolver.selectCandidate(ECollections
								.newBasicEList(startRefs), DEFAULTRES__ORDER,
								project).getVertex();
				}
				
				// Case 2. There is a "lastVertex" vertex and at least one
				// outgoing edge whose sink is contained in the collection
				// "candidates":
				// Only consider the sinks of these edges.
				Set<VersionedListEdge> edges = lastVertex
						.getOutgoingEdges().stream()
						.filter(e -> candidates.contains(e.getSink()))
						.collect(Collectors.toSet());
				if (!edges.isEmpty()) {
					return defaultResolver.selectCandidate(ECollections
							.newBasicEList(edges), DEFAULTRES__ORDER,
							project).getSink();
				}
				
				// Otherwise:
				// Consider all vertices contained in the collection
				// "candidates".
				return defaultResolver.selectCandidate(ECollections
						.newBasicEList(candidates), DEFAULTRES__ORDER,
						project);
			}
		});
	}
}
