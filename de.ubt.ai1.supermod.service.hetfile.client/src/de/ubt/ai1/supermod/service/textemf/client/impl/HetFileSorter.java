/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.service.textemf.client.impl;

import java.util.ArrayList;
import java.util.List;

import de.ubt.ai1.supermod.mm.file.client.SingleVersionFileDescriptor;
import de.ubt.ai1.supermod.service.file.client.IFileSorter;

/**
 * An implementation of the file sorter interface specific to a combination
 * of EMF and text files. It defines the following priorities:
 * 1. Ecore metamodels.
 * 2. text files or model instances.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	14.08.2014
 */
public class HetFileSorter implements IFileSorter {

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.file.client.IFileSorter
	 * #sortFiles(java.util.List)
	 */
	@Override
	public List<SingleVersionFileDescriptor> sortFiles(
			List<SingleVersionFileDescriptor> fileList) {
		List<SingleVersionFileDescriptor> sortedList = 
				new ArrayList<>(fileList);
		sortedList.sort((SingleVersionFileDescriptor desc1, 
				SingleVersionFileDescriptor desc2) -> {
					if (desc1.getName().endsWith(".ecore") &&
							!desc2.getName().endsWith(".ecore")) {
						return -1;
					}
					if (!desc1.getName().endsWith(".ecore") &&
							desc2.getName().endsWith(".ecore")) {
						return 1;
					}
					return 0;
				});
		return sortedList;		
	}

}
