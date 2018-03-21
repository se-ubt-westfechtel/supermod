/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/

package de.ubt.ai1.supermod.service.file.client.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import com.google.inject.Inject;

import de.ubt.ai1.supermod.mm.client.ConflictSet;
import de.ubt.ai1.supermod.mm.client.ProductConflict;
import de.ubt.ai1.supermod.mm.client.SuperModClientFactory;
import de.ubt.ai1.supermod.mm.core.ProductDimension;
import de.ubt.ai1.supermod.mm.file.VersionedFile;
import de.ubt.ai1.supermod.mm.file.VersionedFileSystem;
import de.ubt.ai1.supermod.mm.file.VersionedResource;
import de.ubt.ai1.supermod.service.client.IProductDimensionValidationService;
import de.ubt.ai1.supermod.service.file.client.IVersionedFileContentValidationService;

/**
 * Implementation of the product dimension validation service client interface
 * specific to the dimension type 'versioned file system'. It validates a file
 * system by validating all of its file contents, and returns a composite
 * conflict set accordingly. For validation of the contents, specific instances
 * of {@link IVersionedFileContentValidationService} are injected by means of
 * a registry.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	31.07.2014
 */
public class VersionedFileSystemValidationService 
implements IProductDimensionValidationService {
	
	@Inject
	public IVersionedFileContentValidationService.Registry registry;

	@Override
	public ConflictSet validate(ProductDimension pd) {

		Collection<ProductConflict> conflicts = new ArrayList<>();
		Collection<VersionedFile> files = new ArrayList<>();
		for (VersionedResource res : 
					((VersionedFileSystem) pd).getAllResources()) {
			if (res instanceof VersionedFile) {
				files.add((VersionedFile) res);
			}
		}
		
		// obtain and start content validation services.
		Collection<? extends IVersionedFileContentValidationService> services =
				registry.getServices();
		for (IVersionedFileContentValidationService service : services) {
			service.start();
		}
		
		// find the suitable content validation service for each file content
		// by lexing.
		Map<VersionedFile, IVersionedFileContentValidationService> serviceMap = 
				new HashMap<>();
		for (VersionedFile file : files) {
			for (IVersionedFileContentValidationService service : services) {
				if (service.lex(file.getContent())) {
					serviceMap.put(file, service);
					break;
				}
			}
		}
		
		// compile the file content using the suitable content validation
		// service in order to detect conflicts.
		Map<VersionedFile, Collection<ProductConflict>> resultMap =
				new HashMap<>();
		for (VersionedFile file : files) {
			if (serviceMap.containsKey(file)) {
				Collection<ProductConflict> fileConflicts = 
						serviceMap.get(file).compile(file.getContent());
				resultMap.put(file, fileConflicts);
				conflicts.addAll(fileConflicts);
			}
		}
		
		// link the identified conflicts using the content validation services.
		for (VersionedFile file : files) {
			if (serviceMap.containsKey(file) && resultMap.containsKey(file)) {
				serviceMap.get(file).link(file.getContent(), 
						resultMap.get(file));
			}
		}
		
		// finish all content validation services and return the resulting
		// composite conflict set.
		for (IVersionedFileContentValidationService service : services) {
			service.finish();
		}		
		ConflictSet set = SuperModClientFactory.eINSTANCE.createConflictSet();
		set.getConflicts().addAll(conflicts);
		return set;
	}

}
