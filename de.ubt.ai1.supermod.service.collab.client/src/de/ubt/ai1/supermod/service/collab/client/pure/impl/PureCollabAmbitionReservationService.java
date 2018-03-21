/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.service.collab.client.pure.impl;

import de.ubt.ai1.supermod.mm.client.LocalRepository;
import de.ubt.ai1.supermod.mm.core.OptionBinding;
import de.ubt.ai1.supermod.service.client.IAmbitionReservationService;

/**
 * Implementation of the ambition reservation service for the pure collab
 * space. Here, reservation does not take place.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	28.10.2015
 */
public class PureCollabAmbitionReservationService
implements IAmbitionReservationService {
	

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.client.IAmbitionReservationService
	 * #reserveAmbition(de.ubt.ai1.supermod.mm.client.LocalRepository)
	 */
	@Override
	public OptionBinding reserveAmbition(LocalRepository repo) {
		return null;
	}

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.client.IAmbitionReservationService
	 * #cancelAmbitionReservation(de.ubt.ai1.supermod.mm.client.LocalRepository)
	 */
	@Override
	public void cancelAmbitionReservation(LocalRepository repo) {
		// nothing to do.
	}

}
