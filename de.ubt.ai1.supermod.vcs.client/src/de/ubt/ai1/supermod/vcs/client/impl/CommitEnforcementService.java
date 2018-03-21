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
import de.ubt.ai1.supermod.mm.file.client.SingleVersionFileSystemDescriptor;
import de.ubt.ai1.supermod.service.client.exceptions.SuperModClientException;
import de.ubt.ai1.supermod.service.exceptions.SuperModException;
import de.ubt.ai1.supermod.service.file.client.ISingleVersionFileSystemDescriptorProvider;
import de.ubt.ai1.supermod.vcs.client.ICommitEnforcementService;
import de.ubt.ai1.supermod.vcs.client.ICommitService;
import de.ubt.ai1.supermod.vcs.client.IStateService;
import de.ubt.ai1.supermod.vcs.client.IStateService.State;

/**
 * Default implementation of the "Enforce Commit" VCS operation.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	01.08.2014
 */
public class CommitEnforcementService implements ICommitEnforcementService {
	
	@Inject
	private IStateService stateService;
	
	@Inject
	private ICommitService commitService;
	
	@Inject
	private ISingleVersionFileSystemDescriptorProvider svsProvider;

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.vcs.ICommitEnforcementService
	 * #isCommitNecessary(de.ubt.ai1.supermod.mm.client.LocalRepository)
	 */
	@Override
	public boolean isCommitNecessary(LocalRepository repo) 
			throws SuperModClientException {
		SingleVersionFileSystemDescriptor svs = svsProvider
				.getSingleVersionFileSystemDescriptor(
						repo.getLocalDescriptor());
		State state = stateService.getState(repo, svs.getRootUri());
		return state == State.CHANGED || state == State.CONFLICTING;		
	}

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.vcs.ICommitEnforcementService#proposeCommit()
	 */
	@Override
	public boolean proposeCommit() {
		AtomicBoolean result = new AtomicBoolean();
		Display.getDefault().syncExec(new Runnable() {			
			@Override
			public void run() {
				result.set(MessageDialog.openQuestion(
						Display.getDefault().getActiveShell(),
						"Uncommitted Changes",
						"You need to commit your changes first, otherwise they will "
						+ "get lost. Perform a commit automatically?."));				
			}
		});
		return result.get();
	}

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.vcs.ICommitEnforcementService#enforceCommit(
	 * de.ubt.ai1.supermod.mm.client.LocalRepository, 
	 * org.eclipse.emf.ecore.resource.ResourceSet)
	 */
	@Override
	public void enforceCommit(LocalRepository repo, ResourceSet rs) 
			throws SuperModException {
		commitService.commit(repo, rs);		
	}

}
