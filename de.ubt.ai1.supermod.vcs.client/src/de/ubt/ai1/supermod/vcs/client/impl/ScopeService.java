/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.vcs.client.impl;

import org.eclipse.emf.ecore.resource.ResourceSet;

import com.google.inject.Inject;

import de.ubt.ai1.supermod.mm.client.LocalRepository;
import de.ubt.ai1.supermod.mm.core.OptionBinding;
import de.ubt.ai1.supermod.service.client.IAmbitionReservationService;
import de.ubt.ai1.supermod.service.client.exceptions.SuperModClientException;
import de.ubt.ai1.supermod.service.exceptions.SuperModException;
import de.ubt.ai1.supermod.vcs.client.IScopeService;

/**
 * Default implementation for the VCS operation "Scope".
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	28.09.2015
 */
public class ScopeService implements IScopeService {

	@Inject
	private IAmbitionReservationService ambitionReservationService;
	
	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.vcs.IScopeService#
	 * canScope(de.ubt.ai1.supermod.mm.client.LocalRepository)
	 */
	@Override
	public boolean canScope(LocalRepository repo)
			throws SuperModClientException {
		return repo != null;
	}

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.vcs.IScopeService#scope(
	 * de.ubt.ai1.supermod.mm.client.LocalRepository, 
	 * org.eclipse.emf.ecore.resource.ResourceSet)
	 */
	@Override
	public boolean scope(LocalRepository repo, ResourceSet rs)
			throws SuperModException {
		if (repo.getLocalAmbition() != null) {
			ambitionReservationService.cancelAmbitionReservation(repo);
		}
		OptionBinding ambition = ambitionReservationService.reserveAmbition(
				repo);
		if (ambition != null) {
			return true;
		}
		else {
			return false;
		}
	}

}
