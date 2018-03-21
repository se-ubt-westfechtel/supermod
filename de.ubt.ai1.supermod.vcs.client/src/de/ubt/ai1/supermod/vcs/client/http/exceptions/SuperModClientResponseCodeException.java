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
 * Instances of this class represent exceptions due to unexpected HTTP response
 * code emerging from server requests.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	10.11.2015
 */
public class SuperModClientResponseCodeException
extends SuperModClientException {

	private static final long serialVersionUID = -5817071425814048735L;

	private int responseCode;
	private String responseMessage;
	
	/**
	 * Creates a new exception using an HTTP response code.
	 *
	 * @param responseCode
	 * @param responseMessage 
	 */
	public SuperModClientResponseCodeException(int responseCode,
			String responseMessage) {
		this.responseCode = responseCode;
		this.responseMessage = responseMessage;
	}

	/**
	 * @return the responseCode
	 */
	public int getResponseCode() {
		return responseCode;
	}
	
	/**
	 * @return the responseMessage
	 */
	public String getResponseMessage() {
		return responseMessage;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Throwable#getMessage()
	 */
	@Override
	public String getMessage() {
		return responseCode + ": " + responseMessage;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Throwable#getLocalizedMessage()
	 */
	@Override
	public String getLocalizedMessage() {
		return getMessage();
	}

}
