/******************************************************************************
 * Copyright (c) 2018 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.service.list;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.util.EcoreUtil;

import de.ubt.ai1.supermod.mm.core.ProductSpaceElement;
import de.ubt.ai1.supermod.mm.core.VisibilityForest;
import de.ubt.ai1.supermod.mm.diff.MatchedProductSpaceElement;
import de.ubt.ai1.supermod.mm.diff.MatchingRole;
import de.ubt.ai1.supermod.mm.diff.ProductSpaceElementMatching;
import de.ubt.ai1.supermod.mm.list.SuperModListFactory;
import de.ubt.ai1.supermod.mm.list.VersionedList;
import de.ubt.ai1.supermod.mm.list.VersionedListEdge;
import de.ubt.ai1.supermod.mm.list.VersionedListStartReference;
import de.ubt.ai1.supermod.mm.list.VersionedListVertex;
import de.ubt.ai1.supermod.service.IVisibilityMergeService;
import de.ubt.ai1.supermod.service.generic.MergeUtil;
import de.ubt.ai1.supermod.service.generic.MergeUtil.PropertyAccessor;

/**
 * Auxiliary operations for merging of versioned lists, which are internally
 * represented as directed graphs of product space elements.
 * 
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>,
 * 			Johannes Schroepfer <Johannes.M.Schroepfer(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	2018-01-09
 */
public class ListMergeUtil {

	/**
	 * Merges a set of versioned lists out-place according to a specified list
	 * matching which identifies corresponding elements, vertices, edges and
	 * start references. It is required that the base set of elements has
	 * already been merged, and the results are included in the element
	 * matchings.
	 * 
	 * @param listMatching defines corresponding vertices and edges
	 * @param elementMatchings defines corresponding elements. Furthermore,
	 * 			merged elements are contained within this matching
	 * @param mergeRole will be assigned to each created merged list element
	 * 			to the list matching
	 * @param visibilityForest where new visibilities of merged list elements
	 * 			will be stored
	 * @param visibilityMergeService used to combine visibilities of 
	 * 			corresponding list elements for the visibilities of the 
	 * 			resulting merged versioned list
	 * @return a versioned list which represents the superimposition of the
	 * 			input lists according to the specified matching
	 */
	public static VersionedList mergeVersionedListOutPlace(
			ProductSpaceElementMatching listMatching,
			List<ProductSpaceElementMatching> elementMatchings,
			MatchingRole mergeRole, 
			VisibilityForest visibilityForest,
			IVisibilityMergeService visibilityMergeService) {
		
		// Extract vertex, edge and start reference matchings.
		List<ProductSpaceElementMatching> vertexMatchings = new ArrayList<>();
		List<ProductSpaceElementMatching> edgeMatchings = new ArrayList<>();
		List<ProductSpaceElementMatching> startRefMatchings = new ArrayList<>();
		for (ProductSpaceElementMatching subMatching : listMatching
				.getSubMatchings()) {
			if (!MergeUtil.filterMatching(subMatching, 
					VersionedListVertex.class).isEmpty()) {
				vertexMatchings.add(subMatching);
			}
			if (!MergeUtil.filterMatching(subMatching, 
					VersionedListEdge.class).isEmpty()) {
				edgeMatchings.add(subMatching);
			}
			if (!MergeUtil.filterMatching(subMatching,
					VersionedListStartReference.class).isEmpty()) {
				startRefMatchings.add(subMatching);
			}
		}
		
		// Auxiliary structures which map corresponding product space elements
		// to their merged elements/vertices.
		Map<ProductSpaceElement, ProductSpaceElement> elementMap = 
				getElementMap(elementMatchings, mergeRole);
		List<VersionedListVertex> mergedVertices = mergeVerticesOutPlace(
				vertexMatchings, elementMap, mergeRole,
				visibilityForest, visibilityMergeService);
		Map<VersionedListVertex, VersionedListVertex> vertexMap = 
				getVertexMap(vertexMatchings, mergeRole);
		List<VersionedListEdge> mergedEdges = mergeEdgesOutPlace(
				edgeMatchings, vertexMap, mergeRole,
				visibilityForest, visibilityMergeService);
		List<VersionedListStartReference> mergedStartRefs =
				mergeStartRefsOutPlace(startRefMatchings, vertexMap, mergeRole,
				visibilityForest, visibilityMergeService);
		
		// Create and return a merged versioned list that contains merged
		// vertices, edges and start references.
		List<VersionedList> versionedLists = getVersionedLists(listMatching);
		VersionedList mergedVersionedList = SuperModListFactory.eINSTANCE
				.createVersionedList();
		MergeUtil.setVisibility(versionedLists, mergedVersionedList, 
				visibilityForest, visibilityMergeService);
		MergeUtil.addMergeRole(listMatching, mergeRole, mergedVersionedList);
		MergeUtil.updateTransactionId(listMatching, mergedVersionedList,
				mergeRole);
		mergedVersionedList.getVertices().addAll(mergedVertices);
		mergedVersionedList.getEdges().addAll(mergedEdges);
		mergedVersionedList.getStartVertices().addAll(mergedStartRefs);
		return mergedVersionedList;
	}

	/**
	 * Merges a set of versioned lists in-place according to an existing version
	 * of the master list as well as specified list matching which identifies
	 * corresponding elements, vertices, edges and start references, from all
	 * versions. It is required that the base set of elements has already been
	 * merged, and the results are included in the element matchings.
	 * 
	 * @param masterList the existing versioned list to add new elements to.
	 * @param listMatching defines corresponding vertices, edges and start
	 * 			references.
	 * @param elementMatchings defines corresponding elements. Furthermore,
	 * 			merged elements are contained within this matching.
	 * @param masterRole identifies the master version and will be assigned to
	 * 			each created merged list element to the list matching.
	 * @param visibilityForest where new visibilities of merged list elements
	 * 			will be stored.
	 * @param visibilityMergeService used to combine visibilities of 
	 * 			corresponding list elements for the visibilities of the 
	 * 			resulting merged versioned list.
	 */
	public static void mergeVersionedListInPlace(VersionedList masterList,
			ProductSpaceElementMatching listMatching,
			List<ProductSpaceElementMatching> elementMatchings,
			MatchingRole masterRole, VisibilityForest visibilityForest,
			IVisibilityMergeService visibilityMergeService) {
		
		// Extract vertex and edge matchings.
		List<ProductSpaceElementMatching> vertexMatchings = new ArrayList<>();
		List<ProductSpaceElementMatching> edgeMatchings = new ArrayList<>();
		List<ProductSpaceElementMatching> startRefMatchings = new ArrayList<>();
		for (ProductSpaceElementMatching subMatching : listMatching
				.getSubMatchings()) {
			if (!MergeUtil.filterMatching(subMatching, 
					VersionedListVertex.class).isEmpty()) {
				vertexMatchings.add(subMatching);
			}
			if (!MergeUtil.filterMatching(subMatching, 
					VersionedListEdge.class).isEmpty()) {
				edgeMatchings.add(subMatching);
			}
			if (!MergeUtil.filterMatching(subMatching,
					VersionedListStartReference.class).isEmpty()) {
				startRefMatchings.add(subMatching);
			}
		}
	
		// Auxiliary structures which map corresponding product space elements
		// to their merged elements/vertices.
		Map<ProductSpaceElement, ProductSpaceElement> elementMap = 
				getElementMap(elementMatchings, masterRole);
		mergeVerticesInPlace(masterList,
				vertexMatchings, elementMap, masterRole,
				visibilityForest, visibilityMergeService);
		Map<VersionedListVertex, VersionedListVertex> vertexMap = 
				getVertexMap(vertexMatchings, masterRole);
		mergeEdgesInPlace(masterList,
				edgeMatchings, vertexMap, masterRole,
				visibilityForest, visibilityMergeService);
		mergeStartRefsInPlace(masterList,
				startRefMatchings, vertexMap, masterRole,
				visibilityForest, visibilityMergeService);
	}

	/**
	 * Associates each input element, which is part of an element matching, to
	 * its corresponding merged element.
	 * 
	 * @param elementMatchings   
	 * @param mergeRole          used to determine the merged element
	 * @return                   an associative map that represents the
	 * 								specified set of element matchings
	 */
	private static Map<ProductSpaceElement, ProductSpaceElement> getElementMap(
			List<ProductSpaceElementMatching> elementMatchings,
			MatchingRole mergeRole) {
		
		Map<ProductSpaceElement, ProductSpaceElement> elementMap =
				new HashMap<>();
		for (ProductSpaceElementMatching em : elementMatchings) {
			List<ProductSpaceElement> originals = new ArrayList<>();
			ProductSpaceElement merged = null;
			for (MatchedProductSpaceElement me : em.getMatchedElements()) {
				ProductSpaceElement e = me.getElement();
				if (me.getRole() != null && me.getRole().equals(mergeRole)) {
					merged = e;
				}
				else {
					originals.add(e);
				}
			}
			if (merged != null) {
				for (ProductSpaceElement e : originals) {
					elementMap.put(e, merged);
				}
			}
		}
		return elementMap;
	}

	/**
	 * Associates each input vertex, which is part of the specified list
	 * matching, with its associated merged vertex.
	 * 
	 * @param vertexMatchings
	 * @param mergeRole used to determine the merged vertex.
	 * @return an associative map that represents the specified set of
	 * 			vertex matchings.
	 */
	private static Map<VersionedListVertex, VersionedListVertex> getVertexMap(
			List<ProductSpaceElementMatching> vertexMatchings, 
			MatchingRole mergeRole) {
		
		Map<VersionedListVertex, VersionedListVertex> vertexMap 
		= new HashMap<>();
		for (ProductSpaceElementMatching em : vertexMatchings) {
			List<VersionedListVertex> originals = new ArrayList<>();
			VersionedListVertex merged = null;
			for (MatchedProductSpaceElement me : em.getMatchedElements()) {
				VersionedListVertex e = (VersionedListVertex) me.getElement();
				if (me.getRole() != null && me.getRole().equals(mergeRole)) {
					merged = e;
				}
				else {
					originals.add(e);
				}
			}
			if (merged != null) {
				for (VersionedListVertex e : originals) {
					vertexMap.put(e, merged);
				}
			}
		}
		return vertexMap;
	}

	/**
	 * Extracts different versions of versioned lists from a given versioned
	 * list matching.
	 * 
	 * @param listMatching
	 * @return
	 */
	private static List<VersionedList> getVersionedLists(
			ProductSpaceElementMatching listMatching) {
		
		List<VersionedList> versionedLists = new ArrayList<>();
		for (MatchedProductSpaceElement me : listMatching
				.getMatchedElements()) {
			VersionedList list = (VersionedList) me.getElement();
			versionedLists.add(list);
		}
		return versionedLists;
	}
	
	/**
	 * Creates a new vertex that refers to the corresponding merged product
	 * space element of the input vertices.
	 * 
	 * @param vertices
	 * @param elementMap
	 * @return the merged product space element vertex
	 */
	private static VersionedListVertex createMergedVertex(
			List<VersionedListVertex> vertices, 
			Map<ProductSpaceElement, ProductSpaceElement> elementMap) {
		
		VersionedListVertex mergedVertex = SuperModListFactory.eINSTANCE
				.createVersionedListVertex();
		String uuid = MergeUtil.getUnique(vertices,
				new PropertyAccessor<VersionedListVertex, String>() {
			@Override
			public String getProperty(VersionedListVertex v) {
				return v.getUuid();
			}
		});
		if (uuid == null || uuid.isEmpty()) {
			uuid = EcoreUtil.generateUUID();
		}
		mergedVertex.setUuid(uuid);
		mergedVertex.setElement(MergeUtil.getUnique(vertices, 
				new PropertyAccessor<VersionedListVertex, 
				ProductSpaceElement>() {
			@Override
			public ProductSpaceElement getProperty(VersionedListVertex v) {
				return elementMap.get(v.getElement());
			}			
		}));
		return mergedVertex;
	}
	
	/**
	 * Creates a new edge that refers to the merged vertices which corresponds
	 * to the predecessor and successor specified by input edges.
	 * 
	 * @param edges
	 * @param vertexMap
	 * @return the merged product space element edge
	 */
	private static VersionedListEdge createMergedEdge(
			List<VersionedListEdge> edges, Map<VersionedListVertex,
			VersionedListVertex> vertexMap) {
		
		VersionedListEdge mergedEdge = SuperModListFactory.eINSTANCE
				.createVersionedListEdge();
		mergedEdge.setSource(MergeUtil.getUnique(edges, 
				new PropertyAccessor<VersionedListEdge, 
				VersionedListVertex>() {
			@Override
			public VersionedListVertex getProperty(VersionedListEdge v) {
				return vertexMap.get(v.getSource());
			}
		}));
		mergedEdge.setSink(MergeUtil.getUnique(edges, 
				new PropertyAccessor<VersionedListEdge, 
				VersionedListVertex>() {
			@Override
			public VersionedListVertex getProperty(VersionedListEdge v) {
				return vertexMap.get(v.getSink());
			}
		}));
		return mergedEdge;
	}
	
	/**
	 * Creates a new start reference that refers to the merged vertex which
	 * corresponds to the referenced vertex specified by input start
	 * references.
	 * 
	 * @param startRefs
	 * @param vertexMap
	 * @return the merged product space element start reference
	 */
	private static VersionedListStartReference createMergedStartRef(
			List<VersionedListStartReference> startRefs,
			Map<VersionedListVertex, VersionedListVertex> vertexMap) {
		
		VersionedListStartReference mergedStartReference =
				SuperModListFactory.eINSTANCE
				.createVersionedListStartReference();
		mergedStartReference.setVertex(MergeUtil.getUnique(startRefs,
				new PropertyAccessor<VersionedListStartReference,
				VersionedListVertex>() {
			
			@Override
			public VersionedListVertex getProperty(
					VersionedListStartReference s) {
				
				return vertexMap.get(s.getVertex());
			}
		}));
		return mergedStartReference;
	}
	
	/**
	 * Creates a list of merged vertices based on a list of element vertex
	 * matchings and auxiliary data structures.
	 * 
	 * @param vertexMatchings          
	 * @param elementMap               maps each product space element
	 * 									which occurs in a matching in a role
	 * 									different from the merge role, to its
	 * 									corresponding merged element
	 * @param mergeRole                
	 * @param visibilityForest         
	 * @param visibilityMergeService   
	 * @return                         the merged vertex set
	 */
	private static List<VersionedListVertex> mergeVerticesOutPlace(
			List<ProductSpaceElementMatching> vertexMatchings,
			Map<ProductSpaceElement, ProductSpaceElement> elementMap,
			MatchingRole mergeRole,
			VisibilityForest visibilityForest,
			IVisibilityMergeService visibilityMergeService) {
		
		List<VersionedListVertex> mergedVertices = new ArrayList<>();
		for (ProductSpaceElementMatching vertexMatching : vertexMatchings) {
			List<VersionedListVertex> vertices = new ArrayList<>();
			for (MatchedProductSpaceElement vertexMe : vertexMatching
					.getMatchedElements()) {
				VersionedListVertex vertex = (VersionedListVertex) 
						vertexMe.getElement();
				vertices.add(vertex);
			}
			VersionedListVertex mergedVertex = createMergedVertex(
					vertices, elementMap);
			MergeUtil.setVisibility(vertices, mergedVertex, visibilityForest, 
					visibilityMergeService);
			MergeUtil.addMergeRole(vertexMatching, mergeRole, mergedVertex);
			MergeUtil.updateTransactionId(vertexMatching, mergedVertex,
					mergeRole);
			mergedVertices.add(mergedVertex);
		}
		return mergedVertices;
	}

	/**
	 * Creates a list of merged edges based on a list of edge matchings, and an
	 * auxiliary structure that represents vertex matchings.
	 * 
	 * @param edgeMatchings            
	 * @param vertexMap                maps each element vertex which occurs in
	 * 									the matching in a role different from
	 * 									the merge role, to its corresponding
	 * 									merged vertex
	 * @param mergeRole                
	 * @param visibilityForest         
	 * @param visibilityMergeService   
	 * @return                         the merged edge set
	 */
	private static List<VersionedListEdge> mergeEdgesOutPlace(
			List<ProductSpaceElementMatching> edgeMatchings,
			Map<VersionedListVertex, VersionedListVertex> vertexMap,
			MatchingRole mergeRole,
			VisibilityForest visibilityForest,
			IVisibilityMergeService visibilityMergeService) {
		
		List<VersionedListEdge> mergedEdges = new ArrayList<>();
		for (ProductSpaceElementMatching edgeMatching : edgeMatchings) {
			List<VersionedListEdge> edges = new ArrayList<>();
			for (MatchedProductSpaceElement edgeMe : edgeMatching
					.getMatchedElements()) {
				VersionedListEdge edge = (VersionedListEdge) 
						edgeMe.getElement();
				edges.add(edge);
			}
			VersionedListEdge mergedEdge = createMergedEdge(edges, vertexMap);
			MergeUtil.setVisibility(edges, mergedEdge, visibilityForest, 
					visibilityMergeService);
			MergeUtil.addMergeRole(edgeMatching, mergeRole, mergedEdge);
			MergeUtil.updateTransactionId(edgeMatching, mergedEdge, mergeRole);
			mergedEdges.add(mergedEdge);
		}
		return mergedEdges;
	}
	
	/**
	 * Creates a list of start references based on a list of start reference
	 * matchings, and an auxiliary structure that represents vertex matchings.
	 * 
	 * @param startRefMatchings        
	 * @param vertexMap                maps each element vertex which occurs in
	 * 									the matching in a role different from
	 * 									the merge role, to its corresponding
	 * 									merged vertex
	 * @param mergeRole                
	 * @param visibilityForest         
	 * @param visibilityMergeService   
	 * @return                         the merged edge set
	 * @return
	 */
	private static List<VersionedListStartReference> mergeStartRefsOutPlace(
			List<ProductSpaceElementMatching> startRefMatchings,
			Map<VersionedListVertex, VersionedListVertex> vertexMap,
			MatchingRole mergeRole,
			VisibilityForest visibilityForest,
			IVisibilityMergeService visibilityMergeService) {
		
		List<VersionedListStartReference> mergedStartRefs = new ArrayList<>();
		for (ProductSpaceElementMatching startRefMatching : startRefMatchings) {
			List<VersionedListStartReference> startRefs = new ArrayList<>();
			for (MatchedProductSpaceElement startRefMe : startRefMatching
					.getMatchedElements()) {
				VersionedListStartReference startRef =
						(VersionedListStartReference) startRefMe.getElement();
				startRefs.add(startRef);
			}
			VersionedListStartReference mergedStartRef = createMergedStartRef(
					startRefs, vertexMap);
			MergeUtil.setVisibility(startRefs, mergedStartRef, visibilityForest,
					visibilityMergeService);
			MergeUtil.addMergeRole(startRefMatching, mergeRole, mergedStartRef);
			MergeUtil.updateTransactionId(startRefMatching, mergedStartRef,
					mergeRole);
			mergedStartRefs.add(mergedStartRef);
		}
		return mergedStartRefs;
	}
	
	/**
	 * Iterates over the vertex matchings. In case no matching exists for the
	 * master role, a corresponding vertex is created and added to the master
	 * version of the list
	 * 
	 * @param masterList               the master version of the list
	 * @param vertexMatchings          
	 * @param elementMap                maps each product space element which
	 * 									occurs in a matching in a role
	 * 									different from the merge role, to its
	 * 									corresponding merged element.
	 * @param masterRole               
	 * @param visibilityForest         
	 * @param visibilityMergeService   
	 */
	private static void mergeVerticesInPlace(VersionedList masterList,
			List<ProductSpaceElementMatching> vertexMatchings,
			Map<ProductSpaceElement, ProductSpaceElement> elementMap,
			MatchingRole masterRole, VisibilityForest visibilityForest,
			IVisibilityMergeService visibilityMergeService) {
		
		for (ProductSpaceElementMatching vertexMatching : vertexMatchings) {
			if (vertexMatching.getMatchedElement(masterRole) == null) {
				List<VersionedListVertex> vertices = new ArrayList<>();
				for (MatchedProductSpaceElement vertexMe : vertexMatching
						.getMatchedElements()) {
					VersionedListVertex vertex = (VersionedListVertex) 
							vertexMe.getElement();
					vertices.add(vertex);
				}
				VersionedListVertex mergedVertex = createMergedVertex(
						vertices, elementMap);
				MergeUtil.setVisibility(vertices, mergedVertex, visibilityForest, 
						visibilityMergeService);
				MergeUtil.addMergeRole(vertexMatching, masterRole, mergedVertex);
				MergeUtil.updateTransactionId(vertexMatching, mergedVertex,
						masterRole);
				masterList.getVertices().add(mergedVertex);
			}
		}		
	}

	/**
	 * Iterates over the edge matchings. In case no matching exists for the
	 * master role, a corresponding edge is created and added to the master
	 * version of the list
	 * 
	 * @param masterList               the master version of the list
	 * @param edgeMatchings            
	 * @param vertexMap                maps each element vertex which occurs in
	 * 									the matching in a role different from
	 * 									the merge role, to its corresponding
	 * 									merged vertex
	 * @param masterRole               
	 * @param visibilityForest         
	 * @param visibilityMergeService   
	 */
	private static void mergeEdgesInPlace(VersionedList masterList,
			List<ProductSpaceElementMatching> edgeMatchings,
			Map<VersionedListVertex, VersionedListVertex> vertexMap,
			MatchingRole masterRole, VisibilityForest visibilityForest,
			IVisibilityMergeService visibilityMergeService) {
		
		for (ProductSpaceElementMatching edgeMatching : edgeMatchings) {
			if (edgeMatching.getMatchedElement(masterRole) == null) {
				List<VersionedListEdge> edges = new ArrayList<>();
				for (MatchedProductSpaceElement edgeMe : edgeMatching
						.getMatchedElements()) {
					VersionedListEdge edge = (VersionedListEdge) 
							edgeMe.getElement();
					edges.add(edge);
				}
				VersionedListEdge mergedEdge = createMergedEdge(edges, vertexMap);
				MergeUtil.setVisibility(edges, mergedEdge, visibilityForest, 
						visibilityMergeService);
				MergeUtil.addMergeRole(edgeMatching, masterRole, mergedEdge);
				MergeUtil.updateTransactionId(edgeMatching, mergedEdge,
						masterRole);
				masterList.getEdges().add(mergedEdge);
			}
		}		
	}
	
	/**
	 * Iterates over the start reference matchings. In case no matching exists
	 * for the master role, a corresponding start reference is created and added
	 * to the master version of the list.
	 * 
	 * @param masterList               the master version of the list
	 * @param startRefMatchings        
	 * @param vertexMap                maps each element vertex which occurs in
	 * 									the matching in a role different from
	 * 									the merge role, to its corresponding
	 * 									merged vertex
	 * @param masterRole               
	 * @param visibilityForest         
	 * @param visibilityMergeService   
	 */
	private static void mergeStartRefsInPlace(VersionedList masterList,
			List<ProductSpaceElementMatching> startRefMatchings,
			Map<VersionedListVertex, VersionedListVertex> vertexMap,
			MatchingRole masterRole, VisibilityForest visibilityForest,
			IVisibilityMergeService visibilityMergeService) {
		
		for (ProductSpaceElementMatching startRefMatching : startRefMatchings) {
			if (startRefMatching.getMatchedElement(masterRole) == null) {
				List<VersionedListStartReference> startRefs = new ArrayList<>();
				for (MatchedProductSpaceElement startRefMe : startRefMatching
						.getMatchedElements()) {
					VersionedListStartReference startRef =
							(VersionedListStartReference) startRefMe.getElement();
					startRefs.add(startRef);
				}
				VersionedListStartReference mergedStartRef = createMergedStartRef(
						startRefs, vertexMap);
				MergeUtil.setVisibility(startRefs, mergedStartRef, visibilityForest,
						visibilityMergeService);
				MergeUtil.addMergeRole(startRefMatching, masterRole, mergedStartRef);
				MergeUtil.updateTransactionId(startRefMatching, mergedStartRef,
						masterRole);
				masterList.getStartVertices().add(mergedStartRef);
			}
		}
	}
}
