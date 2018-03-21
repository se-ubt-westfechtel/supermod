/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.service.client.exceptions;

/**
 * Wraps platform specific exceptions within SuperMod applications.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	30.07.2014
 */
public class SuperModClientWrappedException extends SuperModClientException {
	
	private static final long serialVersionUID = 5875929047251877328L;
	
	protected Exception inner;

	/**
	 * Creates a new wrapped exception for SuperMod client applications.
	 *
	 * @param inner the wrapped exception.
	 */
	public SuperModClientWrappedException(Exception inner) {
		super();
		this.inner = inner;
		initCause(inner);
	}

	/**
	 * @return the wrapped exception.
	 */
	public Exception getInner() {
		return inner;
	}	

}
