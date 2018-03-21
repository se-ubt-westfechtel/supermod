/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.vcs.client.http.exceptions;

import de.ubt.ai1.supermod.service.client.exceptions.SuperModClientException;

/**
 * This exception signalizes that an action has been aborted due to a locked
 * server-side repository.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	11.11.2015
 */
public class SuperModServerLockedException extends SuperModClientException {

	private static final long serialVersionUID = -721390587061627277L;

}
