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

/**
 * Service interface for the specification of a composite ambition. A composite
 * ambition contains an ambition for each version dimension and may be
 * automatically modified for optimization purposes.
 * 
 * @see IAmbitionSpecificationService
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	30.07.2014
 */
public interface ICompositeAmbitionSpecificationService {
	
	/**
	 * Involves the user to specify a composite ambition by suitable choice
	 * specification operations in the respective version dimension
	 *
	 * @param repo
	 * @param compositeChoice the composite ambition that has been specified
	 * 			within the most recent check-out operation.
	 * @param proposedCompositeAmbition (optional) an initially proposed
	 * 			ambition that may be further modified by the user. 
	 * @param recordedAmbition (optional) in case an ambition has been
	 * 			previously specified by the user, it is contained here.
	 * @return an option binding with respect to the entire version space that
	 * 			describes the set of selected versions. Null in case the user
	 * 			cancelled the specification of an ambition.
	 */
	public OptionBinding specifyCompositeAmbition(LocalRepository repo, 
			OptionBinding compositeChoice, OptionBinding recordedAmbition,
			OptionBinding proposedCompositeAmbition);
	
	/**
	 * This method will be called by clients in case an ambition specified in a
	 * previous call of {@link specifyCompositeAmbition} is rejected for some
	 * external reason, e.g., if it is not consistent with the specified write
	 * set. Implementations should ensure that all modifications performed
	 * during the creation of the ambition are reverted.
	 *
	 * @param repo
	 * @param specifiedAmbition
	 */
	public void undoCompositeAmbitionSpecification(LocalRepository repo, 
			OptionBinding specifiedAmbition);

}
