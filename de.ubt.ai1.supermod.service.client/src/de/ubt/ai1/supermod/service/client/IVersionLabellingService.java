/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.service.client;

import de.ubt.ai1.supermod.mm.core.OptionBinding;
import de.ubt.ai1.supermod.mm.core.OptionExpr;
import de.ubt.ai1.supermod.mm.core.VersionSpace;

/**
 * Interface for services which transform a SuperMod choice or visibility into
 * a human readable string. It is used whenever versioning information is to be
 * displayed to the user. A version may be specified by an option binding or by
 * a visibility.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	30.10.2014
 */
public interface IVersionLabellingService {
	
	/**
	 * To be implemented to generate a human readable string for the specified
	 * option binding.
	 *
	 * @param ob
	 * @param vs version space to which the binding refers
	 * @param true if the label describes an ambition, false if a choice is
	 * 			to be described.
	 * @return
	 */
	public String getLabel(OptionBinding ob, VersionSpace vs, boolean ambition);
	
	/**
	 * To be implemented to generate a human readable string for the specified
	 * option expression.
	 *
	 * @param expr
	 * @param vs version space to which the expression refers
	 * @return
	 */
	public String getLabel(OptionExpr expr, VersionSpace vs);

	/**
	 * To be implemented in order to return a default label for empty option
	 * bindings.
	 *
	 * @return
	 */
	public String getDefaultLabel();

}
