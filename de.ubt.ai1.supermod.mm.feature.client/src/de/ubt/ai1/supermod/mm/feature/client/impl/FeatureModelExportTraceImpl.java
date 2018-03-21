/**
 */
package de.ubt.ai1.supermod.mm.feature.client.impl;

import de.ubt.ai1.supermod.mm.client.impl.ProductDimensionExportTraceImpl;

import de.ubt.ai1.supermod.mm.feature.Feature;

import de.ubt.ai1.supermod.mm.feature.client.FeatureModelExportTrace;
import de.ubt.ai1.supermod.mm.feature.client.SuperModFeatureClientPackage;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature Model Export Trace</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai1.supermod.mm.feature.client.impl.FeatureModelExportTraceImpl#getFeatureToFeatureMap <em>Feature To Feature Map</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FeatureModelExportTraceImpl extends ProductDimensionExportTraceImpl implements FeatureModelExportTrace {
	/**
	 * The cached value of the '{@link #getFeatureToFeatureMap() <em>Feature To Feature Map</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureToFeatureMap()
	 * @generated
	 * @ordered
	 */
	protected EMap<Feature, Feature> featureToFeatureMap;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeatureModelExportTraceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SuperModFeatureClientPackage.Literals.FEATURE_MODEL_EXPORT_TRACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<Feature, Feature> getFeatureToFeatureMap() {
		if (featureToFeatureMap == null) {
			featureToFeatureMap = new EcoreEMap<Feature,Feature>(SuperModFeatureClientPackage.Literals.FEATURE_TO_FEATURE_MAP_ENTRY, FeatureToFeatureMapEntryImpl.class, this, SuperModFeatureClientPackage.FEATURE_MODEL_EXPORT_TRACE__FEATURE_TO_FEATURE_MAP);
		}
		return featureToFeatureMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SuperModFeatureClientPackage.FEATURE_MODEL_EXPORT_TRACE__FEATURE_TO_FEATURE_MAP:
				return ((InternalEList<?>)getFeatureToFeatureMap()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SuperModFeatureClientPackage.FEATURE_MODEL_EXPORT_TRACE__FEATURE_TO_FEATURE_MAP:
				if (coreType) return getFeatureToFeatureMap();
				else return getFeatureToFeatureMap().map();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SuperModFeatureClientPackage.FEATURE_MODEL_EXPORT_TRACE__FEATURE_TO_FEATURE_MAP:
				((EStructuralFeature.Setting)getFeatureToFeatureMap()).set(newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SuperModFeatureClientPackage.FEATURE_MODEL_EXPORT_TRACE__FEATURE_TO_FEATURE_MAP:
				getFeatureToFeatureMap().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SuperModFeatureClientPackage.FEATURE_MODEL_EXPORT_TRACE__FEATURE_TO_FEATURE_MAP:
				return featureToFeatureMap != null && !featureToFeatureMap.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FeatureModelExportTraceImpl
