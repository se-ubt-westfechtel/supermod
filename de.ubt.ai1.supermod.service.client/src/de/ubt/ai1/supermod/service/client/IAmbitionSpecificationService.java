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
 * Service interface for the specification of an ambition by the user. An
 * ambition defines the set of versions which will be affected by a committed
 * change. Implementing clients should display to the user the version space
 * at a higher level of abstraction, where he/she can perform the selection
 * of a set of versions easily.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	30.07.2014
 */
public interface IAmbitionSpecificationService {
	
	/**
	 * Lets the user specify an option binding which constitutes the ambition
	 * which is linked to the currently performed change to the product space.
	 *
	 * @param dim the version dimension in which the ambition should be
	 * 			specified.
	 * @param choice the choice that had been used for the latest check-out. It
	 * 			must imply the returned ambition.
	 * @param recordedAmbition (optional) in case an ambition has been
	 * 			previously specified by the user, it is contained here.
	 * @param proposedAmbition (optional) an option binding to be proposed to
	 * 			the user as an initial ambition. Must remain unmodified.
	 * @return the ambition specified by the user in the form of a low-level
	 * 			option binding. Null in case ambition specification was
	 * 			cancelled by the user.
	 */
	public OptionBinding specifyAmbition(VersionDimension dim, 
			OptionBinding choice, OptionBinding recordedAmbition,
			OptionBinding proposedAmbition);

	/**
	 * This method will be called by clients in case an ambition specified in a
	 * previous call of {@link specifyCompositeAmbition} is rejected for some
	 * external reason, e.g., if it is not consistent with the specified write
	 * set. Implementations should ensure that all modifications performed
	 * during the creation of the ambition are reverted.
	 *
	 * @param dim
	 * @param specifiedAmbition
	 */
	public void undoAmbitionSpecification(VersionDimension dim, 
			OptionBinding specifiedAmbition);

}
