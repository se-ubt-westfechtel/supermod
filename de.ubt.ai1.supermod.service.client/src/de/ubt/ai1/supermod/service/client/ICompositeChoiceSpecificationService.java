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
import de.ubt.ai1.supermod.service.exceptions.SuperModException;

/**
 * Service interface for the specification of a composite choice, which is
 * defined as the specification of a choice in each dimension of a given
 * version space.
 *
 * @see IChoiceSpecificationService
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	30.07.2014
 */
public interface ICompositeChoiceSpecificationService {

	/**
	 * Lets the user specify a composite choice by suitable choice 
	 * specifications in the respective version dimensions.
	 *
	 * @param vs the version space to which the specified choice shall refer to.
	 * @param proposedCompositeChoice an initial composite choice, which may
	 * 			be further refined by the user. Must not be modified.
	 * @param representedCompositeAmbition an optional ambition which must be
	 * 			implied by the specified choice. <code>null</code> if choice
	 * 			specification shall be unconstrained.
	 * @return the composite choice specified by the user, or null if the
	 * 			selection was cancelled.
	 * @throws SuperModException in case an error occurs during choice
	 * 			specification
	 */
	public OptionBinding specifyCompositeChoice(VersionSpace vs,
			OptionBinding proposedCompositeChoice,
			OptionBinding representedCompositeAmbition)
					throws SuperModException;
	
}
