/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.service.file.client;

import java.util.List;

import de.ubt.ai1.supermod.mm.file.client.SingleVersionFileDescriptor;

/**
 * Service interface for sorting the contents of files of a versioned file
 * system according to a specific criteria.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	13.08.2014
 */
public interface IFileSorter {

	/**
	 * To be implemented in order to sort the files by priority. Their contents
	 * will be transformed in the specified order.
	 *
	 * @param fileList
	 * @return the versioned file list, which contains the same files than
	 * 		<code>fileList</code>, but in an order that meets the specific
	 * 		sorting criteria.
	 */
	public List<SingleVersionFileDescriptor> sortFiles(
			List<SingleVersionFileDescriptor> fileList);

}
