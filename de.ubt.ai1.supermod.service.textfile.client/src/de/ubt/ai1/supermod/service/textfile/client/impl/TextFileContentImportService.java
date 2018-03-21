/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/

package de.ubt.ai1.supermod.service.textfile.client.impl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Path;

import de.ubt.ai1.supermod.mm.file.VersionedFileContent;
import de.ubt.ai1.supermod.mm.file.VersionedFileSystem;
import de.ubt.ai1.supermod.mm.file.client.SingleVersionFileDescriptor;
import de.ubt.ai1.supermod.mm.file.client.SingleVersionFileSystemDescriptor;
import de.ubt.ai1.supermod.mm.textfile.SuperModTextfileFactory;
import de.ubt.ai1.supermod.mm.textfile.TextFileContent;
import de.ubt.ai1.supermod.mm.textfile.TextLine;
import de.ubt.ai1.supermod.service.client.exceptions.SuperModClientException;
import de.ubt.ai1.supermod.service.client.exceptions.SuperModClientWrappedException;
import de.ubt.ai1.supermod.service.file.client.IVersionedFileContentImportService;
import de.ubt.ai1.supermod.service.list.client.ListImportUtil;

/**
 * An implementation of the versioned file import export service specific to
 * the file content type 'plain text'. It scans a plain text workspace file
 * line by line and creates a new text file content with a linearly ordered
 * directed graph.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	31.07.2014
 */
public class TextFileContentImportService 
implements IVersionedFileContentImportService {
	
	protected SingleVersionFileSystemDescriptor fsDescriptor;
	
	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.file.client.
	 * IVersionedFileContentImportService#start(
	 * de.ubt.ai1.supermod.mm.file.client.SingleVersionFileSystemDescriptor)
	 */
	@Override
	public void start(SingleVersionFileSystemDescriptor fsDescriptor) {
		this.fsDescriptor = fsDescriptor;
	}

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.file.client.
	 * IVersionedFileContentImportService#lex(
	 * de.ubt.ai1.supermod.mm.file.client.SingleVersionFileDescriptor)
	 */
	@Override
	public boolean lex(SingleVersionFileDescriptor descriptor) 
			throws SuperModClientException {
		
		IContainer container = (IContainer) ResourcesPlugin.getWorkspace()
				.getRoot().findMember(fsDescriptor.getRootUri());		
		IFile iFile = container.getFile(Path.fromPortableString(
				descriptor.getPath()));
		if (iFile.exists()) {
			InputStreamReader reader = null;
			try {
				reader = new InputStreamReader(iFile.getContents());
				return reader.ready();
			}
			catch(Exception e) {
				return false;
			}
			finally {
				try {
					reader.close();
				} catch (IOException e) {
					return false;
				}
			}
		}
		return false;
	}

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.file.client.
	 * IVersionedFileContentImportService#compile(
	 * de.ubt.ai1.supermod.file.VersionedFileSystem, 
	 * de.ubt.ai1.supermod.mm.file.client.SingleVersionFileDescriptor)
	 */
	@Override
	public VersionedFileContent compile(VersionedFileSystem fs,
			SingleVersionFileDescriptor descriptor) 
				throws SuperModClientException {
		IContainer container = (IContainer) ResourcesPlugin.getWorkspace()
				.getRoot().findMember(fsDescriptor.getRootUri());
		IFile iFile = container.getFile(Path.fromPortableString(
				descriptor.getPath()));
		BufferedReader reader;
		try {
			reader = new BufferedReader(new InputStreamReader(
					iFile.getContents()));
		} catch (CoreException e) {
			throw new SuperModClientWrappedException(e);
		}
		TextFileContent textContent = SuperModTextfileFactory.eINSTANCE
				.createTextFileContent();
		Map<String, TextLine> lineMap = new LinkedHashMap<>();
		List<TextLine> allTextLines = new ArrayList<>();
		List<TextLine> uniqueTextLines = new ArrayList<>();
		try {
			while (reader.ready()) {
				String line = reader.readLine();
				if (!lineMap.containsKey(line)) {
					TextLine textLine = SuperModTextfileFactory.eINSTANCE
							.createTextLine();
					textLine.setText(line);
					allTextLines.add(textLine);
					uniqueTextLines.add(textLine);
					lineMap.put(line, textLine);
				}
				else {
					allTextLines.add(lineMap.get(line));
				}
			}
		} catch (IOException e) {
			throw new SuperModClientWrappedException(e);
		}		
		finally {
			try {
				reader.close();
			} catch (IOException e) {
				throw new SuperModClientWrappedException(e);
			}
		}
		textContent.getLines().addAll(uniqueTextLines);
		textContent.setLineOrdering(ListImportUtil.createLinearList(
				allTextLines));
		return textContent;
	}

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.file.client.
	 * IVersionedFileContentImportService#link(
	 * de.ubt.ai1.supermod.mm.file.client.SingleVersionFileDescriptor, 
	 * de.ubt.ai1.supermod.file.VersionedFileContent)
	 */
	@Override
	public void link(SingleVersionFileDescriptor descriptor, 
			VersionedFileContent fileContent)
			throws SuperModClientException {		
	}

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.file.client.
	 * IVersionedFileContentImportService#finish()
	 */
	@Override
	public void finish() throws SuperModClientException {
		this.fsDescriptor = null;
	}

}
