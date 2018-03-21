/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/

package de.ubt.ai1.supermod.service.emffile.client.impl;

import de.ubt.ai1.supermod.service.emffile.client.IUUIDConverter;

/**
 * An implementation of the UUID converter service interface which transforms
 * an external UUID into an internal UUID by reversing the corresponding string
 * and putting it between square brackets. The reverse transformation is defined
 * adequately. UUID converters are not applied for pseudo UUIDs.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	31.07.2014
 */
public class ReverseBracketingUUIDConverter implements IUUIDConverter {
	
	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.emffile.client.IUUIDConverter
	 * #convertExternalToInternalUUID(java.lang.String)
	 */
	@Override
	public String convertExternalToInternalUUID(String externalUUID) {
		String reverse = reverse(externalUUID);
		if (reverse == null) return "[]";
		return "[" + reverse + "]";
	}
	
	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.emffile.client.IUUIDConverter
	 * #convertInternalToExternalUUID(java.lang.String)
	 */
	@Override
	public String convertInternalToExternalUUID(String internalUUID) {
		String reverse = reverse(internalUUID);
		if (reverse == null || reverse.length() < 2 ||
				!reverse.startsWith("]") || !reverse.endsWith("[")) {
			return null;
		}
		return reverse.substring(1, internalUUID.length() - 1);
	}
	
	/**
	 * Reverses a string.
	 *
	 * @param s
	 * @return the reverse of <code>s</code>.
	 */
	private String reverse(String s) {
		if (s == null) return null;
		return new StringBuilder(s).reverse().toString();
	}

}
