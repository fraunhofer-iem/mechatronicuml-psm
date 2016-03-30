/**
 */
package de.uni_paderborn.fujaba.muml.psm.psm_realtimestatechart.realtimestatechartparameter.impl;

import de.uni_paderborn.fujaba.muml.psm.PsmPackage;

import de.uni_paderborn.fujaba.muml.psm.allocation.AllocationPackage;

import de.uni_paderborn.fujaba.muml.psm.allocation.impl.AllocationPackageImpl;

import de.uni_paderborn.fujaba.muml.psm.apiexpressions.ApiexpressionsPackage;

import de.uni_paderborn.fujaba.muml.psm.apiexpressions.impl.ApiexpressionsPackageImpl;

import de.uni_paderborn.fujaba.muml.psm.codegen.CodegenPackage;

import de.uni_paderborn.fujaba.muml.psm.codegen.impl.CodegenPackageImpl;

import de.uni_paderborn.fujaba.muml.psm.impl.PsmPackageImpl;

import de.uni_paderborn.fujaba.muml.psm.portapimapping.PortapimappingPackage;

import de.uni_paderborn.fujaba.muml.psm.portapimapping.impl.PortapimappingPackageImpl;

import de.uni_paderborn.fujaba.muml.psm.properties.PropertiesPackage;

import de.uni_paderborn.fujaba.muml.psm.properties.impl.PropertiesPackageImpl;

import de.uni_paderborn.fujaba.muml.psm.psm_instance.Psm_instancePackage;

import de.uni_paderborn.fujaba.muml.psm.psm_instance.impl.Psm_instancePackageImpl;

import de.uni_paderborn.fujaba.muml.psm.psm_realtimestatechart.Psm_realtimestatechartPackage;

import de.uni_paderborn.fujaba.muml.psm.psm_realtimestatechart.impl.Psm_realtimestatechartPackageImpl;

import de.uni_paderborn.fujaba.muml.psm.psm_realtimestatechart.realtimestatechartparameter.APICallParameter;
import de.uni_paderborn.fujaba.muml.psm.psm_realtimestatechart.realtimestatechartparameter.RealtimeStatechartParameter;
import de.uni_paderborn.fujaba.muml.psm.psm_realtimestatechart.realtimestatechartparameter.RealtimestatechartparameterFactory;
import de.uni_paderborn.fujaba.muml.psm.psm_realtimestatechart.realtimestatechartparameter.RealtimestatechartparameterPackage;
import de.uni_paderborn.fujaba.muml.psm.psm_realtimestatechart.realtimestatechartparameter.TimeParameter;

import de.uni_paderborn.fujaba.muml.psm.psm_realtimestatechart.realtimestatechartparameterbinding.RealtimestatechartparameterbindingPackage;

import de.uni_paderborn.fujaba.muml.psm.psm_realtimestatechart.realtimestatechartparameterbinding.impl.RealtimestatechartparameterbindingPackageImpl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.muml.core.CorePackage;
import org.muml.pim.actionlanguage.ActionlanguagePackage;
import org.muml.pim.behavior.BehaviorPackage;
import org.muml.pm.hardware.hwplatform.HwplatformPackage;
import org.muml.pm.hardware.hwplatforminstance.HwplatforminstancePackage;
import org.muml.pm.hardware.hwresource.HwresourcePackage;
import org.muml.pm.hardware.hwresourceinstance.HwresourceinstancePackage;
import org.muml.pm.hardware.hwvaluetype.HwvaluetypePackage;
import org.muml.pm.software.platform.SwplatformPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RealtimestatechartparameterPackageImpl extends EPackageImpl implements RealtimestatechartparameterPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass apiCallParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass realtimeStatechartParameterEClass = null;

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
	 * @see de.uni_paderborn.fujaba.muml.psm.psm_realtimestatechart.realtimestatechartparameter.RealtimestatechartparameterPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RealtimestatechartparameterPackageImpl() {
		super(eNS_URI, RealtimestatechartparameterFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link RealtimestatechartparameterPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RealtimestatechartparameterPackage init() {
		if (isInited) return (RealtimestatechartparameterPackage)EPackage.Registry.INSTANCE.getEPackage(RealtimestatechartparameterPackage.eNS_URI);

		// Obtain or create and register package
		RealtimestatechartparameterPackageImpl theRealtimestatechartparameterPackage = (RealtimestatechartparameterPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof RealtimestatechartparameterPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new RealtimestatechartparameterPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ActionlanguagePackage.eINSTANCE.eClass();
		HwplatformPackage.eINSTANCE.eClass();
		HwvaluetypePackage.eINSTANCE.eClass();
		HwplatforminstancePackage.eINSTANCE.eClass();
		HwresourcePackage.eINSTANCE.eClass();
		HwresourceinstancePackage.eINSTANCE.eClass();
		SwplatformPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		PsmPackageImpl thePsmPackage = (PsmPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PsmPackage.eNS_URI) instanceof PsmPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PsmPackage.eNS_URI) : PsmPackage.eINSTANCE);
		AllocationPackageImpl theAllocationPackage = (AllocationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AllocationPackage.eNS_URI) instanceof AllocationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AllocationPackage.eNS_URI) : AllocationPackage.eINSTANCE);
		PropertiesPackageImpl thePropertiesPackage = (PropertiesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PropertiesPackage.eNS_URI) instanceof PropertiesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PropertiesPackage.eNS_URI) : PropertiesPackage.eINSTANCE);
		Psm_realtimestatechartPackageImpl thePsm_realtimestatechartPackage = (Psm_realtimestatechartPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Psm_realtimestatechartPackage.eNS_URI) instanceof Psm_realtimestatechartPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Psm_realtimestatechartPackage.eNS_URI) : Psm_realtimestatechartPackage.eINSTANCE);
		RealtimestatechartparameterbindingPackageImpl theRealtimestatechartparameterbindingPackage = (RealtimestatechartparameterbindingPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RealtimestatechartparameterbindingPackage.eNS_URI) instanceof RealtimestatechartparameterbindingPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RealtimestatechartparameterbindingPackage.eNS_URI) : RealtimestatechartparameterbindingPackage.eINSTANCE);
		Psm_instancePackageImpl thePsm_instancePackage = (Psm_instancePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Psm_instancePackage.eNS_URI) instanceof Psm_instancePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Psm_instancePackage.eNS_URI) : Psm_instancePackage.eINSTANCE);
		PortapimappingPackageImpl thePortapimappingPackage = (PortapimappingPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PortapimappingPackage.eNS_URI) instanceof PortapimappingPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PortapimappingPackage.eNS_URI) : PortapimappingPackage.eINSTANCE);
		ApiexpressionsPackageImpl theApiexpressionsPackage = (ApiexpressionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ApiexpressionsPackage.eNS_URI) instanceof ApiexpressionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ApiexpressionsPackage.eNS_URI) : ApiexpressionsPackage.eINSTANCE);
		CodegenPackageImpl theCodegenPackage = (CodegenPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CodegenPackage.eNS_URI) instanceof CodegenPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CodegenPackage.eNS_URI) : CodegenPackage.eINSTANCE);

		// Create package meta-data objects
		theRealtimestatechartparameterPackage.createPackageContents();
		thePsmPackage.createPackageContents();
		theAllocationPackage.createPackageContents();
		thePropertiesPackage.createPackageContents();
		thePsm_realtimestatechartPackage.createPackageContents();
		theRealtimestatechartparameterbindingPackage.createPackageContents();
		thePsm_instancePackage.createPackageContents();
		thePortapimappingPackage.createPackageContents();
		theApiexpressionsPackage.createPackageContents();
		theCodegenPackage.createPackageContents();

		// Initialize created meta-data
		theRealtimestatechartparameterPackage.initializePackageContents();
		thePsmPackage.initializePackageContents();
		theAllocationPackage.initializePackageContents();
		thePropertiesPackage.initializePackageContents();
		thePsm_realtimestatechartPackage.initializePackageContents();
		theRealtimestatechartparameterbindingPackage.initializePackageContents();
		thePsm_instancePackage.initializePackageContents();
		thePortapimappingPackage.initializePackageContents();
		theApiexpressionsPackage.initializePackageContents();
		theCodegenPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRealtimestatechartparameterPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RealtimestatechartparameterPackage.eNS_URI, theRealtimestatechartparameterPackage);
		return theRealtimestatechartparameterPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAPICallParameter() {
		return apiCallParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeParameter() {
		return timeParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRealtimeStatechartParameter() {
		return realtimeStatechartParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRealtimeStatechartParameter_Statechart() {
		return (EReference)realtimeStatechartParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RealtimestatechartparameterFactory getRealtimestatechartparameterFactory() {
		return (RealtimestatechartparameterFactory)getEFactoryInstance();
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
		apiCallParameterEClass = createEClass(API_CALL_PARAMETER);

		timeParameterEClass = createEClass(TIME_PARAMETER);

		realtimeStatechartParameterEClass = createEClass(REALTIME_STATECHART_PARAMETER);
		createEReference(realtimeStatechartParameterEClass, REALTIME_STATECHART_PARAMETER__STATECHART);
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

		// Obtain other dependent packages
		BehaviorPackage theBehaviorPackage = (BehaviorPackage)EPackage.Registry.INSTANCE.getEPackage(BehaviorPackage.eNS_URI);
		CorePackage theCorePackage = (CorePackage)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);
		Psm_realtimestatechartPackage thePsm_realtimestatechartPackage = (Psm_realtimestatechartPackage)EPackage.Registry.INSTANCE.getEPackage(Psm_realtimestatechartPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		apiCallParameterEClass.getESuperTypes().add(this.getRealtimeStatechartParameter());
		apiCallParameterEClass.getESuperTypes().add(theBehaviorPackage.getOperation());
		timeParameterEClass.getESuperTypes().add(this.getRealtimeStatechartParameter());
		timeParameterEClass.getESuperTypes().add(theBehaviorPackage.getVariable());
		realtimeStatechartParameterEClass.getESuperTypes().add(theCorePackage.getNamedElement());
		realtimeStatechartParameterEClass.getESuperTypes().add(theCorePackage.getCommentableElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(apiCallParameterEClass, APICallParameter.class, "APICallParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(timeParameterEClass, TimeParameter.class, "TimeParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(realtimeStatechartParameterEClass, RealtimeStatechartParameter.class, "RealtimeStatechartParameter", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRealtimeStatechartParameter_Statechart(), thePsm_realtimestatechartPackage.getParameterizedRealtimeStatechart(), thePsm_realtimestatechartPackage.getParameterizedRealtimeStatechart_Parameters(), "statechart", null, 1, 1, RealtimeStatechartParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //RealtimestatechartparameterPackageImpl
