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
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.team.core.RepositoryProvider;
import org.eclipse.team.core.TeamException;
import org.eclipse.ui.IImportWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PlatformUI;

import de.ubt.ai1.supermod.mm.client.LocalRepository;
import de.ubt.ai1.supermod.service.client.exceptions.SuperModClientException;
import de.ubt.ai1.supermod.service.exceptions.SuperModException;
import de.ubt.ai1.supermod.service.module.client.SuperModClientServiceProvider;
import de.ubt.ai1.supermod.vcs.client.ICloneService;
import de.ubt.ai1.supermod.vcs.client.http.IBrowseHttpRequest;
import de.ubt.ai1.supermod.vcs.client.http.IModuleIdHttpRequest;
import de.ubt.ai1.util.emf.AI1ResourceUtil;

/**
 * This import allows to establish a connection to a remote SuperMod server,
 * setting its URI, port and user connection data. In case the specified
 * data is valid, the SuperMod clone operation is invoked.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	10.11.2015
 */
public class SuperModCloneImportWizard 
extends Wizard implements IImportWizard {
	
	protected SuperModCloneImportWizardPage page;

	/* (non-Javadoc)
	 * @see org.eclipse.ui.IWorkbenchWizard#init(org.eclipse.ui.IWorkbench,
	 * org.eclipse.jface.viewers.IStructuredSelection)
	 */
	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {	
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.jface.wizard.Wizard#addPages()
	 */
	@Override
	public void addPages() {
		super.addPages();
		page = new SuperModCloneImportWizardPage();
		addPage(page);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.wizard.Wizard#performFinish()
	 */
	@Override
	public boolean performFinish() {
		
		String repoUri = page.getUri();
		String user = page.getUser();
		String projectName = page.getProjectName();
		
		AtomicBoolean success = new AtomicBoolean(false);
		try {
			PlatformUI.getWorkbench().getProgressService().busyCursorWhile(
					new IRunnableWithProgress() {				
				@Override
				public void run(IProgressMonitor monitor) 
						throws InvocationTargetException, InterruptedException {
					monitor.beginTask("Cloning repository from server",
							IProgressMonitor.UNKNOWN);
					IModuleIdHttpRequest moduleIdRequest = SuperModClientServiceProvider
							.getInstance().getDefaultService(IModuleIdHttpRequest.class);
					String moduleId = null;
					try {
						moduleId = moduleIdRequest.getModuleId(repoUri, user);
					} catch (SuperModClientException e) {
						handle(e);
						monitor.done();
					}
					ICloneService cloneService = SuperModClientServiceProvider
							.getInstance().getService(moduleId, ICloneService.class);
					if (cloneService.canClone(repoUri, user)) {
						ResourceSet rs = new ResourceSetImpl();
						LocalRepository repo = null;
						try {
							repo = cloneService.doClone(repoUri, user, rs,
									projectName, monitor);
						} catch (SuperModException e) {
							handle(e);
							monitor.done();
						}
						IProject project = AI1ResourceUtil
								.eResourceToIResource(repo.eResource()).getProject();
						try {
							RepositoryProvider.map(project, 
									SuperModRepositoryProvider.PROVIDER_ID);
						} catch (TeamException e) {
							handle(e);
							monitor.done();
						}
						try {
							project.findMember(".supermod").setTeamPrivateMember(true);
						} catch (CoreException e) {
							e.printStackTrace();
						}
						saveAllResources(rs);
						success.set(true);
						monitor.done();
					}					
				}
			});
		} catch (InvocationTargetException | InterruptedException e) {
			handle(e);
		}
		return success.get();
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
	 * A wizard page to enter and validate remote connection data.
	 */
	public class SuperModCloneImportWizardPage extends WizardPage {
		
		private String uri;
		private String user;
		private String projectName;

		/**
		 * Creates the wizard page.
		 */
		protected SuperModCloneImportWizardPage() {
			super("Clone SuperMod Project from Remote Repository");
			setTitle("Clone SuperMod Project from Remote Repository");
			setDescription("Specify Connection Details.");
			setPageComplete(false);
			uri = "http://localhost:8080/supermod/repo";
		}

		/* (non-Javadoc)
		 * @see org.eclipse.jface.dialogs.IDialogPage
		 * #createControl(org.eclipse.swt.widgets.Composite)
		 */
		@Override
		public void createControl(Composite parent) {
			Composite comp = new Composite(parent, SWT.NONE);
			comp.setLayout(new GridLayout(2, false));
			
			Label uriLabel = new Label(comp, SWT.NONE);
			uriLabel.setText("Repository URI:");
			
			Text uriText = new Text(comp, SWT.BORDER);
			{
				GridData gridData = new GridData();
				gridData.widthHint = 300;
				uriText.setLayoutData(gridData);
			}
			uriText.setText(uri);
			uriText.addModifyListener(new ModifyListener() {				
				@Override
				public void modifyText(ModifyEvent e) {
					uri = uriText.getText();
				}
			});
			
			Label userLabel = new Label(comp, SWT.NONE);
			userLabel.setText("User:");
			
			Text userText = new Text(comp, SWT.BORDER);
			{
				GridData gridData = new GridData();
				gridData.widthHint = 200;
				userText.setLayoutData(gridData);
			}	
			userText.addModifyListener(new ModifyListener() {				
				@Override
				public void modifyText(ModifyEvent e) {
					user = userText.getText();
				}
			});	
			
			Label projectLabel = new Label(comp, SWT.NONE);
			projectLabel.setText("Project Name:");
			
			Text projectText = new Text(comp, SWT.BORDER);
			{
				GridData gridData = new GridData();
				gridData.widthHint = 200;
				projectText.setLayoutData(gridData);
			}	
			projectText.addModifyListener(new ModifyListener() {				
				@Override
				public void modifyText(ModifyEvent e) {
					projectName = projectText.getText();
				}
			});	
			
			Button validateButton = new Button(comp, SWT.PUSH);
			validateButton.setText("Validate Connection");
			validateButton.addSelectionListener(new SelectionListener() {				
				@Override
				public void widgetSelected(SelectionEvent e) {
					validateConnectionData();			
				}				
				@Override
				public void widgetDefaultSelected(SelectionEvent e) {
					validateConnectionData();			
				}
			});
			
			setControl(comp);
		}
		
		/**
		 * @return the uri
		 */
		public String getUri() {
			return uri;
		}
		
		/**
		 * @return the user
		 */
		public String getUser() {
			return user;
		}

		/**
		 * @return the projectName
		 */
		public String getProjectName() {
			return projectName;
		}
		
		/**
		 * @return whether a connection to the specified remote repository
		 * can be established
		 */
		public boolean validateConnectionData() {
			if (ResourcesPlugin.getWorkspace().getRoot()
					.getProject(projectName).exists()) {
				return false;
			}
			IBrowseHttpRequest browseRequest = SuperModClientServiceProvider
					.getInstance().getDefaultService(IBrowseHttpRequest.class);
			boolean valid = false;
			try {
				valid = browseRequest.existsRepo(uri, user);
			} catch (SuperModClientException e) {
				handle(e);
			}
			setPageComplete(valid);
			return valid;
		}
		
	}

}
