/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.service.client;

import java.util.List;

import de.ubt.ai1.supermod.mm.core.ProductSpaceElement;
import de.ubt.ai1.supermod.mm.diff.WriteSet;

/**
 * Service interface for the calculation of elements affected by a specific
 * write set. An implementation would define the -d-> arrow, which basically
 * refers to the following set of elements:
 * <ul>
 * 	<li>containers of inserted elements,</li>
 *  <li>existing elements cross-referenced by inserted elements,</li>
 *  <li>containers of deleted elements,</li>
 *  <li>existing elements cross-referencing deleted elements.</li>
 * </ul>
 * However, there may be metamodel-specific changes (i.e., some references
 * are considered as "unimportant" for this question.
 * Affected elements are needed to test for the "sufficiently general"
 * criterion during write set analysis.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	20.01.2016
 */
public interface IWriteSetAffectedElementsCalculator {
	
	/**
	 * To be implemented in order to calculate the set of affected elements.
	 *
	 * @param writeSet
	 * @return
	 */
	public List<ProductSpaceElement> getAffectedElements(WriteSet writeSet);

}
