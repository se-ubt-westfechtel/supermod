/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/

package de.ubt.ai1.supermod.service.client;

import java.util.List;

import de.ubt.ai1.supermod.mm.core.OptionBinding;
import de.ubt.ai1.supermod.mm.core.VersionSpace;

/**
 * Service interface for the migration of a composite choice. This operation is
 * defined as a composite operation on the dimensions of the version space,
 * which are migrated separately.
 * 
 * @see IChoiceMigrationService
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	30.07.2014
 */
public interface ICompositeChoiceMigrationService {

	/**
	 * Performs the migration of a composite choice within a given version
	 * space, with respect to a given set of ambitions.
	 *
	 * @param vs the version space all choices and ambitions refer to.
	 * @param choice the composite choice to migrate.
	 * @param ambitions the ambitions with respect to which to migrate.
	 * @return a migrated composite choice which must be consistent to all
	 * 			specified ambitions.
	 */
	public OptionBinding migrateCompositeChoice(VersionSpace vs,
			OptionBinding choice, List<OptionBinding> ambitions);

}
