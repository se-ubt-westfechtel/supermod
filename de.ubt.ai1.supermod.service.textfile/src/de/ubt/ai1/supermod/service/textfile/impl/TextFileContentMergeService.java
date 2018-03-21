/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/

package de.ubt.ai1.supermod.service.textfile.impl;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;

import com.google.inject.Inject;

import de.ubt.ai1.supermod.mm.core.ProductDimension;
import de.ubt.ai1.supermod.mm.core.VisibilityForest;
import de.ubt.ai1.supermod.mm.diff.MatchingRole;
import de.ubt.ai1.supermod.mm.diff.ProductDimensionMatching;
import de.ubt.ai1.supermod.mm.diff.ProductSpaceElementMatching;
import de.ubt.ai1.supermod.mm.file.VersionedFileContent;
import de.ubt.ai1.supermod.mm.list.VersionedList;
import de.ubt.ai1.supermod.mm.textfile.SuperModTextfileFactory;
import de.ubt.ai1.supermod.mm.textfile.TextFileContent;
import de.ubt.ai1.supermod.mm.textfile.TextLine;
import de.ubt.ai1.supermod.service.IVisibilityMergeService;
import de.ubt.ai1.supermod.service.file.IVersionedFileContentMergeService;
import de.ubt.ai1.supermod.service.generic.MatchUtil;
import de.ubt.ai1.supermod.service.generic.MergeUtil;
import de.ubt.ai1.supermod.service.generic.MergeUtil.PropertyAccessor;
import de.ubt.ai1.supermod.service.list.ListMergeUtil;

/**
 * Implementation of the file content merge service interface specific to the
 * file content type 'plain text'.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	30.07.2014
 */
public class TextFileContentMergeService 
implements IVersionedFileContentMergeService {
	
	@Inject
	private IVisibilityMergeService visibilityMergeService;
	
	private VisibilityForest visibilityForest;

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.file.IVersionedFileContentMergeService
	 * #start(de.ubt.ai1.supermod.mm.diff.ProductDimensionMatching, 
	 * de.ubt.ai1.supermod.mm.core.VisibilityForest)
	 */
	@Override
	public void start(ProductDimensionMatching pdMatching,
			VisibilityForest visibilityForest) {
		this.visibilityForest = visibilityForest;
	}

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.file.IVersionedFileContentMergeService
	 * #canMerge(de.ubt.ai1.supermod.mm.diff.ProductSpaceElementMatching)
	 */
	@Override
	public boolean canMerge(ProductSpaceElementMatching fileMatching) {
		return MatchUtil.allInstanceOf(MergeUtil.filterMatching(fileMatching, 
				VersionedFileContent.class), TextFileContent.class);
	}

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.file.IVersionedFileContentMergeService
	 * #merge(de.ubt.ai1.supermod.mm.diff.ProductSpaceElementMatching, 
	 * de.ubt.ai1.supermod.mm.diff.MatchingRole)
	 */
	@Override
	public TextFileContent mergeOutPlace(ProductSpaceElementMatching 
			fileContentMatching, MatchingRole mergeRole) {
		TextFileContent mergedContent = SuperModTextfileFactory.eINSTANCE
				.createTextFileContent();
		MergeUtil.addMergeRole(fileContentMatching, mergeRole, mergedContent);
		MergeUtil.updateTransactionId(fileContentMatching, mergedContent,
				mergeRole);
		List<ProductSpaceElementMatching> elementMatchings = new ArrayList<>();
		for (ProductSpaceElementMatching subMatching : fileContentMatching
				.getSubMatchings()) {
			if (!MergeUtil.filterMatching(subMatching, TextLine.class)
					.isEmpty()) {
				elementMatchings.add(subMatching);
				mergeLineOutPlace(subMatching, mergedContent, mergeRole);
			}
		}
		for (ProductSpaceElementMatching subMatching : fileContentMatching
				.getSubMatchings()) {
			if (!MergeUtil.filterMatching(subMatching, VersionedList.class)
					.isEmpty()) {
				mergeLineOrderingOutPlace(subMatching, mergedContent,
						elementMatchings, mergeRole);
			}
		}
		return mergedContent;
	}

	/**
	 * Merges the base set of lines and adds it to the merged plain text file
	 * content.
	 *
	 * @param lineMatching
	 * @param mergedContent
	 * @param mergeRole
	 */
	private void mergeLineOutPlace(ProductSpaceElementMatching lineMatching,
			TextFileContent mergedContent, MatchingRole mergeRole) {
		EList<TextLine> lines = MergeUtil.filterMatching(lineMatching, 
				TextLine.class);
		if (lines.isEmpty()) return;
		TextLine mergedLine = createMergedLine(lines);
		MergeUtil.addMergeRole(lineMatching, mergeRole, mergedLine);	
		MergeUtil.updateTransactionId(lineMatching, mergedLine, mergeRole);
		mergedContent.getLines().add(mergedLine);
	}

	/**
	 * Merges the order of the text lines defined within the multiple versions
	 * of text files in-place, based on the merged base element set.
	 *
	 * @param orderingMatching
	 * @param mergedContent
	 * @param elementMatchings
	 * @param mergeRole
	 */
	private void mergeLineOrderingOutPlace(ProductSpaceElementMatching orderingMatching,
			TextFileContent mergedContent, List<ProductSpaceElementMatching> 
			elementMatchings, MatchingRole mergeRole) {
		VersionedList mergedLineOrdering = 
				ListMergeUtil.mergeVersionedListOutPlace( 
				orderingMatching, elementMatchings, mergeRole, 
				visibilityForest, visibilityMergeService);
		if (mergedLineOrdering != null) {
			mergedContent.setLineOrdering(mergedLineOrdering);
		}
	}

	/**
	 * Merges different versions of identical text lines, which must all
	 * contain the same text, into one merged text line.
	 *
	 * @param lines
	 * @return the merged text line.
	 */
	private TextLine createMergedLine(EList<TextLine> lines) {
		TextLine mergedLine = SuperModTextfileFactory.eINSTANCE
				.createTextLine();
		MergeUtil.setVisibility(lines, mergedLine, 
				visibilityForest, visibilityMergeService);
		mergedLine.setText(MergeUtil.getUnique(lines, 
				new PropertyAccessor<TextLine, String>() {
			@Override
			public String getProperty(TextLine v) {
				return v.getText();
			}
		}));
		return mergedLine;
	}

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.file.IVersionedFileContentMergeService
	 * #mergeInPlace(de.ubt.ai1.supermod.mm.diff.ProductSpaceElementMatching,
	 * de.ubt.ai1.supermod.mm.diff.MatchingRole)
	 */
	@Override
	public void mergeInPlace(ProductSpaceElementMatching fileContentMatching,
			MatchingRole masterRole) {
		TextFileContent masterContent = null;
		if (fileContentMatching.getMatchedElement(masterRole) != null) {
			masterContent = (TextFileContent) fileContentMatching
					.getMatchedElement(masterRole).getElement();
		}
		if (masterContent == null) {
			mergeOutPlace(fileContentMatching, masterRole);
			return;
		}
		List<ProductSpaceElementMatching> elementMatchings = new ArrayList<>();
		for (ProductSpaceElementMatching subMatching : fileContentMatching
				.getSubMatchings()) {
			if (!MergeUtil.filterMatching(subMatching, TextLine.class)
					.isEmpty()) {
				TextLine masterLine = null;
				if (subMatching.getMatchedElement(masterRole) != null) {
					masterLine = (TextLine) subMatching
							.getMatchedElement(masterRole).getElement();
				}
				if (masterLine == null) {
					mergeLineOutPlace(subMatching, masterContent, masterRole);
				}
				elementMatchings.add(subMatching);
			}
		}
		for (ProductSpaceElementMatching subMatching : fileContentMatching
				.getSubMatchings()) {
			if (!MergeUtil.filterMatching(subMatching, VersionedList.class)
					.isEmpty()) {
				VersionedList masterOrdering = null;
				if (subMatching.getMatchedElement(masterRole) != null) {
					masterOrdering = (VersionedList) subMatching
							.getMatchedElement(masterRole).getElement();
				}
				if (masterOrdering == null) {
					mergeLineOrderingOutPlace(subMatching, masterContent, 
							elementMatchings, masterRole);
				}
				else {
					mergeLineOrderingInPlace(masterOrdering,
							subMatching, masterContent, 
							elementMatchings, masterRole);
				}
			}
		}
	}
	
	/**
	 * Merges the order of the text lines defined within the multiple versions
	 * of text files out-place, based on the merged base element set.
	 *
	 * @param masterOrdering the existing master ordering to be completed by
	 * 			in-place merging
	 * @param orderingMatching
	 * @param mergedContent
	 * @param elementMatchings
	 * @param mergeRole
	 */
	private void mergeLineOrderingInPlace(VersionedList masterOrdering,
			ProductSpaceElementMatching orderingMatching,
			TextFileContent masterContent, List<ProductSpaceElementMatching> 
			elementMatchings, MatchingRole masterRole) {
		ListMergeUtil.mergeVersionedListInPlace(masterOrdering,
				orderingMatching, elementMatchings, masterRole, 
				visibilityForest, visibilityMergeService);
	}
	
	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.file.IVersionedFileContentMergeService
	 * #finish(de.ubt.ai1.supermod.mm.core.ProductDimension)
	 */
	@Override
	public void finish(ProductDimension mergedDimension) {
		this.visibilityForest = null;		
	}

}
