/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.service.generic.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EReference;

import com.google.inject.Inject;

import de.ubt.ai1.supermod.mm.core.Dimension;
import de.ubt.ai1.supermod.mm.core.Element;
import de.ubt.ai1.supermod.mm.core.Option;
import de.ubt.ai1.supermod.mm.core.OptionExpr;
import de.ubt.ai1.supermod.mm.core.ProductSpaceElement;
import de.ubt.ai1.supermod.mm.core.Repository;
import de.ubt.ai1.supermod.mm.core.VersionSpaceElement;
import de.ubt.ai1.supermod.service.IElementDeletionService;
import de.ubt.ai1.supermod.service.IRepositoryProjectionService;
import de.ubt.ai1.util.emf.AI1EcoreUtil;

/**
 * A generic implementation of the repository projection service. It deletes
 * all object whose transaction ID is outdated and which are not referenced by
 * an element whose transaction ID is not outdated. Thus, the 1-context of
 * elements carrying the current transaction ID, including all their parent
 * elements in transitive closure. For element deletion,
 * the injected instance of {@link IElementDeletionService} is
 * used.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	20.10.2015
 */
public class GenericRepositoryProjectionService
implements IRepositoryProjectionService {
	
	@Inject
	private IElementDeletionService deletionService;

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.IRepositoryProjectionService
	 * #projectRepository(de.ubt.ai1.supermod.mm.core.Repository, int)
	 */
	@Override
	public void projectRepository(Repository repo, Set<Integer> transactionIds) {
		Set<Dimension> dims = new HashSet<Dimension>();
		dims.addAll(repo.getVersionSpace().getDimensions());
		dims.addAll(repo.getProductSpace().getDimensions());
		dims.add(repo.getVisibilityForest());
		Set<Element> context = new HashSet<>();
		for (Dimension dim : dims) {
			context.addAll(getCurrentTransactionElements(dim, transactionIds));
		}
		for (Element e : new HashSet<>(context)) {
			context.addAll(getCrossReferencedElements(e));
		}
		for (Element e : new HashSet<>(context)) {
			if (e instanceof ProductSpaceElement) {
				context.addAll(getVersioningElements((ProductSpaceElement) e));
			}
		}
		for (Element e : new HashSet<>(context)) {
			context.addAll(e.getAllSuperElements());
		}
		for (Dimension dim : dims) {
			retainElements(dim, context);
		}
	}

	/**
	 * @param dim
	 * @param transactionIds
	 * @return elements immediately affected by the current transaction
	 */
	protected List<Element> getCurrentTransactionElements(
			Dimension dim, Set<Integer> transactionIds) {
		List<Element> currTransElements = new ArrayList<Element>();
		for (Element root : dim.getRootElements()) {
			if (transactionIds.contains(root.getTransactionId())) {
				currTransElements.add(root);
			}
			addCurrentTransactionElementsRec(root, transactionIds,
					currTransElements);
		}
		return currTransElements;
	}
	
	/**
	 * Recursive auxiliary method for current transaction elements
	 * 
	 * @param el
	 * @param transactionIds
	 * @param currTransElements
	 */
	protected void addCurrentTransactionElementsRec(Element el,
			Set<Integer> transactionIds, List<Element> currTransElements) {
		for (Element sub : el.getSubElements()) {
			if (transactionIds.contains(sub.getTransactionId())) {
				currTransElements.add(sub);
			}
			addCurrentTransactionElementsRec(sub, transactionIds,
					currTransElements);
		}		
	}	

	/**
	 * Gets all high-level version space elements this element's visibility
	 * refers to.
	 *
	 * @param nilEl
	 * @return
	 */
	protected List<VersionSpaceElement> getVersioningElements(
			ProductSpaceElement pse) {
		List<VersionSpaceElement> vses = new ArrayList<>();
		OptionExpr expr = pse.getVisibility();
		if (expr != null) {
			for (Option o : expr.getReferencedOptions()) {
				VersionSpaceElement vse = o.getHighLevelConcept();
				if (vse != null) {
					vses.add(vse);
				}
			}
		}
		return vses;
	}


	/**
	 * @param el
	 * @return all elements directly cross-referenced by non-containment
	 * 			references ensuing from a specified element (1-context),
	 * 			as well as corresponding parent elements.
	 */
	protected List<Element> getCrossReferencedElements(Element el) {
		List<Element> crossRefedElements = new ArrayList<Element>();
		for (EReference eRef : el.eClass().getEAllReferences()) {
			if (AI1EcoreUtil.isPersistent(eRef)) {
				if (eRef.isMany()) {
					@SuppressWarnings("unchecked")
					EList<Object> values = (EList<Object>) el.eGet(eRef);
					for (Object value : values) {
						if (value instanceof Element) {
							crossRefedElements.add((Element) value);
						}
					}
				}
				else {
					Object value = el.eGet(eRef);
					if (value instanceof Element) {
						crossRefedElements.add((Element) value);
					}
				}
			}
		}
		return crossRefedElements;
	}

	/**
	 * Deletes all element except for those part of the current context from
	 * the specified dimension.
	 *
	 * @param dim
	 * @param context
	 */
	protected void retainElements(Dimension dim, Collection<Element> context) {
		for (Element root : new BasicEList<>(dim.getRootElements())) {
			if (!context.contains(root)) {
				deletionService.delete(root);
			}
			for (Element sub : new BasicEList<>(root.getSubElements())) {
				retainElementsRec(sub, context);
			}
		}		
	}

	/**
	 * Recursive auxiliary method for element retainment
	 *
	 * @param el
	 * @param context
	 */
	protected void retainElementsRec(Element el, Collection<Element> context) {
		if (!context.contains(el)) {
			deletionService.delete(el);
		}
		for (Element sub : new BasicEList<>(el.getSubElements())) {
			retainElementsRec(sub, context);
		}
	}
	
}
