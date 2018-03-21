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
import de.ubt.ai1.supermod.mm.core.VersionDimension;

/**
 * Service interface for choice migration. After having committed a change, it
 * might be the case that the current choice is not consistent with the 
 * specified ambition, because an option binding is missing or contradicting.
 * This service automatically generates a new choice as an updated option
 * binding to be consistent with the set of ambitions specified before.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	30.07.2014
 */
public interface IChoiceMigrationService {
	
	/**
	 * Migrates the choice with respect to the specified ambition and returns
	 * it. The original choice is unmodified.
	 *
	 * @param dim the version dimension in which to migrate the choice.
	 * @param choice the choice to be migrated.
	 * @param ambitions all ambitions that had been specified during the latest
	 * 			commit operation.
	 * @return a migrated version of the choice which is consistent with all
	 * 			specified ambitions, or null if choice migration failed.
	 */
	public OptionBinding migrateChoice(VersionDimension dim,
			OptionBinding choice, List<OptionBinding> ambitions);

}
