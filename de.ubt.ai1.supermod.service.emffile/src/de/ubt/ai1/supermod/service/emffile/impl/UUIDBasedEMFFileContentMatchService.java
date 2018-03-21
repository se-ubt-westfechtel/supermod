/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/

package de.ubt.ai1.supermod.service.emffile.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import de.ubt.ai1.supermod.mm.diff.MatchedProductSpaceElement;
import de.ubt.ai1.supermod.mm.diff.MatchingRole;
import de.ubt.ai1.supermod.mm.diff.ProductDimensionMatching;
import de.ubt.ai1.supermod.mm.diff.ProductSpaceElementMatching;
import de.ubt.ai1.supermod.mm.emffile.EMFAttributeValue;
import de.ubt.ai1.supermod.mm.emffile.EMFClassRef;
import de.ubt.ai1.supermod.mm.emffile.EMFExternalReferenceValue;
import de.ubt.ai1.supermod.mm.emffile.EMFFeatureRef;
import de.ubt.ai1.supermod.mm.emffile.EMFFileContent;
import de.ubt.ai1.supermod.mm.emffile.EMFInternalReferenceValue;
import de.ubt.ai1.supermod.mm.emffile.EMFObject;
import de.ubt.ai1.supermod.mm.emffile.EMFValue;
import de.ubt.ai1.supermod.mm.file.VersionedFileContent;
import de.ubt.ai1.supermod.mm.list.VersionedList;
import de.ubt.ai1.supermod.service.file.IVersionedFileContentMatchService;
import de.ubt.ai1.supermod.service.generic.MatchUtil;
import de.ubt.ai1.supermod.service.generic.MatchUtil.KeyMatchFunction;
import de.ubt.ai1.supermod.service.list.ListMatchUtil;

/**
 * An implementation of the file content match service specific to EMF files.
 * It matches EMF objects on the basis of UUIDs. Structural features, classes
 * and values are matched on the basis of their hierarchical names.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	30.07.2014
 */
public class UUIDBasedEMFFileContentMatchService
implements IVersionedFileContentMatchService {
	
	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.file.IVersionedFileContentMatchService
	 * #start(java.util.Collection)
	 */
	@Override
	public void start(Collection<MatchingRole> roles) {		
	}
	
	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.file.
	 * IVersionedFileContentMatchService#canMatch(java.util.Collection)
	 */
	@Override
	public boolean canMatch(Collection<VersionedFileContent> 
	versionedFileContents) {
		// all operands must be EMF file contents.
		return MatchUtil.allInstanceOf(versionedFileContents, 
				EMFFileContent.class);
	}

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.file.IVersionedFileContentMatchService
	 * #matchFiles(java.util.Collection, 
	 * de.ubt.ai1.supermod.mm.diff.ProductDimensionMatching, 
	 * Java.util.Collection)
	 */
	@Override
	public Collection<ProductSpaceElementMatching> matchFiles(
			Collection<VersionedFileContent> versionedFileContents,
			ProductDimensionMatching pdMatching, 
			Collection<MatchingRole> matchingRoles) {
		// match EMF objects and their contents.
		return matchObjects(MatchUtil.castAll(versionedFileContents, 
				EMFFileContent.class), matchingRoles);
	}
	
	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.file.IVersionedFileContentMatchService
	 * #finish(de.ubt.ai1.supermod.mm.diff.ProductDimensionMatching)
	 */
	@Override
	public void finish(ProductDimensionMatching pdMatching) {		
	}

	/**
	 * Matches the EMF objects contained in the specified versions of EMF file
	 * contents, and inserts the matching into the parent file content 
	 * matching. The content of each EMF object is matched accordingly.
	 *
	 * @param contents
	 * @param matchingRoles
	 * @return a list of element matchings which describes the matching of
	 * 			the specified EMF objects and their contents.
	 */
	private Collection<ProductSpaceElementMatching> matchObjects(
			Collection<EMFFileContent> contents,
			Collection<MatchingRole> matchingRoles) {
		List<List<EMFObject>> objectMtx = new ArrayList<>();
		for (EMFFileContent content : contents) {
			objectMtx.add(content.getObjects());
		}
		List<ProductSpaceElementMatching> objectMatchings = MatchUtil
				.matchElementSet(objectMtx, 
				new KeyMatchFunction<String, EMFObject>() {
			@Override
			public String getKey(EMFObject value) {
				return value.getUuid();
			}
		}, matchingRoles);
		for (ProductSpaceElementMatching objectMatching : objectMatchings) {
			// match contained class and feature references.
			matchClassRefs(objectMatching, matchingRoles);
			matchFeatureRefs(objectMatching, matchingRoles);
		}
		return objectMatchings;
	}

	/**
	 * Matches the EMF class references contained in the specified versions of
	 * EMF objects, and inserts the matching into the parent EMF object
	 * matching.
	 *
	 * @param objectMatching
	 * @param matchingRoles
	 */
	private void matchClassRefs(ProductSpaceElementMatching objectMatching,
			Collection<MatchingRole> matchingRoles) {
		List<List<EMFClassRef>> classMtx = new ArrayList<>();
		for (MatchedProductSpaceElement me : objectMatching
				.getMatchedElements()) {
			if (me.getElement() instanceof EMFObject) {
				classMtx.add(((EMFObject) me.getElement()).getClassRefs());
			}
		}
		List<ProductSpaceElementMatching> classMatchings = MatchUtil
				.matchElementSet(classMtx, 
				new KeyMatchFunction<String, EMFClassRef>() {
			@Override
			public String getKey(EMFClassRef value) {				
				return value.getPackageUri() + "#/" + value.getClassName();
			}
		}, matchingRoles);
		objectMatching.getSubMatchings().addAll(classMatchings);	
	}

	/**
	 * Matches the EMF feature references contained in the specified versions
	 * of EMF objects and inserts the matching into the parent EMF object
	 * matching. The content of each EMF feature reference, i.e., the values,
	 * is matched accordingly.
	 *
	 * @param objectMatching
	 * @param matchingRoles
	 */
	private void matchFeatureRefs(ProductSpaceElementMatching objectMatching,
			Collection<MatchingRole> matchingRoles) {
		List<List<EMFFeatureRef>> featureMtx = new ArrayList<>();
		for (MatchedProductSpaceElement me : objectMatching
				.getMatchedElements()) {
			if (me.getElement() instanceof EMFObject) {
				featureMtx.add(((EMFObject) me.getElement()).getFeatureRefs());
			}
		}
		List<ProductSpaceElementMatching> featureMatchings = MatchUtil
				.matchElementSet(featureMtx, 
				new KeyMatchFunction<String, EMFFeatureRef>() {
			@Override
			public String getKey(EMFFeatureRef value) {
				return value.getFeatureName();
			}
		}, matchingRoles);
		objectMatching.getSubMatchings().addAll(featureMatchings);
		for (ProductSpaceElementMatching featureMatching : featureMatchings) {
			matchValues(featureMatching, matchingRoles);
		}
	}

	/**
	 * Matches the EMF values and their order contained in the specified
	 * versions of EMF feature references and inserts the matching into the
	 * parent EMF feature reference matching.
	 *
	 * @param featureMatching
	 * @param matchingRoles
	 */
	private void matchValues(ProductSpaceElementMatching featureMatching,
			Collection<MatchingRole> matchingRoles) {
		List<EMFFeatureRef> featureRefs = new ArrayList<>();
		List<List<EMFValue>> valueMtx = new ArrayList<>();
		for (MatchedProductSpaceElement me : featureMatching
				.getMatchedElements()) {
			if (me.getElement() instanceof EMFFeatureRef) {
				featureRefs.add((EMFFeatureRef) me.getElement());
				valueMtx.add(((EMFFeatureRef) me.getElement()).getValues());
			}
		}
		List<ProductSpaceElementMatching> valueMatchings = MatchUtil
				.matchElementSet(valueMtx, 
				new KeyMatchFunction<String, EMFValue>() {
			@Override
			public String getKey(EMFValue value) {
				if (value instanceof EMFAttributeValue) {
					return ((EMFAttributeValue) value).getLiteral();
				}
				if (value instanceof EMFInternalReferenceValue) {
					EMFInternalReferenceValue irv = 
							(EMFInternalReferenceValue) value;
					if (irv.isProxy()) {
						return irv.getProxyUUID();
					}
					else if (irv.getReferencedObject() == null) {
						return null;
					}
					return ((EMFInternalReferenceValue) value)
							.getReferencedObject().getUuid();
				}
				if (value instanceof EMFExternalReferenceValue) {
					return ((EMFExternalReferenceValue) value).getEObjectUri();
				}
				return null;
			}
		}, matchingRoles);
		featureMatching.getSubMatchings().addAll(valueMatchings);		

		// match the ordering.
		List<VersionedList> valueOrderingMtx = new ArrayList<>();
		for(EMFFeatureRef feat : featureRefs) {
			if (feat.getValueOrdering() != null) {
				valueOrderingMtx.add(feat.getValueOrdering());
			}
		}
		ProductSpaceElementMatching valueOrderingMatching = ListMatchUtil
				.matchVersionedList(
				valueOrderingMtx, valueMatchings, matchingRoles);
		if (valueOrderingMatching != null) {
			featureMatching.getSubMatchings().add(valueOrderingMatching);
		}
		return;
	}

}
