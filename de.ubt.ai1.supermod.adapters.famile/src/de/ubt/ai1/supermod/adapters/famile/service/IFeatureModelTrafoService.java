package de.ubt.ai1.supermod.adapters.famile.service;

import com.google.inject.ImplementedBy;

import de.ubt.ai1.supermod.adapters.famile.service.impl.FeatureModelTrafoService;
import de.ubt.ai1.supermod.mm.feature.Feature;

/**
 * Service to transform SuperMod FeatureModels to FAMILE FeatureModels
 * 
 * @author Alexander Zimmer
 * @date 2017-12-09
 *
 */
@ImplementedBy(FeatureModelTrafoService.class)
public interface IFeatureModelTrafoService {
	
	/**
	 * Method to transform the children of a given famile feature object to the
	 * children of a given famile feature object. Includes a distinction between
	 * atomic features and feature groups. Iterates recursively over all children.
	 * 
	 * @param currentSmFeature
	 *            current supermod feature with children that will get transformed
	 * @param currentFmFeature
	 *            corresponding famile feature where the transformed features get
	 *            added as children
	 */
	public void transformChildren(Feature currentSmFeature, de.ubt.ai1.fm.Feature currentFmFeature);

	/**
	 * Method to transform the featuregroup dependencies (xor/or)
	 * 
	 * @param currentSmFeature
	 *            given feature by whose children the feature group dependencies are
	 *            transformed
	 */
	public void transformXorOrGroups(Feature currentSmFeature);

	/**
	 * Method to transform the feature dependencies (includes/requires)
	 * 
	 * @param currentSmFeature
	 *            given feature by whose children the feature dependencies are
	 *            transformed
	 */
	public void transformFeatureDependencies(Feature currentSmFeature);
	
	/**
	 * Method to set the atomic properties of a given famile feature
	 * 
	 * @param smFeature
	 *            given supermod feature that gets transformed
	 * @param fmFeature
	 *            given famile feature whose properties are set
	 */
	public void transformFeatureAttributes(Feature smFeature, de.ubt.ai1.fm.Feature fmFeature);
}