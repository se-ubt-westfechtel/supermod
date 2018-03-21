/******************************************************************************
 * Copyright (c) 2018 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.mm.list.util;


import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;

import de.ubt.ai1.supermod.mm.core.ProductSpaceElement;
import de.ubt.ai1.supermod.mm.list.VersionedList;
import de.ubt.ai1.supermod.mm.list.VersionedListEdge;
import de.ubt.ai1.supermod.mm.list.VersionedListStartReference;
import de.ubt.ai1.supermod.mm.list.VersionedListVertex;

/**
 * Auxiliary operations for creating a linear order for a versioned SuperMod
 * list.
 * 
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>,
 * 			Johannes Schroepfer <Johannes.M.Schroepfer(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	2018-01-09
 */
public class VersionedListUtil {
	
	/**
	 * Strategy interface to be implemented in order to define the traversal
	 * behavior in case multiple candidates, or no candidate exists as the
	 * successor of a given vertex during linearization.
	 */
	public interface IVertexSelector {
		
		/**
		 * To be implemented in order to return the vertex to be selected in
		 * case there exist multiple candidates.
		 *
		 * @param lastVertex the previous vertex that has been added to the
		 * 			linearized list.
		 * @param candidates a set of candidates which may be selected next.
		 * 			Possibly an empty list.
		 * @return the vertex that has been selected.
		 */
		public VersionedListVertex select(VersionedListVertex lastVertex, 
				Set<VersionedListVertex> candidates);
	}

	/**
	 * Generates a linear order, represented by a simple {@link EList}, for a
	 * versioned SuperMod list, represented by {@link VersionedList}. In case
	 * linearization is not straight-forward, a vertex selection strategy is
	 * applied.
	 *
	 * @param list the SuperMod list to linearize.
	 * @param vertexSelector involved in case there are multiple candidates.
	 * @return a linearized list that contains all elements defined in the
	 * 			input list in the derived linear order.
	 */
	@SuppressWarnings("unchecked")
	public static <E extends ProductSpaceElement> EList<E> linearize(
			VersionedList list, IVertexSelector vertexSelector) {
		if (list == null) {
			return null;
		}
		LinkedHashSet<VersionedListVertex> linearizedVertices =
				getLinearizedVertices(list, vertexSelector);
		EList<E> linearizedList = ECollections.newBasicEList();
		for (VersionedListVertex vertex : linearizedVertices) {
			linearizedList.add((E) vertex.getElement());
		}
		return ECollections.unmodifiableEList(linearizedList);		
	}
	
	/**
	 * Auxiliary operation for the implementation of the list linearization.
	 * First, vertices with a minimal in-degree are searched within the directed
	 * graph. In case there are multiple candidates, a selection strategy is
	 * applied.
	 *
	 * @param                  list the list to linearize
	 * @param vertexSelector   involved in case there are multiple candidates
	 * @return                 a linked hash set representing the derived order
	 */
	private static LinkedHashSet<VersionedListVertex>
			getLinearizedVertices(VersionedList list, 
					IVertexSelector vertexSelector) {
		
		List<VersionedListVertex> startVertexList = new ArrayList<>();
		for (VersionedListStartReference startRef : list.getStartVertices())
			startVertexList.add(startRef.getVertex());
		LinkedHashSet<VersionedListVertex> linearizedVertices 
				= new LinkedHashSet<>();
		VersionedListVertex lastVertex = null;
		LinkedHashSet<VersionedListVertex> minInDegreeVertices = 
				findVerticesWithMinimalInDegree(startVertexList, 
						linearizedVertices, lastVertex);
		while (!minInDegreeVertices.isEmpty()) {
			if (minInDegreeVertices.size() == 1) {
				lastVertex = minInDegreeVertices.iterator().next();
			}
			else {
				lastVertex = vertexSelector.select(lastVertex, 
						minInDegreeVertices);
			}
			linearizedVertices.add(lastVertex);
			minInDegreeVertices = findVerticesWithMinimalInDegree(
					list.getVertices(), linearizedVertices, lastVertex);
		}
		return linearizedVertices;
	}
	
	/**
	 * Finds vertices with a minimal in-degree within the specified vertex set.
	 * Vertices which are contained in <code>ignoredVertices</code> are
	 * treated as deleted vertices.
	 *
	 * @param vertexSet where to find vertices with minimal in-degree.
	 * @param ignoredVertices considered as deleted.
	 * @param lastVertex the previously selected vertex. Its successors are
	 * 			preferred for vertex selection.
	 * @return vertices with minimal in-degree.
	 */
	private static LinkedHashSet<VersionedListVertex>
			findVerticesWithMinimalInDegree(List<VersionedListVertex> vertexSet,
					Set<VersionedListVertex> ignoredVertices, 
					VersionedListVertex lastVertex) {
		// first, the algorithm tries to find successors of the last selected
		// vertex with an in degree of zero.
		if (lastVertex != null) {
			LinkedHashSet<VersionedListVertex> preferredVertices = 
					new LinkedHashSet<>();
			for (VersionedListEdge outgoing : lastVertex.getOutgoingEdges()) {
				VersionedListVertex successor = outgoing.getSink();
				if (!ignoredVertices.contains(successor) && 
						getInDegree(successor, ignoredVertices) == 0) {
					preferredVertices.add(outgoing.getSink());
				}
			}
			if (!preferredVertices.isEmpty()) {
				return preferredVertices;
			}
 		}
		// only in case there is no suitable successor, the complete vertex set
		// is traversed.
		LinkedHashSet<VersionedListVertex> verticesWithMinIn 
				= new LinkedHashSet<>();
		int minimalInDegree = Integer.MAX_VALUE;
		for (VersionedListVertex vertex : vertexSet) {
			if (!ignoredVertices.contains(vertex)) {
				int inDegree = getInDegree(vertex, ignoredVertices);
				if (inDegree < minimalInDegree) {
					minimalInDegree = inDegree;
					verticesWithMinIn.clear();
				}
				if (inDegree == minimalInDegree) {
					verticesWithMinIn.add(vertex);
				}
			}
		}
		return verticesWithMinIn;		
	}
	
	/**
	 * Calculates the in-degree of a specified vertex, considering the vertices
	 * contained in <code>ignoredVertices</code> as deleted.
	 *
	 * @param vertex
	 * @param ignoredVertices
	 * @return
	 */
	private static int getInDegree(
			VersionedListVertex vertex, 
			Set<VersionedListVertex> ignoredVertices) {
		int inDegree = 0;
		for (VersionedListEdge incomingEdge : vertex.getIncomingEdges()) {
			if (!ignoredVertices.contains(incomingEdge.getSource())) {
				inDegree ++;
			}
		}
		return inDegree;
	}

	
}
