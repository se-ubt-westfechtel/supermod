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
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import de.ubt.ai1.supermod.edit.feature.provider.SuperModFeatureEditPlugin;
import de.ubt.ai1.supermod.mm.core.SuperModCorePackage;
import de.ubt.ai1.supermod.mm.core.provider.HybridElementItemProvider;
import de.ubt.ai1.supermod.mm.feature.ChildRelationship;
import de.ubt.ai1.supermod.mm.feature.DisplayName;
import de.ubt.ai1.supermod.mm.feature.Feature;
import de.ubt.ai1.supermod.mm.feature.FeatureDependency;
import de.ubt.ai1.supermod.mm.feature.FeatureGroup;
import de.ubt.ai1.supermod.mm.feature.FeatureModel;
import de.ubt.ai1.supermod.mm.feature.GroupMembership;
import de.ubt.ai1.supermod.mm.feature.SuperModFeatureFactory;
import de.ubt.ai1.supermod.mm.feature.SuperModFeaturePackage;
import de.ubt.ai1.supermod.mm.feature.client.SingleVersionFeatureModelDescriptor;

/**
 * This is the item provider adapter for a {@link de.ubt.ai1.supermod.mm.feature.Feature} object.
 * <!-- begin-user-doc -->
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date 	2014-07-28
 * @implements org.eclipse.emf.edit.provider.IUpdateableItemText
 * <!-- end-user-doc -->
 * @generated
 */
public class FeatureItemProvider
	extends HybridElementItemProvider implements org.eclipse.emf.edit.provider.IUpdateableItemText {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureItemProvider(AdapterFactory adapterFactory) {
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

			addAllChildFeaturesPropertyDescriptor(object);
			addTransitiveEliminationStatePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the All Child Features feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAllChildFeaturesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Feature_allChildFeatures_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Feature_allChildFeatures_feature", "_UI_Feature_type"),
				 SuperModFeaturePackage.Literals.FEATURE__ALL_CHILD_FEATURES,
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Transitive Elimination State feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTransitiveEliminationStatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Feature_transitiveEliminationState_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Feature_transitiveEliminationState_feature", "_UI_Feature_type"),
				 SuperModFeaturePackage.Literals.FEATURE__TRANSITIVE_ELIMINATION_STATE,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
//			childrenFeatures.add(SuperModFeaturePackage.Literals.FEATURE__FEATURE_OPTION);
			childrenFeatures.add(SuperModFeaturePackage.Literals.FEATURE__OUTGOING_DEPENDENCIES);
			childrenFeatures.add(SuperModFeaturePackage.Literals.FEATURE_MODEL__FEATURES);
			childrenFeatures.add(SuperModFeaturePackage.Literals.FEATURE__GROUPS);
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
	 * This returns Feature.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Object getImage(Object object) {
		if (((Feature) object).getMandatory() != null) {
			return overlayImage(object, getResourceLocator().getImage("full/obj16/Feature_mandatory"));
		}
		else {
			return overlayImage(object, getResourceLocator().getImage("full/obj16/Feature_optional"));
		}
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getText(Object object) {
		Feature f = (Feature) object;
		if (f.getNames().isEmpty()) return "unnamed Feature";
		if (f.getNames().size() == 1) {
			return f.getNames().get(0).getDisplayName();
		}
		else {
			String s = "[";
			for (DisplayName dn : f.getNames()) {
				s += dn.getDisplayName() + ", ";
			}
			return s.substring(0, s.length() - 2) + "]";
		}
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
		if (text.equals(getText(object))) return;
		Feature f = (Feature) object;
		EditingDomain ed = getActiveEditingDomain();
		DisplayName dn = SuperModFeatureFactory.eINSTANCE.createDisplayName();
		CompoundCommand cc = new CompoundCommand();
		cc.append(SetCommand.create(ed, f, SuperModFeaturePackage.Literals.FEATURE__NAMES, SetCommand.UNSET_VALUE));
		cc.append(SetCommand.create(ed, dn, SuperModFeaturePackage.Literals.DISPLAY_NAME__DISPLAY_NAME, text));
		cc.append(AddCommand.create(ed, f, SuperModFeaturePackage.Literals.FEATURE__NAMES, dn));
		if (ed == null) {
			cc.execute();
		}
		else {
			ed.getCommandStack().execute(cc);
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

		switch (notification.getFeatureID(Feature.class)) {
			case SuperModFeaturePackage.FEATURE__UUID:
			case SuperModFeaturePackage.FEATURE__FEATURE_MODEL:
			case SuperModFeaturePackage.FEATURE__FEATURE_OPTION:
			case SuperModFeaturePackage.FEATURE__NAMES:
			case SuperModFeaturePackage.FEATURE__PARENTS:
			case SuperModFeaturePackage.FEATURE__GROUPED_BY:
			case SuperModFeaturePackage.FEATURE__INCOMING_DEPENDENCIES:
			case SuperModFeaturePackage.FEATURE__MANDATORY:
			case SuperModFeaturePackage.FEATURE__ELIMINATIONS:
			case SuperModFeaturePackage.FEATURE__INCOMING_ROOTS:
			case SuperModFeaturePackage.FEATURE__TRANSITIVE_ELIMINATION_STATE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case SuperModFeaturePackage.FEATURE__CHILDREN:
			case SuperModFeaturePackage.FEATURE__GROUPS:
			case SuperModFeaturePackage.FEATURE__OUTGOING_DEPENDENCIES:
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
//				(SuperModFeaturePackage.Literals.FEATURE__FEATURE_OPTION,
//				 SuperModCoreFactory.eINSTANCE.createOption()));
//		
//		newChildDescriptors.add
//		(createChildParameter
//			(SuperModFeaturePackage.Literals.FEATURE__CHILDREN,
//			 SuperModFeatureFactory.eINSTANCE.createChildRelationship()));

		newChildDescriptors.add
			(createChildParameter
				(SuperModFeaturePackage.Literals.FEATURE_MODEL__FEATURES,
				 SuperModFeatureFactory.eINSTANCE.createFeature()));

		newChildDescriptors.add
			(createChildParameter
				(SuperModFeaturePackage.Literals.FEATURE__GROUPS,
				 SuperModFeatureFactory.eINSTANCE.createOrFeatureGroup()));

		newChildDescriptors.add
			(createChildParameter
				(SuperModFeaturePackage.Literals.FEATURE__GROUPS,
				 SuperModFeatureFactory.eINSTANCE.createXorFeatureGroup()));

		newChildDescriptors.add
			(createChildParameter
				(SuperModFeaturePackage.Literals.FEATURE__OUTGOING_DEPENDENCIES,
				 SuperModFeatureFactory.eINSTANCE.createFeatureRequirement()));

		newChildDescriptors.add
			(createChildParameter
				(SuperModFeaturePackage.Literals.FEATURE__OUTGOING_DEPENDENCIES,
				 SuperModFeatureFactory.eINSTANCE.createFeatureExclusion()));
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
		Feature f = (Feature) object;
		List<Object> children = new ArrayList<>();
		children.addAll(f.getOutgoingDependencies());
		for (ChildRelationship cr : f.getChildren()) {
			Feature child = cr.getChild();
			if (child.getEliminations().isEmpty()) {
				children.add(child);
			}
		}
		for (FeatureGroup fg : f.getGroups()) {
			for (GroupMembership gm : fg.getGroupedFeatures()) {
				Feature gf = gm.getGroupedFeature();
				if (children.contains(gf)) {
					children.remove(gf);
				}
			}
			children.add(fg);
		}
		return children;
	}
	
	@Override
	protected Command createAddCommand(EditingDomain domain, EObject owner,
			EStructuralFeature feature, Collection<?> collection, int index) {
		Feature parent = (Feature) owner;
		if (feature.equals(SuperModFeaturePackage.Literals.FEATURE_MODEL__FEATURES)) {
			FeatureModel fm = null;
			EObject root = EcoreUtil.getRootContainer(parent);
			if (root instanceof FeatureModel) {
				fm = (FeatureModel) root;
			}
			else if (root instanceof SingleVersionFeatureModelDescriptor) {
				fm = ((SingleVersionFeatureModelDescriptor) root).getFeatureModel();
			}
			if (fm != null) {
				CompoundCommand cc = new CompoundCommand();
				for (Object o : collection) {
					Feature f = (Feature) o;
					ChildRelationship cr = SuperModFeatureFactory.eINSTANCE.createChildRelationship();
					DisplayName dn = SuperModFeatureFactory.eINSTANCE.createDisplayName();
					cc.append(new SetCommand(domain, f, SuperModCorePackage.Literals.UUID_ELEMENT__UUID, EcoreUtil.generateUUID()));
					cc.append(new SetCommand(domain, dn, SuperModFeaturePackage.Literals.DISPLAY_NAME__DISPLAY_NAME, "Child Feature"));
					cc.append(new AddCommand(domain, f, SuperModFeaturePackage.Literals.FEATURE__NAMES, dn));			
					cc.append(new AddCommand(domain, fm, SuperModFeaturePackage.Literals.FEATURE_MODEL__FEATURES, f));
					cc.append(new SetCommand(domain, cr, SuperModFeaturePackage.Literals.CHILD_RELATIONSHIP__CHILD, f));
					cc.append(new AddCommand(domain, parent, SuperModFeaturePackage.Literals.FEATURE__CHILDREN, cr));
				}
				return cc;
			}
		}
		if (feature.equals(SuperModFeaturePackage.Literals.FEATURE__GROUPS)) {
			CompoundCommand cc = new CompoundCommand();
			for (Object o : collection) {
				FeatureGroup fg = (FeatureGroup) o;
				cc.append(new SetCommand(domain, fg, SuperModCorePackage.Literals.UUID_ELEMENT__UUID, EcoreUtil.generateUUID()));
				cc.append(new AddCommand(domain, parent, SuperModFeaturePackage.Literals.FEATURE__GROUPS, fg));
			}
			return cc;
		}
		if (feature.equals(SuperModFeaturePackage.Literals.FEATURE__OUTGOING_DEPENDENCIES)) {
			CompoundCommand cc = new CompoundCommand();
			for (Object o : collection) {
				FeatureDependency fd = (FeatureDependency) o;
				cc.append(new SetCommand(domain, fd, SuperModCorePackage.Literals.UUID_ELEMENT__UUID, EcoreUtil.generateUUID()));
				cc.append(new AddCommand(domain, parent, SuperModFeaturePackage.Literals.FEATURE__OUTGOING_DEPENDENCIES, fd));
			}
			return cc;		
		}
		if (feature.equals(SuperModFeaturePackage.Literals.FEATURE__NAMES)) {
			return super.createAddCommand(domain, owner, feature, collection, index);
		}
		return UnexecutableCommand.INSTANCE;
	}
	
	@Override
	protected Command createDragAndDropCommand(EditingDomain domain, Object owner, float location, int operations,
			int operation, Collection<?> collection) {
		Feature parent = (Feature) owner;
		CompoundCommand cc = new CompoundCommand();
		for (Object o : collection) {
			if (o instanceof Feature) {
				Feature child = (Feature) o;
				if (!child.getIncomingRoots().isEmpty() ||
						child.getAllChildFeatures().contains(parent)) {
					return UnexecutableCommand.INSTANCE;
				}
				for (GroupMembership gm : child.getGroupedBy()) {
					cc.append(new SetCommand(domain, gm, SuperModFeaturePackage.Literals.GROUP_MEMBERSHIP__GROUP, null));
					cc.append(new SetCommand(domain, gm, SuperModFeaturePackage.Literals.GROUP_MEMBERSHIP__GROUPED_FEATURE, null));
				}
				for (ChildRelationship oldParent : child.getParents()) {
					cc.append(new SetCommand(domain, oldParent, SuperModFeaturePackage.Literals.CHILD_RELATIONSHIP__PARENT, null));
					cc.append(new SetCommand(domain, oldParent, SuperModFeaturePackage.Literals.CHILD_RELATIONSHIP__CHILD, null));
				}
				ChildRelationship cr = SuperModFeatureFactory.eINSTANCE.createChildRelationship();
				cc.append(new SetCommand(domain, cr, SuperModFeaturePackage.Literals.CHILD_RELATIONSHIP__CHILD, child));
				cc.append(new AddCommand(domain, parent, SuperModFeaturePackage.Literals.FEATURE__CHILDREN, cr));
			}
		}
		if (cc.isEmpty()) {
			return UnexecutableCommand.INSTANCE;
		}
		return cc;
	}	
	
}
