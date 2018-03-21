/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.service.generic.impl;

import java.util.Collection;

import de.ubt.ai1.supermod.mm.core.Option;
import de.ubt.ai1.supermod.mm.core.OptionExpr;
import de.ubt.ai1.supermod.service.IOptionResolver;

/**
 * Default implementation of the option resolver auxiliary service interface. It simply returns
 * the options that occur in the visibility.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	09.10.2017
 */
public class GenericOptionResolver implements IOptionResolver {

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.IOptionResolver
	 * #resolveOptions(de.ubt.ai1.supermod.mm.core.OptionExpr)
	 */
	@Override
	public Collection<Option> resolveOptions(OptionExpr visibility) {
		return visibility.getReferencedOptions();
	}

}
