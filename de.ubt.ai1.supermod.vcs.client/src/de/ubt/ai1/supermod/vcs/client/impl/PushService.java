/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.vcs.client.impl;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Collections;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

import com.google.inject.Inject;

import de.ubt.ai1.supermod.mm.client.LocalRepository;
import de.ubt.ai1.supermod.mm.core.Repository;
import de.ubt.ai1.supermod.service.IRepositoryCloneService;
import de.ubt.ai1.supermod.service.IRepositoryProjectionService;
import de.ubt.ai1.supermod.service.client.ILocalMetadataRemovalService;
import de.ubt.ai1.supermod.service.client.IPushPostProcessor;
import de.ubt.ai1.supermod.service.client.IPushPreProcessor;
import de.ubt.ai1.supermod.service.client.exceptions.SuperModClientException;
import de.ubt.ai1.supermod.service.client.exceptions.SuperModClientWrappedException;
import de.ubt.ai1.supermod.service.exceptions.SuperModException;
import de.ubt.ai1.supermod.vcs.client.IPullEnforcementService;
import de.ubt.ai1.supermod.vcs.client.IPushService;
import de.ubt.ai1.supermod.vcs.client.http.IBrowseHttpRequest;
import de.ubt.ai1.supermod.vcs.client.http.ILockHttpRequest;
import de.ubt.ai1.supermod.vcs.client.http.IPushHttpRequest;
import de.ubt.ai1.supermod.vcs.client.http.ITransactionHttpRequest;
import de.ubt.ai1.supermod.vcs.client.http.exceptions.SuperModServerLockedException;
import de.ubt.ai1.util.emf.AI1ResourceSetEncoder;
import de.ubt.ai1.util.emf.AI1ResourceUtil;

/**
 * Default implementation of the "push" VCS operation service interface.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	09.11.2015
 */
public class PushService implements IPushService {
	
	@Inject
	private IBrowseHttpRequest browseRequest;
	
	@Inject
	private ITransactionHttpRequest transactionRequest;
	
	@Inject
	private ILockHttpRequest lockRequest;
	
	@Inject
	private IPullEnforcementService pullEnforcementService;
	
	@Inject
	private IPushHttpRequest pushRequest;
	
	@Inject
	private IPushPreProcessor pushPreProcessor;
	
	@Inject
	private IRepositoryCloneService cloneService;
	
	@Inject
	private ILocalMetadataRemovalService unmetaService;
	
	@Inject
	private IRepositoryProjectionService projectionService;
	
	@Inject
	private IPushPostProcessor pushPostProcessor;

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.vcs.client.IPushService
	 * #canPush(de.ubt.ai1.supermod.mm.client.LocalRepository)
	 */
	@Override
	public boolean canPush(LocalRepository repo) {
		if (!repo.isLocallyModified()) {
			return false;
		}
		String uri = repo.getRemoteUri();
		String user = repo.getRemoteUser();
		try {
			return browseRequest.existsRepo(uri, user);
		} catch (SuperModClientException e) {
			return false;
		}
	}

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.vcs.client.IPushService
	 * #push(de.ubt.ai1.supermod.mm.client.LocalRepository,
	 * org.eclipse.emf.ecore.resource.ResourceSet)
	 */
	@Override
	public void push(LocalRepository repo, ResourceSet rs)
			throws SuperModException {
		
		if (pullEnforcementService.isPullNecessary(repo)) {
			if (pullEnforcementService.proposePull()) {
				pullEnforcementService.enforcePull(repo, rs);
			}
			else {
				return;
			}
		}
		
		String uri = repo.getRemoteUri();
		String user = repo.getRemoteUser();
		int localTid = repo.getWriteTransactionId();
		URI pushUri = repo.eResource().getURI().trimSegments(2)
				.appendSegment("push").appendSegment(""+localTid)
				.appendSegment("");
		
		// pre-processing
		if (!pushPreProcessor.preProcess(repo)) {
			return;
		}
		
		// create the changes to transfer
		ResourceSet cloneRs = new ResourceSetImpl();
		LocalRepository cloneLr;
		try {
			cloneLr = (LocalRepository) cloneService.cloneRepository(repo, 
					"push/" + localTid, cloneRs);
		} catch (IOException e) {
			throw new SuperModClientWrappedException(e);
		}
		Repository clone = unmetaService.removeMetadata(cloneLr);
		projectionService.projectRepository(clone,
				Collections.singleton(localTid));
		EcoreUtil.resolveAll(cloneRs);
		for (Resource r : cloneRs.getResources()) {
			try {
				r.save(AI1ResourceSetEncoder.SAVE_OPTIONS);
			} catch (IOException e) {
				throw new SuperModClientWrappedException(e);
			}
		}
		
		ByteArrayOutputStream os = new ByteArrayOutputStream();
		try {
			AI1ResourceSetEncoder.encodeResourceSet(pushUri, cloneRs, os);
		} catch (IOException e) {
			throw new SuperModClientWrappedException(e);
		}
		String repoContent = os.toString();
		
		// clean up
		URI pushFolderUri = clone.eResource().getURI().trimSegments(1);
		IResource cloneFolderIres = AI1ResourceUtil
				.platformURIToIResource(pushFolderUri);
		try {
			cloneFolderIres.delete(true, new NullProgressMonitor());
		} catch (CoreException e) {
			throw new SuperModClientWrappedException(e);
		}

		// transfer			
		int newWriteTid = 0;
		int newReadTid = 0;
		try {
			if (!lockRequest.lock(uri, user)) {
				throw new SuperModServerLockedException();
			}
			pushRequest.push(uri, user, localTid, repoContent);
			transactionRequest.closeWriteTransaction(uri, user,
					repo.getWriteTransactionId());
			newWriteTid = transactionRequest.openWriteTransaction(uri, user);
			newReadTid = transactionRequest.getCurrentReadTransactionNr(
					repo.getRemoteUri(), repo.getRemoteUser());
		}
		finally {
			if (!lockRequest.unlock(uri, user)) {
				throw new SuperModServerLockedException();
			}
		}
		
		// post-processing
		repo.setWriteTransactionId(newWriteTid);		
		repo.setReadTransactionId(newReadTid);
		pushPostProcessor.postProcess(repo, newWriteTid);
		repo.setLocallyModified(false);
	}

}
