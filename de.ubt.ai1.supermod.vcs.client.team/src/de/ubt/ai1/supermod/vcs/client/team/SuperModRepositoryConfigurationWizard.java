/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/

package de.ubt.ai1.supermod.vcs.client.team;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.swt.widgets.Display;
import org.eclipse.team.core.RepositoryProvider;
import org.eclipse.team.core.TeamException;
import org.eclipse.team.ui.IConfigurationWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PlatformUI;

import de.ubt.ai1.supermod.mm.client.LocalRepository;
import de.ubt.ai1.supermod.service.client.exceptions.SuperModClientException;
import de.ubt.ai1.supermod.service.module.client.ISuperModClientModuleInjectorProvider;
import de.ubt.ai1.supermod.service.module.client.SuperModClientServiceProvider;
import de.ubt.ai1.supermod.vcs.client.IRemoteShareService;
import de.ubt.ai1.supermod.vcs.client.IShareService;

/**
 * Configuration wizard for SuperMod projects. It invokes the VCS operation
 * "Share" in case the project is currently non-versioned, and maps the
 * repository provider accordingly.
 * 
 * @see IShareService
 * @see SuperModRepositoryProvider
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	04.08.2014
 */
public class SuperModRepositoryConfigurationWizard 
extends Wizard implements IConfigurationWizard {
	
	protected IProject project;
	
	@Override
	public void init(IWorkbench workbench, IProject project) {	
		this.project = project;
	}

	@Override
	public boolean performFinish() {
		AtomicBoolean success = new AtomicBoolean(false);
		Display.getDefault().syncExec(new Runnable() {				
			@Override
			public void run() {
				try {
					PlatformUI.getWorkbench().getProgressService().busyCursorWhile(
							new IRunnableWithProgress() {		
								@Override
								public void run(IProgressMonitor monitor) 
										throws InvocationTargetException, InterruptedException {
		// ---
		monitor.beginTask("Sharing repository", IProgressMonitor.UNKNOWN);
		ResourceSet rs = new ResourceSetImpl();
		String moduleId = selectModuleId();
		if (moduleId == null) {
			monitor.done();
			return;
		}
		String rootUri = project.getFullPath().toPortableString();
		ISuperModClientModuleInjectorProvider module = 
				SuperModClientServiceProvider.getInstance()
				.getModule(moduleId);			
		IShareService shareService = module.getModuleInjector()
				.getInstance(IShareService.class);
		if (shareService.canShare(rootUri, rs)) {
			LocalRepository repo;
			try {
				repo = shareService.share(rootUri, rs, monitor);
			} catch (SuperModClientException e) {
				handle(e);
				monitor.done();
				return;
			}
			try {
				RepositoryProvider.map(project, 
						SuperModRepositoryProvider.PROVIDER_ID);
			} catch (TeamException e) {
				handle(e);
				monitor.done();
				return;
			}
			try {
				project.findMember(".supermod").setTeamPrivateMember(true);
			} catch (CoreException e1) {
				e1.printStackTrace();
			}
			if (module.isRemote()) {
				IRemoteShareService remoteShareService = 
						module.getModuleInjector()
						.getInstance(IRemoteShareService.class);
				try {
					if (!remoteShareService.shareWithRemote(repo, rs)) {
						monitor.done();
						return;
					}
				} catch (SuperModClientException e) {
					handle(e);
					monitor.done();
					return;
				}
			}
			saveAllResources(rs);
			success.set(true);
			monitor.done();
			refresh();
		}
		else {
			monitor.done();
		}
		// ---
		
					}});
				} catch (InvocationTargetException | InterruptedException e) {
					handle(e);
				}
			}});
		return success.get();
	}

	/**
	 * Performs a user selection of one of the SuperMod module configurations
	 * registered in the current Eclipse plug-in configuration.
	 *
	 * @return the id of the chosen injector provider module, from which an
	 * 			instance of {@link ISuperModClientModuleInjectorProvider} may be
	 * 			retrieved.
	 */
	private String selectModuleId() {
		Collection<ISuperModClientModuleInjectorProvider> modules =
				SuperModClientServiceProvider.getInstance().getAvailableModules();
		if (modules.size() == 1) {
			return modules.iterator().next().getModuleId();
		}
		else if (modules.size() > 1) {
			AtomicReference<String> moduleId = new AtomicReference<>();
			Display.getDefault().syncExec(new Runnable() {				
				@Override
				public void run() {
					SuperModModuleSelectionDialog dia = new SuperModModuleSelectionDialog(
							Display.getDefault().getActiveShell(), modules);
					dia.setTitle("SuperMod Configuration");
					dia.setMessage("Please select one of the following SuperMod "
							+ "module configurations for the new repository:");
					int returnCode = dia.open();
					if (returnCode == Dialog.OK) {
						moduleId.set(dia.getSelectedModule().getModuleId());
					}					
				}
			});
			return moduleId.get();
		}
		return null;
	}

	/**
	 * Saves all resources contained in the specified resource set.
	 *
	 * @param rs
	 */
	private void saveAllResources(ResourceSet rs) {
		for (Resource r : rs.getResources()) {
			try {
				r.save(null);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}	
	}
	
	/**
	 * Refreshes workspace contents.
	 *
	 * @throws CoreException
	 */
	protected void refresh() {
		try {
			ResourcesPlugin.getWorkspace().getRoot().refreshLocal(
					IResource.DEPTH_INFINITE, new NullProgressMonitor());
		} catch (CoreException e) {
			e.printStackTrace();
		}				
	}
	
	/**
	 * Clients may use this function in order to unify error handling.
	 *
	 * @param e
	 */
	protected void handle(Exception e) {
		e.printStackTrace();
		
		StringWriter sw = new StringWriter();
		PrintWriter pw = new PrintWriter(sw);
		e.printStackTrace(pw);
		final String trace = sw.toString();
		List<Status> childStatuses = new ArrayList<>();
		for (String line : trace.split(System.getProperty("line.separator"))) {
			childStatuses.add(new Status(IStatus.ERROR, 
					"de.ubt.ai1.supermod.vcs.team", line));
		}
		MultiStatus ms = new MultiStatus("de.ubt.ai1.supermod.vcs.team", 
				IStatus.ERROR,childStatuses.toArray(new Status[] {}),
				e.getLocalizedMessage(), e);
		Display.getDefault().syncExec(new Runnable() {				
			@Override
			public void run() {
				ErrorDialog.openError(null, "Internal SuperModError", 
						"An internal error has occurred. "
						+ "Please report the following stacktrace:", ms);
			}
		});
	}

}
