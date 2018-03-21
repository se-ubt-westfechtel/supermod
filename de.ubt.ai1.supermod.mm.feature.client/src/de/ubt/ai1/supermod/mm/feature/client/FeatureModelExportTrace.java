/**
 */
package de.ubt.ai1.supermod.mm.feature.client;

import de.ubt.ai1.supermod.mm.client.ProductDimensionExportTrace;

import de.ubt.ai1.supermod.mm.feature.Feature;

import org.eclipse.emf.common.util.EMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature Model Export Trace</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai1.supermod.mm.feature.client.FeatureModelExportTrace#getFeatureToFeatureMap <em>Feature To Feature Map</em>}</li>
 * </ul>
 *
 * @see de.ubt.ai1.supermod.mm.feature.client.SuperModFeatureClientPackage#getFeatureModelExportTrace()
 * @model
 * @generated
 */
public interface FeatureModelExportTrace extends ProductDimensionExportTrace {
	/**
	 * Returns the value of the '<em><b>Feature To Feature Map</b></em>' map.
	 * The key is of type {@link de.ubt.ai1.supermod.mm.feature.Feature},
	 * and the value is of type {@link de.ubt.ai1.supermod.mm.feature.Feature},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature To Feature Map</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature To Feature Map</em>' map.
	 * @see de.ubt.ai1.supermod.mm.feature.client.SuperModFeatureClientPackage#getFeatureModelExportTrace_FeatureToFeatureMap()
	 * @model mapType="de.ubt.ai1.supermod.mm.feature.client.FeatureToFeatureMapEntry&lt;de.ubt.ai1.supermod.mm.feature.Feature, de.ubt.ai1.supermod.mm.feature.Feature&gt;"
	 * @generated
	 */
	EMap<Feature, Feature> getFeatureToFeatureMap();

} // FeatureModelExportTrace
