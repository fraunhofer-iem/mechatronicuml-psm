/*
 * generated by Xtext
 */
package de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

import de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.ui.internal.LPSolveActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class LPSolveExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return LPSolveActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return LPSolveActivator.getInstance().getInjector(LPSolveActivator.DE_UNI_PADERBORN_FUJABA_MUML_ALLOCATION_ILP_LPSOLVE_XTEXT_LPSOLVE);
	}
	
}
