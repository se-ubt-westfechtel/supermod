/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.service.client;

import de.ubt.ai1.supermod.mm.core.OptionBinding;
import de.ubt.ai1.supermod.mm.core.VersionSpace;
import de.ubt.ai1.supermod.mm.diff.WriteSet;

/**
 * Service interface for analyzing the write set, which describes a set of
 * insertions and deletions to be performed under a specified ambition.
 * In particular, the analysis comprises a check whether the write set is
 * <em>sufficiently general</em>, i.e., whether each affected element is
 * visible in all versions described by the associated ambition. Furthermore,
 * in case a write set is considered as not sufficiently general, a partial
 * option binding is proposed to complete missing bindings, which makes the
 * specified ambition <em>sufficiently specific</em>.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	02.09.2014
 */
public interface IWriteSetAnalysisService {

	/**
	 * To be implemented in order to check whether the specified write set
	 * is <em>sufficiently general</em>, i.e., whether each affected element is
	 * visible in all versions described by the associated ambition.
	 *
	 * @param writeSet the write set to analyze.
	 * @param choice the original choice that had been used
	 * @param vs the version space the ambition refers to.
	 * @return an option binding that references options that must be bound
	 * 		under their recommended option binding state.
	 */
	public OptionBinding isSufficientlyGeneral(WriteSet writeSet, 
			OptionBinding choice, VersionSpace vs);

}
