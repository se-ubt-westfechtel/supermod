/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/

package de.ubt.ai1.supermod.vcs.client.team.handlers;

import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.team.core.RepositoryProvider;

import de.ubt.ai1.supermod.vcs.client.team.SuperModRepositoryProvider;

/**
 * UI action which disconnects a given Eclipse project from SuperMod version
 * control by deleting its meta-data directory.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	04.08.2014
 */
public class DisconnectHandler extends SuperModCommandHandler {	
	
	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.vcs.client.team.handlers.SuperModCommandHandler
	 * #canRun(java.util.List)
	 */
	@Override
	protected boolean canRun(List<?> selection) {
		for (IProject p : findRelevantProjects(selection)) {
			if (RepositoryProvider.getProvider(p) instanceof
					SuperModRepositoryProvider) {
				return true;
			}
		}
		return false;
	}
	
	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.vcs.team.actions.SuperModAction#run(
	 * java.util.List)
	 */
	@Override
	protected void run(List<?> selection) {
		for (IProject p : findRelevantProjects(selection)) {
			try {
				AtomicBoolean confirm = new AtomicBoolean();
				Display.getDefault().syncExec(new Runnable() {					
					@Override
					public void run() {
						confirm.set(MessageDialog.openConfirm(
								Display.getDefault().getActiveShell(),
								"Confirm Disconnect",
								"Do you really want to disconnect project '" +
								p.getName() + "' from SuperMod version control? "
								+ "Choosing 'OK' results in the deletion of "
								+ "the local copy of the repository. "
								+ "No product variants but the current " +
								"workspace selection will be available."));
					}
				});				
				if (confirm.get()) {
				RepositoryProvider.unmap(p);
					p.findMember(".supermod").delete(true, 
							new NullProgressMonitor());
				}
			} catch (CoreException e) {
				handle(e);
			}
		}
		refresh();
	}

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.vcs.client.team.handlers.SuperModCommandHandler
	 * #getTaskDescription()
	 */
	@Override
	protected String getTaskDescription() {
		return "Disconnecting from SuperMod";
	}

}
