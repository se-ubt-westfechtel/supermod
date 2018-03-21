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
import de.ubt.ai1.supermod.mm.core.provider.HybridElementItemProvider;
import de.ubt.ai1.supermod.mm.feature.ChildRelationship;
import de.ubt.ai1.supermod.mm.feature.DisplayName;
import de.ubt.ai1.supermod.mm.feature.Feature;
import de.ubt.ai1.supermod.mm.feature.FeatureGroup;
import de.ubt.ai1.supermod.mm.feature.FeatureModel;
import de.ubt.ai1.supermod.mm.feature.GroupMembership;
import de.ubt.ai1.supermod.mm.feature.SuperModFeatureFactory;
import de.ubt.ai1.supermod.mm.feature.SuperModFeaturePackage;
import de.ubt.ai1.supermod.mm.feature.client.SingleVersionFeatureModelDescriptor;

/**
 * This is the item provider adapter for a {@link de.ubt.ai1.supermod.mm.feature.FeatureGroup} object.
 * <!-- begin-user-doc -->
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date 	2014-07-28
 * <!-- end-user-doc -->
 * @generated
 */
public class FeatureGroupItemProvider
	extends HybridElementItemProvider {
	
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureGroupItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(SuperModFeaturePackage.Literals.FEATURE_GROUP__GROUPED_FEATURES);
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
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((FeatureGroup)object).getProxyUUID();
		return label == null || label.length() == 0 ?
			getString("_UI_FeatureGroup_type") :
			getString("_UI_FeatureGroup_type") + " " + label;
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

		switch (notification.getFeatureID(FeatureGroup.class)) {
			case SuperModFeaturePackage.FEATURE_GROUP__UUID:
			case SuperModFeaturePackage.FEATURE_GROUP__GROUP_INVARIANT:
			case SuperModFeaturePackage.FEATURE_GROUP__PARENT_FEATURE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case SuperModFeaturePackage.FEATURE_GROUP__GROUPED_FEATURES:
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

		newChildDescriptors.add
			(createChildParameter
				(SuperModFeaturePackage.Literals.FEATURE_GROUP__GROUPED_FEATURES,
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
		FeatureGroup fg = (FeatureGroup) object;
		List<Feature> children = new ArrayList<>();
		for (GroupMembership gm : fg.getGroupedFeatures()) {
			Feature gf = gm.getGroupedFeature();
			if (gf != null && gf.getEliminations().isEmpty()) {
				children.add(gf);
			}
		}
		return children;
	}
	
	@Override
	protected Command createAddCommand(EditingDomain domain, EObject owner,
			EStructuralFeature feature, Collection<?> collection, int index) {
		FeatureGroup fg = (FeatureGroup) owner;
		FeatureModel fm = null;
		EObject root = EcoreUtil.getRootContainer(fg);
		if (root instanceof FeatureModel) {
			fm = (FeatureModel) root;
		}
		else if (root instanceof SingleVersionFeatureModelDescriptor) {
			fm = ((SingleVersionFeatureModelDescriptor) root).getFeatureModel();
		}
		if (fm != null && feature.equals(SuperModFeaturePackage.Literals.FEATURE_GROUP__GROUPED_FEATURES)) {
			CompoundCommand cc = new CompoundCommand();
			for (Object o : collection) {
				Feature f = (Feature) o;
				Feature p = fg.getParentFeature();
				ChildRelationship cr = SuperModFeatureFactory.eINSTANCE.createChildRelationship();
				GroupMembership gm = SuperModFeatureFactory.eINSTANCE.createGroupMembership();
				DisplayName dn = SuperModFeatureFactory.eINSTANCE.createDisplayName();
				cc.append(new SetCommand(domain, f, SuperModCorePackage.Literals.UUID_ELEMENT__UUID, EcoreUtil.generateUUID()));
				cc.append(new SetCommand(domain, dn, SuperModFeaturePackage.Literals.DISPLAY_NAME__DISPLAY_NAME, "Grouped Feature"));
				cc.append(new AddCommand(domain, f, SuperModFeaturePackage.Literals.FEATURE__NAMES, dn));
				cc.append(new AddCommand(domain, fm, SuperModFeaturePackage.Literals.FEATURE_MODEL__FEATURES, f));
				cc.append(new SetCommand(domain, cr, SuperModFeaturePackage.Literals.CHILD_RELATIONSHIP__CHILD, f));
				cc.append(new AddCommand(domain, p, SuperModFeaturePackage.Literals.FEATURE__CHILDREN, cr));
				cc.append(new SetCommand(domain, gm, SuperModFeaturePackage.Literals.GROUP_MEMBERSHIP__GROUPED_FEATURE, f));
				cc.append(new AddCommand(domain, fg, SuperModFeaturePackage.Literals.FEATURE_GROUP__GROUPED_FEATURES, gm));
			}
			return cc;
		}
		return UnexecutableCommand.INSTANCE;
	}
	
	@Override
	protected Command createDragAndDropCommand(EditingDomain domain, Object owner, float location, int operations,
			int operation, Collection<?> collection) {
		FeatureGroup group = (FeatureGroup) owner;
		CompoundCommand cc = new CompoundCommand();
		for (Object o : collection) {
			if (o instanceof Feature) {
				Feature f = (Feature) o;
				if (!f.getIncomingRoots().isEmpty()) {
					return UnexecutableCommand.INSTANCE;
				}
				for (ChildRelationship cr : f.getParents()) {
					if (cr.getParent() != group.getParentFeature()) {
						return UnexecutableCommand.INSTANCE;
					}
				}
				for (GroupMembership oldGm : f.getGroupedBy()) {
					cc.append(new SetCommand(domain, oldGm, SuperModFeaturePackage.Literals.GROUP_MEMBERSHIP__GROUP, null));
					cc.append(new SetCommand(domain, oldGm, SuperModFeaturePackage.Literals.GROUP_MEMBERSHIP__GROUPED_FEATURE, null));
				}
				GroupMembership gm = SuperModFeatureFactory.eINSTANCE.createGroupMembership();
				cc.append(new SetCommand(domain, gm, SuperModFeaturePackage.Literals.GROUP_MEMBERSHIP__GROUP, group));
				cc.append(new SetCommand(domain, gm, SuperModFeaturePackage.Literals.GROUP_MEMBERSHIP__GROUPED_FEATURE, f));
			}
		}
		if (cc.isEmpty()) {
			return UnexecutableCommand.INSTANCE;
		}
		return cc;	
	}
	
}
