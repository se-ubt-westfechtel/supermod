/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.service.feature.client.impl;

import org.eclipse.emf.common.ui.URIEditorInput;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;

import de.ubt.ai1.supermod.mm.core.VersionDimension;
import de.ubt.ai1.supermod.mm.feature.FeatureModel;
import de.ubt.ai1.supermod.service.client.IVersionDimensionEditingService;
import de.ubt.ai1.supermod.service.client.exceptions.SuperModClientException;

/**
 * An implementation of the version dimension editing service interface specific
 * to the version dimension of feature models. It opens the feature model tree
 * editor.
 * 
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	27.10.2014
 */
public class FeatureModelEditingService 
implements IVersionDimensionEditingService {
	
	public static final String FEATURE_EDITOR_ID = 
		"de.ubt.ai1.supermod.mm.feature.presentation.SuperModFeatureEditorID";

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.client.IVersionDimensionEditingService
	 * #isEditable(de.ubt.ai1.supermod.mm.core.VersionDimension)
	 */
	@Override
	public boolean isEditable(VersionDimension dim) {
		return dim instanceof FeatureModel;
	}

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.client.IVersionDimensionEditingService
	 * #openEditor(de.ubt.ai1.supermod.mm.core.VersionDimension)
	 */
	@Override
	public void openEditor(VersionDimension dim) throws SuperModClientException {
		IEditorInput input = new URIEditorInput(dim.eResource().getURI());
		Display.getDefault().asyncExec(new Runnable() {				
			@Override
			public void run() {
				try {
					PlatformUI.getWorkbench()
							.getActiveWorkbenchWindow().getActivePage()
							.openEditor(input, FEATURE_EDITOR_ID);
				} catch (PartInitException e) {
					e.printStackTrace();
				}					
			}
		});				
	}

}
