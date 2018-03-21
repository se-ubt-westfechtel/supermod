/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.service.generic.client.impl;

import de.ubt.ai1.supermod.mm.client.LocalRepository;
import de.ubt.ai1.supermod.mm.core.OptionBinding;
import de.ubt.ai1.supermod.service.client.IAmbitionCorrectionService;

/**
 * The default implementation of the ambition correction service, which
 * assumes that the used version space model does not allow to correct a
 * previously specified ambition.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	29.09.2015
 */
public class GenericSuppressiveAmbitionCorrectionService
implements IAmbitionCorrectionService {

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.client.IAmbitionCorrectionService
	 * #canCorrect(de.ubt.ai1.supermod.mm.client.LocalRepository)
	 */
	@Override
	public boolean canCorrect(LocalRepository repo) {
		return false;
	}

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.client.IAmbitionCorrectionService
	 * #getAmbitionToCorrect(de.ubt.ai1.supermod.mm.client.LocalRepository)
	 */
	@Override
	public OptionBinding getAmbitionToCorrect(LocalRepository repo) {
		return null;
	}	

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.client.IAmbitionCorrectionService
	 * #specifyCorrectingAmbition(de.ubt.ai1.supermod.mm.client.LocalRepository,
	 * de.ubt.ai1.supermod.mm.core.OptionBinding,
	 * de.ubt.ai1.supermod.mm.core.OptionBinding)
	 */
	@Override
	public OptionBinding specifyCorrectingAmbition(LocalRepository repo, 
			OptionBinding choice, OptionBinding ambitionToCorrect) {
		return ambitionToCorrect;
	}

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.client.IAmbitionCorrectionService
	 * #correct(de.ubt.ai1.supermod.mm.client.LocalRepository,
	 * de.ubt.ai1.supermod.mm.core.OptionBinding)
	 */
	@Override
	public void correct(LocalRepository repo, OptionBinding correctedAmbition) {
		// relax
	}


}
