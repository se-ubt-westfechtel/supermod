/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/

package de.ubt.ai1.supermod.service.client;

import de.ubt.ai1.supermod.mm.core.OptionBinding;
import de.ubt.ai1.supermod.mm.core.VersionSpace;
import de.ubt.ai1.supermod.service.exceptions.UnderspecifiedVisibilityException;

/**
 * Service interface for the migration of a composite choice. This operation is
 * defined as a composite operation on the dimensions of the version space,
 * which are migrated separately.
 *
 * @see IChoiceUpdatingService
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	30.07.2014
 */
public interface ICompositeChoiceUpdatingService {

	/**
	 * Updates the specified composite choice with respect to the temporal
	 * dimension(s) within the specified version space.
	 *
	 * @param vs the version space to which the updated choice will refer.
	 * @param choice the composite choice to be updated.
	 * @return an updated choice which represents exactly one version within
	 * 			the entire version space.
	 * @throws UnderspecifiedVisibilityException in case the update causes a
	 * 			missing option binding.
	 */
	public OptionBinding updateCompositeChoice(VersionSpace vs,
			OptionBinding choice) throws UnderspecifiedVisibilityException;

}
