/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/

package de.ubt.ai1.supermod.service.textfile.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import de.ubt.ai1.supermod.mm.diff.MatchingRole;
import de.ubt.ai1.supermod.mm.diff.ProductDimensionMatching;
import de.ubt.ai1.supermod.mm.diff.ProductSpaceElementMatching;
import de.ubt.ai1.supermod.mm.file.VersionedFileContent;
import de.ubt.ai1.supermod.mm.list.VersionedList;
import de.ubt.ai1.supermod.mm.textfile.TextFileContent;
import de.ubt.ai1.supermod.mm.textfile.TextLine;
import de.ubt.ai1.supermod.service.file.IVersionedFileContentMatchService;
import de.ubt.ai1.supermod.service.generic.MatchUtil;
import de.ubt.ai1.supermod.service.generic.MatchUtil.KeyMatchFunction;
import de.ubt.ai1.supermod.service.list.ListMatchUtil;

/**
 * Implementation of the file content match service interface specific to the
 * file content type 'plain text'.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	30.07.2014
 */
public class TextFileContentMatchService 
implements IVersionedFileContentMatchService {

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.file.IVersionedFileContentMatchService
	 * #start(java.util.Collection)
	 */
	@Override
	public void start(Collection<MatchingRole> roles) {		
	}

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.file.IVersionedFileContentMatchService
	 * #canMatch(java.util.Collection)
	 */
	@Override
	public boolean canMatch(
			Collection<VersionedFileContent> versionedFileContents) {
		// all file contents must be plain text file contents.
		return MatchUtil.allInstanceOf(versionedFileContents, 
				TextFileContent.class);
	}

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.file.IVersionedFileContentMatchService
	 * #matchFiles(java.util.Collection, 
	 * de.ubt.ai1.supermod.mm.diff.ProductDimensionMatching, 
	 * java.util.Collection)
	 */
	@Override
	public Collection<ProductSpaceElementMatching> matchFiles(
			Collection<VersionedFileContent> versionedFileContents,
			ProductDimensionMatching pdMatching,
			Collection<MatchingRole> roles) {
		return matchLines(MatchUtil.castAll(versionedFileContents, 
				TextFileContent.class), pdMatching, roles);
	}

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.file.IVersionedFileContentMatchService
	 * #finish(de.ubt.ai1.supermod.mm.diff.ProductDimensionMatching)
	 */
	@Override
	public void finish(ProductDimensionMatching pdMatching) {
	}

	/**
	 * Performs a matching of the contents of a text file by comparing both
	 * the base set of text line and their mutual order.
	 *
	 * @param contents contents of different versions of the same text file.
	 * @param pdMatching the superordinate dimension matching.
	 * @param roles
	 * @return a collection of matching that contains both the matching for the
	 * 			base set of elements and the order matching.
	 */
	private Collection<ProductSpaceElementMatching> matchLines(
			Collection<TextFileContent> contents, 
			ProductDimensionMatching pdMatching,
			Collection<MatchingRole> roles) {
		
		// match the base set of lines.
		List<List<TextLine>> lineMtx = new ArrayList<>();
		for (TextFileContent res : contents) {
			lineMtx.add(res.getLines());
		}
		List<ProductSpaceElementMatching> lineMatchings = 
				MatchUtil.matchElementSet(lineMtx, 
				new KeyMatchFunction<String, TextLine>() {
			@Override
			public String getKey(TextLine value) {
				return value.getText();
			}
		}, roles);
		
		// match the line ordering.
		List<VersionedList> lineOrderingMtx = new ArrayList<>();
		for(TextFileContent res : contents) {
			if (res.getLineOrdering() != null) {
				lineOrderingMtx.add(res.getLineOrdering());
			}
		}
		ProductSpaceElementMatching lineOrderingMatching = 
				ListMatchUtil.matchVersionedList(
				lineOrderingMtx, lineMatchings, roles);
		if (lineOrderingMatching != null) {
			lineMatchings.add(lineOrderingMatching);
		}
		return lineMatchings;
	}
	
}
