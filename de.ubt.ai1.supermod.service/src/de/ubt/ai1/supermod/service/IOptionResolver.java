/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.service;

import java.util.Collection;

import de.ubt.ai1.supermod.mm.core.Option;
import de.ubt.ai1.supermod.mm.core.OptionExpr;

/**
 * Utility service that returns the user-relevant options actually referenced by a provided
 * visibility. Implementations should abstract from indirections (e.g., change space and
 * visibility forest).
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	09.10.2017
 */
public interface IOptionResolver {

	/**
	 * To be implemented by clients in order to yield all user-relevant options directly or
	 * indirectly referenced by the specified visibilities
	 *
	 * @param visibility
	 * @return the referenced options
	 */
	public Collection<Option> resolveOptions(OptionExpr visibility);

}
