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

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

import com.google.inject.Inject;

import de.ubt.ai1.supermod.mm.client.LocalRepository;
import de.ubt.ai1.supermod.mm.core.Repository;
import de.ubt.ai1.supermod.service.client.IClonePostProcessor;
import de.ubt.ai1.supermod.service.client.ILocalAmbitionInitializationService;
import de.ubt.ai1.supermod.service.client.ILocalChoiceInitializationService;
import de.ubt.ai1.supermod.service.client.ILocalMetadataAdditionService;
import de.ubt.ai1.supermod.service.client.IMetadataResourceHandler;
import de.ubt.ai1.supermod.service.client.ISingleVersionProductSpaceDescriptorInitializationService;
import de.ubt.ai1.supermod.service.client.exceptions.SuperModClientException;
import de.ubt.ai1.supermod.service.client.exceptions.SuperModClientWrappedException;
import de.ubt.ai1.supermod.service.exceptions.SuperModException;
import de.ubt.ai1.supermod.vcs.client.ICloneService;
import de.ubt.ai1.supermod.vcs.client.ISwitchService;
import de.ubt.ai1.supermod.vcs.client.http.IBrowseHttpRequest;
import de.ubt.ai1.supermod.vcs.client.http.ICloneHttpRequest;
import de.ubt.ai1.supermod.vcs.client.http.ILockHttpRequest;
import de.ubt.ai1.supermod.vcs.client.http.ITransactionHttpRequest;
import de.ubt.ai1.supermod.vcs.client.http.exceptions.SuperModServerLockedException;
import de.ubt.ai1.util.emf.AI1ResourceSetEncoder;

/**
 * Client service interface for the VCS operation "Clone", which creates a
 * new SuperMod project containing a local copy of the remote repository.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	10.11.2015
 */
public class CloneService implements ICloneService {
	
	@Inject
	private IBrowseHttpRequest browseRequest;
	
	@Inject
	private ILockHttpRequest lockRequest;
	
	@Inject
	private ICloneHttpRequest cloneRequest;
	
	@Inject
	private ILocalMetadataAdditionService localRepoConverter;
	
	@Inject
	private IMetadataResourceHandler metadataHandler;
	
	@Inject
	private ILocalChoiceInitializationService choiceInitService;
	
	@Inject
	private ILocalAmbitionInitializationService ambInitService;
	
	@Inject
	private ISingleVersionProductSpaceDescriptorInitializationService
	descInitService;
	
	@Inject
	private IClonePostProcessor clonePostProcessor;
	
	@Inject
	private ITransactionHttpRequest transactionRequest;
	
	@Inject
	private ISwitchService switchService;

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.vcs.client.ICloneService
	 * #canClone(java.lang.String, java.lang.String)
	 */
	@Override
	public boolean canClone(String repoUri, String user) {
		try {
			return browseRequest.existsRepo(repoUri, user);
		} catch (SuperModClientException e) {
			return false;
		}
	}

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.vcs.client.ICloneService
	 * #doClone(java.lang.String, java.lang.String,
	 * org.eclipse.emf.ecore.resource.ResourceSet)
	 */
	@Override
	public LocalRepository doClone(String repoUri, String user, ResourceSet rs,
			String projectName, IProgressMonitor monitor)
					throws SuperModException {
		
		// fetch clone data
		String repoXmi = null;
		int readTid = 0;
		int newWriteTid = 0;
		try {
			if (!lockRequest.lock(repoUri, user)) {
				throw new SuperModServerLockedException();
			}
			readTid = transactionRequest
					.getCurrentReadTransactionNr(repoUri, user);
			repoXmi = cloneRequest.cloneRepo(repoUri, user);
			newWriteTid = transactionRequest
					.openWriteTransaction(repoUri, user);
		}
		finally {
			if (!lockRequest.unlock(repoUri, user)) {
				throw new SuperModServerLockedException();
			}
		}
		ByteArrayInputStream is = new ByteArrayInputStream(
				repoXmi.getBytes());

		try {
			IProject project = ResourcesPlugin.getWorkspace().getRoot()
					.getProject(projectName);
			if (!project.exists()) {
				monitor.subTask("Creating Project");
				project.create(monitor);
				project.open(monitor);
				monitor.worked(1);
			}
			AI1ResourceSetEncoder.decodeResourceSet(
					URI.createFileURI(ResourcesPlugin.getWorkspace().getRoot()
							.getLocation().toPortableString() + "/" +
							projectName + "/.supermod/main/"), rs, is);
		} catch (IOException | CoreException e) {
			throw new SuperModClientWrappedException(e);
		}
		
		// create local repository
		Resource cloneRepoRes = rs.getResource(URI.createPlatformResourceURI(
				projectName + "/.supermod/main/main.rep", true), true);
		Repository cloneRepo = (Repository) cloneRepoRes.getContents().get(0);
		LocalRepository repo = localRepoConverter
				.convertRepositoryToLocalRepository(cloneRepo);		
		repo.setRemoteUser(user);
		repo.setRemoteUri(repoUri);
		
		// initialize meta-data
		String localRepoUri = metadataHandler.createRepositoryUri(projectName);	
		repo.setLocalChoice(choiceInitService.initializeLocalChoice(
				repo.getVersionSpace(), rs, localRepoUri));
		repo.setLocalAmbition(ambInitService.initializeLocalAmbition(
				repo.getVersionSpace(), rs, localRepoUri));
		repo.setLocalDescriptor(descInitService
				.initializeSingleVersionProductSpaceDescriptor(
						"/" + projectName, rs, true));
		
		// post-processing
		clonePostProcessor.postProcess(repo, newWriteTid);
		repo.setReadTransactionId(readTid);
		repo.setWriteTransactionId(newWriteTid);
		
		// enforce a check-out
		if (switchService.canSwitch(repo)) {
			switchService.doSwitch(repo, rs);
		}
		
		return repo;
	}

}
