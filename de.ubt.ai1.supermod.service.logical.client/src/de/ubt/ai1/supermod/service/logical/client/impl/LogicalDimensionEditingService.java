/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/

package de.ubt.ai1.supermod.service.logical.client.impl;

import org.eclipse.core.resources.IFile;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.FileEditorInput;

import de.ubt.ai1.supermod.mm.core.VersionDimension;
import de.ubt.ai1.supermod.mm.logical.LogicalDimension;
import de.ubt.ai1.supermod.service.client.IVersionDimensionEditingService;
import de.ubt.ai1.supermod.service.client.exceptions.SuperModClientException;
import de.ubt.ai1.util.emf.AI1ResourceUtil;

/**
 * An implementation of the version dimension editing service interface specific
 * to the low-level logical version dimension. It opens the textual editor,
 * where low-level rule base elements may be specified manually by the user.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	01.08.2014
 */
public class LogicalDimensionEditingService 
implements IVersionDimensionEditingService {
	
	public static final String LOGICAL_EDITOR_ID = 
			"de.ubt.ai1.supermod.text.Logical";

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.client.IVersionDimensionEditingService
	 * #isEditable(de.ubt.ai1.supermod.mm.core.VersionDimension)
	 */
	@Override
	public boolean isEditable(VersionDimension dim) {
		return dim instanceof LogicalDimension;
	}

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.client.IVersionDimensionEditingService
	 * #openEditor(de.ubt.ai1.supermod.mm.core.VersionDimension)
	 */
	@Override
	public void openEditor(VersionDimension dim) 
			throws SuperModClientException {
		IEditorInput input = new FileEditorInput((IFile) AI1ResourceUtil
				.eResourceToIResource(dim.eResource()));
		Display.getDefault().asyncExec(new Runnable() {
			@Override
			public void run() {
				try {
					PlatformUI.getWorkbench()
							.getActiveWorkbenchWindow().getActivePage()
							.openEditor(input, LOGICAL_EDITOR_ID);
				} catch (PartInitException e) {
					e.printStackTrace();
				}				
			}			
		});		
	}

}
