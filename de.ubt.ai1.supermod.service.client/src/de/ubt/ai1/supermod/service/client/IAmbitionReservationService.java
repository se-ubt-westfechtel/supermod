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
 * Service interface for the specification of an ambition to reserve in the
 * meta-data section. An ambition may be reserved in advance to a commit in 
 * order to delineate the scope of the current change already during check-out, 
 * or at any time between check-out and commit. This interface must be
 * implemented for each specific version space combination.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	28.09.2015
 */
public interface IAmbitionReservationService {
	
	/**
	 * To be implemented in order to reserve an ambition. Typically, one or
	 * several ambition specification services are called. Then, the specified
	 * ambition is recorded in the meta-data section and returned.
	 *
	 * @param repo
	 * @return the specified ambition, or null if reservation is cancelled.
	 */
	public OptionBinding reserveAmbition(LocalRepository repo);

	/**
	 * To be implemented in order to cancel the reservation of an ambition.
	 * Typically, the undo-operations of one or several ambition specification
	 * services are called, before the meta-data field 'local ambition' is
	 * cleared.
	 *
	 * @param versionSpace
	 * @param localAmbition
	 */
	public void cancelAmbitionReservation(LocalRepository repo);

}
