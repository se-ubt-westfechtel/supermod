/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/

/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/

package de.ubt.ai1.supermod.service.textfile.client.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import de.ubt.ai1.supermod.mm.client.ProductConflict;
import de.ubt.ai1.supermod.mm.file.VersionedFileContent;
import de.ubt.ai1.supermod.mm.list.VersionedList;
import de.ubt.ai1.supermod.mm.textfile.TextFileContent;
import de.ubt.ai1.supermod.mm.textfile.TextLine;
import de.ubt.ai1.supermod.service.file.client.IVersionedFileContentValidationService;
import de.ubt.ai1.supermod.service.list.client.ListValidationUtil;

/**
 * An implementation of the versioned file import validation service specific to
 * the file content type 'plain text'. It validates the line order represented
 * by the text file.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	31.07.2014
 */
public class TextFileContentValidationService 
implements IVersionedFileContentValidationService {

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.file.client.
	 * IVersionedFileContentValidationService#start()
	 */
	@Override
	public void start() { 		
	}

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.file.client.
	 * IVersionedFileContentValidationService#lex(
	 * de.ubt.ai1.supermod.file.VersionedFileContent)
	 */
	@Override
	public boolean lex(VersionedFileContent fileContent) {
		return fileContent instanceof TextFileContent;
	}

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.file.client.
	 * IVersionedFileContentValidationService#compile(
	 * de.ubt.ai1.supermod.file.VersionedFileContent)
	 */
	@Override
	public Collection<ProductConflict> compile(
			VersionedFileContent fileContent) {
		Collection<ProductConflict> conflicts = new ArrayList<>();
		conflicts.addAll(validateContent((TextFileContent) fileContent));
		for (TextLine line : ((TextFileContent) fileContent).getLines()) {
			conflicts.addAll(validateLine(line));
		}
		conflicts.addAll(validateLineOrdering((
				(TextFileContent) fileContent).getLineOrdering()));
		return conflicts;
	}

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.file.client.
	 * IVersionedFileContentValidationService#link(
	 * de.ubt.ai1.supermod.file.VersionedFileContent, java.util.Collection)
	 */
	@Override
	public void link(VersionedFileContent fileContent, 
			Collection<ProductConflict> conflicts) {		
	}

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.file.client.
	 * IVersionedFileContentValidationService#finish()
	 */
	@Override
	public void finish() {
	}	

	/**
	 * Validates the content of a versioned text file.
	 *
	 * @param fileContent
	 * @return product conflicts detected within the file content.
	 */
	private Collection<? extends ProductConflict> validateContent(
			VersionedFileContent fileContent) {
		return Collections.emptyList();
	}

	/**
	 * Validates a text line.
	 *
	 * @param line
	 * @return detected conflicts.
	 */
	private Collection<? extends ProductConflict> validateLine(TextLine line) {
		return Collections.emptyList();
	}

	/**
	 * Validates the line order.
	 * 
	 * @see ListValidationUtil#validateOrdering(VersionedList)
	 *
	 * @param lineOrdering
	 * @return detected conflicts.
	 */
	private Collection<? extends ProductConflict> validateLineOrdering(
			VersionedList lineOrdering) {
		return ListValidationUtil.validateOrdering(lineOrdering);
	}

}
