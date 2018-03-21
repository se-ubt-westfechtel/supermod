/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/

package de.ubt.ai1.supermod.text.scoping;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.resource.IFragmentProvider;

import de.ubt.ai1.supermod.mm.core.RuleBaseElement;
import de.ubt.ai1.supermod.mm.core.VersionSpace;

/**
 * Specific implementation of the Xtext fragment provider service for SuperMod's
 * logical version dimension. It references a versioned element by its id
 * directly as the resource content.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	23.03.2015
 */
public class LogicalFragmentProvider implements IFragmentProvider {
	
	/* (non-Javadoc)
	 * @see org.eclipse.xtext.resource.IFragmentProvider
	 * #getEObject(org.eclipse.emf.ecore.resource.Resource, 
	 * java.lang.String, org.eclipse.xtext.resource.IFragmentProvider.Fallback)
	 */
	@Override
	public EObject getEObject(Resource resource, String fragment, 
			IFragmentProvider.Fallback fallback) {
		TreeIterator<EObject> tit = resource.getAllContents();
		while (tit.hasNext()) {
			EObject eo = tit.next();
			if (eo instanceof RuleBaseElement && fragment.equals(
					((RuleBaseElement)eo).getName())) {
				return eo;
			}
			if (eo instanceof VersionSpace && "/".equals(fragment)) {
				return eo;
			}
		}
		return fallback.getEObject(fragment);
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.xtext.resource.IFragmentProvider
	 * #getFragment(org.eclipse.emf.ecore.EObject, 
	 * org.eclipse.xtext.resource.IFragmentProvider.Fallback)
	 */
	@Override
	public String getFragment(EObject obj, 
			IFragmentProvider.Fallback fallback) {
		if (obj instanceof RuleBaseElement) {
			return ((RuleBaseElement)obj).getName();
		}
		if (obj instanceof VersionSpace) {
			return "/";
		}
		return fallback.getFragment(obj);
	}
	
}