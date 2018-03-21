/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/

package de.ubt.ai1.supermod.service.hetfile.impl;

import java.util.Arrays;
import java.util.Collection;

import com.google.inject.Inject;

import de.ubt.ai1.supermod.service.emffile.EMFFile;
import de.ubt.ai1.supermod.service.file.IVersionedFileContentMergeService;
import de.ubt.ai1.supermod.service.textfile.Textfile;

/**
 * An implementation of the file content merge service registry which defines
 * the EMF match emrge and the text merge service in the service list.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	01.08.2014
 */
public class HetFileMergeServiceRegistry implements 
IVersionedFileContentMergeService.Registry {
	
	@Inject
	@EMFFile
	private IVersionedFileContentMergeService emfMergeService;
	
	@Inject
	@Textfile
	private IVersionedFileContentMergeService textMergeService;

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.file.
	 * IVersionedFileContentMergeService.Registry#getServices()
	 */
	@Override
	public Collection<? extends IVersionedFileContentMergeService> 
	getServices() {
		return Arrays.asList(emfMergeService, textMergeService);
	}

	
	
}
