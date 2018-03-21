/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.vcs.client.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.dialogs.ListSelectionDialog;
import org.eclipse.ui.model.WorkbenchLabelProvider;

import com.google.inject.Inject;

import de.ubt.ai1.supermod.mm.client.LocalRepository;
import de.ubt.ai1.supermod.mm.file.client.SingleVersionFileSystemDescriptor;
import de.ubt.ai1.supermod.service.client.exceptions.SuperModClientException;
import de.ubt.ai1.supermod.service.client.exceptions.SuperModClientWrappedException;
import de.ubt.ai1.supermod.service.file.client.FileUtil;
import de.ubt.ai1.supermod.service.file.client.ISingleVersionFileSystemDescriptorProvider;
import de.ubt.ai1.supermod.vcs.client.IAddProposalService;
import de.ubt.ai1.supermod.vcs.client.IAddService;
import de.ubt.ai1.supermod.vcs.client.IRemoveService;
import de.ubt.ai1.supermod.vcs.client.IStateService;
import de.ubt.ai1.supermod.vcs.client.IStateService.State;

/**
 * Default implementation for the "Propose Add" VCS operation. Scans the local
 * workspace for unversioned resources. In case there are any, a dialog is
 * opened where the user can select the resources to be added to version 
 * control. adding is realized by an injected {@link IAddService}. All
 * unselected resources will be removed by a {@link IRemoveService}.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	01.08.2014
 */
public class AddProposalService implements IAddProposalService {
	
	@Inject
	private ISingleVersionFileSystemDescriptorProvider svsProvider;
	
	@Inject
	private IStateService stateService;
	
	@Inject
	private IAddService addService;
	
	@Inject
	private IRemoveService removeService;
	
	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.vcs.IAddProposalService#propose(
	 * de.ubt.ai1.supermod.mm.client.LocalRepository)
	 */
	@Override
	public boolean propose(LocalRepository repo) throws SuperModClientException {
		SingleVersionFileSystemDescriptor fsDescriptor = 
				svsProvider.getSingleVersionFileSystemDescriptor(
						repo.getLocalDescriptor());
		List<IResource> unknownResources = new ArrayList<>();
		IContainer root = (IContainer) ResourcesPlugin.getWorkspace()
				.getRoot().findMember(fsDescriptor.getRootUri());
		try {
			for (IResource res : FileUtil.allMembers(root, true, false, true)) {
				State resState = stateService.getState(repo, 
						res.getFullPath().toPortableString());
				if (resState == State.UNKNOWN) {
					unknownResources.add(res);
				}
			}
		} catch (CoreException e) {
			throw new SuperModClientWrappedException(e);
		}
		if (!unknownResources.isEmpty()) {
			AtomicReference<List<?>> added = new AtomicReference<>();
			Display.getDefault().syncExec(new Runnable() {				
				@Override
				public void run() {
					ListSelectionDialog listDialog = new ListSelectionDialog(
							Display.getDefault().getActiveShell(), 
							unknownResources.toArray(),
							new ArrayContentProvider(), new WorkbenchLabelProvider(),
							"Selected Resources will be added to Version Control.");
					listDialog.setTitle("Select Resources to Add");
					int result = listDialog.open();
					if (result == Dialog.OK) {
						added.set(Arrays.asList(listDialog.getResult()));
					}
					else {
						added.set(null);
					}
				}
			});
			if (added.get() != null) {			
				for (Object o : added.get()) {
					if (o instanceof IResource) {
						addService.add(repo, ((IResource) o).getFullPath()
								.toPortableString());
					}
				}
				for (IResource unknownRes : unknownResources) {
					if (!added.get().contains(unknownRes)) {
						removeService.remove(repo, unknownRes
								.getFullPath().toPortableString());
					}
				}
				return true;
			}
		}
		return false;
	}

}
