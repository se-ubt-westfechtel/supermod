/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.service.generic.impl;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.util.EcoreUtil;

import de.ubt.ai1.supermod.mm.core.Element;
import de.ubt.ai1.supermod.service.IElementDeletionService;
import de.ubt.ai1.util.emf.AI1EcoreUtil;

/**
 * Generic implementation of the product space element deletion service, which
 * uses the reflective EMF remove operation.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	29.07.2014
 */
public class GenericElementDeletionService 
implements IElementDeletionService {

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.IProductSpaceElementDeletionService
	 * #delete(de.ubt.ai1.supermod.mm.core.ProductSpaceElement)
	 */
	@Override
	public void delete(Element ve) {
		Element superVe = ve.getSuperElement();
		if (superVe != null) {
			removeLinks(superVe, ve);
		}
		for (Element crVe : new BasicEList<Element>
				(ve.getCrossReferencedElements())) {
			removeLinks(ve, crVe);
		}
		for (Element crVe : new BasicEList<Element>
				(ve.getCrossReferencingElements())) {
			removeLinks(crVe, ve);
		}
		EcoreUtil.remove(ve);
	}

	/**
	 * Removes all EMF object links between two specified product space 
	 * elements.
	 *
	 * @param from the source element
	 * @param to the target element
	 */
	private void removeLinks(Element from, Element to) {
		for (EReference eRef : from.eClass().getEAllReferences()) {
			if (AI1EcoreUtil.isPersistent(eRef)) {
				if (eRef.isMany()) {
					@SuppressWarnings("unchecked")
					EList<EObject> values = (EList<EObject>) from.eGet(eRef);
					if (values.contains(to)) {
						values.remove(to);
					}
				}
				else if (from.eGet(eRef) == to) {
					from.eSet(eRef, null);
				}
			}
		}
	}

}
