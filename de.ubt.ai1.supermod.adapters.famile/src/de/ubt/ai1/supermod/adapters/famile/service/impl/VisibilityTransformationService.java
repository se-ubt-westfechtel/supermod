package de.ubt.ai1.supermod.adapters.famile.service.impl;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.EList;

import com.google.inject.Inject;

import de.ubt.ai1.f2dmm.AttributeMapping;
import de.ubt.ai1.f2dmm.CrossrefMapping;
import de.ubt.ai1.f2dmm.Mapping;
import de.ubt.ai1.f2dmm.ObjectMapping;
import de.ubt.ai1.supermod.adapters.famile.service.IVisibilityEvaluationService;
import de.ubt.ai1.supermod.adapters.famile.service.IVisibilityTransformationService;
import de.ubt.ai1.supermod.mm.change.util.ChangeSpaceUtil;
import de.ubt.ai1.supermod.mm.core.OptionBinding;
import de.ubt.ai1.supermod.mm.core.OptionExpr;
import de.ubt.ai1.supermod.mm.emffile.EMFFeatureRef;
import de.ubt.ai1.supermod.mm.emffile.EMFObject;
import de.ubt.ai1.supermod.mm.emffile.EMFValue;

public class VisibilityTransformationService implements IVisibilityTransformationService {
	@Inject
	private IVisibilityEvaluationService visibilityEvaluationService;

	public String transformVisibilities(OptionExpr optionRef, OptionBinding choice) {
		String visibility = "";
		if (visibilityEvaluationService.containsRevisions(optionRef)) {
			return visibilityEvaluationService.manageVisibilities(visibility, choice, optionRef);
		} else {
			return visibilityEvaluationService.customToString(visibility, optionRef);
		}
	}

	public void setMappingVisibilities(EMFObject emfObject, ObjectMapping objectMapping, OptionBinding choice) {
		setObjectMappingVisibilities(emfObject, objectMapping, choice);
		setCrossRefAndAttributeMappingVisibilities(objectMapping, emfObject, choice);
	}

	private void setObjectMappingVisibilities(EMFObject emfObject, ObjectMapping objectMapping, OptionBinding choice) {
		if (emfObject.getVisibility() != null) {
			OptionExpr optionRef = ChangeSpaceUtil.expandExpression(emfObject.getVisibility());
			String visibility = transformVisibilities(optionRef, choice);
			objectMapping.setFeatureExprStr(visibility);
		}
	}

	private void setCrossRefAndAttributeMappingVisibilities(ObjectMapping objectMapping, EMFObject emfObject,
			OptionBinding choice) {
		// fetch all CrossReference and AttributeMappings
		List<Mapping> crossRefAndAttrMappings = objectMapping.getMappings().stream()
				.filter(mapping -> !(mapping instanceof ObjectMapping)).collect(Collectors.toList());

		// iterate over all EMFFeatureRefs
		EList<EMFFeatureRef> featureRefs = emfObject.getFeatureRefs();
		for (EMFFeatureRef featureRef : featureRefs) {
			String featureRefName = featureRef.getFeatureName();

			// fetch all Mappings that have the same name like given EMFFeatureRef
			List<Mapping> correspondingFeatureRefMappings = new LinkedList<>();
			for (Mapping m : crossRefAndAttrMappings) {
				if (m instanceof CrossrefMapping) {
					String crossRefName = ((CrossrefMapping) m).getMappingCrossReference().getName();
					if (crossRefName.equals(featureRefName)) {
						correspondingFeatureRefMappings.add(m);
					}
				}
				if (m instanceof AttributeMapping) {
					String attributeName = ((AttributeMapping) m).getMappingAttribute().getName();
					if (attributeName.equals(featureRefName)) {
						correspondingFeatureRefMappings.add(m);
					}
				}
			}

			// set visibilities of corresponding Mappings of given ObjectMapping
			EList<EMFValue> orderedValues = featureRef.getOrderedValues();
			int min = Math.min(orderedValues.size(), correspondingFeatureRefMappings.size());

			for (int i = 0; i < min; i++) {
				EMFValue emfValue = orderedValues.get(i);
				Mapping mapping = correspondingFeatureRefMappings.get(i);
				
				if (emfValue.getVisibility() != null) {
					OptionExpr optionRef = ChangeSpaceUtil.expandExpression(emfValue.getVisibility());
					String visibility = transformVisibilities(optionRef, choice);
					mapping.setFeatureExprStr(visibility);
				}

			}
		}
	}
}
