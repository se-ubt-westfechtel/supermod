/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.mm.file.client.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import de.ubt.ai1.supermod.mm.client.impl.SingleVersionProductDimensionDescriptorImpl;
import de.ubt.ai1.supermod.mm.file.client.SingleVersionFileDescriptor;
import de.ubt.ai1.supermod.mm.file.client.SingleVersionFileSystemDescriptor;
import de.ubt.ai1.supermod.mm.file.client.SingleVersionFolderDescriptor;
import de.ubt.ai1.supermod.mm.file.client.SingleVersionResourceDescriptor;
import de.ubt.ai1.supermod.mm.file.client.SuperModFileClientFactory;
import de.ubt.ai1.supermod.mm.file.client.SuperModFileClientPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Single Version File System Descriptor</b></em>'.
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date 	2014-07-28
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai1.supermod.mm.file.client.impl.SingleVersionFileSystemDescriptorImpl#getRoots <em>Roots</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.file.client.impl.SingleVersionFileSystemDescriptorImpl#getRootUri <em>Root Uri</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.file.client.impl.SingleVersionFileSystemDescriptorImpl#getAllResources <em>All Resources</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SingleVersionFileSystemDescriptorImpl extends SingleVersionProductDimensionDescriptorImpl implements SingleVersionFileSystemDescriptor {
	/**
	 * The cached value of the '{@link #getRoots() <em>Roots</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoots()
	 * @generated
	 * @ordered
	 */
	protected EList<SingleVersionResourceDescriptor> roots;

	/**
	 * The default value of the '{@link #getRootUri() <em>Root Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRootUri()
	 * @generated
	 * @ordered
	 */
	protected static final String ROOT_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRootUri() <em>Root Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRootUri()
	 * @generated
	 * @ordered
	 */
	protected String rootUri = ROOT_URI_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SingleVersionFileSystemDescriptorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SuperModFileClientPackage.Literals.SINGLE_VERSION_FILE_SYSTEM_DESCRIPTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SingleVersionResourceDescriptor> getRoots() {
		if (roots == null) {
			roots = new EObjectContainmentEList<SingleVersionResourceDescriptor>(SingleVersionResourceDescriptor.class, this, SuperModFileClientPackage.SINGLE_VERSION_FILE_SYSTEM_DESCRIPTOR__ROOTS);
		}
		return roots;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRootUri() {
		return rootUri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRootUri(String newRootUri) {
		String oldRootUri = rootUri;
		rootUri = newRootUri;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SuperModFileClientPackage.SINGLE_VERSION_FILE_SYSTEM_DESCRIPTOR__ROOT_URI, oldRootUri, rootUri));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<SingleVersionResourceDescriptor> getAllResources() {
		EList<SingleVersionResourceDescriptor> allResources = ECollections.newBasicEList();
		for (SingleVersionResourceDescriptor res : getRoots()) {
			allResources.add(res);
			if (res instanceof SingleVersionFolderDescriptor) {
				allResources.addAll(((SingleVersionFolderDescriptor) res).getAllContents());
			}
		}
		return ECollections.unmodifiableEList(allResources);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public SingleVersionResourceDescriptor getResource(String path) {
		SingleVersionResourceDescriptor current = null;
		for (String segment : path.split("/")) {
			if (current == null) {
				for (SingleVersionResourceDescriptor root : getRoots()) {
					if (segment.equals(root.getName())) {
						current = root;
						break;
					}
				}
			}
			else {
				if (current instanceof SingleVersionFolderDescriptor) {
					current = ((SingleVersionFolderDescriptor) current).getContent(segment);
				}
				else {
					current = null;
				}
			}
			if (current == null) break;
		}
		return current;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public SingleVersionFileDescriptor createFile(String path) {
		if (getResource(path) instanceof SingleVersionFileDescriptor) {
			return (SingleVersionFileDescriptor) getResource(path);
		}
		SingleVersionFolderDescriptor current = null;
		String[] segments = path.split("/");
		for (int i = 0; i < segments.length - 1; i++) {
			if (i == 0) {
				for (SingleVersionResourceDescriptor root : getRoots()) {
					if (root instanceof SingleVersionFolderDescriptor && segments[i].equals(root.getName())) {
						current = (SingleVersionFolderDescriptor) root;
						break;
					}
				}
				if (current == null) {
					SingleVersionFolderDescriptor newFolder = SuperModFileClientFactory.eINSTANCE.createSingleVersionFolderDescriptor();
					newFolder.setName(segments[i]);
					getRoots().add(newFolder);
					current = newFolder;
				}
			}
			else if (current != null) {
				SingleVersionResourceDescriptor vr = current.getContent(segments[i]);
				if (vr instanceof SingleVersionFolderDescriptor) {
					current = (SingleVersionFolderDescriptor) vr;
				}
				else {
					SingleVersionFolderDescriptor newFolder = SuperModFileClientFactory.eINSTANCE.createSingleVersionFolderDescriptor();
					newFolder.setName(segments[i]);
					current.getContents().add(newFolder);
					current = newFolder;
				}
			}
		}
		SingleVersionFileDescriptor file = SuperModFileClientFactory.eINSTANCE.createSingleVersionFileDescriptor();
		file.setName(segments[segments.length-1]);
		if (current != null) {
			current.getContents().add(file);
		}
		else {
			getRoots().add(file);
		}
		return file;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public SingleVersionFolderDescriptor createFolder(String path) {
		if (getResource(path) instanceof SingleVersionFolderDescriptor) {
			return (SingleVersionFolderDescriptor) getResource(path);
		}
		SingleVersionFolderDescriptor current = null;
		String[] segments = path.split("/");
		for (int i = 0; i < segments.length - 1; i++) {
			if (i == 0) {
				for (SingleVersionResourceDescriptor root : getRoots()) {
					if (root instanceof SingleVersionFolderDescriptor && segments[i].equals(root.getName())) {
						current = (SingleVersionFolderDescriptor) root;
						break;
					}
				}
				if (current == null) {
					SingleVersionFolderDescriptor newFolder = SuperModFileClientFactory.eINSTANCE.createSingleVersionFolderDescriptor();
					newFolder.setName(segments[i]);
					getRoots().add(newFolder);
					current = newFolder;
				}
			}
			else if (current != null) {
				SingleVersionResourceDescriptor vr = current.getContent(segments[i]);
				if (vr instanceof SingleVersionFolderDescriptor) {
					current = (SingleVersionFolderDescriptor) vr;
				}
				else {
					SingleVersionFolderDescriptor newFolder = SuperModFileClientFactory.eINSTANCE.createSingleVersionFolderDescriptor();
					newFolder.setName(segments[i]);
					current.getContents().add(newFolder);
					current = newFolder;
				}
			}
		}
		SingleVersionFolderDescriptor folder = SuperModFileClientFactory.eINSTANCE.createSingleVersionFolderDescriptor();
		folder.setName(segments[segments.length-1]);
		if (current != null) {
			current.getContents().add(folder);
		}
		else {
			getRoots().add(folder);
		}
		return folder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SuperModFileClientPackage.SINGLE_VERSION_FILE_SYSTEM_DESCRIPTOR__ROOTS:
				return ((InternalEList<?>)getRoots()).basicRemove(otherEnd, msgs);
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
			case SuperModFileClientPackage.SINGLE_VERSION_FILE_SYSTEM_DESCRIPTOR__ROOTS:
				return getRoots();
			case SuperModFileClientPackage.SINGLE_VERSION_FILE_SYSTEM_DESCRIPTOR__ROOT_URI:
				return getRootUri();
			case SuperModFileClientPackage.SINGLE_VERSION_FILE_SYSTEM_DESCRIPTOR__ALL_RESOURCES:
				return getAllResources();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SuperModFileClientPackage.SINGLE_VERSION_FILE_SYSTEM_DESCRIPTOR__ROOTS:
				getRoots().clear();
				getRoots().addAll((Collection<? extends SingleVersionResourceDescriptor>)newValue);
				return;
			case SuperModFileClientPackage.SINGLE_VERSION_FILE_SYSTEM_DESCRIPTOR__ROOT_URI:
				setRootUri((String)newValue);
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
			case SuperModFileClientPackage.SINGLE_VERSION_FILE_SYSTEM_DESCRIPTOR__ROOTS:
				getRoots().clear();
				return;
			case SuperModFileClientPackage.SINGLE_VERSION_FILE_SYSTEM_DESCRIPTOR__ROOT_URI:
				setRootUri(ROOT_URI_EDEFAULT);
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
			case SuperModFileClientPackage.SINGLE_VERSION_FILE_SYSTEM_DESCRIPTOR__ROOTS:
				return roots != null && !roots.isEmpty();
			case SuperModFileClientPackage.SINGLE_VERSION_FILE_SYSTEM_DESCRIPTOR__ROOT_URI:
				return ROOT_URI_EDEFAULT == null ? rootUri != null : !ROOT_URI_EDEFAULT.equals(rootUri);
			case SuperModFileClientPackage.SINGLE_VERSION_FILE_SYSTEM_DESCRIPTOR__ALL_RESOURCES:
				return !getAllResources().isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case SuperModFileClientPackage.SINGLE_VERSION_FILE_SYSTEM_DESCRIPTOR___GET_RESOURCE__STRING:
				return getResource((String)arguments.get(0));
			case SuperModFileClientPackage.SINGLE_VERSION_FILE_SYSTEM_DESCRIPTOR___CREATE_FILE__STRING:
				return createFile((String)arguments.get(0));
			case SuperModFileClientPackage.SINGLE_VERSION_FILE_SYSTEM_DESCRIPTOR___CREATE_FOLDER__STRING:
				return createFolder((String)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (rootUri: ");
		result.append(rootUri);
		result.append(')');
		return result.toString();
	}

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.mm.client.impl.SingleVersionProductDimensionDescriptorImpl#isModified()
	 */
	@Override
	public boolean isModified() {
		// optional operation is not implemented.
		return false;
	}

	/* (non-Javadoc)
	 * @see de.ubt.ai1.supermod.mm.client.impl.SingleVersionProductDimensionDescriptorImpl#setModified(boolean)
	 */
	@Override
	public void setModified(boolean modified) {
		// optional operation is not implemented.
	}

} //SingleVersionFileSystemDescriptorImpl
