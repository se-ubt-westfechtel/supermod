package de.ubt.ai1.supermod.adapters.famile.service;

import com.google.inject.ImplementedBy;

import de.ubt.ai1.f2dmm.ObjectMapping;
import de.ubt.ai1.supermod.adapters.famile.service.impl.VisibilityTransformationService;
import de.ubt.ai1.supermod.mm.core.OptionBinding;
import de.ubt.ai1.supermod.mm.core.OptionExpr;
import de.ubt.ai1.supermod.mm.emffile.EMFObject;

/**
 * Service to transform SuperMod visibilites to FAMILE FeatureExprString
 * 
 * @author Alexander Zimmer
 * @date 2018-02-04
 *
 */
@ImplementedBy(VisibilityTransformationService.class)
public interface IVisibilityTransformationService {

	/**
	 * Checks if given OptionExpr contains revision elements. If true calls
	 * VisibilityEvaluationService
	 * 
	 * @param optionRef
	 *            OptionExpr that gets transformed
	 * @param choice
	 *            current specified choice of user in order to evaluate revision
	 *            bindings
	 * @return String representation of SuperMod visibility without revision elements
	 */
	public String transformVisibilities(OptionExpr optionRef, OptionBinding choice);

	/**
	 * Calls private methods for object and attribute/crossreference mappings
	 * @param emfObject SuperMod EMFObject with Attribute/CrossReference Mappings in form of EMFFeatureRefs
	 * @param objectMapping Corresponding ObjectMapping to given EMFObject
	 * @param choice current specified choice of user in order to evaluate revision
	 *            bindings
	 */
	public void setMappingVisibilities(EMFObject emfObject, ObjectMapping objectMapping, OptionBinding choice);
}