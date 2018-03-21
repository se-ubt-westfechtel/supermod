/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.service.client;

import de.ubt.ai1.supermod.mm.client.LocalRepository;
import de.ubt.ai1.supermod.mm.core.OptionBinding;
import de.ubt.ai1.supermod.service.exceptions.SuperModException;

/**
 * Service interface for the specification of an ambition and a choice at the
 * same time. A generic implementation would compose a composite choice and
 * ambition specification service. However, details may differ when dimensions
 * are depending on each other.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	15.01.2016
 */
public interface ICompositeAmbitionAndChoiceSpecificationService {

	/**
	 * To be implemented in order to realize the (somewhat intertwined)
	 * specification of both the local ambition and choice by the user.
	 *
	 * @param repo
	 * @param proposedCompositeAmbition
	 * @param proposedCompositeChoice
	 * @return An array of length 2, containing the specified ambition in
	 * 			position 0, and the specified choice in position 1.
	 * @throws SuperModException 
	 */
	OptionBinding[] specifyCompositeChoiceAndAmbition(
			LocalRepository repo, OptionBinding proposedCompositeAmbition,
			OptionBinding proposedCompositeChoice) throws SuperModException;

}
