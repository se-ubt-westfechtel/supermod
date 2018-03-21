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
 * Service interface for the user selection of a choice, which describes a
 * single version inside the product space to be checked-out into the local
 * workspace. Implementing clients should display to the user the version space
 * at a higher level of abstraction, where he/she can perform the selection
 * of a single version easily.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	30.07.2014
 */
public interface IChoiceSpecificationService {
	
	/**
	 * Lets the user specify an option binding which constitutes the choice
	 * to filter the product space by.
	 *
	 * @param dim the version dimension to perform the choice selection in.
	 * @param proposedChoice an initial choice that may serve as the basis
	 * 			for the user selection (optional). Must remain unmodified.
	 * @param representedAmbition an optional ambition which must be
	 * 			implied by the specified choice. <code>null</code> if choice
	 * 			specification shall be unconstrained.
	 * @return the choice selected by the user in its low-level option binding
	 * 			representation, or null in case the selection was cancelled.
	 */
	public OptionBinding specifyChoice(VersionDimension dim, 
			OptionBinding proposedChoice, OptionBinding representedAmbition);

}
