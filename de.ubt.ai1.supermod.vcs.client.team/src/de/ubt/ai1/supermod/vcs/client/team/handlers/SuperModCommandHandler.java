/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/

package de.ubt.ai1.supermod.vcs.client.team.handlers;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.ui.progress.IProgressService;

import de.ubt.ai1.supermod.mm.client.LocalRepository;
import de.ubt.ai1.supermod.service.client.IMetadataResourceHandler;
import de.ubt.ai1.supermod.service.client.exceptions.SuperModClientException;
import de.ubt.ai1.supermod.service.module.client.SuperModClientServiceProvider;
import de.ubt.ai1.supermod.vcs.client.team.SuperModResourceLabelDecorator;

/**
 * Base class for all SuperMod UI actions. All actions are project-specific.
 * Subclasses may implement a specific action by the operation {@link
 * #run(List)}. In order to find relevant SuperMod projects, the operation
 * {@link #findRelevantProjects(List)} may be called using the specified 
 * argument.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	04.08.2014
 */
public abstract class SuperModCommandHandler extends AbstractHandler {
	
	/**
	 * To be implemented in order to determine the activation state
	 *
	 * @param selection
	 * @return whether {@link run} can be safely executed based on
	 * 			this selection
	 */
	protected abstract boolean canRun(List<?> selection);
	
	/**
	 * To be implemented by clients in order to implement the corresponding
	 * UI action.
	 *
	 * @param selection
	 */
	protected abstract void run(List<?> selection);
		
	/**
	 * @return a human readable description of the task to run
	 */
	protected abstract String getTaskDescription();
	
	
	/* (non-Javadoc)
	 * @see org.eclipse.core.commands.IHandler
	 * #execute(org.eclipse.core.commands.ExecutionEvent)
	 */
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		ISelection selection = HandlerUtil.getCurrentSelection(event);
		if (selection instanceof IStructuredSelection) {
			List<?> objects = (((IStructuredSelection) selection).toList());
			Display.getDefault().syncExec(new Runnable() {				
				@Override
				public void run() {
					try {
						getProgressService().busyCursorWhile(new IRunnableWithProgress() {				
							@Override
							public void run(IProgressMonitor monitor) throws
									InvocationTargetException, InterruptedException {
								try {
									monitor.beginTask(getTaskDescription(),
											IProgressMonitor.UNKNOWN);
									SuperModCommandHandler.this.run(objects);
								}
								finally {
									monitor.done();
								}
							}
						});
					} catch (InvocationTargetException | InterruptedException e) {
						handle(e);
					}					
				}
			});
		}
		try {
			ResourcesPlugin.getWorkspace().getRoot().refreshLocal(
					IResource.DEPTH_INFINITE, new NullProgressMonitor());
		} catch (CoreException e) {
			e.printStackTrace();
		}
		PlatformUI.getWorkbench().getDecoratorManager().update(
				SuperModResourceLabelDecorator.DECORATOR_ID);
		return null;
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.core.commands.AbstractHandler#isEnabled()
	 */
	@Override
	public boolean isEnabled() {
		return canRun(getActiveSelection());
	}
	
	/**
	 * @return the active workbench selection
	 */
	protected List<?> getActiveSelection() {
		ISelection sel = PlatformUI.getWorkbench().getActiveWorkbenchWindow()
				.getSelectionService().getSelection();
		if (sel instanceof IStructuredSelection) {
			return ((IStructuredSelection) sel).toList();
		}
		return null;
	}

	/**
	 * Converts the given selection to a set of Eclipse projects which contain
	 * the selected elements.
	 *
	 * @param selection
	 * @return
	 */
	protected List<IProject> findRelevantProjects(List<?> selection) {
		List<IProject> projects = new ArrayList<>();
		for (Object o : selection) {
			if (o instanceof IResource) {
				IProject p = ((IResource) o).getProject();
				if (!projects.contains(p)) {
					projects.add(p);
				}
			}
			else if (o instanceof IAdaptable) {
				Object adapter = ((IAdaptable) o).getAdapter(IResource.class);
				if (adapter instanceof IResource) {
					IResource resource = (IResource) adapter;
					IProject p = resource.getProject();
					if (!projects.contains(p)) {
						projects.add(p);
					}
				}
			}
		}
		return projects;
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
		Display.getDefault().asyncExec(new Runnable() {			
			@Override
			public void run() {
				ErrorDialog.openError(null, "Internal SuperModError", 
						"An internal error has occurred. "
						+ "Please report the following stacktrace:", ms);				
			}
		});		
	}
	
	/**
	 * Represents a given list of strings as a line-separated single string.
	 *
	 * @param strings
	 * @return
	 */
	protected String linewise(List<String> strings) {
		StringBuilder sb = new StringBuilder();
		for (String s : strings) {
			sb.append(s);
			sb.append("\n");
		}
		return sb.toString();
	}
	
	/**
	 * Clients may use this function to retrieve a unified monitor.
	 *
	 * @return
	 */
	protected IProgressService getProgressService() {
		return PlatformUI.getWorkbench().getProgressService();
	}
	
	/**
	 * Clients may use this function in order to refresh workspace contents.
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
	 * Clients may use this function to display a warning dialog in the UI
	 * thread.
	 *
	 * @param title
	 * @param message
	 */
	protected void warn(String title, String message) {
		Display.getDefault().asyncExec(new Runnable() {			
			@Override
			public void run() {
				MessageDialog.openWarning(
						Display.getDefault().getActiveShell(), title, message);
			}
		});
	}
	
	/**
	 * Clients may use this function to use the module specific Guice injector
	 * to obtain an implementation of a specified service interface.
	 *
	 * @param res
	 * @param rs
	 * @param service the interface
	 * @return the service implementation, or <code>null</code> if no binding
	 * @throws SuperModClientException
	 */
	protected <S> S getServiceForResource(IResource res, ResourceSet rs, 
			Class<S> service) throws SuperModClientException {
		IMetadataResourceHandler metadataHandler = 
				SuperModClientServiceProvider.getInstance()
					.getDefaultService(IMetadataResourceHandler.class);
		LocalRepository lr = metadataHandler.getRepository(
				res.getFullPath().toPortableString(), rs);
		if (lr != null && lr.getModuleId() != null) {
			String moduleId = lr.getModuleId();
			return SuperModClientServiceProvider.getInstance()
					.getService(moduleId, service);
		}
		return null;
	}
	
	/**
	 * Clients may use this function in order to save all resources which lie
	 * in a specified resource set.
	 *
	 * @param rs
	 */
	protected void saveAllResources(ResourceSet rs) {
		for (Resource r : rs.getResources()) {
			try {
				r.save(null);
			} catch (IOException e) {
				handle(e);
			}
		}		
		rs.getResources().clear();
	}

	/**
	 * Clients may use this function in order to create a resource set with
	 * suitable preferences.
	 *
	 * @return
	 */
	protected ResourceSet createResourceSet() {
		ResourceSet rs = new ResourceSetImpl();
		return rs;
	}	
	
	/**
	 * Tries to cast or adapt the specified object as an instance of IResource.
	 *
	 * @param o
	 * @return the adapted/casted resource, or null if adapt/cast unsuccessful
	 */
	protected IResource adaptResource(Object o) {
		if (o instanceof IResource) {
			return (IResource) o;
		}
		else if (o instanceof IAdaptable) {
			Object adapter = ((IAdaptable) o).getAdapter(IResource.class);
			if (adapter instanceof IResource) {
				return (IResource) adapter;
			}
		}
		return null;
	}
	
}
