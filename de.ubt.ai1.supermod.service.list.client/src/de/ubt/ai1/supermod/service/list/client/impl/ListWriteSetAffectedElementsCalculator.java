/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.service.list.client.impl;

import java.util.ArrayList;
import java.util.List;

import de.ubt.ai1.supermod.mm.core.ProductSpaceElement;
import de.ubt.ai1.supermod.mm.diff.WriteSet;
import de.ubt.ai1.supermod.mm.list.VersionedListEdge;
import de.ubt.ai1.supermod.mm.list.VersionedListVertex;
import de.ubt.ai1.supermod.service.generic.client.impl.GenericWriteSetAffectedElementsCalculator;

/**
 * An extended implementation of the write set affected elements calculator
 * which takes under consideration that non-representative changes in the
 * order of lists are not semantically destructive. Therefore, all instances
 * of list vertex and edges are removed from the re-defined result set.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	20.01.2016
 */
public class ListWriteSetAffectedElementsCalculator
extends GenericWriteSetAffectedElementsCalculator {
	
	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.generic.client.impl.
	 * GenericWriteSetAffectedElementsCalculator#getAffectedElements(
	 * de.ubt.ai1.supermod.mm.diff.WriteSet)
	 */
	public List<ProductSpaceElement> getAffectedElements(WriteSet writeSet) {
		List<ProductSpaceElement> result = new ArrayList<ProductSpaceElement>();
		for (ProductSpaceElement pse : super.getAffectedElements(writeSet)) {
			if (!(pse instanceof VersionedListVertex ||
					pse instanceof VersionedListEdge)) {
				result.add(pse);
			}
		}
		return result;				
	}

}
