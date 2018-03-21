/******************************************************************************
 * Copyright (c) 2018 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.service.list.client;


import java.util.ArrayList;
import java.util.List;

import de.ubt.ai1.supermod.mm.core.ProductSpaceElement;
import de.ubt.ai1.supermod.mm.list.SuperModListFactory;
import de.ubt.ai1.supermod.mm.list.VersionedList;
import de.ubt.ai1.supermod.mm.list.VersionedListEdge;
import de.ubt.ai1.supermod.mm.list.VersionedListStartReference;
import de.ubt.ai1.supermod.mm.list.VersionedListVertex;

/**
 * Auxiliary operations for the conversion of arbitrary Java collections of
 * versioned elements into the internal SuperMod list representation, which
 * uses a directed graph of element vertices.
 * 
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>,
 * 			Johannes Schroepfer <Johannes.M.Schroepfer(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	2018-01-09
 */
public class ListImportUtil {

	/**
	 * Creates a linear graph that references the given values in a chain of
	 * vertices, where each vertex connects to its direct successor.
	 *
	 * @param values   the ordered collection of values to convert.
	 * @return         internal list representation, a directed acyclic graph,
	 * 					which represents a total order in this special case.
	 */
	public static VersionedList createLinearList(
			List<? extends ProductSpaceElement> values) {
		
		// For each value, create a vertex.
		List<VersionedListVertex> vertices = new ArrayList<>();
		for (ProductSpaceElement value : values) {
			VersionedListVertex vertex = SuperModListFactory.eINSTANCE
					.createVersionedListVertex();
			vertex.setElement(value);
			vertices.add(vertex);
		}
		
		// Connect each value vertex to its successor.
		List<VersionedListEdge> edges = new ArrayList<>();
		VersionedListVertex previousVertex = null;
		for (VersionedListVertex vertex : vertices) {
			if (previousVertex != null) {
				VersionedListEdge edge = SuperModListFactory.eINSTANCE
						.createVersionedListEdge();
				edge.setSource(previousVertex);
				edge.setSink(vertex);
				edges.add(edge);
			}
			previousVertex = vertex;
		}
		
		// Define the vertex and edge sets of the resulting graph.
		VersionedList versionedList = SuperModListFactory.eINSTANCE
				.createVersionedList();
		versionedList.getVertices().addAll(vertices);
		versionedList.getEdges().addAll(edges);
		
		// Iff the list is not empty, create a start reference.
		if (!values.isEmpty()) {
			VersionedListStartReference start = SuperModListFactory
					.eINSTANCE.createVersionedListStartReference();
			start.setVertex(versionedList.getVertices().get(0));
			versionedList.getStartVertices().add(start);
		}
		
		return versionedList;
	}
}
