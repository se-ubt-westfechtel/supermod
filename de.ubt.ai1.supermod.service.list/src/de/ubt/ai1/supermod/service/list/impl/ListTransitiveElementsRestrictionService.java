/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.service.list.impl;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import de.ubt.ai1.supermod.mm.core.OptionBinding;
import de.ubt.ai1.supermod.mm.core.ProductSpaceElement;
import de.ubt.ai1.supermod.mm.core.SuperModCoreFactory;
import de.ubt.ai1.supermod.mm.core.Tristate;
import de.ubt.ai1.supermod.mm.core.VisibilityEvaluationCache;
import de.ubt.ai1.supermod.mm.list.SuperModListFactory;
import de.ubt.ai1.supermod.mm.list.VersionedListEdge;
import de.ubt.ai1.supermod.mm.list.VersionedListVertex;
import de.ubt.ai1.supermod.service.IProductSpaceElementsRestrictionService;
import de.ubt.ai1.supermod.service.exceptions.UnderspecifiedVisibilityException;
import de.ubt.ai1.supermod.service.generic.impl.GenericProductSpaceElementsRestrictionService;

/**
 * Redefinition of the generic product space elements restriction service that
 * takes under consideration the transitive semantics of edges within versioned
 * lists. In case a vertex is to be deleted, which lies within a path that
 * transitively connects visible predecessors and successors, a replacement
 * edge is added between those.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	27.07.2015
 */
public class ListTransitiveElementsRestrictionService 
extends GenericProductSpaceElementsRestrictionService
implements IProductSpaceElementsRestrictionService {

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.generic.impl.
	 * GenericProductSpaceElementsRestrictionService#deleteRestricted(
	 * org.eclipse.emf.common.util.EList,
	 * de.ubt.ai1.supermod.mm.core.OptionBinding)
	 */
	@Override
	public void deleteRestricted(EList<ProductSpaceElement> elements,
			OptionBinding filter) throws UnderspecifiedVisibilityException {
		VisibilityEvaluationCache cache = SuperModCoreFactory.eINSTANCE
				.createVisibilityEvaluationCache();
		for (ProductSpaceElement pse : new BasicEList<>(elements)) {
			if (pse instanceof VersionedListVertex &&
					pse.isVisibleHierarchically(filter, cache) 
					== Tristate.FALSE) {
				VersionedListVertex vertex = (VersionedListVertex) pse;
				List<VersionedListVertex> visiblePredecessors = 
						getVisiblePredecessors(vertex, filter, cache, 
								new HashSet<VersionedListVertex>());
				List<VersionedListVertex> visibleSuccessors = 
						getVisibleSuccessors(vertex, filter, cache, 
								new HashSet<VersionedListVertex>());
				for (VersionedListVertex vPred : visiblePredecessors) {
					for (VersionedListVertex vSucc : visibleSuccessors) {
						if (vPred != vSucc && vPred != vertex 
								&& vSucc != vertex) {
							VersionedListEdge replacementEdge = 
									SuperModListFactory
									.eINSTANCE.createVersionedListEdge();
							replacementEdge.setSource(vPred);
							replacementEdge.setSink(vSucc);
							vertex.getList().getEdges().add(replacementEdge);
						}
					}
				}
			}
		}
		super.deleteRestricted(elements, filter);
	}

	/**
	 * Recursive auxiliary operation that identifies all (transitive)
	 * predecessors that are visible and reachable by a path of visible edges.
	 *
	 * @param vertex
	 * @param filter
	 * @param cache
	 * @param tabu
	 * @return the visible predecessors of vertex
	 */
	private List<VersionedListVertex> getVisiblePredecessors(
			VersionedListVertex vertex, OptionBinding filter,
			VisibilityEvaluationCache cache,
			HashSet<VersionedListVertex> tabu) {
		List<VersionedListVertex> vPreds = new ArrayList<>();
		for (VersionedListEdge incoming : vertex.getIncomingEdges()) {
			if (incoming.isVisibleHierarchically(filter, cache)
					== Tristate.TRUE) {
				VersionedListVertex pred = incoming.getSource();
				if (!tabu.contains(pred)) {
					tabu.add(pred);
					if (pred.isVisibleHierarchically(filter, cache)
							== Tristate.TRUE) {
						vPreds.add(pred);
					}
					else {
						vPreds.addAll(getVisiblePredecessors(
								pred, filter, cache, tabu));
					}
				}
			}
		}
		return vPreds;
	}

	/**
	 * Recursive auxiliary operation that identifies all (transitive)
	 * successors that are visible and reachable by a path of visible edges.
	 *
	 * @param vertex
	 * @param filter
	 * @param cache
	 * @param tabu
	 * @return the visible successors of vertex
	 */
	private List<VersionedListVertex> getVisibleSuccessors(
			VersionedListVertex vertex, OptionBinding filter,
			VisibilityEvaluationCache cache,
			HashSet<VersionedListVertex> tabu) {
		List<VersionedListVertex> vSuccs = new ArrayList<>();
		for (VersionedListEdge outgoing : vertex.getOutgoingEdges()) {
			if (outgoing.isVisibleHierarchically(filter, cache)
					== Tristate.TRUE) {
				VersionedListVertex succ = outgoing.getSink();
				if (!tabu.contains(succ)) {
					tabu.add(succ);
					if (succ.isVisibleHierarchically(filter, cache)
							== Tristate.TRUE) {
						vSuccs.add(succ);
					}
					else {
						vSuccs.addAll(getVisibleSuccessors(
								succ, filter, cache, tabu));
					}
				}
			}
		}
		return vSuccs;
	}
}
