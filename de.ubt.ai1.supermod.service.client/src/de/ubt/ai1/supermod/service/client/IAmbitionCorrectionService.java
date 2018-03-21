/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.service.client;

import de.ubt.ai1.supermod.mm.client.LocalRepository;
import de.ubt.ai1.supermod.mm.core.OptionBinding;

/**
 * Service interface for the correction of previously specified ambitions used
 * for the "Amend Previous Commit" operation.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	29.09.2015
 */
public interface IAmbitionCorrectionService {

	/**
	 * Checks whether the specified repository is generally capable of
	 * correcting ambitions, and whether the repository contains a previous
	 * ambition to correct.
	 *
	 * @param repo
	 * @return whether the correct operation can be safely run.
	 */
	public boolean canCorrect(LocalRepository repo);

	/**
	 * Returns the ambition specified for the previous commit. It can be used
	 * as a starting point for the user to specify the corrected ambition.
	 *
	 * @param repo
	 * @return
	 */
	public OptionBinding getAmbitionToCorrect(LocalRepository repo);	

	/**
	 * Lets the user specify an ambition that corrects a previously specified
	 * ambition.
	 *
	 * @param repo
	 * @param choice describes the current workspace contents.
	 * @param ambitionToCorrect
	 * @return the corrected ambition
	 */
	public OptionBinding specifyCorrectingAmbition(LocalRepository repo, 
			OptionBinding choice, OptionBinding ambitionToCorrect);

	/**
	 * Overwrites the previously committed ambition by a specified, corrected
	 * ambition.
	 *
	 * @param repo
	 * @param correctedAmbition
	 */
	public void correct(LocalRepository repo, OptionBinding correctedAmbition);


}
