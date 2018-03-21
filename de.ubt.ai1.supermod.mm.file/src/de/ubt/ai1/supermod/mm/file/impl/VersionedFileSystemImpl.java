/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.mm.file.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import de.ubt.ai1.supermod.mm.core.ProductSpaceElement;
import de.ubt.ai1.supermod.mm.core.impl.ProductDimensionImpl;
import de.ubt.ai1.supermod.mm.file.SuperModFileFactory;
import de.ubt.ai1.supermod.mm.file.SuperModFilePackage;
import de.ubt.ai1.supermod.mm.file.VersionedFile;
import de.ubt.ai1.supermod.mm.file.VersionedFileSystem;
import de.ubt.ai1.supermod.mm.file.VersionedFolder;
import de.ubt.ai1.supermod.mm.file.VersionedResource;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Versioned File System</b></em>'.
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date 	2014-07-28
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai1.supermod.mm.file.impl.VersionedFileSystemImpl#getRoots <em>Roots</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.file.impl.VersionedFileSystemImpl#getAllResources <em>All Resources</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VersionedFileSystemImpl extends ProductDimensionImpl implements VersionedFileSystem {
	/**
	 * The cached value of the '{@link #getRoots() <em>Roots</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoots()
	 * @generated
	 * @ordered
	 */
	protected EList<VersionedResource> roots;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VersionedFileSystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SuperModFilePackage.Literals.VERSIONED_FILE_SYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VersionedResource> getRoots() {
		if (roots == null) {
			roots = new EObjectContainmentEList<VersionedResource>(VersionedResource.class, this, SuperModFilePackage.VERSIONED_FILE_SYSTEM__ROOTS);
		}
		return roots;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<VersionedResource> getAllResources() {
		EList<VersionedResource> allResources = ECollections.newBasicEList();
		for (VersionedResource root : getRoots()) {
			allResources.add(root);
			if (root instanceof VersionedFolder) {
				allResources.addAll(((VersionedFolder) root).getAllContents());
			}
		}
		return ECollections.unmodifiableEList(allResources);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public VersionedResource getResource(String path) {
		VersionedResource current = null;
		for (String segment : path.split("/")) {
			if (current == null) {
				for (VersionedResource root : getRoots()) {
					if (segment.equals(root.getName())) {
						current = root;
						break;
					}
				}
			}
			else {
				if (current instanceof VersionedFolder) {
					current = ((VersionedFolder) current).getContent(segment);
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
	public VersionedFile createFile(String path) {
		VersionedFolder current = null;
		String[] segments = path.split("/");
		for (int i = 0; i < segments.length - 1; i++) {
			if (i == 0) {
				for (VersionedResource root : getRoots()) {
					if (root instanceof VersionedFolder && segments[i].equals(root.getName())) {
						current = (VersionedFolder) root;
						break;
					}
				}
				if (current == null) {
					VersionedFolder newFolder = SuperModFileFactory.eINSTANCE.createVersionedFolder();
					newFolder.setName(segments[i]);
					getRoots().add(newFolder);
					current = newFolder;
				}
			}
			else if (current != null) {
				VersionedResource vr = current.getContent(segments[i]);
				if (vr instanceof VersionedFolder) {
					current = (VersionedFolder) vr;
				}
				else {
					VersionedFolder newFolder = SuperModFileFactory.eINSTANCE.createVersionedFolder();
					newFolder.setName(segments[i]);
					getRoots().add(newFolder);
					current = newFolder;
				}
			}
		}
		VersionedFile file = SuperModFileFactory.eINSTANCE.createVersionedFile();
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
	public VersionedFolder createFolder(String path) {
		VersionedFolder current = null;
		String[] segments = path.split("/");
		for (int i = 0; i < segments.length - 1; i++) {
			if (i == 0) {
				for (VersionedResource root : getRoots()) {
					if (root instanceof VersionedFolder && segments[i].equals(root.getName())) {
						current = (VersionedFolder) root;
						break;
					}
				}
				if (current == null) {
					VersionedFolder newFolder = SuperModFileFactory.eINSTANCE.createVersionedFolder();
					newFolder.setName(segments[i]);
					getRoots().add(newFolder);
					current = newFolder;
				}
			}
			else if (current != null) {
				VersionedResource vr = current.getContent(segments[i]);
				if (vr instanceof VersionedFolder) {
					current = (VersionedFolder) vr;
				}
				else {
					VersionedFolder newFolder = SuperModFileFactory.eINSTANCE.createVersionedFolder();
					newFolder.setName(segments[i]);
					getRoots().add(newFolder);
					current = newFolder;
				}
			}
		}
		VersionedFolder folder = SuperModFileFactory.eINSTANCE.createVersionedFolder();
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
			case SuperModFilePackage.VERSIONED_FILE_SYSTEM__ROOTS:
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
			case SuperModFilePackage.VERSIONED_FILE_SYSTEM__ROOTS:
				return getRoots();
			case SuperModFilePackage.VERSIONED_FILE_SYSTEM__ALL_RESOURCES:
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
			case SuperModFilePackage.VERSIONED_FILE_SYSTEM__ROOTS:
				getRoots().clear();
				getRoots().addAll((Collection<? extends VersionedResource>)newValue);
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
			case SuperModFilePackage.VERSIONED_FILE_SYSTEM__ROOTS:
				getRoots().clear();
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
			case SuperModFilePackage.VERSIONED_FILE_SYSTEM__ROOTS:
				return roots != null && !roots.isEmpty();
			case SuperModFilePackage.VERSIONED_FILE_SYSTEM__ALL_RESOURCES:
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
			case SuperModFilePackage.VERSIONED_FILE_SYSTEM___GET_RESOURCE__STRING:
				return getResource((String)arguments.get(0));
			case SuperModFilePackage.VERSIONED_FILE_SYSTEM___CREATE_FILE__STRING:
				return createFile((String)arguments.get(0));
			case SuperModFilePackage.VERSIONED_FILE_SYSTEM___CREATE_FOLDER__STRING:
				return createFolder((String)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	@Override
	public EList<ProductSpaceElement> getRootProductSpaceElements() {
		return ECollections.unmodifiableEList(getRoots());
	}


} //VersionedFileSystemImpl
