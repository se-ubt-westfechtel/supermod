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
import java.util.concurrent.atomic.AtomicBoolean;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

import com.google.inject.Inject;

import de.ubt.ai1.supermod.mm.client.LocalRepository;
import de.ubt.ai1.supermod.service.IRepositoryCloneService;
import de.ubt.ai1.supermod.service.client.ILocalMetadataRemovalService;
import de.ubt.ai1.supermod.service.client.ISharePostProcessor;
import de.ubt.ai1.supermod.service.client.exceptions.SuperModClientException;
import de.ubt.ai1.supermod.service.client.exceptions.SuperModClientWrappedException;
import de.ubt.ai1.supermod.vcs.client.IRemoteShareService;
import de.ubt.ai1.supermod.vcs.client.http.IBrowseHttpRequest;
import de.ubt.ai1.supermod.vcs.client.http.IInitHttpRequest;
import de.ubt.ai1.supermod.vcs.client.http.ILockHttpRequest;
import de.ubt.ai1.supermod.vcs.client.http.ITransactionHttpRequest;
import de.ubt.ai1.supermod.vcs.client.http.exceptions.SuperModServerLockedException;
import de.ubt.ai1.util.emf.AI1ResourceSetEncoder;
import de.ubt.ai1.util.emf.AI1ResourceUtil;

/**
 * A default implementation of the remote share service interface that shows
 * a user dialog to enter connection data. Next, the connection is established
 * and the server-side repository is initialized.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	11.11.2015
 */
public class RemoteShareService implements IRemoteShareService {
	
	@Inject
	private IBrowseHttpRequest browseRequest;
	
	@Inject
	private ITransactionHttpRequest transactionRequest;
	
	@Inject
	private ILockHttpRequest lockRequest;
	
	@Inject
	private IRepositoryCloneService cloneService;
	
	@Inject
	private ILocalMetadataRemovalService unmetaService;
	
	@Inject
	private IInitHttpRequest initRequest;
	
	@Inject
	private ISharePostProcessor sharePostProcessor;

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.vcs.client.IRemoteShareService
	 * #shareWithRemote(java.lang.String,
	 * org.eclipse.emf.ecore.resource.ResourceSet)
	 */
	@Override
	public boolean shareWithRemote(LocalRepository repo, ResourceSet rs)
			throws SuperModClientException {
		AtomicBoolean ok = new AtomicBoolean();
		Display.getDefault().syncExec(new Runnable() {			
			@Override
			public void run() {
				RemoteShareDialog dia = new RemoteShareDialog(
						Display.getDefault().getActiveShell());
				if (dia.open() != Window.OK) {
					ok.set(false);
				}
				else {			
					String remoteUri = dia.getRemoteUri();
					String user = dia.getUser();
					repo.setRemoteUri(remoteUri);
					repo.setRemoteUser(user);
					ok.set(true);
				}				
			}
		});
		if (!ok.get()) {
			return false;
		}
		String remoteUri = repo.getRemoteUri();
		String user = repo.getRemoteUser();
		
		String repoContent = null;
		try {			
			ResourceSet cloneRs = new ResourceSetImpl();
			LocalRepository clone = (LocalRepository)
					cloneService.cloneRepository(repo, "init", cloneRs);
			URI cloneUri = clone.eResource().getURI();
			URI cloneFolderUri = cloneUri.trimSegments(1).appendSegment("");
			unmetaService.removeMetadata(clone);
			cloneRs.getResources().clear();
			cloneRs.getResource(cloneUri, true);
			EcoreUtil.resolveAll(cloneRs);
			
			ByteArrayOutputStream os = new ByteArrayOutputStream();
			AI1ResourceSetEncoder.encodeResourceSet(cloneFolderUri,	cloneRs, os);
			repoContent = os.toString();
			IResource cloneFolderIres = AI1ResourceUtil
					.platformURIToIResource(cloneFolderUri);
			cloneFolderIres.delete(true, new NullProgressMonitor());
		} catch (IOException | CoreException e) {
			throw new SuperModClientWrappedException(e);
		}		
	
		int readTid = 0;
		int initialWriteTid = 0;
		int newWriteTid = 0;
		try {
			if (!lockRequest.lock(remoteUri, user)) {
				throw new SuperModServerLockedException();
			}
			initialWriteTid = transactionRequest.openWriteTransaction(
					remoteUri, user);
			if (initRequest.initRepo(remoteUri, user, repo.getModuleId(), 
					repoContent)) {
				transactionRequest.closeWriteTransaction(remoteUri, user,
						initialWriteTid);
				newWriteTid = transactionRequest.openWriteTransaction(
						remoteUri, user);
				readTid = transactionRequest.getCurrentReadTransactionNr(
						remoteUri, user);				
			}
			else {
				transactionRequest.closeWriteTransaction(remoteUri, user,
						initialWriteTid);
				return false;
			}
		}		
		finally {
			if (!lockRequest.unlock(remoteUri, user)) {
				throw new SuperModServerLockedException();
			}
		}
		
		repo.setReadTransactionId(readTid);
		repo.setWriteTransactionId(newWriteTid);
		sharePostProcessor.postProcess(repo, newWriteTid);
		return true;
	}
	
	/**
	 * A simple dialog to enter remote connection data, which is verified using
	 * the browse request.
	 */
	public class RemoteShareDialog extends Dialog {
		
		private String remoteUri;
		private String user;

		/**
		 * Creates the dialog.
		 * 
		 * @param parentShell
		 */
		protected RemoteShareDialog(Shell parentShell) {
			super(parentShell);
			remoteUri = "http://localhost:8080/supermod/repo";
		}
		
		/* (non-Javadoc)
		 * @see org.eclipse.jface.dialogs.Dialog#createDialogArea
		 * (org.eclipse.swt.widgets.Composite)
		 */
		@Override
		protected Control createDialogArea(Composite parent) {
			Control control = super.createDialogArea(parent);
			
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
			uriText.setText(remoteUri);
			uriText.addModifyListener(new ModifyListener() {				
				@Override
				public void modifyText(ModifyEvent e) {
					remoteUri = uriText.getText();
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
			
			return control;
		}
		
		/* (non-Javadoc)
		 * @see org.eclipse.jface.dialogs.Dialog
		 * #createContents(org.eclipse.swt.widgets.Composite)
		 */
		@Override
		protected Control createContents(Composite parent) {
			Control c = super.createContents(parent);
			getButton(IDialogConstants.OK_ID).setEnabled(false);
			return c;
		}
		
		/* (non-Javadoc)
		 * @see org.eclipse.jface.window.Window
		 * #configureShell(org.eclipse.swt.widgets.Shell)
		 */
		@Override
		protected void configureShell(Shell newShell) {
			super.configureShell(newShell);
			newShell.setText("Specify Remote Connection Details");
		}
		
		/**
		 * @return whether a new remote repository can be established using
		 * the specified connection data
		 */
		public boolean validateConnectionData() {
			boolean valid;
			try {
				valid = browseRequest.canCreateRepo(remoteUri, user);
			} catch (SuperModClientException e) {
				valid = false;
			}
			getButton(IDialogConstants.OK_ID).setEnabled(valid);
			return valid;	
		}

		/**
		 * @return the remoteUri
		 */
		public String getRemoteUri() {
			return remoteUri;
		}
		
		/**
		 * @return the user
		 */
		public String getUser() {
			return user;
		}
		
	}

}
