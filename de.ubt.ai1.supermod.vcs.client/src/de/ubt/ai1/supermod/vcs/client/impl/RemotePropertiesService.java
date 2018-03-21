/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.vcs.client.impl;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Display;

import com.google.inject.Inject;

import de.ubt.ai1.supermod.mm.client.LocalRepository;
import de.ubt.ai1.supermod.service.client.exceptions.SuperModClientException;
import de.ubt.ai1.supermod.vcs.client.IRemotePropertiesService;
import de.ubt.ai1.supermod.vcs.client.http.IBrowseHttpRequest;
import de.ubt.ai1.supermod.vcs.client.http.ILockHttpRequest;
import de.ubt.ai1.supermod.vcs.client.http.IModuleIdHttpRequest;
import de.ubt.ai1.supermod.vcs.client.http.ITransactionHttpRequest;

/**
 * Default implementation of the VCS operation "show remote properties", which
 * uses a simple dialog to show the information.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	09.11.2015
 */
public class RemotePropertiesService implements IRemotePropertiesService {
	
	@Inject
	private IBrowseHttpRequest browseRequest;
	
	@Inject
	private IModuleIdHttpRequest moduleIdRequest;
	
	@Inject
	private ITransactionHttpRequest transactionRequest;
	
	@Inject
	private ILockHttpRequest lockRequest;
	
	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.vcs.client.IRemotePropertiesService
	 * #canShowRemoteProperties(de.ubt.ai1.supermod.mm.client.LocalRepository)
	 */
	@Override
	public boolean canShowRemoteProperties(LocalRepository repo) {
		String uri = repo.getRemoteUri();
		String user = repo.getRemoteUser();
		try {
			return browseRequest.existsRepo(uri, user);
		}
		catch (SuperModClientException e) {
			return false;
		}
	}

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.vcs.client.IRemotePropertiesService
	 * #editRemoteProperties(de.ubt.ai1.supermod.mm.client.LocalRepository)
	 */
	@Override
	public void showRemoteProperties(LocalRepository repo) 
			throws SuperModClientException {

		String uri = repo.getRemoteUri();
		String user = repo.getRemoteUser();
		int localReadTid = repo.getReadTransactionId();
		int localWriteTid = repo.getWriteTransactionId();
		String moduleId = moduleIdRequest.getModuleId(uri, user);
		int remoteReadTid = transactionRequest
				.getCurrentReadTransactionNr(uri, user);
		int remoteWriteTid = transactionRequest
				.getCurrentWriteTransactionNr(uri, user);
		String lockStatus = "unlocked";
		if (lockRequest.isLocked(uri, user)) {
			lockStatus = "locked by " + lockRequest.getLockUser(uri, user) +
					" at " + lockRequest.getLockDate(uri, user);
		}
		
		StringBuilder sb = new StringBuilder();
		sb.append("Remote URI: " + uri + "\n");
		sb.append("Remote user: " + user + "\n");
		sb.append("Module ID: " + moduleId + "\n");
		sb.append("Local Read Transaction Nr: " + localReadTid + "\n");
		sb.append("Remote Read Transaction Nr: " + remoteReadTid + "\n");
		sb.append("Local Write Transaction Nr: " + localWriteTid + "\n");
		sb.append("Remote Write Transaction Nr: " + remoteWriteTid + "\n");
		sb.append("Lock Status: " + lockStatus);
		
		Display.getDefault().asyncExec(new Runnable() {			
			@Override
			public void run() {
				MessageDialog.openInformation(
						Display.getDefault().getActiveShell(),
						"Remote Properties", sb.toString());			
			}
		});

	}
}
