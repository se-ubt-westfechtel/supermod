/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/

package de.ubt.ai1.supermod.service.exceptions;

import de.ubt.ai1.supermod.mm.core.OptionBinding;
import de.ubt.ai1.supermod.mm.core.ProductSpaceElement;

/**
 * Caused whenever a product space element's visibility definitely needs to
 * evaluate to one of the values {@link 
 * de.ubt.ai1.supermod.mm.core.Tristate#TRUE} or {@link 
 * de.ubt.ai1.supermod.mm.core.Tristate#FALSE}, but the result was {@link 
 * de.ubt.ai1.supermod.mm.core.Tristate#UNKNOWN}. In this case, the specified
 * option binding left one of the options which are referenced by the
 * visibility unbound, and as a consequence, the effective visibility of the
 * element in the specified version(s) cannot be determined.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	29.07.2014
 */
public class UnderspecifiedVisibilityException extends SuperModException {
	
	private static final long serialVersionUID = 1501122586827985394L;
	
	private ProductSpaceElement productSpaceElement;
	private OptionBinding binding;

	/**
	 * Creates a new instance of this exception.
	 *
	 * @param productSpaceElement the product space element whose visibility
	 * 			is underspecified with respect to <code>binding</code>.
	 * @param binding the binding in which at least one option occurring in
	 * 			<code>productSpaceElement</code>'s visibility is unbound. 
	 */
	public UnderspecifiedVisibilityException(
			ProductSpaceElement productSpaceElement, OptionBinding binding) {
		super();
		this.productSpaceElement = productSpaceElement;
		this.binding = binding;
	}

	/**
	 * @return productSpaceElement the product space element whose visibility
	 * 			is underspecified with respect to {@link #getBinding()}.
	 */
	public ProductSpaceElement getProductSpaceElement() {
		return productSpaceElement;
	}
	
	/**
	 * @return binding the binding in which at least one option occurring in
	 * 			{@link #getProductSpaceElement()}'s visibility is unbound. 
	 */
	public OptionBinding getBinding() {
		return binding;
	}
	
}
