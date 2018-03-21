/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.service.generic.client.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.UniqueEList;

import de.ubt.ai1.supermod.mm.core.ProductSpaceElement;
import de.ubt.ai1.supermod.mm.diff.ProductSpaceElementDelta;
import de.ubt.ai1.supermod.mm.diff.WriteSet;
import de.ubt.ai1.supermod.service.client.IWriteSetAffectedElementsCalculator;

/**
 * A generic implementation of the affected elements calculation service that
 * exactly corresponds to -d->.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	20.01.2016
 */
public class GenericWriteSetAffectedElementsCalculator
implements IWriteSetAffectedElementsCalculator {

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.client.
	 * IWriteSetAffectedElementsCalculator#getAffectedElements(
	 * de.ubt.ai1.supermod.mm.diff.WriteSet)
	 */
	@Override
	public List<ProductSpaceElement> getAffectedElements(WriteSet writeSet) {
		List<ProductSpaceElement> affectedElements = new ArrayList<>();
		for (ProductSpaceElementDelta ins : writeSet.getInsertedElements()) {
			affectedElements.addAll(getContainers(ins.getRootElements()));
			affectedElements.addAll(getCrossReferencedElements(
					ins.getRootElements()));			
		}
		for (ProductSpaceElementDelta del : writeSet.getDeletedElements()) {
			affectedElements.addAll(getContainers(del.getRootElements()));
			affectedElements.addAll(getCrossReferencingElements(
					del.getRootElements()));
		}
		return affectedElements;
	}

	/**
	 * Returns all container elements of a given collection of product space
	 * elements.
	 *
	 * @param rootElements
	 * @return 
	 */
	protected Collection<? extends ProductSpaceElement> getContainers(
			EList<ProductSpaceElement> rootElements) {
		List<ProductSpaceElement> containers = new ArrayList<>();
		for (ProductSpaceElement root : rootElements) {
			ProductSpaceElement superElement =
					root.getSuperProductSpaceElement();
			if (superElement != null) {
				containers.add(superElement);
			}
		}
		return containers;
	}

	/**
	 * Returns all elements which are cross-referenced by an element that
	 * is included in a given collection of product space elements.
	 *
	 * @param rootElements
	 * @return
	 */
	private Collection<? extends ProductSpaceElement> 
	getCrossReferencedElements(
			EList<ProductSpaceElement> rootElements) {
		List<ProductSpaceElement> crossRefs = new UniqueEList<>();
		for (ProductSpaceElement root : rootElements) {
			crossRefs.addAll(root.getCrossReferencedProductSpaceElements());
		}
		return crossRefs;
	}
	
	/**
	 * Returns all elements which cross-reference an element that
	 * is included in a given collection of product space elements.
	 *
	 * @param rootElements
	 * @return
	 */
	private Collection<? extends ProductSpaceElement> 
	getCrossReferencingElements(
			EList<ProductSpaceElement> rootElements) {
		List<ProductSpaceElement> crossRefs = new UniqueEList<>();
		for (ProductSpaceElement root : rootElements) {
			crossRefs.addAll(root.getCrossReferencingProductSpaceElements());
		}
		return crossRefs;
	}

}
