/******************************************************************************
 * Copyright (c) 2018 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.service.textfile.client.impl;


import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;

import com.google.inject.Inject;

import de.ubt.ai1.supermod.mm.core.ProductSpaceElement;
import de.ubt.ai1.supermod.mm.file.VersionedFileContent;
import de.ubt.ai1.supermod.mm.file.client.SingleVersionFileDescriptor;
import de.ubt.ai1.supermod.mm.file.client.SingleVersionFileSystemDescriptor;
import de.ubt.ai1.supermod.mm.textfile.TextFileContent;
import de.ubt.ai1.supermod.mm.textfile.TextLine;
import de.ubt.ai1.supermod.service.client.IDefaultResolver;
import de.ubt.ai1.supermod.service.client.exceptions.SuperModClientException;
import de.ubt.ai1.supermod.service.client.exceptions.SuperModClientWrappedException;
import de.ubt.ai1.supermod.service.file.client.IVersionedFileContentExportService;
import de.ubt.ai1.supermod.service.list.client.ListExportUtil;
import de.ubt.ai1.supermod.textfile.client.SuperModTextfileClientFactory;
import de.ubt.ai1.supermod.textfile.client.TextFileExportTrace;
import de.ubt.ai1.supermod.textfile.client.TextLineExportTrace;

/**
 * An implementation of the versioned file content export service specific to
 * the file content type 'plain text'. It linearizes the line order represented
 * by the file content and exports it into a plain text workspace file line by
 * line.
 * 
 * @author	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>,
 * 			Johannes Schroepfer <Johannes.M.Schroepfer(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	2018-01-28
 */
public class TextFileContentExportService implements
		IVersionedFileContentExportService {

	@Inject
	private IDefaultResolver defaultResolver;
	
	protected IContainer container;
	protected SingleVersionFileSystemDescriptor fsDescriptor;

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.ubt.ai1.supermod.service.file.client.
	 * IVersionedFileContentExportService#start()
	 */
	@Override
	public void start(SingleVersionFileSystemDescriptor fsDescriptor) {
		this.fsDescriptor = fsDescriptor;
		this.container = (IContainer) ResourcesPlugin.getWorkspace().getRoot()
				.findMember(fsDescriptor.getRootUri());
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.ubt.ai1.supermod.service.file.client.
	 * IVersionedFileContentExportService#lex(
	 * de.ubt.ai1.supermod.file.VersionedFileContent)
	 */
	@Override
	public boolean lex(VersionedFileContent fileContent)
			throws SuperModClientException {
		// can only export text file contents.
		return fileContent instanceof TextFileContent;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.ubt.ai1.supermod.service.file.client.
	 * IVersionedFileContentExportService#compile(
	 * de.ubt.ai1.supermod.mm.file.client.SingleVersionFileSystemDescriptor,
	 * de.ubt.ai1.supermod.file.VersionedFileContent)
	 */
	@Override
	public TextFileExportTrace compile(VersionedFileContent fileContent)
			throws SuperModClientException {
		TextFileExportTrace trace = SuperModTextfileClientFactory.eINSTANCE
				.createTextFileExportTrace();
		TextFileContent textContent = (TextFileContent) fileContent;
		IFile iFile = container.getFile(Path.fromPortableString(fileContent
				.getFile().getPath()));
		StringBuilder sb = new StringBuilder();
		boolean first = true;
		if (textContent.getLineOrdering() != null) {
			int lineNr = 0;
			for (ProductSpaceElement line : ListExportUtil.exportList(
					textContent.getLineOrdering(), defaultResolver,
					getCurrentProject())) {
				if (first) {
					first = false;
				}
				else {
					sb.append(System.lineSeparator());
				}
				sb.append(((TextLine) line).getText());
				
				TextLineExportTrace lineTrace = SuperModTextfileClientFactory
						.eINSTANCE.createTextLineExportTrace();
				lineTrace.setLineNr(lineNr);
				lineTrace.setLine((TextLine) line);
				trace.getLines().add(lineTrace);
				lineNr ++;
			}
		}
		InputStream in = new ByteArrayInputStream(sb.toString().getBytes());
		// if file exists, set it its contents to the appended string, else
		// create the file before.
		try {
			if (iFile.exists()) {
				iFile.setContents(in, true, true, new NullProgressMonitor());
			} else {
				IContainer cont = iFile.getParent();
				if (cont instanceof IFolder && !cont.exists()) {
					prepareFolder((IFolder) cont);
				}
				iFile.create(in, true, new NullProgressMonitor());
			}
		} catch (CoreException e) {
			throw new SuperModClientWrappedException(e);
		} finally {
			try {
				in.close();
			} catch (IOException e) {
				throw new SuperModClientWrappedException(e);
			}
		}
		return trace;
	}

	/**
	 * Utility method to create a folder and all of its parent folders if
	 * necessary.
	 *
	 * @param folder
	 * @throws CoreException 
	 */
	private void prepareFolder(IFolder folder) throws CoreException {
		IContainer parent = folder.getParent();
		if (parent instanceof IFolder) {
			prepareFolder((IFolder) parent);
		}
		if (!folder.exists()) {
			folder.create(true, true, new NullProgressMonitor());
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.ubt.ai1.supermod.service.file.client.
	 * IVersionedFileContentExportService#link(
	 * de.ubt.ai1.supermod.file.VersionedFileContent,
	 * de.ubt.ai1.supermod.mm.file.client.SingleVersionFileDescriptor)
	 */
	@Override
	public void link(VersionedFileContent fileContent,
			SingleVersionFileDescriptor descriptor)
			throws SuperModClientException {
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.ubt.ai1.supermod.service.file.client.
	 * IVersionedFileContentExportService#finish()
	 */
	@Override
	public void finish() throws SuperModClientException {
		this.container = null;
		this.fsDescriptor = null;
	}
	
	/**
	 * Returns the current project within the workspace by the file system
	 * descriptor URI.
	 */
	private IProject getCurrentProject() {
		
		String projectName = fsDescriptor.eResource().getURI().segment(1);
		return ResourcesPlugin.getWorkspace().getRoot().getProject(projectName);
	}

}
