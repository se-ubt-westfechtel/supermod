/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.vcs.client.impl;

import java.util.concurrent.atomic.AtomicBoolean;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Display;

import com.google.inject.Inject;

import de.ubt.ai1.supermod.mm.client.LocalRepository;
import de.ubt.ai1.supermod.service.client.exceptions.SuperModClientException;
import de.ubt.ai1.supermod.service.exceptions.SuperModException;
import de.ubt.ai1.supermod.vcs.client.IPullEnforcementService;
import de.ubt.ai1.supermod.vcs.client.IPullService;
import de.ubt.ai1.supermod.vcs.client.http.ITransactionHttpRequest;

/**
 * Default implementation of the "Enforce Pull" VCS operation.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	08.02.2016
 */
public class PullEnforcementService implements IPullEnforcementService {
	
	@Inject
	private ITransactionHttpRequest transactionRequest;
	
	@Inject
	private IPullService pullService;

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.vcs.client.IPullEnforcementService
	 * #isPullNecessary(de.ubt.ai1.supermod.mm.client.LocalRepository)
	 */
	@Override
	public boolean isPullNecessary(LocalRepository repo) 
			throws SuperModClientException {
		int localReadTid = repo.getReadTransactionId();
		int remoteReadTid = transactionRequest.getCurrentReadTransactionNr(
				repo.getRemoteUri(), repo.getRemoteUser());
		return localReadTid != remoteReadTid;
	}

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.vcs.client.IPullEnforcementService#proposePull()
	 */
	@Override
	public boolean proposePull() {
		AtomicBoolean result = new AtomicBoolean();
		Display.getDefault().syncExec(new Runnable() {			
			@Override
			public void run() {
				result.set(MessageDialog.openQuestion(
						Display.getDefault().getActiveShell(),
						"Out of Date",
						"You need to pull potentially incoming remote changes first, "
						+ "before pushing your own changes to the repository. "
						+ "Perform a pull automatically?."));				
			}
		});
		return result.get();
	}

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.vcs.client.IPullEnforcementService
	 * #enforcePull(de.ubt.ai1.supermod.mm.client.LocalRepository, 
	 * org.eclipse.emf.ecore.resource.ResourceSet)
	 */
	@Override
	public void enforcePull(LocalRepository repo, ResourceSet rs) 
			throws SuperModException {
		pullService.pull(repo, rs);
	}

}
