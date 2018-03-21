/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/

package de.ubt.ai1.supermod.service.generic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import de.ubt.ai1.supermod.mm.core.ProductSpaceElement;
import de.ubt.ai1.supermod.mm.diff.MatchedProductSpaceElement;
import de.ubt.ai1.supermod.mm.diff.MatchingRole;
import de.ubt.ai1.supermod.mm.diff.ProductSpaceElementMatching;
import de.ubt.ai1.supermod.mm.diff.SuperModDiffFactory;

/**
 * Auxiliary operations which are frequently required for matching operations
 * within SuperMod. These functions refer to single product space elements or
 * to sets thereof which have an unversioned order.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	29.07.2014
 */
public class MatchUtil {

	/**
	 * Auxiliary interface for accessing a key of type <code>K</code> from a
	 * value of type <code>V</code>. This function must be bijective for all
	 * key-value pairs in the range <code>K x V</code>.
	 * 
	 * @param <K> type parameter for the key.
	 * @param <V> type parameter for the value.
	 */
	public interface KeyMatchFunction<K, V> {
		
		/**
		 * To be implemented in order to return the key for a given value.
		 *
		 * @param value
		 * @return the corresponding key.
		 */
		K getKey(V value);
	}
	
	/**
	 * Creates a matching for a given set of elements from different product
	 * spaces, depending on their specific matching roles.
	 *
	 * @param elements equivalent elements from different product spaces to
	 * 			create a matching for.
	 * @param matchingRoles the matching roles to use for different product
	 * 			spaces involved.
	 * @return an element matching which refers to the specified elements,
	 * 			using the specified matching roles.
	 */
	public static <V extends ProductSpaceElement> 
	ProductSpaceElementMatching matchElement(
			List<V> elements, Collection<MatchingRole> matchingRoles) {
		ProductSpaceElementMatching em = SuperModDiffFactory.eINSTANCE
				.createProductSpaceElementMatching();
		for (V element : elements) {
			MatchedProductSpaceElement me = SuperModDiffFactory
					.eINSTANCE.createMatchedProductSpaceElement();
			me.setElement(element);
			for (MatchingRole mr : matchingRoles) {
				if (mr.getMatchedProductSpace()
						.equals(element.getProductSpace())) {
					me.setRole(mr);
				}
			}
			em.getMatchedElements().add(me);
		}
		return em;
	}
	
	/**
	 * Creates a set of matchings for a given matrix of elements, which
	 * contains in each row a single-version set of elements. The resulting
	 * matching is with respect to pre-defined matching roles. In order to
	 * define which elements correspond, a suitable key match function is
	 * required, which maps each product space element to a unique key.
	 *
	 * @param valueMtx the value matrix, a list of list that contains the
	 * 			values the set to be matched in different versions.
	 * @param keyMatchFunction a function that maps each versioned element to
	 * 			a unique key of type <code>K</code>. Corresponding elements
	 * 			must map to an equal key.
	 * @param matchingRoles the matching roles, which assign a specific+
	 * 			purpose to each product space.
	 * @return a set of matchings which contains all matching elements for
	 * 			the different versions of the set, according to the key
	 * 			match function.
	 */
	public static <K, V extends ProductSpaceElement>
	List<ProductSpaceElementMatching> matchElementSet(
			List<List<V>> valueMtx,
			KeyMatchFunction<K, V> keyMatchFunction,
			Collection<MatchingRole> matchingRoles) {
		
		// for each element inside the value matrix, calculate the key. Store
		// corresponding value in a match map in order to access it later in
		// case elements have corresponding keys.
		Map<K, List<V>> matchMap = new LinkedHashMap<>();
		for (List<V> valueList : valueMtx) {
			for (V value : valueList) {
				K key = keyMatchFunction.getKey(value);
				if (!matchMap.containsKey(key)) {
					matchMap.put(key, new ArrayList<V>());
				}
				matchMap.get(key).add(value);
			}
		}
		
		// for each set of elements that have the same key assigned, create
		// an element matching and assign the corresponding matching role.
		List<ProductSpaceElementMatching> matchings = new ArrayList<>();
		for (Collection<V> values : matchMap.values()) {
			ProductSpaceElementMatching em = SuperModDiffFactory.eINSTANCE
					.createProductSpaceElementMatching();
			for (V value : values) {
				MatchedProductSpaceElement me = SuperModDiffFactory.eINSTANCE
						.createMatchedProductSpaceElement();
				me.setElement(value);
				for (MatchingRole mr : matchingRoles) {
					if (mr.getMatchedProductSpace()
							.equals(value.getProductSpace())) {
						me.setRole(mr);
					}
				}
				em.getMatchedElements().add(me);
			}
			matchings.add(em);
		}
		return matchings;
	}
	
	/**
	 * Checks whether in a given collection of product space elements, all
	 * members are instance of one of a set of specified classes.
	 *
	 * @param elements the set of elements to type-check.
	 * @param classes the type-check is passed in case an element is an
	 * 			instance of one of the classes specified here.
	 * @return whether the type-check is passed for all elements.
	 */
	@SafeVarargs
	public static boolean allInstanceOf(
			Collection<? extends ProductSpaceElement> elements, 
			Class<? extends ProductSpaceElement>... classes) {
		E : for (ProductSpaceElement e : elements) {
			for (Class<? extends ProductSpaceElement> class1 : classes) {
				if (class1.isInstance(e)) continue E;
			}
			return false;
		}
		return true;
	}

	/**
	 * Performs a type-cast for all elements within a specified collection.
	 * Each element of the resulting collection will be an instance of the
	 * specified type class, which is bounded by {@link ProductSpaceElement}.
	 *
	 * @param elements the collection of elements to cast.
	 * @param cast the dynamic type to assign to all elements within the
	 * 			resulting collection.
	 * @return a collection which contains all elements, casted down to the
	 * 			specified type <code>V</code>.
	 */
	public static <V extends ProductSpaceElement> Collection<V> castAll(
			Collection<? extends ProductSpaceElement> elements, 
			Class<V> cast) {
		List<V> castedCollection = new ArrayList<>();
		for (ProductSpaceElement e : elements) {
			if (cast.isInstance(e)) {
				@SuppressWarnings("unchecked")
				V v = (V) e;
				castedCollection.add(v);
			}
		}
		return castedCollection;
	}


}
