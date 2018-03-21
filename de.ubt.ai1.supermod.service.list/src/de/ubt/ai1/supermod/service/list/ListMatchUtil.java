/******************************************************************************
 * Copyright (c) 2018 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.service.list;


import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import de.ubt.ai1.supermod.mm.core.ProductSpaceElement;
import de.ubt.ai1.supermod.mm.diff.MatchedProductSpaceElement;
import de.ubt.ai1.supermod.mm.diff.MatchingRole;
import de.ubt.ai1.supermod.mm.diff.ProductSpaceElementMatching;
import de.ubt.ai1.supermod.mm.diff.SuperModDiffFactory;
import de.ubt.ai1.supermod.mm.list.VersionedList;
import de.ubt.ai1.supermod.mm.list.VersionedListEdge;
import de.ubt.ai1.supermod.mm.list.VersionedListStartReference;
import de.ubt.ai1.supermod.mm.list.VersionedListVertex;
import de.ubt.ai1.supermod.service.generic.MergeUtil;
import de.ubt.ai1.supermod.service.generic.MergeUtil.PropertyAccessor;

/**
 * Auxiliary operations for low-level match operations on versioned SuperMod
 * lists, which are internally represented as directed graphs of product space
 * elements.
 * 
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>,
 * 			Johannes Schroepfer <Johannes.M.Schroepfer(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	2018-01-09
 */
public class ListMatchUtil {

	/**
	 * Calculates an element matching for the specified versions of the same
	 * versioned SuperMod list, provided a set of element matchings which
	 * defines correspondences between elements that occur in the different
	 * versions of the list.
	 * 
	 * @param versionedLists     different versions of a versioned list for
	 * 								which to calculate the matching
	 * @param elementMatchings   defines correspondences for elements of the
	 * 								list to utilize for the calculation of
	 * 								the list matching
	 * @param roles              involved product spaces and their specific
	 * 								purpose in the matching
	 * @return                   an element matching which defines all
	 * 								specified versioned list versions as
	 * 								corresponding
	 */
	public static ProductSpaceElementMatching matchVersionedList(
			List<VersionedList> versionedLists,
			List<ProductSpaceElementMatching> elementMatchings,
			Collection<MatchingRole> roles) {
		
		if (versionedLists == null || versionedLists.isEmpty()) return null;
		
		// Create a matching for the versioned list.
		ProductSpaceElementMatching listMatching = SuperModDiffFactory
				.eINSTANCE.createProductSpaceElementMatching();
		for (VersionedList versionedList : versionedLists) {
			MatchedProductSpaceElement me = SuperModDiffFactory.eINSTANCE
					.createMatchedProductSpaceElement();
			me.setElement(versionedList);
			for (MatchingRole mr : roles) {
				if (mr.getMatchedProductSpace().equals(
						versionedList.getProductSpace())) {
					me.setRole(mr);
				}
			}			
			listMatching.getMatchedElements().add(me);
		}
		
		// Associate each product space element with the element matching where
		// it occurs.
		Map<ProductSpaceElement, ProductSpaceElementMatching> 
				elementToMatchingMap = getElementToMatchingMap(
						elementMatchings);
		
		// Auxiliary structures to be used below for the calculation of vertex,
		// edge, and start reference matchings.
		List<List<VersionedListVertex>> vertexMtx = new ArrayList<>();
		List<List<VersionedListEdge>> edgeMtx = new ArrayList<>();
		List<List<VersionedListStartReference>> startRefMtx = new ArrayList<>();
		for (VersionedList list : versionedLists) {
			vertexMtx.add(list.getVertices());
			edgeMtx.add(list.getEdges());
			startRefMtx.add(list.getStartVertices());
		}
		
		// A procedure similar to the algorithm of Heckel: First, elements
		// which occur uniquely within all collections are identified and
		// matched. Next, in multiple iterations, the matching is expanded
		// by comparing direct predecessors and successors of already matching
		// elements. In case no new matchings are added, the procedure stops.
		Set<VersionedListVertex> tabuVertices = new HashSet<>();
		List<ProductSpaceElementMatching> vertexMatchings = 
				matchUniqueVertices(vertexMtx, elementMatchings, roles,
						tabuVertices);
		List<ProductSpaceElementMatching> allVertexMatchings = 
				new ArrayList<>(vertexMatchings);
		while (!vertexMatchings.isEmpty()) {
			vertexMatchings = expandVertexMatching(vertexMatchings, 
					elementToMatchingMap, roles, tabuVertices);
			allVertexMatchings.addAll(vertexMatchings);
		}
		
		// Match remaining vertices by UUID.
		List<ProductSpaceElementMatching> uuidMatchings = matchVerticesByUuid(
				vertexMtx, elementMatchings, elementToMatchingMap,
				roles, tabuVertices, allVertexMatchings);
		allVertexMatchings.addAll(uuidMatchings);
		
		// Add single-version matchings.
		List<ProductSpaceElementMatching> singleVersionMatchings = 
				matchSingleVersionVertices(vertexMtx, roles, tabuVertices);
		allVertexMatchings.addAll(singleVersionMatchings);
		
		// Edges are matched in case they refer to matching vertices as their
		// predecessor and successor.
		List<ProductSpaceElementMatching> edgeMatchings = matchEdges(
				edgeMtx, allVertexMatchings, roles);
		
		// Start references are matched in case they refer to matching
		// vertices as their vertex.
		List<ProductSpaceElementMatching> startRefMatchings = matchStartRefs(
				startRefMtx, allVertexMatchings, roles);
		
		// Create the matching's contents and return the matching.
		listMatching.getSubMatchings().addAll(allVertexMatchings);
		listMatching.getSubMatchings().addAll(edgeMatchings);
		listMatching.getSubMatchings().addAll(startRefMatchings);
		return listMatching;
	}

	/**
	 * Creates a map that associates each product space element that occurs in
	 * a given matching to the element matching where it occurs.
	 * 
	 * @param elementMatchings
	 * @return
	 */
	private static Map<ProductSpaceElement, ProductSpaceElementMatching> 
	getElementToMatchingMap(
			List<ProductSpaceElementMatching> elementMatchings) {
		Map<ProductSpaceElement, ProductSpaceElementMatching> 
				elementToMatchingMap = new LinkedHashMap<>();
		for (ProductSpaceElementMatching em : elementMatchings) {
			for (MatchedProductSpaceElement me : em.getMatchedElements()) {
				ProductSpaceElement e = me.getElement();
				elementToMatchingMap.put(e, em);
			}
		}
		return elementToMatchingMap;
	}

	/**
	 * Identifies unique vertex matchings, i.e., matchings which refer to
	 * vertices whose referenced elements are matching, and which occur exactly
	 * once in each collection.
	 * 
	 * @param vertexMtx          different versions of the vertex set of a
	 * 								versioned list
	 * @param elementMatchings   
	 * @param roles
	 * @param tabuVertices       a set of vertices which shall never appear in
	 * 								the resulting matching
	 * @return                   a list of product space element matchings,
	 * 								which represent the matchings for unique
	 * 								vertices
	 */
	private static List<ProductSpaceElementMatching> matchUniqueVertices(
			List<List<VersionedListVertex>> vertexMtx, 
			List<ProductSpaceElementMatching> elementMatchings,
			Collection<MatchingRole> roles,
			Set<VersionedListVertex> tabuVertices) {
		
		// Find unique elements within each collection.
		Set<ProductSpaceElement> duplicateElements = new HashSet<>();
		Map<ProductSpaceElement, VersionedListVertex> elementToVertexMap 
				= new LinkedHashMap<>();
		for (List<VersionedListVertex> vertexRow : vertexMtx) {
			for (VersionedListVertex vertex : vertexRow) {
				if (vertex.getElement() != null) {
					if (!elementToVertexMap.containsKey(vertex.getElement()) && 
							!duplicateElements.contains(vertex.getElement())) {
						elementToVertexMap.put(vertex.getElement(), vertex);
					}
					else {
						duplicateElements.add(vertex.getElement());
						elementToVertexMap.remove(vertex.getElement());
					}
				}
			}
		}
		
		// Traverse the provided element matching. Each matching will produce
		// a unique vertex matching in case the matched elements appear
		// uniquely in each collection. For this test, auxiliary structures are
		// used. In case a unique matching is found, a corresponding matching
		// object is instantiated and added to the result list.
		List<ProductSpaceElementMatching> vertexMatchings = new ArrayList<>();
		for (ProductSpaceElementMatching elementMatching : elementMatchings) {
			List<MatchedProductSpaceElement> matchedVertices = 
					new ArrayList<>();
			for (MatchedProductSpaceElement matchedElement : 
				elementMatching.getMatchedElements()) {
				ProductSpaceElement element = matchedElement.getElement();
				if (elementToVertexMap.containsKey(element)) {
					VersionedListVertex elementVertex = elementToVertexMap.get(
							element);
					if (elementVertex != null && !tabuVertices.contains(
							elementVertex)) {
						MatchedProductSpaceElement matchedVertex = 
								SuperModDiffFactory.eINSTANCE
								.createMatchedProductSpaceElement();
						matchedVertex.setElement(elementVertex);
						matchedVertex.setRole(matchedElement.getRole());
						matchedVertices.add(matchedVertex);
					}
					else {
						break;
					}
				}
			}
			// Only add the matching in case its contents are not empty
			// and the referenced UUIDs do not disagree.
			if (matchedVertices.size() == roles.size() &&
					!uuidsDisagree(matchedVertices)) {
				ProductSpaceElementMatching vertexMatching = 
						SuperModDiffFactory.eINSTANCE
						.createProductSpaceElementMatching();
				vertexMatching.getMatchedElements().addAll(matchedVertices);
				vertexMatchings.add(vertexMatching);
				for (MatchedProductSpaceElement me : 
						vertexMatching.getMatchedElements()) {
					tabuVertices.add((VersionedListVertex) me.getElement());
				}
			}
		}
		return vertexMatchings;
	}
	
	/**
	 * Checks whether the vertices contained in a specified set of matchings
	 * carry different UUIDs. Vertices without UUIDs always agree.
	 * 
	 * @param matchedVertices
	 * @return true in case there exist at least two vertices with different
	 * 			UUIDs in the input set of matchings
	 */
	private static boolean uuidsDisagree(
			List<MatchedProductSpaceElement> matchedVertices) {
		
		String uuid = null;
		for (MatchedProductSpaceElement match : matchedVertices) {
			VersionedListVertex vtx = (VersionedListVertex) match.getElement();
			if (uuid == null || uuid.isEmpty()) {
				if (vtx.getUuid() != null && !vtx.getUuid().isEmpty()) {
					uuid = vtx.getUuid();
				}
			}
			else {
				if (vtx.getUuid() != null && !vtx.getUuid().isEmpty() 
						&& !uuid.equals(vtx.getUuid())) {
					return true;
				}
			}
		}
		return false;
	}

	/**
	 * Expands a given set of vertex matchings by comparing its direct
	 * predecessors and successors in each version of the specified versioned
	 * list. In case the referenced elements correspond according to the 
	 * specified element matchings, a new correspondence is created for the
	 * expanded matchings.
	 * 
	 * @param previousVertexMatchings vertex matchings identified in the
	 * 			previous iteration, which are to be expanded
	 * @param elementToMatchingMap
	 * @param roles
	 * @param tabuVertices vertices that have already been included in another
	 * 			matching and which must not be considered in the result
	 * @return a new set of product space element matchings, which contains the
	 * 			matchings that have been created during expansion. Does not
	 * 			contain the <code>previousVertexMatchings</code>.
	 */
	private static List<ProductSpaceElementMatching> expandVertexMatching(
			List<ProductSpaceElementMatching> previousVertexMatchings,
			Map<ProductSpaceElement, ProductSpaceElementMatching> 
			elementToMatchingMap, Collection<MatchingRole> roles,
			Set<VersionedListVertex> tabuVertices) {
		
		List<ProductSpaceElementMatching> vertexMatchings = new ArrayList<>();
		for (ProductSpaceElementMatching prevVtxEm : previousVertexMatchings) {
			// For each vertex matching found in the previous iteration,
			// obtain direct predecessors and successors.
			List<List<VersionedListVertex>> predMtx = new ArrayList<>();
			List<List<VersionedListVertex>> succMtx = new ArrayList<>();
			for (MatchedProductSpaceElement prevVtxMe : prevVtxEm
					.getMatchedElements()) {
				VersionedListVertex vertex = (VersionedListVertex) 
						prevVtxMe.getElement();
				List<VersionedListVertex> preds = new ArrayList<>();
				List<VersionedListVertex> succs = new ArrayList<>();
				for (VersionedListEdge incoming : vertex.getIncomingEdges()) {
					if (incoming.getSource() != null) {
						preds.add(incoming.getSource());
					}
				}
				for (VersionedListEdge outgoing : vertex.getOutgoingEdges()) {
					if (outgoing.getSink() != null) {
						succs.add(outgoing.getSink());
					}
				}
				predMtx.add(preds);
				succMtx.add(succs);
			}
			// Compare direct predecessors and successors, and occasionally
			// create a matching.
			vertexMatchings.addAll(expandVertexMatrix(predMtx, 
					elementToMatchingMap, roles, tabuVertices));
			vertexMatchings.addAll(expandVertexMatrix(succMtx, 
					elementToMatchingMap, roles, tabuVertices));
		}
		return vertexMatchings;
	}
	
	/**
	 * From a matrix which contains different versions of a set of occasionally
	 * corresponding vertices, find the largest possible set of matchings of
	 * corresponding elements.
	 * 
	 * @param vertexMatrix
	 * @param elementToMatchingMap
	 * @param roles
	 * @param tabuVertices
	 * @return
	 */
	private static List<ProductSpaceElementMatching> expandVertexMatrix(
			List<List<VersionedListVertex>> vertexMatrix,
			Map<ProductSpaceElement, ProductSpaceElementMatching> 
			elementToMatchingMap, Collection<MatchingRole> roles,
			Set<VersionedListVertex> tabuVertices) {
		
		// group neighboring vertices by their corresponding element matching
		Map<ProductSpaceElementMatching, List<VersionedListVertex>> matchingMap
				= new LinkedHashMap<>();
		for (List<VersionedListVertex> vertexRow : vertexMatrix) {
			for (VersionedListVertex vertex : vertexRow) {
				if (vertex.getElement() != null && !tabuVertices.contains(vertex)) {
					ProductSpaceElementMatching elementMatching = 
							elementToMatchingMap.get(vertex.getElement());
					if (!matchingMap.containsKey(elementMatching)) {
						matchingMap.put(elementMatching, new LinkedList<>());
					}
					matchingMap.get(elementMatching).add(vertex);
				}
			}
		}
		
		// Memorize the preferred UUID for each matching group. In general, the
		// UUID designating the highest number of occurrences is preferred.
		Map<ProductSpaceElementMatching, String> preferredUuidMap 
				= new LinkedHashMap<>();
		for (Map.Entry<ProductSpaceElementMatching, List<VersionedListVertex>> e 
				: matchingMap.entrySet()) {
			Map<String, Integer> uuidMap = new HashMap<String, Integer>();
			String preferredUuid = "";
			int highest = 0;
			for (VersionedListVertex vtx : e.getValue()) {
				if (vtx.getUuid() != null && !vtx.getUuid().isEmpty()) {
					if (!uuidMap.containsKey(vtx.getUuid())) {
						uuidMap.put(vtx.getUuid(), 1);
					}
					else {
						uuidMap.replace(vtx.getUuid(),
								uuidMap.get(vtx.getUuid()) + 1);
					}
					if (uuidMap.get(vtx.getUuid()) > highest) {
						highest = uuidMap.get(vtx.getUuid());
						preferredUuid = vtx.getUuid();
					}
				}
			}
			preferredUuidMap.put(e.getKey(), preferredUuid);			
		}
		
		// For all grouped matchings, create a matching which refers to the
		// corresponding element vertices. Vertices that disagree with the
		// preferred UUID are ignored.
		List<ProductSpaceElementMatching> vertexMatchings = new ArrayList<>();
		for (Map.Entry<ProductSpaceElementMatching, List<VersionedListVertex>> e 
				: matchingMap.entrySet()) {
			String preferredUuid = preferredUuidMap.get(e.getKey());
			ProductSpaceElementMatching vertexMatching = SuperModDiffFactory
					.eINSTANCE.createProductSpaceElementMatching();
			for (VersionedListVertex vtx : e.getValue()) {
				if (vtx.getElement() != null) {
					String uuid = vtx.getUuid();
					if (uuid == null || uuid.isEmpty() || 
							uuid.equals(preferredUuid)) {
						MatchedProductSpaceElement vtxMe = SuperModDiffFactory
								.eINSTANCE.createMatchedProductSpaceElement();
						vtxMe.setElement(vtx);
						for (MatchingRole mr : roles) {
							if (mr.getMatchedProductSpace().equals(vtx
									.getElement().getProductSpace())) {	
								vtxMe.setRole(mr);
							}
						}	
						vertexMatching.getMatchedElements().add(vtxMe);
					}
				}
			}
			if (vertexMatching.getMatchedElements().size() > 1 &&
					!uuidsDisagree(vertexMatching.getMatchedElements())) {
				vertexMatchings.add(vertexMatching);
				for (MatchedProductSpaceElement me : 
						vertexMatching.getMatchedElements()) {
					tabuVertices.add((VersionedListVertex) me.getElement());
				}					
			}
		}
		return vertexMatchings;
	}
	
	/**
	 * Identifies vertex matchings by uuid for a remaining set of unmatched
	 * vertices. As a result, existing matchings may be extended, or completely
	 * new matchings may be created, which are inserted into the result list.
	 * 
	 * @param vertexMtx different versions of the vertex set of a versioned 
	 * 			list.
	 * @param elementMatchings
	 * @param roles
	 * @param elementToMatchingMap
	 * @param tabuVertices a set of vertices which shall never appear in the
	 * 			resulting matching
	 * @param existingVertexMatchings previously inferred matchings 
	 * @return new matchings inferred from corresponding UUIDs
	 */
	private static List<ProductSpaceElementMatching> matchVerticesByUuid(
			List<List<VersionedListVertex>> vertexMtx,
			List<ProductSpaceElementMatching> elementMatchings,
			Map<ProductSpaceElement, ProductSpaceElementMatching> 
			elementToMatchingMap, Collection<MatchingRole> roles,
			Set<VersionedListVertex> tabuVertices,
			List<ProductSpaceElementMatching> existingVertexMatchings) {
		
		// Identify tabu uuids as uuids of already matched vertices.
		Map<String, ProductSpaceElementMatching> matchedMap 
				= new HashMap<>();
		for (ProductSpaceElementMatching vtxMatch : existingVertexMatchings) {
			String uuid = MergeUtil.getUnique(
					MergeUtil.filterMatching(vtxMatch, 
							VersionedListVertex.class),
					new PropertyAccessor<VersionedListVertex, String>() {
						@Override
						public String getProperty(VersionedListVertex v) {
							return v.getUuid();
						}						
					});
			if (uuid != null && !uuid.isEmpty()) {
				matchedMap.put(uuid, vtxMatch);
			}
		}
		
		// Find unmatched vertices with the same uuid.
		Map<String, List<VersionedListVertex>> unmatchedMap 
				= new LinkedHashMap<>();
		for (List<VersionedListVertex> row : vertexMtx) {
			for (VersionedListVertex vtx : row) {
				String uuid = vtx.getUuid();
				if (uuid != null && !uuid.isEmpty() &&
						!tabuVertices.contains(vtx)) {
					if (!unmatchedMap.containsKey(uuid)) {
						unmatchedMap.put(uuid, new LinkedList<>());
					}
					unmatchedMap.get(uuid).add(vtx);
				}
			}
		}
		
		// Create corresponding matchings.
		List<ProductSpaceElementMatching> uuidMatchings = new ArrayList<>();
		for (Entry<String, List<VersionedListVertex>> e : 
					unmatchedMap.entrySet()) {
			String uuid = e.getKey();
			List<VersionedListVertex> unmatchedVtces = e.getValue();
			ProductSpaceElementMatching vertexMatching = null;
			if (matchedMap.containsKey(uuid)) {
				vertexMatching = matchedMap.get(uuid);
			}
			else {
				vertexMatching = SuperModDiffFactory.eINSTANCE
						.createProductSpaceElementMatching();
				uuidMatchings.add(vertexMatching);
			}
			for (VersionedListVertex unmatchedVtx : unmatchedVtces) {
				if (unmatchedVtx.getElement() != null) {
					MatchedProductSpaceElement vtxUuidMe = SuperModDiffFactory
							.eINSTANCE.createMatchedProductSpaceElement();
					vtxUuidMe.setElement(unmatchedVtx);
					for (MatchingRole mr : roles) {
						if (mr.getMatchedProductSpace().equals(unmatchedVtx
								.getElement().getProductSpace())) {	
							vtxUuidMe.setRole(mr);
						}
					}		
					vertexMatching.getMatchedElements().add(vtxUuidMe);
					tabuVertices.add(unmatchedVtx);
				}
			}
		}
		return uuidMatchings;
	}
	
	/**
	 * Creates single-version matchings for all vertices that did not match at
	 * all. In other words, matchings for all remaining non-tabu vertices.
	 * 
	 * @param vertexMtx
	 * @param roles
	 * @param tabuVertices contains all vertices after this procedure
	 * @return single-version matchings
	 */
	private static List<ProductSpaceElementMatching> matchSingleVersionVertices(
			List<List<VersionedListVertex>> vertexMtx, 			
			Collection<MatchingRole> roles,
			Set<VersionedListVertex> tabuVertices) {
		
		List<ProductSpaceElementMatching> singleVersionMatchings = 
				new ArrayList<>();
		for (List<VersionedListVertex> row : vertexMtx) {
			for (VersionedListVertex vtx : row) {
				if (!tabuVertices.contains(vtx)) {
					if (vtx.getElement() != null) {
						ProductSpaceElementMatching vertexMatching = 
								SuperModDiffFactory
								.eINSTANCE.createProductSpaceElementMatching();
						MatchedProductSpaceElement vtxMe = SuperModDiffFactory
								.eINSTANCE.createMatchedProductSpaceElement();
						vtxMe.setElement(vtx);
						for (MatchingRole mr : roles) {
							if (mr.getMatchedProductSpace().equals(vtx
									.getElement().getProductSpace())) {	
								vtxMe.setRole(mr);
							}
						}	
						vertexMatching.getMatchedElements().add(vtxMe);
						tabuVertices.add(vtx);
						singleVersionMatchings.add(vertexMatching);
					}
				}
			}
		}
		return singleVersionMatchings;
	}
	
	/**
	 * Finds corresponding edges on the basis of vertex correspondences. An
	 * edge corresponds only in case both the predecessor and the successor
	 * vertex are corresponding.
	 * 
	 * @param edgeMtx           different versions of the edge set of a
	 * 							versioned list
	 * @param vertexMatchings   used to determine which edges correspond
	 * @param roles             
	 * @return                  a list of product space element matchings
	 * 							which refer to edges that correspond
	 * 							according to the vertices they connect
	 */
	private static <E extends ProductSpaceElement> 
	List<ProductSpaceElementMatching> matchEdges(
			List<List<VersionedListEdge>> edgeMtx, 
			List<ProductSpaceElementMatching> vertexMatchings,
			Collection<MatchingRole> roles) {
		
		// Auxiliary map which associates each vertex of the matrix with the
		// matching where it occurs.
		Map<VersionedListVertex, ProductSpaceElementMatching> 
				vertexToMatchingMap = new LinkedHashMap<>();
		for (ProductSpaceElementMatching vertexMatching : vertexMatchings) {
			for (MatchedProductSpaceElement matchedVertex : 
					vertexMatching.getMatchedElements()) {
				VersionedListVertex vertex = (VersionedListVertex) 
						matchedVertex.getElement();
				vertexToMatchingMap.put(vertex, vertexMatching);
			}
		}		
		
		// A map of maps where edge matchings for corresponding source
		// matchings (first key) and target matchings (second key) will be
		// inserted. This avoids the creation of multiple, equivalent edge
		// matchings.
		Map<ProductSpaceElementMatching, 
				Map<ProductSpaceElementMatching, ProductSpaceElementMatching>> 
				vertexMatchingsToEdgeMatchingMap = new LinkedHashMap<>();
		
		// Iterate over the edge matrix and create a correspondence for each
		// entry. Store the new matching under the corresponding source and
		// target vertex matching, which is obtained from the
		// vertexToMatchingMap.
		for (List<VersionedListEdge> edgeRow : edgeMtx) {
			for (VersionedListEdge edge : edgeRow) {
				VersionedListVertex source = edge.getSource();
				VersionedListVertex sink = edge.getSink();
				ProductSpaceElementMatching sourceMatching = 
						vertexToMatchingMap.get(source);
				ProductSpaceElementMatching sinkMatching = 
						vertexToMatchingMap.get(sink);
				if (sourceMatching != null && sinkMatching != null) {
					if (!vertexMatchingsToEdgeMatchingMap.containsKey(
							sourceMatching)) {
						vertexMatchingsToEdgeMatchingMap.put(sourceMatching, 
								new LinkedHashMap<>());
					}
					if (!vertexMatchingsToEdgeMatchingMap.get(sourceMatching)
							.containsKey(sinkMatching)) {
						vertexMatchingsToEdgeMatchingMap.get(sourceMatching)
						.put(sinkMatching, 
								SuperModDiffFactory.eINSTANCE
								.createProductSpaceElementMatching());
					}
					MatchedProductSpaceElement matchedEdge = 
							SuperModDiffFactory.eINSTANCE
							.createMatchedProductSpaceElement();
					matchedEdge.setElement(edge);
					for (MatchingRole mr : roles) {
						if (mr.getMatchedProductSpace().equals(edge
								.getProductSpace())) {
							matchedEdge.setRole(mr);
						}
					}		
					vertexMatchingsToEdgeMatchingMap.get(sourceMatching)
							.get(sinkMatching).getMatchedElements()
							.add(matchedEdge);
				}
			}
		}
		
		// Add each created edge matching to the result.
		List<ProductSpaceElementMatching> edgeMatchings = new ArrayList<>();
		for (Map<ProductSpaceElementMatching, ProductSpaceElementMatching> 
				subMap : vertexMatchingsToEdgeMatchingMap.values()) {
			for (ProductSpaceElementMatching edgeMatching : subMap.values()) {
				edgeMatchings.add(edgeMatching);
			}
		}
		return edgeMatchings;
	}
	
	/**
	 * Finds corresponding start references on the basis of corresponding
	 * vertices. A start reference only corresponds in case the referenced
	 * vertex is corresponding.
	 * 
	 * @param startRefMtx       different versions of the collection of start
	 * 							references of a versioned list
	 * @param vertexMatchings   used to determine start reference
	 * 							correspondences
	 * @param roles             
	 * @return                  a list of product space element matchings
	 * 							which refer to start references that
	 * 							correspond according to the vertices they
	 * 							reference
	 */
	private static <E extends ProductSpaceElement>
	List<ProductSpaceElementMatching> matchStartRefs(
			List<List<VersionedListStartReference>> startRefMtx,
			List<ProductSpaceElementMatching> vertexMatchings,
			Collection<MatchingRole> roles) {
		
		// Auxiliary map which associates each vertex of the matrix with the
		// matching where it occurs.
		Map<VersionedListVertex, ProductSpaceElementMatching>
				vertexToMatchingMap = new LinkedHashMap<>();
		for (ProductSpaceElementMatching vertexMatching : vertexMatchings) {
			for (MatchedProductSpaceElement matchedVertex :
					vertexMatching.getMatchedElements()) {
				VersionedListVertex vertex = (VersionedListVertex)
						matchedVertex.getElement();
				vertexToMatchingMap.put(vertex, vertexMatching);
			}
		}
		
		// A map (vertex matchings -> start reference matchings) where
		// start reference matchings for corresponding vertex matchings
		// are inserted. This avoids the creation of multiple, equivalent
		// start reference matchings.
		Map<ProductSpaceElementMatching, ProductSpaceElementMatching>
				vertexMatchingToStartRefMatchingMap = new LinkedHashMap<>();
		for (List<VersionedListStartReference> row : startRefMtx) {
			for (VersionedListStartReference startRef : row) {
				VersionedListVertex vertex = startRef.getVertex();
				ProductSpaceElementMatching vertexMatching =
						vertexToMatchingMap.get(vertex);
				if (vertexMatching != null) {
					if (!vertexMatchingToStartRefMatchingMap.containsKey(
							vertexMatching)) {
						vertexMatchingToStartRefMatchingMap.put(
								vertexMatching,
								SuperModDiffFactory.eINSTANCE
								.createProductSpaceElementMatching());
					}
					MatchedProductSpaceElement matchedStartRef =
							SuperModDiffFactory.eINSTANCE
							.createMatchedProductSpaceElement();
					matchedStartRef.setElement(startRef);
					for (MatchingRole mr : roles) {
						if (mr.getMatchedProductSpace().equals(
								startRef.getProductSpace())) {
							matchedStartRef.setRole(mr);
						}
					}
					vertexMatchingToStartRefMatchingMap.get(vertexMatching)
							.getMatchedElements().add(matchedStartRef);
				}
			}
		}
		
		// Add each created start reference matching to the result.
		List<ProductSpaceElementMatching> startRefMatchings = new ArrayList<>();
		for (ProductSpaceElementMatching startRefMatching :
				vertexMatchingToStartRefMatchingMap.values()) {
			startRefMatchings.add(startRefMatching);
		}
		return startRefMatchings;
	}
}
