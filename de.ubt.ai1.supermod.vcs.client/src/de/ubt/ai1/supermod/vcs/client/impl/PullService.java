/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.vcs.client.impl;

import java.io.ByteArrayInputStream;
import java.io.IOException;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import com.google.inject.Inject;

import de.ubt.ai1.supermod.mm.client.LocalRepository;
import de.ubt.ai1.supermod.mm.core.Repository;
import de.ubt.ai1.supermod.service.IRepositoryMergeService;
import de.ubt.ai1.supermod.service.client.IPullPostProcessor;
import de.ubt.ai1.supermod.service.client.IPullPreProcessor;
import de.ubt.ai1.supermod.service.client.exceptions.SuperModClientException;
import de.ubt.ai1.supermod.service.client.exceptions.SuperModClientWrappedException;
import de.ubt.ai1.supermod.service.exceptions.SuperModException;
import de.ubt.ai1.supermod.vcs.client.IPullService;
import de.ubt.ai1.supermod.vcs.client.IUpdateEnforcementService;
import de.ubt.ai1.supermod.vcs.client.http.IBrowseHttpRequest;
import de.ubt.ai1.supermod.vcs.client.http.ILockHttpRequest;
import de.ubt.ai1.supermod.vcs.client.http.IPullHttpRequest;
import de.ubt.ai1.supermod.vcs.client.http.ITransactionHttpRequest;
import de.ubt.ai1.supermod.vcs.client.http.exceptions.SuperModServerLockedException;
import de.ubt.ai1.util.emf.AI1ResourceSetEncoder;
import de.ubt.ai1.util.emf.AI1ResourceUtil;

/**
 * Default implementation of the "Pull" VCS operation interface.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	09.11.2015
 */
public class PullService implements IPullService {
	
	@Inject
	private IBrowseHttpRequest browseRequest;
	
	@Inject
	private ITransactionHttpRequest transactionRequest;
	
	@Inject
	private ILockHttpRequest lockRequest;
	
	@Inject
	private IPullHttpRequest pullRequest;
	
	@Inject
	private IPullPreProcessor pullPreProcessor;
	
	@Inject
	private IRepositoryMergeService mergeService;
	
	@Inject
	private IPullPostProcessor pullPostProcessor;
	
	@Inject
	private IUpdateEnforcementService updateEnforcementService;

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.vcs.client.IPullService
	 * #canPull(de.ubt.ai1.supermod.mm.client.LocalRepository)
	 */
	@Override
	public boolean canPull(LocalRepository repo) {
		String uri = repo.getRemoteUri();
		String user = repo.getRemoteUser();
		int localTid = repo.getReadTransactionId();
		try {
			return browseRequest.existsRepo(uri, user) &&
					transactionRequest.getCurrentReadTransactionNr(uri, user) 
						!= localTid;
		} catch (SuperModClientException e) {
			return false;
		}
	}

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.vcs.client.IPullService
	 * #pull(de.ubt.ai1.supermod.mm.client.LocalRepository,
	 * org.eclipse.emf.ecore.resource.ResourceSet)
	 */
	@Override
	public void pull(LocalRepository repo, ResourceSet rs)
			throws SuperModException {
		String uri = repo.getRemoteUri();
		String user = repo.getRemoteUser();
		int localTid = repo.getReadTransactionId();
		
		// fetch changes from repository
		int remoteTid = 0;
		String repoChanges = null;
		try {
			if (!lockRequest.lock(uri, user)) {
				throw new SuperModServerLockedException();
			}
			remoteTid = transactionRequest.getCurrentReadTransactionNr(uri, user);
			repoChanges = pullRequest.pull(uri, user, localTid);
		}
		finally {
			if (!lockRequest.unlock(uri, user)) {
				throw new SuperModServerLockedException();
			}
		}
			
		// pre-processing
		if (!pullPreProcessor.preProcess(repo)) {
			return;
		}
		
		// create a local copy
		URI repoPlatformUri = repo.eResource().getURI();
		String projectName = repoPlatformUri.segment(
				repoPlatformUri.segmentCount() - 4);
		URI pullFileUri = URI.createFileURI(ResourcesPlugin.getWorkspace()
				.getRoot().getLocation().toPortableString() + "/" +
				projectName + "/.supermod/pull/" + remoteTid + "/");
		URI pullPlatformUri = repoPlatformUri.trimSegments(2)
				.appendSegment("pull").appendSegment(""+remoteTid)
				.appendSegment("main.rep");
		ByteArrayInputStream is = new ByteArrayInputStream(
				repoChanges.getBytes());
		ResourceSet pullRs = new ResourceSetImpl();
		try {
			AI1ResourceSetEncoder.decodeResourceSet(pullFileUri, pullRs, is);
		} catch (IOException e) {
			throw new SuperModClientWrappedException(e);
		}
		Resource otherRes = pullRs.getResource(pullPlatformUri,	true);
		Repository other = (Repository) otherRes.getContents().get(0);
		
		// merge changes
		mergeService.merge(repo, other);
		
		// post-processing
		IResource pullFolderIres = AI1ResourceUtil
				.platformURIToIResource(pullPlatformUri.trimSegments(1));
		try {
			pullFolderIres.delete(true, new NullProgressMonitor());
		} catch (CoreException e) {
			throw new SuperModClientWrappedException(e);
		}
		
		repo.setReadTransactionId(remoteTid);
		pullPostProcessor.postProcess(repo);
		
		if (updateEnforcementService.proposeUpdate()) {
			updateEnforcementService.enforceUpdate(repo, rs);
		}
	}

}
