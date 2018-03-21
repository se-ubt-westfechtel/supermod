/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.service.textemf.client.impl;

import java.util.Arrays;
import java.util.Collection;

import com.google.inject.Inject;

import de.ubt.ai1.supermod.service.emffile.EMFFile;
import de.ubt.ai1.supermod.service.file.client.IVersionedFileContentConflictMarkerGenerator;
import de.ubt.ai1.supermod.service.textfile.Textfile;

/**
 * An implementation of the file conflict marker service registry which defines
 * the EMF marker service and the text marker service in the service list.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	10.06.2016
 */
public class HetFileConflictMarkerGeneratorRegistry 
implements IVersionedFileContentConflictMarkerGenerator.Registry {
	
	@Inject
	@EMFFile
	private IVersionedFileContentConflictMarkerGenerator emfMarkerGenerator;
	
	@Inject
	@Textfile
	private IVersionedFileContentConflictMarkerGenerator textMarkerGenerator;
	
	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.file.client.
	 * IVersionedFileContentExportService.Registry#getServices()
	 */
	@Override
	public Collection<? extends IVersionedFileContentConflictMarkerGenerator> 
			getServices() {
		return Arrays.asList(emfMarkerGenerator, textMarkerGenerator);
	}

}
