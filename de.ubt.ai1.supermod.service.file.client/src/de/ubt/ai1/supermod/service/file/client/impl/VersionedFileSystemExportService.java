/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/

package de.ubt.ai1.supermod.service.file.client.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;

import com.google.inject.Inject;

import de.ubt.ai1.supermod.mm.client.SingleVersionProductDimensionDescriptor;
import de.ubt.ai1.supermod.mm.core.ProductDimension;
import de.ubt.ai1.supermod.mm.file.VersionedFile;
import de.ubt.ai1.supermod.mm.file.VersionedFileSystem;
import de.ubt.ai1.supermod.mm.file.VersionedResource;
import de.ubt.ai1.supermod.mm.file.client.SingleVersionFileDescriptor;
import de.ubt.ai1.supermod.mm.file.client.SingleVersionFileSystemDescriptor;
import de.ubt.ai1.supermod.mm.file.client.SingleVersionFolderDescriptor;
import de.ubt.ai1.supermod.mm.file.client.SingleVersionResourceDescriptor;
import de.ubt.ai1.supermod.mm.file.client.SuperModFileClientFactory;
import de.ubt.ai1.supermod.mm.file.client.VersionedFileExportTrace;
import de.ubt.ai1.supermod.mm.file.client.VersionedFileSystemExportTrace;
import de.ubt.ai1.supermod.service.client.IProductDimensionExportService;
import de.ubt.ai1.supermod.service.client.exceptions.SuperModClientException;
import de.ubt.ai1.supermod.service.client.exceptions.SuperModClientWrappedException;
import de.ubt.ai1.supermod.service.file.client.IFileSorter;
import de.ubt.ai1.supermod.service.file.client.IVersionedFileContentExportService;

/**
 * Implementation of the product dimension export service client interface
 * specific to the dimension type 'versioned file system'. It exports a file
 * system by mapping the multi-version file system to a single-version file
 * system in the local workspace. For merging file contents, instances of
 * {@link IVersionedFileContentExportService} are injected by means of a
 * corresponding registry.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	31.07.2014
 */
public class VersionedFileSystemExportService 
implements IProductDimensionExportService {
	
	@Inject
	private IFileSorter fileSorter;
	
	@Inject
	private IVersionedFileContentExportService.Registry serviceRegistry;

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.client.IProductDimensionExportService
	 * #export(de.ubt.ai1.supermod.mm.core.ProductDimension, 
	 * de.ubt.ai1.supermod.mm.client.SingleVersionProductDimensionDescriptor)
	 */
	@Override
	public VersionedFileSystemExportTrace export(ProductDimension pd, 
			SingleVersionProductDimensionDescriptor descriptor) 
			throws SuperModClientException {			
		if (!(pd instanceof VersionedFileSystem) || 
				!(descriptor instanceof SingleVersionFileSystemDescriptor)) {
			throw new UnsupportedOperationException();
		}
		VersionedFileSystem fileSystem = (VersionedFileSystem) pd;
		SingleVersionFileSystemDescriptor fsDescriptor = 
				(SingleVersionFileSystemDescriptor) descriptor;
		VersionedFileSystemExportTrace trace = SuperModFileClientFactory
				.eINSTANCE.createVersionedFileSystemExportTrace();
		trace.setProductDimension(pd);
		
		// delete versioned but invisible files from the workspace.
		for (SingleVersionResourceDescriptor resDesc : 
				fsDescriptor.getAllResources()) {
			if (resDesc.isVersioned()) {
				if (fileSystem.getResource(resDesc.getPath()) == null) {
					IResource iRes = ResourcesPlugin.getWorkspace().getRoot()
							.findMember(fsDescriptor.getRootUri() + "/" 
							+ resDesc.getPath());
					if (iRes != null && iRes.exists()) {
						try {
							iRes.delete(true, new NullProgressMonitor());
						} catch (CoreException e) {
							throw new SuperModClientWrappedException(e);
						}
					}
				}
			}
		}
				
		// obtain and start the content export services.
		List<? extends IVersionedFileContentExportService> exportServices =
				new ArrayList<>(serviceRegistry.getServices());
		for (IVersionedFileContentExportService service : exportServices) {
			service.start(fsDescriptor);
		}
		
		// lex all file contents and associate the suitable content export
		// service with it.
		Map<VersionedFile, IVersionedFileContentExportService> serviceMap =
				new HashMap<>();
		for (VersionedResource res : fileSystem.getAllResources()) {
			if (res instanceof VersionedFile) {
				for (IVersionedFileContentExportService exportService : 
					exportServices) {
					if (exportService.lex(((VersionedFile) res).getContent())) {
						serviceMap.put((VersionedFile) res, exportService);
						break;
					}
				}
			}
		}		
		
		// compile the file contents using suitable content export services.
		List<SingleVersionFileDescriptor> fileList = new ArrayList<>();
		List<SingleVersionFolderDescriptor> folderList = new ArrayList<>();
		Map<VersionedFile, SingleVersionFileDescriptor> resultMap = 
				new HashMap<>();
		for (VersionedResource res : fileSystem.getAllResources()) {
			if (res instanceof VersionedFile && serviceMap.containsKey(res)) {
				SingleVersionFileDescriptor fileDesc = fsDescriptor.createFile(
						res.getPath());
				fileDesc.setVersioned(true);
				fileList.add(fileDesc);
			}
			else {
				SingleVersionFolderDescriptor folderDesc = fsDescriptor
						.createFolder(res.getPath());
				folderDesc.setVersioned(true);
				folderList.add(folderDesc);
			}
		}
		for (SingleVersionFolderDescriptor folderDesc : folderList) {
			createFolder(fsDescriptor.getRootUri() + "/" + folderDesc.getPath());
		}
		List<SingleVersionFileDescriptor> sortedFileList =
				fileSorter.sortFiles(fileList);		
		for (SingleVersionFileDescriptor fileDesc : sortedFileList) {
			VersionedResource res = fileSystem.getResource(fileDesc.getPath());
			VersionedFileExportTrace fileTrace = serviceMap.get(res)
					.compile(((VersionedFile) res).getContent());
			fileTrace.setVersionedFile((VersionedFile) res);
			resultMap.put((VersionedFile) res, fileDesc);
			trace.getPathToVersionedFileMap().put(fileDesc.getPath(), fileTrace);
		}
		
		// link the compilation results.
		for (VersionedResource res : fileSystem.getAllResources()) {
			if (res instanceof VersionedFile) {
				if (serviceMap.containsKey(res) && resultMap.containsKey(res)) {
					serviceMap.get(res).link(((VersionedFile) res).getContent(),
							resultMap.get(res));
				}
			}
		}
		
		// finish the content export services.
		for (IVersionedFileContentExportService service : exportServices) {
			service.finish();
		}
		return trace;
	}

	/**
	 * Creates a folder in the workspace, using the specified path.
	 *
	 * @param path
	 */
	private void createFolder(String path) {
		IFolder folder = ResourcesPlugin.getWorkspace().getRoot().getFolder(
				Path.fromPortableString(path));
		if (folder.exists()) {
			return;
		}
		try {
			folder.create(true, true, new NullProgressMonitor());
		} catch (CoreException e) {
			e.printStackTrace();
		}
		
	}

}
