/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/

package de.ubt.ai1.supermod.service.client;

import java.util.Collection;

import de.ubt.ai1.supermod.mm.client.LocalRepository;
import de.ubt.ai1.supermod.mm.core.OptionBinding;
import de.ubt.ai1.supermod.mm.diff.ProductSpaceDelta;
import de.ubt.ai1.supermod.mm.diff.WriteSet;

/**
 * Service interface for the write set assignment service. When committing a
 * change with respect to the entire product space, the performed modifications
 * may have happened under different <em>ambitions</em>, i.e., the changes
 * should affect different versions of the product. Services which implement
 * this interfaces should provide a mechanism to let the user define a set
 * of write sets. Each write set contains a part of the total change, that is
 * provided by means of a product space delta. For each write set, a separate
 * <em>ambition</em> may be specified.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	31.07.2014
 */
public interface IWriteSetAssignmentService {
	
	/**
	 * Lets the user divide the changes described by the specified product space
	 * delta up into different, disjoint write sets. Each write set is
	 * associated with a separate <em>ambition</em>, the set of versions where
	 * the respective part of the change shall be visible.
	 *
	 * @param delta the delta for which to define a set of write sets.
	 * @param repo the repository where to integrate the changes.
	 * @param choice the choice, which should imply all ambitions specified by
	 * 			the different write sets.
	 * @return the specified write sets, or null in case the user cancelled.
	 */
	public Collection<WriteSet> assignWriteSets(ProductSpaceDelta delta, 
			LocalRepository repo, OptionBinding choice);

}
