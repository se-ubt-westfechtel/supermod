/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.mm.feature.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import de.ubt.ai1.supermod.edit.feature.provider.SuperModFeatureEditPlugin;
import de.ubt.ai1.supermod.mm.core.provider.HybridElementItemProvider;
import de.ubt.ai1.supermod.mm.feature.DisplayName;
import de.ubt.ai1.supermod.mm.feature.Feature;
import de.ubt.ai1.supermod.mm.feature.FeatureDependency;
import de.ubt.ai1.supermod.mm.feature.FeatureModel;
import de.ubt.ai1.supermod.mm.feature.SuperModFeaturePackage;
import de.ubt.ai1.supermod.mm.feature.client.SingleVersionFeatureModelDescriptor;

/**
 * This is the item provider adapter for a {@link de.ubt.ai1.supermod.mm.feature.FeatureDependency} object.
 * <!-- begin-user-doc -->
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date 	2014-07-28
 * @implements org.eclipse.emf.edit.provider.IUpdateableItemText
 * <!-- end-user-doc -->
 * @generated
 */
public class FeatureDependencyItemProvider extends HybridElementItemProvider implements org.eclipse.emf.edit.provider.IUpdateableItemText {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureDependencyItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getText(Object object) {
		FeatureDependency fd = (FeatureDependency) object;
		if (fd.getTargetFeature() != null && !fd.getTargetFeature().getNames().isEmpty()) {
			return fd.getTargetFeature().getNames().get(0).getDisplayName();
		}
		return "<enter referenced feature>";
	}
	
	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.mm.core.provider.ProductSpaceElementItemProvider#getUpdateableText(java.lang.Object)
	 */
	@Override
	public String getUpdateableText(Object object) {
		return getText(object);
	}
	
	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.mm.core.provider.ProductSpaceElementItemProvider#setText(java.lang.Object, java.lang.String)
	 */
	@Override
	public void setText(Object object, String text) {
		FeatureDependency fd = (FeatureDependency) object;
		FeatureModel fm = null;
		EObject root = EcoreUtil.getRootContainer(fd);
		if (root instanceof FeatureModel) {
			fm = (FeatureModel) root;
		}
		else if (root instanceof SingleVersionFeatureModelDescriptor) {
			fm = ((SingleVersionFeatureModelDescriptor) root).getFeatureModel();
		}
		if (fm == null) return;
		for (Feature f : fm.getFeatures()) {
			for (DisplayName dn : f.getNames()) {
				if (dn.getDisplayName().equals(text)) {
					fd.setTargetFeature(f);				
					return;
				}
			}
		}
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

		switch (notification.getFeatureID(FeatureDependency.class)) {
			case SuperModFeaturePackage.FEATURE_DEPENDENCY__UUID:
			case SuperModFeaturePackage.FEATURE_DEPENDENCY__DEPENDENCY_INVARIANT:
			case SuperModFeaturePackage.FEATURE_DEPENDENCY__SOURCE_FEATURE:
			case SuperModFeaturePackage.FEATURE_DEPENDENCY__TARGET_FEATURE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
		}
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
		return SuperModFeatureEditPlugin.INSTANCE;
	}

}
