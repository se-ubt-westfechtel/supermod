/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.service.generic.client.impl;

import java.util.Map.Entry;

import de.ubt.ai1.supermod.edit.core.util.OptionLangUtil;
import de.ubt.ai1.supermod.mm.core.Option;
import de.ubt.ai1.supermod.mm.core.OptionBinding;
import de.ubt.ai1.supermod.mm.core.OptionExpr;
import de.ubt.ai1.supermod.mm.core.Tristate;
import de.ubt.ai1.supermod.mm.core.VersionSpace;
import de.ubt.ai1.supermod.service.client.IVersionLabellingService;

/**
 * Default implementation of the version labelling service. Option expressions
 * are converted into their textual representation. For option bindings, a
 * conversion to option expressions is applied in advance.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	30.10.2014
 */
public class GenericVersionLabellingService
implements IVersionLabellingService {

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.client.IVersionLabellingService
	 * #getLabel(de.ubt.ai1.supermod.mm.core.OptionBinding, 
	 * de.ubt.ai1.supermod.mm.core.VersionSpace)
	 */
	@Override
	public String getLabel(OptionBinding ob, VersionSpace vs, 
			boolean ambition) {
		String s = "";
		for (Entry<Option, Tristate> e : ob.getBoundOptions()) {
			if (e.getValue() != Tristate.UNKNOWN) {
				if (e.getValue() == Tristate.FALSE) {
					s += "not ";
				}
				s += e.getKey().getName() + ", ";
			}
		}
		if (s.endsWith(", ")) {
			s = s.substring(0, s.length() - 2);
		}
		return s;
	}

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.client.IVersionLabellingService
	 * #getLabel(de.ubt.ai1.supermod.mm.core.OptionExpr,
	 * de.ubt.ai1.supermod.mm.core.VersionSpace)
	 */
	@Override
	public String getLabel(OptionExpr expr, VersionSpace vs) {
		if (expr == null) {
			return null;
		}
		expr = expr.extract();
		if (expr == null || expr.getReferencedOptions().isEmpty()) {
			return null;
		}
		String result = OptionLangUtil.serialize(expr, vs);
		result = result.replaceAll("not not ", "");
		return result;
	}

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.client.IVersionLabellingService
	 * #getDefaultLabel()
	 */
	@Override
	public String getDefaultLabel() {
		return "true";
	}

}
