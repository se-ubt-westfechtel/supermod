/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/

package de.ubt.ai1.supermod.service.generic;

import java.util.Collection;

import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;

import de.ubt.ai1.supermod.mm.core.ProductDimension;
import de.ubt.ai1.supermod.mm.core.ProductSpaceElement;
import de.ubt.ai1.supermod.mm.core.VisibilityForest;
import de.ubt.ai1.supermod.mm.diff.MatchedProductSpaceElement;
import de.ubt.ai1.supermod.mm.diff.MatchingRole;
import de.ubt.ai1.supermod.mm.diff.ProductDimensionMatching;
import de.ubt.ai1.supermod.mm.diff.ProductSpaceElementMatching;
import de.ubt.ai1.supermod.mm.diff.SuperModDiffFactory;
import de.ubt.ai1.supermod.service.IVisibilityMergeService;

/**
 * Auxiliary operations frequently used for the low-level merging operations
 * defined by SuperMod.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	29.07.2014
 */
public class MergeUtil {
	
	/**
	 * Auxiliary interface to extract a property of type <code>P</code> from a
	 * given composite object of type <code>V</code> in a pre-defined way.
	 *
	 * @param <V> the type of the composite object.
	 * @param <P> the type of the property to extract.
	 */
	public static interface PropertyAccessor<V, P> {
		
		/**
		 * Implements the specific property extraction rule.
		 *
		 * @param v the object from which to extract the property.
		 * @return the extracted property, maybe <code>null</code>.
		 */
		public P getProperty(V v);
	}
	
	/**
	 * Iterates over a given set of values and extracts a property for each of
	 * them using a specified property accessor. Only in case the versions
	 * agree with respect to the property, it is returned.
	 * <code>null</code>-properties are tolerated unless at least one of the 
	 * values specifies a property different to <code>null</code>
	 *
	 * @param values
	 * @param propertyAccessor
	 * @return
	 */
	public static <V, P> P getUnique(Collection<? extends V> values,
			PropertyAccessor<V, P> propertyAccessor) {
		P unique = null;
		for (V v : values) {
			P p = propertyAccessor.getProperty(v);
			if (unique == null && p != null) {
				unique = p;
			}
			else if (unique != null && p != null && !unique.equals(p)) {
				return null;
			}
		}
		return unique;
	}
	
	/**
	 * Performs the getUnique operation using a default value in case no
	 * agreement is achieved.
	 * @see getUnique
	 *
	 * @param values
	 * @param propertyAccessor
	 * @param defaultProperty the default value
	 * @return
	 */
	public static <V, P> P getUniqueWithDefaultProperty(
			Collection<? extends V> values,
			PropertyAccessor<V, P> propertyAccessor,
			P defaultProperty) {
		P unique = getUnique(values, propertyAccessor);
		return unique == null ? defaultProperty	: unique;
	}
	
	/**
	 * Performs the getUnique operation using a value extracted from a default
	 * property in case no agreement is achieved.
	 * @see getUnique
	 *
	 * @param values
	 * @param propertyAccessor
	 * @param defaultValue the default value to extract the property from.
	 * @return
	 */
	public static <V, P> P getUniqueWithDefaultValue(
			Collection<? extends V> values,
			PropertyAccessor<V, P> propertyAccessor,
			V defaultValue) {
		P unique = getUnique(values, propertyAccessor);
		return unique == null ? propertyAccessor.getProperty(defaultValue) 
				: unique;
	}
	
	/**
	 * Sets the visibility of a newly created merged element to the value that
	 * is calculated by a specified visibility merge service on the basis of
	 * the visibilities of the elements which have been merged.
	 *
	 * @param elements elements that have been merged.
	 * @param mergedElement the result of the merge operation, whose
	 * 			visibility is still missing.
	 * @param visibilityForest to be passed to the visibility merge service.
	 * @param visibilityMergeService used in order to combine the different
	 * 			visibilities of <code>elements</code> to the visibility of the
	 * 			<code>mergedElement</code>.
	 */
	public static void setVisibility(
			Collection<? extends ProductSpaceElement> elements,
			ProductSpaceElement mergedElement, 
			VisibilityForest visibilityForest,
			IVisibilityMergeService visibilityMergeService) {
		mergedElement.setVisibility(visibilityMergeService.mergeVisibility(
				elements, visibilityForest));
	}
	
	/**
	 * Iterates over the elements of a product space matching and adds all
	 * matched elements, which are instance of a specified class, to the
	 * resulting collection.
	 *
	 * @param matching the matching whose contained matched elements to filter.
	 * @param filteredClass instances of this class will be contained in the
	 * 			resulting collection.
	 * @return matched elements which are instance of the specified
	 * 			<code>filteredClass</code>.
	 */
	public static <V extends ProductSpaceElement> EList<V> filterMatching(
			ProductSpaceElementMatching matching, Class<V> filteredClass) {
		EList<V> filtered = ECollections.newBasicEList();
		for (MatchedProductSpaceElement me : matching.getMatchedElements()) {
			if (filteredClass.isInstance(me.getElement())) {
				@SuppressWarnings("unchecked")
				V element = (V) me.getElement();
				filtered.add(element);
			}
		}
		return filtered;
	}
	
	/**
	 * Filters the product dimensions defined in a specified product
	 * dimension matching by a given product dimension sub-type and returns
	 * a collection containing only the filtered dimensions.
	 *
	 * @param pdMatching the product dimension matching to filter by.
	 * @param filteredClass the specific product dimension type to filter out.
	 * @param roles the roles where to find corresponding product dimensions.
	 * @return a collection containing filtered product dimensions, all being
	 * 			instance of the <code>filteredClass</code>
	 */
	public static <PD extends ProductDimension> EList<PD> filterPdMatching(
			ProductDimensionMatching pdMatching, Class<PD> filteredClass,
			Collection<MatchingRole> roles) {
		EList<PD> filtered = ECollections.newBasicEList();
		for (MatchingRole mr : roles) {
			if (mr.getMatchedProductSpace() != null) {
				for (ProductDimension pd : mr.getMatchedProductSpace()
						.getDimensions()) {
					if (pdMatching.getDimensionName()
							.equals(pd.getDimensionName()) &&
							filteredClass.isInstance(pd)) {
						@SuppressWarnings("unchecked")
						PD filteredPd = (PD) pd;
						filtered.add(filteredPd);
						break;
					}
				}
			}
		}
		return filtered;
	}

	/**
	 * Links a merged element to the matching it originated from, by adding it
	 * to the set of matched elements itself. It will be referenced by a
	 * specified merge role.
	 *
	 * @param elementMatching the matching where to add the merged element.
	 * @param mergeRole the specified merge role, where the merged element will
	 * 			be accessible under in the modified matching.
	 * @param mergedElement the element to add to the specified
	 * 			<code>elementMatching</code> under the merge role.
	 */
	public static void addMergeRole(
			ProductSpaceElementMatching elementMatching,
			MatchingRole mergeRole, ProductSpaceElement mergedElement) {
		if (mergeRole != null) {
			MatchedProductSpaceElement me = SuperModDiffFactory.eINSTANCE
					.createMatchedProductSpaceElement();
			me.setElement(mergedElement);
			me.setRole(mergeRole);
			elementMatching.getMatchedElements().add(me);
		}
	}
	
	/**
	 * Sets the transaction ID of a merged element to the maximum of values of
	 * transaction IDs of the original matched elements, ignoring elements
	 * belonging to the master role.
	 *
	 * @param elementMatching
	 * @param mergedElement
	 */
	public static void updateTransactionId(
			ProductSpaceElementMatching elementMatching,
			ProductSpaceElement mergedElement, MatchingRole masterRole) {
		int maxTid = -1;
		for (MatchedProductSpaceElement me : 
				elementMatching.getMatchedElements()) {
			if (!me.getRole().equals(masterRole) &&
					me.getElement().getTransactionId() > maxTid) {
				maxTid = me.getElement().getTransactionId();
			}
		}
		mergedElement.setTransactionId(maxTid);
	}

}
