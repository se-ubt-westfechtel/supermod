/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.mm.feature.util;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import de.ubt.ai1.supermod.mm.core.Option;
import de.ubt.ai1.supermod.mm.core.OptionBinding;
import de.ubt.ai1.supermod.mm.core.SuperModCoreFactory;
import de.ubt.ai1.supermod.mm.core.Tristate;
import de.ubt.ai1.supermod.mm.feature.FeatureModel;

/**
 * This class provides auxiliary operations for the management of feature
 * models.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	03.03.2015
 */
public class FeatureModelUtil {

	/**
	 * Takes as input a feature configuration, represented by an option binding
	 * which refers to a source feature model. Transforms this configuration
	 * into another option binding which refers to equally named features of a
	 * target feature model.
	 *
	 * @param conf the feature configuration to map
	 * @param source
	 * @param target
	 * @param includeOrphans if true, bindings for options not existing in the
	 * 			target feature model will be copied, referring to the source
	 * 			feature model.
	 * @return a mapped feature configuration
	 */
	public static OptionBinding mapFeatureConfiguration(OptionBinding conf,
			FeatureModel source, FeatureModel target, boolean includeOrphans) {
		if (conf == null) return null;
		Map<String, Tristate> bindingMap = new HashMap<>();
		for (Entry<Option, Tristate> e : conf.getBoundOptions().entrySet()) {
			if (e != null && e.getKey() != null &&
					e.getKey().getName() != null) {
				bindingMap.put(e.getKey().getName(), e.getValue());
			}
		}
		OptionBinding result = SuperModCoreFactory.eINSTANCE
				.createOptionBinding();
		for (Option targetOption : target.getOptions()) {
			String targetId = targetOption.getName();
			if (bindingMap.containsKey(targetId)) {
				result.bind(targetOption, bindingMap.get(targetId));
				bindingMap.remove(targetId);
			}
		}
		if (includeOrphans) {
			for (Option sourceOption : source.getOptions()) {
				String sourceId = sourceOption.getName();
				if (bindingMap.containsKey(sourceId)) {
					Tristate t = conf.getState(sourceOption);
					if (t == Tristate.TRUE || t == Tristate.FALSE) {
						result.bind(sourceOption, t);
					}
				}
			}
		}
		return result;
	}

}
