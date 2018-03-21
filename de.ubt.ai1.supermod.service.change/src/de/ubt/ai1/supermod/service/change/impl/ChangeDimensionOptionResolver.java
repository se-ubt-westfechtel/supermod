/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.service.change.impl;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;

import de.ubt.ai1.supermod.mm.change.util.ChangeSpaceUtil;
import de.ubt.ai1.supermod.mm.core.Option;
import de.ubt.ai1.supermod.mm.core.OptionExpr;
import de.ubt.ai1.supermod.service.IOptionResolver;

/**
 * An implementation of the option resolver service that is specific to the change dimension
 * and is aware of the indirection implied by change options occurring in visibility
 * expressions. It returns the indirectly referenced options rather than change options.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	09.10.2017
 */
public class ChangeDimensionOptionResolver implements IOptionResolver {

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.IOptionResolver
	 * #resolveOptions(de.ubt.ai1.supermod.mm.core.OptionExpr)
	 */
	@Override
	public Collection<Option> resolveOptions(OptionExpr visibility) {
		Set<Option> options = new LinkedHashSet<>();
		for (Option o : visibility.getReferencedOptions()) {
			options.addAll(ChangeSpaceUtil.expandOption(o));
		}
		return options;
	}

}
