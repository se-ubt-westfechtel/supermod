/******************************************************************************
 * Copyright (c) 2018 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.mm.emffile.client.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;

import de.ubt.ai1.supermod.edit.emffile.client.provider.SuperModEMFFileClientEditPlugin;
import de.ubt.ai1.supermod.mm.client.ProductConflict;
import de.ubt.ai1.supermod.mm.client.Severity;
import de.ubt.ai1.supermod.mm.client.provider.ProductConflictItemProvider;
import de.ubt.ai1.supermod.mm.emffile.client.EMFMultiFeatureValueConflict;
import de.ubt.ai1.supermod.mm.emffile.client.SuperModEMFFileClientPackage;

/**
 * This is the item provider adapter for a {@link de.ubt.ai1.supermod.mm.emffile.client.EMFMultiFeatureValueConflict} object.
 * <!-- begin-user-doc -->
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>,
 * 			Johannes Schroepfer <Johannes.M.Schroepfer(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date	2018-01-09
 * <!-- end-user-doc -->
 * @generated
 */
public class EMFMultiFeatureValueConflictItemProvider extends ProductConflictItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMFMultiFeatureValueConflictItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addAffectedFeatureRefPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Affected Feature Ref feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAffectedFeatureRefPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EMFMultiFeatureValueConflict_affectedFeatureRef_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EMFMultiFeatureValueConflict_affectedFeatureRef_feature", "_UI_EMFMultiFeatureValueConflict_type"),
				 SuperModEMFFileClientPackage.Literals.EMF_MULTI_FEATURE_VALUE_CONFLICT__AFFECTED_FEATURE_REF,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns EMFMultiFeatureValueConflict.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/EMFMultiFeatureValueConflict"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		Severity labelValue = ((EMFMultiFeatureValueConflict)object).getSeverity();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_EMFMultiFeatureValueConflict_type") :
			getString("_UI_EMFMultiFeatureValueConflict_type") + " " + label;
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return SuperModEMFFileClientEditPlugin.INSTANCE;
	}

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.mm.client.provider.ConflictItemProvider#getConflictName(de.ubt.ai1.supermod.mm.client.Conflict)
	 */
	@Override
	public String getConflictName(ProductConflict c) {
		return "Multi-Valued Structural Feature Values";
	}

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.mm.client.provider.ConflictItemProvider#getConflictDescription(de.ubt.ai1.supermod.mm.client.Conflict)
	 */
	@Override
	public String getConflictDescription(ProductConflict c) {
		EMFMultiFeatureValueConflict vc = (EMFMultiFeatureValueConflict) c;
		String featureName = vc.getAffectedFeatureRef().getFeatureName();
		return "The number of values of the structural feature '" + featureName 
				+ "' is inconsistent with its upper and lower bounds.";
	}

}
