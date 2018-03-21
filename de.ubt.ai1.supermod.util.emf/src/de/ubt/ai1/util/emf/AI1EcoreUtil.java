package de.ubt.ai1.util.emf;

import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * Utility class that provides functions frequently needed
 * when using EMF.
 * 
 * @author Felix Schwaegerl
 */
public class AI1EcoreUtil {
	
	/**
	 * Converts the value returned by an eGet-call to a list
	 * of Object values, no matter if the structural feature
	 * is many-valued or not. In case of a single-valued feature,
	 * a one-element list is returned.
	 * 
	 * @param value as returned by eGet
	 * @return A list of objects, never null
	 */
	public static EList<Object> expandStructuralFeatureValues(Object value) {
		if (value == null) {
			return ECollections.newBasicEList();
		}
		else if (value instanceof EList<?>) {
			return ECollections.newBasicEList((EList<?>) value);
		}
		else {
			return ECollections.newBasicEList(value);
		}
	}
	
	/**
	 * Returns a list that contains all EMF objects which
	 * are accessed by a given object using a given reference
	 * 
	 * @param source
	 * @param ref
	 * @return A list of referenced objects, never null
	 */
	@SuppressWarnings("unchecked")
	public static EList<EObject> getReferencedValues(EObject source, EReference ref) {
		EList<EObject> result = ECollections.newBasicEList();
		Object o = source.eGet(ref);
		if (o != null) {
			if (ref.isMany()) {
				result.addAll((EList<EObject>) o);
			}
			else {
				result.add((EObject) o);
			}
		}
		return result;
	}
	
	/**
	 * Returns a list that contains all attribute values
	 * for a given EMF object and reference.
	 * 
	 * @param container
	 * @param attr
	 * @return A list of Objects that represent attribute values
	 */
	@SuppressWarnings("unchecked")
	public static EList<Object> getAttributeValues(EObject container, EAttribute attr) {
		EList<Object> result = ECollections.newBasicEList();
		Object o = container.eGet(attr);
		if (o != null) {
			if (attr.isMany()) {
				result.addAll((EList<Object>) o);
			}
			else {
				result.add(o);
			}
		}
		return result;
	}
	
	/**
	 * Returns a list that contains the string representation
	 * of all attribute values for a given EMF object and reference.
	 * 
	 * @param container
	 * @param attr
	 * @return
	 */
	public static EList<String> getAttributeValuesAsStrings(EObject container, EAttribute attr) {
		EList<Object> attrValues = getAttributeValues(container, attr);
		EDataType attrType = attr.getEAttributeType();
		EList<String> attrStrings = ECollections.newBasicEList();
		for (Object o : attrValues) {
			if (o instanceof EEnumLiteral) {
				attrStrings.add(((EEnumLiteral) o).getLiteral());
			}
			else {
				attrStrings.add(EcoreUtil.convertToString(attrType, o));
			}
		}
		return attrStrings;
	}
	
	/**
	 * Checks if a given structural feature would persist accessible
	 * objects in an XMI resource.
	 * 
	 * @param sf
	 * @return true if the feature is persistent
	 */
	public static boolean isPersistent(EStructuralFeature sf) {
		if (sf == null) {
			return false;
		}
		return (sf.isChangeable() && !sf.isDerived() && !sf.isTransient() &&
				!(sf instanceof EReference && ((EReference)sf).isContainer()));
	}

	/**
	 * Filters a given list of structural features for features that meet the
	 * persistency criterion
	 * 
	 * @see isPersistent
	 * 
	 * @param eStructuralFeatures
	 * @return input without non-persistent features
	 */
	public static EList<EStructuralFeature> filterPersistent(
			EList<EStructuralFeature> eStructuralFeatures) {
		EList<EStructuralFeature> persistentFeatures = ECollections.newBasicEList();
		for (EStructuralFeature eStructuralFeature : eStructuralFeatures) {
			if (isPersistent(eStructuralFeature)) {
				persistentFeatures.add(eStructuralFeature);
			}
		}
		return persistentFeatures;
	}

	/**
	 * Sets the attribute of a given object to a value given as list of objects,
	 * no matter if the attribute is single- or multi-valued
	 * 
	 * @param eo
	 * @param attr
	 * @param objects
	 *            object representation of attribute values
	 * @param clear
	 *            if true, existing attribute values will be deleted for
	 *            multi-valued attributes
	 */
	public static void setAttributeValues(EObject eo, EAttribute attr,
			EList<Object> objects, boolean clear) {
		if (attr.isMany()) {
			@SuppressWarnings("unchecked")
			EList<Object> eoObjects = (EList<Object>) eo.eGet(attr);
			if (clear) {
				eoObjects.clear();
			}
			eoObjects.addAll(objects);
		} else if (!objects.isEmpty()) {
			eo.eSet(attr, objects.get(0));
		}
	}

	/**
	 * Like setAttributeValues, but with literals as input
	 * 
	 * @param eo
	 * @param attr
	 * @param literals
	 *            string representation of attribute values
	 * @param clear
	 */
	public static void setAttributeValuesFromStrings(EObject eo,
			EAttribute attr, EList<String> literals, boolean clear) {
		EList<Object> objects = ECollections.newBasicEList();
		for (String literal : literals) {
			Object obj = EcoreUtil.createFromString(attr.getEAttributeType(),
					literal);
			objects.add(obj);
		}
		setAttributeValues(eo, attr, objects, clear);
	}

}
