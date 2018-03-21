/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/

package de.ubt.ai1.supermod.service.list.impl;

import org.eclipse.emf.common.util.ECollections;

import de.ubt.ai1.supermod.mm.core.Element;
import de.ubt.ai1.supermod.mm.list.VersionedList;
import de.ubt.ai1.supermod.mm.list.VersionedListEdge;
import de.ubt.ai1.supermod.mm.list.VersionedListVertex;
import de.ubt.ai1.supermod.service.IElementDeletionService;
import de.ubt.ai1.supermod.service.generic.impl.GenericElementDeletionService;

/**
 * An implementation of the service interface for product space element
 * deletion. The deletion operation implemented here is defined as follows:
 * Arbitrary product space elements are deleted by the EcoreUtil remove
 * operation. In case a versioned vertex is deleted, it is ensured that
 * adjacent edges are deleted, too.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	30.07.2014
 */
public class ListTransitiveElementDeletionService 
extends GenericElementDeletionService
implements IElementDeletionService {

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.IProductSpaceElementDeletionService
	 * #delete(de.ubt.ai1.supermod.mm.core.ProductSpaceElement)
	 */
	@Override
	public void delete(Element el) {
		if (el instanceof VersionedListVertex) {
			VersionedListVertex vertex = (VersionedListVertex) el;
			VersionedList list = vertex.getList();
			for (VersionedListEdge incoming : ECollections.newBasicEList(
					vertex.getIncomingEdges())) {
				incoming.setSource(null);
				incoming.setSink(null);
				list.getEdges().remove(incoming);
			}
			for (VersionedListEdge outgoing : ECollections.newBasicEList(
					vertex.getOutgoingEdges())) {
				outgoing.setSource(null);
				outgoing.setSink(null);
				list.getEdges().remove(outgoing);
			}
		}
		if (el instanceof VersionedListEdge) {
			VersionedListEdge edge = (VersionedListEdge) el;
			edge.setSource(null);
			edge.setSink(null);
		}
		
		super.delete(el);
	}

}
