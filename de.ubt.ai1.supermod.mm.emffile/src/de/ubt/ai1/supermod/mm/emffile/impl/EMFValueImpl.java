/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.mm.emffile.impl;

import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import de.ubt.ai1.supermod.mm.core.ProductSpaceElement;
import de.ubt.ai1.supermod.mm.core.impl.ProductSpaceElementImpl;
import de.ubt.ai1.supermod.mm.emffile.EMFFeatureRef;
import de.ubt.ai1.supermod.mm.emffile.EMFValue;
import de.ubt.ai1.supermod.mm.emffile.SuperModEMFFilePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EMF Value</b></em>'.
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date 	2014-07-28
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class EMFValueImpl extends ProductSpaceElementImpl implements EMFValue {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EMFValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SuperModEMFFilePackage.Literals.EMF_VALUE;
	}
	
	@Override
	public ProductSpaceElement basicGetSuperProductSpaceElement() {
		return (EMFFeatureRef) eContainer();
	}
	
	@Override
	public EList<ProductSpaceElement> getSubProductSpaceElements() {
		return ECollections.emptyEList();
	}
	
	@Override
	public EList<ProductSpaceElement> getCrossReferencedProductSpaceElements() {
		return ECollections.emptyEList();
	}
	
	@Override
	public EList<ProductSpaceElement> getCrossReferencingProductSpaceElements() {
		if (eContainer() instanceof EMFFeatureRef &&
				((EMFFeatureRef) eContainer()).getValueOrdering() != null) {
			return ECollections.unmodifiableEList(
					((EMFFeatureRef) eContainer()).getValueOrdering()
						.getAllOccurrencesOf(this));
		}
		return ECollections.emptyEList();
	}

} //EMFValueImpl
