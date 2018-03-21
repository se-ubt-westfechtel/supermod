/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.mm.feature.provider;


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.command.UnexecutableCommand;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import de.ubt.ai1.supermod.edit.feature.provider.SuperModFeatureEditPlugin;
import de.ubt.ai1.supermod.mm.core.SuperModCorePackage;
import de.ubt.ai1.supermod.mm.core.provider.HybridDimensionItemProvider;
import de.ubt.ai1.supermod.mm.feature.DisplayName;
import de.ubt.ai1.supermod.mm.feature.Feature;
import de.ubt.ai1.supermod.mm.feature.FeatureModel;
import de.ubt.ai1.supermod.mm.feature.Mandatory;
import de.ubt.ai1.supermod.mm.feature.RootRelationship;
import de.ubt.ai1.supermod.mm.feature.SuperModFeatureFactory;
import de.ubt.ai1.supermod.mm.feature.SuperModFeaturePackage;

/**
 * This is the item provider adapter for a {@link de.ubt.ai1.supermod.mm.feature.FeatureModel} object.
 * <!-- begin-user-doc -->
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date 	2014-07-28
 * <!-- end-user-doc -->
 * @generated
 */
public class FeatureModelItemProvider
	extends HybridDimensionItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureModelItemProvider(AdapterFactory adapterFactory) {
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
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(SuperModFeaturePackage.Literals.FEATURE_MODEL__ROOTS);
			childrenFeatures.add(SuperModFeaturePackage.Literals.FEATURE_MODEL__FEATURES);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns FeatureModel.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/FeatureModel"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_FeatureModel_type");
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

		switch (notification.getFeatureID(FeatureModel.class)) {
			case SuperModFeaturePackage.FEATURE_MODEL__ROOTS:
			case SuperModFeaturePackage.FEATURE_MODEL__FEATURES:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

//		newChildDescriptors.add
//			(createChildParameter
//				(SuperModFeaturePackage.Literals.FEATURE_MODEL__ROOTS,
//				 SuperModFeatureFactory.eINSTANCE.createRootRelationship()));

		newChildDescriptors.add
			(createChildParameter
				(SuperModFeaturePackage.Literals.FEATURE_MODEL__FEATURES,
				 SuperModFeatureFactory.eINSTANCE.createFeature()));
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
	
	/* (non-Javadoc)
	 * @see org.eclipse.emf.edit.provider.ItemProviderAdapter#getChildren(java.lang.Object)
	 */
	@Override
	public Collection<?> getChildren(Object object) {
		FeatureModel fm = (FeatureModel) object;
		List<Feature> roots = new ArrayList<>();
		for (RootRelationship root : fm.getRoots()) {
			Feature f = root.getFeature();
			if (f != null && f.getEliminations().isEmpty()) {
				roots.add(f);
			}
		}
		return roots;
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.emf.edit.provider.ItemProviderAdapter#createAddCommand(org.eclipse.emf.edit.domain.EditingDomain, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EStructuralFeature, java.util.Collection, int)
	 */
	@Override
	protected Command createAddCommand(EditingDomain domain, EObject owner,
			EStructuralFeature feature, Collection<?> collection, int index) {
		FeatureModel fm = (FeatureModel) owner;
		if (feature.equals(SuperModFeaturePackage.Literals.FEATURE_MODEL__FEATURES)) {
			if (fm.getRoots().isEmpty()) {
				CompoundCommand cc = new CompoundCommand();
				for (Object o : collection) {
					Feature f = (Feature) o;
					RootRelationship rr = SuperModFeatureFactory.eINSTANCE.createRootRelationship();
					Mandatory m = SuperModFeatureFactory.eINSTANCE.createMandatory();
					DisplayName dn = SuperModFeatureFactory.eINSTANCE.createDisplayName();
					cc.append(new SetCommand(domain, dn, SuperModFeaturePackage.Literals.DISPLAY_NAME__DISPLAY_NAME, "Root Feature"));
					cc.append(new AddCommand(domain, f, SuperModFeaturePackage.Literals.FEATURE__NAMES, dn));
					cc.append(new SetCommand(domain, f, SuperModFeaturePackage.Literals.FEATURE__MANDATORY, m));
					cc.append(new SetCommand(domain, f, SuperModCorePackage.Literals.UUID_ELEMENT__UUID, EcoreUtil.generateUUID()));
					cc.append(new SetCommand(domain, rr, SuperModFeaturePackage.Literals.ROOT_RELATIONSHIP__FEATURE, f));
					cc.append(new AddCommand(domain, fm, SuperModFeaturePackage.Literals.FEATURE_MODEL__FEATURES, f));
					cc.append(new AddCommand(domain, fm, SuperModFeaturePackage.Literals.FEATURE_MODEL__ROOTS, rr));
				}
				return cc;
			}
		}
		return UnexecutableCommand.INSTANCE;
	}

}
