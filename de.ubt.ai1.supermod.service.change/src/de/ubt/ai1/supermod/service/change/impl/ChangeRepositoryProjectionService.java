/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.service.change.impl;

import java.util.ArrayList;
import java.util.List;

import de.ubt.ai1.supermod.mm.change.Change;
import de.ubt.ai1.supermod.mm.core.Option;
import de.ubt.ai1.supermod.mm.core.OptionBinding;
import de.ubt.ai1.supermod.mm.core.ProductSpaceElement;
import de.ubt.ai1.supermod.mm.core.VersionSpaceElement;
import de.ubt.ai1.supermod.service.generic.impl.GenericRepositoryProjectionService;

/**
 * An extension to the default implementation of the repository projection
 * service that additionally takes into account that changes depend on the
 * version space concept their assigned ambition expressions refer to.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	26.01.2016
 */
public class ChangeRepositoryProjectionService
extends GenericRepositoryProjectionService {
	
	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.generic.impl.
	 * GenericRepositoryProjectionService#getVersioningElements(
	 * de.ubt.ai1.supermod.mm.core.ProductSpaceElement)
	 */
	@Override
	protected List<VersionSpaceElement> getVersioningElements(
			ProductSpaceElement pse) {
		List<VersionSpaceElement> result = new ArrayList<VersionSpaceElement>();
		List<VersionSpaceElement> superResult = super.getVersioningElements(pse);
		result.addAll(superResult);
		for (VersionSpaceElement vse : superResult) {
			if (vse instanceof Change) {
				OptionBinding amb = ((Change) vse).getUserAmbitionBinding();
				if (amb == null) {
					continue;
				}
				for (Option o : amb.getBoundOptions().keySet()) {
					VersionSpaceElement refVse = o.getHighLevelConcept();
					if (refVse != null) {
						result.add(refVse);
					}
				}
			}
		}
		return result;
	}

}
