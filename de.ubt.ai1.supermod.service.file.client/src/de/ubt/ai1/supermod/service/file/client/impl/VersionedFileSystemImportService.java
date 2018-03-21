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

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;

import com.google.inject.Inject;

import de.ubt.ai1.supermod.mm.client.SingleVersionProductDimensionDescriptor;
import de.ubt.ai1.supermod.mm.file.SuperModFileFactory;
import de.ubt.ai1.supermod.mm.file.VersionedFile;
import de.ubt.ai1.supermod.mm.file.VersionedFileContent;
import de.ubt.ai1.supermod.mm.file.VersionedFileSystem;
import de.ubt.ai1.supermod.mm.file.client.SingleVersionFileDescriptor;
import de.ubt.ai1.supermod.mm.file.client.SingleVersionFileSystemDescriptor;
import de.ubt.ai1.supermod.mm.file.client.SingleVersionFolderDescriptor;
import de.ubt.ai1.supermod.mm.file.client.SingleVersionResourceDescriptor;
import de.ubt.ai1.supermod.service.client.IProductDimensionImportService;
import de.ubt.ai1.supermod.service.client.exceptions.SuperModClientException;
import de.ubt.ai1.supermod.service.client.exceptions.SuperModClientWrappedException;
import de.ubt.ai1.supermod.service.file.client.IFileSorter;
import de.ubt.ai1.supermod.service.file.client.IVersionedFileContentImportService;

/**
 * Implementation of the product dimension import service client interface
 * specific to the dimension type 'versioned file system'. It imports a file
 * system by mapping the single-version file system in the local workspace to a
 * multi-version file system. For merging file contents, instances of
 * {@link IVersionedFileContentImportService} are injected by means of a
 * corresponding registry.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	31.07.2014
 */
public class VersionedFileSystemImportService 
implements IProductDimensionImportService {
	
	@Inject
	private IVersionedFileContentImportService.Registry serviceRegistry;
	
	@Inject
	private IFileSorter fileSorter;
	
	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.client.IProductDimensionImportService
	 * #doImport(de.ubt.ai1.supermod.mm.client.
	 * SingleVersionProductDimensionDescriptor)
	 */
	@Override
	public VersionedFileSystem doImport(
			SingleVersionProductDimensionDescriptor descriptor) 
					throws SuperModClientException {
		if (!(descriptor instanceof SingleVersionFileSystemDescriptor)) {
			throw new UnsupportedOperationException();
		}
		
		VersionedFileSystem versionedFs = SuperModFileFactory
				.eINSTANCE.createVersionedFileSystem();		
		SingleVersionFileSystemDescriptor fsDescriptor = 
				(SingleVersionFileSystemDescriptor) descriptor;
		IContainer container = (IContainer) ResourcesPlugin.getWorkspace()
				.getRoot().findMember(fsDescriptor.getRootUri());
						
		// obtain and start file content import services.
		List<IVersionedFileContentImportService> importServices = 
				new ArrayList<>(serviceRegistry.getServices());
		for (IVersionedFileContentImportService importService : 
				importServices) {
			importService.start(fsDescriptor);
		}
		
		// lex all workspace resources and associate the suitable content import
		// service with it.
		Map<SingleVersionFileDescriptor, IVersionedFileContentImportService> 
				serviceMap = new HashMap<>();
		for (SingleVersionResourceDescriptor resDesc : 
				fsDescriptor
				.getAllResources()) {
			if (resDesc.isVersioned() && resDesc 
						instanceof SingleVersionFileDescriptor) {
				for (IVersionedFileContentImportService importService : 
						importServices) {
					if (importService.lex(
							(SingleVersionFileDescriptor) resDesc)) {
						serviceMap.put((SingleVersionFileDescriptor) resDesc, 
								importService);
						break;
					}
				}
			}
		}		
		
		// compile the workspace files using suitable content import services.
		List<SingleVersionFileDescriptor> fileList = new ArrayList<>();
		Map<SingleVersionFileDescriptor, VersionedFileContent> resultMap =
				new HashMap<>();
		for (SingleVersionResourceDescriptor resDesc : 
			fsDescriptor.getAllResources()) {
			if (resDesc.isVersioned() && resDesc instanceof 
					SingleVersionFileDescriptor && 
					serviceMap.containsKey(resDesc)) {
				fileList.add((SingleVersionFileDescriptor) resDesc);
				
				VersionedFile vf = versionedFs.createFile(resDesc.getPath());
				IFile iFile = (IFile) container.findMember(resDesc.getPath());
				try {
					if (iFile.getContentDescription() != null && iFile
							.getContentDescription().getContentType() != null) {
						vf.setContentType(iFile.getContentDescription()
								.getContentType().getId());
					}
				} catch (CoreException e) {
					throw new SuperModClientWrappedException(e);
				}
			}
			else if (resDesc.isVersioned() && resDesc instanceof 
					SingleVersionFolderDescriptor) {
				versionedFs.createFolder(resDesc.getPath());
			}			
		}
		List<SingleVersionFileDescriptor> sortedFileList =
				fileSorter.sortFiles(fileList);		
		for (SingleVersionFileDescriptor fileDesc : sortedFileList) {
			VersionedFileContent fileContent = serviceMap.get(fileDesc)
					.compile(versionedFs, 
							(SingleVersionFileDescriptor) fileDesc);
			VersionedFile vf = (VersionedFile) 
					versionedFs.getResource(fileDesc.getPath());
			vf.setContent(fileContent);
			resultMap.put(fileDesc, fileContent);				
		}	
		
		// link imported file contents.
		for (SingleVersionResourceDescriptor resDesc : 
				fsDescriptor
				.getAllResources()) {
			if (resDesc.isVersioned() && resDesc instanceof 
					SingleVersionFileDescriptor && 
					serviceMap.containsKey(resDesc) &&
					resultMap.containsKey(resDesc)) {
				serviceMap.get(resDesc).link(
						(SingleVersionFileDescriptor) resDesc, 
						resultMap.get(resDesc));
			}
		}
		
		// finish all content import services and return the result.
		for (IVersionedFileContentImportService service : importServices) {
			service.finish();
		}		
		return versionedFs;
	}

}
