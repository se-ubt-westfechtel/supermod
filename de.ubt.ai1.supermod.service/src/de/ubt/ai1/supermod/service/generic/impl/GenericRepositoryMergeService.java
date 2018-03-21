/******************************************************************************
+ * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.service.generic.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.google.inject.Inject;

import de.ubt.ai1.supermod.mm.core.Option;
import de.ubt.ai1.supermod.mm.core.OptionExpr;
import de.ubt.ai1.supermod.mm.core.ProductDimension;
import de.ubt.ai1.supermod.mm.core.ProductSpace;
import de.ubt.ai1.supermod.mm.core.ProductSpaceElement;
import de.ubt.ai1.supermod.mm.core.Repository;
import de.ubt.ai1.supermod.mm.core.Visibility;
import de.ubt.ai1.supermod.mm.diff.MatchingRole;
import de.ubt.ai1.supermod.mm.diff.ProductSpaceMatching;
import de.ubt.ai1.supermod.mm.diff.SuperModDiffFactory;
import de.ubt.ai1.supermod.service.IProductSpaceMatchService;
import de.ubt.ai1.supermod.service.IProductSpaceMergeService;
import de.ubt.ai1.supermod.service.IProductSpaceProxyResolutionService;
import de.ubt.ai1.supermod.service.IRepositoryMergeService;
import de.ubt.ai1.supermod.service.IVersionSpaceMergeService;
import de.ubt.ai1.supermod.service.IVisibilityForestMergeService;

/**
 * A generic implementation for the repository merge service which uses
 * existing services for merging product space, version space, and the
 * visibility forest.
 *
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	20.10.2015
 */
public class GenericRepositoryMergeService implements IRepositoryMergeService {
	
	protected static final String BASE = "BASE";
	protected static final String OTHER = "OTHER";
	
	@Inject
	private IProductSpaceMatchService psMatchService;
	
	@Inject
	private IProductSpaceMergeService psMergeService;
	
	@Inject
	private IVersionSpaceMergeService vsMergeService;
	
	@Inject
	private IVisibilityForestMergeService vfMergeService;
	
	@Inject
	private IProductSpaceProxyResolutionService proxyResolver;
	

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.service.IRepositoryMergeService
	 * #merge(de.ubt.ai1.supermod.mm.core.Repository,
	 * de.ubt.ai1.supermod.mm.core.Repository)
	 */
	@Override
	public void merge(Repository base, Repository other) {
		Map<String, Option> optionMap =
				vsMergeService.merge(base.getVersionSpace(),
						other.getVersionSpace());
		Map<String, Visibility> visibilityMap =
				vfMergeService.merge(base.getVisibilityForest(),
						other.getVisibilityForest(), optionMap);
		
		List<MatchingRole> roles = new ArrayList<>();
		MatchingRole baseRole = SuperModDiffFactory.eINSTANCE
				.createMatchingRole();
		baseRole.setMatchedProductSpace(base.getProductSpace());
		baseRole.setRoleName(BASE);
		roles.add(baseRole);
		MatchingRole otherRole = SuperModDiffFactory.eINSTANCE
				.createMatchingRole();
		otherRole.setMatchedProductSpace(other.getProductSpace());
		otherRole.setRoleName(OTHER);
		roles.add(otherRole);
		
		ProductSpaceMatching matching = psMatchService.match(roles);
		psMergeService.mergeInPlace(matching, baseRole, 
				base.getVisibilityForest());
		adaptVisibilities(base.getProductSpace(), visibilityMap);
		proxyResolver.resolveProxies(base.getProductSpace());
	}


	/**
	 * Utility method to adapt the visibilities of elements of a given product
	 * space according to a specified visibility map that associates 'other'
	 * with 'base' visibilities.
	 *
	 * @param productSpace
	 * @param visibilityMap
	 */
	private void adaptVisibilities(ProductSpace productSpace,
			Map<String, Visibility> visibilityMap) {
		for (ProductDimension pd : productSpace.getDimensions()) {
			for (ProductSpaceElement pse : pd.getAllProductSpaceElements()) {
				OptionExpr visExpr = pse.getVisibility();
				if (visExpr != null && 
						visExpr.eContainer() instanceof Visibility) {
					Visibility pseVis = (Visibility) visExpr.eContainer();
					if (visibilityMap.containsKey(pseVis.getUuid())) {
						Visibility newVis = visibilityMap.get(pseVis.getUuid());
						if (newVis != null && newVis.getExpr() != null) {
							pse.setVisibility(newVis.getExpr());
						}
					}
				}
			}
		}		
	}

}
