/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/

package de.ubt.ai1.supermod.service;

import de.ubt.ai1.supermod.mm.core.Element;

/**
 * Service interface for the deletion of an element from a
 * SuperMod repository.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	29.07.2014
 */
public interface IElementDeletionService {

	/**
	 * Performs the deletion of a specified element.
	 *
	 * @param the element to delete.
	 */
	public void delete(Element ve);

}
