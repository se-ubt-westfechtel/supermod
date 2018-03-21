/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/

package de.ubt.ai1.supermod.service.client;

import de.ubt.ai1.supermod.mm.core.OptionBinding;
import de.ubt.ai1.supermod.mm.core.VersionDimension;

/**
 * Service interface for the operation of choice updating. In case a choice
 * contains a temporal component, this service updates it to the latest
 * available version in order to be able to integrate remote changes into the
 * local choice.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	30.07.2014
 */
public interface IChoiceUpdatingService {
	
	/**
	 * Modifies a copy of the specified choice in a way that its temporal
	 * component is updated to the latest available version.
	 *
	 * @param dim the version dimension where to perform the choice update
	 * 			operation.
	 * @param choice the choice to update. Must remain unmodified.
	 * @return an updated choice.
	 */
	public OptionBinding updateChoice(VersionDimension dim,
			OptionBinding choice);

}
