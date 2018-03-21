/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.service.generic.client.impl;

import de.ubt.ai1.supermod.mm.client.LocalRepository;
import de.ubt.ai1.supermod.mm.core.ProductSpaceElement;
import de.ubt.ai1.supermod.mm.diff.ProductSpaceElementDelta;
import de.ubt.ai1.supermod.mm.diff.WriteSet;
import de.ubt.ai1.supermod.service.client.IWriteSetPostProcessor;

/**
 * An implementation of the write set post processor that assigns the most
 * recent repository transaction ID to all modified elements.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	20.10.2015
 */
public class GenericTransactionalWriteSetPostProcessor
implements IWriteSetPostProcessor {

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.client.IWriteSetPostProcessor
	 * #postProcess(de.ubt.ai1.supermod.mm.client.LocalRepository, 
	 * de.ubt.ai1.supermod.mm.diff.WriteSet)
	 */
	@Override
	public boolean postProcess(LocalRepository repo, WriteSet writeSet) {
		int tid = repo.getWriteTransactionId();
		if (tid >= 0) {
			for (ProductSpaceElementDelta ins : writeSet.getInsertedElements()) {
				for (ProductSpaceElement insEl : ins.getRootElements()) {
					assignNewTidsRec(insEl, tid);
				}
			}
			for (ProductSpaceElementDelta del : writeSet.getDeletedElements()) {
				for (ProductSpaceElement delEl : del.getRootElements()) {
					assignNewTidsRec(delEl, tid);
				}
			}
			return true;
		}
		return false;
	}

	/**
	 * Recursive utility method to set the transaction ID of an
	 * inserted or deleted sub-tree correctly.
	 *
	 * @param el the root element of the sub-tree
	 * @param tid current repository transaction ID
	 */
	private void assignNewTidsRec(ProductSpaceElement el, int tid) {
		el.setTransactionId(tid);
		for (ProductSpaceElement subEl : el.getSubProductSpaceElements()) {
			assignNewTidsRec(subEl, tid);
		}		
	}

}
