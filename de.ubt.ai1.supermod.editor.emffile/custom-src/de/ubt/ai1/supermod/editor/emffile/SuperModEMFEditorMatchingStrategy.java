/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.editor.emffile;

import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.common.ui.URIEditorInput;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorMatchingStrategy;
import org.eclipse.ui.IEditorReference;
import org.eclipse.ui.IPathEditorInput;

import de.ubt.ai1.util.emf.AI1ResourceUtil;

/**
 * Specialized editor matching strategy for the multi-variant EMF editor.
 * It allows to open all EMF resouces compatible with the standard resource
 * set implementation.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	20.05.2015
 */
public class SuperModEMFEditorMatchingStrategy 
implements IEditorMatchingStrategy {

	/* (non-Javadoc)
	 * @see org.eclipse.ui.IEditorMatchingStrategy#matches(org.eclipse.ui.IEditorReference, org.eclipse.ui.IEditorInput)
	 */
	@Override
	public boolean matches(IEditorReference editorRef, IEditorInput input) {
		if (input instanceof URIEditorInput) return true;
		if (input instanceof IPathEditorInput) {
			IPath path = ((IPathEditorInput) input).getPath();
			Resource res = AI1ResourceUtil.iPathToEResource(path, new ResourceSetImpl());
			try {
				res.load(null);
				return true;
			}
			catch (Exception e) {
				return false;
			}
		}
		return false;
	}

}
