/**
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package de.ubt.ai1.supermod.mm.collab.provider;


import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import de.ubt.ai1.supermod.mm.collab.PrivateRevision;
import de.ubt.ai1.supermod.mm.collab.PublicRevision;
import de.ubt.ai1.supermod.mm.collab.SuperModCollabPackage;
import de.ubt.ai1.supermod.mm.core.SuperModCoreFactory;

/**
 * This is the item provider adapter for a {@link de.ubt.ai1.supermod.mm.collab.PublicRevision} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PublicRevisionItemProvider extends RevisionItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PublicRevisionItemProvider(AdapterFactory adapterFactory) {
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

			addHeadPropertyDescriptor(object);
			addFinishedPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Head feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHeadPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PublicRevision_head_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PublicRevision_head_feature", "_UI_PublicRevision_type"),
				 SuperModCollabPackage.Literals.PUBLIC_REVISION__HEAD,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Finished feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFinishedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PublicRevision_finished_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PublicRevision_finished_feature", "_UI_PublicRevision_type"),
				 SuperModCollabPackage.Literals.PUBLIC_REVISION__FINISHED,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
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
			childrenFeatures.add(SuperModCollabPackage.Literals.PUBLIC_REVISION__PRIVATE_REVISIONS);
			childrenFeatures.add(SuperModCollabPackage.Literals.PUBLIC_REVISION__FINISHED_OPTION);
			childrenFeatures.add(SuperModCollabPackage.Literals.PUBLIC_REVISION__FINISHED_DEFAULT_BINDING);
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
	 * This returns PublicRevision.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/PublicRevision"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getText(Object object) {
		return super.getText(object);
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

		switch (notification.getFeatureID(PublicRevision.class)) {
			case SuperModCollabPackage.PUBLIC_REVISION__COMMITTER:
			case SuperModCollabPackage.PUBLIC_REVISION__LATEST_PRIVATE_REVISION_NUMBER:
			case SuperModCollabPackage.PUBLIC_REVISION__HEAD:
			case SuperModCollabPackage.PUBLIC_REVISION__FINISHED:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case SuperModCollabPackage.PUBLIC_REVISION__PRIVATE_REVISIONS:
			case SuperModCollabPackage.PUBLIC_REVISION__FINISHED_OPTION:
			case SuperModCollabPackage.PUBLIC_REVISION__FINISHED_DEFAULT_BINDING:
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
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(SuperModCollabPackage.Literals.PUBLIC_REVISION__FINISHED_OPTION,
				 SuperModCoreFactory.eINSTANCE.createOption()));

		newChildDescriptors.add
			(createChildParameter
				(SuperModCollabPackage.Literals.PUBLIC_REVISION__FINISHED_DEFAULT_BINDING,
				 SuperModCoreFactory.eINSTANCE.createDefaultBinding()));
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.emf.edit.provider.ItemProviderAdapter#getColumnText(java.lang.Object, int)
	 */
	@Override
	public String getColumnText(Object object, int columnIndex) {
		PublicRevision rev = (PublicRevision) object;
		switch (columnIndex) {
		case 0: return "" + rev.getDisplayRevisionNumber() +
				(rev.getRevisionDimension().getCurrentPublicRevision()
						== rev ? " (*)" : "");
		case 1: return rev.getDate() == null ? "" :
			new SimpleDateFormat().format(rev.getDate());
		case 2: return rev.getCommitter();
		case 3: return rev.getCommitMessage();
		default: return "";
		}
	}
	/* (non-Javadoc)
	 * @see org.eclipse.emf.edit.provider.ItemProviderAdapter#getChildren(java.lang.Object)
	 */
	@Override
	public Collection<?> getChildren(Object object) {
		PublicRevision pubRev = (PublicRevision) object;
		EList<PrivateRevision> privRevs = ECollections.newBasicEList(pubRev.getPrivateRevisions());
		ECollections.reverse(privRevs);
		return privRevs;
	}
	


}
