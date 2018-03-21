/**
 */
package de.ubt.ai1.supermod.example.bootstrap.superstrap;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.ubt.ai1.supermod.example.bootstrap.superstrap.SuperstrapFactory
 * @model kind="package"
 * @generated
 */
public interface SuperstrapPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "superstrap";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://ai1.uni-bayreuth.de/supermod/example/bootstrap/0.1.0/superstrap";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "de.ubt.ai1.supermod.example.bootstrap";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SuperstrapPackage eINSTANCE = de.ubt.ai1.supermod.example.bootstrap.superstrap.impl.SuperstrapPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.ubt.ai1.supermod.example.bootstrap.superstrap.impl.RepositoryImpl <em>Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai1.supermod.example.bootstrap.superstrap.impl.RepositoryImpl
	 * @see de.ubt.ai1.supermod.example.bootstrap.superstrap.impl.SuperstrapPackageImpl#getRepository()
	 * @generated
	 */
	int REPOSITORY = 0;

	/**
	 * The feature id for the '<em><b>Architecture Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__ARCHITECTURE_CODE = 0;

	/**
	 * The feature id for the '<em><b>Vforest</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__VFOREST = 1;

	/**
	 * The feature id for the '<em><b>Dimensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__DIMENSIONS = 2;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__OPERATIONS = 3;

	/**
	 * The number of structural features of the '<em>Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.ubt.ai1.supermod.example.bootstrap.superstrap.impl.DimensionImpl <em>Dimension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai1.supermod.example.bootstrap.superstrap.impl.DimensionImpl
	 * @see de.ubt.ai1.supermod.example.bootstrap.superstrap.impl.SuperstrapPackageImpl#getDimension()
	 * @generated
	 */
	int DIMENSION = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Editable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION__EDITABLE = 2;

	/**
	 * The feature id for the '<em><b>Controlled Dimensions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION__CONTROLLED_DIMENSIONS = 3;

	/**
	 * The number of structural features of the '<em>Dimension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Dimension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.ubt.ai1.supermod.example.bootstrap.superstrap.impl.VisibilityForestImpl <em>Visibility Forest</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai1.supermod.example.bootstrap.superstrap.impl.VisibilityForestImpl
	 * @see de.ubt.ai1.supermod.example.bootstrap.superstrap.impl.SuperstrapPackageImpl#getVisibilityForest()
	 * @generated
	 */
	int VISIBILITY_FOREST = 2;

	/**
	 * The number of structural features of the '<em>Visibility Forest</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIBILITY_FOREST_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Visibility Forest</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIBILITY_FOREST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.ubt.ai1.supermod.example.bootstrap.superstrap.impl.OperationImpl <em>Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai1.supermod.example.bootstrap.superstrap.impl.OperationImpl
	 * @see de.ubt.ai1.supermod.example.bootstrap.superstrap.impl.SuperstrapPackageImpl#getOperation()
	 * @generated
	 */
	int OPERATION = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__NAME = 0;

	/**
	 * The number of structural features of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.ubt.ai1.supermod.example.bootstrap.superstrap.DimensionType <em>Dimension Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ubt.ai1.supermod.example.bootstrap.superstrap.DimensionType
	 * @see de.ubt.ai1.supermod.example.bootstrap.superstrap.impl.SuperstrapPackageImpl#getDimensionType()
	 * @generated
	 */
	int DIMENSION_TYPE = 4;


	/**
	 * Returns the meta object for class '{@link de.ubt.ai1.supermod.example.bootstrap.superstrap.Repository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Repository</em>'.
	 * @see de.ubt.ai1.supermod.example.bootstrap.superstrap.Repository
	 * @generated
	 */
	EClass getRepository();

	/**
	 * Returns the meta object for the attribute '{@link de.ubt.ai1.supermod.example.bootstrap.superstrap.Repository#getArchitectureCode <em>Architecture Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Architecture Code</em>'.
	 * @see de.ubt.ai1.supermod.example.bootstrap.superstrap.Repository#getArchitectureCode()
	 * @see #getRepository()
	 * @generated
	 */
	EAttribute getRepository_ArchitectureCode();

	/**
	 * Returns the meta object for the containment reference list '{@link de.ubt.ai1.supermod.example.bootstrap.superstrap.Repository#getDimensions <em>Dimensions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dimensions</em>'.
	 * @see de.ubt.ai1.supermod.example.bootstrap.superstrap.Repository#getDimensions()
	 * @see #getRepository()
	 * @generated
	 */
	EReference getRepository_Dimensions();

	/**
	 * Returns the meta object for the containment reference '{@link de.ubt.ai1.supermod.example.bootstrap.superstrap.Repository#getVforest <em>Vforest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Vforest</em>'.
	 * @see de.ubt.ai1.supermod.example.bootstrap.superstrap.Repository#getVforest()
	 * @see #getRepository()
	 * @generated
	 */
	EReference getRepository_Vforest();

	/**
	 * Returns the meta object for the containment reference list '{@link de.ubt.ai1.supermod.example.bootstrap.superstrap.Repository#getOperations <em>Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operations</em>'.
	 * @see de.ubt.ai1.supermod.example.bootstrap.superstrap.Repository#getOperations()
	 * @see #getRepository()
	 * @generated
	 */
	EReference getRepository_Operations();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai1.supermod.example.bootstrap.superstrap.Dimension <em>Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dimension</em>'.
	 * @see de.ubt.ai1.supermod.example.bootstrap.superstrap.Dimension
	 * @generated
	 */
	EClass getDimension();

	/**
	 * Returns the meta object for the attribute '{@link de.ubt.ai1.supermod.example.bootstrap.superstrap.Dimension#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.ubt.ai1.supermod.example.bootstrap.superstrap.Dimension#getName()
	 * @see #getDimension()
	 * @generated
	 */
	EAttribute getDimension_Name();

	/**
	 * Returns the meta object for the reference list '{@link de.ubt.ai1.supermod.example.bootstrap.superstrap.Dimension#getControlledDimensions <em>Controlled Dimensions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Controlled Dimensions</em>'.
	 * @see de.ubt.ai1.supermod.example.bootstrap.superstrap.Dimension#getControlledDimensions()
	 * @see #getDimension()
	 * @generated
	 */
	EReference getDimension_ControlledDimensions();

	/**
	 * Returns the meta object for the attribute '{@link de.ubt.ai1.supermod.example.bootstrap.superstrap.Dimension#isEditable <em>Editable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Editable</em>'.
	 * @see de.ubt.ai1.supermod.example.bootstrap.superstrap.Dimension#isEditable()
	 * @see #getDimension()
	 * @generated
	 */
	EAttribute getDimension_Editable();

	/**
	 * Returns the meta object for the attribute '{@link de.ubt.ai1.supermod.example.bootstrap.superstrap.Dimension#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see de.ubt.ai1.supermod.example.bootstrap.superstrap.Dimension#getType()
	 * @see #getDimension()
	 * @generated
	 */
	EAttribute getDimension_Type();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai1.supermod.example.bootstrap.superstrap.VisibilityForest <em>Visibility Forest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Visibility Forest</em>'.
	 * @see de.ubt.ai1.supermod.example.bootstrap.superstrap.VisibilityForest
	 * @generated
	 */
	EClass getVisibilityForest();

	/**
	 * Returns the meta object for class '{@link de.ubt.ai1.supermod.example.bootstrap.superstrap.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation</em>'.
	 * @see de.ubt.ai1.supermod.example.bootstrap.superstrap.Operation
	 * @generated
	 */
	EClass getOperation();

	/**
	 * Returns the meta object for the attribute '{@link de.ubt.ai1.supermod.example.bootstrap.superstrap.Operation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.ubt.ai1.supermod.example.bootstrap.superstrap.Operation#getName()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_Name();

	/**
	 * Returns the meta object for enum '{@link de.ubt.ai1.supermod.example.bootstrap.superstrap.DimensionType <em>Dimension Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Dimension Type</em>'.
	 * @see de.ubt.ai1.supermod.example.bootstrap.superstrap.DimensionType
	 * @generated
	 */
	EEnum getDimensionType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SuperstrapFactory getSuperstrapFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link de.ubt.ai1.supermod.example.bootstrap.superstrap.impl.RepositoryImpl <em>Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai1.supermod.example.bootstrap.superstrap.impl.RepositoryImpl
		 * @see de.ubt.ai1.supermod.example.bootstrap.superstrap.impl.SuperstrapPackageImpl#getRepository()
		 * @generated
		 */
		EClass REPOSITORY = eINSTANCE.getRepository();

		/**
		 * The meta object literal for the '<em><b>Architecture Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY__ARCHITECTURE_CODE = eINSTANCE.getRepository_ArchitectureCode();

		/**
		 * The meta object literal for the '<em><b>Dimensions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPOSITORY__DIMENSIONS = eINSTANCE.getRepository_Dimensions();

		/**
		 * The meta object literal for the '<em><b>Vforest</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPOSITORY__VFOREST = eINSTANCE.getRepository_Vforest();

		/**
		 * The meta object literal for the '<em><b>Operations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPOSITORY__OPERATIONS = eINSTANCE.getRepository_Operations();

		/**
		 * The meta object literal for the '{@link de.ubt.ai1.supermod.example.bootstrap.superstrap.impl.DimensionImpl <em>Dimension</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai1.supermod.example.bootstrap.superstrap.impl.DimensionImpl
		 * @see de.ubt.ai1.supermod.example.bootstrap.superstrap.impl.SuperstrapPackageImpl#getDimension()
		 * @generated
		 */
		EClass DIMENSION = eINSTANCE.getDimension();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIMENSION__NAME = eINSTANCE.getDimension_Name();

		/**
		 * The meta object literal for the '<em><b>Controlled Dimensions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIMENSION__CONTROLLED_DIMENSIONS = eINSTANCE.getDimension_ControlledDimensions();

		/**
		 * The meta object literal for the '<em><b>Editable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIMENSION__EDITABLE = eINSTANCE.getDimension_Editable();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIMENSION__TYPE = eINSTANCE.getDimension_Type();

		/**
		 * The meta object literal for the '{@link de.ubt.ai1.supermod.example.bootstrap.superstrap.impl.VisibilityForestImpl <em>Visibility Forest</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai1.supermod.example.bootstrap.superstrap.impl.VisibilityForestImpl
		 * @see de.ubt.ai1.supermod.example.bootstrap.superstrap.impl.SuperstrapPackageImpl#getVisibilityForest()
		 * @generated
		 */
		EClass VISIBILITY_FOREST = eINSTANCE.getVisibilityForest();

		/**
		 * The meta object literal for the '{@link de.ubt.ai1.supermod.example.bootstrap.superstrap.impl.OperationImpl <em>Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai1.supermod.example.bootstrap.superstrap.impl.OperationImpl
		 * @see de.ubt.ai1.supermod.example.bootstrap.superstrap.impl.SuperstrapPackageImpl#getOperation()
		 * @generated
		 */
		EClass OPERATION = eINSTANCE.getOperation();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION__NAME = eINSTANCE.getOperation_Name();

		/**
		 * The meta object literal for the '{@link de.ubt.ai1.supermod.example.bootstrap.superstrap.DimensionType <em>Dimension Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ubt.ai1.supermod.example.bootstrap.superstrap.DimensionType
		 * @see de.ubt.ai1.supermod.example.bootstrap.superstrap.impl.SuperstrapPackageImpl#getDimensionType()
		 * @generated
		 */
		EEnum DIMENSION_TYPE = eINSTANCE.getDimensionType();

	}

} //SuperstrapPackage
