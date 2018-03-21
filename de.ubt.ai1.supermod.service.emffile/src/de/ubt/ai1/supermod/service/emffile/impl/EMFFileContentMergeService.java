/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/

package de.ubt.ai1.supermod.service.emffile.impl;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;

import com.google.inject.Inject;

import de.ubt.ai1.supermod.mm.core.ProductDimension;
import de.ubt.ai1.supermod.mm.core.VisibilityForest;
import de.ubt.ai1.supermod.mm.diff.MatchingRole;
import de.ubt.ai1.supermod.mm.diff.ProductDimensionMatching;
import de.ubt.ai1.supermod.mm.diff.ProductSpaceElementMatching;
import de.ubt.ai1.supermod.mm.emffile.EMFAttributeValue;
import de.ubt.ai1.supermod.mm.emffile.EMFClassRef;
import de.ubt.ai1.supermod.mm.emffile.EMFContainmentReferenceValue;
import de.ubt.ai1.supermod.mm.emffile.EMFExternalReferenceValue;
import de.ubt.ai1.supermod.mm.emffile.EMFFeatureRef;
import de.ubt.ai1.supermod.mm.emffile.EMFFileContent;
import de.ubt.ai1.supermod.mm.emffile.EMFInternalReferenceValue;
import de.ubt.ai1.supermod.mm.emffile.EMFObject;
import de.ubt.ai1.supermod.mm.emffile.EMFValue;
import de.ubt.ai1.supermod.mm.emffile.SuperModEMFFileFactory;
import de.ubt.ai1.supermod.mm.file.VersionedFileContent;
import de.ubt.ai1.supermod.mm.list.SuperModListFactory;
import de.ubt.ai1.supermod.mm.list.VersionedList;
import de.ubt.ai1.supermod.service.IVisibilityMergeService;
import de.ubt.ai1.supermod.service.file.IVersionedFileContentMergeService;
import de.ubt.ai1.supermod.service.generic.MatchUtil;
import de.ubt.ai1.supermod.service.generic.MergeUtil;
import de.ubt.ai1.supermod.service.generic.MergeUtil.PropertyAccessor;
import de.ubt.ai1.supermod.service.list.ListMergeUtil;

/**
 * Implementation of the versioned file content merge service specific to the
 * file content type 'EMF file'.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	30.07.2014
 */
public class EMFFileContentMergeService 
implements IVersionedFileContentMergeService {
	
	@Inject
	private IVisibilityMergeService visibilityMergeService;
	
	protected VisibilityForest visibilityForest;
	
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
	public boolean canMerge(ProductSpaceElementMatching fileContentMatching) {
		// this merge service can only handle EMF file contents.
		return MatchUtil.allInstanceOf(MergeUtil.filterMatching(
				fileContentMatching, VersionedFileContent.class), 
				EMFFileContent.class);
	}

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.file.IVersionedFileContentMergeService
	 * #merge(de.ubt.ai1.supermod.mm.diff.ProductSpaceElementMatching, 
	 * de.ubt.ai1.supermod.mm.diff.MatchingRole)
	 */
	@Override
	public EMFFileContent mergeOutPlace(ProductSpaceElementMatching 
			fileContentMatching, MatchingRole mergeRole) {
		EList<EMFFileContent> matchedContents = MergeUtil.filterMatching(
				fileContentMatching, EMFFileContent.class);
		EMFFileContent mergedContent = createMergedEMFContent(matchedContents);
		MergeUtil.addMergeRole(fileContentMatching, mergeRole, mergedContent);
		MergeUtil.updateTransactionId(fileContentMatching, mergedContent,
				mergeRole);
		for (ProductSpaceElementMatching subMatching : fileContentMatching
				.getSubMatchings()) {
			mergeObjectOutPlace(subMatching, mergedContent, mergeRole);
		}
		return mergedContent;
	}
	
	/**
	 * Creates a merged EMF content with a merged visibility.
	 *
	 * @param contents
	 * @return
	 */
	private EMFFileContent createMergedEMFContent(
			EList<EMFFileContent> contents) {
		EMFFileContent mergedContent = SuperModEMFFileFactory.eINSTANCE
				.createEMFFileContent();
		MergeUtil.setVisibility(contents, mergedContent, visibilityForest, 
				visibilityMergeService);		
		return mergedContent;
	}

	/**
	 * Out-place merges several matching objects, which are described by an 
	 * element matching, into one merged EMF object, which is inserted into the
	 * specified merged EMF file content.
	 *
	 * @param objectMatching
	 * @param mergedContent
	 * @param mergeRole
	 */
	private void mergeObjectOutPlace(ProductSpaceElementMatching objectMatching, 
			EMFFileContent mergedContent, MatchingRole mergeRole) {
		EList<EMFObject> objects = MergeUtil.filterMatching(objectMatching, 
				EMFObject.class);
		if (objects.isEmpty()) return;
		EMFObject mergedObject = createMergedObject(objects);
		MergeUtil.addMergeRole(objectMatching, mergeRole, mergedObject);
		MergeUtil.updateTransactionId(objectMatching, mergedObject, mergeRole);
		// merge classes and features.
		if (mergedObject != null) {
			mergedContent.getObjects().add(mergedObject);
			for (ProductSpaceElementMatching subMatching : objectMatching
					.getSubMatchings()) {
				mergeClassRefOutPlace(subMatching, mergedObject, mergeRole);
				mergeFeatureRefOutPlace(subMatching, mergedObject, mergeRole);
			}
		}
	}	

	/**
	 * Creates a merged EMF object with a merged visibility and UUID.
	 *
	 * @param objects
	 * @return
	 */
	private EMFObject createMergedObject(EList<EMFObject> objects) {
		EMFObject mergedObject = SuperModEMFFileFactory.eINSTANCE
				.createEMFObject();
		MergeUtil.setVisibility(objects, mergedObject, visibilityForest, 
				visibilityMergeService);
		mergedObject.setUuid(MergeUtil.getUnique(objects, 
				new PropertyAccessor<EMFObject, String>() {
			@Override
			public String getProperty(EMFObject v) {
				return v.getUuid();
			}
		}));
		return mergedObject;
	}

	/**
	 * Out-place merges several matching class references, which are described
	 * by an element matching, into one merged EMF class reference, which is 
	 * inserted into the specified merged EMF object.
	 *
	 * @param classRefMatching
	 * @param mergedObject
	 * @param mergeRole
	 */
	private void mergeClassRefOutPlace(ProductSpaceElementMatching classRefMatching,
			EMFObject mergedObject, MatchingRole mergeRole) {
		EList<EMFClassRef> classRefs = MergeUtil.filterMatching(
				classRefMatching, EMFClassRef.class);
		if (classRefs.isEmpty()) return;
		EMFClassRef mergedClassRef = createMergedClassRef(classRefs);
		MergeUtil.addMergeRole(classRefMatching, mergeRole, mergedClassRef);
		MergeUtil.updateTransactionId(classRefMatching, mergedClassRef, 
				mergeRole);
		if (mergedClassRef != null) {
			mergedObject.getClassRefs().add(mergedClassRef);
		}		
	}

	/**
	 * Creates a merged EMF class reference, which is either an external class
	 * reference or an internal class reference proxy, depending on the given
	 * inputs.
	 *
	 * @param classRefs
	 * @return
	 */
	private EMFClassRef createMergedClassRef(EList<EMFClassRef> classRefs) {
		EMFClassRef mergedClassRef = SuperModEMFFileFactory
				.eINSTANCE.createEMFClassRef();
		MergeUtil.setVisibility(classRefs, mergedClassRef, visibilityForest, 
				visibilityMergeService);
		mergedClassRef.setPackageUri(MergeUtil.getUnique(classRefs, 
				new PropertyAccessor<EMFClassRef, String>() {
			@Override
			public String getProperty(EMFClassRef v) {
				return v.getPackageUri();
			}
		}));
		mergedClassRef.setClassName(MergeUtil.getUnique(classRefs, 
				new PropertyAccessor<EMFClassRef, String>() {
			@Override
			public String getProperty(EMFClassRef v) {
				return v.getClassName();
			}
		}));
		return mergedClassRef;
	}

	/**
	 * Out-place merges several matching feature references, which are described
	 * by an element matching, into one merged EMF feature reference, which is 
	 * inserted into the specified merged EMF object.
	 *
	 * @param classRefs
	 */
	private void mergeFeatureRefOutPlace(ProductSpaceElementMatching featureRefMatching,
			EMFObject mergedObject, MatchingRole mergeRole) {
		EList<EMFFeatureRef> featureRefs = MergeUtil.filterMatching(
				featureRefMatching, EMFFeatureRef.class);
		if (featureRefs.isEmpty()) return;
		EMFFeatureRef mergedFeatureRef = createMergedFeatureRef(featureRefs);
		MergeUtil.addMergeRole(featureRefMatching, mergeRole, mergedFeatureRef);
		MergeUtil.updateTransactionId(featureRefMatching, mergedFeatureRef,
				mergeRole);
		if (mergedFeatureRef != null)  {
			mergedObject.getFeatureRefs().add(mergedFeatureRef);
		}	
		// merge values.
		List<ProductSpaceElementMatching> elementMatchings = new ArrayList<>();
		for (ProductSpaceElementMatching subMatching : featureRefMatching
				.getSubMatchings()) {
			if (!MergeUtil.filterMatching(subMatching, EMFValue.class)
					.isEmpty()) {
				elementMatchings.add(subMatching);
				mergeValueOutPlace(subMatching, mergedFeatureRef, mergeRole);
			}
		}
		// merge value orderings.
		for (ProductSpaceElementMatching subMatching : featureRefMatching
				.getSubMatchings()) {
			if (!MergeUtil.filterMatching(subMatching, VersionedList.class)
					.isEmpty()) {
				mergeValueOrderingOutPlace(subMatching, mergedFeatureRef, 
						elementMatchings, mergeRole);
			}
		}
	}

	/**
	 * Creates a merged EMF feature reference, which is either an external
	 * feature reference or an internal class reference proxy, depending on the
	 * given inputs.
	 *
	 * @param featureRefMatching
	 * @param mergedObject
	 * @param mergeRole
	 */
	private EMFFeatureRef createMergedFeatureRef(
			EList<EMFFeatureRef> featureRefs) {
		EMFFeatureRef mergedFeatureRef = SuperModEMFFileFactory
				.eINSTANCE.createEMFFeatureRef();
		MergeUtil.setVisibility(featureRefs, mergedFeatureRef, 
				visibilityForest, visibilityMergeService);
		mergedFeatureRef.setFeatureName(MergeUtil.getUnique(featureRefs, 
				new PropertyAccessor<EMFFeatureRef, String>() {
			@Override
			public String getProperty(EMFFeatureRef v) {
				return v.getFeatureName();
			}
		}));
		return mergedFeatureRef;
	}

	/**
	 * Out-place merges an EMF value based on a given input element matching
	 * which refers to equivalent values from different versions. Inserts the
	 * merged value into the specified feature reference.
	 *
	 * @param valueMatching
	 * @param mergedFeatureRef
	 * @param mergeRole
	 */
	private void mergeValueOutPlace(ProductSpaceElementMatching valueMatching,
			EMFFeatureRef mergedFeatureRef, MatchingRole mergeRole) {
		EList<EMFValue> values = MergeUtil.filterMatching(valueMatching, 
				EMFValue.class);
		if (values.isEmpty()) return;
		EMFValue mergedValue = createMergedValue(values);
		if (mergedValue != null) {
			MergeUtil.addMergeRole(valueMatching, mergeRole, mergedValue);
			MergeUtil.updateTransactionId(valueMatching, mergedValue, mergeRole);
			mergedFeatureRef.getValues().add(mergedValue);
		}
	}

	/**
	 * Creates a merged EMF value, which may be either an attribute value, or
	 * an internal or external reference target, depending on the input set of
	 * values to be merged.
	 *
	 * @param values
	 * @return
	 */
	private EMFValue createMergedValue(EList<EMFValue> values) {
		if (MatchUtil.allInstanceOf(values, EMFAttributeValue.class)) {
			return createMergedAttributeValue(values);
		}
		if (MatchUtil.allInstanceOf(values, EMFExternalReferenceValue.class)) {
			return createMergedExternalReferenceValue(values);
		}
		if (MatchUtil.allInstanceOf(values, EMFInternalReferenceValue.class)) {
			return createMergedInternalReferenceProxy(values,
					MatchUtil.allInstanceOf(values, 
							EMFContainmentReferenceValue.class));
		}
		return null;
	}

	/**
	 * Creates a merged EMF attribute value by merging the input values'
	 * visibilities and literals.
	 *
	 * @param values
	 * @return
	 */
	private EMFValue createMergedAttributeValue(EList<EMFValue> values) {
		EMFAttributeValue mergedAttributeValue = SuperModEMFFileFactory
				.eINSTANCE.createEMFAttributeValue();
		MergeUtil.setVisibility(values, mergedAttributeValue, visibilityForest, 
				visibilityMergeService);
		mergedAttributeValue.setLiteral(MergeUtil.getUnique(values, 
				new PropertyAccessor<EMFValue, String>() {
			@Override
			public String getProperty(EMFValue v) {
				if (v instanceof EMFAttributeValue) {
					return ((EMFAttributeValue) v).getLiteral();
				}
				return null;
			}
		}));
		return mergedAttributeValue;
	}

	/**
	 * Creates a merged EMF external reference value by merging the input
	 * values' visibilities and EObject URIs.
	 *
	 * @param values
	 * @return
	 */
	private EMFValue createMergedExternalReferenceValue(
			EList<EMFValue> values) {
		EMFExternalReferenceValue mergedExternalReferenceValue = 
				SuperModEMFFileFactory.eINSTANCE
				.createEMFExternalReferenceValue();
		MergeUtil.setVisibility(values, mergedExternalReferenceValue, 
				visibilityForest, visibilityMergeService);
		mergedExternalReferenceValue.setEObjectUri(MergeUtil.getUnique(values,
				new PropertyAccessor<EMFValue, String>() {
			@Override
			public String getProperty(EMFValue v) {
				if (v instanceof EMFExternalReferenceValue) {
					return ((EMFExternalReferenceValue) v).getEObjectUri();
				}
				return null;
			}			
		}));
		return mergedExternalReferenceValue;
	}

	/**
	 * Creates a merged EMF internal reference proxy by merging the inputs'
	 * visibility and referenced object UUIDs. In case one of the 
	 * operands is an internal reference value, it is replaced by a
	 * corresponding proxy.
	 *
	 * @param values
	 * @param containment
	 * @return
	 */
	private EMFValue createMergedInternalReferenceProxy(EList<EMFValue> values,
			boolean containment) {
		EMFInternalReferenceValue mergedProxy = containment ?
				SuperModEMFFileFactory.eINSTANCE
						.createEMFContainmentReferenceValue() :
				SuperModEMFFileFactory.eINSTANCE
						.createEMFInternalReferenceValue();
		MergeUtil.setVisibility(values, mergedProxy, visibilityForest, 
				visibilityMergeService);
		mergedProxy.setProxyUUID(MergeUtil.getUnique(values,
				new PropertyAccessor<EMFValue, String>() {
			@Override
			public String getProperty(EMFValue v) {
				if (v.isProxy()) {
					return v.getProxyUUID();
				}
				else {
					EMFInternalReferenceValue irv = 
							(EMFInternalReferenceValue) v;
					if (irv.getReferencedObject() == null) {
						return null;
					}
					return ((EMFInternalReferenceValue) v)
							.getReferencedObject().getUuid();
				}				
			}
		}));
		return mergedProxy;
	}
	
	/**
	 * Out-place merges the feature value ordering based on the merged element
	 * set and a matching which refers to different versions of the ordering.
	 *
	 * @param orderingMatching
	 * @param featureRef
	 * @param valueMatchings
	 * @param mergeRole
	 */
	private void mergeValueOrderingOutPlace(
			ProductSpaceElementMatching orderingMatching,
			EMFFeatureRef featureRef, 
			List<ProductSpaceElementMatching> valueMatchings, 
			MatchingRole mergeRole) {
		VersionedList mergedOrdering = ListMergeUtil.mergeVersionedListOutPlace(
				orderingMatching, valueMatchings, mergeRole, 
				visibilityForest, visibilityMergeService);
		MergeUtil.addMergeRole(orderingMatching, mergeRole,	mergedOrdering);
		MergeUtil.updateTransactionId(orderingMatching, mergedOrdering,
				mergeRole);
		featureRef.setValueOrdering(mergedOrdering);
	}

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.file.IVersionedFileContentMergeService
	 * #mergeInPlace(de.ubt.ai1.supermod.mm.diff.ProductSpaceElementMatching,
	 * de.ubt.ai1.supermod.mm.diff.MatchingRole)
	 */
	@Override
	public void mergeInPlace(ProductSpaceElementMatching fileContentMatching,
			MatchingRole masterRole) {
		EMFFileContent masterContent = null;
		if (fileContentMatching.getMatchedElement(masterRole) != null) {
			masterContent = (EMFFileContent) fileContentMatching
					.getMatchedElement(masterRole).getElement();
		}
		if (masterContent == null) {
			mergeOutPlace(fileContentMatching, masterRole);
			return;
		}
		for (ProductSpaceElementMatching subMatching : fileContentMatching
				.getSubMatchings()) {
			mergeObjectInPlace(subMatching, masterContent, masterRole);
		}
	}

	/**
	 * In-place merges several matching objects, which are described by an 
	 * element matching, into a master EMF object.
	 * 
	 * @param subMatching
	 * @param masterContent
	 * @param masterRole
	 */
	private void mergeObjectInPlace(ProductSpaceElementMatching objectMatching,
			EMFFileContent masterContent, MatchingRole masterRole) {
		EList<EMFObject> objects = MergeUtil.filterMatching(objectMatching, 
				EMFObject.class);
		if (objects.isEmpty()) return;
		EMFObject masterObject = null;
		if (objectMatching.getMatchedElement(masterRole) != null) {
			masterObject = (EMFObject) objectMatching
					.getMatchedElement(masterRole).getElement();
		}
		if (masterObject == null) {
			mergeObjectOutPlace(objectMatching, masterContent, masterRole);
			return;
		}
		// merge classes and features.
		for (ProductSpaceElementMatching subMatching : objectMatching
				.getSubMatchings()) {
			mergeClassRefInPlace(subMatching, masterObject, masterRole);
			mergeFeatureRefInPlace(subMatching, masterObject, masterRole);
		}
	}

	/**
	 * In-place merges several matching class references, which are described
	 * by an element matching, into a master EMF class reference.
	 * 
	 * @param subMatching
	 * @param masterObject
	 * @param masterRole
	 */
	private void mergeClassRefInPlace(ProductSpaceElementMatching classRefMatching,
			EMFObject masterObject, MatchingRole masterRole) {
		EList<EMFClassRef> classRefs = MergeUtil.filterMatching(
				classRefMatching, EMFClassRef.class);
		if (classRefs.isEmpty()) return;
		EMFClassRef masterClassRef = null;
		if (classRefMatching.getMatchedElement(masterRole) != null) {
			masterClassRef = (EMFClassRef) classRefMatching
					.getMatchedElement(masterRole).getElement();
		}
		if (masterClassRef == null) {
			mergeClassRefOutPlace(classRefMatching, masterObject, masterRole);
		}		
	}

	/**
	 * In-place merges several matching feature references, which are described
	 * by an element matching, into a master EMF feature reference.
	 * 
	 * @param subMatching
	 * @param masterObject
	 * @param masterRole
	 */
	private void mergeFeatureRefInPlace(
			ProductSpaceElementMatching featureRefMatching,
			EMFObject masterObject, MatchingRole masterRole) {
		EList<EMFFeatureRef> featureRefs = MergeUtil.filterMatching(
				featureRefMatching, EMFFeatureRef.class);
		if (featureRefs.isEmpty()) return;
		EMFFeatureRef masterFeatureRef = null;
		if (featureRefMatching.getMatchedElement(masterRole) != null) {
			masterFeatureRef = (EMFFeatureRef) featureRefMatching
					.getMatchedElement(masterRole).getElement();
		}
		if (masterFeatureRef == null) {
			mergeFeatureRefOutPlace(featureRefMatching, masterObject,
					masterRole);
			return;
		}
		// merge values.
		List<ProductSpaceElementMatching> elementMatchings = new ArrayList<>();
		for (ProductSpaceElementMatching subMatching : featureRefMatching
				.getSubMatchings()) {
			if (!MergeUtil.filterMatching(subMatching, EMFValue.class)
					.isEmpty()) {
				elementMatchings.add(subMatching);
				mergeValueInPlace(subMatching, masterFeatureRef, masterRole);
			}
		}
		// merge value orderings.
		for (ProductSpaceElementMatching subMatching : featureRefMatching
				.getSubMatchings()) {
			if (subMatching.getMatchedElement(masterRole) != null &&
					!MergeUtil.filterMatching(subMatching, VersionedList.class)
					.isEmpty()) {
				VersionedList masterOrdering = (VersionedList) subMatching
						.getMatchedElement(masterRole).getElement();
				if (masterOrdering == null) {
					mergeValueOrderingOutPlace(subMatching, masterFeatureRef, 
							elementMatchings, masterRole);
				}
				else {
					mergeValueOrderingInPlace(masterOrdering,
							subMatching, masterFeatureRef, 
							elementMatchings, masterRole);
				}
			}
		}
	}	
	
	/**
	 * In-place merges an EMF value based on a given input element matching
	 * which refers to equivalent values from different versions, into a master
	 * EMF value.
	 * 
	 * @param subMatching
	 * @param masterFeatureRef
	 * @param masterRole
	 */
	private void mergeValueInPlace(ProductSpaceElementMatching valueMatching,
			EMFFeatureRef masterFeatureRef, MatchingRole masterRole) {
		EList<EMFValue> values = MergeUtil.filterMatching(valueMatching, 
				EMFValue.class);
		if (values.isEmpty()) return;
		EMFValue masterValue = null;
		if (valueMatching.getMatchedElement(masterRole) != null) { 
			masterValue = (EMFValue) valueMatching
					.getMatchedElement(masterRole).getElement();
		}
		if (masterValue == null) {
			mergeValueOutPlace(valueMatching, masterFeatureRef, masterRole);
		}	
	}

	/**
	 * In-place merges the feature value ordering based on the merged element
	 * set and a matching which refers to different versions of the ordering,
	 * into a master value ordering.
	 * 
	 * @param masterOrdering
	 * @param orderingMatching
	 * @param masterFeatureRef
	 * @param elementMatchings
	 * @param masterRole
	 */
	private void mergeValueOrderingInPlace(
			VersionedList masterOrdering,
			ProductSpaceElementMatching orderingMatching,
			EMFFeatureRef masterFeatureRef,
			List<ProductSpaceElementMatching> elementMatchings,
			MatchingRole masterRole) {
		if (masterFeatureRef.getValueOrdering() == null && 
				!orderingMatching.getMatchedElements().isEmpty()) {
			VersionedList mergedOrdering = SuperModListFactory
					.eINSTANCE.createVersionedList();
			MergeUtil.addMergeRole(orderingMatching, masterRole,
					mergedOrdering);
			MergeUtil.updateTransactionId(orderingMatching, mergedOrdering,
					masterRole);
			masterFeatureRef.setValueOrdering(mergedOrdering);
		}
		ListMergeUtil.mergeVersionedListInPlace(masterOrdering,
				orderingMatching, elementMatchings, masterRole, 
				visibilityForest, visibilityMergeService);		
	}

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.file.IVersionedFileContentMergeService
	 * #finish(de.ubt.ai1.supermod.mm.core.ProductDimension)
	 */
	@Override
	public void finish(ProductDimension mergedPd) {
		this.visibilityForest = null;
	}

}
