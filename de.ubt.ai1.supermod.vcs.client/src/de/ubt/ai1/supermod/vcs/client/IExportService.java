/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.vcs.client;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.resource.ResourceSet;

import com.google.inject.ImplementedBy;

import de.ubt.ai1.supermod.mm.client.LocalRepository;
import de.ubt.ai1.supermod.service.exceptions.SuperModException;
import de.ubt.ai1.supermod.vcs.client.impl.ExportService;

/**
 * Interface for the VCS operation "Export". It asks the user for a complete
 * version selection. Furthermore, an export location must be specified.
 * The product space of the selected project is filtered by the choice and
 * exported to the specified location.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	13.06.2016
 */
@ImplementedBy(ExportService.class)
public interface IExportService {

	/**
	 * Must return whether the repository is capable of exporting its product
	 * space.
	 *
	 * @param repo
	 * @return
	 */
	public boolean canExport(LocalRepository repo);

	/**
	 * Performs the export.
	 *
	 * @param repo
	 * @param rs
	 * @param monitor
	 * @return whether the export was successful.
	 * @throws SuperModException if something went wrong
	 */
	public boolean export(LocalRepository repo, ResourceSet rs, 
			IProgressMonitor monitor) throws SuperModException;

}
