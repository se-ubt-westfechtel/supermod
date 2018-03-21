/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.service.feature.client.pure.impl;

import de.ubt.ai1.supermod.mm.core.OptionBinding;
import de.ubt.ai1.supermod.mm.core.VersionSpace;
import de.ubt.ai1.supermod.service.client.ICompositeChoiceUpdatingService;

/**
 * An implementation of the composite choice updating service. Since the feature
 * dimension is not temporal, no modification is performed.
 * 
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	28.10.2014
 */
public class PureFeatureCompositeChoiceUpdatingService 
implements ICompositeChoiceUpdatingService {

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.client.ICompositeChoiceUpdatingService
	 * #updateCompositeChoice(de.ubt.ai1.supermod.mm.core.VersionSpace, 
	 * de.ubt.ai1.supermod.mm.core.OptionBinding)
	 */
	@Override
	public OptionBinding updateCompositeChoice(VersionSpace vs,
			OptionBinding choice) {
		return choice;
	}

}
