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
import de.ubt.ai1.supermod.vcs.client.IUpdateEnforcementService;
import de.ubt.ai1.supermod.vcs.client.IUpdateService;

/**
 * Default implementation of the "Enforce Commit" VCS operation.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	04.08.2014
 */
public class UpdateEnforcementService implements IUpdateEnforcementService {
	
	@Inject
	private IUpdateService updateService;

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.vcs.IUpdateEnforcementService#proposeUpdate()
	 */
	@Override
	public boolean proposeUpdate() throws SuperModClientException {
		AtomicBoolean result = new AtomicBoolean();
		Display.getDefault().syncExec(new Runnable() {			
			@Override
			public void run() {
				result.set(MessageDialog.openQuestion(
						Display.getDefault().getActiveShell(),
						"Update remote changes?",
						"Do you want to perform an update automatically, "
						+ "in order to fetch the pulled changes to your "
						+ "local workspace? All pending changes will get lost."));				
			}
		});
		return result.get();
	}

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.vcs.IUpdateEnforcementService#enforceUpdate(
	 * de.ubt.ai1.supermod.mm.client.LocalRepository,
	 *  org.eclipse.emf.ecore.resource.ResourceSet)
	 */
	@Override
	public void enforceUpdate(LocalRepository repo, ResourceSet rs) 
			throws SuperModException {
		updateService.update(repo, rs);
	}

}
