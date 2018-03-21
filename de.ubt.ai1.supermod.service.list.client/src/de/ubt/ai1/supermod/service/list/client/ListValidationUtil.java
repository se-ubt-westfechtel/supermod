/******************************************************************************
 * Copyright (c) 2018 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.service.list.client;


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

import de.ubt.ai1.supermod.mm.client.ProductConflict;
import de.ubt.ai1.supermod.mm.core.ProductSpaceElement;
import de.ubt.ai1.supermod.mm.list.VersionedList;
import de.ubt.ai1.supermod.mm.list.VersionedListVertex;
import de.ubt.ai1.supermod.mm.list.client.OrderingConflict;
import de.ubt.ai1.supermod.mm.list.client.SuperModListClientFactory;
import de.ubt.ai1.supermod.mm.list.util.VersionedListUtil;
import de.ubt.ai1.supermod.mm.list.util.VersionedListUtil.IVertexSelector;

/**
 * Auxiliary operations for the validation of versioned lists within SuperMod
 * client applications.
 * 
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>,
 * 			Johannes Schroepfer <Johannes.M.Schroepfer(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	2018-01-09
 */
public class ListValidationUtil {

	/**
	 * Validates a specified versioned list. The list is valid if the underlying
	 * graph represents a total order, i.e., it has neither cycles nor pairs
	 * of vertices with a mutually unrelated order. For each vertex which is
	 * not in line with this definition, an {@link OrderingConflict} is 
	 * reported.
	 * 
	 * @param ordering   the versioned list to validate
	 * @return           ordering conflicts that have been detected
	 */
	public static <V extends ProductSpaceElement> 
	Collection<? extends ProductConflict> 
			validateOrdering(VersionedList ordering) {
		final List<OrderingConflict> conflicts = new ArrayList<>();
		if (ordering != null) {
			VersionedListUtil.linearize(ordering, new IVertexSelector() {
				@Override
				public VersionedListVertex select(VersionedListVertex lastVertex,
						Set<VersionedListVertex> candidates) {
					OrderingConflict conflict = SuperModListClientFactory.eINSTANCE
							.createOrderingConflict();
					conflict.setContextList(candidates.iterator().next().getList());
					conflict.setLastVertex(lastVertex);
					conflict.getSuccessorVertices().addAll(candidates);
					conflicts.add(conflict);
					return candidates.stream().findFirst().get();
				}			
			});
		}
		return conflicts;
	}
}
