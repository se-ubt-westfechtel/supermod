/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/

package de.ubt.ai1.supermod.service.emffile.client;

/**
 * Service interface for the mapping between internal and external UUIDs. The
 * internal UUID of an EMF object is implemented as a field of the class
 * {@link de.ubt.ai1.supermod.mm.emffile.EMFObject}. The external UUID of an
 * object is specified by its corresponding XMI resource. The mapping between
 * internal and external UUID should be implemented as a bijective function that
 * requires no additional data storage.  UUID converters are not applied for
 * pseudo UUIDs.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	31.07.2014
 */
public interface IUUIDConverter {

	/**
	 * Converts an external UUID to an internal UUID.
	 *
	 * @param externalUUID
	 * @return the corresponding internal UUID.
	 */
	public String convertExternalToInternalUUID(String externalUUID);

	/**
	 * Converts an internal UUID to an external UUID.
	 *
	 * @param internalUUID
	 * @return the corresponding external UUID.
	 */
	public String convertInternalToExternalUUID(String internalUUID);

}