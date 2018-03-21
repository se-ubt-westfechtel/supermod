/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.mm.core.impl;

import java.util.Map;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import de.ubt.ai1.supermod.mm.core.AndExpr;
import de.ubt.ai1.supermod.mm.core.BiconditionalExpr;
import de.ubt.ai1.supermod.mm.core.BigAndExpr;
import de.ubt.ai1.supermod.mm.core.BigExpr;
import de.ubt.ai1.supermod.mm.core.BigNandExpr;
import de.ubt.ai1.supermod.mm.core.BigOrExpr;
import de.ubt.ai1.supermod.mm.core.BigXorExpr;
import de.ubt.ai1.supermod.mm.core.BinaryExpr;
import de.ubt.ai1.supermod.mm.core.DefaultBinding;
import de.ubt.ai1.supermod.mm.core.Dimension;
import de.ubt.ai1.supermod.mm.core.Element;
import de.ubt.ai1.supermod.mm.core.HybridDimension;
import de.ubt.ai1.supermod.mm.core.HybridElement;
import de.ubt.ai1.supermod.mm.core.ImpliesExpr;
import de.ubt.ai1.supermod.mm.core.Invariant;
import de.ubt.ai1.supermod.mm.core.MergeExpr;
import de.ubt.ai1.supermod.mm.core.MinusExpr;
import de.ubt.ai1.supermod.mm.core.NandExpr;
import de.ubt.ai1.supermod.mm.core.NegExpr;
import de.ubt.ai1.supermod.mm.core.Option;
import de.ubt.ai1.supermod.mm.core.OptionBinding;
import de.ubt.ai1.supermod.mm.core.OptionExpr;
import de.ubt.ai1.supermod.mm.core.OptionRef;
import de.ubt.ai1.supermod.mm.core.OrExpr;
import de.ubt.ai1.supermod.mm.core.Preference;
import de.ubt.ai1.supermod.mm.core.ProductDimension;
import de.ubt.ai1.supermod.mm.core.ProductSpace;
import de.ubt.ai1.supermod.mm.core.ProductSpaceElement;
import de.ubt.ai1.supermod.mm.core.Repository;
import de.ubt.ai1.supermod.mm.core.RuleBaseElement;
import de.ubt.ai1.supermod.mm.core.SuperModCoreFactory;
import de.ubt.ai1.supermod.mm.core.SuperModCorePackage;
import de.ubt.ai1.supermod.mm.core.Tristate;
import de.ubt.ai1.supermod.mm.core.UUIDElement;
import de.ubt.ai1.supermod.mm.core.VersionDimension;
import de.ubt.ai1.supermod.mm.core.VersionSpace;
import de.ubt.ai1.supermod.mm.core.VersionSpaceElement;
import de.ubt.ai1.supermod.mm.core.Visibility;
import de.ubt.ai1.supermod.mm.core.VisibilityEvaluationCache;
import de.ubt.ai1.supermod.mm.core.VisibilityForest;
import de.ubt.ai1.supermod.mm.core.VisibilityRef;
import de.ubt.ai1.supermod.mm.core.XorExpr;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date 	2014-07-25
 * <!-- end-user-doc -->
 * @generated
 */
public class SuperModCorePackageImpl extends EPackageImpl implements SuperModCorePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass repositoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dimensionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass visibilityForestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass visibilityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productSpaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productDimensionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productSpaceElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uuidElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass versionSpaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass versionDimensionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hybridDimensionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hybridElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ruleBaseElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass invariantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass preferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass defaultBindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass optionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass optionBindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass optionToTristateMapEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass visibilityEvaluationCacheEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass optionExprToTristateMapEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass versionSpaceElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass optionExprEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass visibilityRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass optionRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass negExprEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binaryExprEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass andExprEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orExprEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xorExprEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass impliesExprEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass biconditionalExprEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nandExprEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass minusExprEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mergeExprEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bigExprEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bigAndExprEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bigOrExprEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bigXorExprEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bigNandExprEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tristateEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see de.ubt.ai1.supermod.mm.core.SuperModCorePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SuperModCorePackageImpl() {
		super(eNS_URI, SuperModCoreFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link SuperModCorePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SuperModCorePackage init() {
		if (isInited) return (SuperModCorePackage)EPackage.Registry.INSTANCE.getEPackage(SuperModCorePackage.eNS_URI);

		// Obtain or create and register package
		SuperModCorePackageImpl theSuperModCorePackage = (SuperModCorePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SuperModCorePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SuperModCorePackageImpl());

		isInited = true;

		// Create package meta-data objects
		theSuperModCorePackage.createPackageContents();

		// Initialize created meta-data
		theSuperModCorePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSuperModCorePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SuperModCorePackage.eNS_URI, theSuperModCorePackage);
		return theSuperModCorePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRepository() {
		return repositoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRepository_ProductSpace() {
		return (EReference)repositoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRepository_VersionSpace() {
		return (EReference)repositoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRepository_VisibilityForest() {
		return (EReference)repositoryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRepository_ModuleId() {
		return (EAttribute)repositoryEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDimension() {
		return dimensionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDimension_DimensionName() {
		return (EAttribute)dimensionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDimension_RootElements() {
		return (EReference)dimensionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDimension_AllElements() {
		return (EReference)dimensionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVisibilityForest() {
		return visibilityForestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVisibilityForest_Visibilities() {
		return (EReference)visibilityForestEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVisibilityForest_Repository() {
		return (EReference)visibilityForestEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVisibilityForest__Add__OptionExpr() {
		return visibilityForestEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVisibility() {
		return visibilityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVisibility_Expr() {
		return (EReference)visibilityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProductSpace() {
		return productSpaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProductSpace_Dimensions() {
		return (EReference)productSpaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProductSpace_Repository() {
		return (EReference)productSpaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProductDimension() {
		return productDimensionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProductDimension_RootProductSpaceElements() {
		return (EReference)productDimensionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProductDimension_AllProductSpaceElements() {
		return (EReference)productDimensionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProductDimension_ProductSpace() {
		return (EReference)productDimensionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProductSpaceElement() {
		return productSpaceElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProductSpaceElement_ProductDimension() {
		return (EReference)productSpaceElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProductSpaceElement_ProductSpace() {
		return (EReference)productSpaceElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProductSpaceElement_Visibility() {
		return (EReference)productSpaceElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProductSpaceElement_SuperProductSpaceElement() {
		return (EReference)productSpaceElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProductSpaceElement_SubProductSpaceElements() {
		return (EReference)productSpaceElementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProductSpaceElement_AllSuperProductSpaceElements() {
		return (EReference)productSpaceElementEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProductSpaceElement_AllSubProductSpaceElements() {
		return (EReference)productSpaceElementEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProductSpaceElement_CrossReferencedProductSpaceElements() {
		return (EReference)productSpaceElementEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProductSpaceElement_CrossReferencingProductSpaceElements() {
		return (EReference)productSpaceElementEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProductSpaceElement_HierarchicalVisibility() {
		return (EReference)productSpaceElementEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProductSpaceElement_SuperordinateVisibility() {
		return (EReference)productSpaceElementEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProductSpaceElement__IsVisible__OptionBinding_VisibilityEvaluationCache() {
		return productSpaceElementEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProductSpaceElement__IsVisibleHierarchically__OptionBinding_VisibilityEvaluationCache() {
		return productSpaceElementEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElement() {
		return elementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElement_SuperElement() {
		return (EReference)elementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElement_SubElements() {
		return (EReference)elementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElement_AllSuperElements() {
		return (EReference)elementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElement_AllSubElements() {
		return (EReference)elementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElement_CrossReferencedElements() {
		return (EReference)elementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElement_CrossReferencingElements() {
		return (EReference)elementEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElement_ProxyUUID() {
		return (EAttribute)elementEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElement_TransactionId() {
		return (EAttribute)elementEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getElement__IsProxy() {
		return elementEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUUIDElement() {
		return uuidElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUUIDElement_Uuid() {
		return (EAttribute)uuidElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVersionSpace() {
		return versionSpaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVersionSpace_Dimensions() {
		return (EReference)versionSpaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVersionSpace_AllOptions() {
		return (EReference)versionSpaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVersionSpace_AllInvariants() {
		return (EReference)versionSpaceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVersionSpace_AllPreferences() {
		return (EReference)versionSpaceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVersionSpace_AllDefaultBindings() {
		return (EReference)versionSpaceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVersionSpace_Repository() {
		return (EReference)versionSpaceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVersionSpace__Validate__OptionBinding() {
		return versionSpaceEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVersionSpace__IsComplete__OptionBinding() {
		return versionSpaceEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVersionSpace__IsSatisfiable__OptionBinding() {
		return versionSpaceEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVersionSpace__ApplyAllPreferences__OptionBinding() {
		return versionSpaceEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVersionSpace__ApplyAllDefaults__OptionBinding() {
		return versionSpaceEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVersionSpace__ApplyAllCompletions__OptionBinding() {
		return versionSpaceEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVersionSpace__GetOption__String() {
		return versionSpaceEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVersionDimension() {
		return versionDimensionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVersionDimension_Options() {
		return (EReference)versionDimensionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVersionDimension_Invariants() {
		return (EReference)versionDimensionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVersionDimension_Preferences() {
		return (EReference)versionDimensionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVersionDimension_DefaultBindings() {
		return (EReference)versionDimensionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVersionDimension_RootVersionSpaceElements() {
		return (EReference)versionDimensionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVersionDimension_AllVersionSpaceElements() {
		return (EReference)versionDimensionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVersionDimension_VersionSpace() {
		return (EReference)versionDimensionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVersionDimension__Validate__OptionBinding() {
		return versionDimensionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVersionDimension__IsComplete__OptionBinding() {
		return versionDimensionEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVersionDimension__IsSatisfiable__OptionBinding() {
		return versionDimensionEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVersionDimension__ApplyPreferences__OptionBinding() {
		return versionDimensionEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVersionDimension__ApplyDefaults__OptionBinding() {
		return versionDimensionEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVersionDimension__ApplyCompletions__OptionBinding() {
		return versionDimensionEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVersionDimension__GetOption__String() {
		return versionDimensionEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHybridDimension() {
		return hybridDimensionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHybridDimension_RootHybridElements() {
		return (EReference)hybridDimensionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHybridDimension_AllHybridElements() {
		return (EReference)hybridDimensionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHybridElement() {
		return hybridElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHybridElement_SuperHybridElement() {
		return (EReference)hybridElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHybridElement_SubHybridElements() {
		return (EReference)hybridElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHybridElement_AllSuperHybridElements() {
		return (EReference)hybridElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHybridElement_AllSubHybridElements() {
		return (EReference)hybridElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHybridElement_CrossReferencedHybridElements() {
		return (EReference)hybridElementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHybridElement_CrossReferencingHybridElements() {
		return (EReference)hybridElementEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRuleBaseElement() {
		return ruleBaseElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRuleBaseElement_Name() {
		return (EAttribute)ruleBaseElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRuleBaseElement_Dimension() {
		return (EReference)ruleBaseElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRuleBaseElement_HighLevelConcept() {
		return (EReference)ruleBaseElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInvariant() {
		return invariantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInvariant_OptionExpr() {
		return (EReference)invariantEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPreference() {
		return preferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPreference_Option() {
		return (EReference)preferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPreference_OptionExpr() {
		return (EReference)preferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPreference__ToImplicationInvariant() {
		return preferenceEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDefaultBinding() {
		return defaultBindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDefaultBinding_Option() {
		return (EReference)defaultBindingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDefaultBinding_State() {
		return (EAttribute)defaultBindingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOption() {
		return optionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOptionBinding() {
		return optionBindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOptionBinding_BoundOptions() {
		return (EReference)optionBindingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOptionBinding_NumberOfBindings() {
		return (EAttribute)optionBindingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOptionBinding__GetState__Option() {
		return optionBindingEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOptionBinding__Implies__OptionBinding() {
		return optionBindingEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOptionBinding__ToVisibility() {
		return optionBindingEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOptionBinding__Bind__Option_Tristate() {
		return optionBindingEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOptionBinding__Combine__OptionBinding() {
		return optionBindingEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOptionBinding__Clear() {
		return optionBindingEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOptionToTristateMapEntry() {
		return optionToTristateMapEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOptionToTristateMapEntry_Key() {
		return (EReference)optionToTristateMapEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOptionToTristateMapEntry_Value() {
		return (EAttribute)optionToTristateMapEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVisibilityEvaluationCache() {
		return visibilityEvaluationCacheEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVisibilityEvaluationCache_Entries() {
		return (EReference)visibilityEvaluationCacheEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVisibilityEvaluationCache__Invalidate() {
		return visibilityEvaluationCacheEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVisibilityEvaluationCache__Save__OptionExpr_Tristate() {
		return visibilityEvaluationCacheEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVisibilityEvaluationCache__Get__OptionExpr() {
		return visibilityEvaluationCacheEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOptionExprToTristateMapEntry() {
		return optionExprToTristateMapEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOptionExprToTristateMapEntry_Key() {
		return (EReference)optionExprToTristateMapEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOptionExprToTristateMapEntry_Value() {
		return (EAttribute)optionExprToTristateMapEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVersionSpaceElement() {
		return versionSpaceElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVersionSpaceElement_VersionDimension() {
		return (EReference)versionSpaceElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVersionSpaceElement_VersionSpace() {
		return (EReference)versionSpaceElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVersionSpaceElement_SuperVersionSpaceElement() {
		return (EReference)versionSpaceElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVersionSpaceElement_SubVersionSpaceElements() {
		return (EReference)versionSpaceElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVersionSpaceElement_AllSuperVersionSpaceElements() {
		return (EReference)versionSpaceElementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVersionSpaceElement_AllSubVersionSpaceElements() {
		return (EReference)versionSpaceElementEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVersionSpaceElement_CrossReferencedVersionSpaceElements() {
		return (EReference)versionSpaceElementEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVersionSpaceElement_CrossReferencingVersionSpaceElements() {
		return (EReference)versionSpaceElementEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVersionSpaceElement_LowLevelConcepts() {
		return (EReference)versionSpaceElementEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOptionExpr() {
		return optionExprEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOptionExpr_ReferencedOptions() {
		return (EReference)optionExprEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOptionExpr_ReferencedDimensions() {
		return (EReference)optionExprEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOptionExpr__Apply__OptionBinding_VisibilityEvaluationCache() {
		return optionExprEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOptionExpr__Apply__OptionBinding() {
		return optionExprEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOptionExpr__Not() {
		return optionExprEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOptionExpr__And__OptionExpr() {
		return optionExprEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOptionExpr__Or__OptionExpr() {
		return optionExprEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOptionExpr__Xor__OptionExpr() {
		return optionExprEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOptionExpr__Implies__OptionExpr() {
		return optionExprEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOptionExpr__Iff__OptionExpr() {
		return optionExprEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOptionExpr__Nand__OptionExpr() {
		return optionExprEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOptionExpr__Minus__OptionExpr() {
		return optionExprEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOptionExpr__Extract() {
		return optionExprEClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVisibilityRef() {
		return visibilityRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVisibilityRef_Visibility() {
		return (EReference)visibilityRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOptionRef() {
		return optionRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOptionRef_Option() {
		return (EReference)optionRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNegExpr() {
		return negExprEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNegExpr_Neg() {
		return (EReference)negExprEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBinaryExpr() {
		return binaryExprEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinaryExpr_Left() {
		return (EReference)binaryExprEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinaryExpr_Right() {
		return (EReference)binaryExprEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAndExpr() {
		return andExprEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrExpr() {
		return orExprEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXorExpr() {
		return xorExprEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImpliesExpr() {
		return impliesExprEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBiconditionalExpr() {
		return biconditionalExprEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNandExpr() {
		return nandExprEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMinusExpr() {
		return minusExprEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMergeExpr() {
		return mergeExprEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMergeExpr_BaseExpr() {
		return (EReference)mergeExprEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBigExpr() {
		return bigExprEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBigExpr_Children() {
		return (EReference)bigExprEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBigAndExpr() {
		return bigAndExprEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBigOrExpr() {
		return bigOrExprEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBigXorExpr() {
		return bigXorExprEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBigNandExpr() {
		return bigNandExprEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTristate() {
		return tristateEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SuperModCoreFactory getSuperModCoreFactory() {
		return (SuperModCoreFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		repositoryEClass = createEClass(REPOSITORY);
		createEReference(repositoryEClass, REPOSITORY__PRODUCT_SPACE);
		createEReference(repositoryEClass, REPOSITORY__VERSION_SPACE);
		createEReference(repositoryEClass, REPOSITORY__VISIBILITY_FOREST);
		createEAttribute(repositoryEClass, REPOSITORY__MODULE_ID);

		dimensionEClass = createEClass(DIMENSION);
		createEAttribute(dimensionEClass, DIMENSION__DIMENSION_NAME);
		createEReference(dimensionEClass, DIMENSION__ROOT_ELEMENTS);
		createEReference(dimensionEClass, DIMENSION__ALL_ELEMENTS);

		elementEClass = createEClass(ELEMENT);
		createEReference(elementEClass, ELEMENT__SUPER_ELEMENT);
		createEReference(elementEClass, ELEMENT__SUB_ELEMENTS);
		createEReference(elementEClass, ELEMENT__ALL_SUPER_ELEMENTS);
		createEReference(elementEClass, ELEMENT__ALL_SUB_ELEMENTS);
		createEReference(elementEClass, ELEMENT__CROSS_REFERENCED_ELEMENTS);
		createEReference(elementEClass, ELEMENT__CROSS_REFERENCING_ELEMENTS);
		createEAttribute(elementEClass, ELEMENT__PROXY_UUID);
		createEAttribute(elementEClass, ELEMENT__TRANSACTION_ID);
		createEOperation(elementEClass, ELEMENT___IS_PROXY);

		uuidElementEClass = createEClass(UUID_ELEMENT);
		createEAttribute(uuidElementEClass, UUID_ELEMENT__UUID);

		productSpaceEClass = createEClass(PRODUCT_SPACE);
		createEReference(productSpaceEClass, PRODUCT_SPACE__DIMENSIONS);
		createEReference(productSpaceEClass, PRODUCT_SPACE__REPOSITORY);

		productDimensionEClass = createEClass(PRODUCT_DIMENSION);
		createEReference(productDimensionEClass, PRODUCT_DIMENSION__ROOT_PRODUCT_SPACE_ELEMENTS);
		createEReference(productDimensionEClass, PRODUCT_DIMENSION__ALL_PRODUCT_SPACE_ELEMENTS);
		createEReference(productDimensionEClass, PRODUCT_DIMENSION__PRODUCT_SPACE);

		productSpaceElementEClass = createEClass(PRODUCT_SPACE_ELEMENT);
		createEReference(productSpaceElementEClass, PRODUCT_SPACE_ELEMENT__PRODUCT_DIMENSION);
		createEReference(productSpaceElementEClass, PRODUCT_SPACE_ELEMENT__PRODUCT_SPACE);
		createEReference(productSpaceElementEClass, PRODUCT_SPACE_ELEMENT__VISIBILITY);
		createEReference(productSpaceElementEClass, PRODUCT_SPACE_ELEMENT__SUPER_PRODUCT_SPACE_ELEMENT);
		createEReference(productSpaceElementEClass, PRODUCT_SPACE_ELEMENT__SUB_PRODUCT_SPACE_ELEMENTS);
		createEReference(productSpaceElementEClass, PRODUCT_SPACE_ELEMENT__ALL_SUPER_PRODUCT_SPACE_ELEMENTS);
		createEReference(productSpaceElementEClass, PRODUCT_SPACE_ELEMENT__ALL_SUB_PRODUCT_SPACE_ELEMENTS);
		createEReference(productSpaceElementEClass, PRODUCT_SPACE_ELEMENT__CROSS_REFERENCED_PRODUCT_SPACE_ELEMENTS);
		createEReference(productSpaceElementEClass, PRODUCT_SPACE_ELEMENT__CROSS_REFERENCING_PRODUCT_SPACE_ELEMENTS);
		createEReference(productSpaceElementEClass, PRODUCT_SPACE_ELEMENT__HIERARCHICAL_VISIBILITY);
		createEReference(productSpaceElementEClass, PRODUCT_SPACE_ELEMENT__SUPERORDINATE_VISIBILITY);
		createEOperation(productSpaceElementEClass, PRODUCT_SPACE_ELEMENT___IS_VISIBLE__OPTIONBINDING_VISIBILITYEVALUATIONCACHE);
		createEOperation(productSpaceElementEClass, PRODUCT_SPACE_ELEMENT___IS_VISIBLE_HIERARCHICALLY__OPTIONBINDING_VISIBILITYEVALUATIONCACHE);

		versionSpaceEClass = createEClass(VERSION_SPACE);
		createEReference(versionSpaceEClass, VERSION_SPACE__DIMENSIONS);
		createEReference(versionSpaceEClass, VERSION_SPACE__ALL_OPTIONS);
		createEReference(versionSpaceEClass, VERSION_SPACE__ALL_INVARIANTS);
		createEReference(versionSpaceEClass, VERSION_SPACE__ALL_PREFERENCES);
		createEReference(versionSpaceEClass, VERSION_SPACE__ALL_DEFAULT_BINDINGS);
		createEReference(versionSpaceEClass, VERSION_SPACE__REPOSITORY);
		createEOperation(versionSpaceEClass, VERSION_SPACE___VALIDATE__OPTIONBINDING);
		createEOperation(versionSpaceEClass, VERSION_SPACE___IS_COMPLETE__OPTIONBINDING);
		createEOperation(versionSpaceEClass, VERSION_SPACE___IS_SATISFIABLE__OPTIONBINDING);
		createEOperation(versionSpaceEClass, VERSION_SPACE___APPLY_ALL_PREFERENCES__OPTIONBINDING);
		createEOperation(versionSpaceEClass, VERSION_SPACE___APPLY_ALL_DEFAULTS__OPTIONBINDING);
		createEOperation(versionSpaceEClass, VERSION_SPACE___APPLY_ALL_COMPLETIONS__OPTIONBINDING);
		createEOperation(versionSpaceEClass, VERSION_SPACE___GET_OPTION__STRING);

		versionDimensionEClass = createEClass(VERSION_DIMENSION);
		createEReference(versionDimensionEClass, VERSION_DIMENSION__OPTIONS);
		createEReference(versionDimensionEClass, VERSION_DIMENSION__INVARIANTS);
		createEReference(versionDimensionEClass, VERSION_DIMENSION__PREFERENCES);
		createEReference(versionDimensionEClass, VERSION_DIMENSION__DEFAULT_BINDINGS);
		createEReference(versionDimensionEClass, VERSION_DIMENSION__ROOT_VERSION_SPACE_ELEMENTS);
		createEReference(versionDimensionEClass, VERSION_DIMENSION__ALL_VERSION_SPACE_ELEMENTS);
		createEReference(versionDimensionEClass, VERSION_DIMENSION__VERSION_SPACE);
		createEOperation(versionDimensionEClass, VERSION_DIMENSION___VALIDATE__OPTIONBINDING);
		createEOperation(versionDimensionEClass, VERSION_DIMENSION___IS_COMPLETE__OPTIONBINDING);
		createEOperation(versionDimensionEClass, VERSION_DIMENSION___IS_SATISFIABLE__OPTIONBINDING);
		createEOperation(versionDimensionEClass, VERSION_DIMENSION___APPLY_PREFERENCES__OPTIONBINDING);
		createEOperation(versionDimensionEClass, VERSION_DIMENSION___APPLY_DEFAULTS__OPTIONBINDING);
		createEOperation(versionDimensionEClass, VERSION_DIMENSION___APPLY_COMPLETIONS__OPTIONBINDING);
		createEOperation(versionDimensionEClass, VERSION_DIMENSION___GET_OPTION__STRING);

		versionSpaceElementEClass = createEClass(VERSION_SPACE_ELEMENT);
		createEReference(versionSpaceElementEClass, VERSION_SPACE_ELEMENT__VERSION_DIMENSION);
		createEReference(versionSpaceElementEClass, VERSION_SPACE_ELEMENT__VERSION_SPACE);
		createEReference(versionSpaceElementEClass, VERSION_SPACE_ELEMENT__SUPER_VERSION_SPACE_ELEMENT);
		createEReference(versionSpaceElementEClass, VERSION_SPACE_ELEMENT__SUB_VERSION_SPACE_ELEMENTS);
		createEReference(versionSpaceElementEClass, VERSION_SPACE_ELEMENT__ALL_SUPER_VERSION_SPACE_ELEMENTS);
		createEReference(versionSpaceElementEClass, VERSION_SPACE_ELEMENT__ALL_SUB_VERSION_SPACE_ELEMENTS);
		createEReference(versionSpaceElementEClass, VERSION_SPACE_ELEMENT__CROSS_REFERENCED_VERSION_SPACE_ELEMENTS);
		createEReference(versionSpaceElementEClass, VERSION_SPACE_ELEMENT__CROSS_REFERENCING_VERSION_SPACE_ELEMENTS);
		createEReference(versionSpaceElementEClass, VERSION_SPACE_ELEMENT__LOW_LEVEL_CONCEPTS);

		ruleBaseElementEClass = createEClass(RULE_BASE_ELEMENT);
		createEAttribute(ruleBaseElementEClass, RULE_BASE_ELEMENT__NAME);
		createEReference(ruleBaseElementEClass, RULE_BASE_ELEMENT__DIMENSION);
		createEReference(ruleBaseElementEClass, RULE_BASE_ELEMENT__HIGH_LEVEL_CONCEPT);

		invariantEClass = createEClass(INVARIANT);
		createEReference(invariantEClass, INVARIANT__OPTION_EXPR);

		preferenceEClass = createEClass(PREFERENCE);
		createEReference(preferenceEClass, PREFERENCE__OPTION);
		createEReference(preferenceEClass, PREFERENCE__OPTION_EXPR);
		createEOperation(preferenceEClass, PREFERENCE___TO_IMPLICATION_INVARIANT);

		defaultBindingEClass = createEClass(DEFAULT_BINDING);
		createEReference(defaultBindingEClass, DEFAULT_BINDING__OPTION);
		createEAttribute(defaultBindingEClass, DEFAULT_BINDING__STATE);

		optionEClass = createEClass(OPTION);

		optionBindingEClass = createEClass(OPTION_BINDING);
		createEReference(optionBindingEClass, OPTION_BINDING__BOUND_OPTIONS);
		createEAttribute(optionBindingEClass, OPTION_BINDING__NUMBER_OF_BINDINGS);
		createEOperation(optionBindingEClass, OPTION_BINDING___GET_STATE__OPTION);
		createEOperation(optionBindingEClass, OPTION_BINDING___IMPLIES__OPTIONBINDING);
		createEOperation(optionBindingEClass, OPTION_BINDING___TO_VISIBILITY);
		createEOperation(optionBindingEClass, OPTION_BINDING___BIND__OPTION_TRISTATE);
		createEOperation(optionBindingEClass, OPTION_BINDING___COMBINE__OPTIONBINDING);
		createEOperation(optionBindingEClass, OPTION_BINDING___CLEAR);

		optionToTristateMapEntryEClass = createEClass(OPTION_TO_TRISTATE_MAP_ENTRY);
		createEReference(optionToTristateMapEntryEClass, OPTION_TO_TRISTATE_MAP_ENTRY__KEY);
		createEAttribute(optionToTristateMapEntryEClass, OPTION_TO_TRISTATE_MAP_ENTRY__VALUE);

		visibilityEvaluationCacheEClass = createEClass(VISIBILITY_EVALUATION_CACHE);
		createEReference(visibilityEvaluationCacheEClass, VISIBILITY_EVALUATION_CACHE__ENTRIES);
		createEOperation(visibilityEvaluationCacheEClass, VISIBILITY_EVALUATION_CACHE___INVALIDATE);
		createEOperation(visibilityEvaluationCacheEClass, VISIBILITY_EVALUATION_CACHE___SAVE__OPTIONEXPR_TRISTATE);
		createEOperation(visibilityEvaluationCacheEClass, VISIBILITY_EVALUATION_CACHE___GET__OPTIONEXPR);

		optionExprToTristateMapEntryEClass = createEClass(OPTION_EXPR_TO_TRISTATE_MAP_ENTRY);
		createEReference(optionExprToTristateMapEntryEClass, OPTION_EXPR_TO_TRISTATE_MAP_ENTRY__KEY);
		createEAttribute(optionExprToTristateMapEntryEClass, OPTION_EXPR_TO_TRISTATE_MAP_ENTRY__VALUE);

		hybridDimensionEClass = createEClass(HYBRID_DIMENSION);
		createEReference(hybridDimensionEClass, HYBRID_DIMENSION__ROOT_HYBRID_ELEMENTS);
		createEReference(hybridDimensionEClass, HYBRID_DIMENSION__ALL_HYBRID_ELEMENTS);

		hybridElementEClass = createEClass(HYBRID_ELEMENT);
		createEReference(hybridElementEClass, HYBRID_ELEMENT__SUPER_HYBRID_ELEMENT);
		createEReference(hybridElementEClass, HYBRID_ELEMENT__SUB_HYBRID_ELEMENTS);
		createEReference(hybridElementEClass, HYBRID_ELEMENT__ALL_SUPER_HYBRID_ELEMENTS);
		createEReference(hybridElementEClass, HYBRID_ELEMENT__ALL_SUB_HYBRID_ELEMENTS);
		createEReference(hybridElementEClass, HYBRID_ELEMENT__CROSS_REFERENCED_HYBRID_ELEMENTS);
		createEReference(hybridElementEClass, HYBRID_ELEMENT__CROSS_REFERENCING_HYBRID_ELEMENTS);

		visibilityForestEClass = createEClass(VISIBILITY_FOREST);
		createEReference(visibilityForestEClass, VISIBILITY_FOREST__VISIBILITIES);
		createEReference(visibilityForestEClass, VISIBILITY_FOREST__REPOSITORY);
		createEOperation(visibilityForestEClass, VISIBILITY_FOREST___ADD__OPTIONEXPR);

		visibilityEClass = createEClass(VISIBILITY);
		createEReference(visibilityEClass, VISIBILITY__EXPR);

		optionExprEClass = createEClass(OPTION_EXPR);
		createEReference(optionExprEClass, OPTION_EXPR__REFERENCED_OPTIONS);
		createEReference(optionExprEClass, OPTION_EXPR__REFERENCED_DIMENSIONS);
		createEOperation(optionExprEClass, OPTION_EXPR___APPLY__OPTIONBINDING_VISIBILITYEVALUATIONCACHE);
		createEOperation(optionExprEClass, OPTION_EXPR___APPLY__OPTIONBINDING);
		createEOperation(optionExprEClass, OPTION_EXPR___NOT);
		createEOperation(optionExprEClass, OPTION_EXPR___AND__OPTIONEXPR);
		createEOperation(optionExprEClass, OPTION_EXPR___OR__OPTIONEXPR);
		createEOperation(optionExprEClass, OPTION_EXPR___XOR__OPTIONEXPR);
		createEOperation(optionExprEClass, OPTION_EXPR___IMPLIES__OPTIONEXPR);
		createEOperation(optionExprEClass, OPTION_EXPR___IFF__OPTIONEXPR);
		createEOperation(optionExprEClass, OPTION_EXPR___NAND__OPTIONEXPR);
		createEOperation(optionExprEClass, OPTION_EXPR___MINUS__OPTIONEXPR);
		createEOperation(optionExprEClass, OPTION_EXPR___EXTRACT);

		visibilityRefEClass = createEClass(VISIBILITY_REF);
		createEReference(visibilityRefEClass, VISIBILITY_REF__VISIBILITY);

		optionRefEClass = createEClass(OPTION_REF);
		createEReference(optionRefEClass, OPTION_REF__OPTION);

		negExprEClass = createEClass(NEG_EXPR);
		createEReference(negExprEClass, NEG_EXPR__NEG);

		binaryExprEClass = createEClass(BINARY_EXPR);
		createEReference(binaryExprEClass, BINARY_EXPR__LEFT);
		createEReference(binaryExprEClass, BINARY_EXPR__RIGHT);

		andExprEClass = createEClass(AND_EXPR);

		orExprEClass = createEClass(OR_EXPR);

		xorExprEClass = createEClass(XOR_EXPR);

		impliesExprEClass = createEClass(IMPLIES_EXPR);

		biconditionalExprEClass = createEClass(BICONDITIONAL_EXPR);

		nandExprEClass = createEClass(NAND_EXPR);

		minusExprEClass = createEClass(MINUS_EXPR);

		mergeExprEClass = createEClass(MERGE_EXPR);
		createEReference(mergeExprEClass, MERGE_EXPR__BASE_EXPR);

		bigExprEClass = createEClass(BIG_EXPR);
		createEReference(bigExprEClass, BIG_EXPR__CHILDREN);

		bigAndExprEClass = createEClass(BIG_AND_EXPR);

		bigOrExprEClass = createEClass(BIG_OR_EXPR);

		bigXorExprEClass = createEClass(BIG_XOR_EXPR);

		bigNandExprEClass = createEClass(BIG_NAND_EXPR);

		// Create enums
		tristateEEnum = createEEnum(TRISTATE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		uuidElementEClass.getESuperTypes().add(this.getElement());
		productDimensionEClass.getESuperTypes().add(this.getDimension());
		productSpaceElementEClass.getESuperTypes().add(this.getElement());
		versionDimensionEClass.getESuperTypes().add(this.getDimension());
		versionSpaceElementEClass.getESuperTypes().add(this.getElement());
		invariantEClass.getESuperTypes().add(this.getRuleBaseElement());
		preferenceEClass.getESuperTypes().add(this.getRuleBaseElement());
		defaultBindingEClass.getESuperTypes().add(this.getRuleBaseElement());
		optionEClass.getESuperTypes().add(this.getRuleBaseElement());
		hybridDimensionEClass.getESuperTypes().add(this.getVersionDimension());
		hybridDimensionEClass.getESuperTypes().add(this.getProductDimension());
		hybridElementEClass.getESuperTypes().add(this.getProductSpaceElement());
		hybridElementEClass.getESuperTypes().add(this.getVersionSpaceElement());
		visibilityForestEClass.getESuperTypes().add(this.getDimension());
		visibilityEClass.getESuperTypes().add(this.getUUIDElement());
		visibilityRefEClass.getESuperTypes().add(this.getOptionExpr());
		optionRefEClass.getESuperTypes().add(this.getOptionExpr());
		negExprEClass.getESuperTypes().add(this.getOptionExpr());
		binaryExprEClass.getESuperTypes().add(this.getOptionExpr());
		andExprEClass.getESuperTypes().add(this.getBinaryExpr());
		orExprEClass.getESuperTypes().add(this.getBinaryExpr());
		xorExprEClass.getESuperTypes().add(this.getBinaryExpr());
		impliesExprEClass.getESuperTypes().add(this.getBinaryExpr());
		biconditionalExprEClass.getESuperTypes().add(this.getBinaryExpr());
		nandExprEClass.getESuperTypes().add(this.getBinaryExpr());
		minusExprEClass.getESuperTypes().add(this.getBinaryExpr());
		mergeExprEClass.getESuperTypes().add(this.getBinaryExpr());
		bigExprEClass.getESuperTypes().add(this.getOptionExpr());
		bigAndExprEClass.getESuperTypes().add(this.getBigExpr());
		bigOrExprEClass.getESuperTypes().add(this.getBigExpr());
		bigXorExprEClass.getESuperTypes().add(this.getBigExpr());
		bigNandExprEClass.getESuperTypes().add(this.getBigExpr());

		// Initialize classes, features, and operations; add parameters
		initEClass(repositoryEClass, Repository.class, "Repository", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRepository_ProductSpace(), this.getProductSpace(), this.getProductSpace_Repository(), "productSpace", null, 0, 1, Repository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRepository_VersionSpace(), this.getVersionSpace(), this.getVersionSpace_Repository(), "versionSpace", null, 0, 1, Repository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRepository_VisibilityForest(), this.getVisibilityForest(), this.getVisibilityForest_Repository(), "visibilityForest", null, 0, 1, Repository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRepository_ModuleId(), ecorePackage.getEString(), "moduleId", null, 0, 1, Repository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dimensionEClass, Dimension.class, "Dimension", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDimension_DimensionName(), ecorePackage.getEString(), "dimensionName", null, 0, 1, Dimension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDimension_RootElements(), this.getElement(), null, "rootElements", null, 0, -1, Dimension.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDimension_AllElements(), this.getElement(), null, "allElements", null, 0, -1, Dimension.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(elementEClass, Element.class, "Element", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getElement_SuperElement(), this.getElement(), this.getElement_SubElements(), "superElement", null, 0, 1, Element.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getElement_SubElements(), this.getElement(), this.getElement_SuperElement(), "subElements", null, 0, -1, Element.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getElement_AllSuperElements(), this.getElement(), this.getElement_AllSubElements(), "allSuperElements", null, 0, -1, Element.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getElement_AllSubElements(), this.getElement(), this.getElement_AllSuperElements(), "allSubElements", null, 0, -1, Element.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getElement_CrossReferencedElements(), this.getElement(), this.getElement_CrossReferencingElements(), "crossReferencedElements", null, 0, -1, Element.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getElement_CrossReferencingElements(), this.getElement(), this.getElement_CrossReferencedElements(), "crossReferencingElements", null, 0, -1, Element.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getElement_ProxyUUID(), ecorePackage.getEString(), "proxyUUID", null, 0, 1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElement_TransactionId(), ecorePackage.getEInt(), "transactionId", null, 0, 1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getElement__IsProxy(), ecorePackage.getEBoolean(), "isProxy", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(uuidElementEClass, UUIDElement.class, "UUIDElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUUIDElement_Uuid(), ecorePackage.getEString(), "uuid", null, 0, 1, UUIDElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(productSpaceEClass, ProductSpace.class, "ProductSpace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProductSpace_Dimensions(), this.getProductDimension(), this.getProductDimension_ProductSpace(), "dimensions", null, 0, -1, ProductSpace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProductSpace_Repository(), this.getRepository(), this.getRepository_ProductSpace(), "repository", null, 0, 1, ProductSpace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(productDimensionEClass, ProductDimension.class, "ProductDimension", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProductDimension_RootProductSpaceElements(), this.getProductSpaceElement(), null, "rootProductSpaceElements", null, 0, -1, ProductDimension.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getProductDimension_AllProductSpaceElements(), this.getProductSpaceElement(), this.getProductSpaceElement_ProductDimension(), "allProductSpaceElements", null, 0, -1, ProductDimension.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getProductDimension_ProductSpace(), this.getProductSpace(), this.getProductSpace_Dimensions(), "productSpace", null, 0, 1, ProductDimension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(productSpaceElementEClass, ProductSpaceElement.class, "ProductSpaceElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProductSpaceElement_ProductDimension(), this.getProductDimension(), this.getProductDimension_AllProductSpaceElements(), "productDimension", null, 0, 1, ProductSpaceElement.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getProductSpaceElement_ProductSpace(), this.getProductSpace(), null, "productSpace", null, 0, 1, ProductSpaceElement.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getProductSpaceElement_Visibility(), this.getOptionExpr(), null, "visibility", null, 0, 1, ProductSpaceElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProductSpaceElement_SuperProductSpaceElement(), this.getProductSpaceElement(), this.getProductSpaceElement_SubProductSpaceElements(), "superProductSpaceElement", null, 0, 1, ProductSpaceElement.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getProductSpaceElement_SubProductSpaceElements(), this.getProductSpaceElement(), this.getProductSpaceElement_SuperProductSpaceElement(), "subProductSpaceElements", null, 0, -1, ProductSpaceElement.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getProductSpaceElement_AllSuperProductSpaceElements(), this.getProductSpaceElement(), this.getProductSpaceElement_AllSubProductSpaceElements(), "allSuperProductSpaceElements", null, 0, -1, ProductSpaceElement.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getProductSpaceElement_AllSubProductSpaceElements(), this.getProductSpaceElement(), this.getProductSpaceElement_AllSuperProductSpaceElements(), "allSubProductSpaceElements", null, 0, -1, ProductSpaceElement.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getProductSpaceElement_CrossReferencedProductSpaceElements(), this.getProductSpaceElement(), this.getProductSpaceElement_CrossReferencingProductSpaceElements(), "crossReferencedProductSpaceElements", null, 0, -1, ProductSpaceElement.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getProductSpaceElement_CrossReferencingProductSpaceElements(), this.getProductSpaceElement(), this.getProductSpaceElement_CrossReferencedProductSpaceElements(), "crossReferencingProductSpaceElements", null, 0, -1, ProductSpaceElement.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getProductSpaceElement_HierarchicalVisibility(), this.getOptionExpr(), null, "hierarchicalVisibility", null, 0, 1, ProductSpaceElement.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getProductSpaceElement_SuperordinateVisibility(), this.getOptionExpr(), null, "superordinateVisibility", null, 0, 1, ProductSpaceElement.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getProductSpaceElement__IsVisible__OptionBinding_VisibilityEvaluationCache(), this.getTristate(), "isVisible", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getOptionBinding(), "binding", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getVisibilityEvaluationCache(), "cache", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getProductSpaceElement__IsVisibleHierarchically__OptionBinding_VisibilityEvaluationCache(), this.getTristate(), "isVisibleHierarchically", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getOptionBinding(), "binding", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getVisibilityEvaluationCache(), "cache", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(versionSpaceEClass, VersionSpace.class, "VersionSpace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVersionSpace_Dimensions(), this.getVersionDimension(), null, "dimensions", null, 0, -1, VersionSpace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVersionSpace_AllOptions(), this.getOption(), null, "allOptions", null, 0, -1, VersionSpace.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getVersionSpace_AllInvariants(), this.getInvariant(), null, "allInvariants", null, 0, -1, VersionSpace.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getVersionSpace_AllPreferences(), this.getPreference(), null, "allPreferences", null, 0, -1, VersionSpace.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getVersionSpace_AllDefaultBindings(), this.getDefaultBinding(), null, "allDefaultBindings", null, 0, -1, VersionSpace.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getVersionSpace_Repository(), this.getRepository(), this.getRepository_VersionSpace(), "repository", null, 0, 1, VersionSpace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getVersionSpace__Validate__OptionBinding(), this.getTristate(), "validate", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getOptionBinding(), "optionBinding", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getVersionSpace__IsComplete__OptionBinding(), ecorePackage.getEBoolean(), "isComplete", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getOptionBinding(), "optionBinding", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getVersionSpace__IsSatisfiable__OptionBinding(), ecorePackage.getEBoolean(), "isSatisfiable", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getOptionBinding(), "premise", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getVersionSpace__ApplyAllPreferences__OptionBinding(), this.getOptionBinding(), "applyAllPreferences", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getOptionBinding(), "optionBinding", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getVersionSpace__ApplyAllDefaults__OptionBinding(), this.getOptionBinding(), "applyAllDefaults", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getOptionBinding(), "optionBinding", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getVersionSpace__ApplyAllCompletions__OptionBinding(), this.getOptionBinding(), "applyAllCompletions", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getOptionBinding(), "optionBinding", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getVersionSpace__GetOption__String(), this.getOption(), "getOption", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "id", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(versionDimensionEClass, VersionDimension.class, "VersionDimension", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVersionDimension_Options(), this.getOption(), null, "options", null, 0, -1, VersionDimension.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getVersionDimension_Invariants(), this.getInvariant(), null, "invariants", null, 0, -1, VersionDimension.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getVersionDimension_Preferences(), this.getPreference(), null, "preferences", null, 0, -1, VersionDimension.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getVersionDimension_DefaultBindings(), this.getDefaultBinding(), null, "defaultBindings", null, 0, -1, VersionDimension.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getVersionDimension_RootVersionSpaceElements(), this.getVersionSpaceElement(), null, "rootVersionSpaceElements", null, 0, -1, VersionDimension.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getVersionDimension_AllVersionSpaceElements(), this.getVersionSpaceElement(), null, "allVersionSpaceElements", null, 0, -1, VersionDimension.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getVersionDimension_VersionSpace(), this.getVersionSpace(), null, "versionSpace", null, 0, 1, VersionDimension.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		op = initEOperation(getVersionDimension__Validate__OptionBinding(), this.getTristate(), "validate", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getOptionBinding(), "optionBinding", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getVersionDimension__IsComplete__OptionBinding(), ecorePackage.getEBoolean(), "isComplete", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getOptionBinding(), "optionBinding", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getVersionDimension__IsSatisfiable__OptionBinding(), ecorePackage.getEBoolean(), "isSatisfiable", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getOptionBinding(), "premise", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getVersionDimension__ApplyPreferences__OptionBinding(), this.getOptionBinding(), "applyPreferences", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getOptionBinding(), "optionBinding", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getVersionDimension__ApplyDefaults__OptionBinding(), this.getOptionBinding(), "applyDefaults", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getOptionBinding(), "optionBinding", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getVersionDimension__ApplyCompletions__OptionBinding(), this.getOptionBinding(), "applyCompletions", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getOptionBinding(), "optionBinding", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getVersionDimension__GetOption__String(), this.getOption(), "getOption", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "id", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(versionSpaceElementEClass, VersionSpaceElement.class, "VersionSpaceElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVersionSpaceElement_VersionDimension(), this.getVersionDimension(), null, "versionDimension", null, 0, 1, VersionSpaceElement.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getVersionSpaceElement_VersionSpace(), this.getVersionSpace(), null, "versionSpace", null, 0, 1, VersionSpaceElement.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getVersionSpaceElement_SuperVersionSpaceElement(), this.getVersionSpaceElement(), this.getVersionSpaceElement_SubVersionSpaceElements(), "superVersionSpaceElement", null, 0, 1, VersionSpaceElement.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getVersionSpaceElement_SubVersionSpaceElements(), this.getVersionSpaceElement(), this.getVersionSpaceElement_SuperVersionSpaceElement(), "subVersionSpaceElements", null, 0, -1, VersionSpaceElement.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getVersionSpaceElement_AllSuperVersionSpaceElements(), this.getVersionSpaceElement(), this.getVersionSpaceElement_AllSubVersionSpaceElements(), "allSuperVersionSpaceElements", null, 0, -1, VersionSpaceElement.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getVersionSpaceElement_AllSubVersionSpaceElements(), this.getVersionSpaceElement(), this.getVersionSpaceElement_AllSuperVersionSpaceElements(), "allSubVersionSpaceElements", null, 0, -1, VersionSpaceElement.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getVersionSpaceElement_CrossReferencedVersionSpaceElements(), this.getVersionSpaceElement(), this.getVersionSpaceElement_CrossReferencingVersionSpaceElements(), "crossReferencedVersionSpaceElements", null, 0, -1, VersionSpaceElement.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getVersionSpaceElement_CrossReferencingVersionSpaceElements(), this.getVersionSpaceElement(), this.getVersionSpaceElement_CrossReferencedVersionSpaceElements(), "crossReferencingVersionSpaceElements", null, 0, -1, VersionSpaceElement.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getVersionSpaceElement_LowLevelConcepts(), this.getRuleBaseElement(), this.getRuleBaseElement_HighLevelConcept(), "lowLevelConcepts", null, 0, -1, VersionSpaceElement.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(ruleBaseElementEClass, RuleBaseElement.class, "RuleBaseElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRuleBaseElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, RuleBaseElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRuleBaseElement_Dimension(), this.getVersionDimension(), null, "dimension", null, 0, 1, RuleBaseElement.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getRuleBaseElement_HighLevelConcept(), this.getVersionSpaceElement(), this.getVersionSpaceElement_LowLevelConcepts(), "highLevelConcept", null, 0, 1, RuleBaseElement.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(invariantEClass, Invariant.class, "Invariant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInvariant_OptionExpr(), this.getOptionExpr(), null, "optionExpr", null, 0, 1, Invariant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(preferenceEClass, Preference.class, "Preference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPreference_Option(), this.getOption(), null, "option", null, 0, 1, Preference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPreference_OptionExpr(), this.getOptionExpr(), null, "optionExpr", null, 0, 1, Preference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getPreference__ToImplicationInvariant(), this.getInvariant(), "toImplicationInvariant", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(defaultBindingEClass, DefaultBinding.class, "DefaultBinding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDefaultBinding_Option(), this.getOption(), null, "option", null, 0, 1, DefaultBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDefaultBinding_State(), this.getTristate(), "state", null, 0, 1, DefaultBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(optionEClass, Option.class, "Option", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(optionBindingEClass, OptionBinding.class, "OptionBinding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOptionBinding_BoundOptions(), this.getOptionToTristateMapEntry(), null, "boundOptions", null, 0, -1, OptionBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOptionBinding_NumberOfBindings(), ecorePackage.getEInt(), "numberOfBindings", "0", 0, 1, OptionBinding.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		op = initEOperation(getOptionBinding__GetState__Option(), this.getTristate(), "getState", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getOption(), "option", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getOptionBinding__Implies__OptionBinding(), this.getTristate(), "implies", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getOptionBinding(), "other", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getOptionBinding__ToVisibility(), this.getOptionExpr(), "toVisibility", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getOptionBinding__Bind__Option_Tristate(), null, "bind", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getOption(), "option", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTristate(), "state", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getOptionBinding__Combine__OptionBinding(), this.getOptionBinding(), "combine", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getOptionBinding(), "other", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getOptionBinding__Clear(), null, "clear", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(optionToTristateMapEntryEClass, Map.Entry.class, "OptionToTristateMapEntry", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOptionToTristateMapEntry_Key(), this.getOption(), null, "key", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOptionToTristateMapEntry_Value(), this.getTristate(), "value", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(visibilityEvaluationCacheEClass, VisibilityEvaluationCache.class, "VisibilityEvaluationCache", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVisibilityEvaluationCache_Entries(), this.getOptionExprToTristateMapEntry(), null, "entries", null, 0, -1, VisibilityEvaluationCache.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getVisibilityEvaluationCache__Invalidate(), null, "invalidate", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getVisibilityEvaluationCache__Save__OptionExpr_Tristate(), null, "save", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getOptionExpr(), "optionExpr", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTristate(), "result", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getVisibilityEvaluationCache__Get__OptionExpr(), this.getTristate(), "get", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getOptionExpr(), "expr", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(optionExprToTristateMapEntryEClass, Map.Entry.class, "OptionExprToTristateMapEntry", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOptionExprToTristateMapEntry_Key(), this.getOptionExpr(), null, "key", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOptionExprToTristateMapEntry_Value(), this.getTristate(), "value", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hybridDimensionEClass, HybridDimension.class, "HybridDimension", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHybridDimension_RootHybridElements(), this.getHybridElement(), null, "rootHybridElements", null, 0, -1, HybridDimension.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getHybridDimension_AllHybridElements(), this.getHybridElement(), null, "allHybridElements", null, 0, -1, HybridDimension.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(hybridElementEClass, HybridElement.class, "HybridElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHybridElement_SuperHybridElement(), this.getHybridElement(), this.getHybridElement_SubHybridElements(), "superHybridElement", null, 0, 1, HybridElement.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getHybridElement_SubHybridElements(), this.getHybridElement(), this.getHybridElement_SuperHybridElement(), "subHybridElements", null, 0, -1, HybridElement.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getHybridElement_AllSuperHybridElements(), this.getHybridElement(), null, "allSuperHybridElements", null, 0, -1, HybridElement.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getHybridElement_AllSubHybridElements(), this.getHybridElement(), null, "allSubHybridElements", null, 0, -1, HybridElement.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getHybridElement_CrossReferencedHybridElements(), this.getHybridElement(), this.getHybridElement_CrossReferencingHybridElements(), "crossReferencedHybridElements", null, 0, -1, HybridElement.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getHybridElement_CrossReferencingHybridElements(), this.getHybridElement(), this.getHybridElement_CrossReferencedHybridElements(), "crossReferencingHybridElements", null, 0, -1, HybridElement.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(visibilityForestEClass, VisibilityForest.class, "VisibilityForest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVisibilityForest_Visibilities(), this.getVisibility(), null, "visibilities", null, 0, -1, VisibilityForest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVisibilityForest_Repository(), this.getRepository(), this.getRepository_VisibilityForest(), "repository", null, 0, 1, VisibilityForest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getVisibilityForest__Add__OptionExpr(), this.getVisibility(), "add", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getOptionExpr(), "expr", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(visibilityEClass, Visibility.class, "Visibility", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVisibility_Expr(), this.getOptionExpr(), null, "expr", null, 0, 1, Visibility.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(optionExprEClass, OptionExpr.class, "OptionExpr", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOptionExpr_ReferencedOptions(), this.getOption(), null, "referencedOptions", null, 0, -1, OptionExpr.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getOptionExpr_ReferencedDimensions(), this.getVersionDimension(), null, "referencedDimensions", null, 0, -1, OptionExpr.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		op = initEOperation(getOptionExpr__Apply__OptionBinding_VisibilityEvaluationCache(), this.getTristate(), "apply", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getOptionBinding(), "binding", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getVisibilityEvaluationCache(), "cache", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getOptionExpr__Apply__OptionBinding(), this.getTristate(), "apply", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getOptionBinding(), "binding", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getOptionExpr__Not(), this.getNegExpr(), "not", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getOptionExpr__And__OptionExpr(), this.getAndExpr(), "and", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getOptionExpr(), "other", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getOptionExpr__Or__OptionExpr(), this.getOrExpr(), "or", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getOptionExpr(), "other", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getOptionExpr__Xor__OptionExpr(), this.getXorExpr(), "xor", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getOptionExpr(), "other", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getOptionExpr__Implies__OptionExpr(), this.getImpliesExpr(), "implies", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getOptionExpr(), "other", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getOptionExpr__Iff__OptionExpr(), this.getBiconditionalExpr(), "iff", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getOptionExpr(), "other", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getOptionExpr__Nand__OptionExpr(), this.getNandExpr(), "nand", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getOptionExpr(), "other", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getOptionExpr__Minus__OptionExpr(), this.getMinusExpr(), "minus", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getOptionExpr(), "other", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getOptionExpr__Extract(), this.getOptionExpr(), "extract", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(visibilityRefEClass, VisibilityRef.class, "VisibilityRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVisibilityRef_Visibility(), this.getVisibility(), null, "visibility", null, 0, 1, VisibilityRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(optionRefEClass, OptionRef.class, "OptionRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOptionRef_Option(), this.getOption(), null, "option", null, 0, 1, OptionRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(negExprEClass, NegExpr.class, "NegExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNegExpr_Neg(), this.getOptionExpr(), null, "neg", null, 0, 1, NegExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(binaryExprEClass, BinaryExpr.class, "BinaryExpr", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBinaryExpr_Left(), this.getOptionExpr(), null, "left", null, 0, 1, BinaryExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBinaryExpr_Right(), this.getOptionExpr(), null, "right", null, 0, 1, BinaryExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(andExprEClass, AndExpr.class, "AndExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(orExprEClass, OrExpr.class, "OrExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(xorExprEClass, XorExpr.class, "XorExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(impliesExprEClass, ImpliesExpr.class, "ImpliesExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(biconditionalExprEClass, BiconditionalExpr.class, "BiconditionalExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(nandExprEClass, NandExpr.class, "NandExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(minusExprEClass, MinusExpr.class, "MinusExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mergeExprEClass, MergeExpr.class, "MergeExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMergeExpr_BaseExpr(), this.getOptionExpr(), null, "baseExpr", null, 0, 1, MergeExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bigExprEClass, BigExpr.class, "BigExpr", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBigExpr_Children(), this.getOptionExpr(), null, "children", null, 0, -1, BigExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bigAndExprEClass, BigAndExpr.class, "BigAndExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bigOrExprEClass, BigOrExpr.class, "BigOrExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bigXorExprEClass, BigXorExpr.class, "BigXorExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bigNandExprEClass, BigNandExpr.class, "BigNandExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(tristateEEnum, Tristate.class, "Tristate");
		addEEnumLiteral(tristateEEnum, Tristate.UNKNOWN);
		addEEnumLiteral(tristateEEnum, Tristate.TRUE);
		addEEnumLiteral(tristateEEnum, Tristate.FALSE);

		// Create resource
		createResource(eNS_URI);
	}

} //SuperModCorePackageImpl
