package de.ubt.ai1.supermod.adapters.famile.service.impl;

import java.util.HashMap;
import java.util.Map;

import de.ubt.ai1.fm.AtomicFeature;
import de.ubt.ai1.fm.FeatureGroup;
import de.ubt.ai1.fm.FeaturemodelFactory;
import de.ubt.ai1.fm.FeaturemodelPackage;
import de.ubt.ai1.supermod.adapters.famile.service.IFeatureModelTrafoService;
import de.ubt.ai1.supermod.mm.feature.ChildRelationship;
import de.ubt.ai1.supermod.mm.feature.Feature;
import de.ubt.ai1.supermod.mm.feature.FeatureDependency;
import de.ubt.ai1.supermod.mm.feature.FeatureExclusion;
import de.ubt.ai1.supermod.mm.feature.FeatureRequirement;
import de.ubt.ai1.supermod.mm.feature.GroupMembership;
import de.ubt.ai1.supermod.mm.feature.OrFeatureGroup;
import de.ubt.ai1.supermod.mm.feature.XorFeatureGroup;

/**
 * Service to transform supermod featuremodels to famile featuremodels
 * 
 * @author Alexander Zimmer
 * @date 2017-12-01
 *
 */
public class FeatureModelTrafoService implements IFeatureModelTrafoService {

	private Map<Feature, de.ubt.ai1.fm.Feature> smTofmFeatureMapping = new HashMap<Feature, de.ubt.ai1.fm.Feature>();

	public void transformChildren(Feature currentSmFeature, de.ubt.ai1.fm.Feature currentFmFeature) {
		for (ChildRelationship childRelationship : currentSmFeature.getChildren()) {
			Feature child = childRelationship.getChild();

			// createAtomicFeature
			if (child.getChildren().size() == 0) {
				AtomicFeature newFmAtomicFeature = createAtomicFeature();
				transformFeatureAttributes(child, newFmAtomicFeature);
				newFmAtomicFeature.setParent((FeatureGroup) currentFmFeature);
			}
			// createFeatureGroup
			else {
				FeatureGroup newFmFeatureGroup = createFeatureGroup();
				transformFeatureAttributes(child, newFmFeatureGroup);

				newFmFeatureGroup.setParent((FeatureGroup) currentFmFeature);
				transformChildren(child, newFmFeatureGroup);
			}
		}
	}

	public void transformXorOrGroups(Feature currentSmFeature) {
		for (ChildRelationship childRelationship : currentSmFeature.getChildren()) {
			Feature child = childRelationship.getChild();

			if (child.getGroups().size() > 0) {

				// create for every featuregroup a new famile featuregroup
				for (de.ubt.ai1.supermod.mm.feature.FeatureGroup featureGroup : child.getGroups()) {
					FeatureGroup newNestedFeatureGroup = createFeatureGroup();

					if (featureGroup instanceof XorFeatureGroup) {
						toXorFeatureGroup(newNestedFeatureGroup);
					}
					if (featureGroup instanceof OrFeatureGroup) {
						toOrFeatureGroup(newNestedFeatureGroup);
					}

					// add corresponding famile grouped features to newly created famile
					// featuregroup as children
					for (GroupMembership member : featureGroup.getGroupedFeatures()) {
						de.ubt.ai1.fm.Feature correspondingGroupedFmFeature = smTofmFeatureMapping
								.get(member.getGroupedFeature());
						newNestedFeatureGroup.getChildren().add(correspondingGroupedFmFeature);
					}

					// add newly created famile featuregroup to parent featuregroup
					FeatureGroup correspondingFmFeatureChild = (FeatureGroup) smTofmFeatureMapping.get(child);
					correspondingFmFeatureChild.getChildren().add(newNestedFeatureGroup);
				}
			}
			transformXorOrGroups(child);
		}
	}

	public void transformFeatureDependencies(Feature currentSmFeature) {
		for (ChildRelationship childRelationship : currentSmFeature.getChildren()) {
			Feature child = childRelationship.getChild();

			if (child.getOutgoingDependencies().size() > 0) {
				for (FeatureDependency featureDependency : child.getOutgoingDependencies()) {
					// set feature requirement dependencies
					if (featureDependency instanceof FeatureRequirement) {
						Feature targetFeature = featureDependency.getTargetFeature();
						de.ubt.ai1.fm.Feature correspondingFmSourceFeature = smTofmFeatureMapping.get(child);
						de.ubt.ai1.fm.Feature correspondingFmTargetFeature = smTofmFeatureMapping.get(targetFeature);
						correspondingFmTargetFeature.getRequiredBy().add(correspondingFmSourceFeature);
					}
					// set feature exclude dependencies
					if (featureDependency instanceof FeatureExclusion) {
						Feature targetFeature = featureDependency.getTargetFeature();
						de.ubt.ai1.fm.Feature correspondingFmSourceFeature = smTofmFeatureMapping.get(child);
						de.ubt.ai1.fm.Feature correspondingFmTargetFeature = smTofmFeatureMapping.get(targetFeature);
						correspondingFmTargetFeature.getExcludedBy().add(correspondingFmSourceFeature);
					}
				}
			}
			transformFeatureDependencies(child);
		}
	}

	private AtomicFeature createAtomicFeature() {
		FeaturemodelFactory featuremodelFactory = FeaturemodelPackage.eINSTANCE.getFeaturemodelFactory();
		return featuremodelFactory.createAtomicFeature();
	}

	private FeatureGroup createFeatureGroup() {
		FeaturemodelFactory featuremodelFactory = FeaturemodelPackage.eINSTANCE.getFeaturemodelFactory();
		return featuremodelFactory.createFeatureGroup();
	}

	public void transformFeatureAttributes(Feature smFeature, de.ubt.ai1.fm.Feature fmFeature) {
		fmFeature.setName(smFeature.getNames().get(0).getDisplayName());
		fmFeature.setRequired(isMandatory(smFeature));
		fmFeature.setKernel(true);

		smTofmFeatureMapping.put(smFeature, fmFeature);
	}

	private Boolean isMandatory(Feature smFeature) {
		if (smFeature.getMandatory() == null) {
			return false;
		} else
			return true;
	}

	private void toXorFeatureGroup(FeatureGroup fmFeatureGroup) {
		fmFeatureGroup.setName("XOR");
		fmFeatureGroup.setMinSelect(1);
		fmFeatureGroup.setMaxSelect(1);
	}

	private void toOrFeatureGroup(FeatureGroup fmFeatureGroup) {
		fmFeatureGroup.setName("OR");
		fmFeatureGroup.setMinSelect(1);
		fmFeatureGroup.setMaxSelect(-1);
	}
}
